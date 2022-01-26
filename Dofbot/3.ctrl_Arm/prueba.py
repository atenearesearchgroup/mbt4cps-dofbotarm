#!/usr/bin/env python3
#coding=utf-8
import time
import sys
from Arm_Lib import Arm_Device
import os
import subprocess
import numpy as np

Arm = Arm_Device()
time.sleep(.1)


inst = ('rosrun dofbot_moveit dofbot_kinematics_ik')
x = str(0)
y = str(0)
z = str(34)

command = inst + " " +  x + " " + y + " " + z
print(command)
output = subprocess.getoutput(command)
print(output)

array = output.split()
print(array)
array = list(map(float, array))
print(array)

        
        

