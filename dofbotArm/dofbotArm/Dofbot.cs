using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace dofbotArm
{
    public class Dofbot
    {
        //Operation that move a single servo given the servo id, angle and time of the operation.
        //Returns the time of the process.
        public int rotateServo(int id, double angle, int time)
        {
            // Creation of the process
            ProcessStartInfo psi = new ProcessStartInfo();

            // python.exe location
            psi.FileName = @"/usr/bin/python3";

            // The location of the python script that we want to execute with the libraries
            string script = @"/home/dofbot/Dofbot/3.ctrl_Arm/dofbot.py";

            // Name of the function that we want to execute
            string func = "rotateServo";

            // Arguments with the values that we want to pass to the script
            psi.Arguments = $"\"{script}\" \"{func}\" \"{id}\" \"{angle}\" \"{time}\"";

            // Configuration of process characteristics
            psi.UseShellExecute = false;
            psi.CreateNoWindow = true;
            psi.RedirectStandardOutput = true;
            psi.RedirectStandardError = true;

            // Process initialization
            Process process = Process.Start(psi);

            // We read the result that is printed in the python library
            string results = process.StandardOutput.ReadToEnd();

            // In this case we return the value that we read in int format
            return Convert.ToInt32(results); 

        }


        //Move all servos given the angle in order (from servo 1 to servo 6) and the time of the operation.
        //Returns the time of the process.
        public int rotateAllServos(double angle1, double angle2, double angle3, double angle4, double angle5, double angle6, int time)
        {
            // Creation of the process
            ProcessStartInfo psi = new ProcessStartInfo();

            // python.exe location
            psi.FileName = @"/usr/bin/python3";

            // The location of the python script that we want to execute with the libraries
            string script = @"/home/dofbot/Dofbot/3.ctrl_Arm/dofbot.py";

            // Name of the function that we want to execute
            string func = "rotateAllServos";

            // Arguments with the values that we want to pass to the script
            psi.Arguments = $"\"{script}\" \"{func}\" \"{angle1}\" \"{angle2}\" \"{angle3}\" \"{angle4}\" \"{angle5}\" \"{angle6}\" \"{time}\"";
            
            // Configuration of process characteristics
            psi.UseShellExecute = false;
            psi.CreateNoWindow = true;
            psi.RedirectStandardOutput = true;
            psi.RedirectStandardError = true;

            // Process initialization
            Process process = Process.Start(psi);

            // We read the result that is printed in the python library
            string results = process.StandardOutput.ReadToEnd();

            // In this case we return the value that we read in int format
            return Convert.ToInt32(results);
        }


        //Move all the servos given an array in wich we have the angle in order of all the servos that we want to move.
        //Returns the time of the process.
        public int rotateAllServosArray(double[] array,  int time)
        {
            // Creation of the process
            ProcessStartInfo psi = new ProcessStartInfo();

            // python.exe location
            psi.FileName = @"/usr/bin/python3";

            // The location of the python script that we want to execute with the libraries
            string script = @"/home/dofbot/Dofbot/3.ctrl_Arm/dofbot.py";

            // Name of the function that we want to execute
            string func = "rotateAllServosArray";

            // Arguments with the values that we want to pass to the script
            psi.Arguments = $"\"{script}\" \"{func}\" \"{array[0]}\" \"{array[1]}\" \"{array[2]}\" \"{array[3]}\" \"{array[4]}\" \"{array[5]}\" \"{time}\"";

            // Configuration of process characteristics
            psi.UseShellExecute = false;
            psi.CreateNoWindow = true;
            psi.RedirectStandardOutput = true;
            psi.RedirectStandardError = true;

            // Process initialization
            Process process = Process.Start(psi);

            // We read the result that is printed in the python library
            string results = process.StandardOutput.ReadToEnd();

            // In this case we return the value that we read in int format
            return Convert.ToInt32(results);
        }


        //Read a single servo given its id.
        //Returns the angle of the servo.
        public double readServo(int id)
        {
            // Creation of the process
            ProcessStartInfo psi = new ProcessStartInfo();

            // python.exe location
            psi.FileName = @"/usr/bin/python3";

            // The location of the python script that we want to execute with the libraries
            string script = @"/home/dofbot/Dofbot/3.ctrl_Arm/dofbot.py";

            // Name of the function that we want to execute
            string func = "readServo";

            // Arguments with the values that we want to pass to the script
            psi.Arguments = $"\"{script}\" \"{func}\" \"{id}\"";

            // Configuration of process characteristics
            psi.UseShellExecute = false;
            psi.CreateNoWindow = true;
            psi.RedirectStandardOutput = true;
            psi.RedirectStandardError = true;

            // Process initialization
            Process process = Process.Start(psi);

            // We read the result that is printed in the python library
            string results = process.StandardOutput.ReadToEnd();

            // In this case we return the value that we read in double format
            return Convert.ToDouble(results); 

        }


        //Reads the angle of all the servos.
        //Return an array with all the angles in order.
        public double[] readAllServos()
        {
            // Creation of the process
            ProcessStartInfo psi = new ProcessStartInfo();

            // python.exe location
            psi.FileName = @"/usr/bin/python3";

            // The location of the python script that we want to execute with the libraries
            string script = @"/home/dofbot/Dofbot/3.ctrl_Arm/dofbot.py";

            // Name of the function that we want to execute
            string func = "readAllServos";

            // Arguments with the values that we want to pass to the script
            psi.Arguments = $"\"{script}\" \"{func}\"";

            // Configuration of process characteristics
            psi.UseShellExecute = false;
            psi.CreateNoWindow = true;
            psi.RedirectStandardOutput = true;
            psi.RedirectStandardError = true;

            // Process initialization
            Process process = Process.Start(psi);

            // We read the result that is printed in the python library
            string results = process.StandardOutput.ReadToEnd();

            // Similar to readServo, but in this case we have multiple values that we read
            // We need to split and convert each one of them to an array of ints
            char[] delimiterChars = { '\r', '\n' };
            string[] words = results.Split(delimiterChars);
            words = words.Where(w => w != words[6]).ToArray();
            double[] doubles = words.Select(x => double.Parse(x)).ToArray();

            // In this case we return the array of values that we read in double format
            return doubles; 

        }


        //Start the color recognition process for a given time (if 0, it runs forever).
        //Returns the time of the process.
        public int cameraColor(int time)
        {
            // Creation of the process
            ProcessStartInfo psi = new ProcessStartInfo();

            // python.exe location
            psi.FileName = @"/usr/bin/python3";

            // The location of the python script that we want to execute with the libraries
            string script = @"/home/dofbot/Dofbot/3.ctrl_Arm/dofbot.py";

            // Name of the function that we want to execute
            string func = "cameraColor";


            // Arguments with the values that we want to pass to the script
            psi.Arguments = $"\"{script}\" \"{func}\" \"{time}\"";

            // Configuration of process characteristics
            psi.UseShellExecute = false;
            psi.CreateNoWindow = true;
            psi.RedirectStandardOutput = true;
            psi.RedirectStandardError = true;

            string errors = "";
            string results = "";

            using (Process process = Process.Start(psi))
            {
                results = process.StandardOutput.ReadToEnd();
                errors = process.StandardError.ReadToEnd();
            }

            // In this case we return the value that we read in double format
            return Convert.ToInt32(results); 


        }


        public void colorConfiguration(string color, double H_min, double S_min, double V_min, double H_max, double S_max, int V_max)
        {
            // Creation of the process
            ProcessStartInfo psi = new ProcessStartInfo();

            // python.exe location
            psi.FileName = @"/usr/bin/python3";

            // The location of the python script that we want to execute with the libraries
            string script = @"/home/dofbot/Dofbot/3.ctrl_Arm/color_configuration.py";
            string func = "configuration";


            // Arguments with the values that we want to pass to the script
            psi.Arguments = $"\"{script}\" \"{func}\"  \"{color}\" \"{H_min}\" \"{S_min}\" \"{V_min}\" \"{H_max}\" \"{S_max}\" \"{V_max}\"";

            // Configuration of process characteristics
            psi.UseShellExecute = false;
            psi.CreateNoWindow = true;
            psi.RedirectStandardOutput = true;
            psi.RedirectStandardError = true;

            string errors = "";
            string results = "";

            using (Process process = Process.Start(psi))
            {
                results = process.StandardOutput.ReadToEnd();
                errors = process.StandardError.ReadToEnd();
            }
        }





        //Start the buzzer with an specific delay.
        //Returns nothing.
        public void buzzerOn(int time)
        {
            // Creation of the process
            ProcessStartInfo psi = new ProcessStartInfo();

            // python.exe location
            psi.FileName = @"/usr/bin/python3";

            // The location of the python script that we want to execute with the libraries
            string script = @"/home/dofbot/Dofbot/3.ctrl_Arm/dofbot.py";

            // Name of the function that we want to execute
            string func = "buzzerOn";

            // Arguments with the values that we want to pass to the script
            psi.Arguments = $"\"{script}\" \"{func}\" \"{time}\"";

            // Configuration of process characteristics
            psi.UseShellExecute = false;
            psi.CreateNoWindow = true;
            psi.RedirectStandardOutput = true;
            psi.RedirectStandardError = true;

            // Process initialization
            Process process = Process.Start(psi);

            // We read the result that is printed in the python library
            string results = process.StandardOutput.ReadToEnd();

            // Console.WriteLine();

        }


        //Shut down the buzzer.
        //Returns nothing.
        public void buzzerOff()
        {
            // Creation of the process
            ProcessStartInfo psi = new ProcessStartInfo();

            // python.exe location
            psi.FileName = @"/usr/bin/python3";

            // The location of the python script that we want to execute with the libraries
            string script = @"/home/dofbot/Dofbot/3.ctrl_Arm/dofbot.py";

            // Name of the function that we want to execute
            string func = "buzzerOff";

            // Arguments with the values that we want to pass to the script
            psi.Arguments = $"\"{script}\" \"{func}\"";

            // Configuration of process characteristics
            psi.UseShellExecute = false;
            psi.CreateNoWindow = true;
            psi.RedirectStandardOutput = true;
            psi.RedirectStandardError = true;

            // Process initialization
            Process process = Process.Start(psi);

            // We read the result that is printed in the python library
            string results = process.StandardOutput.ReadToEnd();

            // Console.WriteLine();

        }


        //Turn on the light with a given RGB combination.
        //Returns a string with its HEX color.
        public string lightRGB(int r, int g, int b)
        {
            // Creation of the process
            ProcessStartInfo psi = new ProcessStartInfo();

            // python.exe location
            psi.FileName = @"/usr/bin/python3";

            // The location of the python script that we want to execute with the libraries
            string script = @"/home/dofbot/Dofbot/3.ctrl_Arm/dofbot.py";

            // Name of the function that we want to execute
            string func = "lightRGB";

            // Arguments with the values that we want to pass to the script
            psi.Arguments = $"\"{script}\" \"{func}\" \"{r}\" \"{g}\" \"{b}\"";

            // Configuration of process characteristics
            psi.UseShellExecute = false;
            psi.CreateNoWindow = true;
            psi.RedirectStandardOutput = true;
            psi.RedirectStandardError = true;

            // Process initialization
            Process process = Process.Start(psi);

            // We read the result that is printed in the python library
            string results = process.StandardOutput.ReadToEnd();

            //Console.WriteLine();

            // Convert into HEX format
            string hex = string.Format("{0:X2}{1:X2}{2:X2}", r, g, b);

            // In this case we return the HEX value of the color that we read
            return hex;

        }


        //Move to a specific position that we have stored.
        //Returns the time of the process.
        public int readyPosition(int time)
        {
            // Creation of the process
            ProcessStartInfo psi = new ProcessStartInfo();

            // python.exe location
            psi.FileName = @"/usr/bin/python3";

            // The location of the python script that we want to execute with the libraries
            string script = @"/home/dofbot/Dofbot/3.ctrl_Arm/dofbot.py";

            // Name of the function that we want to execute
            string func = "rotateAllServos";

            // Arguments with the values that we want to pass to the script
            psi.Arguments = $"\"{script}\" \"{func}\" \"{90}\" \"{130}\" \"{0}\" \"{0}\" \"{270}\" \"{60}\" \"{time}\"";


            // Configuration of process characteristics
            psi.UseShellExecute = false;
            psi.CreateNoWindow = true;
            psi.RedirectStandardOutput = true;
            psi.RedirectStandardError = true;

            // Process initialization
            Process process = Process.Start(psi);

            // We read the result that is printed in the python library
            string results = process.StandardOutput.ReadToEnd();

            // In this case we return the value that we read in int format
            return Convert.ToInt32(results); 
        }


        //Move to a specific position that we have stored.
        //Returns the time of the process.
        public int straightPosition(int time)
        {
            // Creation of the process
            ProcessStartInfo psi = new ProcessStartInfo();

            // python.exe location
            psi.FileName = @"/usr/bin/python3";

            // The location of the python script that we want to execute with the libraries
            string script = @"/home/dofbot/Dofbot/3.ctrl_Arm/dofbot.py";

            // Name of the function that we want to execute
            string func = "rotateAllServos";

            // Arguments with the values that we want to pass to the script
            psi.Arguments = $"\"{script}\" \"{func}\" \"{90}\" \"{90}\" \"{90}\" \"{90}\" \"{90}\" \"{90}\" \"{time}\"";

            // Configuration of process characteristics
            psi.UseShellExecute = false;
            psi.CreateNoWindow = true;
            psi.RedirectStandardOutput = true;
            psi.RedirectStandardError = true;

            // Process initialization
            Process process = Process.Start(psi);

            // We read the result that is printed in the python library
            string results = process.StandardOutput.ReadToEnd();

            // In this case we return the value that we read in int format
            return Convert.ToInt32(results); 
        }


        //Calculate the gripping distance for a given size of the object to be caught and the time of the operation.
        //Returns the time of the process.
        public int distGrip(double dist, int time)
        {

            // Creation of the process
            ProcessStartInfo psi = new ProcessStartInfo();

            // python.exe location
            psi.FileName = @"/usr/bin/python3";

            // The location of the python script that we want to execute with the libraries
            string script = @"/home/dofbot/Dofbot/3.ctrl_Arm/dofbot.py";

            // Name of the function that we want to execute
            string func = "distGrip";

            // Arguments with the values that we want to pass to the script
            psi.Arguments = $"\"{script}\" \"{func}\" \"{dist}\" \"{time}\"";

            // Configuration of process characteristics
            psi.UseShellExecute = false;
            psi.CreateNoWindow = true;
            psi.RedirectStandardOutput = true;
            psi.RedirectStandardError = true;

            // Process initialization
            Process process = Process.Start(psi);

            // We read the result that is printed in the python library
            string results = process.StandardOutput.ReadToEnd();

            // In this case we return the value that we read in int format
            return Convert.ToInt32(results); 

        }


        //Move the arm to a given coordinates (x,y,z).
        //Returns the time of the process.
        public int moveToXYZ(double x, double y, double z, int time)
        {

            // Creation of the process
            ProcessStartInfo psi = new ProcessStartInfo();

            // python.exe location
            psi.FileName = @"/usr/bin/python3";

            // The location of the python script that we want to execute with the libraries
            string script = @"/home/dofbot/Dofbot/3.ctrl_Arm/dofbot.py";

            // Name of the function that we want to execute
            string func = "moveToXYZ";

            // Arguments with the values that we want to pass to the script
            psi.Arguments = $"\"{script}\" \"{func}\" \"{x}\" \"{y}\" \"{z}\" \"{time}\"";

            // Configuration of process characteristics
            psi.UseShellExecute = false;
            psi.CreateNoWindow = true;
            psi.RedirectStandardOutput = true;
            psi.RedirectStandardError = true;

            // Process initialization
            Process process = Process.Start(psi);

            // We read the result that is printed in the python library
            string results = process.StandardOutput.ReadToEnd();

            // In this case we return the value that we read in int format
            return Convert.ToInt32(results); 

        }


        //Calculate the coordinates (x,y,z) with the angle of the servos.
        //Returns an array with the (x,y,z) coordinates.
        public double[] readXYZ(double angle1, double angle2, double angle3, double angle4, double angle5)
        {
            // Creation of the process
            ProcessStartInfo psi = new ProcessStartInfo();

            // python.exe location
            psi.FileName = @"/usr/bin/python3";

            // The location of the python script that we want to execute with the libraries
            string script = @"/home/dofbot/Dofbot/3.ctrl_Arm/dofbot.py";

            // Name of the function that we want to execute
            string func = "readXYZ";

            // Arguments with the values that we want to pass to the script
            psi.Arguments = $"\"{script}\" \"{func}\" \"{angle1}\" \"{angle2}\" \"{angle3}\" \"{angle4}\" \"{angle5}\"";

            // Configuration of process characteristics
            psi.UseShellExecute = false;
            psi.CreateNoWindow = true;
            psi.RedirectStandardOutput = true;
            psi.RedirectStandardError = true;

            // Process initialization
            Process process = Process.Start(psi);

            // We read the result that is printed in the python library
            string results = process.StandardOutput.ReadToEnd();

            // Similar to readServo, but in this case we have multiple values that we read
            // We need to split and convert each one of them to an array of ints

            char[] delimiterChars = { '\r', '\n' };
            string[] words = results.Split(delimiterChars);
            words = words.Where(w => w != words[3]).ToArray();
            double[] doubles = words.Select(x => double.Parse(x)).ToArray();

            // In this case we return the array of values that we read in double format
            return doubles;
        }

    }
}
