// CordisModeler generated file

#region (c) Copyright
////////////////////////////////////////////////////////////////////////////////
//
// Copyright (c) 2009-2022 Cordis Products B.V.
// All Rights Reserved.
//
// This source code and any compilation or derivative thereof is the
// proprietary information of Cordis Products B.V.
// and is confidential in nature.
// Under no circumstances is this software to be combined with any Open Source
// Software in any way or placed under an Open Source License of any type 
// without the express written permission of Cordis Products B.V.
// 
////////////////////////////////////////////////////////////////////////////////
//
//                   Cordis Products B.V.
//                 Machine Control Platform
//
////////////////////////////////////////////////////////////////////////////////
//
//           File %name: ArmOperations.cs %
//             %version:  %
//        %date_created:  %
//          %created_by:  %
//
////////////////////////////////////////////////////////////////////////////////
#endregion

//  Class info extracted from Model                                 
// 
//  Children:
//     No Children defined
// 
//  Used MachineParts:
//     No Used MachineParts defined
// 
//   Commands:
//     No Commands defined
// 
//   Methods:
//     rotateAllServosOperation                                      
//     readAllServosOperation                                        
//     cameraColorOperation                                          
//     isAtOperation                                                 
//     waitOperation                                                 
// 
//   Settings:
//     No Settings defined
// 
//   Messages:
//     No Messages defined
// 
//   Variables:
//     No Variables defined
// 
//   Observers for:
//     MachinePartHash                                               
// 
//   Inputs:
//     No Inputs defined
// 
//   InputSignals:
//     No Inputs defined
// 
//   Outputs:
//     No Outputs defined
// 
//   OutputSignals:
//     No Outputs defined
// 
//   InOutSignals:
//     No InOutSignals defined
// 
//   State machines:
//     No state machines defined
// 
//   Activities:
//     No Activities defined
// 
using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Xml.Serialization;
using System.Text;
using Cordis.Mcp.Generic.Engine;
using Cordis.Mcp.Generic.Interfaces;
using Cordis.Mcp.Generic.MachinePart;
using Cordis.Mcp.Generic.Services;
using Cordis.Mcp.Generic.Services.AuthorizationProvider;
using Cordis.Mcp.Generic.Services.CommandManager;
using Cordis.Mcp.Generic.Services.DataLogger;
using Cordis.Mcp.Generic.Services.ExperimentConductor;
using Cordis.Mcp.Generic.Services.IoManager;
using Cordis.Mcp.Generic.Services.MessageManager;
using Cordis.Mcp.Generic.Services.RecipeExecutor;
using Cordis.Mcp.Generic.Services.SettingManager;
using Cordis.Mcp.Generic.Services.VersionProvider;
using Cordis.Mcp.Generic.Utilities;
using Cordis.Mcp.Library;

using System.Threading;
using dofbotArm;

namespace Cordis.Machine
{
    [Serializable]
    public class ArmOperations : MachinePart
    {

#region Enumerations
        public enum CommandId
        {
        }

        public enum ArgumentId
        {
            rotateAllServosOperationArgangle1 = 2100,
            rotateAllServosOperationArgangle2 = 2101,
            rotateAllServosOperationArgangle3 = 2102,
            rotateAllServosOperationArgangle4 = 2103,
            rotateAllServosOperationArgangle5 = 2104,
            rotateAllServosOperationArgangle6 = 2105,
            rotateAllServosOperationArgaTime = 2106,
            cameraColorOperationArgaTime = 2300,
            isAtOperationArgangle1isAt = 2400,
            isAtOperationArgangle2isAt = 2401,
            isAtOperationArgangle3isAt = 2402,
            isAtOperationArgangle4isAt = 2403,
            isAtOperationArgangle5isAt = 2404,
            isAtOperationArgangle6isAt = 2405,
            isAtOperationArgangle_res = 2406,
            waitOperationArgaTime = 2500,
        }

#endregion // Enumerations

#region Child guarding
#endregion // Child guarding

#region Children and used machineparts
#endregion // Children and used machineparts

#region InitPre / InitPost
        protected override void InitPre()
        {
            // Instantiate complex members

            // Create the children, unless they were already created during deserialization of <Database.xml>
        }
#endregion // InitPre / InitPost

#region Private members

#region Messages
#endregion // Messages

#region Settings
#endregion // Settings

#region Variables

#endregion // Variables

#region Constants
#endregion // Constants

#region Observers
        public enum ObserverId
        {
            MachinePartHash = 1,
        }

