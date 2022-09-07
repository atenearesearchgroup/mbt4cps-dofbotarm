import pytest
import time



######################################
#TEST SETUP
######################################

'''
stored in conftest.py
'''

######################################
#TEST FUNCTIONS
######################################
def test_0_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 122, 124, 61, 171, 267, 156, 71035)
	time.sleep(71.035)
	mp.GetCommand('isAt').Execute(122, 124, 61, 171, 267, 156, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_1_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 40)
	assert True, 'Postcondition failed'

def test_2_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 125, 231, 116)
	assert True, 'Postcondition failed'

def test_3_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 177, 172, 102, 169, 0, 142, 14490)
	time.sleep(14.49)
	mp.GetCommand('isAt').Execute(177, 172, 102, 169, 0, 142, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_4_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 9)
	assert True, 'Postcondition failed'

def test_5_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 28, 13, 254)
	assert True, 'Postcondition failed'

def test_6_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 170, 98, 171, 46, 94, 170, 18653)
	time.sleep(18.653)
	mp.GetCommand('isAt').Execute(170, 98, 171, 46, 94, 170, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_7_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 19)
	assert True, 'Postcondition failed'

def test_8_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 253, 136, 109)
	assert True, 'Postcondition failed'

def test_9_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 66, 106, 111, 1, 84, 20, 7337)
	time.sleep(7.337)
	mp.GetCommand('isAt').Execute(66, 106, 111, 1, 84, 20, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_10_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 0)
	assert True, 'Postcondition failed'

def test_11_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 116, 183, 22)
	assert True, 'Postcondition failed'

def test_12_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 39, 129, 6, 2, 124, 46, 84067)
	time.sleep(84.067)
	mp.GetCommand('isAt').Execute(39, 129, 6, 2, 124, 46, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_13_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 35)
	assert True, 'Postcondition failed'

def test_14_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 214, 161, 227)
	assert True, 'Postcondition failed'

def test_15_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 91, 123, 36, 21, 149, 178, 8746)
	time.sleep(8.746)
	mp.GetCommand('isAt').Execute(91, 123, 36, 21, 149, 178, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_16_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 14)
	assert True, 'Postcondition failed'

def test_17_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 239, 65, 176)
	assert True, 'Postcondition failed'

def test_18_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 157, 24, 83, 144, 153, 121, 14371)
	time.sleep(14.371)
	mp.GetCommand('isAt').Execute(157, 24, 83, 144, 153, 121, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_19_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 43)
	assert True, 'Postcondition failed'

def test_20_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 77, 9, 144)
	assert True, 'Postcondition failed'

def test_21_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 4, 113, 53, 41, 248, 151, 32332)
	time.sleep(32.332)
	mp.GetCommand('isAt').Execute(4, 113, 53, 41, 248, 151, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_22_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 30)
	assert True, 'Postcondition failed'

def test_23_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 86, 211, 3)
	assert True, 'Postcondition failed'

def test_24_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 54, 19, 128, 12, 187, 172, 94781)
	time.sleep(94.781)
	mp.GetCommand('isAt').Execute(54, 19, 128, 12, 187, 172, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_25_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 48)
	assert True, 'Postcondition failed'

def test_26_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 32, 247, 241)
	assert True, 'Postcondition failed'

def test_27_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 121, 75, 117, 125, 92, 69, 29811)
	time.sleep(29.811)
	mp.GetCommand('isAt').Execute(121, 75, 117, 125, 92, 69, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_28_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 0)
	assert True, 'Postcondition failed'

def test_29_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 218, 91, 109)
	assert True, 'Postcondition failed'

def test_30_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 68, 68, 54, 46, 205, 12, 42411)
	time.sleep(42.411)
	mp.GetCommand('isAt').Execute(68, 68, 54, 46, 205, 12, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_31_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 41)
	assert True, 'Postcondition failed'

def test_32_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 103, 81, 17)
	assert True, 'Postcondition failed'

def test_33_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 71, 9, 55, 19, 266, 31, 67612)
	time.sleep(67.612)
	mp.GetCommand('isAt').Execute(71, 9, 55, 19, 266, 31, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_34_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 17)
	assert True, 'Postcondition failed'

def test_35_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 223, 39, 132)
	assert True, 'Postcondition failed'

def test_36_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 114, 171, 152, 105, 76, 2, 17370)
	time.sleep(17.37)
	mp.GetCommand('isAt').Execute(114, 171, 152, 105, 76, 2, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_37_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 2)
	assert True, 'Postcondition failed'

