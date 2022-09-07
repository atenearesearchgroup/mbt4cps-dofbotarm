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
//           File %name: Arm.cs %
//             %version:  %
//        %date_created:  %
//          %created_by:  %
//
////////////////////////////////////////////////////////////////////////////////
#endregion

//  Class info extracted from Model                                 
// 
//  Children:
//     ArmOperations                                                 
//     MiddleServo : Servos                                          
//     WristServo : Servos                                           
//     UpperServo : Servos                                           
//     LowerServo : Servos                                           
//     BaseServo : Servos                                            
//     Camera                                                        
// 
//  Used MachineParts:
//     No Used MachineParts defined
// 
//   Commands:
//     rotateAllServos                                               
//     readAllServos                                                 
//     cameraColor                                                   
//     isAt                                                          
//     wait                                                          
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

namespace Cordis.Machine
{
    [Serializable]
    public class Arm : MachinePart
    {

#region Enumerations
        public enum CommandId
        {
            rotateAllServos = 21,
            readAllServos = 22,
            cameraColor = 23,
            isAt = 24,
            wait = 25,
        }

        public enum ArgumentId
        {
            rotateAllServosArgangle1 = 2100,
            rotateAllServosArgangle2 = 2101,
            rotateAllServosArgangle3 = 2102,
            rotateAllServosArgangle4 = 2103,
            rotateAllServosArgangle5 = 2104,
            rotateAllServosArgangle6 = 2105,
            rotateAllServosArgaTime = 2106,
            cameraColorArgaTime = 2300,
            isAtArgangle1isAt = 2400,
            isAtArgangle2isAt = 2401,
            isAtArgangle3isAt = 2402,
            isAtArgangle4isAt = 2403,
            isAtArgangle5isAt = 2404,
            isAtArgangle6isAt = 2405,
            isAtArgangle_res = 2406,
            waitArgaTime = 2500,
        }

#endregion // Enumerations

#region Child guarding
#endregion // Child guarding

#region Children and used machineparts
        // Children
        public enum ChildId
        {
            Camera,
            BaseServo,
            LowerServo,
            UpperServo,
            WristServo,
            MiddleServo,
            ArmOperations,
        }

        public Camera Camera;
        public Servos BaseServo;
        public Servos LowerServo;
        public Servos UpperServo;
        public Servos WristServo;
        public Servos MiddleServo;
        public ArmOperations ArmOperations;

        protected override void PublishChildren()
        {
            PublishChild(ChildId.Camera, Camera, "Camera");
            PublishChild(ChildId.BaseServo, BaseServo, "BaseServo");
            PublishChild(ChildId.LowerServo, LowerServo, "LowerServo");
            PublishChild(ChildId.UpperServo, UpperServo, "UpperServo");
            PublishChild(ChildId.WristServo, WristServo, "WristServo");
            PublishChild(ChildId.MiddleServo, MiddleServo, "MiddleServo");
            PublishChild(ChildId.ArmOperations, ArmOperations, "ArmOperations");
        }
#endregion // Children and used machineparts

#region InitPre / InitPost
        protected override void InitPre()
        {
            // Instantiate complex members

            // Create the children, unless they were already created during deserialization of <Database.xml>
            if (Camera == null) { Camera = new Camera(); }
            if (BaseServo == null) { BaseServo = new Servos(); }
            if (LowerServo == null) { LowerServo = new Servos(); }
            if (UpperServo == null) { UpperServo = new Servos(); }
            if (WristServo == null) { WristServo = new Servos(); }
            if (MiddleServo == null) { MiddleServo = new Servos(); }
            if (ArmOperations == null) { ArmOperations = new ArmOperations(); }
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
            obs_MachinePartHash.Value = 1732904;
        }
#endregion // Observers

#region IO Points
#endregion // IO Points

#region Commands
        private Command cmd_rotateAllServos;
        private Command cmd_readAllServos;
        private Command cmd_cameraColor;
        private Command cmd_isAt;
        private Command cmd_wait;

