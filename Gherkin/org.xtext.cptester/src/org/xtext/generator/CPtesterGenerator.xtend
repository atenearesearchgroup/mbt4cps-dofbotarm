/*
 * generated by Xtext 2.26.0
 */
package org.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.cPtester.Scenario
import org.xtext.operations.Angle
import org.xtext.operations.Servo
import org.xtext.operations.Time
import org.xtext.operations.rotateAllServos
import org.xtext.operations.rotateServo

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class CPtesterGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		//File to create (functions className and toCode must be implemented)
		fsa.generateFile(resource.className + ".txt", //The extension that we want to have in our generated file
		
		toCode(resource.contents.head as Scenario))
}
	
	def toCode(Scenario scenario) {
		'''
		�var counterTime = 0�
		�var counterLength = 0�
		
		Class: Machine
			StateMachine: �scenario.surname�
				PseudoState: �FOR giv : scenario.given.initial��giv.eClass.name��ENDFOR�
				PseudoState: Final
				PseudoState: Error
				
				Transition: (�FOR giv : scenario.given.initial��giv.eClass.name��ENDFOR�->�scenario.given.eClass.name�)
						Guard: []
				
				State: �scenario.given.eClass.name�
						Activity: Arm.BaseServo.ServosOperations.�FOR giv : scenario.given.initial��giv.name�(�FOR tm : giv.time��var value = tm as Time��value.time��{counterTime+=value.time; "" }��ENDFOR�)�ENDFOR�
						�FOR andG : scenario.andGiven��FOR cmd : andG.command�
						�IF cmd.eClass.name.equals('rotateServo')��var rot = cmd as rotateServo�
						Activity: Arm.BaseServo.ServosOperations.�cmd.eClass.name�(�FOR ser : rot.servo��var value = ser as Servo��value.servo��ENDFOR�, �FOR ang : rot.angle��var value = ang as Angle��value.angle��ENDFOR�, �FOR tmp : rot.time��var value = tmp as Time��value.time��{counterTime+=value.time; "" }��ENDFOR�)
						�ELSEIF cmd.eClass.name.equals('rotateAllServos')��var rot = cmd as rotateAllServos�
						Activity: Arm.BaseServo.ServosOperations.�cmd.eClass.name�(�FOR ang1 : rot.angle1��var value = ang1 as Angle��value.angle��ENDFOR�, �FOR ang2 : rot.angle2��var value = ang2 as Angle��value.angle��ENDFOR�, �FOR ang3 : rot.angle3��var value = ang3 as Angle��value.angle��ENDFOR�, �FOR ang4 : rot.angle4��var value = ang4 as Angle��value.angle��ENDFOR�, �FOR ang5 : rot.angle5��var value = ang5 as Angle��value.angle��ENDFOR�, �FOR ang6 : rot.angle6��var value = ang6 as Angle��value.angle��ENDFOR�, �FOR tmp : rot.time��var value = tmp as Time��value.time��{counterTime+=value.time; "" }��ENDFOR�)
						�ENDIF��ENDFOR��ENDFOR�
							
				State: �scenario.given.eClass.name�Warning
						Activity: MessReport(mWarning, "Warning Time")
				
				Transition: (�scenario.given.eClass.name�Warning->�scenario.given.eClass.name�)
						Guard: []			
							
				Transition: (�scenario.given.eClass.name�->�scenario.given.eClass.name�Warning)
						Guard: Arm.BaseServo.ServosOperations.�FOR giv : scenario.given.initial��FOR tm : giv.time��tm.eClass.name�(�counterTime��ENDFOR�)�ENDFOR�
							
				Transition: (�scenario.given.eClass.name�->�scenario.when.eClass.name�)				
						�IF scenario.andGiven.empty�
						Guard: Arm.BaseServo.ServosOperations.isAt(90,90,90,90,90,90,2)
						�ELSE�					
						�FOR andG : scenario.andGiven�
						�FOR cmd : andG.command�
						�{counterLength++; "" }�
						�IF counterLength == scenario.andGiven.length �
						�IF cmd.name.equals('rotateServo')��var ias = cmd as rotateServo�
						Guard: Arm.BaseServo.ServosOperations.isAtSingle(�FOR ser : ias.servo��var value = ser as Servo��value.servo��ENDFOR�, �FOR ang : ias.angle��var value = ang as Angle��value.angle��ENDFOR�, 2)
						�ELSEIF cmd.name.equals('rotateAllServos')��var ia = cmd as rotateAllServos�						
						Guard: Arm.BaseServo.ServosOperations.isAt(�FOR ang : ia.angle1��var value = ang as Angle��value.angle��ENDFOR�, �FOR ang : ia.angle2��var value = ang as Angle��value.angle��ENDFOR�, �FOR ang : ia.angle3��var value = ang as Angle��value.angle��ENDFOR�, �FOR ang : ia.angle4��var value = ang as Angle��value.angle��ENDFOR�, �FOR ang : ia.angle5��var value = ang as Angle��value.angle��ENDFOR�, �FOR ang : ia.angle6��var value = ang as Angle��value.angle��ENDFOR�, 2)
						�ENDIF��ENDIF��ENDFOR��ENDFOR��ENDIF�

		''' 
	}
	
	
//We define a function className that will be used to obtain the name of the file with extension 'wrld�

def className(Resource res){
//We don't need to specify variable types

var name = res.URI.lastSegment //We assign the name of the ctry file
return name.substring(0, name.indexOf('.')) //And return the part that is before the extension of the file
//For instance, if we have sample.wlrd, then we obtain name sample.txt
}
}