def test_38_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 181, 63, 223)
	assert True, 'Postcondition failed'

def test_39_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 15, 49, 103, 90, 149, 105, 90048)
	time.sleep(90.048)
	mp.GetCommand('isAt').Execute(15, 49, 103, 90, 149, 105, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_40_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 44)
	assert True, 'Postcondition failed'

def test_41_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 33, 119, 124)
	assert True, 'Postcondition failed'

def test_42_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 101, 57, 0, 23, 6, 177, 88050)
	time.sleep(88.05)
	mp.GetCommand('isAt').Execute(101, 57, 0, 23, 6, 177, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_43_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 42)
	assert True, 'Postcondition failed'

def test_44_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 142, 133, 112)
	assert True, 'Postcondition failed'

def test_45_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 25, 70, 47, 49, 13, 18, 48520)
	time.sleep(48.52)
	mp.GetCommand('isAt').Execute(25, 70, 47, 49, 13, 18, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_46_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 1)
	assert True, 'Postcondition failed'

def test_47_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 125, 147, 59)
	assert True, 'Postcondition failed'

def test_48_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 177, 177, 142, 41, 165, 19, 64520)
	time.sleep(64.52)
	mp.GetCommand('isAt').Execute(177, 177, 142, 41, 165, 19, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_49_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 27)
	assert True, 'Postcondition failed'

def test_50_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 205, 180, 32)
	assert True, 'Postcondition failed'

def test_51_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 93, 163, 50, 85, 50, 171, 93929)
	time.sleep(93.929)
	mp.GetCommand('isAt').Execute(93, 163, 50, 85, 50, 171, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_52_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 12)
	assert True, 'Postcondition failed'

def test_53_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 126, 191, 179)
	assert True, 'Postcondition failed'

def test_54_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 59, 81, 162, 175, 123, 92, 71624)
	time.sleep(71.624)
	mp.GetCommand('isAt').Execute(59, 81, 162, 175, 123, 92, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_55_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 19)
	assert True, 'Postcondition failed'

def test_56_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 185, 14, 228)
	assert True, 'Postcondition failed'

def test_57_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 91, 78, 7, 152, 128, 52, 20699)
	time.sleep(20.699)
	mp.GetCommand('isAt').Execute(91, 78, 7, 152, 128, 52, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_58_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 24)
	assert True, 'Postcondition failed'

def test_59_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 57, 153, 122)
	assert True, 'Postcondition failed'

def test_60_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 110, 113, 39, 148, 254, 41, 69119)
	time.sleep(69.119)
	mp.GetCommand('isAt').Execute(110, 113, 39, 148, 254, 41, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_61_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 9)
	assert True, 'Postcondition failed'

def test_62_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 24, 108, 22)
	assert True, 'Postcondition failed'

def test_63_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 145, 35, 170, 150, 129, 133, 99731)
	time.sleep(99.731)
	mp.GetCommand('isAt').Execute(145, 35, 170, 150, 129, 133, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_64_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 24)
	assert True, 'Postcondition failed'

def test_65_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 161, 244, 208)
	assert True, 'Postcondition failed'

def test_66_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 105, 122, 118, 46, 74, 150, 59229)
	time.sleep(59.229)
	mp.GetCommand('isAt').Execute(105, 122, 118, 46, 74, 150, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_67_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 6)
	assert True, 'Postcondition failed'

def test_68_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 189, 160, 0)
	assert True, 'Postcondition failed'

def test_69_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 168, 87, 71, 24, 180, 143, 79479)
	time.sleep(79.479)
	mp.GetCommand('isAt').Execute(168, 87, 71, 24, 180, 143, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_70_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 31)
	assert True, 'Postcondition failed'

def test_71_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 209, 99, 213)
	assert True, 'Postcondition failed'

def test_72_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 8, 144, 75, 173, 265, 45, 65569)
	time.sleep(65.569)
	mp.GetCommand('isAt').Execute(8, 144, 75, 173, 265, 45, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_73_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 39)
	assert True, 'Postcondition failed'

def test_74_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 5, 167, 36)
	assert True, 'Postcondition failed'

def test_75_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 55, 6, 131, 71, 181, 6, 439)
	time.sleep(0.439)
	mp.GetCommand('isAt').Execute(55, 6, 131, 71, 181, 6, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_76_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 19)
	assert True, 'Postcondition failed'

