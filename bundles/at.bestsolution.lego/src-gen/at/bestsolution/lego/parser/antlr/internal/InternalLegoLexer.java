package at.bestsolution.lego.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLegoLexer extends Lexer {
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int RULE_FLOAT=5;
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
    public String getGrammarFileName() { return "../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:11:7: ( '.' )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:11:9: '.'
            {
            match('.'); 

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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:12:7: ( '{' )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:12:9: '{'
            {
            match('{'); 

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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:13:7: ( '}' )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:13:9: '}'
            {
            match('}'); 

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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:14:7: ( 'mpart' )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:14:9: 'mpart'
            {
            match("mpart"); 


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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:15:7: ( 'rotate' )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:15:9: 'rotate'
            {
            match("rotate"); 


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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:16:7: ( 'x' )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:16:9: 'x'
            {
            match('x'); 

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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:17:7: ( 'y' )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:17:9: 'y'
            {
            match('y'); 

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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:18:7: ( 'z' )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:18:9: 'z'
            {
            match('z'); 

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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:19:7: ( 'duration' )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:19:9: 'duration'
            {
            match("duration"); 


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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:20:7: ( 'sound-file' )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:20:9: 'sound-file'
            {
            match("sound-file"); 


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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:21:7: ( 'rgb' )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:21:9: 'rgb'
            {
            match("rgb"); 


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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:22:7: ( 'brick' )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:22:9: 'brick'
            {
            match("brick"); 


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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:23:7: ( 'units' )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:23:9: 'units'
            {
            match("units"); 


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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:24:7: ( 'generated' )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:24:9: 'generated'
            {
            match("generated"); 


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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:25:7: ( 'box' )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:25:9: 'box'
            {
            match("box"); 


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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:26:7: ( 'origin' )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:26:9: 'origin'
            {
            match("origin"); 


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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:27:7: ( 'fxml' )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:27:9: 'fxml'
            {
            match("fxml"); 


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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:28:7: ( 'assembly' )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:28:9: 'assembly'
            {
            match("assembly"); 


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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:29:7: ( 'pos' )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:29:9: 'pos'
            {
            match("pos"); 


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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:30:7: ( 'transform' )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:30:9: 'transform'
            {
            match("transform"); 


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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:31:7: ( 'rotate180' )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:31:9: 'rotate180'
            {
            match("rotate180"); 


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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:32:7: ( 'rotate90' )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:32:9: 'rotate90'
            {
            match("rotate90"); 


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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:33:7: ( 'rotate270' )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:33:9: 'rotate270'
            {
            match("rotate270"); 


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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:34:7: ( 'actions' )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:34:9: 'actions'
            {
            match("actions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1604:10: ( ( '-' )? ( '0' .. '9' )+ )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1604:12: ( '-' )? ( '0' .. '9' )+
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1604:12: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1604:12: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1604:17: ( '0' .. '9' )+
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
            	    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1604:18: '0' .. '9'
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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1606:12: ( ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1606:14: ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )*
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1606:14: ( '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='-') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1606:14: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1606:19: ( '0' .. '9' )+
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
            	    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1606:20: '0' .. '9'
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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1606:35: ( '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1606:36: '0' .. '9'
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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1608:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1608:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1608:11: ( '^' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='^') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1608:11: '^'
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

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1608:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:
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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1610:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1610:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1610:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1610:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1610:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1610:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1610:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1610:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1610:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1610:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1610:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1612:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1612:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1612:24: ( options {greedy=false; } : . )*
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
            	    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1612:52: .
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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1614:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1614:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1614:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1614:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1614:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1614:41: ( '\\r' )? '\\n'
                    {
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1614:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1614:41: '\\r'
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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1616:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1616:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1616:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:
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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1618:16: ( . )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1618:18: .
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
        // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | RULE_INT | RULE_FLOAT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=32;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1:154: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 26 :
                // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1:163: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 27 :
                // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1:174: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 28 :
                // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1:182: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 29 :
                // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1:194: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 30 :
                // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1:210: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 31 :
                // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1:226: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 32 :
                // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1:234: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\4\uffff\2\40\1\43\1\44\1\45\12\40\1\33\1\63\1\33\1\uffff\3\33\5\uffff\1\40\1\uffff\2\40\3\uffff\14\40\1\63\6\uffff\2\40\1\112\3\40\1\116\6\40\1\125\3\40\1\uffff\3\40\1\uffff\3\40\1\137\2\40\1\uffff\1\40\1\143\3\40\1\147\1\150\2\40\1\uffff\3\40\1\uffff\1\161\1\40\3\uffff\1\40\1\164\6\40\1\uffff\2\40\1\uffff\1\40\1\176\2\40\1\u0081\1\40\1\u0083\1\40\1\u0085\1\uffff\1\40\1\u0087\1\uffff\1\u0088\1\uffff\1\u0089\1\uffff\1\u008a\4\uffff";
    static final String DFA16_eofS =
        "\u008b\uffff";
    static final String DFA16_minS =
        "\1\0\3\uffff\1\160\1\147\3\60\1\165\2\157\1\156\1\145\1\162\1\170\1\143\1\157\1\162\1\60\1\56\1\101\1\uffff\2\0\1\52\5\uffff\1\141\1\uffff\1\164\1\142\3\uffff\1\162\1\165\1\151\1\170\1\151\1\156\1\151\1\155\1\163\1\164\1\163\1\141\1\56\6\uffff\1\162\1\141\1\60\1\141\1\156\1\143\1\60\1\164\1\145\1\147\1\154\1\145\1\151\1\60\1\156\2\164\1\uffff\1\164\1\144\1\153\1\uffff\1\163\1\162\1\151\1\60\1\155\1\157\1\uffff\1\163\1\60\1\145\1\151\1\55\2\60\1\141\1\156\1\uffff\1\142\1\156\1\146\1\uffff\1\60\1\157\3\uffff\1\164\1\60\1\154\1\163\1\157\1\70\1\60\1\67\1\uffff\1\156\1\145\1\uffff\1\171\1\60\1\162\4\60\1\144\1\60\1\uffff\1\155\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\4\uffff";
    static final String DFA16_maxS =
        "\1\uffff\3\uffff\1\160\1\157\3\172\1\165\1\157\1\162\1\156\1\145\1\162\1\170\1\163\1\157\1\162\2\71\1\172\1\uffff\2\uffff\1\57\5\uffff\1\141\1\uffff\1\164\1\142\3\uffff\1\162\1\165\1\151\1\170\1\151\1\156\1\151\1\155\1\163\1\164\1\163\1\141\1\71\6\uffff\1\162\1\141\1\172\1\141\1\156\1\143\1\172\1\164\1\145\1\147\1\154\1\145\1\151\1\172\1\156\2\164\1\uffff\1\164\1\144\1\153\1\uffff\1\163\1\162\1\151\1\172\1\155\1\157\1\uffff\1\163\1\172\1\145\1\151\1\55\2\172\1\141\1\156\1\uffff\1\142\1\156\1\146\1\uffff\1\172\1\157\3\uffff\1\164\1\172\1\154\1\163\1\157\1\70\1\60\1\67\1\uffff\1\156\1\145\1\uffff\1\171\1\172\1\162\1\60\1\172\1\60\1\172\1\144\1\172\1\uffff\1\155\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\4\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\1\2\1\3\22\uffff\1\33\3\uffff\1\37\1\40\1\1\1\2\1\3\1\uffff\1\33\2\uffff\1\6\1\7\1\10\15\uffff\1\31\1\32\1\34\1\35\1\36\1\37\21\uffff\1\13\3\uffff\1\17\6\uffff\1\23\11\uffff\1\21\3\uffff\1\4\2\uffff\1\12\1\14\1\15\10\uffff\1\5\2\uffff\1\20\11\uffff\1\30\2\uffff\1\26\1\uffff\1\11\1\uffff\1\22\1\uffff\1\25\1\27\1\16\1\24";
    static final String DFA16_specialS =
        "\1\1\26\uffff\1\2\1\0\162\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\33\2\32\2\33\1\32\22\33\1\32\1\33\1\27\4\33\1\30\5\33\1\23\1\1\1\31\12\24\7\33\32\26\3\33\1\25\1\26\1\33\1\20\1\13\1\26\1\11\1\26\1\17\1\15\5\26\1\4\1\26\1\16\1\21\1\26\1\5\1\12\1\22\1\14\2\26\1\6\1\7\1\10\1\2\1\33\1\3\uff82\33",
            "",
            "",
            "",
            "\1\37",
            "\1\42\7\uffff\1\41",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\46",
            "\1\47",
            "\1\51\2\uffff\1\50",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\57\17\uffff\1\56",
            "\1\60",
            "\1\61",
            "\12\62",
            "\1\64\1\uffff\12\62",
            "\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\0\65",
            "\0\65",
            "\1\66\4\uffff\1\67",
            "",
            "",
            "",
            "",
            "",
            "\1\71",
            "",
            "\1\72",
            "\1\73",
            "",
            "",
            "",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\64\1\uffff\12\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\110",
            "\1\111",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\113",
            "\1\114",
            "\1\115",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\126",
            "\1\127",
            "\1\130",
            "",
            "\1\131",
            "\1\132",
            "\1\133",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\140",
            "\1\141",
            "",
            "\1\142",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\144",
            "\1\145",
            "\1\146",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\151",
            "\1\152",
            "",
            "\1\153",
            "\1\154",
            "\1\155",
            "",
            "\1\40\1\156\1\160\6\40\1\157\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\162",
            "",
            "",
            "",
            "\1\163",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "",
            "\1\173",
            "\1\174",
            "",
            "\1\175",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\177",
            "\1\u0080",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0082",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0084",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\u0086",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
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
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | RULE_INT | RULE_FLOAT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_24 = input.LA(1);

                        s = -1;
                        if ( ((LA16_24>='\u0000' && LA16_24<='\uFFFF')) ) {s = 53;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='.') ) {s = 1;}

                        else if ( (LA16_0=='{') ) {s = 2;}

                        else if ( (LA16_0=='}') ) {s = 3;}

                        else if ( (LA16_0=='m') ) {s = 4;}

                        else if ( (LA16_0=='r') ) {s = 5;}

                        else if ( (LA16_0=='x') ) {s = 6;}

                        else if ( (LA16_0=='y') ) {s = 7;}

                        else if ( (LA16_0=='z') ) {s = 8;}

                        else if ( (LA16_0=='d') ) {s = 9;}

                        else if ( (LA16_0=='s') ) {s = 10;}

                        else if ( (LA16_0=='b') ) {s = 11;}

                        else if ( (LA16_0=='u') ) {s = 12;}

                        else if ( (LA16_0=='g') ) {s = 13;}

                        else if ( (LA16_0=='o') ) {s = 14;}

                        else if ( (LA16_0=='f') ) {s = 15;}

                        else if ( (LA16_0=='a') ) {s = 16;}

                        else if ( (LA16_0=='p') ) {s = 17;}

                        else if ( (LA16_0=='t') ) {s = 18;}

                        else if ( (LA16_0=='-') ) {s = 19;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 20;}

                        else if ( (LA16_0=='^') ) {s = 21;}

                        else if ( ((LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||LA16_0=='c'||LA16_0=='e'||(LA16_0>='h' && LA16_0<='l')||LA16_0=='n'||LA16_0=='q'||(LA16_0>='v' && LA16_0<='w')) ) {s = 22;}

                        else if ( (LA16_0=='\"') ) {s = 23;}

                        else if ( (LA16_0=='\'') ) {s = 24;}

                        else if ( (LA16_0=='/') ) {s = 25;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 26;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='!'||(LA16_0>='#' && LA16_0<='&')||(LA16_0>='(' && LA16_0<=',')||(LA16_0>=':' && LA16_0<='@')||(LA16_0>='[' && LA16_0<=']')||LA16_0=='`'||LA16_0=='|'||(LA16_0>='~' && LA16_0<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_23 = input.LA(1);

                        s = -1;
                        if ( ((LA16_23>='\u0000' && LA16_23<='\uFFFF')) ) {s = 53;}

                        else s = 27;

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