        // Observers
        private ObserverInt obs_MachinePartHash;

        // MCP Observer Publications
        protected override void PublishObservers()
        {
            obs_MachinePartHash = PublishObserverInt(ObserverId.MachinePartHash, "MachinePartHash", "");
            obs_MachinePartHash.Value = 908285;
        }
#endregion // Observers

#region IO Points
#endregion // IO Points

#region Commands

        // Arguments
        public SettingDouble rotateAllServosOperationArgangle1;
        public SettingDouble rotateAllServosOperationArgangle2;
        public SettingDouble rotateAllServosOperationArgangle3;
        public SettingDouble rotateAllServosOperationArgangle4;
        public SettingDouble rotateAllServosOperationArgangle5;
        public SettingDouble rotateAllServosOperationArgangle6;
        public SettingInt rotateAllServosOperationArgaTime;
        public SettingInt cameraColorOperationArgaTime;
        public SettingDouble isAtOperationArgangle1isAt;
        public SettingDouble isAtOperationArgangle2isAt;
        public SettingDouble isAtOperationArgangle3isAt;
        public SettingDouble isAtOperationArgangle4isAt;
        public SettingDouble isAtOperationArgangle5isAt;
        public SettingDouble isAtOperationArgangle6isAt;
        public SettingDouble isAtOperationArgangle_res;
        public SettingInt waitOperationArgaTime;

        // MCP Command Publication
        protected override void PublishCommands()
        {
        }
#endregion // Commands

#endregion // Private members

#region Public properties
#endregion // Public properties

#region Constructors
        /// <summary>
        /// Default constructor (needed for deserialization)
        /// </summary>
        public ArmOperations() : base()
        {
        }
#endregion // Constructors

#region Public methods
        //------------------------------------------------------
        //  Public Methods
        //------------------------------------------------------

        public int rotateAllServosOperation(double angle1, double angle2, double angle3, double angle4, double angle5, double angle6, int aTime)
        {
            Dofbot dof = new Dofbot();
            return dof.rotateAllServos(angle1, angle2, angle3, angle4, angle5, angle6, aTime);
        }

        public double[] readAllServosOperation()
        {
            Dofbot dof = new Dofbot();
            double[] res = dof.readAllServos();
            return res;
        }

        public int cameraColorOperation(int aTime)
        {
            Dofbot dof = new Dofbot();
            return dof.cameraColor(aTime);
        }

        public bool isAtOperation(double angle1isAt, double angle2isAt, double angle3isAt, double angle4isAt, double angle5isAt, double angle6isAt, double angle_res)
        {
            Dofbot dof = new Dofbot();
            return dof.isAt(angle1isAt, angle2isAt, angle3isAt, angle4isAt, angle5isAt, angle6isAt, angle_res);
        }

        public void waitOperation(int aTime)
        {
            Thread.Sleep(aTime);
        }

#endregion // Public methods

#region Private methods
        //------------------------------------------------------
        //  Private Methods
        //------------------------------------------------------
#endregion // Private methods

#region Cyclic methods
        //**********************************************************************
        //  CYCLIC METHODS 
        //**********************************************************************
        /// <summary>
        /// Execute the code specified in PreStates.
        /// </summary>
        protected override void CyclicPrestep()
        {
        }

        /// <summary>
        /// The cyclic method for ArmOperations.
        /// </summary>
        protected override void Cyclic()
        {
#region Command execution
            //******************************************************************
            //  COMMAND EXECUTION
            //******************************************************************
            //  Commands finish at the moment of reaching the desired state.
            //******************************************************************

            switch (CommandExecutor.CommandId)
            {
                //==============================================================
                //  NoCommand
                //==============================================================
                case CMD_NO_COMMAND:
                    break;

                //==============================================================
                //  Unknown command
                //==============================================================
                default:
                    HandleUnknownCommand();
                    break;
            }
#endregion // Command execution

        }

        /// <summary>
        /// Execute the code specified in PostStates. It also updates the observers.
        /// </summary>
        protected override void CyclicPoststep()
        {
            // PostStates

            // Update observers
        }
#endregion // Cyclic methods

    }
}
