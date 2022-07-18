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
//           File %name: IOLinks.cs %
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
    public class IOLinks : MachinePart
    {

#region Enumerations
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
            obs_MachinePartHash.Value = 76111;
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
        public IOLinks() : base()
        {
        }
#endregion // Constructors

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
        /// The cyclic method for IOLinks.
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
