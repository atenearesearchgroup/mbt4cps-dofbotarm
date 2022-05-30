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
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.pruebaOperation.Angle;
import org.xtext.pruebaOperation.Angle_res;
import org.xtext.pruebaOperation.Conditions;
import org.xtext.pruebaOperation.Initial;
import org.xtext.pruebaOperation.PruebaOperationPackage;
import org.xtext.pruebaOperation.Result;
import org.xtext.pruebaOperation.Servo;
import org.xtext.pruebaOperation.Time;
import org.xtext.pruebaOperation.isAt;
import org.xtext.pruebaOperation.isAtSingle;
import org.xtext.pruebaOperation.rotateAllServos;
import org.xtext.pruebaOperation.rotateServo;
import org.xtext.services.PruebaOperationGrammarAccess;

@SuppressWarnings("all")
public class PruebaOperationSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PruebaOperationGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == PruebaOperationPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case PruebaOperationPackage.ANGLE:
				sequence_Angle(context, (Angle) semanticObject); 
				return; 
			case PruebaOperationPackage.ANGLE_RES:
				sequence_Angle_res(context, (Angle_res) semanticObject); 
				return; 
			case PruebaOperationPackage.CONDITIONS:
				sequence_Conditions(context, (Conditions) semanticObject); 
				return; 
			case PruebaOperationPackage.INITIAL:
				sequence_Initial(context, (Initial) semanticObject); 
				return; 
			case PruebaOperationPackage.RESULT:
				sequence_Result(context, (Result) semanticObject); 
				return; 
			case PruebaOperationPackage.SERVO:
				sequence_Servo(context, (Servo) semanticObject); 
				return; 
			case PruebaOperationPackage.TIME:
				sequence_Time(context, (Time) semanticObject); 
				return; 
			case PruebaOperationPackage.IS_AT:
				sequence_isAt(context, (isAt) semanticObject); 
				return; 
			case PruebaOperationPackage.IS_AT_SINGLE:
				sequence_isAtSingle(context, (isAtSingle) semanticObject); 
				return; 
			case PruebaOperationPackage.ROTATE_ALL_SERVOS:
				sequence_rotateAllServos(context, (rotateAllServos) semanticObject); 
				return; 
			case PruebaOperationPackage.ROTATE_SERVO:
				sequence_rotateServo(context, (rotateServo) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
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
			if (transientValues.isValueTransient(semanticObject, PruebaOperationPackage.Literals.ANGLE__ANGLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PruebaOperationPackage.Literals.ANGLE__ANGLE));
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
			if (transientValues.isValueTransient(semanticObject, PruebaOperationPackage.Literals.ANGLE_RES__ANGLE_RES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PruebaOperationPackage.Literals.ANGLE_RES__ANGLE_RES));
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
	 *     Servo returns Servo
	 *
	 * Constraint:
	 *     servo=INT
	 * </pre>
	 */
	protected void sequence_Servo(ISerializationContext context, Servo semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PruebaOperationPackage.Literals.SERVO__SERVO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PruebaOperationPackage.Literals.SERVO__SERVO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getServoAccess().getServoINTTerminalRuleCall_0(), semanticObject.getServo());
		feeder.finish();
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
			if (transientValues.isValueTransient(semanticObject, PruebaOperationPackage.Literals.TIME__TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PruebaOperationPackage.Literals.TIME__TIME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTimeAccess().getTimeINTTerminalRuleCall_0(), semanticObject.getTime());
		feeder.finish();
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
	 *     (
	 *         name='isAt' 
	 *         angle1+=Angle 
	 *         angle2+=Angle 
	 *         angle3+=Angle 
	 *         angle4+=Angle 
	 *         angle5+=Angle 
	 *         angle6+=Angle 
	 *         angle_res+=Angle_res
	 *     )
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
	 *     (
	 *         name='rotateAllServos' 
	 *         angle1+=Angle 
	 *         angle2+=Angle 
	 *         angle3+=Angle 
	 *         angle4+=Angle 
	 *         angle5+=Angle 
	 *         angle6+=Angle 
	 *         time+=Time
	 *     )
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