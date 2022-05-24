/*
 * generated by Xtext 2.26.0
 */
grammar InternalSolution;

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
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.SolutionGrammarAccess;

}

@parser::members {

 	private SolutionGrammarAccess grammarAccess;

    public InternalSolutionParser(TokenStream input, SolutionGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Solution";
   	}

   	@Override
   	protected SolutionGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

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
	(
		{
			newCompositeNode(grammarAccess.getSolutionAccess().getIsAtSingleParserRuleCall_0());
		}
		this_isAtSingle_0=ruleisAtSingle
		{
			$current = $this_isAtSingle_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getSolutionAccess().getIsAtParserRuleCall_1());
		}
		this_isAt_1=ruleisAt
		{
			$current = $this_isAt_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleisAtSingle
entryRuleisAtSingle returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIsAtSingleRule()); }
	iv_ruleisAtSingle=ruleisAtSingle
	{ $current=$iv_ruleisAtSingle.current; }
	EOF;

// Rule isAtSingle
ruleisAtSingle returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0='isAtSingle'
				{
					newLeafNode(lv_name_0_0, grammarAccess.getIsAtSingleAccess().getNameIsAtSingleKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIsAtSingleRule());
					}
					setWithLastConsumed($current, "name", lv_name_0_0, "isAtSingle");
				}
			)
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getIsAtSingleAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIsAtSingleAccess().getServoServoParserRuleCall_2_0());
				}
				lv_servo_2_0=ruleServo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIsAtSingleRule());
					}
					add(
						$current,
						"servo",
						lv_servo_2_0,
						"org.xtext.Solution.Servo");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=','
		{
			newLeafNode(otherlv_3, grammarAccess.getIsAtSingleAccess().getCommaKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIsAtSingleAccess().getAngleAngleParserRuleCall_4_0());
				}
				lv_angle_4_0=ruleAngle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIsAtSingleRule());
					}
					add(
						$current,
						"angle",
						lv_angle_4_0,
						"org.xtext.Solution.Angle");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=','
		{
			newLeafNode(otherlv_5, grammarAccess.getIsAtSingleAccess().getCommaKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIsAtSingleAccess().getAngle_resAngle_resParserRuleCall_6_0());
				}
				lv_angle_res_6_0=ruleAngle_res
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIsAtSingleRule());
					}
					add(
						$current,
						"angle_res",
						lv_angle_res_6_0,
						"org.xtext.Solution.Angle_res");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7=')'
		{
			newLeafNode(otherlv_7, grammarAccess.getIsAtSingleAccess().getRightParenthesisKeyword_7());
		}
	)
;

// Entry rule entryRuleisAt
entryRuleisAt returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIsAtRule()); }
	iv_ruleisAt=ruleisAt
	{ $current=$iv_ruleisAt.current; }
	EOF;

// Rule isAt
ruleisAt returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0='isAt'
				{
					newLeafNode(lv_name_0_0, grammarAccess.getIsAtAccess().getNameIsAtKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIsAtRule());
					}
					setWithLastConsumed($current, "name", lv_name_0_0, "isAt");
				}
			)
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getIsAtAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIsAtAccess().getAngle1AngleParserRuleCall_2_0());
				}
				lv_angle1_2_0=ruleAngle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIsAtRule());
					}
					add(
						$current,
						"angle1",
						lv_angle1_2_0,
						"org.xtext.Solution.Angle");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=','
		{
			newLeafNode(otherlv_3, grammarAccess.getIsAtAccess().getCommaKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIsAtAccess().getAngle2AngleParserRuleCall_4_0());
				}
				lv_angle2_4_0=ruleAngle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIsAtRule());
					}
					add(
						$current,
						"angle2",
						lv_angle2_4_0,
						"org.xtext.Solution.Angle");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=','
		{
			newLeafNode(otherlv_5, grammarAccess.getIsAtAccess().getCommaKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIsAtAccess().getAngle3AngleParserRuleCall_6_0());
				}
				lv_angle3_6_0=ruleAngle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIsAtRule());
					}
					add(
						$current,
						"angle3",
						lv_angle3_6_0,
						"org.xtext.Solution.Angle");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7=','
		{
			newLeafNode(otherlv_7, grammarAccess.getIsAtAccess().getCommaKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIsAtAccess().getAngle4AngleParserRuleCall_8_0());
				}
				lv_angle4_8_0=ruleAngle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIsAtRule());
					}
					add(
						$current,
						"angle4",
						lv_angle4_8_0,
						"org.xtext.Solution.Angle");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=','
		{
			newLeafNode(otherlv_9, grammarAccess.getIsAtAccess().getCommaKeyword_9());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIsAtAccess().getAngle5AngleParserRuleCall_10_0());
				}
				lv_angle5_10_0=ruleAngle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIsAtRule());
					}
					add(
						$current,
						"angle5",
						lv_angle5_10_0,
						"org.xtext.Solution.Angle");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_11=','
		{
			newLeafNode(otherlv_11, grammarAccess.getIsAtAccess().getCommaKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIsAtAccess().getAngle6AngleParserRuleCall_12_0());
				}
				lv_angle6_12_0=ruleAngle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIsAtRule());
					}
					add(
						$current,
						"angle6",
						lv_angle6_12_0,
						"org.xtext.Solution.Angle");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=','
		{
			newLeafNode(otherlv_13, grammarAccess.getIsAtAccess().getCommaKeyword_13());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIsAtAccess().getAngle_resAngle_resParserRuleCall_14_0());
				}
				lv_angle_res_14_0=ruleAngle_res
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIsAtRule());
					}
					add(
						$current,
						"angle_res",
						lv_angle_res_14_0,
						"org.xtext.Solution.Angle_res");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_15=')'
		{
			newLeafNode(otherlv_15, grammarAccess.getIsAtAccess().getRightParenthesisKeyword_15());
		}
	)
;

// Entry rule entryRuleAngle_res
entryRuleAngle_res returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAngle_resRule()); }
	iv_ruleAngle_res=ruleAngle_res
	{ $current=$iv_ruleAngle_res.current; }
	EOF;

// Rule Angle_res
ruleAngle_res returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_angle_res_0_0=RULE_INT
			{
				newLeafNode(lv_angle_res_0_0, grammarAccess.getAngle_resAccess().getAngle_resINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getAngle_resRule());
				}
				setWithLastConsumed(
					$current,
					"angle_res",
					lv_angle_res_0_0,
					"org.eclipse.xtext.common.Terminals.INT");
			}
		)
	)
;

// Entry rule entryRuleAngle
entryRuleAngle returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAngleRule()); }
	iv_ruleAngle=ruleAngle
	{ $current=$iv_ruleAngle.current; }
	EOF;

// Rule Angle
ruleAngle returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_angle_0_0=RULE_INT
			{
				newLeafNode(lv_angle_0_0, grammarAccess.getAngleAccess().getAngleINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getAngleRule());
				}
				setWithLastConsumed(
					$current,
					"angle",
					lv_angle_0_0,
					"org.eclipse.xtext.common.Terminals.INT");
			}
		)
	)
;

// Entry rule entryRuleServo
entryRuleServo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getServoRule()); }
	iv_ruleServo=ruleServo
	{ $current=$iv_ruleServo.current; }
	EOF;

// Rule Servo
ruleServo returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_servo_0_0=RULE_INT
			{
				newLeafNode(lv_servo_0_0, grammarAccess.getServoAccess().getServoINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getServoRule());
				}
				setWithLastConsumed(
					$current,
					"servo",
					lv_servo_0_0,
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