        // Arguments
        public SettingDouble rotateAllServosArgangle1;
        private double rotateAllServos_angle1;
        public SettingDouble rotateAllServosArgangle2;
        private double rotateAllServos_angle2;
        public SettingDouble rotateAllServosArgangle3;
        private double rotateAllServos_angle3;
        public SettingDouble rotateAllServosArgangle4;
        private double rotateAllServos_angle4;
        public SettingDouble rotateAllServosArgangle5;
        private double rotateAllServos_angle5;
        public SettingDouble rotateAllServosArgangle6;
        private double rotateAllServos_angle6;
        public SettingInt rotateAllServosArgaTime;
        private int rotateAllServos_aTime;
        public SettingInt cameraColorArgaTime;
        private int cameraColor_aTime;
        public SettingDouble isAtArgangle1isAt;
        private double isAt_angle1isAt;
        public SettingDouble isAtArgangle2isAt;
        private double isAt_angle2isAt;
        public SettingDouble isAtArgangle3isAt;
        private double isAt_angle3isAt;
        public SettingDouble isAtArgangle4isAt;
        private double isAt_angle4isAt;
        public SettingDouble isAtArgangle5isAt;
        private double isAt_angle5isAt;
        public SettingDouble isAtArgangle6isAt;
        private double isAt_angle6isAt;
        public SettingDouble isAtArgangle_res;
        private double isAt_angle_res;
        public SettingInt waitArgaTime;
        private int wait_aTime;

        // MCP Command Publication
        protected override void PublishCommands()
        {
            cmd_rotateAllServos = PublishCommand(CommandId.rotateAllServos, "rotateAllServos", HmirotateAllServos, 0);
                rotateAllServosArgangle1 = PublishCommandArgDouble(cmd_rotateAllServos, ArgumentId.rotateAllServosArgangle1, "angle1", 0, 0, 180, "", "");
                rotateAllServosArgangle2 = PublishCommandArgDouble(cmd_rotateAllServos, ArgumentId.rotateAllServosArgangle2, "angle2", 0, 0, 180, "", "");
                rotateAllServosArgangle3 = PublishCommandArgDouble(cmd_rotateAllServos, ArgumentId.rotateAllServosArgangle3, "angle3", 0, 0, 180, "", "");
                rotateAllServosArgangle4 = PublishCommandArgDouble(cmd_rotateAllServos, ArgumentId.rotateAllServosArgangle4, "angle4", 0, 0, 180, "", "");
                rotateAllServosArgangle5 = PublishCommandArgDouble(cmd_rotateAllServos, ArgumentId.rotateAllServosArgangle5, "angle5", 0, 0, 270, "", "");
                rotateAllServosArgangle6 = PublishCommandArgDouble(cmd_rotateAllServos, ArgumentId.rotateAllServosArgangle6, "angle6", 0, 0, 180, "", "");
                rotateAllServosArgaTime = PublishCommandArgInt(cmd_rotateAllServos, ArgumentId.rotateAllServosArgaTime, "aTime", 0, 0, 100000, "", "");

            cmd_readAllServos = PublishCommand(CommandId.readAllServos, "readAllServos", HmireadAllServos, 0);
            cmd_cameraColor = PublishCommand(CommandId.cameraColor, "cameraColor", HmicameraColor, 0);
                cameraColorArgaTime = PublishCommandArgInt(cmd_cameraColor, ArgumentId.cameraColorArgaTime, "aTime", 1000, 1000, 100000, "", "");

            cmd_isAt = PublishCommand(CommandId.isAt, "isAt", HmiisAt, 0);
                isAtArgangle1isAt = PublishCommandArgDouble(cmd_isAt, ArgumentId.isAtArgangle1isAt, "angle1isAt", 0, 0, 180, "", "");
                isAtArgangle2isAt = PublishCommandArgDouble(cmd_isAt, ArgumentId.isAtArgangle2isAt, "angle2isAt", 0, 0, 180, "", "");
                isAtArgangle3isAt = PublishCommandArgDouble(cmd_isAt, ArgumentId.isAtArgangle3isAt, "angle3isAt", 0, 0, 180, "", "");
                isAtArgangle4isAt = PublishCommandArgDouble(cmd_isAt, ArgumentId.isAtArgangle4isAt, "angle4isAt", 0, 0, 180, "", "");
                isAtArgangle5isAt = PublishCommandArgDouble(cmd_isAt, ArgumentId.isAtArgangle5isAt, "angle5isAt", 0, 0, 270, "", "");
                isAtArgangle6isAt = PublishCommandArgDouble(cmd_isAt, ArgumentId.isAtArgangle6isAt, "angle6isAt", 0, 0, 180, "", "");
                isAtArgangle_res = PublishCommandArgDouble(cmd_isAt, ArgumentId.isAtArgangle_res, "angle_res", 0, 0, 0, "", "");

            cmd_wait = PublishCommand(CommandId.wait, "wait", Hmiwait, 0);
                waitArgaTime = PublishCommandArgInt(cmd_wait, ArgumentId.waitArgaTime, "aTime", 0, 0, 100000, "", "");

        }
#endregion // Commands

#endregion // Private members

#region Public properties
#endregion // Public properties

#region Constructors
        /// <summary>
        /// Default constructor (needed for deserialization)
        /// </summary>
        public Arm() : base()
        {
        }
#endregion // Constructors

#region Public methods
        //------------------------------------------------------
        //  Public Methods
        //------------------------------------------------------

