package at.bestsolution.lego.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLegoLexer extends Lexer {
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
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
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int RULE_FLOAT=7;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalLegoLexer() {;} 
    public InternalLegoLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalLegoLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:11:7: ( 'generated' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:11:9: 'generated'
            {
            match("generated"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:12:7: ( 'rotate180' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:12:9: 'rotate180'
            {
            match("rotate180"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:13:7: ( 'rotate90' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:13:9: 'rotate90'
            {
            match("rotate90"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:14:7: ( 'rotate270' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:14:9: 'rotate270'
            {
            match("rotate270"); 


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
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:15:7: ( '.' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:15:9: '.'
            {
            match('.'); 

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
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:16:7: ( '{' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:16:9: '{'
            {
            match('{'); 

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
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:17:7: ( '}' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:17:9: '}'
            {
            match('}'); 

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
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:18:7: ( 'rgb' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:18:9: 'rgb'
            {
            match("rgb"); 


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
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:19:7: ( 'brick' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:19:9: 'brick'
            {
            match("brick"); 


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
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:20:7: ( 'units' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:20:9: 'units'
            {
            match("units"); 


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
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:21:7: ( 'fxml' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:21:9: 'fxml'
            {
            match("fxml"); 


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
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:22:7: ( 'origin' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:22:9: 'origin'
            {
            match("origin"); 


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
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:23:7: ( 'rbrick' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:23:9: 'rbrick'
            {
            match("rbrick"); 


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
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:24:7: ( 'dbrick' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:24:9: 'dbrick'
            {
            match("dbrick"); 


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
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:25:7: ( 'door' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:25:9: 'door'
            {
            match("door"); 


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
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:26:7: ( 'assembly' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:26:9: 'assembly'
            {
            match("assembly"); 


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
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:27:7: ( 'pos' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:27:9: 'pos'
            {
            match("pos"); 


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
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:28:7: ( 'transform' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:28:9: 'transform'
            {
            match("transform"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3205:10: ( ( '-' )? ( '0' .. '9' )+ )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3205:12: ( '-' )? ( '0' .. '9' )+
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3205:12: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3205:12: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3205:17: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3205:18: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3207:12: ( ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3207:14: ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )*
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3207:14: ( '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='-') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3207:14: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3207:19: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3207:20: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            match('.'); 
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3207:35: ( '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3207:36: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3209:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3209:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3209:11: ( '^' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='^') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3209:11: '^'
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

            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3209:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:
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
            	    break loop7;
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3211:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3211:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3211:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3211:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3211:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3211:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3211:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3211:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3211:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3211:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3211:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop9;
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
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3213:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3213:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3213:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3213:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
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
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3215:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3215:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3215:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3215:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop12;
                }
            } while (true);

            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3215:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3215:41: ( '\\r' )? '\\n'
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3215:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3215:41: '\\r'
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3217:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3217:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3217:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3219:16: ( . )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3219:18: .
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
        // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | RULE_INT | RULE_FLOAT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=26;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1:118: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 20 :
                // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1:127: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 21 :
                // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1:138: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 22 :
                // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1:146: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 23 :
                // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1:158: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 24 :
                // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1:174: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 25 :
                // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1:190: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 26 :
                // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1:198: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\2\30\3\uffff\10\30\1\26\1\52\1\26\1\uffff\3\26\2\uffff"+
        "\1\30\1\uffff\3\30\3\uffff\11\30\1\52\6\uffff\2\30\1\76\10\30\1"+
        "\107\3\30\1\uffff\3\30\1\116\2\30\1\121\1\30\1\uffff\4\30\1\127"+
        "\1\130\1\uffff\2\30\1\uffff\4\30\1\141\2\uffff\1\142\1\143\6\30"+
        "\3\uffff\4\30\1\156\1\30\1\160\1\30\1\162\1\163\1\uffff\1\164\1"+
        "\uffff\1\165\4\uffff";
    static final String DFA16_eofS =
        "\166\uffff";
    static final String DFA16_minS =
        "\1\0\1\145\1\142\3\uffff\1\162\1\156\1\170\1\162\1\142\1\163\1\157"+
        "\1\162\1\60\1\56\1\101\1\uffff\2\0\1\52\2\uffff\1\156\1\uffff\1"+
        "\164\1\142\1\162\3\uffff\2\151\1\155\1\151\1\162\1\157\2\163\1\141"+
        "\1\56\6\uffff\1\145\1\141\1\60\1\151\1\143\1\164\1\154\1\147\1\151"+
        "\1\162\1\145\1\60\1\156\1\162\1\164\1\uffff\1\143\1\153\1\163\1"+
        "\60\1\151\1\143\1\60\1\155\1\uffff\1\163\1\141\1\145\1\153\2\60"+
        "\1\uffff\1\156\1\153\1\uffff\1\142\1\146\1\164\1\61\1\60\2\uffff"+
        "\2\60\1\154\1\157\1\145\1\70\1\60\1\67\3\uffff\1\171\1\162\1\144"+
        "\4\60\1\155\2\60\1\uffff\1\60\1\uffff\1\60\4\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\145\1\157\3\uffff\1\162\1\156\1\170\1\162\1\157\1\163"+
        "\1\157\1\162\2\71\1\172\1\uffff\2\uffff\1\57\2\uffff\1\156\1\uffff"+
        "\1\164\1\142\1\162\3\uffff\2\151\1\155\1\151\1\162\1\157\2\163\1"+
        "\141\1\71\6\uffff\1\145\1\141\1\172\1\151\1\143\1\164\1\154\1\147"+
        "\1\151\1\162\1\145\1\172\1\156\1\162\1\164\1\uffff\1\143\1\153\1"+
        "\163\1\172\1\151\1\143\1\172\1\155\1\uffff\1\163\1\141\1\145\1\153"+
        "\2\172\1\uffff\1\156\1\153\1\uffff\1\142\1\146\1\164\1\71\1\172"+
        "\2\uffff\2\172\1\154\1\157\1\145\1\70\1\60\1\67\3\uffff\1\171\1"+
        "\162\1\144\1\60\1\172\1\60\1\172\1\155\2\172\1\uffff\1\172\1\uffff"+
        "\1\172\4\uffff";
    static final String DFA16_acceptS =
        "\3\uffff\1\5\1\6\1\7\13\uffff\1\25\3\uffff\1\31\1\32\1\uffff\1\25"+
        "\3\uffff\1\5\1\6\1\7\12\uffff\1\24\1\23\1\26\1\27\1\30\1\31\17\uffff"+
        "\1\10\10\uffff\1\21\6\uffff\1\13\2\uffff\1\17\5\uffff\1\11\1\12"+
        "\10\uffff\1\15\1\14\1\16\12\uffff\1\3\1\uffff\1\20\1\uffff\1\1\1"+
        "\2\1\4\1\22";
    static final String DFA16_specialS =
        "\1\1\21\uffff\1\0\1\2\142\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\26\2\25\2\26\1\25\22\26\1\25\1\26\1\22\4\26\1\23\5\26\1"+
            "\16\1\3\1\24\12\17\7\26\32\21\3\26\1\20\1\21\1\26\1\13\1\6\1"+
            "\21\1\12\1\21\1\10\1\1\7\21\1\11\1\14\1\21\1\2\1\21\1\15\1\7"+
            "\5\21\1\4\1\26\1\5\uff82\26",
            "\1\27",
            "\1\33\4\uffff\1\32\7\uffff\1\31",
            "",
            "",
            "",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43\14\uffff\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\12\50",
            "\1\51\1\uffff\12\50",
            "\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\0\53",
            "\0\53",
            "\1\54\4\uffff\1\55",
            "",
            "",
            "\1\57",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "",
            "",
            "",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\51\1\uffff\12\50",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\74",
            "\1\75",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\110",
            "\1\111",
            "\1\112",
            "",
            "\1\113",
            "\1\114",
            "\1\115",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\117",
            "\1\120",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\122",
            "",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\131",
            "\1\132",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136\1\140\6\uffff\1\137",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "",
            "",
            "",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\157",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\161",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | RULE_INT | RULE_FLOAT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_18 = input.LA(1);

                        s = -1;
                        if ( ((LA16_18>='\u0000' && LA16_18<='\uFFFF')) ) {s = 43;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='g') ) {s = 1;}

                        else if ( (LA16_0=='r') ) {s = 2;}

                        else if ( (LA16_0=='.') ) {s = 3;}

                        else if ( (LA16_0=='{') ) {s = 4;}

                        else if ( (LA16_0=='}') ) {s = 5;}

                        else if ( (LA16_0=='b') ) {s = 6;}

                        else if ( (LA16_0=='u') ) {s = 7;}

                        else if ( (LA16_0=='f') ) {s = 8;}

                        else if ( (LA16_0=='o') ) {s = 9;}

                        else if ( (LA16_0=='d') ) {s = 10;}

                        else if ( (LA16_0=='a') ) {s = 11;}

                        else if ( (LA16_0=='p') ) {s = 12;}

                        else if ( (LA16_0=='t') ) {s = 13;}

                        else if ( (LA16_0=='-') ) {s = 14;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 15;}

                        else if ( (LA16_0=='^') ) {s = 16;}

                        else if ( ((LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||LA16_0=='c'||LA16_0=='e'||(LA16_0>='h' && LA16_0<='n')||LA16_0=='q'||LA16_0=='s'||(LA16_0>='v' && LA16_0<='z')) ) {s = 17;}

                        else if ( (LA16_0=='\"') ) {s = 18;}

                        else if ( (LA16_0=='\'') ) {s = 19;}

                        else if ( (LA16_0=='/') ) {s = 20;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 21;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='!'||(LA16_0>='#' && LA16_0<='&')||(LA16_0>='(' && LA16_0<=',')||(LA16_0>=':' && LA16_0<='@')||(LA16_0>='[' && LA16_0<=']')||LA16_0=='`'||LA16_0=='|'||(LA16_0>='~' && LA16_0<='\uFFFF')) ) {s = 22;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_19 = input.LA(1);

                        s = -1;
                        if ( ((LA16_19>='\u0000' && LA16_19<='\uFFFF')) ) {s = 43;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}