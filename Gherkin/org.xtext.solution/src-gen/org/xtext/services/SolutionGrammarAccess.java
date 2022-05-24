/*
 * generated by Xtext 2.26.0
 */
package org.xtext.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
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
public class SolutionGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class SolutionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Solution.Solution");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIsAtSingleParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIsAtParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Solution:
		//    isAtSingle | isAt
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//isAtSingle | isAt
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//isAtSingle
		public RuleCall getIsAtSingleParserRuleCall_0() { return cIsAtSingleParserRuleCall_0; }
		
		//isAt
		public RuleCall getIsAtParserRuleCall_1() { return cIsAtParserRuleCall_1; }
	}
	public class IsAtSingleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Solution.isAtSingle");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cNameIsAtSingleKeyword_0_0 = (Keyword)cNameAssignment_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cServoAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cServoServoParserRuleCall_2_0 = (RuleCall)cServoAssignment_2.eContents().get(0);
		private final Keyword cCommaKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cAngleAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAngleAngleParserRuleCall_4_0 = (RuleCall)cAngleAssignment_4.eContents().get(0);
		private final Keyword cCommaKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cAngle_resAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cAngle_resAngle_resParserRuleCall_6_0 = (RuleCall)cAngle_resAssignment_6.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
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
		@Override public ParserRule getRule() { return rule; }
		
		//name='isAtSingle'
		//'('
		//(servo+=Servo)
		//','
		//(angle+=Angle)
		//','
		//(angle_res+=Angle_res)
		//')'
		public Group getGroup() { return cGroup; }
		
		//name='isAtSingle'
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//'isAtSingle'
		public Keyword getNameIsAtSingleKeyword_0_0() { return cNameIsAtSingleKeyword_0_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//(servo+=Servo)
		public Assignment getServoAssignment_2() { return cServoAssignment_2; }
		
		//Servo
		public RuleCall getServoServoParserRuleCall_2_0() { return cServoServoParserRuleCall_2_0; }
		
		//','
		public Keyword getCommaKeyword_3() { return cCommaKeyword_3; }
		
		//(angle+=Angle)
		public Assignment getAngleAssignment_4() { return cAngleAssignment_4; }
		
		//Angle
		public RuleCall getAngleAngleParserRuleCall_4_0() { return cAngleAngleParserRuleCall_4_0; }
		
		//','
		public Keyword getCommaKeyword_5() { return cCommaKeyword_5; }
		
		//(angle_res+=Angle_res)
		public Assignment getAngle_resAssignment_6() { return cAngle_resAssignment_6; }
		
		//Angle_res
		public RuleCall getAngle_resAngle_resParserRuleCall_6_0() { return cAngle_resAngle_resParserRuleCall_6_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_7() { return cRightParenthesisKeyword_7; }
	}
	public class IsAtElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Solution.isAt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cNameIsAtKeyword_0_0 = (Keyword)cNameAssignment_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cAngle1Assignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAngle1AngleParserRuleCall_2_0 = (RuleCall)cAngle1Assignment_2.eContents().get(0);
		private final Keyword cCommaKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cAngle2Assignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAngle2AngleParserRuleCall_4_0 = (RuleCall)cAngle2Assignment_4.eContents().get(0);
		private final Keyword cCommaKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cAngle3Assignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cAngle3AngleParserRuleCall_6_0 = (RuleCall)cAngle3Assignment_6.eContents().get(0);
		private final Keyword cCommaKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cAngle4Assignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cAngle4AngleParserRuleCall_8_0 = (RuleCall)cAngle4Assignment_8.eContents().get(0);
		private final Keyword cCommaKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cAngle5Assignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cAngle5AngleParserRuleCall_10_0 = (RuleCall)cAngle5Assignment_10.eContents().get(0);
		private final Keyword cCommaKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cAngle6Assignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cAngle6AngleParserRuleCall_12_0 = (RuleCall)cAngle6Assignment_12.eContents().get(0);
		private final Keyword cCommaKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Assignment cAngle_resAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cAngle_resAngle_resParserRuleCall_14_0 = (RuleCall)cAngle_resAssignment_14.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_15 = (Keyword)cGroup.eContents().get(15);
		
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
		@Override public ParserRule getRule() { return rule; }
		
		//name='isAt'
		//'('
		//(angle1+=Angle)
		//','
		//(angle2+=Angle)
		//','
		//(angle3+=Angle)
		//','
		//(angle4+=Angle)
		//','
		//(angle5+=Angle)
		//','
		//(angle6+=Angle)
		//','
		//(angle_res+=Angle_res)
		//')'
		public Group getGroup() { return cGroup; }
		
		//name='isAt'
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//'isAt'
		public Keyword getNameIsAtKeyword_0_0() { return cNameIsAtKeyword_0_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//(angle1+=Angle)
		public Assignment getAngle1Assignment_2() { return cAngle1Assignment_2; }
		
		//Angle
		public RuleCall getAngle1AngleParserRuleCall_2_0() { return cAngle1AngleParserRuleCall_2_0; }
		
		//','
		public Keyword getCommaKeyword_3() { return cCommaKeyword_3; }
		
		//(angle2+=Angle)
		public Assignment getAngle2Assignment_4() { return cAngle2Assignment_4; }
		
		//Angle
		public RuleCall getAngle2AngleParserRuleCall_4_0() { return cAngle2AngleParserRuleCall_4_0; }
		
		//','
		public Keyword getCommaKeyword_5() { return cCommaKeyword_5; }
		
		//(angle3+=Angle)
		public Assignment getAngle3Assignment_6() { return cAngle3Assignment_6; }
		
		//Angle
		public RuleCall getAngle3AngleParserRuleCall_6_0() { return cAngle3AngleParserRuleCall_6_0; }
		
		//','
		public Keyword getCommaKeyword_7() { return cCommaKeyword_7; }
		
		//(angle4+=Angle)
		public Assignment getAngle4Assignment_8() { return cAngle4Assignment_8; }
		
		//Angle
		public RuleCall getAngle4AngleParserRuleCall_8_0() { return cAngle4AngleParserRuleCall_8_0; }
		
		//','
		public Keyword getCommaKeyword_9() { return cCommaKeyword_9; }
		
		//(angle5+=Angle)
		public Assignment getAngle5Assignment_10() { return cAngle5Assignment_10; }
		
		//Angle
		public RuleCall getAngle5AngleParserRuleCall_10_0() { return cAngle5AngleParserRuleCall_10_0; }
		
		//','
		public Keyword getCommaKeyword_11() { return cCommaKeyword_11; }
		
		//(angle6+=Angle)
		public Assignment getAngle6Assignment_12() { return cAngle6Assignment_12; }
		
		//Angle
		public RuleCall getAngle6AngleParserRuleCall_12_0() { return cAngle6AngleParserRuleCall_12_0; }
		
		//','
		public Keyword getCommaKeyword_13() { return cCommaKeyword_13; }
		
		//(angle_res+=Angle_res)
		public Assignment getAngle_resAssignment_14() { return cAngle_resAssignment_14; }
		
		//Angle_res
		public RuleCall getAngle_resAngle_resParserRuleCall_14_0() { return cAngle_resAngle_resParserRuleCall_14_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_15() { return cRightParenthesisKeyword_15; }
	}
	public class Angle_resElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Solution.Angle_res");
		private final Assignment cAngle_resAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cAngle_resINTTerminalRuleCall_0 = (RuleCall)cAngle_resAssignment.eContents().get(0);
		
		//Angle_res:
		//    angle_res=INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//angle_res=INT
		public Assignment getAngle_resAssignment() { return cAngle_resAssignment; }
		
		//INT
		public RuleCall getAngle_resINTTerminalRuleCall_0() { return cAngle_resINTTerminalRuleCall_0; }
	}
	public class AngleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Solution.Angle");
		private final Assignment cAngleAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cAngleINTTerminalRuleCall_0 = (RuleCall)cAngleAssignment.eContents().get(0);
		
		//Angle:
		//    angle=INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//angle=INT
		public Assignment getAngleAssignment() { return cAngleAssignment; }
		
		//INT
		public RuleCall getAngleINTTerminalRuleCall_0() { return cAngleINTTerminalRuleCall_0; }
	}
	public class TimeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Solution.Time");
		private final Assignment cTimeAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cTimeINTTerminalRuleCall_0 = (RuleCall)cTimeAssignment.eContents().get(0);
		
		//Time:
		//    time=INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//time=INT
		public Assignment getTimeAssignment() { return cTimeAssignment; }
		
		//INT
		public RuleCall getTimeINTTerminalRuleCall_0() { return cTimeINTTerminalRuleCall_0; }
	}
	public class ServoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Solution.Servo");
		private final Assignment cServoAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cServoINTTerminalRuleCall_0 = (RuleCall)cServoAssignment.eContents().get(0);
		
		//Servo:
		//    servo=INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//servo=INT
		public Assignment getServoAssignment() { return cServoAssignment; }
		
		//INT
		public RuleCall getServoINTTerminalRuleCall_0() { return cServoINTTerminalRuleCall_0; }
	}
	
	public class StateElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.Solution.State");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cTRUEEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cTRUETrueKeyword_0_0 = (Keyword)cTRUEEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cFALSEEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cFALSEFalseKeyword_1_0 = (Keyword)cFALSEEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum State:
		//    TRUE='true' | FALSE='false'
		//;
		public EnumRule getRule() { return rule; }
		
		//TRUE='true' | FALSE='false'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//TRUE='true'
		public EnumLiteralDeclaration getTRUEEnumLiteralDeclaration_0() { return cTRUEEnumLiteralDeclaration_0; }
		
		//'true'
		public Keyword getTRUETrueKeyword_0_0() { return cTRUETrueKeyword_0_0; }
		
		//FALSE='false'
		public EnumLiteralDeclaration getFALSEEnumLiteralDeclaration_1() { return cFALSEEnumLiteralDeclaration_1; }
		
		//'false'
		public Keyword getFALSEFalseKeyword_1_0() { return cFALSEFalseKeyword_1_0; }
	}
	
	private final SolutionElements pSolution;
	private final IsAtSingleElements pIsAtSingle;
	private final IsAtElements pIsAt;
	private final Angle_resElements pAngle_res;
	private final AngleElements pAngle;
	private final TimeElements pTime;
	private final ServoElements pServo;
	private final StateElements eState;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SolutionGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pSolution = new SolutionElements();
		this.pIsAtSingle = new IsAtSingleElements();
		this.pIsAt = new IsAtElements();
		this.pAngle_res = new Angle_resElements();
		this.pAngle = new AngleElements();
		this.pTime = new TimeElements();
		this.pServo = new ServoElements();
		this.eState = new StateElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.Solution".equals(grammar.getName())) {
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
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Solution:
	//    isAtSingle | isAt
	//;
	public SolutionElements getSolutionAccess() {
		return pSolution;
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
	public IsAtSingleElements getIsAtSingleAccess() {
		return pIsAtSingle;
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
	public IsAtElements getIsAtAccess() {
		return pIsAt;
	}
	
	public ParserRule getIsAtRule() {
		return getIsAtAccess().getRule();
	}
	
	//Angle_res:
	//    angle_res=INT
	//;
	public Angle_resElements getAngle_resAccess() {
		return pAngle_res;
	}
	
	public ParserRule getAngle_resRule() {
		return getAngle_resAccess().getRule();
	}
	
	//Angle:
	//    angle=INT
	//;
	public AngleElements getAngleAccess() {
		return pAngle;
	}
	
	public ParserRule getAngleRule() {
		return getAngleAccess().getRule();
	}
	
	//Time:
	//    time=INT
	//;
	public TimeElements getTimeAccess() {
		return pTime;
	}
	
	public ParserRule getTimeRule() {
		return getTimeAccess().getRule();
	}
	
	//Servo:
	//    servo=INT
	//;
	public ServoElements getServoAccess() {
		return pServo;
	}
	
	public ParserRule getServoRule() {
		return getServoAccess().getRule();
	}
	
	//enum State:
	//    TRUE='true' | FALSE='false'
	//;
	public StateElements getStateAccess() {
		return eState;
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
