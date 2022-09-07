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
import org.xtext.cPtester.And;
import org.xtext.cPtester.AndWhen;
import org.xtext.cPtester.CPtesterPackage;
import org.xtext.cPtester.Given;
import org.xtext.cPtester.Scenario;
import org.xtext.cPtester.Then;
import org.xtext.cPtester.When;
import org.xtext.operations.Angle;
import org.xtext.operations.Angle_res;
import org.xtext.operations.B;
import org.xtext.operations.Color;
import org.xtext.operations.Conditions;
import org.xtext.operations.G;
import org.xtext.operations.H_max;
import org.xtext.operations.H_min;
import org.xtext.operations.Initial;
import org.xtext.operations.OperationsPackage;
import org.xtext.operations.R;
import org.xtext.operations.Result;
import org.xtext.operations.S_max;
import org.xtext.operations.S_min;
import org.xtext.operations.Servo;
import org.xtext.operations.Time;
import org.xtext.operations.V_max;
import org.xtext.operations.V_min;
import org.xtext.operations.buzzerOff;
import org.xtext.operations.buzzerOn;
import org.xtext.operations.calibration;
import org.xtext.operations.cameraColor;
import org.xtext.operations.isAt;
import org.xtext.operations.isAtSingle;
import org.xtext.operations.lightRGB;
import org.xtext.operations.readAllServos;
import org.xtext.operations.readServo;
import org.xtext.operations.rotateAllServos;
import org.xtext.operations.rotateServo;
import org.xtext.services.CPtesterGrammarAccess;

@SuppressWarnings("all")
public class CPtesterSemanticSequencer extends OperationsSemanticSequencer {

	@Inject
	private CPtesterGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CPtesterPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CPtesterPackage.AND:
				sequence_And(context, (And) semanticObject); 
				return; 
			case CPtesterPackage.AND_WHEN:
				sequence_AndWhen(context, (AndWhen) semanticObject); 
				return; 
			case CPtesterPackage.GIVEN:
				sequence_Given(context, (Given) semanticObject); 
				return; 
			case CPtesterPackage.SCENARIO:
				sequence_Scenario(context, (Scenario) semanticObject); 
				return; 
			case CPtesterPackage.THEN:
				sequence_Then(context, (Then) semanticObject); 
				return; 
			case CPtesterPackage.WHEN:
				sequence_When(context, (When) semanticObject); 
				return; 
			}
		else if (epackage == OperationsPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case OperationsPackage.ANGLE:
				sequence_Angle(context, (Angle) semanticObject); 
				return; 
			case OperationsPackage.ANGLE_RES:
				sequence_Angle_res(context, (Angle_res) semanticObject); 
				return; 
			case OperationsPackage.B:
				sequence_B(context, (B) semanticObject); 
				return; 
			case OperationsPackage.COLOR:
				sequence_Color(context, (Color) semanticObject); 
				return; 
			case OperationsPackage.CONDITIONS:
				sequence_Conditions(context, (Conditions) semanticObject); 
				return; 
			case OperationsPackage.G:
				sequence_G(context, (G) semanticObject); 
				return; 
			case OperationsPackage.HMAX:
				sequence_H_max(context, (H_max) semanticObject); 
				return; 
			case OperationsPackage.HMIN:
				sequence_H_min(context, (H_min) semanticObject); 
				return; 
			case OperationsPackage.INITIAL:
				sequence_Initial(context, (Initial) semanticObject); 
				return; 
			case OperationsPackage.R:
				sequence_R(context, (R) semanticObject); 
				return; 
			case OperationsPackage.RESULT:
				sequence_Result(context, (Result) semanticObject); 
				return; 
			case OperationsPackage.SMAX:
				sequence_S_max(context, (S_max) semanticObject); 
				return; 
			case OperationsPackage.SMIN:
				sequence_S_min(context, (S_min) semanticObject); 
				return; 
			case OperationsPackage.SERVO:
				sequence_Servo(context, (Servo) semanticObject); 
				return; 
			case OperationsPackage.TIME:
				sequence_Time(context, (Time) semanticObject); 
				return; 
			case OperationsPackage.VMAX:
				sequence_V_max(context, (V_max) semanticObject); 
				return; 
			case OperationsPackage.VMIN:
				sequence_V_min(context, (V_min) semanticObject); 
				return; 
			case OperationsPackage.BUZZER_OFF:
				sequence_buzzerOff(context, (buzzerOff) semanticObject); 
				return; 
			case OperationsPackage.BUZZER_ON:
				sequence_buzzerOn(context, (buzzerOn) semanticObject); 
				return; 
			case OperationsPackage.CALIBRATION:
				sequence_calibration(context, (calibration) semanticObject); 
				return; 
			case OperationsPackage.CAMERA_COLOR:
				sequence_cameraColor(context, (cameraColor) semanticObject); 
				return; 
			case OperationsPackage.IS_AT:
				sequence_isAt(context, (isAt) semanticObject); 
				return; 
			case OperationsPackage.IS_AT_SINGLE:
				sequence_isAtSingle(context, (isAtSingle) semanticObject); 
				return; 
			case OperationsPackage.LIGHT_RGB:
				sequence_lightRGB(context, (lightRGB) semanticObject); 
				return; 
			case OperationsPackage.READ_ALL_SERVOS:
				sequence_readAllServos(context, (readAllServos) semanticObject); 
				return; 
			case OperationsPackage.READ_SERVO:
				sequence_readServo(context, (readServo) semanticObject); 
				return; 
			case OperationsPackage.ROTATE_ALL_SERVOS:
				sequence_rotateAllServos(context, (rotateAllServos) semanticObject); 
				return; 
			case OperationsPackage.ROTATE_SERVO:
				sequence_rotateServo(context, (rotateServo) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     AndWhen returns AndWhen
	 *
	 * Constraint:
	 *     (name='AND' command+=Command)
	 * </pre>
	 */
	protected void sequence_AndWhen(ISerializationContext context, AndWhen semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (
	 *         surname=STRING 
	 *         given=Given 
	 *         andGiven+=AndWhen* 
	 *         when=When 
	 *         then=Then 
	 *         and+=And*
	 *     )
	 * </pre>
	 */
	protected void sequence_Scenario(ISerializationContext context, Scenario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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