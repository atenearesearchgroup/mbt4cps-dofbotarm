package lsi.us.es.mis.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import lsi.us.es.mis.xtext.services.MyWorldDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyWorldDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOUBLE", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Ocean'", "'{'", "'area (sq km):'", "'volume (cu km):'", "'}'", "'Lake'", "'Sea'", "'Continent'", "'Country'", "'population:'", "'borders:'", "'washedBy:'", "'peaceful'"
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

    	public void setGrammarAccess(MyWorldDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleWorld"
    // InternalMyWorldDsl.g:53:1: entryRuleWorld : ruleWorld EOF ;
    public final void entryRuleWorld() throws RecognitionException {
        try {
            // InternalMyWorldDsl.g:54:1: ( ruleWorld EOF )
            // InternalMyWorldDsl.g:55:1: ruleWorld EOF
            {
             before(grammarAccess.getWorldRule()); 
            pushFollow(FOLLOW_1);
            ruleWorld();

            state._fsp--;

             after(grammarAccess.getWorldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWorld"


    // $ANTLR start "ruleWorld"
    // InternalMyWorldDsl.g:62:1: ruleWorld : ( ( ( rule__World__SpacesAssignment ) ) ( ( rule__World__SpacesAssignment )* ) ) ;
    public final void ruleWorld() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:66:2: ( ( ( ( rule__World__SpacesAssignment ) ) ( ( rule__World__SpacesAssignment )* ) ) )
            // InternalMyWorldDsl.g:67:2: ( ( ( rule__World__SpacesAssignment ) ) ( ( rule__World__SpacesAssignment )* ) )
            {
            // InternalMyWorldDsl.g:67:2: ( ( ( rule__World__SpacesAssignment ) ) ( ( rule__World__SpacesAssignment )* ) )
            // InternalMyWorldDsl.g:68:3: ( ( rule__World__SpacesAssignment ) ) ( ( rule__World__SpacesAssignment )* )
            {
            // InternalMyWorldDsl.g:68:3: ( ( rule__World__SpacesAssignment ) )
            // InternalMyWorldDsl.g:69:4: ( rule__World__SpacesAssignment )
            {
             before(grammarAccess.getWorldAccess().getSpacesAssignment()); 
            // InternalMyWorldDsl.g:70:4: ( rule__World__SpacesAssignment )
            // InternalMyWorldDsl.g:70:5: rule__World__SpacesAssignment
            {
            pushFollow(FOLLOW_3);
            rule__World__SpacesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getWorldAccess().getSpacesAssignment()); 

            }

            // InternalMyWorldDsl.g:73:3: ( ( rule__World__SpacesAssignment )* )
            // InternalMyWorldDsl.g:74:4: ( rule__World__SpacesAssignment )*
            {
             before(grammarAccess.getWorldAccess().getSpacesAssignment()); 
            // InternalMyWorldDsl.g:75:4: ( rule__World__SpacesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||(LA1_0>=17 && LA1_0<=19)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyWorldDsl.g:75:5: rule__World__SpacesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__World__SpacesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getWorldAccess().getSpacesAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorld"


    // $ANTLR start "entryRuleSpace"
    // InternalMyWorldDsl.g:85:1: entryRuleSpace : ruleSpace EOF ;
    public final void entryRuleSpace() throws RecognitionException {
        try {
            // InternalMyWorldDsl.g:86:1: ( ruleSpace EOF )
            // InternalMyWorldDsl.g:87:1: ruleSpace EOF
            {
             before(grammarAccess.getSpaceRule()); 
            pushFollow(FOLLOW_1);
            ruleSpace();

            state._fsp--;

             after(grammarAccess.getSpaceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpace"


    // $ANTLR start "ruleSpace"
    // InternalMyWorldDsl.g:94:1: ruleSpace : ( ( rule__Space__Alternatives ) ) ;
    public final void ruleSpace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:98:2: ( ( ( rule__Space__Alternatives ) ) )
            // InternalMyWorldDsl.g:99:2: ( ( rule__Space__Alternatives ) )
            {
            // InternalMyWorldDsl.g:99:2: ( ( rule__Space__Alternatives ) )
            // InternalMyWorldDsl.g:100:3: ( rule__Space__Alternatives )
            {
             before(grammarAccess.getSpaceAccess().getAlternatives()); 
            // InternalMyWorldDsl.g:101:3: ( rule__Space__Alternatives )
            // InternalMyWorldDsl.g:101:4: rule__Space__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Space__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSpaceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpace"


    // $ANTLR start "entryRuleWater"
    // InternalMyWorldDsl.g:110:1: entryRuleWater : ruleWater EOF ;
    public final void entryRuleWater() throws RecognitionException {
        try {
            // InternalMyWorldDsl.g:111:1: ( ruleWater EOF )
            // InternalMyWorldDsl.g:112:1: ruleWater EOF
            {
             before(grammarAccess.getWaterRule()); 
            pushFollow(FOLLOW_1);
            ruleWater();

            state._fsp--;

             after(grammarAccess.getWaterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWater"


    // $ANTLR start "ruleWater"
    // InternalMyWorldDsl.g:119:1: ruleWater : ( ( rule__Water__Alternatives ) ) ;
    public final void ruleWater() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:123:2: ( ( ( rule__Water__Alternatives ) ) )
            // InternalMyWorldDsl.g:124:2: ( ( rule__Water__Alternatives ) )
            {
            // InternalMyWorldDsl.g:124:2: ( ( rule__Water__Alternatives ) )
            // InternalMyWorldDsl.g:125:3: ( rule__Water__Alternatives )
            {
             before(grammarAccess.getWaterAccess().getAlternatives()); 
            // InternalMyWorldDsl.g:126:3: ( rule__Water__Alternatives )
            // InternalMyWorldDsl.g:126:4: rule__Water__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Water__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWaterAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWater"


    // $ANTLR start "entryRuleOcean"
    // InternalMyWorldDsl.g:135:1: entryRuleOcean : ruleOcean EOF ;
    public final void entryRuleOcean() throws RecognitionException {
        try {
            // InternalMyWorldDsl.g:136:1: ( ruleOcean EOF )
            // InternalMyWorldDsl.g:137:1: ruleOcean EOF
            {
             before(grammarAccess.getOceanRule()); 
            pushFollow(FOLLOW_1);
            ruleOcean();

            state._fsp--;

             after(grammarAccess.getOceanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOcean"


    // $ANTLR start "ruleOcean"
    // InternalMyWorldDsl.g:144:1: ruleOcean : ( ( rule__Ocean__Group__0 ) ) ;
    public final void ruleOcean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:148:2: ( ( ( rule__Ocean__Group__0 ) ) )
            // InternalMyWorldDsl.g:149:2: ( ( rule__Ocean__Group__0 ) )
            {
            // InternalMyWorldDsl.g:149:2: ( ( rule__Ocean__Group__0 ) )
            // InternalMyWorldDsl.g:150:3: ( rule__Ocean__Group__0 )
            {
             before(grammarAccess.getOceanAccess().getGroup()); 
            // InternalMyWorldDsl.g:151:3: ( rule__Ocean__Group__0 )
            // InternalMyWorldDsl.g:151:4: rule__Ocean__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ocean__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOceanAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOcean"


    // $ANTLR start "entryRuleLake"
    // InternalMyWorldDsl.g:160:1: entryRuleLake : ruleLake EOF ;
    public final void entryRuleLake() throws RecognitionException {
        try {
            // InternalMyWorldDsl.g:161:1: ( ruleLake EOF )
            // InternalMyWorldDsl.g:162:1: ruleLake EOF
            {
             before(grammarAccess.getLakeRule()); 
            pushFollow(FOLLOW_1);
            ruleLake();

            state._fsp--;

             after(grammarAccess.getLakeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLake"


    // $ANTLR start "ruleLake"
    // InternalMyWorldDsl.g:169:1: ruleLake : ( ( rule__Lake__Group__0 ) ) ;
    public final void ruleLake() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:173:2: ( ( ( rule__Lake__Group__0 ) ) )
            // InternalMyWorldDsl.g:174:2: ( ( rule__Lake__Group__0 ) )
            {
            // InternalMyWorldDsl.g:174:2: ( ( rule__Lake__Group__0 ) )
            // InternalMyWorldDsl.g:175:3: ( rule__Lake__Group__0 )
            {
             before(grammarAccess.getLakeAccess().getGroup()); 
            // InternalMyWorldDsl.g:176:3: ( rule__Lake__Group__0 )
            // InternalMyWorldDsl.g:176:4: rule__Lake__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Lake__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLakeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLake"


    // $ANTLR start "entryRuleSea"
    // InternalMyWorldDsl.g:185:1: entryRuleSea : ruleSea EOF ;
    public final void entryRuleSea() throws RecognitionException {
        try {
            // InternalMyWorldDsl.g:186:1: ( ruleSea EOF )
            // InternalMyWorldDsl.g:187:1: ruleSea EOF
            {
             before(grammarAccess.getSeaRule()); 
            pushFollow(FOLLOW_1);
            ruleSea();

            state._fsp--;

             after(grammarAccess.getSeaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSea"


    // $ANTLR start "ruleSea"
    // InternalMyWorldDsl.g:194:1: ruleSea : ( ( rule__Sea__Group__0 ) ) ;
    public final void ruleSea() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:198:2: ( ( ( rule__Sea__Group__0 ) ) )
            // InternalMyWorldDsl.g:199:2: ( ( rule__Sea__Group__0 ) )
            {
            // InternalMyWorldDsl.g:199:2: ( ( rule__Sea__Group__0 ) )
            // InternalMyWorldDsl.g:200:3: ( rule__Sea__Group__0 )
            {
             before(grammarAccess.getSeaAccess().getGroup()); 
            // InternalMyWorldDsl.g:201:3: ( rule__Sea__Group__0 )
            // InternalMyWorldDsl.g:201:4: rule__Sea__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sea__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSeaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSea"


    // $ANTLR start "entryRuleContinent"
    // InternalMyWorldDsl.g:210:1: entryRuleContinent : ruleContinent EOF ;
    public final void entryRuleContinent() throws RecognitionException {
        try {
            // InternalMyWorldDsl.g:211:1: ( ruleContinent EOF )
            // InternalMyWorldDsl.g:212:1: ruleContinent EOF
            {
             before(grammarAccess.getContinentRule()); 
            pushFollow(FOLLOW_1);
            ruleContinent();

            state._fsp--;

             after(grammarAccess.getContinentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContinent"


    // $ANTLR start "ruleContinent"
    // InternalMyWorldDsl.g:219:1: ruleContinent : ( ( rule__Continent__Group__0 ) ) ;
    public final void ruleContinent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:223:2: ( ( ( rule__Continent__Group__0 ) ) )
            // InternalMyWorldDsl.g:224:2: ( ( rule__Continent__Group__0 ) )
            {
            // InternalMyWorldDsl.g:224:2: ( ( rule__Continent__Group__0 ) )
            // InternalMyWorldDsl.g:225:3: ( rule__Continent__Group__0 )
            {
             before(grammarAccess.getContinentAccess().getGroup()); 
            // InternalMyWorldDsl.g:226:3: ( rule__Continent__Group__0 )
            // InternalMyWorldDsl.g:226:4: rule__Continent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Continent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContinentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContinent"


    // $ANTLR start "entryRuleCountry"
    // InternalMyWorldDsl.g:235:1: entryRuleCountry : ruleCountry EOF ;
    public final void entryRuleCountry() throws RecognitionException {
        try {
            // InternalMyWorldDsl.g:236:1: ( ruleCountry EOF )
            // InternalMyWorldDsl.g:237:1: ruleCountry EOF
            {
             before(grammarAccess.getCountryRule()); 
            pushFollow(FOLLOW_1);
            ruleCountry();

            state._fsp--;

             after(grammarAccess.getCountryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCountry"


    // $ANTLR start "ruleCountry"
    // InternalMyWorldDsl.g:244:1: ruleCountry : ( ( rule__Country__Group__0 ) ) ;
    public final void ruleCountry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:248:2: ( ( ( rule__Country__Group__0 ) ) )
            // InternalMyWorldDsl.g:249:2: ( ( rule__Country__Group__0 ) )
            {
            // InternalMyWorldDsl.g:249:2: ( ( rule__Country__Group__0 ) )
            // InternalMyWorldDsl.g:250:3: ( rule__Country__Group__0 )
            {
             before(grammarAccess.getCountryAccess().getGroup()); 
            // InternalMyWorldDsl.g:251:3: ( rule__Country__Group__0 )
            // InternalMyWorldDsl.g:251:4: rule__Country__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Country__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCountryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCountry"


    // $ANTLR start "rule__Space__Alternatives"
    // InternalMyWorldDsl.g:259:1: rule__Space__Alternatives : ( ( ruleContinent ) | ( ruleWater ) );
    public final void rule__Space__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:263:1: ( ( ruleContinent ) | ( ruleWater ) )
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
                    // InternalMyWorldDsl.g:264:2: ( ruleContinent )
                    {
                    // InternalMyWorldDsl.g:264:2: ( ruleContinent )
                    // InternalMyWorldDsl.g:265:3: ruleContinent
                    {
                     before(grammarAccess.getSpaceAccess().getContinentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleContinent();

                    state._fsp--;

                     after(grammarAccess.getSpaceAccess().getContinentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyWorldDsl.g:270:2: ( ruleWater )
                    {
                    // InternalMyWorldDsl.g:270:2: ( ruleWater )
                    // InternalMyWorldDsl.g:271:3: ruleWater
                    {
                     before(grammarAccess.getSpaceAccess().getWaterParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWater();

                    state._fsp--;

                     after(grammarAccess.getSpaceAccess().getWaterParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Space__Alternatives"


    // $ANTLR start "rule__Water__Alternatives"
    // InternalMyWorldDsl.g:280:1: rule__Water__Alternatives : ( ( ruleOcean ) | ( ruleLake ) | ( ruleSea ) );
    public final void rule__Water__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:284:1: ( ( ruleOcean ) | ( ruleLake ) | ( ruleSea ) )
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
                    // InternalMyWorldDsl.g:285:2: ( ruleOcean )
                    {
                    // InternalMyWorldDsl.g:285:2: ( ruleOcean )
                    // InternalMyWorldDsl.g:286:3: ruleOcean
                    {
                     before(grammarAccess.getWaterAccess().getOceanParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOcean();

                    state._fsp--;

                     after(grammarAccess.getWaterAccess().getOceanParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyWorldDsl.g:291:2: ( ruleLake )
                    {
                    // InternalMyWorldDsl.g:291:2: ( ruleLake )
                    // InternalMyWorldDsl.g:292:3: ruleLake
                    {
                     before(grammarAccess.getWaterAccess().getLakeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLake();

                    state._fsp--;

                     after(grammarAccess.getWaterAccess().getLakeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyWorldDsl.g:297:2: ( ruleSea )
                    {
                    // InternalMyWorldDsl.g:297:2: ( ruleSea )
                    // InternalMyWorldDsl.g:298:3: ruleSea
                    {
                     before(grammarAccess.getWaterAccess().getSeaParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSea();

                    state._fsp--;

                     after(grammarAccess.getWaterAccess().getSeaParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Water__Alternatives"


    // $ANTLR start "rule__Ocean__Group__0"
    // InternalMyWorldDsl.g:307:1: rule__Ocean__Group__0 : rule__Ocean__Group__0__Impl rule__Ocean__Group__1 ;
    public final void rule__Ocean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:311:1: ( rule__Ocean__Group__0__Impl rule__Ocean__Group__1 )
            // InternalMyWorldDsl.g:312:2: rule__Ocean__Group__0__Impl rule__Ocean__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Ocean__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ocean__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ocean__Group__0"


    // $ANTLR start "rule__Ocean__Group__0__Impl"
    // InternalMyWorldDsl.g:319:1: rule__Ocean__Group__0__Impl : ( 'Ocean' ) ;
    public final void rule__Ocean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:323:1: ( ( 'Ocean' ) )
            // InternalMyWorldDsl.g:324:1: ( 'Ocean' )
            {
            // InternalMyWorldDsl.g:324:1: ( 'Ocean' )
            // InternalMyWorldDsl.g:325:2: 'Ocean'
            {
             before(grammarAccess.getOceanAccess().getOceanKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getOceanAccess().getOceanKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ocean__Group__0__Impl"


    // $ANTLR start "rule__Ocean__Group__1"
    // InternalMyWorldDsl.g:334:1: rule__Ocean__Group__1 : rule__Ocean__Group__1__Impl rule__Ocean__Group__2 ;
    public final void rule__Ocean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:338:1: ( rule__Ocean__Group__1__Impl rule__Ocean__Group__2 )
            // InternalMyWorldDsl.g:339:2: rule__Ocean__Group__1__Impl rule__Ocean__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Ocean__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ocean__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ocean__Group__1"


    // $ANTLR start "rule__Ocean__Group__1__Impl"
    // InternalMyWorldDsl.g:346:1: rule__Ocean__Group__1__Impl : ( ( rule__Ocean__NameAssignment_1 ) ) ;
    public final void rule__Ocean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:350:1: ( ( ( rule__Ocean__NameAssignment_1 ) ) )
            // InternalMyWorldDsl.g:351:1: ( ( rule__Ocean__NameAssignment_1 ) )
            {
            // InternalMyWorldDsl.g:351:1: ( ( rule__Ocean__NameAssignment_1 ) )
            // InternalMyWorldDsl.g:352:2: ( rule__Ocean__NameAssignment_1 )
            {
             before(grammarAccess.getOceanAccess().getNameAssignment_1()); 
            // InternalMyWorldDsl.g:353:2: ( rule__Ocean__NameAssignment_1 )
            // InternalMyWorldDsl.g:353:3: rule__Ocean__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ocean__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOceanAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ocean__Group__1__Impl"


    // $ANTLR start "rule__Ocean__Group__2"
    // InternalMyWorldDsl.g:361:1: rule__Ocean__Group__2 : rule__Ocean__Group__2__Impl rule__Ocean__Group__3 ;
    public final void rule__Ocean__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:365:1: ( rule__Ocean__Group__2__Impl rule__Ocean__Group__3 )
            // InternalMyWorldDsl.g:366:2: rule__Ocean__Group__2__Impl rule__Ocean__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Ocean__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ocean__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ocean__Group__2"


    // $ANTLR start "rule__Ocean__Group__2__Impl"
    // InternalMyWorldDsl.g:373:1: rule__Ocean__Group__2__Impl : ( '{' ) ;
    public final void rule__Ocean__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:377:1: ( ( '{' ) )
            // InternalMyWorldDsl.g:378:1: ( '{' )
            {
            // InternalMyWorldDsl.g:378:1: ( '{' )
            // InternalMyWorldDsl.g:379:2: '{'
            {
             before(grammarAccess.getOceanAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getOceanAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ocean__Group__2__Impl"


    // $ANTLR start "rule__Ocean__Group__3"
    // InternalMyWorldDsl.g:388:1: rule__Ocean__Group__3 : rule__Ocean__Group__3__Impl rule__Ocean__Group__4 ;
    public final void rule__Ocean__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:392:1: ( rule__Ocean__Group__3__Impl rule__Ocean__Group__4 )
            // InternalMyWorldDsl.g:393:2: rule__Ocean__Group__3__Impl rule__Ocean__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Ocean__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ocean__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ocean__Group__3"


    // $ANTLR start "rule__Ocean__Group__3__Impl"
    // InternalMyWorldDsl.g:400:1: rule__Ocean__Group__3__Impl : ( 'area (sq km):' ) ;
    public final void rule__Ocean__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:404:1: ( ( 'area (sq km):' ) )
            // InternalMyWorldDsl.g:405:1: ( 'area (sq km):' )
            {
            // InternalMyWorldDsl.g:405:1: ( 'area (sq km):' )
            // InternalMyWorldDsl.g:406:2: 'area (sq km):'
            {
             before(grammarAccess.getOceanAccess().getAreaSqKmKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getOceanAccess().getAreaSqKmKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ocean__Group__3__Impl"


    // $ANTLR start "rule__Ocean__Group__4"
    // InternalMyWorldDsl.g:415:1: rule__Ocean__Group__4 : rule__Ocean__Group__4__Impl rule__Ocean__Group__5 ;
    public final void rule__Ocean__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:419:1: ( rule__Ocean__Group__4__Impl rule__Ocean__Group__5 )
            // InternalMyWorldDsl.g:420:2: rule__Ocean__Group__4__Impl rule__Ocean__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Ocean__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ocean__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ocean__Group__4"


    // $ANTLR start "rule__Ocean__Group__4__Impl"
    // InternalMyWorldDsl.g:427:1: rule__Ocean__Group__4__Impl : ( ( rule__Ocean__AreaAssignment_4 ) ) ;
    public final void rule__Ocean__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:431:1: ( ( ( rule__Ocean__AreaAssignment_4 ) ) )
            // InternalMyWorldDsl.g:432:1: ( ( rule__Ocean__AreaAssignment_4 ) )
            {
            // InternalMyWorldDsl.g:432:1: ( ( rule__Ocean__AreaAssignment_4 ) )
            // InternalMyWorldDsl.g:433:2: ( rule__Ocean__AreaAssignment_4 )
            {
             before(grammarAccess.getOceanAccess().getAreaAssignment_4()); 
            // InternalMyWorldDsl.g:434:2: ( rule__Ocean__AreaAssignment_4 )
            // InternalMyWorldDsl.g:434:3: rule__Ocean__AreaAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Ocean__AreaAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOceanAccess().getAreaAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ocean__Group__4__Impl"


    // $ANTLR start "rule__Ocean__Group__5"
    // InternalMyWorldDsl.g:442:1: rule__Ocean__Group__5 : rule__Ocean__Group__5__Impl rule__Ocean__Group__6 ;
    public final void rule__Ocean__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:446:1: ( rule__Ocean__Group__5__Impl rule__Ocean__Group__6 )
            // InternalMyWorldDsl.g:447:2: rule__Ocean__Group__5__Impl rule__Ocean__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Ocean__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ocean__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ocean__Group__5"


    // $ANTLR start "rule__Ocean__Group__5__Impl"
    // InternalMyWorldDsl.g:454:1: rule__Ocean__Group__5__Impl : ( 'volume (cu km):' ) ;
    public final void rule__Ocean__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:458:1: ( ( 'volume (cu km):' ) )
            // InternalMyWorldDsl.g:459:1: ( 'volume (cu km):' )
            {
            // InternalMyWorldDsl.g:459:1: ( 'volume (cu km):' )
            // InternalMyWorldDsl.g:460:2: 'volume (cu km):'
            {
             before(grammarAccess.getOceanAccess().getVolumeCuKmKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getOceanAccess().getVolumeCuKmKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ocean__Group__5__Impl"


    // $ANTLR start "rule__Ocean__Group__6"
    // InternalMyWorldDsl.g:469:1: rule__Ocean__Group__6 : rule__Ocean__Group__6__Impl rule__Ocean__Group__7 ;
    public final void rule__Ocean__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:473:1: ( rule__Ocean__Group__6__Impl rule__Ocean__Group__7 )
            // InternalMyWorldDsl.g:474:2: rule__Ocean__Group__6__Impl rule__Ocean__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Ocean__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ocean__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ocean__Group__6"


    // $ANTLR start "rule__Ocean__Group__6__Impl"
    // InternalMyWorldDsl.g:481:1: rule__Ocean__Group__6__Impl : ( ( rule__Ocean__CkAssignment_6 ) ) ;
    public final void rule__Ocean__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:485:1: ( ( ( rule__Ocean__CkAssignment_6 ) ) )
            // InternalMyWorldDsl.g:486:1: ( ( rule__Ocean__CkAssignment_6 ) )
            {
            // InternalMyWorldDsl.g:486:1: ( ( rule__Ocean__CkAssignment_6 ) )
            // InternalMyWorldDsl.g:487:2: ( rule__Ocean__CkAssignment_6 )
            {
             before(grammarAccess.getOceanAccess().getCkAssignment_6()); 
            // InternalMyWorldDsl.g:488:2: ( rule__Ocean__CkAssignment_6 )
            // InternalMyWorldDsl.g:488:3: rule__Ocean__CkAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Ocean__CkAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getOceanAccess().getCkAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ocean__Group__6__Impl"


    // $ANTLR start "rule__Ocean__Group__7"
    // InternalMyWorldDsl.g:496:1: rule__Ocean__Group__7 : rule__Ocean__Group__7__Impl ;
    public final void rule__Ocean__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:500:1: ( rule__Ocean__Group__7__Impl )
            // InternalMyWorldDsl.g:501:2: rule__Ocean__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ocean__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ocean__Group__7"


    // $ANTLR start "rule__Ocean__Group__7__Impl"
    // InternalMyWorldDsl.g:507:1: rule__Ocean__Group__7__Impl : ( '}' ) ;
    public final void rule__Ocean__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:511:1: ( ( '}' ) )
            // InternalMyWorldDsl.g:512:1: ( '}' )
            {
            // InternalMyWorldDsl.g:512:1: ( '}' )
            // InternalMyWorldDsl.g:513:2: '}'
            {
             before(grammarAccess.getOceanAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getOceanAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ocean__Group__7__Impl"


    // $ANTLR start "rule__Lake__Group__0"
    // InternalMyWorldDsl.g:523:1: rule__Lake__Group__0 : rule__Lake__Group__0__Impl rule__Lake__Group__1 ;
    public final void rule__Lake__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:527:1: ( rule__Lake__Group__0__Impl rule__Lake__Group__1 )
            // InternalMyWorldDsl.g:528:2: rule__Lake__Group__0__Impl rule__Lake__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Lake__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lake__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lake__Group__0"


    // $ANTLR start "rule__Lake__Group__0__Impl"
    // InternalMyWorldDsl.g:535:1: rule__Lake__Group__0__Impl : ( 'Lake' ) ;
    public final void rule__Lake__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:539:1: ( ( 'Lake' ) )
            // InternalMyWorldDsl.g:540:1: ( 'Lake' )
            {
            // InternalMyWorldDsl.g:540:1: ( 'Lake' )
            // InternalMyWorldDsl.g:541:2: 'Lake'
            {
             before(grammarAccess.getLakeAccess().getLakeKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLakeAccess().getLakeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lake__Group__0__Impl"


    // $ANTLR start "rule__Lake__Group__1"
    // InternalMyWorldDsl.g:550:1: rule__Lake__Group__1 : rule__Lake__Group__1__Impl rule__Lake__Group__2 ;
    public final void rule__Lake__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:554:1: ( rule__Lake__Group__1__Impl rule__Lake__Group__2 )
            // InternalMyWorldDsl.g:555:2: rule__Lake__Group__1__Impl rule__Lake__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Lake__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lake__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lake__Group__1"


    // $ANTLR start "rule__Lake__Group__1__Impl"
    // InternalMyWorldDsl.g:562:1: rule__Lake__Group__1__Impl : ( ( rule__Lake__NameAssignment_1 ) ) ;
    public final void rule__Lake__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:566:1: ( ( ( rule__Lake__NameAssignment_1 ) ) )
            // InternalMyWorldDsl.g:567:1: ( ( rule__Lake__NameAssignment_1 ) )
            {
            // InternalMyWorldDsl.g:567:1: ( ( rule__Lake__NameAssignment_1 ) )
            // InternalMyWorldDsl.g:568:2: ( rule__Lake__NameAssignment_1 )
            {
             before(grammarAccess.getLakeAccess().getNameAssignment_1()); 
            // InternalMyWorldDsl.g:569:2: ( rule__Lake__NameAssignment_1 )
            // InternalMyWorldDsl.g:569:3: rule__Lake__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Lake__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLakeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lake__Group__1__Impl"


    // $ANTLR start "rule__Lake__Group__2"
    // InternalMyWorldDsl.g:577:1: rule__Lake__Group__2 : rule__Lake__Group__2__Impl rule__Lake__Group__3 ;
    public final void rule__Lake__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:581:1: ( rule__Lake__Group__2__Impl rule__Lake__Group__3 )
            // InternalMyWorldDsl.g:582:2: rule__Lake__Group__2__Impl rule__Lake__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Lake__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lake__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lake__Group__2"


    // $ANTLR start "rule__Lake__Group__2__Impl"
    // InternalMyWorldDsl.g:589:1: rule__Lake__Group__2__Impl : ( '{' ) ;
    public final void rule__Lake__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:593:1: ( ( '{' ) )
            // InternalMyWorldDsl.g:594:1: ( '{' )
            {
            // InternalMyWorldDsl.g:594:1: ( '{' )
            // InternalMyWorldDsl.g:595:2: '{'
            {
             before(grammarAccess.getLakeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLakeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lake__Group__2__Impl"


    // $ANTLR start "rule__Lake__Group__3"
    // InternalMyWorldDsl.g:604:1: rule__Lake__Group__3 : rule__Lake__Group__3__Impl rule__Lake__Group__4 ;
    public final void rule__Lake__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:608:1: ( rule__Lake__Group__3__Impl rule__Lake__Group__4 )
            // InternalMyWorldDsl.g:609:2: rule__Lake__Group__3__Impl rule__Lake__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Lake__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lake__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lake__Group__3"


    // $ANTLR start "rule__Lake__Group__3__Impl"
    // InternalMyWorldDsl.g:616:1: rule__Lake__Group__3__Impl : ( 'area (sq km):' ) ;
    public final void rule__Lake__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:620:1: ( ( 'area (sq km):' ) )
            // InternalMyWorldDsl.g:621:1: ( 'area (sq km):' )
            {
            // InternalMyWorldDsl.g:621:1: ( 'area (sq km):' )
            // InternalMyWorldDsl.g:622:2: 'area (sq km):'
            {
             before(grammarAccess.getLakeAccess().getAreaSqKmKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLakeAccess().getAreaSqKmKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lake__Group__3__Impl"


    // $ANTLR start "rule__Lake__Group__4"
    // InternalMyWorldDsl.g:631:1: rule__Lake__Group__4 : rule__Lake__Group__4__Impl rule__Lake__Group__5 ;
    public final void rule__Lake__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:635:1: ( rule__Lake__Group__4__Impl rule__Lake__Group__5 )
            // InternalMyWorldDsl.g:636:2: rule__Lake__Group__4__Impl rule__Lake__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Lake__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lake__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lake__Group__4"


    // $ANTLR start "rule__Lake__Group__4__Impl"
    // InternalMyWorldDsl.g:643:1: rule__Lake__Group__4__Impl : ( ( rule__Lake__AreaAssignment_4 ) ) ;
    public final void rule__Lake__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:647:1: ( ( ( rule__Lake__AreaAssignment_4 ) ) )
            // InternalMyWorldDsl.g:648:1: ( ( rule__Lake__AreaAssignment_4 ) )
            {
            // InternalMyWorldDsl.g:648:1: ( ( rule__Lake__AreaAssignment_4 ) )
            // InternalMyWorldDsl.g:649:2: ( rule__Lake__AreaAssignment_4 )
            {
             before(grammarAccess.getLakeAccess().getAreaAssignment_4()); 
            // InternalMyWorldDsl.g:650:2: ( rule__Lake__AreaAssignment_4 )
            // InternalMyWorldDsl.g:650:3: rule__Lake__AreaAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Lake__AreaAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLakeAccess().getAreaAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lake__Group__4__Impl"


    // $ANTLR start "rule__Lake__Group__5"
    // InternalMyWorldDsl.g:658:1: rule__Lake__Group__5 : rule__Lake__Group__5__Impl rule__Lake__Group__6 ;
    public final void rule__Lake__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:662:1: ( rule__Lake__Group__5__Impl rule__Lake__Group__6 )
            // InternalMyWorldDsl.g:663:2: rule__Lake__Group__5__Impl rule__Lake__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Lake__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lake__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lake__Group__5"


    // $ANTLR start "rule__Lake__Group__5__Impl"
    // InternalMyWorldDsl.g:670:1: rule__Lake__Group__5__Impl : ( 'volume (cu km):' ) ;
    public final void rule__Lake__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:674:1: ( ( 'volume (cu km):' ) )
            // InternalMyWorldDsl.g:675:1: ( 'volume (cu km):' )
            {
            // InternalMyWorldDsl.g:675:1: ( 'volume (cu km):' )
            // InternalMyWorldDsl.g:676:2: 'volume (cu km):'
            {
             before(grammarAccess.getLakeAccess().getVolumeCuKmKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLakeAccess().getVolumeCuKmKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lake__Group__5__Impl"


    // $ANTLR start "rule__Lake__Group__6"
    // InternalMyWorldDsl.g:685:1: rule__Lake__Group__6 : rule__Lake__Group__6__Impl rule__Lake__Group__7 ;
    public final void rule__Lake__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:689:1: ( rule__Lake__Group__6__Impl rule__Lake__Group__7 )
            // InternalMyWorldDsl.g:690:2: rule__Lake__Group__6__Impl rule__Lake__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Lake__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lake__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lake__Group__6"


    // $ANTLR start "rule__Lake__Group__6__Impl"
    // InternalMyWorldDsl.g:697:1: rule__Lake__Group__6__Impl : ( ( rule__Lake__CkAssignment_6 ) ) ;
    public final void rule__Lake__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:701:1: ( ( ( rule__Lake__CkAssignment_6 ) ) )
            // InternalMyWorldDsl.g:702:1: ( ( rule__Lake__CkAssignment_6 ) )
            {
            // InternalMyWorldDsl.g:702:1: ( ( rule__Lake__CkAssignment_6 ) )
            // InternalMyWorldDsl.g:703:2: ( rule__Lake__CkAssignment_6 )
            {
             before(grammarAccess.getLakeAccess().getCkAssignment_6()); 
            // InternalMyWorldDsl.g:704:2: ( rule__Lake__CkAssignment_6 )
            // InternalMyWorldDsl.g:704:3: rule__Lake__CkAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Lake__CkAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getLakeAccess().getCkAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lake__Group__6__Impl"


    // $ANTLR start "rule__Lake__Group__7"
    // InternalMyWorldDsl.g:712:1: rule__Lake__Group__7 : rule__Lake__Group__7__Impl ;
    public final void rule__Lake__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:716:1: ( rule__Lake__Group__7__Impl )
            // InternalMyWorldDsl.g:717:2: rule__Lake__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lake__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lake__Group__7"


    // $ANTLR start "rule__Lake__Group__7__Impl"
    // InternalMyWorldDsl.g:723:1: rule__Lake__Group__7__Impl : ( '}' ) ;
    public final void rule__Lake__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:727:1: ( ( '}' ) )
            // InternalMyWorldDsl.g:728:1: ( '}' )
            {
            // InternalMyWorldDsl.g:728:1: ( '}' )
            // InternalMyWorldDsl.g:729:2: '}'
            {
             before(grammarAccess.getLakeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLakeAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lake__Group__7__Impl"


    // $ANTLR start "rule__Sea__Group__0"
    // InternalMyWorldDsl.g:739:1: rule__Sea__Group__0 : rule__Sea__Group__0__Impl rule__Sea__Group__1 ;
    public final void rule__Sea__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:743:1: ( rule__Sea__Group__0__Impl rule__Sea__Group__1 )
            // InternalMyWorldDsl.g:744:2: rule__Sea__Group__0__Impl rule__Sea__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Sea__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sea__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sea__Group__0"


    // $ANTLR start "rule__Sea__Group__0__Impl"
    // InternalMyWorldDsl.g:751:1: rule__Sea__Group__0__Impl : ( 'Sea' ) ;
    public final void rule__Sea__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:755:1: ( ( 'Sea' ) )
            // InternalMyWorldDsl.g:756:1: ( 'Sea' )
            {
            // InternalMyWorldDsl.g:756:1: ( 'Sea' )
            // InternalMyWorldDsl.g:757:2: 'Sea'
            {
             before(grammarAccess.getSeaAccess().getSeaKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSeaAccess().getSeaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sea__Group__0__Impl"


    // $ANTLR start "rule__Sea__Group__1"
    // InternalMyWorldDsl.g:766:1: rule__Sea__Group__1 : rule__Sea__Group__1__Impl rule__Sea__Group__2 ;
    public final void rule__Sea__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:770:1: ( rule__Sea__Group__1__Impl rule__Sea__Group__2 )
            // InternalMyWorldDsl.g:771:2: rule__Sea__Group__1__Impl rule__Sea__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Sea__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sea__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sea__Group__1"


    // $ANTLR start "rule__Sea__Group__1__Impl"
    // InternalMyWorldDsl.g:778:1: rule__Sea__Group__1__Impl : ( ( rule__Sea__NameAssignment_1 ) ) ;
    public final void rule__Sea__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:782:1: ( ( ( rule__Sea__NameAssignment_1 ) ) )
            // InternalMyWorldDsl.g:783:1: ( ( rule__Sea__NameAssignment_1 ) )
            {
            // InternalMyWorldDsl.g:783:1: ( ( rule__Sea__NameAssignment_1 ) )
            // InternalMyWorldDsl.g:784:2: ( rule__Sea__NameAssignment_1 )
            {
             before(grammarAccess.getSeaAccess().getNameAssignment_1()); 
            // InternalMyWorldDsl.g:785:2: ( rule__Sea__NameAssignment_1 )
            // InternalMyWorldDsl.g:785:3: rule__Sea__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sea__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSeaAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sea__Group__1__Impl"


    // $ANTLR start "rule__Sea__Group__2"
    // InternalMyWorldDsl.g:793:1: rule__Sea__Group__2 : rule__Sea__Group__2__Impl rule__Sea__Group__3 ;
    public final void rule__Sea__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:797:1: ( rule__Sea__Group__2__Impl rule__Sea__Group__3 )
            // InternalMyWorldDsl.g:798:2: rule__Sea__Group__2__Impl rule__Sea__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Sea__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sea__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sea__Group__2"


    // $ANTLR start "rule__Sea__Group__2__Impl"
    // InternalMyWorldDsl.g:805:1: rule__Sea__Group__2__Impl : ( '{' ) ;
    public final void rule__Sea__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:809:1: ( ( '{' ) )
            // InternalMyWorldDsl.g:810:1: ( '{' )
            {
            // InternalMyWorldDsl.g:810:1: ( '{' )
            // InternalMyWorldDsl.g:811:2: '{'
            {
             before(grammarAccess.getSeaAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSeaAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sea__Group__2__Impl"


    // $ANTLR start "rule__Sea__Group__3"
    // InternalMyWorldDsl.g:820:1: rule__Sea__Group__3 : rule__Sea__Group__3__Impl rule__Sea__Group__4 ;
    public final void rule__Sea__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:824:1: ( rule__Sea__Group__3__Impl rule__Sea__Group__4 )
            // InternalMyWorldDsl.g:825:2: rule__Sea__Group__3__Impl rule__Sea__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Sea__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sea__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sea__Group__3"


    // $ANTLR start "rule__Sea__Group__3__Impl"
    // InternalMyWorldDsl.g:832:1: rule__Sea__Group__3__Impl : ( 'area (sq km):' ) ;
    public final void rule__Sea__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:836:1: ( ( 'area (sq km):' ) )
            // InternalMyWorldDsl.g:837:1: ( 'area (sq km):' )
            {
            // InternalMyWorldDsl.g:837:1: ( 'area (sq km):' )
            // InternalMyWorldDsl.g:838:2: 'area (sq km):'
            {
             before(grammarAccess.getSeaAccess().getAreaSqKmKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSeaAccess().getAreaSqKmKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sea__Group__3__Impl"


    // $ANTLR start "rule__Sea__Group__4"
    // InternalMyWorldDsl.g:847:1: rule__Sea__Group__4 : rule__Sea__Group__4__Impl rule__Sea__Group__5 ;
    public final void rule__Sea__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:851:1: ( rule__Sea__Group__4__Impl rule__Sea__Group__5 )
            // InternalMyWorldDsl.g:852:2: rule__Sea__Group__4__Impl rule__Sea__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Sea__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sea__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sea__Group__4"


    // $ANTLR start "rule__Sea__Group__4__Impl"
    // InternalMyWorldDsl.g:859:1: rule__Sea__Group__4__Impl : ( ( rule__Sea__AreaAssignment_4 ) ) ;
    public final void rule__Sea__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:863:1: ( ( ( rule__Sea__AreaAssignment_4 ) ) )
            // InternalMyWorldDsl.g:864:1: ( ( rule__Sea__AreaAssignment_4 ) )
            {
            // InternalMyWorldDsl.g:864:1: ( ( rule__Sea__AreaAssignment_4 ) )
            // InternalMyWorldDsl.g:865:2: ( rule__Sea__AreaAssignment_4 )
            {
             before(grammarAccess.getSeaAccess().getAreaAssignment_4()); 
            // InternalMyWorldDsl.g:866:2: ( rule__Sea__AreaAssignment_4 )
            // InternalMyWorldDsl.g:866:3: rule__Sea__AreaAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Sea__AreaAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSeaAccess().getAreaAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sea__Group__4__Impl"


    // $ANTLR start "rule__Sea__Group__5"
    // InternalMyWorldDsl.g:874:1: rule__Sea__Group__5 : rule__Sea__Group__5__Impl rule__Sea__Group__6 ;
    public final void rule__Sea__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:878:1: ( rule__Sea__Group__5__Impl rule__Sea__Group__6 )
            // InternalMyWorldDsl.g:879:2: rule__Sea__Group__5__Impl rule__Sea__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Sea__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sea__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sea__Group__5"


    // $ANTLR start "rule__Sea__Group__5__Impl"
    // InternalMyWorldDsl.g:886:1: rule__Sea__Group__5__Impl : ( 'volume (cu km):' ) ;
    public final void rule__Sea__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:890:1: ( ( 'volume (cu km):' ) )
            // InternalMyWorldDsl.g:891:1: ( 'volume (cu km):' )
            {
            // InternalMyWorldDsl.g:891:1: ( 'volume (cu km):' )
            // InternalMyWorldDsl.g:892:2: 'volume (cu km):'
            {
             before(grammarAccess.getSeaAccess().getVolumeCuKmKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSeaAccess().getVolumeCuKmKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sea__Group__5__Impl"


    // $ANTLR start "rule__Sea__Group__6"
    // InternalMyWorldDsl.g:901:1: rule__Sea__Group__6 : rule__Sea__Group__6__Impl rule__Sea__Group__7 ;
    public final void rule__Sea__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:905:1: ( rule__Sea__Group__6__Impl rule__Sea__Group__7 )
            // InternalMyWorldDsl.g:906:2: rule__Sea__Group__6__Impl rule__Sea__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Sea__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sea__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sea__Group__6"


    // $ANTLR start "rule__Sea__Group__6__Impl"
    // InternalMyWorldDsl.g:913:1: rule__Sea__Group__6__Impl : ( ( rule__Sea__CkAssignment_6 ) ) ;
    public final void rule__Sea__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:917:1: ( ( ( rule__Sea__CkAssignment_6 ) ) )
            // InternalMyWorldDsl.g:918:1: ( ( rule__Sea__CkAssignment_6 ) )
            {
            // InternalMyWorldDsl.g:918:1: ( ( rule__Sea__CkAssignment_6 ) )
            // InternalMyWorldDsl.g:919:2: ( rule__Sea__CkAssignment_6 )
            {
             before(grammarAccess.getSeaAccess().getCkAssignment_6()); 
            // InternalMyWorldDsl.g:920:2: ( rule__Sea__CkAssignment_6 )
            // InternalMyWorldDsl.g:920:3: rule__Sea__CkAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Sea__CkAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSeaAccess().getCkAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sea__Group__6__Impl"


    // $ANTLR start "rule__Sea__Group__7"
    // InternalMyWorldDsl.g:928:1: rule__Sea__Group__7 : rule__Sea__Group__7__Impl ;
    public final void rule__Sea__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:932:1: ( rule__Sea__Group__7__Impl )
            // InternalMyWorldDsl.g:933:2: rule__Sea__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sea__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sea__Group__7"


    // $ANTLR start "rule__Sea__Group__7__Impl"
    // InternalMyWorldDsl.g:939:1: rule__Sea__Group__7__Impl : ( '}' ) ;
    public final void rule__Sea__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:943:1: ( ( '}' ) )
            // InternalMyWorldDsl.g:944:1: ( '}' )
            {
            // InternalMyWorldDsl.g:944:1: ( '}' )
            // InternalMyWorldDsl.g:945:2: '}'
            {
             before(grammarAccess.getSeaAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSeaAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sea__Group__7__Impl"


    // $ANTLR start "rule__Continent__Group__0"
    // InternalMyWorldDsl.g:955:1: rule__Continent__Group__0 : rule__Continent__Group__0__Impl rule__Continent__Group__1 ;
    public final void rule__Continent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:959:1: ( rule__Continent__Group__0__Impl rule__Continent__Group__1 )
            // InternalMyWorldDsl.g:960:2: rule__Continent__Group__0__Impl rule__Continent__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Continent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Continent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continent__Group__0"


    // $ANTLR start "rule__Continent__Group__0__Impl"
    // InternalMyWorldDsl.g:967:1: rule__Continent__Group__0__Impl : ( 'Continent' ) ;
    public final void rule__Continent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:971:1: ( ( 'Continent' ) )
            // InternalMyWorldDsl.g:972:1: ( 'Continent' )
            {
            // InternalMyWorldDsl.g:972:1: ( 'Continent' )
            // InternalMyWorldDsl.g:973:2: 'Continent'
            {
             before(grammarAccess.getContinentAccess().getContinentKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getContinentAccess().getContinentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continent__Group__0__Impl"


    // $ANTLR start "rule__Continent__Group__1"
    // InternalMyWorldDsl.g:982:1: rule__Continent__Group__1 : rule__Continent__Group__1__Impl rule__Continent__Group__2 ;
    public final void rule__Continent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:986:1: ( rule__Continent__Group__1__Impl rule__Continent__Group__2 )
            // InternalMyWorldDsl.g:987:2: rule__Continent__Group__1__Impl rule__Continent__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Continent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Continent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continent__Group__1"


    // $ANTLR start "rule__Continent__Group__1__Impl"
    // InternalMyWorldDsl.g:994:1: rule__Continent__Group__1__Impl : ( ( rule__Continent__NameAssignment_1 ) ) ;
    public final void rule__Continent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:998:1: ( ( ( rule__Continent__NameAssignment_1 ) ) )
            // InternalMyWorldDsl.g:999:1: ( ( rule__Continent__NameAssignment_1 ) )
            {
            // InternalMyWorldDsl.g:999:1: ( ( rule__Continent__NameAssignment_1 ) )
            // InternalMyWorldDsl.g:1000:2: ( rule__Continent__NameAssignment_1 )
            {
             before(grammarAccess.getContinentAccess().getNameAssignment_1()); 
            // InternalMyWorldDsl.g:1001:2: ( rule__Continent__NameAssignment_1 )
            // InternalMyWorldDsl.g:1001:3: rule__Continent__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Continent__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContinentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continent__Group__1__Impl"


    // $ANTLR start "rule__Continent__Group__2"
    // InternalMyWorldDsl.g:1009:1: rule__Continent__Group__2 : rule__Continent__Group__2__Impl rule__Continent__Group__3 ;
    public final void rule__Continent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1013:1: ( rule__Continent__Group__2__Impl rule__Continent__Group__3 )
            // InternalMyWorldDsl.g:1014:2: rule__Continent__Group__2__Impl rule__Continent__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Continent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Continent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continent__Group__2"


    // $ANTLR start "rule__Continent__Group__2__Impl"
    // InternalMyWorldDsl.g:1021:1: rule__Continent__Group__2__Impl : ( '{' ) ;
    public final void rule__Continent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1025:1: ( ( '{' ) )
            // InternalMyWorldDsl.g:1026:1: ( '{' )
            {
            // InternalMyWorldDsl.g:1026:1: ( '{' )
            // InternalMyWorldDsl.g:1027:2: '{'
            {
             before(grammarAccess.getContinentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getContinentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continent__Group__2__Impl"


    // $ANTLR start "rule__Continent__Group__3"
    // InternalMyWorldDsl.g:1036:1: rule__Continent__Group__3 : rule__Continent__Group__3__Impl rule__Continent__Group__4 ;
    public final void rule__Continent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1040:1: ( rule__Continent__Group__3__Impl rule__Continent__Group__4 )
            // InternalMyWorldDsl.g:1041:2: rule__Continent__Group__3__Impl rule__Continent__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Continent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Continent__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continent__Group__3"


    // $ANTLR start "rule__Continent__Group__3__Impl"
    // InternalMyWorldDsl.g:1048:1: rule__Continent__Group__3__Impl : ( 'area (sq km):' ) ;
    public final void rule__Continent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1052:1: ( ( 'area (sq km):' ) )
            // InternalMyWorldDsl.g:1053:1: ( 'area (sq km):' )
            {
            // InternalMyWorldDsl.g:1053:1: ( 'area (sq km):' )
            // InternalMyWorldDsl.g:1054:2: 'area (sq km):'
            {
             before(grammarAccess.getContinentAccess().getAreaSqKmKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getContinentAccess().getAreaSqKmKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continent__Group__3__Impl"


    // $ANTLR start "rule__Continent__Group__4"
    // InternalMyWorldDsl.g:1063:1: rule__Continent__Group__4 : rule__Continent__Group__4__Impl rule__Continent__Group__5 ;
    public final void rule__Continent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1067:1: ( rule__Continent__Group__4__Impl rule__Continent__Group__5 )
            // InternalMyWorldDsl.g:1068:2: rule__Continent__Group__4__Impl rule__Continent__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Continent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Continent__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continent__Group__4"


    // $ANTLR start "rule__Continent__Group__4__Impl"
    // InternalMyWorldDsl.g:1075:1: rule__Continent__Group__4__Impl : ( ( rule__Continent__AreaAssignment_4 ) ) ;
    public final void rule__Continent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1079:1: ( ( ( rule__Continent__AreaAssignment_4 ) ) )
            // InternalMyWorldDsl.g:1080:1: ( ( rule__Continent__AreaAssignment_4 ) )
            {
            // InternalMyWorldDsl.g:1080:1: ( ( rule__Continent__AreaAssignment_4 ) )
            // InternalMyWorldDsl.g:1081:2: ( rule__Continent__AreaAssignment_4 )
            {
             before(grammarAccess.getContinentAccess().getAreaAssignment_4()); 
            // InternalMyWorldDsl.g:1082:2: ( rule__Continent__AreaAssignment_4 )
            // InternalMyWorldDsl.g:1082:3: rule__Continent__AreaAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Continent__AreaAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getContinentAccess().getAreaAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continent__Group__4__Impl"


    // $ANTLR start "rule__Continent__Group__5"
    // InternalMyWorldDsl.g:1090:1: rule__Continent__Group__5 : rule__Continent__Group__5__Impl rule__Continent__Group__6 ;
    public final void rule__Continent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1094:1: ( rule__Continent__Group__5__Impl rule__Continent__Group__6 )
            // InternalMyWorldDsl.g:1095:2: rule__Continent__Group__5__Impl rule__Continent__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Continent__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Continent__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continent__Group__5"


    // $ANTLR start "rule__Continent__Group__5__Impl"
    // InternalMyWorldDsl.g:1102:1: rule__Continent__Group__5__Impl : ( ( ( rule__Continent__CountriesAssignment_5 ) ) ( ( rule__Continent__CountriesAssignment_5 )* ) ) ;
    public final void rule__Continent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1106:1: ( ( ( ( rule__Continent__CountriesAssignment_5 ) ) ( ( rule__Continent__CountriesAssignment_5 )* ) ) )
            // InternalMyWorldDsl.g:1107:1: ( ( ( rule__Continent__CountriesAssignment_5 ) ) ( ( rule__Continent__CountriesAssignment_5 )* ) )
            {
            // InternalMyWorldDsl.g:1107:1: ( ( ( rule__Continent__CountriesAssignment_5 ) ) ( ( rule__Continent__CountriesAssignment_5 )* ) )
            // InternalMyWorldDsl.g:1108:2: ( ( rule__Continent__CountriesAssignment_5 ) ) ( ( rule__Continent__CountriesAssignment_5 )* )
            {
            // InternalMyWorldDsl.g:1108:2: ( ( rule__Continent__CountriesAssignment_5 ) )
            // InternalMyWorldDsl.g:1109:3: ( rule__Continent__CountriesAssignment_5 )
            {
             before(grammarAccess.getContinentAccess().getCountriesAssignment_5()); 
            // InternalMyWorldDsl.g:1110:3: ( rule__Continent__CountriesAssignment_5 )
            // InternalMyWorldDsl.g:1110:4: rule__Continent__CountriesAssignment_5
            {
            pushFollow(FOLLOW_11);
            rule__Continent__CountriesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getContinentAccess().getCountriesAssignment_5()); 

            }

            // InternalMyWorldDsl.g:1113:2: ( ( rule__Continent__CountriesAssignment_5 )* )
            // InternalMyWorldDsl.g:1114:3: ( rule__Continent__CountriesAssignment_5 )*
            {
             before(grammarAccess.getContinentAccess().getCountriesAssignment_5()); 
            // InternalMyWorldDsl.g:1115:3: ( rule__Continent__CountriesAssignment_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyWorldDsl.g:1115:4: rule__Continent__CountriesAssignment_5
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Continent__CountriesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getContinentAccess().getCountriesAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continent__Group__5__Impl"


    // $ANTLR start "rule__Continent__Group__6"
    // InternalMyWorldDsl.g:1124:1: rule__Continent__Group__6 : rule__Continent__Group__6__Impl ;
    public final void rule__Continent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1128:1: ( rule__Continent__Group__6__Impl )
            // InternalMyWorldDsl.g:1129:2: rule__Continent__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Continent__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continent__Group__6"


    // $ANTLR start "rule__Continent__Group__6__Impl"
    // InternalMyWorldDsl.g:1135:1: rule__Continent__Group__6__Impl : ( '}' ) ;
    public final void rule__Continent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1139:1: ( ( '}' ) )
            // InternalMyWorldDsl.g:1140:1: ( '}' )
            {
            // InternalMyWorldDsl.g:1140:1: ( '}' )
            // InternalMyWorldDsl.g:1141:2: '}'
            {
             before(grammarAccess.getContinentAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getContinentAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continent__Group__6__Impl"


    // $ANTLR start "rule__Country__Group__0"
    // InternalMyWorldDsl.g:1151:1: rule__Country__Group__0 : rule__Country__Group__0__Impl rule__Country__Group__1 ;
    public final void rule__Country__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1155:1: ( rule__Country__Group__0__Impl rule__Country__Group__1 )
            // InternalMyWorldDsl.g:1156:2: rule__Country__Group__0__Impl rule__Country__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Country__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Country__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__0"


    // $ANTLR start "rule__Country__Group__0__Impl"
    // InternalMyWorldDsl.g:1163:1: rule__Country__Group__0__Impl : ( 'Country' ) ;
    public final void rule__Country__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1167:1: ( ( 'Country' ) )
            // InternalMyWorldDsl.g:1168:1: ( 'Country' )
            {
            // InternalMyWorldDsl.g:1168:1: ( 'Country' )
            // InternalMyWorldDsl.g:1169:2: 'Country'
            {
             before(grammarAccess.getCountryAccess().getCountryKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCountryAccess().getCountryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__0__Impl"


    // $ANTLR start "rule__Country__Group__1"
    // InternalMyWorldDsl.g:1178:1: rule__Country__Group__1 : rule__Country__Group__1__Impl rule__Country__Group__2 ;
    public final void rule__Country__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1182:1: ( rule__Country__Group__1__Impl rule__Country__Group__2 )
            // InternalMyWorldDsl.g:1183:2: rule__Country__Group__1__Impl rule__Country__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Country__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Country__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__1"


    // $ANTLR start "rule__Country__Group__1__Impl"
    // InternalMyWorldDsl.g:1190:1: rule__Country__Group__1__Impl : ( ( rule__Country__NameAssignment_1 ) ) ;
    public final void rule__Country__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1194:1: ( ( ( rule__Country__NameAssignment_1 ) ) )
            // InternalMyWorldDsl.g:1195:1: ( ( rule__Country__NameAssignment_1 ) )
            {
            // InternalMyWorldDsl.g:1195:1: ( ( rule__Country__NameAssignment_1 ) )
            // InternalMyWorldDsl.g:1196:2: ( rule__Country__NameAssignment_1 )
            {
             before(grammarAccess.getCountryAccess().getNameAssignment_1()); 
            // InternalMyWorldDsl.g:1197:2: ( rule__Country__NameAssignment_1 )
            // InternalMyWorldDsl.g:1197:3: rule__Country__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Country__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCountryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__1__Impl"


    // $ANTLR start "rule__Country__Group__2"
    // InternalMyWorldDsl.g:1205:1: rule__Country__Group__2 : rule__Country__Group__2__Impl rule__Country__Group__3 ;
    public final void rule__Country__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1209:1: ( rule__Country__Group__2__Impl rule__Country__Group__3 )
            // InternalMyWorldDsl.g:1210:2: rule__Country__Group__2__Impl rule__Country__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Country__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Country__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__2"


    // $ANTLR start "rule__Country__Group__2__Impl"
    // InternalMyWorldDsl.g:1217:1: rule__Country__Group__2__Impl : ( '{' ) ;
    public final void rule__Country__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1221:1: ( ( '{' ) )
            // InternalMyWorldDsl.g:1222:1: ( '{' )
            {
            // InternalMyWorldDsl.g:1222:1: ( '{' )
            // InternalMyWorldDsl.g:1223:2: '{'
            {
             before(grammarAccess.getCountryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCountryAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__2__Impl"


    // $ANTLR start "rule__Country__Group__3"
    // InternalMyWorldDsl.g:1232:1: rule__Country__Group__3 : rule__Country__Group__3__Impl rule__Country__Group__4 ;
    public final void rule__Country__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1236:1: ( rule__Country__Group__3__Impl rule__Country__Group__4 )
            // InternalMyWorldDsl.g:1237:2: rule__Country__Group__3__Impl rule__Country__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Country__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Country__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__3"


    // $ANTLR start "rule__Country__Group__3__Impl"
    // InternalMyWorldDsl.g:1244:1: rule__Country__Group__3__Impl : ( 'area (sq km):' ) ;
    public final void rule__Country__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1248:1: ( ( 'area (sq km):' ) )
            // InternalMyWorldDsl.g:1249:1: ( 'area (sq km):' )
            {
            // InternalMyWorldDsl.g:1249:1: ( 'area (sq km):' )
            // InternalMyWorldDsl.g:1250:2: 'area (sq km):'
            {
             before(grammarAccess.getCountryAccess().getAreaSqKmKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCountryAccess().getAreaSqKmKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__3__Impl"


    // $ANTLR start "rule__Country__Group__4"
    // InternalMyWorldDsl.g:1259:1: rule__Country__Group__4 : rule__Country__Group__4__Impl rule__Country__Group__5 ;
    public final void rule__Country__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1263:1: ( rule__Country__Group__4__Impl rule__Country__Group__5 )
            // InternalMyWorldDsl.g:1264:2: rule__Country__Group__4__Impl rule__Country__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Country__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Country__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__4"


    // $ANTLR start "rule__Country__Group__4__Impl"
    // InternalMyWorldDsl.g:1271:1: rule__Country__Group__4__Impl : ( ( rule__Country__AreaAssignment_4 ) ) ;
    public final void rule__Country__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1275:1: ( ( ( rule__Country__AreaAssignment_4 ) ) )
            // InternalMyWorldDsl.g:1276:1: ( ( rule__Country__AreaAssignment_4 ) )
            {
            // InternalMyWorldDsl.g:1276:1: ( ( rule__Country__AreaAssignment_4 ) )
            // InternalMyWorldDsl.g:1277:2: ( rule__Country__AreaAssignment_4 )
            {
             before(grammarAccess.getCountryAccess().getAreaAssignment_4()); 
            // InternalMyWorldDsl.g:1278:2: ( rule__Country__AreaAssignment_4 )
            // InternalMyWorldDsl.g:1278:3: rule__Country__AreaAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Country__AreaAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCountryAccess().getAreaAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__4__Impl"


    // $ANTLR start "rule__Country__Group__5"
    // InternalMyWorldDsl.g:1286:1: rule__Country__Group__5 : rule__Country__Group__5__Impl rule__Country__Group__6 ;
    public final void rule__Country__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1290:1: ( rule__Country__Group__5__Impl rule__Country__Group__6 )
            // InternalMyWorldDsl.g:1291:2: rule__Country__Group__5__Impl rule__Country__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Country__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Country__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__5"


    // $ANTLR start "rule__Country__Group__5__Impl"
    // InternalMyWorldDsl.g:1298:1: rule__Country__Group__5__Impl : ( ( rule__Country__PeacefulAssignment_5 )? ) ;
    public final void rule__Country__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1302:1: ( ( ( rule__Country__PeacefulAssignment_5 )? ) )
            // InternalMyWorldDsl.g:1303:1: ( ( rule__Country__PeacefulAssignment_5 )? )
            {
            // InternalMyWorldDsl.g:1303:1: ( ( rule__Country__PeacefulAssignment_5 )? )
            // InternalMyWorldDsl.g:1304:2: ( rule__Country__PeacefulAssignment_5 )?
            {
             before(grammarAccess.getCountryAccess().getPeacefulAssignment_5()); 
            // InternalMyWorldDsl.g:1305:2: ( rule__Country__PeacefulAssignment_5 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyWorldDsl.g:1305:3: rule__Country__PeacefulAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Country__PeacefulAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCountryAccess().getPeacefulAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__5__Impl"


    // $ANTLR start "rule__Country__Group__6"
    // InternalMyWorldDsl.g:1313:1: rule__Country__Group__6 : rule__Country__Group__6__Impl rule__Country__Group__7 ;
    public final void rule__Country__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1317:1: ( rule__Country__Group__6__Impl rule__Country__Group__7 )
            // InternalMyWorldDsl.g:1318:2: rule__Country__Group__6__Impl rule__Country__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Country__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Country__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__6"


    // $ANTLR start "rule__Country__Group__6__Impl"
    // InternalMyWorldDsl.g:1325:1: rule__Country__Group__6__Impl : ( 'population:' ) ;
    public final void rule__Country__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1329:1: ( ( 'population:' ) )
            // InternalMyWorldDsl.g:1330:1: ( 'population:' )
            {
            // InternalMyWorldDsl.g:1330:1: ( 'population:' )
            // InternalMyWorldDsl.g:1331:2: 'population:'
            {
             before(grammarAccess.getCountryAccess().getPopulationKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCountryAccess().getPopulationKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__6__Impl"


    // $ANTLR start "rule__Country__Group__7"
    // InternalMyWorldDsl.g:1340:1: rule__Country__Group__7 : rule__Country__Group__7__Impl rule__Country__Group__8 ;
    public final void rule__Country__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1344:1: ( rule__Country__Group__7__Impl rule__Country__Group__8 )
            // InternalMyWorldDsl.g:1345:2: rule__Country__Group__7__Impl rule__Country__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__Country__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Country__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__7"


    // $ANTLR start "rule__Country__Group__7__Impl"
    // InternalMyWorldDsl.g:1352:1: rule__Country__Group__7__Impl : ( ( rule__Country__PopulationAssignment_7 ) ) ;
    public final void rule__Country__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1356:1: ( ( ( rule__Country__PopulationAssignment_7 ) ) )
            // InternalMyWorldDsl.g:1357:1: ( ( rule__Country__PopulationAssignment_7 ) )
            {
            // InternalMyWorldDsl.g:1357:1: ( ( rule__Country__PopulationAssignment_7 ) )
            // InternalMyWorldDsl.g:1358:2: ( rule__Country__PopulationAssignment_7 )
            {
             before(grammarAccess.getCountryAccess().getPopulationAssignment_7()); 
            // InternalMyWorldDsl.g:1359:2: ( rule__Country__PopulationAssignment_7 )
            // InternalMyWorldDsl.g:1359:3: rule__Country__PopulationAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Country__PopulationAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getCountryAccess().getPopulationAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__7__Impl"


    // $ANTLR start "rule__Country__Group__8"
    // InternalMyWorldDsl.g:1367:1: rule__Country__Group__8 : rule__Country__Group__8__Impl rule__Country__Group__9 ;
    public final void rule__Country__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1371:1: ( rule__Country__Group__8__Impl rule__Country__Group__9 )
            // InternalMyWorldDsl.g:1372:2: rule__Country__Group__8__Impl rule__Country__Group__9
            {
            pushFollow(FOLLOW_13);
            rule__Country__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Country__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__8"


    // $ANTLR start "rule__Country__Group__8__Impl"
    // InternalMyWorldDsl.g:1379:1: rule__Country__Group__8__Impl : ( ( rule__Country__Group_8__0 )? ) ;
    public final void rule__Country__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1383:1: ( ( ( rule__Country__Group_8__0 )? ) )
            // InternalMyWorldDsl.g:1384:1: ( ( rule__Country__Group_8__0 )? )
            {
            // InternalMyWorldDsl.g:1384:1: ( ( rule__Country__Group_8__0 )? )
            // InternalMyWorldDsl.g:1385:2: ( rule__Country__Group_8__0 )?
            {
             before(grammarAccess.getCountryAccess().getGroup_8()); 
            // InternalMyWorldDsl.g:1386:2: ( rule__Country__Group_8__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyWorldDsl.g:1386:3: rule__Country__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Country__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCountryAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__8__Impl"


    // $ANTLR start "rule__Country__Group__9"
    // InternalMyWorldDsl.g:1394:1: rule__Country__Group__9 : rule__Country__Group__9__Impl rule__Country__Group__10 ;
    public final void rule__Country__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1398:1: ( rule__Country__Group__9__Impl rule__Country__Group__10 )
            // InternalMyWorldDsl.g:1399:2: rule__Country__Group__9__Impl rule__Country__Group__10
            {
            pushFollow(FOLLOW_13);
            rule__Country__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Country__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__9"


    // $ANTLR start "rule__Country__Group__9__Impl"
    // InternalMyWorldDsl.g:1406:1: rule__Country__Group__9__Impl : ( ( rule__Country__Group_9__0 )* ) ;
    public final void rule__Country__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1410:1: ( ( ( rule__Country__Group_9__0 )* ) )
            // InternalMyWorldDsl.g:1411:1: ( ( rule__Country__Group_9__0 )* )
            {
            // InternalMyWorldDsl.g:1411:1: ( ( rule__Country__Group_9__0 )* )
            // InternalMyWorldDsl.g:1412:2: ( rule__Country__Group_9__0 )*
            {
             before(grammarAccess.getCountryAccess().getGroup_9()); 
            // InternalMyWorldDsl.g:1413:2: ( rule__Country__Group_9__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyWorldDsl.g:1413:3: rule__Country__Group_9__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Country__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getCountryAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__9__Impl"


    // $ANTLR start "rule__Country__Group__10"
    // InternalMyWorldDsl.g:1421:1: rule__Country__Group__10 : rule__Country__Group__10__Impl ;
    public final void rule__Country__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1425:1: ( rule__Country__Group__10__Impl )
            // InternalMyWorldDsl.g:1426:2: rule__Country__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Country__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__10"


    // $ANTLR start "rule__Country__Group__10__Impl"
    // InternalMyWorldDsl.g:1432:1: rule__Country__Group__10__Impl : ( '}' ) ;
    public final void rule__Country__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1436:1: ( ( '}' ) )
            // InternalMyWorldDsl.g:1437:1: ( '}' )
            {
            // InternalMyWorldDsl.g:1437:1: ( '}' )
            // InternalMyWorldDsl.g:1438:2: '}'
            {
             before(grammarAccess.getCountryAccess().getRightCurlyBracketKeyword_10()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCountryAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__10__Impl"


    // $ANTLR start "rule__Country__Group_8__0"
    // InternalMyWorldDsl.g:1448:1: rule__Country__Group_8__0 : rule__Country__Group_8__0__Impl rule__Country__Group_8__1 ;
    public final void rule__Country__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1452:1: ( rule__Country__Group_8__0__Impl rule__Country__Group_8__1 )
            // InternalMyWorldDsl.g:1453:2: rule__Country__Group_8__0__Impl rule__Country__Group_8__1
            {
            pushFollow(FOLLOW_4);
            rule__Country__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Country__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group_8__0"


    // $ANTLR start "rule__Country__Group_8__0__Impl"
    // InternalMyWorldDsl.g:1460:1: rule__Country__Group_8__0__Impl : ( 'borders:' ) ;
    public final void rule__Country__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1464:1: ( ( 'borders:' ) )
            // InternalMyWorldDsl.g:1465:1: ( 'borders:' )
            {
            // InternalMyWorldDsl.g:1465:1: ( 'borders:' )
            // InternalMyWorldDsl.g:1466:2: 'borders:'
            {
             before(grammarAccess.getCountryAccess().getBordersKeyword_8_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCountryAccess().getBordersKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group_8__0__Impl"


    // $ANTLR start "rule__Country__Group_8__1"
    // InternalMyWorldDsl.g:1475:1: rule__Country__Group_8__1 : rule__Country__Group_8__1__Impl ;
    public final void rule__Country__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1479:1: ( rule__Country__Group_8__1__Impl )
            // InternalMyWorldDsl.g:1480:2: rule__Country__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Country__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group_8__1"


    // $ANTLR start "rule__Country__Group_8__1__Impl"
    // InternalMyWorldDsl.g:1486:1: rule__Country__Group_8__1__Impl : ( ( ( rule__Country__BordersAssignment_8_1 ) ) ( ( rule__Country__BordersAssignment_8_1 )* ) ) ;
    public final void rule__Country__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1490:1: ( ( ( ( rule__Country__BordersAssignment_8_1 ) ) ( ( rule__Country__BordersAssignment_8_1 )* ) ) )
            // InternalMyWorldDsl.g:1491:1: ( ( ( rule__Country__BordersAssignment_8_1 ) ) ( ( rule__Country__BordersAssignment_8_1 )* ) )
            {
            // InternalMyWorldDsl.g:1491:1: ( ( ( rule__Country__BordersAssignment_8_1 ) ) ( ( rule__Country__BordersAssignment_8_1 )* ) )
            // InternalMyWorldDsl.g:1492:2: ( ( rule__Country__BordersAssignment_8_1 ) ) ( ( rule__Country__BordersAssignment_8_1 )* )
            {
            // InternalMyWorldDsl.g:1492:2: ( ( rule__Country__BordersAssignment_8_1 ) )
            // InternalMyWorldDsl.g:1493:3: ( rule__Country__BordersAssignment_8_1 )
            {
             before(grammarAccess.getCountryAccess().getBordersAssignment_8_1()); 
            // InternalMyWorldDsl.g:1494:3: ( rule__Country__BordersAssignment_8_1 )
            // InternalMyWorldDsl.g:1494:4: rule__Country__BordersAssignment_8_1
            {
            pushFollow(FOLLOW_15);
            rule__Country__BordersAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getCountryAccess().getBordersAssignment_8_1()); 

            }

            // InternalMyWorldDsl.g:1497:2: ( ( rule__Country__BordersAssignment_8_1 )* )
            // InternalMyWorldDsl.g:1498:3: ( rule__Country__BordersAssignment_8_1 )*
            {
             before(grammarAccess.getCountryAccess().getBordersAssignment_8_1()); 
            // InternalMyWorldDsl.g:1499:3: ( rule__Country__BordersAssignment_8_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyWorldDsl.g:1499:4: rule__Country__BordersAssignment_8_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Country__BordersAssignment_8_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getCountryAccess().getBordersAssignment_8_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group_8__1__Impl"


    // $ANTLR start "rule__Country__Group_9__0"
    // InternalMyWorldDsl.g:1509:1: rule__Country__Group_9__0 : rule__Country__Group_9__0__Impl rule__Country__Group_9__1 ;
    public final void rule__Country__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1513:1: ( rule__Country__Group_9__0__Impl rule__Country__Group_9__1 )
            // InternalMyWorldDsl.g:1514:2: rule__Country__Group_9__0__Impl rule__Country__Group_9__1
            {
            pushFollow(FOLLOW_4);
            rule__Country__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Country__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group_9__0"


    // $ANTLR start "rule__Country__Group_9__0__Impl"
    // InternalMyWorldDsl.g:1521:1: rule__Country__Group_9__0__Impl : ( 'washedBy:' ) ;
    public final void rule__Country__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1525:1: ( ( 'washedBy:' ) )
            // InternalMyWorldDsl.g:1526:1: ( 'washedBy:' )
            {
            // InternalMyWorldDsl.g:1526:1: ( 'washedBy:' )
            // InternalMyWorldDsl.g:1527:2: 'washedBy:'
            {
             before(grammarAccess.getCountryAccess().getWashedByKeyword_9_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCountryAccess().getWashedByKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group_9__0__Impl"


    // $ANTLR start "rule__Country__Group_9__1"
    // InternalMyWorldDsl.g:1536:1: rule__Country__Group_9__1 : rule__Country__Group_9__1__Impl ;
    public final void rule__Country__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1540:1: ( rule__Country__Group_9__1__Impl )
            // InternalMyWorldDsl.g:1541:2: rule__Country__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Country__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group_9__1"


    // $ANTLR start "rule__Country__Group_9__1__Impl"
    // InternalMyWorldDsl.g:1547:1: rule__Country__Group_9__1__Impl : ( ( rule__Country__WashedByAssignment_9_1 )* ) ;
    public final void rule__Country__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1551:1: ( ( ( rule__Country__WashedByAssignment_9_1 )* ) )
            // InternalMyWorldDsl.g:1552:1: ( ( rule__Country__WashedByAssignment_9_1 )* )
            {
            // InternalMyWorldDsl.g:1552:1: ( ( rule__Country__WashedByAssignment_9_1 )* )
            // InternalMyWorldDsl.g:1553:2: ( rule__Country__WashedByAssignment_9_1 )*
            {
             before(grammarAccess.getCountryAccess().getWashedByAssignment_9_1()); 
            // InternalMyWorldDsl.g:1554:2: ( rule__Country__WashedByAssignment_9_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyWorldDsl.g:1554:3: rule__Country__WashedByAssignment_9_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Country__WashedByAssignment_9_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getCountryAccess().getWashedByAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group_9__1__Impl"


    // $ANTLR start "rule__World__SpacesAssignment"
    // InternalMyWorldDsl.g:1563:1: rule__World__SpacesAssignment : ( ruleSpace ) ;
    public final void rule__World__SpacesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1567:1: ( ( ruleSpace ) )
            // InternalMyWorldDsl.g:1568:2: ( ruleSpace )
            {
            // InternalMyWorldDsl.g:1568:2: ( ruleSpace )
            // InternalMyWorldDsl.g:1569:3: ruleSpace
            {
             before(grammarAccess.getWorldAccess().getSpacesSpaceParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSpace();

            state._fsp--;

             after(grammarAccess.getWorldAccess().getSpacesSpaceParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__World__SpacesAssignment"


    // $ANTLR start "rule__Ocean__NameAssignment_1"
    // InternalMyWorldDsl.g:1578:1: rule__Ocean__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Ocean__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1582:1: ( ( RULE_ID ) )
            // InternalMyWorldDsl.g:1583:2: ( RULE_ID )
            {
            // InternalMyWorldDsl.g:1583:2: ( RULE_ID )
            // InternalMyWorldDsl.g:1584:3: RULE_ID
            {
             before(grammarAccess.getOceanAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOceanAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ocean__NameAssignment_1"


    // $ANTLR start "rule__Ocean__AreaAssignment_4"
    // InternalMyWorldDsl.g:1593:1: rule__Ocean__AreaAssignment_4 : ( RULE_DOUBLE ) ;
    public final void rule__Ocean__AreaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1597:1: ( ( RULE_DOUBLE ) )
            // InternalMyWorldDsl.g:1598:2: ( RULE_DOUBLE )
            {
            // InternalMyWorldDsl.g:1598:2: ( RULE_DOUBLE )
            // InternalMyWorldDsl.g:1599:3: RULE_DOUBLE
            {
             before(grammarAccess.getOceanAccess().getAreaDOUBLETerminalRuleCall_4_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getOceanAccess().getAreaDOUBLETerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ocean__AreaAssignment_4"


    // $ANTLR start "rule__Ocean__CkAssignment_6"
    // InternalMyWorldDsl.g:1608:1: rule__Ocean__CkAssignment_6 : ( RULE_DOUBLE ) ;
    public final void rule__Ocean__CkAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1612:1: ( ( RULE_DOUBLE ) )
            // InternalMyWorldDsl.g:1613:2: ( RULE_DOUBLE )
            {
            // InternalMyWorldDsl.g:1613:2: ( RULE_DOUBLE )
            // InternalMyWorldDsl.g:1614:3: RULE_DOUBLE
            {
             before(grammarAccess.getOceanAccess().getCkDOUBLETerminalRuleCall_6_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getOceanAccess().getCkDOUBLETerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ocean__CkAssignment_6"


    // $ANTLR start "rule__Lake__NameAssignment_1"
    // InternalMyWorldDsl.g:1623:1: rule__Lake__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Lake__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1627:1: ( ( RULE_ID ) )
            // InternalMyWorldDsl.g:1628:2: ( RULE_ID )
            {
            // InternalMyWorldDsl.g:1628:2: ( RULE_ID )
            // InternalMyWorldDsl.g:1629:3: RULE_ID
            {
             before(grammarAccess.getLakeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLakeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lake__NameAssignment_1"


    // $ANTLR start "rule__Lake__AreaAssignment_4"
    // InternalMyWorldDsl.g:1638:1: rule__Lake__AreaAssignment_4 : ( RULE_DOUBLE ) ;
    public final void rule__Lake__AreaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1642:1: ( ( RULE_DOUBLE ) )
            // InternalMyWorldDsl.g:1643:2: ( RULE_DOUBLE )
            {
            // InternalMyWorldDsl.g:1643:2: ( RULE_DOUBLE )
            // InternalMyWorldDsl.g:1644:3: RULE_DOUBLE
            {
             before(grammarAccess.getLakeAccess().getAreaDOUBLETerminalRuleCall_4_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getLakeAccess().getAreaDOUBLETerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lake__AreaAssignment_4"


    // $ANTLR start "rule__Lake__CkAssignment_6"
    // InternalMyWorldDsl.g:1653:1: rule__Lake__CkAssignment_6 : ( RULE_DOUBLE ) ;
    public final void rule__Lake__CkAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1657:1: ( ( RULE_DOUBLE ) )
            // InternalMyWorldDsl.g:1658:2: ( RULE_DOUBLE )
            {
            // InternalMyWorldDsl.g:1658:2: ( RULE_DOUBLE )
            // InternalMyWorldDsl.g:1659:3: RULE_DOUBLE
            {
             before(grammarAccess.getLakeAccess().getCkDOUBLETerminalRuleCall_6_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getLakeAccess().getCkDOUBLETerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lake__CkAssignment_6"


    // $ANTLR start "rule__Sea__NameAssignment_1"
    // InternalMyWorldDsl.g:1668:1: rule__Sea__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sea__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1672:1: ( ( RULE_ID ) )
            // InternalMyWorldDsl.g:1673:2: ( RULE_ID )
            {
            // InternalMyWorldDsl.g:1673:2: ( RULE_ID )
            // InternalMyWorldDsl.g:1674:3: RULE_ID
            {
             before(grammarAccess.getSeaAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSeaAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sea__NameAssignment_1"


    // $ANTLR start "rule__Sea__AreaAssignment_4"
    // InternalMyWorldDsl.g:1683:1: rule__Sea__AreaAssignment_4 : ( RULE_DOUBLE ) ;
    public final void rule__Sea__AreaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1687:1: ( ( RULE_DOUBLE ) )
            // InternalMyWorldDsl.g:1688:2: ( RULE_DOUBLE )
            {
            // InternalMyWorldDsl.g:1688:2: ( RULE_DOUBLE )
            // InternalMyWorldDsl.g:1689:3: RULE_DOUBLE
            {
             before(grammarAccess.getSeaAccess().getAreaDOUBLETerminalRuleCall_4_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getSeaAccess().getAreaDOUBLETerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sea__AreaAssignment_4"


    // $ANTLR start "rule__Sea__CkAssignment_6"
    // InternalMyWorldDsl.g:1698:1: rule__Sea__CkAssignment_6 : ( RULE_DOUBLE ) ;
    public final void rule__Sea__CkAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1702:1: ( ( RULE_DOUBLE ) )
            // InternalMyWorldDsl.g:1703:2: ( RULE_DOUBLE )
            {
            // InternalMyWorldDsl.g:1703:2: ( RULE_DOUBLE )
            // InternalMyWorldDsl.g:1704:3: RULE_DOUBLE
            {
             before(grammarAccess.getSeaAccess().getCkDOUBLETerminalRuleCall_6_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getSeaAccess().getCkDOUBLETerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sea__CkAssignment_6"


    // $ANTLR start "rule__Continent__NameAssignment_1"
    // InternalMyWorldDsl.g:1713:1: rule__Continent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Continent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1717:1: ( ( RULE_ID ) )
            // InternalMyWorldDsl.g:1718:2: ( RULE_ID )
            {
            // InternalMyWorldDsl.g:1718:2: ( RULE_ID )
            // InternalMyWorldDsl.g:1719:3: RULE_ID
            {
             before(grammarAccess.getContinentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContinentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continent__NameAssignment_1"


    // $ANTLR start "rule__Continent__AreaAssignment_4"
    // InternalMyWorldDsl.g:1728:1: rule__Continent__AreaAssignment_4 : ( RULE_DOUBLE ) ;
    public final void rule__Continent__AreaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1732:1: ( ( RULE_DOUBLE ) )
            // InternalMyWorldDsl.g:1733:2: ( RULE_DOUBLE )
            {
            // InternalMyWorldDsl.g:1733:2: ( RULE_DOUBLE )
            // InternalMyWorldDsl.g:1734:3: RULE_DOUBLE
            {
             before(grammarAccess.getContinentAccess().getAreaDOUBLETerminalRuleCall_4_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getContinentAccess().getAreaDOUBLETerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continent__AreaAssignment_4"


    // $ANTLR start "rule__Continent__CountriesAssignment_5"
    // InternalMyWorldDsl.g:1743:1: rule__Continent__CountriesAssignment_5 : ( ruleCountry ) ;
    public final void rule__Continent__CountriesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1747:1: ( ( ruleCountry ) )
            // InternalMyWorldDsl.g:1748:2: ( ruleCountry )
            {
            // InternalMyWorldDsl.g:1748:2: ( ruleCountry )
            // InternalMyWorldDsl.g:1749:3: ruleCountry
            {
             before(grammarAccess.getContinentAccess().getCountriesCountryParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCountry();

            state._fsp--;

             after(grammarAccess.getContinentAccess().getCountriesCountryParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continent__CountriesAssignment_5"


    // $ANTLR start "rule__Country__NameAssignment_1"
    // InternalMyWorldDsl.g:1758:1: rule__Country__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Country__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1762:1: ( ( RULE_ID ) )
            // InternalMyWorldDsl.g:1763:2: ( RULE_ID )
            {
            // InternalMyWorldDsl.g:1763:2: ( RULE_ID )
            // InternalMyWorldDsl.g:1764:3: RULE_ID
            {
             before(grammarAccess.getCountryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCountryAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__NameAssignment_1"


    // $ANTLR start "rule__Country__AreaAssignment_4"
    // InternalMyWorldDsl.g:1773:1: rule__Country__AreaAssignment_4 : ( RULE_DOUBLE ) ;
    public final void rule__Country__AreaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1777:1: ( ( RULE_DOUBLE ) )
            // InternalMyWorldDsl.g:1778:2: ( RULE_DOUBLE )
            {
            // InternalMyWorldDsl.g:1778:2: ( RULE_DOUBLE )
            // InternalMyWorldDsl.g:1779:3: RULE_DOUBLE
            {
             before(grammarAccess.getCountryAccess().getAreaDOUBLETerminalRuleCall_4_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getCountryAccess().getAreaDOUBLETerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__AreaAssignment_4"


    // $ANTLR start "rule__Country__PeacefulAssignment_5"
    // InternalMyWorldDsl.g:1788:1: rule__Country__PeacefulAssignment_5 : ( ( 'peaceful' ) ) ;
    public final void rule__Country__PeacefulAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1792:1: ( ( ( 'peaceful' ) ) )
            // InternalMyWorldDsl.g:1793:2: ( ( 'peaceful' ) )
            {
            // InternalMyWorldDsl.g:1793:2: ( ( 'peaceful' ) )
            // InternalMyWorldDsl.g:1794:3: ( 'peaceful' )
            {
             before(grammarAccess.getCountryAccess().getPeacefulPeacefulKeyword_5_0()); 
            // InternalMyWorldDsl.g:1795:3: ( 'peaceful' )
            // InternalMyWorldDsl.g:1796:4: 'peaceful'
            {
             before(grammarAccess.getCountryAccess().getPeacefulPeacefulKeyword_5_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCountryAccess().getPeacefulPeacefulKeyword_5_0()); 

            }

             after(grammarAccess.getCountryAccess().getPeacefulPeacefulKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__PeacefulAssignment_5"


    // $ANTLR start "rule__Country__PopulationAssignment_7"
    // InternalMyWorldDsl.g:1807:1: rule__Country__PopulationAssignment_7 : ( RULE_DOUBLE ) ;
    public final void rule__Country__PopulationAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1811:1: ( ( RULE_DOUBLE ) )
            // InternalMyWorldDsl.g:1812:2: ( RULE_DOUBLE )
            {
            // InternalMyWorldDsl.g:1812:2: ( RULE_DOUBLE )
            // InternalMyWorldDsl.g:1813:3: RULE_DOUBLE
            {
             before(grammarAccess.getCountryAccess().getPopulationDOUBLETerminalRuleCall_7_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getCountryAccess().getPopulationDOUBLETerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__PopulationAssignment_7"


    // $ANTLR start "rule__Country__BordersAssignment_8_1"
    // InternalMyWorldDsl.g:1822:1: rule__Country__BordersAssignment_8_1 : ( ( RULE_ID ) ) ;
    public final void rule__Country__BordersAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1826:1: ( ( ( RULE_ID ) ) )
            // InternalMyWorldDsl.g:1827:2: ( ( RULE_ID ) )
            {
            // InternalMyWorldDsl.g:1827:2: ( ( RULE_ID ) )
            // InternalMyWorldDsl.g:1828:3: ( RULE_ID )
            {
             before(grammarAccess.getCountryAccess().getBordersCountryCrossReference_8_1_0()); 
            // InternalMyWorldDsl.g:1829:3: ( RULE_ID )
            // InternalMyWorldDsl.g:1830:4: RULE_ID
            {
             before(grammarAccess.getCountryAccess().getBordersCountryIDTerminalRuleCall_8_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCountryAccess().getBordersCountryIDTerminalRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getCountryAccess().getBordersCountryCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__BordersAssignment_8_1"


    // $ANTLR start "rule__Country__WashedByAssignment_9_1"
    // InternalMyWorldDsl.g:1841:1: rule__Country__WashedByAssignment_9_1 : ( ( RULE_ID ) ) ;
    public final void rule__Country__WashedByAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyWorldDsl.g:1845:1: ( ( ( RULE_ID ) ) )
            // InternalMyWorldDsl.g:1846:2: ( ( RULE_ID ) )
            {
            // InternalMyWorldDsl.g:1846:2: ( ( RULE_ID ) )
            // InternalMyWorldDsl.g:1847:3: ( RULE_ID )
            {
             before(grammarAccess.getCountryAccess().getWashedByWaterCrossReference_9_1_0()); 
            // InternalMyWorldDsl.g:1848:3: ( RULE_ID )
            // InternalMyWorldDsl.g:1849:4: RULE_ID
            {
             before(grammarAccess.getCountryAccess().getWashedByWaterIDTerminalRuleCall_9_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCountryAccess().getWashedByWaterIDTerminalRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getCountryAccess().getWashedByWaterCrossReference_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__WashedByAssignment_9_1"

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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000C10000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000012L});

}