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
//           File %name: Camera.cs %
//             %version:  %
//        %date_created:  %
//          %created_by:  %
//
////////////////////////////////////////////////////////////////////////////////
#endregion

//  Class info extracted from Model                                 
// 
//  Children:
//     CameraOperations                                              
// 
//  Used MachineParts:
//     No Used MachineParts defined
// 
//   Commands:
//     cameraColor                                                   
//     calibration                                                   
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
    public class Camera : MachinePart
    {

#region Enumerations
        public enum CommandId
        {
            cameraColor = 21,
            calibration = 22,
        }

        public enum ArgumentId
        {
            cameraColorArgaTime = 2100,
            calibrationArgcolor = 2200,
            calibrationArgHmin = 2201,
            calibrationArgSmin = 2202,
            calibrationArgVmin = 2203,
            calibrationArgHmax = 2204,
            calibrationArgSmax = 2205,
            calibrationArgVmax = 2206,
        }

#endregion // Enumerations

#region Child guarding
#endregion // Child guarding

#region Children and used machineparts
        // Children
        public enum ChildId
        {
            CameraOperations,
        }

        public CameraOperations CameraOperations;

        protected override void PublishChildren()
        {
            PublishChild(ChildId.CameraOperations, CameraOperations, "CameraOperations");
        }
#endregion // Children and used machineparts

#region InitPre / InitPost
        protected override void InitPre()
        {
            // Instantiate complex members

            // Create the children, unless they were already created during deserialization of <Database.xml>
            if (CameraOperations == null) { CameraOperations = new CameraOperations(); }
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
            obs_MachinePartHash.Value = 946163;
        }
#endregion // Observers

#region IO Points
#endregion // IO Points

#region Commands
        private Command cmd_cameraColor;
        private Command cmd_calibration;

        // Arguments
        public SettingInt cameraColorArgaTime;
        private int cameraColor_aTime;
        public SettingString calibrationArgcolor;
        private String calibration_color;
        public SettingDouble calibrationArgHmin;
        private double calibration_Hmin;
        public SettingDouble calibrationArgSmin;
        private double calibration_Smin;
        public SettingDouble calibrationArgVmin;
        private double calibration_Vmin;
        public SettingDouble calibrationArgHmax;
        private double calibration_Hmax;
        public SettingDouble calibrationArgSmax;
        private double calibration_Smax;
        public SettingDouble calibrationArgVmax;
        private double calibration_Vmax;

        // MCP Command Publication
        protected override void PublishCommands()
        {
            cmd_cameraColor = PublishCommand(CommandId.cameraColor, "cameraColor", HmicameraColor, 0);
                cameraColorArgaTime = PublishCommandArgInt(cmd_cameraColor, ArgumentId.cameraColorArgaTime, "aTime", 0, 0, 0, "", "");

            cmd_calibration = PublishCommand(CommandId.calibration, "calibration", Hmicalibration, 0);
                calibrationArgcolor = PublishCommandArgString(cmd_calibration, ArgumentId.calibrationArgcolor, "color", "0");
                calibrationArgHmin = PublishCommandArgDouble(cmd_calibration, ArgumentId.calibrationArgHmin, "Hmin", 0, 0, 255, "", "");
                calibrationArgSmin = PublishCommandArgDouble(cmd_calibration, ArgumentId.calibrationArgSmin, "Smin", 0, 0, 255, "", "");
                calibrationArgVmin = PublishCommandArgDouble(cmd_calibration, ArgumentId.calibrationArgVmin, "Vmin", 0, 0, 255, "", "");
                calibrationArgHmax = PublishCommandArgDouble(cmd_calibration, ArgumentId.calibrationArgHmax, "Hmax", 0, 0, 255, "", "");
                calibrationArgSmax = PublishCommandArgDouble(cmd_calibration, ArgumentId.calibrationArgSmax, "Smax", 0, 0, 255, "", "");
                calibrationArgVmax = PublishCommandArgDouble(cmd_calibration, ArgumentId.calibrationArgVmax, "Vmax", 0, 0, 255, "", "");

        }
#endregion // Commands

#endregion // Private members

#region Public properties
#endregion // Public properties

#region Constructors
        /// <summary>
        /// Default constructor (needed for deserialization)
        /// </summary>
        public Camera() : base()
        {
        }
#endregion // Constructors

#region Public methods
        //------------------------------------------------------
        //  Public Methods
        //------------------------------------------------------

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

        public bool CmdcameraColor(int aTime = 0)
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
        //  Command "calibration"
        //======================================================================
        /// <summary>
        /// calibration
        /// </summary>
        /// <returns>
        /// </returns>

        // Do not call this function, for use by HMI only
        public bool Hmicalibration()
        {
            bool result = true;
            bool ack = true;

            // Copy the arguments from those set in the HMI
            calibration_color = (String)calibrationArgcolor.Value;
            calibration_Hmin = (double)calibrationArgHmin.Value;
            calibration_Smin = (double)calibrationArgSmin.Value;
            calibration_Vmin = (double)calibrationArgVmin.Value;
            calibration_Hmax = (double)calibrationArgHmax.Value;
            calibration_Smax = (double)calibrationArgSmax.Value;
            calibration_Vmax = (double)calibrationArgVmax.Value;

            if (ack)
            {
                // Launch the command via the command executor
                CommandExecutor.CommandId = (int)(CommandId.calibration);
            }
            return result;
        }

        public bool Cmdcalibration(String color = "0", double Hmin = 0, double Smin = 0, double Vmin = 0, double Hmax = 0, double Smax = 0, double Vmax = 0)
        {
            bool result = true;
            bool ack = true;

            // Copy the arguments from those set in the method call
            calibration_color = color;
            calibration_Hmin = Hmin;
            calibration_Smin = Smin;
            calibration_Vmin = Vmin;
            calibration_Hmax = Hmax;
            calibration_Smax = Smax;
            calibration_Vmax = Vmax;

            if (ack)
            {
                // Launch the command via the command executor
                CommandExecutor.CommandId = (int)(CommandId.calibration);
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
        /// The cyclic method for Camera.
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
                //  Command "cameraColor"
                //==============================================================
                case (int)(CommandId.cameraColor):

                    switch (CommandExecutor.ExecutionState)
                    {
                        case 1:
                            // Actions on entry
                            if (CommandExecutor.OnExecutionStateChanged)
                            {
                                CameraOperations.cameraColorOperation( cameraColor_aTime);
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
                //  Command "calibration"
                //==============================================================
                case (int)(CommandId.calibration):

                    switch (CommandExecutor.ExecutionState)
                    {
                        case 1:
                            // Actions on entry
                            if (CommandExecutor.OnExecutionStateChanged)
                            {
                                CameraOperations.calibrationOperation( calibration_color, calibration_Hmin, calibration_Smin, calibration_Vmin, calibration_Hmax, calibration_Smax, calibration_Vmax);
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
