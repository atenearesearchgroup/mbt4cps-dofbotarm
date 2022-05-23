/*
 * generated by Xtext 2.21.0
 */
package lsi.us.es.mis.xtext.parser.antlr;

import com.google.inject.Inject;
import lsi.us.es.mis.xtext.parser.antlr.internal.InternalMyWorldDslParser;
import lsi.us.es.mis.xtext.services.MyWorldDslGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class MyWorldDslParser extends AbstractAntlrParser {

	@Inject
	private MyWorldDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMyWorldDslParser createParser(XtextTokenStream stream) {
		return new InternalMyWorldDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "World";
	}

	public MyWorldDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyWorldDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
