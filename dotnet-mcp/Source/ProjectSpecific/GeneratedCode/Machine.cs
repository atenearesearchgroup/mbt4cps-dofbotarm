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
//           File %name: Machine.cs %
//             %version:  %
//        %date_created:  %
//          %created_by:  %
//
////////////////////////////////////////////////////////////////////////////////
#endregion

//  Class info extracted from Model                                 
// 
//  Children:
//     Board                                                         
//     Arm                                                           
// 
//  Used MachineParts:
//     No Used MachineParts defined
// 
//   Commands:
//     No Commands defined
// 
//   Methods:
//     No Methods defined
// 
//   Settings:
//     angleServo1                                                   
//     angleServo2                                                   
//     angleServo3                                                   
//     angleServo4                                                   
//     angleServo5                                                   
//     angleServo6                                                   
//     setTime                                                       
//     angle_resolution                                              
//     time_resolution                                               
//     counterIterations                                             
//     maxIterations                                                 
// 
//   Messages:
//     mError                                                        
//     mWarning                                                      
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
//     StateMachine1                                                 
//     StateInit_Init_StateMachine1                                  
//     StateLoop_Loop_StateMachine1                                  
//     StateFinal_Final_StateMachine1                                
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
    public class Machine : MachinePart, IMachine
    {

#region Enumerations
        public enum StateMachineId
        {
            StateMachine1,
            StateInit_Init_StateMachine1,
            StateLoop_Loop_StateMachine1,
            StateFinal_Final_StateMachine1,
        }

        public enum StateMachine1State
        {
            Undefined = -1,
            FinalState = 0,
            StateInit = 5,
            StateLoop = 6,
            StateFinal = 7,
        }

        public enum StateInit_Init_StateMachine1State
        {
            Undefined = -1,
            FinalState = 0,
            initialPos = 2,
            initialWARNING = 3,
        }

        public enum StateLoop_Loop_StateMachine1State
        {
            Undefined = -1,
            FinalState = 0,
            readyPos = 2,
            secondPos = 3,
            readyERROR = 4,
        }

        public enum StateFinal_Final_StateMachine1State
        {
            Undefined = -1,
            FinalState = 0,
            finalPos = 2,
            finalWARNING = 3,
        }

        public enum Substate
        {
            FinalState = 0,
            FirstState = 1,
        }

        // State Machines
        [XmlIgnore] public StateMachine StateMachine1;
        [XmlIgnore] public StateMachine StateInit_Init_StateMachine1;
        [XmlIgnore] public StateMachine StateLoop_Loop_StateMachine1;
        [XmlIgnore] public StateMachine StateFinal_Final_StateMachine1;

        // MCP State Machine Publications
        protected override void PublishStateMachines()
        {
            StateMachine1 = PublishStateMachine(StateMachineId.StateMachine1, "StateMachine1", StateMachine1State.Undefined, Substate.FirstState);
            StateInit_Init_StateMachine1 = PublishStateMachine(StateMachineId.StateInit_Init_StateMachine1, "StateInit_Init_StateMachine1", StateInit_Init_StateMachine1State.Undefined, Substate.FirstState);
            StateLoop_Loop_StateMachine1 = PublishStateMachine(StateMachineId.StateLoop_Loop_StateMachine1, "StateLoop_Loop_StateMachine1", StateLoop_Loop_StateMachine1State.Undefined, Substate.FirstState);
            StateFinal_Final_StateMachine1 = PublishStateMachine(StateMachineId.StateFinal_Final_StateMachine1, "StateFinal_Final_StateMachine1", StateFinal_Final_StateMachine1State.Undefined, Substate.FirstState);
        }

#endregion // Enumerations

#region Child guarding
#endregion // Child guarding

#region Children and used machineparts
        // Children
        public enum ChildId
        {
            Arm,
            Board,
        }

        public Arm Arm;
        public Board Board;

        protected override void PublishChildren()
        {
            PublishChild(ChildId.Arm, Arm, "Arm");
            PublishChild(ChildId.Board, Board, "Board");
        }
#endregion // Children and used machineparts

#region InitPre / InitPost
        protected override void InitPre()
        {
            // Instantiate complex members

            // Create the children, unless they were already created during deserialization of <Database.xml>
            if (Arm == null) { Arm = new Arm(); }
            if (Board == null) { Board = new Board(); }
        }
            
        protected override void InitPost()
        {
            AssignMachinePartIDs();

            // Initialize <Use> relations
        }

        private void AssignMachinePartIDs()
        {
            this.MachinePartID = 1000;
            this.Board.MachinePartID = 1003;
            this.Board.Buzzer.MachinePartID = 1004;
            this.Board.Buzzer.BuzzerOperations.MachinePartID = 1005;
            this.Board.Light.MachinePartID = 1006;
            this.Board.Light.LightOperations.MachinePartID = 1007;
            this.Arm.MachinePartID = 1008;
            this.Arm.ArmOperations.MachinePartID = 1009;
            this.Arm.BaseServo.MachinePartID = 1010;
            this.Arm.BaseServo.ServosOperations.MachinePartID = 1011;
            this.Arm.LowerServo.MachinePartID = 1012;
            this.Arm.LowerServo.ServosOperations.MachinePartID = 1013;
            this.Arm.MiddleServo.MachinePartID = 1014;
            this.Arm.MiddleServo.ServosOperations.MachinePartID = 1015;
            this.Arm.UpperServo.MachinePartID = 1016;
            this.Arm.UpperServo.ServosOperations.MachinePartID = 1017;
            this.Arm.WristServo.MachinePartID = 1018;
            this.Arm.WristServo.ServosOperations.MachinePartID = 1019;
            this.Arm.Camera.MachinePartID = 1020;
            this.Arm.Camera.CameraOperations.MachinePartID = 1021;
        }
#endregion // InitPre / InitPost

#region Private members

#region Messages
        // MessageId Enumeration
        public enum MessageId
        {
            mError = 23,
            mWarning = 24,
        }

        // Messages
        private Message mError;
        private Message mWarning;

        // MCP Message Publications
        protected override void PublishMessages()
        {
            mError = PublishMessage(MessageId.mError, "mError", MessageCategory.ERROR);
            mWarning = PublishMessage(MessageId.mWarning, "mWarning", MessageCategory.WARNING);
        }
#endregion // Messages

#region Settings
        public enum SettingId
        {
            angleServo1 = 23,
            angleServo2 = 24,
            angleServo3 = 25,
            angleServo4 = 26,
            angleServo5 = 27,
            angleServo6 = 28,
            setTime = 29,
            angle_resolution = 30,
            time_resolution = 33,
            counterIterations = 31,
            maxIterations = 32,
        }

        // Settings
        [XmlIgnore] public SettingDouble angleServo1;
        [XmlIgnore] public SettingDouble angleServo2;
        [XmlIgnore] public SettingDouble angleServo3;
        [XmlIgnore] public SettingDouble angleServo4;
        [XmlIgnore] public SettingDouble angleServo5;
        [XmlIgnore] public SettingDouble angleServo6;
        [XmlIgnore] public SettingInt setTime;
        [XmlIgnore] public SettingDouble angle_resolution;
        [XmlIgnore] public SettingInt time_resolution;
        [XmlIgnore] public SettingDouble counterIterations;
        [XmlIgnore] public SettingDouble maxIterations;

        // MCP Setting Publications
        protected override void PublishSettings()
        {
            angleServo1 = PublishSettingDouble(SettingId.angleServo1, "angleServo1", 90, 0, 180, "");
            angleServo2 = PublishSettingDouble(SettingId.angleServo2, "angleServo2", 90, 0, 180, "");
            angleServo3 = PublishSettingDouble(SettingId.angleServo3, "angleServo3", 90, 0, 180, "");
            angleServo4 = PublishSettingDouble(SettingId.angleServo4, "angleServo4", 90, 0, 180, "");
            angleServo5 = PublishSettingDouble(SettingId.angleServo5, "angleServo5", 90, 0, 270, "");
            angleServo6 = PublishSettingDouble(SettingId.angleServo6, "angleServo6", 90, 0, 180, "");
            setTime = PublishSettingInt(SettingId.setTime, "setTime", 1000, 0, 100000, "");
            angle_resolution = PublishSettingDouble(SettingId.angle_resolution, "angle_resolution", 2, 0, 270, "");
            time_resolution = PublishSettingInt(SettingId.time_resolution, "time_resolution", 100, 0, 100000, "");
            counterIterations = PublishSettingDouble(SettingId.counterIterations, "counterIterations", 0, 0, 10000, "");
            maxIterations = PublishSettingDouble(SettingId.maxIterations, "maxIterations", 4, 0, 10000, "");
        }
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
            obs_MachinePartHash.Value = 11103918;
        }
