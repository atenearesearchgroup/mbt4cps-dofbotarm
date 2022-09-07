import tkinter as tk
from tkinter.filedialog import askopenfilename
import GenerateDataGUI as gd 
import XMLProcessor as XMLp




def select_all():
    print()
    for i in range(len(checkvariables)):
        if not checkvariables[i].get():  
            checkvariables[i].set(1)
        else:
            checkvariables[i].set(0)
def update_API(window2, prebox, postbox, checkvariables, lines):

    output_file = open("output.txt", mode="w", encoding="utf-8")
    counter=0
    for line in lines:
            if(line.startswith('\tOperation: ')):
                print("Operation "+str(counter))
                if checkvariables[counter].get():
                    output_file.write(line)
                    if prebox[counter].get()=="":
                        output_file.write("\t\tPre: True\n")
                    else:
                        output_file.write("\t\tPre: "+str(prebox[counter].get()+"\n"))
                    if postbox[counter].get()=="":
                        output_file.write("\t\tPost: True\n")
                    else:
                        output_file.write("\t\tPost: "+str(postbox[counter].get()+"\n"))
                    counter=counter+1
                else:
                    counter=counter+1
            elif (line.startswith('\t\t')) and checkvariables[counter-1].get()==False or line.startswith("\t\tP"):
                print("")
            else:
                output_file.write(line)
    output_file.close()
    window2.destroy()
    window.destroy()
    gd.main()

def configureModel():
    


    operations=[] 
    input_file = open("DofbotAPI.txt", mode="r", encoding="utf-8")  
    lines=input_file.readlines()
    input_file.close()
    operation=""
    for line in lines:
        if(line.startswith('\tOperation: ')):
            operation=line.split(" ")[1].replace("\n","")
            operations.append(operation)
    print(operations)
    window2 = tk.Tk()
    window2.title("Test generator configuration")
    window2.geometry("600x400")

    main_frame=tk.Frame(window2)
    main_frame.pack(fill="both", expand=1)

    my_canvas = tk.Canvas(main_frame)
    my_canvas.pack(side="left", fill="both", expand=1)

    my_scrollbar=tk.Scrollbar(main_frame, orient="vertical", command=my_canvas.yview)
    my_scrollbar.pack(side="right", fill="y")

    my_canvas.configure(yscrollcommand=my_scrollbar.set)
    my_canvas.bind('<Configure>', lambda e: my_canvas.configure(scrollregion = my_canvas.bbox("all")))

    second_frame = tk.Frame(my_canvas)

    my_canvas.create_window((0,0),window=second_frame, anchor="nw")

    greeting = tk.Label(second_frame, text="Select the operations that you want to test.")
    greeting.grid(row=0, column=0)
    numops=len(operations)
    checkbox = [""]*numops
    global checkvariables
    checkvariables= [""]*numops
    pre = [""]*numops
    prebox = [""]*numops
    post = [""]*numops
    postbox = [""]*numops
    j=0
    for i in range(numops):
        print(i)
        checkvariables[i]=tk.BooleanVar(second_frame)

        checkbox[i] = tk.Checkbutton(second_frame,text=operations[i], variable=checkvariables[i])
        checkbox[i].grid(row=i+j+1, column=0)

        pre[i]=tk.Label(second_frame,text="pre")
        post[i]=tk.Label(second_frame,text="post")
        prebox[i]=tk.Entry(second_frame)
        postbox[i]=tk.Entry(second_frame)
        pre[i].grid(row=i+j+2, column=0)
        post[i].grid(row=i+j+3, column=0)
        prebox[i].grid(row=i+j+2, column=1)
        postbox[i].grid(row=i+j+3, column=1)
        j=j+3

    
    select_all_check = tk.Checkbutton(second_frame, text="Select all", command = select_all)
    button_accept= tk.Button(second_frame, text="Accept", command= lambda: update_API(window2, prebox, postbox, checkvariables, lines))
    button_cancel= tk.Button(second_frame, text="Cancel", command=window2.destroy)
    select_all_check.grid(row=numops+j+2, column=0)
    button_accept.grid(row=numops+j+3, column=0)
    button_cancel.grid(row=numops+j+3, column=1)
    window2.mainloop()
    
def onlyGenerateTests():
    window.destroy()
    gd.main()




processor=XMLp.XMLProcessor()
route= askopenfilename(
            filetypes=[("XML Files", "*.xml"), ("All Files", "*.*")]
        )
processor.getAPITree(route)
processor.parseAPI(route)
window = tk.Tk()
window.title("Test generator configuration")

mainmessage = tk.Label(window, text="Welcome to the unitary test generator.")
mainmessage.grid(row=0, column=0)
button_1= tk.Button(window, text="Configure and generate tests", command=configureModel)
button_2= tk.Button(window, text="Generate tests using current configuration", command=onlyGenerateTests)
button_1.grid(row=1, column=0)
button_2.grid(row=2, column=0)
window.mainloop()