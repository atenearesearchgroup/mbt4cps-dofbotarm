#!/usr/bin/env python3
#coding=utf-8
import time
import sys
import os
import subprocess
import enum
import cv2
import traitlets
import ipywidgets.widgets as widgets
import numpy as np

import threading
import inspect
import ctypes

from Arm_Lib import Arm_Device

start = time.time()

Arm = Arm_Device()

func = sys.argv[1]

ready = [90, 120, 5, 0, 90, 30]
p_top_catch = [90, 80, 50, 50, 270, 135]
p_top_free = [90, 80, 50, 50, 270, 60]

p_Yellow = [65, 22, 64, 56, 270, 135]
p_Red = [118, 19, 66, 56, 270, 135]
p_Green = [136, 66, 20, 29, 270, 135]
p_Blue = [44, 66, 20, 28, 270, 135]

p_gray = [90, 48, 35, 35, 270, 60]

def main():

    if func == "rotateServo":
        id = int(sys.argv[2])
        angle = int(sys.argv[3])
        clock = int(sys.argv[4])
        
        start = time.time()
        Arm.Arm_serial_servo_write(id, angle, clock)
        time.sleep(clock/1000)
        end = time.time()
        
        print(int((end-start)*1000))
        
        
    elif func == "rotateAllServos":
        angle1 = int(sys.argv[2])
        angle2 = int(sys.argv[3])
        angle3 = int(sys.argv[4])
        angle4 = int(sys.argv[5])
        angle5 = int(sys.argv[6])
        angle6 = int(sys.argv[7])
        clock = int(sys.argv[8])
        
        start = time.time()
        Arm.Arm_serial_servo_write6(angle1, angle2, angle3, angle4, angle5, angle6, clock)
        time.sleep(clock/1000)
        end = time.time()
        
        print(int((end-start)*1000))


        
    elif func == "rotateAllServosArray":
        array = (int(sys.argv[2]), int(sys.argv[3]), int(sys.argv[4]), int(sys.argv[5]), int(sys.argv[6]), int(sys.argv[7]))
        clock = int(sys.argv[8])

        start = time.time()
        Arm.Arm_serial_servo_write6_array(array, clock)
        time.sleep(clock/1000)
        end = time.time()
        
        print(int((end-start)*1000))
        
        
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
        #output = os.system("sudo apt-get install python3-roslaunch")
        output = subprocess.getoutput(command)
        array = output.split()
        array = list(map(float, array))
        del array[-1]
        array.append(90)
        array.append(0)
        
        start = time.time()
        Arm.Arm_serial_servo_write6_array(array, clock)
        Arm.Arm_serial_set_torque(1)
        time.sleep(clock/1000)
        end = time.time()
        
        print(int((end-start)*1000))
        
        
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
        
        start = time.time()
        Arm.distGrip(dist, clock)
        time.sleep(clock/1000)
        end = time.time()
        
        print(int((end-start)*1000))
        
    elif func == "cameraColor":
        
        clock = int(sys.argv[2])/1000
        
        Arm.Arm_serial_servo_write6_array(ready, 1000)
        time.sleep(1)
        
        #Parameters of calibration with the information of the colors to recognise
        def get_color(img):
            H = [];S = [];V = []
            img = cv2.resize(img, (640, 480), )
            color_name={}

            HSV = cv2.cvtColor(img, cv2.COLOR_BGR2HSV)

            cv2.rectangle(img, (290, 280), (350, 340), (0, 255, 0), 2)

            for i in range(290, 350):
                for j in range(280, 340):
                    H.append(HSV[j, i][0])
                    S.append(HSV[j, i][1])
                    V.append(HSV[j, i][2])

            H_min = min(H);H_max = max(H)
            S_min = min(S);S_max = max(S)
            V_min = min(V);V_max = max(V)

            #print(H_min,S_min,V_min,H_max,S_max,V_max)

            if H_min >= 0 and S_min >= 200 and V_min >= 190 and H_max <= 179 and S_max <= 248 and V_max <= 224 : color_name['name'] = 'red'
            elif H_min >= 57 and S_min >= 124 and V_min >= 64 and H_max <= 80 and S_max <= 215 and V_max <= 92 : color_name['name'] = 'green'
            elif H_min >= 108 and S_min >= 210 and V_min >= 97 and H_max <= 117 and S_max <= 255 and V_max <= 135 : color_name['name'] = 'blue'
            elif H_min >= 22 and S_min >= 159 and V_min >= 216 and H_max <= 26 and S_max <= 247 and V_max <= 250 : color_name['name'] = 'yellow'

            return img, color_name


        global g_state_arm
        g_state_arm = 0

        def ctrl_arm_move(index):
            if index == 1:
                time.sleep(.5)
                number_action(index)

            elif index == 2:
                time.sleep(.5)
                number_action(index)

            elif index == 3:
                time.sleep(.5)
                number_action(index)

            elif index == 4:
                time.sleep(.5)
                number_action(index)

            global g_state_arm
            g_state_arm = 0


        #Digital function definition
        def number_action(index):
            if index == 1:
                # Grab the yellow block
                Arm.Arm_serial_servo_write6_array(p_top_free, 1000)
                time.sleep(1)
                Arm.Arm_serial_servo_write6_array(p_gray, 1000)
                time.sleep(1)
                Arm.Arm_serial_servo_write(6, 135, 1000)
                time.sleep(1)
                Arm.Arm_serial_servo_write6_array(p_top_catch, 1000)
                time.sleep(1)
                Arm.Arm_serial_servo_write6_array(p_Yellow, 1000)
                time.sleep(1.2)
                Arm.Arm_serial_servo_write(6, 60, 1000)
                time.sleep(1) 
                Arm.Arm_serial_servo_write6_array(ready, 1000)
                time.sleep(1)

            elif index == 2:
                # Grab the red block
                Arm.Arm_serial_servo_write6_array(p_top_free, 1000)
                time.sleep(1)
                Arm.Arm_serial_servo_write6_array(p_gray, 1000)
                time.sleep(1)
                Arm.Arm_serial_servo_write(6, 135, 1000)
                time.sleep(1)
                Arm.Arm_serial_servo_write6_array(p_top_catch, 1000)
                time.sleep(1)
                Arm.Arm_serial_servo_write6_array(p_Red, 1000)
                time.sleep(1.2)
                Arm.Arm_serial_servo_write(6, 60, 1000)
                time.sleep(1) 
                Arm.Arm_serial_servo_write6_array(ready, 1000)
                time.sleep(1)

            elif index == 3:
                # Grab the green block
                Arm.Arm_serial_servo_write6_array(p_top_free, 1000)
                time.sleep(1)
                Arm.Arm_serial_servo_write6_array(p_gray, 1000)
                time.sleep(1)
                Arm.Arm_serial_servo_write(6, 135, 1000)
                time.sleep(1)
                Arm.Arm_serial_servo_write6_array(p_top_catch, 1000)
                time.sleep(1)
                Arm.Arm_serial_servo_write6_array(p_Green, 1000)
                time.sleep(1.2)
                Arm.Arm_serial_servo_write(6, 60, 1000)
                time.sleep(1) 
                Arm.Arm_serial_servo_write6_array(ready, 1000)
                time.sleep(1)

            elif index == 4:
                # Grab the blue block
                Arm.Arm_serial_servo_write6_array(p_top_free, 1000)
                time.sleep(1)
                Arm.Arm_serial_servo_write6_array(p_gray, 1000)
                time.sleep(1)
                Arm.Arm_serial_servo_write(6, 135, 1000)
                time.sleep(1)
                Arm.Arm_serial_servo_write6_array(p_top_catch, 1000)
                time.sleep(1)
                Arm.Arm_serial_servo_write6_array(p_Blue, 1000)
                time.sleep(1.2)
                Arm.Arm_serial_servo_write(6, 60, 1000)
                time.sleep(1) 
                Arm.Arm_serial_servo_write6_array(ready, 1000)
                time.sleep(1)

        def start_move_arm(index):

            global g_state_arm
            if g_state_arm == 0:
                closeTid = threading.Thread(target = ctrl_arm_move, args = [index])
                closeTid.setDaemon(True)
                closeTid.start()

                g_state_arm = 1

        cap = cv2.VideoCapture(0)
        cap.set(3, 640)
        cap.set(4, 480)
        cap.set(5, 30)  #set frame
        cap.set(cv2.CAP_PROP_FOURCC, cv2.VideoWriter.fourcc('M', 'J', 'P', 'G'))



        def Color_Recongnize():

            while(1):
                ret, frame = cap.read()
                frame, color_name = get_color(frame)
                if len(color_name)==1:
                    if color_name['name'] == 'yellow':
                        start_move_arm(1)
                    elif color_name['name'] == 'red':
                        start_move_arm(2)
                    elif  color_name['name'] == 'green':
                        start_move_arm(3)
                    elif color_name['name'] == 'blue':
                        start_move_arm(4)
                
                if clock > 0:
                    end = time.time()
                    if (end - start) >= clock:
                        #print(end - start)
                        quit()

                    time.sleep(0.01)

            cap.release()

        Color_Recongnize()

    
try :
    main()


except KeyboardInterrupt:
    print(" Program closed! ")
    pass

