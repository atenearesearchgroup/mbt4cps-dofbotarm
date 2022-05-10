/*
 * generated by Xtext 2.26.0
 */
package org.xtext.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
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
public class CPTesterGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ScenarioElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.CPTester.Scenario");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSCENARIOKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cWHENKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cWhenAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cWhenOperationParserRuleCall_3_0 = (RuleCall)cWhenAssignment_3.eContents().get(0);
		private final Keyword cGIVENKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cGivenAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cGivenOperationParserRuleCall_5_0 = (RuleCall)cGivenAssignment_5.eContents().get(0);
		private final Keyword cTHENKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cThenAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cThenResultParserRuleCall_7_0 = (RuleCall)cThenAssignment_7.eContents().get(0);
		private final Keyword cANDKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cAnd1Assignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cAnd1OperationParserRuleCall_9_0 = (RuleCall)cAnd1Assignment_9.eContents().get(0);
		
		//Scenario:
		//    'SCENARIO' name=STRING
		//    'WHEN' when=Operation
		//    'GIVEN' given=Operation
		//    'THEN' then=Result
		//    'AND' and1=Operation
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'SCENARIO' name=STRING
		//'WHEN' when=Operation
		//'GIVEN' given=Operation
		//'THEN' then=Result
		//'AND' and1=Operation
		public Group getGroup() { return cGroup; }
		
		//'SCENARIO'
		public Keyword getSCENARIOKeyword_0() { return cSCENARIOKeyword_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
		
		//'WHEN'
		public Keyword getWHENKeyword_2() { return cWHENKeyword_2; }
		
		//when=Operation
		public Assignment getWhenAssignment_3() { return cWhenAssignment_3; }
		
		//Operation
		public RuleCall getWhenOperationParserRuleCall_3_0() { return cWhenOperationParserRuleCall_3_0; }
		
		//'GIVEN'
		public Keyword getGIVENKeyword_4() { return cGIVENKeyword_4; }
		
		//given=Operation
		public Assignment getGivenAssignment_5() { return cGivenAssignment_5; }
		
		//Operation
		public RuleCall getGivenOperationParserRuleCall_5_0() { return cGivenOperationParserRuleCall_5_0; }
		
		//'THEN'
		public Keyword getTHENKeyword_6() { return cTHENKeyword_6; }
		
		//then=Result
		public Assignment getThenAssignment_7() { return cThenAssignment_7; }
		
		//Result
		public RuleCall getThenResultParserRuleCall_7_0() { return cThenResultParserRuleCall_7_0; }
		
		//'AND'
		public Keyword getANDKeyword_8() { return cANDKeyword_8; }
		
		//and1=Operation
		public Assignment getAnd1Assignment_9() { return cAnd1Assignment_9; }
		
		//Operation
		public RuleCall getAnd1OperationParserRuleCall_9_0() { return cAnd1OperationParserRuleCall_9_0; }
	}
	
	
	private final ScenarioElements pScenario;
	
	private final Grammar grammar;
	
	private final OperationsGrammarAccess gaOperations;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public CPTesterGrammarAccess(GrammarProvider grammarProvider,
			OperationsGrammarAccess gaOperations,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaOperations = gaOperations;
		this.gaTerminals = gaTerminals;
		this.pScenario = new ScenarioElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.CPTester".equals(grammar.getName())) {
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
	
	
	public OperationsGrammarAccess getOperationsGrammarAccess() {
		return gaOperations;
	}
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Scenario:
	//    'SCENARIO' name=STRING
	//    'WHEN' when=Operation
	//    'GIVEN' given=Operation
	//    'THEN' then=Result
	//    'AND' and1=Operation
	//;
	public ScenarioElements getScenarioAccess() {
		return pScenario;
	}
	
	public ParserRule getScenarioRule() {
		return getScenarioAccess().getRule();
	}
	
	//Operation:
	//  rotateServoOperation | OperationalArm | NotLaterThan
	//;
	public OperationsGrammarAccess.OperationElements getOperationAccess() {
		return gaOperations.getOperationAccess();
	}
	
	public ParserRule getOperationRule() {
		return getOperationAccess().getRule();
	}
	
	//rotateServoOperation:
	//    name = 'rotateServoOperation(' + INT + ',' + INT + ',' + INT + ')'
	//;
	public OperationsGrammarAccess.RotateServoOperationElements getRotateServoOperationAccess() {
		return gaOperations.getRotateServoOperationAccess();
	}
	
	public ParserRule getRotateServoOperationRule() {
		return getRotateServoOperationAccess().getRule();
	}
	
	//OperationalArm:
	//    name = 'OperationalArm(' + INT + ')'
	//;
	public OperationsGrammarAccess.OperationalArmElements getOperationalArmAccess() {
		return gaOperations.getOperationalArmAccess();
	}
	
	public ParserRule getOperationalArmRule() {
		return getOperationalArmAccess().getRule();
	}
	
	//NotLaterThan:
	//    name = 'NotLaterThan(' + INT + ')' + ' Query ' + 'isAtSingleOperation(' + INT + ',' + INT + ',' + INT + ')=' + 'True'
	//;
	public OperationsGrammarAccess.NotLaterThanElements getNotLaterThanAccess() {
		return gaOperations.getNotLaterThanAccess();
	}
	
	public ParserRule getNotLaterThanRule() {
		return getNotLaterThanAccess().getRule();
	}
	
	//Result:
	//    name= 'result=' + INT
	//;
	public OperationsGrammarAccess.ResultElements getResultAccess() {
		return gaOperations.getResultAccess();
	}
	
	public ParserRule getResultRule() {
		return getResultAccess().getRule();
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