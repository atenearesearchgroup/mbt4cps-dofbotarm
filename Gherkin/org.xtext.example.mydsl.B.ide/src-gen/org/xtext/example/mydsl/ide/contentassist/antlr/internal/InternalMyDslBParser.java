package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslBGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslBParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'call'", "'contact'", "'{'", "'phone'", "'}'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslBParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslBParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslBParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDslB.g"; }


    	private MyDslBGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslBGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleCall"
    // InternalMyDslB.g:53:1: entryRuleCall : ruleCall EOF ;
    public final void entryRuleCall() throws RecognitionException {
        try {
            // InternalMyDslB.g:54:1: ( ruleCall EOF )
            // InternalMyDslB.g:55:1: ruleCall EOF
            {
             before(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_1);
            ruleCall();

            state._fsp--;

             after(grammarAccess.getCallRule()); 
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
    // $ANTLR end "entryRuleCall"


    // $ANTLR start "ruleCall"
    // InternalMyDslB.g:62:1: ruleCall : ( ( rule__Call__Group__0 ) ) ;
    public final void ruleCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslB.g:66:2: ( ( ( rule__Call__Group__0 ) ) )
            // InternalMyDslB.g:67:2: ( ( rule__Call__Group__0 ) )
            {
            // InternalMyDslB.g:67:2: ( ( rule__Call__Group__0 ) )
            // InternalMyDslB.g:68:3: ( rule__Call__Group__0 )
            {
             before(grammarAccess.getCallAccess().getGroup()); 
            // InternalMyDslB.g:69:3: ( rule__Call__Group__0 )
            // InternalMyDslB.g:69:4: rule__Call__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Call__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCallAccess().getGroup()); 

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
    // $ANTLR end "ruleCall"


    // $ANTLR start "entryRulePerson"
    // InternalMyDslB.g:78:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // InternalMyDslB.g:79:1: ( rulePerson EOF )
            // InternalMyDslB.g:80:1: rulePerson EOF
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
    // InternalMyDslB.g:87:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslB.g:91:2: ( ( ( rule__Person__Group__0 ) ) )
            // InternalMyDslB.g:92:2: ( ( rule__Person__Group__0 ) )
            {
            // InternalMyDslB.g:92:2: ( ( rule__Person__Group__0 ) )
            // InternalMyDslB.g:93:3: ( rule__Person__Group__0 )
            {
             before(grammarAccess.getPersonAccess().getGroup()); 
            // InternalMyDslB.g:94:3: ( rule__Person__Group__0 )
            // InternalMyDslB.g:94:4: rule__Person__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getGroup()); 

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


    // $ANTLR start "rule__Call__Group__0"
    // InternalMyDslB.g:102:1: rule__Call__Group__0 : rule__Call__Group__0__Impl rule__Call__Group__1 ;
    public final void rule__Call__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslB.g:106:1: ( rule__Call__Group__0__Impl rule__Call__Group__1 )
            // InternalMyDslB.g:107:2: rule__Call__Group__0__Impl rule__Call__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Call__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Call__Group__1();

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
    // $ANTLR end "rule__Call__Group__0"


    // $ANTLR start "rule__Call__Group__0__Impl"
    // InternalMyDslB.g:114:1: rule__Call__Group__0__Impl : ( 'call' ) ;
    public final void rule__Call__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslB.g:118:1: ( ( 'call' ) )
            // InternalMyDslB.g:119:1: ( 'call' )
            {
            // InternalMyDslB.g:119:1: ( 'call' )
            // InternalMyDslB.g:120:2: 'call'
            {
             before(grammarAccess.getCallAccess().getCallKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getCallAccess().getCallKeyword_0()); 

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
    // $ANTLR end "rule__Call__Group__0__Impl"


    // $ANTLR start "rule__Call__Group__1"
    // InternalMyDslB.g:129:1: rule__Call__Group__1 : rule__Call__Group__1__Impl ;
    public final void rule__Call__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslB.g:133:1: ( rule__Call__Group__1__Impl )
            // InternalMyDslB.g:134:2: rule__Call__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Call__Group__1__Impl();

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
    // $ANTLR end "rule__Call__Group__1"


    // $ANTLR start "rule__Call__Group__1__Impl"
    // InternalMyDslB.g:140:1: rule__Call__Group__1__Impl : ( ( rule__Call__PersonAssignment_1 ) ) ;
    public final void rule__Call__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslB.g:144:1: ( ( ( rule__Call__PersonAssignment_1 ) ) )
            // InternalMyDslB.g:145:1: ( ( rule__Call__PersonAssignment_1 ) )
            {
            // InternalMyDslB.g:145:1: ( ( rule__Call__PersonAssignment_1 ) )
            // InternalMyDslB.g:146:2: ( rule__Call__PersonAssignment_1 )
            {
             before(grammarAccess.getCallAccess().getPersonAssignment_1()); 
            // InternalMyDslB.g:147:2: ( rule__Call__PersonAssignment_1 )
            // InternalMyDslB.g:147:3: rule__Call__PersonAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Call__PersonAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCallAccess().getPersonAssignment_1()); 

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
    // $ANTLR end "rule__Call__Group__1__Impl"


    // $ANTLR start "rule__Person__Group__0"
    // InternalMyDslB.g:156:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslB.g:160:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalMyDslB.g:161:2: rule__Person__Group__0__Impl rule__Person__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Person__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__1();

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
    // $ANTLR end "rule__Person__Group__0"


    // $ANTLR start "rule__Person__Group__0__Impl"
    // InternalMyDslB.g:168:1: rule__Person__Group__0__Impl : ( 'contact' ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslB.g:172:1: ( ( 'contact' ) )
            // InternalMyDslB.g:173:1: ( 'contact' )
            {
            // InternalMyDslB.g:173:1: ( 'contact' )
            // InternalMyDslB.g:174:2: 'contact'
            {
             before(grammarAccess.getPersonAccess().getContactKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getContactKeyword_0()); 

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
    // $ANTLR end "rule__Person__Group__0__Impl"


    // $ANTLR start "rule__Person__Group__1"
    // InternalMyDslB.g:183:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslB.g:187:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // InternalMyDslB.g:188:2: rule__Person__Group__1__Impl rule__Person__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Person__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__2();

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
    // $ANTLR end "rule__Person__Group__1"


    // $ANTLR start "rule__Person__Group__1__Impl"
    // InternalMyDslB.g:195:1: rule__Person__Group__1__Impl : ( ( rule__Person__NameAssignment_1 ) ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslB.g:199:1: ( ( ( rule__Person__NameAssignment_1 ) ) )
            // InternalMyDslB.g:200:1: ( ( rule__Person__NameAssignment_1 ) )
            {
            // InternalMyDslB.g:200:1: ( ( rule__Person__NameAssignment_1 ) )
            // InternalMyDslB.g:201:2: ( rule__Person__NameAssignment_1 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_1()); 
            // InternalMyDslB.g:202:2: ( rule__Person__NameAssignment_1 )
            // InternalMyDslB.g:202:3: rule__Person__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Person__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Person__Group__1__Impl"


    // $ANTLR start "rule__Person__Group__2"
    // InternalMyDslB.g:210:1: rule__Person__Group__2 : rule__Person__Group__2__Impl rule__Person__Group__3 ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslB.g:214:1: ( rule__Person__Group__2__Impl rule__Person__Group__3 )
            // InternalMyDslB.g:215:2: rule__Person__Group__2__Impl rule__Person__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Person__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__3();

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
    // $ANTLR end "rule__Person__Group__2"


    // $ANTLR start "rule__Person__Group__2__Impl"
    // InternalMyDslB.g:222:1: rule__Person__Group__2__Impl : ( '{' ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslB.g:226:1: ( ( '{' ) )
            // InternalMyDslB.g:227:1: ( '{' )
            {
            // InternalMyDslB.g:227:1: ( '{' )
            // InternalMyDslB.g:228:2: '{'
            {
             before(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Person__Group__2__Impl"


    // $ANTLR start "rule__Person__Group__3"
    // InternalMyDslB.g:237:1: rule__Person__Group__3 : rule__Person__Group__3__Impl rule__Person__Group__4 ;
    public final void rule__Person__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslB.g:241:1: ( rule__Person__Group__3__Impl rule__Person__Group__4 )
            // InternalMyDslB.g:242:2: rule__Person__Group__3__Impl rule__Person__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Person__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__4();

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
    // $ANTLR end "rule__Person__Group__3"


    // $ANTLR start "rule__Person__Group__3__Impl"
    // InternalMyDslB.g:249:1: rule__Person__Group__3__Impl : ( 'phone' ) ;
    public final void rule__Person__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslB.g:253:1: ( ( 'phone' ) )
            // InternalMyDslB.g:254:1: ( 'phone' )
            {
            // InternalMyDslB.g:254:1: ( 'phone' )
            // InternalMyDslB.g:255:2: 'phone'
            {
             before(grammarAccess.getPersonAccess().getPhoneKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getPhoneKeyword_3()); 

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
    // $ANTLR end "rule__Person__Group__3__Impl"


    // $ANTLR start "rule__Person__Group__4"
    // InternalMyDslB.g:264:1: rule__Person__Group__4 : rule__Person__Group__4__Impl rule__Person__Group__5 ;
    public final void rule__Person__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslB.g:268:1: ( rule__Person__Group__4__Impl rule__Person__Group__5 )
            // InternalMyDslB.g:269:2: rule__Person__Group__4__Impl rule__Person__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Person__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__5();

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
    // $ANTLR end "rule__Person__Group__4"


    // $ANTLR start "rule__Person__Group__4__Impl"
    // InternalMyDslB.g:276:1: rule__Person__Group__4__Impl : ( ( rule__Person__PhoneAssignment_4 ) ) ;
    public final void rule__Person__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslB.g:280:1: ( ( ( rule__Person__PhoneAssignment_4 ) ) )
            // InternalMyDslB.g:281:1: ( ( rule__Person__PhoneAssignment_4 ) )
            {
            // InternalMyDslB.g:281:1: ( ( rule__Person__PhoneAssignment_4 ) )
            // InternalMyDslB.g:282:2: ( rule__Person__PhoneAssignment_4 )
            {
             before(grammarAccess.getPersonAccess().getPhoneAssignment_4()); 
            // InternalMyDslB.g:283:2: ( rule__Person__PhoneAssignment_4 )
            // InternalMyDslB.g:283:3: rule__Person__PhoneAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Person__PhoneAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getPhoneAssignment_4()); 

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
    // $ANTLR end "rule__Person__Group__4__Impl"


    // $ANTLR start "rule__Person__Group__5"
    // InternalMyDslB.g:291:1: rule__Person__Group__5 : rule__Person__Group__5__Impl ;
    public final void rule__Person__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslB.g:295:1: ( rule__Person__Group__5__Impl )
            // InternalMyDslB.g:296:2: rule__Person__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__5__Impl();

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
    // $ANTLR end "rule__Person__Group__5"


    // $ANTLR start "rule__Person__Group__5__Impl"
    // InternalMyDslB.g:302:1: rule__Person__Group__5__Impl : ( '}' ) ;
    public final void rule__Person__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslB.g:306:1: ( ( '}' ) )
            // InternalMyDslB.g:307:1: ( '}' )
            {
            // InternalMyDslB.g:307:1: ( '}' )
            // InternalMyDslB.g:308:2: '}'
            {
             before(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Person__Group__5__Impl"


    // $ANTLR start "rule__Call__PersonAssignment_1"
    // InternalMyDslB.g:318:1: rule__Call__PersonAssignment_1 : ( rulePerson ) ;
    public final void rule__Call__PersonAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslB.g:322:1: ( ( rulePerson ) )
            // InternalMyDslB.g:323:2: ( rulePerson )
            {
            // InternalMyDslB.g:323:2: ( rulePerson )
            // InternalMyDslB.g:324:3: rulePerson
            {
             before(grammarAccess.getCallAccess().getPersonPersonParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getCallAccess().getPersonPersonParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Call__PersonAssignment_1"


    // $ANTLR start "rule__Person__NameAssignment_1"
    // InternalMyDslB.g:333:1: rule__Person__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Person__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslB.g:337:1: ( ( RULE_ID ) )
            // InternalMyDslB.g:338:2: ( RULE_ID )
            {
            // InternalMyDslB.g:338:2: ( RULE_ID )
            // InternalMyDslB.g:339:3: RULE_ID
            {
             before(grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Person__NameAssignment_1"


    // $ANTLR start "rule__Person__PhoneAssignment_4"
    // InternalMyDslB.g:348:1: rule__Person__PhoneAssignment_4 : ( RULE_INT ) ;
    public final void rule__Person__PhoneAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDslB.g:352:1: ( ( RULE_INT ) )
            // InternalMyDslB.g:353:2: ( RULE_INT )
            {
            // InternalMyDslB.g:353:2: ( RULE_INT )
            // InternalMyDslB.g:354:3: RULE_INT
            {
             before(grammarAccess.getPersonAccess().getPhoneINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getPhoneINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Person__PhoneAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});

}