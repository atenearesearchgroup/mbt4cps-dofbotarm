/*
 * generated by Xtext 2.26.0
 */
package org.xtext.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.ide.contentassist.antlr.internal.InternalOperationsParser;
import org.xtext.services.OperationsGrammarAccess;

public class OperationsParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(OperationsGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, OperationsGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getOperationAccess().getAlternatives(), "rule__Operation__Alternatives");
			builder.put(grammarAccess.getConditionsAccess().getAlternatives(), "rule__Conditions__Alternatives");
			builder.put(grammarAccess.getOperationalArmAccess().getGroup(), "rule__OperationalArm__Group__0");
			builder.put(grammarAccess.getRotateServoOperationAccess().getGroup(), "rule__RotateServoOperation__Group__0");
			builder.put(grammarAccess.getRotateAllServosOperationAccess().getGroup(), "rule__RotateAllServosOperation__Group__0");
			builder.put(grammarAccess.getResultAccess().getGroup(), "rule__Result__Group__0");
			builder.put(grammarAccess.getNotLaterThanAccess().getGroup(), "rule__NotLaterThan__Group__0");
			builder.put(grammarAccess.getIsAtSingleOperationAccess().getGroup(), "rule__IsAtSingleOperation__Group__0");
			builder.put(grammarAccess.getIsAtOperationAccess().getGroup(), "rule__IsAtOperation__Group__0");
			builder.put(grammarAccess.getOperationalArmAccess().getNameAssignment_0(), "rule__OperationalArm__NameAssignment_0");
			builder.put(grammarAccess.getOperationalArmAccess().getTIMEAssignment_1(), "rule__OperationalArm__TIMEAssignment_1");
			builder.put(grammarAccess.getOperationalArmAccess().getENDAssignment_2(), "rule__OperationalArm__ENDAssignment_2");
			builder.put(grammarAccess.getRotateServoOperationAccess().getNameAssignment_0(), "rule__RotateServoOperation__NameAssignment_0");
			builder.put(grammarAccess.getRotateServoOperationAccess().getSERVOAssignment_1(), "rule__RotateServoOperation__SERVOAssignment_1");
			builder.put(grammarAccess.getRotateServoOperationAccess().getSEP1Assignment_2(), "rule__RotateServoOperation__SEP1Assignment_2");
			builder.put(grammarAccess.getRotateServoOperationAccess().getANGLEAssignment_3(), "rule__RotateServoOperation__ANGLEAssignment_3");
			builder.put(grammarAccess.getRotateServoOperationAccess().getSEP2Assignment_4(), "rule__RotateServoOperation__SEP2Assignment_4");
			builder.put(grammarAccess.getRotateServoOperationAccess().getTIMEAssignment_5(), "rule__RotateServoOperation__TIMEAssignment_5");
			builder.put(grammarAccess.getRotateServoOperationAccess().getENDAssignment_6(), "rule__RotateServoOperation__ENDAssignment_6");
			builder.put(grammarAccess.getRotateAllServosOperationAccess().getNameAssignment_0(), "rule__RotateAllServosOperation__NameAssignment_0");
			builder.put(grammarAccess.getRotateAllServosOperationAccess().getANGLE1Assignment_1(), "rule__RotateAllServosOperation__ANGLE1Assignment_1");
			builder.put(grammarAccess.getRotateAllServosOperationAccess().getSEP1Assignment_2(), "rule__RotateAllServosOperation__SEP1Assignment_2");
			builder.put(grammarAccess.getRotateAllServosOperationAccess().getANGLE2Assignment_3(), "rule__RotateAllServosOperation__ANGLE2Assignment_3");
			builder.put(grammarAccess.getRotateAllServosOperationAccess().getSEP2Assignment_4(), "rule__RotateAllServosOperation__SEP2Assignment_4");
			builder.put(grammarAccess.getRotateAllServosOperationAccess().getANGLE3Assignment_5(), "rule__RotateAllServosOperation__ANGLE3Assignment_5");
			builder.put(grammarAccess.getRotateAllServosOperationAccess().getSEP3Assignment_6(), "rule__RotateAllServosOperation__SEP3Assignment_6");
			builder.put(grammarAccess.getRotateAllServosOperationAccess().getANGLE4Assignment_7(), "rule__RotateAllServosOperation__ANGLE4Assignment_7");
			builder.put(grammarAccess.getRotateAllServosOperationAccess().getSEP4Assignment_8(), "rule__RotateAllServosOperation__SEP4Assignment_8");
			builder.put(grammarAccess.getRotateAllServosOperationAccess().getANGLE5Assignment_9(), "rule__RotateAllServosOperation__ANGLE5Assignment_9");
			builder.put(grammarAccess.getRotateAllServosOperationAccess().getSEP5Assignment_10(), "rule__RotateAllServosOperation__SEP5Assignment_10");
			builder.put(grammarAccess.getRotateAllServosOperationAccess().getANGLE6Assignment_11(), "rule__RotateAllServosOperation__ANGLE6Assignment_11");
			builder.put(grammarAccess.getRotateAllServosOperationAccess().getSEP6Assignment_12(), "rule__RotateAllServosOperation__SEP6Assignment_12");
			builder.put(grammarAccess.getRotateAllServosOperationAccess().getTIMEAssignment_13(), "rule__RotateAllServosOperation__TIMEAssignment_13");
			builder.put(grammarAccess.getRotateAllServosOperationAccess().getENDAssignment_14(), "rule__RotateAllServosOperation__ENDAssignment_14");
			builder.put(grammarAccess.getResultAccess().getNameAssignment_0(), "rule__Result__NameAssignment_0");
			builder.put(grammarAccess.getResultAccess().getTIMEAssignment_1(), "rule__Result__TIMEAssignment_1");
			builder.put(grammarAccess.getNotLaterThanAccess().getNameAssignment_0(), "rule__NotLaterThan__NameAssignment_0");
			builder.put(grammarAccess.getNotLaterThanAccess().getTIMEAssignment_1(), "rule__NotLaterThan__TIMEAssignment_1");
			builder.put(grammarAccess.getNotLaterThanAccess().getSEPAssignment_2(), "rule__NotLaterThan__SEPAssignment_2");
			builder.put(grammarAccess.getNotLaterThanAccess().getQUERYAssignment_3(), "rule__NotLaterThan__QUERYAssignment_3");
			builder.put(grammarAccess.getIsAtSingleOperationAccess().getNameAssignment_0(), "rule__IsAtSingleOperation__NameAssignment_0");
			builder.put(grammarAccess.getIsAtSingleOperationAccess().getSERVOAssignment_1(), "rule__IsAtSingleOperation__SERVOAssignment_1");
			builder.put(grammarAccess.getIsAtSingleOperationAccess().getSEP1Assignment_2(), "rule__IsAtSingleOperation__SEP1Assignment_2");
			builder.put(grammarAccess.getIsAtSingleOperationAccess().getANGLEAssignment_3(), "rule__IsAtSingleOperation__ANGLEAssignment_3");
			builder.put(grammarAccess.getIsAtSingleOperationAccess().getSEP2Assignment_4(), "rule__IsAtSingleOperation__SEP2Assignment_4");
			builder.put(grammarAccess.getIsAtSingleOperationAccess().getANGLE_RESAssignment_5(), "rule__IsAtSingleOperation__ANGLE_RESAssignment_5");
			builder.put(grammarAccess.getIsAtSingleOperationAccess().getENDAssignment_6(), "rule__IsAtSingleOperation__ENDAssignment_6");
			builder.put(grammarAccess.getIsAtSingleOperationAccess().getVALUEAssignment_7(), "rule__IsAtSingleOperation__VALUEAssignment_7");
			builder.put(grammarAccess.getIsAtOperationAccess().getNameAssignment_0(), "rule__IsAtOperation__NameAssignment_0");
			builder.put(grammarAccess.getIsAtOperationAccess().getANGLE1Assignment_1(), "rule__IsAtOperation__ANGLE1Assignment_1");
			builder.put(grammarAccess.getIsAtOperationAccess().getSEP1Assignment_2(), "rule__IsAtOperation__SEP1Assignment_2");
			builder.put(grammarAccess.getIsAtOperationAccess().getANGLE2Assignment_3(), "rule__IsAtOperation__ANGLE2Assignment_3");
			builder.put(grammarAccess.getIsAtOperationAccess().getSEP2Assignment_4(), "rule__IsAtOperation__SEP2Assignment_4");
			builder.put(grammarAccess.getIsAtOperationAccess().getANGLE3Assignment_5(), "rule__IsAtOperation__ANGLE3Assignment_5");
			builder.put(grammarAccess.getIsAtOperationAccess().getSEP3Assignment_6(), "rule__IsAtOperation__SEP3Assignment_6");
			builder.put(grammarAccess.getIsAtOperationAccess().getANGLE4Assignment_7(), "rule__IsAtOperation__ANGLE4Assignment_7");
			builder.put(grammarAccess.getIsAtOperationAccess().getSEP4Assignment_8(), "rule__IsAtOperation__SEP4Assignment_8");
			builder.put(grammarAccess.getIsAtOperationAccess().getANGLE5Assignment_9(), "rule__IsAtOperation__ANGLE5Assignment_9");
			builder.put(grammarAccess.getIsAtOperationAccess().getSEP5Assignment_10(), "rule__IsAtOperation__SEP5Assignment_10");
			builder.put(grammarAccess.getIsAtOperationAccess().getANGLE6Assignment_11(), "rule__IsAtOperation__ANGLE6Assignment_11");
			builder.put(grammarAccess.getIsAtOperationAccess().getSEP6Assignment_12(), "rule__IsAtOperation__SEP6Assignment_12");
			builder.put(grammarAccess.getIsAtOperationAccess().getANGLE_RESAssignment_13(), "rule__IsAtOperation__ANGLE_RESAssignment_13");
			builder.put(grammarAccess.getIsAtOperationAccess().getENDAssignment_14(), "rule__IsAtOperation__ENDAssignment_14");
			builder.put(grammarAccess.getIsAtOperationAccess().getVALUEAssignment_15(), "rule__IsAtOperation__VALUEAssignment_15");
			builder.put(grammarAccess.getTimeAccess().getTIMEAssignment(), "rule__Time__TIMEAssignment");
			builder.put(grammarAccess.getServoAccess().getSERVOAssignment(), "rule__Servo__SERVOAssignment");
			builder.put(grammarAccess.getAngleAccess().getANGLEAssignment(), "rule__Angle__ANGLEAssignment");
			builder.put(grammarAccess.getAngle_resAccess().getANGLE_RESAssignment(), "rule__Angle_res__ANGLE_RESAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private OperationsGrammarAccess grammarAccess;

	@Override
	protected InternalOperationsParser createParser() {
		InternalOperationsParser result = new InternalOperationsParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public OperationsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(OperationsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
