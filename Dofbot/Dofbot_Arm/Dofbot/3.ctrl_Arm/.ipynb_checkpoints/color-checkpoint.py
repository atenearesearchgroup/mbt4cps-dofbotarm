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

ready = [90, 120, 5, 0, 90, 30]
p_top_catch = [90, 80, 50, 50, 270, 135]
p_top_free = [90, 80, 50, 50, 270, 60]

p_Yellow = [65, 22, 64, 56, 270, 135]
p_Red = [118, 19, 66, 56, 270, 135]
p_Green = [136, 66, 20, 29, 270, 135]
p_Blue = [44, 66, 20, 28, 270, 135]

p_gray = [90, 48, 35, 35, 270, 60]







def main():

    clock = 2000000

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
    
        with open('/home/dofbot/Dofbot/3.ctrl_Arm/color.txt', 'r') as f:
            lines = f.readlines()

            for line in lines:
                if H_min >= int(line.split(',')[1]) and S_min >= int(line.split(',')[2]) and V_min >= int(line.split(',')[3]) and H_max <= int(line.split(',')[4]) and S_max <= int(line.split(',')[5]) and V_max <= int(line.split(',')[6]) : color_name['name'] = str(line.split(',')[0])


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

            counter = clock/1000
            if counter > 0:
                end = time.time()
                if (end - start) >= counter:
                    time.sleep(counter)
                    print(int((end-start)*1000))
                    quit()

                time.sleep(0.01)
        
        cap.release()

    Color_Recongnize()


try :
    main()


except KeyboardInterrupt:
    print(" Program closed! ")
    pass

