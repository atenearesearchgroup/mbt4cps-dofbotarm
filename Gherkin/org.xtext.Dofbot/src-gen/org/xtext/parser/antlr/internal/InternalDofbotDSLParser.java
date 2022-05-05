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
import org.xtext.services.DofbotDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDofbotDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Name'", "'{'", "'rotateMultiple'", "'rotateSingle'", "'}'", "'RotateMultiple'", "'Time'", "'RotateSingle'", "'Servo'", "'Angle'"
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalDofbotDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDofbotDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDofbotDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDofbotDSL.g"; }



     	private DofbotDSLGrammarAccess grammarAccess;

        public InternalDofbotDSLParser(TokenStream input, DofbotDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Arm";
       	}

       	@Override
       	protected DofbotDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleArm"
    // InternalDofbotDSL.g:64:1: entryRuleArm returns [EObject current=null] : iv_ruleArm= ruleArm EOF ;
    public final EObject entryRuleArm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArm = null;


        try {
            // InternalDofbotDSL.g:64:44: (iv_ruleArm= ruleArm EOF )
            // InternalDofbotDSL.g:65:2: iv_ruleArm= ruleArm EOF
            {
             newCompositeNode(grammarAccess.getArmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArm=ruleArm();

            state._fsp--;

             current =iv_ruleArm; 
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
    // $ANTLR end "entryRuleArm"


    // $ANTLR start "ruleArm"
    // InternalDofbotDSL.g:71:1: ruleArm returns [EObject current=null] : (otherlv_0= 'Name' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'rotateMultiple' ( (lv_rotateMultiple_4_0= ruleRotateMultiple ) )+ )? (otherlv_5= 'rotateSingle' ( (lv_rotateSingle_6_0= ruleRotateSingle ) )+ )? otherlv_7= '}' ) ;
    public final EObject ruleArm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_rotateMultiple_4_0 = null;

        EObject lv_rotateSingle_6_0 = null;



        	enterRule();

        try {
            // InternalDofbotDSL.g:77:2: ( (otherlv_0= 'Name' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'rotateMultiple' ( (lv_rotateMultiple_4_0= ruleRotateMultiple ) )+ )? (otherlv_5= 'rotateSingle' ( (lv_rotateSingle_6_0= ruleRotateSingle ) )+ )? otherlv_7= '}' ) )
            // InternalDofbotDSL.g:78:2: (otherlv_0= 'Name' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'rotateMultiple' ( (lv_rotateMultiple_4_0= ruleRotateMultiple ) )+ )? (otherlv_5= 'rotateSingle' ( (lv_rotateSingle_6_0= ruleRotateSingle ) )+ )? otherlv_7= '}' )
            {
            // InternalDofbotDSL.g:78:2: (otherlv_0= 'Name' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'rotateMultiple' ( (lv_rotateMultiple_4_0= ruleRotateMultiple ) )+ )? (otherlv_5= 'rotateSingle' ( (lv_rotateSingle_6_0= ruleRotateSingle ) )+ )? otherlv_7= '}' )
            // InternalDofbotDSL.g:79:3: otherlv_0= 'Name' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'rotateMultiple' ( (lv_rotateMultiple_4_0= ruleRotateMultiple ) )+ )? (otherlv_5= 'rotateSingle' ( (lv_rotateSingle_6_0= ruleRotateSingle ) )+ )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getArmAccess().getNameKeyword_0());
            		
            // InternalDofbotDSL.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDofbotDSL.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDofbotDSL.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalDofbotDSL.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getArmAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArmRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getArmAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDofbotDSL.g:105:3: (otherlv_3= 'rotateMultiple' ( (lv_rotateMultiple_4_0= ruleRotateMultiple ) )+ )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDofbotDSL.g:106:4: otherlv_3= 'rotateMultiple' ( (lv_rotateMultiple_4_0= ruleRotateMultiple ) )+
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getArmAccess().getRotateMultipleKeyword_3_0());
                    			
                    // InternalDofbotDSL.g:110:4: ( (lv_rotateMultiple_4_0= ruleRotateMultiple ) )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==16) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDofbotDSL.g:111:5: (lv_rotateMultiple_4_0= ruleRotateMultiple )
                    	    {
                    	    // InternalDofbotDSL.g:111:5: (lv_rotateMultiple_4_0= ruleRotateMultiple )
                    	    // InternalDofbotDSL.g:112:6: lv_rotateMultiple_4_0= ruleRotateMultiple
                    	    {

                    	    						newCompositeNode(grammarAccess.getArmAccess().getRotateMultipleRotateMultipleParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_rotateMultiple_4_0=ruleRotateMultiple();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getArmRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"rotateMultiple",
                    	    							lv_rotateMultiple_4_0,
                    	    							"org.xtext.DofbotDSL.RotateMultiple");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);


                    }
                    break;

            }

            // InternalDofbotDSL.g:130:3: (otherlv_5= 'rotateSingle' ( (lv_rotateSingle_6_0= ruleRotateSingle ) )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDofbotDSL.g:131:4: otherlv_5= 'rotateSingle' ( (lv_rotateSingle_6_0= ruleRotateSingle ) )+
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getArmAccess().getRotateSingleKeyword_4_0());
                    			
                    // InternalDofbotDSL.g:135:4: ( (lv_rotateSingle_6_0= ruleRotateSingle ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==18) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalDofbotDSL.g:136:5: (lv_rotateSingle_6_0= ruleRotateSingle )
                    	    {
                    	    // InternalDofbotDSL.g:136:5: (lv_rotateSingle_6_0= ruleRotateSingle )
                    	    // InternalDofbotDSL.g:137:6: lv_rotateSingle_6_0= ruleRotateSingle
                    	    {

                    	    						newCompositeNode(grammarAccess.getArmAccess().getRotateSingleRotateSingleParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_rotateSingle_6_0=ruleRotateSingle();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getArmRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"rotateSingle",
                    	    							lv_rotateSingle_6_0,
                    	    							"org.xtext.DofbotDSL.RotateSingle");
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


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getArmAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleArm"


    // $ANTLR start "entryRuleRotateMultiple"
    // InternalDofbotDSL.g:163:1: entryRuleRotateMultiple returns [EObject current=null] : iv_ruleRotateMultiple= ruleRotateMultiple EOF ;
    public final EObject entryRuleRotateMultiple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotateMultiple = null;


        try {
            // InternalDofbotDSL.g:163:55: (iv_ruleRotateMultiple= ruleRotateMultiple EOF )
            // InternalDofbotDSL.g:164:2: iv_ruleRotateMultiple= ruleRotateMultiple EOF
            {
             newCompositeNode(grammarAccess.getRotateMultipleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotateMultiple=ruleRotateMultiple();

            state._fsp--;

             current =iv_ruleRotateMultiple; 
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
    // $ANTLR end "entryRuleRotateMultiple"


    // $ANTLR start "ruleRotateMultiple"
    // InternalDofbotDSL.g:170:1: ruleRotateMultiple returns [EObject current=null] : (otherlv_0= 'RotateMultiple' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_Angle_3_0= ruleAngles ) )+ otherlv_4= 'Time' ( (lv_time_5_0= RULE_INT ) ) otherlv_6= '}' ) ;
    public final EObject ruleRotateMultiple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_time_5_0=null;
        Token otherlv_6=null;
        EObject lv_Angle_3_0 = null;



        	enterRule();

        try {
            // InternalDofbotDSL.g:176:2: ( (otherlv_0= 'RotateMultiple' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_Angle_3_0= ruleAngles ) )+ otherlv_4= 'Time' ( (lv_time_5_0= RULE_INT ) ) otherlv_6= '}' ) )
            // InternalDofbotDSL.g:177:2: (otherlv_0= 'RotateMultiple' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_Angle_3_0= ruleAngles ) )+ otherlv_4= 'Time' ( (lv_time_5_0= RULE_INT ) ) otherlv_6= '}' )
            {
            // InternalDofbotDSL.g:177:2: (otherlv_0= 'RotateMultiple' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_Angle_3_0= ruleAngles ) )+ otherlv_4= 'Time' ( (lv_time_5_0= RULE_INT ) ) otherlv_6= '}' )
            // InternalDofbotDSL.g:178:3: otherlv_0= 'RotateMultiple' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_Angle_3_0= ruleAngles ) )+ otherlv_4= 'Time' ( (lv_time_5_0= RULE_INT ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRotateMultipleAccess().getRotateMultipleKeyword_0());
            		
            // InternalDofbotDSL.g:182:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDofbotDSL.g:183:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDofbotDSL.g:183:4: (lv_name_1_0= RULE_ID )
            // InternalDofbotDSL.g:184:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRotateMultipleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotateMultipleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getRotateMultipleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDofbotDSL.g:204:3: ( (lv_Angle_3_0= ruleAngles ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDofbotDSL.g:205:4: (lv_Angle_3_0= ruleAngles )
            	    {
            	    // InternalDofbotDSL.g:205:4: (lv_Angle_3_0= ruleAngles )
            	    // InternalDofbotDSL.g:206:5: lv_Angle_3_0= ruleAngles
            	    {

            	    					newCompositeNode(grammarAccess.getRotateMultipleAccess().getAngleAnglesParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_Angle_3_0=ruleAngles();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRotateMultipleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Angle",
            	    						lv_Angle_3_0,
            	    						"org.xtext.DofbotDSL.Angles");
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

            otherlv_4=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getRotateMultipleAccess().getTimeKeyword_4());
            		
            // InternalDofbotDSL.g:227:3: ( (lv_time_5_0= RULE_INT ) )
            // InternalDofbotDSL.g:228:4: (lv_time_5_0= RULE_INT )
            {
            // InternalDofbotDSL.g:228:4: (lv_time_5_0= RULE_INT )
            // InternalDofbotDSL.g:229:5: lv_time_5_0= RULE_INT
            {
            lv_time_5_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_time_5_0, grammarAccess.getRotateMultipleAccess().getTimeINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotateMultipleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"time",
            						lv_time_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRotateMultipleAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleRotateMultiple"


    // $ANTLR start "entryRuleRotateSingle"
    // InternalDofbotDSL.g:253:1: entryRuleRotateSingle returns [EObject current=null] : iv_ruleRotateSingle= ruleRotateSingle EOF ;
    public final EObject entryRuleRotateSingle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotateSingle = null;


        try {
            // InternalDofbotDSL.g:253:53: (iv_ruleRotateSingle= ruleRotateSingle EOF )
            // InternalDofbotDSL.g:254:2: iv_ruleRotateSingle= ruleRotateSingle EOF
            {
             newCompositeNode(grammarAccess.getRotateSingleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotateSingle=ruleRotateSingle();

            state._fsp--;

             current =iv_ruleRotateSingle; 
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
    // $ANTLR end "entryRuleRotateSingle"


    // $ANTLR start "ruleRotateSingle"
    // InternalDofbotDSL.g:260:1: ruleRotateSingle returns [EObject current=null] : (otherlv_0= 'RotateSingle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_Servo_3_0= ruleServos ) ) ( (lv_Angle_4_0= ruleAngles ) ) otherlv_5= 'Time' ( (lv_time_6_0= RULE_INT ) ) otherlv_7= '}' ) ;
    public final EObject ruleRotateSingle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token lv_time_6_0=null;
        Token otherlv_7=null;
        EObject lv_Servo_3_0 = null;

        EObject lv_Angle_4_0 = null;



        	enterRule();

        try {
            // InternalDofbotDSL.g:266:2: ( (otherlv_0= 'RotateSingle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_Servo_3_0= ruleServos ) ) ( (lv_Angle_4_0= ruleAngles ) ) otherlv_5= 'Time' ( (lv_time_6_0= RULE_INT ) ) otherlv_7= '}' ) )
            // InternalDofbotDSL.g:267:2: (otherlv_0= 'RotateSingle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_Servo_3_0= ruleServos ) ) ( (lv_Angle_4_0= ruleAngles ) ) otherlv_5= 'Time' ( (lv_time_6_0= RULE_INT ) ) otherlv_7= '}' )
            {
            // InternalDofbotDSL.g:267:2: (otherlv_0= 'RotateSingle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_Servo_3_0= ruleServos ) ) ( (lv_Angle_4_0= ruleAngles ) ) otherlv_5= 'Time' ( (lv_time_6_0= RULE_INT ) ) otherlv_7= '}' )
            // InternalDofbotDSL.g:268:3: otherlv_0= 'RotateSingle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_Servo_3_0= ruleServos ) ) ( (lv_Angle_4_0= ruleAngles ) ) otherlv_5= 'Time' ( (lv_time_6_0= RULE_INT ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRotateSingleAccess().getRotateSingleKeyword_0());
            		
            // InternalDofbotDSL.g:272:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDofbotDSL.g:273:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDofbotDSL.g:273:4: (lv_name_1_0= RULE_ID )
            // InternalDofbotDSL.g:274:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRotateSingleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotateSingleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getRotateSingleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDofbotDSL.g:294:3: ( (lv_Servo_3_0= ruleServos ) )
            // InternalDofbotDSL.g:295:4: (lv_Servo_3_0= ruleServos )
            {
            // InternalDofbotDSL.g:295:4: (lv_Servo_3_0= ruleServos )
            // InternalDofbotDSL.g:296:5: lv_Servo_3_0= ruleServos
            {

            					newCompositeNode(grammarAccess.getRotateSingleAccess().getServoServosParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_Servo_3_0=ruleServos();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateSingleRule());
            					}
            					set(
            						current,
            						"Servo",
            						lv_Servo_3_0,
            						"org.xtext.DofbotDSL.Servos");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDofbotDSL.g:313:3: ( (lv_Angle_4_0= ruleAngles ) )
            // InternalDofbotDSL.g:314:4: (lv_Angle_4_0= ruleAngles )
            {
            // InternalDofbotDSL.g:314:4: (lv_Angle_4_0= ruleAngles )
            // InternalDofbotDSL.g:315:5: lv_Angle_4_0= ruleAngles
            {

            					newCompositeNode(grammarAccess.getRotateSingleAccess().getAngleAnglesParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_Angle_4_0=ruleAngles();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateSingleRule());
            					}
            					set(
            						current,
            						"Angle",
            						lv_Angle_4_0,
            						"org.xtext.DofbotDSL.Angles");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getRotateSingleAccess().getTimeKeyword_5());
            		
            // InternalDofbotDSL.g:336:3: ( (lv_time_6_0= RULE_INT ) )
            // InternalDofbotDSL.g:337:4: (lv_time_6_0= RULE_INT )
            {
            // InternalDofbotDSL.g:337:4: (lv_time_6_0= RULE_INT )
            // InternalDofbotDSL.g:338:5: lv_time_6_0= RULE_INT
            {
            lv_time_6_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_time_6_0, grammarAccess.getRotateSingleAccess().getTimeINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotateSingleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"time",
            						lv_time_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRotateSingleAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleRotateSingle"


    // $ANTLR start "entryRuleServos"
    // InternalDofbotDSL.g:362:1: entryRuleServos returns [EObject current=null] : iv_ruleServos= ruleServos EOF ;
    public final EObject entryRuleServos() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServos = null;


        try {
            // InternalDofbotDSL.g:362:47: (iv_ruleServos= ruleServos EOF )
            // InternalDofbotDSL.g:363:2: iv_ruleServos= ruleServos EOF
            {
             newCompositeNode(grammarAccess.getServosRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServos=ruleServos();

            state._fsp--;

             current =iv_ruleServos; 
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
    // $ANTLR end "entryRuleServos"


    // $ANTLR start "ruleServos"
    // InternalDofbotDSL.g:369:1: ruleServos returns [EObject current=null] : (otherlv_0= 'Servo' ( (lv_name_1_0= RULE_INT ) ) ) ;
    public final EObject ruleServos() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDofbotDSL.g:375:2: ( (otherlv_0= 'Servo' ( (lv_name_1_0= RULE_INT ) ) ) )
            // InternalDofbotDSL.g:376:2: (otherlv_0= 'Servo' ( (lv_name_1_0= RULE_INT ) ) )
            {
            // InternalDofbotDSL.g:376:2: (otherlv_0= 'Servo' ( (lv_name_1_0= RULE_INT ) ) )
            // InternalDofbotDSL.g:377:3: otherlv_0= 'Servo' ( (lv_name_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getServosAccess().getServoKeyword_0());
            		
            // InternalDofbotDSL.g:381:3: ( (lv_name_1_0= RULE_INT ) )
            // InternalDofbotDSL.g:382:4: (lv_name_1_0= RULE_INT )
            {
            // InternalDofbotDSL.g:382:4: (lv_name_1_0= RULE_INT )
            // InternalDofbotDSL.g:383:5: lv_name_1_0= RULE_INT
            {
            lv_name_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getServosAccess().getNameINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServosRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleServos"


    // $ANTLR start "entryRuleAngles"
    // InternalDofbotDSL.g:403:1: entryRuleAngles returns [EObject current=null] : iv_ruleAngles= ruleAngles EOF ;
    public final EObject entryRuleAngles() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAngles = null;


        try {
            // InternalDofbotDSL.g:403:47: (iv_ruleAngles= ruleAngles EOF )
            // InternalDofbotDSL.g:404:2: iv_ruleAngles= ruleAngles EOF
            {
             newCompositeNode(grammarAccess.getAnglesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAngles=ruleAngles();

            state._fsp--;

             current =iv_ruleAngles; 
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
    // $ANTLR end "entryRuleAngles"


    // $ANTLR start "ruleAngles"
    // InternalDofbotDSL.g:410:1: ruleAngles returns [EObject current=null] : (otherlv_0= 'Angle' ( (lv_name_1_0= RULE_INT ) ) ) ;
    public final EObject ruleAngles() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDofbotDSL.g:416:2: ( (otherlv_0= 'Angle' ( (lv_name_1_0= RULE_INT ) ) ) )
            // InternalDofbotDSL.g:417:2: (otherlv_0= 'Angle' ( (lv_name_1_0= RULE_INT ) ) )
            {
            // InternalDofbotDSL.g:417:2: (otherlv_0= 'Angle' ( (lv_name_1_0= RULE_INT ) ) )
            // InternalDofbotDSL.g:418:3: otherlv_0= 'Angle' ( (lv_name_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getAnglesAccess().getAngleKeyword_0());
            		
            // InternalDofbotDSL.g:422:3: ( (lv_name_1_0= RULE_INT ) )
            // InternalDofbotDSL.g:423:4: (lv_name_1_0= RULE_INT )
            {
            // InternalDofbotDSL.g:423:4: (lv_name_1_0= RULE_INT )
            // InternalDofbotDSL.g:424:5: lv_name_1_0= RULE_INT
            {
            lv_name_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAnglesAccess().getNameINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnglesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleAngles"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});

}