#endregion // Observers

#region IO Points
#endregion // IO Points

#region Commands

        // Arguments

#endregion // Commands

#endregion // Private members

#region Public properties
#endregion // Public properties

#region Constructors
        /// <summary>
        /// Default constructor (needed for deserialization)
        /// </summary>
        public Machine() : base()
        {
        }
#endregion // Constructors

#region Interface implementation IMachine
        //------------------------------------------------------
        //  Interface IMachine
        //------------------------------------------------------

        public string GetApplicationIdentfication()
        {
            return VersionProvider.Singleton.GetSoftwareIdentification();
        }
#endregion // Interface implementation IMachine

#region Public methods
        //------------------------------------------------------
        //  Public Methods
        //------------------------------------------------------

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
        /// The cyclic method for Machine.
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

#region State machine StateMachine1
            //******************************************************************
            //  STATE MACHINE 'STATEMACHINE1'
            //******************************************************************

            switch ((StateMachine1State)(StateMachine1.State))
            {
                //==============================================================
                //  State 'UNDEFINED' 
                //==============================================================
                case StateMachine1State.Undefined:
            
                    // Actions on entry
                    if (StateMachine1.OnStateChanged)
                    {
                        LogDebugMessage("State: Undefined");
                    }

                    // Transitions
                    if (!StateMachine1.OnStateChanged)
                    {
                        StateMachine1.State = StateMachine1State.StateInit;
                    }
                    break;

                //==============================================================
                //  State 'STATEINIT' 
                //==============================================================
                case StateMachine1State.StateInit:
            
                    // Actions on entry
                    if (StateMachine1.OnStateChanged)
                    {
                        LogDebugMessage("State: StateInit");
                    }
            
                    // Continuous actions

                    // Transitions
                    if (!StateMachine1.OnStateChanged)
                    {
                        if (Arm.ArmOperations.isAtOperation(angleServo1.Value, angleServo2.Value, angleServo3.Value, angleServo4.Value, angleServo5.Value, angleServo6.Value, angle_resolution.Value) == true)
                        {
                            StateMachine1.State = StateMachine1State.StateLoop;
                        }
                    }
                    break;

                //==============================================================
                //  State 'STATELOOP' 
                //==============================================================
                case StateMachine1State.StateLoop:
            
                    // Actions on entry
                    if (StateMachine1.OnStateChanged)
                    {
                        LogDebugMessage("State: StateLoop");
                    }
            
                    // Continuous actions

                    // Transitions
                    if (!StateMachine1.OnStateChanged)
                    {
                        if (counterIterations.Value >= maxIterations.Value)
                        {
                            StateMachine1.State = StateMachine1State.StateFinal;
                        }
                    }
                    break;

                //==============================================================
                //  State 'STATEFINAL' 
                //==============================================================
                case StateMachine1State.StateFinal:
            
                    // Actions on entry
                    if (StateMachine1.OnStateChanged)
                    {
                        LogDebugMessage("State: StateFinal");
                    }
            
                    // Continuous actions

                    // Transitions
                    if (!StateMachine1.OnStateChanged)
                    {
                    }
                    break;

                //==============================================================
                //  Default state 
                //==============================================================
                default:
                    LogDebugMessage("Default state: FinalState");
                    break;
            }