        //======================================================================
        //  Command "rotateAllServos"
        //======================================================================
        /// <summary>
        /// rotateAllServos
        /// </summary>
        /// <returns>
        /// </returns>

        // Do not call this function, for use by HMI only
        public bool HmirotateAllServos()
        {
            bool result = true;
            bool ack = true;

            // Copy the arguments from those set in the HMI
            rotateAllServos_angle1 = (double)rotateAllServosArgangle1.Value;
            rotateAllServos_angle2 = (double)rotateAllServosArgangle2.Value;
            rotateAllServos_angle3 = (double)rotateAllServosArgangle3.Value;
            rotateAllServos_angle4 = (double)rotateAllServosArgangle4.Value;
            rotateAllServos_angle5 = (double)rotateAllServosArgangle5.Value;
            rotateAllServos_angle6 = (double)rotateAllServosArgangle6.Value;
            rotateAllServos_aTime = (int)rotateAllServosArgaTime.Value;

            if (ack)
            {
                // Launch the command via the command executor
                CommandExecutor.CommandId = (int)(CommandId.rotateAllServos);
            }
            return result;
        }

        public bool CmdrotateAllServos(double angle1 = 0, double angle2 = 0, double angle3 = 0, double angle4 = 0, double angle5 = 0, double angle6 = 0, int aTime = 0)
        {
            bool result = true;
            bool ack = true;

            // Copy the arguments from those set in the method call
            rotateAllServos_angle1 = angle1;
            rotateAllServos_angle2 = angle2;
            rotateAllServos_angle3 = angle3;
            rotateAllServos_angle4 = angle4;
            rotateAllServos_angle5 = angle5;
            rotateAllServos_angle6 = angle6;
            rotateAllServos_aTime = aTime;

            if (ack)
            {
                // Launch the command via the command executor
                CommandExecutor.CommandId = (int)(CommandId.rotateAllServos);
            }
            return result;
        }

        //======================================================================
        //  Command "readAllServos"
        //======================================================================
        /// <summary>
        /// readAllServos
        /// </summary>
        /// <returns>
        /// </returns>

        // Do not call this function, for use by HMI only
        public bool HmireadAllServos()
        {
            bool result = true;
            bool ack = true;

            if (ack)
            {
                // Launch the command via the command executor
                CommandExecutor.CommandId = (int)(CommandId.readAllServos);
            }
            return result;
        }

        public bool CmdreadAllServos()
        {
            bool result = true;
            bool ack = true;

            if (ack)
            {
                // Launch the command via the command executor
                CommandExecutor.CommandId = (int)(CommandId.readAllServos);
            }
            return result;
        }

        //======================================================================
        //  Command "cameraColor"
        //======================================================================
        /// <summary>
        /// cameraColor
        /// </summary>
        /// <returns>
        /// </returns>

        // Do not call this function, for use by HMI only
        public bool HmicameraColor()
        {
            bool result = true;
            bool ack = true;

            // Copy the arguments from those set in the HMI
            cameraColor_aTime = (int)cameraColorArgaTime.Value;

            if (ack)
            {
                // Launch the command via the command executor
                CommandExecutor.CommandId = (int)(CommandId.cameraColor);
            }
            return result;
        }

