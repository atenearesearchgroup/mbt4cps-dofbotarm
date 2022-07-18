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
//           File %name: Servos.cs %
//             %version:  %
//        %date_created:  %
//          %created_by:  %
//
////////////////////////////////////////////////////////////////////////////////
#endregion

//  Class info extracted from Model                                 
// 
//  Children:
//     ServosOperations : ServoOperations                            
// 
//  Used MachineParts:
//     No Used MachineParts defined
// 
//   Commands:
//     rotateServo                                                   
//     readServo                                                     
//     isAt                                                          
// 
//   Methods:
//     No Methods defined
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
    public class Servos : MachinePart
    {

#region Enumerations
        public enum CommandId
        {
            rotateServo = 21,
            readServo = 22,
            isAt = 23,
        }

        public enum ArgumentId
        {
            rotateServoArgid = 2100,
            rotateServoArgangle = 2101,
            rotateServoArgaTime = 2102,
            readServoArgid = 2200,
            isAtArgid = 2300,
            isAtArgangle = 2301,
            isAtArgangle_res = 2302,
        }

#endregion // Enumerations

#region Child guarding
#endregion // Child guarding

#region Children and used machineparts
        // Children
        public enum ChildId
        {
            ServosOperations,
        }

        public ServoOperations ServosOperations;

        protected override void PublishChildren()
        {
            PublishChild(ChildId.ServosOperations, ServosOperations, "ServosOperations");
        }
#endregion // Children and used machineparts

#region InitPre / InitPost
        protected override void InitPre()
        {
            // Instantiate complex members

            // Create the children, unless they were already created during deserialization of <Database.xml>
            if (ServosOperations == null) { ServosOperations = new ServoOperations(); }
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
            obs_MachinePartHash.Value = 907086;
        }
#endregion // Observers

#region IO Points
#endregion // IO Points

#region Commands
        private Command cmd_rotateServo;
        private Command cmd_readServo;
        private Command cmd_isAt;

        // Arguments
        public SettingInt rotateServoArgid;
        private int rotateServo_id;
        public SettingDouble rotateServoArgangle;
        private double rotateServo_angle;
        public SettingInt rotateServoArgaTime;
        private int rotateServo_aTime;
        public SettingInt readServoArgid;
        private int readServo_id;
        public SettingInt isAtArgid;
        private int isAt_id;
        public SettingDouble isAtArgangle;
        private double isAt_angle;
        public SettingDouble isAtArgangle_res;
        private double isAt_angle_res;

        // MCP Command Publication
        protected override void PublishCommands()
        {
            cmd_rotateServo = PublishCommand(CommandId.rotateServo, "rotateServo", HmirotateServo, 0);
                rotateServoArgid = PublishCommandArgInt(cmd_rotateServo, ArgumentId.rotateServoArgid, "id", 1, 1, 6, "", "");
                rotateServoArgangle = PublishCommandArgDouble(cmd_rotateServo, ArgumentId.rotateServoArgangle, "angle", 0, 0, 180, "", "");
                rotateServoArgaTime = PublishCommandArgInt(cmd_rotateServo, ArgumentId.rotateServoArgaTime, "aTime", 0, 0, 100000, "", "");

            cmd_readServo = PublishCommand(CommandId.readServo, "readServo", HmireadServo, 0);
                readServoArgid = PublishCommandArgInt(cmd_readServo, ArgumentId.readServoArgid, "id", 1, 1, 6, "", "");

            cmd_isAt = PublishCommand(CommandId.isAt, "isAt", HmiisAt, 0);
                isAtArgid = PublishCommandArgInt(cmd_isAt, ArgumentId.isAtArgid, "id", 1, 1, 6, "", "");
                isAtArgangle = PublishCommandArgDouble(cmd_isAt, ArgumentId.isAtArgangle, "angle", 0, 0, 270, "", "");
                isAtArgangle_res = PublishCommandArgDouble(cmd_isAt, ArgumentId.isAtArgangle_res, "angle_res", 0, 0, 0, "", "");

        }
#endregion // Commands

#endregion // Private members

#region Public properties
#endregion // Public properties

#region Constructors
        /// <summary>
        /// Default constructor (needed for deserialization)
        /// </summary>
        public Servos() : base()
        {
        }
#endregion // Constructors

#region Public methods
        //------------------------------------------------------
        //  Public Methods
        //------------------------------------------------------

        //======================================================================
        //  Command "rotateServo"
        //======================================================================
        /// <summary>
        /// rotateServo
        /// </summary>
        /// <returns>
        /// </returns>

        // Do not call this function, for use by HMI only
        public bool HmirotateServo()
        {
            bool result = true;
            bool ack = true;

            // Copy the arguments from those set in the HMI
            rotateServo_id = (int)rotateServoArgid.Value;
            rotateServo_angle = (double)rotateServoArgangle.Value;
            rotateServo_aTime = (int)rotateServoArgaTime.Value;

            if (ack)
            {
                // Launch the command via the command executor
                CommandExecutor.CommandId = (int)(CommandId.rotateServo);
            }
            return result;
        }

        public bool CmdrotateServo(int id = 1, double angle = 0, int aTime = 0)
        {
            bool result = true;
            bool ack = true;

            // Copy the arguments from those set in the method call
            rotateServo_id = id;
            rotateServo_angle = angle;
            rotateServo_aTime = aTime;

            if (ack)
            {
                // Launch the command via the command executor
                CommandExecutor.CommandId = (int)(CommandId.rotateServo);
            }
            return result;
        }

        //======================================================================
        //  Command "readServo"
        //======================================================================
        /// <summary>
        /// readServo
        /// </summary>
        /// <returns>
        /// </returns>

        // Do not call this function, for use by HMI only
        public bool HmireadServo()
        {
            bool result = true;
            bool ack = true;

            // Copy the arguments from those set in the HMI
            readServo_id = (int)readServoArgid.Value;

            if (ack)
            {
                // Launch the command via the command executor
                CommandExecutor.CommandId = (int)(CommandId.readServo);
            }
            return result;
        }

        public bool CmdreadServo(int id = 1)
        {
            bool result = true;
            bool ack = true;

            // Copy the arguments from those set in the method call
            readServo_id = id;

            if (ack)
            {
                // Launch the command via the command executor
                CommandExecutor.CommandId = (int)(CommandId.readServo);
            }
            return result;
        }

        //======================================================================
        //  Command "isAt"
        //======================================================================
        /// <summary>
        /// isAt
        /// </summary>
        /// <returns>
        /// </returns>

        // Do not call this function, for use by HMI only
        public bool HmiisAt()
        {
            bool result = true;
            bool ack = true;

            // Copy the arguments from those set in the HMI
            isAt_id = (int)isAtArgid.Value;
            isAt_angle = (double)isAtArgangle.Value;
            isAt_angle_res = (double)isAtArgangle_res.Value;

            if (ack)
            {
                // Launch the command via the command executor
                CommandExecutor.CommandId = (int)(CommandId.isAt);
            }
            return result;
        }

        public bool CmdisAt(int id = 1, double angle = 0, double angle_res = 0)
        {
            bool result = true;
            bool ack = true;

            // Copy the arguments from those set in the method call
            isAt_id = id;
            isAt_angle = angle;
            isAt_angle_res = angle_res;

            if (ack)
            {
                // Launch the command via the command executor
                CommandExecutor.CommandId = (int)(CommandId.isAt);
            }
            return result;
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
        /// The cyclic method for Servos.
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
                //  Command "rotateServo"
                //==============================================================
                case (int)(CommandId.rotateServo):

                    switch (CommandExecutor.ExecutionState)
                    {
                        case 1:
                            // Actions on entry
                            if (CommandExecutor.OnExecutionStateChanged)
                            {
                                ServosOperations.rotateServoOperation( rotateServo_id, rotateServo_angle, rotateServo_aTime);
                            }

                            // Transitions
                            if (!CommandExecutor.OnExecutionStateChanged)
                            {
                                CommandExecutor.ExecutionState = CMD_EXE_FINAL_STATE;
                            }
                            break;

                        default:
                            break;
                    }
                    break;

                //==============================================================
                //  Command "readServo"
                //==============================================================
                case (int)(CommandId.readServo):

                    switch (CommandExecutor.ExecutionState)
                    {
                        case 1:
                            // Actions on entry
                            if (CommandExecutor.OnExecutionStateChanged)
                            {
                                ServosOperations.readServoOperation( readServo_id);
                            }

                            // Transitions
                            if (!CommandExecutor.OnExecutionStateChanged)
                            {
                                CommandExecutor.ExecutionState = CMD_EXE_FINAL_STATE;
                            }
                            break;

                        default:
                            break;
                    }
                    break;

                //==============================================================
                //  Command "isAt"
                //==============================================================
                case (int)(CommandId.isAt):

                    switch (CommandExecutor.ExecutionState)
                    {
                        case 1:
                            // Actions on entry
                            if (CommandExecutor.OnExecutionStateChanged)
                            {
                                ServosOperations.isAtSingleOperation( isAt_id, isAt_angle, isAt_angle_res);
                            }

                            // Transitions
                            if (!CommandExecutor.OnExecutionStateChanged)
                            {
                                CommandExecutor.ExecutionState = CMD_EXE_FINAL_STATE;
                            }
                            break;

                        default:
                            break;
                    }
                    break;

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
