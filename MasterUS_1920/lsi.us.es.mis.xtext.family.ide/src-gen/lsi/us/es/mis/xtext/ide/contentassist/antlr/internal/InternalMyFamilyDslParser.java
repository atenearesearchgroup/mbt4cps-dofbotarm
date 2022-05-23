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
import lsi.us.es.mis.xtext.services.MyFamilyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyFamilyDslParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(MyFamilyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleFamily"
    // InternalMyFamilyDsl.g:53:1: entryRuleFamily : ruleFamily EOF ;
    public final void entryRuleFamily() throws RecognitionException {
        try {
            // InternalMyFamilyDsl.g:54:1: ( ruleFamily EOF )
            // InternalMyFamilyDsl.g:55:1: ruleFamily EOF
            {
             before(grammarAccess.getFamilyRule()); 
            pushFollow(FOLLOW_1);
            ruleFamily();

            state._fsp--;

             after(grammarAccess.getFamilyRule()); 
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
    // $ANTLR end "entryRuleFamily"


    // $ANTLR start "ruleFamily"
    // InternalMyFamilyDsl.g:62:1: ruleFamily : ( ( rule__Family__Group__0 ) ) ;
    public final void ruleFamily() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:66:2: ( ( ( rule__Family__Group__0 ) ) )
            // InternalMyFamilyDsl.g:67:2: ( ( rule__Family__Group__0 ) )
            {
            // InternalMyFamilyDsl.g:67:2: ( ( rule__Family__Group__0 ) )
            // InternalMyFamilyDsl.g:68:3: ( rule__Family__Group__0 )
            {
             before(grammarAccess.getFamilyAccess().getGroup()); 
            // InternalMyFamilyDsl.g:69:3: ( rule__Family__Group__0 )
            // InternalMyFamilyDsl.g:69:4: rule__Family__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Family__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFamilyAccess().getGroup()); 

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
    // $ANTLR end "ruleFamily"


    // $ANTLR start "entryRulePerson"
    // InternalMyFamilyDsl.g:78:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // InternalMyFamilyDsl.g:79:1: ( rulePerson EOF )
            // InternalMyFamilyDsl.g:80:1: rulePerson EOF
            {
             before(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPersonRule()); 
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
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalMyFamilyDsl.g:87:1: rulePerson : ( ( rule__Person__Alternatives ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:91:2: ( ( ( rule__Person__Alternatives ) ) )
            // InternalMyFamilyDsl.g:92:2: ( ( rule__Person__Alternatives ) )
            {
            // InternalMyFamilyDsl.g:92:2: ( ( rule__Person__Alternatives ) )
            // InternalMyFamilyDsl.g:93:3: ( rule__Person__Alternatives )
            {
             before(grammarAccess.getPersonAccess().getAlternatives()); 
            // InternalMyFamilyDsl.g:94:3: ( rule__Person__Alternatives )
            // InternalMyFamilyDsl.g:94:4: rule__Person__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Person__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getAlternatives()); 

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
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleMan"
    // InternalMyFamilyDsl.g:103:1: entryRuleMan : ruleMan EOF ;
    public final void entryRuleMan() throws RecognitionException {
        try {
            // InternalMyFamilyDsl.g:104:1: ( ruleMan EOF )
            // InternalMyFamilyDsl.g:105:1: ruleMan EOF
            {
             before(grammarAccess.getManRule()); 
            pushFollow(FOLLOW_1);
            ruleMan();

            state._fsp--;

             after(grammarAccess.getManRule()); 
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
    // $ANTLR end "entryRuleMan"


    // $ANTLR start "ruleMan"
    // InternalMyFamilyDsl.g:112:1: ruleMan : ( ( rule__Man__Group__0 ) ) ;
    public final void ruleMan() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:116:2: ( ( ( rule__Man__Group__0 ) ) )
            // InternalMyFamilyDsl.g:117:2: ( ( rule__Man__Group__0 ) )
            {
            // InternalMyFamilyDsl.g:117:2: ( ( rule__Man__Group__0 ) )
            // InternalMyFamilyDsl.g:118:3: ( rule__Man__Group__0 )
            {
             before(grammarAccess.getManAccess().getGroup()); 
            // InternalMyFamilyDsl.g:119:3: ( rule__Man__Group__0 )
            // InternalMyFamilyDsl.g:119:4: rule__Man__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Man__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getManAccess().getGroup()); 

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
    // $ANTLR end "ruleMan"


    // $ANTLR start "entryRuleWoman"
    // InternalMyFamilyDsl.g:128:1: entryRuleWoman : ruleWoman EOF ;
    public final void entryRuleWoman() throws RecognitionException {
        try {
            // InternalMyFamilyDsl.g:129:1: ( ruleWoman EOF )
            // InternalMyFamilyDsl.g:130:1: ruleWoman EOF
            {
             before(grammarAccess.getWomanRule()); 
            pushFollow(FOLLOW_1);
            ruleWoman();

            state._fsp--;

             after(grammarAccess.getWomanRule()); 
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
    // $ANTLR end "entryRuleWoman"


    // $ANTLR start "ruleWoman"
    // InternalMyFamilyDsl.g:137:1: ruleWoman : ( ( rule__Woman__Group__0 ) ) ;
    public final void ruleWoman() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:141:2: ( ( ( rule__Woman__Group__0 ) ) )
            // InternalMyFamilyDsl.g:142:2: ( ( rule__Woman__Group__0 ) )
            {
            // InternalMyFamilyDsl.g:142:2: ( ( rule__Woman__Group__0 ) )
            // InternalMyFamilyDsl.g:143:3: ( rule__Woman__Group__0 )
            {
             before(grammarAccess.getWomanAccess().getGroup()); 
            // InternalMyFamilyDsl.g:144:3: ( rule__Woman__Group__0 )
            // InternalMyFamilyDsl.g:144:4: rule__Woman__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Woman__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWomanAccess().getGroup()); 

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
    // $ANTLR end "ruleWoman"


    // $ANTLR start "rule__Person__Alternatives"
    // InternalMyFamilyDsl.g:152:1: rule__Person__Alternatives : ( ( ruleMan ) | ( ruleWoman ) );
    public final void rule__Person__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:156:1: ( ( ruleMan ) | ( ruleWoman ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==17) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyFamilyDsl.g:157:2: ( ruleMan )
                    {
                    // InternalMyFamilyDsl.g:157:2: ( ruleMan )
                    // InternalMyFamilyDsl.g:158:3: ruleMan
                    {
                     before(grammarAccess.getPersonAccess().getManParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMan();

                    state._fsp--;

                     after(grammarAccess.getPersonAccess().getManParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyFamilyDsl.g:163:2: ( ruleWoman )
                    {
                    // InternalMyFamilyDsl.g:163:2: ( ruleWoman )
                    // InternalMyFamilyDsl.g:164:3: ruleWoman
                    {
                     before(grammarAccess.getPersonAccess().getWomanParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWoman();

                    state._fsp--;

                     after(grammarAccess.getPersonAccess().getWomanParserRuleCall_1()); 

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
    // $ANTLR end "rule__Person__Alternatives"


    // $ANTLR start "rule__Family__Group__0"
    // InternalMyFamilyDsl.g:173:1: rule__Family__Group__0 : rule__Family__Group__0__Impl rule__Family__Group__1 ;
    public final void rule__Family__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:177:1: ( rule__Family__Group__0__Impl rule__Family__Group__1 )
            // InternalMyFamilyDsl.g:178:2: rule__Family__Group__0__Impl rule__Family__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Family__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Family__Group__1();

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
    // $ANTLR end "rule__Family__Group__0"


    // $ANTLR start "rule__Family__Group__0__Impl"
    // InternalMyFamilyDsl.g:185:1: rule__Family__Group__0__Impl : ( 'Family' ) ;
    public final void rule__Family__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:189:1: ( ( 'Family' ) )
            // InternalMyFamilyDsl.g:190:1: ( 'Family' )
            {
            // InternalMyFamilyDsl.g:190:1: ( 'Family' )
            // InternalMyFamilyDsl.g:191:2: 'Family'
            {
             before(grammarAccess.getFamilyAccess().getFamilyKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getFamilyAccess().getFamilyKeyword_0()); 

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
    // $ANTLR end "rule__Family__Group__0__Impl"


    // $ANTLR start "rule__Family__Group__1"
    // InternalMyFamilyDsl.g:200:1: rule__Family__Group__1 : rule__Family__Group__1__Impl rule__Family__Group__2 ;
    public final void rule__Family__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:204:1: ( rule__Family__Group__1__Impl rule__Family__Group__2 )
            // InternalMyFamilyDsl.g:205:2: rule__Family__Group__1__Impl rule__Family__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Family__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Family__Group__2();

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
    // $ANTLR end "rule__Family__Group__1"


    // $ANTLR start "rule__Family__Group__1__Impl"
    // InternalMyFamilyDsl.g:212:1: rule__Family__Group__1__Impl : ( ( rule__Family__SurnameAssignment_1 ) ) ;
    public final void rule__Family__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:216:1: ( ( ( rule__Family__SurnameAssignment_1 ) ) )
            // InternalMyFamilyDsl.g:217:1: ( ( rule__Family__SurnameAssignment_1 ) )
            {
            // InternalMyFamilyDsl.g:217:1: ( ( rule__Family__SurnameAssignment_1 ) )
            // InternalMyFamilyDsl.g:218:2: ( rule__Family__SurnameAssignment_1 )
            {
             before(grammarAccess.getFamilyAccess().getSurnameAssignment_1()); 
            // InternalMyFamilyDsl.g:219:2: ( rule__Family__SurnameAssignment_1 )
            // InternalMyFamilyDsl.g:219:3: rule__Family__SurnameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Family__SurnameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFamilyAccess().getSurnameAssignment_1()); 

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
    // $ANTLR end "rule__Family__Group__1__Impl"


    // $ANTLR start "rule__Family__Group__2"
    // InternalMyFamilyDsl.g:227:1: rule__Family__Group__2 : rule__Family__Group__2__Impl rule__Family__Group__3 ;
    public final void rule__Family__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:231:1: ( rule__Family__Group__2__Impl rule__Family__Group__3 )
            // InternalMyFamilyDsl.g:232:2: rule__Family__Group__2__Impl rule__Family__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Family__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Family__Group__3();

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
    // $ANTLR end "rule__Family__Group__2"


    // $ANTLR start "rule__Family__Group__2__Impl"
    // InternalMyFamilyDsl.g:239:1: rule__Family__Group__2__Impl : ( '{' ) ;
    public final void rule__Family__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:243:1: ( ( '{' ) )
            // InternalMyFamilyDsl.g:244:1: ( '{' )
            {
            // InternalMyFamilyDsl.g:244:1: ( '{' )
            // InternalMyFamilyDsl.g:245:2: '{'
            {
             before(grammarAccess.getFamilyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFamilyAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Family__Group__2__Impl"


    // $ANTLR start "rule__Family__Group__3"
    // InternalMyFamilyDsl.g:254:1: rule__Family__Group__3 : rule__Family__Group__3__Impl rule__Family__Group__4 ;
    public final void rule__Family__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:258:1: ( rule__Family__Group__3__Impl rule__Family__Group__4 )
            // InternalMyFamilyDsl.g:259:2: rule__Family__Group__3__Impl rule__Family__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Family__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Family__Group__4();

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
    // $ANTLR end "rule__Family__Group__3"


    // $ANTLR start "rule__Family__Group__3__Impl"
    // InternalMyFamilyDsl.g:266:1: rule__Family__Group__3__Impl : ( ( ( rule__Family__PersonsAssignment_3 ) ) ( ( rule__Family__PersonsAssignment_3 )* ) ) ;
    public final void rule__Family__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:270:1: ( ( ( ( rule__Family__PersonsAssignment_3 ) ) ( ( rule__Family__PersonsAssignment_3 )* ) ) )
            // InternalMyFamilyDsl.g:271:1: ( ( ( rule__Family__PersonsAssignment_3 ) ) ( ( rule__Family__PersonsAssignment_3 )* ) )
            {
            // InternalMyFamilyDsl.g:271:1: ( ( ( rule__Family__PersonsAssignment_3 ) ) ( ( rule__Family__PersonsAssignment_3 )* ) )
            // InternalMyFamilyDsl.g:272:2: ( ( rule__Family__PersonsAssignment_3 ) ) ( ( rule__Family__PersonsAssignment_3 )* )
            {
            // InternalMyFamilyDsl.g:272:2: ( ( rule__Family__PersonsAssignment_3 ) )
            // InternalMyFamilyDsl.g:273:3: ( rule__Family__PersonsAssignment_3 )
            {
             before(grammarAccess.getFamilyAccess().getPersonsAssignment_3()); 
            // InternalMyFamilyDsl.g:274:3: ( rule__Family__PersonsAssignment_3 )
            // InternalMyFamilyDsl.g:274:4: rule__Family__PersonsAssignment_3
            {
            pushFollow(FOLLOW_7);
            rule__Family__PersonsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFamilyAccess().getPersonsAssignment_3()); 

            }

            // InternalMyFamilyDsl.g:277:2: ( ( rule__Family__PersonsAssignment_3 )* )
            // InternalMyFamilyDsl.g:278:3: ( rule__Family__PersonsAssignment_3 )*
            {
             before(grammarAccess.getFamilyAccess().getPersonsAssignment_3()); 
            // InternalMyFamilyDsl.g:279:3: ( rule__Family__PersonsAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14||LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyFamilyDsl.g:279:4: rule__Family__PersonsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Family__PersonsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getFamilyAccess().getPersonsAssignment_3()); 

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
    // $ANTLR end "rule__Family__Group__3__Impl"


    // $ANTLR start "rule__Family__Group__4"
    // InternalMyFamilyDsl.g:288:1: rule__Family__Group__4 : rule__Family__Group__4__Impl ;
    public final void rule__Family__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:292:1: ( rule__Family__Group__4__Impl )
            // InternalMyFamilyDsl.g:293:2: rule__Family__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Family__Group__4__Impl();

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
    // $ANTLR end "rule__Family__Group__4"


    // $ANTLR start "rule__Family__Group__4__Impl"
    // InternalMyFamilyDsl.g:299:1: rule__Family__Group__4__Impl : ( '}' ) ;
    public final void rule__Family__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:303:1: ( ( '}' ) )
            // InternalMyFamilyDsl.g:304:1: ( '}' )
            {
            // InternalMyFamilyDsl.g:304:1: ( '}' )
            // InternalMyFamilyDsl.g:305:2: '}'
            {
             before(grammarAccess.getFamilyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFamilyAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Family__Group__4__Impl"


    // $ANTLR start "rule__Man__Group__0"
    // InternalMyFamilyDsl.g:315:1: rule__Man__Group__0 : rule__Man__Group__0__Impl rule__Man__Group__1 ;
    public final void rule__Man__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:319:1: ( rule__Man__Group__0__Impl rule__Man__Group__1 )
            // InternalMyFamilyDsl.g:320:2: rule__Man__Group__0__Impl rule__Man__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Man__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Man__Group__1();

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
    // $ANTLR end "rule__Man__Group__0"


    // $ANTLR start "rule__Man__Group__0__Impl"
    // InternalMyFamilyDsl.g:327:1: rule__Man__Group__0__Impl : ( 'Man' ) ;
    public final void rule__Man__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:331:1: ( ( 'Man' ) )
            // InternalMyFamilyDsl.g:332:1: ( 'Man' )
            {
            // InternalMyFamilyDsl.g:332:1: ( 'Man' )
            // InternalMyFamilyDsl.g:333:2: 'Man'
            {
             before(grammarAccess.getManAccess().getManKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getManAccess().getManKeyword_0()); 

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
    // $ANTLR end "rule__Man__Group__0__Impl"


    // $ANTLR start "rule__Man__Group__1"
    // InternalMyFamilyDsl.g:342:1: rule__Man__Group__1 : rule__Man__Group__1__Impl rule__Man__Group__2 ;
    public final void rule__Man__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:346:1: ( rule__Man__Group__1__Impl rule__Man__Group__2 )
            // InternalMyFamilyDsl.g:347:2: rule__Man__Group__1__Impl rule__Man__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Man__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Man__Group__2();

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
    // $ANTLR end "rule__Man__Group__1"


    // $ANTLR start "rule__Man__Group__1__Impl"
    // InternalMyFamilyDsl.g:354:1: rule__Man__Group__1__Impl : ( ( rule__Man__NameAssignment_1 ) ) ;
    public final void rule__Man__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:358:1: ( ( ( rule__Man__NameAssignment_1 ) ) )
            // InternalMyFamilyDsl.g:359:1: ( ( rule__Man__NameAssignment_1 ) )
            {
            // InternalMyFamilyDsl.g:359:1: ( ( rule__Man__NameAssignment_1 ) )
            // InternalMyFamilyDsl.g:360:2: ( rule__Man__NameAssignment_1 )
            {
             before(grammarAccess.getManAccess().getNameAssignment_1()); 
            // InternalMyFamilyDsl.g:361:2: ( rule__Man__NameAssignment_1 )
            // InternalMyFamilyDsl.g:361:3: rule__Man__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Man__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getManAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Man__Group__1__Impl"


    // $ANTLR start "rule__Man__Group__2"
    // InternalMyFamilyDsl.g:369:1: rule__Man__Group__2 : rule__Man__Group__2__Impl rule__Man__Group__3 ;
    public final void rule__Man__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:373:1: ( rule__Man__Group__2__Impl rule__Man__Group__3 )
            // InternalMyFamilyDsl.g:374:2: rule__Man__Group__2__Impl rule__Man__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Man__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Man__Group__3();

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
    // $ANTLR end "rule__Man__Group__2"


    // $ANTLR start "rule__Man__Group__2__Impl"
    // InternalMyFamilyDsl.g:381:1: rule__Man__Group__2__Impl : ( ( rule__Man__Group_2__0 )? ) ;
    public final void rule__Man__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:385:1: ( ( ( rule__Man__Group_2__0 )? ) )
            // InternalMyFamilyDsl.g:386:1: ( ( rule__Man__Group_2__0 )? )
            {
            // InternalMyFamilyDsl.g:386:1: ( ( rule__Man__Group_2__0 )? )
            // InternalMyFamilyDsl.g:387:2: ( rule__Man__Group_2__0 )?
            {
             before(grammarAccess.getManAccess().getGroup_2()); 
            // InternalMyFamilyDsl.g:388:2: ( rule__Man__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyFamilyDsl.g:388:3: rule__Man__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Man__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getManAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Man__Group__2__Impl"


    // $ANTLR start "rule__Man__Group__3"
    // InternalMyFamilyDsl.g:396:1: rule__Man__Group__3 : rule__Man__Group__3__Impl ;
    public final void rule__Man__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:400:1: ( rule__Man__Group__3__Impl )
            // InternalMyFamilyDsl.g:401:2: rule__Man__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Man__Group__3__Impl();

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
    // $ANTLR end "rule__Man__Group__3"


    // $ANTLR start "rule__Man__Group__3__Impl"
    // InternalMyFamilyDsl.g:407:1: rule__Man__Group__3__Impl : ( ( rule__Man__Group_3__0 )? ) ;
    public final void rule__Man__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:411:1: ( ( ( rule__Man__Group_3__0 )? ) )
            // InternalMyFamilyDsl.g:412:1: ( ( rule__Man__Group_3__0 )? )
            {
            // InternalMyFamilyDsl.g:412:1: ( ( rule__Man__Group_3__0 )? )
            // InternalMyFamilyDsl.g:413:2: ( rule__Man__Group_3__0 )?
            {
             before(grammarAccess.getManAccess().getGroup_3()); 
            // InternalMyFamilyDsl.g:414:2: ( rule__Man__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyFamilyDsl.g:414:3: rule__Man__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Man__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getManAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Man__Group__3__Impl"


    // $ANTLR start "rule__Man__Group_2__0"
    // InternalMyFamilyDsl.g:423:1: rule__Man__Group_2__0 : rule__Man__Group_2__0__Impl rule__Man__Group_2__1 ;
    public final void rule__Man__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:427:1: ( rule__Man__Group_2__0__Impl rule__Man__Group_2__1 )
            // InternalMyFamilyDsl.g:428:2: rule__Man__Group_2__0__Impl rule__Man__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Man__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Man__Group_2__1();

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
    // $ANTLR end "rule__Man__Group_2__0"


    // $ANTLR start "rule__Man__Group_2__0__Impl"
    // InternalMyFamilyDsl.g:435:1: rule__Man__Group_2__0__Impl : ( 'parents:' ) ;
    public final void rule__Man__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:439:1: ( ( 'parents:' ) )
            // InternalMyFamilyDsl.g:440:1: ( 'parents:' )
            {
            // InternalMyFamilyDsl.g:440:1: ( 'parents:' )
            // InternalMyFamilyDsl.g:441:2: 'parents:'
            {
             before(grammarAccess.getManAccess().getParentsKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getManAccess().getParentsKeyword_2_0()); 

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
    // $ANTLR end "rule__Man__Group_2__0__Impl"


    // $ANTLR start "rule__Man__Group_2__1"
    // InternalMyFamilyDsl.g:450:1: rule__Man__Group_2__1 : rule__Man__Group_2__1__Impl ;
    public final void rule__Man__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:454:1: ( rule__Man__Group_2__1__Impl )
            // InternalMyFamilyDsl.g:455:2: rule__Man__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Man__Group_2__1__Impl();

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
    // $ANTLR end "rule__Man__Group_2__1"


    // $ANTLR start "rule__Man__Group_2__1__Impl"
    // InternalMyFamilyDsl.g:461:1: rule__Man__Group_2__1__Impl : ( ( ( rule__Man__ParentsAssignment_2_1 ) ) ( ( rule__Man__ParentsAssignment_2_1 )* ) ) ;
    public final void rule__Man__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:465:1: ( ( ( ( rule__Man__ParentsAssignment_2_1 ) ) ( ( rule__Man__ParentsAssignment_2_1 )* ) ) )
            // InternalMyFamilyDsl.g:466:1: ( ( ( rule__Man__ParentsAssignment_2_1 ) ) ( ( rule__Man__ParentsAssignment_2_1 )* ) )
            {
            // InternalMyFamilyDsl.g:466:1: ( ( ( rule__Man__ParentsAssignment_2_1 ) ) ( ( rule__Man__ParentsAssignment_2_1 )* ) )
            // InternalMyFamilyDsl.g:467:2: ( ( rule__Man__ParentsAssignment_2_1 ) ) ( ( rule__Man__ParentsAssignment_2_1 )* )
            {
            // InternalMyFamilyDsl.g:467:2: ( ( rule__Man__ParentsAssignment_2_1 ) )
            // InternalMyFamilyDsl.g:468:3: ( rule__Man__ParentsAssignment_2_1 )
            {
             before(grammarAccess.getManAccess().getParentsAssignment_2_1()); 
            // InternalMyFamilyDsl.g:469:3: ( rule__Man__ParentsAssignment_2_1 )
            // InternalMyFamilyDsl.g:469:4: rule__Man__ParentsAssignment_2_1
            {
            pushFollow(FOLLOW_10);
            rule__Man__ParentsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getManAccess().getParentsAssignment_2_1()); 

            }

            // InternalMyFamilyDsl.g:472:2: ( ( rule__Man__ParentsAssignment_2_1 )* )
            // InternalMyFamilyDsl.g:473:3: ( rule__Man__ParentsAssignment_2_1 )*
            {
             before(grammarAccess.getManAccess().getParentsAssignment_2_1()); 
            // InternalMyFamilyDsl.g:474:3: ( rule__Man__ParentsAssignment_2_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyFamilyDsl.g:474:4: rule__Man__ParentsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Man__ParentsAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getManAccess().getParentsAssignment_2_1()); 

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
    // $ANTLR end "rule__Man__Group_2__1__Impl"


    // $ANTLR start "rule__Man__Group_3__0"
    // InternalMyFamilyDsl.g:484:1: rule__Man__Group_3__0 : rule__Man__Group_3__0__Impl rule__Man__Group_3__1 ;
    public final void rule__Man__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:488:1: ( rule__Man__Group_3__0__Impl rule__Man__Group_3__1 )
            // InternalMyFamilyDsl.g:489:2: rule__Man__Group_3__0__Impl rule__Man__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Man__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Man__Group_3__1();

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
    // $ANTLR end "rule__Man__Group_3__0"


    // $ANTLR start "rule__Man__Group_3__0__Impl"
    // InternalMyFamilyDsl.g:496:1: rule__Man__Group_3__0__Impl : ( 'children:' ) ;
    public final void rule__Man__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:500:1: ( ( 'children:' ) )
            // InternalMyFamilyDsl.g:501:1: ( 'children:' )
            {
            // InternalMyFamilyDsl.g:501:1: ( 'children:' )
            // InternalMyFamilyDsl.g:502:2: 'children:'
            {
             before(grammarAccess.getManAccess().getChildrenKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getManAccess().getChildrenKeyword_3_0()); 

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
    // $ANTLR end "rule__Man__Group_3__0__Impl"


    // $ANTLR start "rule__Man__Group_3__1"
    // InternalMyFamilyDsl.g:511:1: rule__Man__Group_3__1 : rule__Man__Group_3__1__Impl ;
    public final void rule__Man__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:515:1: ( rule__Man__Group_3__1__Impl )
            // InternalMyFamilyDsl.g:516:2: rule__Man__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Man__Group_3__1__Impl();

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
    // $ANTLR end "rule__Man__Group_3__1"


    // $ANTLR start "rule__Man__Group_3__1__Impl"
    // InternalMyFamilyDsl.g:522:1: rule__Man__Group_3__1__Impl : ( ( ( rule__Man__ChildrenAssignment_3_1 ) ) ( ( rule__Man__ChildrenAssignment_3_1 )* ) ) ;
    public final void rule__Man__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:526:1: ( ( ( ( rule__Man__ChildrenAssignment_3_1 ) ) ( ( rule__Man__ChildrenAssignment_3_1 )* ) ) )
            // InternalMyFamilyDsl.g:527:1: ( ( ( rule__Man__ChildrenAssignment_3_1 ) ) ( ( rule__Man__ChildrenAssignment_3_1 )* ) )
            {
            // InternalMyFamilyDsl.g:527:1: ( ( ( rule__Man__ChildrenAssignment_3_1 ) ) ( ( rule__Man__ChildrenAssignment_3_1 )* ) )
            // InternalMyFamilyDsl.g:528:2: ( ( rule__Man__ChildrenAssignment_3_1 ) ) ( ( rule__Man__ChildrenAssignment_3_1 )* )
            {
            // InternalMyFamilyDsl.g:528:2: ( ( rule__Man__ChildrenAssignment_3_1 ) )
            // InternalMyFamilyDsl.g:529:3: ( rule__Man__ChildrenAssignment_3_1 )
            {
             before(grammarAccess.getManAccess().getChildrenAssignment_3_1()); 
            // InternalMyFamilyDsl.g:530:3: ( rule__Man__ChildrenAssignment_3_1 )
            // InternalMyFamilyDsl.g:530:4: rule__Man__ChildrenAssignment_3_1
            {
            pushFollow(FOLLOW_10);
            rule__Man__ChildrenAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getManAccess().getChildrenAssignment_3_1()); 

            }

            // InternalMyFamilyDsl.g:533:2: ( ( rule__Man__ChildrenAssignment_3_1 )* )
            // InternalMyFamilyDsl.g:534:3: ( rule__Man__ChildrenAssignment_3_1 )*
            {
             before(grammarAccess.getManAccess().getChildrenAssignment_3_1()); 
            // InternalMyFamilyDsl.g:535:3: ( rule__Man__ChildrenAssignment_3_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyFamilyDsl.g:535:4: rule__Man__ChildrenAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Man__ChildrenAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getManAccess().getChildrenAssignment_3_1()); 

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
    // $ANTLR end "rule__Man__Group_3__1__Impl"


    // $ANTLR start "rule__Woman__Group__0"
    // InternalMyFamilyDsl.g:545:1: rule__Woman__Group__0 : rule__Woman__Group__0__Impl rule__Woman__Group__1 ;
    public final void rule__Woman__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:549:1: ( rule__Woman__Group__0__Impl rule__Woman__Group__1 )
            // InternalMyFamilyDsl.g:550:2: rule__Woman__Group__0__Impl rule__Woman__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Woman__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Woman__Group__1();

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
    // $ANTLR end "rule__Woman__Group__0"


    // $ANTLR start "rule__Woman__Group__0__Impl"
    // InternalMyFamilyDsl.g:557:1: rule__Woman__Group__0__Impl : ( 'Woman' ) ;
    public final void rule__Woman__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:561:1: ( ( 'Woman' ) )
            // InternalMyFamilyDsl.g:562:1: ( 'Woman' )
            {
            // InternalMyFamilyDsl.g:562:1: ( 'Woman' )
            // InternalMyFamilyDsl.g:563:2: 'Woman'
            {
             before(grammarAccess.getWomanAccess().getWomanKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getWomanAccess().getWomanKeyword_0()); 

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
    // $ANTLR end "rule__Woman__Group__0__Impl"


    // $ANTLR start "rule__Woman__Group__1"
    // InternalMyFamilyDsl.g:572:1: rule__Woman__Group__1 : rule__Woman__Group__1__Impl rule__Woman__Group__2 ;
    public final void rule__Woman__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:576:1: ( rule__Woman__Group__1__Impl rule__Woman__Group__2 )
            // InternalMyFamilyDsl.g:577:2: rule__Woman__Group__1__Impl rule__Woman__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Woman__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Woman__Group__2();

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
    // $ANTLR end "rule__Woman__Group__1"


    // $ANTLR start "rule__Woman__Group__1__Impl"
    // InternalMyFamilyDsl.g:584:1: rule__Woman__Group__1__Impl : ( ( rule__Woman__NameAssignment_1 ) ) ;
    public final void rule__Woman__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:588:1: ( ( ( rule__Woman__NameAssignment_1 ) ) )
            // InternalMyFamilyDsl.g:589:1: ( ( rule__Woman__NameAssignment_1 ) )
            {
            // InternalMyFamilyDsl.g:589:1: ( ( rule__Woman__NameAssignment_1 ) )
            // InternalMyFamilyDsl.g:590:2: ( rule__Woman__NameAssignment_1 )
            {
             before(grammarAccess.getWomanAccess().getNameAssignment_1()); 
            // InternalMyFamilyDsl.g:591:2: ( rule__Woman__NameAssignment_1 )
            // InternalMyFamilyDsl.g:591:3: rule__Woman__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Woman__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWomanAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Woman__Group__1__Impl"


    // $ANTLR start "rule__Woman__Group__2"
    // InternalMyFamilyDsl.g:599:1: rule__Woman__Group__2 : rule__Woman__Group__2__Impl rule__Woman__Group__3 ;
    public final void rule__Woman__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:603:1: ( rule__Woman__Group__2__Impl rule__Woman__Group__3 )
            // InternalMyFamilyDsl.g:604:2: rule__Woman__Group__2__Impl rule__Woman__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Woman__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Woman__Group__3();

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
    // $ANTLR end "rule__Woman__Group__2"


    // $ANTLR start "rule__Woman__Group__2__Impl"
    // InternalMyFamilyDsl.g:611:1: rule__Woman__Group__2__Impl : ( ( rule__Woman__Group_2__0 )? ) ;
    public final void rule__Woman__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:615:1: ( ( ( rule__Woman__Group_2__0 )? ) )
            // InternalMyFamilyDsl.g:616:1: ( ( rule__Woman__Group_2__0 )? )
            {
            // InternalMyFamilyDsl.g:616:1: ( ( rule__Woman__Group_2__0 )? )
            // InternalMyFamilyDsl.g:617:2: ( rule__Woman__Group_2__0 )?
            {
             before(grammarAccess.getWomanAccess().getGroup_2()); 
            // InternalMyFamilyDsl.g:618:2: ( rule__Woman__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyFamilyDsl.g:618:3: rule__Woman__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Woman__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWomanAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Woman__Group__2__Impl"


    // $ANTLR start "rule__Woman__Group__3"
    // InternalMyFamilyDsl.g:626:1: rule__Woman__Group__3 : rule__Woman__Group__3__Impl ;
    public final void rule__Woman__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:630:1: ( rule__Woman__Group__3__Impl )
            // InternalMyFamilyDsl.g:631:2: rule__Woman__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Woman__Group__3__Impl();

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
    // $ANTLR end "rule__Woman__Group__3"


    // $ANTLR start "rule__Woman__Group__3__Impl"
    // InternalMyFamilyDsl.g:637:1: rule__Woman__Group__3__Impl : ( ( rule__Woman__Group_3__0 )? ) ;
    public final void rule__Woman__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:641:1: ( ( ( rule__Woman__Group_3__0 )? ) )
            // InternalMyFamilyDsl.g:642:1: ( ( rule__Woman__Group_3__0 )? )
            {
            // InternalMyFamilyDsl.g:642:1: ( ( rule__Woman__Group_3__0 )? )
            // InternalMyFamilyDsl.g:643:2: ( rule__Woman__Group_3__0 )?
            {
             before(grammarAccess.getWomanAccess().getGroup_3()); 
            // InternalMyFamilyDsl.g:644:2: ( rule__Woman__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyFamilyDsl.g:644:3: rule__Woman__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Woman__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWomanAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Woman__Group__3__Impl"


    // $ANTLR start "rule__Woman__Group_2__0"
    // InternalMyFamilyDsl.g:653:1: rule__Woman__Group_2__0 : rule__Woman__Group_2__0__Impl rule__Woman__Group_2__1 ;
    public final void rule__Woman__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:657:1: ( rule__Woman__Group_2__0__Impl rule__Woman__Group_2__1 )
            // InternalMyFamilyDsl.g:658:2: rule__Woman__Group_2__0__Impl rule__Woman__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Woman__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Woman__Group_2__1();

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
    // $ANTLR end "rule__Woman__Group_2__0"


    // $ANTLR start "rule__Woman__Group_2__0__Impl"
    // InternalMyFamilyDsl.g:665:1: rule__Woman__Group_2__0__Impl : ( 'parents:' ) ;
    public final void rule__Woman__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:669:1: ( ( 'parents:' ) )
            // InternalMyFamilyDsl.g:670:1: ( 'parents:' )
            {
            // InternalMyFamilyDsl.g:670:1: ( 'parents:' )
            // InternalMyFamilyDsl.g:671:2: 'parents:'
            {
             before(grammarAccess.getWomanAccess().getParentsKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getWomanAccess().getParentsKeyword_2_0()); 

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
    // $ANTLR end "rule__Woman__Group_2__0__Impl"


    // $ANTLR start "rule__Woman__Group_2__1"
    // InternalMyFamilyDsl.g:680:1: rule__Woman__Group_2__1 : rule__Woman__Group_2__1__Impl ;
    public final void rule__Woman__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:684:1: ( rule__Woman__Group_2__1__Impl )
            // InternalMyFamilyDsl.g:685:2: rule__Woman__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Woman__Group_2__1__Impl();

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
    // $ANTLR end "rule__Woman__Group_2__1"


    // $ANTLR start "rule__Woman__Group_2__1__Impl"
    // InternalMyFamilyDsl.g:691:1: rule__Woman__Group_2__1__Impl : ( ( ( rule__Woman__ParentsAssignment_2_1 ) ) ( ( rule__Woman__ParentsAssignment_2_1 )* ) ) ;
    public final void rule__Woman__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:695:1: ( ( ( ( rule__Woman__ParentsAssignment_2_1 ) ) ( ( rule__Woman__ParentsAssignment_2_1 )* ) ) )
            // InternalMyFamilyDsl.g:696:1: ( ( ( rule__Woman__ParentsAssignment_2_1 ) ) ( ( rule__Woman__ParentsAssignment_2_1 )* ) )
            {
            // InternalMyFamilyDsl.g:696:1: ( ( ( rule__Woman__ParentsAssignment_2_1 ) ) ( ( rule__Woman__ParentsAssignment_2_1 )* ) )
            // InternalMyFamilyDsl.g:697:2: ( ( rule__Woman__ParentsAssignment_2_1 ) ) ( ( rule__Woman__ParentsAssignment_2_1 )* )
            {
            // InternalMyFamilyDsl.g:697:2: ( ( rule__Woman__ParentsAssignment_2_1 ) )
            // InternalMyFamilyDsl.g:698:3: ( rule__Woman__ParentsAssignment_2_1 )
            {
             before(grammarAccess.getWomanAccess().getParentsAssignment_2_1()); 
            // InternalMyFamilyDsl.g:699:3: ( rule__Woman__ParentsAssignment_2_1 )
            // InternalMyFamilyDsl.g:699:4: rule__Woman__ParentsAssignment_2_1
            {
            pushFollow(FOLLOW_10);
            rule__Woman__ParentsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getWomanAccess().getParentsAssignment_2_1()); 

            }

            // InternalMyFamilyDsl.g:702:2: ( ( rule__Woman__ParentsAssignment_2_1 )* )
            // InternalMyFamilyDsl.g:703:3: ( rule__Woman__ParentsAssignment_2_1 )*
            {
             before(grammarAccess.getWomanAccess().getParentsAssignment_2_1()); 
            // InternalMyFamilyDsl.g:704:3: ( rule__Woman__ParentsAssignment_2_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyFamilyDsl.g:704:4: rule__Woman__ParentsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Woman__ParentsAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getWomanAccess().getParentsAssignment_2_1()); 

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
    // $ANTLR end "rule__Woman__Group_2__1__Impl"


    // $ANTLR start "rule__Woman__Group_3__0"
    // InternalMyFamilyDsl.g:714:1: rule__Woman__Group_3__0 : rule__Woman__Group_3__0__Impl rule__Woman__Group_3__1 ;
    public final void rule__Woman__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:718:1: ( rule__Woman__Group_3__0__Impl rule__Woman__Group_3__1 )
            // InternalMyFamilyDsl.g:719:2: rule__Woman__Group_3__0__Impl rule__Woman__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Woman__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Woman__Group_3__1();

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
    // $ANTLR end "rule__Woman__Group_3__0"


    // $ANTLR start "rule__Woman__Group_3__0__Impl"
    // InternalMyFamilyDsl.g:726:1: rule__Woman__Group_3__0__Impl : ( 'children:' ) ;
    public final void rule__Woman__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:730:1: ( ( 'children:' ) )
            // InternalMyFamilyDsl.g:731:1: ( 'children:' )
            {
            // InternalMyFamilyDsl.g:731:1: ( 'children:' )
            // InternalMyFamilyDsl.g:732:2: 'children:'
            {
             before(grammarAccess.getWomanAccess().getChildrenKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWomanAccess().getChildrenKeyword_3_0()); 

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
    // $ANTLR end "rule__Woman__Group_3__0__Impl"


    // $ANTLR start "rule__Woman__Group_3__1"
    // InternalMyFamilyDsl.g:741:1: rule__Woman__Group_3__1 : rule__Woman__Group_3__1__Impl ;
    public final void rule__Woman__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:745:1: ( rule__Woman__Group_3__1__Impl )
            // InternalMyFamilyDsl.g:746:2: rule__Woman__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Woman__Group_3__1__Impl();

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
    // $ANTLR end "rule__Woman__Group_3__1"


    // $ANTLR start "rule__Woman__Group_3__1__Impl"
    // InternalMyFamilyDsl.g:752:1: rule__Woman__Group_3__1__Impl : ( ( ( rule__Woman__ChildrenAssignment_3_1 ) ) ( ( rule__Woman__ChildrenAssignment_3_1 )* ) ) ;
    public final void rule__Woman__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:756:1: ( ( ( ( rule__Woman__ChildrenAssignment_3_1 ) ) ( ( rule__Woman__ChildrenAssignment_3_1 )* ) ) )
            // InternalMyFamilyDsl.g:757:1: ( ( ( rule__Woman__ChildrenAssignment_3_1 ) ) ( ( rule__Woman__ChildrenAssignment_3_1 )* ) )
            {
            // InternalMyFamilyDsl.g:757:1: ( ( ( rule__Woman__ChildrenAssignment_3_1 ) ) ( ( rule__Woman__ChildrenAssignment_3_1 )* ) )
            // InternalMyFamilyDsl.g:758:2: ( ( rule__Woman__ChildrenAssignment_3_1 ) ) ( ( rule__Woman__ChildrenAssignment_3_1 )* )
            {
            // InternalMyFamilyDsl.g:758:2: ( ( rule__Woman__ChildrenAssignment_3_1 ) )
            // InternalMyFamilyDsl.g:759:3: ( rule__Woman__ChildrenAssignment_3_1 )
            {
             before(grammarAccess.getWomanAccess().getChildrenAssignment_3_1()); 
            // InternalMyFamilyDsl.g:760:3: ( rule__Woman__ChildrenAssignment_3_1 )
            // InternalMyFamilyDsl.g:760:4: rule__Woman__ChildrenAssignment_3_1
            {
            pushFollow(FOLLOW_10);
            rule__Woman__ChildrenAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getWomanAccess().getChildrenAssignment_3_1()); 

            }

            // InternalMyFamilyDsl.g:763:2: ( ( rule__Woman__ChildrenAssignment_3_1 )* )
            // InternalMyFamilyDsl.g:764:3: ( rule__Woman__ChildrenAssignment_3_1 )*
            {
             before(grammarAccess.getWomanAccess().getChildrenAssignment_3_1()); 
            // InternalMyFamilyDsl.g:765:3: ( rule__Woman__ChildrenAssignment_3_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyFamilyDsl.g:765:4: rule__Woman__ChildrenAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Woman__ChildrenAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getWomanAccess().getChildrenAssignment_3_1()); 

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
    // $ANTLR end "rule__Woman__Group_3__1__Impl"


    // $ANTLR start "rule__Family__SurnameAssignment_1"
    // InternalMyFamilyDsl.g:775:1: rule__Family__SurnameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Family__SurnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:779:1: ( ( RULE_STRING ) )
            // InternalMyFamilyDsl.g:780:2: ( RULE_STRING )
            {
            // InternalMyFamilyDsl.g:780:2: ( RULE_STRING )
            // InternalMyFamilyDsl.g:781:3: RULE_STRING
            {
             before(grammarAccess.getFamilyAccess().getSurnameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFamilyAccess().getSurnameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Family__SurnameAssignment_1"


    // $ANTLR start "rule__Family__PersonsAssignment_3"
    // InternalMyFamilyDsl.g:790:1: rule__Family__PersonsAssignment_3 : ( rulePerson ) ;
    public final void rule__Family__PersonsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:794:1: ( ( rulePerson ) )
            // InternalMyFamilyDsl.g:795:2: ( rulePerson )
            {
            // InternalMyFamilyDsl.g:795:2: ( rulePerson )
            // InternalMyFamilyDsl.g:796:3: rulePerson
            {
             before(grammarAccess.getFamilyAccess().getPersonsPersonParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getFamilyAccess().getPersonsPersonParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Family__PersonsAssignment_3"


    // $ANTLR start "rule__Man__NameAssignment_1"
    // InternalMyFamilyDsl.g:805:1: rule__Man__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Man__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:809:1: ( ( RULE_STRING ) )
            // InternalMyFamilyDsl.g:810:2: ( RULE_STRING )
            {
            // InternalMyFamilyDsl.g:810:2: ( RULE_STRING )
            // InternalMyFamilyDsl.g:811:3: RULE_STRING
            {
             before(grammarAccess.getManAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getManAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Man__NameAssignment_1"


    // $ANTLR start "rule__Man__ParentsAssignment_2_1"
    // InternalMyFamilyDsl.g:820:1: rule__Man__ParentsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Man__ParentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:824:1: ( ( ( RULE_ID ) ) )
            // InternalMyFamilyDsl.g:825:2: ( ( RULE_ID ) )
            {
            // InternalMyFamilyDsl.g:825:2: ( ( RULE_ID ) )
            // InternalMyFamilyDsl.g:826:3: ( RULE_ID )
            {
             before(grammarAccess.getManAccess().getParentsPersonCrossReference_2_1_0()); 
            // InternalMyFamilyDsl.g:827:3: ( RULE_ID )
            // InternalMyFamilyDsl.g:828:4: RULE_ID
            {
             before(grammarAccess.getManAccess().getParentsPersonIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getManAccess().getParentsPersonIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getManAccess().getParentsPersonCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__Man__ParentsAssignment_2_1"


    // $ANTLR start "rule__Man__ChildrenAssignment_3_1"
    // InternalMyFamilyDsl.g:839:1: rule__Man__ChildrenAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Man__ChildrenAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:843:1: ( ( ( RULE_ID ) ) )
            // InternalMyFamilyDsl.g:844:2: ( ( RULE_ID ) )
            {
            // InternalMyFamilyDsl.g:844:2: ( ( RULE_ID ) )
            // InternalMyFamilyDsl.g:845:3: ( RULE_ID )
            {
             before(grammarAccess.getManAccess().getChildrenPersonCrossReference_3_1_0()); 
            // InternalMyFamilyDsl.g:846:3: ( RULE_ID )
            // InternalMyFamilyDsl.g:847:4: RULE_ID
            {
             before(grammarAccess.getManAccess().getChildrenPersonIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getManAccess().getChildrenPersonIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getManAccess().getChildrenPersonCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Man__ChildrenAssignment_3_1"


    // $ANTLR start "rule__Woman__NameAssignment_1"
    // InternalMyFamilyDsl.g:858:1: rule__Woman__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Woman__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:862:1: ( ( RULE_STRING ) )
            // InternalMyFamilyDsl.g:863:2: ( RULE_STRING )
            {
            // InternalMyFamilyDsl.g:863:2: ( RULE_STRING )
            // InternalMyFamilyDsl.g:864:3: RULE_STRING
            {
             before(grammarAccess.getWomanAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getWomanAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Woman__NameAssignment_1"


    // $ANTLR start "rule__Woman__ParentsAssignment_2_1"
    // InternalMyFamilyDsl.g:873:1: rule__Woman__ParentsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Woman__ParentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:877:1: ( ( ( RULE_ID ) ) )
            // InternalMyFamilyDsl.g:878:2: ( ( RULE_ID ) )
            {
            // InternalMyFamilyDsl.g:878:2: ( ( RULE_ID ) )
            // InternalMyFamilyDsl.g:879:3: ( RULE_ID )
            {
             before(grammarAccess.getWomanAccess().getParentsPersonCrossReference_2_1_0()); 
            // InternalMyFamilyDsl.g:880:3: ( RULE_ID )
            // InternalMyFamilyDsl.g:881:4: RULE_ID
            {
             before(grammarAccess.getWomanAccess().getParentsPersonIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWomanAccess().getParentsPersonIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getWomanAccess().getParentsPersonCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__Woman__ParentsAssignment_2_1"


    // $ANTLR start "rule__Woman__ChildrenAssignment_3_1"
    // InternalMyFamilyDsl.g:892:1: rule__Woman__ChildrenAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Woman__ChildrenAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFamilyDsl.g:896:1: ( ( ( RULE_ID ) ) )
            // InternalMyFamilyDsl.g:897:2: ( ( RULE_ID ) )
            {
            // InternalMyFamilyDsl.g:897:2: ( ( RULE_ID ) )
            // InternalMyFamilyDsl.g:898:3: ( RULE_ID )
            {
             before(grammarAccess.getWomanAccess().getChildrenPersonCrossReference_3_1_0()); 
            // InternalMyFamilyDsl.g:899:3: ( RULE_ID )
            // InternalMyFamilyDsl.g:900:4: RULE_ID
            {
             before(grammarAccess.getWomanAccess().getChildrenPersonIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWomanAccess().getChildrenPersonIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getWomanAccess().getChildrenPersonCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Woman__ChildrenAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000024002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000022L});

}