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
import org.xtext.services.OperationsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOperationsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'prueba'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalOperationsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOperationsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOperationsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOperations.g"; }



     	private OperationsGrammarAccess grammarAccess;

        public InternalOperationsParser(TokenStream input, OperationsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Prueba";
       	}

       	@Override
       	protected OperationsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePrueba"
    // InternalOperations.g:64:1: entryRulePrueba returns [EObject current=null] : iv_rulePrueba= rulePrueba EOF ;
    public final EObject entryRulePrueba() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrueba = null;


        try {
            // InternalOperations.g:64:47: (iv_rulePrueba= rulePrueba EOF )
            // InternalOperations.g:65:2: iv_rulePrueba= rulePrueba EOF
            {
             newCompositeNode(grammarAccess.getPruebaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrueba=rulePrueba();

            state._fsp--;

             current =iv_rulePrueba; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrueba"


    // $ANTLR start "rulePrueba"
    // InternalOperations.g:71:1: rulePrueba returns [EObject current=null] : (otherlv_0= 'prueba' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject rulePrueba() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalOperations.g:77:2: ( (otherlv_0= 'prueba' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalOperations.g:78:2: (otherlv_0= 'prueba' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalOperations.g:78:2: (otherlv_0= 'prueba' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalOperations.g:79:3: otherlv_0= 'prueba' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPruebaAccess().getPruebaKeyword_0());
            		
            // InternalOperations.g:83:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalOperations.g:84:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalOperations.g:84:4: (lv_name_1_0= RULE_STRING )
            // InternalOperations.g:85:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPruebaAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPruebaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrueba"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});

}