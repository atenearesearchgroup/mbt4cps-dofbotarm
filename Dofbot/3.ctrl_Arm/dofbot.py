#!/usr/bin/env python3
#coding=utf-8
import time
from Arm_Lib import Arm_Device
import sys
import os
import subprocess

Arm = Arm_Device()

func = sys.argv[1]

def main():

    if func == "rotateServo":
        id = int(sys.argv[2])
        angle = int(sys.argv[3])
        clock = int(sys.argv[4])
        
        Arm.Arm_serial_servo_write(id, angle, clock)
        print(clock)

    elif func == "rotateAllServos":
        angle1 = int(sys.argv[2])
        angle2 = int(sys.argv[3])
        angle3 = int(sys.argv[4])
        angle4 = int(sys.argv[5])
        angle5 = int(sys.argv[6])
        angle6 = int(sys.argv[7])
        clock = int(sys.argv[8])
        
        Arm.Arm_serial_servo_write6(angle1, angle2, angle3, angle4, angle5, angle6, clock)
        print(clock)
        
    elif func == "rotateAllServosArray":
        array = (int(sys.argv[2]), int(sys.argv[3]), int(sys.argv[4]), int(sys.argv[5]), int(sys.argv[6]), int(sys.argv[7]))
        clock = int(sys.argv[8])
        
        Arm.Arm_serial_servo_write6_array(array, clock)
        print(clock)
        
    elif func == "readServo":
        id = int(sys.argv[2])
        
        aa = Arm.Arm_serial_servo_read(id)
        print(aa)
        
    elif func == "readAllServos":
        for i in range(6):
            aa = Arm.Arm_serial_servo_read(i+1)
            print(aa)
            
    elif func == "moveToXYZ":
        
        inst = ('rosrun dofbot_moveit dofbot_kinematics_ik')
        x = str(sys.argv[2])
        y = str(sys.argv[3])
        z = str(sys.argv[4])
        clock = int(sys.argv[5])

        command = inst + " " +  x + " " + y + " " + z

        output = subprocess.getoutput(command)
        array = output.split()
        array = list(map(float, array))
        del array[-1]
        array.append(90)
        array.append(0)

        Arm.Arm_serial_servo_write6_array(array, clock)
        Arm.Arm_serial_set_torque(1)
        print(clock)
                    
    elif func == "readXYZ":
        
        inst = ('rosrun dofbot_moveit dofbot_kinematics_fk')
        s1 = str(sys.argv[2])
        s2 = str(sys.argv[3])
        s3 = str(sys.argv[4])
        s4 = str(sys.argv[5])
        s5 = str(sys.argv[6])

        command = inst + " " +  s1 + " " + s2 + " " + s3 + " " + s4 + " " + s5

        output = subprocess.getoutput(command)
        array = output.split()
        array = list(map(float, array))

        Arm.Arm_serial_set_torque(1)

        print(array[0])   
        print(array[1])   
        print(array[2])   
        
    elif func == "buzzerOn":
        clock = int(sys.argv[2])
        Arm.Arm_Buzzer_On(clock)
            
    elif func == "buzzerOff":
        Arm.Arm_Buzzer_Off()
        
    elif func == "lightRGB":
        R = int(sys.argv[2])
        G = int(sys.argv[3])
        B = int(sys.argv[4])
        
        Arm.Arm_RGB_set(R, G, B)
        
    elif func == "distGrip":
        
        dist = int(sys.argv[2])
        clock = int(sys.argv[3])

        Arm.distGrip(dist, clock)
        print(clock)


    
try :
    main()

except KeyboardInterrupt:
    print(" Program closed! ")
    pass

