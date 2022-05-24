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
import org.xtext.services.SolutionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSolutionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'isAtSingle'", "'('", "','", "')'", "'isAt'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=4;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalSolutionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSolutionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSolutionParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSolution.g"; }



     	private SolutionGrammarAccess grammarAccess;

        public InternalSolutionParser(TokenStream input, SolutionGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Solution";
       	}

       	@Override
       	protected SolutionGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSolution"
    // InternalSolution.g:65:1: entryRuleSolution returns [EObject current=null] : iv_ruleSolution= ruleSolution EOF ;
    public final EObject entryRuleSolution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolution = null;


        try {
            // InternalSolution.g:65:49: (iv_ruleSolution= ruleSolution EOF )
            // InternalSolution.g:66:2: iv_ruleSolution= ruleSolution EOF
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
    // InternalSolution.g:72:1: ruleSolution returns [EObject current=null] : (this_isAtSingle_0= ruleisAtSingle | this_isAt_1= ruleisAt ) ;
    public final EObject ruleSolution() throws RecognitionException {
        EObject current = null;

        EObject this_isAtSingle_0 = null;

        EObject this_isAt_1 = null;



        	enterRule();

        try {
            // InternalSolution.g:78:2: ( (this_isAtSingle_0= ruleisAtSingle | this_isAt_1= ruleisAt ) )
            // InternalSolution.g:79:2: (this_isAtSingle_0= ruleisAtSingle | this_isAt_1= ruleisAt )
            {
            // InternalSolution.g:79:2: (this_isAtSingle_0= ruleisAtSingle | this_isAt_1= ruleisAt )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSolution.g:80:3: this_isAtSingle_0= ruleisAtSingle
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
                    // InternalSolution.g:89:3: this_isAt_1= ruleisAt
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
    // InternalSolution.g:101:1: entryRuleisAtSingle returns [EObject current=null] : iv_ruleisAtSingle= ruleisAtSingle EOF ;
    public final EObject entryRuleisAtSingle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleisAtSingle = null;


        try {
            // InternalSolution.g:101:51: (iv_ruleisAtSingle= ruleisAtSingle EOF )
            // InternalSolution.g:102:2: iv_ruleisAtSingle= ruleisAtSingle EOF
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
    // InternalSolution.g:108:1: ruleisAtSingle returns [EObject current=null] : ( ( (lv_name_0_0= 'isAtSingle' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle_res_6_0= ruleAngle_res ) ) otherlv_7= ')' ) ;
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
            // InternalSolution.g:114:2: ( ( ( (lv_name_0_0= 'isAtSingle' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle_res_6_0= ruleAngle_res ) ) otherlv_7= ')' ) )
            // InternalSolution.g:115:2: ( ( (lv_name_0_0= 'isAtSingle' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle_res_6_0= ruleAngle_res ) ) otherlv_7= ')' )
            {
            // InternalSolution.g:115:2: ( ( (lv_name_0_0= 'isAtSingle' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle_res_6_0= ruleAngle_res ) ) otherlv_7= ')' )
            // InternalSolution.g:116:3: ( (lv_name_0_0= 'isAtSingle' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle_res_6_0= ruleAngle_res ) ) otherlv_7= ')'
            {
            // InternalSolution.g:116:3: ( (lv_name_0_0= 'isAtSingle' ) )
            // InternalSolution.g:117:4: (lv_name_0_0= 'isAtSingle' )
            {
            // InternalSolution.g:117:4: (lv_name_0_0= 'isAtSingle' )
            // InternalSolution.g:118:5: lv_name_0_0= 'isAtSingle'
            {
            lv_name_0_0=(Token)match(input,11,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getIsAtSingleAccess().getNameIsAtSingleKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIsAtSingleRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "isAtSingle");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getIsAtSingleAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSolution.g:134:3: ( (lv_servo_2_0= ruleServo ) )
            // InternalSolution.g:135:4: (lv_servo_2_0= ruleServo )
            {
            // InternalSolution.g:135:4: (lv_servo_2_0= ruleServo )
            // InternalSolution.g:136:5: lv_servo_2_0= ruleServo
            {

            					newCompositeNode(grammarAccess.getIsAtSingleAccess().getServoServoParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_3=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getIsAtSingleAccess().getCommaKeyword_3());
            		
            // InternalSolution.g:157:3: ( (lv_angle_4_0= ruleAngle ) )
            // InternalSolution.g:158:4: (lv_angle_4_0= ruleAngle )
            {
            // InternalSolution.g:158:4: (lv_angle_4_0= ruleAngle )
            // InternalSolution.g:159:5: lv_angle_4_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getIsAtSingleAccess().getAngleAngleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_5=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getIsAtSingleAccess().getCommaKeyword_5());
            		
            // InternalSolution.g:180:3: ( (lv_angle_res_6_0= ruleAngle_res ) )
            // InternalSolution.g:181:4: (lv_angle_res_6_0= ruleAngle_res )
            {
            // InternalSolution.g:181:4: (lv_angle_res_6_0= ruleAngle_res )
            // InternalSolution.g:182:5: lv_angle_res_6_0= ruleAngle_res
            {

            					newCompositeNode(grammarAccess.getIsAtSingleAccess().getAngle_resAngle_resParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

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
    // InternalSolution.g:207:1: entryRuleisAt returns [EObject current=null] : iv_ruleisAt= ruleisAt EOF ;
    public final EObject entryRuleisAt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleisAt = null;


        try {
            // InternalSolution.g:207:45: (iv_ruleisAt= ruleisAt EOF )
            // InternalSolution.g:208:2: iv_ruleisAt= ruleisAt EOF
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
    // InternalSolution.g:214:1: ruleisAt returns [EObject current=null] : ( ( (lv_name_0_0= 'isAt' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_angle_res_14_0= ruleAngle_res ) ) otherlv_15= ')' ) ;
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
            // InternalSolution.g:220:2: ( ( ( (lv_name_0_0= 'isAt' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_angle_res_14_0= ruleAngle_res ) ) otherlv_15= ')' ) )
            // InternalSolution.g:221:2: ( ( (lv_name_0_0= 'isAt' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_angle_res_14_0= ruleAngle_res ) ) otherlv_15= ')' )
            {
            // InternalSolution.g:221:2: ( ( (lv_name_0_0= 'isAt' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_angle_res_14_0= ruleAngle_res ) ) otherlv_15= ')' )
            // InternalSolution.g:222:3: ( (lv_name_0_0= 'isAt' ) ) otherlv_1= '(' ( (lv_angle1_2_0= ruleAngle ) ) otherlv_3= ',' ( (lv_angle2_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle3_6_0= ruleAngle ) ) otherlv_7= ',' ( (lv_angle4_8_0= ruleAngle ) ) otherlv_9= ',' ( (lv_angle5_10_0= ruleAngle ) ) otherlv_11= ',' ( (lv_angle6_12_0= ruleAngle ) ) otherlv_13= ',' ( (lv_angle_res_14_0= ruleAngle_res ) ) otherlv_15= ')'
            {
            // InternalSolution.g:222:3: ( (lv_name_0_0= 'isAt' ) )
            // InternalSolution.g:223:4: (lv_name_0_0= 'isAt' )
            {
            // InternalSolution.g:223:4: (lv_name_0_0= 'isAt' )
            // InternalSolution.g:224:5: lv_name_0_0= 'isAt'
            {
            lv_name_0_0=(Token)match(input,15,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getIsAtAccess().getNameIsAtKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIsAtRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "isAt");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getIsAtAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSolution.g:240:3: ( (lv_angle1_2_0= ruleAngle ) )
            // InternalSolution.g:241:4: (lv_angle1_2_0= ruleAngle )
            {
            // InternalSolution.g:241:4: (lv_angle1_2_0= ruleAngle )
            // InternalSolution.g:242:5: lv_angle1_2_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getIsAtAccess().getAngle1AngleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_3=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getIsAtAccess().getCommaKeyword_3());
            		
            // InternalSolution.g:263:3: ( (lv_angle2_4_0= ruleAngle ) )
            // InternalSolution.g:264:4: (lv_angle2_4_0= ruleAngle )
            {
            // InternalSolution.g:264:4: (lv_angle2_4_0= ruleAngle )
            // InternalSolution.g:265:5: lv_angle2_4_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getIsAtAccess().getAngle2AngleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_5=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getIsAtAccess().getCommaKeyword_5());
            		
            // InternalSolution.g:286:3: ( (lv_angle3_6_0= ruleAngle ) )
            // InternalSolution.g:287:4: (lv_angle3_6_0= ruleAngle )
            {
            // InternalSolution.g:287:4: (lv_angle3_6_0= ruleAngle )
            // InternalSolution.g:288:5: lv_angle3_6_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getIsAtAccess().getAngle3AngleParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_7=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getIsAtAccess().getCommaKeyword_7());
            		
            // InternalSolution.g:309:3: ( (lv_angle4_8_0= ruleAngle ) )
            // InternalSolution.g:310:4: (lv_angle4_8_0= ruleAngle )
            {
            // InternalSolution.g:310:4: (lv_angle4_8_0= ruleAngle )
            // InternalSolution.g:311:5: lv_angle4_8_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getIsAtAccess().getAngle4AngleParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_9=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getIsAtAccess().getCommaKeyword_9());
            		
            // InternalSolution.g:332:3: ( (lv_angle5_10_0= ruleAngle ) )
            // InternalSolution.g:333:4: (lv_angle5_10_0= ruleAngle )
            {
            // InternalSolution.g:333:4: (lv_angle5_10_0= ruleAngle )
            // InternalSolution.g:334:5: lv_angle5_10_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getIsAtAccess().getAngle5AngleParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_11=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getIsAtAccess().getCommaKeyword_11());
            		
            // InternalSolution.g:355:3: ( (lv_angle6_12_0= ruleAngle ) )
            // InternalSolution.g:356:4: (lv_angle6_12_0= ruleAngle )
            {
            // InternalSolution.g:356:4: (lv_angle6_12_0= ruleAngle )
            // InternalSolution.g:357:5: lv_angle6_12_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getIsAtAccess().getAngle6AngleParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_13=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_13, grammarAccess.getIsAtAccess().getCommaKeyword_13());
            		
            // InternalSolution.g:378:3: ( (lv_angle_res_14_0= ruleAngle_res ) )
            // InternalSolution.g:379:4: (lv_angle_res_14_0= ruleAngle_res )
            {
            // InternalSolution.g:379:4: (lv_angle_res_14_0= ruleAngle_res )
            // InternalSolution.g:380:5: lv_angle_res_14_0= ruleAngle_res
            {

            					newCompositeNode(grammarAccess.getIsAtAccess().getAngle_resAngle_resParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_15=(Token)match(input,14,FOLLOW_2); 

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
    // InternalSolution.g:405:1: entryRuleAngle_res returns [EObject current=null] : iv_ruleAngle_res= ruleAngle_res EOF ;
    public final EObject entryRuleAngle_res() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAngle_res = null;


        try {
            // InternalSolution.g:405:50: (iv_ruleAngle_res= ruleAngle_res EOF )
            // InternalSolution.g:406:2: iv_ruleAngle_res= ruleAngle_res EOF
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
    // InternalSolution.g:412:1: ruleAngle_res returns [EObject current=null] : ( (lv_angle_res_0_0= RULE_INT ) ) ;
    public final EObject ruleAngle_res() throws RecognitionException {
        EObject current = null;

        Token lv_angle_res_0_0=null;


        	enterRule();

        try {
            // InternalSolution.g:418:2: ( ( (lv_angle_res_0_0= RULE_INT ) ) )
            // InternalSolution.g:419:2: ( (lv_angle_res_0_0= RULE_INT ) )
            {
            // InternalSolution.g:419:2: ( (lv_angle_res_0_0= RULE_INT ) )
            // InternalSolution.g:420:3: (lv_angle_res_0_0= RULE_INT )
            {
            // InternalSolution.g:420:3: (lv_angle_res_0_0= RULE_INT )
            // InternalSolution.g:421:4: lv_angle_res_0_0= RULE_INT
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
    // InternalSolution.g:440:1: entryRuleAngle returns [EObject current=null] : iv_ruleAngle= ruleAngle EOF ;
    public final EObject entryRuleAngle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAngle = null;


        try {
            // InternalSolution.g:440:46: (iv_ruleAngle= ruleAngle EOF )
            // InternalSolution.g:441:2: iv_ruleAngle= ruleAngle EOF
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
    // InternalSolution.g:447:1: ruleAngle returns [EObject current=null] : ( (lv_angle_0_0= RULE_INT ) ) ;
    public final EObject ruleAngle() throws RecognitionException {
        EObject current = null;

        Token lv_angle_0_0=null;


        	enterRule();

        try {
            // InternalSolution.g:453:2: ( ( (lv_angle_0_0= RULE_INT ) ) )
            // InternalSolution.g:454:2: ( (lv_angle_0_0= RULE_INT ) )
            {
            // InternalSolution.g:454:2: ( (lv_angle_0_0= RULE_INT ) )
            // InternalSolution.g:455:3: (lv_angle_0_0= RULE_INT )
            {
            // InternalSolution.g:455:3: (lv_angle_0_0= RULE_INT )
            // InternalSolution.g:456:4: lv_angle_0_0= RULE_INT
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


    // $ANTLR start "entryRuleServo"
    // InternalSolution.g:475:1: entryRuleServo returns [EObject current=null] : iv_ruleServo= ruleServo EOF ;
    public final EObject entryRuleServo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServo = null;


        try {
            // InternalSolution.g:475:46: (iv_ruleServo= ruleServo EOF )
            // InternalSolution.g:476:2: iv_ruleServo= ruleServo EOF
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
    // InternalSolution.g:482:1: ruleServo returns [EObject current=null] : ( (lv_servo_0_0= RULE_INT ) ) ;
    public final EObject ruleServo() throws RecognitionException {
        EObject current = null;

        Token lv_servo_0_0=null;


        	enterRule();

        try {
            // InternalSolution.g:488:2: ( ( (lv_servo_0_0= RULE_INT ) ) )
            // InternalSolution.g:489:2: ( (lv_servo_0_0= RULE_INT ) )
            {
            // InternalSolution.g:489:2: ( (lv_servo_0_0= RULE_INT ) )
            // InternalSolution.g:490:3: (lv_servo_0_0= RULE_INT )
            {
            // InternalSolution.g:490:3: (lv_servo_0_0= RULE_INT )
            // InternalSolution.g:491:4: lv_servo_0_0= RULE_INT
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});

}