        public bool CmdcameraColor(int aTime = 1000)
        {
            bool result = true;
            bool ack = true;

            // Copy the arguments from those set in the method call
            cameraColor_aTime = aTime;

            if (ack)
            {
                // Launch the command via the command executor
                CommandExecutor.CommandId = (int)(CommandId.cameraColor);
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
            isAt_angle1isAt = (double)isAtArgangle1isAt.Value;
            isAt_angle2isAt = (double)isAtArgangle2isAt.Value;
            isAt_angle3isAt = (double)isAtArgangle3isAt.Value;
            isAt_angle4isAt = (double)isAtArgangle4isAt.Value;
            isAt_angle5isAt = (double)isAtArgangle5isAt.Value;
            isAt_angle6isAt = (double)isAtArgangle6isAt.Value;
            isAt_angle_res = (double)isAtArgangle_res.Value;

            if (ack)
            {
                // Launch the command via the command executor
                CommandExecutor.CommandId = (int)(CommandId.isAt);
            }
            return result;
        }

        public bool CmdisAt(double angle1isAt = 0, double angle2isAt = 0, double angle3isAt = 0, double angle4isAt = 0, double angle5isAt = 0, double angle6isAt = 0, double angle_res = 0)
        {
            bool result = true;
            bool ack = true;

            // Copy the arguments from those set in the method call
            isAt_angle1isAt = angle1isAt;
            isAt_angle2isAt = angle2isAt;
            isAt_angle3isAt = angle3isAt;
            isAt_angle4isAt = angle4isAt;
            isAt_angle5isAt = angle5isAt;
            isAt_angle6isAt = angle6isAt;
            isAt_angle_res = angle_res;

            if (ack)
            {
                // Launch the command via the command executor
                CommandExecutor.CommandId = (int)(CommandId.isAt);
            }
            return result;
        }

        //======================================================================
        //  Command "wait"
        //======================================================================
        /// <summary>
        /// wait
        /// </summary>
        /// <returns>
        /// </returns>

        // Do not call this function, for use by HMI only
        public bool Hmiwait()
        {
            bool result = true;
            bool ack = true;

            // Copy the arguments from those set in the HMI
            wait_aTime = (int)waitArgaTime.Value;

            if (ack)
            {
                // Launch the command via the command executor
                CommandExecutor.CommandId = (int)(CommandId.wait);
            }
            return result;
        }

        public bool Cmdwait(int aTime = 0)
        {
            bool result = true;
            bool ack = true;

            // Copy the arguments from those set in the method call
            wait_aTime = aTime;

            if (ack)
            {
                // Launch the command via the command executor
                CommandExecutor.CommandId = (int)(CommandId.wait);
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
        /// The cyclic method for Arm.
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
                //  Command "rotateAllServos"
                //==============================================================
                case (int)(CommandId.rotateAllServos):

                    switch (CommandExecutor.ExecutionState)
                    {
                        case 1:
                            // Actions on entry
                            if (CommandExecutor.OnExecutionStateChanged)
                            {
                                ArmOperations.rotateAllServosOperation(rotateAllServos_angle1, rotateAllServos_angle2, rotateAllServos_angle3, rotateAllServos_angle4, rotateAllServos_angle5, rotateAllServos_angle6, rotateAllServos_aTime);
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
                //  Command "readAllServos"
                //==============================================================
                case (int)(CommandId.readAllServos):

                    switch (CommandExecutor.ExecutionState)
                    {
                        case 1:
                            // Actions on entry
                            if (CommandExecutor.OnExecutionStateChanged)
                            {
                                ArmOperations.readAllServosOperation();
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
                //  Command "cameraColor"
                //==============================================================
                case (int)(CommandId.cameraColor):

                    switch (CommandExecutor.ExecutionState)
                    {
                        case 1:
                            // Actions on entry
                            if (CommandExecutor.OnExecutionStateChanged)
                            {
                                ArmOperations.cameraColorOperation(cameraColor_aTime);
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
                                ArmOperations.isAtOperation(isAt_angle1isAt, isAt_angle2isAt, isAt_angle3isAt, isAt_angle4isAt, isAt_angle5isAt, isAt_angle6isAt, isAt_angle_res);
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
                //  Command "wait"
                //==============================================================
                case (int)(CommandId.wait):

                    switch (CommandExecutor.ExecutionState)
                    {
                        case 1:
                            // Actions on entry
                            if (CommandExecutor.OnExecutionStateChanged)
                            {
                                ArmOperations.waitOperation(wait_aTime);
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
