import numpy as np
from random import randrange, getrandbits

class StateMachineToPytest:

    operationNames={}
    operationHeaders={}
        

    def populateDictionaries(self, API, SM):
            input = open(API, "r")
            line=input.readline()
            id=0
            while True:
                if "Class: " in line:
                    machinePart=line.replace("\t","").rpartition(":")[2][1:-1]
                    line=input.readline()
                if "Operation: " in line:
                    operation=line.replace("\t","").rpartition(":")[2][1:-1]
                    print(operation)
                    pre=input.readline().rpartition(":")[2][1:-1]
                    post=input.readline().rpartition(":")[2][1:-1]
                    variables={}
                    line=input.readline()
                    while "\t\t\t" in line:
                        variable=line.replace("\t","").rpartition(":")[0]
                        type=line.replace("\t","").rpartition(":")[2][1:-1]
                        if type=="Double" or type=="Int32":
                            min=input.readline().replace("\t","").rpartition("=")[2][1:-1]
                            max=input.readline().replace("\t","").rpartition("=")[2][1:-1]
                            variables[variable]={ "type": type, "value":min, "min":min,"max":max, "opID":id}
                            line=input.readline()
                        else:
                            variables[variable]={ "type": type, "value":False, "opID":id}
                            line=input.readline()
                    self.operationNames[id]={"operationName":operation,"variables":variables, "pre": pre, "post": post, "machinePart": machinePart}
                    print(self.operationNames[id])
                    id=id+1
                elif not ("Class: " in line):
                    line=input.readline()
                if line =="":
                    break
                
                
            return 0

    def createPytestFileCordis(self, route):
            
            inputfile=open(route, "r")
            
            
            testfile.write("import pytest\n")
            testfile.write("\n")
            testfile.write("\n")
            testfile.write("\n")
            testfile.write("######################################\n")
            testfile.write("#TEST SETUP\n")
            testfile.write("######################################\n")
            testfile.write("\n")
            testfile.write("'''\n")
            testfile.write("stored in conftest.py\n")
            testfile.write("'''\n")
            testfile.write("\n")
            testfile.write("######################################\n")
            testfile.write("#TEST FUNCTIONS\n")
            testfile.write("######################################\n")
            
            for line in inputfile:
                if line.replace("\t","").rpartition(" ")[0]=="StateMachine:":
                    testfile.write("def "+ line.replace("\n","").rpartition(" ")[2]+"(CC1):\n")
                if "State: Given" in line and "Warning" not in line or line.replace("\t","").replace("\n","")=="State:  When":
                    currentline=inputfile.readline()
                    while("\t\t\t" in currentline and "Activity:" in currentline):
                        activity= currentline.replace("\t","").replace("\n","").replace("Activity:","")
                        op=activity.split(".")[-1].split("(")[0]
                        params="("+activity.split(".")[-1].split("(")[1]
                        fullop="/"+activity.split(".")[-1]
                        testfile.write("\tmp=CC1.Controller.GetMachinePart('Machine/"+activity.replace(".", "/").replace(fullop, "").replace(" ", "")+"')\n")
                        testfile.write("\tmp.GetCommand('"+op+"').Execute"+params+"\n")
                        currentline=inputfile.readline()
                if line.replace("\t","").replace("\n","")=="Transition: (Given->When)" or line.replace("\t","").replace("\n","")=="Transition: (When->Final)":
                    currentline=inputfile.readline()
                    activity= currentline.replace("\t","").replace("\n","").replace("Guard: ","")
                    op=activity.split(".")[-1].split("(")[0]
                    print(op)
                    params="("+activity.split(".")[-1].split("(")[1]
                    fullop="/"+activity.split(".")[-1]
                    testfile.write("\tmp=CC1.Controller.GetMachinePart('Machine/"+activity.replace(".", "/").replace(fullop, "")+"')\n")
                    testfile.write("\tmp.GetCommand('"+op+"').Execute"+params+"\n")
                    testfile.write("\tassert CC1.Machine."+".".join(activity.split(".")[:-1])+"."+activity.split(".")[-2]+"Operations._Observers_.GetCurrentValue(), 'Guard Failed'\n")
                    currentline=inputfile.readline()
                if line.replace("\t","").replace("\n","")=="Transition: (When->Error)":
                    currentline=inputfile.readline()
                    activity= currentline.replace("\t","").replace("\n","").replace("Guard: ","")
                    op=activity.split(".")[-1].split("(")[0]
                    print(op)
                    params="("+activity.split(".")[-1].split("(")[1]
                    fullop="/"+activity.split(".")[-1]
                    
                    if len(currentline.split("."))>1:
                        testfile.write("\tmp=CC1.Controller.GetMachinePart('Machine/"+activity.replace(".", "/").replace(fullop, "")+"')\n")
                        testfile.write("\tmp.GetCommand('"+op+"').Execute"+params+"\n")    
                        testfile.write("\tassert not CC1.Machine."+".".join(activity.split(".")[:-1])+activity.split(".")[-1]+"Operations._Observers_.GetCurrentValue(), 'Guard Failed'\n")
                    else:
                        testfile.write("\tsleep(2000)\n")
                    currentline=inputfile.readline()
handler=StateMachineToPytest()
testfile = open("test_apitree_script.py", "w")
handler.createPytestFileCordis(r"test.txt")
testfile.close()