/*
 * generated by Xtext 2.26.0
 */
package org.xtext.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ConditionGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ConditionsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Condition.Conditions");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cNameNotLaterThanKeyword_0_0 = (Keyword)cNameAssignment_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTimeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTimeTimeParserRuleCall_2_0 = (RuleCall)cTimeAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Conditions:
		//    name='NotLaterThan'
		//    '('
		//    (time+=Time)
		//    ')'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name='NotLaterThan'
		//'('
		//(time+=Time)
		//')'
		public Group getGroup() { return cGroup; }
		
		//name='NotLaterThan'
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//'NotLaterThan'
		public Keyword getNameNotLaterThanKeyword_0_0() { return cNameNotLaterThanKeyword_0_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//(time+=Time)
		public Assignment getTimeAssignment_2() { return cTimeAssignment_2; }
		
		//Time
		public RuleCall getTimeTimeParserRuleCall_2_0() { return cTimeTimeParserRuleCall_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	
	
	private final ConditionsElements pConditions;
	
	private final Grammar grammar;
	
	private final SolutionGrammarAccess gaSolution;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ConditionGrammarAccess(GrammarProvider grammarProvider,
			SolutionGrammarAccess gaSolution,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaSolution = gaSolution;
		this.gaTerminals = gaTerminals;
		this.pConditions = new ConditionsElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.Condition".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public SolutionGrammarAccess getSolutionGrammarAccess() {
		return gaSolution;
	}
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Conditions:
	//    name='NotLaterThan'
	//    '('
	//    (time+=Time)
	//    ')'
	//;
	public ConditionsElements getConditionsAccess() {
		return pConditions;
	}
	
	public ParserRule getConditionsRule() {
		return getConditionsAccess().getRule();
	}
	
	//Solution:
	//    isAtSingle | isAt
	//;
	public SolutionGrammarAccess.SolutionElements getSolutionAccess() {
		return gaSolution.getSolutionAccess();
	}
	
	public ParserRule getSolutionRule() {
		return getSolutionAccess().getRule();
	}
	
	//isAtSingle:
	//    name='isAtSingle'
	//    '('
	//    (servo+=Servo)
	//    ','
	//    (angle+=Angle)
	//    ','
	//    (angle_res+=Angle_res)
	//    ')'
	//;
	public SolutionGrammarAccess.IsAtSingleElements getIsAtSingleAccess() {
		return gaSolution.getIsAtSingleAccess();
	}
	
	public ParserRule getIsAtSingleRule() {
		return getIsAtSingleAccess().getRule();
	}
	
	//isAt:
	//    name='isAt'
	//    '('
	//    (angle1+=Angle)
	//    ','
	//    (angle2+=Angle)
	//    ','
	//    (angle3+=Angle)
	//    ','
	//    (angle4+=Angle)
	//    ','
	//    (angle5+=Angle)
	//    ','
	//    (angle6+=Angle)
	//    ','
	//    (angle_res+=Angle_res)
	//    ')'
	//;
	public SolutionGrammarAccess.IsAtElements getIsAtAccess() {
		return gaSolution.getIsAtAccess();
	}
	
	public ParserRule getIsAtRule() {
		return getIsAtAccess().getRule();
	}
	
	//Angle_res:
	//    angle_res=INT
	//;
	public SolutionGrammarAccess.Angle_resElements getAngle_resAccess() {
		return gaSolution.getAngle_resAccess();
	}
	
	public ParserRule getAngle_resRule() {
		return getAngle_resAccess().getRule();
	}
	
	//Angle:
	//    angle=INT
	//;
	public SolutionGrammarAccess.AngleElements getAngleAccess() {
		return gaSolution.getAngleAccess();
	}
	
	public ParserRule getAngleRule() {
		return getAngleAccess().getRule();
	}
	
	//Time:
	//    time=INT
	//;
	public SolutionGrammarAccess.TimeElements getTimeAccess() {
		return gaSolution.getTimeAccess();
	}
	
	public ParserRule getTimeRule() {
		return getTimeAccess().getRule();
	}
	
	//Servo:
	//    servo=INT
	//;
	public SolutionGrammarAccess.ServoElements getServoAccess() {
		return gaSolution.getServoAccess();
	}
	
	public ParserRule getServoRule() {
		return getServoAccess().getRule();
	}
	
	//enum State:
	//    TRUE='true' | FALSE='false'
	//;
	public SolutionGrammarAccess.StateElements getStateAccess() {
		return gaSolution.getStateAccess();
	}
	
	public EnumRule getStateRule() {
		return getStateAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
