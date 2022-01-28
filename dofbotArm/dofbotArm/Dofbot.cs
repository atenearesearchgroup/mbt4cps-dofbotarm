using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace dofbotArm
{
    public class Dofbot
    {
        public int rotateServo(int id, double angle, int time)
        {
            var psi = new ProcessStartInfo();
            
            psi.FileName = @"/usr/bin/python3"; // python.exe location
            var script = @"/home/dofbot/Dofbot/3.ctrl_Arm/dofbot.py"; // The location of the python script that we want to execute with the libraries
            var func = "rotateServo"; // Name of the function that we want to execute

            psi.Arguments = $"\"{script}\" \"{func}\" \"{id}\" \"{angle}\" \"{time}\""; // Arguments with the values that we want to pass to the script

            psi.UseShellExecute = false; ;
            psi.CreateNoWindow = true;
            psi.RedirectStandardOutput = true;
            psi.RedirectStandardError = true;

            var process = Process.Start(psi);
            var results = process.StandardOutput.ReadToEnd();
            return Convert.ToInt32(results); // In this case we return the value that we read in int format

        }

        public int rotateAllServos(double angle1, double angle2, double angle3, double angle4, double angle5, double angle6, int time)
        {
            var psi = new ProcessStartInfo();

            psi.FileName = @"/usr/bin/python3";
            var script = @"/home/dofbot/Dofbot/3.ctrl_Arm/dofbot.py";
            var func = "rotateAllServos";

            psi.Arguments = $"\"{script}\" \"{func}\" \"{angle1}\" \"{angle2}\" \"{angle3}\" \"{angle4}\" \"{angle5}\" \"{angle6}\" \"{time}\"";

            psi.UseShellExecute = false; ;
            psi.CreateNoWindow = true;
            psi.RedirectStandardOutput = true;
            psi.RedirectStandardError = true;

            var process = Process.Start(psi);
            var results = process.StandardOutput.ReadToEnd();
            return Convert.ToInt32(results); // In this case we return the value that we read in int format
        }

        public int rotateAllServosArray(double[] array,  int time)
        {
            var psi = new ProcessStartInfo();

            psi.FileName = @"/usr/bin/python3";
            var script = @"/home/dofbot/Dofbot/3.ctrl_Arm/dofbot.py";
            var func = "rotateAllServosArray";

            psi.Arguments = $"\"{script}\" \"{func}\" \"{array[0]}\" \"{array[1]}\" \"{array[2]}\" \"{array[3]}\" \"{array[4]}\" \"{array[5]}\" \"{time}\"";

            psi.UseShellExecute = false; ;
            psi.CreateNoWindow = true;
            psi.RedirectStandardOutput = true;
            psi.RedirectStandardError = true;

            var process = Process.Start(psi);
            var results = process.StandardOutput.ReadToEnd();
            return Convert.ToInt32(results); // In this case we return the value that we read in int format
        }

        public double readServo(int id)
        {
            var psi = new ProcessStartInfo();

            psi.FileName = @"/usr/bin/python3";
            var script = @"/home/dofbot/Dofbot/3.ctrl_Arm/dofbot.py";
            var func = "readServo";

            psi.Arguments = $"\"{script}\" \"{func}\" \"{id}\"";

            psi.UseShellExecute = false; ;
            psi.CreateNoWindow = true;
            psi.RedirectStandardOutput = true;
            psi.RedirectStandardError = true;

            var process = Process.Start(psi);
            var results = process.StandardOutput.ReadToEnd();
            
            return Convert.ToDouble(results); // In this case we return the value that we read in int format

        }
        public double[] readAllServos()
        {
            var psi = new ProcessStartInfo();

            psi.FileName = @"/usr/bin/python3";
            var script = @"/home/dofbot/Dofbot/3.ctrl_Arm/dofbot.py";
            var func = "readAllServos";

            psi.Arguments = $"\"{script}\" \"{func}\"";

            psi.UseShellExecute = false; ;
            psi.CreateNoWindow = true;
            psi.RedirectStandardOutput = true;
            psi.RedirectStandardError = true;

            var process = Process.Start(psi);
            var results = process.StandardOutput.ReadToEnd();

            // Similar to readServo, but in this case we have multiple values that we read
            // We need to split and convert each one of them to an array of ints

            char[] delimiterChars = { '\r', '\n' };
            string[] words = results.Split(delimiterChars);

            words = words.Where(w => w != words[6]).ToArray();

            double[] doubles = words.Select(x => double.Parse(x)).ToArray();

            return doubles;

        }
        public void cameraColor(int time)
        {
            var psi = new ProcessStartInfo();

            psi.FileName = @"/usr/bin/python3";
            var script = @"/home/dofbot/Dofbot/3.ctrl_Arm/dofbot.py";
            var func = "cameraColor";

            psi.Arguments = $"\"{script}\" \"{func}\" \"{time}\"";

            psi.UseShellExecute = false; ;
            psi.CreateNoWindow = true;
            psi.RedirectStandardOutput = true;
            psi.RedirectStandardError = true;

            var process = Process.Start(psi);
            var results = process.StandardOutput.ReadToEnd();

            Console.WriteLine();

        }

        public void buzzerOn(int time)
        {
            var psi = new ProcessStartInfo();

            psi.FileName = @"/usr/bin/python3"; 
            var script = @"/home/dofbot/Dofbot/3.ctrl_Arm/dofbot.py"; 
            var func = "buzzerOn";

            psi.Arguments = $"\"{script}\" \"{func}\" \"{time}\""; 

            psi.UseShellExecute = false; ;
            psi.CreateNoWindow = true;
            psi.RedirectStandardOutput = true;
            psi.RedirectStandardError = true;

            var process = Process.Start(psi);
            var results = process.StandardOutput.ReadToEnd();

            Console.WriteLine();

        }


        public void buzzerOff()
        {
            var psi = new ProcessStartInfo();

            psi.FileName = @"/usr/bin/python3";
            var script = @"/home/dofbot/Dofbot/3.ctrl_Arm/dofbot.py";
            var func = "buzzerOff";

            psi.Arguments = $"\"{script}\" \"{func}\"";

            psi.UseShellExecute = false; ;
            psi.CreateNoWindow = true;
            psi.RedirectStandardOutput = true;
            psi.RedirectStandardError = true;

            var process = Process.Start(psi);
            var results = process.StandardOutput.ReadToEnd();

            Console.WriteLine();

        }

        public string lightRGB(int r, int g, int b)
        {
            var psi = new ProcessStartInfo();

            psi.FileName = @"/usr/bin/python3"; 
            var script = @"/home/dofbot/Dofbot/3.ctrl_Arm/dofbot.py"; 
            var func = "lightRGB"; 

            psi.Arguments = $"\"{script}\" \"{func}\" \"{r}\" \"{g}\" \"{b}\"";

            psi.UseShellExecute = false; ;
            psi.CreateNoWindow = true;
            psi.RedirectStandardOutput = true;
            psi.RedirectStandardError = true;

            var process = Process.Start(psi);
            var results = process.StandardOutput.ReadToEnd();

            //Console.WriteLine();

            string hex = string.Format("{0:X2}{1:X2}{2:X2}", r, g, b);

            return hex;

        }

        public int readyPosition(int time)
        {
            var psi = new ProcessStartInfo();

            psi.FileName = @"/usr/bin/python3";
            var script = @"/home/dofbot/Dofbot/3.ctrl_Arm/dofbot.py";
            var func = "rotateAllServos";

            psi.Arguments = $"\"{script}\" \"{func}\" \"{90}\" \"{130}\" \"{0}\" \"{0}\" \"{270}\" \"{60}\" \"{time}\"";

            psi.UseShellExecute = false; ;
            psi.CreateNoWindow = true;
            psi.RedirectStandardOutput = true;
            psi.RedirectStandardError = true;

            var process = Process.Start(psi);
            var results = process.StandardOutput.ReadToEnd();
            return Convert.ToInt32(results); // In this case we return the value that we read in int format
        }

        public int straightPosition(int time)
        {
            var psi = new ProcessStartInfo();

            psi.FileName = @"/usr/bin/python3";
            var script = @"/home/dofbot/Dofbot/3.ctrl_Arm/dofbot.py";
            var func = "rotateAllServos";

            psi.Arguments = $"\"{script}\" \"{func}\" \"{90}\" \"{90}\" \"{90}\" \"{90}\" \"{90}\" \"{90}\" \"{time}\"";

            psi.UseShellExecute = false; ;
            psi.CreateNoWindow = true;
            psi.RedirectStandardOutput = true;
            psi.RedirectStandardError = true;

            var process = Process.Start(psi);
            var results = process.StandardOutput.ReadToEnd();
            return Convert.ToInt32(results); // In this case we return the value that we read in int format
        }


        public int distGrip(double dist, int time)
        {

            var psi = new ProcessStartInfo();

            psi.FileName = @"/usr/bin/python3"; // python.exe location
            var script = @"/home/dofbot/Dofbot/3.ctrl_Arm/dofbot.py"; // The location of the python script that we want to execute with the libraries
            var func = "distGrip"; // Name of the function that we want to execute

            psi.Arguments = $"\"{script}\" \"{func}\" \"{dist}\" \"{time}\""; // Arguments with the values that we want to pass to the script

            psi.UseShellExecute = false; ;
            psi.CreateNoWindow = true;
            psi.RedirectStandardOutput = true;
            psi.RedirectStandardError = true;

            var process = Process.Start(psi);
            var results = process.StandardOutput.ReadToEnd();
            return Convert.ToInt32(results); // In this case we return the value that we read in int format

        }


        public int moveToXYZ(double x, double y, double z, int time)
        {

            var psi = new ProcessStartInfo();

            psi.FileName = @"/usr/bin/python3"; // python.exe location
            var script = @"/home/dofbot/Dofbot/3.ctrl_Arm/dofbot.py"; // The location of the python script that we want to execute with the libraries
            var func = "moveToXYZ"; // Name of the function that we want to execute

            psi.Arguments = $"\"{script}\" \"{func}\" \"{x}\" \"{y}\" \"{z}\" \"{time}\""; // Arguments with the values that we want to pass to the script

            psi.UseShellExecute = false; ;
            psi.CreateNoWindow = true;
            psi.RedirectStandardOutput = true;
            psi.RedirectStandardError = true;

            var process = Process.Start(psi);
            var results = process.StandardOutput.ReadToEnd();
            return Convert.ToInt32(results); // In this case we return the value that we read in int format

        }
        public double[] readXYZ(double angle1, double angle2, double angle3, double angle4, double angle5)
        {
            var psi = new ProcessStartInfo();

            psi.FileName = @"/usr/bin/python3";
            var script = @"/home/dofbot/Dofbot/3.ctrl_Arm/dofbot.py";
            var func = "readXYZ";

            psi.Arguments = $"\"{script}\" \"{func}\" \"{angle1}\" \"{angle2}\" \"{angle3}\" \"{angle4}\" \"{angle5}\"";

            psi.UseShellExecute = false; ;
            psi.CreateNoWindow = true;
            psi.RedirectStandardOutput = true;
            psi.RedirectStandardError = true;

            var process = Process.Start(psi);
            var results = process.StandardOutput.ReadToEnd();

            // Similar to readServo, but in this case we have multiple values that we read
            // We need to split and convert each one of them to an array of ints

            char[] delimiterChars = { '\r', '\n' };
            string[] words = results.Split(delimiterChars);

            words = words.Where(w => w != words[3]).ToArray();

            double[] doubles = words.Select(x => double.Parse(x)).ToArray();

            return doubles;
        }

    }
}
