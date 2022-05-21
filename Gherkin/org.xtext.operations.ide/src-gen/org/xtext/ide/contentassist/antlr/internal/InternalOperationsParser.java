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
import org.xtext.services.OperationsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOperationsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'prueba'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int EOF=-1;

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

    	public void setGrammarAccess(OperationsGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRulePrueba"
    // InternalOperations.g:53:1: entryRulePrueba : rulePrueba EOF ;
    public final void entryRulePrueba() throws RecognitionException {
        try {
            // InternalOperations.g:54:1: ( rulePrueba EOF )
            // InternalOperations.g:55:1: rulePrueba EOF
            {
             before(grammarAccess.getPruebaRule()); 
            pushFollow(FOLLOW_1);
            rulePrueba();

            state._fsp--;

             after(grammarAccess.getPruebaRule()); 
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
    // $ANTLR end "entryRulePrueba"


    // $ANTLR start "rulePrueba"
    // InternalOperations.g:62:1: rulePrueba : ( ( rule__Prueba__Group__0 ) ) ;
    public final void rulePrueba() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOperations.g:66:2: ( ( ( rule__Prueba__Group__0 ) ) )
            // InternalOperations.g:67:2: ( ( rule__Prueba__Group__0 ) )
            {
            // InternalOperations.g:67:2: ( ( rule__Prueba__Group__0 ) )
            // InternalOperations.g:68:3: ( rule__Prueba__Group__0 )
            {
             before(grammarAccess.getPruebaAccess().getGroup()); 
            // InternalOperations.g:69:3: ( rule__Prueba__Group__0 )
            // InternalOperations.g:69:4: rule__Prueba__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Prueba__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPruebaAccess().getGroup()); 

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
    // $ANTLR end "rulePrueba"


    // $ANTLR start "rule__Prueba__Group__0"
    // InternalOperations.g:77:1: rule__Prueba__Group__0 : rule__Prueba__Group__0__Impl rule__Prueba__Group__1 ;
    public final void rule__Prueba__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOperations.g:81:1: ( rule__Prueba__Group__0__Impl rule__Prueba__Group__1 )
            // InternalOperations.g:82:2: rule__Prueba__Group__0__Impl rule__Prueba__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Prueba__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Prueba__Group__1();

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
    // $ANTLR end "rule__Prueba__Group__0"


    // $ANTLR start "rule__Prueba__Group__0__Impl"
    // InternalOperations.g:89:1: rule__Prueba__Group__0__Impl : ( 'prueba' ) ;
    public final void rule__Prueba__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOperations.g:93:1: ( ( 'prueba' ) )
            // InternalOperations.g:94:1: ( 'prueba' )
            {
            // InternalOperations.g:94:1: ( 'prueba' )
            // InternalOperations.g:95:2: 'prueba'
            {
             before(grammarAccess.getPruebaAccess().getPruebaKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getPruebaAccess().getPruebaKeyword_0()); 

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
    // $ANTLR end "rule__Prueba__Group__0__Impl"


    // $ANTLR start "rule__Prueba__Group__1"
    // InternalOperations.g:104:1: rule__Prueba__Group__1 : rule__Prueba__Group__1__Impl ;
    public final void rule__Prueba__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOperations.g:108:1: ( rule__Prueba__Group__1__Impl )
            // InternalOperations.g:109:2: rule__Prueba__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Prueba__Group__1__Impl();

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
    // $ANTLR end "rule__Prueba__Group__1"


    // $ANTLR start "rule__Prueba__Group__1__Impl"
    // InternalOperations.g:115:1: rule__Prueba__Group__1__Impl : ( ( rule__Prueba__NameAssignment_1 ) ) ;
    public final void rule__Prueba__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOperations.g:119:1: ( ( ( rule__Prueba__NameAssignment_1 ) ) )
            // InternalOperations.g:120:1: ( ( rule__Prueba__NameAssignment_1 ) )
            {
            // InternalOperations.g:120:1: ( ( rule__Prueba__NameAssignment_1 ) )
            // InternalOperations.g:121:2: ( rule__Prueba__NameAssignment_1 )
            {
             before(grammarAccess.getPruebaAccess().getNameAssignment_1()); 
            // InternalOperations.g:122:2: ( rule__Prueba__NameAssignment_1 )
            // InternalOperations.g:122:3: rule__Prueba__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Prueba__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPruebaAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Prueba__Group__1__Impl"


    // $ANTLR start "rule__Prueba__NameAssignment_1"
    // InternalOperations.g:131:1: rule__Prueba__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Prueba__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOperations.g:135:1: ( ( RULE_STRING ) )
            // InternalOperations.g:136:2: ( RULE_STRING )
            {
            // InternalOperations.g:136:2: ( RULE_STRING )
            // InternalOperations.g:137:3: RULE_STRING
            {
             before(grammarAccess.getPruebaAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPruebaAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Prueba__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});

}