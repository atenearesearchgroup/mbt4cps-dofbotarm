
import xml.etree.ElementTree as ET

class XMLProcessor:
    def parseAPI(self, route):
        f = open("DofbotAPI.txt", "w")
        tree = ET.parse(route)
        root = tree.getroot()

        f.write(root.tag+"\n")

        for mp in root.findall(".Packages/Package/MachineParts/MachinePart/."):
            f.write("Class: "+ mp.get("ClassName")+"\n")
            for observer in mp.findall(".Observers/Observer/."):
                if(not observer.get("IsStandard")=="True"):
                    f.write("\tObserver: "+observer.get("Name")+"\n")
            for command in mp.findall(".Commands/Command/."):
                if(not command.get("IsStandard")=="True"):
                    f.write("\tOperation: "+command.get("Name")+"\n")
                    f.write("\t\tPre: True"+"\n")
                    f.write("\t\tPost: True"+"\n")
                    for attr in command.findall(".Arguments/Argument/."):
                        f.write("\t\t\t"+attr.get("Name")+": "+attr.get("Type")+"\n")
                        if attr.get("Type")=="Int32" or attr.get("Type")=="Double" or attr.get("Type")=="Real":
                            f.write("\t\t\t"+attr.get("Name")+"_min = "+attr.get("LowerLimit")+"\n")
                            f.write("\t\t\t"+attr.get("Name")+"_max = "+attr.get("UpperLimit")+"\n")
        f.close

    def getAPITree(self, route):
        f = open("APITree.txt", "w")
        tree = ET.parse(route)
        root = tree.getroot()
        cont=0
        paths=[]
        for mp in root.findall(".Packages/Package/MachineParts/MachinePart/."):
                for parts in mp.findall(".MachineParts/MachinePart/."):
                    paths.append(mp.get("ClassName")+"/"+parts.get("Name"))
        paths=list(set(paths))
        while cont<5:
            
            for path in paths:
                for path2 in paths:
                    if path.rpartition("/")[-1]==path2.rpartition("/")[0]:
                        paths.append(path+"/"+path2.rpartition("/")[-1])
                        paths.remove(path2)
            cont=cont+1
        for i in paths:
            f.write(i+"\n")
        print(paths)
        f.close

    def parseStateMachines(self, route):
        f = open("StateMachines.txt", "w")
        tree = ET.parse(route)
        root = tree.getroot()

        f.write(root.tag+"\n")
        for mp in root.findall(".Packages/Package/MachineParts/MachinePart/."):
            f.write("Class: "+ mp.get("ClassName")+"\n")
            for sm in mp.findall(".StateMachines/StateMachine/."):
                if(not sm.get("IsStandard")=="True"):
                    f.write("\tStateMachine: "+sm.get("Name")+"\n")
                    for st in sm.findall(".States/State/."):
                        statename=st.get("Name")
                        if(st.find("Entry") is not None):
                            f.write("\t\tState: "+statename+"\n")
                        
                            f.write("\t\t\tActivity: "+st.find("Entry").text+"\n")
                        else:
                            f.write("\t\tPseudoState: "+statename+"\n")
                        for tr in st.findall(".Transitions/Transition/."):
                            f.write("\t\tTransition: ("+statename+"->"+tr.get("Target")+")\n")
                            if(tr.find("Guard") is not None):
                                f.write("\t\t\tGuard: "+tr.find("Guard").text+"\n")
        f.close()

    def APIToStateMachine(self, route):
        f=open("TestingStateMachine.txt", "w")
        input = open("myfile.txt", "r")

        f.write("Class: Machine\n")
        f.write("\tStateMachine: TestStateMachine\n")
        f.write("\t\tPseudoState: Initial\n")
        f.write("\t\tPseudoState: Final\n")
        f.write("\t\tState: GenerateData\n")
        f.write("\t\t\tActivity: \n")
        f.write("\t\tState: TimeCheck\n")
        f.write("\t\t\tActivity: \n")
        f.write("\t\tState: ErrorLog\n")
        f.write("\t\tTransition: (Initial->GenerateData)\n")
        f.write("\t\t\tGuard: \n")
        f.write("\t\tTransition: (TimeCheck->GenerateData)\n")
        f.write("\t\t\tGuard: \n")
        f.write("\t\tTransition: (TimeCheck->ErrorLog)\n")
        f.write("\t\t\tGuard: \n")
        f.write("\t\tTransition: (ErrorLog->Final)\n")
        f.write("\t\t\tGuard: \n")
        line=input.readline()
        operationLine=""
        while True:
            if "Operation: " in line:
                operation=line.replace("\t","").rpartition(":")[2][1:-1]
                operationLine="\t\tState: "+line.replace("\t","").rpartition(":")[2][1:]
                activity="\t\t\tActivity: "+ line.replace("\t","").rpartition(":")[2][1:-1]+"("
                pre=input.readline().rpartition(":")[2][1:-1]
                post=input.readline().rpartition(":")[2][1:-1]
                line=input.readline()
                while "\t\t\t" in line:
                    activity=activity+line.replace("\t","").rpartition(":")[0]+", "
                    if "Double" in line or "Int32" in line:
                        line=input.readline()
                        line=input.readline()
                        line=input.readline()
                    else: 
                        line=input.readline()
                if ", " in activity:
                    activity=activity[:-2]+")\n"
                else:
                    activity=activity+")\n"
                f.write(operationLine)
                f.write(activity)
                f.write("\t\tTransition: (GenerateData->"+operation+")\n")
                f.write("\t\t\tGuard: "+pre+"\n")
                f.write("\t\tTransition: ("+operation+"->TimeCheck)\n")
                f.write("\t\t\tGuard: "+post+"\n")

            else:
                line=input.readline()
            if line=="":
                break
        f.close()
        input.close()


#route=r'C:\Users\Juanjo\Downloads\Cordis-20220718T073048Z-001\Cordis\Dofbot.xml'
#xmlp=XMLProcessor()
#xmlp.getAPITree(route)