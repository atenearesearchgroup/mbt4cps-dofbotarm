/*
 * generated by Xtext 2.26.0
 */
package org.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.cPTester.Scenario
import org.xtext.cPTester.Given
import org.xtext.cPTester.Initial
import org.xtext.cPTester.Command
import org.xtext.cPTester.rotateServo

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class CPTesterGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		//File to create (functions className and toCode must be implemented)
		fsa.generateFile(resource.className + ".txt", //The extension that we want to have in our generated file
		
		toCode(resource.contents.head as Scenario))
}
	
	def toCode(Scenario scenario) {
		'''
		
		�FOR cmd : scenario.when.command�
			�IF cmd.eClass.name.equals('rotateServo')�
				�var rot = cmd as rotateServo�
					�rot.servo�
					�rot.servo.get(0)�
					�rot.angle.get(0)�
					�rot.time.get(0)�
			�ENDIF�
		�ENDFOR�
		
		
		
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
