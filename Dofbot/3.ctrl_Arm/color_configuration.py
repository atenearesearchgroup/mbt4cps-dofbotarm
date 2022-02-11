#!/usr/bin/env python3
#coding=utf-8
import time
import sys
import os
from os import path

import json
from Arm_Lib import Arm_Device

func = sys.argv[1]

def main():
    
    if func == "configuration":

        color = str(sys.argv[2])
        H_min = str(sys.argv[3])
        S_min = str(sys.argv[4])
        V_min = str(sys.argv[5])
        H_max = str(sys.argv[6])
        S_max = str(sys.argv[7])
        V_max = str(sys.argv[8])

        if path.isfile('/home/dofbot/Dofbot/3.ctrl_Arm/color.txt') is False:
            with open('/home/dofbot/Dofbot/3.ctrl_Arm/color.txt', 'w') as f:
                f.write('')



        with open('/home/dofbot/Dofbot/3.ctrl_Arm/color.txt', 'r') as f:
            lines = f.readlines()

        with open("/home/dofbot/Dofbot/3.ctrl_Arm/color.txt", "w") as f:
            for line in lines:
                if color in line:
                    pass
                else:
                    f.write(line)   


        with open('/home/dofbot/Dofbot/3.ctrl_Arm/color.txt', 'a') as f:
                f.write(color + "," + H_min + "," + S_min + "," + V_min + "," + H_max + "," + S_max + "," + V_max)
                f.writelines('\n')         

    
    elif func == "deleteColor":
        
    
        color = str(sys.argv[2])

        if path.isfile('/home/dofbot/Dofbot/3.ctrl_Arm/color.txt') is False:
            with open('/home/dofbot/Dofbot/3.ctrl_Arm/color.txt', 'w') as f:
                f.write('')



        with open('/home/dofbot/Dofbot/3.ctrl_Arm/color.txt', 'r') as f:
            lines = f.readlines()

        with open("/home/dofbot/Dofbot/3.ctrl_Arm/color.txt", "w") as f:
            for line in lines:
                if color in line:
                    pass
                else:
                    f.write(line)   
                
                
                
                
try :
    main()


except KeyboardInterrupt:
    print(" Program closed! ")
    pass