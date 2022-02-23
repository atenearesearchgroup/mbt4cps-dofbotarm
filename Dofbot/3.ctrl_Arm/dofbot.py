#!/usr/bin/env python3
#coding=utf-8
import time
import sys
import subprocess
import cv2
import threading
from Arm_Lib import Arm_Device

# Assign the arm to an attribute
Arm = Arm_Device()

# Read the function to execute
func = sys.argv[1]

# Predefined positions
ready = [90, 120, 5, 0, 90, 30]
p_top_catch = [90, 80, 50, 50, 270, 135]
p_top_free = [90, 80, 50, 50, 270, 60]

p_Yellow = [65, 22, 64, 56, 270, 135]
p_Red = [118, 19, 66, 56, 270, 135]
p_Green = [136, 66, 20, 29, 270, 135]
p_Blue = [44, 66, 20, 28, 270, 135]
p_gray = [90, 48, 35, 35, 270, 60]

def main():

    # Move a single servo
    if func == "rotateServo":
        
        # id of the servo to move
        id = int(sys.argv[2])
        # angle of rotation
        angle = int(sys.argv[3])
        # time of execution
        clock = int(sys.argv[4])
        
        # Initialize clock for runtime count 
        start = time.time()
        # Execute the operation
        Arm.Arm_serial_servo_write(id, angle, clock)
        # Wait for the movement to finish
        # time.sleep(clock/1000)
        # Stop the clock
        end = time.time()
        
        # Print execution time
        print(int((end-start)*1000))
        
    # Move all servos    
    elif func == "rotateAllServos":
        
        # id of the six servos in order
        angle1 = int(sys.argv[2])
        angle2 = int(sys.argv[3])
        angle3 = int(sys.argv[4])
        angle4 = int(sys.argv[5])
        angle5 = int(sys.argv[6])
        angle6 = int(sys.argv[7])
        # time of execution
        clock = int(sys.argv[8])
        
        # Initialize clock for runtime count 
        start = time.time()
        # Execute the operation
        Arm.Arm_serial_servo_write6(angle1, angle2, angle3, angle4, angle5, angle6, clock)
        # Wait for the movement to finish
        # time.sleep(clock/1000)
        # Stop the clock
        end = time.time()
        
        # Print execution time        
        print(int((end-start)*1000))


    # Move all the servos given an array
    elif func == "rotateAllServosArray":
        
        # array with all six servos ids
        array = (int(sys.argv[2]), int(sys.argv[3]), int(sys.argv[4]), int(sys.argv[5]), int(sys.argv[6]), int(sys.argv[7]))
        # time of execution
        clock = int(sys.argv[8])

        # Initialize clock for runtime count 
        start = time.time()
        # Execute the operation
        Arm.Arm_serial_servo_write6_array(array, clock)
        # Wait for the movement to finish
        # time.sleep(clock/1000)
        # Stop the clock
        end = time.time()
        
        # Print execution time        
        print(int((end-start)*1000))
        
    # Read all the six angles
    elif func == "readTime":
        
        clock = 2000
        end = 0
        start = time.time()
        Arm.Arm_serial_servo_write6(90, 90, 0, 90, 90, 180, clock)
        time.sleep(.01)
        
        while (end - start <= 10):
            for i in range(6):
                aa = Arm.Arm_serial_servo_read(i+1)
                print(aa)
                time.sleep(.01)
            time.sleep(.5)
            #print(end - start)
            end = time.time()   


    # Read the servo angle    
    elif func == "readServo":
        
        # id of the servo
        id = int(sys.argv[2])
        
        # Execute the operation
        angle = Arm.Arm_serial_servo_read(id)
        
        # Print the angle value        
        print(angle)
        
        
    # Read all the six angles
    elif func == "readAllServos":
        
        # Execute the operation for all the servos and print the value
        for i in range(6):
            angle = Arm.Arm_serial_servo_read(i+1)
            print(angle)

    # Color recognition
    elif func == "cameraColor":
        
        # Initialize clock for runtime count 
        start = time.time()

        # Process execution time
        clock = int(sys.argv[2])

        # Set the arm in position to record the image
        Arm.Arm_serial_servo_write6_array(ready, 1000)
        time.sleep(1)

        #Parameters of calibration with the information of the colors to recognise
        def get_color(img):
            
            # Initialize camera parameters
            img = cv2.resize(img, (640, 480), )

            HSV = cv2.cvtColor(img, cv2.COLOR_BGR2HSV)

            cv2.rectangle(img, (290, 280), (350, 340), (0, 255, 0), 2)

            H = [];S = [];V = []

            for i in range(290, 350):
                for j in range(280, 340):
                    H.append(HSV[j, i][0])
                    S.append(HSV[j, i][1])
                    V.append(HSV[j, i][2])

            H_min = min(H);H_max = max(H)
            S_min = min(S);S_max = max(S)
            V_min = min(V);V_max = max(V)

            # Set the color value to recognize
            color_name={}

            with open('/home/dofbot/Dofbot/3.ctrl_Arm/color.txt', 'r') as f:
                lines = f.readlines()

                for line in lines:
                    if H_min >= int(line.split(',')[1]) and S_min >= int(line.split(',')[2]) and V_min >= int(line.split(',')[3]) and H_max <= int(line.split(',')[4]) and S_max <= int(line.split(',')[5]) and V_max <= int(line.split(',')[6]) : color_name['name'] = str(line.split(',')[0])

            return img, color_name


        global g_state_arm
        g_state_arm = 0

        # Selection of the operation
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


        # Set of movements for each color
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

        # Start the operation
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


        # Main function for color recognition
        def Color_Recongnize():
            start = time.time()
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
                # Check if the operation should run for a certain time or if it runs forever
                if counter > 0:
                    end = time.time()
                    if (end - start) >= counter:
                        print(int((end-start)*1000))
                        quit()

            
            cap.release()
        
        Color_Recongnize()
            
    
    # Start the buzzer with a delay
    elif func == "buzzerOn":
        clock = int(sys.argv[2])
        Arm.Arm_Buzzer_On(clock)
    
    # Stop the buzzer
    elif func == "buzzerOff":
        Arm.Arm_Buzzer_Off()
        
    # Turn on a given color combination for the LED light
    elif func == "lightRGB":
        R = int(sys.argv[2])
        G = int(sys.argv[3])
        B = int(sys.argv[4])
        
        Arm.Arm_RGB_set(R, G, B)            
            
       

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

        
    elif func == "distGrip":
        
        dist = int(sys.argv[2])
        clock = int(sys.argv[3])
        
        start = time.time()
        Arm.distGrip(dist, clock)
        time.sleep(clock/1000)
        end = time.time()
        
        print(int((end-start)*1000))
        
    elif func == "isAt":
        
        # angle resolution
        
        pos_bool = False
        counter = 0
        
        a_1 = int(sys.argv[2])
        a_2 = int(sys.argv[3])
        a_3 = int(sys.argv[4])
        a_4 = int(sys.argv[5])
        a_5 = int(sys.argv[6])
        a_6 = int(sys.argv[7])
        a_res = int(sys.argv[8])
        
        
        for i in range(6):
            angle = Arm.Arm_serial_servo_read(i+1)
            
            if locals()['a_'+str(i+1)]-a_res <= angle <= locals()['a_'+str(i+1)]+a_res:
                counter+=1
                pass
            else:
                break
        
        if counter == 6:
            pos_bool = True
        
                
        print(pos_bool)
        
    

try :
    main()


except KeyboardInterrupt:
    print(" Program closed! ")
    pass

