/*
 * generated by Xtext 2.26.0
 */
package org.xtext.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.cPTester.And;
import org.xtext.cPTester.CPTesterPackage;
import org.xtext.cPTester.Given;
import org.xtext.cPTester.Scenario;
import org.xtext.cPTester.Then;
import org.xtext.cPTester.When;
import org.xtext.command.CommandPackage;
import org.xtext.command.rotateAllServos;
import org.xtext.command.rotateServo;
import org.xtext.condition.ConditionPackage;
import org.xtext.condition.Conditions;
import org.xtext.initial.Initial;
import org.xtext.initial.InitialPackage;
import org.xtext.result.Result;
import org.xtext.result.ResultPackage;
import org.xtext.services.CPTesterGrammarAccess;
import org.xtext.solution.Angle;
import org.xtext.solution.Angle_res;
import org.xtext.solution.Servo;
import org.xtext.solution.SolutionPackage;
import org.xtext.solution.Time;
import org.xtext.solution.isAt;
import org.xtext.solution.isAtSingle;

@SuppressWarnings("all")
public class CPTesterSemanticSequencer extends InitialSemanticSequencer {

	@Inject
	private CPTesterGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CPTesterPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CPTesterPackage.AND:
				sequence_And(context, (And) semanticObject); 
				return; 
			case CPTesterPackage.GIVEN:
				sequence_Given(context, (Given) semanticObject); 
				return; 
			case CPTesterPackage.SCENARIO:
				sequence_Scenario(context, (Scenario) semanticObject); 
				return; 
			case CPTesterPackage.THEN:
				sequence_Then(context, (Then) semanticObject); 
				return; 
			case CPTesterPackage.WHEN:
				sequence_When(context, (When) semanticObject); 
				return; 
			}
		else if (epackage == CommandPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CommandPackage.ROTATE_ALL_SERVOS:
				sequence_rotateAllServos(context, (rotateAllServos) semanticObject); 
				return; 
			case CommandPackage.ROTATE_SERVO:
				sequence_rotateServo(context, (rotateServo) semanticObject); 
				return; 
			}
		else if (epackage == ConditionPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ConditionPackage.CONDITIONS:
				sequence_Conditions(context, (Conditions) semanticObject); 
				return; 
			}
		else if (epackage == InitialPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case InitialPackage.INITIAL:
				sequence_Initial(context, (Initial) semanticObject); 
				return; 
			}
		else if (epackage == ResultPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ResultPackage.RESULT:
				sequence_Result(context, (Result) semanticObject); 
				return; 
			}
		else if (epackage == SolutionPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SolutionPackage.ANGLE:
				sequence_Angle(context, (Angle) semanticObject); 
				return; 
			case SolutionPackage.ANGLE_RES:
				sequence_Angle_res(context, (Angle_res) semanticObject); 
				return; 
			case SolutionPackage.SERVO:
				sequence_Servo(context, (Servo) semanticObject); 
				return; 
			case SolutionPackage.TIME:
				sequence_Time(context, (Time) semanticObject); 
				return; 
			case SolutionPackage.IS_AT:
				sequence_isAt(context, (isAt) semanticObject); 
				return; 
			case SolutionPackage.IS_AT_SINGLE:
				sequence_isAtSingle(context, (isAtSingle) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     And returns And
	 *
	 * Constraint:
	 *     (name='AND' conditions+=Conditions solution+=Solution state=State)
	 * </pre>
	 */
	protected void sequence_And(ISerializationContext context, And semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Given returns Given
	 *
	 * Constraint:
	 *     (name='GIVEN' initial+=Initial)
	 * </pre>
	 */
	protected void sequence_Given(ISerializationContext context, Given semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Scenario returns Scenario
	 *
	 * Constraint:
	 *     (surname=STRING given=Given when=When then=Then and=And)
	 * </pre>
	 */
	protected void sequence_Scenario(ISerializationContext context, Scenario semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CPTesterPackage.Literals.SCENARIO__SURNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPTesterPackage.Literals.SCENARIO__SURNAME));
			if (transientValues.isValueTransient(semanticObject, CPTesterPackage.Literals.SCENARIO__GIVEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPTesterPackage.Literals.SCENARIO__GIVEN));
			if (transientValues.isValueTransient(semanticObject, CPTesterPackage.Literals.SCENARIO__WHEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPTesterPackage.Literals.SCENARIO__WHEN));
			if (transientValues.isValueTransient(semanticObject, CPTesterPackage.Literals.SCENARIO__THEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPTesterPackage.Literals.SCENARIO__THEN));
			if (transientValues.isValueTransient(semanticObject, CPTesterPackage.Literals.SCENARIO__AND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPTesterPackage.Literals.SCENARIO__AND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getScenarioAccess().getSurnameSTRINGTerminalRuleCall_1_0(), semanticObject.getSurname());
		feeder.accept(grammarAccess.getScenarioAccess().getGivenGivenParserRuleCall_3_0(), semanticObject.getGiven());
		feeder.accept(grammarAccess.getScenarioAccess().getWhenWhenParserRuleCall_4_0(), semanticObject.getWhen());
		feeder.accept(grammarAccess.getScenarioAccess().getThenThenParserRuleCall_5_0(), semanticObject.getThen());
		feeder.accept(grammarAccess.getScenarioAccess().getAndAndParserRuleCall_6_0(), semanticObject.getAnd());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Then returns Then
	 *
	 * Constraint:
	 *     (name='THEN' result+=Result)
	 * </pre>
	 */
	protected void sequence_Then(ISerializationContext context, Then semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     When returns When
	 *
	 * Constraint:
	 *     (name='WHEN' command+=Command)
	 * </pre>
	 */
	protected void sequence_When(ISerializationContext context, When semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
