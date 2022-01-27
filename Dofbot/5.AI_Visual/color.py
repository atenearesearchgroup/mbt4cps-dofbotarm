#bgr8 to jpeg format
import enum
import cv2
import traitlets
import ipywidgets.widgets as widgets
import time
import numpy as np

import threading
import inspect
import ctypes

from Arm_Lib import Arm_Device

Arm = Arm_Device()

# Define variable parameters at different locations
ready = [90, 120, 5, 0, 90, 30]
p_top_catch = [90, 80, 50, 50, 270, 135]
p_top_free = [90, 80, 50, 50, 270, 60]

p_Yellow = [65, 22, 64, 56, 270, 135]
p_Red = [118, 19, 66, 56, 270, 135]
p_Green = [136, 66, 20, 29, 270, 135]
p_Blue = [44, 66, 20, 28, 270, 135]

p_gray = [90, 48, 35, 35, 270, 60]


def main():

    #Release the operation when it ends
    def _async_raise(tid, exctype):
        """raises the exception, performs cleanup if needed"""
        tid = ctypes.c_long(tid)
        if not inspect.isclass(exctype):
            exctype = type(exctype)
        res = ctypes.pythonapi.PyThreadState_SetAsyncExc(tid, ctypes.py_object(exctype))
        if res == 0:
            raise ValueError("invalid thread id")
        elif res != 1:

            ctypes.pythonapi.PyThreadState_SetAsyncExc(tid, None)

    def stop_thread(thread):
        _async_raise(thread.ident, SystemExit)



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

            time.sleep(0.01)

        cap.release()

    thread1 = threading.Thread(target=Color_Recongnize)
    thread1.setDaemon(True)
    thread1.start()

    Arm.Arm_serial_servo_write6_array(ready, 1000)
    time.sleep(1)


try:
    main()
    while True:
        time.sleep(.000001)


except KeyboardInterrupt:
    print(" Program closed! ")
    pass

