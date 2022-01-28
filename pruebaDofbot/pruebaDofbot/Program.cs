﻿using System;
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

            int time1 = dof.rotateAllServos(90, 90, 90, 90, 90, 90, 2000);
            Console.WriteLine(time1);
            
            double[] array = new double[6] { 90, 130, 0, 0, 270, 60 };
            int time2 = dof.rotateAllServosArray(array, 3000);
            Console.WriteLine(time2);

            int time3 = dof.distGrip(4, 1500);
            Console.WriteLine(time3);

            int time4 = dof.rotateServo(6, 180, 1000);
            Console.WriteLine(time4);
            
        }
    }
}
