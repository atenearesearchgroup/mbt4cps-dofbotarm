/*
 * generated by Xtext 2.26.0
 */
grammar InternalCPTester;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.CPTesterGrammarAccess;

}

@parser::members {

 	private CPTesterGrammarAccess grammarAccess;

    public InternalCPTesterParser(TokenStream input, CPTesterGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Scenario";
   	}

   	@Override
   	protected CPTesterGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleScenario
entryRuleScenario returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScenarioRule()); }
	iv_ruleScenario=ruleScenario
	{ $current=$iv_ruleScenario.current; }
	EOF;

// Rule Scenario
ruleScenario returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='SCENARIO'
		{
			newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getSCENARIOKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_STRING
				{
					newLeafNode(lv_name_1_0, grammarAccess.getScenarioAccess().getNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getScenarioRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2='WHEN'
		{
			newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getWHENKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioAccess().getWhenInitialParserRuleCall_3_0());
				}
				lv_when_3_0=ruleInitial
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioRule());
					}
					set(
						$current,
						"when",
						lv_when_3_0,
						"org.xtext.Operations.Initial");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='GIVEN'
		{
			newLeafNode(otherlv_4, grammarAccess.getScenarioAccess().getGIVENKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioAccess().getGivenOperationParserRuleCall_5_0());
				}
				lv_given_5_0=ruleOperation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioRule());
					}
					set(
						$current,
						"given",
						lv_given_5_0,
						"org.xtext.Operations.Operation");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='THEN'
		{
			newLeafNode(otherlv_6, grammarAccess.getScenarioAccess().getTHENKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioAccess().getThenSolutionParserRuleCall_7_0());
				}
				lv_then_7_0=ruleSolution
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioRule());
					}
					set(
						$current,
						"then",
						lv_then_7_0,
						"org.xtext.Operations.Solution");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8='AND'
		{
			newLeafNode(otherlv_8, grammarAccess.getScenarioAccess().getANDKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioAccess().getAnd1ConditionsParserRuleCall_9_0());
				}
				lv_and1_9_0=ruleConditions
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioRule());
					}
					set(
						$current,
						"and1",
						lv_and1_9_0,
						"org.xtext.Operations.Conditions");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleInitial
entryRuleInitial returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInitialRule()); }
	iv_ruleInitial=ruleInitial
	{ $current=$iv_ruleInitial.current; }
	EOF;

// Rule Initial
ruleInitial returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getInitialAccess().getOperationalArmParserRuleCall());
	}
	this_OperationalArm_0=ruleOperationalArm
	{
		$current = $this_OperationalArm_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleOperation
entryRuleOperation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOperationRule()); }
	iv_ruleOperation=ruleOperation
	{ $current=$iv_ruleOperation.current; }
	EOF;

// Rule Operation
ruleOperation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getOperationAccess().getRotateServoOperationParserRuleCall_0());
		}
		this_rotateServoOperation_0=rulerotateServoOperation
		{
			$current = $this_rotateServoOperation_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getOperationAccess().getRotateAllServosOperationParserRuleCall_1());
		}
		this_rotateAllServosOperation_1=rulerotateAllServosOperation
		{
			$current = $this_rotateAllServosOperation_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleSolution
entryRuleSolution returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSolutionRule()); }
	iv_ruleSolution=ruleSolution
	{ $current=$iv_ruleSolution.current; }
	EOF;

// Rule Solution
ruleSolution returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getSolutionAccess().getResultParserRuleCall());
	}
	this_result_0=ruleresult
	{
		$current = $this_result_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleConditions
entryRuleConditions returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionsRule()); }
	iv_ruleConditions=ruleConditions
	{ $current=$iv_ruleConditions.current; }
	EOF;

// Rule Conditions
ruleConditions returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getConditionsAccess().getNotLaterThanParserRuleCall_0());
		}
		this_NotLaterThan_0=ruleNotLaterThan
		{
			$current = $this_NotLaterThan_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getConditionsAccess().getIsAtSingleOperationParserRuleCall_1());
		}
		this_isAtSingleOperation_1=ruleisAtSingleOperation
		{
			$current = $this_isAtSingleOperation_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getConditionsAccess().getIsAtOperationParserRuleCall_2());
		}
		this_isAtOperation_2=ruleisAtOperation
		{
			$current = $this_isAtOperation_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleOperationalArm
entryRuleOperationalArm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOperationalArmRule()); }
	iv_ruleOperationalArm=ruleOperationalArm
	{ $current=$iv_ruleOperationalArm.current; }
	EOF;

