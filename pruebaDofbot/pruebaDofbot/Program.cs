using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using dofbotArm;

namespace pruebaDofbot
{
    class Program
    {
        static void Main(string[] args)
        {

            Dofbot dof = new Dofbot();
            
            // Turn on the red led
            string color1 = dof.lightRGB(255, 0, 0);
            Console.WriteLine(color1);


            // Multiple servo movement example
            int time1 = dof.rotateAllServos(90, 90, 90, 90, 90, 90, 1500);
            Thread.Sleep(time1);


            // Reading of all the values of the servos
            double[] res1 = dof.readAllServos();

            foreach (var word in res1)
            {
                Console.WriteLine($"{word}");
            }


            // Turn on the green led
            string color2 = dof.lightRGB(0, 255, 0);
            Console.WriteLine(color2);


            // Multiple servo movement with an array of values
            double[] array = new double[6] { 90, 130, 0, 0, 270, 60 };
            int time2 = dof.rotateAllServosArray(array, 1500);
            Thread.Sleep(time2);


            // Reading of all the values of the servos
            double[] res2 = dof.readAllServos();

            foreach (var word in res2)
            {
                Console.WriteLine($"{word}");
            }


            // Turn on the blue led
            string color3 = dof.lightRGB(0, 0, 255);
            Console.WriteLine(color3);


            // Close grip to a given distance
            int time3 = dof.distGrip(4, 1500);
            Thread.Sleep(time3);


            // Reading the value of a single servo
            double res3 = dof.readServo(6);
            Console.WriteLine(res3);


            // Turn on the white led
            string color4 = dof.lightRGB(255, 255, 255);
            Console.WriteLine(color4);


            // Single servo movement example
            int time4 = dof.rotateServo(6, 145, 1500);
            Thread.Sleep(time4);


            // Reading the value of a single servo
            double res4 = dof.readServo(6);
            Console.WriteLine(res4);


            // Turn on the yellow led
            string color5 = dof.lightRGB(255, 255, 0);
            Console.WriteLine(color5);


            // Move to X,Y,Z position
            int time5 = dof.moveToXYZ(18, 6, 16, 1500);
            Thread.Sleep(time5);


            // Turn off the led
            string color6 = dof.lightRGB(0, 0, 0);
            Console.WriteLine(color6);


            // Read the X,Y,Z position
            double[] res8 = dof.readXYZ(90, 90, 90, 90, 90);

            foreach (var word in res8)
            {
                Console.WriteLine($"{word}");
            }


        }
    }
}
