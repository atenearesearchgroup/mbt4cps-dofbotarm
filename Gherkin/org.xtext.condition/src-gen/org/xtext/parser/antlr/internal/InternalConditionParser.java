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
import org.xtext.services.ConditionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConditionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NotLaterThan'", "'('", "')'", "'isAtSingle'", "','", "'isAt'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=4;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalConditionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalConditionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalConditionParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCondition.g"; }



     	private ConditionGrammarAccess grammarAccess;

        public InternalConditionParser(TokenStream input, ConditionGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Conditions";
       	}

       	@Override
       	protected ConditionGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleConditions"
    // InternalCondition.g:65:1: entryRuleConditions returns [EObject current=null] : iv_ruleConditions= ruleConditions EOF ;
    public final EObject entryRuleConditions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditions = null;


        try {
            // InternalCondition.g:65:51: (iv_ruleConditions= ruleConditions EOF )
            // InternalCondition.g:66:2: iv_ruleConditions= ruleConditions EOF
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
    // InternalCondition.g:72:1: ruleConditions returns [EObject current=null] : ( ( (lv_name_0_0= 'NotLaterThan' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' ) ;
    public final EObject ruleConditions() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_time_2_0 = null;



        	enterRule();

        try {
            // InternalCondition.g:78:2: ( ( ( (lv_name_0_0= 'NotLaterThan' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' ) )
            // InternalCondition.g:79:2: ( ( (lv_name_0_0= 'NotLaterThan' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' )
            {
            // InternalCondition.g:79:2: ( ( (lv_name_0_0= 'NotLaterThan' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' )
            // InternalCondition.g:80:3: ( (lv_name_0_0= 'NotLaterThan' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')'
            {
            // InternalCondition.g:80:3: ( (lv_name_0_0= 'NotLaterThan' ) )
            // InternalCondition.g:81:4: (lv_name_0_0= 'NotLaterThan' )
            {
            // InternalCondition.g:81:4: (lv_name_0_0= 'NotLaterThan' )
            // InternalCondition.g:82:5: lv_name_0_0= 'NotLaterThan'
            {
            lv_name_0_0=(Token)match(input,11,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getConditionsAccess().getNameNotLaterThanKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionsRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "NotLaterThan");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionsAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCondition.g:98:3: ( (lv_time_2_0= ruleTime ) )
            // InternalCondition.g:99:4: (lv_time_2_0= ruleTime )
            {
            // InternalCondition.g:99:4: (lv_time_2_0= ruleTime )
            // InternalCondition.g:100:5: lv_time_2_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getConditionsAccess().getTimeTimeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_time_2_0=ruleTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionsRule());
            					}
            					add(
            						current,
            						"time",
            						lv_time_2_0,
            						"org.xtext.Solution.Time");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

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


    // $ANTLR start "entryRuleisAtSingle"
    // InternalCondition.g:125:1: entryRuleisAtSingle returns [EObject current=null] : iv_ruleisAtSingle= ruleisAtSingle EOF ;
    public final EObject entryRuleisAtSingle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleisAtSingle = null;


        try {
            // InternalCondition.g:125:51: (iv_ruleisAtSingle= ruleisAtSingle EOF )
            // InternalCondition.g:126:2: iv_ruleisAtSingle= ruleisAtSingle EOF
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
    // InternalCondition.g:132:1: ruleisAtSingle returns [EObject current=null] : ( ( (lv_name_0_0= 'isAtSingle' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle_res_6_0= ruleAngle_res ) ) otherlv_7= ')' ) ;
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
            // InternalCondition.g:138:2: ( ( ( (lv_name_0_0= 'isAtSingle' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle_res_6_0= ruleAngle_res ) ) otherlv_7= ')' ) )
            // InternalCondition.g:139:2: ( ( (lv_name_0_0= 'isAtSingle' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle_res_6_0= ruleAngle_res ) ) otherlv_7= ')' )
            {
            // InternalCondition.g:139:2: ( ( (lv_name_0_0= 'isAtSingle' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle_res_6_0= ruleAngle_res ) ) otherlv_7= ')' )
            // InternalCondition.g:140:3: ( (lv_name_0_0= 'isAtSingle' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle_res_6_0= ruleAngle_res ) ) otherlv_7= ')'
            {
            // InternalCondition.g:140:3: ( (lv_name_0_0= 'isAtSingle' ) )
            // InternalCondition.g:141:4: (lv_name_0_0= 'isAtSingle' )
            {
            // InternalCondition.g:141:4: (lv_name_0_0= 'isAtSingle' )
            // InternalCondition.g:142:5: lv_name_0_0= 'isAtSingle'
            {
            lv_name_0_0=(Token)match(input,14,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getIsAtSingleAccess().getNameIsAtSingleKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIsAtSingleRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "isAtSingle");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getIsAtSingleAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCondition.g:158:3: ( (lv_servo_2_0= ruleServo ) )
            // InternalCondition.g:159:4: (lv_servo_2_0= ruleServo )
            {
            // InternalCondition.g:159:4: (lv_servo_2_0= ruleServo )
            // InternalCondition.g:160:5: lv_servo_2_0= ruleServo
            {

            					newCompositeNode(grammarAccess.getIsAtSingleAccess().getServoServoParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_servo_2_0=ruleServo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtSingleRule());
            					}
            					add(
            						current,
            						"servo",
            						lv_servo_2_0,
            						"org.xtext.Solution.Servo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getIsAtSingleAccess().getCommaKeyword_3());
            		
            // InternalCondition.g:181:3: ( (lv_angle_4_0= ruleAngle ) )
            // InternalCondition.g:182:4: (lv_angle_4_0= ruleAngle )
            {
            // InternalCondition.g:182:4: (lv_angle_4_0= ruleAngle )
            // InternalCondition.g:183:5: lv_angle_4_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getIsAtSingleAccess().getAngleAngleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle_4_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtSingleRule());
            					}
            					add(
            						current,
            						"angle",
            						lv_angle_4_0,
            						"org.xtext.Solution.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getIsAtSingleAccess().getCommaKeyword_5());
            		
            // InternalCondition.g:204:3: ( (lv_angle_res_6_0= ruleAngle_res ) )
            // InternalCondition.g:205:4: (lv_angle_res_6_0= ruleAngle_res )
            {
            // InternalCondition.g:205:4: (lv_angle_res_6_0= ruleAngle_res )
            // InternalCondition.g:206:5: lv_angle_res_6_0= ruleAngle_res
            {

            					newCompositeNode(grammarAccess.getIsAtSingleAccess().getAngle_resAngle_resParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_5);
            lv_angle_res_6_0=ruleAngle_res();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtSingleRule());
            					}
            					add(
            						current,
            						"angle_res",
            						lv_angle_res_6_0,
            						"org.xtext.Solution.Angle_res");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

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
    // InternalCondition.g:231:1: entryRuleisAt returns [EObject current=null] : iv_ruleisAt= ruleisAt EOF ;
    public final EObject entryRuleisAt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleisAt = null;


        try {
            // InternalCondition.g:231:45: (iv_ruleisAt= ruleisAt EOF )
            // InternalCondition.g:232:2: iv_ruleisAt= ruleisAt EOF
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
    // InternalCondition.g:238:1: ruleisAt returns [EObject current=null] : ( ( (lv_name_0_0= 'isAt' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_angle_res_14_0= ruleAngle_res ) ) otherlv_15= ')' ) ;
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
            // InternalCondition.g:244:2: ( ( ( (lv_name_0_0= 'isAt' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_angle_res_14_0= ruleAngle_res ) ) otherlv_15= ')' ) )
            // InternalCondition.g:245:2: ( ( (lv_name_0_0= 'isAt' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_angle_res_14_0= ruleAngle_res ) ) otherlv_15= ')' )
            {
            // InternalCondition.g:245:2: ( ( (lv_name_0_0= 'isAt' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_angle_res_14_0= ruleAngle_res ) ) otherlv_15= ')' )
            // InternalCondition.g:246:3: ( (lv_name_0_0= 'isAt' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_angle_res_14_0= ruleAngle_res ) ) otherlv_15= ')'
            {
            // InternalCondition.g:246:3: ( (lv_name_0_0= 'isAt' ) )
            // InternalCondition.g:247:4: (lv_name_0_0= 'isAt' )
            {
            // InternalCondition.g:247:4: (lv_name_0_0= 'isAt' )
            // InternalCondition.g:248:5: lv_name_0_0= 'isAt'
            {
            lv_name_0_0=(Token)match(input,16,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getIsAtAccess().getNameIsAtKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIsAtRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "isAt");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getIsAtAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCondition.g:264:3: ( (lv_angle1_2_0= ruleAngle ) )
            // InternalCondition.g:265:4: (lv_angle1_2_0= ruleAngle )
            {
            // InternalCondition.g:265:4: (lv_angle1_2_0= ruleAngle )
            // InternalCondition.g:266:5: lv_angle1_2_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getIsAtAccess().getAngle1AngleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle1_2_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtRule());
            					}
            					add(
            						current,
            						"angle1",
            						lv_angle1_2_0,
            						"org.xtext.Solution.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getIsAtAccess().getCommaKeyword_3());
            		
            // InternalCondition.g:287:3: ( (lv_angle2_4_0= ruleAngle ) )
            // InternalCondition.g:288:4: (lv_angle2_4_0= ruleAngle )
            {
            // InternalCondition.g:288:4: (lv_angle2_4_0= ruleAngle )
            // InternalCondition.g:289:5: lv_angle2_4_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getIsAtAccess().getAngle2AngleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle2_4_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtRule());
            					}
            					add(
            						current,
            						"angle2",
            						lv_angle2_4_0,
            						"org.xtext.Solution.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getIsAtAccess().getCommaKeyword_5());
            		
            // InternalCondition.g:310:3: ( (lv_angle3_6_0= ruleAngle ) )
            // InternalCondition.g:311:4: (lv_angle3_6_0= ruleAngle )
            {
            // InternalCondition.g:311:4: (lv_angle3_6_0= ruleAngle )
            // InternalCondition.g:312:5: lv_angle3_6_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getIsAtAccess().getAngle3AngleParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle3_6_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtRule());
            					}
            					add(
            						current,
            						"angle3",
            						lv_angle3_6_0,
            						"org.xtext.Solution.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getIsAtAccess().getCommaKeyword_7());
            		
            // InternalCondition.g:333:3: ( (lv_angle4_8_0= ruleAngle ) )
            // InternalCondition.g:334:4: (lv_angle4_8_0= ruleAngle )
            {
            // InternalCondition.g:334:4: (lv_angle4_8_0= ruleAngle )
            // InternalCondition.g:335:5: lv_angle4_8_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getIsAtAccess().getAngle4AngleParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle4_8_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtRule());
            					}
            					add(
            						current,
            						"angle4",
            						lv_angle4_8_0,
            						"org.xtext.Solution.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getIsAtAccess().getCommaKeyword_9());
            		
            // InternalCondition.g:356:3: ( (lv_angle5_10_0= ruleAngle ) )
            // InternalCondition.g:357:4: (lv_angle5_10_0= ruleAngle )
            {
            // InternalCondition.g:357:4: (lv_angle5_10_0= ruleAngle )
            // InternalCondition.g:358:5: lv_angle5_10_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getIsAtAccess().getAngle5AngleParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle5_10_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtRule());
            					}
            					add(
            						current,
            						"angle5",
            						lv_angle5_10_0,
            						"org.xtext.Solution.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getIsAtAccess().getCommaKeyword_11());
            		
            // InternalCondition.g:379:3: ( (lv_angle6_12_0= ruleAngle ) )
            // InternalCondition.g:380:4: (lv_angle6_12_0= ruleAngle )
            {
            // InternalCondition.g:380:4: (lv_angle6_12_0= ruleAngle )
            // InternalCondition.g:381:5: lv_angle6_12_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getIsAtAccess().getAngle6AngleParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle6_12_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtRule());
            					}
            					add(
            						current,
            						"angle6",
            						lv_angle6_12_0,
            						"org.xtext.Solution.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_13, grammarAccess.getIsAtAccess().getCommaKeyword_13());
            		
            // InternalCondition.g:402:3: ( (lv_angle_res_14_0= ruleAngle_res ) )
            // InternalCondition.g:403:4: (lv_angle_res_14_0= ruleAngle_res )
            {
            // InternalCondition.g:403:4: (lv_angle_res_14_0= ruleAngle_res )
            // InternalCondition.g:404:5: lv_angle_res_14_0= ruleAngle_res
            {

            					newCompositeNode(grammarAccess.getIsAtAccess().getAngle_resAngle_resParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_5);
            lv_angle_res_14_0=ruleAngle_res();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtRule());
            					}
            					add(
            						current,
            						"angle_res",
            						lv_angle_res_14_0,
            						"org.xtext.Solution.Angle_res");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,13,FOLLOW_2); 

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
    // InternalCondition.g:429:1: entryRuleAngle_res returns [EObject current=null] : iv_ruleAngle_res= ruleAngle_res EOF ;
    public final EObject entryRuleAngle_res() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAngle_res = null;


        try {
            // InternalCondition.g:429:50: (iv_ruleAngle_res= ruleAngle_res EOF )
            // InternalCondition.g:430:2: iv_ruleAngle_res= ruleAngle_res EOF
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
    // InternalCondition.g:436:1: ruleAngle_res returns [EObject current=null] : ( (lv_angle_res_0_0= RULE_INT ) ) ;
    public final EObject ruleAngle_res() throws RecognitionException {
        EObject current = null;

        Token lv_angle_res_0_0=null;


        	enterRule();

        try {
            // InternalCondition.g:442:2: ( ( (lv_angle_res_0_0= RULE_INT ) ) )
            // InternalCondition.g:443:2: ( (lv_angle_res_0_0= RULE_INT ) )
            {
            // InternalCondition.g:443:2: ( (lv_angle_res_0_0= RULE_INT ) )
            // InternalCondition.g:444:3: (lv_angle_res_0_0= RULE_INT )
            {
            // InternalCondition.g:444:3: (lv_angle_res_0_0= RULE_INT )
            // InternalCondition.g:445:4: lv_angle_res_0_0= RULE_INT
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
    // InternalCondition.g:464:1: entryRuleAngle returns [EObject current=null] : iv_ruleAngle= ruleAngle EOF ;
    public final EObject entryRuleAngle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAngle = null;


        try {
            // InternalCondition.g:464:46: (iv_ruleAngle= ruleAngle EOF )
            // InternalCondition.g:465:2: iv_ruleAngle= ruleAngle EOF
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
    // InternalCondition.g:471:1: ruleAngle returns [EObject current=null] : ( (lv_angle_0_0= RULE_INT ) ) ;
    public final EObject ruleAngle() throws RecognitionException {
        EObject current = null;

        Token lv_angle_0_0=null;


        	enterRule();

        try {
            // InternalCondition.g:477:2: ( ( (lv_angle_0_0= RULE_INT ) ) )
            // InternalCondition.g:478:2: ( (lv_angle_0_0= RULE_INT ) )
            {
            // InternalCondition.g:478:2: ( (lv_angle_0_0= RULE_INT ) )
            // InternalCondition.g:479:3: (lv_angle_0_0= RULE_INT )
            {
            // InternalCondition.g:479:3: (lv_angle_0_0= RULE_INT )
            // InternalCondition.g:480:4: lv_angle_0_0= RULE_INT
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
    // InternalCondition.g:499:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalCondition.g:499:45: (iv_ruleTime= ruleTime EOF )
            // InternalCondition.g:500:2: iv_ruleTime= ruleTime EOF
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
    // InternalCondition.g:506:1: ruleTime returns [EObject current=null] : ( (lv_time_0_0= RULE_INT ) ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token lv_time_0_0=null;


        	enterRule();

        try {
            // InternalCondition.g:512:2: ( ( (lv_time_0_0= RULE_INT ) ) )
            // InternalCondition.g:513:2: ( (lv_time_0_0= RULE_INT ) )
            {
            // InternalCondition.g:513:2: ( (lv_time_0_0= RULE_INT ) )
            // InternalCondition.g:514:3: (lv_time_0_0= RULE_INT )
            {
            // InternalCondition.g:514:3: (lv_time_0_0= RULE_INT )
            // InternalCondition.g:515:4: lv_time_0_0= RULE_INT
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
    // InternalCondition.g:534:1: entryRuleServo returns [EObject current=null] : iv_ruleServo= ruleServo EOF ;
    public final EObject entryRuleServo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServo = null;


        try {
            // InternalCondition.g:534:46: (iv_ruleServo= ruleServo EOF )
            // InternalCondition.g:535:2: iv_ruleServo= ruleServo EOF
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
    // InternalCondition.g:541:1: ruleServo returns [EObject current=null] : ( (lv_servo_0_0= RULE_INT ) ) ;
    public final EObject ruleServo() throws RecognitionException {
        EObject current = null;

        Token lv_servo_0_0=null;


        	enterRule();

        try {
            // InternalCondition.g:547:2: ( ( (lv_servo_0_0= RULE_INT ) ) )
            // InternalCondition.g:548:2: ( (lv_servo_0_0= RULE_INT ) )
            {
            // InternalCondition.g:548:2: ( (lv_servo_0_0= RULE_INT ) )
            // InternalCondition.g:549:3: (lv_servo_0_0= RULE_INT )
            {
            // InternalCondition.g:549:3: (lv_servo_0_0= RULE_INT )
            // InternalCondition.g:550:4: lv_servo_0_0= RULE_INT
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});

}