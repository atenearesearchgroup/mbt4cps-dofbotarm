/*
 * generated by Xtext 2.26.0
 */
package org.xtext.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.parser.antlr.internal.InternalSolutionParser;
import org.xtext.services.SolutionGrammarAccess;

public class SolutionParser extends AbstractAntlrParser {

	@Inject
	private SolutionGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSolutionParser createParser(XtextTokenStream stream) {
		return new InternalSolutionParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Solution";
	}

	public SolutionGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SolutionGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