// Rule OperationalArm
ruleOperationalArm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0='OperationalArm('
				{
					newLeafNode(lv_name_0_0, grammarAccess.getOperationalArmAccess().getNameOperationalArmKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOperationalArmRule());
					}
					setWithLastConsumed($current, "name", lv_name_0_0, "OperationalArm(");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getOperationalArmAccess().getTIMETimeParserRuleCall_1_0());
				}
				lv_TIME_1_0=ruletime
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOperationalArmRule());
					}
					set(
						$current,
						"TIME",
						lv_TIME_1_0,
						"org.xtext.Operations.time");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_END_2_0=')'
				{
					newLeafNode(lv_END_2_0, grammarAccess.getOperationalArmAccess().getENDRightParenthesisKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOperationalArmRule());
					}
					setWithLastConsumed($current, "END", lv_END_2_0, ")");
				}
			)
		)
	)
;

// Entry rule entryRulerotateServoOperation
entryRulerotateServoOperation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRotateServoOperationRule()); }
	iv_rulerotateServoOperation=rulerotateServoOperation
	{ $current=$iv_rulerotateServoOperation.current; }
	EOF;

// Rule rotateServoOperation
rulerotateServoOperation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0='rotateServoOperation('
				{
					newLeafNode(lv_name_0_0, grammarAccess.getRotateServoOperationAccess().getNameRotateServoOperationKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRotateServoOperationRule());
					}
					setWithLastConsumed($current, "name", lv_name_0_0, "rotateServoOperation(");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRotateServoOperationAccess().getSERVOServoParserRuleCall_1_0());
				}
				lv_SERVO_1_0=ruleservo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRotateServoOperationRule());
					}
					set(
						$current,
						"SERVO",
						lv_SERVO_1_0,
						"org.xtext.Operations.servo");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_SEP1_2_0=','
				{
					newLeafNode(lv_SEP1_2_0, grammarAccess.getRotateServoOperationAccess().getSEP1CommaKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRotateServoOperationRule());
					}
					setWithLastConsumed($current, "SEP1", lv_SEP1_2_0, ",");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRotateServoOperationAccess().getANGLEAngleParserRuleCall_3_0());
				}
				lv_ANGLE_3_0=ruleangle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRotateServoOperationRule());
					}
					set(
						$current,
						"ANGLE",
						lv_ANGLE_3_0,
						"org.xtext.Operations.angle");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_SEP2_4_0=','
				{
					newLeafNode(lv_SEP2_4_0, grammarAccess.getRotateServoOperationAccess().getSEP2CommaKeyword_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRotateServoOperationRule());
					}
					setWithLastConsumed($current, "SEP2", lv_SEP2_4_0, ",");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRotateServoOperationAccess().getTIMETimeParserRuleCall_5_0());
				}
				lv_TIME_5_0=ruletime
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRotateServoOperationRule());
					}
					set(
						$current,
						"TIME",
						lv_TIME_5_0,
						"org.xtext.Operations.time");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_END_6_0=')'
				{
					newLeafNode(lv_END_6_0, grammarAccess.getRotateServoOperationAccess().getENDRightParenthesisKeyword_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRotateServoOperationRule());
					}
					setWithLastConsumed($current, "END", lv_END_6_0, ")");
				}
			)
		)
	)
;

// Entry rule entryRulerotateAllServosOperation
entryRulerotateAllServosOperation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRotateAllServosOperationRule()); }
	iv_rulerotateAllServosOperation=rulerotateAllServosOperation
	{ $current=$iv_rulerotateAllServosOperation.current; }
	EOF;

