package fr.inria.diverse.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.inria.diverse.services.MiniFSMGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMiniFSMParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FSM'", "'{'", "'initialState'", "'}'", "'State'", "'->'", "'['", "']'", "'Context'", "'FinalState'", "'AssignBool'", "'('", "','", "')'", "'AssignInt'", "'PrintVar'", "'PrintStr'", "'OR'", "'AND'", "'!'", "'value'", "'Boolean'", "'true'", "'false'", "'equal'", "'greater'", "'greaterOrEqual'", "'less'", "'lessOrEqual'", "'+'", "'-'", "'*'", "'/'", "'Integer'", "'='"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMiniFSMParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMiniFSMParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMiniFSMParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMiniFSM.g"; }



     	private MiniFSMGrammarAccess grammarAccess;

        public InternalMiniFSMParser(TokenStream input, MiniFSMGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "FSM";
       	}

       	@Override
       	protected MiniFSMGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFSM"
    // InternalMiniFSM.g:64:1: entryRuleFSM returns [EObject current=null] : iv_ruleFSM= ruleFSM EOF ;
    public final EObject entryRuleFSM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFSM = null;


        try {
            // InternalMiniFSM.g:64:44: (iv_ruleFSM= ruleFSM EOF )
            // InternalMiniFSM.g:65:2: iv_ruleFSM= ruleFSM EOF
            {
             newCompositeNode(grammarAccess.getFSMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFSM=ruleFSM();

            state._fsp--;

             current =iv_ruleFSM; 
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
    // $ANTLR end "entryRuleFSM"


    // $ANTLR start "ruleFSM"
    // InternalMiniFSM.g:71:1: ruleFSM returns [EObject current=null] : (otherlv_0= 'FSM' otherlv_1= '{' ( ( (lv_states_2_0= ruleState ) ) ( (lv_states_3_0= ruleState ) )* )? otherlv_4= 'initialState' ( ( ruleEString ) ) ( ( (lv_transitions_6_0= ruleTransition ) ) ( (lv_transitions_7_0= ruleTransition ) )* )? ( (lv_context_8_0= ruleContext ) )? otherlv_9= '}' ) ;
    public final EObject ruleFSM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_9=null;
        EObject lv_states_2_0 = null;

        EObject lv_states_3_0 = null;

        EObject lv_transitions_6_0 = null;

        EObject lv_transitions_7_0 = null;

        EObject lv_context_8_0 = null;



        	enterRule();

        try {
            // InternalMiniFSM.g:77:2: ( (otherlv_0= 'FSM' otherlv_1= '{' ( ( (lv_states_2_0= ruleState ) ) ( (lv_states_3_0= ruleState ) )* )? otherlv_4= 'initialState' ( ( ruleEString ) ) ( ( (lv_transitions_6_0= ruleTransition ) ) ( (lv_transitions_7_0= ruleTransition ) )* )? ( (lv_context_8_0= ruleContext ) )? otherlv_9= '}' ) )
            // InternalMiniFSM.g:78:2: (otherlv_0= 'FSM' otherlv_1= '{' ( ( (lv_states_2_0= ruleState ) ) ( (lv_states_3_0= ruleState ) )* )? otherlv_4= 'initialState' ( ( ruleEString ) ) ( ( (lv_transitions_6_0= ruleTransition ) ) ( (lv_transitions_7_0= ruleTransition ) )* )? ( (lv_context_8_0= ruleContext ) )? otherlv_9= '}' )
            {
            // InternalMiniFSM.g:78:2: (otherlv_0= 'FSM' otherlv_1= '{' ( ( (lv_states_2_0= ruleState ) ) ( (lv_states_3_0= ruleState ) )* )? otherlv_4= 'initialState' ( ( ruleEString ) ) ( ( (lv_transitions_6_0= ruleTransition ) ) ( (lv_transitions_7_0= ruleTransition ) )* )? ( (lv_context_8_0= ruleContext ) )? otherlv_9= '}' )
            // InternalMiniFSM.g:79:3: otherlv_0= 'FSM' otherlv_1= '{' ( ( (lv_states_2_0= ruleState ) ) ( (lv_states_3_0= ruleState ) )* )? otherlv_4= 'initialState' ( ( ruleEString ) ) ( ( (lv_transitions_6_0= ruleTransition ) ) ( (lv_transitions_7_0= ruleTransition ) )* )? ( (lv_context_8_0= ruleContext ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFSMAccess().getFSMKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFSMAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMiniFSM.g:87:3: ( ( (lv_states_2_0= ruleState ) ) ( (lv_states_3_0= ruleState ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15||LA2_0==20) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMiniFSM.g:88:4: ( (lv_states_2_0= ruleState ) ) ( (lv_states_3_0= ruleState ) )*
                    {
                    // InternalMiniFSM.g:88:4: ( (lv_states_2_0= ruleState ) )
                    // InternalMiniFSM.g:89:5: (lv_states_2_0= ruleState )
                    {
                    // InternalMiniFSM.g:89:5: (lv_states_2_0= ruleState )
                    // InternalMiniFSM.g:90:6: lv_states_2_0= ruleState
                    {

                    						newCompositeNode(grammarAccess.getFSMAccess().getStatesStateParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_states_2_0=ruleState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFSMRule());
                    						}
                    						add(
                    							current,
                    							"states",
                    							lv_states_2_0,
                    							"fr.inria.diverse.MiniFSM.State");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMiniFSM.g:107:4: ( (lv_states_3_0= ruleState ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==15||LA1_0==20) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMiniFSM.g:108:5: (lv_states_3_0= ruleState )
                    	    {
                    	    // InternalMiniFSM.g:108:5: (lv_states_3_0= ruleState )
                    	    // InternalMiniFSM.g:109:6: lv_states_3_0= ruleState
                    	    {

                    	    						newCompositeNode(grammarAccess.getFSMAccess().getStatesStateParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_4);
                    	    lv_states_3_0=ruleState();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getFSMRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"states",
                    	    							lv_states_3_0,
                    	    							"fr.inria.diverse.MiniFSM.State");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getFSMAccess().getInitialStateKeyword_3());
            		
            // InternalMiniFSM.g:131:3: ( ( ruleEString ) )
            // InternalMiniFSM.g:132:4: ( ruleEString )
            {
            // InternalMiniFSM.g:132:4: ( ruleEString )
            // InternalMiniFSM.g:133:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFSMRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFSMAccess().getInitialStateStateCrossReference_4_0());
            				
            pushFollow(FOLLOW_6);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMiniFSM.g:147:3: ( ( (lv_transitions_6_0= ruleTransition ) ) ( (lv_transitions_7_0= ruleTransition ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMiniFSM.g:148:4: ( (lv_transitions_6_0= ruleTransition ) ) ( (lv_transitions_7_0= ruleTransition ) )*
                    {
                    // InternalMiniFSM.g:148:4: ( (lv_transitions_6_0= ruleTransition ) )
                    // InternalMiniFSM.g:149:5: (lv_transitions_6_0= ruleTransition )
                    {
                    // InternalMiniFSM.g:149:5: (lv_transitions_6_0= ruleTransition )
                    // InternalMiniFSM.g:150:6: lv_transitions_6_0= ruleTransition
                    {

                    						newCompositeNode(grammarAccess.getFSMAccess().getTransitionsTransitionParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_transitions_6_0=ruleTransition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFSMRule());
                    						}
                    						add(
                    							current,
                    							"transitions",
                    							lv_transitions_6_0,
                    							"fr.inria.diverse.MiniFSM.Transition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMiniFSM.g:167:4: ( (lv_transitions_7_0= ruleTransition ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMiniFSM.g:168:5: (lv_transitions_7_0= ruleTransition )
                    	    {
                    	    // InternalMiniFSM.g:168:5: (lv_transitions_7_0= ruleTransition )
                    	    // InternalMiniFSM.g:169:6: lv_transitions_7_0= ruleTransition
                    	    {

                    	    						newCompositeNode(grammarAccess.getFSMAccess().getTransitionsTransitionParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_transitions_7_0=ruleTransition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getFSMRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"transitions",
                    	    							lv_transitions_7_0,
                    	    							"fr.inria.diverse.MiniFSM.Transition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMiniFSM.g:187:3: ( (lv_context_8_0= ruleContext ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMiniFSM.g:188:4: (lv_context_8_0= ruleContext )
                    {
                    // InternalMiniFSM.g:188:4: (lv_context_8_0= ruleContext )
                    // InternalMiniFSM.g:189:5: lv_context_8_0= ruleContext
                    {

                    					newCompositeNode(grammarAccess.getFSMAccess().getContextContextParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_context_8_0=ruleContext();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFSMRule());
                    					}
                    					set(
                    						current,
                    						"context",
                    						lv_context_8_0,
                    						"fr.inria.diverse.MiniFSM.Context");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getFSMAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleFSM"


    // $ANTLR start "entryRuleState"
    // InternalMiniFSM.g:214:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalMiniFSM.g:214:46: (iv_ruleState= ruleState EOF )
            // InternalMiniFSM.g:215:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalMiniFSM.g:221:1: ruleState returns [EObject current=null] : (this_State_Impl_0= ruleState_Impl | this_FinalState_1= ruleFinalState ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        EObject this_State_Impl_0 = null;

        EObject this_FinalState_1 = null;



        	enterRule();

        try {
            // InternalMiniFSM.g:227:2: ( (this_State_Impl_0= ruleState_Impl | this_FinalState_1= ruleFinalState ) )
            // InternalMiniFSM.g:228:2: (this_State_Impl_0= ruleState_Impl | this_FinalState_1= ruleFinalState )
            {
            // InternalMiniFSM.g:228:2: (this_State_Impl_0= ruleState_Impl | this_FinalState_1= ruleFinalState )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==20) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMiniFSM.g:229:3: this_State_Impl_0= ruleState_Impl
                    {

                    			newCompositeNode(grammarAccess.getStateAccess().getState_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_State_Impl_0=ruleState_Impl();

                    state._fsp--;


                    			current = this_State_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMiniFSM.g:238:3: this_FinalState_1= ruleFinalState
                    {

                    			newCompositeNode(grammarAccess.getStateAccess().getFinalStateParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FinalState_1=ruleFinalState();

                    state._fsp--;


                    			current = this_FinalState_1;
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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleVariable"
    // InternalMiniFSM.g:250:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMiniFSM.g:250:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMiniFSM.g:251:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMiniFSM.g:257:1: ruleVariable returns [EObject current=null] : (this_IntegerVar_0= ruleIntegerVar | this_BooleanVar_1= ruleBooleanVar ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerVar_0 = null;

        EObject this_BooleanVar_1 = null;



        	enterRule();

        try {
            // InternalMiniFSM.g:263:2: ( (this_IntegerVar_0= ruleIntegerVar | this_BooleanVar_1= ruleBooleanVar ) )
            // InternalMiniFSM.g:264:2: (this_IntegerVar_0= ruleIntegerVar | this_BooleanVar_1= ruleBooleanVar )
            {
            // InternalMiniFSM.g:264:2: (this_IntegerVar_0= ruleIntegerVar | this_BooleanVar_1= ruleBooleanVar )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==44) ) {
                alt7=1;
            }
            else if ( (LA7_0==32) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMiniFSM.g:265:3: this_IntegerVar_0= ruleIntegerVar
                    {

                    			newCompositeNode(grammarAccess.getVariableAccess().getIntegerVarParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerVar_0=ruleIntegerVar();

                    state._fsp--;


                    			current = this_IntegerVar_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMiniFSM.g:274:3: this_BooleanVar_1= ruleBooleanVar
                    {

                    			newCompositeNode(grammarAccess.getVariableAccess().getBooleanVarParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanVar_1=ruleBooleanVar();

                    state._fsp--;


                    			current = this_BooleanVar_1;
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleStatement"
    // InternalMiniFSM.g:286:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMiniFSM.g:286:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMiniFSM.g:287:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMiniFSM.g:293:1: ruleStatement returns [EObject current=null] : (this_BooleanAssignment_0= ruleBooleanAssignment | this_IntAssignment_1= ruleIntAssignment | this_PrintVar_2= rulePrintVar | this_PrintStr_3= rulePrintStr ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanAssignment_0 = null;

        EObject this_IntAssignment_1 = null;

        EObject this_PrintVar_2 = null;

        EObject this_PrintStr_3 = null;



        	enterRule();

        try {
            // InternalMiniFSM.g:299:2: ( (this_BooleanAssignment_0= ruleBooleanAssignment | this_IntAssignment_1= ruleIntAssignment | this_PrintVar_2= rulePrintVar | this_PrintStr_3= rulePrintStr ) )
            // InternalMiniFSM.g:300:2: (this_BooleanAssignment_0= ruleBooleanAssignment | this_IntAssignment_1= ruleIntAssignment | this_PrintVar_2= rulePrintVar | this_PrintStr_3= rulePrintStr )
            {
            // InternalMiniFSM.g:300:2: (this_BooleanAssignment_0= ruleBooleanAssignment | this_IntAssignment_1= ruleIntAssignment | this_PrintVar_2= rulePrintVar | this_PrintStr_3= rulePrintStr )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt8=1;
                }
                break;
            case 25:
                {
                alt8=2;
                }
                break;
            case 26:
                {
                alt8=3;
                }
                break;
            case 27:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMiniFSM.g:301:3: this_BooleanAssignment_0= ruleBooleanAssignment
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getBooleanAssignmentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanAssignment_0=ruleBooleanAssignment();

                    state._fsp--;


                    			current = this_BooleanAssignment_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMiniFSM.g:310:3: this_IntAssignment_1= ruleIntAssignment
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getIntAssignmentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntAssignment_1=ruleIntAssignment();

                    state._fsp--;


                    			current = this_IntAssignment_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMiniFSM.g:319:3: this_PrintVar_2= rulePrintVar
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getPrintVarParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrintVar_2=rulePrintVar();

                    state._fsp--;


                    			current = this_PrintVar_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMiniFSM.g:328:3: this_PrintStr_3= rulePrintStr
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getPrintStrParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrintStr_3=rulePrintStr();

                    state._fsp--;


                    			current = this_PrintStr_3;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleState_Impl"
    // InternalMiniFSM.g:340:1: entryRuleState_Impl returns [EObject current=null] : iv_ruleState_Impl= ruleState_Impl EOF ;
    public final EObject entryRuleState_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState_Impl = null;


        try {
            // InternalMiniFSM.g:340:51: (iv_ruleState_Impl= ruleState_Impl EOF )
            // InternalMiniFSM.g:341:2: iv_ruleState_Impl= ruleState_Impl EOF
            {
             newCompositeNode(grammarAccess.getState_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState_Impl=ruleState_Impl();

            state._fsp--;

             current =iv_ruleState_Impl; 
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
    // $ANTLR end "entryRuleState_Impl"


    // $ANTLR start "ruleState_Impl"
    // InternalMiniFSM.g:347:1: ruleState_Impl returns [EObject current=null] : ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) ( (lv_block_3_0= ruleBlock ) )? ) ;
    public final EObject ruleState_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_block_3_0 = null;



        	enterRule();

        try {
            // InternalMiniFSM.g:353:2: ( ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) ( (lv_block_3_0= ruleBlock ) )? ) )
            // InternalMiniFSM.g:354:2: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) ( (lv_block_3_0= ruleBlock ) )? )
            {
            // InternalMiniFSM.g:354:2: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) ( (lv_block_3_0= ruleBlock ) )? )
            // InternalMiniFSM.g:355:3: () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) ( (lv_block_3_0= ruleBlock ) )?
            {
            // InternalMiniFSM.g:355:3: ()
            // InternalMiniFSM.g:356:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getState_ImplAccess().getStateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getState_ImplAccess().getStateKeyword_1());
            		
            // InternalMiniFSM.g:366:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMiniFSM.g:367:4: (lv_name_2_0= ruleEString )
            {
            // InternalMiniFSM.g:367:4: (lv_name_2_0= ruleEString )
            // InternalMiniFSM.g:368:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getState_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getState_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.inria.diverse.MiniFSM.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMiniFSM.g:385:3: ( (lv_block_3_0= ruleBlock ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==12) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMiniFSM.g:386:4: (lv_block_3_0= ruleBlock )
                    {
                    // InternalMiniFSM.g:386:4: (lv_block_3_0= ruleBlock )
                    // InternalMiniFSM.g:387:5: lv_block_3_0= ruleBlock
                    {

                    					newCompositeNode(grammarAccess.getState_ImplAccess().getBlockBlockParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_block_3_0=ruleBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getState_ImplRule());
                    					}
                    					set(
                    						current,
                    						"block",
                    						lv_block_3_0,
                    						"fr.inria.diverse.MiniFSM.Block");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleState_Impl"


    // $ANTLR start "entryRuleTransition"
    // InternalMiniFSM.g:408:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalMiniFSM.g:408:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalMiniFSM.g:409:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalMiniFSM.g:415:1: ruleTransition returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= '->' ( ( ruleEString ) ) (otherlv_3= '[' ( (lv_expression_4_0= ruleBooleanExpression ) ) otherlv_5= ']' )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalMiniFSM.g:421:2: ( ( ( ( ruleEString ) ) otherlv_1= '->' ( ( ruleEString ) ) (otherlv_3= '[' ( (lv_expression_4_0= ruleBooleanExpression ) ) otherlv_5= ']' )? ) )
            // InternalMiniFSM.g:422:2: ( ( ( ruleEString ) ) otherlv_1= '->' ( ( ruleEString ) ) (otherlv_3= '[' ( (lv_expression_4_0= ruleBooleanExpression ) ) otherlv_5= ']' )? )
            {
            // InternalMiniFSM.g:422:2: ( ( ( ruleEString ) ) otherlv_1= '->' ( ( ruleEString ) ) (otherlv_3= '[' ( (lv_expression_4_0= ruleBooleanExpression ) ) otherlv_5= ']' )? )
            // InternalMiniFSM.g:423:3: ( ( ruleEString ) ) otherlv_1= '->' ( ( ruleEString ) ) (otherlv_3= '[' ( (lv_expression_4_0= ruleBooleanExpression ) ) otherlv_5= ']' )?
            {
            // InternalMiniFSM.g:423:3: ( ( ruleEString ) )
            // InternalMiniFSM.g:424:4: ( ruleEString )
            {
            // InternalMiniFSM.g:424:4: ( ruleEString )
            // InternalMiniFSM.g:425:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getInputStateCrossReference_0_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalMiniFSM.g:443:3: ( ( ruleEString ) )
            // InternalMiniFSM.g:444:4: ( ruleEString )
            {
            // InternalMiniFSM.g:444:4: ( ruleEString )
            // InternalMiniFSM.g:445:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getOutputStateCrossReference_2_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMiniFSM.g:459:3: (otherlv_3= '[' ( (lv_expression_4_0= ruleBooleanExpression ) ) otherlv_5= ']' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMiniFSM.g:460:4: otherlv_3= '[' ( (lv_expression_4_0= ruleBooleanExpression ) ) otherlv_5= ']'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalMiniFSM.g:464:4: ( (lv_expression_4_0= ruleBooleanExpression ) )
                    // InternalMiniFSM.g:465:5: (lv_expression_4_0= ruleBooleanExpression )
                    {
                    // InternalMiniFSM.g:465:5: (lv_expression_4_0= ruleBooleanExpression )
                    // InternalMiniFSM.g:466:6: lv_expression_4_0= ruleBooleanExpression
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getExpressionBooleanExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_expression_4_0=ruleBooleanExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_4_0,
                    							"fr.inria.diverse.MiniFSM.BooleanExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_3_2());
                    			

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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleContext"
    // InternalMiniFSM.g:492:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // InternalMiniFSM.g:492:48: (iv_ruleContext= ruleContext EOF )
            // InternalMiniFSM.g:493:2: iv_ruleContext= ruleContext EOF
            {
             newCompositeNode(grammarAccess.getContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContext=ruleContext();

            state._fsp--;

             current =iv_ruleContext; 
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
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // InternalMiniFSM.g:499:1: ruleContext returns [EObject current=null] : ( () otherlv_1= 'Context' otherlv_2= '{' ( ( (lv_variables_3_0= ruleVariable ) ) ( (lv_variables_4_0= ruleVariable ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_variables_3_0 = null;

        EObject lv_variables_4_0 = null;



        	enterRule();

        try {
            // InternalMiniFSM.g:505:2: ( ( () otherlv_1= 'Context' otherlv_2= '{' ( ( (lv_variables_3_0= ruleVariable ) ) ( (lv_variables_4_0= ruleVariable ) )* )? otherlv_5= '}' ) )
            // InternalMiniFSM.g:506:2: ( () otherlv_1= 'Context' otherlv_2= '{' ( ( (lv_variables_3_0= ruleVariable ) ) ( (lv_variables_4_0= ruleVariable ) )* )? otherlv_5= '}' )
            {
            // InternalMiniFSM.g:506:2: ( () otherlv_1= 'Context' otherlv_2= '{' ( ( (lv_variables_3_0= ruleVariable ) ) ( (lv_variables_4_0= ruleVariable ) )* )? otherlv_5= '}' )
            // InternalMiniFSM.g:507:3: () otherlv_1= 'Context' otherlv_2= '{' ( ( (lv_variables_3_0= ruleVariable ) ) ( (lv_variables_4_0= ruleVariable ) )* )? otherlv_5= '}'
            {
            // InternalMiniFSM.g:507:3: ()
            // InternalMiniFSM.g:508:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContextAccess().getContextAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getContextAccess().getContextKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMiniFSM.g:522:3: ( ( (lv_variables_3_0= ruleVariable ) ) ( (lv_variables_4_0= ruleVariable ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32||LA12_0==44) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMiniFSM.g:523:4: ( (lv_variables_3_0= ruleVariable ) ) ( (lv_variables_4_0= ruleVariable ) )*
                    {
                    // InternalMiniFSM.g:523:4: ( (lv_variables_3_0= ruleVariable ) )
                    // InternalMiniFSM.g:524:5: (lv_variables_3_0= ruleVariable )
                    {
                    // InternalMiniFSM.g:524:5: (lv_variables_3_0= ruleVariable )
                    // InternalMiniFSM.g:525:6: lv_variables_3_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getContextAccess().getVariablesVariableParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_variables_3_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContextRule());
                    						}
                    						add(
                    							current,
                    							"variables",
                    							lv_variables_3_0,
                    							"fr.inria.diverse.MiniFSM.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMiniFSM.g:542:4: ( (lv_variables_4_0= ruleVariable ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==32||LA11_0==44) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalMiniFSM.g:543:5: (lv_variables_4_0= ruleVariable )
                    	    {
                    	    // InternalMiniFSM.g:543:5: (lv_variables_4_0= ruleVariable )
                    	    // InternalMiniFSM.g:544:6: lv_variables_4_0= ruleVariable
                    	    {

                    	    						newCompositeNode(grammarAccess.getContextAccess().getVariablesVariableParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_variables_4_0=ruleVariable();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getContextRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"variables",
                    	    							lv_variables_4_0,
                    	    							"fr.inria.diverse.MiniFSM.Variable");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getContextAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleBlock"
    // InternalMiniFSM.g:570:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalMiniFSM.g:570:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalMiniFSM.g:571:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalMiniFSM.g:577:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_statement_2_0= ruleStatement ) ) ( (lv_statement_3_0= ruleStatement ) )* )? otherlv_4= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_statement_2_0 = null;

        EObject lv_statement_3_0 = null;



        	enterRule();

        try {
            // InternalMiniFSM.g:583:2: ( ( () otherlv_1= '{' ( ( (lv_statement_2_0= ruleStatement ) ) ( (lv_statement_3_0= ruleStatement ) )* )? otherlv_4= '}' ) )
            // InternalMiniFSM.g:584:2: ( () otherlv_1= '{' ( ( (lv_statement_2_0= ruleStatement ) ) ( (lv_statement_3_0= ruleStatement ) )* )? otherlv_4= '}' )
            {
            // InternalMiniFSM.g:584:2: ( () otherlv_1= '{' ( ( (lv_statement_2_0= ruleStatement ) ) ( (lv_statement_3_0= ruleStatement ) )* )? otherlv_4= '}' )
            // InternalMiniFSM.g:585:3: () otherlv_1= '{' ( ( (lv_statement_2_0= ruleStatement ) ) ( (lv_statement_3_0= ruleStatement ) )* )? otherlv_4= '}'
            {
            // InternalMiniFSM.g:585:3: ()
            // InternalMiniFSM.g:586:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBlockAccess().getBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMiniFSM.g:596:3: ( ( (lv_statement_2_0= ruleStatement ) ) ( (lv_statement_3_0= ruleStatement ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21||(LA14_0>=25 && LA14_0<=27)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMiniFSM.g:597:4: ( (lv_statement_2_0= ruleStatement ) ) ( (lv_statement_3_0= ruleStatement ) )*
                    {
                    // InternalMiniFSM.g:597:4: ( (lv_statement_2_0= ruleStatement ) )
                    // InternalMiniFSM.g:598:5: (lv_statement_2_0= ruleStatement )
                    {
                    // InternalMiniFSM.g:598:5: (lv_statement_2_0= ruleStatement )
                    // InternalMiniFSM.g:599:6: lv_statement_2_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getBlockAccess().getStatementStatementParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_statement_2_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBlockRule());
                    						}
                    						add(
                    							current,
                    							"statement",
                    							lv_statement_2_0,
                    							"fr.inria.diverse.MiniFSM.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMiniFSM.g:616:4: ( (lv_statement_3_0= ruleStatement ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==21||(LA13_0>=25 && LA13_0<=27)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalMiniFSM.g:617:5: (lv_statement_3_0= ruleStatement )
                    	    {
                    	    // InternalMiniFSM.g:617:5: (lv_statement_3_0= ruleStatement )
                    	    // InternalMiniFSM.g:618:6: lv_statement_3_0= ruleStatement
                    	    {

                    	    						newCompositeNode(grammarAccess.getBlockAccess().getStatementStatementParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_statement_3_0=ruleStatement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getBlockRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"statement",
                    	    							lv_statement_3_0,
                    	    							"fr.inria.diverse.MiniFSM.Statement");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleFinalState"
    // InternalMiniFSM.g:644:1: entryRuleFinalState returns [EObject current=null] : iv_ruleFinalState= ruleFinalState EOF ;
    public final EObject entryRuleFinalState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinalState = null;


        try {
            // InternalMiniFSM.g:644:51: (iv_ruleFinalState= ruleFinalState EOF )
            // InternalMiniFSM.g:645:2: iv_ruleFinalState= ruleFinalState EOF
            {
             newCompositeNode(grammarAccess.getFinalStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFinalState=ruleFinalState();

            state._fsp--;

             current =iv_ruleFinalState; 
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
    // $ANTLR end "entryRuleFinalState"


    // $ANTLR start "ruleFinalState"
    // InternalMiniFSM.g:651:1: ruleFinalState returns [EObject current=null] : ( () otherlv_1= 'FinalState' ( (lv_name_2_0= ruleEString ) ) ( (lv_block_3_0= ruleBlock ) )? ) ;
    public final EObject ruleFinalState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_block_3_0 = null;



        	enterRule();

        try {
            // InternalMiniFSM.g:657:2: ( ( () otherlv_1= 'FinalState' ( (lv_name_2_0= ruleEString ) ) ( (lv_block_3_0= ruleBlock ) )? ) )
            // InternalMiniFSM.g:658:2: ( () otherlv_1= 'FinalState' ( (lv_name_2_0= ruleEString ) ) ( (lv_block_3_0= ruleBlock ) )? )
            {
            // InternalMiniFSM.g:658:2: ( () otherlv_1= 'FinalState' ( (lv_name_2_0= ruleEString ) ) ( (lv_block_3_0= ruleBlock ) )? )
            // InternalMiniFSM.g:659:3: () otherlv_1= 'FinalState' ( (lv_name_2_0= ruleEString ) ) ( (lv_block_3_0= ruleBlock ) )?
            {
            // InternalMiniFSM.g:659:3: ()
            // InternalMiniFSM.g:660:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFinalStateAccess().getFinalStateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFinalStateAccess().getFinalStateKeyword_1());
            		
            // InternalMiniFSM.g:670:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMiniFSM.g:671:4: (lv_name_2_0= ruleEString )
            {
            // InternalMiniFSM.g:671:4: (lv_name_2_0= ruleEString )
            // InternalMiniFSM.g:672:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFinalStateAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFinalStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.inria.diverse.MiniFSM.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMiniFSM.g:689:3: ( (lv_block_3_0= ruleBlock ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==12) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMiniFSM.g:690:4: (lv_block_3_0= ruleBlock )
                    {
                    // InternalMiniFSM.g:690:4: (lv_block_3_0= ruleBlock )
                    // InternalMiniFSM.g:691:5: lv_block_3_0= ruleBlock
                    {

                    					newCompositeNode(grammarAccess.getFinalStateAccess().getBlockBlockParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_block_3_0=ruleBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFinalStateRule());
                    					}
                    					set(
                    						current,
                    						"block",
                    						lv_block_3_0,
                    						"fr.inria.diverse.MiniFSM.Block");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleFinalState"


    // $ANTLR start "entryRuleBooleanAssignment"
    // InternalMiniFSM.g:712:1: entryRuleBooleanAssignment returns [EObject current=null] : iv_ruleBooleanAssignment= ruleBooleanAssignment EOF ;
    public final EObject entryRuleBooleanAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanAssignment = null;


        try {
            // InternalMiniFSM.g:712:58: (iv_ruleBooleanAssignment= ruleBooleanAssignment EOF )
            // InternalMiniFSM.g:713:2: iv_ruleBooleanAssignment= ruleBooleanAssignment EOF
            {
             newCompositeNode(grammarAccess.getBooleanAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanAssignment=ruleBooleanAssignment();

            state._fsp--;

             current =iv_ruleBooleanAssignment; 
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
    // $ANTLR end "entryRuleBooleanAssignment"


    // $ANTLR start "ruleBooleanAssignment"
    // InternalMiniFSM.g:719:1: ruleBooleanAssignment returns [EObject current=null] : (otherlv_0= 'AssignBool' otherlv_1= '(' ( (lv_variable_2_0= ruleBooleanVariableRef ) ) otherlv_3= ',' ( (lv_value_4_0= ruleBooleanExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleBooleanAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_variable_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalMiniFSM.g:725:2: ( (otherlv_0= 'AssignBool' otherlv_1= '(' ( (lv_variable_2_0= ruleBooleanVariableRef ) ) otherlv_3= ',' ( (lv_value_4_0= ruleBooleanExpression ) ) otherlv_5= ')' ) )
            // InternalMiniFSM.g:726:2: (otherlv_0= 'AssignBool' otherlv_1= '(' ( (lv_variable_2_0= ruleBooleanVariableRef ) ) otherlv_3= ',' ( (lv_value_4_0= ruleBooleanExpression ) ) otherlv_5= ')' )
            {
            // InternalMiniFSM.g:726:2: (otherlv_0= 'AssignBool' otherlv_1= '(' ( (lv_variable_2_0= ruleBooleanVariableRef ) ) otherlv_3= ',' ( (lv_value_4_0= ruleBooleanExpression ) ) otherlv_5= ')' )
            // InternalMiniFSM.g:727:3: otherlv_0= 'AssignBool' otherlv_1= '(' ( (lv_variable_2_0= ruleBooleanVariableRef ) ) otherlv_3= ',' ( (lv_value_4_0= ruleBooleanExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getBooleanAssignmentAccess().getAssignBoolKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanAssignmentAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMiniFSM.g:735:3: ( (lv_variable_2_0= ruleBooleanVariableRef ) )
            // InternalMiniFSM.g:736:4: (lv_variable_2_0= ruleBooleanVariableRef )
            {
            // InternalMiniFSM.g:736:4: (lv_variable_2_0= ruleBooleanVariableRef )
            // InternalMiniFSM.g:737:5: lv_variable_2_0= ruleBooleanVariableRef
            {

            					newCompositeNode(grammarAccess.getBooleanAssignmentAccess().getVariableBooleanVariableRefParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_variable_2_0=ruleBooleanVariableRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanAssignmentRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_2_0,
            						"fr.inria.diverse.MiniFSM.BooleanVariableRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getBooleanAssignmentAccess().getCommaKeyword_3());
            		
            // InternalMiniFSM.g:758:3: ( (lv_value_4_0= ruleBooleanExpression ) )
            // InternalMiniFSM.g:759:4: (lv_value_4_0= ruleBooleanExpression )
            {
            // InternalMiniFSM.g:759:4: (lv_value_4_0= ruleBooleanExpression )
            // InternalMiniFSM.g:760:5: lv_value_4_0= ruleBooleanExpression
            {

            					newCompositeNode(grammarAccess.getBooleanAssignmentAccess().getValueBooleanExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_value_4_0=ruleBooleanExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanAssignmentRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
            						"fr.inria.diverse.MiniFSM.BooleanExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getBooleanAssignmentAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleBooleanAssignment"


    // $ANTLR start "entryRuleIntAssignment"
    // InternalMiniFSM.g:785:1: entryRuleIntAssignment returns [EObject current=null] : iv_ruleIntAssignment= ruleIntAssignment EOF ;
    public final EObject entryRuleIntAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntAssignment = null;


        try {
            // InternalMiniFSM.g:785:54: (iv_ruleIntAssignment= ruleIntAssignment EOF )
            // InternalMiniFSM.g:786:2: iv_ruleIntAssignment= ruleIntAssignment EOF
            {
             newCompositeNode(grammarAccess.getIntAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntAssignment=ruleIntAssignment();

            state._fsp--;

             current =iv_ruleIntAssignment; 
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
    // $ANTLR end "entryRuleIntAssignment"


    // $ANTLR start "ruleIntAssignment"
    // InternalMiniFSM.g:792:1: ruleIntAssignment returns [EObject current=null] : (otherlv_0= 'AssignInt' otherlv_1= '(' ( (lv_variable_2_0= ruleIntVariableRef ) ) otherlv_3= ',' ( (lv_value_4_0= ruleIntExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleIntAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_variable_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalMiniFSM.g:798:2: ( (otherlv_0= 'AssignInt' otherlv_1= '(' ( (lv_variable_2_0= ruleIntVariableRef ) ) otherlv_3= ',' ( (lv_value_4_0= ruleIntExpression ) ) otherlv_5= ')' ) )
            // InternalMiniFSM.g:799:2: (otherlv_0= 'AssignInt' otherlv_1= '(' ( (lv_variable_2_0= ruleIntVariableRef ) ) otherlv_3= ',' ( (lv_value_4_0= ruleIntExpression ) ) otherlv_5= ')' )
            {
            // InternalMiniFSM.g:799:2: (otherlv_0= 'AssignInt' otherlv_1= '(' ( (lv_variable_2_0= ruleIntVariableRef ) ) otherlv_3= ',' ( (lv_value_4_0= ruleIntExpression ) ) otherlv_5= ')' )
            // InternalMiniFSM.g:800:3: otherlv_0= 'AssignInt' otherlv_1= '(' ( (lv_variable_2_0= ruleIntVariableRef ) ) otherlv_3= ',' ( (lv_value_4_0= ruleIntExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getIntAssignmentAccess().getAssignIntKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getIntAssignmentAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMiniFSM.g:808:3: ( (lv_variable_2_0= ruleIntVariableRef ) )
            // InternalMiniFSM.g:809:4: (lv_variable_2_0= ruleIntVariableRef )
            {
            // InternalMiniFSM.g:809:4: (lv_variable_2_0= ruleIntVariableRef )
            // InternalMiniFSM.g:810:5: lv_variable_2_0= ruleIntVariableRef
            {

            					newCompositeNode(grammarAccess.getIntAssignmentAccess().getVariableIntVariableRefParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_variable_2_0=ruleIntVariableRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntAssignmentRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_2_0,
            						"fr.inria.diverse.MiniFSM.IntVariableRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getIntAssignmentAccess().getCommaKeyword_3());
            		
            // InternalMiniFSM.g:831:3: ( (lv_value_4_0= ruleIntExpression ) )
            // InternalMiniFSM.g:832:4: (lv_value_4_0= ruleIntExpression )
            {
            // InternalMiniFSM.g:832:4: (lv_value_4_0= ruleIntExpression )
            // InternalMiniFSM.g:833:5: lv_value_4_0= ruleIntExpression
            {

            					newCompositeNode(grammarAccess.getIntAssignmentAccess().getValueIntExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_value_4_0=ruleIntExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntAssignmentRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
            						"fr.inria.diverse.MiniFSM.IntExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getIntAssignmentAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleIntAssignment"


    // $ANTLR start "entryRulePrintVar"
    // InternalMiniFSM.g:858:1: entryRulePrintVar returns [EObject current=null] : iv_rulePrintVar= rulePrintVar EOF ;
    public final EObject entryRulePrintVar() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintVar = null;


        try {
            // InternalMiniFSM.g:858:49: (iv_rulePrintVar= rulePrintVar EOF )
            // InternalMiniFSM.g:859:2: iv_rulePrintVar= rulePrintVar EOF
            {
             newCompositeNode(grammarAccess.getPrintVarRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrintVar=rulePrintVar();

            state._fsp--;

             current =iv_rulePrintVar; 
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
    // $ANTLR end "entryRulePrintVar"


    // $ANTLR start "rulePrintVar"
    // InternalMiniFSM.g:865:1: rulePrintVar returns [EObject current=null] : (otherlv_0= 'PrintVar' otherlv_1= '(' ( (lv_value_2_0= ruleEString ) ) otherlv_3= ')' ) ;
    public final EObject rulePrintVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMiniFSM.g:871:2: ( (otherlv_0= 'PrintVar' otherlv_1= '(' ( (lv_value_2_0= ruleEString ) ) otherlv_3= ')' ) )
            // InternalMiniFSM.g:872:2: (otherlv_0= 'PrintVar' otherlv_1= '(' ( (lv_value_2_0= ruleEString ) ) otherlv_3= ')' )
            {
            // InternalMiniFSM.g:872:2: (otherlv_0= 'PrintVar' otherlv_1= '(' ( (lv_value_2_0= ruleEString ) ) otherlv_3= ')' )
            // InternalMiniFSM.g:873:3: otherlv_0= 'PrintVar' otherlv_1= '(' ( (lv_value_2_0= ruleEString ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintVarAccess().getPrintVarKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPrintVarAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMiniFSM.g:881:3: ( (lv_value_2_0= ruleEString ) )
            // InternalMiniFSM.g:882:4: (lv_value_2_0= ruleEString )
            {
            // InternalMiniFSM.g:882:4: (lv_value_2_0= ruleEString )
            // InternalMiniFSM.g:883:5: lv_value_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPrintVarAccess().getValueEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_value_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrintVarRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"fr.inria.diverse.MiniFSM.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPrintVarAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "rulePrintVar"


    // $ANTLR start "entryRulePrintStr"
    // InternalMiniFSM.g:908:1: entryRulePrintStr returns [EObject current=null] : iv_rulePrintStr= rulePrintStr EOF ;
    public final EObject entryRulePrintStr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintStr = null;


        try {
            // InternalMiniFSM.g:908:49: (iv_rulePrintStr= rulePrintStr EOF )
            // InternalMiniFSM.g:909:2: iv_rulePrintStr= rulePrintStr EOF
            {
             newCompositeNode(grammarAccess.getPrintStrRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrintStr=rulePrintStr();

            state._fsp--;

             current =iv_rulePrintStr; 
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
    // $ANTLR end "entryRulePrintStr"


    // $ANTLR start "rulePrintStr"
    // InternalMiniFSM.g:915:1: rulePrintStr returns [EObject current=null] : (otherlv_0= 'PrintStr' otherlv_1= '(' ( (lv_value_2_0= ruleEString ) ) otherlv_3= ')' ) ;
    public final EObject rulePrintStr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMiniFSM.g:921:2: ( (otherlv_0= 'PrintStr' otherlv_1= '(' ( (lv_value_2_0= ruleEString ) ) otherlv_3= ')' ) )
            // InternalMiniFSM.g:922:2: (otherlv_0= 'PrintStr' otherlv_1= '(' ( (lv_value_2_0= ruleEString ) ) otherlv_3= ')' )
            {
            // InternalMiniFSM.g:922:2: (otherlv_0= 'PrintStr' otherlv_1= '(' ( (lv_value_2_0= ruleEString ) ) otherlv_3= ')' )
            // InternalMiniFSM.g:923:3: otherlv_0= 'PrintStr' otherlv_1= '(' ( (lv_value_2_0= ruleEString ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintStrAccess().getPrintStrKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPrintStrAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMiniFSM.g:931:3: ( (lv_value_2_0= ruleEString ) )
            // InternalMiniFSM.g:932:4: (lv_value_2_0= ruleEString )
            {
            // InternalMiniFSM.g:932:4: (lv_value_2_0= ruleEString )
            // InternalMiniFSM.g:933:5: lv_value_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPrintStrAccess().getValueEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_value_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrintStrRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"fr.inria.diverse.MiniFSM.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPrintStrAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "rulePrintStr"


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalMiniFSM.g:958:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // InternalMiniFSM.g:958:58: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // InternalMiniFSM.g:959:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;

             current =iv_ruleBooleanExpression; 
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
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // InternalMiniFSM.g:965:1: ruleBooleanExpression returns [EObject current=null] : this_AndOr_0= ruleAndOr ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndOr_0 = null;



        	enterRule();

        try {
            // InternalMiniFSM.g:971:2: (this_AndOr_0= ruleAndOr )
            // InternalMiniFSM.g:972:2: this_AndOr_0= ruleAndOr
            {

            		newCompositeNode(grammarAccess.getBooleanExpressionAccess().getAndOrParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_AndOr_0=ruleAndOr();

            state._fsp--;


            		current = this_AndOr_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleAndOr"
    // InternalMiniFSM.g:983:1: entryRuleAndOr returns [EObject current=null] : iv_ruleAndOr= ruleAndOr EOF ;
    public final EObject entryRuleAndOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndOr = null;


        try {
            // InternalMiniFSM.g:983:46: (iv_ruleAndOr= ruleAndOr EOF )
            // InternalMiniFSM.g:984:2: iv_ruleAndOr= ruleAndOr EOF
            {
             newCompositeNode(grammarAccess.getAndOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndOr=ruleAndOr();

            state._fsp--;

             current =iv_ruleAndOr; 
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
    // $ANTLR end "entryRuleAndOr"


    // $ANTLR start "ruleAndOr"
    // InternalMiniFSM.g:990:1: ruleAndOr returns [EObject current=null] : (this_TermBool_0= ruleTermBool ( ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndOr ) ) ) | ( () otherlv_5= 'AND' ( (lv_right_6_0= ruleAndOr ) ) ) )? ) ;
    public final EObject ruleAndOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_TermBool_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalMiniFSM.g:996:2: ( (this_TermBool_0= ruleTermBool ( ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndOr ) ) ) | ( () otherlv_5= 'AND' ( (lv_right_6_0= ruleAndOr ) ) ) )? ) )
            // InternalMiniFSM.g:997:2: (this_TermBool_0= ruleTermBool ( ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndOr ) ) ) | ( () otherlv_5= 'AND' ( (lv_right_6_0= ruleAndOr ) ) ) )? )
            {
            // InternalMiniFSM.g:997:2: (this_TermBool_0= ruleTermBool ( ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndOr ) ) ) | ( () otherlv_5= 'AND' ( (lv_right_6_0= ruleAndOr ) ) ) )? )
            // InternalMiniFSM.g:998:3: this_TermBool_0= ruleTermBool ( ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndOr ) ) ) | ( () otherlv_5= 'AND' ( (lv_right_6_0= ruleAndOr ) ) ) )?
            {

            			newCompositeNode(grammarAccess.getAndOrAccess().getTermBoolParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_TermBool_0=ruleTermBool();

            state._fsp--;


            			current = this_TermBool_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMiniFSM.g:1006:3: ( ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndOr ) ) ) | ( () otherlv_5= 'AND' ( (lv_right_6_0= ruleAndOr ) ) ) )?
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            else if ( (LA16_0==29) ) {
                alt16=2;
            }
            switch (alt16) {
                case 1 :
                    // InternalMiniFSM.g:1007:4: ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndOr ) ) )
                    {
                    // InternalMiniFSM.g:1007:4: ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndOr ) ) )
                    // InternalMiniFSM.g:1008:5: () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndOr ) )
                    {
                    // InternalMiniFSM.g:1008:5: ()
                    // InternalMiniFSM.g:1009:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getAndOrAccess().getOrLeftAction_1_0_0(),
                    							current);
                    					

                    }

                    otherlv_2=(Token)match(input,28,FOLLOW_11); 

                    					newLeafNode(otherlv_2, grammarAccess.getAndOrAccess().getORKeyword_1_0_1());
                    				
                    // InternalMiniFSM.g:1019:5: ( (lv_right_3_0= ruleAndOr ) )
                    // InternalMiniFSM.g:1020:6: (lv_right_3_0= ruleAndOr )
                    {
                    // InternalMiniFSM.g:1020:6: (lv_right_3_0= ruleAndOr )
                    // InternalMiniFSM.g:1021:7: lv_right_3_0= ruleAndOr
                    {

                    							newCompositeNode(grammarAccess.getAndOrAccess().getRightAndOrParserRuleCall_1_0_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleAndOr();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAndOrRule());
                    							}
                    							set(
                    								current,
                    								"right",
                    								lv_right_3_0,
                    								"fr.inria.diverse.MiniFSM.AndOr");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMiniFSM.g:1040:4: ( () otherlv_5= 'AND' ( (lv_right_6_0= ruleAndOr ) ) )
                    {
                    // InternalMiniFSM.g:1040:4: ( () otherlv_5= 'AND' ( (lv_right_6_0= ruleAndOr ) ) )
                    // InternalMiniFSM.g:1041:5: () otherlv_5= 'AND' ( (lv_right_6_0= ruleAndOr ) )
                    {
                    // InternalMiniFSM.g:1041:5: ()
                    // InternalMiniFSM.g:1042:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getAndOrAccess().getAndLeftAction_1_1_0(),
                    							current);
                    					

                    }

                    otherlv_5=(Token)match(input,29,FOLLOW_11); 

                    					newLeafNode(otherlv_5, grammarAccess.getAndOrAccess().getANDKeyword_1_1_1());
                    				
                    // InternalMiniFSM.g:1052:5: ( (lv_right_6_0= ruleAndOr ) )
                    // InternalMiniFSM.g:1053:6: (lv_right_6_0= ruleAndOr )
                    {
                    // InternalMiniFSM.g:1053:6: (lv_right_6_0= ruleAndOr )
                    // InternalMiniFSM.g:1054:7: lv_right_6_0= ruleAndOr
                    {

                    							newCompositeNode(grammarAccess.getAndOrAccess().getRightAndOrParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_right_6_0=ruleAndOr();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAndOrRule());
                    							}
                    							set(
                    								current,
                    								"right",
                    								lv_right_6_0,
                    								"fr.inria.diverse.MiniFSM.AndOr");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


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
    // $ANTLR end "ruleAndOr"


    // $ANTLR start "entryRuleTermBool"
    // InternalMiniFSM.g:1077:1: entryRuleTermBool returns [EObject current=null] : iv_ruleTermBool= ruleTermBool EOF ;
    public final EObject entryRuleTermBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermBool = null;


        try {
            // InternalMiniFSM.g:1077:49: (iv_ruleTermBool= ruleTermBool EOF )
            // InternalMiniFSM.g:1078:2: iv_ruleTermBool= ruleTermBool EOF
            {
             newCompositeNode(grammarAccess.getTermBoolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTermBool=ruleTermBool();

            state._fsp--;

             current =iv_ruleTermBool; 
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
    // $ANTLR end "entryRuleTermBool"


    // $ANTLR start "ruleTermBool"
    // InternalMiniFSM.g:1084:1: ruleTermBool returns [EObject current=null] : (this_Boolean_0= ruleBoolean | this_BooleanVariableRef_1= ruleBooleanVariableRef | this_IntComparison_2= ruleIntComparison | ( () otherlv_4= '!' ( (lv_expression_5_0= ruleTermBool ) ) ) ) ;
    public final EObject ruleTermBool() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_Boolean_0 = null;

        EObject this_BooleanVariableRef_1 = null;

        EObject this_IntComparison_2 = null;

        EObject lv_expression_5_0 = null;



        	enterRule();

        try {
            // InternalMiniFSM.g:1090:2: ( (this_Boolean_0= ruleBoolean | this_BooleanVariableRef_1= ruleBooleanVariableRef | this_IntComparison_2= ruleIntComparison | ( () otherlv_4= '!' ( (lv_expression_5_0= ruleTermBool ) ) ) ) )
            // InternalMiniFSM.g:1091:2: (this_Boolean_0= ruleBoolean | this_BooleanVariableRef_1= ruleBooleanVariableRef | this_IntComparison_2= ruleIntComparison | ( () otherlv_4= '!' ( (lv_expression_5_0= ruleTermBool ) ) ) )
            {
            // InternalMiniFSM.g:1091:2: (this_Boolean_0= ruleBoolean | this_BooleanVariableRef_1= ruleBooleanVariableRef | this_IntComparison_2= ruleIntComparison | ( () otherlv_4= '!' ( (lv_expression_5_0= ruleTermBool ) ) ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt17=1;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt17=2;
                }
                break;
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
                {
                alt17=3;
                }
                break;
            case 30:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalMiniFSM.g:1092:3: this_Boolean_0= ruleBoolean
                    {

                    			newCompositeNode(grammarAccess.getTermBoolAccess().getBooleanParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Boolean_0=ruleBoolean();

                    state._fsp--;


                    			current = this_Boolean_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMiniFSM.g:1101:3: this_BooleanVariableRef_1= ruleBooleanVariableRef
                    {

                    			newCompositeNode(grammarAccess.getTermBoolAccess().getBooleanVariableRefParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanVariableRef_1=ruleBooleanVariableRef();

                    state._fsp--;


                    			current = this_BooleanVariableRef_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMiniFSM.g:1110:3: this_IntComparison_2= ruleIntComparison
                    {

                    			newCompositeNode(grammarAccess.getTermBoolAccess().getIntComparisonParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntComparison_2=ruleIntComparison();

                    state._fsp--;


                    			current = this_IntComparison_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMiniFSM.g:1119:3: ( () otherlv_4= '!' ( (lv_expression_5_0= ruleTermBool ) ) )
                    {
                    // InternalMiniFSM.g:1119:3: ( () otherlv_4= '!' ( (lv_expression_5_0= ruleTermBool ) ) )
                    // InternalMiniFSM.g:1120:4: () otherlv_4= '!' ( (lv_expression_5_0= ruleTermBool ) )
                    {
                    // InternalMiniFSM.g:1120:4: ()
                    // InternalMiniFSM.g:1121:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTermBoolAccess().getNotAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,30,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getTermBoolAccess().getExclamationMarkKeyword_3_1());
                    			
                    // InternalMiniFSM.g:1131:4: ( (lv_expression_5_0= ruleTermBool ) )
                    // InternalMiniFSM.g:1132:5: (lv_expression_5_0= ruleTermBool )
                    {
                    // InternalMiniFSM.g:1132:5: (lv_expression_5_0= ruleTermBool )
                    // InternalMiniFSM.g:1133:6: lv_expression_5_0= ruleTermBool
                    {

                    						newCompositeNode(grammarAccess.getTermBoolAccess().getExpressionTermBoolParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_5_0=ruleTermBool();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTermBoolRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_5_0,
                    							"fr.inria.diverse.MiniFSM.TermBool");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleTermBool"


    // $ANTLR start "entryRuleBooleanVariableRef"
    // InternalMiniFSM.g:1155:1: entryRuleBooleanVariableRef returns [EObject current=null] : iv_ruleBooleanVariableRef= ruleBooleanVariableRef EOF ;
    public final EObject entryRuleBooleanVariableRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanVariableRef = null;


        try {
            // InternalMiniFSM.g:1155:59: (iv_ruleBooleanVariableRef= ruleBooleanVariableRef EOF )
            // InternalMiniFSM.g:1156:2: iv_ruleBooleanVariableRef= ruleBooleanVariableRef EOF
            {
             newCompositeNode(grammarAccess.getBooleanVariableRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanVariableRef=ruleBooleanVariableRef();

            state._fsp--;

             current =iv_ruleBooleanVariableRef; 
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
    // $ANTLR end "entryRuleBooleanVariableRef"


    // $ANTLR start "ruleBooleanVariableRef"
    // InternalMiniFSM.g:1162:1: ruleBooleanVariableRef returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleBooleanVariableRef() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMiniFSM.g:1168:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMiniFSM.g:1169:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMiniFSM.g:1169:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalMiniFSM.g:1170:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMiniFSM.g:1170:3: ()
            // InternalMiniFSM.g:1171:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanVariableRefAccess().getBooleanVariableRefAction_0(),
            					current);
            			

            }

            // InternalMiniFSM.g:1177:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMiniFSM.g:1178:4: (lv_name_1_0= ruleEString )
            {
            // InternalMiniFSM.g:1178:4: (lv_name_1_0= ruleEString )
            // InternalMiniFSM.g:1179:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBooleanVariableRefAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanVariableRefRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.diverse.MiniFSM.EString");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleBooleanVariableRef"


    // $ANTLR start "entryRuleBoolean"
    // InternalMiniFSM.g:1200:1: entryRuleBoolean returns [EObject current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final EObject entryRuleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean = null;


        try {
            // InternalMiniFSM.g:1200:48: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalMiniFSM.g:1201:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean; 
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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalMiniFSM.g:1207:1: ruleBoolean returns [EObject current=null] : ( ( (lv_value_0_0= 'value' ) ) otherlv_1= 'Boolean' ) ;
    public final EObject ruleBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMiniFSM.g:1213:2: ( ( ( (lv_value_0_0= 'value' ) ) otherlv_1= 'Boolean' ) )
            // InternalMiniFSM.g:1214:2: ( ( (lv_value_0_0= 'value' ) ) otherlv_1= 'Boolean' )
            {
            // InternalMiniFSM.g:1214:2: ( ( (lv_value_0_0= 'value' ) ) otherlv_1= 'Boolean' )
            // InternalMiniFSM.g:1215:3: ( (lv_value_0_0= 'value' ) ) otherlv_1= 'Boolean'
            {
            // InternalMiniFSM.g:1215:3: ( (lv_value_0_0= 'value' ) )
            // InternalMiniFSM.g:1216:4: (lv_value_0_0= 'value' )
            {
            // InternalMiniFSM.g:1216:4: (lv_value_0_0= 'value' )
            // InternalMiniFSM.g:1217:5: lv_value_0_0= 'value'
            {
            lv_value_0_0=(Token)match(input,31,FOLLOW_20); 

            					newLeafNode(lv_value_0_0, grammarAccess.getBooleanAccess().getValueValueKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBooleanRule());
            					}
            					setWithLastConsumed(current, "value", true, "value");
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanAccess().getBooleanKeyword_1());
            		

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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleEBoolean"
    // InternalMiniFSM.g:1237:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalMiniFSM.g:1237:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalMiniFSM.g:1238:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalMiniFSM.g:1244:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMiniFSM.g:1250:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalMiniFSM.g:1251:2: (kw= 'true' | kw= 'false' )
            {
            // InternalMiniFSM.g:1251:2: (kw= 'true' | kw= 'false' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            else if ( (LA18_0==34) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMiniFSM.g:1252:3: kw= 'true'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMiniFSM.g:1258:3: kw= 'false'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleIntComparison"
    // InternalMiniFSM.g:1267:1: entryRuleIntComparison returns [EObject current=null] : iv_ruleIntComparison= ruleIntComparison EOF ;
    public final EObject entryRuleIntComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntComparison = null;


        try {
            // InternalMiniFSM.g:1267:54: (iv_ruleIntComparison= ruleIntComparison EOF )
            // InternalMiniFSM.g:1268:2: iv_ruleIntComparison= ruleIntComparison EOF
            {
             newCompositeNode(grammarAccess.getIntComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntComparison=ruleIntComparison();

            state._fsp--;

             current =iv_ruleIntComparison; 
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
    // $ANTLR end "entryRuleIntComparison"


    // $ANTLR start "ruleIntComparison"
    // InternalMiniFSM.g:1274:1: ruleIntComparison returns [EObject current=null] : (this_Equal_0= ruleEqual | this_Greater_1= ruleGreater | this_GreaterOrEqual_2= ruleGreaterOrEqual | this_Less_3= ruleLess | this_LessOrEqual_4= ruleLessOrEqual ) ;
    public final EObject ruleIntComparison() throws RecognitionException {
        EObject current = null;

        EObject this_Equal_0 = null;

        EObject this_Greater_1 = null;

        EObject this_GreaterOrEqual_2 = null;

        EObject this_Less_3 = null;

        EObject this_LessOrEqual_4 = null;



        	enterRule();

        try {
            // InternalMiniFSM.g:1280:2: ( (this_Equal_0= ruleEqual | this_Greater_1= ruleGreater | this_GreaterOrEqual_2= ruleGreaterOrEqual | this_Less_3= ruleLess | this_LessOrEqual_4= ruleLessOrEqual ) )
            // InternalMiniFSM.g:1281:2: (this_Equal_0= ruleEqual | this_Greater_1= ruleGreater | this_GreaterOrEqual_2= ruleGreaterOrEqual | this_Less_3= ruleLess | this_LessOrEqual_4= ruleLessOrEqual )
            {
            // InternalMiniFSM.g:1281:2: (this_Equal_0= ruleEqual | this_Greater_1= ruleGreater | this_GreaterOrEqual_2= ruleGreaterOrEqual | this_Less_3= ruleLess | this_LessOrEqual_4= ruleLessOrEqual )
            int alt19=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt19=1;
                }
                break;
            case 36:
                {
                alt19=2;
                }
                break;
            case 37:
                {
                alt19=3;
                }
                break;
            case 38:
                {
                alt19=4;
                }
                break;
            case 39:
                {
                alt19=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalMiniFSM.g:1282:3: this_Equal_0= ruleEqual
                    {

                    			newCompositeNode(grammarAccess.getIntComparisonAccess().getEqualParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Equal_0=ruleEqual();

                    state._fsp--;


                    			current = this_Equal_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMiniFSM.g:1291:3: this_Greater_1= ruleGreater
                    {

                    			newCompositeNode(grammarAccess.getIntComparisonAccess().getGreaterParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Greater_1=ruleGreater();

                    state._fsp--;


                    			current = this_Greater_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMiniFSM.g:1300:3: this_GreaterOrEqual_2= ruleGreaterOrEqual
                    {

                    			newCompositeNode(grammarAccess.getIntComparisonAccess().getGreaterOrEqualParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GreaterOrEqual_2=ruleGreaterOrEqual();

                    state._fsp--;


                    			current = this_GreaterOrEqual_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMiniFSM.g:1309:3: this_Less_3= ruleLess
                    {

                    			newCompositeNode(grammarAccess.getIntComparisonAccess().getLessParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Less_3=ruleLess();

                    state._fsp--;


                    			current = this_Less_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMiniFSM.g:1318:3: this_LessOrEqual_4= ruleLessOrEqual
                    {

                    			newCompositeNode(grammarAccess.getIntComparisonAccess().getLessOrEqualParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_LessOrEqual_4=ruleLessOrEqual();

                    state._fsp--;


                    			current = this_LessOrEqual_4;
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
    // $ANTLR end "ruleIntComparison"


    // $ANTLR start "entryRuleEqual"
    // InternalMiniFSM.g:1330:1: entryRuleEqual returns [EObject current=null] : iv_ruleEqual= ruleEqual EOF ;
    public final EObject entryRuleEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqual = null;


        try {
            // InternalMiniFSM.g:1330:46: (iv_ruleEqual= ruleEqual EOF )
            // InternalMiniFSM.g:1331:2: iv_ruleEqual= ruleEqual EOF
            {
             newCompositeNode(grammarAccess.getEqualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqual=ruleEqual();

            state._fsp--;

             current =iv_ruleEqual; 
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
    // $ANTLR end "entryRuleEqual"


    // $ANTLR start "ruleEqual"
    // InternalMiniFSM.g:1337:1: ruleEqual returns [EObject current=null] : (otherlv_0= 'equal' otherlv_1= '(' ( (lv_left_2_0= ruleIntExpression ) ) otherlv_3= ',' ( (lv_right_4_0= ruleIntExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_left_2_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalMiniFSM.g:1343:2: ( (otherlv_0= 'equal' otherlv_1= '(' ( (lv_left_2_0= ruleIntExpression ) ) otherlv_3= ',' ( (lv_right_4_0= ruleIntExpression ) ) otherlv_5= ')' ) )
            // InternalMiniFSM.g:1344:2: (otherlv_0= 'equal' otherlv_1= '(' ( (lv_left_2_0= ruleIntExpression ) ) otherlv_3= ',' ( (lv_right_4_0= ruleIntExpression ) ) otherlv_5= ')' )
            {
            // InternalMiniFSM.g:1344:2: (otherlv_0= 'equal' otherlv_1= '(' ( (lv_left_2_0= ruleIntExpression ) ) otherlv_3= ',' ( (lv_right_4_0= ruleIntExpression ) ) otherlv_5= ')' )
            // InternalMiniFSM.g:1345:3: otherlv_0= 'equal' otherlv_1= '(' ( (lv_left_2_0= ruleIntExpression ) ) otherlv_3= ',' ( (lv_right_4_0= ruleIntExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getEqualAccess().getEqualKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getEqualAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMiniFSM.g:1353:3: ( (lv_left_2_0= ruleIntExpression ) )
            // InternalMiniFSM.g:1354:4: (lv_left_2_0= ruleIntExpression )
            {
            // InternalMiniFSM.g:1354:4: (lv_left_2_0= ruleIntExpression )
            // InternalMiniFSM.g:1355:5: lv_left_2_0= ruleIntExpression
            {

            					newCompositeNode(grammarAccess.getEqualAccess().getLeftIntExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_left_2_0=ruleIntExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEqualRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_2_0,
            						"fr.inria.diverse.MiniFSM.IntExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getEqualAccess().getCommaKeyword_3());
            		
            // InternalMiniFSM.g:1376:3: ( (lv_right_4_0= ruleIntExpression ) )
            // InternalMiniFSM.g:1377:4: (lv_right_4_0= ruleIntExpression )
            {
            // InternalMiniFSM.g:1377:4: (lv_right_4_0= ruleIntExpression )
            // InternalMiniFSM.g:1378:5: lv_right_4_0= ruleIntExpression
            {

            					newCompositeNode(grammarAccess.getEqualAccess().getRightIntExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_right_4_0=ruleIntExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEqualRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_4_0,
            						"fr.inria.diverse.MiniFSM.IntExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEqualAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleEqual"


    // $ANTLR start "entryRuleGreater"
    // InternalMiniFSM.g:1403:1: entryRuleGreater returns [EObject current=null] : iv_ruleGreater= ruleGreater EOF ;
    public final EObject entryRuleGreater() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreater = null;


        try {
            // InternalMiniFSM.g:1403:48: (iv_ruleGreater= ruleGreater EOF )
            // InternalMiniFSM.g:1404:2: iv_ruleGreater= ruleGreater EOF
            {
             newCompositeNode(grammarAccess.getGreaterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGreater=ruleGreater();

            state._fsp--;

             current =iv_ruleGreater; 
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
    // $ANTLR end "entryRuleGreater"


    // $ANTLR start "ruleGreater"
    // InternalMiniFSM.g:1410:1: ruleGreater returns [EObject current=null] : (otherlv_0= 'greater' otherlv_1= '(' ( (lv_left_2_0= ruleIntExpression ) ) otherlv_3= ',' ( (lv_right_4_0= ruleIntExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleGreater() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_left_2_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalMiniFSM.g:1416:2: ( (otherlv_0= 'greater' otherlv_1= '(' ( (lv_left_2_0= ruleIntExpression ) ) otherlv_3= ',' ( (lv_right_4_0= ruleIntExpression ) ) otherlv_5= ')' ) )
            // InternalMiniFSM.g:1417:2: (otherlv_0= 'greater' otherlv_1= '(' ( (lv_left_2_0= ruleIntExpression ) ) otherlv_3= ',' ( (lv_right_4_0= ruleIntExpression ) ) otherlv_5= ')' )
            {
            // InternalMiniFSM.g:1417:2: (otherlv_0= 'greater' otherlv_1= '(' ( (lv_left_2_0= ruleIntExpression ) ) otherlv_3= ',' ( (lv_right_4_0= ruleIntExpression ) ) otherlv_5= ')' )
            // InternalMiniFSM.g:1418:3: otherlv_0= 'greater' otherlv_1= '(' ( (lv_left_2_0= ruleIntExpression ) ) otherlv_3= ',' ( (lv_right_4_0= ruleIntExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getGreaterAccess().getGreaterKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getGreaterAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMiniFSM.g:1426:3: ( (lv_left_2_0= ruleIntExpression ) )
            // InternalMiniFSM.g:1427:4: (lv_left_2_0= ruleIntExpression )
            {
            // InternalMiniFSM.g:1427:4: (lv_left_2_0= ruleIntExpression )
            // InternalMiniFSM.g:1428:5: lv_left_2_0= ruleIntExpression
            {

            					newCompositeNode(grammarAccess.getGreaterAccess().getLeftIntExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_left_2_0=ruleIntExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGreaterRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_2_0,
            						"fr.inria.diverse.MiniFSM.IntExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getGreaterAccess().getCommaKeyword_3());
            		
            // InternalMiniFSM.g:1449:3: ( (lv_right_4_0= ruleIntExpression ) )
            // InternalMiniFSM.g:1450:4: (lv_right_4_0= ruleIntExpression )
            {
            // InternalMiniFSM.g:1450:4: (lv_right_4_0= ruleIntExpression )
            // InternalMiniFSM.g:1451:5: lv_right_4_0= ruleIntExpression
            {

            					newCompositeNode(grammarAccess.getGreaterAccess().getRightIntExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_right_4_0=ruleIntExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGreaterRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_4_0,
            						"fr.inria.diverse.MiniFSM.IntExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getGreaterAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleGreater"


    // $ANTLR start "entryRuleGreaterOrEqual"
    // InternalMiniFSM.g:1476:1: entryRuleGreaterOrEqual returns [EObject current=null] : iv_ruleGreaterOrEqual= ruleGreaterOrEqual EOF ;
    public final EObject entryRuleGreaterOrEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterOrEqual = null;


        try {
            // InternalMiniFSM.g:1476:55: (iv_ruleGreaterOrEqual= ruleGreaterOrEqual EOF )
            // InternalMiniFSM.g:1477:2: iv_ruleGreaterOrEqual= ruleGreaterOrEqual EOF
            {
             newCompositeNode(grammarAccess.getGreaterOrEqualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGreaterOrEqual=ruleGreaterOrEqual();

            state._fsp--;

             current =iv_ruleGreaterOrEqual; 
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
    // $ANTLR end "entryRuleGreaterOrEqual"


    // $ANTLR start "ruleGreaterOrEqual"
    // InternalMiniFSM.g:1483:1: ruleGreaterOrEqual returns [EObject current=null] : (otherlv_0= 'greaterOrEqual' otherlv_1= '(' ( (lv_left_2_0= ruleIntExpression ) ) otherlv_3= ',' ( (lv_right_4_0= ruleIntExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleGreaterOrEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_left_2_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalMiniFSM.g:1489:2: ( (otherlv_0= 'greaterOrEqual' otherlv_1= '(' ( (lv_left_2_0= ruleIntExpression ) ) otherlv_3= ',' ( (lv_right_4_0= ruleIntExpression ) ) otherlv_5= ')' ) )
            // InternalMiniFSM.g:1490:2: (otherlv_0= 'greaterOrEqual' otherlv_1= '(' ( (lv_left_2_0= ruleIntExpression ) ) otherlv_3= ',' ( (lv_right_4_0= ruleIntExpression ) ) otherlv_5= ')' )
            {
            // InternalMiniFSM.g:1490:2: (otherlv_0= 'greaterOrEqual' otherlv_1= '(' ( (lv_left_2_0= ruleIntExpression ) ) otherlv_3= ',' ( (lv_right_4_0= ruleIntExpression ) ) otherlv_5= ')' )
            // InternalMiniFSM.g:1491:3: otherlv_0= 'greaterOrEqual' otherlv_1= '(' ( (lv_left_2_0= ruleIntExpression ) ) otherlv_3= ',' ( (lv_right_4_0= ruleIntExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getGreaterOrEqualAccess().getGreaterOrEqualKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getGreaterOrEqualAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMiniFSM.g:1499:3: ( (lv_left_2_0= ruleIntExpression ) )
            // InternalMiniFSM.g:1500:4: (lv_left_2_0= ruleIntExpression )
            {
            // InternalMiniFSM.g:1500:4: (lv_left_2_0= ruleIntExpression )
            // InternalMiniFSM.g:1501:5: lv_left_2_0= ruleIntExpression
            {

            					newCompositeNode(grammarAccess.getGreaterOrEqualAccess().getLeftIntExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_left_2_0=ruleIntExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGreaterOrEqualRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_2_0,
            						"fr.inria.diverse.MiniFSM.IntExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getGreaterOrEqualAccess().getCommaKeyword_3());
            		
            // InternalMiniFSM.g:1522:3: ( (lv_right_4_0= ruleIntExpression ) )
            // InternalMiniFSM.g:1523:4: (lv_right_4_0= ruleIntExpression )
            {
            // InternalMiniFSM.g:1523:4: (lv_right_4_0= ruleIntExpression )
            // InternalMiniFSM.g:1524:5: lv_right_4_0= ruleIntExpression
            {

            					newCompositeNode(grammarAccess.getGreaterOrEqualAccess().getRightIntExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_right_4_0=ruleIntExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGreaterOrEqualRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_4_0,
            						"fr.inria.diverse.MiniFSM.IntExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getGreaterOrEqualAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleGreaterOrEqual"


    // $ANTLR start "entryRuleLess"
    // InternalMiniFSM.g:1549:1: entryRuleLess returns [EObject current=null] : iv_ruleLess= ruleLess EOF ;
    public final EObject entryRuleLess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLess = null;


        try {
            // InternalMiniFSM.g:1549:45: (iv_ruleLess= ruleLess EOF )
            // InternalMiniFSM.g:1550:2: iv_ruleLess= ruleLess EOF
            {
             newCompositeNode(grammarAccess.getLessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLess=ruleLess();

            state._fsp--;

             current =iv_ruleLess; 
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
    // $ANTLR end "entryRuleLess"


    // $ANTLR start "ruleLess"
    // InternalMiniFSM.g:1556:1: ruleLess returns [EObject current=null] : (otherlv_0= 'less' otherlv_1= '(' ( (lv_left_2_0= ruleIntExpression ) ) otherlv_3= ',' ( (lv_right_4_0= ruleIntExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleLess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_left_2_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalMiniFSM.g:1562:2: ( (otherlv_0= 'less' otherlv_1= '(' ( (lv_left_2_0= ruleIntExpression ) ) otherlv_3= ',' ( (lv_right_4_0= ruleIntExpression ) ) otherlv_5= ')' ) )
            // InternalMiniFSM.g:1563:2: (otherlv_0= 'less' otherlv_1= '(' ( (lv_left_2_0= ruleIntExpression ) ) otherlv_3= ',' ( (lv_right_4_0= ruleIntExpression ) ) otherlv_5= ')' )
            {
            // InternalMiniFSM.g:1563:2: (otherlv_0= 'less' otherlv_1= '(' ( (lv_left_2_0= ruleIntExpression ) ) otherlv_3= ',' ( (lv_right_4_0= ruleIntExpression ) ) otherlv_5= ')' )
            // InternalMiniFSM.g:1564:3: otherlv_0= 'less' otherlv_1= '(' ( (lv_left_2_0= ruleIntExpression ) ) otherlv_3= ',' ( (lv_right_4_0= ruleIntExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getLessAccess().getLessKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getLessAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMiniFSM.g:1572:3: ( (lv_left_2_0= ruleIntExpression ) )
            // InternalMiniFSM.g:1573:4: (lv_left_2_0= ruleIntExpression )
            {
            // InternalMiniFSM.g:1573:4: (lv_left_2_0= ruleIntExpression )
            // InternalMiniFSM.g:1574:5: lv_left_2_0= ruleIntExpression
            {

            					newCompositeNode(grammarAccess.getLessAccess().getLeftIntExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_left_2_0=ruleIntExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLessRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_2_0,
            						"fr.inria.diverse.MiniFSM.IntExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getLessAccess().getCommaKeyword_3());
            		
            // InternalMiniFSM.g:1595:3: ( (lv_right_4_0= ruleIntExpression ) )
            // InternalMiniFSM.g:1596:4: (lv_right_4_0= ruleIntExpression )
            {
            // InternalMiniFSM.g:1596:4: (lv_right_4_0= ruleIntExpression )
            // InternalMiniFSM.g:1597:5: lv_right_4_0= ruleIntExpression
            {

            					newCompositeNode(grammarAccess.getLessAccess().getRightIntExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_right_4_0=ruleIntExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLessRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_4_0,
            						"fr.inria.diverse.MiniFSM.IntExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLessAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleLess"


    // $ANTLR start "entryRuleLessOrEqual"
    // InternalMiniFSM.g:1622:1: entryRuleLessOrEqual returns [EObject current=null] : iv_ruleLessOrEqual= ruleLessOrEqual EOF ;
    public final EObject entryRuleLessOrEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessOrEqual = null;


        try {
            // InternalMiniFSM.g:1622:52: (iv_ruleLessOrEqual= ruleLessOrEqual EOF )
            // InternalMiniFSM.g:1623:2: iv_ruleLessOrEqual= ruleLessOrEqual EOF
            {
             newCompositeNode(grammarAccess.getLessOrEqualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLessOrEqual=ruleLessOrEqual();

            state._fsp--;

             current =iv_ruleLessOrEqual; 
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
    // $ANTLR end "entryRuleLessOrEqual"


    // $ANTLR start "ruleLessOrEqual"
    // InternalMiniFSM.g:1629:1: ruleLessOrEqual returns [EObject current=null] : (otherlv_0= 'lessOrEqual' otherlv_1= '(' ( (lv_left_2_0= ruleIntExpression ) ) otherlv_3= ',' ( (lv_right_4_0= ruleIntExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleLessOrEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_left_2_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalMiniFSM.g:1635:2: ( (otherlv_0= 'lessOrEqual' otherlv_1= '(' ( (lv_left_2_0= ruleIntExpression ) ) otherlv_3= ',' ( (lv_right_4_0= ruleIntExpression ) ) otherlv_5= ')' ) )
            // InternalMiniFSM.g:1636:2: (otherlv_0= 'lessOrEqual' otherlv_1= '(' ( (lv_left_2_0= ruleIntExpression ) ) otherlv_3= ',' ( (lv_right_4_0= ruleIntExpression ) ) otherlv_5= ')' )
            {
            // InternalMiniFSM.g:1636:2: (otherlv_0= 'lessOrEqual' otherlv_1= '(' ( (lv_left_2_0= ruleIntExpression ) ) otherlv_3= ',' ( (lv_right_4_0= ruleIntExpression ) ) otherlv_5= ')' )
            // InternalMiniFSM.g:1637:3: otherlv_0= 'lessOrEqual' otherlv_1= '(' ( (lv_left_2_0= ruleIntExpression ) ) otherlv_3= ',' ( (lv_right_4_0= ruleIntExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getLessOrEqualAccess().getLessOrEqualKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getLessOrEqualAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMiniFSM.g:1645:3: ( (lv_left_2_0= ruleIntExpression ) )
            // InternalMiniFSM.g:1646:4: (lv_left_2_0= ruleIntExpression )
            {
            // InternalMiniFSM.g:1646:4: (lv_left_2_0= ruleIntExpression )
            // InternalMiniFSM.g:1647:5: lv_left_2_0= ruleIntExpression
            {

            					newCompositeNode(grammarAccess.getLessOrEqualAccess().getLeftIntExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_left_2_0=ruleIntExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLessOrEqualRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_2_0,
            						"fr.inria.diverse.MiniFSM.IntExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getLessOrEqualAccess().getCommaKeyword_3());
            		
            // InternalMiniFSM.g:1668:3: ( (lv_right_4_0= ruleIntExpression ) )
            // InternalMiniFSM.g:1669:4: (lv_right_4_0= ruleIntExpression )
            {
            // InternalMiniFSM.g:1669:4: (lv_right_4_0= ruleIntExpression )
            // InternalMiniFSM.g:1670:5: lv_right_4_0= ruleIntExpression
            {

            					newCompositeNode(grammarAccess.getLessOrEqualAccess().getRightIntExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_right_4_0=ruleIntExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLessOrEqualRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_4_0,
            						"fr.inria.diverse.MiniFSM.IntExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLessOrEqualAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleLessOrEqual"


    // $ANTLR start "entryRuleIntExpression"
    // InternalMiniFSM.g:1695:1: entryRuleIntExpression returns [EObject current=null] : iv_ruleIntExpression= ruleIntExpression EOF ;
    public final EObject entryRuleIntExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntExpression = null;


        try {
            // InternalMiniFSM.g:1695:54: (iv_ruleIntExpression= ruleIntExpression EOF )
            // InternalMiniFSM.g:1696:2: iv_ruleIntExpression= ruleIntExpression EOF
            {
             newCompositeNode(grammarAccess.getIntExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntExpression=ruleIntExpression();

            state._fsp--;

             current =iv_ruleIntExpression; 
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
    // $ANTLR end "entryRuleIntExpression"


    // $ANTLR start "ruleIntExpression"
    // InternalMiniFSM.g:1702:1: ruleIntExpression returns [EObject current=null] : this_PlusMinus_0= rulePlusMinus ;
    public final EObject ruleIntExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PlusMinus_0 = null;



        	enterRule();

        try {
            // InternalMiniFSM.g:1708:2: (this_PlusMinus_0= rulePlusMinus )
            // InternalMiniFSM.g:1709:2: this_PlusMinus_0= rulePlusMinus
            {

            		newCompositeNode(grammarAccess.getIntExpressionAccess().getPlusMinusParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_PlusMinus_0=rulePlusMinus();

            state._fsp--;


            		current = this_PlusMinus_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleIntExpression"


    // $ANTLR start "entryRulePlusMinus"
    // InternalMiniFSM.g:1720:1: entryRulePlusMinus returns [EObject current=null] : iv_rulePlusMinus= rulePlusMinus EOF ;
    public final EObject entryRulePlusMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusMinus = null;


        try {
            // InternalMiniFSM.g:1720:50: (iv_rulePlusMinus= rulePlusMinus EOF )
            // InternalMiniFSM.g:1721:2: iv_rulePlusMinus= rulePlusMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlusMinus=rulePlusMinus();

            state._fsp--;

             current =iv_rulePlusMinus; 
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
    // $ANTLR end "entryRulePlusMinus"


    // $ANTLR start "rulePlusMinus"
    // InternalMiniFSM.g:1727:1: rulePlusMinus returns [EObject current=null] : (this_MultDiv_0= ruleMultDiv ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultDiv ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleMultDiv ) ) ) )? ) ;
    public final EObject rulePlusMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_MultDiv_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalMiniFSM.g:1733:2: ( (this_MultDiv_0= ruleMultDiv ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultDiv ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleMultDiv ) ) ) )? ) )
            // InternalMiniFSM.g:1734:2: (this_MultDiv_0= ruleMultDiv ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultDiv ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleMultDiv ) ) ) )? )
            {
            // InternalMiniFSM.g:1734:2: (this_MultDiv_0= ruleMultDiv ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultDiv ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleMultDiv ) ) ) )? )
            // InternalMiniFSM.g:1735:3: this_MultDiv_0= ruleMultDiv ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultDiv ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleMultDiv ) ) ) )?
            {

            			newCompositeNode(grammarAccess.getPlusMinusAccess().getMultDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_MultDiv_0=ruleMultDiv();

            state._fsp--;


            			current = this_MultDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMiniFSM.g:1743:3: ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultDiv ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleMultDiv ) ) ) )?
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==40) ) {
                alt20=1;
            }
            else if ( (LA20_0==41) ) {
                alt20=2;
            }
            switch (alt20) {
                case 1 :
                    // InternalMiniFSM.g:1744:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultDiv ) ) )
                    {
                    // InternalMiniFSM.g:1744:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultDiv ) ) )
                    // InternalMiniFSM.g:1745:5: () otherlv_2= '+' ( (lv_right_3_0= ruleMultDiv ) )
                    {
                    // InternalMiniFSM.g:1745:5: ()
                    // InternalMiniFSM.g:1746:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getPlusMinusAccess().getPlusLeftAction_1_0_0(),
                    							current);
                    					

                    }

                    otherlv_2=(Token)match(input,40,FOLLOW_18); 

                    					newLeafNode(otherlv_2, grammarAccess.getPlusMinusAccess().getPlusSignKeyword_1_0_1());
                    				
                    // InternalMiniFSM.g:1756:5: ( (lv_right_3_0= ruleMultDiv ) )
                    // InternalMiniFSM.g:1757:6: (lv_right_3_0= ruleMultDiv )
                    {
                    // InternalMiniFSM.g:1757:6: (lv_right_3_0= ruleMultDiv )
                    // InternalMiniFSM.g:1758:7: lv_right_3_0= ruleMultDiv
                    {

                    							newCompositeNode(grammarAccess.getPlusMinusAccess().getRightMultDivParserRuleCall_1_0_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleMultDiv();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPlusMinusRule());
                    							}
                    							set(
                    								current,
                    								"right",
                    								lv_right_3_0,
                    								"fr.inria.diverse.MiniFSM.MultDiv");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMiniFSM.g:1777:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleMultDiv ) ) )
                    {
                    // InternalMiniFSM.g:1777:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleMultDiv ) ) )
                    // InternalMiniFSM.g:1778:5: () otherlv_5= '-' ( (lv_right_6_0= ruleMultDiv ) )
                    {
                    // InternalMiniFSM.g:1778:5: ()
                    // InternalMiniFSM.g:1779:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getPlusMinusAccess().getMinusLeftAction_1_1_0(),
                    							current);
                    					

                    }

                    otherlv_5=(Token)match(input,41,FOLLOW_18); 

                    					newLeafNode(otherlv_5, grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1_1_1());
                    				
                    // InternalMiniFSM.g:1789:5: ( (lv_right_6_0= ruleMultDiv ) )
                    // InternalMiniFSM.g:1790:6: (lv_right_6_0= ruleMultDiv )
                    {
                    // InternalMiniFSM.g:1790:6: (lv_right_6_0= ruleMultDiv )
                    // InternalMiniFSM.g:1791:7: lv_right_6_0= ruleMultDiv
                    {

                    							newCompositeNode(grammarAccess.getPlusMinusAccess().getRightMultDivParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_right_6_0=ruleMultDiv();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPlusMinusRule());
                    							}
                    							set(
                    								current,
                    								"right",
                    								lv_right_6_0,
                    								"fr.inria.diverse.MiniFSM.MultDiv");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


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
    // $ANTLR end "rulePlusMinus"


    // $ANTLR start "entryRuleMultDiv"
    // InternalMiniFSM.g:1814:1: entryRuleMultDiv returns [EObject current=null] : iv_ruleMultDiv= ruleMultDiv EOF ;
    public final EObject entryRuleMultDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultDiv = null;


        try {
            // InternalMiniFSM.g:1814:48: (iv_ruleMultDiv= ruleMultDiv EOF )
            // InternalMiniFSM.g:1815:2: iv_ruleMultDiv= ruleMultDiv EOF
            {
             newCompositeNode(grammarAccess.getMultDivRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultDiv=ruleMultDiv();

            state._fsp--;

             current =iv_ruleMultDiv; 
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
    // $ANTLR end "entryRuleMultDiv"


    // $ANTLR start "ruleMultDiv"
    // InternalMiniFSM.g:1821:1: ruleMultDiv returns [EObject current=null] : (this_TermInt_0= ruleTermInt ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleTermInt ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleTermInt ) ) ) )? ) ;
    public final EObject ruleMultDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_TermInt_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalMiniFSM.g:1827:2: ( (this_TermInt_0= ruleTermInt ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleTermInt ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleTermInt ) ) ) )? ) )
            // InternalMiniFSM.g:1828:2: (this_TermInt_0= ruleTermInt ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleTermInt ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleTermInt ) ) ) )? )
            {
            // InternalMiniFSM.g:1828:2: (this_TermInt_0= ruleTermInt ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleTermInt ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleTermInt ) ) ) )? )
            // InternalMiniFSM.g:1829:3: this_TermInt_0= ruleTermInt ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleTermInt ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleTermInt ) ) ) )?
            {

            			newCompositeNode(grammarAccess.getMultDivAccess().getTermIntParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_TermInt_0=ruleTermInt();

            state._fsp--;


            			current = this_TermInt_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMiniFSM.g:1837:3: ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleTermInt ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleTermInt ) ) ) )?
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==42) ) {
                alt21=1;
            }
            else if ( (LA21_0==43) ) {
                alt21=2;
            }
            switch (alt21) {
                case 1 :
                    // InternalMiniFSM.g:1838:4: ( () otherlv_2= '*' ( (lv_right_3_0= ruleTermInt ) ) )
                    {
                    // InternalMiniFSM.g:1838:4: ( () otherlv_2= '*' ( (lv_right_3_0= ruleTermInt ) ) )
                    // InternalMiniFSM.g:1839:5: () otherlv_2= '*' ( (lv_right_3_0= ruleTermInt ) )
                    {
                    // InternalMiniFSM.g:1839:5: ()
                    // InternalMiniFSM.g:1840:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getMultDivAccess().getMultiplyLeftAction_1_0_0(),
                    							current);
                    					

                    }

                    otherlv_2=(Token)match(input,42,FOLLOW_18); 

                    					newLeafNode(otherlv_2, grammarAccess.getMultDivAccess().getAsteriskKeyword_1_0_1());
                    				
                    // InternalMiniFSM.g:1850:5: ( (lv_right_3_0= ruleTermInt ) )
                    // InternalMiniFSM.g:1851:6: (lv_right_3_0= ruleTermInt )
                    {
                    // InternalMiniFSM.g:1851:6: (lv_right_3_0= ruleTermInt )
                    // InternalMiniFSM.g:1852:7: lv_right_3_0= ruleTermInt
                    {

                    							newCompositeNode(grammarAccess.getMultDivAccess().getRightTermIntParserRuleCall_1_0_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleTermInt();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getMultDivRule());
                    							}
                    							set(
                    								current,
                    								"right",
                    								lv_right_3_0,
                    								"fr.inria.diverse.MiniFSM.TermInt");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMiniFSM.g:1871:4: ( () otherlv_5= '/' ( (lv_right_6_0= ruleTermInt ) ) )
                    {
                    // InternalMiniFSM.g:1871:4: ( () otherlv_5= '/' ( (lv_right_6_0= ruleTermInt ) ) )
                    // InternalMiniFSM.g:1872:5: () otherlv_5= '/' ( (lv_right_6_0= ruleTermInt ) )
                    {
                    // InternalMiniFSM.g:1872:5: ()
                    // InternalMiniFSM.g:1873:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getMultDivAccess().getDivideLeftAction_1_1_0(),
                    							current);
                    					

                    }

                    otherlv_5=(Token)match(input,43,FOLLOW_18); 

                    					newLeafNode(otherlv_5, grammarAccess.getMultDivAccess().getSolidusKeyword_1_1_1());
                    				
                    // InternalMiniFSM.g:1883:5: ( (lv_right_6_0= ruleTermInt ) )
                    // InternalMiniFSM.g:1884:6: (lv_right_6_0= ruleTermInt )
                    {
                    // InternalMiniFSM.g:1884:6: (lv_right_6_0= ruleTermInt )
                    // InternalMiniFSM.g:1885:7: lv_right_6_0= ruleTermInt
                    {

                    							newCompositeNode(grammarAccess.getMultDivAccess().getRightTermIntParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_right_6_0=ruleTermInt();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getMultDivRule());
                    							}
                    							set(
                    								current,
                    								"right",
                    								lv_right_6_0,
                    								"fr.inria.diverse.MiniFSM.TermInt");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


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
    // $ANTLR end "ruleMultDiv"


    // $ANTLR start "entryRuleTermInt"
    // InternalMiniFSM.g:1908:1: entryRuleTermInt returns [EObject current=null] : iv_ruleTermInt= ruleTermInt EOF ;
    public final EObject entryRuleTermInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermInt = null;


        try {
            // InternalMiniFSM.g:1908:48: (iv_ruleTermInt= ruleTermInt EOF )
            // InternalMiniFSM.g:1909:2: iv_ruleTermInt= ruleTermInt EOF
            {
             newCompositeNode(grammarAccess.getTermIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTermInt=ruleTermInt();

            state._fsp--;

             current =iv_ruleTermInt; 
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
    // $ANTLR end "entryRuleTermInt"


    // $ANTLR start "ruleTermInt"
    // InternalMiniFSM.g:1915:1: ruleTermInt returns [EObject current=null] : (this_Integer_0= ruleInteger | this_IntVariableRef_1= ruleIntVariableRef | (otherlv_2= '(' this_PlusMinus_3= rulePlusMinus otherlv_4= ')' ) ) ;
    public final EObject ruleTermInt() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Integer_0 = null;

        EObject this_IntVariableRef_1 = null;

        EObject this_PlusMinus_3 = null;



        	enterRule();

        try {
            // InternalMiniFSM.g:1921:2: ( (this_Integer_0= ruleInteger | this_IntVariableRef_1= ruleIntVariableRef | (otherlv_2= '(' this_PlusMinus_3= rulePlusMinus otherlv_4= ')' ) ) )
            // InternalMiniFSM.g:1922:2: (this_Integer_0= ruleInteger | this_IntVariableRef_1= ruleIntVariableRef | (otherlv_2= '(' this_PlusMinus_3= rulePlusMinus otherlv_4= ')' ) )
            {
            // InternalMiniFSM.g:1922:2: (this_Integer_0= ruleInteger | this_IntVariableRef_1= ruleIntVariableRef | (otherlv_2= '(' this_PlusMinus_3= rulePlusMinus otherlv_4= ')' ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 41:
                {
                alt22=1;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt22=2;
                }
                break;
            case 22:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalMiniFSM.g:1923:3: this_Integer_0= ruleInteger
                    {

                    			newCompositeNode(grammarAccess.getTermIntAccess().getIntegerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Integer_0=ruleInteger();

                    state._fsp--;


                    			current = this_Integer_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMiniFSM.g:1932:3: this_IntVariableRef_1= ruleIntVariableRef
                    {

                    			newCompositeNode(grammarAccess.getTermIntAccess().getIntVariableRefParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntVariableRef_1=ruleIntVariableRef();

                    state._fsp--;


                    			current = this_IntVariableRef_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMiniFSM.g:1941:3: (otherlv_2= '(' this_PlusMinus_3= rulePlusMinus otherlv_4= ')' )
                    {
                    // InternalMiniFSM.g:1941:3: (otherlv_2= '(' this_PlusMinus_3= rulePlusMinus otherlv_4= ')' )
                    // InternalMiniFSM.g:1942:4: otherlv_2= '(' this_PlusMinus_3= rulePlusMinus otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_18); 

                    				newLeafNode(otherlv_2, grammarAccess.getTermIntAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getTermIntAccess().getPlusMinusParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_17);
                    this_PlusMinus_3=rulePlusMinus();

                    state._fsp--;


                    				current = this_PlusMinus_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getTermIntAccess().getRightParenthesisKeyword_2_2());
                    			

                    }


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
    // $ANTLR end "ruleTermInt"


    // $ANTLR start "entryRuleInteger"
    // InternalMiniFSM.g:1963:1: entryRuleInteger returns [EObject current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final EObject entryRuleInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteger = null;


        try {
            // InternalMiniFSM.g:1963:48: (iv_ruleInteger= ruleInteger EOF )
            // InternalMiniFSM.g:1964:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger; 
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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalMiniFSM.g:1970:1: ruleInteger returns [EObject current=null] : ( (lv_value_0_0= ruleEInt ) ) ;
    public final EObject ruleInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalMiniFSM.g:1976:2: ( ( (lv_value_0_0= ruleEInt ) ) )
            // InternalMiniFSM.g:1977:2: ( (lv_value_0_0= ruleEInt ) )
            {
            // InternalMiniFSM.g:1977:2: ( (lv_value_0_0= ruleEInt ) )
            // InternalMiniFSM.g:1978:3: (lv_value_0_0= ruleEInt )
            {
            // InternalMiniFSM.g:1978:3: (lv_value_0_0= ruleEInt )
            // InternalMiniFSM.g:1979:4: lv_value_0_0= ruleEInt
            {

            				newCompositeNode(grammarAccess.getIntegerAccess().getValueEIntParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEInt();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getIntegerRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"fr.inria.diverse.MiniFSM.EInt");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleIntVariableRef"
    // InternalMiniFSM.g:1999:1: entryRuleIntVariableRef returns [EObject current=null] : iv_ruleIntVariableRef= ruleIntVariableRef EOF ;
    public final EObject entryRuleIntVariableRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntVariableRef = null;


        try {
            // InternalMiniFSM.g:1999:55: (iv_ruleIntVariableRef= ruleIntVariableRef EOF )
            // InternalMiniFSM.g:2000:2: iv_ruleIntVariableRef= ruleIntVariableRef EOF
            {
             newCompositeNode(grammarAccess.getIntVariableRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntVariableRef=ruleIntVariableRef();

            state._fsp--;

             current =iv_ruleIntVariableRef; 
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
    // $ANTLR end "entryRuleIntVariableRef"


    // $ANTLR start "ruleIntVariableRef"
    // InternalMiniFSM.g:2006:1: ruleIntVariableRef returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleIntVariableRef() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMiniFSM.g:2012:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMiniFSM.g:2013:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMiniFSM.g:2013:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalMiniFSM.g:2014:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMiniFSM.g:2014:3: ()
            // InternalMiniFSM.g:2015:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntVariableRefAccess().getIntVariableRefAction_0(),
            					current);
            			

            }

            // InternalMiniFSM.g:2021:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMiniFSM.g:2022:4: (lv_name_1_0= ruleEString )
            {
            // InternalMiniFSM.g:2022:4: (lv_name_1_0= ruleEString )
            // InternalMiniFSM.g:2023:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIntVariableRefAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntVariableRefRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.diverse.MiniFSM.EString");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleIntVariableRef"


    // $ANTLR start "entryRuleEInt"
    // InternalMiniFSM.g:2044:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMiniFSM.g:2044:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMiniFSM.g:2045:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMiniFSM.g:2051:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMiniFSM.g:2057:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMiniFSM.g:2058:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMiniFSM.g:2058:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMiniFSM.g:2059:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMiniFSM.g:2059:3: (kw= '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMiniFSM.g:2060:4: kw= '-'
                    {
                    kw=(Token)match(input,41,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleIntegerVar"
    // InternalMiniFSM.g:2077:1: entryRuleIntegerVar returns [EObject current=null] : iv_ruleIntegerVar= ruleIntegerVar EOF ;
    public final EObject entryRuleIntegerVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerVar = null;


        try {
            // InternalMiniFSM.g:2077:51: (iv_ruleIntegerVar= ruleIntegerVar EOF )
            // InternalMiniFSM.g:2078:2: iv_ruleIntegerVar= ruleIntegerVar EOF
            {
             newCompositeNode(grammarAccess.getIntegerVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerVar=ruleIntegerVar();

            state._fsp--;

             current =iv_ruleIntegerVar; 
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
    // $ANTLR end "entryRuleIntegerVar"


    // $ANTLR start "ruleIntegerVar"
    // InternalMiniFSM.g:2084:1: ruleIntegerVar returns [EObject current=null] : ( () otherlv_1= 'Integer' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleEInt ) ) )? ) ;
    public final EObject ruleIntegerVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalMiniFSM.g:2090:2: ( ( () otherlv_1= 'Integer' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleEInt ) ) )? ) )
            // InternalMiniFSM.g:2091:2: ( () otherlv_1= 'Integer' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleEInt ) ) )? )
            {
            // InternalMiniFSM.g:2091:2: ( () otherlv_1= 'Integer' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleEInt ) ) )? )
            // InternalMiniFSM.g:2092:3: () otherlv_1= 'Integer' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleEInt ) ) )?
            {
            // InternalMiniFSM.g:2092:3: ()
            // InternalMiniFSM.g:2093:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerVarAccess().getIntegerVarAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerVarAccess().getIntegerKeyword_1());
            		
            // InternalMiniFSM.g:2103:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMiniFSM.g:2104:4: (lv_name_2_0= ruleEString )
            {
            // InternalMiniFSM.g:2104:4: (lv_name_2_0= ruleEString )
            // InternalMiniFSM.g:2105:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIntegerVarAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntegerVarRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.inria.diverse.MiniFSM.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMiniFSM.g:2122:3: (otherlv_3= '=' ( (lv_value_4_0= ruleEInt ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==45) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMiniFSM.g:2123:4: otherlv_3= '=' ( (lv_value_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_25); 

                    				newLeafNode(otherlv_3, grammarAccess.getIntegerVarAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalMiniFSM.g:2127:4: ( (lv_value_4_0= ruleEInt ) )
                    // InternalMiniFSM.g:2128:5: (lv_value_4_0= ruleEInt )
                    {
                    // InternalMiniFSM.g:2128:5: (lv_value_4_0= ruleEInt )
                    // InternalMiniFSM.g:2129:6: lv_value_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getIntegerVarAccess().getValueEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntegerVarRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"fr.inria.diverse.MiniFSM.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleIntegerVar"


    // $ANTLR start "entryRuleEString"
    // InternalMiniFSM.g:2151:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMiniFSM.g:2151:47: (iv_ruleEString= ruleEString EOF )
            // InternalMiniFSM.g:2152:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMiniFSM.g:2158:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMiniFSM.g:2164:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMiniFSM.g:2165:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMiniFSM.g:2165:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_ID) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalMiniFSM.g:2166:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMiniFSM.g:2174:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleBooleanVar"
    // InternalMiniFSM.g:2185:1: entryRuleBooleanVar returns [EObject current=null] : iv_ruleBooleanVar= ruleBooleanVar EOF ;
    public final EObject entryRuleBooleanVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanVar = null;


        try {
            // InternalMiniFSM.g:2185:51: (iv_ruleBooleanVar= ruleBooleanVar EOF )
            // InternalMiniFSM.g:2186:2: iv_ruleBooleanVar= ruleBooleanVar EOF
            {
             newCompositeNode(grammarAccess.getBooleanVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanVar=ruleBooleanVar();

            state._fsp--;

             current =iv_ruleBooleanVar; 
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
    // $ANTLR end "entryRuleBooleanVar"


    // $ANTLR start "ruleBooleanVar"
    // InternalMiniFSM.g:2192:1: ruleBooleanVar returns [EObject current=null] : ( () otherlv_1= 'Boolean' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleEBoolean ) ) )? ) ;
    public final EObject ruleBooleanVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalMiniFSM.g:2198:2: ( ( () otherlv_1= 'Boolean' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleEBoolean ) ) )? ) )
            // InternalMiniFSM.g:2199:2: ( () otherlv_1= 'Boolean' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleEBoolean ) ) )? )
            {
            // InternalMiniFSM.g:2199:2: ( () otherlv_1= 'Boolean' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleEBoolean ) ) )? )
            // InternalMiniFSM.g:2200:3: () otherlv_1= 'Boolean' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleEBoolean ) ) )?
            {
            // InternalMiniFSM.g:2200:3: ()
            // InternalMiniFSM.g:2201:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanVarAccess().getBooleanVarAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanVarAccess().getBooleanKeyword_1());
            		
            // InternalMiniFSM.g:2211:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMiniFSM.g:2212:4: (lv_name_2_0= ruleEString )
            {
            // InternalMiniFSM.g:2212:4: (lv_name_2_0= ruleEString )
            // InternalMiniFSM.g:2213:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBooleanVarAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanVarRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.inria.diverse.MiniFSM.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMiniFSM.g:2230:3: (otherlv_3= '=' ( (lv_value_4_0= ruleEBoolean ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==45) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMiniFSM.g:2231:4: otherlv_3= '=' ( (lv_value_4_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getBooleanVarAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalMiniFSM.g:2235:4: ( (lv_value_4_0= ruleEBoolean ) )
                    // InternalMiniFSM.g:2236:5: (lv_value_4_0= ruleEBoolean )
                    {
                    // InternalMiniFSM.g:2236:5: (lv_value_4_0= ruleEBoolean )
                    // InternalMiniFSM.g:2237:6: lv_value_4_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getBooleanVarAccess().getValueEBooleanParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_4_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBooleanVarRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"fr.inria.diverse.MiniFSM.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleBooleanVar"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000010A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000084060L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000F8C0000060L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000100100004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000E204000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000020000400070L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000600000000L});

}