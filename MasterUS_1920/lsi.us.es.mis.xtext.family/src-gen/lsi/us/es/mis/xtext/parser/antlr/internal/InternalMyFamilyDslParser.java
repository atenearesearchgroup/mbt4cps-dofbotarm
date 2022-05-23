package lsi.us.es.mis.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import lsi.us.es.mis.xtext.services.MyFamilyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyFamilyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Family'", "'{'", "'}'", "'Man'", "'parents:'", "'children:'", "'Woman'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyFamilyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyFamilyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyFamilyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyFamilyDsl.g"; }



     	private MyFamilyDslGrammarAccess grammarAccess;

        public InternalMyFamilyDslParser(TokenStream input, MyFamilyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Family";
       	}

       	@Override
       	protected MyFamilyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFamily"
    // InternalMyFamilyDsl.g:64:1: entryRuleFamily returns [EObject current=null] : iv_ruleFamily= ruleFamily EOF ;
    public final EObject entryRuleFamily() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFamily = null;


        try {
            // InternalMyFamilyDsl.g:64:47: (iv_ruleFamily= ruleFamily EOF )
            // InternalMyFamilyDsl.g:65:2: iv_ruleFamily= ruleFamily EOF
            {
             newCompositeNode(grammarAccess.getFamilyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFamily=ruleFamily();

            state._fsp--;

             current =iv_ruleFamily; 
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
    // $ANTLR end "entryRuleFamily"


    // $ANTLR start "ruleFamily"
    // InternalMyFamilyDsl.g:71:1: ruleFamily returns [EObject current=null] : (otherlv_0= 'Family' ( (lv_surname_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_persons_3_0= rulePerson ) )+ otherlv_4= '}' ) ;
    public final EObject ruleFamily() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_surname_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_persons_3_0 = null;



        	enterRule();

        try {
            // InternalMyFamilyDsl.g:77:2: ( (otherlv_0= 'Family' ( (lv_surname_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_persons_3_0= rulePerson ) )+ otherlv_4= '}' ) )
            // InternalMyFamilyDsl.g:78:2: (otherlv_0= 'Family' ( (lv_surname_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_persons_3_0= rulePerson ) )+ otherlv_4= '}' )
            {
            // InternalMyFamilyDsl.g:78:2: (otherlv_0= 'Family' ( (lv_surname_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_persons_3_0= rulePerson ) )+ otherlv_4= '}' )
            // InternalMyFamilyDsl.g:79:3: otherlv_0= 'Family' ( (lv_surname_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_persons_3_0= rulePerson ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFamilyAccess().getFamilyKeyword_0());
            		
            // InternalMyFamilyDsl.g:83:3: ( (lv_surname_1_0= RULE_STRING ) )
            // InternalMyFamilyDsl.g:84:4: (lv_surname_1_0= RULE_STRING )
            {
            // InternalMyFamilyDsl.g:84:4: (lv_surname_1_0= RULE_STRING )
            // InternalMyFamilyDsl.g:85:5: lv_surname_1_0= RULE_STRING
            {
            lv_surname_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_surname_1_0, grammarAccess.getFamilyAccess().getSurnameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFamilyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"surname",
            						lv_surname_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getFamilyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyFamilyDsl.g:105:3: ( (lv_persons_3_0= rulePerson ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyFamilyDsl.g:106:4: (lv_persons_3_0= rulePerson )
            	    {
            	    // InternalMyFamilyDsl.g:106:4: (lv_persons_3_0= rulePerson )
            	    // InternalMyFamilyDsl.g:107:5: lv_persons_3_0= rulePerson
            	    {

            	    					newCompositeNode(grammarAccess.getFamilyAccess().getPersonsPersonParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_persons_3_0=rulePerson();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFamilyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"persons",
            	    						lv_persons_3_0,
            	    						"lsi.us.es.mis.xtext.MyFamilyDsl.Person");
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

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFamilyAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleFamily"


    // $ANTLR start "entryRulePerson"
    // InternalMyFamilyDsl.g:132:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalMyFamilyDsl.g:132:47: (iv_rulePerson= rulePerson EOF )
            // InternalMyFamilyDsl.g:133:2: iv_rulePerson= rulePerson EOF
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
    // InternalMyFamilyDsl.g:139:1: rulePerson returns [EObject current=null] : (this_Man_0= ruleMan | this_Woman_1= ruleWoman ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        EObject this_Man_0 = null;

        EObject this_Woman_1 = null;



        	enterRule();

        try {
            // InternalMyFamilyDsl.g:145:2: ( (this_Man_0= ruleMan | this_Woman_1= ruleWoman ) )
            // InternalMyFamilyDsl.g:146:2: (this_Man_0= ruleMan | this_Woman_1= ruleWoman )
            {
            // InternalMyFamilyDsl.g:146:2: (this_Man_0= ruleMan | this_Woman_1= ruleWoman )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyFamilyDsl.g:147:3: this_Man_0= ruleMan
                    {

                    			newCompositeNode(grammarAccess.getPersonAccess().getManParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Man_0=ruleMan();

                    state._fsp--;


                    			current = this_Man_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyFamilyDsl.g:156:3: this_Woman_1= ruleWoman
                    {

                    			newCompositeNode(grammarAccess.getPersonAccess().getWomanParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Woman_1=ruleWoman();

                    state._fsp--;


                    			current = this_Woman_1;
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
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleMan"
    // InternalMyFamilyDsl.g:168:1: entryRuleMan returns [EObject current=null] : iv_ruleMan= ruleMan EOF ;
    public final EObject entryRuleMan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMan = null;


        try {
            // InternalMyFamilyDsl.g:168:44: (iv_ruleMan= ruleMan EOF )
            // InternalMyFamilyDsl.g:169:2: iv_ruleMan= ruleMan EOF
            {
             newCompositeNode(grammarAccess.getManRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMan=ruleMan();

            state._fsp--;

             current =iv_ruleMan; 
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
    // $ANTLR end "entryRuleMan"


    // $ANTLR start "ruleMan"
    // InternalMyFamilyDsl.g:175:1: ruleMan returns [EObject current=null] : (otherlv_0= 'Man' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'parents:' ( (otherlv_3= RULE_ID ) )+ )? (otherlv_4= 'children:' ( (otherlv_5= RULE_ID ) )+ )? ) ;
    public final EObject ruleMan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyFamilyDsl.g:181:2: ( (otherlv_0= 'Man' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'parents:' ( (otherlv_3= RULE_ID ) )+ )? (otherlv_4= 'children:' ( (otherlv_5= RULE_ID ) )+ )? ) )
            // InternalMyFamilyDsl.g:182:2: (otherlv_0= 'Man' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'parents:' ( (otherlv_3= RULE_ID ) )+ )? (otherlv_4= 'children:' ( (otherlv_5= RULE_ID ) )+ )? )
            {
            // InternalMyFamilyDsl.g:182:2: (otherlv_0= 'Man' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'parents:' ( (otherlv_3= RULE_ID ) )+ )? (otherlv_4= 'children:' ( (otherlv_5= RULE_ID ) )+ )? )
            // InternalMyFamilyDsl.g:183:3: otherlv_0= 'Man' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'parents:' ( (otherlv_3= RULE_ID ) )+ )? (otherlv_4= 'children:' ( (otherlv_5= RULE_ID ) )+ )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getManAccess().getManKeyword_0());
            		
            // InternalMyFamilyDsl.g:187:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyFamilyDsl.g:188:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyFamilyDsl.g:188:4: (lv_name_1_0= RULE_STRING )
            // InternalMyFamilyDsl.g:189:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getManAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getManRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyFamilyDsl.g:205:3: (otherlv_2= 'parents:' ( (otherlv_3= RULE_ID ) )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyFamilyDsl.g:206:4: otherlv_2= 'parents:' ( (otherlv_3= RULE_ID ) )+
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getManAccess().getParentsKeyword_2_0());
                    			
                    // InternalMyFamilyDsl.g:210:4: ( (otherlv_3= RULE_ID ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMyFamilyDsl.g:211:5: (otherlv_3= RULE_ID )
                    	    {
                    	    // InternalMyFamilyDsl.g:211:5: (otherlv_3= RULE_ID )
                    	    // InternalMyFamilyDsl.g:212:6: otherlv_3= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getManRule());
                    	    						}
                    	    					
                    	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

                    	    						newLeafNode(otherlv_3, grammarAccess.getManAccess().getParentsPersonCrossReference_2_1_0());
                    	    					

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

            // InternalMyFamilyDsl.g:224:3: (otherlv_4= 'children:' ( (otherlv_5= RULE_ID ) )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyFamilyDsl.g:225:4: otherlv_4= 'children:' ( (otherlv_5= RULE_ID ) )+
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getManAccess().getChildrenKeyword_3_0());
                    			
                    // InternalMyFamilyDsl.g:229:4: ( (otherlv_5= RULE_ID ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyFamilyDsl.g:230:5: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalMyFamilyDsl.g:230:5: (otherlv_5= RULE_ID )
                    	    // InternalMyFamilyDsl.g:231:6: otherlv_5= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getManRule());
                    	    						}
                    	    					
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_10); 

                    	    						newLeafNode(otherlv_5, grammarAccess.getManAccess().getChildrenPersonCrossReference_3_1_0());
                    	    					

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


                    }
                    break;

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
    // $ANTLR end "ruleMan"


    // $ANTLR start "entryRuleWoman"
    // InternalMyFamilyDsl.g:247:1: entryRuleWoman returns [EObject current=null] : iv_ruleWoman= ruleWoman EOF ;
    public final EObject entryRuleWoman() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWoman = null;


        try {
            // InternalMyFamilyDsl.g:247:46: (iv_ruleWoman= ruleWoman EOF )
            // InternalMyFamilyDsl.g:248:2: iv_ruleWoman= ruleWoman EOF
            {
             newCompositeNode(grammarAccess.getWomanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWoman=ruleWoman();

            state._fsp--;

             current =iv_ruleWoman; 
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
    // $ANTLR end "entryRuleWoman"


    // $ANTLR start "ruleWoman"
    // InternalMyFamilyDsl.g:254:1: ruleWoman returns [EObject current=null] : (otherlv_0= 'Woman' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'parents:' ( (otherlv_3= RULE_ID ) )+ )? (otherlv_4= 'children:' ( (otherlv_5= RULE_ID ) )+ )? ) ;
    public final EObject ruleWoman() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyFamilyDsl.g:260:2: ( (otherlv_0= 'Woman' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'parents:' ( (otherlv_3= RULE_ID ) )+ )? (otherlv_4= 'children:' ( (otherlv_5= RULE_ID ) )+ )? ) )
            // InternalMyFamilyDsl.g:261:2: (otherlv_0= 'Woman' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'parents:' ( (otherlv_3= RULE_ID ) )+ )? (otherlv_4= 'children:' ( (otherlv_5= RULE_ID ) )+ )? )
            {
            // InternalMyFamilyDsl.g:261:2: (otherlv_0= 'Woman' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'parents:' ( (otherlv_3= RULE_ID ) )+ )? (otherlv_4= 'children:' ( (otherlv_5= RULE_ID ) )+ )? )
            // InternalMyFamilyDsl.g:262:3: otherlv_0= 'Woman' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'parents:' ( (otherlv_3= RULE_ID ) )+ )? (otherlv_4= 'children:' ( (otherlv_5= RULE_ID ) )+ )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWomanAccess().getWomanKeyword_0());
            		
            // InternalMyFamilyDsl.g:266:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyFamilyDsl.g:267:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyFamilyDsl.g:267:4: (lv_name_1_0= RULE_STRING )
            // InternalMyFamilyDsl.g:268:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWomanAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWomanRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyFamilyDsl.g:284:3: (otherlv_2= 'parents:' ( (otherlv_3= RULE_ID ) )+ )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyFamilyDsl.g:285:4: otherlv_2= 'parents:' ( (otherlv_3= RULE_ID ) )+
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getWomanAccess().getParentsKeyword_2_0());
                    			
                    // InternalMyFamilyDsl.g:289:4: ( (otherlv_3= RULE_ID ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_ID) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMyFamilyDsl.g:290:5: (otherlv_3= RULE_ID )
                    	    {
                    	    // InternalMyFamilyDsl.g:290:5: (otherlv_3= RULE_ID )
                    	    // InternalMyFamilyDsl.g:291:6: otherlv_3= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getWomanRule());
                    	    						}
                    	    					
                    	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

                    	    						newLeafNode(otherlv_3, grammarAccess.getWomanAccess().getParentsPersonCrossReference_2_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }
                    break;

            }

            // InternalMyFamilyDsl.g:303:3: (otherlv_4= 'children:' ( (otherlv_5= RULE_ID ) )+ )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyFamilyDsl.g:304:4: otherlv_4= 'children:' ( (otherlv_5= RULE_ID ) )+
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getWomanAccess().getChildrenKeyword_3_0());
                    			
                    // InternalMyFamilyDsl.g:308:4: ( (otherlv_5= RULE_ID ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMyFamilyDsl.g:309:5: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalMyFamilyDsl.g:309:5: (otherlv_5= RULE_ID )
                    	    // InternalMyFamilyDsl.g:310:6: otherlv_5= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getWomanRule());
                    	    						}
                    	    					
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_10); 

                    	    						newLeafNode(otherlv_5, grammarAccess.getWomanAccess().getChildrenPersonCrossReference_3_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "ruleWoman"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000026000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010022L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000022L});

}