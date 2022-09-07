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


inst = ('rosrun dofbot_moveit dofbot_kinematics_fk')
s1 = str(90)
s2 = str(90)
s3 = str(90)
s4 = str(90)
s5 = str(90)

command = inst + " " +  s1 + " " + s2 + " " + s3 + " " + s4 + " " + s5

output = subprocess.getoutput(command)
print(command)

array = output.split()
print(array)

array = list(map(float, array))
print(array)