// Rule rotateAllServosOperation
rulerotateAllServosOperation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0='rotateAllServosOperation('
				{
					newLeafNode(lv_name_0_0, grammarAccess.getRotateAllServosOperationAccess().getNameRotateAllServosOperationKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRotateAllServosOperationRule());
					}
					setWithLastConsumed($current, "name", lv_name_0_0, "rotateAllServosOperation(");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRotateAllServosOperationAccess().getANGLE1AngleParserRuleCall_1_0());
				}
				lv_ANGLE1_1_0=ruleangle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRotateAllServosOperationRule());
					}
					set(
						$current,
						"ANGLE1",
						lv_ANGLE1_1_0,
						"org.xtext.Operations.angle");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_SEP1_2_0=','
				{
					newLeafNode(lv_SEP1_2_0, grammarAccess.getRotateAllServosOperationAccess().getSEP1CommaKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRotateAllServosOperationRule());
					}
					setWithLastConsumed($current, "SEP1", lv_SEP1_2_0, ",");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRotateAllServosOperationAccess().getANGLE2AngleParserRuleCall_3_0());
				}
				lv_ANGLE2_3_0=ruleangle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRotateAllServosOperationRule());
					}
					set(
						$current,
						"ANGLE2",
						lv_ANGLE2_3_0,
						"org.xtext.Operations.angle");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_SEP2_4_0=','
				{
					newLeafNode(lv_SEP2_4_0, grammarAccess.getRotateAllServosOperationAccess().getSEP2CommaKeyword_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRotateAllServosOperationRule());
					}
					setWithLastConsumed($current, "SEP2", lv_SEP2_4_0, ",");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRotateAllServosOperationAccess().getANGLE3AngleParserRuleCall_5_0());
				}
				lv_ANGLE3_5_0=ruleangle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRotateAllServosOperationRule());
					}
					set(
						$current,
						"ANGLE3",
						lv_ANGLE3_5_0,
						"org.xtext.Operations.angle");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_SEP3_6_0=','
				{
					newLeafNode(lv_SEP3_6_0, grammarAccess.getRotateAllServosOperationAccess().getSEP3CommaKeyword_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRotateAllServosOperationRule());
					}
					setWithLastConsumed($current, "SEP3", lv_SEP3_6_0, ",");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRotateAllServosOperationAccess().getANGLE4AngleParserRuleCall_7_0());
				}
				lv_ANGLE4_7_0=ruleangle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRotateAllServosOperationRule());
					}
					set(
						$current,
						"ANGLE4",
						lv_ANGLE4_7_0,
						"org.xtext.Operations.angle");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_SEP4_8_0=','
				{
					newLeafNode(lv_SEP4_8_0, grammarAccess.getRotateAllServosOperationAccess().getSEP4CommaKeyword_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRotateAllServosOperationRule());
					}
					setWithLastConsumed($current, "SEP4", lv_SEP4_8_0, ",");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRotateAllServosOperationAccess().getANGLE5AngleParserRuleCall_9_0());
				}
				lv_ANGLE5_9_0=ruleangle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRotateAllServosOperationRule());
					}
					set(
						$current,
						"ANGLE5",
						lv_ANGLE5_9_0,
						"org.xtext.Operations.angle");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_SEP5_10_0=','
				{
					newLeafNode(lv_SEP5_10_0, grammarAccess.getRotateAllServosOperationAccess().getSEP5CommaKeyword_10_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRotateAllServosOperationRule());
					}
					setWithLastConsumed($current, "SEP5", lv_SEP5_10_0, ",");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRotateAllServosOperationAccess().getANGLE6AngleParserRuleCall_11_0());
				}
				lv_ANGLE6_11_0=ruleangle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRotateAllServosOperationRule());
					}
					set(
						$current,
						"ANGLE6",
						lv_ANGLE6_11_0,
						"org.xtext.Operations.angle");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_SEP6_12_0=','
				{
					newLeafNode(lv_SEP6_12_0, grammarAccess.getRotateAllServosOperationAccess().getSEP6CommaKeyword_12_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRotateAllServosOperationRule());
					}
					setWithLastConsumed($current, "SEP6", lv_SEP6_12_0, ",");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRotateAllServosOperationAccess().getTIMETimeParserRuleCall_13_0());
				}
				lv_TIME_13_0=ruletime
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRotateAllServosOperationRule());
					}
					set(
						$current,
						"TIME",
						lv_TIME_13_0,
						"org.xtext.Operations.time");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_END_14_0=')'
				{
					newLeafNode(lv_END_14_0, grammarAccess.getRotateAllServosOperationAccess().getENDRightParenthesisKeyword_14_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRotateAllServosOperationRule());
					}
					setWithLastConsumed($current, "END", lv_END_14_0, ")");
				}
			)
		)
	)
