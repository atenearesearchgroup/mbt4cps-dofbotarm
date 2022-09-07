/*
 * generated by Xtext 2.26.0
 */
package org.xtext.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.parser.antlr.internal.InternalCPtesterParser;
import org.xtext.services.CPtesterGrammarAccess;

public class CPtesterParser extends AbstractAntlrParser {

	@Inject
	private CPtesterGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalCPtesterParser createParser(XtextTokenStream stream) {
		return new InternalCPtesterParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Scenario";
	}

	public CPtesterGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CPtesterGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
