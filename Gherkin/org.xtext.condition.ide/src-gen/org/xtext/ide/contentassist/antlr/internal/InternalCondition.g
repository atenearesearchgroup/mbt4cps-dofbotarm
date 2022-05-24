/*
 * generated by Xtext 2.26.0
 */
grammar InternalCondition;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.services.ConditionGrammarAccess;

}
@parser::members {
	private ConditionGrammarAccess grammarAccess;

	public void setGrammarAccess(ConditionGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleConditions
entryRuleConditions
:
{ before(grammarAccess.getConditionsRule()); }
	 ruleConditions
{ after(grammarAccess.getConditionsRule()); } 
	 EOF 
;

// Rule Conditions
ruleConditions 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConditionsAccess().getGroup()); }
		(rule__Conditions__Group__0)
		{ after(grammarAccess.getConditionsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleisAtSingle
entryRuleisAtSingle
:
{ before(grammarAccess.getIsAtSingleRule()); }
	 ruleisAtSingle
{ after(grammarAccess.getIsAtSingleRule()); } 
	 EOF 
;

// Rule isAtSingle
ruleisAtSingle 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIsAtSingleAccess().getGroup()); }
		(rule__IsAtSingle__Group__0)
		{ after(grammarAccess.getIsAtSingleAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleisAt
entryRuleisAt
:
{ before(grammarAccess.getIsAtRule()); }
	 ruleisAt
{ after(grammarAccess.getIsAtRule()); } 
	 EOF 
;

// Rule isAt
ruleisAt 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIsAtAccess().getGroup()); }
		(rule__IsAt__Group__0)
		{ after(grammarAccess.getIsAtAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAngle_res
entryRuleAngle_res
:
{ before(grammarAccess.getAngle_resRule()); }
	 ruleAngle_res
{ after(grammarAccess.getAngle_resRule()); } 
	 EOF 
;

// Rule Angle_res
ruleAngle_res 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAngle_resAccess().getAngle_resAssignment()); }
		(rule__Angle_res__Angle_resAssignment)
		{ after(grammarAccess.getAngle_resAccess().getAngle_resAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAngle
entryRuleAngle
:
{ before(grammarAccess.getAngleRule()); }
	 ruleAngle
{ after(grammarAccess.getAngleRule()); } 
	 EOF 
;

// Rule Angle
ruleAngle 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAngleAccess().getAngleAssignment()); }
		(rule__Angle__AngleAssignment)
		{ after(grammarAccess.getAngleAccess().getAngleAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTime
entryRuleTime
:
{ before(grammarAccess.getTimeRule()); }
	 ruleTime
{ after(grammarAccess.getTimeRule()); } 
	 EOF 
;

// Rule Time
ruleTime 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTimeAccess().getTimeAssignment()); }
		(rule__Time__TimeAssignment)
		{ after(grammarAccess.getTimeAccess().getTimeAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleServo
entryRuleServo
:
{ before(grammarAccess.getServoRule()); }
	 ruleServo
{ after(grammarAccess.getServoRule()); } 
	 EOF 
;

// Rule Servo
ruleServo 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getServoAccess().getServoAssignment()); }
		(rule__Servo__ServoAssignment)
		{ after(grammarAccess.getServoAccess().getServoAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditions__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Conditions__Group__0__Impl
	rule__Conditions__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditions__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionsAccess().getNameAssignment_0()); }
	(rule__Conditions__NameAssignment_0)
	{ after(grammarAccess.getConditionsAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditions__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Conditions__Group__1__Impl
	rule__Conditions__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditions__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionsAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getConditionsAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditions__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Conditions__Group__2__Impl
	rule__Conditions__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditions__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionsAccess().getTimeAssignment_2()); }
	(rule__Conditions__TimeAssignment_2)
	{ after(grammarAccess.getConditionsAccess().getTimeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditions__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Conditions__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditions__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionsAccess().getRightParenthesisKeyword_3()); }
	')'
	{ after(grammarAccess.getConditionsAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IsAtSingle__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IsAtSingle__Group__0__Impl
	rule__IsAtSingle__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAtSingle__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIsAtSingleAccess().getNameAssignment_0()); }
	(rule__IsAtSingle__NameAssignment_0)
	{ after(grammarAccess.getIsAtSingleAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAtSingle__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IsAtSingle__Group__1__Impl
	rule__IsAtSingle__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAtSingle__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIsAtSingleAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getIsAtSingleAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAtSingle__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IsAtSingle__Group__2__Impl
	rule__IsAtSingle__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAtSingle__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIsAtSingleAccess().getServoAssignment_2()); }
	(rule__IsAtSingle__ServoAssignment_2)
	{ after(grammarAccess.getIsAtSingleAccess().getServoAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAtSingle__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IsAtSingle__Group__3__Impl
	rule__IsAtSingle__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAtSingle__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIsAtSingleAccess().getCommaKeyword_3()); }
	','
	{ after(grammarAccess.getIsAtSingleAccess().getCommaKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAtSingle__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IsAtSingle__Group__4__Impl
	rule__IsAtSingle__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAtSingle__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIsAtSingleAccess().getAngleAssignment_4()); }
	(rule__IsAtSingle__AngleAssignment_4)
	{ after(grammarAccess.getIsAtSingleAccess().getAngleAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAtSingle__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IsAtSingle__Group__5__Impl
	rule__IsAtSingle__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAtSingle__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIsAtSingleAccess().getCommaKeyword_5()); }
	','
	{ after(grammarAccess.getIsAtSingleAccess().getCommaKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAtSingle__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IsAtSingle__Group__6__Impl
	rule__IsAtSingle__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAtSingle__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIsAtSingleAccess().getAngle_resAssignment_6()); }
	(rule__IsAtSingle__Angle_resAssignment_6)
	{ after(grammarAccess.getIsAtSingleAccess().getAngle_resAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAtSingle__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IsAtSingle__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAtSingle__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIsAtSingleAccess().getRightParenthesisKeyword_7()); }
	')'
	{ after(grammarAccess.getIsAtSingleAccess().getRightParenthesisKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IsAt__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IsAt__Group__0__Impl
	rule__IsAt__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIsAtAccess().getNameAssignment_0()); }
	(rule__IsAt__NameAssignment_0)
	{ after(grammarAccess.getIsAtAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IsAt__Group__1__Impl
	rule__IsAt__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIsAtAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getIsAtAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IsAt__Group__2__Impl
	rule__IsAt__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIsAtAccess().getAngle1Assignment_2()); }
	(rule__IsAt__Angle1Assignment_2)
	{ after(grammarAccess.getIsAtAccess().getAngle1Assignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IsAt__Group__3__Impl
	rule__IsAt__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIsAtAccess().getCommaKeyword_3()); }
	','
	{ after(grammarAccess.getIsAtAccess().getCommaKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IsAt__Group__4__Impl
	rule__IsAt__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIsAtAccess().getAngle2Assignment_4()); }
	(rule__IsAt__Angle2Assignment_4)
	{ after(grammarAccess.getIsAtAccess().getAngle2Assignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IsAt__Group__5__Impl
	rule__IsAt__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIsAtAccess().getCommaKeyword_5()); }
	','
	{ after(grammarAccess.getIsAtAccess().getCommaKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IsAt__Group__6__Impl
	rule__IsAt__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIsAtAccess().getAngle3Assignment_6()); }
	(rule__IsAt__Angle3Assignment_6)
	{ after(grammarAccess.getIsAtAccess().getAngle3Assignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IsAt__Group__7__Impl
	rule__IsAt__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIsAtAccess().getCommaKeyword_7()); }
	','
	{ after(grammarAccess.getIsAtAccess().getCommaKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IsAt__Group__8__Impl
	rule__IsAt__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIsAtAccess().getAngle4Assignment_8()); }
	(rule__IsAt__Angle4Assignment_8)
	{ after(grammarAccess.getIsAtAccess().getAngle4Assignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IsAt__Group__9__Impl
	rule__IsAt__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIsAtAccess().getCommaKeyword_9()); }
	','
	{ after(grammarAccess.getIsAtAccess().getCommaKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IsAt__Group__10__Impl
	rule__IsAt__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIsAtAccess().getAngle5Assignment_10()); }
	(rule__IsAt__Angle5Assignment_10)
	{ after(grammarAccess.getIsAtAccess().getAngle5Assignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IsAt__Group__11__Impl
	rule__IsAt__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIsAtAccess().getCommaKeyword_11()); }
	','
	{ after(grammarAccess.getIsAtAccess().getCommaKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IsAt__Group__12__Impl
	rule__IsAt__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIsAtAccess().getAngle6Assignment_12()); }
	(rule__IsAt__Angle6Assignment_12)
	{ after(grammarAccess.getIsAtAccess().getAngle6Assignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IsAt__Group__13__Impl
	rule__IsAt__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIsAtAccess().getCommaKeyword_13()); }
	','
	{ after(grammarAccess.getIsAtAccess().getCommaKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IsAt__Group__14__Impl
	rule__IsAt__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIsAtAccess().getAngle_resAssignment_14()); }
	(rule__IsAt__Angle_resAssignment_14)
	{ after(grammarAccess.getIsAtAccess().getAngle_resAssignment_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IsAt__Group__15__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIsAtAccess().getRightParenthesisKeyword_15()); }
	')'
	{ after(grammarAccess.getIsAtAccess().getRightParenthesisKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Conditions__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionsAccess().getNameNotLaterThanKeyword_0_0()); }
		(
			{ before(grammarAccess.getConditionsAccess().getNameNotLaterThanKeyword_0_0()); }
			'NotLaterThan'
			{ after(grammarAccess.getConditionsAccess().getNameNotLaterThanKeyword_0_0()); }
		)
		{ after(grammarAccess.getConditionsAccess().getNameNotLaterThanKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditions__TimeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionsAccess().getTimeTimeParserRuleCall_2_0()); }
		ruleTime
		{ after(grammarAccess.getConditionsAccess().getTimeTimeParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAtSingle__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIsAtSingleAccess().getNameIsAtSingleKeyword_0_0()); }
		(
			{ before(grammarAccess.getIsAtSingleAccess().getNameIsAtSingleKeyword_0_0()); }
			'isAtSingle'
			{ after(grammarAccess.getIsAtSingleAccess().getNameIsAtSingleKeyword_0_0()); }
		)
		{ after(grammarAccess.getIsAtSingleAccess().getNameIsAtSingleKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAtSingle__ServoAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIsAtSingleAccess().getServoServoParserRuleCall_2_0()); }
		ruleServo
		{ after(grammarAccess.getIsAtSingleAccess().getServoServoParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAtSingle__AngleAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIsAtSingleAccess().getAngleAngleParserRuleCall_4_0()); }
		ruleAngle
		{ after(grammarAccess.getIsAtSingleAccess().getAngleAngleParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAtSingle__Angle_resAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIsAtSingleAccess().getAngle_resAngle_resParserRuleCall_6_0()); }
		ruleAngle_res
		{ after(grammarAccess.getIsAtSingleAccess().getAngle_resAngle_resParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIsAtAccess().getNameIsAtKeyword_0_0()); }
		(
			{ before(grammarAccess.getIsAtAccess().getNameIsAtKeyword_0_0()); }
			'isAt'
			{ after(grammarAccess.getIsAtAccess().getNameIsAtKeyword_0_0()); }
		)
		{ after(grammarAccess.getIsAtAccess().getNameIsAtKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Angle1Assignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIsAtAccess().getAngle1AngleParserRuleCall_2_0()); }
		ruleAngle
		{ after(grammarAccess.getIsAtAccess().getAngle1AngleParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Angle2Assignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIsAtAccess().getAngle2AngleParserRuleCall_4_0()); }
		ruleAngle
		{ after(grammarAccess.getIsAtAccess().getAngle2AngleParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Angle3Assignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIsAtAccess().getAngle3AngleParserRuleCall_6_0()); }
		ruleAngle
		{ after(grammarAccess.getIsAtAccess().getAngle3AngleParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Angle4Assignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIsAtAccess().getAngle4AngleParserRuleCall_8_0()); }
		ruleAngle
		{ after(grammarAccess.getIsAtAccess().getAngle4AngleParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Angle5Assignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIsAtAccess().getAngle5AngleParserRuleCall_10_0()); }
		ruleAngle
		{ after(grammarAccess.getIsAtAccess().getAngle5AngleParserRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Angle6Assignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIsAtAccess().getAngle6AngleParserRuleCall_12_0()); }
		ruleAngle
		{ after(grammarAccess.getIsAtAccess().getAngle6AngleParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IsAt__Angle_resAssignment_14
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIsAtAccess().getAngle_resAngle_resParserRuleCall_14_0()); }
		ruleAngle_res
		{ after(grammarAccess.getIsAtAccess().getAngle_resAngle_resParserRuleCall_14_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Angle_res__Angle_resAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAngle_resAccess().getAngle_resINTTerminalRuleCall_0()); }
		RULE_INT
		{ after(grammarAccess.getAngle_resAccess().getAngle_resINTTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Angle__AngleAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAngleAccess().getAngleINTTerminalRuleCall_0()); }
		RULE_INT
		{ after(grammarAccess.getAngleAccess().getAngleINTTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Time__TimeAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeAccess().getTimeINTTerminalRuleCall_0()); }
		RULE_INT
		{ after(grammarAccess.getTimeAccess().getTimeINTTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Servo__ServoAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getServoAccess().getServoINTTerminalRuleCall_0()); }
		RULE_INT
		{ after(grammarAccess.getServoAccess().getServoINTTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
