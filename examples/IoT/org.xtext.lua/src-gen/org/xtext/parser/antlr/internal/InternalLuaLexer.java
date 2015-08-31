package org.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLuaLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int RULE_LUA_NUMBER=5;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=10;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=11;
    public static final int RULE_SL_COMMENT=13;
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
    public static final int RULE_WS=8;
    public static final int RULE_LUA_STRING=6;
    public static final int RULE_COMMENT=7;
    public static final int RULE_LUA_NAME=4;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalLuaLexer() {;} 
    public InternalLuaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalLuaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:11:7: ( ';' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:11:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:12:7: ( 'return' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:12:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:13:7: ( ',' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:13:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:14:7: ( 'break' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:14:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:15:7: ( 'do' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:15:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:16:7: ( 'end' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:16:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:17:7: ( 'while' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:17:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:18:7: ( 'repeat' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:18:9: 'repeat'
            {
            match("repeat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:19:7: ( 'until' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:19:9: 'until'
            {
            match("until"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:20:7: ( 'if' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:20:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:21:7: ( 'then' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:21:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:22:7: ( 'else' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:22:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:23:7: ( 'elseif' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:23:9: 'elseif'
            {
            match("elseif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:24:7: ( 'for' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:24:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:25:7: ( '=' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:25:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:26:7: ( 'in' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:26:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:27:7: ( 'function' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:27:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:28:7: ( '.' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:28:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:29:7: ( ':' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:29:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:30:7: ( 'local' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:30:9: 'local'
            {
            match("local"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:31:7: ( 'or' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:31:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:32:7: ( 'and' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:32:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:33:7: ( '>' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:33:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:34:7: ( '>=' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:34:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:35:7: ( '<' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:35:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:36:7: ( '<=' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:36:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:37:7: ( '==' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:37:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:38:7: ( '~=' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:38:9: '~='
            {
            match("~="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:39:7: ( '..' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:39:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:40:7: ( '+' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:40:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:41:7: ( '-' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:41:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:42:7: ( '*' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:42:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:43:7: ( '/' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:43:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:44:7: ( '%' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:44:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:45:7: ( 'not' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:45:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:46:7: ( '#' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:46:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:47:7: ( '^' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:47:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:48:7: ( 'nil' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:48:9: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:49:7: ( 'true' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:49:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:50:7: ( 'false' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:50:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:51:7: ( '...' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:51:9: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:52:7: ( '{' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:52:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:53:7: ( '}' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:53:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:54:7: ( '[' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:54:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:55:7: ( ']' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:55:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:56:7: ( '(' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:56:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:57:7: ( ')' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:57:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "RULE_COMMENT"
    public final void mRULE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3707:14: ( '--' ( '[[' ( options {greedy=false; } : . )* ']]' | ~ ( '[' ) (~ ( '\\n' ) )* ( '\\n' )? ) )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3707:16: '--' ( '[[' ( options {greedy=false; } : . )* ']]' | ~ ( '[' ) (~ ( '\\n' ) )* ( '\\n' )? )
            {
            match("--"); 

            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3707:21: ( '[[' ( options {greedy=false; } : . )* ']]' | ~ ( '[' ) (~ ( '\\n' ) )* ( '\\n' )? )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='[') ) {
                alt4=1;
            }
            else if ( ((LA4_0>='\u0000' && LA4_0<='Z')||(LA4_0>='\\' && LA4_0<='\uFFFF')) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3707:22: '[[' ( options {greedy=false; } : . )* ']]'
                    {
                    match("[["); 

                    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3707:27: ( options {greedy=false; } : . )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==']') ) {
                            int LA1_1 = input.LA(2);

                            if ( (LA1_1==']') ) {
                                alt1=2;
                            }
                            else if ( ((LA1_1>='\u0000' && LA1_1<='\\')||(LA1_1>='^' && LA1_1<='\uFFFF')) ) {
                                alt1=1;
                            }


                        }
                        else if ( ((LA1_0>='\u0000' && LA1_0<='\\')||(LA1_0>='^' && LA1_0<='\uFFFF')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3707:55: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    match("]]"); 


                    }
                    break;
                case 2 :
                    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3707:64: ~ ( '[' ) (~ ( '\\n' ) )* ( '\\n' )?
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='Z')||(input.LA(1)>='\\' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3707:71: (~ ( '\\n' ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\uFFFF')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3707:71: ~ ( '\\n' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3707:80: ( '\\n' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\n') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3707:80: '\\n'
                            {
                            match('\n'); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3709:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3709:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3709:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\t' && LA5_0<='\n')||LA5_0=='\r'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_LUA_NAME"
    public final void mRULE_LUA_NAME() throws RecognitionException {
        try {
            int _type = RULE_LUA_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3711:15: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3711:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3711:41: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LUA_NAME"

    // $ANTLR start "RULE_LUA_STRING"
    public final void mRULE_LUA_STRING() throws RecognitionException {
        try {
            int _type = RULE_LUA_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:17: ( ( '\\'' ( '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\"' | '\\'' | '\\\\' | '0' .. '9' '0' .. '9' '0' .. '9' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' | '\"' ( '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\"' | '\\'' | '\\\\' | '0' .. '9' '0' .. '9' '0' .. '9' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '[[' ( options {greedy=false; } : . )* ']]' ) )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:19: ( '\\'' ( '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\"' | '\\'' | '\\\\' | '0' .. '9' '0' .. '9' '0' .. '9' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' | '\"' ( '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\"' | '\\'' | '\\\\' | '0' .. '9' '0' .. '9' '0' .. '9' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '[[' ( options {greedy=false; } : . )* ']]' )
            {
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:19: ( '\\'' ( '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\"' | '\\'' | '\\\\' | '0' .. '9' '0' .. '9' '0' .. '9' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' | '\"' ( '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\"' | '\\'' | '\\\\' | '0' .. '9' '0' .. '9' '0' .. '9' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '[[' ( options {greedy=false; } : . )* ']]' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case '\'':
                {
                alt12=1;
                }
                break;
            case '\"':
                {
                alt12=2;
                }
                break;
            case '[':
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:20: '\\'' ( '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\"' | '\\'' | '\\\\' | '0' .. '9' '0' .. '9' '0' .. '9' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:25: ( '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\"' | '\\'' | '\\\\' | '0' .. '9' '0' .. '9' '0' .. '9' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:26: '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\"' | '\\'' | '\\\\' | '0' .. '9' '0' .. '9' '0' .. '9' )
                    	    {
                    	    match('\\'); 
                    	    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:31: ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\"' | '\\'' | '\\\\' | '0' .. '9' '0' .. '9' '0' .. '9' )
                    	    int alt7=11;
                    	    switch ( input.LA(1) ) {
                    	    case 'a':
                    	        {
                    	        alt7=1;
                    	        }
                    	        break;
                    	    case 'b':
                    	        {
                    	        alt7=2;
                    	        }
                    	        break;
                    	    case 'f':
                    	        {
                    	        alt7=3;
                    	        }
                    	        break;
                    	    case 'n':
                    	        {
                    	        alt7=4;
                    	        }
                    	        break;
                    	    case 'r':
                    	        {
                    	        alt7=5;
                    	        }
                    	        break;
                    	    case 't':
                    	        {
                    	        alt7=6;
                    	        }
                    	        break;
                    	    case 'v':
                    	        {
                    	        alt7=7;
                    	        }
                    	        break;
                    	    case '\"':
                    	        {
                    	        alt7=8;
                    	        }
                    	        break;
                    	    case '\'':
                    	        {
                    	        alt7=9;
                    	        }
                    	        break;
                    	    case '\\':
                    	        {
                    	        alt7=10;
                    	        }
                    	        break;
                    	    case '0':
                    	    case '1':
                    	    case '2':
                    	    case '3':
                    	    case '4':
                    	    case '5':
                    	    case '6':
                    	    case '7':
                    	    case '8':
                    	    case '9':
                    	        {
                    	        alt7=11;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 7, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt7) {
                    	        case 1 :
                    	            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:32: 'a'
                    	            {
                    	            match('a'); 

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:36: 'b'
                    	            {
                    	            match('b'); 

                    	            }
                    	            break;
                    	        case 3 :
                    	            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:40: 'f'
                    	            {
                    	            match('f'); 

                    	            }
                    	            break;
                    	        case 4 :
                    	            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:44: 'n'
                    	            {
                    	            match('n'); 

                    	            }
                    	            break;
                    	        case 5 :
                    	            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:48: 'r'
                    	            {
                    	            match('r'); 

                    	            }
                    	            break;
                    	        case 6 :
                    	            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:52: 't'
                    	            {
                    	            match('t'); 

                    	            }
                    	            break;
                    	        case 7 :
                    	            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:56: 'v'
                    	            {
                    	            match('v'); 

                    	            }
                    	            break;
                    	        case 8 :
                    	            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:60: '\"'
                    	            {
                    	            match('\"'); 

                    	            }
                    	            break;
                    	        case 9 :
                    	            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:64: '\\''
                    	            {
                    	            match('\''); 

                    	            }
                    	            break;
                    	        case 10 :
                    	            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:69: '\\\\'
                    	            {
                    	            match('\\'); 

                    	            }
                    	            break;
                    	        case 11 :
                    	            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:74: '0' .. '9' '0' .. '9' '0' .. '9'
                    	            {
                    	            matchRange('0','9'); 
                    	            matchRange('0','9'); 
                    	            matchRange('0','9'); 

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:102: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:124: '\"' ( '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\"' | '\\'' | '\\\\' | '0' .. '9' '0' .. '9' '0' .. '9' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:128: ( '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\"' | '\\'' | '\\\\' | '0' .. '9' '0' .. '9' '0' .. '9' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:129: '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\"' | '\\'' | '\\\\' | '0' .. '9' '0' .. '9' '0' .. '9' )
                    	    {
                    	    match('\\'); 
                    	    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:134: ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\"' | '\\'' | '\\\\' | '0' .. '9' '0' .. '9' '0' .. '9' )
                    	    int alt9=11;
                    	    switch ( input.LA(1) ) {
                    	    case 'a':
                    	        {
                    	        alt9=1;
                    	        }
                    	        break;
                    	    case 'b':
                    	        {
                    	        alt9=2;
                    	        }
                    	        break;
                    	    case 'f':
                    	        {
                    	        alt9=3;
                    	        }
                    	        break;
                    	    case 'n':
                    	        {
                    	        alt9=4;
                    	        }
                    	        break;
                    	    case 'r':
                    	        {
                    	        alt9=5;
                    	        }
                    	        break;
                    	    case 't':
                    	        {
                    	        alt9=6;
                    	        }
                    	        break;
                    	    case 'v':
                    	        {
                    	        alt9=7;
                    	        }
                    	        break;
                    	    case '\"':
                    	        {
                    	        alt9=8;
                    	        }
                    	        break;
                    	    case '\'':
                    	        {
                    	        alt9=9;
                    	        }
                    	        break;
                    	    case '\\':
                    	        {
                    	        alt9=10;
                    	        }
                    	        break;
                    	    case '0':
                    	    case '1':
                    	    case '2':
                    	    case '3':
                    	    case '4':
                    	    case '5':
                    	    case '6':
                    	    case '7':
                    	    case '8':
                    	    case '9':
                    	        {
                    	        alt9=11;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 9, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt9) {
                    	        case 1 :
                    	            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:135: 'a'
                    	            {
                    	            match('a'); 

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:139: 'b'
                    	            {
                    	            match('b'); 

                    	            }
                    	            break;
                    	        case 3 :
                    	            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:143: 'f'
                    	            {
                    	            match('f'); 

                    	            }
                    	            break;
                    	        case 4 :
                    	            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:147: 'n'
                    	            {
                    	            match('n'); 

                    	            }
                    	            break;
                    	        case 5 :
                    	            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:151: 'r'
                    	            {
                    	            match('r'); 

                    	            }
                    	            break;
                    	        case 6 :
                    	            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:155: 't'
                    	            {
                    	            match('t'); 

                    	            }
                    	            break;
                    	        case 7 :
                    	            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:159: 'v'
                    	            {
                    	            match('v'); 

                    	            }
                    	            break;
                    	        case 8 :
                    	            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:163: '\"'
                    	            {
                    	            match('\"'); 

                    	            }
                    	            break;
                    	        case 9 :
                    	            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:167: '\\''
                    	            {
                    	            match('\''); 

                    	            }
                    	            break;
                    	        case 10 :
                    	            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:172: '\\\\'
                    	            {
                    	            match('\\'); 

                    	            }
                    	            break;
                    	        case 11 :
                    	            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:177: '0' .. '9' '0' .. '9' '0' .. '9'
                    	            {
                    	            matchRange('0','9'); 
                    	            matchRange('0','9'); 
                    	            matchRange('0','9'); 

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:205: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 3 :
                    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:225: '[[' ( options {greedy=false; } : . )* ']]'
                    {
                    match("[["); 

                    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:230: ( options {greedy=false; } : . )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==']') ) {
                            int LA11_1 = input.LA(2);

                            if ( (LA11_1==']') ) {
                                alt11=2;
                            }
                            else if ( ((LA11_1>='\u0000' && LA11_1<='\\')||(LA11_1>='^' && LA11_1<='\uFFFF')) ) {
                                alt11=1;
                            }


                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='\\')||(LA11_0>='^' && LA11_0<='\uFFFF')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3713:258: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match("]]"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LUA_STRING"

    // $ANTLR start "RULE_LUA_NUMBER"
    public final void mRULE_LUA_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_LUA_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3715:17: ( ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ ( ( 'E' | 'e' ) ( '-' )? ( '0' .. '9' )+ )? )? | '0x' ( '0' .. '9' | 'a' .. 'f' )+ ) )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3715:19: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ ( ( 'E' | 'e' ) ( '-' )? ( '0' .. '9' )+ )? )? | '0x' ( '0' .. '9' | 'a' .. 'f' )+ )
            {
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3715:19: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ ( ( 'E' | 'e' ) ( '-' )? ( '0' .. '9' )+ )? )? | '0x' ( '0' .. '9' | 'a' .. 'f' )+ )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='0') ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1=='x') ) {
                    alt20=2;
                }
                else {
                    alt20=1;}
            }
            else if ( ((LA20_0>='1' && LA20_0<='9')) ) {
                alt20=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3715:20: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ ( ( 'E' | 'e' ) ( '-' )? ( '0' .. '9' )+ )? )?
                    {
                    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3715:20: ( '0' .. '9' )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3715:21: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3715:32: ( '.' ( '0' .. '9' )+ ( ( 'E' | 'e' ) ( '-' )? ( '0' .. '9' )+ )? )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='.') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3715:33: '.' ( '0' .. '9' )+ ( ( 'E' | 'e' ) ( '-' )? ( '0' .. '9' )+ )?
                            {
                            match('.'); 
                            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3715:37: ( '0' .. '9' )+
                            int cnt14=0;
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3715:38: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt14 >= 1 ) break loop14;
                                        EarlyExitException eee =
                                            new EarlyExitException(14, input);
                                        throw eee;
                                }
                                cnt14++;
                            } while (true);

                            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3715:49: ( ( 'E' | 'e' ) ( '-' )? ( '0' .. '9' )+ )?
                            int alt17=2;
                            int LA17_0 = input.LA(1);

                            if ( (LA17_0=='E'||LA17_0=='e') ) {
                                alt17=1;
                            }
                            switch (alt17) {
                                case 1 :
                                    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3715:50: ( 'E' | 'e' ) ( '-' )? ( '0' .. '9' )+
                                    {
                                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}

                                    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3715:60: ( '-' )?
                                    int alt15=2;
                                    int LA15_0 = input.LA(1);

                                    if ( (LA15_0=='-') ) {
                                        alt15=1;
                                    }
                                    switch (alt15) {
                                        case 1 :
                                            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3715:60: '-'
                                            {
                                            match('-'); 

                                            }
                                            break;

                                    }

                                    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3715:65: ( '0' .. '9' )+
                                    int cnt16=0;
                                    loop16:
                                    do {
                                        int alt16=2;
                                        int LA16_0 = input.LA(1);

                                        if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                                            alt16=1;
                                        }


                                        switch (alt16) {
                                    	case 1 :
                                    	    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3715:66: '0' .. '9'
                                    	    {
                                    	    matchRange('0','9'); 

                                    	    }
                                    	    break;

                                    	default :
                                    	    if ( cnt16 >= 1 ) break loop16;
                                                EarlyExitException eee =
                                                    new EarlyExitException(16, input);
                                                throw eee;
                                        }
                                        cnt16++;
                                    } while (true);


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3715:81: '0x' ( '0' .. '9' | 'a' .. 'f' )+
                    {
                    match("0x"); 

                    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3715:86: ( '0' .. '9' | 'a' .. 'f' )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>='0' && LA19_0<='9')||(LA19_0>='a' && LA19_0<='f')) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LUA_NUMBER"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3717:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3717:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3717:11: ( '^' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='^') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3717:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3717:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='0' && LA22_0<='9')||(LA22_0>='A' && LA22_0<='Z')||LA22_0=='_'||(LA22_0>='a' && LA22_0<='z')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3719:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3719:12: ( '0' .. '9' )+
            {
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3719:12: ( '0' .. '9' )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='0' && LA23_0<='9')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3719:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3721:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3721:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3721:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='\"') ) {
                alt26=1;
            }
            else if ( (LA26_0=='\'') ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3721:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3721:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop24:
                    do {
                        int alt24=3;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0=='\\') ) {
                            alt24=1;
                        }
                        else if ( ((LA24_0>='\u0000' && LA24_0<='!')||(LA24_0>='#' && LA24_0<='[')||(LA24_0>=']' && LA24_0<='\uFFFF')) ) {
                            alt24=2;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3721:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3721:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3721:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3721:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop25:
                    do {
                        int alt25=3;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0=='\\') ) {
                            alt25=1;
                        }
                        else if ( ((LA25_0>='\u0000' && LA25_0<='&')||(LA25_0>='(' && LA25_0<='[')||(LA25_0>=']' && LA25_0<='\uFFFF')) ) {
                            alt25=2;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3721:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3721:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3723:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3723:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3723:24: ( options {greedy=false; } : . )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0=='*') ) {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1=='/') ) {
                        alt27=2;
                    }
                    else if ( ((LA27_1>='\u0000' && LA27_1<='.')||(LA27_1>='0' && LA27_1<='\uFFFF')) ) {
                        alt27=1;
                    }


                }
                else if ( ((LA27_0>='\u0000' && LA27_0<=')')||(LA27_0>='+' && LA27_0<='\uFFFF')) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3723:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3725:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3725:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3725:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>='\u0000' && LA28_0<='\t')||(LA28_0>='\u000B' && LA28_0<='\f')||(LA28_0>='\u000E' && LA28_0<='\uFFFF')) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3725:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3725:40: ( ( '\\r' )? '\\n' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='\n'||LA30_0=='\r') ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3725:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3725:41: ( '\\r' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0=='\r') ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3725:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3727:16: ( . )
            // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:3727:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | RULE_COMMENT | RULE_WS | RULE_LUA_NAME | RULE_LUA_STRING | RULE_LUA_NUMBER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER )
        int alt31=58;
        alt31 = dfa31.predict(input);
        switch (alt31) {
            case 1 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:172: T__42
                {
                mT__42(); 

                }
                break;
            case 29 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:178: T__43
                {
                mT__43(); 

                }
                break;
            case 30 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:184: T__44
                {
                mT__44(); 

                }
                break;
            case 31 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:190: T__45
                {
                mT__45(); 

                }
                break;
            case 32 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:196: T__46
                {
                mT__46(); 

                }
                break;
            case 33 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:202: T__47
                {
                mT__47(); 

                }
                break;
            case 34 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:208: T__48
                {
                mT__48(); 

                }
                break;
            case 35 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:214: T__49
                {
                mT__49(); 

                }
                break;
            case 36 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:220: T__50
                {
                mT__50(); 

                }
                break;
            case 37 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:226: T__51
                {
                mT__51(); 

                }
                break;
            case 38 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:232: T__52
                {
                mT__52(); 

                }
                break;
            case 39 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:238: T__53
                {
                mT__53(); 

                }
                break;
            case 40 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:244: T__54
                {
                mT__54(); 

                }
                break;
            case 41 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:250: T__55
                {
                mT__55(); 

                }
                break;
            case 42 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:256: T__56
                {
                mT__56(); 

                }
                break;
            case 43 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:262: T__57
                {
                mT__57(); 

                }
                break;
            case 44 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:268: T__58
                {
                mT__58(); 

                }
                break;
            case 45 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:274: T__59
                {
                mT__59(); 

                }
                break;
            case 46 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:280: T__60
                {
                mT__60(); 

                }
                break;
            case 47 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:286: T__61
                {
                mT__61(); 

                }
                break;
            case 48 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:292: RULE_COMMENT
                {
                mRULE_COMMENT(); 

                }
                break;
            case 49 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:305: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 50 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:313: RULE_LUA_NAME
                {
                mRULE_LUA_NAME(); 

                }
                break;
            case 51 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:327: RULE_LUA_STRING
                {
                mRULE_LUA_STRING(); 

                }
                break;
            case 52 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:343: RULE_LUA_NUMBER
                {
                mRULE_LUA_NUMBER(); 

                }
                break;
            case 53 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:359: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 54 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:367: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 55 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:376: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 56 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:388: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 57 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:404: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 58 :
                // ../org.xtext.lua/src-gen/org/xtext/parser/antlr/internal/InternalLua.g:1:420: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA31 dfa31 = new DFA31(this);
    static final String DFA31_eotS =
        "\2\uffff\1\55\1\uffff\10\55\1\75\1\77\1\uffff\3\55\1\105\1\107\1\51\1\uffff\1\113\1\uffff\1\117\1\uffff\1\55\1\uffff\1\125\2\uffff\1\131\4\uffff\1\55\2\51\2\144\2\uffff\2\55\2\uffff\1\55\1\151\4\55\1\156\1\157\5\55\2\uffff\1\166\2\uffff\1\55\1\170\1\55\15\uffff\2\55\22\uffff\1\144\3\55\1\uffff\1\u0096\3\55\2\uffff\2\55\1\u009c\2\55\2\uffff\1\55\1\uffff\1\u00a0\1\u00a1\1\u00a2\27\uffff\3\55\1\uffff\1\u00a9\2\55\1\u00ac\1\u00ad\1\uffff\3\55\5\uffff\2\55\1\u00b5\1\55\1\uffff\1\u00b7\1\u00b8\2\uffff\1\55\1\u00ba\1\u00bb\2\uffff\1\u00bc\1\u00bd\1\uffff\1\u00be\2\uffff\1\55\5\uffff\1\55\1\u00c1\1\uffff";
    static final String DFA31_eofS =
        "\u00c2\uffff";
    static final String DFA31_minS =
        "\1\0\1\uffff\1\60\1\uffff\10\60\1\75\1\56\1\uffff\3\60\3\75\1\uffff\1\55\1\uffff\1\52\1\uffff\1\60\1\uffff\1\101\2\uffff\1\133\4\uffff\1\60\2\0\2\60\2\uffff\2\60\2\uffff\15\60\2\uffff\1\56\2\uffff\3\60\15\uffff\2\60\13\uffff\2\0\1\uffff\2\0\2\uffff\4\60\1\uffff\4\60\2\uffff\5\60\2\uffff\1\60\1\uffff\3\60\13\0\1\uffff\13\0\3\60\1\uffff\5\60\1\uffff\3\60\3\uffff\2\0\4\60\1\uffff\2\60\2\uffff\3\60\2\0\2\60\1\uffff\1\60\2\uffff\1\60\5\uffff\2\60\1\uffff";
    static final String DFA31_maxS =
        "\1\uffff\1\uffff\1\172\1\uffff\10\172\1\75\1\56\1\uffff\3\172\3\75\1\uffff\1\55\1\uffff\1\57\1\uffff\1\172\1\uffff\1\172\2\uffff\1\133\4\uffff\1\172\2\uffff\2\71\2\uffff\2\172\2\uffff\15\172\2\uffff\1\56\2\uffff\3\172\15\uffff\2\172\13\uffff\2\uffff\1\uffff\2\uffff\2\uffff\1\71\3\172\1\uffff\4\172\2\uffff\5\172\2\uffff\1\172\1\uffff\3\172\13\uffff\1\uffff\13\uffff\3\172\1\uffff\5\172\1\uffff\3\172\3\uffff\2\uffff\4\172\1\uffff\2\172\2\uffff\3\172\2\uffff\2\172\1\uffff\1\172\2\uffff\1\172\5\uffff\2\172\1\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\12\uffff\1\23\6\uffff\1\36\1\uffff\1\40\1\uffff\1\42\1\uffff\1\44\1\uffff\1\52\1\53\1\uffff\1\55\1\56\1\57\1\61\5\uffff\1\72\1\1\2\uffff\1\62\1\3\15\uffff\1\33\1\17\1\uffff\1\22\1\23\3\uffff\1\30\1\27\1\32\1\31\1\34\1\36\1\60\1\37\1\40\1\70\1\71\1\41\1\42\2\uffff\1\44\1\65\1\45\1\52\1\53\1\63\1\54\1\55\1\56\1\57\1\61\2\uffff\1\63\2\uffff\1\63\1\64\4\uffff\1\5\4\uffff\1\12\1\20\5\uffff\1\51\1\35\1\uffff\1\25\16\uffff\1\67\16\uffff\1\6\5\uffff\1\16\3\uffff\1\26\1\43\1\46\6\uffff\1\14\2\uffff\1\13\1\47\7\uffff\1\4\1\uffff\1\7\1\11\1\uffff\1\50\1\24\1\2\1\10\1\15\2\uffff\1\21";
    static final String DFA31_specialS =
        "\1\17\44\uffff\1\37\1\16\67\uffff\1\22\1\15\1\uffff\1\1\1\0\31\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\23\1\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\20\20\uffff\1\24\1\21\14\uffff\1\14\1\40\17\uffff}>";
    static final String[] DFA31_transitionS = {
            "\11\51\2\43\2\51\1\43\22\51\1\43\1\51\1\46\1\33\1\51\1\31\1\51\1\45\1\41\1\42\1\27\1\25\1\3\1\26\1\15\1\30\1\47\11\50\1\16\1\1\1\23\1\14\1\22\2\51\32\44\1\37\1\51\1\40\1\34\1\44\1\51\1\21\1\4\1\44\1\5\1\6\1\13\2\44\1\11\2\44\1\17\1\44\1\32\1\20\2\44\1\2\1\44\1\12\1\10\1\44\1\7\3\44\1\35\1\51\1\36\1\24\uff81\51",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\53\25\54",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\21\54\1\57\10\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\16\54\1\60\13\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\13\54\1\62\1\54\1\61\14\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\7\54\1\63\22\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\15\54\1\64\14\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\5\54\1\65\7\54\1\66\14\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\7\54\1\67\11\54\1\70\10\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\1\73\15\54\1\71\5\54\1\72\5\54",
            "\1\74",
            "\1\76",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\16\54\1\101\13\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\21\54\1\102\10\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\15\54\1\103\14\54",
            "\1\104",
            "\1\106",
            "\1\110",
            "",
            "\1\112",
            "",
            "\1\115\4\uffff\1\116",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\10\54\1\122\5\54\1\121\13\54",
            "",
            "\32\124\4\uffff\1\124\1\uffff\32\124",
            "",
            "",
            "\1\130",
            "",
            "",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\47\137\1\140\64\137\1\136\uffa3\137",
            "\42\142\1\143\71\142\1\141\uffa3\142",
            "\12\145",
            "\12\145",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\17\54\1\147\3\54\1\146\6\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\150\25\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\3\54\1\152\26\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\22\54\1\153\7\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\10\54\1\154\21\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\23\54\1\155\6\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\160\25\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\24\54\1\161\5\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\21\54\1\162\10\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\15\54\1\163\14\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\13\54\1\164\16\54",
            "",
            "",
            "\1\165",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\2\54\1\167\27\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\3\54\1\171\26\54",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\23\54\1\172\6\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\13\54\1\173\16\54",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\42\u0087\1\u0083\4\u0087\1\u0084\10\u0087\12\u0086\42\u0087\1\u0085\4\u0087\1\174\1\175\3\u0087\1\176\7\u0087\1\177\3\u0087\1\u0080\1\u0087\1\u0081\1\u0087\1\u0082\uff89\u0087",
            "\47\137\1\140\64\137\1\136\uffa3\137",
            "",
            "\42\u0087\1\u008f\4\u0087\1\u0090\10\u0087\12\u0092\42\u0087\1\u0091\4\u0087\1\u0088\1\u0089\3\u0087\1\u008a\7\u0087\1\u008b\3\u0087\1\u008c\1\u0087\1\u008d\1\u0087\1\u008e\uff89\u0087",
            "\42\142\1\143\71\142\1\141\uffa3\142",
            "",
            "",
            "\12\145",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\24\54\1\u0093\5\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u0094\25\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\1\u0095\31\54",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u0097\25\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\13\54\1\u0098\16\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\10\54\1\u0099\21\54",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\15\54\1\u009a\14\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u009b\25\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\2\54\1\u009d\27\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\22\54\1\u009e\7\54",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\1\u009f\31\54",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\47\137\1\140\64\137\1\136\uffa3\137",
            "\47\137\1\140\64\137\1\136\uffa3\137",
            "\47\137\1\140\64\137\1\136\uffa3\137",
            "\47\137\1\140\64\137\1\136\uffa3\137",
            "\47\137\1\140\64\137\1\136\uffa3\137",
            "\47\137\1\140\64\137\1\136\uffa3\137",
            "\47\137\1\140\64\137\1\136\uffa3\137",
            "\47\137\1\140\64\137\1\136\uffa3\137",
            "\47\137\1\140\64\137\1\136\uffa3\137",
            "\47\137\1\140\64\137\1\136\uffa3\137",
            "\60\u0087\12\u00a3\uffc6\u0087",
            "",
            "\42\142\1\143\71\142\1\141\uffa3\142",
            "\42\142\1\143\71\142\1\141\uffa3\142",
            "\42\142\1\143\71\142\1\141\uffa3\142",
            "\42\142\1\143\71\142\1\141\uffa3\142",
            "\42\142\1\143\71\142\1\141\uffa3\142",
            "\42\142\1\143\71\142\1\141\uffa3\142",
            "\42\142\1\143\71\142\1\141\uffa3\142",
            "\42\142\1\143\71\142\1\141\uffa3\142",
            "\42\142\1\143\71\142\1\141\uffa3\142",
            "\42\142\1\143\71\142\1\141\uffa3\142",
            "\60\u0087\12\u00a4\uffc6\u0087",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\21\54\1\u00a5\10\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\1\u00a6\31\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\12\54\1\u00a7\17\54",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\10\54\1\u00a8\21\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u00aa\25\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\13\54\1\u00ab\16\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\23\54\1\u00ae\6\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\4\54\1\u00af\25\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\13\54\1\u00b0\16\54",
            "",
            "",
            "",
            "\60\u0087\12\u00b1\uffc6\u0087",
            "\60\u0087\12\u00b2\uffc6\u0087",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\15\54\1\u00b3\14\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\23\54\1\u00b4\6\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\5\54\1\u00b6\24\54",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\10\54\1\u00b9\21\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\47\137\1\140\64\137\1\136\uffa3\137",
            "\42\142\1\143\71\142\1\141\uffa3\142",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\16\54\1\u00bf\13\54",
            "",
            "",
            "",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\15\54\1\u00c0\14\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | RULE_COMMENT | RULE_WS | RULE_LUA_NAME | RULE_LUA_STRING | RULE_LUA_NUMBER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_98 = input.LA(1);

                        s = -1;
                        if ( (LA31_98=='\"') ) {s = 99;}

                        else if ( (LA31_98=='\\') ) {s = 97;}

                        else if ( ((LA31_98>='\u0000' && LA31_98<='!')||(LA31_98>='#' && LA31_98<='[')||(LA31_98>=']' && LA31_98<='\uFFFF')) ) {s = 98;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA31_97 = input.LA(1);

                        s = -1;
                        if ( (LA31_97=='a') ) {s = 136;}

                        else if ( (LA31_97=='b') ) {s = 137;}

                        else if ( (LA31_97=='f') ) {s = 138;}

                        else if ( (LA31_97=='n') ) {s = 139;}

                        else if ( (LA31_97=='r') ) {s = 140;}

                        else if ( (LA31_97=='t') ) {s = 141;}

                        else if ( (LA31_97=='v') ) {s = 142;}

                        else if ( (LA31_97=='\"') ) {s = 143;}

                        else if ( (LA31_97=='\'') ) {s = 144;}

                        else if ( (LA31_97=='\\') ) {s = 145;}

                        else if ( ((LA31_97>='0' && LA31_97<='9')) ) {s = 146;}

                        else if ( ((LA31_97>='\u0000' && LA31_97<='!')||(LA31_97>='#' && LA31_97<='&')||(LA31_97>='(' && LA31_97<='/')||(LA31_97>=':' && LA31_97<='[')||(LA31_97>=']' && LA31_97<='`')||(LA31_97>='c' && LA31_97<='e')||(LA31_97>='g' && LA31_97<='m')||(LA31_97>='o' && LA31_97<='q')||LA31_97=='s'||LA31_97=='u'||(LA31_97>='w' && LA31_97<='\uFFFF')) ) {s = 135;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA31_124 = input.LA(1);

                        s = -1;
                        if ( (LA31_124=='\'') ) {s = 96;}

                        else if ( (LA31_124=='\\') ) {s = 94;}

                        else if ( ((LA31_124>='\u0000' && LA31_124<='&')||(LA31_124>='(' && LA31_124<='[')||(LA31_124>=']' && LA31_124<='\uFFFF')) ) {s = 95;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA31_125 = input.LA(1);

                        s = -1;
                        if ( (LA31_125=='\'') ) {s = 96;}

                        else if ( (LA31_125=='\\') ) {s = 94;}

                        else if ( ((LA31_125>='\u0000' && LA31_125<='&')||(LA31_125>='(' && LA31_125<='[')||(LA31_125>=']' && LA31_125<='\uFFFF')) ) {s = 95;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA31_126 = input.LA(1);

                        s = -1;
                        if ( (LA31_126=='\'') ) {s = 96;}

                        else if ( (LA31_126=='\\') ) {s = 94;}

                        else if ( ((LA31_126>='\u0000' && LA31_126<='&')||(LA31_126>='(' && LA31_126<='[')||(LA31_126>=']' && LA31_126<='\uFFFF')) ) {s = 95;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA31_127 = input.LA(1);

                        s = -1;
                        if ( (LA31_127=='\'') ) {s = 96;}

                        else if ( (LA31_127=='\\') ) {s = 94;}

                        else if ( ((LA31_127>='\u0000' && LA31_127<='&')||(LA31_127>='(' && LA31_127<='[')||(LA31_127>=']' && LA31_127<='\uFFFF')) ) {s = 95;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA31_128 = input.LA(1);

                        s = -1;
                        if ( (LA31_128=='\'') ) {s = 96;}

                        else if ( (LA31_128=='\\') ) {s = 94;}

                        else if ( ((LA31_128>='\u0000' && LA31_128<='&')||(LA31_128>='(' && LA31_128<='[')||(LA31_128>=']' && LA31_128<='\uFFFF')) ) {s = 95;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA31_129 = input.LA(1);

                        s = -1;
                        if ( (LA31_129=='\'') ) {s = 96;}

                        else if ( (LA31_129=='\\') ) {s = 94;}

                        else if ( ((LA31_129>='\u0000' && LA31_129<='&')||(LA31_129>='(' && LA31_129<='[')||(LA31_129>=']' && LA31_129<='\uFFFF')) ) {s = 95;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA31_130 = input.LA(1);

                        s = -1;
                        if ( (LA31_130=='\'') ) {s = 96;}

                        else if ( (LA31_130=='\\') ) {s = 94;}

                        else if ( ((LA31_130>='\u0000' && LA31_130<='&')||(LA31_130>='(' && LA31_130<='[')||(LA31_130>=']' && LA31_130<='\uFFFF')) ) {s = 95;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA31_131 = input.LA(1);

                        s = -1;
                        if ( (LA31_131=='\'') ) {s = 96;}

                        else if ( (LA31_131=='\\') ) {s = 94;}

                        else if ( ((LA31_131>='\u0000' && LA31_131<='&')||(LA31_131>='(' && LA31_131<='[')||(LA31_131>=']' && LA31_131<='\uFFFF')) ) {s = 95;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA31_132 = input.LA(1);

                        s = -1;
                        if ( (LA31_132=='\'') ) {s = 96;}

                        else if ( (LA31_132=='\\') ) {s = 94;}

                        else if ( ((LA31_132>='\u0000' && LA31_132<='&')||(LA31_132>='(' && LA31_132<='[')||(LA31_132>=']' && LA31_132<='\uFFFF')) ) {s = 95;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA31_133 = input.LA(1);

                        s = -1;
                        if ( (LA31_133=='\'') ) {s = 96;}

                        else if ( (LA31_133=='\\') ) {s = 94;}

                        else if ( ((LA31_133>='\u0000' && LA31_133<='&')||(LA31_133>='(' && LA31_133<='[')||(LA31_133>=']' && LA31_133<='\uFFFF')) ) {s = 95;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA31_177 = input.LA(1);

                        s = -1;
                        if ( (LA31_177=='\'') ) {s = 96;}

                        else if ( (LA31_177=='\\') ) {s = 94;}

                        else if ( ((LA31_177>='\u0000' && LA31_177<='&')||(LA31_177>='(' && LA31_177<='[')||(LA31_177>=']' && LA31_177<='\uFFFF')) ) {s = 95;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA31_95 = input.LA(1);

                        s = -1;
                        if ( (LA31_95=='\'') ) {s = 96;}

                        else if ( (LA31_95=='\\') ) {s = 94;}

                        else if ( ((LA31_95>='\u0000' && LA31_95<='&')||(LA31_95>='(' && LA31_95<='[')||(LA31_95>=']' && LA31_95<='\uFFFF')) ) {s = 95;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA31_38 = input.LA(1);

                        s = -1;
                        if ( (LA31_38=='\\') ) {s = 97;}

                        else if ( ((LA31_38>='\u0000' && LA31_38<='!')||(LA31_38>='#' && LA31_38<='[')||(LA31_38>=']' && LA31_38<='\uFFFF')) ) {s = 98;}

                        else if ( (LA31_38=='\"') ) {s = 99;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA31_0 = input.LA(1);

                        s = -1;
                        if ( (LA31_0==';') ) {s = 1;}

                        else if ( (LA31_0=='r') ) {s = 2;}

                        else if ( (LA31_0==',') ) {s = 3;}

                        else if ( (LA31_0=='b') ) {s = 4;}

                        else if ( (LA31_0=='d') ) {s = 5;}

                        else if ( (LA31_0=='e') ) {s = 6;}

                        else if ( (LA31_0=='w') ) {s = 7;}

                        else if ( (LA31_0=='u') ) {s = 8;}

                        else if ( (LA31_0=='i') ) {s = 9;}

                        else if ( (LA31_0=='t') ) {s = 10;}

                        else if ( (LA31_0=='f') ) {s = 11;}

                        else if ( (LA31_0=='=') ) {s = 12;}

                        else if ( (LA31_0=='.') ) {s = 13;}

                        else if ( (LA31_0==':') ) {s = 14;}

                        else if ( (LA31_0=='l') ) {s = 15;}

                        else if ( (LA31_0=='o') ) {s = 16;}

                        else if ( (LA31_0=='a') ) {s = 17;}

                        else if ( (LA31_0=='>') ) {s = 18;}

                        else if ( (LA31_0=='<') ) {s = 19;}

                        else if ( (LA31_0=='~') ) {s = 20;}

                        else if ( (LA31_0=='+') ) {s = 21;}

                        else if ( (LA31_0=='-') ) {s = 22;}

                        else if ( (LA31_0=='*') ) {s = 23;}

                        else if ( (LA31_0=='/') ) {s = 24;}

                        else if ( (LA31_0=='%') ) {s = 25;}

                        else if ( (LA31_0=='n') ) {s = 26;}

                        else if ( (LA31_0=='#') ) {s = 27;}

                        else if ( (LA31_0=='^') ) {s = 28;}

                        else if ( (LA31_0=='{') ) {s = 29;}

                        else if ( (LA31_0=='}') ) {s = 30;}

                        else if ( (LA31_0=='[') ) {s = 31;}

                        else if ( (LA31_0==']') ) {s = 32;}

                        else if ( (LA31_0=='(') ) {s = 33;}

                        else if ( (LA31_0==')') ) {s = 34;}

                        else if ( ((LA31_0>='\t' && LA31_0<='\n')||LA31_0=='\r'||LA31_0==' ') ) {s = 35;}

                        else if ( ((LA31_0>='A' && LA31_0<='Z')||LA31_0=='_'||LA31_0=='c'||(LA31_0>='g' && LA31_0<='h')||(LA31_0>='j' && LA31_0<='k')||LA31_0=='m'||(LA31_0>='p' && LA31_0<='q')||LA31_0=='s'||LA31_0=='v'||(LA31_0>='x' && LA31_0<='z')) ) {s = 36;}

                        else if ( (LA31_0=='\'') ) {s = 37;}

                        else if ( (LA31_0=='\"') ) {s = 38;}

                        else if ( (LA31_0=='0') ) {s = 39;}

                        else if ( ((LA31_0>='1' && LA31_0<='9')) ) {s = 40;}

                        else if ( ((LA31_0>='\u0000' && LA31_0<='\b')||(LA31_0>='\u000B' && LA31_0<='\f')||(LA31_0>='\u000E' && LA31_0<='\u001F')||LA31_0=='!'||LA31_0=='$'||LA31_0=='&'||(LA31_0>='?' && LA31_0<='@')||LA31_0=='\\'||LA31_0=='`'||LA31_0=='|'||(LA31_0>='\u007F' && LA31_0<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA31_146 = input.LA(1);

                        s = -1;
                        if ( ((LA31_146>='0' && LA31_146<='9')) ) {s = 164;}

                        else if ( ((LA31_146>='\u0000' && LA31_146<='/')||(LA31_146>=':' && LA31_146<='\uFFFF')) ) {s = 135;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA31_164 = input.LA(1);

                        s = -1;
                        if ( ((LA31_164>='0' && LA31_164<='9')) ) {s = 178;}

                        else if ( ((LA31_164>='\u0000' && LA31_164<='/')||(LA31_164>=':' && LA31_164<='\uFFFF')) ) {s = 135;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA31_94 = input.LA(1);

                        s = -1;
                        if ( (LA31_94=='a') ) {s = 124;}

                        else if ( (LA31_94=='b') ) {s = 125;}

                        else if ( (LA31_94=='f') ) {s = 126;}

                        else if ( (LA31_94=='n') ) {s = 127;}

                        else if ( (LA31_94=='r') ) {s = 128;}

                        else if ( (LA31_94=='t') ) {s = 129;}

                        else if ( (LA31_94=='v') ) {s = 130;}

                        else if ( (LA31_94=='\"') ) {s = 131;}

                        else if ( (LA31_94=='\'') ) {s = 132;}

                        else if ( (LA31_94=='\\') ) {s = 133;}

                        else if ( ((LA31_94>='0' && LA31_94<='9')) ) {s = 134;}

                        else if ( ((LA31_94>='\u0000' && LA31_94<='!')||(LA31_94>='#' && LA31_94<='&')||(LA31_94>='(' && LA31_94<='/')||(LA31_94>=':' && LA31_94<='[')||(LA31_94>=']' && LA31_94<='`')||(LA31_94>='c' && LA31_94<='e')||(LA31_94>='g' && LA31_94<='m')||(LA31_94>='o' && LA31_94<='q')||LA31_94=='s'||LA31_94=='u'||(LA31_94>='w' && LA31_94<='\uFFFF')) ) {s = 135;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA31_134 = input.LA(1);

                        s = -1;
                        if ( ((LA31_134>='0' && LA31_134<='9')) ) {s = 163;}

                        else if ( ((LA31_134>='\u0000' && LA31_134<='/')||(LA31_134>=':' && LA31_134<='\uFFFF')) ) {s = 135;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA31_163 = input.LA(1);

                        s = -1;
                        if ( ((LA31_163>='0' && LA31_163<='9')) ) {s = 177;}

                        else if ( ((LA31_163>='\u0000' && LA31_163<='/')||(LA31_163>=':' && LA31_163<='\uFFFF')) ) {s = 135;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA31_136 = input.LA(1);

                        s = -1;
                        if ( (LA31_136=='\"') ) {s = 99;}

                        else if ( (LA31_136=='\\') ) {s = 97;}

                        else if ( ((LA31_136>='\u0000' && LA31_136<='!')||(LA31_136>='#' && LA31_136<='[')||(LA31_136>=']' && LA31_136<='\uFFFF')) ) {s = 98;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA31_137 = input.LA(1);

                        s = -1;
                        if ( (LA31_137=='\"') ) {s = 99;}

                        else if ( (LA31_137=='\\') ) {s = 97;}

                        else if ( ((LA31_137>='\u0000' && LA31_137<='!')||(LA31_137>='#' && LA31_137<='[')||(LA31_137>=']' && LA31_137<='\uFFFF')) ) {s = 98;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA31_138 = input.LA(1);

                        s = -1;
                        if ( (LA31_138=='\"') ) {s = 99;}

                        else if ( (LA31_138=='\\') ) {s = 97;}

                        else if ( ((LA31_138>='\u0000' && LA31_138<='!')||(LA31_138>='#' && LA31_138<='[')||(LA31_138>=']' && LA31_138<='\uFFFF')) ) {s = 98;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA31_139 = input.LA(1);

                        s = -1;
                        if ( (LA31_139=='\"') ) {s = 99;}

                        else if ( (LA31_139=='\\') ) {s = 97;}

                        else if ( ((LA31_139>='\u0000' && LA31_139<='!')||(LA31_139>='#' && LA31_139<='[')||(LA31_139>=']' && LA31_139<='\uFFFF')) ) {s = 98;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA31_140 = input.LA(1);

                        s = -1;
                        if ( (LA31_140=='\"') ) {s = 99;}

                        else if ( (LA31_140=='\\') ) {s = 97;}

                        else if ( ((LA31_140>='\u0000' && LA31_140<='!')||(LA31_140>='#' && LA31_140<='[')||(LA31_140>=']' && LA31_140<='\uFFFF')) ) {s = 98;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA31_141 = input.LA(1);

                        s = -1;
                        if ( (LA31_141=='\"') ) {s = 99;}

                        else if ( (LA31_141=='\\') ) {s = 97;}

                        else if ( ((LA31_141>='\u0000' && LA31_141<='!')||(LA31_141>='#' && LA31_141<='[')||(LA31_141>=']' && LA31_141<='\uFFFF')) ) {s = 98;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA31_142 = input.LA(1);

                        s = -1;
                        if ( (LA31_142=='\"') ) {s = 99;}

                        else if ( (LA31_142=='\\') ) {s = 97;}

                        else if ( ((LA31_142>='\u0000' && LA31_142<='!')||(LA31_142>='#' && LA31_142<='[')||(LA31_142>=']' && LA31_142<='\uFFFF')) ) {s = 98;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA31_143 = input.LA(1);

                        s = -1;
                        if ( (LA31_143=='\"') ) {s = 99;}

                        else if ( (LA31_143=='\\') ) {s = 97;}

                        else if ( ((LA31_143>='\u0000' && LA31_143<='!')||(LA31_143>='#' && LA31_143<='[')||(LA31_143>=']' && LA31_143<='\uFFFF')) ) {s = 98;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA31_144 = input.LA(1);

                        s = -1;
                        if ( (LA31_144=='\"') ) {s = 99;}

                        else if ( (LA31_144=='\\') ) {s = 97;}

                        else if ( ((LA31_144>='\u0000' && LA31_144<='!')||(LA31_144>='#' && LA31_144<='[')||(LA31_144>=']' && LA31_144<='\uFFFF')) ) {s = 98;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA31_145 = input.LA(1);

                        s = -1;
                        if ( (LA31_145=='\"') ) {s = 99;}

                        else if ( (LA31_145=='\\') ) {s = 97;}

                        else if ( ((LA31_145>='\u0000' && LA31_145<='!')||(LA31_145>='#' && LA31_145<='[')||(LA31_145>=']' && LA31_145<='\uFFFF')) ) {s = 98;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA31_37 = input.LA(1);

                        s = -1;
                        if ( (LA31_37=='\\') ) {s = 94;}

                        else if ( ((LA31_37>='\u0000' && LA31_37<='&')||(LA31_37>='(' && LA31_37<='[')||(LA31_37>=']' && LA31_37<='\uFFFF')) ) {s = 95;}

                        else if ( (LA31_37=='\'') ) {s = 96;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA31_178 = input.LA(1);

                        s = -1;
                        if ( (LA31_178=='\"') ) {s = 99;}

                        else if ( (LA31_178=='\\') ) {s = 97;}

                        else if ( ((LA31_178>='\u0000' && LA31_178<='!')||(LA31_178>='#' && LA31_178<='[')||(LA31_178>=']' && LA31_178<='\uFFFF')) ) {s = 98;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}