;

// Entry rule entryRuleresult
entryRuleresult returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getResultRule()); }
	iv_ruleresult=ruleresult
	{ $current=$iv_ruleresult.current; }
	EOF;

// Rule result
ruleresult returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0='result='
				{
					newLeafNode(lv_name_0_0, grammarAccess.getResultAccess().getNameResultKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getResultRule());
					}
					setWithLastConsumed($current, "name", lv_name_0_0, "result=");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getResultAccess().getTIMETimeParserRuleCall_1_0());
				}
				lv_TIME_1_0=ruletime
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getResultRule());
					}
					set(
						$current,
						"TIME",
						lv_TIME_1_0,
						"org.xtext.Operations.time");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleNotLaterThan
entryRuleNotLaterThan returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNotLaterThanRule()); }
	iv_ruleNotLaterThan=ruleNotLaterThan
	{ $current=$iv_ruleNotLaterThan.current; }
	EOF;

// Rule NotLaterThan
ruleNotLaterThan returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0='NotLaterThan('
				{
					newLeafNode(lv_name_0_0, grammarAccess.getNotLaterThanAccess().getNameNotLaterThanKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNotLaterThanRule());
					}
					setWithLastConsumed($current, "name", lv_name_0_0, "NotLaterThan(");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getNotLaterThanAccess().getTIMETimeParserRuleCall_1_0());
				}
				lv_TIME_1_0=ruletime
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNotLaterThanRule());
					}
					set(
						$current,
						"TIME",
						lv_TIME_1_0,
						"org.xtext.Operations.time");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_SEP_2_0=')'
				{
					newLeafNode(lv_SEP_2_0, grammarAccess.getNotLaterThanAccess().getSEPRightParenthesisKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNotLaterThanRule());
					}
					setWithLastConsumed($current, "SEP", lv_SEP_2_0, ")");
				}
			)
		)
		(
			(
				lv_QUERY_3_0='Query'
				{
					newLeafNode(lv_QUERY_3_0, grammarAccess.getNotLaterThanAccess().getQUERYQueryKeyword_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNotLaterThanRule());
					}
					setWithLastConsumed($current, "QUERY", lv_QUERY_3_0, "Query");
				}
			)
		)
	)
;

// Entry rule entryRuleisAtSingleOperation
entryRuleisAtSingleOperation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIsAtSingleOperationRule()); }
	iv_ruleisAtSingleOperation=ruleisAtSingleOperation
	{ $current=$iv_ruleisAtSingleOperation.current; }
	EOF;

// Rule isAtSingleOperation
ruleisAtSingleOperation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0='isAtSingleOperation('
				{
					newLeafNode(lv_name_0_0, grammarAccess.getIsAtSingleOperationAccess().getNameIsAtSingleOperationKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIsAtSingleOperationRule());
					}
					setWithLastConsumed($current, "name", lv_name_0_0, "isAtSingleOperation(");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getIsAtSingleOperationAccess().getSERVOServoParserRuleCall_1_0());
				}
				lv_SERVO_1_0=ruleservo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIsAtSingleOperationRule());
					}
					set(
						$current,
						"SERVO",
						lv_SERVO_1_0,
						"org.xtext.Operations.servo");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_SEP1_2_0=','
				{
					newLeafNode(lv_SEP1_2_0, grammarAccess.getIsAtSingleOperationAccess().getSEP1CommaKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIsAtSingleOperationRule());
					}
					setWithLastConsumed($current, "SEP1", lv_SEP1_2_0, ",");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getIsAtSingleOperationAccess().getANGLEAngleParserRuleCall_3_0());
				}
				lv_ANGLE_3_0=ruleangle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIsAtSingleOperationRule());
					}
					set(
						$current,
						"ANGLE",
						lv_ANGLE_3_0,
						"org.xtext.Operations.angle");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_SEP2_4_0=','
				{
					newLeafNode(lv_SEP2_4_0, grammarAccess.getIsAtSingleOperationAccess().getSEP2CommaKeyword_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIsAtSingleOperationRule());
					}
					setWithLastConsumed($current, "SEP2", lv_SEP2_4_0, ",");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getIsAtSingleOperationAccess().getANGLE_RESAngle_resParserRuleCall_5_0());
				}
				lv_ANGLE_RES_5_0=ruleangle_res
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIsAtSingleOperationRule());
					}
					set(
						$current,
						"ANGLE_RES",
						lv_ANGLE_RES_5_0,
						"org.xtext.Operations.angle_res");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_END_6_0=')='
				{
					newLeafNode(lv_END_6_0, grammarAccess.getIsAtSingleOperationAccess().getENDRightParenthesisEqualsSignKeyword_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIsAtSingleOperationRule());
					}
					setWithLastConsumed($current, "END", lv_END_6_0, ")=");
				}
			)
		)
		(
			(
				lv_VALUE_7_0='True'
				{
					newLeafNode(lv_VALUE_7_0, grammarAccess.getIsAtSingleOperationAccess().getVALUETrueKeyword_7_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIsAtSingleOperationRule());
					}
					setWithLastConsumed($current, "VALUE", lv_VALUE_7_0, "True");
				}
			)
		)
	)