#endregion // State machine StateMachine1

#region State machine StateInit_Init_StateMachine1
            //******************************************************************
            //  STATE MACHINE 'STATEINIT_INIT_STATEMACHINE1'
            //******************************************************************

            // Reset the sub-statemachine depending on the situation in the parent state machines
            if (!StateMachine1.State.Equals(StateMachine1State.StateInit))
            {
                StateInit_Init_StateMachine1.State = StateInit_Init_StateMachine1State.Undefined;
            }

            switch ((StateInit_Init_StateMachine1State)(StateInit_Init_StateMachine1.State))
            {
                //==============================================================
                //  State 'UNDEFINED' 
                //==============================================================
                case StateInit_Init_StateMachine1State.Undefined:
            
                    // Actions on entry
                    if (StateInit_Init_StateMachine1.OnStateChanged)
                    {
                        LogDebugMessage("State: Undefined");
                    }

                    // Transitions
                    if (!StateInit_Init_StateMachine1.OnStateChanged)
                    {
                        // Keep state machine blocked until "parent state" active
                        if (StateMachine1.State.Equals(StateMachine1State.StateInit))
                        {
                            StateInit_Init_StateMachine1.State = StateInit_Init_StateMachine1State.initialPos;
                        }
                    }
                    break;

                //==============================================================
                //  State 'INITIALPOS' 
                //==============================================================
                case StateInit_Init_StateMachine1State.initialPos:
            
                    // Actions on entry
                    if (StateInit_Init_StateMachine1.OnStateChanged)
                    {
                        LogDebugMessage("State: initialPos");
                        Arm.ArmOperations.rotateAllServosOperation(angleServo1.Value, angleServo2.Value, angleServo3.Value, angleServo4.Value, angleServo5.Value, angleServo6.Value, setTime.Value);
                    }
            
                    // Continuous actions

                    // Transitions
                    if (!StateInit_Init_StateMachine1.OnStateChanged)
                    {
                        if (StateInit_Init_StateMachine1.StateRunTime_ms >= (setTime.Value + time_resolution.Value))
                        {
                            StateInit_Init_StateMachine1.State = StateInit_Init_StateMachine1State.initialWARNING;
                        }
                        else if (false /* TODO: No Guards Defined */)
                        {
                            StateInit_Init_StateMachine1.State = StateInit_Init_StateMachine1State.FinalState;
                        }
                    }
                    break;

                //==============================================================
                //  State 'INITIALWARNING' 
                //==============================================================
                case StateInit_Init_StateMachine1State.initialWARNING:
            
                    // Actions on entry
                    if (StateInit_Init_StateMachine1.OnStateChanged)
                    {
                        LogDebugMessage("State: initialWARNING");
                        ReportMessage(mWarning, "Warning Time");
                        /* MessReport(mError, "Error"); */
                    }
            
                    // Continuous actions

                    // Transitions
                    if (!StateInit_Init_StateMachine1.OnStateChanged)
                    {
                        if (Arm.ArmOperations.isAtOperation(angleServo1.Value, angleServo2.Value, angleServo3.Value, angleServo4.Value, angleServo5.Value, angleServo6.Value, angle_resolution.Value) == false)
                        {
                            StateInit_Init_StateMachine1.State = StateInit_Init_StateMachine1State.initialPos;
                        }
                    }
                    break;

                //==============================================================
                //  Default state 
                //==============================================================
                default:
                    LogDebugMessage("Default state: FinalState");
                    break;
            }
