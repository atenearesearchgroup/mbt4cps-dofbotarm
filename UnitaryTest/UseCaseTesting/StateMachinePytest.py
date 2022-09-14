import pytest



######################################
#TEST SETUP
######################################

'''
stored in conftest.py
'''

######################################
#TEST FUNCTIONS
######################################
def Testings(CC1):
	mp=CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand('posInicial').Execute(1000);
	mp=CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	mp.GetCommand('buzzerOff').Execute();
	mp=CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	mp.GetCommand('buzzerOn').Execute(1);
	mp=CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand('rotateAllServos').Execute(45, 45, 45, 45, 45, 45, 2000);
	mp=CC1.Controller.GetMachinePart('Machine/Arm/MiddleServo')
	mp.GetCommand('rotateServo').Execute(3, 30, 1000)
	mp=CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand('isAt').Execute(45, 45, 30, 45, 45, 45, 2000);
	assert CC1.Machine.Arm.ArmOperations._Observers_.GetCurrentValue(), 'Guard Failed'
	assert StateVar(oRunTime) >= (3+Sett(time_resolution);
	mp=CC1.Controller.GetMachinePart('Machine/Arm/Servos')
	mp.GetCommand('isAtSingle').Execute(1, 90, 2000)
	assert CC1.Machine.Arm.Servos.ServosOperations._Observers_.GetCurrentValue(), 'Guard Failed'