;

// Entry rule entryRuleisAtOperation
entryRuleisAtOperation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIsAtOperationRule()); }
	iv_ruleisAtOperation=ruleisAtOperation
	{ $current=$iv_ruleisAtOperation.current; }
	EOF;

// Rule isAtOperation
ruleisAtOperation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0='isAtOperation('
				{
					newLeafNode(lv_name_0_0, grammarAccess.getIsAtOperationAccess().getNameIsAtOperationKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIsAtOperationRule());
					}
					setWithLastConsumed($current, "name", lv_name_0_0, "isAtOperation(");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getIsAtOperationAccess().getANGLE1AngleParserRuleCall_1_0());
				}
				lv_ANGLE1_1_0=ruleangle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIsAtOperationRule());
					}
					set(
						$current,
						"ANGLE1",
						lv_ANGLE1_1_0,
						"org.xtext.Operations.angle");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_SEP1_2_0=','
				{
					newLeafNode(lv_SEP1_2_0, grammarAccess.getIsAtOperationAccess().getSEP1CommaKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIsAtOperationRule());
					}
					setWithLastConsumed($current, "SEP1", lv_SEP1_2_0, ",");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getIsAtOperationAccess().getANGLE2AngleParserRuleCall_3_0());
				}
				lv_ANGLE2_3_0=ruleangle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIsAtOperationRule());
					}
					set(
						$current,
						"ANGLE2",
						lv_ANGLE2_3_0,
						"org.xtext.Operations.angle");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_SEP2_4_0=','
				{
					newLeafNode(lv_SEP2_4_0, grammarAccess.getIsAtOperationAccess().getSEP2CommaKeyword_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIsAtOperationRule());
					}
					setWithLastConsumed($current, "SEP2", lv_SEP2_4_0, ",");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getIsAtOperationAccess().getANGLE3AngleParserRuleCall_5_0());
				}
				lv_ANGLE3_5_0=ruleangle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIsAtOperationRule());
					}
					set(
						$current,
						"ANGLE3",
						lv_ANGLE3_5_0,
						"org.xtext.Operations.angle");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_SEP3_6_0=','
				{
					newLeafNode(lv_SEP3_6_0, grammarAccess.getIsAtOperationAccess().getSEP3CommaKeyword_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIsAtOperationRule());
					}
					setWithLastConsumed($current, "SEP3", lv_SEP3_6_0, ",");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getIsAtOperationAccess().getANGLE4AngleParserRuleCall_7_0());
				}
				lv_ANGLE4_7_0=ruleangle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIsAtOperationRule());
					}
					set(
						$current,
						"ANGLE4",
						lv_ANGLE4_7_0,
						"org.xtext.Operations.angle");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_SEP4_8_0=','
				{
					newLeafNode(lv_SEP4_8_0, grammarAccess.getIsAtOperationAccess().getSEP4CommaKeyword_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIsAtOperationRule());
					}
					setWithLastConsumed($current, "SEP4", lv_SEP4_8_0, ",");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getIsAtOperationAccess().getANGLE5AngleParserRuleCall_9_0());
				}
				lv_ANGLE5_9_0=ruleangle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIsAtOperationRule());
					}
					set(
						$current,
						"ANGLE5",
						lv_ANGLE5_9_0,
						"org.xtext.Operations.angle");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_SEP5_10_0=','
				{
					newLeafNode(lv_SEP5_10_0, grammarAccess.getIsAtOperationAccess().getSEP5CommaKeyword_10_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIsAtOperationRule());
					}
					setWithLastConsumed($current, "SEP5", lv_SEP5_10_0, ",");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getIsAtOperationAccess().getANGLE6AngleParserRuleCall_11_0());
				}
				lv_ANGLE6_11_0=ruleangle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIsAtOperationRule());
					}
					set(
						$current,
						"ANGLE6",
						lv_ANGLE6_11_0,
						"org.xtext.Operations.angle");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_SEP6_12_0=','
				{
					newLeafNode(lv_SEP6_12_0, grammarAccess.getIsAtOperationAccess().getSEP6CommaKeyword_12_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIsAtOperationRule());
					}
					setWithLastConsumed($current, "SEP6", lv_SEP6_12_0, ",");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getIsAtOperationAccess().getANGLE_RESAngle_resParserRuleCall_13_0());
				}
				lv_ANGLE_RES_13_0=ruleangle_res
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIsAtOperationRule());
					}
					set(
						$current,
						"ANGLE_RES",
						lv_ANGLE_RES_13_0,
						"org.xtext.Operations.angle_res");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_END_14_0=')='
				{
					newLeafNode(lv_END_14_0, grammarAccess.getIsAtOperationAccess().getENDRightParenthesisEqualsSignKeyword_14_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIsAtOperationRule());
					}
					setWithLastConsumed($current, "END", lv_END_14_0, ")=");
				}
			)
		)
		(
			(
				lv_VALUE_15_0='True'
				{
					newLeafNode(lv_VALUE_15_0, grammarAccess.getIsAtOperationAccess().getVALUETrueKeyword_15_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIsAtOperationRule());
					}
					setWithLastConsumed($current, "VALUE", lv_VALUE_15_0, "True");
				}
			)
		)
	)
