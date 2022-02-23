using System;
using System.Collections.Generic;
using System.Diagnostics;
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


            bool res = dof.isAt(90, 130, 0, 0, 270, 60, 2);

            Console.WriteLine(res);




            /*
            double[] servos = dof.readTime();

            foreach (double word in servos)
            {
                Console.WriteLine($"{word}");
            }
            


            
            var timer = new Stopwatch();
            
            int time = dof.rotateAllServos(90, 90, 0, 90, 90, 90, 10000);

            timer.Start();

            while (timer.Elapsed.TotalSeconds < 10)
            {
                double[] servos = dof.readAllServos();

                foreach (double word in servos)
                {
                    Console.WriteLine($"{word}");
                }
                Console.WriteLine();

            }
            timer.Stop();

            Console.WriteLine(time);

            dof.rotateAllServos(90, 90, 90, 90, 90, 90, 2000);







           
            dof.colorConfiguration("green", 0, 5, 0, 0, 0, 6);
            dof.colorConfiguration("blue", 86, 156, 0, 131, 255, 216);
            

            dof.deleteColor("red");
            


            
            int time1 = dof.rotateAllServos(90, 90, 90, 90, 90, 90, 2000);
            Console.WriteLine(time1);
            
            double[] array = new double[6] { 90, 130, 0, 0, 270, 60 };
            int time2 = dof.rotateAllServosArray(array, 3000);
            Console.WriteLine(time2);

            int time3 = dof.distGrip(4, 1500);
            Console.WriteLine(time3);

            int time4 = dof.rotateServo(6, 180, 1000);
            Console.WriteLine(time4);
            
            double servo = dof.readServo(4);
            Console.WriteLine(servo);

            double[] servos = dof.readAllServos();

            foreach (double word in servos)
            {
                Console.WriteLine($"{word}");
            }

            int time5 = dof.cameraColor(10000);
            Console.WriteLine(time5);

            dof.lightRGB(0, 50, 0);

            int time6 = dof.readyPosition(1000);
            Console.WriteLine(time6);

            int time7 = dof.straightPosition(1000);
            Console.WriteLine(time7);

            */

        }
    }
}
