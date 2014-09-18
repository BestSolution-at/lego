package at.bestsolution.lego.ui.contentassist.antlr.internal; 

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
import at.bestsolution.lego.services.LegoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalLegoParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'rotate180'", "'rotate90'", "'rotate270'", "'.'", "'{'", "'}'", "'mpart'", "'rgb'", "'brick'", "'units'", "'generated'", "'origin'", "'fxml'", "'assembly'", "'pos'", "'transform'", "'box'"
    };
    public static final int RULE_STRING=7;
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
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int RULE_FLOAT=6;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalLegoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLegoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLegoParser.tokenNames; }
    public String getGrammarFileName() { return "../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g"; }


     
     	private LegoGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(LegoGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:62:1: ( ruleModel EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:63:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel67);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:70:1: ruleModel : ( ( rule__Model__Alternatives ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:74:2: ( ( ( rule__Model__Alternatives ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:75:1: ( ( rule__Model__Alternatives ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:75:1: ( ( rule__Model__Alternatives ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:76:1: ( rule__Model__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getAlternatives()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:77:1: ( rule__Model__Alternatives )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:77:2: rule__Model__Alternatives
            {
            pushFollow(FOLLOW_rule__Model__Alternatives_in_ruleModel100);
            rule__Model__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getAlternatives()); 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleValidID"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:89:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:90:1: ( ruleValidID EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:91:1: ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID127);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidIDRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID134); if (state.failed) return ;

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:98:1: ruleValidID : ( RULE_ID ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:102:2: ( ( RULE_ID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:103:1: ( RULE_ID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:103:1: ( RULE_ID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:104:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID160); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
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
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleQualifiedName"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:117:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:118:1: ( ruleQualifiedName EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:119:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName186);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName193); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:126:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:130:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:131:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:131:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:132:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:133:1: ( rule__QualifiedName__Group__0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:133:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName219);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleItemRepository"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:145:1: entryRuleItemRepository : ruleItemRepository EOF ;
    public final void entryRuleItemRepository() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:146:1: ( ruleItemRepository EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:147:1: ruleItemRepository EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryRule()); 
            }
            pushFollow(FOLLOW_ruleItemRepository_in_entryRuleItemRepository246);
            ruleItemRepository();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemRepositoryRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleItemRepository253); if (state.failed) return ;

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
    // $ANTLR end "entryRuleItemRepository"


    // $ANTLR start "ruleItemRepository"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:154:1: ruleItemRepository : ( ( rule__ItemRepository__Group__0 ) ) ;
    public final void ruleItemRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:158:2: ( ( ( rule__ItemRepository__Group__0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:159:1: ( ( rule__ItemRepository__Group__0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:159:1: ( ( rule__ItemRepository__Group__0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:160:1: ( rule__ItemRepository__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getGroup()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:161:1: ( rule__ItemRepository__Group__0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:161:2: rule__ItemRepository__Group__0
            {
            pushFollow(FOLLOW_rule__ItemRepository__Group__0_in_ruleItemRepository279);
            rule__ItemRepository__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemRepositoryAccess().getGroup()); 
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
    // $ANTLR end "ruleItemRepository"


    // $ANTLR start "entryRuleMountedPart"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:177:1: entryRuleMountedPart : ruleMountedPart EOF ;
    public final void entryRuleMountedPart() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:178:1: ( ruleMountedPart EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:179:1: ruleMountedPart EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedPartRule()); 
            }
            pushFollow(FOLLOW_ruleMountedPart_in_entryRuleMountedPart310);
            ruleMountedPart();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMountedPartRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMountedPart317); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMountedPart"


    // $ANTLR start "ruleMountedPart"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:186:1: ruleMountedPart : ( ( rule__MountedPart__Group__0 ) ) ;
    public final void ruleMountedPart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:190:2: ( ( ( rule__MountedPart__Group__0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:191:1: ( ( rule__MountedPart__Group__0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:191:1: ( ( rule__MountedPart__Group__0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:192:1: ( rule__MountedPart__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedPartAccess().getGroup()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:193:1: ( rule__MountedPart__Group__0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:193:2: rule__MountedPart__Group__0
            {
            pushFollow(FOLLOW_rule__MountedPart__Group__0_in_ruleMountedPart343);
            rule__MountedPart__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMountedPartAccess().getGroup()); 
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
    // $ANTLR end "ruleMountedPart"


    // $ANTLR start "entryRuleRepostoryItem"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:205:1: entryRuleRepostoryItem : ruleRepostoryItem EOF ;
    public final void entryRuleRepostoryItem() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:206:1: ( ruleRepostoryItem EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:207:1: ruleRepostoryItem EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepostoryItemRule()); 
            }
            pushFollow(FOLLOW_ruleRepostoryItem_in_entryRuleRepostoryItem370);
            ruleRepostoryItem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepostoryItemRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepostoryItem377); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRepostoryItem"


    // $ANTLR start "ruleRepostoryItem"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:214:1: ruleRepostoryItem : ( ( rule__RepostoryItem__Alternatives ) ) ;
    public final void ruleRepostoryItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:218:2: ( ( ( rule__RepostoryItem__Alternatives ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:219:1: ( ( rule__RepostoryItem__Alternatives ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:219:1: ( ( rule__RepostoryItem__Alternatives ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:220:1: ( rule__RepostoryItem__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepostoryItemAccess().getAlternatives()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:221:1: ( rule__RepostoryItem__Alternatives )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:221:2: rule__RepostoryItem__Alternatives
            {
            pushFollow(FOLLOW_rule__RepostoryItem__Alternatives_in_ruleRepostoryItem403);
            rule__RepostoryItem__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepostoryItemAccess().getAlternatives()); 
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
    // $ANTLR end "ruleRepostoryItem"


    // $ANTLR start "entryRuleColor"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:233:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:234:1: ( ruleColor EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:235:1: ruleColor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorRule()); 
            }
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor430);
            ruleColor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor437); if (state.failed) return ;

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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:242:1: ruleColor : ( ( rule__Color__Group__0 ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:246:2: ( ( ( rule__Color__Group__0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:247:1: ( ( rule__Color__Group__0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:247:1: ( ( rule__Color__Group__0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:248:1: ( rule__Color__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getGroup()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:249:1: ( rule__Color__Group__0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:249:2: rule__Color__Group__0
            {
            pushFollow(FOLLOW_rule__Color__Group__0_in_ruleColor463);
            rule__Color__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorAccess().getGroup()); 
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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleXUnit"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:261:1: entryRuleXUnit : ruleXUnit EOF ;
    public final void entryRuleXUnit() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:262:1: ( ruleXUnit EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:263:1: ruleXUnit EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXUnitRule()); 
            }
            pushFollow(FOLLOW_ruleXUnit_in_entryRuleXUnit490);
            ruleXUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXUnitRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnit497); if (state.failed) return ;

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
    // $ANTLR end "entryRuleXUnit"


    // $ANTLR start "ruleXUnit"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:270:1: ruleXUnit : ( ( rule__XUnit__UnitsAssignment ) ) ;
    public final void ruleXUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:274:2: ( ( ( rule__XUnit__UnitsAssignment ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:275:1: ( ( rule__XUnit__UnitsAssignment ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:275:1: ( ( rule__XUnit__UnitsAssignment ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:276:1: ( rule__XUnit__UnitsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXUnitAccess().getUnitsAssignment()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:277:1: ( rule__XUnit__UnitsAssignment )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:277:2: rule__XUnit__UnitsAssignment
            {
            pushFollow(FOLLOW_rule__XUnit__UnitsAssignment_in_ruleXUnit523);
            rule__XUnit__UnitsAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXUnitAccess().getUnitsAssignment()); 
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
    // $ANTLR end "ruleXUnit"


    // $ANTLR start "entryRuleYUnit"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:289:1: entryRuleYUnit : ruleYUnit EOF ;
    public final void entryRuleYUnit() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:290:1: ( ruleYUnit EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:291:1: ruleYUnit EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYUnitRule()); 
            }
            pushFollow(FOLLOW_ruleYUnit_in_entryRuleYUnit550);
            ruleYUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYUnitRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleYUnit557); if (state.failed) return ;

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
    // $ANTLR end "entryRuleYUnit"


    // $ANTLR start "ruleYUnit"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:298:1: ruleYUnit : ( ( rule__YUnit__UnitsAssignment ) ) ;
    public final void ruleYUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:302:2: ( ( ( rule__YUnit__UnitsAssignment ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:303:1: ( ( rule__YUnit__UnitsAssignment ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:303:1: ( ( rule__YUnit__UnitsAssignment ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:304:1: ( rule__YUnit__UnitsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYUnitAccess().getUnitsAssignment()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:305:1: ( rule__YUnit__UnitsAssignment )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:305:2: rule__YUnit__UnitsAssignment
            {
            pushFollow(FOLLOW_rule__YUnit__UnitsAssignment_in_ruleYUnit583);
            rule__YUnit__UnitsAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYUnitAccess().getUnitsAssignment()); 
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
    // $ANTLR end "ruleYUnit"


    // $ANTLR start "entryRuleZUnit"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:317:1: entryRuleZUnit : ruleZUnit EOF ;
    public final void entryRuleZUnit() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:318:1: ( ruleZUnit EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:319:1: ruleZUnit EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getZUnitRule()); 
            }
            pushFollow(FOLLOW_ruleZUnit_in_entryRuleZUnit610);
            ruleZUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getZUnitRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleZUnit617); if (state.failed) return ;

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
    // $ANTLR end "entryRuleZUnit"


    // $ANTLR start "ruleZUnit"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:326:1: ruleZUnit : ( ( rule__ZUnit__UnitsAssignment ) ) ;
    public final void ruleZUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:330:2: ( ( ( rule__ZUnit__UnitsAssignment ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:331:1: ( ( rule__ZUnit__UnitsAssignment ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:331:1: ( ( rule__ZUnit__UnitsAssignment ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:332:1: ( rule__ZUnit__UnitsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getZUnitAccess().getUnitsAssignment()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:333:1: ( rule__ZUnit__UnitsAssignment )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:333:2: rule__ZUnit__UnitsAssignment
            {
            pushFollow(FOLLOW_rule__ZUnit__UnitsAssignment_in_ruleZUnit643);
            rule__ZUnit__UnitsAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getZUnitAccess().getUnitsAssignment()); 
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
    // $ANTLR end "ruleZUnit"


    // $ANTLR start "entryRuleBrick"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:345:1: entryRuleBrick : ruleBrick EOF ;
    public final void entryRuleBrick() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:346:1: ( ruleBrick EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:347:1: ruleBrick EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickRule()); 
            }
            pushFollow(FOLLOW_ruleBrick_in_entryRuleBrick670);
            ruleBrick();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBrickRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBrick677); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBrick"


    // $ANTLR start "ruleBrick"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:354:1: ruleBrick : ( ( rule__Brick__Group__0 ) ) ;
    public final void ruleBrick() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:358:2: ( ( ( rule__Brick__Group__0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:359:1: ( ( rule__Brick__Group__0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:359:1: ( ( rule__Brick__Group__0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:360:1: ( rule__Brick__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getGroup()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:361:1: ( rule__Brick__Group__0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:361:2: rule__Brick__Group__0
            {
            pushFollow(FOLLOW_rule__Brick__Group__0_in_ruleBrick703);
            rule__Brick__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBrickAccess().getGroup()); 
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
    // $ANTLR end "ruleBrick"


    // $ANTLR start "entryRuleSource"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:373:1: entryRuleSource : ruleSource EOF ;
    public final void entryRuleSource() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:374:1: ( ruleSource EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:375:1: ruleSource EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceRule()); 
            }
            pushFollow(FOLLOW_ruleSource_in_entryRuleSource730);
            ruleSource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSource737); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSource"


    // $ANTLR start "ruleSource"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:382:1: ruleSource : ( ( rule__Source__Alternatives ) ) ;
    public final void ruleSource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:386:2: ( ( ( rule__Source__Alternatives ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:387:1: ( ( rule__Source__Alternatives ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:387:1: ( ( rule__Source__Alternatives ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:388:1: ( rule__Source__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceAccess().getAlternatives()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:389:1: ( rule__Source__Alternatives )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:389:2: rule__Source__Alternatives
            {
            pushFollow(FOLLOW_rule__Source__Alternatives_in_ruleSource763);
            rule__Source__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceAccess().getAlternatives()); 
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
    // $ANTLR end "ruleSource"


    // $ANTLR start "entryRuleGenerated"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:401:1: entryRuleGenerated : ruleGenerated EOF ;
    public final void entryRuleGenerated() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:402:1: ( ruleGenerated EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:403:1: ruleGenerated EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedRule()); 
            }
            pushFollow(FOLLOW_ruleGenerated_in_entryRuleGenerated790);
            ruleGenerated();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratedRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenerated797); if (state.failed) return ;

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
    // $ANTLR end "entryRuleGenerated"


    // $ANTLR start "ruleGenerated"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:410:1: ruleGenerated : ( ( rule__Generated__Group__0 ) ) ;
    public final void ruleGenerated() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:414:2: ( ( ( rule__Generated__Group__0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:415:1: ( ( rule__Generated__Group__0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:415:1: ( ( rule__Generated__Group__0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:416:1: ( rule__Generated__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getGroup()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:417:1: ( rule__Generated__Group__0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:417:2: rule__Generated__Group__0
            {
            pushFollow(FOLLOW_rule__Generated__Group__0_in_ruleGenerated823);
            rule__Generated__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratedAccess().getGroup()); 
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
    // $ANTLR end "ruleGenerated"


    // $ANTLR start "entryRuleFxmlInclude"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:429:1: entryRuleFxmlInclude : ruleFxmlInclude EOF ;
    public final void entryRuleFxmlInclude() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:430:1: ( ruleFxmlInclude EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:431:1: ruleFxmlInclude EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeRule()); 
            }
            pushFollow(FOLLOW_ruleFxmlInclude_in_entryRuleFxmlInclude850);
            ruleFxmlInclude();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFxmlIncludeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFxmlInclude857); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFxmlInclude"


    // $ANTLR start "ruleFxmlInclude"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:438:1: ruleFxmlInclude : ( ( rule__FxmlInclude__Group__0 ) ) ;
    public final void ruleFxmlInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:442:2: ( ( ( rule__FxmlInclude__Group__0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:443:1: ( ( rule__FxmlInclude__Group__0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:443:1: ( ( rule__FxmlInclude__Group__0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:444:1: ( rule__FxmlInclude__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getGroup()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:445:1: ( rule__FxmlInclude__Group__0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:445:2: rule__FxmlInclude__Group__0
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group__0_in_ruleFxmlInclude883);
            rule__FxmlInclude__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFxmlIncludeAccess().getGroup()); 
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
    // $ANTLR end "ruleFxmlInclude"


    // $ANTLR start "entryRuleAssembly"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:457:1: entryRuleAssembly : ruleAssembly EOF ;
    public final void entryRuleAssembly() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:458:1: ( ruleAssembly EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:459:1: ruleAssembly EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyRule()); 
            }
            pushFollow(FOLLOW_ruleAssembly_in_entryRuleAssembly910);
            ruleAssembly();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssembly917); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAssembly"


    // $ANTLR start "ruleAssembly"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:466:1: ruleAssembly : ( ( rule__Assembly__Group__0 ) ) ;
    public final void ruleAssembly() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:470:2: ( ( ( rule__Assembly__Group__0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:471:1: ( ( rule__Assembly__Group__0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:471:1: ( ( rule__Assembly__Group__0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:472:1: ( rule__Assembly__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getGroup()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:473:1: ( rule__Assembly__Group__0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:473:2: rule__Assembly__Group__0
            {
            pushFollow(FOLLOW_rule__Assembly__Group__0_in_ruleAssembly943);
            rule__Assembly__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyAccess().getGroup()); 
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
    // $ANTLR end "ruleAssembly"


    // $ANTLR start "entryRuleAssemblyItem"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:485:1: entryRuleAssemblyItem : ruleAssemblyItem EOF ;
    public final void entryRuleAssemblyItem() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:486:1: ( ruleAssemblyItem EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:487:1: ruleAssemblyItem EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemRule()); 
            }
            pushFollow(FOLLOW_ruleAssemblyItem_in_entryRuleAssemblyItem970);
            ruleAssemblyItem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyItemRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssemblyItem977); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAssemblyItem"


    // $ANTLR start "ruleAssemblyItem"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:494:1: ruleAssemblyItem : ( ( rule__AssemblyItem__Alternatives ) ) ;
    public final void ruleAssemblyItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:498:2: ( ( ( rule__AssemblyItem__Alternatives ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:499:1: ( ( rule__AssemblyItem__Alternatives ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:499:1: ( ( rule__AssemblyItem__Alternatives ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:500:1: ( rule__AssemblyItem__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getAlternatives()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:501:1: ( rule__AssemblyItem__Alternatives )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:501:2: rule__AssemblyItem__Alternatives
            {
            pushFollow(FOLLOW_rule__AssemblyItem__Alternatives_in_ruleAssemblyItem1003);
            rule__AssemblyItem__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyItemAccess().getAlternatives()); 
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
    // $ANTLR end "ruleAssemblyItem"


    // $ANTLR start "entryRuleRasterAssemblyItem"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:513:1: entryRuleRasterAssemblyItem : ruleRasterAssemblyItem EOF ;
    public final void entryRuleRasterAssemblyItem() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:514:1: ( ruleRasterAssemblyItem EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:515:1: ruleRasterAssemblyItem EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRasterAssemblyItemRule()); 
            }
            pushFollow(FOLLOW_ruleRasterAssemblyItem_in_entryRuleRasterAssemblyItem1030);
            ruleRasterAssemblyItem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRasterAssemblyItemRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRasterAssemblyItem1037); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRasterAssemblyItem"


    // $ANTLR start "ruleRasterAssemblyItem"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:522:1: ruleRasterAssemblyItem : ( ( rule__RasterAssemblyItem__Group__0 ) ) ;
    public final void ruleRasterAssemblyItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:526:2: ( ( ( rule__RasterAssemblyItem__Group__0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:527:1: ( ( rule__RasterAssemblyItem__Group__0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:527:1: ( ( rule__RasterAssemblyItem__Group__0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:528:1: ( rule__RasterAssemblyItem__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRasterAssemblyItemAccess().getGroup()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:529:1: ( rule__RasterAssemblyItem__Group__0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:529:2: rule__RasterAssemblyItem__Group__0
            {
            pushFollow(FOLLOW_rule__RasterAssemblyItem__Group__0_in_ruleRasterAssemblyItem1063);
            rule__RasterAssemblyItem__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRasterAssemblyItemAccess().getGroup()); 
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
    // $ANTLR end "ruleRasterAssemblyItem"


    // $ANTLR start "entryRuleMountedAssemblyItem"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:541:1: entryRuleMountedAssemblyItem : ruleMountedAssemblyItem EOF ;
    public final void entryRuleMountedAssemblyItem() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:542:1: ( ruleMountedAssemblyItem EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:543:1: ruleMountedAssemblyItem EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemRule()); 
            }
            pushFollow(FOLLOW_ruleMountedAssemblyItem_in_entryRuleMountedAssemblyItem1090);
            ruleMountedAssemblyItem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMountedAssemblyItemRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMountedAssemblyItem1097); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMountedAssemblyItem"


    // $ANTLR start "ruleMountedAssemblyItem"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:550:1: ruleMountedAssemblyItem : ( ( rule__MountedAssemblyItem__Group__0 ) ) ;
    public final void ruleMountedAssemblyItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:554:2: ( ( ( rule__MountedAssemblyItem__Group__0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:555:1: ( ( rule__MountedAssemblyItem__Group__0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:555:1: ( ( rule__MountedAssemblyItem__Group__0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:556:1: ( rule__MountedAssemblyItem__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getGroup()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:557:1: ( rule__MountedAssemblyItem__Group__0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:557:2: rule__MountedAssemblyItem__Group__0
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group__0_in_ruleMountedAssemblyItem1123);
            rule__MountedAssemblyItem__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMountedAssemblyItemAccess().getGroup()); 
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
    // $ANTLR end "ruleMountedAssemblyItem"


    // $ANTLR start "rule__Model__Alternatives"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:569:1: rule__Model__Alternatives : ( ( ( rule__Model__RepoAssignment_0 ) ) | ( ( rule__Model__AssemblyAssignment_1 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:573:1: ( ( ( rule__Model__RepoAssignment_0 ) ) | ( ( rule__Model__AssemblyAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==25) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:574:1: ( ( rule__Model__RepoAssignment_0 ) )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:574:1: ( ( rule__Model__RepoAssignment_0 ) )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:575:1: ( rule__Model__RepoAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getRepoAssignment_0()); 
                    }
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:576:1: ( rule__Model__RepoAssignment_0 )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:576:2: rule__Model__RepoAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Model__RepoAssignment_0_in_rule__Model__Alternatives1159);
                    rule__Model__RepoAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getRepoAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:580:6: ( ( rule__Model__AssemblyAssignment_1 ) )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:580:6: ( ( rule__Model__AssemblyAssignment_1 ) )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:581:1: ( rule__Model__AssemblyAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getAssemblyAssignment_1()); 
                    }
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:582:1: ( rule__Model__AssemblyAssignment_1 )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:582:2: rule__Model__AssemblyAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__AssemblyAssignment_1_in_rule__Model__Alternatives1177);
                    rule__Model__AssemblyAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getAssemblyAssignment_1()); 
                    }

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
    // $ANTLR end "rule__Model__Alternatives"


    // $ANTLR start "rule__RepostoryItem__Alternatives"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:593:1: rule__RepostoryItem__Alternatives : ( ( ruleBrick ) | ( ruleMountedPart ) );
    public final void rule__RepostoryItem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:597:1: ( ( ruleBrick ) | ( ruleMountedPart ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            else if ( (LA2_0==18) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:598:1: ( ruleBrick )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:598:1: ( ruleBrick )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:599:1: ruleBrick
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepostoryItemAccess().getBrickParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleBrick_in_rule__RepostoryItem__Alternatives1212);
                    ruleBrick();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRepostoryItemAccess().getBrickParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:604:6: ( ruleMountedPart )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:604:6: ( ruleMountedPart )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:605:1: ruleMountedPart
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepostoryItemAccess().getMountedPartParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleMountedPart_in_rule__RepostoryItem__Alternatives1229);
                    ruleMountedPart();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRepostoryItemAccess().getMountedPartParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__RepostoryItem__Alternatives"


    // $ANTLR start "rule__Source__Alternatives"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:615:1: rule__Source__Alternatives : ( ( ruleGenerated ) | ( ruleFxmlInclude ) );
    public final void rule__Source__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:619:1: ( ( ruleGenerated ) | ( ruleFxmlInclude ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            else if ( (LA3_0==24) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:620:1: ( ruleGenerated )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:620:1: ( ruleGenerated )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:621:1: ruleGenerated
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSourceAccess().getGeneratedParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleGenerated_in_rule__Source__Alternatives1261);
                    ruleGenerated();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSourceAccess().getGeneratedParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:626:6: ( ruleFxmlInclude )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:626:6: ( ruleFxmlInclude )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:627:1: ruleFxmlInclude
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSourceAccess().getFxmlIncludeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleFxmlInclude_in_rule__Source__Alternatives1278);
                    ruleFxmlInclude();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSourceAccess().getFxmlIncludeParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__Source__Alternatives"


    // $ANTLR start "rule__AssemblyItem__Alternatives"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:637:1: rule__AssemblyItem__Alternatives : ( ( ruleRasterAssemblyItem ) | ( ruleMountedAssemblyItem ) );
    public final void rule__AssemblyItem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:641:1: ( ( ruleRasterAssemblyItem ) | ( ruleMountedAssemblyItem ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:642:1: ( ruleRasterAssemblyItem )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:642:1: ( ruleRasterAssemblyItem )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:643:1: ruleRasterAssemblyItem
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssemblyItemAccess().getRasterAssemblyItemParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleRasterAssemblyItem_in_rule__AssemblyItem__Alternatives1310);
                    ruleRasterAssemblyItem();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssemblyItemAccess().getRasterAssemblyItemParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:648:6: ( ruleMountedAssemblyItem )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:648:6: ( ruleMountedAssemblyItem )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:649:1: ruleMountedAssemblyItem
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssemblyItemAccess().getMountedAssemblyItemParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleMountedAssemblyItem_in_rule__AssemblyItem__Alternatives1327);
                    ruleMountedAssemblyItem();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssemblyItemAccess().getMountedAssemblyItemParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__AssemblyItem__Alternatives"


    // $ANTLR start "rule__RasterAssemblyItem__TransformAlternatives_5_1_0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:659:1: rule__RasterAssemblyItem__TransformAlternatives_5_1_0 : ( ( 'rotate180' ) | ( 'rotate90' ) | ( 'rotate270' ) );
    public final void rule__RasterAssemblyItem__TransformAlternatives_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:663:1: ( ( 'rotate180' ) | ( 'rotate90' ) | ( 'rotate270' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt5=1;
                }
                break;
            case 13:
                {
                alt5=2;
                }
                break;
            case 14:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:664:1: ( 'rotate180' )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:664:1: ( 'rotate180' )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:665:1: 'rotate180'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRasterAssemblyItemAccess().getTransformRotate180Keyword_5_1_0_0()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__RasterAssemblyItem__TransformAlternatives_5_1_01360); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRasterAssemblyItemAccess().getTransformRotate180Keyword_5_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:672:6: ( 'rotate90' )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:672:6: ( 'rotate90' )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:673:1: 'rotate90'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRasterAssemblyItemAccess().getTransformRotate90Keyword_5_1_0_1()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__RasterAssemblyItem__TransformAlternatives_5_1_01380); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRasterAssemblyItemAccess().getTransformRotate90Keyword_5_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:680:6: ( 'rotate270' )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:680:6: ( 'rotate270' )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:681:1: 'rotate270'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRasterAssemblyItemAccess().getTransformRotate270Keyword_5_1_0_2()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__RasterAssemblyItem__TransformAlternatives_5_1_01400); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRasterAssemblyItemAccess().getTransformRotate270Keyword_5_1_0_2()); 
                    }

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
    // $ANTLR end "rule__RasterAssemblyItem__TransformAlternatives_5_1_0"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:695:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:699:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:700:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01432);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01435);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:707:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:711:1: ( ( ruleValidID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:712:1: ( ruleValidID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:712:1: ( ruleValidID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:713:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl1462);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:724:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:728:1: ( rule__QualifiedName__Group__1__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:729:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11491);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:735:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:739:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:740:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:740:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:741:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:742:1: ( rule__QualifiedName__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:742:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1518);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:756:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:760:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:761:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01553);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01556);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:768:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:772:1: ( ( ( '.' ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:773:1: ( ( '.' ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:773:1: ( ( '.' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:774:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:775:1: ( '.' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:776:2: '.'
            {
            match(input,15,FOLLOW_15_in_rule__QualifiedName__Group_1__0__Impl1585); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:787:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:791:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:792:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11617);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:798:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:802:1: ( ( ruleValidID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:803:1: ( ruleValidID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:803:1: ( ruleValidID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:804:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl1644);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__ItemRepository__Group__0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:819:1: rule__ItemRepository__Group__0 : rule__ItemRepository__Group__0__Impl rule__ItemRepository__Group__1 ;
    public final void rule__ItemRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:823:1: ( rule__ItemRepository__Group__0__Impl rule__ItemRepository__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:824:2: rule__ItemRepository__Group__0__Impl rule__ItemRepository__Group__1
            {
            pushFollow(FOLLOW_rule__ItemRepository__Group__0__Impl_in_rule__ItemRepository__Group__01677);
            rule__ItemRepository__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ItemRepository__Group__1_in_rule__ItemRepository__Group__01680);
            rule__ItemRepository__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ItemRepository__Group__0"


    // $ANTLR start "rule__ItemRepository__Group__0__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:831:1: rule__ItemRepository__Group__0__Impl : ( ( rule__ItemRepository__NameAssignment_0 ) ) ;
    public final void rule__ItemRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:835:1: ( ( ( rule__ItemRepository__NameAssignment_0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:836:1: ( ( rule__ItemRepository__NameAssignment_0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:836:1: ( ( rule__ItemRepository__NameAssignment_0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:837:1: ( rule__ItemRepository__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getNameAssignment_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:838:1: ( rule__ItemRepository__NameAssignment_0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:838:2: rule__ItemRepository__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ItemRepository__NameAssignment_0_in_rule__ItemRepository__Group__0__Impl1707);
            rule__ItemRepository__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemRepositoryAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__ItemRepository__Group__0__Impl"


    // $ANTLR start "rule__ItemRepository__Group__1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:848:1: rule__ItemRepository__Group__1 : rule__ItemRepository__Group__1__Impl rule__ItemRepository__Group__2 ;
    public final void rule__ItemRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:852:1: ( rule__ItemRepository__Group__1__Impl rule__ItemRepository__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:853:2: rule__ItemRepository__Group__1__Impl rule__ItemRepository__Group__2
            {
            pushFollow(FOLLOW_rule__ItemRepository__Group__1__Impl_in_rule__ItemRepository__Group__11737);
            rule__ItemRepository__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ItemRepository__Group__2_in_rule__ItemRepository__Group__11740);
            rule__ItemRepository__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ItemRepository__Group__1"


    // $ANTLR start "rule__ItemRepository__Group__1__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:860:1: rule__ItemRepository__Group__1__Impl : ( '{' ) ;
    public final void rule__ItemRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:864:1: ( ( '{' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:865:1: ( '{' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:865:1: ( '{' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:866:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__ItemRepository__Group__1__Impl1768); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemRepositoryAccess().getLeftCurlyBracketKeyword_1()); 
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
    // $ANTLR end "rule__ItemRepository__Group__1__Impl"


    // $ANTLR start "rule__ItemRepository__Group__2"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:879:1: rule__ItemRepository__Group__2 : rule__ItemRepository__Group__2__Impl rule__ItemRepository__Group__3 ;
    public final void rule__ItemRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:883:1: ( rule__ItemRepository__Group__2__Impl rule__ItemRepository__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:884:2: rule__ItemRepository__Group__2__Impl rule__ItemRepository__Group__3
            {
            pushFollow(FOLLOW_rule__ItemRepository__Group__2__Impl_in_rule__ItemRepository__Group__21799);
            rule__ItemRepository__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ItemRepository__Group__3_in_rule__ItemRepository__Group__21802);
            rule__ItemRepository__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ItemRepository__Group__2"


    // $ANTLR start "rule__ItemRepository__Group__2__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:891:1: rule__ItemRepository__Group__2__Impl : ( ( ( rule__ItemRepository__ElementListAssignment_2 ) ) ( ( rule__ItemRepository__ElementListAssignment_2 )* ) ) ;
    public final void rule__ItemRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:895:1: ( ( ( ( rule__ItemRepository__ElementListAssignment_2 ) ) ( ( rule__ItemRepository__ElementListAssignment_2 )* ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:896:1: ( ( ( rule__ItemRepository__ElementListAssignment_2 ) ) ( ( rule__ItemRepository__ElementListAssignment_2 )* ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:896:1: ( ( ( rule__ItemRepository__ElementListAssignment_2 ) ) ( ( rule__ItemRepository__ElementListAssignment_2 )* ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:897:1: ( ( rule__ItemRepository__ElementListAssignment_2 ) ) ( ( rule__ItemRepository__ElementListAssignment_2 )* )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:897:1: ( ( rule__ItemRepository__ElementListAssignment_2 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:898:1: ( rule__ItemRepository__ElementListAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getElementListAssignment_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:899:1: ( rule__ItemRepository__ElementListAssignment_2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:899:2: rule__ItemRepository__ElementListAssignment_2
            {
            pushFollow(FOLLOW_rule__ItemRepository__ElementListAssignment_2_in_rule__ItemRepository__Group__2__Impl1831);
            rule__ItemRepository__ElementListAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemRepositoryAccess().getElementListAssignment_2()); 
            }

            }

            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:902:1: ( ( rule__ItemRepository__ElementListAssignment_2 )* )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:903:1: ( rule__ItemRepository__ElementListAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getElementListAssignment_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:904:1: ( rule__ItemRepository__ElementListAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18||LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:904:2: rule__ItemRepository__ElementListAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ItemRepository__ElementListAssignment_2_in_rule__ItemRepository__Group__2__Impl1843);
            	    rule__ItemRepository__ElementListAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemRepositoryAccess().getElementListAssignment_2()); 
            }

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
    // $ANTLR end "rule__ItemRepository__Group__2__Impl"


    // $ANTLR start "rule__ItemRepository__Group__3"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:915:1: rule__ItemRepository__Group__3 : rule__ItemRepository__Group__3__Impl ;
    public final void rule__ItemRepository__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:919:1: ( rule__ItemRepository__Group__3__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:920:2: rule__ItemRepository__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ItemRepository__Group__3__Impl_in_rule__ItemRepository__Group__31876);
            rule__ItemRepository__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ItemRepository__Group__3"


    // $ANTLR start "rule__ItemRepository__Group__3__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:926:1: rule__ItemRepository__Group__3__Impl : ( '}' ) ;
    public final void rule__ItemRepository__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:930:1: ( ( '}' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:931:1: ( '}' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:931:1: ( '}' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:932:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,17,FOLLOW_17_in_rule__ItemRepository__Group__3__Impl1904); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemRepositoryAccess().getRightCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__ItemRepository__Group__3__Impl"


    // $ANTLR start "rule__MountedPart__Group__0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:953:1: rule__MountedPart__Group__0 : rule__MountedPart__Group__0__Impl rule__MountedPart__Group__1 ;
    public final void rule__MountedPart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:957:1: ( rule__MountedPart__Group__0__Impl rule__MountedPart__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:958:2: rule__MountedPart__Group__0__Impl rule__MountedPart__Group__1
            {
            pushFollow(FOLLOW_rule__MountedPart__Group__0__Impl_in_rule__MountedPart__Group__01943);
            rule__MountedPart__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MountedPart__Group__1_in_rule__MountedPart__Group__01946);
            rule__MountedPart__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MountedPart__Group__0"


    // $ANTLR start "rule__MountedPart__Group__0__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:965:1: rule__MountedPart__Group__0__Impl : ( 'mpart' ) ;
    public final void rule__MountedPart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:969:1: ( ( 'mpart' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:970:1: ( 'mpart' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:970:1: ( 'mpart' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:971:1: 'mpart'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedPartAccess().getMpartKeyword_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__MountedPart__Group__0__Impl1974); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMountedPartAccess().getMpartKeyword_0()); 
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
    // $ANTLR end "rule__MountedPart__Group__0__Impl"


    // $ANTLR start "rule__MountedPart__Group__1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:984:1: rule__MountedPart__Group__1 : rule__MountedPart__Group__1__Impl rule__MountedPart__Group__2 ;
    public final void rule__MountedPart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:988:1: ( rule__MountedPart__Group__1__Impl rule__MountedPart__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:989:2: rule__MountedPart__Group__1__Impl rule__MountedPart__Group__2
            {
            pushFollow(FOLLOW_rule__MountedPart__Group__1__Impl_in_rule__MountedPart__Group__12005);
            rule__MountedPart__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MountedPart__Group__2_in_rule__MountedPart__Group__12008);
            rule__MountedPart__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MountedPart__Group__1"


    // $ANTLR start "rule__MountedPart__Group__1__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:996:1: rule__MountedPart__Group__1__Impl : ( ( rule__MountedPart__NameAssignment_1 ) ) ;
    public final void rule__MountedPart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1000:1: ( ( ( rule__MountedPart__NameAssignment_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1001:1: ( ( rule__MountedPart__NameAssignment_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1001:1: ( ( rule__MountedPart__NameAssignment_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1002:1: ( rule__MountedPart__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedPartAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1003:1: ( rule__MountedPart__NameAssignment_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1003:2: rule__MountedPart__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MountedPart__NameAssignment_1_in_rule__MountedPart__Group__1__Impl2035);
            rule__MountedPart__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMountedPartAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__MountedPart__Group__1__Impl"


    // $ANTLR start "rule__MountedPart__Group__2"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1013:1: rule__MountedPart__Group__2 : rule__MountedPart__Group__2__Impl rule__MountedPart__Group__3 ;
    public final void rule__MountedPart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1017:1: ( rule__MountedPart__Group__2__Impl rule__MountedPart__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1018:2: rule__MountedPart__Group__2__Impl rule__MountedPart__Group__3
            {
            pushFollow(FOLLOW_rule__MountedPart__Group__2__Impl_in_rule__MountedPart__Group__22065);
            rule__MountedPart__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MountedPart__Group__3_in_rule__MountedPart__Group__22068);
            rule__MountedPart__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MountedPart__Group__2"


    // $ANTLR start "rule__MountedPart__Group__2__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1025:1: rule__MountedPart__Group__2__Impl : ( ( rule__MountedPart__FillAssignment_2 ) ) ;
    public final void rule__MountedPart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1029:1: ( ( ( rule__MountedPart__FillAssignment_2 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1030:1: ( ( rule__MountedPart__FillAssignment_2 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1030:1: ( ( rule__MountedPart__FillAssignment_2 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1031:1: ( rule__MountedPart__FillAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedPartAccess().getFillAssignment_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1032:1: ( rule__MountedPart__FillAssignment_2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1032:2: rule__MountedPart__FillAssignment_2
            {
            pushFollow(FOLLOW_rule__MountedPart__FillAssignment_2_in_rule__MountedPart__Group__2__Impl2095);
            rule__MountedPart__FillAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMountedPartAccess().getFillAssignment_2()); 
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
    // $ANTLR end "rule__MountedPart__Group__2__Impl"


    // $ANTLR start "rule__MountedPart__Group__3"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1042:1: rule__MountedPart__Group__3 : rule__MountedPart__Group__3__Impl ;
    public final void rule__MountedPart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1046:1: ( rule__MountedPart__Group__3__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1047:2: rule__MountedPart__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MountedPart__Group__3__Impl_in_rule__MountedPart__Group__32125);
            rule__MountedPart__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MountedPart__Group__3"


    // $ANTLR start "rule__MountedPart__Group__3__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1053:1: rule__MountedPart__Group__3__Impl : ( ( rule__MountedPart__SourceAssignment_3 ) ) ;
    public final void rule__MountedPart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1057:1: ( ( ( rule__MountedPart__SourceAssignment_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1058:1: ( ( rule__MountedPart__SourceAssignment_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1058:1: ( ( rule__MountedPart__SourceAssignment_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1059:1: ( rule__MountedPart__SourceAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedPartAccess().getSourceAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1060:1: ( rule__MountedPart__SourceAssignment_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1060:2: rule__MountedPart__SourceAssignment_3
            {
            pushFollow(FOLLOW_rule__MountedPart__SourceAssignment_3_in_rule__MountedPart__Group__3__Impl2152);
            rule__MountedPart__SourceAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMountedPartAccess().getSourceAssignment_3()); 
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
    // $ANTLR end "rule__MountedPart__Group__3__Impl"


    // $ANTLR start "rule__Color__Group__0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1078:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1082:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1083:2: rule__Color__Group__0__Impl rule__Color__Group__1
            {
            pushFollow(FOLLOW_rule__Color__Group__0__Impl_in_rule__Color__Group__02190);
            rule__Color__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Color__Group__1_in_rule__Color__Group__02193);
            rule__Color__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Color__Group__0"


    // $ANTLR start "rule__Color__Group__0__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1090:1: rule__Color__Group__0__Impl : ( 'rgb' ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1094:1: ( ( 'rgb' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1095:1: ( 'rgb' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1095:1: ( 'rgb' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1096:1: 'rgb'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getRgbKeyword_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__Color__Group__0__Impl2221); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorAccess().getRgbKeyword_0()); 
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
    // $ANTLR end "rule__Color__Group__0__Impl"


    // $ANTLR start "rule__Color__Group__1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1109:1: rule__Color__Group__1 : rule__Color__Group__1__Impl rule__Color__Group__2 ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1113:1: ( rule__Color__Group__1__Impl rule__Color__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1114:2: rule__Color__Group__1__Impl rule__Color__Group__2
            {
            pushFollow(FOLLOW_rule__Color__Group__1__Impl_in_rule__Color__Group__12252);
            rule__Color__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Color__Group__2_in_rule__Color__Group__12255);
            rule__Color__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Color__Group__1"


    // $ANTLR start "rule__Color__Group__1__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1121:1: rule__Color__Group__1__Impl : ( ( rule__Color__RAssignment_1 ) ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1125:1: ( ( ( rule__Color__RAssignment_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1126:1: ( ( rule__Color__RAssignment_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1126:1: ( ( rule__Color__RAssignment_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1127:1: ( rule__Color__RAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getRAssignment_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1128:1: ( rule__Color__RAssignment_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1128:2: rule__Color__RAssignment_1
            {
            pushFollow(FOLLOW_rule__Color__RAssignment_1_in_rule__Color__Group__1__Impl2282);
            rule__Color__RAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorAccess().getRAssignment_1()); 
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
    // $ANTLR end "rule__Color__Group__1__Impl"


    // $ANTLR start "rule__Color__Group__2"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1138:1: rule__Color__Group__2 : rule__Color__Group__2__Impl rule__Color__Group__3 ;
    public final void rule__Color__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1142:1: ( rule__Color__Group__2__Impl rule__Color__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1143:2: rule__Color__Group__2__Impl rule__Color__Group__3
            {
            pushFollow(FOLLOW_rule__Color__Group__2__Impl_in_rule__Color__Group__22312);
            rule__Color__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Color__Group__3_in_rule__Color__Group__22315);
            rule__Color__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Color__Group__2"


    // $ANTLR start "rule__Color__Group__2__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1150:1: rule__Color__Group__2__Impl : ( ( rule__Color__GAssignment_2 ) ) ;
    public final void rule__Color__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1154:1: ( ( ( rule__Color__GAssignment_2 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1155:1: ( ( rule__Color__GAssignment_2 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1155:1: ( ( rule__Color__GAssignment_2 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1156:1: ( rule__Color__GAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getGAssignment_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1157:1: ( rule__Color__GAssignment_2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1157:2: rule__Color__GAssignment_2
            {
            pushFollow(FOLLOW_rule__Color__GAssignment_2_in_rule__Color__Group__2__Impl2342);
            rule__Color__GAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorAccess().getGAssignment_2()); 
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
    // $ANTLR end "rule__Color__Group__2__Impl"


    // $ANTLR start "rule__Color__Group__3"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1167:1: rule__Color__Group__3 : rule__Color__Group__3__Impl ;
    public final void rule__Color__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1171:1: ( rule__Color__Group__3__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1172:2: rule__Color__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Color__Group__3__Impl_in_rule__Color__Group__32372);
            rule__Color__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Color__Group__3"


    // $ANTLR start "rule__Color__Group__3__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1178:1: rule__Color__Group__3__Impl : ( ( rule__Color__BAssignment_3 ) ) ;
    public final void rule__Color__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1182:1: ( ( ( rule__Color__BAssignment_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1183:1: ( ( rule__Color__BAssignment_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1183:1: ( ( rule__Color__BAssignment_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1184:1: ( rule__Color__BAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getBAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1185:1: ( rule__Color__BAssignment_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1185:2: rule__Color__BAssignment_3
            {
            pushFollow(FOLLOW_rule__Color__BAssignment_3_in_rule__Color__Group__3__Impl2399);
            rule__Color__BAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorAccess().getBAssignment_3()); 
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
    // $ANTLR end "rule__Color__Group__3__Impl"


    // $ANTLR start "rule__Brick__Group__0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1203:1: rule__Brick__Group__0 : rule__Brick__Group__0__Impl rule__Brick__Group__1 ;
    public final void rule__Brick__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1207:1: ( rule__Brick__Group__0__Impl rule__Brick__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1208:2: rule__Brick__Group__0__Impl rule__Brick__Group__1
            {
            pushFollow(FOLLOW_rule__Brick__Group__0__Impl_in_rule__Brick__Group__02437);
            rule__Brick__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Brick__Group__1_in_rule__Brick__Group__02440);
            rule__Brick__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Brick__Group__0"


    // $ANTLR start "rule__Brick__Group__0__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1215:1: rule__Brick__Group__0__Impl : ( 'brick' ) ;
    public final void rule__Brick__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1219:1: ( ( 'brick' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1220:1: ( 'brick' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1220:1: ( 'brick' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1221:1: 'brick'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getBrickKeyword_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Brick__Group__0__Impl2468); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBrickAccess().getBrickKeyword_0()); 
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
    // $ANTLR end "rule__Brick__Group__0__Impl"


    // $ANTLR start "rule__Brick__Group__1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1234:1: rule__Brick__Group__1 : rule__Brick__Group__1__Impl rule__Brick__Group__2 ;
    public final void rule__Brick__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1238:1: ( rule__Brick__Group__1__Impl rule__Brick__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1239:2: rule__Brick__Group__1__Impl rule__Brick__Group__2
            {
            pushFollow(FOLLOW_rule__Brick__Group__1__Impl_in_rule__Brick__Group__12499);
            rule__Brick__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Brick__Group__2_in_rule__Brick__Group__12502);
            rule__Brick__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Brick__Group__1"


    // $ANTLR start "rule__Brick__Group__1__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1246:1: rule__Brick__Group__1__Impl : ( ( rule__Brick__NameAssignment_1 ) ) ;
    public final void rule__Brick__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1250:1: ( ( ( rule__Brick__NameAssignment_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1251:1: ( ( rule__Brick__NameAssignment_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1251:1: ( ( rule__Brick__NameAssignment_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1252:1: ( rule__Brick__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1253:1: ( rule__Brick__NameAssignment_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1253:2: rule__Brick__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Brick__NameAssignment_1_in_rule__Brick__Group__1__Impl2529);
            rule__Brick__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBrickAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Brick__Group__1__Impl"


    // $ANTLR start "rule__Brick__Group__2"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1263:1: rule__Brick__Group__2 : rule__Brick__Group__2__Impl rule__Brick__Group__3 ;
    public final void rule__Brick__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1267:1: ( rule__Brick__Group__2__Impl rule__Brick__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1268:2: rule__Brick__Group__2__Impl rule__Brick__Group__3
            {
            pushFollow(FOLLOW_rule__Brick__Group__2__Impl_in_rule__Brick__Group__22559);
            rule__Brick__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Brick__Group__3_in_rule__Brick__Group__22562);
            rule__Brick__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Brick__Group__2"


    // $ANTLR start "rule__Brick__Group__2__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1275:1: rule__Brick__Group__2__Impl : ( 'units' ) ;
    public final void rule__Brick__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1279:1: ( ( 'units' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1280:1: ( 'units' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1280:1: ( 'units' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1281:1: 'units'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getUnitsKeyword_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__Brick__Group__2__Impl2590); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBrickAccess().getUnitsKeyword_2()); 
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
    // $ANTLR end "rule__Brick__Group__2__Impl"


    // $ANTLR start "rule__Brick__Group__3"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1294:1: rule__Brick__Group__3 : rule__Brick__Group__3__Impl rule__Brick__Group__4 ;
    public final void rule__Brick__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1298:1: ( rule__Brick__Group__3__Impl rule__Brick__Group__4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1299:2: rule__Brick__Group__3__Impl rule__Brick__Group__4
            {
            pushFollow(FOLLOW_rule__Brick__Group__3__Impl_in_rule__Brick__Group__32621);
            rule__Brick__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Brick__Group__4_in_rule__Brick__Group__32624);
            rule__Brick__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Brick__Group__3"


    // $ANTLR start "rule__Brick__Group__3__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1306:1: rule__Brick__Group__3__Impl : ( ( rule__Brick__XUnitsAssignment_3 ) ) ;
    public final void rule__Brick__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1310:1: ( ( ( rule__Brick__XUnitsAssignment_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1311:1: ( ( rule__Brick__XUnitsAssignment_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1311:1: ( ( rule__Brick__XUnitsAssignment_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1312:1: ( rule__Brick__XUnitsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getXUnitsAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1313:1: ( rule__Brick__XUnitsAssignment_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1313:2: rule__Brick__XUnitsAssignment_3
            {
            pushFollow(FOLLOW_rule__Brick__XUnitsAssignment_3_in_rule__Brick__Group__3__Impl2651);
            rule__Brick__XUnitsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBrickAccess().getXUnitsAssignment_3()); 
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
    // $ANTLR end "rule__Brick__Group__3__Impl"


    // $ANTLR start "rule__Brick__Group__4"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1323:1: rule__Brick__Group__4 : rule__Brick__Group__4__Impl rule__Brick__Group__5 ;
    public final void rule__Brick__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1327:1: ( rule__Brick__Group__4__Impl rule__Brick__Group__5 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1328:2: rule__Brick__Group__4__Impl rule__Brick__Group__5
            {
            pushFollow(FOLLOW_rule__Brick__Group__4__Impl_in_rule__Brick__Group__42681);
            rule__Brick__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Brick__Group__5_in_rule__Brick__Group__42684);
            rule__Brick__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Brick__Group__4"


    // $ANTLR start "rule__Brick__Group__4__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1335:1: rule__Brick__Group__4__Impl : ( ( rule__Brick__YUnitsAssignment_4 ) ) ;
    public final void rule__Brick__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1339:1: ( ( ( rule__Brick__YUnitsAssignment_4 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1340:1: ( ( rule__Brick__YUnitsAssignment_4 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1340:1: ( ( rule__Brick__YUnitsAssignment_4 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1341:1: ( rule__Brick__YUnitsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getYUnitsAssignment_4()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1342:1: ( rule__Brick__YUnitsAssignment_4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1342:2: rule__Brick__YUnitsAssignment_4
            {
            pushFollow(FOLLOW_rule__Brick__YUnitsAssignment_4_in_rule__Brick__Group__4__Impl2711);
            rule__Brick__YUnitsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBrickAccess().getYUnitsAssignment_4()); 
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
    // $ANTLR end "rule__Brick__Group__4__Impl"


    // $ANTLR start "rule__Brick__Group__5"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1352:1: rule__Brick__Group__5 : rule__Brick__Group__5__Impl rule__Brick__Group__6 ;
    public final void rule__Brick__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1356:1: ( rule__Brick__Group__5__Impl rule__Brick__Group__6 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1357:2: rule__Brick__Group__5__Impl rule__Brick__Group__6
            {
            pushFollow(FOLLOW_rule__Brick__Group__5__Impl_in_rule__Brick__Group__52741);
            rule__Brick__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Brick__Group__6_in_rule__Brick__Group__52744);
            rule__Brick__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Brick__Group__5"


    // $ANTLR start "rule__Brick__Group__5__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1364:1: rule__Brick__Group__5__Impl : ( ( rule__Brick__ZUnitsAssignment_5 ) ) ;
    public final void rule__Brick__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1368:1: ( ( ( rule__Brick__ZUnitsAssignment_5 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1369:1: ( ( rule__Brick__ZUnitsAssignment_5 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1369:1: ( ( rule__Brick__ZUnitsAssignment_5 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1370:1: ( rule__Brick__ZUnitsAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getZUnitsAssignment_5()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1371:1: ( rule__Brick__ZUnitsAssignment_5 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1371:2: rule__Brick__ZUnitsAssignment_5
            {
            pushFollow(FOLLOW_rule__Brick__ZUnitsAssignment_5_in_rule__Brick__Group__5__Impl2771);
            rule__Brick__ZUnitsAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBrickAccess().getZUnitsAssignment_5()); 
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
    // $ANTLR end "rule__Brick__Group__5__Impl"


    // $ANTLR start "rule__Brick__Group__6"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1381:1: rule__Brick__Group__6 : rule__Brick__Group__6__Impl rule__Brick__Group__7 ;
    public final void rule__Brick__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1385:1: ( rule__Brick__Group__6__Impl rule__Brick__Group__7 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1386:2: rule__Brick__Group__6__Impl rule__Brick__Group__7
            {
            pushFollow(FOLLOW_rule__Brick__Group__6__Impl_in_rule__Brick__Group__62801);
            rule__Brick__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Brick__Group__7_in_rule__Brick__Group__62804);
            rule__Brick__Group__7();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Brick__Group__6"


    // $ANTLR start "rule__Brick__Group__6__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1393:1: rule__Brick__Group__6__Impl : ( ( rule__Brick__FillAssignment_6 ) ) ;
    public final void rule__Brick__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1397:1: ( ( ( rule__Brick__FillAssignment_6 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1398:1: ( ( rule__Brick__FillAssignment_6 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1398:1: ( ( rule__Brick__FillAssignment_6 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1399:1: ( rule__Brick__FillAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getFillAssignment_6()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1400:1: ( rule__Brick__FillAssignment_6 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1400:2: rule__Brick__FillAssignment_6
            {
            pushFollow(FOLLOW_rule__Brick__FillAssignment_6_in_rule__Brick__Group__6__Impl2831);
            rule__Brick__FillAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBrickAccess().getFillAssignment_6()); 
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
    // $ANTLR end "rule__Brick__Group__6__Impl"


    // $ANTLR start "rule__Brick__Group__7"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1410:1: rule__Brick__Group__7 : rule__Brick__Group__7__Impl ;
    public final void rule__Brick__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1414:1: ( rule__Brick__Group__7__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1415:2: rule__Brick__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Brick__Group__7__Impl_in_rule__Brick__Group__72861);
            rule__Brick__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Brick__Group__7"


    // $ANTLR start "rule__Brick__Group__7__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1421:1: rule__Brick__Group__7__Impl : ( ( rule__Brick__SourceAssignment_7 ) ) ;
    public final void rule__Brick__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1425:1: ( ( ( rule__Brick__SourceAssignment_7 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1426:1: ( ( rule__Brick__SourceAssignment_7 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1426:1: ( ( rule__Brick__SourceAssignment_7 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1427:1: ( rule__Brick__SourceAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getSourceAssignment_7()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1428:1: ( rule__Brick__SourceAssignment_7 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1428:2: rule__Brick__SourceAssignment_7
            {
            pushFollow(FOLLOW_rule__Brick__SourceAssignment_7_in_rule__Brick__Group__7__Impl2888);
            rule__Brick__SourceAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBrickAccess().getSourceAssignment_7()); 
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
    // $ANTLR end "rule__Brick__Group__7__Impl"


    // $ANTLR start "rule__Generated__Group__0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1454:1: rule__Generated__Group__0 : rule__Generated__Group__0__Impl rule__Generated__Group__1 ;
    public final void rule__Generated__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1458:1: ( rule__Generated__Group__0__Impl rule__Generated__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1459:2: rule__Generated__Group__0__Impl rule__Generated__Group__1
            {
            pushFollow(FOLLOW_rule__Generated__Group__0__Impl_in_rule__Generated__Group__02934);
            rule__Generated__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generated__Group__1_in_rule__Generated__Group__02937);
            rule__Generated__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Generated__Group__0"


    // $ANTLR start "rule__Generated__Group__0__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1466:1: rule__Generated__Group__0__Impl : ( 'generated' ) ;
    public final void rule__Generated__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1470:1: ( ( 'generated' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1471:1: ( 'generated' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1471:1: ( 'generated' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1472:1: 'generated'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getGeneratedKeyword_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__Generated__Group__0__Impl2965); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratedAccess().getGeneratedKeyword_0()); 
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
    // $ANTLR end "rule__Generated__Group__0__Impl"


    // $ANTLR start "rule__Generated__Group__1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1485:1: rule__Generated__Group__1 : rule__Generated__Group__1__Impl rule__Generated__Group__2 ;
    public final void rule__Generated__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1489:1: ( rule__Generated__Group__1__Impl rule__Generated__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1490:2: rule__Generated__Group__1__Impl rule__Generated__Group__2
            {
            pushFollow(FOLLOW_rule__Generated__Group__1__Impl_in_rule__Generated__Group__12996);
            rule__Generated__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generated__Group__2_in_rule__Generated__Group__12999);
            rule__Generated__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Generated__Group__1"


    // $ANTLR start "rule__Generated__Group__1__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1497:1: rule__Generated__Group__1__Impl : ( () ) ;
    public final void rule__Generated__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1501:1: ( ( () ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1502:1: ( () )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1502:1: ( () )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1503:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getGeneratedAction_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1504:1: ()
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1506:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratedAccess().getGeneratedAction_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generated__Group__1__Impl"


    // $ANTLR start "rule__Generated__Group__2"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1516:1: rule__Generated__Group__2 : rule__Generated__Group__2__Impl ;
    public final void rule__Generated__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1520:1: ( rule__Generated__Group__2__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1521:2: rule__Generated__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Generated__Group__2__Impl_in_rule__Generated__Group__23057);
            rule__Generated__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Generated__Group__2"


    // $ANTLR start "rule__Generated__Group__2__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1527:1: rule__Generated__Group__2__Impl : ( ( rule__Generated__Group_2__0 )? ) ;
    public final void rule__Generated__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1531:1: ( ( ( rule__Generated__Group_2__0 )? ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1532:1: ( ( rule__Generated__Group_2__0 )? )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1532:1: ( ( rule__Generated__Group_2__0 )? )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1533:1: ( rule__Generated__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getGroup_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1534:1: ( rule__Generated__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1534:2: rule__Generated__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Generated__Group_2__0_in_rule__Generated__Group__2__Impl3084);
                    rule__Generated__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratedAccess().getGroup_2()); 
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
    // $ANTLR end "rule__Generated__Group__2__Impl"


    // $ANTLR start "rule__Generated__Group_2__0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1550:1: rule__Generated__Group_2__0 : rule__Generated__Group_2__0__Impl rule__Generated__Group_2__1 ;
    public final void rule__Generated__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1554:1: ( rule__Generated__Group_2__0__Impl rule__Generated__Group_2__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1555:2: rule__Generated__Group_2__0__Impl rule__Generated__Group_2__1
            {
            pushFollow(FOLLOW_rule__Generated__Group_2__0__Impl_in_rule__Generated__Group_2__03121);
            rule__Generated__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generated__Group_2__1_in_rule__Generated__Group_2__03124);
            rule__Generated__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Generated__Group_2__0"


    // $ANTLR start "rule__Generated__Group_2__0__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1562:1: rule__Generated__Group_2__0__Impl : ( ( rule__Generated__TypeAssignment_2_0 ) ) ;
    public final void rule__Generated__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1566:1: ( ( ( rule__Generated__TypeAssignment_2_0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1567:1: ( ( rule__Generated__TypeAssignment_2_0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1567:1: ( ( rule__Generated__TypeAssignment_2_0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1568:1: ( rule__Generated__TypeAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getTypeAssignment_2_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1569:1: ( rule__Generated__TypeAssignment_2_0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1569:2: rule__Generated__TypeAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Generated__TypeAssignment_2_0_in_rule__Generated__Group_2__0__Impl3151);
            rule__Generated__TypeAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratedAccess().getTypeAssignment_2_0()); 
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
    // $ANTLR end "rule__Generated__Group_2__0__Impl"


    // $ANTLR start "rule__Generated__Group_2__1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1579:1: rule__Generated__Group_2__1 : rule__Generated__Group_2__1__Impl rule__Generated__Group_2__2 ;
    public final void rule__Generated__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1583:1: ( rule__Generated__Group_2__1__Impl rule__Generated__Group_2__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1584:2: rule__Generated__Group_2__1__Impl rule__Generated__Group_2__2
            {
            pushFollow(FOLLOW_rule__Generated__Group_2__1__Impl_in_rule__Generated__Group_2__13181);
            rule__Generated__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generated__Group_2__2_in_rule__Generated__Group_2__13184);
            rule__Generated__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Generated__Group_2__1"


    // $ANTLR start "rule__Generated__Group_2__1__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1591:1: rule__Generated__Group_2__1__Impl : ( ( rule__Generated__WidthAssignment_2_1 ) ) ;
    public final void rule__Generated__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1595:1: ( ( ( rule__Generated__WidthAssignment_2_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1596:1: ( ( rule__Generated__WidthAssignment_2_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1596:1: ( ( rule__Generated__WidthAssignment_2_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1597:1: ( rule__Generated__WidthAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getWidthAssignment_2_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1598:1: ( rule__Generated__WidthAssignment_2_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1598:2: rule__Generated__WidthAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Generated__WidthAssignment_2_1_in_rule__Generated__Group_2__1__Impl3211);
            rule__Generated__WidthAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratedAccess().getWidthAssignment_2_1()); 
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
    // $ANTLR end "rule__Generated__Group_2__1__Impl"


    // $ANTLR start "rule__Generated__Group_2__2"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1608:1: rule__Generated__Group_2__2 : rule__Generated__Group_2__2__Impl rule__Generated__Group_2__3 ;
    public final void rule__Generated__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1612:1: ( rule__Generated__Group_2__2__Impl rule__Generated__Group_2__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1613:2: rule__Generated__Group_2__2__Impl rule__Generated__Group_2__3
            {
            pushFollow(FOLLOW_rule__Generated__Group_2__2__Impl_in_rule__Generated__Group_2__23241);
            rule__Generated__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generated__Group_2__3_in_rule__Generated__Group_2__23244);
            rule__Generated__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Generated__Group_2__2"


    // $ANTLR start "rule__Generated__Group_2__2__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1620:1: rule__Generated__Group_2__2__Impl : ( ( rule__Generated__HeightAssignment_2_2 ) ) ;
    public final void rule__Generated__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1624:1: ( ( ( rule__Generated__HeightAssignment_2_2 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1625:1: ( ( rule__Generated__HeightAssignment_2_2 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1625:1: ( ( rule__Generated__HeightAssignment_2_2 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1626:1: ( rule__Generated__HeightAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getHeightAssignment_2_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1627:1: ( rule__Generated__HeightAssignment_2_2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1627:2: rule__Generated__HeightAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Generated__HeightAssignment_2_2_in_rule__Generated__Group_2__2__Impl3271);
            rule__Generated__HeightAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratedAccess().getHeightAssignment_2_2()); 
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
    // $ANTLR end "rule__Generated__Group_2__2__Impl"


    // $ANTLR start "rule__Generated__Group_2__3"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1637:1: rule__Generated__Group_2__3 : rule__Generated__Group_2__3__Impl rule__Generated__Group_2__4 ;
    public final void rule__Generated__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1641:1: ( rule__Generated__Group_2__3__Impl rule__Generated__Group_2__4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1642:2: rule__Generated__Group_2__3__Impl rule__Generated__Group_2__4
            {
            pushFollow(FOLLOW_rule__Generated__Group_2__3__Impl_in_rule__Generated__Group_2__33301);
            rule__Generated__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generated__Group_2__4_in_rule__Generated__Group_2__33304);
            rule__Generated__Group_2__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Generated__Group_2__3"


    // $ANTLR start "rule__Generated__Group_2__3__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1649:1: rule__Generated__Group_2__3__Impl : ( ( rule__Generated__DepthAssignment_2_3 ) ) ;
    public final void rule__Generated__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1653:1: ( ( ( rule__Generated__DepthAssignment_2_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1654:1: ( ( rule__Generated__DepthAssignment_2_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1654:1: ( ( rule__Generated__DepthAssignment_2_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1655:1: ( rule__Generated__DepthAssignment_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getDepthAssignment_2_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1656:1: ( rule__Generated__DepthAssignment_2_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1656:2: rule__Generated__DepthAssignment_2_3
            {
            pushFollow(FOLLOW_rule__Generated__DepthAssignment_2_3_in_rule__Generated__Group_2__3__Impl3331);
            rule__Generated__DepthAssignment_2_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratedAccess().getDepthAssignment_2_3()); 
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
    // $ANTLR end "rule__Generated__Group_2__3__Impl"


    // $ANTLR start "rule__Generated__Group_2__4"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1666:1: rule__Generated__Group_2__4 : rule__Generated__Group_2__4__Impl ;
    public final void rule__Generated__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1670:1: ( rule__Generated__Group_2__4__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1671:2: rule__Generated__Group_2__4__Impl
            {
            pushFollow(FOLLOW_rule__Generated__Group_2__4__Impl_in_rule__Generated__Group_2__43361);
            rule__Generated__Group_2__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Generated__Group_2__4"


    // $ANTLR start "rule__Generated__Group_2__4__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1677:1: rule__Generated__Group_2__4__Impl : ( ( rule__Generated__Group_2_4__0 )? ) ;
    public final void rule__Generated__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1681:1: ( ( ( rule__Generated__Group_2_4__0 )? ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1682:1: ( ( rule__Generated__Group_2_4__0 )? )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1682:1: ( ( rule__Generated__Group_2_4__0 )? )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1683:1: ( rule__Generated__Group_2_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getGroup_2_4()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1684:1: ( rule__Generated__Group_2_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1684:2: rule__Generated__Group_2_4__0
                    {
                    pushFollow(FOLLOW_rule__Generated__Group_2_4__0_in_rule__Generated__Group_2__4__Impl3388);
                    rule__Generated__Group_2_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratedAccess().getGroup_2_4()); 
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
    // $ANTLR end "rule__Generated__Group_2__4__Impl"


    // $ANTLR start "rule__Generated__Group_2_4__0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1704:1: rule__Generated__Group_2_4__0 : rule__Generated__Group_2_4__0__Impl rule__Generated__Group_2_4__1 ;
    public final void rule__Generated__Group_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1708:1: ( rule__Generated__Group_2_4__0__Impl rule__Generated__Group_2_4__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1709:2: rule__Generated__Group_2_4__0__Impl rule__Generated__Group_2_4__1
            {
            pushFollow(FOLLOW_rule__Generated__Group_2_4__0__Impl_in_rule__Generated__Group_2_4__03429);
            rule__Generated__Group_2_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generated__Group_2_4__1_in_rule__Generated__Group_2_4__03432);
            rule__Generated__Group_2_4__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Generated__Group_2_4__0"


    // $ANTLR start "rule__Generated__Group_2_4__0__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1716:1: rule__Generated__Group_2_4__0__Impl : ( 'origin' ) ;
    public final void rule__Generated__Group_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1720:1: ( ( 'origin' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1721:1: ( 'origin' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1721:1: ( 'origin' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1722:1: 'origin'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getOriginKeyword_2_4_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Generated__Group_2_4__0__Impl3460); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratedAccess().getOriginKeyword_2_4_0()); 
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
    // $ANTLR end "rule__Generated__Group_2_4__0__Impl"


    // $ANTLR start "rule__Generated__Group_2_4__1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1735:1: rule__Generated__Group_2_4__1 : rule__Generated__Group_2_4__1__Impl rule__Generated__Group_2_4__2 ;
    public final void rule__Generated__Group_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1739:1: ( rule__Generated__Group_2_4__1__Impl rule__Generated__Group_2_4__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1740:2: rule__Generated__Group_2_4__1__Impl rule__Generated__Group_2_4__2
            {
            pushFollow(FOLLOW_rule__Generated__Group_2_4__1__Impl_in_rule__Generated__Group_2_4__13491);
            rule__Generated__Group_2_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generated__Group_2_4__2_in_rule__Generated__Group_2_4__13494);
            rule__Generated__Group_2_4__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Generated__Group_2_4__1"


    // $ANTLR start "rule__Generated__Group_2_4__1__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1747:1: rule__Generated__Group_2_4__1__Impl : ( ( rule__Generated__OriginXAssignment_2_4_1 ) ) ;
    public final void rule__Generated__Group_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1751:1: ( ( ( rule__Generated__OriginXAssignment_2_4_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1752:1: ( ( rule__Generated__OriginXAssignment_2_4_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1752:1: ( ( rule__Generated__OriginXAssignment_2_4_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1753:1: ( rule__Generated__OriginXAssignment_2_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getOriginXAssignment_2_4_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1754:1: ( rule__Generated__OriginXAssignment_2_4_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1754:2: rule__Generated__OriginXAssignment_2_4_1
            {
            pushFollow(FOLLOW_rule__Generated__OriginXAssignment_2_4_1_in_rule__Generated__Group_2_4__1__Impl3521);
            rule__Generated__OriginXAssignment_2_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratedAccess().getOriginXAssignment_2_4_1()); 
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
    // $ANTLR end "rule__Generated__Group_2_4__1__Impl"


    // $ANTLR start "rule__Generated__Group_2_4__2"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1764:1: rule__Generated__Group_2_4__2 : rule__Generated__Group_2_4__2__Impl rule__Generated__Group_2_4__3 ;
    public final void rule__Generated__Group_2_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1768:1: ( rule__Generated__Group_2_4__2__Impl rule__Generated__Group_2_4__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1769:2: rule__Generated__Group_2_4__2__Impl rule__Generated__Group_2_4__3
            {
            pushFollow(FOLLOW_rule__Generated__Group_2_4__2__Impl_in_rule__Generated__Group_2_4__23551);
            rule__Generated__Group_2_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generated__Group_2_4__3_in_rule__Generated__Group_2_4__23554);
            rule__Generated__Group_2_4__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Generated__Group_2_4__2"


    // $ANTLR start "rule__Generated__Group_2_4__2__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1776:1: rule__Generated__Group_2_4__2__Impl : ( ( rule__Generated__OriginYAssignment_2_4_2 ) ) ;
    public final void rule__Generated__Group_2_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1780:1: ( ( ( rule__Generated__OriginYAssignment_2_4_2 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1781:1: ( ( rule__Generated__OriginYAssignment_2_4_2 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1781:1: ( ( rule__Generated__OriginYAssignment_2_4_2 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1782:1: ( rule__Generated__OriginYAssignment_2_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getOriginYAssignment_2_4_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1783:1: ( rule__Generated__OriginYAssignment_2_4_2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1783:2: rule__Generated__OriginYAssignment_2_4_2
            {
            pushFollow(FOLLOW_rule__Generated__OriginYAssignment_2_4_2_in_rule__Generated__Group_2_4__2__Impl3581);
            rule__Generated__OriginYAssignment_2_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratedAccess().getOriginYAssignment_2_4_2()); 
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
    // $ANTLR end "rule__Generated__Group_2_4__2__Impl"


    // $ANTLR start "rule__Generated__Group_2_4__3"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1793:1: rule__Generated__Group_2_4__3 : rule__Generated__Group_2_4__3__Impl ;
    public final void rule__Generated__Group_2_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1797:1: ( rule__Generated__Group_2_4__3__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1798:2: rule__Generated__Group_2_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Generated__Group_2_4__3__Impl_in_rule__Generated__Group_2_4__33611);
            rule__Generated__Group_2_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Generated__Group_2_4__3"


    // $ANTLR start "rule__Generated__Group_2_4__3__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1804:1: rule__Generated__Group_2_4__3__Impl : ( ( rule__Generated__OriginZAssignment_2_4_3 ) ) ;
    public final void rule__Generated__Group_2_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1808:1: ( ( ( rule__Generated__OriginZAssignment_2_4_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1809:1: ( ( rule__Generated__OriginZAssignment_2_4_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1809:1: ( ( rule__Generated__OriginZAssignment_2_4_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1810:1: ( rule__Generated__OriginZAssignment_2_4_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getOriginZAssignment_2_4_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1811:1: ( rule__Generated__OriginZAssignment_2_4_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1811:2: rule__Generated__OriginZAssignment_2_4_3
            {
            pushFollow(FOLLOW_rule__Generated__OriginZAssignment_2_4_3_in_rule__Generated__Group_2_4__3__Impl3638);
            rule__Generated__OriginZAssignment_2_4_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratedAccess().getOriginZAssignment_2_4_3()); 
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
    // $ANTLR end "rule__Generated__Group_2_4__3__Impl"


    // $ANTLR start "rule__FxmlInclude__Group__0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1829:1: rule__FxmlInclude__Group__0 : rule__FxmlInclude__Group__0__Impl rule__FxmlInclude__Group__1 ;
    public final void rule__FxmlInclude__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1833:1: ( rule__FxmlInclude__Group__0__Impl rule__FxmlInclude__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1834:2: rule__FxmlInclude__Group__0__Impl rule__FxmlInclude__Group__1
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group__0__Impl_in_rule__FxmlInclude__Group__03676);
            rule__FxmlInclude__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FxmlInclude__Group__1_in_rule__FxmlInclude__Group__03679);
            rule__FxmlInclude__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__FxmlInclude__Group__0"


    // $ANTLR start "rule__FxmlInclude__Group__0__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1841:1: rule__FxmlInclude__Group__0__Impl : ( 'fxml' ) ;
    public final void rule__FxmlInclude__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1845:1: ( ( 'fxml' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1846:1: ( 'fxml' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1846:1: ( 'fxml' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1847:1: 'fxml'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getFxmlKeyword_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__FxmlInclude__Group__0__Impl3707); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFxmlIncludeAccess().getFxmlKeyword_0()); 
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
    // $ANTLR end "rule__FxmlInclude__Group__0__Impl"


    // $ANTLR start "rule__FxmlInclude__Group__1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1860:1: rule__FxmlInclude__Group__1 : rule__FxmlInclude__Group__1__Impl rule__FxmlInclude__Group__2 ;
    public final void rule__FxmlInclude__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1864:1: ( rule__FxmlInclude__Group__1__Impl rule__FxmlInclude__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1865:2: rule__FxmlInclude__Group__1__Impl rule__FxmlInclude__Group__2
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group__1__Impl_in_rule__FxmlInclude__Group__13738);
            rule__FxmlInclude__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FxmlInclude__Group__2_in_rule__FxmlInclude__Group__13741);
            rule__FxmlInclude__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__FxmlInclude__Group__1"


    // $ANTLR start "rule__FxmlInclude__Group__1__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1872:1: rule__FxmlInclude__Group__1__Impl : ( ( rule__FxmlInclude__Source3dAssignment_1 ) ) ;
    public final void rule__FxmlInclude__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1876:1: ( ( ( rule__FxmlInclude__Source3dAssignment_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1877:1: ( ( rule__FxmlInclude__Source3dAssignment_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1877:1: ( ( rule__FxmlInclude__Source3dAssignment_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1878:1: ( rule__FxmlInclude__Source3dAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getSource3dAssignment_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1879:1: ( rule__FxmlInclude__Source3dAssignment_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1879:2: rule__FxmlInclude__Source3dAssignment_1
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Source3dAssignment_1_in_rule__FxmlInclude__Group__1__Impl3768);
            rule__FxmlInclude__Source3dAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFxmlIncludeAccess().getSource3dAssignment_1()); 
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
    // $ANTLR end "rule__FxmlInclude__Group__1__Impl"


    // $ANTLR start "rule__FxmlInclude__Group__2"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1889:1: rule__FxmlInclude__Group__2 : rule__FxmlInclude__Group__2__Impl ;
    public final void rule__FxmlInclude__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1893:1: ( rule__FxmlInclude__Group__2__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1894:2: rule__FxmlInclude__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group__2__Impl_in_rule__FxmlInclude__Group__23798);
            rule__FxmlInclude__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__FxmlInclude__Group__2"


    // $ANTLR start "rule__FxmlInclude__Group__2__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1900:1: rule__FxmlInclude__Group__2__Impl : ( ( rule__FxmlInclude__Group_2__0 )? ) ;
    public final void rule__FxmlInclude__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1904:1: ( ( ( rule__FxmlInclude__Group_2__0 )? ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1905:1: ( ( rule__FxmlInclude__Group_2__0 )? )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1905:1: ( ( rule__FxmlInclude__Group_2__0 )? )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1906:1: ( rule__FxmlInclude__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getGroup_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1907:1: ( rule__FxmlInclude__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1907:2: rule__FxmlInclude__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__FxmlInclude__Group_2__0_in_rule__FxmlInclude__Group__2__Impl3825);
                    rule__FxmlInclude__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFxmlIncludeAccess().getGroup_2()); 
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
    // $ANTLR end "rule__FxmlInclude__Group__2__Impl"


    // $ANTLR start "rule__FxmlInclude__Group_2__0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1923:1: rule__FxmlInclude__Group_2__0 : rule__FxmlInclude__Group_2__0__Impl rule__FxmlInclude__Group_2__1 ;
    public final void rule__FxmlInclude__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1927:1: ( rule__FxmlInclude__Group_2__0__Impl rule__FxmlInclude__Group_2__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1928:2: rule__FxmlInclude__Group_2__0__Impl rule__FxmlInclude__Group_2__1
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group_2__0__Impl_in_rule__FxmlInclude__Group_2__03862);
            rule__FxmlInclude__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FxmlInclude__Group_2__1_in_rule__FxmlInclude__Group_2__03865);
            rule__FxmlInclude__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__FxmlInclude__Group_2__0"


    // $ANTLR start "rule__FxmlInclude__Group_2__0__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1935:1: rule__FxmlInclude__Group_2__0__Impl : ( 'origin' ) ;
    public final void rule__FxmlInclude__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1939:1: ( ( 'origin' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1940:1: ( 'origin' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1940:1: ( 'origin' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1941:1: 'origin'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getOriginKeyword_2_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__FxmlInclude__Group_2__0__Impl3893); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFxmlIncludeAccess().getOriginKeyword_2_0()); 
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
    // $ANTLR end "rule__FxmlInclude__Group_2__0__Impl"


    // $ANTLR start "rule__FxmlInclude__Group_2__1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1954:1: rule__FxmlInclude__Group_2__1 : rule__FxmlInclude__Group_2__1__Impl rule__FxmlInclude__Group_2__2 ;
    public final void rule__FxmlInclude__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1958:1: ( rule__FxmlInclude__Group_2__1__Impl rule__FxmlInclude__Group_2__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1959:2: rule__FxmlInclude__Group_2__1__Impl rule__FxmlInclude__Group_2__2
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group_2__1__Impl_in_rule__FxmlInclude__Group_2__13924);
            rule__FxmlInclude__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FxmlInclude__Group_2__2_in_rule__FxmlInclude__Group_2__13927);
            rule__FxmlInclude__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__FxmlInclude__Group_2__1"


    // $ANTLR start "rule__FxmlInclude__Group_2__1__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1966:1: rule__FxmlInclude__Group_2__1__Impl : ( ( rule__FxmlInclude__OriginXAssignment_2_1 ) ) ;
    public final void rule__FxmlInclude__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1970:1: ( ( ( rule__FxmlInclude__OriginXAssignment_2_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1971:1: ( ( rule__FxmlInclude__OriginXAssignment_2_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1971:1: ( ( rule__FxmlInclude__OriginXAssignment_2_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1972:1: ( rule__FxmlInclude__OriginXAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getOriginXAssignment_2_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1973:1: ( rule__FxmlInclude__OriginXAssignment_2_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1973:2: rule__FxmlInclude__OriginXAssignment_2_1
            {
            pushFollow(FOLLOW_rule__FxmlInclude__OriginXAssignment_2_1_in_rule__FxmlInclude__Group_2__1__Impl3954);
            rule__FxmlInclude__OriginXAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFxmlIncludeAccess().getOriginXAssignment_2_1()); 
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
    // $ANTLR end "rule__FxmlInclude__Group_2__1__Impl"


    // $ANTLR start "rule__FxmlInclude__Group_2__2"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1983:1: rule__FxmlInclude__Group_2__2 : rule__FxmlInclude__Group_2__2__Impl rule__FxmlInclude__Group_2__3 ;
    public final void rule__FxmlInclude__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1987:1: ( rule__FxmlInclude__Group_2__2__Impl rule__FxmlInclude__Group_2__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1988:2: rule__FxmlInclude__Group_2__2__Impl rule__FxmlInclude__Group_2__3
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group_2__2__Impl_in_rule__FxmlInclude__Group_2__23984);
            rule__FxmlInclude__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FxmlInclude__Group_2__3_in_rule__FxmlInclude__Group_2__23987);
            rule__FxmlInclude__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__FxmlInclude__Group_2__2"


    // $ANTLR start "rule__FxmlInclude__Group_2__2__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1995:1: rule__FxmlInclude__Group_2__2__Impl : ( ( rule__FxmlInclude__OriginYAssignment_2_2 ) ) ;
    public final void rule__FxmlInclude__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1999:1: ( ( ( rule__FxmlInclude__OriginYAssignment_2_2 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2000:1: ( ( rule__FxmlInclude__OriginYAssignment_2_2 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2000:1: ( ( rule__FxmlInclude__OriginYAssignment_2_2 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2001:1: ( rule__FxmlInclude__OriginYAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getOriginYAssignment_2_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2002:1: ( rule__FxmlInclude__OriginYAssignment_2_2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2002:2: rule__FxmlInclude__OriginYAssignment_2_2
            {
            pushFollow(FOLLOW_rule__FxmlInclude__OriginYAssignment_2_2_in_rule__FxmlInclude__Group_2__2__Impl4014);
            rule__FxmlInclude__OriginYAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFxmlIncludeAccess().getOriginYAssignment_2_2()); 
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
    // $ANTLR end "rule__FxmlInclude__Group_2__2__Impl"


    // $ANTLR start "rule__FxmlInclude__Group_2__3"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2012:1: rule__FxmlInclude__Group_2__3 : rule__FxmlInclude__Group_2__3__Impl ;
    public final void rule__FxmlInclude__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2016:1: ( rule__FxmlInclude__Group_2__3__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2017:2: rule__FxmlInclude__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group_2__3__Impl_in_rule__FxmlInclude__Group_2__34044);
            rule__FxmlInclude__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__FxmlInclude__Group_2__3"


    // $ANTLR start "rule__FxmlInclude__Group_2__3__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2023:1: rule__FxmlInclude__Group_2__3__Impl : ( ( rule__FxmlInclude__OriginZAssignment_2_3 ) ) ;
    public final void rule__FxmlInclude__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2027:1: ( ( ( rule__FxmlInclude__OriginZAssignment_2_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2028:1: ( ( rule__FxmlInclude__OriginZAssignment_2_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2028:1: ( ( rule__FxmlInclude__OriginZAssignment_2_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2029:1: ( rule__FxmlInclude__OriginZAssignment_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getOriginZAssignment_2_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2030:1: ( rule__FxmlInclude__OriginZAssignment_2_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2030:2: rule__FxmlInclude__OriginZAssignment_2_3
            {
            pushFollow(FOLLOW_rule__FxmlInclude__OriginZAssignment_2_3_in_rule__FxmlInclude__Group_2__3__Impl4071);
            rule__FxmlInclude__OriginZAssignment_2_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFxmlIncludeAccess().getOriginZAssignment_2_3()); 
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
    // $ANTLR end "rule__FxmlInclude__Group_2__3__Impl"


    // $ANTLR start "rule__Assembly__Group__0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2048:1: rule__Assembly__Group__0 : rule__Assembly__Group__0__Impl rule__Assembly__Group__1 ;
    public final void rule__Assembly__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2052:1: ( rule__Assembly__Group__0__Impl rule__Assembly__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2053:2: rule__Assembly__Group__0__Impl rule__Assembly__Group__1
            {
            pushFollow(FOLLOW_rule__Assembly__Group__0__Impl_in_rule__Assembly__Group__04109);
            rule__Assembly__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assembly__Group__1_in_rule__Assembly__Group__04112);
            rule__Assembly__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Assembly__Group__0"


    // $ANTLR start "rule__Assembly__Group__0__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2060:1: rule__Assembly__Group__0__Impl : ( 'assembly' ) ;
    public final void rule__Assembly__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2064:1: ( ( 'assembly' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2065:1: ( 'assembly' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2065:1: ( 'assembly' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2066:1: 'assembly'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getAssemblyKeyword_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Assembly__Group__0__Impl4140); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyAccess().getAssemblyKeyword_0()); 
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
    // $ANTLR end "rule__Assembly__Group__0__Impl"


    // $ANTLR start "rule__Assembly__Group__1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2079:1: rule__Assembly__Group__1 : rule__Assembly__Group__1__Impl rule__Assembly__Group__2 ;
    public final void rule__Assembly__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2083:1: ( rule__Assembly__Group__1__Impl rule__Assembly__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2084:2: rule__Assembly__Group__1__Impl rule__Assembly__Group__2
            {
            pushFollow(FOLLOW_rule__Assembly__Group__1__Impl_in_rule__Assembly__Group__14171);
            rule__Assembly__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assembly__Group__2_in_rule__Assembly__Group__14174);
            rule__Assembly__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Assembly__Group__1"


    // $ANTLR start "rule__Assembly__Group__1__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2091:1: rule__Assembly__Group__1__Impl : ( ( rule__Assembly__NameAssignment_1 ) ) ;
    public final void rule__Assembly__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2095:1: ( ( ( rule__Assembly__NameAssignment_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2096:1: ( ( rule__Assembly__NameAssignment_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2096:1: ( ( rule__Assembly__NameAssignment_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2097:1: ( rule__Assembly__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2098:1: ( rule__Assembly__NameAssignment_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2098:2: rule__Assembly__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Assembly__NameAssignment_1_in_rule__Assembly__Group__1__Impl4201);
            rule__Assembly__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Assembly__Group__1__Impl"


    // $ANTLR start "rule__Assembly__Group__2"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2108:1: rule__Assembly__Group__2 : rule__Assembly__Group__2__Impl rule__Assembly__Group__3 ;
    public final void rule__Assembly__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2112:1: ( rule__Assembly__Group__2__Impl rule__Assembly__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2113:2: rule__Assembly__Group__2__Impl rule__Assembly__Group__3
            {
            pushFollow(FOLLOW_rule__Assembly__Group__2__Impl_in_rule__Assembly__Group__24231);
            rule__Assembly__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assembly__Group__3_in_rule__Assembly__Group__24234);
            rule__Assembly__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Assembly__Group__2"


    // $ANTLR start "rule__Assembly__Group__2__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2120:1: rule__Assembly__Group__2__Impl : ( '{' ) ;
    public final void rule__Assembly__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2124:1: ( ( '{' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2125:1: ( '{' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2125:1: ( '{' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2126:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,16,FOLLOW_16_in_rule__Assembly__Group__2__Impl4262); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__Assembly__Group__2__Impl"


    // $ANTLR start "rule__Assembly__Group__3"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2139:1: rule__Assembly__Group__3 : rule__Assembly__Group__3__Impl rule__Assembly__Group__4 ;
    public final void rule__Assembly__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2143:1: ( rule__Assembly__Group__3__Impl rule__Assembly__Group__4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2144:2: rule__Assembly__Group__3__Impl rule__Assembly__Group__4
            {
            pushFollow(FOLLOW_rule__Assembly__Group__3__Impl_in_rule__Assembly__Group__34293);
            rule__Assembly__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assembly__Group__4_in_rule__Assembly__Group__34296);
            rule__Assembly__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Assembly__Group__3"


    // $ANTLR start "rule__Assembly__Group__3__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2151:1: rule__Assembly__Group__3__Impl : ( ( ( rule__Assembly__ItemsAssignment_3 ) ) ( ( rule__Assembly__ItemsAssignment_3 )* ) ) ;
    public final void rule__Assembly__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2155:1: ( ( ( ( rule__Assembly__ItemsAssignment_3 ) ) ( ( rule__Assembly__ItemsAssignment_3 )* ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2156:1: ( ( ( rule__Assembly__ItemsAssignment_3 ) ) ( ( rule__Assembly__ItemsAssignment_3 )* ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2156:1: ( ( ( rule__Assembly__ItemsAssignment_3 ) ) ( ( rule__Assembly__ItemsAssignment_3 )* ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2157:1: ( ( rule__Assembly__ItemsAssignment_3 ) ) ( ( rule__Assembly__ItemsAssignment_3 )* )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2157:1: ( ( rule__Assembly__ItemsAssignment_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2158:1: ( rule__Assembly__ItemsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getItemsAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2159:1: ( rule__Assembly__ItemsAssignment_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2159:2: rule__Assembly__ItemsAssignment_3
            {
            pushFollow(FOLLOW_rule__Assembly__ItemsAssignment_3_in_rule__Assembly__Group__3__Impl4325);
            rule__Assembly__ItemsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyAccess().getItemsAssignment_3()); 
            }

            }

            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2162:1: ( ( rule__Assembly__ItemsAssignment_3 )* )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2163:1: ( rule__Assembly__ItemsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getItemsAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2164:1: ( rule__Assembly__ItemsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2164:2: rule__Assembly__ItemsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Assembly__ItemsAssignment_3_in_rule__Assembly__Group__3__Impl4337);
            	    rule__Assembly__ItemsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyAccess().getItemsAssignment_3()); 
            }

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
    // $ANTLR end "rule__Assembly__Group__3__Impl"


    // $ANTLR start "rule__Assembly__Group__4"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2175:1: rule__Assembly__Group__4 : rule__Assembly__Group__4__Impl ;
    public final void rule__Assembly__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2179:1: ( rule__Assembly__Group__4__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2180:2: rule__Assembly__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Assembly__Group__4__Impl_in_rule__Assembly__Group__44370);
            rule__Assembly__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Assembly__Group__4"


    // $ANTLR start "rule__Assembly__Group__4__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2186:1: rule__Assembly__Group__4__Impl : ( '}' ) ;
    public final void rule__Assembly__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2190:1: ( ( '}' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2191:1: ( '}' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2191:1: ( '}' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2192:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,17,FOLLOW_17_in_rule__Assembly__Group__4__Impl4398); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyAccess().getRightCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__Assembly__Group__4__Impl"


    // $ANTLR start "rule__RasterAssemblyItem__Group__0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2215:1: rule__RasterAssemblyItem__Group__0 : rule__RasterAssemblyItem__Group__0__Impl rule__RasterAssemblyItem__Group__1 ;
    public final void rule__RasterAssemblyItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2219:1: ( rule__RasterAssemblyItem__Group__0__Impl rule__RasterAssemblyItem__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2220:2: rule__RasterAssemblyItem__Group__0__Impl rule__RasterAssemblyItem__Group__1
            {
            pushFollow(FOLLOW_rule__RasterAssemblyItem__Group__0__Impl_in_rule__RasterAssemblyItem__Group__04439);
            rule__RasterAssemblyItem__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RasterAssemblyItem__Group__1_in_rule__RasterAssemblyItem__Group__04442);
            rule__RasterAssemblyItem__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RasterAssemblyItem__Group__0"


    // $ANTLR start "rule__RasterAssemblyItem__Group__0__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2227:1: rule__RasterAssemblyItem__Group__0__Impl : ( ( rule__RasterAssemblyItem__ElementAssignment_0 ) ) ;
    public final void rule__RasterAssemblyItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2231:1: ( ( ( rule__RasterAssemblyItem__ElementAssignment_0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2232:1: ( ( rule__RasterAssemblyItem__ElementAssignment_0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2232:1: ( ( rule__RasterAssemblyItem__ElementAssignment_0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2233:1: ( rule__RasterAssemblyItem__ElementAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRasterAssemblyItemAccess().getElementAssignment_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2234:1: ( rule__RasterAssemblyItem__ElementAssignment_0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2234:2: rule__RasterAssemblyItem__ElementAssignment_0
            {
            pushFollow(FOLLOW_rule__RasterAssemblyItem__ElementAssignment_0_in_rule__RasterAssemblyItem__Group__0__Impl4469);
            rule__RasterAssemblyItem__ElementAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRasterAssemblyItemAccess().getElementAssignment_0()); 
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
    // $ANTLR end "rule__RasterAssemblyItem__Group__0__Impl"


    // $ANTLR start "rule__RasterAssemblyItem__Group__1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2244:1: rule__RasterAssemblyItem__Group__1 : rule__RasterAssemblyItem__Group__1__Impl rule__RasterAssemblyItem__Group__2 ;
    public final void rule__RasterAssemblyItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2248:1: ( rule__RasterAssemblyItem__Group__1__Impl rule__RasterAssemblyItem__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2249:2: rule__RasterAssemblyItem__Group__1__Impl rule__RasterAssemblyItem__Group__2
            {
            pushFollow(FOLLOW_rule__RasterAssemblyItem__Group__1__Impl_in_rule__RasterAssemblyItem__Group__14499);
            rule__RasterAssemblyItem__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RasterAssemblyItem__Group__2_in_rule__RasterAssemblyItem__Group__14502);
            rule__RasterAssemblyItem__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RasterAssemblyItem__Group__1"


    // $ANTLR start "rule__RasterAssemblyItem__Group__1__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2256:1: rule__RasterAssemblyItem__Group__1__Impl : ( 'pos' ) ;
    public final void rule__RasterAssemblyItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2260:1: ( ( 'pos' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2261:1: ( 'pos' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2261:1: ( 'pos' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2262:1: 'pos'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRasterAssemblyItemAccess().getPosKeyword_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__RasterAssemblyItem__Group__1__Impl4530); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRasterAssemblyItemAccess().getPosKeyword_1()); 
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
    // $ANTLR end "rule__RasterAssemblyItem__Group__1__Impl"


    // $ANTLR start "rule__RasterAssemblyItem__Group__2"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2275:1: rule__RasterAssemblyItem__Group__2 : rule__RasterAssemblyItem__Group__2__Impl rule__RasterAssemblyItem__Group__3 ;
    public final void rule__RasterAssemblyItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2279:1: ( rule__RasterAssemblyItem__Group__2__Impl rule__RasterAssemblyItem__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2280:2: rule__RasterAssemblyItem__Group__2__Impl rule__RasterAssemblyItem__Group__3
            {
            pushFollow(FOLLOW_rule__RasterAssemblyItem__Group__2__Impl_in_rule__RasterAssemblyItem__Group__24561);
            rule__RasterAssemblyItem__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RasterAssemblyItem__Group__3_in_rule__RasterAssemblyItem__Group__24564);
            rule__RasterAssemblyItem__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RasterAssemblyItem__Group__2"


    // $ANTLR start "rule__RasterAssemblyItem__Group__2__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2287:1: rule__RasterAssemblyItem__Group__2__Impl : ( ( rule__RasterAssemblyItem__XUnitsAssignment_2 ) ) ;
    public final void rule__RasterAssemblyItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2291:1: ( ( ( rule__RasterAssemblyItem__XUnitsAssignment_2 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2292:1: ( ( rule__RasterAssemblyItem__XUnitsAssignment_2 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2292:1: ( ( rule__RasterAssemblyItem__XUnitsAssignment_2 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2293:1: ( rule__RasterAssemblyItem__XUnitsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRasterAssemblyItemAccess().getXUnitsAssignment_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2294:1: ( rule__RasterAssemblyItem__XUnitsAssignment_2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2294:2: rule__RasterAssemblyItem__XUnitsAssignment_2
            {
            pushFollow(FOLLOW_rule__RasterAssemblyItem__XUnitsAssignment_2_in_rule__RasterAssemblyItem__Group__2__Impl4591);
            rule__RasterAssemblyItem__XUnitsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRasterAssemblyItemAccess().getXUnitsAssignment_2()); 
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
    // $ANTLR end "rule__RasterAssemblyItem__Group__2__Impl"


    // $ANTLR start "rule__RasterAssemblyItem__Group__3"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2304:1: rule__RasterAssemblyItem__Group__3 : rule__RasterAssemblyItem__Group__3__Impl rule__RasterAssemblyItem__Group__4 ;
    public final void rule__RasterAssemblyItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2308:1: ( rule__RasterAssemblyItem__Group__3__Impl rule__RasterAssemblyItem__Group__4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2309:2: rule__RasterAssemblyItem__Group__3__Impl rule__RasterAssemblyItem__Group__4
            {
            pushFollow(FOLLOW_rule__RasterAssemblyItem__Group__3__Impl_in_rule__RasterAssemblyItem__Group__34621);
            rule__RasterAssemblyItem__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RasterAssemblyItem__Group__4_in_rule__RasterAssemblyItem__Group__34624);
            rule__RasterAssemblyItem__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RasterAssemblyItem__Group__3"


    // $ANTLR start "rule__RasterAssemblyItem__Group__3__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2316:1: rule__RasterAssemblyItem__Group__3__Impl : ( ( rule__RasterAssemblyItem__YUnitsAssignment_3 ) ) ;
    public final void rule__RasterAssemblyItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2320:1: ( ( ( rule__RasterAssemblyItem__YUnitsAssignment_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2321:1: ( ( rule__RasterAssemblyItem__YUnitsAssignment_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2321:1: ( ( rule__RasterAssemblyItem__YUnitsAssignment_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2322:1: ( rule__RasterAssemblyItem__YUnitsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRasterAssemblyItemAccess().getYUnitsAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2323:1: ( rule__RasterAssemblyItem__YUnitsAssignment_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2323:2: rule__RasterAssemblyItem__YUnitsAssignment_3
            {
            pushFollow(FOLLOW_rule__RasterAssemblyItem__YUnitsAssignment_3_in_rule__RasterAssemblyItem__Group__3__Impl4651);
            rule__RasterAssemblyItem__YUnitsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRasterAssemblyItemAccess().getYUnitsAssignment_3()); 
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
    // $ANTLR end "rule__RasterAssemblyItem__Group__3__Impl"


    // $ANTLR start "rule__RasterAssemblyItem__Group__4"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2333:1: rule__RasterAssemblyItem__Group__4 : rule__RasterAssemblyItem__Group__4__Impl rule__RasterAssemblyItem__Group__5 ;
    public final void rule__RasterAssemblyItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2337:1: ( rule__RasterAssemblyItem__Group__4__Impl rule__RasterAssemblyItem__Group__5 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2338:2: rule__RasterAssemblyItem__Group__4__Impl rule__RasterAssemblyItem__Group__5
            {
            pushFollow(FOLLOW_rule__RasterAssemblyItem__Group__4__Impl_in_rule__RasterAssemblyItem__Group__44681);
            rule__RasterAssemblyItem__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RasterAssemblyItem__Group__5_in_rule__RasterAssemblyItem__Group__44684);
            rule__RasterAssemblyItem__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RasterAssemblyItem__Group__4"


    // $ANTLR start "rule__RasterAssemblyItem__Group__4__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2345:1: rule__RasterAssemblyItem__Group__4__Impl : ( ( rule__RasterAssemblyItem__ZUnitsAssignment_4 ) ) ;
    public final void rule__RasterAssemblyItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2349:1: ( ( ( rule__RasterAssemblyItem__ZUnitsAssignment_4 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2350:1: ( ( rule__RasterAssemblyItem__ZUnitsAssignment_4 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2350:1: ( ( rule__RasterAssemblyItem__ZUnitsAssignment_4 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2351:1: ( rule__RasterAssemblyItem__ZUnitsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRasterAssemblyItemAccess().getZUnitsAssignment_4()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2352:1: ( rule__RasterAssemblyItem__ZUnitsAssignment_4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2352:2: rule__RasterAssemblyItem__ZUnitsAssignment_4
            {
            pushFollow(FOLLOW_rule__RasterAssemblyItem__ZUnitsAssignment_4_in_rule__RasterAssemblyItem__Group__4__Impl4711);
            rule__RasterAssemblyItem__ZUnitsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRasterAssemblyItemAccess().getZUnitsAssignment_4()); 
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
    // $ANTLR end "rule__RasterAssemblyItem__Group__4__Impl"


    // $ANTLR start "rule__RasterAssemblyItem__Group__5"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2362:1: rule__RasterAssemblyItem__Group__5 : rule__RasterAssemblyItem__Group__5__Impl ;
    public final void rule__RasterAssemblyItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2366:1: ( rule__RasterAssemblyItem__Group__5__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2367:2: rule__RasterAssemblyItem__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__RasterAssemblyItem__Group__5__Impl_in_rule__RasterAssemblyItem__Group__54741);
            rule__RasterAssemblyItem__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RasterAssemblyItem__Group__5"


    // $ANTLR start "rule__RasterAssemblyItem__Group__5__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2373:1: rule__RasterAssemblyItem__Group__5__Impl : ( ( rule__RasterAssemblyItem__Group_5__0 )? ) ;
    public final void rule__RasterAssemblyItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2377:1: ( ( ( rule__RasterAssemblyItem__Group_5__0 )? ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2378:1: ( ( rule__RasterAssemblyItem__Group_5__0 )? )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2378:1: ( ( rule__RasterAssemblyItem__Group_5__0 )? )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2379:1: ( rule__RasterAssemblyItem__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRasterAssemblyItemAccess().getGroup_5()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2380:1: ( rule__RasterAssemblyItem__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2380:2: rule__RasterAssemblyItem__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__RasterAssemblyItem__Group_5__0_in_rule__RasterAssemblyItem__Group__5__Impl4768);
                    rule__RasterAssemblyItem__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRasterAssemblyItemAccess().getGroup_5()); 
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
    // $ANTLR end "rule__RasterAssemblyItem__Group__5__Impl"


    // $ANTLR start "rule__RasterAssemblyItem__Group_5__0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2402:1: rule__RasterAssemblyItem__Group_5__0 : rule__RasterAssemblyItem__Group_5__0__Impl rule__RasterAssemblyItem__Group_5__1 ;
    public final void rule__RasterAssemblyItem__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2406:1: ( rule__RasterAssemblyItem__Group_5__0__Impl rule__RasterAssemblyItem__Group_5__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2407:2: rule__RasterAssemblyItem__Group_5__0__Impl rule__RasterAssemblyItem__Group_5__1
            {
            pushFollow(FOLLOW_rule__RasterAssemblyItem__Group_5__0__Impl_in_rule__RasterAssemblyItem__Group_5__04811);
            rule__RasterAssemblyItem__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RasterAssemblyItem__Group_5__1_in_rule__RasterAssemblyItem__Group_5__04814);
            rule__RasterAssemblyItem__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RasterAssemblyItem__Group_5__0"


    // $ANTLR start "rule__RasterAssemblyItem__Group_5__0__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2414:1: rule__RasterAssemblyItem__Group_5__0__Impl : ( 'transform' ) ;
    public final void rule__RasterAssemblyItem__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2418:1: ( ( 'transform' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2419:1: ( 'transform' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2419:1: ( 'transform' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2420:1: 'transform'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRasterAssemblyItemAccess().getTransformKeyword_5_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__RasterAssemblyItem__Group_5__0__Impl4842); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRasterAssemblyItemAccess().getTransformKeyword_5_0()); 
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
    // $ANTLR end "rule__RasterAssemblyItem__Group_5__0__Impl"


    // $ANTLR start "rule__RasterAssemblyItem__Group_5__1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2433:1: rule__RasterAssemblyItem__Group_5__1 : rule__RasterAssemblyItem__Group_5__1__Impl ;
    public final void rule__RasterAssemblyItem__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2437:1: ( rule__RasterAssemblyItem__Group_5__1__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2438:2: rule__RasterAssemblyItem__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__RasterAssemblyItem__Group_5__1__Impl_in_rule__RasterAssemblyItem__Group_5__14873);
            rule__RasterAssemblyItem__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RasterAssemblyItem__Group_5__1"


    // $ANTLR start "rule__RasterAssemblyItem__Group_5__1__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2444:1: rule__RasterAssemblyItem__Group_5__1__Impl : ( ( rule__RasterAssemblyItem__TransformAssignment_5_1 ) ) ;
    public final void rule__RasterAssemblyItem__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2448:1: ( ( ( rule__RasterAssemblyItem__TransformAssignment_5_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2449:1: ( ( rule__RasterAssemblyItem__TransformAssignment_5_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2449:1: ( ( rule__RasterAssemblyItem__TransformAssignment_5_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2450:1: ( rule__RasterAssemblyItem__TransformAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRasterAssemblyItemAccess().getTransformAssignment_5_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2451:1: ( rule__RasterAssemblyItem__TransformAssignment_5_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2451:2: rule__RasterAssemblyItem__TransformAssignment_5_1
            {
            pushFollow(FOLLOW_rule__RasterAssemblyItem__TransformAssignment_5_1_in_rule__RasterAssemblyItem__Group_5__1__Impl4900);
            rule__RasterAssemblyItem__TransformAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRasterAssemblyItemAccess().getTransformAssignment_5_1()); 
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
    // $ANTLR end "rule__RasterAssemblyItem__Group_5__1__Impl"


    // $ANTLR start "rule__MountedAssemblyItem__Group__0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2465:1: rule__MountedAssemblyItem__Group__0 : rule__MountedAssemblyItem__Group__0__Impl rule__MountedAssemblyItem__Group__1 ;
    public final void rule__MountedAssemblyItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2469:1: ( rule__MountedAssemblyItem__Group__0__Impl rule__MountedAssemblyItem__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2470:2: rule__MountedAssemblyItem__Group__0__Impl rule__MountedAssemblyItem__Group__1
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group__0__Impl_in_rule__MountedAssemblyItem__Group__04934);
            rule__MountedAssemblyItem__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group__1_in_rule__MountedAssemblyItem__Group__04937);
            rule__MountedAssemblyItem__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MountedAssemblyItem__Group__0"


    // $ANTLR start "rule__MountedAssemblyItem__Group__0__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2477:1: rule__MountedAssemblyItem__Group__0__Impl : ( ( rule__MountedAssemblyItem__ElementAssignment_0 ) ) ;
    public final void rule__MountedAssemblyItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2481:1: ( ( ( rule__MountedAssemblyItem__ElementAssignment_0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2482:1: ( ( rule__MountedAssemblyItem__ElementAssignment_0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2482:1: ( ( rule__MountedAssemblyItem__ElementAssignment_0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2483:1: ( rule__MountedAssemblyItem__ElementAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getElementAssignment_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2484:1: ( rule__MountedAssemblyItem__ElementAssignment_0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2484:2: rule__MountedAssemblyItem__ElementAssignment_0
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__ElementAssignment_0_in_rule__MountedAssemblyItem__Group__0__Impl4964);
            rule__MountedAssemblyItem__ElementAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMountedAssemblyItemAccess().getElementAssignment_0()); 
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
    // $ANTLR end "rule__MountedAssemblyItem__Group__0__Impl"


    // $ANTLR start "rule__MountedAssemblyItem__Group__1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2494:1: rule__MountedAssemblyItem__Group__1 : rule__MountedAssemblyItem__Group__1__Impl rule__MountedAssemblyItem__Group__2 ;
    public final void rule__MountedAssemblyItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2498:1: ( rule__MountedAssemblyItem__Group__1__Impl rule__MountedAssemblyItem__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2499:2: rule__MountedAssemblyItem__Group__1__Impl rule__MountedAssemblyItem__Group__2
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group__1__Impl_in_rule__MountedAssemblyItem__Group__14994);
            rule__MountedAssemblyItem__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group__2_in_rule__MountedAssemblyItem__Group__14997);
            rule__MountedAssemblyItem__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MountedAssemblyItem__Group__1"


    // $ANTLR start "rule__MountedAssemblyItem__Group__1__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2506:1: rule__MountedAssemblyItem__Group__1__Impl : ( 'pos' ) ;
    public final void rule__MountedAssemblyItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2510:1: ( ( 'pos' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2511:1: ( 'pos' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2511:1: ( 'pos' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2512:1: 'pos'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getPosKeyword_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__MountedAssemblyItem__Group__1__Impl5025); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMountedAssemblyItemAccess().getPosKeyword_1()); 
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
    // $ANTLR end "rule__MountedAssemblyItem__Group__1__Impl"


    // $ANTLR start "rule__MountedAssemblyItem__Group__2"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2525:1: rule__MountedAssemblyItem__Group__2 : rule__MountedAssemblyItem__Group__2__Impl rule__MountedAssemblyItem__Group__3 ;
    public final void rule__MountedAssemblyItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2529:1: ( rule__MountedAssemblyItem__Group__2__Impl rule__MountedAssemblyItem__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2530:2: rule__MountedAssemblyItem__Group__2__Impl rule__MountedAssemblyItem__Group__3
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group__2__Impl_in_rule__MountedAssemblyItem__Group__25056);
            rule__MountedAssemblyItem__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group__3_in_rule__MountedAssemblyItem__Group__25059);
            rule__MountedAssemblyItem__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MountedAssemblyItem__Group__2"


    // $ANTLR start "rule__MountedAssemblyItem__Group__2__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2537:1: rule__MountedAssemblyItem__Group__2__Impl : ( ( rule__MountedAssemblyItem__XUnitsAssignment_2 ) ) ;
    public final void rule__MountedAssemblyItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2541:1: ( ( ( rule__MountedAssemblyItem__XUnitsAssignment_2 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2542:1: ( ( rule__MountedAssemblyItem__XUnitsAssignment_2 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2542:1: ( ( rule__MountedAssemblyItem__XUnitsAssignment_2 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2543:1: ( rule__MountedAssemblyItem__XUnitsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getXUnitsAssignment_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2544:1: ( rule__MountedAssemblyItem__XUnitsAssignment_2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2544:2: rule__MountedAssemblyItem__XUnitsAssignment_2
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__XUnitsAssignment_2_in_rule__MountedAssemblyItem__Group__2__Impl5086);
            rule__MountedAssemblyItem__XUnitsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMountedAssemblyItemAccess().getXUnitsAssignment_2()); 
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
    // $ANTLR end "rule__MountedAssemblyItem__Group__2__Impl"


    // $ANTLR start "rule__MountedAssemblyItem__Group__3"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2554:1: rule__MountedAssemblyItem__Group__3 : rule__MountedAssemblyItem__Group__3__Impl rule__MountedAssemblyItem__Group__4 ;
    public final void rule__MountedAssemblyItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2558:1: ( rule__MountedAssemblyItem__Group__3__Impl rule__MountedAssemblyItem__Group__4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2559:2: rule__MountedAssemblyItem__Group__3__Impl rule__MountedAssemblyItem__Group__4
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group__3__Impl_in_rule__MountedAssemblyItem__Group__35116);
            rule__MountedAssemblyItem__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group__4_in_rule__MountedAssemblyItem__Group__35119);
            rule__MountedAssemblyItem__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MountedAssemblyItem__Group__3"


    // $ANTLR start "rule__MountedAssemblyItem__Group__3__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2566:1: rule__MountedAssemblyItem__Group__3__Impl : ( ( rule__MountedAssemblyItem__YUnitsAssignment_3 ) ) ;
    public final void rule__MountedAssemblyItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2570:1: ( ( ( rule__MountedAssemblyItem__YUnitsAssignment_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2571:1: ( ( rule__MountedAssemblyItem__YUnitsAssignment_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2571:1: ( ( rule__MountedAssemblyItem__YUnitsAssignment_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2572:1: ( rule__MountedAssemblyItem__YUnitsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getYUnitsAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2573:1: ( rule__MountedAssemblyItem__YUnitsAssignment_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2573:2: rule__MountedAssemblyItem__YUnitsAssignment_3
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__YUnitsAssignment_3_in_rule__MountedAssemblyItem__Group__3__Impl5146);
            rule__MountedAssemblyItem__YUnitsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMountedAssemblyItemAccess().getYUnitsAssignment_3()); 
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
    // $ANTLR end "rule__MountedAssemblyItem__Group__3__Impl"


    // $ANTLR start "rule__MountedAssemblyItem__Group__4"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2583:1: rule__MountedAssemblyItem__Group__4 : rule__MountedAssemblyItem__Group__4__Impl rule__MountedAssemblyItem__Group__5 ;
    public final void rule__MountedAssemblyItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2587:1: ( rule__MountedAssemblyItem__Group__4__Impl rule__MountedAssemblyItem__Group__5 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2588:2: rule__MountedAssemblyItem__Group__4__Impl rule__MountedAssemblyItem__Group__5
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group__4__Impl_in_rule__MountedAssemblyItem__Group__45176);
            rule__MountedAssemblyItem__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group__5_in_rule__MountedAssemblyItem__Group__45179);
            rule__MountedAssemblyItem__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MountedAssemblyItem__Group__4"


    // $ANTLR start "rule__MountedAssemblyItem__Group__4__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2595:1: rule__MountedAssemblyItem__Group__4__Impl : ( ( rule__MountedAssemblyItem__ZUnitsAssignment_4 ) ) ;
    public final void rule__MountedAssemblyItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2599:1: ( ( ( rule__MountedAssemblyItem__ZUnitsAssignment_4 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2600:1: ( ( rule__MountedAssemblyItem__ZUnitsAssignment_4 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2600:1: ( ( rule__MountedAssemblyItem__ZUnitsAssignment_4 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2601:1: ( rule__MountedAssemblyItem__ZUnitsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getZUnitsAssignment_4()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2602:1: ( rule__MountedAssemblyItem__ZUnitsAssignment_4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2602:2: rule__MountedAssemblyItem__ZUnitsAssignment_4
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__ZUnitsAssignment_4_in_rule__MountedAssemblyItem__Group__4__Impl5206);
            rule__MountedAssemblyItem__ZUnitsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMountedAssemblyItemAccess().getZUnitsAssignment_4()); 
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
    // $ANTLR end "rule__MountedAssemblyItem__Group__4__Impl"


    // $ANTLR start "rule__MountedAssemblyItem__Group__5"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2612:1: rule__MountedAssemblyItem__Group__5 : rule__MountedAssemblyItem__Group__5__Impl ;
    public final void rule__MountedAssemblyItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2616:1: ( rule__MountedAssemblyItem__Group__5__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2617:2: rule__MountedAssemblyItem__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group__5__Impl_in_rule__MountedAssemblyItem__Group__55236);
            rule__MountedAssemblyItem__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MountedAssemblyItem__Group__5"


    // $ANTLR start "rule__MountedAssemblyItem__Group__5__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2623:1: rule__MountedAssemblyItem__Group__5__Impl : ( ( rule__MountedAssemblyItem__Group_5__0 )? ) ;
    public final void rule__MountedAssemblyItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2627:1: ( ( ( rule__MountedAssemblyItem__Group_5__0 )? ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2628:1: ( ( rule__MountedAssemblyItem__Group_5__0 )? )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2628:1: ( ( rule__MountedAssemblyItem__Group_5__0 )? )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2629:1: ( rule__MountedAssemblyItem__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getGroup_5()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2630:1: ( rule__MountedAssemblyItem__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2630:2: rule__MountedAssemblyItem__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__MountedAssemblyItem__Group_5__0_in_rule__MountedAssemblyItem__Group__5__Impl5263);
                    rule__MountedAssemblyItem__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMountedAssemblyItemAccess().getGroup_5()); 
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
    // $ANTLR end "rule__MountedAssemblyItem__Group__5__Impl"


    // $ANTLR start "rule__MountedAssemblyItem__Group_5__0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2652:1: rule__MountedAssemblyItem__Group_5__0 : rule__MountedAssemblyItem__Group_5__0__Impl rule__MountedAssemblyItem__Group_5__1 ;
    public final void rule__MountedAssemblyItem__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2656:1: ( rule__MountedAssemblyItem__Group_5__0__Impl rule__MountedAssemblyItem__Group_5__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2657:2: rule__MountedAssemblyItem__Group_5__0__Impl rule__MountedAssemblyItem__Group_5__1
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group_5__0__Impl_in_rule__MountedAssemblyItem__Group_5__05306);
            rule__MountedAssemblyItem__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group_5__1_in_rule__MountedAssemblyItem__Group_5__05309);
            rule__MountedAssemblyItem__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MountedAssemblyItem__Group_5__0"


    // $ANTLR start "rule__MountedAssemblyItem__Group_5__0__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2664:1: rule__MountedAssemblyItem__Group_5__0__Impl : ( 'transform' ) ;
    public final void rule__MountedAssemblyItem__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2668:1: ( ( 'transform' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2669:1: ( 'transform' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2669:1: ( 'transform' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2670:1: 'transform'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getTransformKeyword_5_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__MountedAssemblyItem__Group_5__0__Impl5337); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMountedAssemblyItemAccess().getTransformKeyword_5_0()); 
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
    // $ANTLR end "rule__MountedAssemblyItem__Group_5__0__Impl"


    // $ANTLR start "rule__MountedAssemblyItem__Group_5__1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2683:1: rule__MountedAssemblyItem__Group_5__1 : rule__MountedAssemblyItem__Group_5__1__Impl rule__MountedAssemblyItem__Group_5__2 ;
    public final void rule__MountedAssemblyItem__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2687:1: ( rule__MountedAssemblyItem__Group_5__1__Impl rule__MountedAssemblyItem__Group_5__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2688:2: rule__MountedAssemblyItem__Group_5__1__Impl rule__MountedAssemblyItem__Group_5__2
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group_5__1__Impl_in_rule__MountedAssemblyItem__Group_5__15368);
            rule__MountedAssemblyItem__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group_5__2_in_rule__MountedAssemblyItem__Group_5__15371);
            rule__MountedAssemblyItem__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MountedAssemblyItem__Group_5__1"


    // $ANTLR start "rule__MountedAssemblyItem__Group_5__1__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2695:1: rule__MountedAssemblyItem__Group_5__1__Impl : ( ( rule__MountedAssemblyItem__RotateXAssignment_5_1 ) ) ;
    public final void rule__MountedAssemblyItem__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2699:1: ( ( ( rule__MountedAssemblyItem__RotateXAssignment_5_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2700:1: ( ( rule__MountedAssemblyItem__RotateXAssignment_5_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2700:1: ( ( rule__MountedAssemblyItem__RotateXAssignment_5_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2701:1: ( rule__MountedAssemblyItem__RotateXAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getRotateXAssignment_5_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2702:1: ( rule__MountedAssemblyItem__RotateXAssignment_5_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2702:2: rule__MountedAssemblyItem__RotateXAssignment_5_1
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__RotateXAssignment_5_1_in_rule__MountedAssemblyItem__Group_5__1__Impl5398);
            rule__MountedAssemblyItem__RotateXAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMountedAssemblyItemAccess().getRotateXAssignment_5_1()); 
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
    // $ANTLR end "rule__MountedAssemblyItem__Group_5__1__Impl"


    // $ANTLR start "rule__MountedAssemblyItem__Group_5__2"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2712:1: rule__MountedAssemblyItem__Group_5__2 : rule__MountedAssemblyItem__Group_5__2__Impl rule__MountedAssemblyItem__Group_5__3 ;
    public final void rule__MountedAssemblyItem__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2716:1: ( rule__MountedAssemblyItem__Group_5__2__Impl rule__MountedAssemblyItem__Group_5__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2717:2: rule__MountedAssemblyItem__Group_5__2__Impl rule__MountedAssemblyItem__Group_5__3
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group_5__2__Impl_in_rule__MountedAssemblyItem__Group_5__25428);
            rule__MountedAssemblyItem__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group_5__3_in_rule__MountedAssemblyItem__Group_5__25431);
            rule__MountedAssemblyItem__Group_5__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MountedAssemblyItem__Group_5__2"


    // $ANTLR start "rule__MountedAssemblyItem__Group_5__2__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2724:1: rule__MountedAssemblyItem__Group_5__2__Impl : ( ( rule__MountedAssemblyItem__RotateYAssignment_5_2 ) ) ;
    public final void rule__MountedAssemblyItem__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2728:1: ( ( ( rule__MountedAssemblyItem__RotateYAssignment_5_2 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2729:1: ( ( rule__MountedAssemblyItem__RotateYAssignment_5_2 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2729:1: ( ( rule__MountedAssemblyItem__RotateYAssignment_5_2 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2730:1: ( rule__MountedAssemblyItem__RotateYAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getRotateYAssignment_5_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2731:1: ( rule__MountedAssemblyItem__RotateYAssignment_5_2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2731:2: rule__MountedAssemblyItem__RotateYAssignment_5_2
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__RotateYAssignment_5_2_in_rule__MountedAssemblyItem__Group_5__2__Impl5458);
            rule__MountedAssemblyItem__RotateYAssignment_5_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMountedAssemblyItemAccess().getRotateYAssignment_5_2()); 
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
    // $ANTLR end "rule__MountedAssemblyItem__Group_5__2__Impl"


    // $ANTLR start "rule__MountedAssemblyItem__Group_5__3"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2741:1: rule__MountedAssemblyItem__Group_5__3 : rule__MountedAssemblyItem__Group_5__3__Impl ;
    public final void rule__MountedAssemblyItem__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2745:1: ( rule__MountedAssemblyItem__Group_5__3__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2746:2: rule__MountedAssemblyItem__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group_5__3__Impl_in_rule__MountedAssemblyItem__Group_5__35488);
            rule__MountedAssemblyItem__Group_5__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MountedAssemblyItem__Group_5__3"


    // $ANTLR start "rule__MountedAssemblyItem__Group_5__3__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2752:1: rule__MountedAssemblyItem__Group_5__3__Impl : ( ( rule__MountedAssemblyItem__RotateZAssignment_5_3 ) ) ;
    public final void rule__MountedAssemblyItem__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2756:1: ( ( ( rule__MountedAssemblyItem__RotateZAssignment_5_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2757:1: ( ( rule__MountedAssemblyItem__RotateZAssignment_5_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2757:1: ( ( rule__MountedAssemblyItem__RotateZAssignment_5_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2758:1: ( rule__MountedAssemblyItem__RotateZAssignment_5_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getRotateZAssignment_5_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2759:1: ( rule__MountedAssemblyItem__RotateZAssignment_5_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2759:2: rule__MountedAssemblyItem__RotateZAssignment_5_3
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__RotateZAssignment_5_3_in_rule__MountedAssemblyItem__Group_5__3__Impl5515);
            rule__MountedAssemblyItem__RotateZAssignment_5_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMountedAssemblyItemAccess().getRotateZAssignment_5_3()); 
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
    // $ANTLR end "rule__MountedAssemblyItem__Group_5__3__Impl"


    // $ANTLR start "rule__Model__RepoAssignment_0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2778:1: rule__Model__RepoAssignment_0 : ( ruleItemRepository ) ;
    public final void rule__Model__RepoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2782:1: ( ( ruleItemRepository ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2783:1: ( ruleItemRepository )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2783:1: ( ruleItemRepository )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2784:1: ruleItemRepository
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRepoItemRepositoryParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleItemRepository_in_rule__Model__RepoAssignment_05558);
            ruleItemRepository();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getRepoItemRepositoryParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Model__RepoAssignment_0"


    // $ANTLR start "rule__Model__AssemblyAssignment_1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2793:1: rule__Model__AssemblyAssignment_1 : ( ruleAssembly ) ;
    public final void rule__Model__AssemblyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2797:1: ( ( ruleAssembly ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2798:1: ( ruleAssembly )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2798:1: ( ruleAssembly )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2799:1: ruleAssembly
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getAssemblyAssemblyParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleAssembly_in_rule__Model__AssemblyAssignment_15589);
            ruleAssembly();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getAssemblyAssemblyParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Model__AssemblyAssignment_1"


    // $ANTLR start "rule__ItemRepository__NameAssignment_0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2808:1: rule__ItemRepository__NameAssignment_0 : ( ruleValidID ) ;
    public final void rule__ItemRepository__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2812:1: ( ( ruleValidID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2813:1: ( ruleValidID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2813:1: ( ruleValidID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2814:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getNameValidIDParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__ItemRepository__NameAssignment_05620);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemRepositoryAccess().getNameValidIDParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__ItemRepository__NameAssignment_0"


    // $ANTLR start "rule__ItemRepository__ElementListAssignment_2"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2823:1: rule__ItemRepository__ElementListAssignment_2 : ( ruleRepostoryItem ) ;
    public final void rule__ItemRepository__ElementListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2827:1: ( ( ruleRepostoryItem ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2828:1: ( ruleRepostoryItem )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2828:1: ( ruleRepostoryItem )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2829:1: ruleRepostoryItem
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getElementListRepostoryItemParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleRepostoryItem_in_rule__ItemRepository__ElementListAssignment_25651);
            ruleRepostoryItem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemRepositoryAccess().getElementListRepostoryItemParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__ItemRepository__ElementListAssignment_2"


    // $ANTLR start "rule__MountedPart__NameAssignment_1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2838:1: rule__MountedPart__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__MountedPart__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2842:1: ( ( ruleValidID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2843:1: ( ruleValidID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2843:1: ( ruleValidID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2844:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedPartAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__MountedPart__NameAssignment_15682);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMountedPartAccess().getNameValidIDParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__MountedPart__NameAssignment_1"


    // $ANTLR start "rule__MountedPart__FillAssignment_2"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2853:1: rule__MountedPart__FillAssignment_2 : ( ruleColor ) ;
    public final void rule__MountedPart__FillAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2857:1: ( ( ruleColor ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2858:1: ( ruleColor )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2858:1: ( ruleColor )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2859:1: ruleColor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedPartAccess().getFillColorParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleColor_in_rule__MountedPart__FillAssignment_25713);
            ruleColor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMountedPartAccess().getFillColorParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__MountedPart__FillAssignment_2"


    // $ANTLR start "rule__MountedPart__SourceAssignment_3"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2868:1: rule__MountedPart__SourceAssignment_3 : ( ruleSource ) ;
    public final void rule__MountedPart__SourceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2872:1: ( ( ruleSource ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2873:1: ( ruleSource )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2873:1: ( ruleSource )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2874:1: ruleSource
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedPartAccess().getSourceSourceParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleSource_in_rule__MountedPart__SourceAssignment_35744);
            ruleSource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMountedPartAccess().getSourceSourceParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__MountedPart__SourceAssignment_3"


    // $ANTLR start "rule__Color__RAssignment_1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2883:1: rule__Color__RAssignment_1 : ( RULE_INT ) ;
    public final void rule__Color__RAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2887:1: ( ( RULE_INT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2888:1: ( RULE_INT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2888:1: ( RULE_INT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2889:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getRINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Color__RAssignment_15775); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorAccess().getRINTTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Color__RAssignment_1"


    // $ANTLR start "rule__Color__GAssignment_2"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2898:1: rule__Color__GAssignment_2 : ( RULE_INT ) ;
    public final void rule__Color__GAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2902:1: ( ( RULE_INT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2903:1: ( RULE_INT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2903:1: ( RULE_INT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2904:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getGINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Color__GAssignment_25806); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorAccess().getGINTTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Color__GAssignment_2"


    // $ANTLR start "rule__Color__BAssignment_3"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2913:1: rule__Color__BAssignment_3 : ( RULE_INT ) ;
    public final void rule__Color__BAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2917:1: ( ( RULE_INT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2918:1: ( RULE_INT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2918:1: ( RULE_INT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2919:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getBINTTerminalRuleCall_3_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Color__BAssignment_35837); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorAccess().getBINTTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__Color__BAssignment_3"


    // $ANTLR start "rule__XUnit__UnitsAssignment"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2928:1: rule__XUnit__UnitsAssignment : ( RULE_INT ) ;
    public final void rule__XUnit__UnitsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2932:1: ( ( RULE_INT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2933:1: ( RULE_INT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2933:1: ( RULE_INT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2934:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXUnitAccess().getUnitsINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__XUnit__UnitsAssignment5868); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXUnitAccess().getUnitsINTTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__XUnit__UnitsAssignment"


    // $ANTLR start "rule__YUnit__UnitsAssignment"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2943:1: rule__YUnit__UnitsAssignment : ( RULE_INT ) ;
    public final void rule__YUnit__UnitsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2947:1: ( ( RULE_INT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2948:1: ( RULE_INT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2948:1: ( RULE_INT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2949:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYUnitAccess().getUnitsINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__YUnit__UnitsAssignment5899); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYUnitAccess().getUnitsINTTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__YUnit__UnitsAssignment"


    // $ANTLR start "rule__ZUnit__UnitsAssignment"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2958:1: rule__ZUnit__UnitsAssignment : ( RULE_INT ) ;
    public final void rule__ZUnit__UnitsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2962:1: ( ( RULE_INT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2963:1: ( RULE_INT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2963:1: ( RULE_INT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2964:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getZUnitAccess().getUnitsINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ZUnit__UnitsAssignment5930); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getZUnitAccess().getUnitsINTTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__ZUnit__UnitsAssignment"


    // $ANTLR start "rule__Brick__NameAssignment_1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2973:1: rule__Brick__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__Brick__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2977:1: ( ( ruleValidID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2978:1: ( ruleValidID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2978:1: ( ruleValidID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2979:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__Brick__NameAssignment_15961);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBrickAccess().getNameValidIDParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Brick__NameAssignment_1"


    // $ANTLR start "rule__Brick__XUnitsAssignment_3"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2988:1: rule__Brick__XUnitsAssignment_3 : ( ruleXUnit ) ;
    public final void rule__Brick__XUnitsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2992:1: ( ( ruleXUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2993:1: ( ruleXUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2993:1: ( ruleXUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2994:1: ruleXUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getXUnitsXUnitParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleXUnit_in_rule__Brick__XUnitsAssignment_35992);
            ruleXUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBrickAccess().getXUnitsXUnitParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Brick__XUnitsAssignment_3"


    // $ANTLR start "rule__Brick__YUnitsAssignment_4"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3003:1: rule__Brick__YUnitsAssignment_4 : ( ruleYUnit ) ;
    public final void rule__Brick__YUnitsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3007:1: ( ( ruleYUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3008:1: ( ruleYUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3008:1: ( ruleYUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3009:1: ruleYUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getYUnitsYUnitParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleYUnit_in_rule__Brick__YUnitsAssignment_46023);
            ruleYUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBrickAccess().getYUnitsYUnitParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Brick__YUnitsAssignment_4"


    // $ANTLR start "rule__Brick__ZUnitsAssignment_5"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3018:1: rule__Brick__ZUnitsAssignment_5 : ( ruleZUnit ) ;
    public final void rule__Brick__ZUnitsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3022:1: ( ( ruleZUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3023:1: ( ruleZUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3023:1: ( ruleZUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3024:1: ruleZUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getZUnitsZUnitParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleZUnit_in_rule__Brick__ZUnitsAssignment_56054);
            ruleZUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBrickAccess().getZUnitsZUnitParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__Brick__ZUnitsAssignment_5"


    // $ANTLR start "rule__Brick__FillAssignment_6"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3033:1: rule__Brick__FillAssignment_6 : ( ruleColor ) ;
    public final void rule__Brick__FillAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3037:1: ( ( ruleColor ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3038:1: ( ruleColor )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3038:1: ( ruleColor )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3039:1: ruleColor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getFillColorParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleColor_in_rule__Brick__FillAssignment_66085);
            ruleColor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBrickAccess().getFillColorParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__Brick__FillAssignment_6"


    // $ANTLR start "rule__Brick__SourceAssignment_7"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3048:1: rule__Brick__SourceAssignment_7 : ( ruleSource ) ;
    public final void rule__Brick__SourceAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3052:1: ( ( ruleSource ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3053:1: ( ruleSource )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3053:1: ( ruleSource )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3054:1: ruleSource
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getSourceSourceParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleSource_in_rule__Brick__SourceAssignment_76116);
            ruleSource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBrickAccess().getSourceSourceParserRuleCall_7_0()); 
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
    // $ANTLR end "rule__Brick__SourceAssignment_7"


    // $ANTLR start "rule__Generated__TypeAssignment_2_0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3063:1: rule__Generated__TypeAssignment_2_0 : ( ( 'box' ) ) ;
    public final void rule__Generated__TypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3067:1: ( ( ( 'box' ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3068:1: ( ( 'box' ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3068:1: ( ( 'box' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3069:1: ( 'box' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getTypeBoxKeyword_2_0_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3070:1: ( 'box' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3071:1: 'box'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getTypeBoxKeyword_2_0_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__Generated__TypeAssignment_2_06152); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratedAccess().getTypeBoxKeyword_2_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratedAccess().getTypeBoxKeyword_2_0_0()); 
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
    // $ANTLR end "rule__Generated__TypeAssignment_2_0"


    // $ANTLR start "rule__Generated__WidthAssignment_2_1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3086:1: rule__Generated__WidthAssignment_2_1 : ( RULE_FLOAT ) ;
    public final void rule__Generated__WidthAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3090:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3091:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3091:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3092:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getWidthFLOATTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__Generated__WidthAssignment_2_16191); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratedAccess().getWidthFLOATTerminalRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__Generated__WidthAssignment_2_1"


    // $ANTLR start "rule__Generated__HeightAssignment_2_2"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3101:1: rule__Generated__HeightAssignment_2_2 : ( RULE_FLOAT ) ;
    public final void rule__Generated__HeightAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3105:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3106:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3106:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3107:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getHeightFLOATTerminalRuleCall_2_2_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__Generated__HeightAssignment_2_26222); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratedAccess().getHeightFLOATTerminalRuleCall_2_2_0()); 
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
    // $ANTLR end "rule__Generated__HeightAssignment_2_2"


    // $ANTLR start "rule__Generated__DepthAssignment_2_3"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3116:1: rule__Generated__DepthAssignment_2_3 : ( RULE_FLOAT ) ;
    public final void rule__Generated__DepthAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3120:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3121:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3121:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3122:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getDepthFLOATTerminalRuleCall_2_3_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__Generated__DepthAssignment_2_36253); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratedAccess().getDepthFLOATTerminalRuleCall_2_3_0()); 
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
    // $ANTLR end "rule__Generated__DepthAssignment_2_3"


    // $ANTLR start "rule__Generated__OriginXAssignment_2_4_1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3131:1: rule__Generated__OriginXAssignment_2_4_1 : ( RULE_FLOAT ) ;
    public final void rule__Generated__OriginXAssignment_2_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3135:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3136:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3136:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3137:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getOriginXFLOATTerminalRuleCall_2_4_1_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__Generated__OriginXAssignment_2_4_16284); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratedAccess().getOriginXFLOATTerminalRuleCall_2_4_1_0()); 
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
    // $ANTLR end "rule__Generated__OriginXAssignment_2_4_1"


    // $ANTLR start "rule__Generated__OriginYAssignment_2_4_2"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3146:1: rule__Generated__OriginYAssignment_2_4_2 : ( RULE_FLOAT ) ;
    public final void rule__Generated__OriginYAssignment_2_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3150:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3151:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3151:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3152:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getOriginYFLOATTerminalRuleCall_2_4_2_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__Generated__OriginYAssignment_2_4_26315); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratedAccess().getOriginYFLOATTerminalRuleCall_2_4_2_0()); 
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
    // $ANTLR end "rule__Generated__OriginYAssignment_2_4_2"


    // $ANTLR start "rule__Generated__OriginZAssignment_2_4_3"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3161:1: rule__Generated__OriginZAssignment_2_4_3 : ( RULE_FLOAT ) ;
    public final void rule__Generated__OriginZAssignment_2_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3165:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3166:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3166:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3167:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getOriginZFLOATTerminalRuleCall_2_4_3_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__Generated__OriginZAssignment_2_4_36346); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratedAccess().getOriginZFLOATTerminalRuleCall_2_4_3_0()); 
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
    // $ANTLR end "rule__Generated__OriginZAssignment_2_4_3"


    // $ANTLR start "rule__FxmlInclude__Source3dAssignment_1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3176:1: rule__FxmlInclude__Source3dAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FxmlInclude__Source3dAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3180:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3181:1: ( RULE_STRING )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3181:1: ( RULE_STRING )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3182:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getSource3dSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FxmlInclude__Source3dAssignment_16377); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFxmlIncludeAccess().getSource3dSTRINGTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__FxmlInclude__Source3dAssignment_1"


    // $ANTLR start "rule__FxmlInclude__OriginXAssignment_2_1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3191:1: rule__FxmlInclude__OriginXAssignment_2_1 : ( RULE_FLOAT ) ;
    public final void rule__FxmlInclude__OriginXAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3195:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3196:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3196:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3197:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getOriginXFLOATTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__FxmlInclude__OriginXAssignment_2_16408); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFxmlIncludeAccess().getOriginXFLOATTerminalRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__FxmlInclude__OriginXAssignment_2_1"


    // $ANTLR start "rule__FxmlInclude__OriginYAssignment_2_2"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3206:1: rule__FxmlInclude__OriginYAssignment_2_2 : ( RULE_FLOAT ) ;
    public final void rule__FxmlInclude__OriginYAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3210:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3211:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3211:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3212:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getOriginYFLOATTerminalRuleCall_2_2_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__FxmlInclude__OriginYAssignment_2_26439); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFxmlIncludeAccess().getOriginYFLOATTerminalRuleCall_2_2_0()); 
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
    // $ANTLR end "rule__FxmlInclude__OriginYAssignment_2_2"


    // $ANTLR start "rule__FxmlInclude__OriginZAssignment_2_3"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3221:1: rule__FxmlInclude__OriginZAssignment_2_3 : ( RULE_FLOAT ) ;
    public final void rule__FxmlInclude__OriginZAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3225:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3226:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3226:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3227:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getOriginZFLOATTerminalRuleCall_2_3_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__FxmlInclude__OriginZAssignment_2_36470); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFxmlIncludeAccess().getOriginZFLOATTerminalRuleCall_2_3_0()); 
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
    // $ANTLR end "rule__FxmlInclude__OriginZAssignment_2_3"


    // $ANTLR start "rule__Assembly__NameAssignment_1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3236:1: rule__Assembly__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__Assembly__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3240:1: ( ( ruleValidID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3241:1: ( ruleValidID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3241:1: ( ruleValidID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3242:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__Assembly__NameAssignment_16501);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyAccess().getNameValidIDParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Assembly__NameAssignment_1"


    // $ANTLR start "rule__Assembly__ItemsAssignment_3"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3251:1: rule__Assembly__ItemsAssignment_3 : ( ruleAssemblyItem ) ;
    public final void rule__Assembly__ItemsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3255:1: ( ( ruleAssemblyItem ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3256:1: ( ruleAssemblyItem )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3256:1: ( ruleAssemblyItem )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3257:1: ruleAssemblyItem
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getItemsAssemblyItemParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleAssemblyItem_in_rule__Assembly__ItemsAssignment_36532);
            ruleAssemblyItem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyAccess().getItemsAssemblyItemParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Assembly__ItemsAssignment_3"


    // $ANTLR start "rule__RasterAssemblyItem__ElementAssignment_0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3266:1: rule__RasterAssemblyItem__ElementAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RasterAssemblyItem__ElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3270:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3271:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3271:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3272:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRasterAssemblyItemAccess().getElementRasterItemCrossReference_0_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3273:1: ( ruleQualifiedName )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3274:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRasterAssemblyItemAccess().getElementRasterItemQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__RasterAssemblyItem__ElementAssignment_06567);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRasterAssemblyItemAccess().getElementRasterItemQualifiedNameParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRasterAssemblyItemAccess().getElementRasterItemCrossReference_0_0()); 
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
    // $ANTLR end "rule__RasterAssemblyItem__ElementAssignment_0"


    // $ANTLR start "rule__RasterAssemblyItem__XUnitsAssignment_2"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3285:1: rule__RasterAssemblyItem__XUnitsAssignment_2 : ( ruleXUnit ) ;
    public final void rule__RasterAssemblyItem__XUnitsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3289:1: ( ( ruleXUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3290:1: ( ruleXUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3290:1: ( ruleXUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3291:1: ruleXUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRasterAssemblyItemAccess().getXUnitsXUnitParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleXUnit_in_rule__RasterAssemblyItem__XUnitsAssignment_26602);
            ruleXUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRasterAssemblyItemAccess().getXUnitsXUnitParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__RasterAssemblyItem__XUnitsAssignment_2"


    // $ANTLR start "rule__RasterAssemblyItem__YUnitsAssignment_3"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3300:1: rule__RasterAssemblyItem__YUnitsAssignment_3 : ( ruleYUnit ) ;
    public final void rule__RasterAssemblyItem__YUnitsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3304:1: ( ( ruleYUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3305:1: ( ruleYUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3305:1: ( ruleYUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3306:1: ruleYUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRasterAssemblyItemAccess().getYUnitsYUnitParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleYUnit_in_rule__RasterAssemblyItem__YUnitsAssignment_36633);
            ruleYUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRasterAssemblyItemAccess().getYUnitsYUnitParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__RasterAssemblyItem__YUnitsAssignment_3"


    // $ANTLR start "rule__RasterAssemblyItem__ZUnitsAssignment_4"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3315:1: rule__RasterAssemblyItem__ZUnitsAssignment_4 : ( ruleZUnit ) ;
    public final void rule__RasterAssemblyItem__ZUnitsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3319:1: ( ( ruleZUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3320:1: ( ruleZUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3320:1: ( ruleZUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3321:1: ruleZUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRasterAssemblyItemAccess().getZUnitsZUnitParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleZUnit_in_rule__RasterAssemblyItem__ZUnitsAssignment_46664);
            ruleZUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRasterAssemblyItemAccess().getZUnitsZUnitParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__RasterAssemblyItem__ZUnitsAssignment_4"


    // $ANTLR start "rule__RasterAssemblyItem__TransformAssignment_5_1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3330:1: rule__RasterAssemblyItem__TransformAssignment_5_1 : ( ( rule__RasterAssemblyItem__TransformAlternatives_5_1_0 ) ) ;
    public final void rule__RasterAssemblyItem__TransformAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3334:1: ( ( ( rule__RasterAssemblyItem__TransformAlternatives_5_1_0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3335:1: ( ( rule__RasterAssemblyItem__TransformAlternatives_5_1_0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3335:1: ( ( rule__RasterAssemblyItem__TransformAlternatives_5_1_0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3336:1: ( rule__RasterAssemblyItem__TransformAlternatives_5_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRasterAssemblyItemAccess().getTransformAlternatives_5_1_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3337:1: ( rule__RasterAssemblyItem__TransformAlternatives_5_1_0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3337:2: rule__RasterAssemblyItem__TransformAlternatives_5_1_0
            {
            pushFollow(FOLLOW_rule__RasterAssemblyItem__TransformAlternatives_5_1_0_in_rule__RasterAssemblyItem__TransformAssignment_5_16695);
            rule__RasterAssemblyItem__TransformAlternatives_5_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRasterAssemblyItemAccess().getTransformAlternatives_5_1_0()); 
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
    // $ANTLR end "rule__RasterAssemblyItem__TransformAssignment_5_1"


    // $ANTLR start "rule__MountedAssemblyItem__ElementAssignment_0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3346:1: rule__MountedAssemblyItem__ElementAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MountedAssemblyItem__ElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3350:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3351:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3351:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3352:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getElementMountedPartCrossReference_0_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3353:1: ( ruleQualifiedName )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3354:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getElementMountedPartQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__MountedAssemblyItem__ElementAssignment_06732);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMountedAssemblyItemAccess().getElementMountedPartQualifiedNameParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMountedAssemblyItemAccess().getElementMountedPartCrossReference_0_0()); 
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
    // $ANTLR end "rule__MountedAssemblyItem__ElementAssignment_0"


    // $ANTLR start "rule__MountedAssemblyItem__XUnitsAssignment_2"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3365:1: rule__MountedAssemblyItem__XUnitsAssignment_2 : ( RULE_FLOAT ) ;
    public final void rule__MountedAssemblyItem__XUnitsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3369:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3370:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3370:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3371:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getXUnitsFLOATTerminalRuleCall_2_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__MountedAssemblyItem__XUnitsAssignment_26767); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMountedAssemblyItemAccess().getXUnitsFLOATTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__MountedAssemblyItem__XUnitsAssignment_2"


    // $ANTLR start "rule__MountedAssemblyItem__YUnitsAssignment_3"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3380:1: rule__MountedAssemblyItem__YUnitsAssignment_3 : ( RULE_FLOAT ) ;
    public final void rule__MountedAssemblyItem__YUnitsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3384:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3385:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3385:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3386:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getYUnitsFLOATTerminalRuleCall_3_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__MountedAssemblyItem__YUnitsAssignment_36798); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMountedAssemblyItemAccess().getYUnitsFLOATTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__MountedAssemblyItem__YUnitsAssignment_3"


    // $ANTLR start "rule__MountedAssemblyItem__ZUnitsAssignment_4"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3395:1: rule__MountedAssemblyItem__ZUnitsAssignment_4 : ( RULE_FLOAT ) ;
    public final void rule__MountedAssemblyItem__ZUnitsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3399:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3400:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3400:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3401:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getZUnitsFLOATTerminalRuleCall_4_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__MountedAssemblyItem__ZUnitsAssignment_46829); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMountedAssemblyItemAccess().getZUnitsFLOATTerminalRuleCall_4_0()); 
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
    // $ANTLR end "rule__MountedAssemblyItem__ZUnitsAssignment_4"


    // $ANTLR start "rule__MountedAssemblyItem__RotateXAssignment_5_1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3410:1: rule__MountedAssemblyItem__RotateXAssignment_5_1 : ( RULE_FLOAT ) ;
    public final void rule__MountedAssemblyItem__RotateXAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3414:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3415:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3415:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3416:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getRotateXFLOATTerminalRuleCall_5_1_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__MountedAssemblyItem__RotateXAssignment_5_16860); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMountedAssemblyItemAccess().getRotateXFLOATTerminalRuleCall_5_1_0()); 
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
    // $ANTLR end "rule__MountedAssemblyItem__RotateXAssignment_5_1"


    // $ANTLR start "rule__MountedAssemblyItem__RotateYAssignment_5_2"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3425:1: rule__MountedAssemblyItem__RotateYAssignment_5_2 : ( RULE_FLOAT ) ;
    public final void rule__MountedAssemblyItem__RotateYAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3429:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3430:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3430:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3431:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getRotateYFLOATTerminalRuleCall_5_2_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__MountedAssemblyItem__RotateYAssignment_5_26891); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMountedAssemblyItemAccess().getRotateYFLOATTerminalRuleCall_5_2_0()); 
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
    // $ANTLR end "rule__MountedAssemblyItem__RotateYAssignment_5_2"


    // $ANTLR start "rule__MountedAssemblyItem__RotateZAssignment_5_3"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3440:1: rule__MountedAssemblyItem__RotateZAssignment_5_3 : ( RULE_FLOAT ) ;
    public final void rule__MountedAssemblyItem__RotateZAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3444:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3445:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3445:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3446:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getRotateZFLOATTerminalRuleCall_5_3_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__MountedAssemblyItem__RotateZAssignment_5_36922); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMountedAssemblyItemAccess().getRotateZFLOATTerminalRuleCall_5_3_0()); 
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
    // $ANTLR end "rule__MountedAssemblyItem__RotateZAssignment_5_3"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\7\uffff";
    static final String DFA4_eofS =
        "\7\uffff";
    static final String DFA4_minS =
        "\1\4\1\17\1\4\1\5\1\17\2\uffff";
    static final String DFA4_maxS =
        "\1\4\1\32\1\4\1\6\1\32\2\uffff";
    static final String DFA4_acceptS =
        "\5\uffff\1\1\1\2";
    static final String DFA4_specialS =
        "\7\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1",
            "\1\2\12\uffff\1\3",
            "\1\4",
            "\1\5\1\6",
            "\1\2\12\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "637:1: rule__AssemblyItem__Alternatives : ( ( ruleRasterAssemblyItem ) | ( ruleMountedAssemblyItem ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Alternatives_in_ruleModel100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemRepository_in_entryRuleItemRepository246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItemRepository253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__0_in_ruleItemRepository279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMountedPart_in_entryRuleMountedPart310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMountedPart317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedPart__Group__0_in_ruleMountedPart343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepostoryItem_in_entryRuleRepostoryItem370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepostoryItem377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepostoryItem__Alternatives_in_ruleRepostoryItem403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group__0_in_ruleColor463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnit_in_entryRuleXUnit490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnit497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XUnit__UnitsAssignment_in_ruleXUnit523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYUnit_in_entryRuleYUnit550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleYUnit557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__YUnit__UnitsAssignment_in_ruleYUnit583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZUnit_in_entryRuleZUnit610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleZUnit617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ZUnit__UnitsAssignment_in_ruleZUnit643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrick_in_entryRuleBrick670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBrick677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__0_in_ruleBrick703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSource_in_entryRuleSource730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSource737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Source__Alternatives_in_ruleSource763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerated_in_entryRuleGenerated790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenerated797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__Group__0_in_ruleGenerated823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFxmlInclude_in_entryRuleFxmlInclude850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFxmlInclude857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__0_in_ruleFxmlInclude883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssembly_in_entryRuleAssembly910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssembly917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assembly__Group__0_in_ruleAssembly943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssemblyItem_in_entryRuleAssemblyItem970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssemblyItem977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Alternatives_in_ruleAssemblyItem1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRasterAssemblyItem_in_entryRuleRasterAssemblyItem1030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRasterAssemblyItem1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__Group__0_in_ruleRasterAssemblyItem1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMountedAssemblyItem_in_entryRuleMountedAssemblyItem1090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMountedAssemblyItem1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group__0_in_ruleMountedAssemblyItem1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__RepoAssignment_0_in_rule__Model__Alternatives1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__AssemblyAssignment_1_in_rule__Model__Alternatives1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrick_in_rule__RepostoryItem__Alternatives1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMountedPart_in_rule__RepostoryItem__Alternatives1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerated_in_rule__Source__Alternatives1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFxmlInclude_in_rule__Source__Alternatives1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRasterAssemblyItem_in_rule__AssemblyItem__Alternatives1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMountedAssemblyItem_in_rule__AssemblyItem__Alternatives1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RasterAssemblyItem__TransformAlternatives_5_1_01360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RasterAssemblyItem__TransformAlternatives_5_1_01380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RasterAssemblyItem__TransformAlternatives_5_1_01400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01432 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1518 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01553 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__QualifiedName__Group_1__0__Impl1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__0__Impl_in_rule__ItemRepository__Group__01677 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__1_in_rule__ItemRepository__Group__01680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemRepository__NameAssignment_0_in_rule__ItemRepository__Group__0__Impl1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__1__Impl_in_rule__ItemRepository__Group__11737 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__2_in_rule__ItemRepository__Group__11740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ItemRepository__Group__1__Impl1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__2__Impl_in_rule__ItemRepository__Group__21799 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__3_in_rule__ItemRepository__Group__21802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemRepository__ElementListAssignment_2_in_rule__ItemRepository__Group__2__Impl1831 = new BitSet(new long[]{0x0000000000140002L});
    public static final BitSet FOLLOW_rule__ItemRepository__ElementListAssignment_2_in_rule__ItemRepository__Group__2__Impl1843 = new BitSet(new long[]{0x0000000000140002L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__3__Impl_in_rule__ItemRepository__Group__31876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ItemRepository__Group__3__Impl1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedPart__Group__0__Impl_in_rule__MountedPart__Group__01943 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MountedPart__Group__1_in_rule__MountedPart__Group__01946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__MountedPart__Group__0__Impl1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedPart__Group__1__Impl_in_rule__MountedPart__Group__12005 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__MountedPart__Group__2_in_rule__MountedPart__Group__12008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedPart__NameAssignment_1_in_rule__MountedPart__Group__1__Impl2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedPart__Group__2__Impl_in_rule__MountedPart__Group__22065 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_rule__MountedPart__Group__3_in_rule__MountedPart__Group__22068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedPart__FillAssignment_2_in_rule__MountedPart__Group__2__Impl2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedPart__Group__3__Impl_in_rule__MountedPart__Group__32125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedPart__SourceAssignment_3_in_rule__MountedPart__Group__3__Impl2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group__0__Impl_in_rule__Color__Group__02190 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Color__Group__1_in_rule__Color__Group__02193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Color__Group__0__Impl2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group__1__Impl_in_rule__Color__Group__12252 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Color__Group__2_in_rule__Color__Group__12255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__RAssignment_1_in_rule__Color__Group__1__Impl2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group__2__Impl_in_rule__Color__Group__22312 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Color__Group__3_in_rule__Color__Group__22315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__GAssignment_2_in_rule__Color__Group__2__Impl2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group__3__Impl_in_rule__Color__Group__32372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__BAssignment_3_in_rule__Color__Group__3__Impl2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__0__Impl_in_rule__Brick__Group__02437 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Brick__Group__1_in_rule__Brick__Group__02440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Brick__Group__0__Impl2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__1__Impl_in_rule__Brick__Group__12499 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Brick__Group__2_in_rule__Brick__Group__12502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__NameAssignment_1_in_rule__Brick__Group__1__Impl2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__2__Impl_in_rule__Brick__Group__22559 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Brick__Group__3_in_rule__Brick__Group__22562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Brick__Group__2__Impl2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__3__Impl_in_rule__Brick__Group__32621 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Brick__Group__4_in_rule__Brick__Group__32624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__XUnitsAssignment_3_in_rule__Brick__Group__3__Impl2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__4__Impl_in_rule__Brick__Group__42681 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Brick__Group__5_in_rule__Brick__Group__42684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__YUnitsAssignment_4_in_rule__Brick__Group__4__Impl2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__5__Impl_in_rule__Brick__Group__52741 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Brick__Group__6_in_rule__Brick__Group__52744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__ZUnitsAssignment_5_in_rule__Brick__Group__5__Impl2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__6__Impl_in_rule__Brick__Group__62801 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_rule__Brick__Group__7_in_rule__Brick__Group__62804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__FillAssignment_6_in_rule__Brick__Group__6__Impl2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__7__Impl_in_rule__Brick__Group__72861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__SourceAssignment_7_in_rule__Brick__Group__7__Impl2888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__Group__0__Impl_in_rule__Generated__Group__02934 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Generated__Group__1_in_rule__Generated__Group__02937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Generated__Group__0__Impl2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__Group__1__Impl_in_rule__Generated__Group__12996 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Generated__Group__2_in_rule__Generated__Group__12999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__Group__2__Impl_in_rule__Generated__Group__23057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__Group_2__0_in_rule__Generated__Group__2__Impl3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__Group_2__0__Impl_in_rule__Generated__Group_2__03121 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Generated__Group_2__1_in_rule__Generated__Group_2__03124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__TypeAssignment_2_0_in_rule__Generated__Group_2__0__Impl3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__Group_2__1__Impl_in_rule__Generated__Group_2__13181 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Generated__Group_2__2_in_rule__Generated__Group_2__13184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__WidthAssignment_2_1_in_rule__Generated__Group_2__1__Impl3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__Group_2__2__Impl_in_rule__Generated__Group_2__23241 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Generated__Group_2__3_in_rule__Generated__Group_2__23244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__HeightAssignment_2_2_in_rule__Generated__Group_2__2__Impl3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__Group_2__3__Impl_in_rule__Generated__Group_2__33301 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Generated__Group_2__4_in_rule__Generated__Group_2__33304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__DepthAssignment_2_3_in_rule__Generated__Group_2__3__Impl3331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__Group_2__4__Impl_in_rule__Generated__Group_2__43361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__Group_2_4__0_in_rule__Generated__Group_2__4__Impl3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__Group_2_4__0__Impl_in_rule__Generated__Group_2_4__03429 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Generated__Group_2_4__1_in_rule__Generated__Group_2_4__03432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Generated__Group_2_4__0__Impl3460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__Group_2_4__1__Impl_in_rule__Generated__Group_2_4__13491 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Generated__Group_2_4__2_in_rule__Generated__Group_2_4__13494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__OriginXAssignment_2_4_1_in_rule__Generated__Group_2_4__1__Impl3521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__Group_2_4__2__Impl_in_rule__Generated__Group_2_4__23551 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Generated__Group_2_4__3_in_rule__Generated__Group_2_4__23554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__OriginYAssignment_2_4_2_in_rule__Generated__Group_2_4__2__Impl3581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__Group_2_4__3__Impl_in_rule__Generated__Group_2_4__33611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__OriginZAssignment_2_4_3_in_rule__Generated__Group_2_4__3__Impl3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__0__Impl_in_rule__FxmlInclude__Group__03676 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__1_in_rule__FxmlInclude__Group__03679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__FxmlInclude__Group__0__Impl3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__1__Impl_in_rule__FxmlInclude__Group__13738 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__2_in_rule__FxmlInclude__Group__13741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Source3dAssignment_1_in_rule__FxmlInclude__Group__1__Impl3768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__2__Impl_in_rule__FxmlInclude__Group__23798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group_2__0_in_rule__FxmlInclude__Group__2__Impl3825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group_2__0__Impl_in_rule__FxmlInclude__Group_2__03862 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group_2__1_in_rule__FxmlInclude__Group_2__03865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FxmlInclude__Group_2__0__Impl3893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group_2__1__Impl_in_rule__FxmlInclude__Group_2__13924 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group_2__2_in_rule__FxmlInclude__Group_2__13927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__OriginXAssignment_2_1_in_rule__FxmlInclude__Group_2__1__Impl3954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group_2__2__Impl_in_rule__FxmlInclude__Group_2__23984 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group_2__3_in_rule__FxmlInclude__Group_2__23987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__OriginYAssignment_2_2_in_rule__FxmlInclude__Group_2__2__Impl4014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group_2__3__Impl_in_rule__FxmlInclude__Group_2__34044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__OriginZAssignment_2_3_in_rule__FxmlInclude__Group_2__3__Impl4071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assembly__Group__0__Impl_in_rule__Assembly__Group__04109 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Assembly__Group__1_in_rule__Assembly__Group__04112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Assembly__Group__0__Impl4140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assembly__Group__1__Impl_in_rule__Assembly__Group__14171 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Assembly__Group__2_in_rule__Assembly__Group__14174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assembly__NameAssignment_1_in_rule__Assembly__Group__1__Impl4201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assembly__Group__2__Impl_in_rule__Assembly__Group__24231 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Assembly__Group__3_in_rule__Assembly__Group__24234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Assembly__Group__2__Impl4262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assembly__Group__3__Impl_in_rule__Assembly__Group__34293 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Assembly__Group__4_in_rule__Assembly__Group__34296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assembly__ItemsAssignment_3_in_rule__Assembly__Group__3__Impl4325 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Assembly__ItemsAssignment_3_in_rule__Assembly__Group__3__Impl4337 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Assembly__Group__4__Impl_in_rule__Assembly__Group__44370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Assembly__Group__4__Impl4398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__Group__0__Impl_in_rule__RasterAssemblyItem__Group__04439 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__Group__1_in_rule__RasterAssemblyItem__Group__04442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__ElementAssignment_0_in_rule__RasterAssemblyItem__Group__0__Impl4469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__Group__1__Impl_in_rule__RasterAssemblyItem__Group__14499 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__Group__2_in_rule__RasterAssemblyItem__Group__14502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__RasterAssemblyItem__Group__1__Impl4530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__Group__2__Impl_in_rule__RasterAssemblyItem__Group__24561 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__Group__3_in_rule__RasterAssemblyItem__Group__24564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__XUnitsAssignment_2_in_rule__RasterAssemblyItem__Group__2__Impl4591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__Group__3__Impl_in_rule__RasterAssemblyItem__Group__34621 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__Group__4_in_rule__RasterAssemblyItem__Group__34624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__YUnitsAssignment_3_in_rule__RasterAssemblyItem__Group__3__Impl4651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__Group__4__Impl_in_rule__RasterAssemblyItem__Group__44681 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__Group__5_in_rule__RasterAssemblyItem__Group__44684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__ZUnitsAssignment_4_in_rule__RasterAssemblyItem__Group__4__Impl4711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__Group__5__Impl_in_rule__RasterAssemblyItem__Group__54741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__Group_5__0_in_rule__RasterAssemblyItem__Group__5__Impl4768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__Group_5__0__Impl_in_rule__RasterAssemblyItem__Group_5__04811 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__Group_5__1_in_rule__RasterAssemblyItem__Group_5__04814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__RasterAssemblyItem__Group_5__0__Impl4842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__Group_5__1__Impl_in_rule__RasterAssemblyItem__Group_5__14873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__TransformAssignment_5_1_in_rule__RasterAssemblyItem__Group_5__1__Impl4900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group__0__Impl_in_rule__MountedAssemblyItem__Group__04934 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group__1_in_rule__MountedAssemblyItem__Group__04937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__ElementAssignment_0_in_rule__MountedAssemblyItem__Group__0__Impl4964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group__1__Impl_in_rule__MountedAssemblyItem__Group__14994 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group__2_in_rule__MountedAssemblyItem__Group__14997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MountedAssemblyItem__Group__1__Impl5025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group__2__Impl_in_rule__MountedAssemblyItem__Group__25056 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group__3_in_rule__MountedAssemblyItem__Group__25059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__XUnitsAssignment_2_in_rule__MountedAssemblyItem__Group__2__Impl5086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group__3__Impl_in_rule__MountedAssemblyItem__Group__35116 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group__4_in_rule__MountedAssemblyItem__Group__35119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__YUnitsAssignment_3_in_rule__MountedAssemblyItem__Group__3__Impl5146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group__4__Impl_in_rule__MountedAssemblyItem__Group__45176 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group__5_in_rule__MountedAssemblyItem__Group__45179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__ZUnitsAssignment_4_in_rule__MountedAssemblyItem__Group__4__Impl5206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group__5__Impl_in_rule__MountedAssemblyItem__Group__55236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group_5__0_in_rule__MountedAssemblyItem__Group__5__Impl5263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group_5__0__Impl_in_rule__MountedAssemblyItem__Group_5__05306 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group_5__1_in_rule__MountedAssemblyItem__Group_5__05309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__MountedAssemblyItem__Group_5__0__Impl5337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group_5__1__Impl_in_rule__MountedAssemblyItem__Group_5__15368 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group_5__2_in_rule__MountedAssemblyItem__Group_5__15371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__RotateXAssignment_5_1_in_rule__MountedAssemblyItem__Group_5__1__Impl5398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group_5__2__Impl_in_rule__MountedAssemblyItem__Group_5__25428 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group_5__3_in_rule__MountedAssemblyItem__Group_5__25431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__RotateYAssignment_5_2_in_rule__MountedAssemblyItem__Group_5__2__Impl5458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group_5__3__Impl_in_rule__MountedAssemblyItem__Group_5__35488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__RotateZAssignment_5_3_in_rule__MountedAssemblyItem__Group_5__3__Impl5515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemRepository_in_rule__Model__RepoAssignment_05558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssembly_in_rule__Model__AssemblyAssignment_15589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__ItemRepository__NameAssignment_05620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepostoryItem_in_rule__ItemRepository__ElementListAssignment_25651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__MountedPart__NameAssignment_15682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__MountedPart__FillAssignment_25713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSource_in_rule__MountedPart__SourceAssignment_35744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Color__RAssignment_15775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Color__GAssignment_25806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Color__BAssignment_35837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__XUnit__UnitsAssignment5868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__YUnit__UnitsAssignment5899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ZUnit__UnitsAssignment5930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__Brick__NameAssignment_15961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnit_in_rule__Brick__XUnitsAssignment_35992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYUnit_in_rule__Brick__YUnitsAssignment_46023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZUnit_in_rule__Brick__ZUnitsAssignment_56054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__Brick__FillAssignment_66085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSource_in_rule__Brick__SourceAssignment_76116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Generated__TypeAssignment_2_06152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__Generated__WidthAssignment_2_16191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__Generated__HeightAssignment_2_26222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__Generated__DepthAssignment_2_36253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__Generated__OriginXAssignment_2_4_16284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__Generated__OriginYAssignment_2_4_26315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__Generated__OriginZAssignment_2_4_36346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FxmlInclude__Source3dAssignment_16377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FxmlInclude__OriginXAssignment_2_16408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FxmlInclude__OriginYAssignment_2_26439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FxmlInclude__OriginZAssignment_2_36470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__Assembly__NameAssignment_16501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssemblyItem_in_rule__Assembly__ItemsAssignment_36532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__RasterAssemblyItem__ElementAssignment_06567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnit_in_rule__RasterAssemblyItem__XUnitsAssignment_26602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYUnit_in_rule__RasterAssemblyItem__YUnitsAssignment_36633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZUnit_in_rule__RasterAssemblyItem__ZUnitsAssignment_46664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__TransformAlternatives_5_1_0_in_rule__RasterAssemblyItem__TransformAssignment_5_16695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__MountedAssemblyItem__ElementAssignment_06732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__MountedAssemblyItem__XUnitsAssignment_26767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__MountedAssemblyItem__YUnitsAssignment_36798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__MountedAssemblyItem__ZUnitsAssignment_46829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__MountedAssemblyItem__RotateXAssignment_5_16860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__MountedAssemblyItem__RotateYAssignment_5_26891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__MountedAssemblyItem__RotateZAssignment_5_36922 = new BitSet(new long[]{0x0000000000000002L});

}