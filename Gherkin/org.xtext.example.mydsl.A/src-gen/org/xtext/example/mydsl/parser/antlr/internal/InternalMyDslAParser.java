package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslAGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslAParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'contact'", "'{'", "'phone'", "'}'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslAParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslAParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslAParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDslA.g"; }



     	private MyDslAGrammarAccess grammarAccess;

        public InternalMyDslAParser(TokenStream input, MyDslAGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Person";
       	}

       	@Override
       	protected MyDslAGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePerson"
    // InternalMyDslA.g:64:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalMyDslA.g:64:47: (iv_rulePerson= rulePerson EOF )
            // InternalMyDslA.g:65:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
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
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalMyDslA.g:71:1: rulePerson returns [EObject current=null] : (otherlv_0= 'contact' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'phone' ( (lv_phone_4_0= RULE_INT ) ) otherlv_5= '}' ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_phone_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDslA.g:77:2: ( (otherlv_0= 'contact' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'phone' ( (lv_phone_4_0= RULE_INT ) ) otherlv_5= '}' ) )
            // InternalMyDslA.g:78:2: (otherlv_0= 'contact' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'phone' ( (lv_phone_4_0= RULE_INT ) ) otherlv_5= '}' )
            {
            // InternalMyDslA.g:78:2: (otherlv_0= 'contact' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'phone' ( (lv_phone_4_0= RULE_INT ) ) otherlv_5= '}' )
            // InternalMyDslA.g:79:3: otherlv_0= 'contact' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'phone' ( (lv_phone_4_0= RULE_INT ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonAccess().getContactKeyword_0());
            		
            // InternalMyDslA.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDslA.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDslA.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalMyDslA.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getPersonAccess().getPhoneKeyword_3());
            		
            // InternalMyDslA.g:109:3: ( (lv_phone_4_0= RULE_INT ) )
            // InternalMyDslA.g:110:4: (lv_phone_4_0= RULE_INT )
            {
            // InternalMyDslA.g:110:4: (lv_phone_4_0= RULE_INT )
            // InternalMyDslA.g:111:5: lv_phone_4_0= RULE_INT
            {
            lv_phone_4_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_phone_4_0, grammarAccess.getPersonAccess().getPhoneINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"phone",
            						lv_phone_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "rulePerson"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});

}