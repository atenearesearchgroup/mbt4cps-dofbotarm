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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=4;
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



    // $ANTLR start "entryRuleServo"
    // InternalOperations.g:53:1: entryRuleServo : ruleServo EOF ;
    public final void entryRuleServo() throws RecognitionException {
        try {
            // InternalOperations.g:54:1: ( ruleServo EOF )
            // InternalOperations.g:55:1: ruleServo EOF
            {
             before(grammarAccess.getServoRule()); 
            pushFollow(FOLLOW_1);
            ruleServo();

            state._fsp--;

             after(grammarAccess.getServoRule()); 
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
    // $ANTLR end "entryRuleServo"


    // $ANTLR start "ruleServo"
    // InternalOperations.g:62:1: ruleServo : ( ( rule__Servo__ServoAssignment ) ) ;
    public final void ruleServo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOperations.g:66:2: ( ( ( rule__Servo__ServoAssignment ) ) )
            // InternalOperations.g:67:2: ( ( rule__Servo__ServoAssignment ) )
            {
            // InternalOperations.g:67:2: ( ( rule__Servo__ServoAssignment ) )
            // InternalOperations.g:68:3: ( rule__Servo__ServoAssignment )
            {
             before(grammarAccess.getServoAccess().getServoAssignment()); 
            // InternalOperations.g:69:3: ( rule__Servo__ServoAssignment )
            // InternalOperations.g:69:4: rule__Servo__ServoAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Servo__ServoAssignment();

            state._fsp--;


            }

             after(grammarAccess.getServoAccess().getServoAssignment()); 

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
    // $ANTLR end "ruleServo"


    // $ANTLR start "rule__Servo__ServoAssignment"
    // InternalOperations.g:77:1: rule__Servo__ServoAssignment : ( RULE_INT ) ;
    public final void rule__Servo__ServoAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOperations.g:81:1: ( ( RULE_INT ) )
            // InternalOperations.g:82:2: ( RULE_INT )
            {
            // InternalOperations.g:82:2: ( RULE_INT )
            // InternalOperations.g:83:3: RULE_INT
            {
             before(grammarAccess.getServoAccess().getServoINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getServoAccess().getServoINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Servo__ServoAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});

}