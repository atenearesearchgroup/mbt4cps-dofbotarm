import argparse
import os
import time
import pytest
import shutil
import sys

from cordisLibrary.CordisProcess import CordisProcess, GetVersionNumber
#from codeGen.CordisCodeGen import cordis_code_gen, def_altova_umodel, DEFAULT_CORDIS_GEN_CONFIGURATION
#from codeGen.replaceCodeGen import replace_codeGen
from controller.configureControllers import config_ontrollers_amsnetid

import ctypes

PYTHON_SCRIPT = os.path.abspath(__file__)
PROJ_DIR = os.path.join(os.path.dirname(PYTHON_SCRIPT), "..")


###################
# Plugin for pytest
###################

class PlugIn:
    """
    Base class for all plugin classes, needed to startup/close any .exe with optional arguments
    """

    def __init__(self, name, exe, startup_time=30, arguments=None):
        """
        :param name: plugin name
        :param exe: path to executable
        :param startup_time: time before continuing to launch next plugin/start tests
        :param arguments: cmd arguments taken by executable
        """
        assert name
        assert os.path.exists(exe)
        self.name = name
        self.process = CordisProcess(exe, arguments)
        self.startupTime = startup_time

    def pytest_sessionstart(self):
        """
        Start the process
        """
        print("[INFO] Starting up", self.name)
        self.process.StartUp()

        time.sleep(self.startupTime)

    def pytest_sessionfinish(self):
        """
        Close the process
        """
        print("[INFO] Shutting down", self.name)
        self.process.ShutDown()


########################
# MACHINE CONTROL SERVER
########################

class MCS_PlugIn(PlugIn):
    """
    Helper class to startup the Machine Control Server and connect with the requested controller
    """

    def __init__(self, controllerXml=None):
        program_files_x86 = os.getenv("ProgramFiles(x86)", r"C:\Program Files (x86)")
        MCS_exe = os.path.join(program_files_x86, "Cordis", "MachineControlServer", "MachineControlServer.exe")
        config_ontrollers_amsnetid(controllerXml)
        MCS_version = GetVersionNumber(MCS_exe)

        MCS_version_split = MCS_version.split(".")
        MCS_version_float = float(MCS_version_split[0] + "." + MCS_version_split[1])

        if MCS_version_float < 5.2 or not controllerXml:
            print("Trying controllers.xml")
            MCS_arguments = None
        else:
            MCS_arguments = f"-c \"{controllerXml}\""

       # super().__init__("MCS v" + MCS_version, MCS_exe, arguments=MCS_arguments)


################
# CORDIS MODELER
################

class CodeGen_PlugIn():
    """
    Helper class to automatically generate code, import code and eventually run the PLC
    """

    def __init__(self, codeGenFile, tester, startup_time=30):

        #replace_codeGen(rf"codeGen\codeGenFiles\{codeGenFile}",
         #               os.path.join(PROJ_DIR, rf"Models\{tester}Tester\Low-Code model"))

        #altova_umodel = def_altova_umodel()
        project = os.path.join(PROJ_DIR, rf"Models\{tester}Tester\Low-Code model\{tester}Tester.ump")
        #configuration = DEFAULT_CORDIS_GEN_CONFIGURATION
        destination = None
        check = None
        codegen = os.path.join(PROJ_DIR, rf"Models\{tester}Tester\Platforms\TwinCAT\{tester}Tester\GeneratedCode")
        export = None
        #cordis_code_gen(altova_umodel, project, configuration, destination, check, codegen, export)

        print(f"Waiting {startup_time} seconds before launching MCS")
        #time.sleep(startup_time)


######################
# RUN CORDIS MCS TESTS
######################

def IsAdmin():
    """
    Helper function to check whether you are logged in as an admin user
    :return: True if having 'admin' rights
    """
    try:
        return ctypes.windll.shell32.IsUserAnAdmin()
    except:
        return False


def RunMcsTests(config, tester):
    """
    Main function to run MCS tests for a certain platform
    :param config: Test configuration
    :return: result of test run
    """

    # Actual implementation of the test run
    # This point can be reached directly (if you have admin rights)
    # or in second attempt (when re-running this same program but then as administrator)

    # config here defines the platform configuration which is selected in Jenkins
    if not config:
        config = "BeckhoffADS_noRAD"

    print(f"[INFO] Running MCS test with configuration {config}")

    # Controller xml file passed on to MCS with -c option
    controllerXml = os.path.join(os.path.dirname(PYTHON_SCRIPT), f"controller\\controller{config}.xml")
    controllerXml = f"\"{controllerXml}\""                         
    
    # CodeGenFile which replaces several lines in codegen.xml (modeler)
    codeGenFile = f"CodeGen_{config}.xml"

    if "Beckhoff" in config:
        plugins = [MCS_PlugIn(controllerXml.strip('\"')), CodeGen_PlugIn(codeGenFile, tester)]
    elif config == "DotNET":
        plugins = [MCS_PlugIn(controllerXml), CodeGen_PlugIn(codeGenFile, tester)]
    elif config == "TiaPortal":
        plugins = [MCS_PlugIn(controllerXml), CodeGen_PlugIn(codeGenFile, tester)]

    plugins = []
    # config file used by python library (uses MCS IP & machine name)
    #confSrc = rf"config{tester}.xml"
    #confDst = r"config.xml"
    #shutil.copyfile(confSrc, confDst)

    return pytest.main([f"--junitxml=output{tester}.xml",
                        rf"."],
                       plugins=plugins)


###############
# MAIN FUNCTION
###############

parser = argparse.ArgumentParser(description='Run MCS tests')
parser.add_argument('-c', metavar='configuration', help='test configuration', default=None)
parser.add_argument('-t', metavar='test', help='mcs/mcp test', default="Mcs")
args = parser.parse_args()

if not args.c:
    print("No configuration specified.")
    controller = "BeckhoffADS"
elif "BeckhoffADS" in args.c:
    controller = "BeckhoffADS"
elif "BeckhoffOPC" in args.c:
    controller = "BeckhoffOPC"
elif "DotNET" in args.c:
    controller = "dotNET"
elif "TiaPortal" in args.c:
    controller = "TiaPortal"

controller="dotNET"
if __name__ == "__main__":
    sys.exit(RunMcsTests(args.c, args.t))