#endregion // State machine StateInit_Init_StateMachine1

#region State machine StateLoop_Loop_StateMachine1
            //******************************************************************
            //  STATE MACHINE 'STATELOOP_LOOP_STATEMACHINE1'
            //******************************************************************

            // Reset the sub-statemachine depending on the situation in the parent state machines
            if (!StateMachine1.State.Equals(StateMachine1State.StateLoop))
            {
                StateLoop_Loop_StateMachine1.State = StateLoop_Loop_StateMachine1State.Undefined;
            }

            switch ((StateLoop_Loop_StateMachine1State)(StateLoop_Loop_StateMachine1.State))
            {
                //==============================================================
                //  State 'UNDEFINED' 
                //==============================================================
                case StateLoop_Loop_StateMachine1State.Undefined:
            
                    // Actions on entry
                    if (StateLoop_Loop_StateMachine1.OnStateChanged)
                    {
                        LogDebugMessage("State: Undefined");
                    }

                    // Transitions
                    if (!StateLoop_Loop_StateMachine1.OnStateChanged)
                    {
                        // Keep state machine blocked until "parent state" active
                        if (StateMachine1.State.Equals(StateMachine1State.StateLoop))
                        {
                            StateLoop_Loop_StateMachine1.State = StateLoop_Loop_StateMachine1State.readyPos;
                        }
                    }
                    break;

                //==============================================================
                //  State 'READYPOS' 
                //==============================================================
                case StateLoop_Loop_StateMachine1State.readyPos:
            
                    // Actions on entry
                    if (StateLoop_Loop_StateMachine1.OnStateChanged)
                    {
                        LogDebugMessage("State: readyPos");
                        angleServo1.Value = 90;
                        angleServo2.Value = 130;
                        angleServo3.Value = 0;
                        angleServo4.Value = 0;
                        angleServo5.Value = 270;
                        angleServo6.Value = 60;
                        counterIterations.Value = counterIterations.Value + 1;
                        Arm.ArmOperations.rotateAllServosOperation(angleServo1.Value, angleServo2.Value, angleServo3.Value, angleServo4.Value, angleServo5.Value, angleServo6.Value, setTime.Value);
                    }
            
                    // Continuous actions

                    // Transitions
                    if (!StateLoop_Loop_StateMachine1.OnStateChanged)
                    {
                        if (Arm.ArmOperations.isAtOperation(90, 130, 0, 0, 270, 60, angle_resolution.Value) == true)
                        {
                            StateLoop_Loop_StateMachine1.State = StateLoop_Loop_StateMachine1State.secondPos;
                        }
                        else if (StateLoop_Loop_StateMachine1.StateRunTime_ms >= (setTime.Value + time_resolution.Value))
                        {
                            StateLoop_Loop_StateMachine1.State = StateLoop_Loop_StateMachine1State.readyERROR;
                        }
                        else if (false /* TODO: No Guards Defined */)
                        {
                            StateLoop_Loop_StateMachine1.State = StateLoop_Loop_StateMachine1State.FinalState;
                        }
                    }
                    break;

                //==============================================================
                //  State 'SECONDPOS' 
                //==============================================================
                case StateLoop_Loop_StateMachine1State.secondPos:
            
                    // Actions on entry
                    if (StateLoop_Loop_StateMachine1.OnStateChanged)
                    {
                        LogDebugMessage("State: secondPos");
                        angleServo1.Value = 90;
                        angleServo2.Value = 80;
                        angleServo3.Value = 50;
                        angleServo4.Value = 50;
                        angleServo5.Value = 270;
                        angleServo6.Value = 135;
                        Arm.ArmOperations.rotateAllServosOperation(angleServo1.Value, angleServo2.Value, angleServo3.Value, angleServo4.Value, angleServo5.Value, angleServo6.Value, setTime.Value);
                    }
            
                    // Continuous actions

                    // Transitions
                    if (!StateLoop_Loop_StateMachine1.OnStateChanged)
                    {
                        if (Arm.ArmOperations.isAtOperation(90, 80, 50, 50, 270, 135, angle_resolution.Value) == true)
                        {
                            StateLoop_Loop_StateMachine1.State = StateLoop_Loop_StateMachine1State.readyPos;
                        }
                        else if (StateLoop_Loop_StateMachine1.StateRunTime_ms >= (setTime.Value + time_resolution.Value))
                        {
                            StateLoop_Loop_StateMachine1.State = StateLoop_Loop_StateMachine1State.readyERROR;
                        }
                    }
                    break;

                //==============================================================
                //  State 'READYERROR' 
                //==============================================================
                case StateLoop_Loop_StateMachine1State.readyERROR:
            
                    // Actions on entry
                    if (StateLoop_Loop_StateMachine1.OnStateChanged)
                    {
                        LogDebugMessage("State: readyERROR");
                        /* MessReport(mWarning, "Warning Time"); */
                        ReportMessage(mError, "Error");
                    }
            
                    // Continuous actions

                    // Transitions
                    if (!StateLoop_Loop_StateMachine1.OnStateChanged)
                    {
                    }
                    break;

                //==============================================================
                //  Default state 
                //==============================================================
                default:
                    LogDebugMessage("Default state: FinalState");
                    break;
            }
