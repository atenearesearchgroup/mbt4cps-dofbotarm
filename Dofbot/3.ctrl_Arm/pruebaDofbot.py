#!/usr/bin/env python3
#coding=utf-8
import time
import sys
from Arm_Lib import Arm_Device

Arm = Arm_Device()
time.sleep(.1)

func = sys.argv[1]


def main():
    if func == "movServo":
        id = sys.argv[2]
        angle = sys.argv[3]
        clock = sys.argv[4]
        Arm.Arm_serial_servo_write(id, angle, clock)
        time.sleep(1)
    
try :
    main()
except KeyboardInterrupt:
    print(" Program closed! ")
    pass

#del Arm  #Release the Arm object