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
import lsi.us.es.mis.xtext.services.MyWorldDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyWorldDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOUBLE", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Ocean'", "'{'", "'area (sq km):'", "'volume (cu km):'", "'}'", "'Lake'", "'Sea'", "'Continent'", "'Country'", "'peaceful'", "'population:'", "'borders:'", "'washedBy:'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=5;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyWorldDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyWorldDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyWorldDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyWorldDsl.g"; }



     	private MyWorldDslGrammarAccess grammarAccess;

        public InternalMyWorldDslParser(TokenStream input, MyWorldDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "World";
       	}

       	@Override
       	protected MyWorldDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleWorld"
    // InternalMyWorldDsl.g:64:1: entryRuleWorld returns [EObject current=null] : iv_ruleWorld= ruleWorld EOF ;
    public final EObject entryRuleWorld() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorld = null;


        try {
            // InternalMyWorldDsl.g:64:46: (iv_ruleWorld= ruleWorld EOF )
            // InternalMyWorldDsl.g:65:2: iv_ruleWorld= ruleWorld EOF
            {
             newCompositeNode(grammarAccess.getWorldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorld=ruleWorld();

            state._fsp--;

             current =iv_ruleWorld; 
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
    // $ANTLR end "entryRuleWorld"


    // $ANTLR start "ruleWorld"
    // InternalMyWorldDsl.g:71:1: ruleWorld returns [EObject current=null] : ( (lv_spaces_0_0= ruleSpace ) )+ ;
    public final EObject ruleWorld() throws RecognitionException {
        EObject current = null;

        EObject lv_spaces_0_0 = null;



        	enterRule();

        try {
            // InternalMyWorldDsl.g:77:2: ( ( (lv_spaces_0_0= ruleSpace ) )+ )
            // InternalMyWorldDsl.g:78:2: ( (lv_spaces_0_0= ruleSpace ) )+
            {
            // InternalMyWorldDsl.g:78:2: ( (lv_spaces_0_0= ruleSpace ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||(LA1_0>=17 && LA1_0<=19)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyWorldDsl.g:79:3: (lv_spaces_0_0= ruleSpace )
            	    {
            	    // InternalMyWorldDsl.g:79:3: (lv_spaces_0_0= ruleSpace )
            	    // InternalMyWorldDsl.g:80:4: lv_spaces_0_0= ruleSpace
            	    {

            	    				newCompositeNode(grammarAccess.getWorldAccess().getSpacesSpaceParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_spaces_0_0=ruleSpace();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getWorldRule());
            	    				}
            	    				add(
            	    					current,
            	    					"spaces",
            	    					lv_spaces_0_0,
            	    					"lsi.us.es.mis.xtext.MyWorldDsl.Space");
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
    // $ANTLR end "ruleWorld"


    // $ANTLR start "entryRuleSpace"
    // InternalMyWorldDsl.g:100:1: entryRuleSpace returns [EObject current=null] : iv_ruleSpace= ruleSpace EOF ;
    public final EObject entryRuleSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpace = null;


        try {
            // InternalMyWorldDsl.g:100:46: (iv_ruleSpace= ruleSpace EOF )
            // InternalMyWorldDsl.g:101:2: iv_ruleSpace= ruleSpace EOF
            {
             newCompositeNode(grammarAccess.getSpaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpace=ruleSpace();

            state._fsp--;

             current =iv_ruleSpace; 
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
    // $ANTLR end "entryRuleSpace"


    // $ANTLR start "ruleSpace"
    // InternalMyWorldDsl.g:107:1: ruleSpace returns [EObject current=null] : (this_Continent_0= ruleContinent | this_Water_1= ruleWater ) ;
    public final EObject ruleSpace() throws RecognitionException {
        EObject current = null;

        EObject this_Continent_0 = null;

        EObject this_Water_1 = null;



        	enterRule();

        try {
            // InternalMyWorldDsl.g:113:2: ( (this_Continent_0= ruleContinent | this_Water_1= ruleWater ) )
            // InternalMyWorldDsl.g:114:2: (this_Continent_0= ruleContinent | this_Water_1= ruleWater )
            {
            // InternalMyWorldDsl.g:114:2: (this_Continent_0= ruleContinent | this_Water_1= ruleWater )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            else if ( (LA2_0==12||(LA2_0>=17 && LA2_0<=18)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyWorldDsl.g:115:3: this_Continent_0= ruleContinent
                    {

                    			newCompositeNode(grammarAccess.getSpaceAccess().getContinentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Continent_0=ruleContinent();

                    state._fsp--;


                    			current = this_Continent_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyWorldDsl.g:124:3: this_Water_1= ruleWater
                    {

                    			newCompositeNode(grammarAccess.getSpaceAccess().getWaterParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Water_1=ruleWater();

                    state._fsp--;


                    			current = this_Water_1;
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
    // $ANTLR end "ruleSpace"


    // $ANTLR start "entryRuleWater"
    // InternalMyWorldDsl.g:136:1: entryRuleWater returns [EObject current=null] : iv_ruleWater= ruleWater EOF ;
    public final EObject entryRuleWater() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWater = null;


        try {
            // InternalMyWorldDsl.g:136:46: (iv_ruleWater= ruleWater EOF )
            // InternalMyWorldDsl.g:137:2: iv_ruleWater= ruleWater EOF
            {
             newCompositeNode(grammarAccess.getWaterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWater=ruleWater();

            state._fsp--;

             current =iv_ruleWater; 
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
    // $ANTLR end "entryRuleWater"


    // $ANTLR start "ruleWater"
    // InternalMyWorldDsl.g:143:1: ruleWater returns [EObject current=null] : (this_Ocean_0= ruleOcean | this_Lake_1= ruleLake | this_Sea_2= ruleSea ) ;
    public final EObject ruleWater() throws RecognitionException {
        EObject current = null;

        EObject this_Ocean_0 = null;

        EObject this_Lake_1 = null;

        EObject this_Sea_2 = null;



        	enterRule();

        try {
            // InternalMyWorldDsl.g:149:2: ( (this_Ocean_0= ruleOcean | this_Lake_1= ruleLake | this_Sea_2= ruleSea ) )
            // InternalMyWorldDsl.g:150:2: (this_Ocean_0= ruleOcean | this_Lake_1= ruleLake | this_Sea_2= ruleSea )
            {
            // InternalMyWorldDsl.g:150:2: (this_Ocean_0= ruleOcean | this_Lake_1= ruleLake | this_Sea_2= ruleSea )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyWorldDsl.g:151:3: this_Ocean_0= ruleOcean
                    {

                    			newCompositeNode(grammarAccess.getWaterAccess().getOceanParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ocean_0=ruleOcean();

                    state._fsp--;


                    			current = this_Ocean_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyWorldDsl.g:160:3: this_Lake_1= ruleLake
                    {

                    			newCompositeNode(grammarAccess.getWaterAccess().getLakeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Lake_1=ruleLake();

                    state._fsp--;


                    			current = this_Lake_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyWorldDsl.g:169:3: this_Sea_2= ruleSea
                    {

                    			newCompositeNode(grammarAccess.getWaterAccess().getSeaParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sea_2=ruleSea();

                    state._fsp--;


                    			current = this_Sea_2;
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
    // $ANTLR end "ruleWater"


    // $ANTLR start "entryRuleOcean"
    // InternalMyWorldDsl.g:181:1: entryRuleOcean returns [EObject current=null] : iv_ruleOcean= ruleOcean EOF ;
    public final EObject entryRuleOcean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOcean = null;


        try {
            // InternalMyWorldDsl.g:181:46: (iv_ruleOcean= ruleOcean EOF )
            // InternalMyWorldDsl.g:182:2: iv_ruleOcean= ruleOcean EOF
            {
             newCompositeNode(grammarAccess.getOceanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOcean=ruleOcean();

            state._fsp--;

             current =iv_ruleOcean; 
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
    // $ANTLR end "entryRuleOcean"


    // $ANTLR start "ruleOcean"
    // InternalMyWorldDsl.g:188:1: ruleOcean returns [EObject current=null] : (otherlv_0= 'Ocean' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'area (sq km):' ( (lv_area_4_0= RULE_DOUBLE ) ) otherlv_5= 'volume (cu km):' ( (lv_ck_6_0= RULE_DOUBLE ) ) otherlv_7= '}' ) ;
    public final EObject ruleOcean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_area_4_0=null;
        Token otherlv_5=null;
        Token lv_ck_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalMyWorldDsl.g:194:2: ( (otherlv_0= 'Ocean' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'area (sq km):' ( (lv_area_4_0= RULE_DOUBLE ) ) otherlv_5= 'volume (cu km):' ( (lv_ck_6_0= RULE_DOUBLE ) ) otherlv_7= '}' ) )
            // InternalMyWorldDsl.g:195:2: (otherlv_0= 'Ocean' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'area (sq km):' ( (lv_area_4_0= RULE_DOUBLE ) ) otherlv_5= 'volume (cu km):' ( (lv_ck_6_0= RULE_DOUBLE ) ) otherlv_7= '}' )
            {
            // InternalMyWorldDsl.g:195:2: (otherlv_0= 'Ocean' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'area (sq km):' ( (lv_area_4_0= RULE_DOUBLE ) ) otherlv_5= 'volume (cu km):' ( (lv_ck_6_0= RULE_DOUBLE ) ) otherlv_7= '}' )
            // InternalMyWorldDsl.g:196:3: otherlv_0= 'Ocean' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'area (sq km):' ( (lv_area_4_0= RULE_DOUBLE ) ) otherlv_5= 'volume (cu km):' ( (lv_ck_6_0= RULE_DOUBLE ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOceanAccess().getOceanKeyword_0());
            		
            // InternalMyWorldDsl.g:200:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyWorldDsl.g:201:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyWorldDsl.g:201:4: (lv_name_1_0= RULE_ID )
            // InternalMyWorldDsl.g:202:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getOceanAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOceanRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getOceanAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getOceanAccess().getAreaSqKmKeyword_3());
            		
            // InternalMyWorldDsl.g:226:3: ( (lv_area_4_0= RULE_DOUBLE ) )
            // InternalMyWorldDsl.g:227:4: (lv_area_4_0= RULE_DOUBLE )
            {
            // InternalMyWorldDsl.g:227:4: (lv_area_4_0= RULE_DOUBLE )
            // InternalMyWorldDsl.g:228:5: lv_area_4_0= RULE_DOUBLE
            {
            lv_area_4_0=(Token)match(input,RULE_DOUBLE,FOLLOW_8); 

            					newLeafNode(lv_area_4_0, grammarAccess.getOceanAccess().getAreaDOUBLETerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOceanRule());
            					}
            					setWithLastConsumed(
            						current,
            						"area",
            						lv_area_4_0,
            						"lsi.us.es.mis.xtext.MyWorldDsl.DOUBLE");
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getOceanAccess().getVolumeCuKmKeyword_5());
            		
            // InternalMyWorldDsl.g:248:3: ( (lv_ck_6_0= RULE_DOUBLE ) )
            // InternalMyWorldDsl.g:249:4: (lv_ck_6_0= RULE_DOUBLE )
            {
            // InternalMyWorldDsl.g:249:4: (lv_ck_6_0= RULE_DOUBLE )
            // InternalMyWorldDsl.g:250:5: lv_ck_6_0= RULE_DOUBLE
            {
            lv_ck_6_0=(Token)match(input,RULE_DOUBLE,FOLLOW_9); 

            					newLeafNode(lv_ck_6_0, grammarAccess.getOceanAccess().getCkDOUBLETerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOceanRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ck",
            						lv_ck_6_0,
            						"lsi.us.es.mis.xtext.MyWorldDsl.DOUBLE");
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getOceanAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleOcean"


    // $ANTLR start "entryRuleLake"
    // InternalMyWorldDsl.g:274:1: entryRuleLake returns [EObject current=null] : iv_ruleLake= ruleLake EOF ;
    public final EObject entryRuleLake() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLake = null;


        try {
            // InternalMyWorldDsl.g:274:45: (iv_ruleLake= ruleLake EOF )
            // InternalMyWorldDsl.g:275:2: iv_ruleLake= ruleLake EOF
            {
             newCompositeNode(grammarAccess.getLakeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLake=ruleLake();

            state._fsp--;

             current =iv_ruleLake; 
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
    // $ANTLR end "entryRuleLake"


    // $ANTLR start "ruleLake"
    // InternalMyWorldDsl.g:281:1: ruleLake returns [EObject current=null] : (otherlv_0= 'Lake' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'area (sq km):' ( (lv_area_4_0= RULE_DOUBLE ) ) otherlv_5= 'volume (cu km):' ( (lv_ck_6_0= RULE_DOUBLE ) ) otherlv_7= '}' ) ;
    public final EObject ruleLake() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_area_4_0=null;
        Token otherlv_5=null;
        Token lv_ck_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalMyWorldDsl.g:287:2: ( (otherlv_0= 'Lake' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'area (sq km):' ( (lv_area_4_0= RULE_DOUBLE ) ) otherlv_5= 'volume (cu km):' ( (lv_ck_6_0= RULE_DOUBLE ) ) otherlv_7= '}' ) )
            // InternalMyWorldDsl.g:288:2: (otherlv_0= 'Lake' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'area (sq km):' ( (lv_area_4_0= RULE_DOUBLE ) ) otherlv_5= 'volume (cu km):' ( (lv_ck_6_0= RULE_DOUBLE ) ) otherlv_7= '}' )
            {
            // InternalMyWorldDsl.g:288:2: (otherlv_0= 'Lake' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'area (sq km):' ( (lv_area_4_0= RULE_DOUBLE ) ) otherlv_5= 'volume (cu km):' ( (lv_ck_6_0= RULE_DOUBLE ) ) otherlv_7= '}' )
            // InternalMyWorldDsl.g:289:3: otherlv_0= 'Lake' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'area (sq km):' ( (lv_area_4_0= RULE_DOUBLE ) ) otherlv_5= 'volume (cu km):' ( (lv_ck_6_0= RULE_DOUBLE ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLakeAccess().getLakeKeyword_0());
            		
            // InternalMyWorldDsl.g:293:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyWorldDsl.g:294:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyWorldDsl.g:294:4: (lv_name_1_0= RULE_ID )
            // InternalMyWorldDsl.g:295:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLakeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLakeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLakeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getLakeAccess().getAreaSqKmKeyword_3());
            		
            // InternalMyWorldDsl.g:319:3: ( (lv_area_4_0= RULE_DOUBLE ) )
            // InternalMyWorldDsl.g:320:4: (lv_area_4_0= RULE_DOUBLE )
            {
            // InternalMyWorldDsl.g:320:4: (lv_area_4_0= RULE_DOUBLE )
            // InternalMyWorldDsl.g:321:5: lv_area_4_0= RULE_DOUBLE
            {
            lv_area_4_0=(Token)match(input,RULE_DOUBLE,FOLLOW_8); 

            					newLeafNode(lv_area_4_0, grammarAccess.getLakeAccess().getAreaDOUBLETerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLakeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"area",
            						lv_area_4_0,
            						"lsi.us.es.mis.xtext.MyWorldDsl.DOUBLE");
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getLakeAccess().getVolumeCuKmKeyword_5());
            		
            // InternalMyWorldDsl.g:341:3: ( (lv_ck_6_0= RULE_DOUBLE ) )
            // InternalMyWorldDsl.g:342:4: (lv_ck_6_0= RULE_DOUBLE )
            {
            // InternalMyWorldDsl.g:342:4: (lv_ck_6_0= RULE_DOUBLE )
            // InternalMyWorldDsl.g:343:5: lv_ck_6_0= RULE_DOUBLE
            {
            lv_ck_6_0=(Token)match(input,RULE_DOUBLE,FOLLOW_9); 

            					newLeafNode(lv_ck_6_0, grammarAccess.getLakeAccess().getCkDOUBLETerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLakeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ck",
            						lv_ck_6_0,
            						"lsi.us.es.mis.xtext.MyWorldDsl.DOUBLE");
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getLakeAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleLake"


    // $ANTLR start "entryRuleSea"
    // InternalMyWorldDsl.g:367:1: entryRuleSea returns [EObject current=null] : iv_ruleSea= ruleSea EOF ;
    public final EObject entryRuleSea() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSea = null;


        try {
            // InternalMyWorldDsl.g:367:44: (iv_ruleSea= ruleSea EOF )
            // InternalMyWorldDsl.g:368:2: iv_ruleSea= ruleSea EOF
            {
             newCompositeNode(grammarAccess.getSeaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSea=ruleSea();

            state._fsp--;

             current =iv_ruleSea; 
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
    // $ANTLR end "entryRuleSea"


    // $ANTLR start "ruleSea"
    // InternalMyWorldDsl.g:374:1: ruleSea returns [EObject current=null] : (otherlv_0= 'Sea' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'area (sq km):' ( (lv_area_4_0= RULE_DOUBLE ) ) otherlv_5= 'volume (cu km):' ( (lv_ck_6_0= RULE_DOUBLE ) ) otherlv_7= '}' ) ;
    public final EObject ruleSea() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_area_4_0=null;
        Token otherlv_5=null;
        Token lv_ck_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalMyWorldDsl.g:380:2: ( (otherlv_0= 'Sea' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'area (sq km):' ( (lv_area_4_0= RULE_DOUBLE ) ) otherlv_5= 'volume (cu km):' ( (lv_ck_6_0= RULE_DOUBLE ) ) otherlv_7= '}' ) )
            // InternalMyWorldDsl.g:381:2: (otherlv_0= 'Sea' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'area (sq km):' ( (lv_area_4_0= RULE_DOUBLE ) ) otherlv_5= 'volume (cu km):' ( (lv_ck_6_0= RULE_DOUBLE ) ) otherlv_7= '}' )
            {
            // InternalMyWorldDsl.g:381:2: (otherlv_0= 'Sea' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'area (sq km):' ( (lv_area_4_0= RULE_DOUBLE ) ) otherlv_5= 'volume (cu km):' ( (lv_ck_6_0= RULE_DOUBLE ) ) otherlv_7= '}' )
            // InternalMyWorldDsl.g:382:3: otherlv_0= 'Sea' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'area (sq km):' ( (lv_area_4_0= RULE_DOUBLE ) ) otherlv_5= 'volume (cu km):' ( (lv_ck_6_0= RULE_DOUBLE ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSeaAccess().getSeaKeyword_0());
            		
            // InternalMyWorldDsl.g:386:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyWorldDsl.g:387:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyWorldDsl.g:387:4: (lv_name_1_0= RULE_ID )
            // InternalMyWorldDsl.g:388:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSeaAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSeaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSeaAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getSeaAccess().getAreaSqKmKeyword_3());
            		
            // InternalMyWorldDsl.g:412:3: ( (lv_area_4_0= RULE_DOUBLE ) )
            // InternalMyWorldDsl.g:413:4: (lv_area_4_0= RULE_DOUBLE )
            {
            // InternalMyWorldDsl.g:413:4: (lv_area_4_0= RULE_DOUBLE )
            // InternalMyWorldDsl.g:414:5: lv_area_4_0= RULE_DOUBLE
            {
            lv_area_4_0=(Token)match(input,RULE_DOUBLE,FOLLOW_8); 

            					newLeafNode(lv_area_4_0, grammarAccess.getSeaAccess().getAreaDOUBLETerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSeaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"area",
            						lv_area_4_0,
            						"lsi.us.es.mis.xtext.MyWorldDsl.DOUBLE");
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getSeaAccess().getVolumeCuKmKeyword_5());
            		
            // InternalMyWorldDsl.g:434:3: ( (lv_ck_6_0= RULE_DOUBLE ) )
            // InternalMyWorldDsl.g:435:4: (lv_ck_6_0= RULE_DOUBLE )
            {
            // InternalMyWorldDsl.g:435:4: (lv_ck_6_0= RULE_DOUBLE )
            // InternalMyWorldDsl.g:436:5: lv_ck_6_0= RULE_DOUBLE
            {
            lv_ck_6_0=(Token)match(input,RULE_DOUBLE,FOLLOW_9); 

            					newLeafNode(lv_ck_6_0, grammarAccess.getSeaAccess().getCkDOUBLETerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSeaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ck",
            						lv_ck_6_0,
            						"lsi.us.es.mis.xtext.MyWorldDsl.DOUBLE");
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSeaAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleSea"


    // $ANTLR start "entryRuleContinent"
    // InternalMyWorldDsl.g:460:1: entryRuleContinent returns [EObject current=null] : iv_ruleContinent= ruleContinent EOF ;
    public final EObject entryRuleContinent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContinent = null;


        try {
            // InternalMyWorldDsl.g:460:50: (iv_ruleContinent= ruleContinent EOF )
            // InternalMyWorldDsl.g:461:2: iv_ruleContinent= ruleContinent EOF
            {
             newCompositeNode(grammarAccess.getContinentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContinent=ruleContinent();

            state._fsp--;

             current =iv_ruleContinent; 
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
    // $ANTLR end "entryRuleContinent"


    // $ANTLR start "ruleContinent"
    // InternalMyWorldDsl.g:467:1: ruleContinent returns [EObject current=null] : (otherlv_0= 'Continent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'area (sq km):' ( (lv_area_4_0= RULE_DOUBLE ) ) ( (lv_countries_5_0= ruleCountry ) )+ otherlv_6= '}' ) ;
    public final EObject ruleContinent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_area_4_0=null;
        Token otherlv_6=null;
        EObject lv_countries_5_0 = null;



        	enterRule();

        try {
            // InternalMyWorldDsl.g:473:2: ( (otherlv_0= 'Continent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'area (sq km):' ( (lv_area_4_0= RULE_DOUBLE ) ) ( (lv_countries_5_0= ruleCountry ) )+ otherlv_6= '}' ) )
            // InternalMyWorldDsl.g:474:2: (otherlv_0= 'Continent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'area (sq km):' ( (lv_area_4_0= RULE_DOUBLE ) ) ( (lv_countries_5_0= ruleCountry ) )+ otherlv_6= '}' )
            {
            // InternalMyWorldDsl.g:474:2: (otherlv_0= 'Continent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'area (sq km):' ( (lv_area_4_0= RULE_DOUBLE ) ) ( (lv_countries_5_0= ruleCountry ) )+ otherlv_6= '}' )
            // InternalMyWorldDsl.g:475:3: otherlv_0= 'Continent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'area (sq km):' ( (lv_area_4_0= RULE_DOUBLE ) ) ( (lv_countries_5_0= ruleCountry ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getContinentAccess().getContinentKeyword_0());
            		
            // InternalMyWorldDsl.g:479:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyWorldDsl.g:480:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyWorldDsl.g:480:4: (lv_name_1_0= RULE_ID )
            // InternalMyWorldDsl.g:481:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getContinentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContinentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getContinentAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getContinentAccess().getAreaSqKmKeyword_3());
            		
            // InternalMyWorldDsl.g:505:3: ( (lv_area_4_0= RULE_DOUBLE ) )
            // InternalMyWorldDsl.g:506:4: (lv_area_4_0= RULE_DOUBLE )
            {
            // InternalMyWorldDsl.g:506:4: (lv_area_4_0= RULE_DOUBLE )
            // InternalMyWorldDsl.g:507:5: lv_area_4_0= RULE_DOUBLE
            {
            lv_area_4_0=(Token)match(input,RULE_DOUBLE,FOLLOW_10); 

            					newLeafNode(lv_area_4_0, grammarAccess.getContinentAccess().getAreaDOUBLETerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContinentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"area",
            						lv_area_4_0,
            						"lsi.us.es.mis.xtext.MyWorldDsl.DOUBLE");
            				

            }


            }

            // InternalMyWorldDsl.g:523:3: ( (lv_countries_5_0= ruleCountry ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyWorldDsl.g:524:4: (lv_countries_5_0= ruleCountry )
            	    {
            	    // InternalMyWorldDsl.g:524:4: (lv_countries_5_0= ruleCountry )
            	    // InternalMyWorldDsl.g:525:5: lv_countries_5_0= ruleCountry
            	    {

            	    					newCompositeNode(grammarAccess.getContinentAccess().getCountriesCountryParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_countries_5_0=ruleCountry();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContinentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"countries",
            	    						lv_countries_5_0,
            	    						"lsi.us.es.mis.xtext.MyWorldDsl.Country");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getContinentAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleContinent"


    // $ANTLR start "entryRuleCountry"
    // InternalMyWorldDsl.g:550:1: entryRuleCountry returns [EObject current=null] : iv_ruleCountry= ruleCountry EOF ;
    public final EObject entryRuleCountry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountry = null;


        try {
            // InternalMyWorldDsl.g:550:48: (iv_ruleCountry= ruleCountry EOF )
            // InternalMyWorldDsl.g:551:2: iv_ruleCountry= ruleCountry EOF
            {
             newCompositeNode(grammarAccess.getCountryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCountry=ruleCountry();

            state._fsp--;

             current =iv_ruleCountry; 
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
    // $ANTLR end "entryRuleCountry"


    // $ANTLR start "ruleCountry"
    // InternalMyWorldDsl.g:557:1: ruleCountry returns [EObject current=null] : (otherlv_0= 'Country' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'area (sq km):' ( (lv_area_4_0= RULE_DOUBLE ) ) ( (lv_peaceful_5_0= 'peaceful' ) )? otherlv_6= 'population:' ( (lv_population_7_0= RULE_DOUBLE ) ) (otherlv_8= 'borders:' ( (otherlv_9= RULE_ID ) )+ )? (otherlv_10= 'washedBy:' ( (otherlv_11= RULE_ID ) )* )* otherlv_12= '}' ) ;
    public final EObject ruleCountry() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_area_4_0=null;
        Token lv_peaceful_5_0=null;
        Token otherlv_6=null;
        Token lv_population_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalMyWorldDsl.g:563:2: ( (otherlv_0= 'Country' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'area (sq km):' ( (lv_area_4_0= RULE_DOUBLE ) ) ( (lv_peaceful_5_0= 'peaceful' ) )? otherlv_6= 'population:' ( (lv_population_7_0= RULE_DOUBLE ) ) (otherlv_8= 'borders:' ( (otherlv_9= RULE_ID ) )+ )? (otherlv_10= 'washedBy:' ( (otherlv_11= RULE_ID ) )* )* otherlv_12= '}' ) )
            // InternalMyWorldDsl.g:564:2: (otherlv_0= 'Country' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'area (sq km):' ( (lv_area_4_0= RULE_DOUBLE ) ) ( (lv_peaceful_5_0= 'peaceful' ) )? otherlv_6= 'population:' ( (lv_population_7_0= RULE_DOUBLE ) ) (otherlv_8= 'borders:' ( (otherlv_9= RULE_ID ) )+ )? (otherlv_10= 'washedBy:' ( (otherlv_11= RULE_ID ) )* )* otherlv_12= '}' )
            {
            // InternalMyWorldDsl.g:564:2: (otherlv_0= 'Country' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'area (sq km):' ( (lv_area_4_0= RULE_DOUBLE ) ) ( (lv_peaceful_5_0= 'peaceful' ) )? otherlv_6= 'population:' ( (lv_population_7_0= RULE_DOUBLE ) ) (otherlv_8= 'borders:' ( (otherlv_9= RULE_ID ) )+ )? (otherlv_10= 'washedBy:' ( (otherlv_11= RULE_ID ) )* )* otherlv_12= '}' )
            // InternalMyWorldDsl.g:565:3: otherlv_0= 'Country' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'area (sq km):' ( (lv_area_4_0= RULE_DOUBLE ) ) ( (lv_peaceful_5_0= 'peaceful' ) )? otherlv_6= 'population:' ( (lv_population_7_0= RULE_DOUBLE ) ) (otherlv_8= 'borders:' ( (otherlv_9= RULE_ID ) )+ )? (otherlv_10= 'washedBy:' ( (otherlv_11= RULE_ID ) )* )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCountryAccess().getCountryKeyword_0());
            		
            // InternalMyWorldDsl.g:569:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyWorldDsl.g:570:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyWorldDsl.g:570:4: (lv_name_1_0= RULE_ID )
            // InternalMyWorldDsl.g:571:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCountryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCountryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCountryAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getCountryAccess().getAreaSqKmKeyword_3());
            		
            // InternalMyWorldDsl.g:595:3: ( (lv_area_4_0= RULE_DOUBLE ) )
            // InternalMyWorldDsl.g:596:4: (lv_area_4_0= RULE_DOUBLE )
            {
            // InternalMyWorldDsl.g:596:4: (lv_area_4_0= RULE_DOUBLE )
            // InternalMyWorldDsl.g:597:5: lv_area_4_0= RULE_DOUBLE
            {
            lv_area_4_0=(Token)match(input,RULE_DOUBLE,FOLLOW_12); 

            					newLeafNode(lv_area_4_0, grammarAccess.getCountryAccess().getAreaDOUBLETerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCountryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"area",
            						lv_area_4_0,
            						"lsi.us.es.mis.xtext.MyWorldDsl.DOUBLE");
            				

            }


            }

            // InternalMyWorldDsl.g:613:3: ( (lv_peaceful_5_0= 'peaceful' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyWorldDsl.g:614:4: (lv_peaceful_5_0= 'peaceful' )
                    {
                    // InternalMyWorldDsl.g:614:4: (lv_peaceful_5_0= 'peaceful' )
                    // InternalMyWorldDsl.g:615:5: lv_peaceful_5_0= 'peaceful'
                    {
                    lv_peaceful_5_0=(Token)match(input,21,FOLLOW_13); 

                    					newLeafNode(lv_peaceful_5_0, grammarAccess.getCountryAccess().getPeacefulPeacefulKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCountryRule());
                    					}
                    					setWithLastConsumed(current, "peaceful", true, "peaceful");
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getCountryAccess().getPopulationKeyword_6());
            		
            // InternalMyWorldDsl.g:631:3: ( (lv_population_7_0= RULE_DOUBLE ) )
            // InternalMyWorldDsl.g:632:4: (lv_population_7_0= RULE_DOUBLE )
            {
            // InternalMyWorldDsl.g:632:4: (lv_population_7_0= RULE_DOUBLE )
            // InternalMyWorldDsl.g:633:5: lv_population_7_0= RULE_DOUBLE
            {
            lv_population_7_0=(Token)match(input,RULE_DOUBLE,FOLLOW_14); 

            					newLeafNode(lv_population_7_0, grammarAccess.getCountryAccess().getPopulationDOUBLETerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCountryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"population",
            						lv_population_7_0,
            						"lsi.us.es.mis.xtext.MyWorldDsl.DOUBLE");
            				

            }


            }

            // InternalMyWorldDsl.g:649:3: (otherlv_8= 'borders:' ( (otherlv_9= RULE_ID ) )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyWorldDsl.g:650:4: otherlv_8= 'borders:' ( (otherlv_9= RULE_ID ) )+
                    {
                    otherlv_8=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getCountryAccess().getBordersKeyword_8_0());
                    			
                    // InternalMyWorldDsl.g:654:4: ( (otherlv_9= RULE_ID ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMyWorldDsl.g:655:5: (otherlv_9= RULE_ID )
                    	    {
                    	    // InternalMyWorldDsl.g:655:5: (otherlv_9= RULE_ID )
                    	    // InternalMyWorldDsl.g:656:6: otherlv_9= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getCountryRule());
                    	    						}
                    	    					
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_15); 

                    	    						newLeafNode(otherlv_9, grammarAccess.getCountryAccess().getBordersCountryCrossReference_8_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;

            }

            // InternalMyWorldDsl.g:668:3: (otherlv_10= 'washedBy:' ( (otherlv_11= RULE_ID ) )* )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyWorldDsl.g:669:4: otherlv_10= 'washedBy:' ( (otherlv_11= RULE_ID ) )*
            	    {
            	    otherlv_10=(Token)match(input,24,FOLLOW_15); 

            	    				newLeafNode(otherlv_10, grammarAccess.getCountryAccess().getWashedByKeyword_9_0());
            	    			
            	    // InternalMyWorldDsl.g:673:4: ( (otherlv_11= RULE_ID ) )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==RULE_ID) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalMyWorldDsl.g:674:5: (otherlv_11= RULE_ID )
            	    	    {
            	    	    // InternalMyWorldDsl.g:674:5: (otherlv_11= RULE_ID )
            	    	    // InternalMyWorldDsl.g:675:6: otherlv_11= RULE_ID
            	    	    {

            	    	    						if (current==null) {
            	    	    							current = createModelElement(grammarAccess.getCountryRule());
            	    	    						}
            	    	    					
            	    	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    	    						newLeafNode(otherlv_11, grammarAccess.getCountryAccess().getWashedByWaterCrossReference_9_1_0());
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop8;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getCountryAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleCountry"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000E1002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001810000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001010010L});

}