def test_77_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 165, 243, 200)
	assert True, 'Postcondition failed'

def test_78_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 13, 159, 29, 93, 33, 165, 62843)
	time.sleep(62.843)
	mp.GetCommand('isAt').Execute(13, 159, 29, 93, 33, 165, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_79_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 13)
	assert True, 'Postcondition failed'

def test_80_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 44, 48, 156)
	assert True, 'Postcondition failed'

def test_81_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 90, 105, 139, 125, 213, 20, 20214)
	time.sleep(20.214)
	mp.GetCommand('isAt').Execute(90, 105, 139, 125, 213, 20, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_82_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 0)
	assert True, 'Postcondition failed'

def test_83_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 17, 150, 10)
	assert True, 'Postcondition failed'

def test_84_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 20, 104, 54, 162, 162, 178, 66325)
	time.sleep(66.325)
	mp.GetCommand('isAt').Execute(20, 104, 54, 162, 162, 178, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_85_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 48)
	assert True, 'Postcondition failed'

def test_86_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 61, 244, 231)
	assert True, 'Postcondition failed'

def test_87_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 152, 124, 151, 27, 3, 49, 1745)
	time.sleep(1.745)
	mp.GetCommand('isAt').Execute(152, 124, 151, 27, 3, 49, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_88_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 8)
	assert True, 'Postcondition failed'

def test_89_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 103, 133, 68)
	assert True, 'Postcondition failed'

def test_90_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 84, 165, 144, 57, 217, 80, 74439)
	time.sleep(74.439)
	mp.GetCommand('isAt').Execute(84, 165, 144, 57, 217, 80, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_91_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 8)
	assert True, 'Postcondition failed'

def test_92_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 144, 122, 127)
	assert True, 'Postcondition failed'

def test_93_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 16, 44, 5, 31, 116, 159, 94807)
	time.sleep(94.807)
	mp.GetCommand('isAt').Execute(16, 44, 5, 31, 116, 159, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_94_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 9)
	assert True, 'Postcondition failed'

def test_95_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 211, 208, 182)
	assert True, 'Postcondition failed'

def test_96_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 126, 0, 44, 1, 117, 90, 14006)
	time.sleep(14.006)
	mp.GetCommand('isAt').Execute(126, 0, 44, 1, 117, 90, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_97_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 15)
	assert True, 'Postcondition failed'

def test_98_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 38, 199, 93)
	assert True, 'Postcondition failed'

def test_99_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 15, 61, 25, 48, 259, 135, 98398)
	time.sleep(98.398)
	mp.GetCommand('isAt').Execute(15, 61, 25, 48, 259, 135, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_100_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 14)
	assert True, 'Postcondition failed'

def test_101_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 148, 102, 75)
	assert True, 'Postcondition failed'

def test_102_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 25, 169, 43, 60, 196, 121, 73960)
	time.sleep(73.96)
	mp.GetCommand('isAt').Execute(25, 169, 43, 60, 196, 121, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_103_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 23)
	assert True, 'Postcondition failed'

def test_104_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 171, 143, 179)
	assert True, 'Postcondition failed'

def test_105_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 48, 123, 87, 117, 46, 145, 18476)
	time.sleep(18.476)
	mp.GetCommand('isAt').Execute(48, 123, 87, 117, 46, 145, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_106_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 41)
	assert True, 'Postcondition failed'

def test_107_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 99, 189, 215)
	assert True, 'Postcondition failed'

def test_108_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 91, 46, 91, 45, 175, 62, 64731)
	time.sleep(64.731)
	mp.GetCommand('isAt').Execute(91, 46, 91, 45, 175, 62, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_109_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 7)
	assert True, 'Postcondition failed'

def test_110_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 12, 40, 119)
	assert True, 'Postcondition failed'

def test_111_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 60, 80, 178, 158, 249, 47, 26872)
	time.sleep(26.872)
	mp.GetCommand('isAt').Execute(60, 80, 178, 158, 249, 47, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_112_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 15)
	assert True, 'Postcondition failed'

def test_113_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 127, 120, 251)
	assert True, 'Postcondition failed'

def test_114_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 151, 34, 80, 152, 62, 148, 66132)
	time.sleep(66.132)
	mp.GetCommand('isAt').Execute(151, 34, 80, 152, 62, 148, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_115_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 37)
	assert True, 'Postcondition failed'

