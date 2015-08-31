package org.modelexecution.operationalsemantics.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.modelexecution.operationalsemantics.services.ActivityDiagramInputGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalActivityDiagramInputParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "','", "'='", "'-'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalActivityDiagramInputParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalActivityDiagramInputParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalActivityDiagramInputParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g"; }


     
     	private ActivityDiagramInputGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ActivityDiagramInputGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleInput"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:60:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:61:1: ( ruleInput EOF )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:62:1: ruleInput EOF
            {
             before(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_ruleInput_in_entryRuleInput61);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getInputRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInput68); 

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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:69:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:73:2: ( ( ( rule__Input__Group__0 ) ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:74:1: ( ( rule__Input__Group__0 ) )
            {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:74:1: ( ( rule__Input__Group__0 ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:75:1: ( rule__Input__Group__0 )
            {
             before(grammarAccess.getInputAccess().getGroup()); 
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:76:1: ( rule__Input__Group__0 )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:76:2: rule__Input__Group__0
            {
            pushFollow(FOLLOW_rule__Input__Group__0_in_ruleInput94);
            rule__Input__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getGroup()); 

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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleInputValue"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:88:1: entryRuleInputValue : ruleInputValue EOF ;
    public final void entryRuleInputValue() throws RecognitionException {
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:89:1: ( ruleInputValue EOF )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:90:1: ruleInputValue EOF
            {
             before(grammarAccess.getInputValueRule()); 
            pushFollow(FOLLOW_ruleInputValue_in_entryRuleInputValue121);
            ruleInputValue();

            state._fsp--;

             after(grammarAccess.getInputValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputValue128); 

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
    // $ANTLR end "entryRuleInputValue"


    // $ANTLR start "ruleInputValue"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:97:1: ruleInputValue : ( ( rule__InputValue__Group__0 ) ) ;
    public final void ruleInputValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:101:2: ( ( ( rule__InputValue__Group__0 ) ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:102:1: ( ( rule__InputValue__Group__0 ) )
            {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:102:1: ( ( rule__InputValue__Group__0 ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:103:1: ( rule__InputValue__Group__0 )
            {
             before(grammarAccess.getInputValueAccess().getGroup()); 
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:104:1: ( rule__InputValue__Group__0 )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:104:2: rule__InputValue__Group__0
            {
            pushFollow(FOLLOW_rule__InputValue__Group__0_in_ruleInputValue154);
            rule__InputValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputValueAccess().getGroup()); 

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
    // $ANTLR end "ruleInputValue"


    // $ANTLR start "entryRuleValue"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:116:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:117:1: ( ruleValue EOF )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:118:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue181);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue188); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:125:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:129:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:130:1: ( ( rule__Value__Alternatives ) )
            {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:130:1: ( ( rule__Value__Alternatives ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:131:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:132:1: ( rule__Value__Alternatives )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:132:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue214);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleBooleanValue"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:144:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:145:1: ( ruleBooleanValue EOF )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:146:1: ruleBooleanValue EOF
            {
             before(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue241);
            ruleBooleanValue();

            state._fsp--;

             after(grammarAccess.getBooleanValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue248); 

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
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:153:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:157:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:158:1: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:158:1: ( ( rule__BooleanValue__ValueAssignment ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:159:1: ( rule__BooleanValue__ValueAssignment )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:160:1: ( rule__BooleanValue__ValueAssignment )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:160:2: rule__BooleanValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue274);
            rule__BooleanValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleIntegerValue"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:172:1: entryRuleIntegerValue : ruleIntegerValue EOF ;
    public final void entryRuleIntegerValue() throws RecognitionException {
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:173:1: ( ruleIntegerValue EOF )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:174:1: ruleIntegerValue EOF
            {
             before(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue301);
            ruleIntegerValue();

            state._fsp--;

             after(grammarAccess.getIntegerValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue308); 

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
    // $ANTLR end "entryRuleIntegerValue"


    // $ANTLR start "ruleIntegerValue"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:181:1: ruleIntegerValue : ( ( rule__IntegerValue__ValueAssignment ) ) ;
    public final void ruleIntegerValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:185:2: ( ( ( rule__IntegerValue__ValueAssignment ) ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:186:1: ( ( rule__IntegerValue__ValueAssignment ) )
            {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:186:1: ( ( rule__IntegerValue__ValueAssignment ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:187:1: ( rule__IntegerValue__ValueAssignment )
            {
             before(grammarAccess.getIntegerValueAccess().getValueAssignment()); 
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:188:1: ( rule__IntegerValue__ValueAssignment )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:188:2: rule__IntegerValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntegerValue__ValueAssignment_in_ruleIntegerValue334);
            rule__IntegerValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntegerValueAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleIntegerValue"


    // $ANTLR start "entryRuleEBoolean"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:200:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:201:1: ( ruleEBoolean EOF )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:202:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_ruleEBoolean_in_entryRuleEBoolean361);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEBoolean368); 

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:209:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:213:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:214:1: ( ( rule__EBoolean__Alternatives ) )
            {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:214:1: ( ( rule__EBoolean__Alternatives ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:215:1: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:216:1: ( rule__EBoolean__Alternatives )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:216:2: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean394);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEInt"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:228:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:229:1: ( ruleEInt EOF )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:230:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_ruleEInt_in_entryRuleEInt421);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEInt428); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:237:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:241:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:242:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:242:1: ( ( rule__EInt__Group__0 ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:243:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:244:1: ( rule__EInt__Group__0 )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:244:2: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_rule__EInt__Group__0_in_ruleEInt454);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:256:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:257:1: ( ruleEString EOF )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:258:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString481);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString488); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:265:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:269:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:270:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:270:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:271:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:272:1: ( rule__EString__Alternatives )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:272:2: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_rule__EString__Alternatives_in_ruleEString514);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "rule__Value__Alternatives"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:284:1: rule__Value__Alternatives : ( ( ruleBooleanValue ) | ( ruleIntegerValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:288:1: ( ( ruleBooleanValue ) | ( ruleIntegerValue ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_INT||LA1_0==15) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:289:1: ( ruleBooleanValue )
                    {
                    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:289:1: ( ruleBooleanValue )
                    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:290:1: ruleBooleanValue
                    {
                     before(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBooleanValue_in_rule__Value__Alternatives550);
                    ruleBooleanValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:295:6: ( ruleIntegerValue )
                    {
                    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:295:6: ( ruleIntegerValue )
                    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:296:1: ruleIntegerValue
                    {
                     before(grammarAccess.getValueAccess().getIntegerValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntegerValue_in_rule__Value__Alternatives567);
                    ruleIntegerValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getIntegerValueParserRuleCall_1()); 

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
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:306:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:310:1: ( ( 'true' ) | ( 'false' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:311:1: ( 'true' )
                    {
                    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:311:1: ( 'true' )
                    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:312:1: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__EBoolean__Alternatives600); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:319:6: ( 'false' )
                    {
                    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:319:6: ( 'false' )
                    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:320:1: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__EBoolean__Alternatives620); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

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
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:332:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:336:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:337:1: ( RULE_STRING )
                    {
                    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:337:1: ( RULE_STRING )
                    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:338:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EString__Alternatives654); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:343:6: ( RULE_ID )
                    {
                    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:343:6: ( RULE_ID )
                    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:344:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives671); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Input__Group__0"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:356:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:360:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:361:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__0701);
            rule__Input__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__1_in_rule__Input__Group__0704);
            rule__Input__Group__1();

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
    // $ANTLR end "rule__Input__Group__0"


    // $ANTLR start "rule__Input__Group__0__Impl"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:368:1: rule__Input__Group__0__Impl : ( () ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:372:1: ( ( () ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:373:1: ( () )
            {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:373:1: ( () )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:374:1: ()
            {
             before(grammarAccess.getInputAccess().getInputAction_0()); 
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:375:1: ()
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:377:1: 
            {
            }

             after(grammarAccess.getInputAccess().getInputAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0__Impl"


    // $ANTLR start "rule__Input__Group__1"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:387:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:391:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:392:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__1762);
            rule__Input__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__2_in_rule__Input__Group__1765);
            rule__Input__Group__2();

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
    // $ANTLR end "rule__Input__Group__1"


    // $ANTLR start "rule__Input__Group__1__Impl"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:399:1: rule__Input__Group__1__Impl : ( ( rule__Input__InputValuesAssignment_1 ) ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:403:1: ( ( ( rule__Input__InputValuesAssignment_1 ) ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:404:1: ( ( rule__Input__InputValuesAssignment_1 ) )
            {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:404:1: ( ( rule__Input__InputValuesAssignment_1 ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:405:1: ( rule__Input__InputValuesAssignment_1 )
            {
             before(grammarAccess.getInputAccess().getInputValuesAssignment_1()); 
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:406:1: ( rule__Input__InputValuesAssignment_1 )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:406:2: rule__Input__InputValuesAssignment_1
            {
            pushFollow(FOLLOW_rule__Input__InputValuesAssignment_1_in_rule__Input__Group__1__Impl792);
            rule__Input__InputValuesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getInputValuesAssignment_1()); 

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
    // $ANTLR end "rule__Input__Group__1__Impl"


    // $ANTLR start "rule__Input__Group__2"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:416:1: rule__Input__Group__2 : rule__Input__Group__2__Impl ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:420:1: ( rule__Input__Group__2__Impl )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:421:2: rule__Input__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group__2__Impl_in_rule__Input__Group__2822);
            rule__Input__Group__2__Impl();

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
    // $ANTLR end "rule__Input__Group__2"


    // $ANTLR start "rule__Input__Group__2__Impl"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:427:1: rule__Input__Group__2__Impl : ( ( rule__Input__Group_2__0 )* ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:431:1: ( ( ( rule__Input__Group_2__0 )* ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:432:1: ( ( rule__Input__Group_2__0 )* )
            {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:432:1: ( ( rule__Input__Group_2__0 )* )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:433:1: ( rule__Input__Group_2__0 )*
            {
             before(grammarAccess.getInputAccess().getGroup_2()); 
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:434:1: ( rule__Input__Group_2__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:434:2: rule__Input__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Input__Group_2__0_in_rule__Input__Group__2__Impl849);
            	    rule__Input__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getInputAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Input__Group__2__Impl"


    // $ANTLR start "rule__Input__Group_2__0"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:450:1: rule__Input__Group_2__0 : rule__Input__Group_2__0__Impl rule__Input__Group_2__1 ;
    public final void rule__Input__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:454:1: ( rule__Input__Group_2__0__Impl rule__Input__Group_2__1 )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:455:2: rule__Input__Group_2__0__Impl rule__Input__Group_2__1
            {
            pushFollow(FOLLOW_rule__Input__Group_2__0__Impl_in_rule__Input__Group_2__0886);
            rule__Input__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group_2__1_in_rule__Input__Group_2__0889);
            rule__Input__Group_2__1();

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
    // $ANTLR end "rule__Input__Group_2__0"


    // $ANTLR start "rule__Input__Group_2__0__Impl"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:462:1: rule__Input__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Input__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:466:1: ( ( ',' ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:467:1: ( ',' )
            {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:467:1: ( ',' )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:468:1: ','
            {
             before(grammarAccess.getInputAccess().getCommaKeyword_2_0()); 
            match(input,13,FOLLOW_13_in_rule__Input__Group_2__0__Impl917); 
             after(grammarAccess.getInputAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__Input__Group_2__0__Impl"


    // $ANTLR start "rule__Input__Group_2__1"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:481:1: rule__Input__Group_2__1 : rule__Input__Group_2__1__Impl ;
    public final void rule__Input__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:485:1: ( rule__Input__Group_2__1__Impl )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:486:2: rule__Input__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group_2__1__Impl_in_rule__Input__Group_2__1948);
            rule__Input__Group_2__1__Impl();

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
    // $ANTLR end "rule__Input__Group_2__1"


    // $ANTLR start "rule__Input__Group_2__1__Impl"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:492:1: rule__Input__Group_2__1__Impl : ( ( rule__Input__InputValuesAssignment_2_1 ) ) ;
    public final void rule__Input__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:496:1: ( ( ( rule__Input__InputValuesAssignment_2_1 ) ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:497:1: ( ( rule__Input__InputValuesAssignment_2_1 ) )
            {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:497:1: ( ( rule__Input__InputValuesAssignment_2_1 ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:498:1: ( rule__Input__InputValuesAssignment_2_1 )
            {
             before(grammarAccess.getInputAccess().getInputValuesAssignment_2_1()); 
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:499:1: ( rule__Input__InputValuesAssignment_2_1 )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:499:2: rule__Input__InputValuesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Input__InputValuesAssignment_2_1_in_rule__Input__Group_2__1__Impl975);
            rule__Input__InputValuesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getInputValuesAssignment_2_1()); 

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
    // $ANTLR end "rule__Input__Group_2__1__Impl"


    // $ANTLR start "rule__InputValue__Group__0"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:513:1: rule__InputValue__Group__0 : rule__InputValue__Group__0__Impl rule__InputValue__Group__1 ;
    public final void rule__InputValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:517:1: ( rule__InputValue__Group__0__Impl rule__InputValue__Group__1 )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:518:2: rule__InputValue__Group__0__Impl rule__InputValue__Group__1
            {
            pushFollow(FOLLOW_rule__InputValue__Group__0__Impl_in_rule__InputValue__Group__01009);
            rule__InputValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InputValue__Group__1_in_rule__InputValue__Group__01012);
            rule__InputValue__Group__1();

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
    // $ANTLR end "rule__InputValue__Group__0"


    // $ANTLR start "rule__InputValue__Group__0__Impl"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:525:1: rule__InputValue__Group__0__Impl : ( ( rule__InputValue__VariableAssignment_0 ) ) ;
    public final void rule__InputValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:529:1: ( ( ( rule__InputValue__VariableAssignment_0 ) ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:530:1: ( ( rule__InputValue__VariableAssignment_0 ) )
            {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:530:1: ( ( rule__InputValue__VariableAssignment_0 ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:531:1: ( rule__InputValue__VariableAssignment_0 )
            {
             before(grammarAccess.getInputValueAccess().getVariableAssignment_0()); 
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:532:1: ( rule__InputValue__VariableAssignment_0 )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:532:2: rule__InputValue__VariableAssignment_0
            {
            pushFollow(FOLLOW_rule__InputValue__VariableAssignment_0_in_rule__InputValue__Group__0__Impl1039);
            rule__InputValue__VariableAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInputValueAccess().getVariableAssignment_0()); 

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
    // $ANTLR end "rule__InputValue__Group__0__Impl"


    // $ANTLR start "rule__InputValue__Group__1"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:542:1: rule__InputValue__Group__1 : rule__InputValue__Group__1__Impl rule__InputValue__Group__2 ;
    public final void rule__InputValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:546:1: ( rule__InputValue__Group__1__Impl rule__InputValue__Group__2 )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:547:2: rule__InputValue__Group__1__Impl rule__InputValue__Group__2
            {
            pushFollow(FOLLOW_rule__InputValue__Group__1__Impl_in_rule__InputValue__Group__11069);
            rule__InputValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InputValue__Group__2_in_rule__InputValue__Group__11072);
            rule__InputValue__Group__2();

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
    // $ANTLR end "rule__InputValue__Group__1"


    // $ANTLR start "rule__InputValue__Group__1__Impl"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:554:1: rule__InputValue__Group__1__Impl : ( '=' ) ;
    public final void rule__InputValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:558:1: ( ( '=' ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:559:1: ( '=' )
            {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:559:1: ( '=' )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:560:1: '='
            {
             before(grammarAccess.getInputValueAccess().getEqualsSignKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__InputValue__Group__1__Impl1100); 
             after(grammarAccess.getInputValueAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__InputValue__Group__1__Impl"


    // $ANTLR start "rule__InputValue__Group__2"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:573:1: rule__InputValue__Group__2 : rule__InputValue__Group__2__Impl ;
    public final void rule__InputValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:577:1: ( rule__InputValue__Group__2__Impl )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:578:2: rule__InputValue__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__InputValue__Group__2__Impl_in_rule__InputValue__Group__21131);
            rule__InputValue__Group__2__Impl();

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
    // $ANTLR end "rule__InputValue__Group__2"


    // $ANTLR start "rule__InputValue__Group__2__Impl"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:584:1: rule__InputValue__Group__2__Impl : ( ( rule__InputValue__ValueAssignment_2 ) ) ;
    public final void rule__InputValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:588:1: ( ( ( rule__InputValue__ValueAssignment_2 ) ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:589:1: ( ( rule__InputValue__ValueAssignment_2 ) )
            {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:589:1: ( ( rule__InputValue__ValueAssignment_2 ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:590:1: ( rule__InputValue__ValueAssignment_2 )
            {
             before(grammarAccess.getInputValueAccess().getValueAssignment_2()); 
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:591:1: ( rule__InputValue__ValueAssignment_2 )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:591:2: rule__InputValue__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__InputValue__ValueAssignment_2_in_rule__InputValue__Group__2__Impl1158);
            rule__InputValue__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInputValueAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__InputValue__Group__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:607:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:611:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:612:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__01194);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__01197);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:619:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:623:1: ( ( ( '-' )? ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:624:1: ( ( '-' )? )
            {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:624:1: ( ( '-' )? )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:625:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:626:1: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:627:2: '-'
                    {
                    match(input,15,FOLLOW_15_in_rule__EInt__Group__0__Impl1226); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:638:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:642:1: ( rule__EInt__Group__1__Impl )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:643:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__11259);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:649:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:653:1: ( ( RULE_INT ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:654:1: ( RULE_INT )
            {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:654:1: ( RULE_INT )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:655:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl1286); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Input__InputValuesAssignment_1"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:671:1: rule__Input__InputValuesAssignment_1 : ( ruleInputValue ) ;
    public final void rule__Input__InputValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:675:1: ( ( ruleInputValue ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:676:1: ( ruleInputValue )
            {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:676:1: ( ruleInputValue )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:677:1: ruleInputValue
            {
             before(grammarAccess.getInputAccess().getInputValuesInputValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleInputValue_in_rule__Input__InputValuesAssignment_11324);
            ruleInputValue();

            state._fsp--;

             after(grammarAccess.getInputAccess().getInputValuesInputValueParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Input__InputValuesAssignment_1"


    // $ANTLR start "rule__Input__InputValuesAssignment_2_1"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:686:1: rule__Input__InputValuesAssignment_2_1 : ( ruleInputValue ) ;
    public final void rule__Input__InputValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:690:1: ( ( ruleInputValue ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:691:1: ( ruleInputValue )
            {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:691:1: ( ruleInputValue )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:692:1: ruleInputValue
            {
             before(grammarAccess.getInputAccess().getInputValuesInputValueParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleInputValue_in_rule__Input__InputValuesAssignment_2_11355);
            ruleInputValue();

            state._fsp--;

             after(grammarAccess.getInputAccess().getInputValuesInputValueParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Input__InputValuesAssignment_2_1"


    // $ANTLR start "rule__InputValue__VariableAssignment_0"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:701:1: rule__InputValue__VariableAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__InputValue__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:705:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:706:1: ( ( ruleEString ) )
            {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:706:1: ( ( ruleEString ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:707:1: ( ruleEString )
            {
             before(grammarAccess.getInputValueAccess().getVariableVariableCrossReference_0_0()); 
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:708:1: ( ruleEString )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:709:1: ruleEString
            {
             before(grammarAccess.getInputValueAccess().getVariableVariableEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__InputValue__VariableAssignment_01390);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputValueAccess().getVariableVariableEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getInputValueAccess().getVariableVariableCrossReference_0_0()); 

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
    // $ANTLR end "rule__InputValue__VariableAssignment_0"


    // $ANTLR start "rule__InputValue__ValueAssignment_2"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:720:1: rule__InputValue__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__InputValue__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:724:1: ( ( ruleValue ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:725:1: ( ruleValue )
            {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:725:1: ( ruleValue )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:726:1: ruleValue
            {
             before(grammarAccess.getInputValueAccess().getValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__InputValue__ValueAssignment_21425);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getInputValueAccess().getValueValueParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__InputValue__ValueAssignment_2"


    // $ANTLR start "rule__BooleanValue__ValueAssignment"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:735:1: rule__BooleanValue__ValueAssignment : ( ruleEBoolean ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:739:1: ( ( ruleEBoolean ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:740:1: ( ruleEBoolean )
            {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:740:1: ( ruleEBoolean )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:741:1: ruleEBoolean
            {
             before(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEBoolean_in_rule__BooleanValue__ValueAssignment1456);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_0()); 

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
    // $ANTLR end "rule__BooleanValue__ValueAssignment"


    // $ANTLR start "rule__IntegerValue__ValueAssignment"
    // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:750:1: rule__IntegerValue__ValueAssignment : ( ruleEInt ) ;
    public final void rule__IntegerValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:754:1: ( ( ruleEInt ) )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:755:1: ( ruleEInt )
            {
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:755:1: ( ruleEInt )
            // ../org.xtext.activitydiagram.input.ui/src-gen/org/modelexecution/operationalsemantics/ui/contentassist/antlr/internal/InternalActivityDiagramInput.g:756:1: ruleEInt
            {
             before(grammarAccess.getIntegerValueAccess().getValueEIntParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEInt_in_rule__IntegerValue__ValueAssignment1487);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerValueAccess().getValueEIntParserRuleCall_0()); 

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
    // $ANTLR end "rule__IntegerValue__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__0_in_ruleInput94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputValue_in_entryRuleInputValue121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputValue128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputValue__Group__0_in_ruleInputValue154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerValue__ValueAssignment_in_ruleIntegerValue334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEInt428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_rule__Value__Alternatives550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_rule__Value__Alternatives567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__EBoolean__Alternatives600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__EBoolean__Alternatives620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__0701 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Input__Group__1_in_rule__Input__Group__0704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__1762 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Input__Group__2_in_rule__Input__Group__1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__InputValuesAssignment_1_in_rule__Input__Group__1__Impl792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__2__Impl_in_rule__Input__Group__2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_2__0_in_rule__Input__Group__2__Impl849 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Input__Group_2__0__Impl_in_rule__Input__Group_2__0886 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Input__Group_2__1_in_rule__Input__Group_2__0889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Input__Group_2__0__Impl917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_2__1__Impl_in_rule__Input__Group_2__1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__InputValuesAssignment_2_1_in_rule__Input__Group_2__1__Impl975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputValue__Group__0__Impl_in_rule__InputValue__Group__01009 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__InputValue__Group__1_in_rule__InputValue__Group__01012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputValue__VariableAssignment_0_in_rule__InputValue__Group__0__Impl1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputValue__Group__1__Impl_in_rule__InputValue__Group__11069 = new BitSet(new long[]{0x0000000000009840L});
    public static final BitSet FOLLOW_rule__InputValue__Group__2_in_rule__InputValue__Group__11072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__InputValue__Group__1__Impl1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputValue__Group__2__Impl_in_rule__InputValue__Group__21131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputValue__ValueAssignment_2_in_rule__InputValue__Group__2__Impl1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__01194 = new BitSet(new long[]{0x0000000000009840L});
    public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__01197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EInt__Group__0__Impl1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__11259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputValue_in_rule__Input__InputValuesAssignment_11324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputValue_in_rule__Input__InputValuesAssignment_2_11355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__InputValue__VariableAssignment_01390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__InputValue__ValueAssignment_21425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBoolean_in_rule__BooleanValue__ValueAssignment1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEInt_in_rule__IntegerValue__ValueAssignment1487 = new BitSet(new long[]{0x0000000000000002L});

}