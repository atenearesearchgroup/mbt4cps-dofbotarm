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
import org.xtext.services.PruebaMainGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPruebaMainParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Scenario'", "'{'", "'}'", "'GIVEN'", "'WHEN'", "'THEN'", "'AND'", "'Query'", "'returns'", "'posInicial'", "'('", "')'", "'rotateServo'", "','", "'rotateAllServos'", "'result'", "'NotLaterThan'", "'isAtSingle'", "'isAt'", "'true'", "'false'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPruebaMainParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPruebaMainParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPruebaMainParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPruebaMain.g"; }



     	private PruebaMainGrammarAccess grammarAccess;

        public InternalPruebaMainParser(TokenStream input, PruebaMainGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Scenario";
       	}

       	@Override
       	protected PruebaMainGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleScenario"
    // InternalPruebaMain.g:65:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalPruebaMain.g:65:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalPruebaMain.g:66:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
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
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // InternalPruebaMain.g:72:1: ruleScenario returns [EObject current=null] : (otherlv_0= 'Scenario' ( (lv_surname_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_given_3_0= ruleGiven ) ) ( (lv_andGiven_4_0= ruleAnd ) )* ( (lv_when_5_0= ruleWhen ) ) ( (lv_then_6_0= ruleThen ) ) ( (lv_and_7_0= ruleAnd ) )+ otherlv_8= '}' ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_surname_1_0=null;
        Token otherlv_2=null;
        Token otherlv_8=null;
        EObject lv_given_3_0 = null;

        EObject lv_andGiven_4_0 = null;

        EObject lv_when_5_0 = null;

        EObject lv_then_6_0 = null;

        EObject lv_and_7_0 = null;



        	enterRule();

        try {
            // InternalPruebaMain.g:78:2: ( (otherlv_0= 'Scenario' ( (lv_surname_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_given_3_0= ruleGiven ) ) ( (lv_andGiven_4_0= ruleAnd ) )* ( (lv_when_5_0= ruleWhen ) ) ( (lv_then_6_0= ruleThen ) ) ( (lv_and_7_0= ruleAnd ) )+ otherlv_8= '}' ) )
            // InternalPruebaMain.g:79:2: (otherlv_0= 'Scenario' ( (lv_surname_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_given_3_0= ruleGiven ) ) ( (lv_andGiven_4_0= ruleAnd ) )* ( (lv_when_5_0= ruleWhen ) ) ( (lv_then_6_0= ruleThen ) ) ( (lv_and_7_0= ruleAnd ) )+ otherlv_8= '}' )
            {
            // InternalPruebaMain.g:79:2: (otherlv_0= 'Scenario' ( (lv_surname_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_given_3_0= ruleGiven ) ) ( (lv_andGiven_4_0= ruleAnd ) )* ( (lv_when_5_0= ruleWhen ) ) ( (lv_then_6_0= ruleThen ) ) ( (lv_and_7_0= ruleAnd ) )+ otherlv_8= '}' )
            // InternalPruebaMain.g:80:3: otherlv_0= 'Scenario' ( (lv_surname_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_given_3_0= ruleGiven ) ) ( (lv_andGiven_4_0= ruleAnd ) )* ( (lv_when_5_0= ruleWhen ) ) ( (lv_then_6_0= ruleThen ) ) ( (lv_and_7_0= ruleAnd ) )+ otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getScenarioKeyword_0());
            		
            // InternalPruebaMain.g:84:3: ( (lv_surname_1_0= RULE_STRING ) )
            // InternalPruebaMain.g:85:4: (lv_surname_1_0= RULE_STRING )
            {
            // InternalPruebaMain.g:85:4: (lv_surname_1_0= RULE_STRING )
            // InternalPruebaMain.g:86:5: lv_surname_1_0= RULE_STRING
            {
            lv_surname_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_surname_1_0, grammarAccess.getScenarioAccess().getSurnameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScenarioRule());
            					}
            					setWithLastConsumed(
            						current,
            						"surname",
            						lv_surname_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPruebaMain.g:106:3: ( (lv_given_3_0= ruleGiven ) )
            // InternalPruebaMain.g:107:4: (lv_given_3_0= ruleGiven )
            {
            // InternalPruebaMain.g:107:4: (lv_given_3_0= ruleGiven )
            // InternalPruebaMain.g:108:5: lv_given_3_0= ruleGiven
            {

            					newCompositeNode(grammarAccess.getScenarioAccess().getGivenGivenParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_given_3_0=ruleGiven();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioRule());
            					}
            					set(
            						current,
            						"given",
            						lv_given_3_0,
            						"org.xtext.PruebaMain.Given");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPruebaMain.g:125:3: ( (lv_andGiven_4_0= ruleAnd ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPruebaMain.g:126:4: (lv_andGiven_4_0= ruleAnd )
            	    {
            	    // InternalPruebaMain.g:126:4: (lv_andGiven_4_0= ruleAnd )
            	    // InternalPruebaMain.g:127:5: lv_andGiven_4_0= ruleAnd
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getAndGivenAndParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_andGiven_4_0=ruleAnd();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioRule());
            	    					}
            	    					add(
            	    						current,
            	    						"andGiven",
            	    						lv_andGiven_4_0,
            	    						"org.xtext.PruebaMain.And");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalPruebaMain.g:144:3: ( (lv_when_5_0= ruleWhen ) )
            // InternalPruebaMain.g:145:4: (lv_when_5_0= ruleWhen )
            {
            // InternalPruebaMain.g:145:4: (lv_when_5_0= ruleWhen )
            // InternalPruebaMain.g:146:5: lv_when_5_0= ruleWhen
            {

            					newCompositeNode(grammarAccess.getScenarioAccess().getWhenWhenParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_when_5_0=ruleWhen();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioRule());
            					}
            					set(
            						current,
            						"when",
            						lv_when_5_0,
            						"org.xtext.PruebaMain.When");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPruebaMain.g:163:3: ( (lv_then_6_0= ruleThen ) )
            // InternalPruebaMain.g:164:4: (lv_then_6_0= ruleThen )
            {
            // InternalPruebaMain.g:164:4: (lv_then_6_0= ruleThen )
            // InternalPruebaMain.g:165:5: lv_then_6_0= ruleThen
            {

            					newCompositeNode(grammarAccess.getScenarioAccess().getThenThenParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_then_6_0=ruleThen();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioRule());
            					}
            					set(
            						current,
            						"then",
            						lv_then_6_0,
            						"org.xtext.PruebaMain.Then");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPruebaMain.g:182:3: ( (lv_and_7_0= ruleAnd ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPruebaMain.g:183:4: (lv_and_7_0= ruleAnd )
            	    {
            	    // InternalPruebaMain.g:183:4: (lv_and_7_0= ruleAnd )
            	    // InternalPruebaMain.g:184:5: lv_and_7_0= ruleAnd
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getAndAndParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_and_7_0=ruleAnd();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioRule());
            	    					}
            	    					add(
            	    						current,
            	    						"and",
            	    						lv_and_7_0,
            	    						"org.xtext.PruebaMain.And");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleGiven"
    // InternalPruebaMain.g:209:1: entryRuleGiven returns [EObject current=null] : iv_ruleGiven= ruleGiven EOF ;
    public final EObject entryRuleGiven() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGiven = null;


        try {
            // InternalPruebaMain.g:209:46: (iv_ruleGiven= ruleGiven EOF )
            // InternalPruebaMain.g:210:2: iv_ruleGiven= ruleGiven EOF
            {
             newCompositeNode(grammarAccess.getGivenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGiven=ruleGiven();

            state._fsp--;

             current =iv_ruleGiven; 
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
    // $ANTLR end "entryRuleGiven"


    // $ANTLR start "ruleGiven"
    // InternalPruebaMain.g:216:1: ruleGiven returns [EObject current=null] : ( ( (lv_name_0_0= 'GIVEN' ) ) ( (lv_initial_1_0= ruleInitial ) ) ) ;
    public final EObject ruleGiven() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_initial_1_0 = null;



        	enterRule();

        try {
            // InternalPruebaMain.g:222:2: ( ( ( (lv_name_0_0= 'GIVEN' ) ) ( (lv_initial_1_0= ruleInitial ) ) ) )
            // InternalPruebaMain.g:223:2: ( ( (lv_name_0_0= 'GIVEN' ) ) ( (lv_initial_1_0= ruleInitial ) ) )
            {
            // InternalPruebaMain.g:223:2: ( ( (lv_name_0_0= 'GIVEN' ) ) ( (lv_initial_1_0= ruleInitial ) ) )
            // InternalPruebaMain.g:224:3: ( (lv_name_0_0= 'GIVEN' ) ) ( (lv_initial_1_0= ruleInitial ) )
            {
            // InternalPruebaMain.g:224:3: ( (lv_name_0_0= 'GIVEN' ) )
            // InternalPruebaMain.g:225:4: (lv_name_0_0= 'GIVEN' )
            {
            // InternalPruebaMain.g:225:4: (lv_name_0_0= 'GIVEN' )
            // InternalPruebaMain.g:226:5: lv_name_0_0= 'GIVEN'
            {
            lv_name_0_0=(Token)match(input,14,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getGivenAccess().getNameGIVENKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGivenRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "GIVEN");
            				

            }


            }

            // InternalPruebaMain.g:238:3: ( (lv_initial_1_0= ruleInitial ) )
            // InternalPruebaMain.g:239:4: (lv_initial_1_0= ruleInitial )
            {
            // InternalPruebaMain.g:239:4: (lv_initial_1_0= ruleInitial )
            // InternalPruebaMain.g:240:5: lv_initial_1_0= ruleInitial
            {

            					newCompositeNode(grammarAccess.getGivenAccess().getInitialInitialParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_initial_1_0=ruleInitial();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGivenRule());
            					}
            					add(
            						current,
            						"initial",
            						lv_initial_1_0,
            						"org.xtext.PruebaOperation.Initial");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleGiven"


    // $ANTLR start "entryRuleWhen"
    // InternalPruebaMain.g:261:1: entryRuleWhen returns [EObject current=null] : iv_ruleWhen= ruleWhen EOF ;
    public final EObject entryRuleWhen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhen = null;


        try {
            // InternalPruebaMain.g:261:45: (iv_ruleWhen= ruleWhen EOF )
            // InternalPruebaMain.g:262:2: iv_ruleWhen= ruleWhen EOF
            {
             newCompositeNode(grammarAccess.getWhenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhen=ruleWhen();

            state._fsp--;

             current =iv_ruleWhen; 
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
    // $ANTLR end "entryRuleWhen"


    // $ANTLR start "ruleWhen"
    // InternalPruebaMain.g:268:1: ruleWhen returns [EObject current=null] : ( ( (lv_name_0_0= 'WHEN' ) ) ( (lv_command_1_0= ruleCommand ) ) ) ;
    public final EObject ruleWhen() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_command_1_0 = null;



        	enterRule();

        try {
            // InternalPruebaMain.g:274:2: ( ( ( (lv_name_0_0= 'WHEN' ) ) ( (lv_command_1_0= ruleCommand ) ) ) )
            // InternalPruebaMain.g:275:2: ( ( (lv_name_0_0= 'WHEN' ) ) ( (lv_command_1_0= ruleCommand ) ) )
            {
            // InternalPruebaMain.g:275:2: ( ( (lv_name_0_0= 'WHEN' ) ) ( (lv_command_1_0= ruleCommand ) ) )
            // InternalPruebaMain.g:276:3: ( (lv_name_0_0= 'WHEN' ) ) ( (lv_command_1_0= ruleCommand ) )
            {
            // InternalPruebaMain.g:276:3: ( (lv_name_0_0= 'WHEN' ) )
            // InternalPruebaMain.g:277:4: (lv_name_0_0= 'WHEN' )
            {
            // InternalPruebaMain.g:277:4: (lv_name_0_0= 'WHEN' )
            // InternalPruebaMain.g:278:5: lv_name_0_0= 'WHEN'
            {
            lv_name_0_0=(Token)match(input,15,FOLLOW_11); 

            					newLeafNode(lv_name_0_0, grammarAccess.getWhenAccess().getNameWHENKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWhenRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "WHEN");
            				

            }


            }

            // InternalPruebaMain.g:290:3: ( (lv_command_1_0= ruleCommand ) )
            // InternalPruebaMain.g:291:4: (lv_command_1_0= ruleCommand )
            {
            // InternalPruebaMain.g:291:4: (lv_command_1_0= ruleCommand )
            // InternalPruebaMain.g:292:5: lv_command_1_0= ruleCommand
            {

            					newCompositeNode(grammarAccess.getWhenAccess().getCommandCommandParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_command_1_0=ruleCommand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhenRule());
            					}
            					add(
            						current,
            						"command",
            						lv_command_1_0,
            						"org.xtext.PruebaOperation.Command");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleWhen"


    // $ANTLR start "entryRuleThen"
    // InternalPruebaMain.g:313:1: entryRuleThen returns [EObject current=null] : iv_ruleThen= ruleThen EOF ;
    public final EObject entryRuleThen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThen = null;


        try {
            // InternalPruebaMain.g:313:45: (iv_ruleThen= ruleThen EOF )
            // InternalPruebaMain.g:314:2: iv_ruleThen= ruleThen EOF
            {
             newCompositeNode(grammarAccess.getThenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThen=ruleThen();

            state._fsp--;

             current =iv_ruleThen; 
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
    // $ANTLR end "entryRuleThen"


    // $ANTLR start "ruleThen"
    // InternalPruebaMain.g:320:1: ruleThen returns [EObject current=null] : ( ( (lv_name_0_0= 'THEN' ) ) ( (lv_result_1_0= ruleResult ) ) ) ;
    public final EObject ruleThen() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_result_1_0 = null;



        	enterRule();

        try {
            // InternalPruebaMain.g:326:2: ( ( ( (lv_name_0_0= 'THEN' ) ) ( (lv_result_1_0= ruleResult ) ) ) )
            // InternalPruebaMain.g:327:2: ( ( (lv_name_0_0= 'THEN' ) ) ( (lv_result_1_0= ruleResult ) ) )
            {
            // InternalPruebaMain.g:327:2: ( ( (lv_name_0_0= 'THEN' ) ) ( (lv_result_1_0= ruleResult ) ) )
            // InternalPruebaMain.g:328:3: ( (lv_name_0_0= 'THEN' ) ) ( (lv_result_1_0= ruleResult ) )
            {
            // InternalPruebaMain.g:328:3: ( (lv_name_0_0= 'THEN' ) )
            // InternalPruebaMain.g:329:4: (lv_name_0_0= 'THEN' )
            {
            // InternalPruebaMain.g:329:4: (lv_name_0_0= 'THEN' )
            // InternalPruebaMain.g:330:5: lv_name_0_0= 'THEN'
            {
            lv_name_0_0=(Token)match(input,16,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getThenAccess().getNameTHENKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getThenRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "THEN");
            				

            }


            }

            // InternalPruebaMain.g:342:3: ( (lv_result_1_0= ruleResult ) )
            // InternalPruebaMain.g:343:4: (lv_result_1_0= ruleResult )
            {
            // InternalPruebaMain.g:343:4: (lv_result_1_0= ruleResult )
            // InternalPruebaMain.g:344:5: lv_result_1_0= ruleResult
            {

            					newCompositeNode(grammarAccess.getThenAccess().getResultResultParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_result_1_0=ruleResult();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThenRule());
            					}
            					add(
            						current,
            						"result",
            						lv_result_1_0,
            						"org.xtext.PruebaOperation.Result");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleThen"


    // $ANTLR start "entryRuleAnd"
    // InternalPruebaMain.g:365:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalPruebaMain.g:365:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalPruebaMain.g:366:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalPruebaMain.g:372:1: ruleAnd returns [EObject current=null] : ( ( (lv_name_0_0= 'AND' ) ) ( (lv_conditions_1_0= ruleConditions ) ) otherlv_2= 'Query' ( (lv_solution_3_0= ruleSolution ) ) otherlv_4= 'returns' ( (lv_state_5_0= ruleState ) ) ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_conditions_1_0 = null;

        EObject lv_solution_3_0 = null;

        Enumerator lv_state_5_0 = null;



        	enterRule();

        try {
            // InternalPruebaMain.g:378:2: ( ( ( (lv_name_0_0= 'AND' ) ) ( (lv_conditions_1_0= ruleConditions ) ) otherlv_2= 'Query' ( (lv_solution_3_0= ruleSolution ) ) otherlv_4= 'returns' ( (lv_state_5_0= ruleState ) ) ) )
            // InternalPruebaMain.g:379:2: ( ( (lv_name_0_0= 'AND' ) ) ( (lv_conditions_1_0= ruleConditions ) ) otherlv_2= 'Query' ( (lv_solution_3_0= ruleSolution ) ) otherlv_4= 'returns' ( (lv_state_5_0= ruleState ) ) )
            {
            // InternalPruebaMain.g:379:2: ( ( (lv_name_0_0= 'AND' ) ) ( (lv_conditions_1_0= ruleConditions ) ) otherlv_2= 'Query' ( (lv_solution_3_0= ruleSolution ) ) otherlv_4= 'returns' ( (lv_state_5_0= ruleState ) ) )
            // InternalPruebaMain.g:380:3: ( (lv_name_0_0= 'AND' ) ) ( (lv_conditions_1_0= ruleConditions ) ) otherlv_2= 'Query' ( (lv_solution_3_0= ruleSolution ) ) otherlv_4= 'returns' ( (lv_state_5_0= ruleState ) )
            {
            // InternalPruebaMain.g:380:3: ( (lv_name_0_0= 'AND' ) )
            // InternalPruebaMain.g:381:4: (lv_name_0_0= 'AND' )
            {
            // InternalPruebaMain.g:381:4: (lv_name_0_0= 'AND' )
            // InternalPruebaMain.g:382:5: lv_name_0_0= 'AND'
            {
            lv_name_0_0=(Token)match(input,17,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAndAccess().getNameANDKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAndRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "AND");
            				

            }


            }

            // InternalPruebaMain.g:394:3: ( (lv_conditions_1_0= ruleConditions ) )
            // InternalPruebaMain.g:395:4: (lv_conditions_1_0= ruleConditions )
            {
            // InternalPruebaMain.g:395:4: (lv_conditions_1_0= ruleConditions )
            // InternalPruebaMain.g:396:5: lv_conditions_1_0= ruleConditions
            {

            					newCompositeNode(grammarAccess.getAndAccess().getConditionsConditionsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_conditions_1_0=ruleConditions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndRule());
            					}
            					add(
            						current,
            						"conditions",
            						lv_conditions_1_0,
            						"org.xtext.PruebaOperation.Conditions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getAndAccess().getQueryKeyword_2());
            		
            // InternalPruebaMain.g:417:3: ( (lv_solution_3_0= ruleSolution ) )
            // InternalPruebaMain.g:418:4: (lv_solution_3_0= ruleSolution )
            {
            // InternalPruebaMain.g:418:4: (lv_solution_3_0= ruleSolution )
            // InternalPruebaMain.g:419:5: lv_solution_3_0= ruleSolution
            {

            					newCompositeNode(grammarAccess.getAndAccess().getSolutionSolutionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_solution_3_0=ruleSolution();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndRule());
            					}
            					add(
            						current,
            						"solution",
            						lv_solution_3_0,
            						"org.xtext.PruebaOperation.Solution");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getAndAccess().getReturnsKeyword_4());
            		
            // InternalPruebaMain.g:440:3: ( (lv_state_5_0= ruleState ) )
            // InternalPruebaMain.g:441:4: (lv_state_5_0= ruleState )
            {
            // InternalPruebaMain.g:441:4: (lv_state_5_0= ruleState )
            // InternalPruebaMain.g:442:5: lv_state_5_0= ruleState
            {

            					newCompositeNode(grammarAccess.getAndAccess().getStateStateEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_state_5_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndRule());
            					}
            					set(
            						current,
            						"state",
            						lv_state_5_0,
            						"org.xtext.PruebaOperation.State");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleInitial"
    // InternalPruebaMain.g:463:1: entryRuleInitial returns [EObject current=null] : iv_ruleInitial= ruleInitial EOF ;
    public final EObject entryRuleInitial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitial = null;


        try {
            // InternalPruebaMain.g:463:48: (iv_ruleInitial= ruleInitial EOF )
            // InternalPruebaMain.g:464:2: iv_ruleInitial= ruleInitial EOF
            {
             newCompositeNode(grammarAccess.getInitialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitial=ruleInitial();

            state._fsp--;

             current =iv_ruleInitial; 
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
    // $ANTLR end "entryRuleInitial"


    // $ANTLR start "ruleInitial"
    // InternalPruebaMain.g:470:1: ruleInitial returns [EObject current=null] : ( ( (lv_name_0_0= 'posInicial' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' ) ;
    public final EObject ruleInitial() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_time_2_0 = null;



        	enterRule();

        try {
            // InternalPruebaMain.g:476:2: ( ( ( (lv_name_0_0= 'posInicial' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' ) )
            // InternalPruebaMain.g:477:2: ( ( (lv_name_0_0= 'posInicial' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' )
            {
            // InternalPruebaMain.g:477:2: ( ( (lv_name_0_0= 'posInicial' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' )
            // InternalPruebaMain.g:478:3: ( (lv_name_0_0= 'posInicial' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')'
            {
            // InternalPruebaMain.g:478:3: ( (lv_name_0_0= 'posInicial' ) )
            // InternalPruebaMain.g:479:4: (lv_name_0_0= 'posInicial' )
            {
            // InternalPruebaMain.g:479:4: (lv_name_0_0= 'posInicial' )
            // InternalPruebaMain.g:480:5: lv_name_0_0= 'posInicial'
            {
            lv_name_0_0=(Token)match(input,20,FOLLOW_18); 

            					newLeafNode(lv_name_0_0, grammarAccess.getInitialAccess().getNamePosInicialKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "posInicial");
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getInitialAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPruebaMain.g:496:3: ( (lv_time_2_0= ruleTime ) )
            // InternalPruebaMain.g:497:4: (lv_time_2_0= ruleTime )
            {
            // InternalPruebaMain.g:497:4: (lv_time_2_0= ruleTime )
            // InternalPruebaMain.g:498:5: lv_time_2_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getInitialAccess().getTimeTimeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_time_2_0=ruleTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialRule());
            					}
            					add(
            						current,
            						"time",
            						lv_time_2_0,
            						"org.xtext.PruebaOperation.Time");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getInitialAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleInitial"


    // $ANTLR start "entryRuleCommand"
    // InternalPruebaMain.g:523:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalPruebaMain.g:523:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalPruebaMain.g:524:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalPruebaMain.g:530:1: ruleCommand returns [EObject current=null] : (this_rotateServo_0= rulerotateServo | this_rotateAllServos_1= rulerotateAllServos ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_rotateServo_0 = null;

        EObject this_rotateAllServos_1 = null;



        	enterRule();

        try {
            // InternalPruebaMain.g:536:2: ( (this_rotateServo_0= rulerotateServo | this_rotateAllServos_1= rulerotateAllServos ) )
            // InternalPruebaMain.g:537:2: (this_rotateServo_0= rulerotateServo | this_rotateAllServos_1= rulerotateAllServos )
            {
            // InternalPruebaMain.g:537:2: (this_rotateServo_0= rulerotateServo | this_rotateAllServos_1= rulerotateAllServos )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            else if ( (LA3_0==25) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPruebaMain.g:538:3: this_rotateServo_0= rulerotateServo
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getRotateServoParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_rotateServo_0=rulerotateServo();

                    state._fsp--;


                    			current = this_rotateServo_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPruebaMain.g:547:3: this_rotateAllServos_1= rulerotateAllServos
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getRotateAllServosParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_rotateAllServos_1=rulerotateAllServos();

                    state._fsp--;


                    			current = this_rotateAllServos_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRulerotateServo"
    // InternalPruebaMain.g:559:1: entryRulerotateServo returns [EObject current=null] : iv_rulerotateServo= rulerotateServo EOF ;
    public final EObject entryRulerotateServo() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerotateServo = null;


        try {
            // InternalPruebaMain.g:559:52: (iv_rulerotateServo= rulerotateServo EOF )
            // InternalPruebaMain.g:560:2: iv_rulerotateServo= rulerotateServo EOF
            {
             newCompositeNode(grammarAccess.getRotateServoRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerotateServo=rulerotateServo();

            state._fsp--;

             current =iv_rulerotateServo; 
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
    // $ANTLR end "entryRulerotateServo"


    // $ANTLR start "rulerotateServo"
    // InternalPruebaMain.g:566:1: rulerotateServo returns [EObject current=null] : ( ( (lv_name_0_0= 'rotateServo' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_time_6_0= ruleTime ) ) otherlv_7= ')' ) ;
    public final EObject rulerotateServo() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_servo_2_0 = null;

        EObject lv_angle_4_0 = null;

        EObject lv_time_6_0 = null;



        	enterRule();

        try {
            // InternalPruebaMain.g:572:2: ( ( ( (lv_name_0_0= 'rotateServo' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_time_6_0= ruleTime ) ) otherlv_7= ')' ) )
            // InternalPruebaMain.g:573:2: ( ( (lv_name_0_0= 'rotateServo' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_time_6_0= ruleTime ) ) otherlv_7= ')' )
            {
            // InternalPruebaMain.g:573:2: ( ( (lv_name_0_0= 'rotateServo' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_time_6_0= ruleTime ) ) otherlv_7= ')' )
            // InternalPruebaMain.g:574:3: ( (lv_name_0_0= 'rotateServo' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_time_6_0= ruleTime ) ) otherlv_7= ')'
            {
            // InternalPruebaMain.g:574:3: ( (lv_name_0_0= 'rotateServo' ) )
            // InternalPruebaMain.g:575:4: (lv_name_0_0= 'rotateServo' )
            {
            // InternalPruebaMain.g:575:4: (lv_name_0_0= 'rotateServo' )
            // InternalPruebaMain.g:576:5: lv_name_0_0= 'rotateServo'
            {
            lv_name_0_0=(Token)match(input,23,FOLLOW_18); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRotateServoAccess().getNameRotateServoKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotateServoRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "rotateServo");
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getRotateServoAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPruebaMain.g:592:3: ( (lv_servo_2_0= ruleServo ) )
            // InternalPruebaMain.g:593:4: (lv_servo_2_0= ruleServo )
            {
            // InternalPruebaMain.g:593:4: (lv_servo_2_0= ruleServo )
            // InternalPruebaMain.g:594:5: lv_servo_2_0= ruleServo
            {

            					newCompositeNode(grammarAccess.getRotateServoAccess().getServoServoParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_servo_2_0=ruleServo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateServoRule());
            					}
            					add(
            						current,
            						"servo",
            						lv_servo_2_0,
            						"org.xtext.PruebaOperation.Servo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getRotateServoAccess().getCommaKeyword_3());
            		
            // InternalPruebaMain.g:615:3: ( (lv_angle_4_0= ruleAngle ) )
            // InternalPruebaMain.g:616:4: (lv_angle_4_0= ruleAngle )
            {
            // InternalPruebaMain.g:616:4: (lv_angle_4_0= ruleAngle )
            // InternalPruebaMain.g:617:5: lv_angle_4_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getRotateServoAccess().getAngleAngleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
            lv_angle_4_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateServoRule());
            					}
            					add(
            						current,
            						"angle",
            						lv_angle_4_0,
            						"org.xtext.PruebaOperation.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getRotateServoAccess().getCommaKeyword_5());
            		
            // InternalPruebaMain.g:638:3: ( (lv_time_6_0= ruleTime ) )
            // InternalPruebaMain.g:639:4: (lv_time_6_0= ruleTime )
            {
            // InternalPruebaMain.g:639:4: (lv_time_6_0= ruleTime )
            // InternalPruebaMain.g:640:5: lv_time_6_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getRotateServoAccess().getTimeTimeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_20);
            lv_time_6_0=ruleTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateServoRule());
            					}
            					add(
            						current,
            						"time",
            						lv_time_6_0,
            						"org.xtext.PruebaOperation.Time");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRotateServoAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "rulerotateServo"


    // $ANTLR start "entryRulerotateAllServos"
    // InternalPruebaMain.g:665:1: entryRulerotateAllServos returns [EObject current=null] : iv_rulerotateAllServos= rulerotateAllServos EOF ;
    public final EObject entryRulerotateAllServos() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerotateAllServos = null;


        try {
            // InternalPruebaMain.g:665:56: (iv_rulerotateAllServos= rulerotateAllServos EOF )
            // InternalPruebaMain.g:666:2: iv_rulerotateAllServos= rulerotateAllServos EOF
            {
             newCompositeNode(grammarAccess.getRotateAllServosRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerotateAllServos=rulerotateAllServos();

            state._fsp--;

             current =iv_rulerotateAllServos; 
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
    // $ANTLR end "entryRulerotateAllServos"


    // $ANTLR start "rulerotateAllServos"
    // InternalPruebaMain.g:672:1: rulerotateAllServos returns [EObject current=null] : ( ( (lv_name_0_0= 'rotateAllServos' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_time_14_0= ruleTime ) ) otherlv_15= ')' ) ;
    public final EObject rulerotateAllServos() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_angle1_2_0 = null;

        EObject lv_angle2_4_0 = null;

        EObject lv_angle3_6_0 = null;

        EObject lv_angle4_8_0 = null;

        EObject lv_angle5_10_0 = null;

        EObject lv_angle6_12_0 = null;

        EObject lv_time_14_0 = null;



        	enterRule();

        try {
            // InternalPruebaMain.g:678:2: ( ( ( (lv_name_0_0= 'rotateAllServos' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_time_14_0= ruleTime ) ) otherlv_15= ')' ) )
            // InternalPruebaMain.g:679:2: ( ( (lv_name_0_0= 'rotateAllServos' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_time_14_0= ruleTime ) ) otherlv_15= ')' )
            {
            // InternalPruebaMain.g:679:2: ( ( (lv_name_0_0= 'rotateAllServos' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_time_14_0= ruleTime ) ) otherlv_15= ')' )
            // InternalPruebaMain.g:680:3: ( (lv_name_0_0= 'rotateAllServos' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_time_14_0= ruleTime ) ) otherlv_15= ')'
            {
            // InternalPruebaMain.g:680:3: ( (lv_name_0_0= 'rotateAllServos' ) )
            // InternalPruebaMain.g:681:4: (lv_name_0_0= 'rotateAllServos' )
            {
            // InternalPruebaMain.g:681:4: (lv_name_0_0= 'rotateAllServos' )
            // InternalPruebaMain.g:682:5: lv_name_0_0= 'rotateAllServos'
            {
            lv_name_0_0=(Token)match(input,25,FOLLOW_18); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRotateAllServosAccess().getNameRotateAllServosKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotateAllServosRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "rotateAllServos");
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getRotateAllServosAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPruebaMain.g:698:3: ( (lv_angle1_2_0= ruleAngle ) )
            // InternalPruebaMain.g:699:4: (lv_angle1_2_0= ruleAngle )
            {
            // InternalPruebaMain.g:699:4: (lv_angle1_2_0= ruleAngle )
            // InternalPruebaMain.g:700:5: lv_angle1_2_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getRotateAllServosAccess().getAngle1AngleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_angle1_2_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateAllServosRule());
            					}
            					add(
            						current,
            						"angle1",
            						lv_angle1_2_0,
            						"org.xtext.PruebaOperation.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getRotateAllServosAccess().getCommaKeyword_3());
            		
            // InternalPruebaMain.g:721:3: ( (lv_angle2_4_0= ruleAngle ) )
            // InternalPruebaMain.g:722:4: (lv_angle2_4_0= ruleAngle )
            {
            // InternalPruebaMain.g:722:4: (lv_angle2_4_0= ruleAngle )
            // InternalPruebaMain.g:723:5: lv_angle2_4_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getRotateAllServosAccess().getAngle2AngleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
            lv_angle2_4_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateAllServosRule());
            					}
            					add(
            						current,
            						"angle2",
            						lv_angle2_4_0,
            						"org.xtext.PruebaOperation.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getRotateAllServosAccess().getCommaKeyword_5());
            		
            // InternalPruebaMain.g:744:3: ( (lv_angle3_6_0= ruleAngle ) )
            // InternalPruebaMain.g:745:4: (lv_angle3_6_0= ruleAngle )
            {
            // InternalPruebaMain.g:745:4: (lv_angle3_6_0= ruleAngle )
            // InternalPruebaMain.g:746:5: lv_angle3_6_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getRotateAllServosAccess().getAngle3AngleParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_21);
            lv_angle3_6_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateAllServosRule());
            					}
            					add(
            						current,
            						"angle3",
            						lv_angle3_6_0,
            						"org.xtext.PruebaOperation.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getRotateAllServosAccess().getCommaKeyword_7());
            		
            // InternalPruebaMain.g:767:3: ( (lv_angle4_8_0= ruleAngle ) )
            // InternalPruebaMain.g:768:4: (lv_angle4_8_0= ruleAngle )
            {
            // InternalPruebaMain.g:768:4: (lv_angle4_8_0= ruleAngle )
            // InternalPruebaMain.g:769:5: lv_angle4_8_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getRotateAllServosAccess().getAngle4AngleParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_21);
            lv_angle4_8_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateAllServosRule());
            					}
            					add(
            						current,
            						"angle4",
            						lv_angle4_8_0,
            						"org.xtext.PruebaOperation.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_9, grammarAccess.getRotateAllServosAccess().getCommaKeyword_9());
            		
            // InternalPruebaMain.g:790:3: ( (lv_angle5_10_0= ruleAngle ) )
            // InternalPruebaMain.g:791:4: (lv_angle5_10_0= ruleAngle )
            {
            // InternalPruebaMain.g:791:4: (lv_angle5_10_0= ruleAngle )
            // InternalPruebaMain.g:792:5: lv_angle5_10_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getRotateAllServosAccess().getAngle5AngleParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_21);
            lv_angle5_10_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateAllServosRule());
            					}
            					add(
            						current,
            						"angle5",
            						lv_angle5_10_0,
            						"org.xtext.PruebaOperation.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_11, grammarAccess.getRotateAllServosAccess().getCommaKeyword_11());
            		
            // InternalPruebaMain.g:813:3: ( (lv_angle6_12_0= ruleAngle ) )
            // InternalPruebaMain.g:814:4: (lv_angle6_12_0= ruleAngle )
            {
            // InternalPruebaMain.g:814:4: (lv_angle6_12_0= ruleAngle )
            // InternalPruebaMain.g:815:5: lv_angle6_12_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getRotateAllServosAccess().getAngle6AngleParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_21);
            lv_angle6_12_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateAllServosRule());
            					}
            					add(
            						current,
            						"angle6",
            						lv_angle6_12_0,
            						"org.xtext.PruebaOperation.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_13, grammarAccess.getRotateAllServosAccess().getCommaKeyword_13());
            		
            // InternalPruebaMain.g:836:3: ( (lv_time_14_0= ruleTime ) )
            // InternalPruebaMain.g:837:4: (lv_time_14_0= ruleTime )
            {
            // InternalPruebaMain.g:837:4: (lv_time_14_0= ruleTime )
            // InternalPruebaMain.g:838:5: lv_time_14_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getRotateAllServosAccess().getTimeTimeParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_20);
            lv_time_14_0=ruleTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateAllServosRule());
            					}
            					add(
            						current,
            						"time",
            						lv_time_14_0,
            						"org.xtext.PruebaOperation.Time");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getRotateAllServosAccess().getRightParenthesisKeyword_15());
            		

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
    // $ANTLR end "rulerotateAllServos"


    // $ANTLR start "entryRuleResult"
    // InternalPruebaMain.g:863:1: entryRuleResult returns [EObject current=null] : iv_ruleResult= ruleResult EOF ;
    public final EObject entryRuleResult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResult = null;


        try {
            // InternalPruebaMain.g:863:47: (iv_ruleResult= ruleResult EOF )
            // InternalPruebaMain.g:864:2: iv_ruleResult= ruleResult EOF
            {
             newCompositeNode(grammarAccess.getResultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResult=ruleResult();

            state._fsp--;

             current =iv_ruleResult; 
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
    // $ANTLR end "entryRuleResult"


    // $ANTLR start "ruleResult"
    // InternalPruebaMain.g:870:1: ruleResult returns [EObject current=null] : ( ( (lv_name_0_0= 'result' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' ) ;
    public final EObject ruleResult() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_time_2_0 = null;



        	enterRule();

        try {
            // InternalPruebaMain.g:876:2: ( ( ( (lv_name_0_0= 'result' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' ) )
            // InternalPruebaMain.g:877:2: ( ( (lv_name_0_0= 'result' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' )
            {
            // InternalPruebaMain.g:877:2: ( ( (lv_name_0_0= 'result' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' )
            // InternalPruebaMain.g:878:3: ( (lv_name_0_0= 'result' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')'
            {
            // InternalPruebaMain.g:878:3: ( (lv_name_0_0= 'result' ) )
            // InternalPruebaMain.g:879:4: (lv_name_0_0= 'result' )
            {
            // InternalPruebaMain.g:879:4: (lv_name_0_0= 'result' )
            // InternalPruebaMain.g:880:5: lv_name_0_0= 'result'
            {
            lv_name_0_0=(Token)match(input,26,FOLLOW_18); 

            					newLeafNode(lv_name_0_0, grammarAccess.getResultAccess().getNameResultKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResultRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "result");
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getResultAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPruebaMain.g:896:3: ( (lv_time_2_0= ruleTime ) )
            // InternalPruebaMain.g:897:4: (lv_time_2_0= ruleTime )
            {
            // InternalPruebaMain.g:897:4: (lv_time_2_0= ruleTime )
            // InternalPruebaMain.g:898:5: lv_time_2_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getResultAccess().getTimeTimeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_time_2_0=ruleTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResultRule());
            					}
            					add(
            						current,
            						"time",
            						lv_time_2_0,
            						"org.xtext.PruebaOperation.Time");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getResultAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleResult"


    // $ANTLR start "entryRuleConditions"
    // InternalPruebaMain.g:923:1: entryRuleConditions returns [EObject current=null] : iv_ruleConditions= ruleConditions EOF ;
    public final EObject entryRuleConditions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditions = null;


        try {
            // InternalPruebaMain.g:923:51: (iv_ruleConditions= ruleConditions EOF )
            // InternalPruebaMain.g:924:2: iv_ruleConditions= ruleConditions EOF
            {
             newCompositeNode(grammarAccess.getConditionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditions=ruleConditions();

            state._fsp--;

             current =iv_ruleConditions; 
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
    // $ANTLR end "entryRuleConditions"


    // $ANTLR start "ruleConditions"
    // InternalPruebaMain.g:930:1: ruleConditions returns [EObject current=null] : ( ( (lv_name_0_0= 'NotLaterThan' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' ) ;
    public final EObject ruleConditions() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_time_2_0 = null;



        	enterRule();

        try {
            // InternalPruebaMain.g:936:2: ( ( ( (lv_name_0_0= 'NotLaterThan' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' ) )
            // InternalPruebaMain.g:937:2: ( ( (lv_name_0_0= 'NotLaterThan' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' )
            {
            // InternalPruebaMain.g:937:2: ( ( (lv_name_0_0= 'NotLaterThan' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' )
            // InternalPruebaMain.g:938:3: ( (lv_name_0_0= 'NotLaterThan' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')'
            {
            // InternalPruebaMain.g:938:3: ( (lv_name_0_0= 'NotLaterThan' ) )
            // InternalPruebaMain.g:939:4: (lv_name_0_0= 'NotLaterThan' )
            {
            // InternalPruebaMain.g:939:4: (lv_name_0_0= 'NotLaterThan' )
            // InternalPruebaMain.g:940:5: lv_name_0_0= 'NotLaterThan'
            {
            lv_name_0_0=(Token)match(input,27,FOLLOW_18); 

            					newLeafNode(lv_name_0_0, grammarAccess.getConditionsAccess().getNameNotLaterThanKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionsRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "NotLaterThan");
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionsAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPruebaMain.g:956:3: ( (lv_time_2_0= ruleTime ) )
            // InternalPruebaMain.g:957:4: (lv_time_2_0= ruleTime )
            {
            // InternalPruebaMain.g:957:4: (lv_time_2_0= ruleTime )
            // InternalPruebaMain.g:958:5: lv_time_2_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getConditionsAccess().getTimeTimeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_time_2_0=ruleTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionsRule());
            					}
            					add(
            						current,
            						"time",
            						lv_time_2_0,
            						"org.xtext.PruebaOperation.Time");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getConditionsAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleConditions"


    // $ANTLR start "entryRuleSolution"
    // InternalPruebaMain.g:983:1: entryRuleSolution returns [EObject current=null] : iv_ruleSolution= ruleSolution EOF ;
    public final EObject entryRuleSolution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolution = null;


        try {
            // InternalPruebaMain.g:983:49: (iv_ruleSolution= ruleSolution EOF )
            // InternalPruebaMain.g:984:2: iv_ruleSolution= ruleSolution EOF
            {
             newCompositeNode(grammarAccess.getSolutionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSolution=ruleSolution();

            state._fsp--;

             current =iv_ruleSolution; 
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
    // $ANTLR end "entryRuleSolution"


    // $ANTLR start "ruleSolution"
    // InternalPruebaMain.g:990:1: ruleSolution returns [EObject current=null] : (this_isAtSingle_0= ruleisAtSingle | this_isAt_1= ruleisAt ) ;
    public final EObject ruleSolution() throws RecognitionException {
        EObject current = null;

        EObject this_isAtSingle_0 = null;

        EObject this_isAt_1 = null;



        	enterRule();

        try {
            // InternalPruebaMain.g:996:2: ( (this_isAtSingle_0= ruleisAtSingle | this_isAt_1= ruleisAt ) )
            // InternalPruebaMain.g:997:2: (this_isAtSingle_0= ruleisAtSingle | this_isAt_1= ruleisAt )
            {
            // InternalPruebaMain.g:997:2: (this_isAtSingle_0= ruleisAtSingle | this_isAt_1= ruleisAt )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==28) ) {
                alt4=1;
            }
            else if ( (LA4_0==29) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPruebaMain.g:998:3: this_isAtSingle_0= ruleisAtSingle
                    {

                    			newCompositeNode(grammarAccess.getSolutionAccess().getIsAtSingleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_isAtSingle_0=ruleisAtSingle();

                    state._fsp--;


                    			current = this_isAtSingle_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPruebaMain.g:1007:3: this_isAt_1= ruleisAt
                    {

                    			newCompositeNode(grammarAccess.getSolutionAccess().getIsAtParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_isAt_1=ruleisAt();

                    state._fsp--;


                    			current = this_isAt_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleSolution"


    // $ANTLR start "entryRuleisAtSingle"
    // InternalPruebaMain.g:1019:1: entryRuleisAtSingle returns [EObject current=null] : iv_ruleisAtSingle= ruleisAtSingle EOF ;
    public final EObject entryRuleisAtSingle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleisAtSingle = null;


        try {
            // InternalPruebaMain.g:1019:51: (iv_ruleisAtSingle= ruleisAtSingle EOF )
            // InternalPruebaMain.g:1020:2: iv_ruleisAtSingle= ruleisAtSingle EOF
            {
             newCompositeNode(grammarAccess.getIsAtSingleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleisAtSingle=ruleisAtSingle();

            state._fsp--;

             current =iv_ruleisAtSingle; 
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
    // $ANTLR end "entryRuleisAtSingle"


    // $ANTLR start "ruleisAtSingle"
    // InternalPruebaMain.g:1026:1: ruleisAtSingle returns [EObject current=null] : ( ( (lv_name_0_0= 'isAtSingle' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle_res_6_0= ruleAngle_res ) ) otherlv_7= ')' ) ;
    public final EObject ruleisAtSingle() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_servo_2_0 = null;

        EObject lv_angle_4_0 = null;

        EObject lv_angle_res_6_0 = null;



        	enterRule();

        try {
            // InternalPruebaMain.g:1032:2: ( ( ( (lv_name_0_0= 'isAtSingle' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle_res_6_0= ruleAngle_res ) ) otherlv_7= ')' ) )
            // InternalPruebaMain.g:1033:2: ( ( (lv_name_0_0= 'isAtSingle' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle_res_6_0= ruleAngle_res ) ) otherlv_7= ')' )
            {
            // InternalPruebaMain.g:1033:2: ( ( (lv_name_0_0= 'isAtSingle' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle_res_6_0= ruleAngle_res ) ) otherlv_7= ')' )
            // InternalPruebaMain.g:1034:3: ( (lv_name_0_0= 'isAtSingle' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle_res_6_0= ruleAngle_res ) ) otherlv_7= ')'
            {
            // InternalPruebaMain.g:1034:3: ( (lv_name_0_0= 'isAtSingle' ) )
            // InternalPruebaMain.g:1035:4: (lv_name_0_0= 'isAtSingle' )
            {
            // InternalPruebaMain.g:1035:4: (lv_name_0_0= 'isAtSingle' )
            // InternalPruebaMain.g:1036:5: lv_name_0_0= 'isAtSingle'
            {
            lv_name_0_0=(Token)match(input,28,FOLLOW_18); 

            					newLeafNode(lv_name_0_0, grammarAccess.getIsAtSingleAccess().getNameIsAtSingleKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIsAtSingleRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "isAtSingle");
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getIsAtSingleAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPruebaMain.g:1052:3: ( (lv_servo_2_0= ruleServo ) )
            // InternalPruebaMain.g:1053:4: (lv_servo_2_0= ruleServo )
            {
            // InternalPruebaMain.g:1053:4: (lv_servo_2_0= ruleServo )
            // InternalPruebaMain.g:1054:5: lv_servo_2_0= ruleServo
            {

            					newCompositeNode(grammarAccess.getIsAtSingleAccess().getServoServoParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_servo_2_0=ruleServo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtSingleRule());
            					}
            					add(
            						current,
            						"servo",
            						lv_servo_2_0,
            						"org.xtext.PruebaOperation.Servo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getIsAtSingleAccess().getCommaKeyword_3());
            		
            // InternalPruebaMain.g:1075:3: ( (lv_angle_4_0= ruleAngle ) )
            // InternalPruebaMain.g:1076:4: (lv_angle_4_0= ruleAngle )
            {
            // InternalPruebaMain.g:1076:4: (lv_angle_4_0= ruleAngle )
            // InternalPruebaMain.g:1077:5: lv_angle_4_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getIsAtSingleAccess().getAngleAngleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
            lv_angle_4_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtSingleRule());
            					}
            					add(
            						current,
            						"angle",
            						lv_angle_4_0,
            						"org.xtext.PruebaOperation.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getIsAtSingleAccess().getCommaKeyword_5());
            		
            // InternalPruebaMain.g:1098:3: ( (lv_angle_res_6_0= ruleAngle_res ) )
            // InternalPruebaMain.g:1099:4: (lv_angle_res_6_0= ruleAngle_res )
            {
            // InternalPruebaMain.g:1099:4: (lv_angle_res_6_0= ruleAngle_res )
            // InternalPruebaMain.g:1100:5: lv_angle_res_6_0= ruleAngle_res
            {

            					newCompositeNode(grammarAccess.getIsAtSingleAccess().getAngle_resAngle_resParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_20);
            lv_angle_res_6_0=ruleAngle_res();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtSingleRule());
            					}
            					add(
            						current,
            						"angle_res",
            						lv_angle_res_6_0,
            						"org.xtext.PruebaOperation.Angle_res");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getIsAtSingleAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleisAtSingle"


    // $ANTLR start "entryRuleisAt"
    // InternalPruebaMain.g:1125:1: entryRuleisAt returns [EObject current=null] : iv_ruleisAt= ruleisAt EOF ;
    public final EObject entryRuleisAt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleisAt = null;


        try {
            // InternalPruebaMain.g:1125:45: (iv_ruleisAt= ruleisAt EOF )
            // InternalPruebaMain.g:1126:2: iv_ruleisAt= ruleisAt EOF
            {
             newCompositeNode(grammarAccess.getIsAtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleisAt=ruleisAt();

            state._fsp--;

             current =iv_ruleisAt; 
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
    // $ANTLR end "entryRuleisAt"


    // $ANTLR start "ruleisAt"
    // InternalPruebaMain.g:1132:1: ruleisAt returns [EObject current=null] : ( ( (lv_name_0_0= 'isAt' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_angle_res_14_0= ruleAngle_res ) ) otherlv_15= ')' ) ;
    public final EObject ruleisAt() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_angle1_2_0 = null;

        EObject lv_angle2_4_0 = null;

        EObject lv_angle3_6_0 = null;

        EObject lv_angle4_8_0 = null;

        EObject lv_angle5_10_0 = null;

        EObject lv_angle6_12_0 = null;

        EObject lv_angle_res_14_0 = null;



        	enterRule();

        try {
            // InternalPruebaMain.g:1138:2: ( ( ( (lv_name_0_0= 'isAt' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_angle_res_14_0= ruleAngle_res ) ) otherlv_15= ')' ) )
            // InternalPruebaMain.g:1139:2: ( ( (lv_name_0_0= 'isAt' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_angle_res_14_0= ruleAngle_res ) ) otherlv_15= ')' )
            {
            // InternalPruebaMain.g:1139:2: ( ( (lv_name_0_0= 'isAt' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_angle_res_14_0= ruleAngle_res ) ) otherlv_15= ')' )
            // InternalPruebaMain.g:1140:3: ( (lv_name_0_0= 'isAt' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_angle_res_14_0= ruleAngle_res ) ) otherlv_15= ')'
            {
            // InternalPruebaMain.g:1140:3: ( (lv_name_0_0= 'isAt' ) )
            // InternalPruebaMain.g:1141:4: (lv_name_0_0= 'isAt' )
            {
            // InternalPruebaMain.g:1141:4: (lv_name_0_0= 'isAt' )
            // InternalPruebaMain.g:1142:5: lv_name_0_0= 'isAt'
            {
            lv_name_0_0=(Token)match(input,29,FOLLOW_18); 

            					newLeafNode(lv_name_0_0, grammarAccess.getIsAtAccess().getNameIsAtKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIsAtRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "isAt");
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getIsAtAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPruebaMain.g:1158:3: ( (lv_angle1_2_0= ruleAngle ) )
            // InternalPruebaMain.g:1159:4: (lv_angle1_2_0= ruleAngle )
            {
            // InternalPruebaMain.g:1159:4: (lv_angle1_2_0= ruleAngle )
            // InternalPruebaMain.g:1160:5: lv_angle1_2_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getIsAtAccess().getAngle1AngleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_angle1_2_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtRule());
            					}
            					add(
            						current,
            						"angle1",
            						lv_angle1_2_0,
            						"org.xtext.PruebaOperation.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getIsAtAccess().getCommaKeyword_3());
            		
            // InternalPruebaMain.g:1181:3: ( (lv_angle2_4_0= ruleAngle ) )
            // InternalPruebaMain.g:1182:4: (lv_angle2_4_0= ruleAngle )
            {
            // InternalPruebaMain.g:1182:4: (lv_angle2_4_0= ruleAngle )
            // InternalPruebaMain.g:1183:5: lv_angle2_4_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getIsAtAccess().getAngle2AngleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
            lv_angle2_4_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtRule());
            					}
            					add(
            						current,
            						"angle2",
            						lv_angle2_4_0,
            						"org.xtext.PruebaOperation.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getIsAtAccess().getCommaKeyword_5());
            		
            // InternalPruebaMain.g:1204:3: ( (lv_angle3_6_0= ruleAngle ) )
            // InternalPruebaMain.g:1205:4: (lv_angle3_6_0= ruleAngle )
            {
            // InternalPruebaMain.g:1205:4: (lv_angle3_6_0= ruleAngle )
            // InternalPruebaMain.g:1206:5: lv_angle3_6_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getIsAtAccess().getAngle3AngleParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_21);
            lv_angle3_6_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtRule());
            					}
            					add(
            						current,
            						"angle3",
            						lv_angle3_6_0,
            						"org.xtext.PruebaOperation.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getIsAtAccess().getCommaKeyword_7());
            		
            // InternalPruebaMain.g:1227:3: ( (lv_angle4_8_0= ruleAngle ) )
            // InternalPruebaMain.g:1228:4: (lv_angle4_8_0= ruleAngle )
            {
            // InternalPruebaMain.g:1228:4: (lv_angle4_8_0= ruleAngle )
            // InternalPruebaMain.g:1229:5: lv_angle4_8_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getIsAtAccess().getAngle4AngleParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_21);
            lv_angle4_8_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtRule());
            					}
            					add(
            						current,
            						"angle4",
            						lv_angle4_8_0,
            						"org.xtext.PruebaOperation.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_9, grammarAccess.getIsAtAccess().getCommaKeyword_9());
            		
            // InternalPruebaMain.g:1250:3: ( (lv_angle5_10_0= ruleAngle ) )
            // InternalPruebaMain.g:1251:4: (lv_angle5_10_0= ruleAngle )
            {
            // InternalPruebaMain.g:1251:4: (lv_angle5_10_0= ruleAngle )
            // InternalPruebaMain.g:1252:5: lv_angle5_10_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getIsAtAccess().getAngle5AngleParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_21);
            lv_angle5_10_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtRule());
            					}
            					add(
            						current,
            						"angle5",
            						lv_angle5_10_0,
            						"org.xtext.PruebaOperation.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_11, grammarAccess.getIsAtAccess().getCommaKeyword_11());
            		
            // InternalPruebaMain.g:1273:3: ( (lv_angle6_12_0= ruleAngle ) )
            // InternalPruebaMain.g:1274:4: (lv_angle6_12_0= ruleAngle )
            {
            // InternalPruebaMain.g:1274:4: (lv_angle6_12_0= ruleAngle )
            // InternalPruebaMain.g:1275:5: lv_angle6_12_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getIsAtAccess().getAngle6AngleParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_21);
            lv_angle6_12_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtRule());
            					}
            					add(
            						current,
            						"angle6",
            						lv_angle6_12_0,
            						"org.xtext.PruebaOperation.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_13, grammarAccess.getIsAtAccess().getCommaKeyword_13());
            		
            // InternalPruebaMain.g:1296:3: ( (lv_angle_res_14_0= ruleAngle_res ) )
            // InternalPruebaMain.g:1297:4: (lv_angle_res_14_0= ruleAngle_res )
            {
            // InternalPruebaMain.g:1297:4: (lv_angle_res_14_0= ruleAngle_res )
            // InternalPruebaMain.g:1298:5: lv_angle_res_14_0= ruleAngle_res
            {

            					newCompositeNode(grammarAccess.getIsAtAccess().getAngle_resAngle_resParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_20);
            lv_angle_res_14_0=ruleAngle_res();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtRule());
            					}
            					add(
            						current,
            						"angle_res",
            						lv_angle_res_14_0,
            						"org.xtext.PruebaOperation.Angle_res");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getIsAtAccess().getRightParenthesisKeyword_15());
            		

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
    // $ANTLR end "ruleisAt"


    // $ANTLR start "entryRuleAngle_res"
    // InternalPruebaMain.g:1323:1: entryRuleAngle_res returns [EObject current=null] : iv_ruleAngle_res= ruleAngle_res EOF ;
    public final EObject entryRuleAngle_res() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAngle_res = null;


        try {
            // InternalPruebaMain.g:1323:50: (iv_ruleAngle_res= ruleAngle_res EOF )
            // InternalPruebaMain.g:1324:2: iv_ruleAngle_res= ruleAngle_res EOF
            {
             newCompositeNode(grammarAccess.getAngle_resRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAngle_res=ruleAngle_res();

            state._fsp--;

             current =iv_ruleAngle_res; 
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
    // $ANTLR end "entryRuleAngle_res"


    // $ANTLR start "ruleAngle_res"
    // InternalPruebaMain.g:1330:1: ruleAngle_res returns [EObject current=null] : ( (lv_angle_res_0_0= RULE_INT ) ) ;
    public final EObject ruleAngle_res() throws RecognitionException {
        EObject current = null;

        Token lv_angle_res_0_0=null;


        	enterRule();

        try {
            // InternalPruebaMain.g:1336:2: ( ( (lv_angle_res_0_0= RULE_INT ) ) )
            // InternalPruebaMain.g:1337:2: ( (lv_angle_res_0_0= RULE_INT ) )
            {
            // InternalPruebaMain.g:1337:2: ( (lv_angle_res_0_0= RULE_INT ) )
            // InternalPruebaMain.g:1338:3: (lv_angle_res_0_0= RULE_INT )
            {
            // InternalPruebaMain.g:1338:3: (lv_angle_res_0_0= RULE_INT )
            // InternalPruebaMain.g:1339:4: lv_angle_res_0_0= RULE_INT
            {
            lv_angle_res_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_angle_res_0_0, grammarAccess.getAngle_resAccess().getAngle_resINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAngle_resRule());
            				}
            				setWithLastConsumed(
            					current,
            					"angle_res",
            					lv_angle_res_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleAngle_res"


    // $ANTLR start "entryRuleAngle"
    // InternalPruebaMain.g:1358:1: entryRuleAngle returns [EObject current=null] : iv_ruleAngle= ruleAngle EOF ;
    public final EObject entryRuleAngle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAngle = null;


        try {
            // InternalPruebaMain.g:1358:46: (iv_ruleAngle= ruleAngle EOF )
            // InternalPruebaMain.g:1359:2: iv_ruleAngle= ruleAngle EOF
            {
             newCompositeNode(grammarAccess.getAngleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAngle=ruleAngle();

            state._fsp--;

             current =iv_ruleAngle; 
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
    // $ANTLR end "entryRuleAngle"


    // $ANTLR start "ruleAngle"
    // InternalPruebaMain.g:1365:1: ruleAngle returns [EObject current=null] : ( (lv_angle_0_0= RULE_INT ) ) ;
    public final EObject ruleAngle() throws RecognitionException {
        EObject current = null;

        Token lv_angle_0_0=null;


        	enterRule();

        try {
            // InternalPruebaMain.g:1371:2: ( ( (lv_angle_0_0= RULE_INT ) ) )
            // InternalPruebaMain.g:1372:2: ( (lv_angle_0_0= RULE_INT ) )
            {
            // InternalPruebaMain.g:1372:2: ( (lv_angle_0_0= RULE_INT ) )
            // InternalPruebaMain.g:1373:3: (lv_angle_0_0= RULE_INT )
            {
            // InternalPruebaMain.g:1373:3: (lv_angle_0_0= RULE_INT )
            // InternalPruebaMain.g:1374:4: lv_angle_0_0= RULE_INT
            {
            lv_angle_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_angle_0_0, grammarAccess.getAngleAccess().getAngleINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAngleRule());
            				}
            				setWithLastConsumed(
            					current,
            					"angle",
            					lv_angle_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleAngle"


    // $ANTLR start "entryRuleTime"
    // InternalPruebaMain.g:1393:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalPruebaMain.g:1393:45: (iv_ruleTime= ruleTime EOF )
            // InternalPruebaMain.g:1394:2: iv_ruleTime= ruleTime EOF
            {
             newCompositeNode(grammarAccess.getTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTime=ruleTime();

            state._fsp--;

             current =iv_ruleTime; 
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
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // InternalPruebaMain.g:1400:1: ruleTime returns [EObject current=null] : ( (lv_time_0_0= RULE_INT ) ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token lv_time_0_0=null;


        	enterRule();

        try {
            // InternalPruebaMain.g:1406:2: ( ( (lv_time_0_0= RULE_INT ) ) )
            // InternalPruebaMain.g:1407:2: ( (lv_time_0_0= RULE_INT ) )
            {
            // InternalPruebaMain.g:1407:2: ( (lv_time_0_0= RULE_INT ) )
            // InternalPruebaMain.g:1408:3: (lv_time_0_0= RULE_INT )
            {
            // InternalPruebaMain.g:1408:3: (lv_time_0_0= RULE_INT )
            // InternalPruebaMain.g:1409:4: lv_time_0_0= RULE_INT
            {
            lv_time_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_time_0_0, grammarAccess.getTimeAccess().getTimeINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTimeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"time",
            					lv_time_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleTime"


    // $ANTLR start "entryRuleServo"
    // InternalPruebaMain.g:1428:1: entryRuleServo returns [EObject current=null] : iv_ruleServo= ruleServo EOF ;
    public final EObject entryRuleServo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServo = null;


        try {
            // InternalPruebaMain.g:1428:46: (iv_ruleServo= ruleServo EOF )
            // InternalPruebaMain.g:1429:2: iv_ruleServo= ruleServo EOF
            {
             newCompositeNode(grammarAccess.getServoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServo=ruleServo();

            state._fsp--;

             current =iv_ruleServo; 
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
    // $ANTLR end "entryRuleServo"


    // $ANTLR start "ruleServo"
    // InternalPruebaMain.g:1435:1: ruleServo returns [EObject current=null] : ( (lv_servo_0_0= RULE_INT ) ) ;
    public final EObject ruleServo() throws RecognitionException {
        EObject current = null;

        Token lv_servo_0_0=null;


        	enterRule();

        try {
            // InternalPruebaMain.g:1441:2: ( ( (lv_servo_0_0= RULE_INT ) ) )
            // InternalPruebaMain.g:1442:2: ( (lv_servo_0_0= RULE_INT ) )
            {
            // InternalPruebaMain.g:1442:2: ( (lv_servo_0_0= RULE_INT ) )
            // InternalPruebaMain.g:1443:3: (lv_servo_0_0= RULE_INT )
            {
            // InternalPruebaMain.g:1443:3: (lv_servo_0_0= RULE_INT )
            // InternalPruebaMain.g:1444:4: lv_servo_0_0= RULE_INT
            {
            lv_servo_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_servo_0_0, grammarAccess.getServoAccess().getServoINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getServoRule());
            				}
            				setWithLastConsumed(
            					current,
            					"servo",
            					lv_servo_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleServo"


    // $ANTLR start "ruleState"
    // InternalPruebaMain.g:1463:1: ruleState returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleState() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalPruebaMain.g:1469:2: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // InternalPruebaMain.g:1470:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // InternalPruebaMain.g:1470:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==30) ) {
                alt5=1;
            }
            else if ( (LA5_0==31) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPruebaMain.g:1471:3: (enumLiteral_0= 'true' )
                    {
                    // InternalPruebaMain.g:1471:3: (enumLiteral_0= 'true' )
                    // InternalPruebaMain.g:1472:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getStateAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getStateAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPruebaMain.g:1479:3: (enumLiteral_1= 'false' )
                    {
                    // InternalPruebaMain.g:1479:3: (enumLiteral_1= 'false' )
                    // InternalPruebaMain.g:1480:4: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getStateAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getStateAccess().getFALSEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleState"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});

}