def test_116_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 162, 32, 254)
	assert True, 'Postcondition failed'

def test_117_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 45, 78, 8, 101, 182, 79, 25080)
	time.sleep(25.08)
	mp.GetCommand('isAt').Execute(45, 78, 8, 101, 182, 79, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_118_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 49)
	assert True, 'Postcondition failed'

def test_119_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 51, 218, 174)
	assert True, 'Postcondition failed'

def test_120_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 65, 43, 96, 8, 67, 62, 81215)
	time.sleep(81.215)
	mp.GetCommand('isAt').Execute(65, 43, 96, 8, 67, 62, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_121_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 40)
	assert True, 'Postcondition failed'

def test_122_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 74, 201, 241)
	assert True, 'Postcondition failed'

def test_123_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 154, 123, 31, 27, 234, 148, 43835)
	time.sleep(43.835)
	mp.GetCommand('isAt').Execute(154, 123, 31, 27, 234, 148, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_124_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 31)
	assert True, 'Postcondition failed'

def test_125_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 134, 127, 70)
	assert True, 'Postcondition failed'

def test_126_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 61, 70, 59, 81, 126, 39, 38752)
	time.sleep(38.752)
	mp.GetCommand('isAt').Execute(61, 70, 59, 81, 126, 39, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_127_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 32)
	assert True, 'Postcondition failed'

def test_128_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 160, 33, 214)
	assert True, 'Postcondition failed'

def test_129_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 125, 26, 19, 117, 105, 162, 6415)
	time.sleep(6.415)
	mp.GetCommand('isAt').Execute(125, 26, 19, 117, 105, 162, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_130_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 28)
	assert True, 'Postcondition failed'

def test_131_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 210, 241, 230)
	assert True, 'Postcondition failed'

def test_132_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 117, 65, 170, 44, 199, 61, 89790)
	time.sleep(89.79)
	mp.GetCommand('isAt').Execute(117, 65, 170, 44, 199, 61, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_133_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 35)
	assert True, 'Postcondition failed'

def test_134_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 9, 6, 96)
	assert True, 'Postcondition failed'

def test_135_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 123, 129, 18, 137, 73, 41, 30346)
	time.sleep(30.346)
	mp.GetCommand('isAt').Execute(123, 129, 18, 137, 73, 41, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_136_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 41)
	assert True, 'Postcondition failed'

def test_137_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 124, 20, 202)
	assert True, 'Postcondition failed'

def test_138_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 21, 106, 12, 57, 236, 132, 73329)
	time.sleep(73.329)
	mp.GetCommand('isAt').Execute(21, 106, 12, 57, 236, 132, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_139_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 38)
	assert True, 'Postcondition failed'

def test_140_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 150, 73, 137)
	assert True, 'Postcondition failed'

def test_141_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 35, 139, 0, 3, 171, 0, 42789)
	time.sleep(42.789)
	mp.GetCommand('isAt').Execute(35, 139, 0, 3, 171, 0, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_142_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 31)
	assert True, 'Postcondition failed'

def test_143_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 122, 122, 45)
	assert True, 'Postcondition failed'

def test_144_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 133, 42, 140, 64, 85, 163, 8516)
	time.sleep(8.516)
	mp.GetCommand('isAt').Execute(133, 42, 140, 64, 85, 163, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_145_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 21)
	assert True, 'Postcondition failed'

def test_146_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 93, 201, 200)
	assert True, 'Postcondition failed'

def test_147_rotateAllServos(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Arm')
	mp.GetCommand(f'posInicial').Execute(2000)
	mp.GetCommand(f'rotateAllServos').Execute( 162, 121, 149, 152, 165, 2, 76493)
	time.sleep(76.493)
	mp.GetCommand('isAt').Execute(162, 121, 149, 152, 165, 2, 3)
	assert CC1.Machine.Arm.ArmOperations._Observers_.isAtReturnValue.GetCurrentValue(), 'Postcondition failed'

def test_148_buzzerOn(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Buzzer')
	True
	mp.GetCommand(f'buzzerOn').Execute( 41)
	assert True, 'Postcondition failed'

def test_149_lightRGB(CC1):
	mp = CC1.Controller.GetMachinePart('Machine/Board/Light')
	True
	mp.GetCommand(f'lightRGB').Execute( 210, 155, 12)
	assert True, 'Postcondition failed'

