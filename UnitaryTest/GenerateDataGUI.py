
import numpy as np
from random import randrange, getrandbits
import tkinter as tk
from tkinter.filedialog import askopenfilename
from tkinter import ttk
class GenerateData:
        everything={}
        operationNames={}
        
        def getEverything(self, API):
            input = open(API, "r")
            line=input.readline()
            id=0
            while True:
                if "Class: " in line:
                    machinePart=line.replace("\t","").rpartition(":")[2][1:-1]
                    line=input.readline()
                if "Operation: " in line:
                    operation=line.replace("\t","").rpartition(":")[2][1:-1]
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
                    self.everything[id]={"operationName":operation,"variables":variables, "pre": pre, "post": post, "machinePart": machinePart}
                    id=id+1
                elif not ("Class: " in line):
                    line=input.readline()
                if line =="":
                    break
                
                
            return 0


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
                    pre=input.readline().rpartition(":")[2][1:-1]
                    post=input.readline().rpartition(":")[2][1:-1]
                    variables={}
                    line=input.readline()
                    while "\t\t\t" in line:
                        variable=line.replace("\t","").rpartition(":")[0]
                        type=line.replace("\t","").rpartition(":")[2][1:-1]
                        if type=="Double" or type=="Int32" or type=="Real":
                            min=input.readline().replace("\t","").rpartition("=")[2][1:-1]
                            max=input.readline().replace("\t","").rpartition("=")[2][1:-1]
                            variables[variable]={ "type": type, "value":min, "min":min,"max":max, "opID":id}
                            line=input.readline()
                        else:
                            variables[variable]={ "type": type, "value":False, "opID":id}
                            line=input.readline()
                    self.operationNames[id]={"operationName":operation,"variables":variables, "pre": pre, "post": post, "machinePart": machinePart}
                    id=id+1
                elif not ("Class: " in line):
                    line=input.readline()
                if line =="":
                    break
                
                
            return 0

        def generateRandomData(self, id):
            variables=self.operationNames[id]["variables"]
            
            for key, values in variables.items():
                if (values["type"]=="Int32" or values["type"]=="Double" or values["type"]=="Real")  and values["min"]!=values["max"]:
                    
                    values["value"]=randrange(int(values["min"]),int(values["max"]))
                elif values["type"]=="Boolean":
                    values["value"]=bool(getrandbits(1))
            
            self.operationNames[id]["variables"]=variables
            return 0

            
        def createUnitaryTestCordis(self, operationID, testfile, iter):
            mp=self.operationNames[operationID]["machinePart"]
            timeout=0
            mpfile= open("APITree.txt", "r")
            for line in mpfile:
                if mp in line.rpartition("/")[-1] and "Machine" in line:
                    mp=line.rstrip('\n')
            mpfile.close()
            name=self.operationNames[operationID]["operationName"]
            
            header= "def test_"+str(iter)+"_"+name+"( "
            variables=self.operationNames[operationID]["variables"]
            allnames=[]
            for keys, values in self.everything.items():
                allnames.append(values["operationName"])
            for keys,values in variables.items():
                if keys=="aTime":
                    timeout=values["value"]/1000
                header=header+str(values["value"])+", "
            if len(self.operationNames[operationID]["variables"])>=1:
                header=header[:len(header)-2]
            header+="):"
            print("creando operacion: "+ header)
            testfile.write("def test_"+str(iter)+"_"+name+"(CC1):"+"\n")
            pre=self.operationNames[operationID]["pre"]
            post=self.operationNames[operationID]["post"]
            if pre=="[]":
                pre=""
            if post=="[]":
                post="True"
            print(post.split("(")[0])
            print(allnames)
            if pre.split("(")[0] in allnames:
                prename=pre.split("(")[0]
                var=""
                for keys, values in self.everything.items():
                    if values["operationName"] in pre.split("(")[0]:
                        auxvars=pre.split("(")[1].split(")")[0].split(", ")
                        
                        for keys2 in auxvars:
                            if keys2 in variables:
                                var=var+str(variables[keys2]["value"])+", "
                            else:
                                var=var+str(keys2)+", "
                        pre="mp.GetCommand(f'"+pre.split("(")[0]+"').Execute("+var[:-2]+")"
            if post.split("(")[0] in allnames:
                postname= post.split("(")[0] 
                var=""
                for keys, values in self.everything.items():
                   
                    if values["operationName"] in post.split("(")[0]:
                        auxvars=post.split("(")[1].split(")")[0].split(", ")
                        print(auxvars)
                        for keys2 in auxvars:
                            if keys2 in variables:
                                var=var+str(variables[keys2]["value"])+", "
                            else:
                                var=var+str(keys2)+", "
                        post="mp.GetCommand('"+post.split("(")[0]+"').Execute("+var[:-2]+")"
            
            testfile.write("\tmp = CC1.Controller.GetMachinePart('"+mp+"')\n")
            testfile.write("\t"+pre+"\n")
            testfile.write("\tmp.GetCommand(f'"+name+"').Execute("+header.split("(")[1][:-1]+"\n")
            if post=="True":
                testfile.write("\tassert "+post+", 'Postcondition failed'\n\n")
            else:
                testfile.write("\ttime.sleep("+str(timeout)+")\n")
                testfile.write("\t"+post+"\n")
                testfile.write("\tassert CC1."+mp.replace("/",".")+"."+mp.replace("/",".").split(".")[-1]+"Operations._Observers_."+postname+"ReturnValue.GetCurrentValue(), 'Postcondition failed'\n\n")
            return testfile

        def randomOrderTesting(self, iters, testfile):
            operationID=0
            for i in range(0,int(iters)):
                operationID=randrange(0,len(self.operationNames))
                self.generateRandomData(operationID)
                
                testfile = self.createUnitaryTestCordis(operationID, testfile, i)
            return testfile

        def DepthOrderTesting(self, depth, testfile):
            operationID=0
            for i in range(0,len(self.operationNames)):
                for j in range(0,int(depth)):
                    operationID=i
                    self.generateRandomData(operationID)
                    
                    testfile = self.createUnitaryTestCordis(operationID, testfile, i*int(depth)+j)
            return testfile

        def WidthOrderTesting(self, iters, testfile):
            operationID=0
            for i in range(0,int(iters)):
                for j in range(0,len(self.operationNames)):
                    operationID=j
                    self.generateRandomData(operationID)
                    
                    testfile = self.createUnitaryTestCordis(operationID, testfile, i*len(self.operationNames)+j)
            return testfile
        
            
        def createPytestFileCordis(self, iters, window3, type="Random"):
            testfile = open("test_apitree_script.py", "w")
            self.populateDictionaries("output.txt", "")
            self.getEverything("DofbotAPI.txt")
            
            testfile.write("import pytest\n")
            testfile.write("import time\n")
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
            if type=="Random":
                testfile =self.randomOrderTesting(iters, testfile)
            elif type=="Depth":
                testfile =self.DepthOrderTesting(iters, testfile)
            elif type=="Width":
                testfile =self.WidthOrderTesting(iters, testfile)
            testfile.close()
            window3.destroy()

def main():          
    handler=GenerateData()
    #testfile = open("test_apitree_script.py", "w")
    #handler.createPytestFileCordis(20)
    #testfile.close()
    window3= tk.Tk()
    window3.title("Test Generator Configuration")
    label_iters = tk.Label(window3, text="Number of iterations")
    entry_iters = tk.Entry(window3)
    entry_iters.insert(0, "5")
    label_mode = tk.Label(window3, text="Test Generation Mode")
    combo = ttk.Combobox(window3,state="readonly", values=["Random", "Width", "Depth"])
    combo.insert(0, "Random")
    label_iters.grid(row=0, column=0)
    entry_iters.grid(row=0, column=1)
    label_mode.grid(row=1, column=0)
    combo.grid(row=1, column=1)

    button_generate= tk.Button(window3, text="Generate", command=lambda: handler.createPytestFileCordis(entry_iters.get(),window3, combo.get()))
    button_back= tk.Button(window3, text="Cancel", command=window3.destroy)
    button_generate.grid(row=2, column=0)
    button_back.grid(row=2, column=1)
    window3.mainloop()