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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'posInicialOperation'", "'('", "')'", "'lightRGBOperation'", "','", "'buzzerOffOperation'", "'buzzerOnOperation'", "'calibrationOperation'", "'cameraColorOperation'", "'readAllServosOperation'", "'readServoOperation'", "'rotateServoOperation'", "'rotateAllServosOperation'", "'isAtSingleOperation'", "'isAtOperation'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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
        	return "Initial";
       	}

       	@Override
       	protected OperationsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleInitial"
    // InternalOperations.g:64:1: entryRuleInitial returns [EObject current=null] : iv_ruleInitial= ruleInitial EOF ;
    public final EObject entryRuleInitial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitial = null;


        try {
            // InternalOperations.g:64:48: (iv_ruleInitial= ruleInitial EOF )
            // InternalOperations.g:65:2: iv_ruleInitial= ruleInitial EOF
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
    // InternalOperations.g:71:1: ruleInitial returns [EObject current=null] : ( ( (lv_name_0_0= 'posInicialOperation' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' ) ;
    public final EObject ruleInitial() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_time_2_0 = null;



        	enterRule();

        try {
            // InternalOperations.g:77:2: ( ( ( (lv_name_0_0= 'posInicialOperation' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' ) )
            // InternalOperations.g:78:2: ( ( (lv_name_0_0= 'posInicialOperation' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' )
            {
            // InternalOperations.g:78:2: ( ( (lv_name_0_0= 'posInicialOperation' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' )
            // InternalOperations.g:79:3: ( (lv_name_0_0= 'posInicialOperation' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')'
            {
            // InternalOperations.g:79:3: ( (lv_name_0_0= 'posInicialOperation' ) )
            // InternalOperations.g:80:4: (lv_name_0_0= 'posInicialOperation' )
            {
            // InternalOperations.g:80:4: (lv_name_0_0= 'posInicialOperation' )
            // InternalOperations.g:81:5: lv_name_0_0= 'posInicialOperation'
            {
            lv_name_0_0=(Token)match(input,11,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getInitialAccess().getNamePosInicialOperationKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "posInicialOperation");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getInitialAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOperations.g:97:3: ( (lv_time_2_0= ruleTime ) )
            // InternalOperations.g:98:4: (lv_time_2_0= ruleTime )
            {
            // InternalOperations.g:98:4: (lv_time_2_0= ruleTime )
            // InternalOperations.g:99:5: lv_time_2_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getInitialAccess().getTimeTimeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_time_2_0=ruleTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialRule());
            					}
            					add(
            						current,
            						"time",
            						lv_time_2_0,
            						"org.xtext.Operations.Time");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

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


    // $ANTLR start "entryRulelightRGBOperation"
    // InternalOperations.g:124:1: entryRulelightRGBOperation returns [EObject current=null] : iv_rulelightRGBOperation= rulelightRGBOperation EOF ;
    public final EObject entryRulelightRGBOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelightRGBOperation = null;


        try {
            // InternalOperations.g:124:58: (iv_rulelightRGBOperation= rulelightRGBOperation EOF )
            // InternalOperations.g:125:2: iv_rulelightRGBOperation= rulelightRGBOperation EOF
            {
             newCompositeNode(grammarAccess.getLightRGBOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelightRGBOperation=rulelightRGBOperation();

            state._fsp--;

             current =iv_rulelightRGBOperation; 
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
    // $ANTLR end "entryRulelightRGBOperation"


    // $ANTLR start "rulelightRGBOperation"
    // InternalOperations.g:131:1: rulelightRGBOperation returns [EObject current=null] : ( ( (lv_name_0_0= 'lightRGBOperation' ) ) otherlv_1= '(' ( (lv_r_2_0= ruleR ) ) otherlv_3= ',' ( (lv_g_4_0= ruleG ) ) otherlv_5= ',' ( (lv_b_6_0= ruleB ) ) otherlv_7= ')' ) ;
    public final EObject rulelightRGBOperation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_r_2_0 = null;

        EObject lv_g_4_0 = null;

        EObject lv_b_6_0 = null;



        	enterRule();

        try {
            // InternalOperations.g:137:2: ( ( ( (lv_name_0_0= 'lightRGBOperation' ) ) otherlv_1= '(' ( (lv_r_2_0= ruleR ) ) otherlv_3= ',' ( (lv_g_4_0= ruleG ) ) otherlv_5= ',' ( (lv_b_6_0= ruleB ) ) otherlv_7= ')' ) )
            // InternalOperations.g:138:2: ( ( (lv_name_0_0= 'lightRGBOperation' ) ) otherlv_1= '(' ( (lv_r_2_0= ruleR ) ) otherlv_3= ',' ( (lv_g_4_0= ruleG ) ) otherlv_5= ',' ( (lv_b_6_0= ruleB ) ) otherlv_7= ')' )
            {
            // InternalOperations.g:138:2: ( ( (lv_name_0_0= 'lightRGBOperation' ) ) otherlv_1= '(' ( (lv_r_2_0= ruleR ) ) otherlv_3= ',' ( (lv_g_4_0= ruleG ) ) otherlv_5= ',' ( (lv_b_6_0= ruleB ) ) otherlv_7= ')' )
            // InternalOperations.g:139:3: ( (lv_name_0_0= 'lightRGBOperation' ) ) otherlv_1= '(' ( (lv_r_2_0= ruleR ) ) otherlv_3= ',' ( (lv_g_4_0= ruleG ) ) otherlv_5= ',' ( (lv_b_6_0= ruleB ) ) otherlv_7= ')'
            {
            // InternalOperations.g:139:3: ( (lv_name_0_0= 'lightRGBOperation' ) )
            // InternalOperations.g:140:4: (lv_name_0_0= 'lightRGBOperation' )
            {
            // InternalOperations.g:140:4: (lv_name_0_0= 'lightRGBOperation' )
            // InternalOperations.g:141:5: lv_name_0_0= 'lightRGBOperation'
            {
            lv_name_0_0=(Token)match(input,14,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLightRGBOperationAccess().getNameLightRGBOperationKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLightRGBOperationRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "lightRGBOperation");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLightRGBOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOperations.g:157:3: ( (lv_r_2_0= ruleR ) )
            // InternalOperations.g:158:4: (lv_r_2_0= ruleR )
            {
            // InternalOperations.g:158:4: (lv_r_2_0= ruleR )
            // InternalOperations.g:159:5: lv_r_2_0= ruleR
            {

            					newCompositeNode(grammarAccess.getLightRGBOperationAccess().getRRParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_r_2_0=ruleR();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLightRGBOperationRule());
            					}
            					add(
            						current,
            						"r",
            						lv_r_2_0,
            						"org.xtext.Operations.R");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getLightRGBOperationAccess().getCommaKeyword_3());
            		
            // InternalOperations.g:180:3: ( (lv_g_4_0= ruleG ) )
            // InternalOperations.g:181:4: (lv_g_4_0= ruleG )
            {
            // InternalOperations.g:181:4: (lv_g_4_0= ruleG )
            // InternalOperations.g:182:5: lv_g_4_0= ruleG
            {

            					newCompositeNode(grammarAccess.getLightRGBOperationAccess().getGGParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_g_4_0=ruleG();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLightRGBOperationRule());
            					}
            					add(
            						current,
            						"g",
            						lv_g_4_0,
            						"org.xtext.Operations.G");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getLightRGBOperationAccess().getCommaKeyword_5());
            		
            // InternalOperations.g:203:3: ( (lv_b_6_0= ruleB ) )
            // InternalOperations.g:204:4: (lv_b_6_0= ruleB )
            {
            // InternalOperations.g:204:4: (lv_b_6_0= ruleB )
            // InternalOperations.g:205:5: lv_b_6_0= ruleB
            {

            					newCompositeNode(grammarAccess.getLightRGBOperationAccess().getBBParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_5);
            lv_b_6_0=ruleB();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLightRGBOperationRule());
            					}
            					add(
            						current,
            						"b",
            						lv_b_6_0,
            						"org.xtext.Operations.B");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getLightRGBOperationAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "rulelightRGBOperation"


    // $ANTLR start "entryRulebuzzerOffOperation"
    // InternalOperations.g:230:1: entryRulebuzzerOffOperation returns [EObject current=null] : iv_rulebuzzerOffOperation= rulebuzzerOffOperation EOF ;
    public final EObject entryRulebuzzerOffOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebuzzerOffOperation = null;


        try {
            // InternalOperations.g:230:59: (iv_rulebuzzerOffOperation= rulebuzzerOffOperation EOF )
            // InternalOperations.g:231:2: iv_rulebuzzerOffOperation= rulebuzzerOffOperation EOF
            {
             newCompositeNode(grammarAccess.getBuzzerOffOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulebuzzerOffOperation=rulebuzzerOffOperation();

            state._fsp--;

             current =iv_rulebuzzerOffOperation; 
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
    // $ANTLR end "entryRulebuzzerOffOperation"


    // $ANTLR start "rulebuzzerOffOperation"
    // InternalOperations.g:237:1: rulebuzzerOffOperation returns [EObject current=null] : ( ( (lv_name_0_0= 'buzzerOffOperation' ) ) otherlv_1= '(' otherlv_2= ')' ) ;
    public final EObject rulebuzzerOffOperation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalOperations.g:243:2: ( ( ( (lv_name_0_0= 'buzzerOffOperation' ) ) otherlv_1= '(' otherlv_2= ')' ) )
            // InternalOperations.g:244:2: ( ( (lv_name_0_0= 'buzzerOffOperation' ) ) otherlv_1= '(' otherlv_2= ')' )
            {
            // InternalOperations.g:244:2: ( ( (lv_name_0_0= 'buzzerOffOperation' ) ) otherlv_1= '(' otherlv_2= ')' )
            // InternalOperations.g:245:3: ( (lv_name_0_0= 'buzzerOffOperation' ) ) otherlv_1= '(' otherlv_2= ')'
            {
            // InternalOperations.g:245:3: ( (lv_name_0_0= 'buzzerOffOperation' ) )
            // InternalOperations.g:246:4: (lv_name_0_0= 'buzzerOffOperation' )
            {
            // InternalOperations.g:246:4: (lv_name_0_0= 'buzzerOffOperation' )
            // InternalOperations.g:247:5: lv_name_0_0= 'buzzerOffOperation'
            {
            lv_name_0_0=(Token)match(input,16,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getBuzzerOffOperationAccess().getNameBuzzerOffOperationKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBuzzerOffOperationRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "buzzerOffOperation");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getBuzzerOffOperationAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getBuzzerOffOperationAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "rulebuzzerOffOperation"


    // $ANTLR start "entryRulebuzzerOnOperation"
    // InternalOperations.g:271:1: entryRulebuzzerOnOperation returns [EObject current=null] : iv_rulebuzzerOnOperation= rulebuzzerOnOperation EOF ;
    public final EObject entryRulebuzzerOnOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebuzzerOnOperation = null;


        try {
            // InternalOperations.g:271:58: (iv_rulebuzzerOnOperation= rulebuzzerOnOperation EOF )
            // InternalOperations.g:272:2: iv_rulebuzzerOnOperation= rulebuzzerOnOperation EOF
            {
             newCompositeNode(grammarAccess.getBuzzerOnOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulebuzzerOnOperation=rulebuzzerOnOperation();

            state._fsp--;

             current =iv_rulebuzzerOnOperation; 
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
    // $ANTLR end "entryRulebuzzerOnOperation"


    // $ANTLR start "rulebuzzerOnOperation"
    // InternalOperations.g:278:1: rulebuzzerOnOperation returns [EObject current=null] : ( ( (lv_name_0_0= 'buzzerOnOperation' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' ) ;
    public final EObject rulebuzzerOnOperation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_time_2_0 = null;



        	enterRule();

        try {
            // InternalOperations.g:284:2: ( ( ( (lv_name_0_0= 'buzzerOnOperation' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' ) )
            // InternalOperations.g:285:2: ( ( (lv_name_0_0= 'buzzerOnOperation' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' )
            {
            // InternalOperations.g:285:2: ( ( (lv_name_0_0= 'buzzerOnOperation' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' )
            // InternalOperations.g:286:3: ( (lv_name_0_0= 'buzzerOnOperation' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')'
            {
            // InternalOperations.g:286:3: ( (lv_name_0_0= 'buzzerOnOperation' ) )
            // InternalOperations.g:287:4: (lv_name_0_0= 'buzzerOnOperation' )
            {
            // InternalOperations.g:287:4: (lv_name_0_0= 'buzzerOnOperation' )
            // InternalOperations.g:288:5: lv_name_0_0= 'buzzerOnOperation'
            {
            lv_name_0_0=(Token)match(input,17,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getBuzzerOnOperationAccess().getNameBuzzerOnOperationKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBuzzerOnOperationRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "buzzerOnOperation");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBuzzerOnOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOperations.g:304:3: ( (lv_time_2_0= ruleTime ) )
            // InternalOperations.g:305:4: (lv_time_2_0= ruleTime )
            {
            // InternalOperations.g:305:4: (lv_time_2_0= ruleTime )
            // InternalOperations.g:306:5: lv_time_2_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getBuzzerOnOperationAccess().getTimeTimeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_time_2_0=ruleTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBuzzerOnOperationRule());
            					}
            					add(
            						current,
            						"time",
            						lv_time_2_0,
            						"org.xtext.Operations.Time");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getBuzzerOnOperationAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "rulebuzzerOnOperation"


    // $ANTLR start "entryRulecalibrationOperation"
    // InternalOperations.g:331:1: entryRulecalibrationOperation returns [EObject current=null] : iv_rulecalibrationOperation= rulecalibrationOperation EOF ;
    public final EObject entryRulecalibrationOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecalibrationOperation = null;


        try {
            // InternalOperations.g:331:61: (iv_rulecalibrationOperation= rulecalibrationOperation EOF )
            // InternalOperations.g:332:2: iv_rulecalibrationOperation= rulecalibrationOperation EOF
            {
             newCompositeNode(grammarAccess.getCalibrationOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecalibrationOperation=rulecalibrationOperation();

            state._fsp--;

             current =iv_rulecalibrationOperation; 
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
    // $ANTLR end "entryRulecalibrationOperation"


    // $ANTLR start "rulecalibrationOperation"
    // InternalOperations.g:338:1: rulecalibrationOperation returns [EObject current=null] : ( ( (lv_name_0_0= 'calibrationOperation' ) ) otherlv_1= '(' ( (lv_color_2_0= ruleColor ) ) otherlv_3= ',' ( (lv_h_min_4_0= ruleH_min ) ) otherlv_5= ',' ( (lv_s_min_6_0= ruleS_min ) ) otherlv_7= ',' ( (lv_v_min_8_0= ruleV_min ) ) otherlv_9= ',' ( (lv_h_max_10_0= ruleH_max ) ) otherlv_11= ',' ( (lv_s_max_12_0= ruleS_max ) ) otherlv_13= ',' ( (lv_v_max_14_0= ruleV_max ) ) otherlv_15= ')' ) ;
    public final EObject rulecalibrationOperation() throws RecognitionException {
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
        EObject lv_color_2_0 = null;

        EObject lv_h_min_4_0 = null;

        EObject lv_s_min_6_0 = null;

        EObject lv_v_min_8_0 = null;

        EObject lv_h_max_10_0 = null;

        EObject lv_s_max_12_0 = null;

        EObject lv_v_max_14_0 = null;



        	enterRule();

        try {
            // InternalOperations.g:344:2: ( ( ( (lv_name_0_0= 'calibrationOperation' ) ) otherlv_1= '(' ( (lv_color_2_0= ruleColor ) ) otherlv_3= ',' ( (lv_h_min_4_0= ruleH_min ) ) otherlv_5= ',' ( (lv_s_min_6_0= ruleS_min ) ) otherlv_7= ',' ( (lv_v_min_8_0= ruleV_min ) ) otherlv_9= ',' ( (lv_h_max_10_0= ruleH_max ) ) otherlv_11= ',' ( (lv_s_max_12_0= ruleS_max ) ) otherlv_13= ',' ( (lv_v_max_14_0= ruleV_max ) ) otherlv_15= ')' ) )
            // InternalOperations.g:345:2: ( ( (lv_name_0_0= 'calibrationOperation' ) ) otherlv_1= '(' ( (lv_color_2_0= ruleColor ) ) otherlv_3= ',' ( (lv_h_min_4_0= ruleH_min ) ) otherlv_5= ',' ( (lv_s_min_6_0= ruleS_min ) ) otherlv_7= ',' ( (lv_v_min_8_0= ruleV_min ) ) otherlv_9= ',' ( (lv_h_max_10_0= ruleH_max ) ) otherlv_11= ',' ( (lv_s_max_12_0= ruleS_max ) ) otherlv_13= ',' ( (lv_v_max_14_0= ruleV_max ) ) otherlv_15= ')' )
            {
            // InternalOperations.g:345:2: ( ( (lv_name_0_0= 'calibrationOperation' ) ) otherlv_1= '(' ( (lv_color_2_0= ruleColor ) ) otherlv_3= ',' ( (lv_h_min_4_0= ruleH_min ) ) otherlv_5= ',' ( (lv_s_min_6_0= ruleS_min ) ) otherlv_7= ',' ( (lv_v_min_8_0= ruleV_min ) ) otherlv_9= ',' ( (lv_h_max_10_0= ruleH_max ) ) otherlv_11= ',' ( (lv_s_max_12_0= ruleS_max ) ) otherlv_13= ',' ( (lv_v_max_14_0= ruleV_max ) ) otherlv_15= ')' )
            // InternalOperations.g:346:3: ( (lv_name_0_0= 'calibrationOperation' ) ) otherlv_1= '(' ( (lv_color_2_0= ruleColor ) ) otherlv_3= ',' ( (lv_h_min_4_0= ruleH_min ) ) otherlv_5= ',' ( (lv_s_min_6_0= ruleS_min ) ) otherlv_7= ',' ( (lv_v_min_8_0= ruleV_min ) ) otherlv_9= ',' ( (lv_h_max_10_0= ruleH_max ) ) otherlv_11= ',' ( (lv_s_max_12_0= ruleS_max ) ) otherlv_13= ',' ( (lv_v_max_14_0= ruleV_max ) ) otherlv_15= ')'
            {
            // InternalOperations.g:346:3: ( (lv_name_0_0= 'calibrationOperation' ) )
            // InternalOperations.g:347:4: (lv_name_0_0= 'calibrationOperation' )
            {
            // InternalOperations.g:347:4: (lv_name_0_0= 'calibrationOperation' )
            // InternalOperations.g:348:5: lv_name_0_0= 'calibrationOperation'
            {
            lv_name_0_0=(Token)match(input,18,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCalibrationOperationAccess().getNameCalibrationOperationKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCalibrationOperationRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "calibrationOperation");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getCalibrationOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOperations.g:364:3: ( (lv_color_2_0= ruleColor ) )
            // InternalOperations.g:365:4: (lv_color_2_0= ruleColor )
            {
            // InternalOperations.g:365:4: (lv_color_2_0= ruleColor )
            // InternalOperations.g:366:5: lv_color_2_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getCalibrationOperationAccess().getColorColorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_color_2_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCalibrationOperationRule());
            					}
            					add(
            						current,
            						"color",
            						lv_color_2_0,
            						"org.xtext.Operations.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getCalibrationOperationAccess().getCommaKeyword_3());
            		
            // InternalOperations.g:387:3: ( (lv_h_min_4_0= ruleH_min ) )
            // InternalOperations.g:388:4: (lv_h_min_4_0= ruleH_min )
            {
            // InternalOperations.g:388:4: (lv_h_min_4_0= ruleH_min )
            // InternalOperations.g:389:5: lv_h_min_4_0= ruleH_min
            {

            					newCompositeNode(grammarAccess.getCalibrationOperationAccess().getH_minH_minParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_h_min_4_0=ruleH_min();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCalibrationOperationRule());
            					}
            					add(
            						current,
            						"h_min",
            						lv_h_min_4_0,
            						"org.xtext.Operations.H_min");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getCalibrationOperationAccess().getCommaKeyword_5());
            		
            // InternalOperations.g:410:3: ( (lv_s_min_6_0= ruleS_min ) )
            // InternalOperations.g:411:4: (lv_s_min_6_0= ruleS_min )
            {
            // InternalOperations.g:411:4: (lv_s_min_6_0= ruleS_min )
            // InternalOperations.g:412:5: lv_s_min_6_0= ruleS_min
            {

            					newCompositeNode(grammarAccess.getCalibrationOperationAccess().getS_minS_minParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_6);
            lv_s_min_6_0=ruleS_min();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCalibrationOperationRule());
            					}
            					add(
            						current,
            						"s_min",
            						lv_s_min_6_0,
            						"org.xtext.Operations.S_min");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getCalibrationOperationAccess().getCommaKeyword_7());
            		
            // InternalOperations.g:433:3: ( (lv_v_min_8_0= ruleV_min ) )
            // InternalOperations.g:434:4: (lv_v_min_8_0= ruleV_min )
            {
            // InternalOperations.g:434:4: (lv_v_min_8_0= ruleV_min )
            // InternalOperations.g:435:5: lv_v_min_8_0= ruleV_min
            {

            					newCompositeNode(grammarAccess.getCalibrationOperationAccess().getV_minV_minParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_6);
            lv_v_min_8_0=ruleV_min();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCalibrationOperationRule());
            					}
            					add(
            						current,
            						"v_min",
            						lv_v_min_8_0,
            						"org.xtext.Operations.V_min");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getCalibrationOperationAccess().getCommaKeyword_9());
            		
            // InternalOperations.g:456:3: ( (lv_h_max_10_0= ruleH_max ) )
            // InternalOperations.g:457:4: (lv_h_max_10_0= ruleH_max )
            {
            // InternalOperations.g:457:4: (lv_h_max_10_0= ruleH_max )
            // InternalOperations.g:458:5: lv_h_max_10_0= ruleH_max
            {

            					newCompositeNode(grammarAccess.getCalibrationOperationAccess().getH_maxH_maxParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_6);
            lv_h_max_10_0=ruleH_max();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCalibrationOperationRule());
            					}
            					add(
            						current,
            						"h_max",
            						lv_h_max_10_0,
            						"org.xtext.Operations.H_max");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getCalibrationOperationAccess().getCommaKeyword_11());
            		
            // InternalOperations.g:479:3: ( (lv_s_max_12_0= ruleS_max ) )
            // InternalOperations.g:480:4: (lv_s_max_12_0= ruleS_max )
            {
            // InternalOperations.g:480:4: (lv_s_max_12_0= ruleS_max )
            // InternalOperations.g:481:5: lv_s_max_12_0= ruleS_max
            {

            					newCompositeNode(grammarAccess.getCalibrationOperationAccess().getS_maxS_maxParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_6);
            lv_s_max_12_0=ruleS_max();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCalibrationOperationRule());
            					}
            					add(
            						current,
            						"s_max",
            						lv_s_max_12_0,
            						"org.xtext.Operations.S_max");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_13, grammarAccess.getCalibrationOperationAccess().getCommaKeyword_13());
            		
            // InternalOperations.g:502:3: ( (lv_v_max_14_0= ruleV_max ) )
            // InternalOperations.g:503:4: (lv_v_max_14_0= ruleV_max )
            {
            // InternalOperations.g:503:4: (lv_v_max_14_0= ruleV_max )
            // InternalOperations.g:504:5: lv_v_max_14_0= ruleV_max
            {

            					newCompositeNode(grammarAccess.getCalibrationOperationAccess().getV_maxV_maxParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_5);
            lv_v_max_14_0=ruleV_max();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCalibrationOperationRule());
            					}
            					add(
            						current,
            						"v_max",
            						lv_v_max_14_0,
            						"org.xtext.Operations.V_max");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getCalibrationOperationAccess().getRightParenthesisKeyword_15());
            		

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
    // $ANTLR end "rulecalibrationOperation"


    // $ANTLR start "entryRulecameraColorOperation"
    // InternalOperations.g:529:1: entryRulecameraColorOperation returns [EObject current=null] : iv_rulecameraColorOperation= rulecameraColorOperation EOF ;
    public final EObject entryRulecameraColorOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecameraColorOperation = null;


        try {
            // InternalOperations.g:529:61: (iv_rulecameraColorOperation= rulecameraColorOperation EOF )
            // InternalOperations.g:530:2: iv_rulecameraColorOperation= rulecameraColorOperation EOF
            {
             newCompositeNode(grammarAccess.getCameraColorOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecameraColorOperation=rulecameraColorOperation();

            state._fsp--;

             current =iv_rulecameraColorOperation; 
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
    // $ANTLR end "entryRulecameraColorOperation"


    // $ANTLR start "rulecameraColorOperation"
    // InternalOperations.g:536:1: rulecameraColorOperation returns [EObject current=null] : ( ( (lv_name_0_0= 'cameraColorOperation' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' ) ;
    public final EObject rulecameraColorOperation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_time_2_0 = null;



        	enterRule();

        try {
            // InternalOperations.g:542:2: ( ( ( (lv_name_0_0= 'cameraColorOperation' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' ) )
            // InternalOperations.g:543:2: ( ( (lv_name_0_0= 'cameraColorOperation' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' )
            {
            // InternalOperations.g:543:2: ( ( (lv_name_0_0= 'cameraColorOperation' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' )
            // InternalOperations.g:544:3: ( (lv_name_0_0= 'cameraColorOperation' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')'
            {
            // InternalOperations.g:544:3: ( (lv_name_0_0= 'cameraColorOperation' ) )
            // InternalOperations.g:545:4: (lv_name_0_0= 'cameraColorOperation' )
            {
            // InternalOperations.g:545:4: (lv_name_0_0= 'cameraColorOperation' )
            // InternalOperations.g:546:5: lv_name_0_0= 'cameraColorOperation'
            {
            lv_name_0_0=(Token)match(input,19,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCameraColorOperationAccess().getNameCameraColorOperationKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCameraColorOperationRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "cameraColorOperation");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCameraColorOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOperations.g:562:3: ( (lv_time_2_0= ruleTime ) )
            // InternalOperations.g:563:4: (lv_time_2_0= ruleTime )
            {
            // InternalOperations.g:563:4: (lv_time_2_0= ruleTime )
            // InternalOperations.g:564:5: lv_time_2_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getCameraColorOperationAccess().getTimeTimeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_time_2_0=ruleTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCameraColorOperationRule());
            					}
            					add(
            						current,
            						"time",
            						lv_time_2_0,
            						"org.xtext.Operations.Time");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCameraColorOperationAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "rulecameraColorOperation"


    // $ANTLR start "entryRulereadAllServosOperation"
    // InternalOperations.g:589:1: entryRulereadAllServosOperation returns [EObject current=null] : iv_rulereadAllServosOperation= rulereadAllServosOperation EOF ;
    public final EObject entryRulereadAllServosOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulereadAllServosOperation = null;


        try {
            // InternalOperations.g:589:63: (iv_rulereadAllServosOperation= rulereadAllServosOperation EOF )
            // InternalOperations.g:590:2: iv_rulereadAllServosOperation= rulereadAllServosOperation EOF
            {
             newCompositeNode(grammarAccess.getReadAllServosOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulereadAllServosOperation=rulereadAllServosOperation();

            state._fsp--;

             current =iv_rulereadAllServosOperation; 
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
    // $ANTLR end "entryRulereadAllServosOperation"


    // $ANTLR start "rulereadAllServosOperation"
    // InternalOperations.g:596:1: rulereadAllServosOperation returns [EObject current=null] : ( ( (lv_name_0_0= 'readAllServosOperation' ) ) otherlv_1= '(' otherlv_2= ')' ) ;
    public final EObject rulereadAllServosOperation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalOperations.g:602:2: ( ( ( (lv_name_0_0= 'readAllServosOperation' ) ) otherlv_1= '(' otherlv_2= ')' ) )
            // InternalOperations.g:603:2: ( ( (lv_name_0_0= 'readAllServosOperation' ) ) otherlv_1= '(' otherlv_2= ')' )
            {
            // InternalOperations.g:603:2: ( ( (lv_name_0_0= 'readAllServosOperation' ) ) otherlv_1= '(' otherlv_2= ')' )
            // InternalOperations.g:604:3: ( (lv_name_0_0= 'readAllServosOperation' ) ) otherlv_1= '(' otherlv_2= ')'
            {
            // InternalOperations.g:604:3: ( (lv_name_0_0= 'readAllServosOperation' ) )
            // InternalOperations.g:605:4: (lv_name_0_0= 'readAllServosOperation' )
            {
            // InternalOperations.g:605:4: (lv_name_0_0= 'readAllServosOperation' )
            // InternalOperations.g:606:5: lv_name_0_0= 'readAllServosOperation'
            {
            lv_name_0_0=(Token)match(input,20,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getReadAllServosOperationAccess().getNameReadAllServosOperationKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReadAllServosOperationRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "readAllServosOperation");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getReadAllServosOperationAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getReadAllServosOperationAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "rulereadAllServosOperation"


    // $ANTLR start "entryRulereadServoOperation"
    // InternalOperations.g:630:1: entryRulereadServoOperation returns [EObject current=null] : iv_rulereadServoOperation= rulereadServoOperation EOF ;
    public final EObject entryRulereadServoOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulereadServoOperation = null;


        try {
            // InternalOperations.g:630:59: (iv_rulereadServoOperation= rulereadServoOperation EOF )
            // InternalOperations.g:631:2: iv_rulereadServoOperation= rulereadServoOperation EOF
            {
             newCompositeNode(grammarAccess.getReadServoOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulereadServoOperation=rulereadServoOperation();

            state._fsp--;

             current =iv_rulereadServoOperation; 
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
    // $ANTLR end "entryRulereadServoOperation"


    // $ANTLR start "rulereadServoOperation"
    // InternalOperations.g:637:1: rulereadServoOperation returns [EObject current=null] : ( ( (lv_name_0_0= 'readServoOperation' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ')' ) ;
    public final EObject rulereadServoOperation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_servo_2_0 = null;



        	enterRule();

        try {
            // InternalOperations.g:643:2: ( ( ( (lv_name_0_0= 'readServoOperation' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ')' ) )
            // InternalOperations.g:644:2: ( ( (lv_name_0_0= 'readServoOperation' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ')' )
            {
            // InternalOperations.g:644:2: ( ( (lv_name_0_0= 'readServoOperation' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ')' )
            // InternalOperations.g:645:3: ( (lv_name_0_0= 'readServoOperation' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ')'
            {
            // InternalOperations.g:645:3: ( (lv_name_0_0= 'readServoOperation' ) )
            // InternalOperations.g:646:4: (lv_name_0_0= 'readServoOperation' )
            {
            // InternalOperations.g:646:4: (lv_name_0_0= 'readServoOperation' )
            // InternalOperations.g:647:5: lv_name_0_0= 'readServoOperation'
            {
            lv_name_0_0=(Token)match(input,21,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getReadServoOperationAccess().getNameReadServoOperationKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReadServoOperationRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "readServoOperation");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReadServoOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOperations.g:663:3: ( (lv_servo_2_0= ruleServo ) )
            // InternalOperations.g:664:4: (lv_servo_2_0= ruleServo )
            {
            // InternalOperations.g:664:4: (lv_servo_2_0= ruleServo )
            // InternalOperations.g:665:5: lv_servo_2_0= ruleServo
            {

            					newCompositeNode(grammarAccess.getReadServoOperationAccess().getServoServoParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_servo_2_0=ruleServo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReadServoOperationRule());
            					}
            					add(
            						current,
            						"servo",
            						lv_servo_2_0,
            						"org.xtext.Operations.Servo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getReadServoOperationAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "rulereadServoOperation"


    // $ANTLR start "entryRulerotateServoOperation"
    // InternalOperations.g:690:1: entryRulerotateServoOperation returns [EObject current=null] : iv_rulerotateServoOperation= rulerotateServoOperation EOF ;
    public final EObject entryRulerotateServoOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerotateServoOperation = null;


        try {
            // InternalOperations.g:690:61: (iv_rulerotateServoOperation= rulerotateServoOperation EOF )
            // InternalOperations.g:691:2: iv_rulerotateServoOperation= rulerotateServoOperation EOF
            {
             newCompositeNode(grammarAccess.getRotateServoOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerotateServoOperation=rulerotateServoOperation();

            state._fsp--;

             current =iv_rulerotateServoOperation; 
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
    // $ANTLR end "entryRulerotateServoOperation"


    // $ANTLR start "rulerotateServoOperation"
    // InternalOperations.g:697:1: rulerotateServoOperation returns [EObject current=null] : ( ( (lv_name_0_0= 'rotateServoOperation' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_time_6_0= ruleTime ) ) otherlv_7= ')' ) ;
    public final EObject rulerotateServoOperation() throws RecognitionException {
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
            // InternalOperations.g:703:2: ( ( ( (lv_name_0_0= 'rotateServoOperation' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_time_6_0= ruleTime ) ) otherlv_7= ')' ) )
            // InternalOperations.g:704:2: ( ( (lv_name_0_0= 'rotateServoOperation' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_time_6_0= ruleTime ) ) otherlv_7= ')' )
            {
            // InternalOperations.g:704:2: ( ( (lv_name_0_0= 'rotateServoOperation' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_time_6_0= ruleTime ) ) otherlv_7= ')' )
            // InternalOperations.g:705:3: ( (lv_name_0_0= 'rotateServoOperation' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_time_6_0= ruleTime ) ) otherlv_7= ')'
            {
            // InternalOperations.g:705:3: ( (lv_name_0_0= 'rotateServoOperation' ) )
            // InternalOperations.g:706:4: (lv_name_0_0= 'rotateServoOperation' )
            {
            // InternalOperations.g:706:4: (lv_name_0_0= 'rotateServoOperation' )
            // InternalOperations.g:707:5: lv_name_0_0= 'rotateServoOperation'
            {
            lv_name_0_0=(Token)match(input,22,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRotateServoOperationAccess().getNameRotateServoOperationKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotateServoOperationRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "rotateServoOperation");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRotateServoOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOperations.g:723:3: ( (lv_servo_2_0= ruleServo ) )
            // InternalOperations.g:724:4: (lv_servo_2_0= ruleServo )
            {
            // InternalOperations.g:724:4: (lv_servo_2_0= ruleServo )
            // InternalOperations.g:725:5: lv_servo_2_0= ruleServo
            {

            					newCompositeNode(grammarAccess.getRotateServoOperationAccess().getServoServoParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_servo_2_0=ruleServo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateServoOperationRule());
            					}
            					add(
            						current,
            						"servo",
            						lv_servo_2_0,
            						"org.xtext.Operations.Servo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getRotateServoOperationAccess().getCommaKeyword_3());
            		
            // InternalOperations.g:746:3: ( (lv_angle_4_0= ruleAngle ) )
            // InternalOperations.g:747:4: (lv_angle_4_0= ruleAngle )
            {
            // InternalOperations.g:747:4: (lv_angle_4_0= ruleAngle )
            // InternalOperations.g:748:5: lv_angle_4_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getRotateServoOperationAccess().getAngleAngleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle_4_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateServoOperationRule());
            					}
            					add(
            						current,
            						"angle",
            						lv_angle_4_0,
            						"org.xtext.Operations.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getRotateServoOperationAccess().getCommaKeyword_5());
            		
            // InternalOperations.g:769:3: ( (lv_time_6_0= ruleTime ) )
            // InternalOperations.g:770:4: (lv_time_6_0= ruleTime )
            {
            // InternalOperations.g:770:4: (lv_time_6_0= ruleTime )
            // InternalOperations.g:771:5: lv_time_6_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getRotateServoOperationAccess().getTimeTimeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_5);
            lv_time_6_0=ruleTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateServoOperationRule());
            					}
            					add(
            						current,
            						"time",
            						lv_time_6_0,
            						"org.xtext.Operations.Time");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRotateServoOperationAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "rulerotateServoOperation"


    // $ANTLR start "entryRulerotateAllServosOperation"
    // InternalOperations.g:796:1: entryRulerotateAllServosOperation returns [EObject current=null] : iv_rulerotateAllServosOperation= rulerotateAllServosOperation EOF ;
    public final EObject entryRulerotateAllServosOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerotateAllServosOperation = null;


        try {
            // InternalOperations.g:796:65: (iv_rulerotateAllServosOperation= rulerotateAllServosOperation EOF )
            // InternalOperations.g:797:2: iv_rulerotateAllServosOperation= rulerotateAllServosOperation EOF
            {
             newCompositeNode(grammarAccess.getRotateAllServosOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerotateAllServosOperation=rulerotateAllServosOperation();

            state._fsp--;

             current =iv_rulerotateAllServosOperation; 
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
    // $ANTLR end "entryRulerotateAllServosOperation"


    // $ANTLR start "rulerotateAllServosOperation"
    // InternalOperations.g:803:1: rulerotateAllServosOperation returns [EObject current=null] : ( ( (lv_name_0_0= 'rotateAllServosOperation' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_time_14_0= ruleTime ) ) otherlv_15= ')' ) ;
    public final EObject rulerotateAllServosOperation() throws RecognitionException {
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
            // InternalOperations.g:809:2: ( ( ( (lv_name_0_0= 'rotateAllServosOperation' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_time_14_0= ruleTime ) ) otherlv_15= ')' ) )
            // InternalOperations.g:810:2: ( ( (lv_name_0_0= 'rotateAllServosOperation' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_time_14_0= ruleTime ) ) otherlv_15= ')' )
            {
            // InternalOperations.g:810:2: ( ( (lv_name_0_0= 'rotateAllServosOperation' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_time_14_0= ruleTime ) ) otherlv_15= ')' )
            // InternalOperations.g:811:3: ( (lv_name_0_0= 'rotateAllServosOperation' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_time_14_0= ruleTime ) ) otherlv_15= ')'
            {
            // InternalOperations.g:811:3: ( (lv_name_0_0= 'rotateAllServosOperation' ) )
            // InternalOperations.g:812:4: (lv_name_0_0= 'rotateAllServosOperation' )
            {
            // InternalOperations.g:812:4: (lv_name_0_0= 'rotateAllServosOperation' )
            // InternalOperations.g:813:5: lv_name_0_0= 'rotateAllServosOperation'
            {
            lv_name_0_0=(Token)match(input,23,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRotateAllServosOperationAccess().getNameRotateAllServosOperationKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotateAllServosOperationRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "rotateAllServosOperation");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRotateAllServosOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOperations.g:829:3: ( (lv_angle1_2_0= ruleAngle ) )
            // InternalOperations.g:830:4: (lv_angle1_2_0= ruleAngle )
            {
            // InternalOperations.g:830:4: (lv_angle1_2_0= ruleAngle )
            // InternalOperations.g:831:5: lv_angle1_2_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getRotateAllServosOperationAccess().getAngle1AngleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle1_2_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateAllServosOperationRule());
            					}
            					add(
            						current,
            						"angle1",
            						lv_angle1_2_0,
            						"org.xtext.Operations.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getRotateAllServosOperationAccess().getCommaKeyword_3());
            		
            // InternalOperations.g:852:3: ( (lv_angle2_4_0= ruleAngle ) )
            // InternalOperations.g:853:4: (lv_angle2_4_0= ruleAngle )
            {
            // InternalOperations.g:853:4: (lv_angle2_4_0= ruleAngle )
            // InternalOperations.g:854:5: lv_angle2_4_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getRotateAllServosOperationAccess().getAngle2AngleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle2_4_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateAllServosOperationRule());
            					}
            					add(
            						current,
            						"angle2",
            						lv_angle2_4_0,
            						"org.xtext.Operations.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getRotateAllServosOperationAccess().getCommaKeyword_5());
            		
            // InternalOperations.g:875:3: ( (lv_angle3_6_0= ruleAngle ) )
            // InternalOperations.g:876:4: (lv_angle3_6_0= ruleAngle )
            {
            // InternalOperations.g:876:4: (lv_angle3_6_0= ruleAngle )
            // InternalOperations.g:877:5: lv_angle3_6_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getRotateAllServosOperationAccess().getAngle3AngleParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle3_6_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateAllServosOperationRule());
            					}
            					add(
            						current,
            						"angle3",
            						lv_angle3_6_0,
            						"org.xtext.Operations.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getRotateAllServosOperationAccess().getCommaKeyword_7());
            		
            // InternalOperations.g:898:3: ( (lv_angle4_8_0= ruleAngle ) )
            // InternalOperations.g:899:4: (lv_angle4_8_0= ruleAngle )
            {
            // InternalOperations.g:899:4: (lv_angle4_8_0= ruleAngle )
            // InternalOperations.g:900:5: lv_angle4_8_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getRotateAllServosOperationAccess().getAngle4AngleParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle4_8_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateAllServosOperationRule());
            					}
            					add(
            						current,
            						"angle4",
            						lv_angle4_8_0,
            						"org.xtext.Operations.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getRotateAllServosOperationAccess().getCommaKeyword_9());
            		
            // InternalOperations.g:921:3: ( (lv_angle5_10_0= ruleAngle ) )
            // InternalOperations.g:922:4: (lv_angle5_10_0= ruleAngle )
            {
            // InternalOperations.g:922:4: (lv_angle5_10_0= ruleAngle )
            // InternalOperations.g:923:5: lv_angle5_10_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getRotateAllServosOperationAccess().getAngle5AngleParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle5_10_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateAllServosOperationRule());
            					}
            					add(
            						current,
            						"angle5",
            						lv_angle5_10_0,
            						"org.xtext.Operations.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getRotateAllServosOperationAccess().getCommaKeyword_11());
            		
            // InternalOperations.g:944:3: ( (lv_angle6_12_0= ruleAngle ) )
            // InternalOperations.g:945:4: (lv_angle6_12_0= ruleAngle )
            {
            // InternalOperations.g:945:4: (lv_angle6_12_0= ruleAngle )
            // InternalOperations.g:946:5: lv_angle6_12_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getRotateAllServosOperationAccess().getAngle6AngleParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle6_12_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateAllServosOperationRule());
            					}
            					add(
            						current,
            						"angle6",
            						lv_angle6_12_0,
            						"org.xtext.Operations.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_13, grammarAccess.getRotateAllServosOperationAccess().getCommaKeyword_13());
            		
            // InternalOperations.g:967:3: ( (lv_time_14_0= ruleTime ) )
            // InternalOperations.g:968:4: (lv_time_14_0= ruleTime )
            {
            // InternalOperations.g:968:4: (lv_time_14_0= ruleTime )
            // InternalOperations.g:969:5: lv_time_14_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getRotateAllServosOperationAccess().getTimeTimeParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_5);
            lv_time_14_0=ruleTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateAllServosOperationRule());
            					}
            					add(
            						current,
            						"time",
            						lv_time_14_0,
            						"org.xtext.Operations.Time");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getRotateAllServosOperationAccess().getRightParenthesisKeyword_15());
            		

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
    // $ANTLR end "rulerotateAllServosOperation"


    // $ANTLR start "entryRuleisAtSingleOperation"
    // InternalOperations.g:994:1: entryRuleisAtSingleOperation returns [EObject current=null] : iv_ruleisAtSingleOperation= ruleisAtSingleOperation EOF ;
    public final EObject entryRuleisAtSingleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleisAtSingleOperation = null;


        try {
            // InternalOperations.g:994:60: (iv_ruleisAtSingleOperation= ruleisAtSingleOperation EOF )
            // InternalOperations.g:995:2: iv_ruleisAtSingleOperation= ruleisAtSingleOperation EOF
            {
             newCompositeNode(grammarAccess.getIsAtSingleOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleisAtSingleOperation=ruleisAtSingleOperation();

            state._fsp--;

             current =iv_ruleisAtSingleOperation; 
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
    // $ANTLR end "entryRuleisAtSingleOperation"


    // $ANTLR start "ruleisAtSingleOperation"
    // InternalOperations.g:1001:1: ruleisAtSingleOperation returns [EObject current=null] : ( ( (lv_name_0_0= 'isAtSingleOperation' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle_res_6_0= ruleAngle_res ) ) otherlv_7= ')' ) ;
    public final EObject ruleisAtSingleOperation() throws RecognitionException {
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
            // InternalOperations.g:1007:2: ( ( ( (lv_name_0_0= 'isAtSingleOperation' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle_res_6_0= ruleAngle_res ) ) otherlv_7= ')' ) )
            // InternalOperations.g:1008:2: ( ( (lv_name_0_0= 'isAtSingleOperation' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle_res_6_0= ruleAngle_res ) ) otherlv_7= ')' )
            {
            // InternalOperations.g:1008:2: ( ( (lv_name_0_0= 'isAtSingleOperation' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle_res_6_0= ruleAngle_res ) ) otherlv_7= ')' )
            // InternalOperations.g:1009:3: ( (lv_name_0_0= 'isAtSingleOperation' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle_res_6_0= ruleAngle_res ) ) otherlv_7= ')'
            {
            // InternalOperations.g:1009:3: ( (lv_name_0_0= 'isAtSingleOperation' ) )
            // InternalOperations.g:1010:4: (lv_name_0_0= 'isAtSingleOperation' )
            {
            // InternalOperations.g:1010:4: (lv_name_0_0= 'isAtSingleOperation' )
            // InternalOperations.g:1011:5: lv_name_0_0= 'isAtSingleOperation'
            {
            lv_name_0_0=(Token)match(input,24,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getIsAtSingleOperationAccess().getNameIsAtSingleOperationKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIsAtSingleOperationRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "isAtSingleOperation");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getIsAtSingleOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOperations.g:1027:3: ( (lv_servo_2_0= ruleServo ) )
            // InternalOperations.g:1028:4: (lv_servo_2_0= ruleServo )
            {
            // InternalOperations.g:1028:4: (lv_servo_2_0= ruleServo )
            // InternalOperations.g:1029:5: lv_servo_2_0= ruleServo
            {

            					newCompositeNode(grammarAccess.getIsAtSingleOperationAccess().getServoServoParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_servo_2_0=ruleServo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtSingleOperationRule());
            					}
            					add(
            						current,
            						"servo",
            						lv_servo_2_0,
            						"org.xtext.Operations.Servo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getIsAtSingleOperationAccess().getCommaKeyword_3());
            		
            // InternalOperations.g:1050:3: ( (lv_angle_4_0= ruleAngle ) )
            // InternalOperations.g:1051:4: (lv_angle_4_0= ruleAngle )
            {
            // InternalOperations.g:1051:4: (lv_angle_4_0= ruleAngle )
            // InternalOperations.g:1052:5: lv_angle_4_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getIsAtSingleOperationAccess().getAngleAngleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle_4_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtSingleOperationRule());
            					}
            					add(
            						current,
            						"angle",
            						lv_angle_4_0,
            						"org.xtext.Operations.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getIsAtSingleOperationAccess().getCommaKeyword_5());
            		
            // InternalOperations.g:1073:3: ( (lv_angle_res_6_0= ruleAngle_res ) )
            // InternalOperations.g:1074:4: (lv_angle_res_6_0= ruleAngle_res )
            {
            // InternalOperations.g:1074:4: (lv_angle_res_6_0= ruleAngle_res )
            // InternalOperations.g:1075:5: lv_angle_res_6_0= ruleAngle_res
            {

            					newCompositeNode(grammarAccess.getIsAtSingleOperationAccess().getAngle_resAngle_resParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_5);
            lv_angle_res_6_0=ruleAngle_res();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtSingleOperationRule());
            					}
            					add(
            						current,
            						"angle_res",
            						lv_angle_res_6_0,
            						"org.xtext.Operations.Angle_res");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getIsAtSingleOperationAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleisAtSingleOperation"


    // $ANTLR start "entryRuleisAtOperation"
    // InternalOperations.g:1100:1: entryRuleisAtOperation returns [EObject current=null] : iv_ruleisAtOperation= ruleisAtOperation EOF ;
    public final EObject entryRuleisAtOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleisAtOperation = null;


        try {
            // InternalOperations.g:1100:54: (iv_ruleisAtOperation= ruleisAtOperation EOF )
            // InternalOperations.g:1101:2: iv_ruleisAtOperation= ruleisAtOperation EOF
            {
             newCompositeNode(grammarAccess.getIsAtOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleisAtOperation=ruleisAtOperation();

            state._fsp--;

             current =iv_ruleisAtOperation; 
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
    // $ANTLR end "entryRuleisAtOperation"


    // $ANTLR start "ruleisAtOperation"
    // InternalOperations.g:1107:1: ruleisAtOperation returns [EObject current=null] : ( ( (lv_name_0_0= 'isAtOperation' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_angle_res_14_0= ruleAngle_res ) ) otherlv_15= ')' ) ;
    public final EObject ruleisAtOperation() throws RecognitionException {
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
            // InternalOperations.g:1113:2: ( ( ( (lv_name_0_0= 'isAtOperation' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_angle_res_14_0= ruleAngle_res ) ) otherlv_15= ')' ) )
            // InternalOperations.g:1114:2: ( ( (lv_name_0_0= 'isAtOperation' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_angle_res_14_0= ruleAngle_res ) ) otherlv_15= ')' )
            {
            // InternalOperations.g:1114:2: ( ( (lv_name_0_0= 'isAtOperation' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_angle_res_14_0= ruleAngle_res ) ) otherlv_15= ')' )
            // InternalOperations.g:1115:3: ( (lv_name_0_0= 'isAtOperation' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_angle_res_14_0= ruleAngle_res ) ) otherlv_15= ')'
            {
            // InternalOperations.g:1115:3: ( (lv_name_0_0= 'isAtOperation' ) )
            // InternalOperations.g:1116:4: (lv_name_0_0= 'isAtOperation' )
            {
            // InternalOperations.g:1116:4: (lv_name_0_0= 'isAtOperation' )
            // InternalOperations.g:1117:5: lv_name_0_0= 'isAtOperation'
            {
            lv_name_0_0=(Token)match(input,25,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getIsAtOperationAccess().getNameIsAtOperationKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIsAtOperationRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "isAtOperation");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getIsAtOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOperations.g:1133:3: ( (lv_angle1_2_0= ruleAngle ) )
            // InternalOperations.g:1134:4: (lv_angle1_2_0= ruleAngle )
            {
            // InternalOperations.g:1134:4: (lv_angle1_2_0= ruleAngle )
            // InternalOperations.g:1135:5: lv_angle1_2_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getIsAtOperationAccess().getAngle1AngleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle1_2_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtOperationRule());
            					}
            					add(
            						current,
            						"angle1",
            						lv_angle1_2_0,
            						"org.xtext.Operations.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getIsAtOperationAccess().getCommaKeyword_3());
            		
            // InternalOperations.g:1156:3: ( (lv_angle2_4_0= ruleAngle ) )
            // InternalOperations.g:1157:4: (lv_angle2_4_0= ruleAngle )
            {
            // InternalOperations.g:1157:4: (lv_angle2_4_0= ruleAngle )
            // InternalOperations.g:1158:5: lv_angle2_4_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getIsAtOperationAccess().getAngle2AngleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle2_4_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtOperationRule());
            					}
            					add(
            						current,
            						"angle2",
            						lv_angle2_4_0,
            						"org.xtext.Operations.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getIsAtOperationAccess().getCommaKeyword_5());
            		
            // InternalOperations.g:1179:3: ( (lv_angle3_6_0= ruleAngle ) )
            // InternalOperations.g:1180:4: (lv_angle3_6_0= ruleAngle )
            {
            // InternalOperations.g:1180:4: (lv_angle3_6_0= ruleAngle )
            // InternalOperations.g:1181:5: lv_angle3_6_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getIsAtOperationAccess().getAngle3AngleParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle3_6_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtOperationRule());
            					}
            					add(
            						current,
            						"angle3",
            						lv_angle3_6_0,
            						"org.xtext.Operations.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getIsAtOperationAccess().getCommaKeyword_7());
            		
            // InternalOperations.g:1202:3: ( (lv_angle4_8_0= ruleAngle ) )
            // InternalOperations.g:1203:4: (lv_angle4_8_0= ruleAngle )
            {
            // InternalOperations.g:1203:4: (lv_angle4_8_0= ruleAngle )
            // InternalOperations.g:1204:5: lv_angle4_8_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getIsAtOperationAccess().getAngle4AngleParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle4_8_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtOperationRule());
            					}
            					add(
            						current,
            						"angle4",
            						lv_angle4_8_0,
            						"org.xtext.Operations.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getIsAtOperationAccess().getCommaKeyword_9());
            		
            // InternalOperations.g:1225:3: ( (lv_angle5_10_0= ruleAngle ) )
            // InternalOperations.g:1226:4: (lv_angle5_10_0= ruleAngle )
            {
            // InternalOperations.g:1226:4: (lv_angle5_10_0= ruleAngle )
            // InternalOperations.g:1227:5: lv_angle5_10_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getIsAtOperationAccess().getAngle5AngleParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle5_10_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtOperationRule());
            					}
            					add(
            						current,
            						"angle5",
            						lv_angle5_10_0,
            						"org.xtext.Operations.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getIsAtOperationAccess().getCommaKeyword_11());
            		
            // InternalOperations.g:1248:3: ( (lv_angle6_12_0= ruleAngle ) )
            // InternalOperations.g:1249:4: (lv_angle6_12_0= ruleAngle )
            {
            // InternalOperations.g:1249:4: (lv_angle6_12_0= ruleAngle )
            // InternalOperations.g:1250:5: lv_angle6_12_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getIsAtOperationAccess().getAngle6AngleParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle6_12_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtOperationRule());
            					}
            					add(
            						current,
            						"angle6",
            						lv_angle6_12_0,
            						"org.xtext.Operations.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_13, grammarAccess.getIsAtOperationAccess().getCommaKeyword_13());
            		
            // InternalOperations.g:1271:3: ( (lv_angle_res_14_0= ruleAngle_res ) )
            // InternalOperations.g:1272:4: (lv_angle_res_14_0= ruleAngle_res )
            {
            // InternalOperations.g:1272:4: (lv_angle_res_14_0= ruleAngle_res )
            // InternalOperations.g:1273:5: lv_angle_res_14_0= ruleAngle_res
            {

            					newCompositeNode(grammarAccess.getIsAtOperationAccess().getAngle_resAngle_resParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_5);
            lv_angle_res_14_0=ruleAngle_res();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtOperationRule());
            					}
            					add(
            						current,
            						"angle_res",
            						lv_angle_res_14_0,
            						"org.xtext.Operations.Angle_res");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getIsAtOperationAccess().getRightParenthesisKeyword_15());
            		

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
    // $ANTLR end "ruleisAtOperation"


    // $ANTLR start "entryRuleAngle_res"
    // InternalOperations.g:1298:1: entryRuleAngle_res returns [EObject current=null] : iv_ruleAngle_res= ruleAngle_res EOF ;
    public final EObject entryRuleAngle_res() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAngle_res = null;


        try {
            // InternalOperations.g:1298:50: (iv_ruleAngle_res= ruleAngle_res EOF )
            // InternalOperations.g:1299:2: iv_ruleAngle_res= ruleAngle_res EOF
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
    // InternalOperations.g:1305:1: ruleAngle_res returns [EObject current=null] : ( (lv_angle_res_0_0= RULE_INT ) ) ;
    public final EObject ruleAngle_res() throws RecognitionException {
        EObject current = null;

        Token lv_angle_res_0_0=null;


        	enterRule();

        try {
            // InternalOperations.g:1311:2: ( ( (lv_angle_res_0_0= RULE_INT ) ) )
            // InternalOperations.g:1312:2: ( (lv_angle_res_0_0= RULE_INT ) )
            {
            // InternalOperations.g:1312:2: ( (lv_angle_res_0_0= RULE_INT ) )
            // InternalOperations.g:1313:3: (lv_angle_res_0_0= RULE_INT )
            {
            // InternalOperations.g:1313:3: (lv_angle_res_0_0= RULE_INT )
            // InternalOperations.g:1314:4: lv_angle_res_0_0= RULE_INT
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
    // InternalOperations.g:1333:1: entryRuleAngle returns [EObject current=null] : iv_ruleAngle= ruleAngle EOF ;
    public final EObject entryRuleAngle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAngle = null;


        try {
            // InternalOperations.g:1333:46: (iv_ruleAngle= ruleAngle EOF )
            // InternalOperations.g:1334:2: iv_ruleAngle= ruleAngle EOF
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
    // InternalOperations.g:1340:1: ruleAngle returns [EObject current=null] : ( (lv_angle_0_0= RULE_INT ) ) ;
    public final EObject ruleAngle() throws RecognitionException {
        EObject current = null;

        Token lv_angle_0_0=null;


        	enterRule();

        try {
            // InternalOperations.g:1346:2: ( ( (lv_angle_0_0= RULE_INT ) ) )
            // InternalOperations.g:1347:2: ( (lv_angle_0_0= RULE_INT ) )
            {
            // InternalOperations.g:1347:2: ( (lv_angle_0_0= RULE_INT ) )
            // InternalOperations.g:1348:3: (lv_angle_0_0= RULE_INT )
            {
            // InternalOperations.g:1348:3: (lv_angle_0_0= RULE_INT )
            // InternalOperations.g:1349:4: lv_angle_0_0= RULE_INT
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
    // InternalOperations.g:1368:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalOperations.g:1368:45: (iv_ruleTime= ruleTime EOF )
            // InternalOperations.g:1369:2: iv_ruleTime= ruleTime EOF
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
    // InternalOperations.g:1375:1: ruleTime returns [EObject current=null] : ( (lv_time_0_0= RULE_INT ) ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token lv_time_0_0=null;


        	enterRule();

        try {
            // InternalOperations.g:1381:2: ( ( (lv_time_0_0= RULE_INT ) ) )
            // InternalOperations.g:1382:2: ( (lv_time_0_0= RULE_INT ) )
            {
            // InternalOperations.g:1382:2: ( (lv_time_0_0= RULE_INT ) )
            // InternalOperations.g:1383:3: (lv_time_0_0= RULE_INT )
            {
            // InternalOperations.g:1383:3: (lv_time_0_0= RULE_INT )
            // InternalOperations.g:1384:4: lv_time_0_0= RULE_INT
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
    // InternalOperations.g:1403:1: entryRuleServo returns [EObject current=null] : iv_ruleServo= ruleServo EOF ;
    public final EObject entryRuleServo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServo = null;


        try {
            // InternalOperations.g:1403:46: (iv_ruleServo= ruleServo EOF )
            // InternalOperations.g:1404:2: iv_ruleServo= ruleServo EOF
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
    // InternalOperations.g:1410:1: ruleServo returns [EObject current=null] : ( (lv_servo_0_0= RULE_INT ) ) ;
    public final EObject ruleServo() throws RecognitionException {
        EObject current = null;

        Token lv_servo_0_0=null;


        	enterRule();

        try {
            // InternalOperations.g:1416:2: ( ( (lv_servo_0_0= RULE_INT ) ) )
            // InternalOperations.g:1417:2: ( (lv_servo_0_0= RULE_INT ) )
            {
            // InternalOperations.g:1417:2: ( (lv_servo_0_0= RULE_INT ) )
            // InternalOperations.g:1418:3: (lv_servo_0_0= RULE_INT )
            {
            // InternalOperations.g:1418:3: (lv_servo_0_0= RULE_INT )
            // InternalOperations.g:1419:4: lv_servo_0_0= RULE_INT
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


    // $ANTLR start "entryRuleV_max"
    // InternalOperations.g:1438:1: entryRuleV_max returns [EObject current=null] : iv_ruleV_max= ruleV_max EOF ;
    public final EObject entryRuleV_max() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleV_max = null;


        try {
            // InternalOperations.g:1438:46: (iv_ruleV_max= ruleV_max EOF )
            // InternalOperations.g:1439:2: iv_ruleV_max= ruleV_max EOF
            {
             newCompositeNode(grammarAccess.getV_maxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleV_max=ruleV_max();

            state._fsp--;

             current =iv_ruleV_max; 
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
    // $ANTLR end "entryRuleV_max"


    // $ANTLR start "ruleV_max"
    // InternalOperations.g:1445:1: ruleV_max returns [EObject current=null] : ( (lv_v_max_0_0= RULE_INT ) ) ;
    public final EObject ruleV_max() throws RecognitionException {
        EObject current = null;

        Token lv_v_max_0_0=null;


        	enterRule();

        try {
            // InternalOperations.g:1451:2: ( ( (lv_v_max_0_0= RULE_INT ) ) )
            // InternalOperations.g:1452:2: ( (lv_v_max_0_0= RULE_INT ) )
            {
            // InternalOperations.g:1452:2: ( (lv_v_max_0_0= RULE_INT ) )
            // InternalOperations.g:1453:3: (lv_v_max_0_0= RULE_INT )
            {
            // InternalOperations.g:1453:3: (lv_v_max_0_0= RULE_INT )
            // InternalOperations.g:1454:4: lv_v_max_0_0= RULE_INT
            {
            lv_v_max_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_v_max_0_0, grammarAccess.getV_maxAccess().getV_maxINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getV_maxRule());
            				}
            				setWithLastConsumed(
            					current,
            					"v_max",
            					lv_v_max_0_0,
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
    // $ANTLR end "ruleV_max"


    // $ANTLR start "entryRuleS_max"
    // InternalOperations.g:1473:1: entryRuleS_max returns [EObject current=null] : iv_ruleS_max= ruleS_max EOF ;
    public final EObject entryRuleS_max() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleS_max = null;


        try {
            // InternalOperations.g:1473:46: (iv_ruleS_max= ruleS_max EOF )
            // InternalOperations.g:1474:2: iv_ruleS_max= ruleS_max EOF
            {
             newCompositeNode(grammarAccess.getS_maxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleS_max=ruleS_max();

            state._fsp--;

             current =iv_ruleS_max; 
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
    // $ANTLR end "entryRuleS_max"


    // $ANTLR start "ruleS_max"
    // InternalOperations.g:1480:1: ruleS_max returns [EObject current=null] : ( (lv_s_max_0_0= RULE_INT ) ) ;
    public final EObject ruleS_max() throws RecognitionException {
        EObject current = null;

        Token lv_s_max_0_0=null;


        	enterRule();

        try {
            // InternalOperations.g:1486:2: ( ( (lv_s_max_0_0= RULE_INT ) ) )
            // InternalOperations.g:1487:2: ( (lv_s_max_0_0= RULE_INT ) )
            {
            // InternalOperations.g:1487:2: ( (lv_s_max_0_0= RULE_INT ) )
            // InternalOperations.g:1488:3: (lv_s_max_0_0= RULE_INT )
            {
            // InternalOperations.g:1488:3: (lv_s_max_0_0= RULE_INT )
            // InternalOperations.g:1489:4: lv_s_max_0_0= RULE_INT
            {
            lv_s_max_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_s_max_0_0, grammarAccess.getS_maxAccess().getS_maxINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getS_maxRule());
            				}
            				setWithLastConsumed(
            					current,
            					"s_max",
            					lv_s_max_0_0,
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
    // $ANTLR end "ruleS_max"


    // $ANTLR start "entryRuleH_max"
    // InternalOperations.g:1508:1: entryRuleH_max returns [EObject current=null] : iv_ruleH_max= ruleH_max EOF ;
    public final EObject entryRuleH_max() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleH_max = null;


        try {
            // InternalOperations.g:1508:46: (iv_ruleH_max= ruleH_max EOF )
            // InternalOperations.g:1509:2: iv_ruleH_max= ruleH_max EOF
            {
             newCompositeNode(grammarAccess.getH_maxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleH_max=ruleH_max();

            state._fsp--;

             current =iv_ruleH_max; 
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
    // $ANTLR end "entryRuleH_max"


    // $ANTLR start "ruleH_max"
    // InternalOperations.g:1515:1: ruleH_max returns [EObject current=null] : ( (lv_h_max_0_0= RULE_INT ) ) ;
    public final EObject ruleH_max() throws RecognitionException {
        EObject current = null;

        Token lv_h_max_0_0=null;


        	enterRule();

        try {
            // InternalOperations.g:1521:2: ( ( (lv_h_max_0_0= RULE_INT ) ) )
            // InternalOperations.g:1522:2: ( (lv_h_max_0_0= RULE_INT ) )
            {
            // InternalOperations.g:1522:2: ( (lv_h_max_0_0= RULE_INT ) )
            // InternalOperations.g:1523:3: (lv_h_max_0_0= RULE_INT )
            {
            // InternalOperations.g:1523:3: (lv_h_max_0_0= RULE_INT )
            // InternalOperations.g:1524:4: lv_h_max_0_0= RULE_INT
            {
            lv_h_max_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_h_max_0_0, grammarAccess.getH_maxAccess().getH_maxINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getH_maxRule());
            				}
            				setWithLastConsumed(
            					current,
            					"h_max",
            					lv_h_max_0_0,
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
    // $ANTLR end "ruleH_max"


    // $ANTLR start "entryRuleV_min"
    // InternalOperations.g:1543:1: entryRuleV_min returns [EObject current=null] : iv_ruleV_min= ruleV_min EOF ;
    public final EObject entryRuleV_min() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleV_min = null;


        try {
            // InternalOperations.g:1543:46: (iv_ruleV_min= ruleV_min EOF )
            // InternalOperations.g:1544:2: iv_ruleV_min= ruleV_min EOF
            {
             newCompositeNode(grammarAccess.getV_minRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleV_min=ruleV_min();

            state._fsp--;

             current =iv_ruleV_min; 
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
    // $ANTLR end "entryRuleV_min"


    // $ANTLR start "ruleV_min"
    // InternalOperations.g:1550:1: ruleV_min returns [EObject current=null] : ( (lv_v_min_0_0= RULE_INT ) ) ;
    public final EObject ruleV_min() throws RecognitionException {
        EObject current = null;

        Token lv_v_min_0_0=null;


        	enterRule();

        try {
            // InternalOperations.g:1556:2: ( ( (lv_v_min_0_0= RULE_INT ) ) )
            // InternalOperations.g:1557:2: ( (lv_v_min_0_0= RULE_INT ) )
            {
            // InternalOperations.g:1557:2: ( (lv_v_min_0_0= RULE_INT ) )
            // InternalOperations.g:1558:3: (lv_v_min_0_0= RULE_INT )
            {
            // InternalOperations.g:1558:3: (lv_v_min_0_0= RULE_INT )
            // InternalOperations.g:1559:4: lv_v_min_0_0= RULE_INT
            {
            lv_v_min_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_v_min_0_0, grammarAccess.getV_minAccess().getV_minINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getV_minRule());
            				}
            				setWithLastConsumed(
            					current,
            					"v_min",
            					lv_v_min_0_0,
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
    // $ANTLR end "ruleV_min"


    // $ANTLR start "entryRuleS_min"
    // InternalOperations.g:1578:1: entryRuleS_min returns [EObject current=null] : iv_ruleS_min= ruleS_min EOF ;
    public final EObject entryRuleS_min() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleS_min = null;


        try {
            // InternalOperations.g:1578:46: (iv_ruleS_min= ruleS_min EOF )
            // InternalOperations.g:1579:2: iv_ruleS_min= ruleS_min EOF
            {
             newCompositeNode(grammarAccess.getS_minRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleS_min=ruleS_min();

            state._fsp--;

             current =iv_ruleS_min; 
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
    // $ANTLR end "entryRuleS_min"


    // $ANTLR start "ruleS_min"
    // InternalOperations.g:1585:1: ruleS_min returns [EObject current=null] : ( (lv_s_min_0_0= RULE_INT ) ) ;
    public final EObject ruleS_min() throws RecognitionException {
        EObject current = null;

        Token lv_s_min_0_0=null;


        	enterRule();

        try {
            // InternalOperations.g:1591:2: ( ( (lv_s_min_0_0= RULE_INT ) ) )
            // InternalOperations.g:1592:2: ( (lv_s_min_0_0= RULE_INT ) )
            {
            // InternalOperations.g:1592:2: ( (lv_s_min_0_0= RULE_INT ) )
            // InternalOperations.g:1593:3: (lv_s_min_0_0= RULE_INT )
            {
            // InternalOperations.g:1593:3: (lv_s_min_0_0= RULE_INT )
            // InternalOperations.g:1594:4: lv_s_min_0_0= RULE_INT
            {
            lv_s_min_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_s_min_0_0, grammarAccess.getS_minAccess().getS_minINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getS_minRule());
            				}
            				setWithLastConsumed(
            					current,
            					"s_min",
            					lv_s_min_0_0,
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
    // $ANTLR end "ruleS_min"


    // $ANTLR start "entryRuleH_min"
    // InternalOperations.g:1613:1: entryRuleH_min returns [EObject current=null] : iv_ruleH_min= ruleH_min EOF ;
    public final EObject entryRuleH_min() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleH_min = null;


        try {
            // InternalOperations.g:1613:46: (iv_ruleH_min= ruleH_min EOF )
            // InternalOperations.g:1614:2: iv_ruleH_min= ruleH_min EOF
            {
             newCompositeNode(grammarAccess.getH_minRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleH_min=ruleH_min();

            state._fsp--;

             current =iv_ruleH_min; 
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
    // $ANTLR end "entryRuleH_min"


    // $ANTLR start "ruleH_min"
    // InternalOperations.g:1620:1: ruleH_min returns [EObject current=null] : ( (lv_h_min_0_0= RULE_INT ) ) ;
    public final EObject ruleH_min() throws RecognitionException {
        EObject current = null;

        Token lv_h_min_0_0=null;


        	enterRule();

        try {
            // InternalOperations.g:1626:2: ( ( (lv_h_min_0_0= RULE_INT ) ) )
            // InternalOperations.g:1627:2: ( (lv_h_min_0_0= RULE_INT ) )
            {
            // InternalOperations.g:1627:2: ( (lv_h_min_0_0= RULE_INT ) )
            // InternalOperations.g:1628:3: (lv_h_min_0_0= RULE_INT )
            {
            // InternalOperations.g:1628:3: (lv_h_min_0_0= RULE_INT )
            // InternalOperations.g:1629:4: lv_h_min_0_0= RULE_INT
            {
            lv_h_min_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_h_min_0_0, grammarAccess.getH_minAccess().getH_minINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getH_minRule());
            				}
            				setWithLastConsumed(
            					current,
            					"h_min",
            					lv_h_min_0_0,
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
    // $ANTLR end "ruleH_min"


    // $ANTLR start "entryRuleColor"
    // InternalOperations.g:1648:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalOperations.g:1648:46: (iv_ruleColor= ruleColor EOF )
            // InternalOperations.g:1649:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalOperations.g:1655:1: ruleColor returns [EObject current=null] : ( (lv_color_0_0= RULE_STRING ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token lv_color_0_0=null;


        	enterRule();

        try {
            // InternalOperations.g:1661:2: ( ( (lv_color_0_0= RULE_STRING ) ) )
            // InternalOperations.g:1662:2: ( (lv_color_0_0= RULE_STRING ) )
            {
            // InternalOperations.g:1662:2: ( (lv_color_0_0= RULE_STRING ) )
            // InternalOperations.g:1663:3: (lv_color_0_0= RULE_STRING )
            {
            // InternalOperations.g:1663:3: (lv_color_0_0= RULE_STRING )
            // InternalOperations.g:1664:4: lv_color_0_0= RULE_STRING
            {
            lv_color_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_color_0_0, grammarAccess.getColorAccess().getColorSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getColorRule());
            				}
            				setWithLastConsumed(
            					current,
            					"color",
            					lv_color_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleB"
    // InternalOperations.g:1683:1: entryRuleB returns [EObject current=null] : iv_ruleB= ruleB EOF ;
    public final EObject entryRuleB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleB = null;


        try {
            // InternalOperations.g:1683:42: (iv_ruleB= ruleB EOF )
            // InternalOperations.g:1684:2: iv_ruleB= ruleB EOF
            {
             newCompositeNode(grammarAccess.getBRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleB=ruleB();

            state._fsp--;

             current =iv_ruleB; 
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
    // $ANTLR end "entryRuleB"


    // $ANTLR start "ruleB"
    // InternalOperations.g:1690:1: ruleB returns [EObject current=null] : ( (lv_b_0_0= RULE_INT ) ) ;
    public final EObject ruleB() throws RecognitionException {
        EObject current = null;

        Token lv_b_0_0=null;


        	enterRule();

        try {
            // InternalOperations.g:1696:2: ( ( (lv_b_0_0= RULE_INT ) ) )
            // InternalOperations.g:1697:2: ( (lv_b_0_0= RULE_INT ) )
            {
            // InternalOperations.g:1697:2: ( (lv_b_0_0= RULE_INT ) )
            // InternalOperations.g:1698:3: (lv_b_0_0= RULE_INT )
            {
            // InternalOperations.g:1698:3: (lv_b_0_0= RULE_INT )
            // InternalOperations.g:1699:4: lv_b_0_0= RULE_INT
            {
            lv_b_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_b_0_0, grammarAccess.getBAccess().getBINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBRule());
            				}
            				setWithLastConsumed(
            					current,
            					"b",
            					lv_b_0_0,
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
    // $ANTLR end "ruleB"


    // $ANTLR start "entryRuleG"
    // InternalOperations.g:1718:1: entryRuleG returns [EObject current=null] : iv_ruleG= ruleG EOF ;
    public final EObject entryRuleG() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleG = null;


        try {
            // InternalOperations.g:1718:42: (iv_ruleG= ruleG EOF )
            // InternalOperations.g:1719:2: iv_ruleG= ruleG EOF
            {
             newCompositeNode(grammarAccess.getGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleG=ruleG();

            state._fsp--;

             current =iv_ruleG; 
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
    // $ANTLR end "entryRuleG"


    // $ANTLR start "ruleG"
    // InternalOperations.g:1725:1: ruleG returns [EObject current=null] : ( (lv_g_0_0= RULE_INT ) ) ;
    public final EObject ruleG() throws RecognitionException {
        EObject current = null;

        Token lv_g_0_0=null;


        	enterRule();

        try {
            // InternalOperations.g:1731:2: ( ( (lv_g_0_0= RULE_INT ) ) )
            // InternalOperations.g:1732:2: ( (lv_g_0_0= RULE_INT ) )
            {
            // InternalOperations.g:1732:2: ( (lv_g_0_0= RULE_INT ) )
            // InternalOperations.g:1733:3: (lv_g_0_0= RULE_INT )
            {
            // InternalOperations.g:1733:3: (lv_g_0_0= RULE_INT )
            // InternalOperations.g:1734:4: lv_g_0_0= RULE_INT
            {
            lv_g_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_g_0_0, grammarAccess.getGAccess().getGINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getGRule());
            				}
            				setWithLastConsumed(
            					current,
            					"g",
            					lv_g_0_0,
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
    // $ANTLR end "ruleG"


    // $ANTLR start "entryRuleR"
    // InternalOperations.g:1753:1: entryRuleR returns [EObject current=null] : iv_ruleR= ruleR EOF ;
    public final EObject entryRuleR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleR = null;


        try {
            // InternalOperations.g:1753:42: (iv_ruleR= ruleR EOF )
            // InternalOperations.g:1754:2: iv_ruleR= ruleR EOF
            {
             newCompositeNode(grammarAccess.getRRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleR=ruleR();

            state._fsp--;

             current =iv_ruleR; 
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
    // $ANTLR end "entryRuleR"


    // $ANTLR start "ruleR"
    // InternalOperations.g:1760:1: ruleR returns [EObject current=null] : ( (lv_r_0_0= RULE_INT ) ) ;
    public final EObject ruleR() throws RecognitionException {
        EObject current = null;

        Token lv_r_0_0=null;


        	enterRule();

        try {
            // InternalOperations.g:1766:2: ( ( (lv_r_0_0= RULE_INT ) ) )
            // InternalOperations.g:1767:2: ( (lv_r_0_0= RULE_INT ) )
            {
            // InternalOperations.g:1767:2: ( (lv_r_0_0= RULE_INT ) )
            // InternalOperations.g:1768:3: (lv_r_0_0= RULE_INT )
            {
            // InternalOperations.g:1768:3: (lv_r_0_0= RULE_INT )
            // InternalOperations.g:1769:4: lv_r_0_0= RULE_INT
            {
            lv_r_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_r_0_0, grammarAccess.getRAccess().getRINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRRule());
            				}
            				setWithLastConsumed(
            					current,
            					"r",
            					lv_r_0_0,
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
    // $ANTLR end "ruleR"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});

}