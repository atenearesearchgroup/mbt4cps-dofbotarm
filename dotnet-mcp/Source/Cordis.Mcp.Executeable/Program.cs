using System;
using System.Threading;

namespace Cordis.Mcp.Executable
{
    static class Program
    {
        /// <summary>
        /// The main entry point for the application.
        /// </summary>
        [STAThread]
        static void Main()
        {
            Runner runner = new Runner();
            if (runner.Init())
            {
                runner.Start();
            }
        }
    }
}
