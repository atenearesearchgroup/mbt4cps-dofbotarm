using Cordis.Mcp.Application;
using Cordis.Mcp.Generic.Services;
using Cordis.Mcp.Generic.Utilities;
using System.Diagnostics;
using System;
using Cordis.Mcp.Generic.Interfaces;
using Cordis.Mcp.Server;
using Cordis.Mcp.MqttClient;

namespace Cordis.Mcp.Executable
{
    class Runner
    {
        private ServerWrapper _server = null;
        private IMachinePart _machine = null;
        private Client _client = null;

        public Runner()
        {        
        }

        public bool Init()
        {
            var success = ConfigReader.Instance.Read("Settings.xml");

            try
            {
                Process.GetCurrentProcess().PriorityClass = Utility.ProcessPriority;
                McpApplication.InitApplication(ConfigReader.Instance.OpcAddress);
                var mcpServices = Services.Singleton;
                _machine = mcpServices.MachinePartManager.GetMachine();
            }
            catch (Exception ex)
            {
                Console.WriteLine("Exception while starting the controller.\n\nError Message: " + ex.Message);
                Console.ReadKey();
                success = false;
            }

            return success;
        }

        public void Start()
        {
            if (_server == null)
            {
                try
                {
                    // Create the OPC UA server, even when _machine == null, because it can be used for supplying a license.
                    Config config = new Config(ConfigReader.Instance.OpcAddress, ConfigReader.Instance.OpcPort, ConfigReader.Instance.ServerName, ConfigReader.Instance.InstanceNamespace, ConfigReader.Instance.TypeNamespace);
                    _server = new ServerWrapper(_machine, config);
                    _server.Start();

                    if (_machine != null)
                    {
                        // Create the MQTT client
                        _client = new Client(_machine, ConfigReader.Instance.MqttAddress, ConfigReader.Instance.MqttPort);
                        _client.Init();
                    }
                }
                catch (Exception ex)
                {
                    _server = null;
                    throw ex;
                }
            }
        }

        public void Stop()
        {
            if (_server != null)
            {
                _server.Stop();
                _server = null;
            }
        }
    }
}
