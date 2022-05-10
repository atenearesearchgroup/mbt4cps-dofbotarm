/*
 * generated by Xtext 2.26.0
 */
grammar InternalCPTester;

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
import org.xtext.services.CPTesterGrammarAccess;

}
@parser::members {
	private CPTesterGrammarAccess grammarAccess;

	public void setGrammarAccess(CPTesterGrammarAccess grammarAccess) {
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

// Entry rule entryRuleScenario
entryRuleScenario
:
{ before(grammarAccess.getScenarioRule()); }
	 ruleScenario
{ after(grammarAccess.getScenarioRule()); } 
	 EOF 
;

// Rule Scenario
ruleScenario 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getScenarioAccess().getGroup()); }
		(rule__Scenario__Group__0)
		{ after(grammarAccess.getScenarioAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOperation
entryRuleOperation
:
{ before(grammarAccess.getOperationRule()); }
	 ruleOperation
{ after(grammarAccess.getOperationRule()); } 
	 EOF 
;

// Rule Operation
ruleOperation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOperationAccess().getAlternatives()); }
		(rule__Operation__Alternatives)
		{ after(grammarAccess.getOperationAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulerotateServoOperation
entryRulerotateServoOperation
:
{ before(grammarAccess.getRotateServoOperationRule()); }
	 rulerotateServoOperation
{ after(grammarAccess.getRotateServoOperationRule()); } 
	 EOF 
;

// Rule rotateServoOperation
rulerotateServoOperation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRotateServoOperationAccess().getGroup()); }
		(rule__RotateServoOperation__Group__0)
		{ after(grammarAccess.getRotateServoOperationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOperationalArm
entryRuleOperationalArm
:
{ before(grammarAccess.getOperationalArmRule()); }
	 ruleOperationalArm
{ after(grammarAccess.getOperationalArmRule()); } 
	 EOF 
;

// Rule OperationalArm
ruleOperationalArm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOperationalArmAccess().getGroup()); }
		(rule__OperationalArm__Group__0)
		{ after(grammarAccess.getOperationalArmAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNotLaterThan
entryRuleNotLaterThan
:
{ before(grammarAccess.getNotLaterThanRule()); }
	 ruleNotLaterThan
{ after(grammarAccess.getNotLaterThanRule()); } 
	 EOF 
;

// Rule NotLaterThan
ruleNotLaterThan 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNotLaterThanAccess().getGroup()); }
		(rule__NotLaterThan__Group__0)
		{ after(grammarAccess.getNotLaterThanAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleResult
entryRuleResult
:
{ before(grammarAccess.getResultRule()); }
	 ruleResult
{ after(grammarAccess.getResultRule()); } 
	 EOF 
;

// Rule Result
ruleResult 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getResultAccess().getGroup()); }
		(rule__Result__Group__0)
		{ after(grammarAccess.getResultAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOperationAccess().getRotateServoOperationParserRuleCall_0()); }
		rulerotateServoOperation
		{ after(grammarAccess.getOperationAccess().getRotateServoOperationParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getOperationAccess().getOperationalArmParserRuleCall_1()); }
		ruleOperationalArm
		{ after(grammarAccess.getOperationAccess().getOperationalArmParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getOperationAccess().getNotLaterThanParserRuleCall_2()); }
		ruleNotLaterThan
		{ after(grammarAccess.getOperationAccess().getNotLaterThanParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario__Group__0__Impl
	rule__Scenario__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenarioAccess().getSCENARIOKeyword_0()); }
	'SCENARIO'
	{ after(grammarAccess.getScenarioAccess().getSCENARIOKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario__Group__1__Impl
	rule__Scenario__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenarioAccess().getNameAssignment_1()); }
	(rule__Scenario__NameAssignment_1)
	{ after(grammarAccess.getScenarioAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario__Group__2__Impl
	rule__Scenario__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenarioAccess().getWHENKeyword_2()); }
	'WHEN'
	{ after(grammarAccess.getScenarioAccess().getWHENKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario__Group__3__Impl
	rule__Scenario__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenarioAccess().getWhenAssignment_3()); }
	(rule__Scenario__WhenAssignment_3)
	{ after(grammarAccess.getScenarioAccess().getWhenAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario__Group__4__Impl
	rule__Scenario__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenarioAccess().getGIVENKeyword_4()); }
	'GIVEN'
	{ after(grammarAccess.getScenarioAccess().getGIVENKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario__Group__5__Impl
	rule__Scenario__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenarioAccess().getGivenAssignment_5()); }
	(rule__Scenario__GivenAssignment_5)
	{ after(grammarAccess.getScenarioAccess().getGivenAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario__Group__6__Impl
	rule__Scenario__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenarioAccess().getTHENKeyword_6()); }
	'THEN'
	{ after(grammarAccess.getScenarioAccess().getTHENKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario__Group__7__Impl
	rule__Scenario__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenarioAccess().getThenAssignment_7()); }
	(rule__Scenario__ThenAssignment_7)
	{ after(grammarAccess.getScenarioAccess().getThenAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario__Group__8__Impl
	rule__Scenario__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenarioAccess().getANDKeyword_8()); }
	'AND'
	{ after(grammarAccess.getScenarioAccess().getANDKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenarioAccess().getAnd1Assignment_9()); }
	(rule__Scenario__And1Assignment_9)
	{ after(grammarAccess.getScenarioAccess().getAnd1Assignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RotateServoOperation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RotateServoOperation__Group__0__Impl
	rule__RotateServoOperation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RotateServoOperation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getRotateServoOperationAccess().getNameAssignment_0()); }
		(rule__RotateServoOperation__NameAssignment_0)
		{ after(grammarAccess.getRotateServoOperationAccess().getNameAssignment_0()); }
	)
	(
		{ before(grammarAccess.getRotateServoOperationAccess().getNameAssignment_0()); }
		(rule__RotateServoOperation__NameAssignment_0)*
		{ after(grammarAccess.getRotateServoOperationAccess().getNameAssignment_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RotateServoOperation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RotateServoOperation__Group__1__Impl
	rule__RotateServoOperation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RotateServoOperation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getRotateServoOperationAccess().getINTTerminalRuleCall_1()); }
		(RULE_INT)
		{ after(grammarAccess.getRotateServoOperationAccess().getINTTerminalRuleCall_1()); }
	)
	(
		{ before(grammarAccess.getRotateServoOperationAccess().getINTTerminalRuleCall_1()); }
		(RULE_INT)*
		{ after(grammarAccess.getRotateServoOperationAccess().getINTTerminalRuleCall_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RotateServoOperation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RotateServoOperation__Group__2__Impl
	rule__RotateServoOperation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RotateServoOperation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getRotateServoOperationAccess().getCommaKeyword_2()); }
		(',')
		{ after(grammarAccess.getRotateServoOperationAccess().getCommaKeyword_2()); }
	)
	(
		{ before(grammarAccess.getRotateServoOperationAccess().getCommaKeyword_2()); }
		(',')*
		{ after(grammarAccess.getRotateServoOperationAccess().getCommaKeyword_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RotateServoOperation__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RotateServoOperation__Group__3__Impl
	rule__RotateServoOperation__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__RotateServoOperation__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getRotateServoOperationAccess().getINTTerminalRuleCall_3()); }
		(RULE_INT)
		{ after(grammarAccess.getRotateServoOperationAccess().getINTTerminalRuleCall_3()); }
	)
	(
		{ before(grammarAccess.getRotateServoOperationAccess().getINTTerminalRuleCall_3()); }
		(RULE_INT)*
		{ after(grammarAccess.getRotateServoOperationAccess().getINTTerminalRuleCall_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RotateServoOperation__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RotateServoOperation__Group__4__Impl
	rule__RotateServoOperation__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__RotateServoOperation__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getRotateServoOperationAccess().getCommaKeyword_4()); }
		(',')
		{ after(grammarAccess.getRotateServoOperationAccess().getCommaKeyword_4()); }
	)
	(
		{ before(grammarAccess.getRotateServoOperationAccess().getCommaKeyword_4()); }
		(',')*
		{ after(grammarAccess.getRotateServoOperationAccess().getCommaKeyword_4()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RotateServoOperation__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RotateServoOperation__Group__5__Impl
	rule__RotateServoOperation__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__RotateServoOperation__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getRotateServoOperationAccess().getINTTerminalRuleCall_5()); }
		(RULE_INT)
		{ after(grammarAccess.getRotateServoOperationAccess().getINTTerminalRuleCall_5()); }
	)
	(
		{ before(grammarAccess.getRotateServoOperationAccess().getINTTerminalRuleCall_5()); }
		(RULE_INT)*
		{ after(grammarAccess.getRotateServoOperationAccess().getINTTerminalRuleCall_5()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RotateServoOperation__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RotateServoOperation__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RotateServoOperation__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRotateServoOperationAccess().getRightParenthesisKeyword_6()); }
	')'
	{ after(grammarAccess.getRotateServoOperationAccess().getRightParenthesisKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OperationalArm__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OperationalArm__Group__0__Impl
	rule__OperationalArm__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OperationalArm__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getOperationalArmAccess().getNameAssignment_0()); }
		(rule__OperationalArm__NameAssignment_0)
		{ after(grammarAccess.getOperationalArmAccess().getNameAssignment_0()); }
	)
	(
		{ before(grammarAccess.getOperationalArmAccess().getNameAssignment_0()); }
		(rule__OperationalArm__NameAssignment_0)*
		{ after(grammarAccess.getOperationalArmAccess().getNameAssignment_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OperationalArm__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OperationalArm__Group__1__Impl
	rule__OperationalArm__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OperationalArm__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getOperationalArmAccess().getINTTerminalRuleCall_1()); }
		(RULE_INT)
		{ after(grammarAccess.getOperationalArmAccess().getINTTerminalRuleCall_1()); }
	)
	(
		{ before(grammarAccess.getOperationalArmAccess().getINTTerminalRuleCall_1()); }
		(RULE_INT)*
		{ after(grammarAccess.getOperationalArmAccess().getINTTerminalRuleCall_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OperationalArm__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OperationalArm__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OperationalArm__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOperationalArmAccess().getRightParenthesisKeyword_2()); }
	')'
	{ after(grammarAccess.getOperationalArmAccess().getRightParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NotLaterThan__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NotLaterThan__Group__0__Impl
	rule__NotLaterThan__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NotLaterThan__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getNotLaterThanAccess().getNameAssignment_0()); }
		(rule__NotLaterThan__NameAssignment_0)
		{ after(grammarAccess.getNotLaterThanAccess().getNameAssignment_0()); }
	)
	(
		{ before(grammarAccess.getNotLaterThanAccess().getNameAssignment_0()); }
		(rule__NotLaterThan__NameAssignment_0)*
		{ after(grammarAccess.getNotLaterThanAccess().getNameAssignment_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NotLaterThan__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NotLaterThan__Group__1__Impl
	rule__NotLaterThan__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NotLaterThan__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getNotLaterThanAccess().getINTTerminalRuleCall_1()); }
		(RULE_INT)
		{ after(grammarAccess.getNotLaterThanAccess().getINTTerminalRuleCall_1()); }
	)
	(
		{ before(grammarAccess.getNotLaterThanAccess().getINTTerminalRuleCall_1()); }
		(RULE_INT)*
		{ after(grammarAccess.getNotLaterThanAccess().getINTTerminalRuleCall_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NotLaterThan__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NotLaterThan__Group__2__Impl
	rule__NotLaterThan__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NotLaterThan__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getNotLaterThanAccess().getRightParenthesisKeyword_2()); }
		(')')
		{ after(grammarAccess.getNotLaterThanAccess().getRightParenthesisKeyword_2()); }
	)
	(
		{ before(grammarAccess.getNotLaterThanAccess().getRightParenthesisKeyword_2()); }
		(')')*
		{ after(grammarAccess.getNotLaterThanAccess().getRightParenthesisKeyword_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NotLaterThan__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NotLaterThan__Group__3__Impl
	rule__NotLaterThan__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NotLaterThan__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getNotLaterThanAccess().getQueryKeyword_3()); }
		(' Query ')
		{ after(grammarAccess.getNotLaterThanAccess().getQueryKeyword_3()); }
	)
	(
		{ before(grammarAccess.getNotLaterThanAccess().getQueryKeyword_3()); }
		(' Query ')*
		{ after(grammarAccess.getNotLaterThanAccess().getQueryKeyword_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NotLaterThan__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NotLaterThan__Group__4__Impl
	rule__NotLaterThan__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__NotLaterThan__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getNotLaterThanAccess().getIsAtSingleOperationKeyword_4()); }
		('isAtSingleOperation(')
		{ after(grammarAccess.getNotLaterThanAccess().getIsAtSingleOperationKeyword_4()); }
	)
	(
		{ before(grammarAccess.getNotLaterThanAccess().getIsAtSingleOperationKeyword_4()); }
		('isAtSingleOperation(')*
		{ after(grammarAccess.getNotLaterThanAccess().getIsAtSingleOperationKeyword_4()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NotLaterThan__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NotLaterThan__Group__5__Impl
	rule__NotLaterThan__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__NotLaterThan__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getNotLaterThanAccess().getINTTerminalRuleCall_5()); }
		(RULE_INT)
		{ after(grammarAccess.getNotLaterThanAccess().getINTTerminalRuleCall_5()); }
	)
	(
		{ before(grammarAccess.getNotLaterThanAccess().getINTTerminalRuleCall_5()); }
		(RULE_INT)*
		{ after(grammarAccess.getNotLaterThanAccess().getINTTerminalRuleCall_5()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NotLaterThan__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NotLaterThan__Group__6__Impl
	rule__NotLaterThan__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__NotLaterThan__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getNotLaterThanAccess().getCommaKeyword_6()); }
		(',')
		{ after(grammarAccess.getNotLaterThanAccess().getCommaKeyword_6()); }
	)
	(
		{ before(grammarAccess.getNotLaterThanAccess().getCommaKeyword_6()); }
		(',')*
		{ after(grammarAccess.getNotLaterThanAccess().getCommaKeyword_6()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NotLaterThan__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NotLaterThan__Group__7__Impl
	rule__NotLaterThan__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__NotLaterThan__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getNotLaterThanAccess().getINTTerminalRuleCall_7()); }
		(RULE_INT)
		{ after(grammarAccess.getNotLaterThanAccess().getINTTerminalRuleCall_7()); }
	)
	(
		{ before(grammarAccess.getNotLaterThanAccess().getINTTerminalRuleCall_7()); }
		(RULE_INT)*
		{ after(grammarAccess.getNotLaterThanAccess().getINTTerminalRuleCall_7()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NotLaterThan__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NotLaterThan__Group__8__Impl
	rule__NotLaterThan__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__NotLaterThan__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getNotLaterThanAccess().getCommaKeyword_8()); }
		(',')
		{ after(grammarAccess.getNotLaterThanAccess().getCommaKeyword_8()); }
	)
	(
		{ before(grammarAccess.getNotLaterThanAccess().getCommaKeyword_8()); }
		(',')*
		{ after(grammarAccess.getNotLaterThanAccess().getCommaKeyword_8()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NotLaterThan__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NotLaterThan__Group__9__Impl
	rule__NotLaterThan__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__NotLaterThan__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getNotLaterThanAccess().getINTTerminalRuleCall_9()); }
		(RULE_INT)
		{ after(grammarAccess.getNotLaterThanAccess().getINTTerminalRuleCall_9()); }
	)
	(
		{ before(grammarAccess.getNotLaterThanAccess().getINTTerminalRuleCall_9()); }
		(RULE_INT)*
		{ after(grammarAccess.getNotLaterThanAccess().getINTTerminalRuleCall_9()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NotLaterThan__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NotLaterThan__Group__10__Impl
	rule__NotLaterThan__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__NotLaterThan__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getNotLaterThanAccess().getRightParenthesisEqualsSignKeyword_10()); }
		(')=')
		{ after(grammarAccess.getNotLaterThanAccess().getRightParenthesisEqualsSignKeyword_10()); }
	)
	(
		{ before(grammarAccess.getNotLaterThanAccess().getRightParenthesisEqualsSignKeyword_10()); }
		(')=')*
		{ after(grammarAccess.getNotLaterThanAccess().getRightParenthesisEqualsSignKeyword_10()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NotLaterThan__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NotLaterThan__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NotLaterThan__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNotLaterThanAccess().getTrueKeyword_11()); }
	'True'
	{ after(grammarAccess.getNotLaterThanAccess().getTrueKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Result__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Result__Group__0__Impl
	rule__Result__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Result__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getResultAccess().getNameAssignment_0()); }
		(rule__Result__NameAssignment_0)
		{ after(grammarAccess.getResultAccess().getNameAssignment_0()); }
	)
	(
		{ before(grammarAccess.getResultAccess().getNameAssignment_0()); }
		(rule__Result__NameAssignment_0)*
		{ after(grammarAccess.getResultAccess().getNameAssignment_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Result__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Result__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Result__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getResultAccess().getINTTerminalRuleCall_1()); }
	RULE_INT
	{ after(grammarAccess.getResultAccess().getINTTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Scenario__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenarioAccess().getNameSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getScenarioAccess().getNameSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__WhenAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenarioAccess().getWhenOperationParserRuleCall_3_0()); }
		ruleOperation
		{ after(grammarAccess.getScenarioAccess().getWhenOperationParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__GivenAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenarioAccess().getGivenOperationParserRuleCall_5_0()); }
		ruleOperation
		{ after(grammarAccess.getScenarioAccess().getGivenOperationParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__ThenAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenarioAccess().getThenResultParserRuleCall_7_0()); }
		ruleResult
		{ after(grammarAccess.getScenarioAccess().getThenResultParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__And1Assignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenarioAccess().getAnd1OperationParserRuleCall_9_0()); }
		ruleOperation
		{ after(grammarAccess.getScenarioAccess().getAnd1OperationParserRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RotateServoOperation__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRotateServoOperationAccess().getNameRotateServoOperationKeyword_0_0()); }
		(
			{ before(grammarAccess.getRotateServoOperationAccess().getNameRotateServoOperationKeyword_0_0()); }
			'rotateServoOperation('
			{ after(grammarAccess.getRotateServoOperationAccess().getNameRotateServoOperationKeyword_0_0()); }
		)
		{ after(grammarAccess.getRotateServoOperationAccess().getNameRotateServoOperationKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OperationalArm__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOperationalArmAccess().getNameOperationalArmKeyword_0_0()); }
		(
			{ before(grammarAccess.getOperationalArmAccess().getNameOperationalArmKeyword_0_0()); }
			'OperationalArm('
			{ after(grammarAccess.getOperationalArmAccess().getNameOperationalArmKeyword_0_0()); }
		)
		{ after(grammarAccess.getOperationalArmAccess().getNameOperationalArmKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NotLaterThan__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNotLaterThanAccess().getNameNotLaterThanKeyword_0_0()); }
		(
			{ before(grammarAccess.getNotLaterThanAccess().getNameNotLaterThanKeyword_0_0()); }
			'NotLaterThan('
			{ after(grammarAccess.getNotLaterThanAccess().getNameNotLaterThanKeyword_0_0()); }
		)
		{ after(grammarAccess.getNotLaterThanAccess().getNameNotLaterThanKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Result__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getResultAccess().getNameResultKeyword_0_0()); }
		(
			{ before(grammarAccess.getResultAccess().getNameResultKeyword_0_0()); }
			'result='
			{ after(grammarAccess.getResultAccess().getNameResultKeyword_0_0()); }
		)
		{ after(grammarAccess.getResultAccess().getNameResultKeyword_0_0()); }
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