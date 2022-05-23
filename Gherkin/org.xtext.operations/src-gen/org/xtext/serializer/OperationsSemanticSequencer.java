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
import org.xtext.operations.OperationsPackage;
import org.xtext.operations.Servo;
import org.xtext.services.OperationsGrammarAccess;

@SuppressWarnings("all")
public class OperationsSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private OperationsGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == OperationsPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case OperationsPackage.SERVO:
				sequence_Servo(context, (Servo) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
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
			if (transientValues.isValueTransient(semanticObject, OperationsPackage.Literals.SERVO__SERVO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OperationsPackage.Literals.SERVO__SERVO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getServoAccess().getServoINTTerminalRuleCall_0(), semanticObject.getServo());
		feeder.finish();
	}
	
	
}
