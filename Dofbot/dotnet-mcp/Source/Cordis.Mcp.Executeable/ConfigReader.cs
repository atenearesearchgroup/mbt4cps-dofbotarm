using System;
using System.Xml;
using Cordis.Mcp.Generic.Services.MessageManager;

namespace Cordis.Mcp.Executable
{
    class ConfigReader
    {
        private static ConfigReader _instance;

        public static ConfigReader Instance
        {
            get
            {
                if (_instance == null)
                {
                    _instance = new ConfigReader();
                }

                return _instance;
            }
        }

        public bool Read(string filepath)
        {
            bool success = true;

            try
            {
                XmlDocument doc = new XmlDocument();
                doc.Load(filepath);
                var children = doc.FirstChild.ChildNodes;

                foreach (XmlNode child in children)
                {
                    foreach (XmlNode subChild in child.ChildNodes)
                    {
                        if (child.Name == "OpcSettings")
                        {
                            switch (subChild.Name)
                            {
                                case "InstanceNamespace":
                                    InstanceNamespace = subChild.InnerXml;
                                    break;
                                case "TypeNamespace":
                                    TypeNamespace = subChild.InnerXml;
                                    break;
                                case "OpcAddress":
                                    OpcAddress = subChild.InnerXml;
                                    break;
                                case "Port":
                                    OpcPort = subChild.InnerXml;
                                    break;
                                case "ServerName":
                                    ServerName = subChild.InnerXml;
                                    break;
                                default:
                                    break;
                            }
                        }
                        else if (child.Name == "MqttSettings")
                        {
                            switch (subChild.Name)
                            {
                                case "IpAddress":
                                    MqttAddress = subChild.InnerXml;
                                    break;
                                case "Port":
                                    MqttPort = subChild.InnerXml;
                                    break;
                                default:
                                    break;
                            }
                        }
                    }
                }
            }
            catch (Exception ex)
            {
                success = false;
                CMessageManager.Singleton.LogFatal("Reading file failed (" + ex.ToString() + ")");
            }

            return success;
        }

        public string OpcAddress { get; private set; }
        public string OpcPort { get; private set; }
        public string ServerName { get; private set; }
        public string InstanceNamespace { get; private set; }
        public string TypeNamespace { get; private set; }

        public string MqttAddress { get; private set; }
        public string MqttPort { get; private set; }
    }
}
