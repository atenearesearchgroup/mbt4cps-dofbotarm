package org.xtext.ide.contentassist.antlr.internal;

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
import org.xtext.services.DofbotDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDofbotDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Name'", "'{'", "'}'", "'rotateMultiple'", "'rotateSingle'", "'RotateMultiple'", "'Time'", "'RotateSingle'", "'Servo'", "'Angle'"
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

    	public void setGrammarAccess(DofbotDSLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleArm"
    // InternalDofbotDSL.g:53:1: entryRuleArm : ruleArm EOF ;
    public final void entryRuleArm() throws RecognitionException {
        try {
            // InternalDofbotDSL.g:54:1: ( ruleArm EOF )
            // InternalDofbotDSL.g:55:1: ruleArm EOF
            {
             before(grammarAccess.getArmRule()); 
            pushFollow(FOLLOW_1);
            ruleArm();

            state._fsp--;

             after(grammarAccess.getArmRule()); 
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
    // $ANTLR end "entryRuleArm"


    // $ANTLR start "ruleArm"
    // InternalDofbotDSL.g:62:1: ruleArm : ( ( rule__Arm__Group__0 ) ) ;
    public final void ruleArm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:66:2: ( ( ( rule__Arm__Group__0 ) ) )
            // InternalDofbotDSL.g:67:2: ( ( rule__Arm__Group__0 ) )
            {
            // InternalDofbotDSL.g:67:2: ( ( rule__Arm__Group__0 ) )
            // InternalDofbotDSL.g:68:3: ( rule__Arm__Group__0 )
            {
             before(grammarAccess.getArmAccess().getGroup()); 
            // InternalDofbotDSL.g:69:3: ( rule__Arm__Group__0 )
            // InternalDofbotDSL.g:69:4: rule__Arm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Arm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArmAccess().getGroup()); 

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
    // $ANTLR end "ruleArm"


    // $ANTLR start "entryRuleRotateMultiple"
    // InternalDofbotDSL.g:78:1: entryRuleRotateMultiple : ruleRotateMultiple EOF ;
    public final void entryRuleRotateMultiple() throws RecognitionException {
        try {
            // InternalDofbotDSL.g:79:1: ( ruleRotateMultiple EOF )
            // InternalDofbotDSL.g:80:1: ruleRotateMultiple EOF
            {
             before(grammarAccess.getRotateMultipleRule()); 
            pushFollow(FOLLOW_1);
            ruleRotateMultiple();

            state._fsp--;

             after(grammarAccess.getRotateMultipleRule()); 
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
    // $ANTLR end "entryRuleRotateMultiple"


    // $ANTLR start "ruleRotateMultiple"
    // InternalDofbotDSL.g:87:1: ruleRotateMultiple : ( ( rule__RotateMultiple__Group__0 ) ) ;
    public final void ruleRotateMultiple() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:91:2: ( ( ( rule__RotateMultiple__Group__0 ) ) )
            // InternalDofbotDSL.g:92:2: ( ( rule__RotateMultiple__Group__0 ) )
            {
            // InternalDofbotDSL.g:92:2: ( ( rule__RotateMultiple__Group__0 ) )
            // InternalDofbotDSL.g:93:3: ( rule__RotateMultiple__Group__0 )
            {
             before(grammarAccess.getRotateMultipleAccess().getGroup()); 
            // InternalDofbotDSL.g:94:3: ( rule__RotateMultiple__Group__0 )
            // InternalDofbotDSL.g:94:4: rule__RotateMultiple__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RotateMultiple__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRotateMultipleAccess().getGroup()); 

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
    // $ANTLR end "ruleRotateMultiple"


    // $ANTLR start "entryRuleRotateSingle"
    // InternalDofbotDSL.g:103:1: entryRuleRotateSingle : ruleRotateSingle EOF ;
    public final void entryRuleRotateSingle() throws RecognitionException {
        try {
            // InternalDofbotDSL.g:104:1: ( ruleRotateSingle EOF )
            // InternalDofbotDSL.g:105:1: ruleRotateSingle EOF
            {
             before(grammarAccess.getRotateSingleRule()); 
            pushFollow(FOLLOW_1);
            ruleRotateSingle();

            state._fsp--;

             after(grammarAccess.getRotateSingleRule()); 
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
    // $ANTLR end "entryRuleRotateSingle"


    // $ANTLR start "ruleRotateSingle"
    // InternalDofbotDSL.g:112:1: ruleRotateSingle : ( ( rule__RotateSingle__Group__0 ) ) ;
    public final void ruleRotateSingle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:116:2: ( ( ( rule__RotateSingle__Group__0 ) ) )
            // InternalDofbotDSL.g:117:2: ( ( rule__RotateSingle__Group__0 ) )
            {
            // InternalDofbotDSL.g:117:2: ( ( rule__RotateSingle__Group__0 ) )
            // InternalDofbotDSL.g:118:3: ( rule__RotateSingle__Group__0 )
            {
             before(grammarAccess.getRotateSingleAccess().getGroup()); 
            // InternalDofbotDSL.g:119:3: ( rule__RotateSingle__Group__0 )
            // InternalDofbotDSL.g:119:4: rule__RotateSingle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RotateSingle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRotateSingleAccess().getGroup()); 

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
    // $ANTLR end "ruleRotateSingle"


    // $ANTLR start "entryRuleServos"
    // InternalDofbotDSL.g:128:1: entryRuleServos : ruleServos EOF ;
    public final void entryRuleServos() throws RecognitionException {
        try {
            // InternalDofbotDSL.g:129:1: ( ruleServos EOF )
            // InternalDofbotDSL.g:130:1: ruleServos EOF
            {
             before(grammarAccess.getServosRule()); 
            pushFollow(FOLLOW_1);
            ruleServos();

            state._fsp--;

             after(grammarAccess.getServosRule()); 
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
    // $ANTLR end "entryRuleServos"


    // $ANTLR start "ruleServos"
    // InternalDofbotDSL.g:137:1: ruleServos : ( ( rule__Servos__Group__0 ) ) ;
    public final void ruleServos() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:141:2: ( ( ( rule__Servos__Group__0 ) ) )
            // InternalDofbotDSL.g:142:2: ( ( rule__Servos__Group__0 ) )
            {
            // InternalDofbotDSL.g:142:2: ( ( rule__Servos__Group__0 ) )
            // InternalDofbotDSL.g:143:3: ( rule__Servos__Group__0 )
            {
             before(grammarAccess.getServosAccess().getGroup()); 
            // InternalDofbotDSL.g:144:3: ( rule__Servos__Group__0 )
            // InternalDofbotDSL.g:144:4: rule__Servos__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Servos__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServosAccess().getGroup()); 

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
    // $ANTLR end "ruleServos"


    // $ANTLR start "entryRuleAngles"
    // InternalDofbotDSL.g:153:1: entryRuleAngles : ruleAngles EOF ;
    public final void entryRuleAngles() throws RecognitionException {
        try {
            // InternalDofbotDSL.g:154:1: ( ruleAngles EOF )
            // InternalDofbotDSL.g:155:1: ruleAngles EOF
            {
             before(grammarAccess.getAnglesRule()); 
            pushFollow(FOLLOW_1);
            ruleAngles();

            state._fsp--;

             after(grammarAccess.getAnglesRule()); 
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
    // $ANTLR end "entryRuleAngles"


    // $ANTLR start "ruleAngles"
    // InternalDofbotDSL.g:162:1: ruleAngles : ( ( rule__Angles__Group__0 ) ) ;
    public final void ruleAngles() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:166:2: ( ( ( rule__Angles__Group__0 ) ) )
            // InternalDofbotDSL.g:167:2: ( ( rule__Angles__Group__0 ) )
            {
            // InternalDofbotDSL.g:167:2: ( ( rule__Angles__Group__0 ) )
            // InternalDofbotDSL.g:168:3: ( rule__Angles__Group__0 )
            {
             before(grammarAccess.getAnglesAccess().getGroup()); 
            // InternalDofbotDSL.g:169:3: ( rule__Angles__Group__0 )
            // InternalDofbotDSL.g:169:4: rule__Angles__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Angles__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnglesAccess().getGroup()); 

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
    // $ANTLR end "ruleAngles"


    // $ANTLR start "rule__Arm__Group__0"
    // InternalDofbotDSL.g:177:1: rule__Arm__Group__0 : rule__Arm__Group__0__Impl rule__Arm__Group__1 ;
    public final void rule__Arm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:181:1: ( rule__Arm__Group__0__Impl rule__Arm__Group__1 )
            // InternalDofbotDSL.g:182:2: rule__Arm__Group__0__Impl rule__Arm__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Arm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arm__Group__1();

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
    // $ANTLR end "rule__Arm__Group__0"


    // $ANTLR start "rule__Arm__Group__0__Impl"
    // InternalDofbotDSL.g:189:1: rule__Arm__Group__0__Impl : ( 'Name' ) ;
    public final void rule__Arm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:193:1: ( ( 'Name' ) )
            // InternalDofbotDSL.g:194:1: ( 'Name' )
            {
            // InternalDofbotDSL.g:194:1: ( 'Name' )
            // InternalDofbotDSL.g:195:2: 'Name'
            {
             before(grammarAccess.getArmAccess().getNameKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getArmAccess().getNameKeyword_0()); 

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
    // $ANTLR end "rule__Arm__Group__0__Impl"


    // $ANTLR start "rule__Arm__Group__1"
    // InternalDofbotDSL.g:204:1: rule__Arm__Group__1 : rule__Arm__Group__1__Impl rule__Arm__Group__2 ;
    public final void rule__Arm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:208:1: ( rule__Arm__Group__1__Impl rule__Arm__Group__2 )
            // InternalDofbotDSL.g:209:2: rule__Arm__Group__1__Impl rule__Arm__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Arm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arm__Group__2();

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
    // $ANTLR end "rule__Arm__Group__1"


    // $ANTLR start "rule__Arm__Group__1__Impl"
    // InternalDofbotDSL.g:216:1: rule__Arm__Group__1__Impl : ( ( rule__Arm__NameAssignment_1 ) ) ;
    public final void rule__Arm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:220:1: ( ( ( rule__Arm__NameAssignment_1 ) ) )
            // InternalDofbotDSL.g:221:1: ( ( rule__Arm__NameAssignment_1 ) )
            {
            // InternalDofbotDSL.g:221:1: ( ( rule__Arm__NameAssignment_1 ) )
            // InternalDofbotDSL.g:222:2: ( rule__Arm__NameAssignment_1 )
            {
             before(grammarAccess.getArmAccess().getNameAssignment_1()); 
            // InternalDofbotDSL.g:223:2: ( rule__Arm__NameAssignment_1 )
            // InternalDofbotDSL.g:223:3: rule__Arm__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Arm__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArmAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Arm__Group__1__Impl"


    // $ANTLR start "rule__Arm__Group__2"
    // InternalDofbotDSL.g:231:1: rule__Arm__Group__2 : rule__Arm__Group__2__Impl rule__Arm__Group__3 ;
    public final void rule__Arm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:235:1: ( rule__Arm__Group__2__Impl rule__Arm__Group__3 )
            // InternalDofbotDSL.g:236:2: rule__Arm__Group__2__Impl rule__Arm__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Arm__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arm__Group__3();

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
    // $ANTLR end "rule__Arm__Group__2"


    // $ANTLR start "rule__Arm__Group__2__Impl"
    // InternalDofbotDSL.g:243:1: rule__Arm__Group__2__Impl : ( '{' ) ;
    public final void rule__Arm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:247:1: ( ( '{' ) )
            // InternalDofbotDSL.g:248:1: ( '{' )
            {
            // InternalDofbotDSL.g:248:1: ( '{' )
            // InternalDofbotDSL.g:249:2: '{'
            {
             before(grammarAccess.getArmAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getArmAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Arm__Group__2__Impl"


    // $ANTLR start "rule__Arm__Group__3"
    // InternalDofbotDSL.g:258:1: rule__Arm__Group__3 : rule__Arm__Group__3__Impl rule__Arm__Group__4 ;
    public final void rule__Arm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:262:1: ( rule__Arm__Group__3__Impl rule__Arm__Group__4 )
            // InternalDofbotDSL.g:263:2: rule__Arm__Group__3__Impl rule__Arm__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Arm__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arm__Group__4();

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
    // $ANTLR end "rule__Arm__Group__3"


    // $ANTLR start "rule__Arm__Group__3__Impl"
    // InternalDofbotDSL.g:270:1: rule__Arm__Group__3__Impl : ( ( rule__Arm__Group_3__0 )? ) ;
    public final void rule__Arm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:274:1: ( ( ( rule__Arm__Group_3__0 )? ) )
            // InternalDofbotDSL.g:275:1: ( ( rule__Arm__Group_3__0 )? )
            {
            // InternalDofbotDSL.g:275:1: ( ( rule__Arm__Group_3__0 )? )
            // InternalDofbotDSL.g:276:2: ( rule__Arm__Group_3__0 )?
            {
             before(grammarAccess.getArmAccess().getGroup_3()); 
            // InternalDofbotDSL.g:277:2: ( rule__Arm__Group_3__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDofbotDSL.g:277:3: rule__Arm__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Arm__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArmAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Arm__Group__3__Impl"


    // $ANTLR start "rule__Arm__Group__4"
    // InternalDofbotDSL.g:285:1: rule__Arm__Group__4 : rule__Arm__Group__4__Impl rule__Arm__Group__5 ;
    public final void rule__Arm__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:289:1: ( rule__Arm__Group__4__Impl rule__Arm__Group__5 )
            // InternalDofbotDSL.g:290:2: rule__Arm__Group__4__Impl rule__Arm__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Arm__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arm__Group__5();

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
    // $ANTLR end "rule__Arm__Group__4"


    // $ANTLR start "rule__Arm__Group__4__Impl"
    // InternalDofbotDSL.g:297:1: rule__Arm__Group__4__Impl : ( ( rule__Arm__Group_4__0 )? ) ;
    public final void rule__Arm__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:301:1: ( ( ( rule__Arm__Group_4__0 )? ) )
            // InternalDofbotDSL.g:302:1: ( ( rule__Arm__Group_4__0 )? )
            {
            // InternalDofbotDSL.g:302:1: ( ( rule__Arm__Group_4__0 )? )
            // InternalDofbotDSL.g:303:2: ( rule__Arm__Group_4__0 )?
            {
             before(grammarAccess.getArmAccess().getGroup_4()); 
            // InternalDofbotDSL.g:304:2: ( rule__Arm__Group_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDofbotDSL.g:304:3: rule__Arm__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Arm__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArmAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Arm__Group__4__Impl"


    // $ANTLR start "rule__Arm__Group__5"
    // InternalDofbotDSL.g:312:1: rule__Arm__Group__5 : rule__Arm__Group__5__Impl ;
    public final void rule__Arm__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:316:1: ( rule__Arm__Group__5__Impl )
            // InternalDofbotDSL.g:317:2: rule__Arm__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arm__Group__5__Impl();

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
    // $ANTLR end "rule__Arm__Group__5"


    // $ANTLR start "rule__Arm__Group__5__Impl"
    // InternalDofbotDSL.g:323:1: rule__Arm__Group__5__Impl : ( '}' ) ;
    public final void rule__Arm__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:327:1: ( ( '}' ) )
            // InternalDofbotDSL.g:328:1: ( '}' )
            {
            // InternalDofbotDSL.g:328:1: ( '}' )
            // InternalDofbotDSL.g:329:2: '}'
            {
             before(grammarAccess.getArmAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getArmAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Arm__Group__5__Impl"


    // $ANTLR start "rule__Arm__Group_3__0"
    // InternalDofbotDSL.g:339:1: rule__Arm__Group_3__0 : rule__Arm__Group_3__0__Impl rule__Arm__Group_3__1 ;
    public final void rule__Arm__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:343:1: ( rule__Arm__Group_3__0__Impl rule__Arm__Group_3__1 )
            // InternalDofbotDSL.g:344:2: rule__Arm__Group_3__0__Impl rule__Arm__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Arm__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arm__Group_3__1();

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
    // $ANTLR end "rule__Arm__Group_3__0"


    // $ANTLR start "rule__Arm__Group_3__0__Impl"
    // InternalDofbotDSL.g:351:1: rule__Arm__Group_3__0__Impl : ( 'rotateMultiple' ) ;
    public final void rule__Arm__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:355:1: ( ( 'rotateMultiple' ) )
            // InternalDofbotDSL.g:356:1: ( 'rotateMultiple' )
            {
            // InternalDofbotDSL.g:356:1: ( 'rotateMultiple' )
            // InternalDofbotDSL.g:357:2: 'rotateMultiple'
            {
             before(grammarAccess.getArmAccess().getRotateMultipleKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getArmAccess().getRotateMultipleKeyword_3_0()); 

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
    // $ANTLR end "rule__Arm__Group_3__0__Impl"


    // $ANTLR start "rule__Arm__Group_3__1"
    // InternalDofbotDSL.g:366:1: rule__Arm__Group_3__1 : rule__Arm__Group_3__1__Impl ;
    public final void rule__Arm__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:370:1: ( rule__Arm__Group_3__1__Impl )
            // InternalDofbotDSL.g:371:2: rule__Arm__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arm__Group_3__1__Impl();

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
    // $ANTLR end "rule__Arm__Group_3__1"


    // $ANTLR start "rule__Arm__Group_3__1__Impl"
    // InternalDofbotDSL.g:377:1: rule__Arm__Group_3__1__Impl : ( ( ( rule__Arm__RotateMultipleAssignment_3_1 ) ) ( ( rule__Arm__RotateMultipleAssignment_3_1 )* ) ) ;
    public final void rule__Arm__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:381:1: ( ( ( ( rule__Arm__RotateMultipleAssignment_3_1 ) ) ( ( rule__Arm__RotateMultipleAssignment_3_1 )* ) ) )
            // InternalDofbotDSL.g:382:1: ( ( ( rule__Arm__RotateMultipleAssignment_3_1 ) ) ( ( rule__Arm__RotateMultipleAssignment_3_1 )* ) )
            {
            // InternalDofbotDSL.g:382:1: ( ( ( rule__Arm__RotateMultipleAssignment_3_1 ) ) ( ( rule__Arm__RotateMultipleAssignment_3_1 )* ) )
            // InternalDofbotDSL.g:383:2: ( ( rule__Arm__RotateMultipleAssignment_3_1 ) ) ( ( rule__Arm__RotateMultipleAssignment_3_1 )* )
            {
            // InternalDofbotDSL.g:383:2: ( ( rule__Arm__RotateMultipleAssignment_3_1 ) )
            // InternalDofbotDSL.g:384:3: ( rule__Arm__RotateMultipleAssignment_3_1 )
            {
             before(grammarAccess.getArmAccess().getRotateMultipleAssignment_3_1()); 
            // InternalDofbotDSL.g:385:3: ( rule__Arm__RotateMultipleAssignment_3_1 )
            // InternalDofbotDSL.g:385:4: rule__Arm__RotateMultipleAssignment_3_1
            {
            pushFollow(FOLLOW_7);
            rule__Arm__RotateMultipleAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getArmAccess().getRotateMultipleAssignment_3_1()); 

            }

            // InternalDofbotDSL.g:388:2: ( ( rule__Arm__RotateMultipleAssignment_3_1 )* )
            // InternalDofbotDSL.g:389:3: ( rule__Arm__RotateMultipleAssignment_3_1 )*
            {
             before(grammarAccess.getArmAccess().getRotateMultipleAssignment_3_1()); 
            // InternalDofbotDSL.g:390:3: ( rule__Arm__RotateMultipleAssignment_3_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDofbotDSL.g:390:4: rule__Arm__RotateMultipleAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Arm__RotateMultipleAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getArmAccess().getRotateMultipleAssignment_3_1()); 

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
    // $ANTLR end "rule__Arm__Group_3__1__Impl"


    // $ANTLR start "rule__Arm__Group_4__0"
    // InternalDofbotDSL.g:400:1: rule__Arm__Group_4__0 : rule__Arm__Group_4__0__Impl rule__Arm__Group_4__1 ;
    public final void rule__Arm__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:404:1: ( rule__Arm__Group_4__0__Impl rule__Arm__Group_4__1 )
            // InternalDofbotDSL.g:405:2: rule__Arm__Group_4__0__Impl rule__Arm__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__Arm__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arm__Group_4__1();

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
    // $ANTLR end "rule__Arm__Group_4__0"


    // $ANTLR start "rule__Arm__Group_4__0__Impl"
    // InternalDofbotDSL.g:412:1: rule__Arm__Group_4__0__Impl : ( 'rotateSingle' ) ;
    public final void rule__Arm__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:416:1: ( ( 'rotateSingle' ) )
            // InternalDofbotDSL.g:417:1: ( 'rotateSingle' )
            {
            // InternalDofbotDSL.g:417:1: ( 'rotateSingle' )
            // InternalDofbotDSL.g:418:2: 'rotateSingle'
            {
             before(grammarAccess.getArmAccess().getRotateSingleKeyword_4_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getArmAccess().getRotateSingleKeyword_4_0()); 

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
    // $ANTLR end "rule__Arm__Group_4__0__Impl"


    // $ANTLR start "rule__Arm__Group_4__1"
    // InternalDofbotDSL.g:427:1: rule__Arm__Group_4__1 : rule__Arm__Group_4__1__Impl ;
    public final void rule__Arm__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:431:1: ( rule__Arm__Group_4__1__Impl )
            // InternalDofbotDSL.g:432:2: rule__Arm__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arm__Group_4__1__Impl();

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
    // $ANTLR end "rule__Arm__Group_4__1"


    // $ANTLR start "rule__Arm__Group_4__1__Impl"
    // InternalDofbotDSL.g:438:1: rule__Arm__Group_4__1__Impl : ( ( ( rule__Arm__RotateSingleAssignment_4_1 ) ) ( ( rule__Arm__RotateSingleAssignment_4_1 )* ) ) ;
    public final void rule__Arm__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:442:1: ( ( ( ( rule__Arm__RotateSingleAssignment_4_1 ) ) ( ( rule__Arm__RotateSingleAssignment_4_1 )* ) ) )
            // InternalDofbotDSL.g:443:1: ( ( ( rule__Arm__RotateSingleAssignment_4_1 ) ) ( ( rule__Arm__RotateSingleAssignment_4_1 )* ) )
            {
            // InternalDofbotDSL.g:443:1: ( ( ( rule__Arm__RotateSingleAssignment_4_1 ) ) ( ( rule__Arm__RotateSingleAssignment_4_1 )* ) )
            // InternalDofbotDSL.g:444:2: ( ( rule__Arm__RotateSingleAssignment_4_1 ) ) ( ( rule__Arm__RotateSingleAssignment_4_1 )* )
            {
            // InternalDofbotDSL.g:444:2: ( ( rule__Arm__RotateSingleAssignment_4_1 ) )
            // InternalDofbotDSL.g:445:3: ( rule__Arm__RotateSingleAssignment_4_1 )
            {
             before(grammarAccess.getArmAccess().getRotateSingleAssignment_4_1()); 
            // InternalDofbotDSL.g:446:3: ( rule__Arm__RotateSingleAssignment_4_1 )
            // InternalDofbotDSL.g:446:4: rule__Arm__RotateSingleAssignment_4_1
            {
            pushFollow(FOLLOW_9);
            rule__Arm__RotateSingleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getArmAccess().getRotateSingleAssignment_4_1()); 

            }

            // InternalDofbotDSL.g:449:2: ( ( rule__Arm__RotateSingleAssignment_4_1 )* )
            // InternalDofbotDSL.g:450:3: ( rule__Arm__RotateSingleAssignment_4_1 )*
            {
             before(grammarAccess.getArmAccess().getRotateSingleAssignment_4_1()); 
            // InternalDofbotDSL.g:451:3: ( rule__Arm__RotateSingleAssignment_4_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDofbotDSL.g:451:4: rule__Arm__RotateSingleAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Arm__RotateSingleAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getArmAccess().getRotateSingleAssignment_4_1()); 

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
    // $ANTLR end "rule__Arm__Group_4__1__Impl"


    // $ANTLR start "rule__RotateMultiple__Group__0"
    // InternalDofbotDSL.g:461:1: rule__RotateMultiple__Group__0 : rule__RotateMultiple__Group__0__Impl rule__RotateMultiple__Group__1 ;
    public final void rule__RotateMultiple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:465:1: ( rule__RotateMultiple__Group__0__Impl rule__RotateMultiple__Group__1 )
            // InternalDofbotDSL.g:466:2: rule__RotateMultiple__Group__0__Impl rule__RotateMultiple__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RotateMultiple__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateMultiple__Group__1();

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
    // $ANTLR end "rule__RotateMultiple__Group__0"


    // $ANTLR start "rule__RotateMultiple__Group__0__Impl"
    // InternalDofbotDSL.g:473:1: rule__RotateMultiple__Group__0__Impl : ( 'RotateMultiple' ) ;
    public final void rule__RotateMultiple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:477:1: ( ( 'RotateMultiple' ) )
            // InternalDofbotDSL.g:478:1: ( 'RotateMultiple' )
            {
            // InternalDofbotDSL.g:478:1: ( 'RotateMultiple' )
            // InternalDofbotDSL.g:479:2: 'RotateMultiple'
            {
             before(grammarAccess.getRotateMultipleAccess().getRotateMultipleKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRotateMultipleAccess().getRotateMultipleKeyword_0()); 

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
    // $ANTLR end "rule__RotateMultiple__Group__0__Impl"


    // $ANTLR start "rule__RotateMultiple__Group__1"
    // InternalDofbotDSL.g:488:1: rule__RotateMultiple__Group__1 : rule__RotateMultiple__Group__1__Impl rule__RotateMultiple__Group__2 ;
    public final void rule__RotateMultiple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:492:1: ( rule__RotateMultiple__Group__1__Impl rule__RotateMultiple__Group__2 )
            // InternalDofbotDSL.g:493:2: rule__RotateMultiple__Group__1__Impl rule__RotateMultiple__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RotateMultiple__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateMultiple__Group__2();

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
    // $ANTLR end "rule__RotateMultiple__Group__1"


    // $ANTLR start "rule__RotateMultiple__Group__1__Impl"
    // InternalDofbotDSL.g:500:1: rule__RotateMultiple__Group__1__Impl : ( ( rule__RotateMultiple__NameAssignment_1 ) ) ;
    public final void rule__RotateMultiple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:504:1: ( ( ( rule__RotateMultiple__NameAssignment_1 ) ) )
            // InternalDofbotDSL.g:505:1: ( ( rule__RotateMultiple__NameAssignment_1 ) )
            {
            // InternalDofbotDSL.g:505:1: ( ( rule__RotateMultiple__NameAssignment_1 ) )
            // InternalDofbotDSL.g:506:2: ( rule__RotateMultiple__NameAssignment_1 )
            {
             before(grammarAccess.getRotateMultipleAccess().getNameAssignment_1()); 
            // InternalDofbotDSL.g:507:2: ( rule__RotateMultiple__NameAssignment_1 )
            // InternalDofbotDSL.g:507:3: rule__RotateMultiple__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RotateMultiple__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRotateMultipleAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__RotateMultiple__Group__1__Impl"


    // $ANTLR start "rule__RotateMultiple__Group__2"
    // InternalDofbotDSL.g:515:1: rule__RotateMultiple__Group__2 : rule__RotateMultiple__Group__2__Impl rule__RotateMultiple__Group__3 ;
    public final void rule__RotateMultiple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:519:1: ( rule__RotateMultiple__Group__2__Impl rule__RotateMultiple__Group__3 )
            // InternalDofbotDSL.g:520:2: rule__RotateMultiple__Group__2__Impl rule__RotateMultiple__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__RotateMultiple__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateMultiple__Group__3();

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
    // $ANTLR end "rule__RotateMultiple__Group__2"


    // $ANTLR start "rule__RotateMultiple__Group__2__Impl"
    // InternalDofbotDSL.g:527:1: rule__RotateMultiple__Group__2__Impl : ( '{' ) ;
    public final void rule__RotateMultiple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:531:1: ( ( '{' ) )
            // InternalDofbotDSL.g:532:1: ( '{' )
            {
            // InternalDofbotDSL.g:532:1: ( '{' )
            // InternalDofbotDSL.g:533:2: '{'
            {
             before(grammarAccess.getRotateMultipleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRotateMultipleAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__RotateMultiple__Group__2__Impl"


    // $ANTLR start "rule__RotateMultiple__Group__3"
    // InternalDofbotDSL.g:542:1: rule__RotateMultiple__Group__3 : rule__RotateMultiple__Group__3__Impl rule__RotateMultiple__Group__4 ;
    public final void rule__RotateMultiple__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:546:1: ( rule__RotateMultiple__Group__3__Impl rule__RotateMultiple__Group__4 )
            // InternalDofbotDSL.g:547:2: rule__RotateMultiple__Group__3__Impl rule__RotateMultiple__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__RotateMultiple__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateMultiple__Group__4();

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
    // $ANTLR end "rule__RotateMultiple__Group__3"


    // $ANTLR start "rule__RotateMultiple__Group__3__Impl"
    // InternalDofbotDSL.g:554:1: rule__RotateMultiple__Group__3__Impl : ( ( ( rule__RotateMultiple__AngleAssignment_3 ) ) ( ( rule__RotateMultiple__AngleAssignment_3 )* ) ) ;
    public final void rule__RotateMultiple__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:558:1: ( ( ( ( rule__RotateMultiple__AngleAssignment_3 ) ) ( ( rule__RotateMultiple__AngleAssignment_3 )* ) ) )
            // InternalDofbotDSL.g:559:1: ( ( ( rule__RotateMultiple__AngleAssignment_3 ) ) ( ( rule__RotateMultiple__AngleAssignment_3 )* ) )
            {
            // InternalDofbotDSL.g:559:1: ( ( ( rule__RotateMultiple__AngleAssignment_3 ) ) ( ( rule__RotateMultiple__AngleAssignment_3 )* ) )
            // InternalDofbotDSL.g:560:2: ( ( rule__RotateMultiple__AngleAssignment_3 ) ) ( ( rule__RotateMultiple__AngleAssignment_3 )* )
            {
            // InternalDofbotDSL.g:560:2: ( ( rule__RotateMultiple__AngleAssignment_3 ) )
            // InternalDofbotDSL.g:561:3: ( rule__RotateMultiple__AngleAssignment_3 )
            {
             before(grammarAccess.getRotateMultipleAccess().getAngleAssignment_3()); 
            // InternalDofbotDSL.g:562:3: ( rule__RotateMultiple__AngleAssignment_3 )
            // InternalDofbotDSL.g:562:4: rule__RotateMultiple__AngleAssignment_3
            {
            pushFollow(FOLLOW_12);
            rule__RotateMultiple__AngleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRotateMultipleAccess().getAngleAssignment_3()); 

            }

            // InternalDofbotDSL.g:565:2: ( ( rule__RotateMultiple__AngleAssignment_3 )* )
            // InternalDofbotDSL.g:566:3: ( rule__RotateMultiple__AngleAssignment_3 )*
            {
             before(grammarAccess.getRotateMultipleAccess().getAngleAssignment_3()); 
            // InternalDofbotDSL.g:567:3: ( rule__RotateMultiple__AngleAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDofbotDSL.g:567:4: rule__RotateMultiple__AngleAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__RotateMultiple__AngleAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getRotateMultipleAccess().getAngleAssignment_3()); 

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
    // $ANTLR end "rule__RotateMultiple__Group__3__Impl"


    // $ANTLR start "rule__RotateMultiple__Group__4"
    // InternalDofbotDSL.g:576:1: rule__RotateMultiple__Group__4 : rule__RotateMultiple__Group__4__Impl rule__RotateMultiple__Group__5 ;
    public final void rule__RotateMultiple__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:580:1: ( rule__RotateMultiple__Group__4__Impl rule__RotateMultiple__Group__5 )
            // InternalDofbotDSL.g:581:2: rule__RotateMultiple__Group__4__Impl rule__RotateMultiple__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__RotateMultiple__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateMultiple__Group__5();

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
    // $ANTLR end "rule__RotateMultiple__Group__4"


    // $ANTLR start "rule__RotateMultiple__Group__4__Impl"
    // InternalDofbotDSL.g:588:1: rule__RotateMultiple__Group__4__Impl : ( 'Time' ) ;
    public final void rule__RotateMultiple__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:592:1: ( ( 'Time' ) )
            // InternalDofbotDSL.g:593:1: ( 'Time' )
            {
            // InternalDofbotDSL.g:593:1: ( 'Time' )
            // InternalDofbotDSL.g:594:2: 'Time'
            {
             before(grammarAccess.getRotateMultipleAccess().getTimeKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRotateMultipleAccess().getTimeKeyword_4()); 

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
    // $ANTLR end "rule__RotateMultiple__Group__4__Impl"


    // $ANTLR start "rule__RotateMultiple__Group__5"
    // InternalDofbotDSL.g:603:1: rule__RotateMultiple__Group__5 : rule__RotateMultiple__Group__5__Impl rule__RotateMultiple__Group__6 ;
    public final void rule__RotateMultiple__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:607:1: ( rule__RotateMultiple__Group__5__Impl rule__RotateMultiple__Group__6 )
            // InternalDofbotDSL.g:608:2: rule__RotateMultiple__Group__5__Impl rule__RotateMultiple__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__RotateMultiple__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateMultiple__Group__6();

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
    // $ANTLR end "rule__RotateMultiple__Group__5"


    // $ANTLR start "rule__RotateMultiple__Group__5__Impl"
    // InternalDofbotDSL.g:615:1: rule__RotateMultiple__Group__5__Impl : ( ( rule__RotateMultiple__TimeAssignment_5 ) ) ;
    public final void rule__RotateMultiple__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:619:1: ( ( ( rule__RotateMultiple__TimeAssignment_5 ) ) )
            // InternalDofbotDSL.g:620:1: ( ( rule__RotateMultiple__TimeAssignment_5 ) )
            {
            // InternalDofbotDSL.g:620:1: ( ( rule__RotateMultiple__TimeAssignment_5 ) )
            // InternalDofbotDSL.g:621:2: ( rule__RotateMultiple__TimeAssignment_5 )
            {
             before(grammarAccess.getRotateMultipleAccess().getTimeAssignment_5()); 
            // InternalDofbotDSL.g:622:2: ( rule__RotateMultiple__TimeAssignment_5 )
            // InternalDofbotDSL.g:622:3: rule__RotateMultiple__TimeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__RotateMultiple__TimeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRotateMultipleAccess().getTimeAssignment_5()); 

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
    // $ANTLR end "rule__RotateMultiple__Group__5__Impl"


    // $ANTLR start "rule__RotateMultiple__Group__6"
    // InternalDofbotDSL.g:630:1: rule__RotateMultiple__Group__6 : rule__RotateMultiple__Group__6__Impl ;
    public final void rule__RotateMultiple__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:634:1: ( rule__RotateMultiple__Group__6__Impl )
            // InternalDofbotDSL.g:635:2: rule__RotateMultiple__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RotateMultiple__Group__6__Impl();

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
    // $ANTLR end "rule__RotateMultiple__Group__6"


    // $ANTLR start "rule__RotateMultiple__Group__6__Impl"
    // InternalDofbotDSL.g:641:1: rule__RotateMultiple__Group__6__Impl : ( '}' ) ;
    public final void rule__RotateMultiple__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:645:1: ( ( '}' ) )
            // InternalDofbotDSL.g:646:1: ( '}' )
            {
            // InternalDofbotDSL.g:646:1: ( '}' )
            // InternalDofbotDSL.g:647:2: '}'
            {
             before(grammarAccess.getRotateMultipleAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRotateMultipleAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__RotateMultiple__Group__6__Impl"


    // $ANTLR start "rule__RotateSingle__Group__0"
    // InternalDofbotDSL.g:657:1: rule__RotateSingle__Group__0 : rule__RotateSingle__Group__0__Impl rule__RotateSingle__Group__1 ;
    public final void rule__RotateSingle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:661:1: ( rule__RotateSingle__Group__0__Impl rule__RotateSingle__Group__1 )
            // InternalDofbotDSL.g:662:2: rule__RotateSingle__Group__0__Impl rule__RotateSingle__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RotateSingle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateSingle__Group__1();

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
    // $ANTLR end "rule__RotateSingle__Group__0"


    // $ANTLR start "rule__RotateSingle__Group__0__Impl"
    // InternalDofbotDSL.g:669:1: rule__RotateSingle__Group__0__Impl : ( 'RotateSingle' ) ;
    public final void rule__RotateSingle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:673:1: ( ( 'RotateSingle' ) )
            // InternalDofbotDSL.g:674:1: ( 'RotateSingle' )
            {
            // InternalDofbotDSL.g:674:1: ( 'RotateSingle' )
            // InternalDofbotDSL.g:675:2: 'RotateSingle'
            {
             before(grammarAccess.getRotateSingleAccess().getRotateSingleKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRotateSingleAccess().getRotateSingleKeyword_0()); 

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
    // $ANTLR end "rule__RotateSingle__Group__0__Impl"


    // $ANTLR start "rule__RotateSingle__Group__1"
    // InternalDofbotDSL.g:684:1: rule__RotateSingle__Group__1 : rule__RotateSingle__Group__1__Impl rule__RotateSingle__Group__2 ;
    public final void rule__RotateSingle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:688:1: ( rule__RotateSingle__Group__1__Impl rule__RotateSingle__Group__2 )
            // InternalDofbotDSL.g:689:2: rule__RotateSingle__Group__1__Impl rule__RotateSingle__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RotateSingle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateSingle__Group__2();

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
    // $ANTLR end "rule__RotateSingle__Group__1"


    // $ANTLR start "rule__RotateSingle__Group__1__Impl"
    // InternalDofbotDSL.g:696:1: rule__RotateSingle__Group__1__Impl : ( ( rule__RotateSingle__NameAssignment_1 ) ) ;
    public final void rule__RotateSingle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:700:1: ( ( ( rule__RotateSingle__NameAssignment_1 ) ) )
            // InternalDofbotDSL.g:701:1: ( ( rule__RotateSingle__NameAssignment_1 ) )
            {
            // InternalDofbotDSL.g:701:1: ( ( rule__RotateSingle__NameAssignment_1 ) )
            // InternalDofbotDSL.g:702:2: ( rule__RotateSingle__NameAssignment_1 )
            {
             before(grammarAccess.getRotateSingleAccess().getNameAssignment_1()); 
            // InternalDofbotDSL.g:703:2: ( rule__RotateSingle__NameAssignment_1 )
            // InternalDofbotDSL.g:703:3: rule__RotateSingle__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RotateSingle__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRotateSingleAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__RotateSingle__Group__1__Impl"


    // $ANTLR start "rule__RotateSingle__Group__2"
    // InternalDofbotDSL.g:711:1: rule__RotateSingle__Group__2 : rule__RotateSingle__Group__2__Impl rule__RotateSingle__Group__3 ;
    public final void rule__RotateSingle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:715:1: ( rule__RotateSingle__Group__2__Impl rule__RotateSingle__Group__3 )
            // InternalDofbotDSL.g:716:2: rule__RotateSingle__Group__2__Impl rule__RotateSingle__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__RotateSingle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateSingle__Group__3();

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
    // $ANTLR end "rule__RotateSingle__Group__2"


    // $ANTLR start "rule__RotateSingle__Group__2__Impl"
    // InternalDofbotDSL.g:723:1: rule__RotateSingle__Group__2__Impl : ( '{' ) ;
    public final void rule__RotateSingle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:727:1: ( ( '{' ) )
            // InternalDofbotDSL.g:728:1: ( '{' )
            {
            // InternalDofbotDSL.g:728:1: ( '{' )
            // InternalDofbotDSL.g:729:2: '{'
            {
             before(grammarAccess.getRotateSingleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRotateSingleAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__RotateSingle__Group__2__Impl"


    // $ANTLR start "rule__RotateSingle__Group__3"
    // InternalDofbotDSL.g:738:1: rule__RotateSingle__Group__3 : rule__RotateSingle__Group__3__Impl rule__RotateSingle__Group__4 ;
    public final void rule__RotateSingle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:742:1: ( rule__RotateSingle__Group__3__Impl rule__RotateSingle__Group__4 )
            // InternalDofbotDSL.g:743:2: rule__RotateSingle__Group__3__Impl rule__RotateSingle__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__RotateSingle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateSingle__Group__4();

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
    // $ANTLR end "rule__RotateSingle__Group__3"


    // $ANTLR start "rule__RotateSingle__Group__3__Impl"
    // InternalDofbotDSL.g:750:1: rule__RotateSingle__Group__3__Impl : ( ( rule__RotateSingle__ServoAssignment_3 ) ) ;
    public final void rule__RotateSingle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:754:1: ( ( ( rule__RotateSingle__ServoAssignment_3 ) ) )
            // InternalDofbotDSL.g:755:1: ( ( rule__RotateSingle__ServoAssignment_3 ) )
            {
            // InternalDofbotDSL.g:755:1: ( ( rule__RotateSingle__ServoAssignment_3 ) )
            // InternalDofbotDSL.g:756:2: ( rule__RotateSingle__ServoAssignment_3 )
            {
             before(grammarAccess.getRotateSingleAccess().getServoAssignment_3()); 
            // InternalDofbotDSL.g:757:2: ( rule__RotateSingle__ServoAssignment_3 )
            // InternalDofbotDSL.g:757:3: rule__RotateSingle__ServoAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RotateSingle__ServoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRotateSingleAccess().getServoAssignment_3()); 

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
    // $ANTLR end "rule__RotateSingle__Group__3__Impl"


    // $ANTLR start "rule__RotateSingle__Group__4"
    // InternalDofbotDSL.g:765:1: rule__RotateSingle__Group__4 : rule__RotateSingle__Group__4__Impl rule__RotateSingle__Group__5 ;
    public final void rule__RotateSingle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:769:1: ( rule__RotateSingle__Group__4__Impl rule__RotateSingle__Group__5 )
            // InternalDofbotDSL.g:770:2: rule__RotateSingle__Group__4__Impl rule__RotateSingle__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__RotateSingle__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateSingle__Group__5();

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
    // $ANTLR end "rule__RotateSingle__Group__4"


    // $ANTLR start "rule__RotateSingle__Group__4__Impl"
    // InternalDofbotDSL.g:777:1: rule__RotateSingle__Group__4__Impl : ( ( rule__RotateSingle__AngleAssignment_4 ) ) ;
    public final void rule__RotateSingle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:781:1: ( ( ( rule__RotateSingle__AngleAssignment_4 ) ) )
            // InternalDofbotDSL.g:782:1: ( ( rule__RotateSingle__AngleAssignment_4 ) )
            {
            // InternalDofbotDSL.g:782:1: ( ( rule__RotateSingle__AngleAssignment_4 ) )
            // InternalDofbotDSL.g:783:2: ( rule__RotateSingle__AngleAssignment_4 )
            {
             before(grammarAccess.getRotateSingleAccess().getAngleAssignment_4()); 
            // InternalDofbotDSL.g:784:2: ( rule__RotateSingle__AngleAssignment_4 )
            // InternalDofbotDSL.g:784:3: rule__RotateSingle__AngleAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RotateSingle__AngleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRotateSingleAccess().getAngleAssignment_4()); 

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
    // $ANTLR end "rule__RotateSingle__Group__4__Impl"


    // $ANTLR start "rule__RotateSingle__Group__5"
    // InternalDofbotDSL.g:792:1: rule__RotateSingle__Group__5 : rule__RotateSingle__Group__5__Impl rule__RotateSingle__Group__6 ;
    public final void rule__RotateSingle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:796:1: ( rule__RotateSingle__Group__5__Impl rule__RotateSingle__Group__6 )
            // InternalDofbotDSL.g:797:2: rule__RotateSingle__Group__5__Impl rule__RotateSingle__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__RotateSingle__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateSingle__Group__6();

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
    // $ANTLR end "rule__RotateSingle__Group__5"


    // $ANTLR start "rule__RotateSingle__Group__5__Impl"
    // InternalDofbotDSL.g:804:1: rule__RotateSingle__Group__5__Impl : ( 'Time' ) ;
    public final void rule__RotateSingle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:808:1: ( ( 'Time' ) )
            // InternalDofbotDSL.g:809:1: ( 'Time' )
            {
            // InternalDofbotDSL.g:809:1: ( 'Time' )
            // InternalDofbotDSL.g:810:2: 'Time'
            {
             before(grammarAccess.getRotateSingleAccess().getTimeKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRotateSingleAccess().getTimeKeyword_5()); 

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
    // $ANTLR end "rule__RotateSingle__Group__5__Impl"


    // $ANTLR start "rule__RotateSingle__Group__6"
    // InternalDofbotDSL.g:819:1: rule__RotateSingle__Group__6 : rule__RotateSingle__Group__6__Impl rule__RotateSingle__Group__7 ;
    public final void rule__RotateSingle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:823:1: ( rule__RotateSingle__Group__6__Impl rule__RotateSingle__Group__7 )
            // InternalDofbotDSL.g:824:2: rule__RotateSingle__Group__6__Impl rule__RotateSingle__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__RotateSingle__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateSingle__Group__7();

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
    // $ANTLR end "rule__RotateSingle__Group__6"


    // $ANTLR start "rule__RotateSingle__Group__6__Impl"
    // InternalDofbotDSL.g:831:1: rule__RotateSingle__Group__6__Impl : ( ( rule__RotateSingle__TimeAssignment_6 ) ) ;
    public final void rule__RotateSingle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:835:1: ( ( ( rule__RotateSingle__TimeAssignment_6 ) ) )
            // InternalDofbotDSL.g:836:1: ( ( rule__RotateSingle__TimeAssignment_6 ) )
            {
            // InternalDofbotDSL.g:836:1: ( ( rule__RotateSingle__TimeAssignment_6 ) )
            // InternalDofbotDSL.g:837:2: ( rule__RotateSingle__TimeAssignment_6 )
            {
             before(grammarAccess.getRotateSingleAccess().getTimeAssignment_6()); 
            // InternalDofbotDSL.g:838:2: ( rule__RotateSingle__TimeAssignment_6 )
            // InternalDofbotDSL.g:838:3: rule__RotateSingle__TimeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RotateSingle__TimeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRotateSingleAccess().getTimeAssignment_6()); 

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
    // $ANTLR end "rule__RotateSingle__Group__6__Impl"


    // $ANTLR start "rule__RotateSingle__Group__7"
    // InternalDofbotDSL.g:846:1: rule__RotateSingle__Group__7 : rule__RotateSingle__Group__7__Impl ;
    public final void rule__RotateSingle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:850:1: ( rule__RotateSingle__Group__7__Impl )
            // InternalDofbotDSL.g:851:2: rule__RotateSingle__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RotateSingle__Group__7__Impl();

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
    // $ANTLR end "rule__RotateSingle__Group__7"


    // $ANTLR start "rule__RotateSingle__Group__7__Impl"
    // InternalDofbotDSL.g:857:1: rule__RotateSingle__Group__7__Impl : ( '}' ) ;
    public final void rule__RotateSingle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:861:1: ( ( '}' ) )
            // InternalDofbotDSL.g:862:1: ( '}' )
            {
            // InternalDofbotDSL.g:862:1: ( '}' )
            // InternalDofbotDSL.g:863:2: '}'
            {
             before(grammarAccess.getRotateSingleAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRotateSingleAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__RotateSingle__Group__7__Impl"


    // $ANTLR start "rule__Servos__Group__0"
    // InternalDofbotDSL.g:873:1: rule__Servos__Group__0 : rule__Servos__Group__0__Impl rule__Servos__Group__1 ;
    public final void rule__Servos__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:877:1: ( rule__Servos__Group__0__Impl rule__Servos__Group__1 )
            // InternalDofbotDSL.g:878:2: rule__Servos__Group__0__Impl rule__Servos__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Servos__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servos__Group__1();

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
    // $ANTLR end "rule__Servos__Group__0"


    // $ANTLR start "rule__Servos__Group__0__Impl"
    // InternalDofbotDSL.g:885:1: rule__Servos__Group__0__Impl : ( 'Servo' ) ;
    public final void rule__Servos__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:889:1: ( ( 'Servo' ) )
            // InternalDofbotDSL.g:890:1: ( 'Servo' )
            {
            // InternalDofbotDSL.g:890:1: ( 'Servo' )
            // InternalDofbotDSL.g:891:2: 'Servo'
            {
             before(grammarAccess.getServosAccess().getServoKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getServosAccess().getServoKeyword_0()); 

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
    // $ANTLR end "rule__Servos__Group__0__Impl"


    // $ANTLR start "rule__Servos__Group__1"
    // InternalDofbotDSL.g:900:1: rule__Servos__Group__1 : rule__Servos__Group__1__Impl ;
    public final void rule__Servos__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:904:1: ( rule__Servos__Group__1__Impl )
            // InternalDofbotDSL.g:905:2: rule__Servos__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Servos__Group__1__Impl();

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
    // $ANTLR end "rule__Servos__Group__1"


    // $ANTLR start "rule__Servos__Group__1__Impl"
    // InternalDofbotDSL.g:911:1: rule__Servos__Group__1__Impl : ( ( rule__Servos__NameAssignment_1 ) ) ;
    public final void rule__Servos__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:915:1: ( ( ( rule__Servos__NameAssignment_1 ) ) )
            // InternalDofbotDSL.g:916:1: ( ( rule__Servos__NameAssignment_1 ) )
            {
            // InternalDofbotDSL.g:916:1: ( ( rule__Servos__NameAssignment_1 ) )
            // InternalDofbotDSL.g:917:2: ( rule__Servos__NameAssignment_1 )
            {
             before(grammarAccess.getServosAccess().getNameAssignment_1()); 
            // InternalDofbotDSL.g:918:2: ( rule__Servos__NameAssignment_1 )
            // InternalDofbotDSL.g:918:3: rule__Servos__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Servos__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServosAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Servos__Group__1__Impl"


    // $ANTLR start "rule__Angles__Group__0"
    // InternalDofbotDSL.g:927:1: rule__Angles__Group__0 : rule__Angles__Group__0__Impl rule__Angles__Group__1 ;
    public final void rule__Angles__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:931:1: ( rule__Angles__Group__0__Impl rule__Angles__Group__1 )
            // InternalDofbotDSL.g:932:2: rule__Angles__Group__0__Impl rule__Angles__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Angles__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Angles__Group__1();

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
    // $ANTLR end "rule__Angles__Group__0"


    // $ANTLR start "rule__Angles__Group__0__Impl"
    // InternalDofbotDSL.g:939:1: rule__Angles__Group__0__Impl : ( 'Angle' ) ;
    public final void rule__Angles__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:943:1: ( ( 'Angle' ) )
            // InternalDofbotDSL.g:944:1: ( 'Angle' )
            {
            // InternalDofbotDSL.g:944:1: ( 'Angle' )
            // InternalDofbotDSL.g:945:2: 'Angle'
            {
             before(grammarAccess.getAnglesAccess().getAngleKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAnglesAccess().getAngleKeyword_0()); 

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
    // $ANTLR end "rule__Angles__Group__0__Impl"


    // $ANTLR start "rule__Angles__Group__1"
    // InternalDofbotDSL.g:954:1: rule__Angles__Group__1 : rule__Angles__Group__1__Impl ;
    public final void rule__Angles__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:958:1: ( rule__Angles__Group__1__Impl )
            // InternalDofbotDSL.g:959:2: rule__Angles__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Angles__Group__1__Impl();

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
    // $ANTLR end "rule__Angles__Group__1"


    // $ANTLR start "rule__Angles__Group__1__Impl"
    // InternalDofbotDSL.g:965:1: rule__Angles__Group__1__Impl : ( ( rule__Angles__NameAssignment_1 ) ) ;
    public final void rule__Angles__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:969:1: ( ( ( rule__Angles__NameAssignment_1 ) ) )
            // InternalDofbotDSL.g:970:1: ( ( rule__Angles__NameAssignment_1 ) )
            {
            // InternalDofbotDSL.g:970:1: ( ( rule__Angles__NameAssignment_1 ) )
            // InternalDofbotDSL.g:971:2: ( rule__Angles__NameAssignment_1 )
            {
             before(grammarAccess.getAnglesAccess().getNameAssignment_1()); 
            // InternalDofbotDSL.g:972:2: ( rule__Angles__NameAssignment_1 )
            // InternalDofbotDSL.g:972:3: rule__Angles__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Angles__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAnglesAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Angles__Group__1__Impl"


    // $ANTLR start "rule__Arm__NameAssignment_1"
    // InternalDofbotDSL.g:981:1: rule__Arm__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Arm__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:985:1: ( ( RULE_ID ) )
            // InternalDofbotDSL.g:986:2: ( RULE_ID )
            {
            // InternalDofbotDSL.g:986:2: ( RULE_ID )
            // InternalDofbotDSL.g:987:3: RULE_ID
            {
             before(grammarAccess.getArmAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArmAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Arm__NameAssignment_1"


    // $ANTLR start "rule__Arm__RotateMultipleAssignment_3_1"
    // InternalDofbotDSL.g:996:1: rule__Arm__RotateMultipleAssignment_3_1 : ( ruleRotateMultiple ) ;
    public final void rule__Arm__RotateMultipleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:1000:1: ( ( ruleRotateMultiple ) )
            // InternalDofbotDSL.g:1001:2: ( ruleRotateMultiple )
            {
            // InternalDofbotDSL.g:1001:2: ( ruleRotateMultiple )
            // InternalDofbotDSL.g:1002:3: ruleRotateMultiple
            {
             before(grammarAccess.getArmAccess().getRotateMultipleRotateMultipleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRotateMultiple();

            state._fsp--;

             after(grammarAccess.getArmAccess().getRotateMultipleRotateMultipleParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Arm__RotateMultipleAssignment_3_1"


    // $ANTLR start "rule__Arm__RotateSingleAssignment_4_1"
    // InternalDofbotDSL.g:1011:1: rule__Arm__RotateSingleAssignment_4_1 : ( ruleRotateSingle ) ;
    public final void rule__Arm__RotateSingleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:1015:1: ( ( ruleRotateSingle ) )
            // InternalDofbotDSL.g:1016:2: ( ruleRotateSingle )
            {
            // InternalDofbotDSL.g:1016:2: ( ruleRotateSingle )
            // InternalDofbotDSL.g:1017:3: ruleRotateSingle
            {
             before(grammarAccess.getArmAccess().getRotateSingleRotateSingleParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRotateSingle();

            state._fsp--;

             after(grammarAccess.getArmAccess().getRotateSingleRotateSingleParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Arm__RotateSingleAssignment_4_1"


    // $ANTLR start "rule__RotateMultiple__NameAssignment_1"
    // InternalDofbotDSL.g:1026:1: rule__RotateMultiple__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RotateMultiple__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:1030:1: ( ( RULE_ID ) )
            // InternalDofbotDSL.g:1031:2: ( RULE_ID )
            {
            // InternalDofbotDSL.g:1031:2: ( RULE_ID )
            // InternalDofbotDSL.g:1032:3: RULE_ID
            {
             before(grammarAccess.getRotateMultipleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRotateMultipleAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__RotateMultiple__NameAssignment_1"


    // $ANTLR start "rule__RotateMultiple__AngleAssignment_3"
    // InternalDofbotDSL.g:1041:1: rule__RotateMultiple__AngleAssignment_3 : ( ruleAngles ) ;
    public final void rule__RotateMultiple__AngleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:1045:1: ( ( ruleAngles ) )
            // InternalDofbotDSL.g:1046:2: ( ruleAngles )
            {
            // InternalDofbotDSL.g:1046:2: ( ruleAngles )
            // InternalDofbotDSL.g:1047:3: ruleAngles
            {
             before(grammarAccess.getRotateMultipleAccess().getAngleAnglesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAngles();

            state._fsp--;

             after(grammarAccess.getRotateMultipleAccess().getAngleAnglesParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__RotateMultiple__AngleAssignment_3"


    // $ANTLR start "rule__RotateMultiple__TimeAssignment_5"
    // InternalDofbotDSL.g:1056:1: rule__RotateMultiple__TimeAssignment_5 : ( RULE_INT ) ;
    public final void rule__RotateMultiple__TimeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:1060:1: ( ( RULE_INT ) )
            // InternalDofbotDSL.g:1061:2: ( RULE_INT )
            {
            // InternalDofbotDSL.g:1061:2: ( RULE_INT )
            // InternalDofbotDSL.g:1062:3: RULE_INT
            {
             before(grammarAccess.getRotateMultipleAccess().getTimeINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRotateMultipleAccess().getTimeINTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__RotateMultiple__TimeAssignment_5"


    // $ANTLR start "rule__RotateSingle__NameAssignment_1"
    // InternalDofbotDSL.g:1071:1: rule__RotateSingle__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RotateSingle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:1075:1: ( ( RULE_ID ) )
            // InternalDofbotDSL.g:1076:2: ( RULE_ID )
            {
            // InternalDofbotDSL.g:1076:2: ( RULE_ID )
            // InternalDofbotDSL.g:1077:3: RULE_ID
            {
             before(grammarAccess.getRotateSingleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRotateSingleAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__RotateSingle__NameAssignment_1"


    // $ANTLR start "rule__RotateSingle__ServoAssignment_3"
    // InternalDofbotDSL.g:1086:1: rule__RotateSingle__ServoAssignment_3 : ( ruleServos ) ;
    public final void rule__RotateSingle__ServoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:1090:1: ( ( ruleServos ) )
            // InternalDofbotDSL.g:1091:2: ( ruleServos )
            {
            // InternalDofbotDSL.g:1091:2: ( ruleServos )
            // InternalDofbotDSL.g:1092:3: ruleServos
            {
             before(grammarAccess.getRotateSingleAccess().getServoServosParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleServos();

            state._fsp--;

             after(grammarAccess.getRotateSingleAccess().getServoServosParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__RotateSingle__ServoAssignment_3"


    // $ANTLR start "rule__RotateSingle__AngleAssignment_4"
    // InternalDofbotDSL.g:1101:1: rule__RotateSingle__AngleAssignment_4 : ( ruleAngles ) ;
    public final void rule__RotateSingle__AngleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:1105:1: ( ( ruleAngles ) )
            // InternalDofbotDSL.g:1106:2: ( ruleAngles )
            {
            // InternalDofbotDSL.g:1106:2: ( ruleAngles )
            // InternalDofbotDSL.g:1107:3: ruleAngles
            {
             before(grammarAccess.getRotateSingleAccess().getAngleAnglesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAngles();

            state._fsp--;

             after(grammarAccess.getRotateSingleAccess().getAngleAnglesParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__RotateSingle__AngleAssignment_4"


    // $ANTLR start "rule__RotateSingle__TimeAssignment_6"
    // InternalDofbotDSL.g:1116:1: rule__RotateSingle__TimeAssignment_6 : ( RULE_INT ) ;
    public final void rule__RotateSingle__TimeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:1120:1: ( ( RULE_INT ) )
            // InternalDofbotDSL.g:1121:2: ( RULE_INT )
            {
            // InternalDofbotDSL.g:1121:2: ( RULE_INT )
            // InternalDofbotDSL.g:1122:3: RULE_INT
            {
             before(grammarAccess.getRotateSingleAccess().getTimeINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRotateSingleAccess().getTimeINTTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__RotateSingle__TimeAssignment_6"


    // $ANTLR start "rule__Servos__NameAssignment_1"
    // InternalDofbotDSL.g:1131:1: rule__Servos__NameAssignment_1 : ( RULE_INT ) ;
    public final void rule__Servos__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:1135:1: ( ( RULE_INT ) )
            // InternalDofbotDSL.g:1136:2: ( RULE_INT )
            {
            // InternalDofbotDSL.g:1136:2: ( RULE_INT )
            // InternalDofbotDSL.g:1137:3: RULE_INT
            {
             before(grammarAccess.getServosAccess().getNameINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getServosAccess().getNameINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Servos__NameAssignment_1"


    // $ANTLR start "rule__Angles__NameAssignment_1"
    // InternalDofbotDSL.g:1146:1: rule__Angles__NameAssignment_1 : ( RULE_INT ) ;
    public final void rule__Angles__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDofbotDSL.g:1150:1: ( ( RULE_INT ) )
            // InternalDofbotDSL.g:1151:2: ( RULE_INT )
            {
            // InternalDofbotDSL.g:1151:2: ( RULE_INT )
            // InternalDofbotDSL.g:1152:3: RULE_INT
            {
             before(grammarAccess.getAnglesAccess().getNameINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAnglesAccess().getNameINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Angles__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});

}