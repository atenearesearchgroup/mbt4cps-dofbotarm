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
import org.xtext.ide.contentassist.antlr.internal.InternalCPTesterParser;
import org.xtext.services.CPTesterGrammarAccess;

public class CPTesterParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(CPTesterGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, CPTesterGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getCommandAccess().getAlternatives(), "rule__Command__Alternatives");
			builder.put(grammarAccess.getSolutionAccess().getAlternatives(), "rule__Solution__Alternatives");
			builder.put(grammarAccess.getScenarioAccess().getGroup(), "rule__Scenario__Group__0");
			builder.put(grammarAccess.getGivenAccess().getGroup(), "rule__Given__Group__0");
			builder.put(grammarAccess.getInitialAccess().getGroup(), "rule__Initial__Group__0");
			builder.put(grammarAccess.getWhenAccess().getGroup(), "rule__When__Group__0");
			builder.put(grammarAccess.getRotateServoAccess().getGroup(), "rule__RotateServo__Group__0");
			builder.put(grammarAccess.getRotateAllServosAccess().getGroup(), "rule__RotateAllServos__Group__0");
			builder.put(grammarAccess.getThenAccess().getGroup(), "rule__Then__Group__0");
			builder.put(grammarAccess.getResultAccess().getGroup(), "rule__Result__Group__0");
			builder.put(grammarAccess.getAndAccess().getGroup(), "rule__And__Group__0");
			builder.put(grammarAccess.getConditionsAccess().getGroup(), "rule__Conditions__Group__0");
			builder.put(grammarAccess.getIsAtSingleAccess().getGroup(), "rule__IsAtSingle__Group__0");
			builder.put(grammarAccess.getIsAtAccess().getGroup(), "rule__IsAt__Group__0");
			builder.put(grammarAccess.getScenarioAccess().getSurnameAssignment_1(), "rule__Scenario__SurnameAssignment_1");
			builder.put(grammarAccess.getScenarioAccess().getGivenAssignment_3(), "rule__Scenario__GivenAssignment_3");
			builder.put(grammarAccess.getScenarioAccess().getWhenAssignment_4(), "rule__Scenario__WhenAssignment_4");
			builder.put(grammarAccess.getScenarioAccess().getThenAssignment_5(), "rule__Scenario__ThenAssignment_5");
			builder.put(grammarAccess.getScenarioAccess().getAndAssignment_6(), "rule__Scenario__AndAssignment_6");
			builder.put(grammarAccess.getGivenAccess().getNameAssignment_0(), "rule__Given__NameAssignment_0");
			builder.put(grammarAccess.getGivenAccess().getInitialAssignment_1(), "rule__Given__InitialAssignment_1");
			builder.put(grammarAccess.getInitialAccess().getNameAssignment_0(), "rule__Initial__NameAssignment_0");
			builder.put(grammarAccess.getInitialAccess().getTimeAssignment_2(), "rule__Initial__TimeAssignment_2");
			builder.put(grammarAccess.getWhenAccess().getNameAssignment_0(), "rule__When__NameAssignment_0");
			builder.put(grammarAccess.getWhenAccess().getCommandAssignment_1(), "rule__When__CommandAssignment_1");
			builder.put(grammarAccess.getRotateServoAccess().getNameAssignment_0(), "rule__RotateServo__NameAssignment_0");
			builder.put(grammarAccess.getRotateServoAccess().getServoAssignment_2(), "rule__RotateServo__ServoAssignment_2");
			builder.put(grammarAccess.getRotateServoAccess().getAngleAssignment_4(), "rule__RotateServo__AngleAssignment_4");
			builder.put(grammarAccess.getRotateServoAccess().getTimeAssignment_6(), "rule__RotateServo__TimeAssignment_6");
			builder.put(grammarAccess.getRotateAllServosAccess().getNameAssignment_0(), "rule__RotateAllServos__NameAssignment_0");
			builder.put(grammarAccess.getRotateAllServosAccess().getAngleAssignment_2(), "rule__RotateAllServos__AngleAssignment_2");
			builder.put(grammarAccess.getRotateAllServosAccess().getTimeAssignment_4(), "rule__RotateAllServos__TimeAssignment_4");
			builder.put(grammarAccess.getThenAccess().getNameAssignment_0(), "rule__Then__NameAssignment_0");
			builder.put(grammarAccess.getThenAccess().getResultAssignment_1(), "rule__Then__ResultAssignment_1");
			builder.put(grammarAccess.getResultAccess().getNameAssignment_0(), "rule__Result__NameAssignment_0");
			builder.put(grammarAccess.getResultAccess().getTimeAssignment_2(), "rule__Result__TimeAssignment_2");
			builder.put(grammarAccess.getAndAccess().getNameAssignment_0(), "rule__And__NameAssignment_0");
			builder.put(grammarAccess.getAndAccess().getConditionsAssignment_1(), "rule__And__ConditionsAssignment_1");
			builder.put(grammarAccess.getAndAccess().getSolutionAssignment_2(), "rule__And__SolutionAssignment_2");
			builder.put(grammarAccess.getConditionsAccess().getNameAssignment_0(), "rule__Conditions__NameAssignment_0");
			builder.put(grammarAccess.getConditionsAccess().getTimeAssignment_2(), "rule__Conditions__TimeAssignment_2");
			builder.put(grammarAccess.getIsAtSingleAccess().getNameAssignment_0(), "rule__IsAtSingle__NameAssignment_0");
			builder.put(grammarAccess.getIsAtSingleAccess().getServoAssignment_2(), "rule__IsAtSingle__ServoAssignment_2");
			builder.put(grammarAccess.getIsAtSingleAccess().getAngleAssignment_4(), "rule__IsAtSingle__AngleAssignment_4");
			builder.put(grammarAccess.getIsAtSingleAccess().getAngle_resAssignment_6(), "rule__IsAtSingle__Angle_resAssignment_6");
			builder.put(grammarAccess.getIsAtAccess().getNameAssignment_0(), "rule__IsAt__NameAssignment_0");
			builder.put(grammarAccess.getIsAtAccess().getAngleAssignment_2(), "rule__IsAt__AngleAssignment_2");
			builder.put(grammarAccess.getIsAtAccess().getAngle_resAssignment_4(), "rule__IsAt__Angle_resAssignment_4");
			builder.put(grammarAccess.getAngle_resAccess().getAngle_resAssignment(), "rule__Angle_res__Angle_resAssignment");
			builder.put(grammarAccess.getAngleAccess().getAngleAssignment(), "rule__Angle__AngleAssignment");
			builder.put(grammarAccess.getTimeAccess().getTimeAssignment(), "rule__Time__TimeAssignment");
			builder.put(grammarAccess.getServoAccess().getServoAssignment(), "rule__Servo__ServoAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private CPTesterGrammarAccess grammarAccess;

	@Override
	protected InternalCPTesterParser createParser() {
		InternalCPTesterParser result = new InternalCPTesterParser(null);
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

	public CPTesterGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CPTesterGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