;

// Entry rule entryRuletime
entryRuletime returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTimeRule()); }
	iv_ruletime=ruletime
	{ $current=$iv_ruletime.current; }
	EOF;

// Rule time
ruletime returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_TIME_0_0=RULE_INT
			{
				newLeafNode(lv_TIME_0_0, grammarAccess.getTimeAccess().getTIMEINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getTimeRule());
				}
				setWithLastConsumed(
					$current,
					"TIME",
					lv_TIME_0_0,
					"org.eclipse.xtext.common.Terminals.INT");
			}
		)
	)
;

// Entry rule entryRuleservo
entryRuleservo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getServoRule()); }
	iv_ruleservo=ruleservo
	{ $current=$iv_ruleservo.current; }
	EOF;

// Rule servo
ruleservo returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_SERVO_0_0=RULE_INT
			{
				newLeafNode(lv_SERVO_0_0, grammarAccess.getServoAccess().getSERVOINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getServoRule());
				}
				setWithLastConsumed(
					$current,
					"SERVO",
					lv_SERVO_0_0,
					"org.eclipse.xtext.common.Terminals.INT");
			}
		)
	)
;

// Entry rule entryRuleangle
entryRuleangle returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAngleRule()); }
	iv_ruleangle=ruleangle
	{ $current=$iv_ruleangle.current; }
	EOF;

// Rule angle
ruleangle returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_ANGLE_0_0=RULE_INT
			{
				newLeafNode(lv_ANGLE_0_0, grammarAccess.getAngleAccess().getANGLEINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getAngleRule());
				}
				setWithLastConsumed(
					$current,
					"ANGLE",
					lv_ANGLE_0_0,
					"org.eclipse.xtext.common.Terminals.INT");
			}
		)
	)
;

// Entry rule entryRuleangle_res
entryRuleangle_res returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAngle_resRule()); }
	iv_ruleangle_res=ruleangle_res
	{ $current=$iv_ruleangle_res.current; }
	EOF;

// Rule angle_res
ruleangle_res returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_ANGLE_RES_0_0=RULE_INT
			{
				newLeafNode(lv_ANGLE_RES_0_0, grammarAccess.getAngle_resAccess().getANGLE_RESINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getAngle_resRule());
				}
				setWithLastConsumed(
					$current,
					"ANGLE_RES",
					lv_ANGLE_RES_0_0,
					"org.eclipse.xtext.common.Terminals.INT");
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