#endregion // State machine StateLoop_Loop_StateMachine1

#region State machine StateFinal_Final_StateMachine1
            //******************************************************************
            //  STATE MACHINE 'STATEFINAL_FINAL_STATEMACHINE1'
            //******************************************************************

            // Reset the sub-statemachine depending on the situation in the parent state machines
            if (!StateMachine1.State.Equals(StateMachine1State.StateFinal))
            {
                StateFinal_Final_StateMachine1.State = StateFinal_Final_StateMachine1State.Undefined;
            }

            switch ((StateFinal_Final_StateMachine1State)(StateFinal_Final_StateMachine1.State))
            {
                //==============================================================
                //  State 'UNDEFINED' 
                //==============================================================
                case StateFinal_Final_StateMachine1State.Undefined:
            
                    // Actions on entry
                    if (StateFinal_Final_StateMachine1.OnStateChanged)
                    {
                        LogDebugMessage("State: Undefined");
                    }

                    // Transitions
                    if (!StateFinal_Final_StateMachine1.OnStateChanged)
                    {
                        // Keep state machine blocked until "parent state" active
                        if (StateMachine1.State.Equals(StateMachine1State.StateFinal))
                        {
                            StateFinal_Final_StateMachine1.State = StateFinal_Final_StateMachine1State.finalPos;
                        }
                    }
                    break;

                //==============================================================
                //  State 'FINALPOS' 
                //==============================================================
                case StateFinal_Final_StateMachine1State.finalPos:
            
                    // Actions on entry
                    if (StateFinal_Final_StateMachine1.OnStateChanged)
                    {
                        LogDebugMessage("State: finalPos");
                        angleServo1.Value = 90;
                        angleServo2.Value = 90;
                        angleServo3.Value = 90;
                        angleServo4.Value = 90;
                        angleServo5.Value = 90;
                        angleServo6.Value = 90;
                        Arm.ArmOperations.rotateAllServosOperation(angleServo1.Value, angleServo2.Value, angleServo3.Value, angleServo4.Value, angleServo5.Value, angleServo6.Value, setTime.Value);
                    }
            
                    // Continuous actions

                    // Transitions
                    if (!StateFinal_Final_StateMachine1.OnStateChanged)
                    {
                        if (Arm.ArmOperations.isAtOperation(90, 90, 90, 90, 90, 90, angle_resolution.Value) == true)
                        {
                            StateFinal_Final_StateMachine1.State = StateFinal_Final_StateMachine1State.FinalState;
                        }
                        else if (StateFinal_Final_StateMachine1.StateRunTime_ms >= (setTime.Value + time_resolution.Value))
                        {
                            StateFinal_Final_StateMachine1.State = StateFinal_Final_StateMachine1State.finalWARNING;
                        }
                    }
                    break;

                //==============================================================
                //  State 'FINALWARNING' 
                //==============================================================
                case StateFinal_Final_StateMachine1State.finalWARNING:
            
                    // Actions on entry
                    if (StateFinal_Final_StateMachine1.OnStateChanged)
                    {
                        LogDebugMessage("State: finalWARNING");
                        ReportMessage(mWarning, "Warning Time");
                        /* MessReport(mError, "Error"); */
                    }
            
                    // Continuous actions

                    // Transitions
                    if (!StateFinal_Final_StateMachine1.OnStateChanged)
                    {
                        if (Arm.ArmOperations.isAtOperation(90, 90, 90, 90, 90, 90, angle_resolution.Value) == false)
                        {
                            StateFinal_Final_StateMachine1.State = StateFinal_Final_StateMachine1State.finalPos;
                        }
                    }
                    break;

                //==============================================================
                //  Default state 
                //==============================================================
                default:
                    LogDebugMessage("Default state: FinalState");
                    break;
            }
#endregion // State machine StateFinal_Final_StateMachine1

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
