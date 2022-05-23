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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'posInicial'", "'('", "')'", "'rotateServo'", "','", "'rotateAllServos'", "'result'", "'NotLaterThan'", "'isAtSingle'", "'isAt'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

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
        	return "Operaciones";
       	}

       	@Override
       	protected OperationsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleOperaciones"
    // InternalOperations.g:64:1: entryRuleOperaciones returns [EObject current=null] : iv_ruleOperaciones= ruleOperaciones EOF ;
    public final EObject entryRuleOperaciones() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperaciones = null;


        try {
            // InternalOperations.g:64:52: (iv_ruleOperaciones= ruleOperaciones EOF )
            // InternalOperations.g:65:2: iv_ruleOperaciones= ruleOperaciones EOF
            {
             newCompositeNode(grammarAccess.getOperacionesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperaciones=ruleOperaciones();

            state._fsp--;

             current =iv_ruleOperaciones; 
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
    // $ANTLR end "entryRuleOperaciones"


    // $ANTLR start "ruleOperaciones"
    // InternalOperations.g:71:1: ruleOperaciones returns [EObject current=null] : (this_Initial_0= ruleInitial | this_Command_1= ruleCommand | this_Result_2= ruleResult | this_Solution_3= ruleSolution | this_Conditions_4= ruleConditions ) ;
    public final EObject ruleOperaciones() throws RecognitionException {
        EObject current = null;

        EObject this_Initial_0 = null;

        EObject this_Command_1 = null;

        EObject this_Result_2 = null;

        EObject this_Solution_3 = null;

        EObject this_Conditions_4 = null;



        	enterRule();

        try {
            // InternalOperations.g:77:2: ( (this_Initial_0= ruleInitial | this_Command_1= ruleCommand | this_Result_2= ruleResult | this_Solution_3= ruleSolution | this_Conditions_4= ruleConditions ) )
            // InternalOperations.g:78:2: (this_Initial_0= ruleInitial | this_Command_1= ruleCommand | this_Result_2= ruleResult | this_Solution_3= ruleSolution | this_Conditions_4= ruleConditions )
            {
            // InternalOperations.g:78:2: (this_Initial_0= ruleInitial | this_Command_1= ruleCommand | this_Result_2= ruleResult | this_Solution_3= ruleSolution | this_Conditions_4= ruleConditions )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 14:
            case 16:
                {
                alt1=2;
                }
                break;
            case 17:
                {
                alt1=3;
                }
                break;
            case 19:
            case 20:
                {
                alt1=4;
                }
                break;
            case 18:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalOperations.g:79:3: this_Initial_0= ruleInitial
                    {

                    			newCompositeNode(grammarAccess.getOperacionesAccess().getInitialParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Initial_0=ruleInitial();

                    state._fsp--;


                    			current = this_Initial_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOperations.g:88:3: this_Command_1= ruleCommand
                    {

                    			newCompositeNode(grammarAccess.getOperacionesAccess().getCommandParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Command_1=ruleCommand();

                    state._fsp--;


                    			current = this_Command_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOperations.g:97:3: this_Result_2= ruleResult
                    {

                    			newCompositeNode(grammarAccess.getOperacionesAccess().getResultParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Result_2=ruleResult();

                    state._fsp--;


                    			current = this_Result_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOperations.g:106:3: this_Solution_3= ruleSolution
                    {

                    			newCompositeNode(grammarAccess.getOperacionesAccess().getSolutionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Solution_3=ruleSolution();

                    state._fsp--;


                    			current = this_Solution_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalOperations.g:115:3: this_Conditions_4= ruleConditions
                    {

                    			newCompositeNode(grammarAccess.getOperacionesAccess().getConditionsParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Conditions_4=ruleConditions();

                    state._fsp--;


                    			current = this_Conditions_4;
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
    // $ANTLR end "ruleOperaciones"


    // $ANTLR start "entryRuleInitial"
    // InternalOperations.g:127:1: entryRuleInitial returns [EObject current=null] : iv_ruleInitial= ruleInitial EOF ;
    public final EObject entryRuleInitial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitial = null;


        try {
            // InternalOperations.g:127:48: (iv_ruleInitial= ruleInitial EOF )
            // InternalOperations.g:128:2: iv_ruleInitial= ruleInitial EOF
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
    // InternalOperations.g:134:1: ruleInitial returns [EObject current=null] : ( ( (lv_name_0_0= 'posInicial' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' ) ;
    public final EObject ruleInitial() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_time_2_0 = null;



        	enterRule();

        try {
            // InternalOperations.g:140:2: ( ( ( (lv_name_0_0= 'posInicial' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' ) )
            // InternalOperations.g:141:2: ( ( (lv_name_0_0= 'posInicial' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' )
            {
            // InternalOperations.g:141:2: ( ( (lv_name_0_0= 'posInicial' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' )
            // InternalOperations.g:142:3: ( (lv_name_0_0= 'posInicial' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')'
            {
            // InternalOperations.g:142:3: ( (lv_name_0_0= 'posInicial' ) )
            // InternalOperations.g:143:4: (lv_name_0_0= 'posInicial' )
            {
            // InternalOperations.g:143:4: (lv_name_0_0= 'posInicial' )
            // InternalOperations.g:144:5: lv_name_0_0= 'posInicial'
            {
            lv_name_0_0=(Token)match(input,11,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getInitialAccess().getNamePosInicialKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "posInicial");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getInitialAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOperations.g:160:3: ( (lv_time_2_0= ruleTime ) )
            // InternalOperations.g:161:4: (lv_time_2_0= ruleTime )
            {
            // InternalOperations.g:161:4: (lv_time_2_0= ruleTime )
            // InternalOperations.g:162:5: lv_time_2_0= ruleTime
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


    // $ANTLR start "entryRuleCommand"
    // InternalOperations.g:187:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalOperations.g:187:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalOperations.g:188:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalOperations.g:194:1: ruleCommand returns [EObject current=null] : (this_rotateServo_0= rulerotateServo | this_rotateAllServos_1= rulerotateAllServos ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_rotateServo_0 = null;

        EObject this_rotateAllServos_1 = null;



        	enterRule();

        try {
            // InternalOperations.g:200:2: ( (this_rotateServo_0= rulerotateServo | this_rotateAllServos_1= rulerotateAllServos ) )
            // InternalOperations.g:201:2: (this_rotateServo_0= rulerotateServo | this_rotateAllServos_1= rulerotateAllServos )
            {
            // InternalOperations.g:201:2: (this_rotateServo_0= rulerotateServo | this_rotateAllServos_1= rulerotateAllServos )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalOperations.g:202:3: this_rotateServo_0= rulerotateServo
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
                    // InternalOperations.g:211:3: this_rotateAllServos_1= rulerotateAllServos
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
    // InternalOperations.g:223:1: entryRulerotateServo returns [EObject current=null] : iv_rulerotateServo= rulerotateServo EOF ;
    public final EObject entryRulerotateServo() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerotateServo = null;


        try {
            // InternalOperations.g:223:52: (iv_rulerotateServo= rulerotateServo EOF )
            // InternalOperations.g:224:2: iv_rulerotateServo= rulerotateServo EOF
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
    // InternalOperations.g:230:1: rulerotateServo returns [EObject current=null] : ( ( (lv_name_0_0= 'rotateServo' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_time_6_0= ruleTime ) ) otherlv_7= ')' ) ;
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
            // InternalOperations.g:236:2: ( ( ( (lv_name_0_0= 'rotateServo' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_time_6_0= ruleTime ) ) otherlv_7= ')' ) )
            // InternalOperations.g:237:2: ( ( (lv_name_0_0= 'rotateServo' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_time_6_0= ruleTime ) ) otherlv_7= ')' )
            {
            // InternalOperations.g:237:2: ( ( (lv_name_0_0= 'rotateServo' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_time_6_0= ruleTime ) ) otherlv_7= ')' )
            // InternalOperations.g:238:3: ( (lv_name_0_0= 'rotateServo' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_time_6_0= ruleTime ) ) otherlv_7= ')'
            {
            // InternalOperations.g:238:3: ( (lv_name_0_0= 'rotateServo' ) )
            // InternalOperations.g:239:4: (lv_name_0_0= 'rotateServo' )
            {
            // InternalOperations.g:239:4: (lv_name_0_0= 'rotateServo' )
            // InternalOperations.g:240:5: lv_name_0_0= 'rotateServo'
            {
            lv_name_0_0=(Token)match(input,14,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRotateServoAccess().getNameRotateServoKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotateServoRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "rotateServo");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRotateServoAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOperations.g:256:3: ( (lv_servo_2_0= ruleServo ) )
            // InternalOperations.g:257:4: (lv_servo_2_0= ruleServo )
            {
            // InternalOperations.g:257:4: (lv_servo_2_0= ruleServo )
            // InternalOperations.g:258:5: lv_servo_2_0= ruleServo
            {

            					newCompositeNode(grammarAccess.getRotateServoAccess().getServoServoParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_servo_2_0=ruleServo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateServoRule());
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

            			newLeafNode(otherlv_3, grammarAccess.getRotateServoAccess().getCommaKeyword_3());
            		
            // InternalOperations.g:279:3: ( (lv_angle_4_0= ruleAngle ) )
            // InternalOperations.g:280:4: (lv_angle_4_0= ruleAngle )
            {
            // InternalOperations.g:280:4: (lv_angle_4_0= ruleAngle )
            // InternalOperations.g:281:5: lv_angle_4_0= ruleAngle
            {

            					newCompositeNode(grammarAccess.getRotateServoAccess().getAngleAngleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_angle_4_0=ruleAngle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateServoRule());
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

            			newLeafNode(otherlv_5, grammarAccess.getRotateServoAccess().getCommaKeyword_5());
            		
            // InternalOperations.g:302:3: ( (lv_time_6_0= ruleTime ) )
            // InternalOperations.g:303:4: (lv_time_6_0= ruleTime )
            {
            // InternalOperations.g:303:4: (lv_time_6_0= ruleTime )
            // InternalOperations.g:304:5: lv_time_6_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getRotateServoAccess().getTimeTimeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_5);
            lv_time_6_0=ruleTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateServoRule());
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
    // InternalOperations.g:329:1: entryRulerotateAllServos returns [EObject current=null] : iv_rulerotateAllServos= rulerotateAllServos EOF ;
    public final EObject entryRulerotateAllServos() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerotateAllServos = null;


        try {
            // InternalOperations.g:329:56: (iv_rulerotateAllServos= rulerotateAllServos EOF )
            // InternalOperations.g:330:2: iv_rulerotateAllServos= rulerotateAllServos EOF
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
    // InternalOperations.g:336:1: rulerotateAllServos returns [EObject current=null] : ( ( (lv_name_0_0= 'rotateAllServos' ) ) otherlv_1= '(' ( (lv_angle_2_0= ruleAngle ) )+ otherlv_3= ',' ( (lv_time_4_0= ruleTime ) ) otherlv_5= ')' ) ;
    public final EObject rulerotateAllServos() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_angle_2_0 = null;

        EObject lv_time_4_0 = null;



        	enterRule();

        try {
            // InternalOperations.g:342:2: ( ( ( (lv_name_0_0= 'rotateAllServos' ) ) otherlv_1= '(' ( (lv_angle_2_0= ruleAngle ) )+ otherlv_3= ',' ( (lv_time_4_0= ruleTime ) ) otherlv_5= ')' ) )
            // InternalOperations.g:343:2: ( ( (lv_name_0_0= 'rotateAllServos' ) ) otherlv_1= '(' ( (lv_angle_2_0= ruleAngle ) )+ otherlv_3= ',' ( (lv_time_4_0= ruleTime ) ) otherlv_5= ')' )
            {
            // InternalOperations.g:343:2: ( ( (lv_name_0_0= 'rotateAllServos' ) ) otherlv_1= '(' ( (lv_angle_2_0= ruleAngle ) )+ otherlv_3= ',' ( (lv_time_4_0= ruleTime ) ) otherlv_5= ')' )
            // InternalOperations.g:344:3: ( (lv_name_0_0= 'rotateAllServos' ) ) otherlv_1= '(' ( (lv_angle_2_0= ruleAngle ) )+ otherlv_3= ',' ( (lv_time_4_0= ruleTime ) ) otherlv_5= ')'
            {
            // InternalOperations.g:344:3: ( (lv_name_0_0= 'rotateAllServos' ) )
            // InternalOperations.g:345:4: (lv_name_0_0= 'rotateAllServos' )
            {
            // InternalOperations.g:345:4: (lv_name_0_0= 'rotateAllServos' )
            // InternalOperations.g:346:5: lv_name_0_0= 'rotateAllServos'
            {
            lv_name_0_0=(Token)match(input,16,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRotateAllServosAccess().getNameRotateAllServosKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotateAllServosRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "rotateAllServos");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRotateAllServosAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOperations.g:362:3: ( (lv_angle_2_0= ruleAngle ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_INT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalOperations.g:363:4: (lv_angle_2_0= ruleAngle )
            	    {
            	    // InternalOperations.g:363:4: (lv_angle_2_0= ruleAngle )
            	    // InternalOperations.g:364:5: lv_angle_2_0= ruleAngle
            	    {

            	    					newCompositeNode(grammarAccess.getRotateAllServosAccess().getAngleAngleParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_angle_2_0=ruleAngle();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRotateAllServosRule());
            	    					}
            	    					add(
            	    						current,
            	    						"angle",
            	    						lv_angle_2_0,
            	    						"org.xtext.Operations.Angle");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getRotateAllServosAccess().getCommaKeyword_3());
            		
            // InternalOperations.g:385:3: ( (lv_time_4_0= ruleTime ) )
            // InternalOperations.g:386:4: (lv_time_4_0= ruleTime )
            {
            // InternalOperations.g:386:4: (lv_time_4_0= ruleTime )
            // InternalOperations.g:387:5: lv_time_4_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getRotateAllServosAccess().getTimeTimeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_5);
            lv_time_4_0=ruleTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateAllServosRule());
            					}
            					add(
            						current,
            						"time",
            						lv_time_4_0,
            						"org.xtext.Operations.Time");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRotateAllServosAccess().getRightParenthesisKeyword_5());
            		

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
    // InternalOperations.g:412:1: entryRuleResult returns [EObject current=null] : iv_ruleResult= ruleResult EOF ;
    public final EObject entryRuleResult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResult = null;


        try {
            // InternalOperations.g:412:47: (iv_ruleResult= ruleResult EOF )
            // InternalOperations.g:413:2: iv_ruleResult= ruleResult EOF
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
    // InternalOperations.g:419:1: ruleResult returns [EObject current=null] : ( ( (lv_name_0_0= 'result' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' ) ;
    public final EObject ruleResult() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_time_2_0 = null;



        	enterRule();

        try {
            // InternalOperations.g:425:2: ( ( ( (lv_name_0_0= 'result' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' ) )
            // InternalOperations.g:426:2: ( ( (lv_name_0_0= 'result' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' )
            {
            // InternalOperations.g:426:2: ( ( (lv_name_0_0= 'result' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' )
            // InternalOperations.g:427:3: ( (lv_name_0_0= 'result' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')'
            {
            // InternalOperations.g:427:3: ( (lv_name_0_0= 'result' ) )
            // InternalOperations.g:428:4: (lv_name_0_0= 'result' )
            {
            // InternalOperations.g:428:4: (lv_name_0_0= 'result' )
            // InternalOperations.g:429:5: lv_name_0_0= 'result'
            {
            lv_name_0_0=(Token)match(input,17,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getResultAccess().getNameResultKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResultRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "result");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getResultAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOperations.g:445:3: ( (lv_time_2_0= ruleTime ) )
            // InternalOperations.g:446:4: (lv_time_2_0= ruleTime )
            {
            // InternalOperations.g:446:4: (lv_time_2_0= ruleTime )
            // InternalOperations.g:447:5: lv_time_2_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getResultAccess().getTimeTimeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_time_2_0=ruleTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResultRule());
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


    // $ANTLR start "entryRuleSolution"
    // InternalOperations.g:472:1: entryRuleSolution returns [EObject current=null] : iv_ruleSolution= ruleSolution EOF ;
    public final EObject entryRuleSolution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolution = null;


        try {
            // InternalOperations.g:472:49: (iv_ruleSolution= ruleSolution EOF )
            // InternalOperations.g:473:2: iv_ruleSolution= ruleSolution EOF
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
    // InternalOperations.g:479:1: ruleSolution returns [EObject current=null] : (this_isAtSingle_0= ruleisAtSingle | this_isAt_1= ruleisAt ) ;
    public final EObject ruleSolution() throws RecognitionException {
        EObject current = null;

        EObject this_isAtSingle_0 = null;

        EObject this_isAt_1 = null;



        	enterRule();

        try {
            // InternalOperations.g:485:2: ( (this_isAtSingle_0= ruleisAtSingle | this_isAt_1= ruleisAt ) )
            // InternalOperations.g:486:2: (this_isAtSingle_0= ruleisAtSingle | this_isAt_1= ruleisAt )
            {
            // InternalOperations.g:486:2: (this_isAtSingle_0= ruleisAtSingle | this_isAt_1= ruleisAt )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalOperations.g:487:3: this_isAtSingle_0= ruleisAtSingle
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
                    // InternalOperations.g:496:3: this_isAt_1= ruleisAt
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


    // $ANTLR start "entryRuleConditions"
    // InternalOperations.g:508:1: entryRuleConditions returns [EObject current=null] : iv_ruleConditions= ruleConditions EOF ;
    public final EObject entryRuleConditions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditions = null;


        try {
            // InternalOperations.g:508:51: (iv_ruleConditions= ruleConditions EOF )
            // InternalOperations.g:509:2: iv_ruleConditions= ruleConditions EOF
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
    // InternalOperations.g:515:1: ruleConditions returns [EObject current=null] : ( ( (lv_name_0_0= 'NotLaterThan' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' ) ;
    public final EObject ruleConditions() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_time_2_0 = null;



        	enterRule();

        try {
            // InternalOperations.g:521:2: ( ( ( (lv_name_0_0= 'NotLaterThan' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' ) )
            // InternalOperations.g:522:2: ( ( (lv_name_0_0= 'NotLaterThan' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' )
            {
            // InternalOperations.g:522:2: ( ( (lv_name_0_0= 'NotLaterThan' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')' )
            // InternalOperations.g:523:3: ( (lv_name_0_0= 'NotLaterThan' ) ) otherlv_1= '(' ( (lv_time_2_0= ruleTime ) ) otherlv_3= ')'
            {
            // InternalOperations.g:523:3: ( (lv_name_0_0= 'NotLaterThan' ) )
            // InternalOperations.g:524:4: (lv_name_0_0= 'NotLaterThan' )
            {
            // InternalOperations.g:524:4: (lv_name_0_0= 'NotLaterThan' )
            // InternalOperations.g:525:5: lv_name_0_0= 'NotLaterThan'
            {
            lv_name_0_0=(Token)match(input,18,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getConditionsAccess().getNameNotLaterThanKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionsRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "NotLaterThan");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionsAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOperations.g:541:3: ( (lv_time_2_0= ruleTime ) )
            // InternalOperations.g:542:4: (lv_time_2_0= ruleTime )
            {
            // InternalOperations.g:542:4: (lv_time_2_0= ruleTime )
            // InternalOperations.g:543:5: lv_time_2_0= ruleTime
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
            						"org.xtext.Operations.Time");
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
    // InternalOperations.g:568:1: entryRuleisAtSingle returns [EObject current=null] : iv_ruleisAtSingle= ruleisAtSingle EOF ;
    public final EObject entryRuleisAtSingle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleisAtSingle = null;


        try {
            // InternalOperations.g:568:51: (iv_ruleisAtSingle= ruleisAtSingle EOF )
            // InternalOperations.g:569:2: iv_ruleisAtSingle= ruleisAtSingle EOF
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
    // InternalOperations.g:575:1: ruleisAtSingle returns [EObject current=null] : ( ( (lv_name_0_0= 'isAtSingle' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle_res_6_0= ruleAngle_res ) ) otherlv_7= ')' ) ;
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
            // InternalOperations.g:581:2: ( ( ( (lv_name_0_0= 'isAtSingle' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle_res_6_0= ruleAngle_res ) ) otherlv_7= ')' ) )
            // InternalOperations.g:582:2: ( ( (lv_name_0_0= 'isAtSingle' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle_res_6_0= ruleAngle_res ) ) otherlv_7= ')' )
            {
            // InternalOperations.g:582:2: ( ( (lv_name_0_0= 'isAtSingle' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle_res_6_0= ruleAngle_res ) ) otherlv_7= ')' )
            // InternalOperations.g:583:3: ( (lv_name_0_0= 'isAtSingle' ) ) otherlv_1= '(' ( (lv_servo_2_0= ruleServo ) ) otherlv_3= ',' ( (lv_angle_4_0= ruleAngle ) ) otherlv_5= ',' ( (lv_angle_res_6_0= ruleAngle_res ) ) otherlv_7= ')'
            {
            // InternalOperations.g:583:3: ( (lv_name_0_0= 'isAtSingle' ) )
            // InternalOperations.g:584:4: (lv_name_0_0= 'isAtSingle' )
            {
            // InternalOperations.g:584:4: (lv_name_0_0= 'isAtSingle' )
            // InternalOperations.g:585:5: lv_name_0_0= 'isAtSingle'
            {
            lv_name_0_0=(Token)match(input,19,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getIsAtSingleAccess().getNameIsAtSingleKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIsAtSingleRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "isAtSingle");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getIsAtSingleAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOperations.g:601:3: ( (lv_servo_2_0= ruleServo ) )
            // InternalOperations.g:602:4: (lv_servo_2_0= ruleServo )
            {
            // InternalOperations.g:602:4: (lv_servo_2_0= ruleServo )
            // InternalOperations.g:603:5: lv_servo_2_0= ruleServo
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
            						"org.xtext.Operations.Servo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getIsAtSingleAccess().getCommaKeyword_3());
            		
            // InternalOperations.g:624:3: ( (lv_angle_4_0= ruleAngle ) )
            // InternalOperations.g:625:4: (lv_angle_4_0= ruleAngle )
            {
            // InternalOperations.g:625:4: (lv_angle_4_0= ruleAngle )
            // InternalOperations.g:626:5: lv_angle_4_0= ruleAngle
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
            						"org.xtext.Operations.Angle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getIsAtSingleAccess().getCommaKeyword_5());
            		
            // InternalOperations.g:647:3: ( (lv_angle_res_6_0= ruleAngle_res ) )
            // InternalOperations.g:648:4: (lv_angle_res_6_0= ruleAngle_res )
            {
            // InternalOperations.g:648:4: (lv_angle_res_6_0= ruleAngle_res )
            // InternalOperations.g:649:5: lv_angle_res_6_0= ruleAngle_res
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
            						"org.xtext.Operations.Angle_res");
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
    // InternalOperations.g:674:1: entryRuleisAt returns [EObject current=null] : iv_ruleisAt= ruleisAt EOF ;
    public final EObject entryRuleisAt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleisAt = null;


        try {
            // InternalOperations.g:674:45: (iv_ruleisAt= ruleisAt EOF )
            // InternalOperations.g:675:2: iv_ruleisAt= ruleisAt EOF
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
    // InternalOperations.g:681:1: ruleisAt returns [EObject current=null] : ( ( (lv_name_0_0= 'isAt' ) ) otherlv_1= '(' ( (lv_angle_2_0= ruleAngle ) )+ otherlv_3= ',' ( (lv_angle_res_4_0= ruleAngle_res ) ) otherlv_5= ')' ) ;
    public final EObject ruleisAt() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_angle_2_0 = null;

        EObject lv_angle_res_4_0 = null;



        	enterRule();

        try {
            // InternalOperations.g:687:2: ( ( ( (lv_name_0_0= 'isAt' ) ) otherlv_1= '(' ( (lv_angle_2_0= ruleAngle ) )+ otherlv_3= ',' ( (lv_angle_res_4_0= ruleAngle_res ) ) otherlv_5= ')' ) )
            // InternalOperations.g:688:2: ( ( (lv_name_0_0= 'isAt' ) ) otherlv_1= '(' ( (lv_angle_2_0= ruleAngle ) )+ otherlv_3= ',' ( (lv_angle_res_4_0= ruleAngle_res ) ) otherlv_5= ')' )
            {
            // InternalOperations.g:688:2: ( ( (lv_name_0_0= 'isAt' ) ) otherlv_1= '(' ( (lv_angle_2_0= ruleAngle ) )+ otherlv_3= ',' ( (lv_angle_res_4_0= ruleAngle_res ) ) otherlv_5= ')' )
            // InternalOperations.g:689:3: ( (lv_name_0_0= 'isAt' ) ) otherlv_1= '(' ( (lv_angle_2_0= ruleAngle ) )+ otherlv_3= ',' ( (lv_angle_res_4_0= ruleAngle_res ) ) otherlv_5= ')'
            {
            // InternalOperations.g:689:3: ( (lv_name_0_0= 'isAt' ) )
            // InternalOperations.g:690:4: (lv_name_0_0= 'isAt' )
            {
            // InternalOperations.g:690:4: (lv_name_0_0= 'isAt' )
            // InternalOperations.g:691:5: lv_name_0_0= 'isAt'
            {
            lv_name_0_0=(Token)match(input,20,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getIsAtAccess().getNameIsAtKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIsAtRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "isAt");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getIsAtAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOperations.g:707:3: ( (lv_angle_2_0= ruleAngle ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_INT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalOperations.g:708:4: (lv_angle_2_0= ruleAngle )
            	    {
            	    // InternalOperations.g:708:4: (lv_angle_2_0= ruleAngle )
            	    // InternalOperations.g:709:5: lv_angle_2_0= ruleAngle
            	    {

            	    					newCompositeNode(grammarAccess.getIsAtAccess().getAngleAngleParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_angle_2_0=ruleAngle();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIsAtRule());
            	    					}
            	    					add(
            	    						current,
            	    						"angle",
            	    						lv_angle_2_0,
            	    						"org.xtext.Operations.Angle");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getIsAtAccess().getCommaKeyword_3());
            		
            // InternalOperations.g:730:3: ( (lv_angle_res_4_0= ruleAngle_res ) )
            // InternalOperations.g:731:4: (lv_angle_res_4_0= ruleAngle_res )
            {
            // InternalOperations.g:731:4: (lv_angle_res_4_0= ruleAngle_res )
            // InternalOperations.g:732:5: lv_angle_res_4_0= ruleAngle_res
            {

            					newCompositeNode(grammarAccess.getIsAtAccess().getAngle_resAngle_resParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_5);
            lv_angle_res_4_0=ruleAngle_res();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsAtRule());
            					}
            					add(
            						current,
            						"angle_res",
            						lv_angle_res_4_0,
            						"org.xtext.Operations.Angle_res");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getIsAtAccess().getRightParenthesisKeyword_5());
            		

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
    // InternalOperations.g:757:1: entryRuleAngle_res returns [EObject current=null] : iv_ruleAngle_res= ruleAngle_res EOF ;
    public final EObject entryRuleAngle_res() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAngle_res = null;


        try {
            // InternalOperations.g:757:50: (iv_ruleAngle_res= ruleAngle_res EOF )
            // InternalOperations.g:758:2: iv_ruleAngle_res= ruleAngle_res EOF
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
    // InternalOperations.g:764:1: ruleAngle_res returns [EObject current=null] : ( (lv_angle_res_0_0= RULE_INT ) ) ;
    public final EObject ruleAngle_res() throws RecognitionException {
        EObject current = null;

        Token lv_angle_res_0_0=null;


        	enterRule();

        try {
            // InternalOperations.g:770:2: ( ( (lv_angle_res_0_0= RULE_INT ) ) )
            // InternalOperations.g:771:2: ( (lv_angle_res_0_0= RULE_INT ) )
            {
            // InternalOperations.g:771:2: ( (lv_angle_res_0_0= RULE_INT ) )
            // InternalOperations.g:772:3: (lv_angle_res_0_0= RULE_INT )
            {
            // InternalOperations.g:772:3: (lv_angle_res_0_0= RULE_INT )
            // InternalOperations.g:773:4: lv_angle_res_0_0= RULE_INT
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
    // InternalOperations.g:792:1: entryRuleAngle returns [EObject current=null] : iv_ruleAngle= ruleAngle EOF ;
    public final EObject entryRuleAngle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAngle = null;


        try {
            // InternalOperations.g:792:46: (iv_ruleAngle= ruleAngle EOF )
            // InternalOperations.g:793:2: iv_ruleAngle= ruleAngle EOF
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
    // InternalOperations.g:799:1: ruleAngle returns [EObject current=null] : ( (lv_angle_0_0= RULE_INT ) ) ;
    public final EObject ruleAngle() throws RecognitionException {
        EObject current = null;

        Token lv_angle_0_0=null;


        	enterRule();

        try {
            // InternalOperations.g:805:2: ( ( (lv_angle_0_0= RULE_INT ) ) )
            // InternalOperations.g:806:2: ( (lv_angle_0_0= RULE_INT ) )
            {
            // InternalOperations.g:806:2: ( (lv_angle_0_0= RULE_INT ) )
            // InternalOperations.g:807:3: (lv_angle_0_0= RULE_INT )
            {
            // InternalOperations.g:807:3: (lv_angle_0_0= RULE_INT )
            // InternalOperations.g:808:4: lv_angle_0_0= RULE_INT
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
    // InternalOperations.g:827:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalOperations.g:827:45: (iv_ruleTime= ruleTime EOF )
            // InternalOperations.g:828:2: iv_ruleTime= ruleTime EOF
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
    // InternalOperations.g:834:1: ruleTime returns [EObject current=null] : ( (lv_time_0_0= RULE_INT ) ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token lv_time_0_0=null;


        	enterRule();

        try {
            // InternalOperations.g:840:2: ( ( (lv_time_0_0= RULE_INT ) ) )
            // InternalOperations.g:841:2: ( (lv_time_0_0= RULE_INT ) )
            {
            // InternalOperations.g:841:2: ( (lv_time_0_0= RULE_INT ) )
            // InternalOperations.g:842:3: (lv_time_0_0= RULE_INT )
            {
            // InternalOperations.g:842:3: (lv_time_0_0= RULE_INT )
            // InternalOperations.g:843:4: lv_time_0_0= RULE_INT
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
    // InternalOperations.g:862:1: entryRuleServo returns [EObject current=null] : iv_ruleServo= ruleServo EOF ;
    public final EObject entryRuleServo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServo = null;


        try {
            // InternalOperations.g:862:46: (iv_ruleServo= ruleServo EOF )
            // InternalOperations.g:863:2: iv_ruleServo= ruleServo EOF
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
    // InternalOperations.g:869:1: ruleServo returns [EObject current=null] : ( (lv_servo_0_0= RULE_INT ) ) ;
    public final EObject ruleServo() throws RecognitionException {
        EObject current = null;

        Token lv_servo_0_0=null;


        	enterRule();

        try {
            // InternalOperations.g:875:2: ( ( (lv_servo_0_0= RULE_INT ) ) )
            // InternalOperations.g:876:2: ( (lv_servo_0_0= RULE_INT ) )
            {
            // InternalOperations.g:876:2: ( (lv_servo_0_0= RULE_INT ) )
            // InternalOperations.g:877:3: (lv_servo_0_0= RULE_INT )
            {
            // InternalOperations.g:877:3: (lv_servo_0_0= RULE_INT )
            // InternalOperations.g:878:4: lv_servo_0_0= RULE_INT
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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008010L});

}