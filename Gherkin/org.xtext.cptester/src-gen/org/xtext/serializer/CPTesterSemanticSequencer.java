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
import org.xtext.cPTester.Angle;
import org.xtext.cPTester.Angle_res;
import org.xtext.cPTester.CPTesterPackage;
import org.xtext.cPTester.Conditions;
import org.xtext.cPTester.Given;
import org.xtext.cPTester.Initial;
import org.xtext.cPTester.Result;
import org.xtext.cPTester.Scenario;
import org.xtext.cPTester.Servo;
import org.xtext.cPTester.Then;
import org.xtext.cPTester.Time;
import org.xtext.cPTester.When;
import org.xtext.cPTester.isAt;
import org.xtext.cPTester.isAtSingle;
import org.xtext.cPTester.rotateAllServos;
import org.xtext.cPTester.rotateServo;
import org.xtext.operations.OperationsPackage;
import org.xtext.operations.Prueba;
import org.xtext.services.CPTesterGrammarAccess;

@SuppressWarnings("all")
public class CPTesterSemanticSequencer extends OperationsSemanticSequencer {

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
			case CPTesterPackage.ANGLE:
				sequence_Angle(context, (Angle) semanticObject); 
				return; 
			case CPTesterPackage.ANGLE_RES:
				sequence_Angle_res(context, (Angle_res) semanticObject); 
				return; 
			case CPTesterPackage.CONDITIONS:
				sequence_Conditions(context, (Conditions) semanticObject); 
				return; 
			case CPTesterPackage.GIVEN:
				sequence_Given(context, (Given) semanticObject); 
				return; 
			case CPTesterPackage.INITIAL:
				sequence_Initial(context, (Initial) semanticObject); 
				return; 
			case CPTesterPackage.RESULT:
				sequence_Result(context, (Result) semanticObject); 
				return; 
			case CPTesterPackage.SCENARIO:
				sequence_Scenario(context, (Scenario) semanticObject); 
				return; 
			case CPTesterPackage.SERVO:
				sequence_Servo(context, (Servo) semanticObject); 
				return; 
			case CPTesterPackage.THEN:
				sequence_Then(context, (Then) semanticObject); 
				return; 
			case CPTesterPackage.TIME:
				sequence_Time(context, (Time) semanticObject); 
				return; 
			case CPTesterPackage.WHEN:
				sequence_When(context, (When) semanticObject); 
				return; 
			case CPTesterPackage.IS_AT:
				sequence_isAt(context, (isAt) semanticObject); 
				return; 
			case CPTesterPackage.IS_AT_SINGLE:
				sequence_isAtSingle(context, (isAtSingle) semanticObject); 
				return; 
			case CPTesterPackage.ROTATE_ALL_SERVOS:
				sequence_rotateAllServos(context, (rotateAllServos) semanticObject); 
				return; 
			case CPTesterPackage.ROTATE_SERVO:
				sequence_rotateServo(context, (rotateServo) semanticObject); 
				return; 
			}
		else if (epackage == OperationsPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case OperationsPackage.PRUEBA:
				sequence_Prueba(context, (Prueba) semanticObject); 
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
	 *     (name='AND' conditions+=Conditions solution+=Solution)
	 * </pre>
	 */
	protected void sequence_And(ISerializationContext context, And semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Angle returns Angle
	 *
	 * Constraint:
	 *     angle=INT
	 * </pre>
	 */
	protected void sequence_Angle(ISerializationContext context, Angle semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CPTesterPackage.Literals.ANGLE__ANGLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPTesterPackage.Literals.ANGLE__ANGLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAngleAccess().getAngleINTTerminalRuleCall_0(), semanticObject.getAngle());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Angle_res returns Angle_res
	 *
	 * Constraint:
	 *     angle_res=INT
	 * </pre>
	 */
	protected void sequence_Angle_res(ISerializationContext context, Angle_res semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CPTesterPackage.Literals.ANGLE_RES__ANGLE_RES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPTesterPackage.Literals.ANGLE_RES__ANGLE_RES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAngle_resAccess().getAngle_resINTTerminalRuleCall_0(), semanticObject.getAngle_res());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Conditions returns Conditions
	 *
	 * Constraint:
	 *     (name='NotLaterThan' time+=Time)
	 * </pre>
	 */
	protected void sequence_Conditions(ISerializationContext context, Conditions semanticObject) {
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
	 *     Initial returns Initial
	 *
	 * Constraint:
	 *     (name='posInicial' time+=Time)
	 * </pre>
	 */
	protected void sequence_Initial(ISerializationContext context, Initial semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Result returns Result
	 *
	 * Constraint:
	 *     (name='result' time+=Time)
	 * </pre>
	 */
	protected void sequence_Result(ISerializationContext context, Result semanticObject) {
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
	 *     Servo returns Servo
	 *
	 * Constraint:
	 *     servo=INT
	 * </pre>
	 */
	protected void sequence_Servo(ISerializationContext context, Servo semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CPTesterPackage.Literals.SERVO__SERVO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPTesterPackage.Literals.SERVO__SERVO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getServoAccess().getServoINTTerminalRuleCall_0(), semanticObject.getServo());
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
	 *     Time returns Time
	 *
	 * Constraint:
	 *     time=INT
	 * </pre>
	 */
	protected void sequence_Time(ISerializationContext context, Time semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CPTesterPackage.Literals.TIME__TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CPTesterPackage.Literals.TIME__TIME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTimeAccess().getTimeINTTerminalRuleCall_0(), semanticObject.getTime());
		feeder.finish();
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
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Solution returns isAtSingle
	 *     isAtSingle returns isAtSingle
	 *
	 * Constraint:
	 *     (name='isAtSingle' servo+=Servo angle+=Angle angle_res+=Angle_res)
	 * </pre>
	 */
	protected void sequence_isAtSingle(ISerializationContext context, isAtSingle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Solution returns isAt
	 *     isAt returns isAt
	 *
	 * Constraint:
	 *     (name='isAt' angle+=Angle+ angle_res+=Angle_res)
	 * </pre>
	 */
	protected void sequence_isAt(ISerializationContext context, isAt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Command returns rotateAllServos
	 *     rotateAllServos returns rotateAllServos
	 *
	 * Constraint:
	 *     (name='rotateAllServos' angle+=Angle+ time+=Time)
	 * </pre>
	 */
	protected void sequence_rotateAllServos(ISerializationContext context, rotateAllServos semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Command returns rotateServo
	 *     rotateServo returns rotateServo
	 *
	 * Constraint:
	 *     (name='rotateServo' servo+=Servo angle+=Angle time+=Time)
	 * </pre>
	 */
	protected void sequence_rotateServo(ISerializationContext context, rotateServo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
