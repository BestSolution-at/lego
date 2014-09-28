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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_FLOAT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'x'", "'y'", "'z'", "'rotate180'", "'rotate90'", "'rotate270'", "'.'", "'{'", "'}'", "'mpart'", "'duration'", "'sound-file'", "'rgb'", "'brick'", "'units'", "'generated'", "'origin'", "'fxml'", "'assembly'", "'pos'", "'transform'", "'actions'", "'rotate'", "'box'"
    };
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


    // $ANTLR start "entryRuleAction"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:205:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:206:1: ( ruleAction EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:207:1: ruleAction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionRule()); 
            }
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction370);
            ruleAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction377); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:214:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:218:2: ( ( ( rule__Action__Group__0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:219:1: ( ( rule__Action__Group__0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:219:1: ( ( rule__Action__Group__0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:220:1: ( rule__Action__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getGroup()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:221:1: ( rule__Action__Group__0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:221:2: rule__Action__Group__0
            {
            pushFollow(FOLLOW_rule__Action__Group__0_in_ruleAction403);
            rule__Action__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getGroup()); 
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleRepostoryItem"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:233:1: entryRuleRepostoryItem : ruleRepostoryItem EOF ;
    public final void entryRuleRepostoryItem() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:234:1: ( ruleRepostoryItem EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:235:1: ruleRepostoryItem EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepostoryItemRule()); 
            }
            pushFollow(FOLLOW_ruleRepostoryItem_in_entryRuleRepostoryItem430);
            ruleRepostoryItem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepostoryItemRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepostoryItem437); if (state.failed) return ;

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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:242:1: ruleRepostoryItem : ( ( rule__RepostoryItem__Alternatives ) ) ;
    public final void ruleRepostoryItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:246:2: ( ( ( rule__RepostoryItem__Alternatives ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:247:1: ( ( rule__RepostoryItem__Alternatives ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:247:1: ( ( rule__RepostoryItem__Alternatives ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:248:1: ( rule__RepostoryItem__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepostoryItemAccess().getAlternatives()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:249:1: ( rule__RepostoryItem__Alternatives )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:249:2: rule__RepostoryItem__Alternatives
            {
            pushFollow(FOLLOW_rule__RepostoryItem__Alternatives_in_ruleRepostoryItem463);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:261:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:262:1: ( ruleColor EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:263:1: ruleColor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorRule()); 
            }
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor490);
            ruleColor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor497); if (state.failed) return ;

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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:270:1: ruleColor : ( ( rule__Color__Group__0 ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:274:2: ( ( ( rule__Color__Group__0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:275:1: ( ( rule__Color__Group__0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:275:1: ( ( rule__Color__Group__0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:276:1: ( rule__Color__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getGroup()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:277:1: ( rule__Color__Group__0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:277:2: rule__Color__Group__0
            {
            pushFollow(FOLLOW_rule__Color__Group__0_in_ruleColor523);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:289:1: entryRuleXUnit : ruleXUnit EOF ;
    public final void entryRuleXUnit() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:290:1: ( ruleXUnit EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:291:1: ruleXUnit EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXUnitRule()); 
            }
            pushFollow(FOLLOW_ruleXUnit_in_entryRuleXUnit550);
            ruleXUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXUnitRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnit557); if (state.failed) return ;

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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:298:1: ruleXUnit : ( ( rule__XUnit__UnitsAssignment ) ) ;
    public final void ruleXUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:302:2: ( ( ( rule__XUnit__UnitsAssignment ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:303:1: ( ( rule__XUnit__UnitsAssignment ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:303:1: ( ( rule__XUnit__UnitsAssignment ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:304:1: ( rule__XUnit__UnitsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXUnitAccess().getUnitsAssignment()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:305:1: ( rule__XUnit__UnitsAssignment )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:305:2: rule__XUnit__UnitsAssignment
            {
            pushFollow(FOLLOW_rule__XUnit__UnitsAssignment_in_ruleXUnit583);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:317:1: entryRuleYUnit : ruleYUnit EOF ;
    public final void entryRuleYUnit() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:318:1: ( ruleYUnit EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:319:1: ruleYUnit EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYUnitRule()); 
            }
            pushFollow(FOLLOW_ruleYUnit_in_entryRuleYUnit610);
            ruleYUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYUnitRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleYUnit617); if (state.failed) return ;

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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:326:1: ruleYUnit : ( ( rule__YUnit__UnitsAssignment ) ) ;
    public final void ruleYUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:330:2: ( ( ( rule__YUnit__UnitsAssignment ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:331:1: ( ( rule__YUnit__UnitsAssignment ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:331:1: ( ( rule__YUnit__UnitsAssignment ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:332:1: ( rule__YUnit__UnitsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYUnitAccess().getUnitsAssignment()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:333:1: ( rule__YUnit__UnitsAssignment )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:333:2: rule__YUnit__UnitsAssignment
            {
            pushFollow(FOLLOW_rule__YUnit__UnitsAssignment_in_ruleYUnit643);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:345:1: entryRuleZUnit : ruleZUnit EOF ;
    public final void entryRuleZUnit() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:346:1: ( ruleZUnit EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:347:1: ruleZUnit EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getZUnitRule()); 
            }
            pushFollow(FOLLOW_ruleZUnit_in_entryRuleZUnit670);
            ruleZUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getZUnitRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleZUnit677); if (state.failed) return ;

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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:354:1: ruleZUnit : ( ( rule__ZUnit__UnitsAssignment ) ) ;
    public final void ruleZUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:358:2: ( ( ( rule__ZUnit__UnitsAssignment ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:359:1: ( ( rule__ZUnit__UnitsAssignment ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:359:1: ( ( rule__ZUnit__UnitsAssignment ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:360:1: ( rule__ZUnit__UnitsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getZUnitAccess().getUnitsAssignment()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:361:1: ( rule__ZUnit__UnitsAssignment )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:361:2: rule__ZUnit__UnitsAssignment
            {
            pushFollow(FOLLOW_rule__ZUnit__UnitsAssignment_in_ruleZUnit703);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:373:1: entryRuleBrick : ruleBrick EOF ;
    public final void entryRuleBrick() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:374:1: ( ruleBrick EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:375:1: ruleBrick EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickRule()); 
            }
            pushFollow(FOLLOW_ruleBrick_in_entryRuleBrick730);
            ruleBrick();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBrickRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBrick737); if (state.failed) return ;

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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:382:1: ruleBrick : ( ( rule__Brick__Group__0 ) ) ;
    public final void ruleBrick() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:386:2: ( ( ( rule__Brick__Group__0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:387:1: ( ( rule__Brick__Group__0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:387:1: ( ( rule__Brick__Group__0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:388:1: ( rule__Brick__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getGroup()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:389:1: ( rule__Brick__Group__0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:389:2: rule__Brick__Group__0
            {
            pushFollow(FOLLOW_rule__Brick__Group__0_in_ruleBrick763);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:401:1: entryRuleSource : ruleSource EOF ;
    public final void entryRuleSource() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:402:1: ( ruleSource EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:403:1: ruleSource EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceRule()); 
            }
            pushFollow(FOLLOW_ruleSource_in_entryRuleSource790);
            ruleSource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSource797); if (state.failed) return ;

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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:410:1: ruleSource : ( ( rule__Source__Alternatives ) ) ;
    public final void ruleSource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:414:2: ( ( ( rule__Source__Alternatives ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:415:1: ( ( rule__Source__Alternatives ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:415:1: ( ( rule__Source__Alternatives ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:416:1: ( rule__Source__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceAccess().getAlternatives()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:417:1: ( rule__Source__Alternatives )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:417:2: rule__Source__Alternatives
            {
            pushFollow(FOLLOW_rule__Source__Alternatives_in_ruleSource823);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:429:1: entryRuleGenerated : ruleGenerated EOF ;
    public final void entryRuleGenerated() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:430:1: ( ruleGenerated EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:431:1: ruleGenerated EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedRule()); 
            }
            pushFollow(FOLLOW_ruleGenerated_in_entryRuleGenerated850);
            ruleGenerated();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratedRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenerated857); if (state.failed) return ;

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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:438:1: ruleGenerated : ( ( rule__Generated__Group__0 ) ) ;
    public final void ruleGenerated() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:442:2: ( ( ( rule__Generated__Group__0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:443:1: ( ( rule__Generated__Group__0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:443:1: ( ( rule__Generated__Group__0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:444:1: ( rule__Generated__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getGroup()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:445:1: ( rule__Generated__Group__0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:445:2: rule__Generated__Group__0
            {
            pushFollow(FOLLOW_rule__Generated__Group__0_in_ruleGenerated883);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:457:1: entryRuleFxmlInclude : ruleFxmlInclude EOF ;
    public final void entryRuleFxmlInclude() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:458:1: ( ruleFxmlInclude EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:459:1: ruleFxmlInclude EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeRule()); 
            }
            pushFollow(FOLLOW_ruleFxmlInclude_in_entryRuleFxmlInclude910);
            ruleFxmlInclude();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFxmlIncludeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFxmlInclude917); if (state.failed) return ;

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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:466:1: ruleFxmlInclude : ( ( rule__FxmlInclude__Group__0 ) ) ;
    public final void ruleFxmlInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:470:2: ( ( ( rule__FxmlInclude__Group__0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:471:1: ( ( rule__FxmlInclude__Group__0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:471:1: ( ( rule__FxmlInclude__Group__0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:472:1: ( rule__FxmlInclude__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getGroup()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:473:1: ( rule__FxmlInclude__Group__0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:473:2: rule__FxmlInclude__Group__0
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group__0_in_ruleFxmlInclude943);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:485:1: entryRuleAssembly : ruleAssembly EOF ;
    public final void entryRuleAssembly() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:486:1: ( ruleAssembly EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:487:1: ruleAssembly EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyRule()); 
            }
            pushFollow(FOLLOW_ruleAssembly_in_entryRuleAssembly970);
            ruleAssembly();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssembly977); if (state.failed) return ;

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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:494:1: ruleAssembly : ( ( rule__Assembly__Group__0 ) ) ;
    public final void ruleAssembly() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:498:2: ( ( ( rule__Assembly__Group__0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:499:1: ( ( rule__Assembly__Group__0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:499:1: ( ( rule__Assembly__Group__0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:500:1: ( rule__Assembly__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getGroup()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:501:1: ( rule__Assembly__Group__0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:501:2: rule__Assembly__Group__0
            {
            pushFollow(FOLLOW_rule__Assembly__Group__0_in_ruleAssembly1003);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:513:1: entryRuleAssemblyItem : ruleAssemblyItem EOF ;
    public final void entryRuleAssemblyItem() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:514:1: ( ruleAssemblyItem EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:515:1: ruleAssemblyItem EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemRule()); 
            }
            pushFollow(FOLLOW_ruleAssemblyItem_in_entryRuleAssemblyItem1030);
            ruleAssemblyItem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyItemRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssemblyItem1037); if (state.failed) return ;

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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:522:1: ruleAssemblyItem : ( ( rule__AssemblyItem__Alternatives ) ) ;
    public final void ruleAssemblyItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:526:2: ( ( ( rule__AssemblyItem__Alternatives ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:527:1: ( ( rule__AssemblyItem__Alternatives ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:527:1: ( ( rule__AssemblyItem__Alternatives ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:528:1: ( rule__AssemblyItem__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getAlternatives()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:529:1: ( rule__AssemblyItem__Alternatives )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:529:2: rule__AssemblyItem__Alternatives
            {
            pushFollow(FOLLOW_rule__AssemblyItem__Alternatives_in_ruleAssemblyItem1063);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:541:1: entryRuleRasterAssemblyItem : ruleRasterAssemblyItem EOF ;
    public final void entryRuleRasterAssemblyItem() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:542:1: ( ruleRasterAssemblyItem EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:543:1: ruleRasterAssemblyItem EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRasterAssemblyItemRule()); 
            }
            pushFollow(FOLLOW_ruleRasterAssemblyItem_in_entryRuleRasterAssemblyItem1090);
            ruleRasterAssemblyItem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRasterAssemblyItemRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRasterAssemblyItem1097); if (state.failed) return ;

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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:550:1: ruleRasterAssemblyItem : ( ( rule__RasterAssemblyItem__Group__0 ) ) ;
    public final void ruleRasterAssemblyItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:554:2: ( ( ( rule__RasterAssemblyItem__Group__0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:555:1: ( ( rule__RasterAssemblyItem__Group__0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:555:1: ( ( rule__RasterAssemblyItem__Group__0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:556:1: ( rule__RasterAssemblyItem__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRasterAssemblyItemAccess().getGroup()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:557:1: ( rule__RasterAssemblyItem__Group__0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:557:2: rule__RasterAssemblyItem__Group__0
            {
            pushFollow(FOLLOW_rule__RasterAssemblyItem__Group__0_in_ruleRasterAssemblyItem1123);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:569:1: entryRuleMountedAssemblyItem : ruleMountedAssemblyItem EOF ;
    public final void entryRuleMountedAssemblyItem() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:570:1: ( ruleMountedAssemblyItem EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:571:1: ruleMountedAssemblyItem EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemRule()); 
            }
            pushFollow(FOLLOW_ruleMountedAssemblyItem_in_entryRuleMountedAssemblyItem1150);
            ruleMountedAssemblyItem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMountedAssemblyItemRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMountedAssemblyItem1157); if (state.failed) return ;

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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:578:1: ruleMountedAssemblyItem : ( ( rule__MountedAssemblyItem__Group__0 ) ) ;
    public final void ruleMountedAssemblyItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:582:2: ( ( ( rule__MountedAssemblyItem__Group__0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:583:1: ( ( rule__MountedAssemblyItem__Group__0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:583:1: ( ( rule__MountedAssemblyItem__Group__0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:584:1: ( rule__MountedAssemblyItem__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getGroup()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:585:1: ( rule__MountedAssemblyItem__Group__0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:585:2: rule__MountedAssemblyItem__Group__0
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group__0_in_ruleMountedAssemblyItem1183);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:597:1: rule__Model__Alternatives : ( ( ( rule__Model__RepoAssignment_0 ) ) | ( ( rule__Model__AssemblyAssignment_1 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:601:1: ( ( ( rule__Model__RepoAssignment_0 ) ) | ( ( rule__Model__AssemblyAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==30) ) {
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
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:602:1: ( ( rule__Model__RepoAssignment_0 ) )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:602:1: ( ( rule__Model__RepoAssignment_0 ) )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:603:1: ( rule__Model__RepoAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getRepoAssignment_0()); 
                    }
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:604:1: ( rule__Model__RepoAssignment_0 )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:604:2: rule__Model__RepoAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Model__RepoAssignment_0_in_rule__Model__Alternatives1219);
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
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:608:6: ( ( rule__Model__AssemblyAssignment_1 ) )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:608:6: ( ( rule__Model__AssemblyAssignment_1 ) )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:609:1: ( rule__Model__AssemblyAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getAssemblyAssignment_1()); 
                    }
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:610:1: ( rule__Model__AssemblyAssignment_1 )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:610:2: rule__Model__AssemblyAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__AssemblyAssignment_1_in_rule__Model__Alternatives1237);
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


    // $ANTLR start "rule__Action__AxisAlternatives_2_0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:621:1: rule__Action__AxisAlternatives_2_0 : ( ( 'x' ) | ( 'y' ) | ( 'z' ) );
    public final void rule__Action__AxisAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:625:1: ( ( 'x' ) | ( 'y' ) | ( 'z' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:626:1: ( 'x' )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:626:1: ( 'x' )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:627:1: 'x'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getAxisXKeyword_2_0_0()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__Action__AxisAlternatives_2_01273); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getAxisXKeyword_2_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:634:6: ( 'y' )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:634:6: ( 'y' )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:635:1: 'y'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getAxisYKeyword_2_0_1()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__Action__AxisAlternatives_2_01293); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getAxisYKeyword_2_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:642:6: ( 'z' )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:642:6: ( 'z' )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:643:1: 'z'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getAxisZKeyword_2_0_2()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__Action__AxisAlternatives_2_01313); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getAxisZKeyword_2_0_2()); 
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
    // $ANTLR end "rule__Action__AxisAlternatives_2_0"


    // $ANTLR start "rule__RepostoryItem__Alternatives"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:655:1: rule__RepostoryItem__Alternatives : ( ( ruleBrick ) | ( ruleMountedPart ) );
    public final void rule__RepostoryItem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:659:1: ( ( ruleBrick ) | ( ruleMountedPart ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==25) ) {
                alt3=1;
            }
            else if ( (LA3_0==21) ) {
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
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:660:1: ( ruleBrick )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:660:1: ( ruleBrick )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:661:1: ruleBrick
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepostoryItemAccess().getBrickParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleBrick_in_rule__RepostoryItem__Alternatives1347);
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
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:666:6: ( ruleMountedPart )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:666:6: ( ruleMountedPart )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:667:1: ruleMountedPart
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRepostoryItemAccess().getMountedPartParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleMountedPart_in_rule__RepostoryItem__Alternatives1364);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:677:1: rule__Source__Alternatives : ( ( ruleGenerated ) | ( ruleFxmlInclude ) );
    public final void rule__Source__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:681:1: ( ( ruleGenerated ) | ( ruleFxmlInclude ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==27) ) {
                alt4=1;
            }
            else if ( (LA4_0==29) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:682:1: ( ruleGenerated )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:682:1: ( ruleGenerated )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:683:1: ruleGenerated
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSourceAccess().getGeneratedParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleGenerated_in_rule__Source__Alternatives1396);
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
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:688:6: ( ruleFxmlInclude )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:688:6: ( ruleFxmlInclude )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:689:1: ruleFxmlInclude
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSourceAccess().getFxmlIncludeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleFxmlInclude_in_rule__Source__Alternatives1413);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:699:1: rule__AssemblyItem__Alternatives : ( ( ruleRasterAssemblyItem ) | ( ruleMountedAssemblyItem ) );
    public final void rule__AssemblyItem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:703:1: ( ( ruleRasterAssemblyItem ) | ( ruleMountedAssemblyItem ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:704:1: ( ruleRasterAssemblyItem )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:704:1: ( ruleRasterAssemblyItem )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:705:1: ruleRasterAssemblyItem
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssemblyItemAccess().getRasterAssemblyItemParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleRasterAssemblyItem_in_rule__AssemblyItem__Alternatives1445);
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
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:710:6: ( ruleMountedAssemblyItem )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:710:6: ( ruleMountedAssemblyItem )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:711:1: ruleMountedAssemblyItem
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssemblyItemAccess().getMountedAssemblyItemParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleMountedAssemblyItem_in_rule__AssemblyItem__Alternatives1462);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:721:1: rule__RasterAssemblyItem__TransformAlternatives_5_1_0 : ( ( 'rotate180' ) | ( 'rotate90' ) | ( 'rotate270' ) );
    public final void rule__RasterAssemblyItem__TransformAlternatives_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:725:1: ( ( 'rotate180' ) | ( 'rotate90' ) | ( 'rotate270' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            case 17:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:726:1: ( 'rotate180' )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:726:1: ( 'rotate180' )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:727:1: 'rotate180'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRasterAssemblyItemAccess().getTransformRotate180Keyword_5_1_0_0()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__RasterAssemblyItem__TransformAlternatives_5_1_01495); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRasterAssemblyItemAccess().getTransformRotate180Keyword_5_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:734:6: ( 'rotate90' )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:734:6: ( 'rotate90' )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:735:1: 'rotate90'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRasterAssemblyItemAccess().getTransformRotate90Keyword_5_1_0_1()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__RasterAssemblyItem__TransformAlternatives_5_1_01515); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRasterAssemblyItemAccess().getTransformRotate90Keyword_5_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:742:6: ( 'rotate270' )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:742:6: ( 'rotate270' )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:743:1: 'rotate270'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRasterAssemblyItemAccess().getTransformRotate270Keyword_5_1_0_2()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__RasterAssemblyItem__TransformAlternatives_5_1_01535); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:757:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:761:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:762:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01567);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01570);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:769:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:773:1: ( ( ruleValidID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:774:1: ( ruleValidID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:774:1: ( ruleValidID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:775:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl1597);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:786:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:790:1: ( rule__QualifiedName__Group__1__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:791:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11626);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:797:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:801:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:802:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:802:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:803:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:804:1: ( rule__QualifiedName__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:804:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1653);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:818:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:822:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:823:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01688);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01691);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:830:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:834:1: ( ( ( '.' ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:835:1: ( ( '.' ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:835:1: ( ( '.' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:836:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:837:1: ( '.' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:838:2: '.'
            {
            match(input,18,FOLLOW_18_in_rule__QualifiedName__Group_1__0__Impl1720); if (state.failed) return ;

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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:849:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:853:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:854:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11752);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:860:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:864:1: ( ( ruleValidID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:865:1: ( ruleValidID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:865:1: ( ruleValidID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:866:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl1779);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:881:1: rule__ItemRepository__Group__0 : rule__ItemRepository__Group__0__Impl rule__ItemRepository__Group__1 ;
    public final void rule__ItemRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:885:1: ( rule__ItemRepository__Group__0__Impl rule__ItemRepository__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:886:2: rule__ItemRepository__Group__0__Impl rule__ItemRepository__Group__1
            {
            pushFollow(FOLLOW_rule__ItemRepository__Group__0__Impl_in_rule__ItemRepository__Group__01812);
            rule__ItemRepository__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ItemRepository__Group__1_in_rule__ItemRepository__Group__01815);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:893:1: rule__ItemRepository__Group__0__Impl : ( ( rule__ItemRepository__NameAssignment_0 ) ) ;
    public final void rule__ItemRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:897:1: ( ( ( rule__ItemRepository__NameAssignment_0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:898:1: ( ( rule__ItemRepository__NameAssignment_0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:898:1: ( ( rule__ItemRepository__NameAssignment_0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:899:1: ( rule__ItemRepository__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getNameAssignment_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:900:1: ( rule__ItemRepository__NameAssignment_0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:900:2: rule__ItemRepository__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ItemRepository__NameAssignment_0_in_rule__ItemRepository__Group__0__Impl1842);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:910:1: rule__ItemRepository__Group__1 : rule__ItemRepository__Group__1__Impl rule__ItemRepository__Group__2 ;
    public final void rule__ItemRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:914:1: ( rule__ItemRepository__Group__1__Impl rule__ItemRepository__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:915:2: rule__ItemRepository__Group__1__Impl rule__ItemRepository__Group__2
            {
            pushFollow(FOLLOW_rule__ItemRepository__Group__1__Impl_in_rule__ItemRepository__Group__11872);
            rule__ItemRepository__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ItemRepository__Group__2_in_rule__ItemRepository__Group__11875);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:922:1: rule__ItemRepository__Group__1__Impl : ( '{' ) ;
    public final void rule__ItemRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:926:1: ( ( '{' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:927:1: ( '{' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:927:1: ( '{' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:928:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,19,FOLLOW_19_in_rule__ItemRepository__Group__1__Impl1903); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:941:1: rule__ItemRepository__Group__2 : rule__ItemRepository__Group__2__Impl rule__ItemRepository__Group__3 ;
    public final void rule__ItemRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:945:1: ( rule__ItemRepository__Group__2__Impl rule__ItemRepository__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:946:2: rule__ItemRepository__Group__2__Impl rule__ItemRepository__Group__3
            {
            pushFollow(FOLLOW_rule__ItemRepository__Group__2__Impl_in_rule__ItemRepository__Group__21934);
            rule__ItemRepository__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ItemRepository__Group__3_in_rule__ItemRepository__Group__21937);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:953:1: rule__ItemRepository__Group__2__Impl : ( ( ( rule__ItemRepository__ElementListAssignment_2 ) ) ( ( rule__ItemRepository__ElementListAssignment_2 )* ) ) ;
    public final void rule__ItemRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:957:1: ( ( ( ( rule__ItemRepository__ElementListAssignment_2 ) ) ( ( rule__ItemRepository__ElementListAssignment_2 )* ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:958:1: ( ( ( rule__ItemRepository__ElementListAssignment_2 ) ) ( ( rule__ItemRepository__ElementListAssignment_2 )* ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:958:1: ( ( ( rule__ItemRepository__ElementListAssignment_2 ) ) ( ( rule__ItemRepository__ElementListAssignment_2 )* ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:959:1: ( ( rule__ItemRepository__ElementListAssignment_2 ) ) ( ( rule__ItemRepository__ElementListAssignment_2 )* )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:959:1: ( ( rule__ItemRepository__ElementListAssignment_2 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:960:1: ( rule__ItemRepository__ElementListAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getElementListAssignment_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:961:1: ( rule__ItemRepository__ElementListAssignment_2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:961:2: rule__ItemRepository__ElementListAssignment_2
            {
            pushFollow(FOLLOW_rule__ItemRepository__ElementListAssignment_2_in_rule__ItemRepository__Group__2__Impl1966);
            rule__ItemRepository__ElementListAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemRepositoryAccess().getElementListAssignment_2()); 
            }

            }

            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:964:1: ( ( rule__ItemRepository__ElementListAssignment_2 )* )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:965:1: ( rule__ItemRepository__ElementListAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getElementListAssignment_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:966:1: ( rule__ItemRepository__ElementListAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21||LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:966:2: rule__ItemRepository__ElementListAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ItemRepository__ElementListAssignment_2_in_rule__ItemRepository__Group__2__Impl1978);
            	    rule__ItemRepository__ElementListAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:977:1: rule__ItemRepository__Group__3 : rule__ItemRepository__Group__3__Impl ;
    public final void rule__ItemRepository__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:981:1: ( rule__ItemRepository__Group__3__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:982:2: rule__ItemRepository__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ItemRepository__Group__3__Impl_in_rule__ItemRepository__Group__32011);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:988:1: rule__ItemRepository__Group__3__Impl : ( '}' ) ;
    public final void rule__ItemRepository__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:992:1: ( ( '}' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:993:1: ( '}' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:993:1: ( '}' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:994:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,20,FOLLOW_20_in_rule__ItemRepository__Group__3__Impl2039); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1015:1: rule__MountedPart__Group__0 : rule__MountedPart__Group__0__Impl rule__MountedPart__Group__1 ;
    public final void rule__MountedPart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1019:1: ( rule__MountedPart__Group__0__Impl rule__MountedPart__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1020:2: rule__MountedPart__Group__0__Impl rule__MountedPart__Group__1
            {
            pushFollow(FOLLOW_rule__MountedPart__Group__0__Impl_in_rule__MountedPart__Group__02078);
            rule__MountedPart__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MountedPart__Group__1_in_rule__MountedPart__Group__02081);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1027:1: rule__MountedPart__Group__0__Impl : ( 'mpart' ) ;
    public final void rule__MountedPart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1031:1: ( ( 'mpart' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1032:1: ( 'mpart' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1032:1: ( 'mpart' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1033:1: 'mpart'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedPartAccess().getMpartKeyword_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__MountedPart__Group__0__Impl2109); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1046:1: rule__MountedPart__Group__1 : rule__MountedPart__Group__1__Impl rule__MountedPart__Group__2 ;
    public final void rule__MountedPart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1050:1: ( rule__MountedPart__Group__1__Impl rule__MountedPart__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1051:2: rule__MountedPart__Group__1__Impl rule__MountedPart__Group__2
            {
            pushFollow(FOLLOW_rule__MountedPart__Group__1__Impl_in_rule__MountedPart__Group__12140);
            rule__MountedPart__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MountedPart__Group__2_in_rule__MountedPart__Group__12143);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1058:1: rule__MountedPart__Group__1__Impl : ( ( rule__MountedPart__NameAssignment_1 ) ) ;
    public final void rule__MountedPart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1062:1: ( ( ( rule__MountedPart__NameAssignment_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1063:1: ( ( rule__MountedPart__NameAssignment_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1063:1: ( ( rule__MountedPart__NameAssignment_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1064:1: ( rule__MountedPart__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedPartAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1065:1: ( rule__MountedPart__NameAssignment_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1065:2: rule__MountedPart__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MountedPart__NameAssignment_1_in_rule__MountedPart__Group__1__Impl2170);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1075:1: rule__MountedPart__Group__2 : rule__MountedPart__Group__2__Impl rule__MountedPart__Group__3 ;
    public final void rule__MountedPart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1079:1: ( rule__MountedPart__Group__2__Impl rule__MountedPart__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1080:2: rule__MountedPart__Group__2__Impl rule__MountedPart__Group__3
            {
            pushFollow(FOLLOW_rule__MountedPart__Group__2__Impl_in_rule__MountedPart__Group__22200);
            rule__MountedPart__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MountedPart__Group__3_in_rule__MountedPart__Group__22203);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1087:1: rule__MountedPart__Group__2__Impl : ( ( rule__MountedPart__FillAssignment_2 ) ) ;
    public final void rule__MountedPart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1091:1: ( ( ( rule__MountedPart__FillAssignment_2 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1092:1: ( ( rule__MountedPart__FillAssignment_2 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1092:1: ( ( rule__MountedPart__FillAssignment_2 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1093:1: ( rule__MountedPart__FillAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedPartAccess().getFillAssignment_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1094:1: ( rule__MountedPart__FillAssignment_2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1094:2: rule__MountedPart__FillAssignment_2
            {
            pushFollow(FOLLOW_rule__MountedPart__FillAssignment_2_in_rule__MountedPart__Group__2__Impl2230);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1104:1: rule__MountedPart__Group__3 : rule__MountedPart__Group__3__Impl ;
    public final void rule__MountedPart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1108:1: ( rule__MountedPart__Group__3__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1109:2: rule__MountedPart__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MountedPart__Group__3__Impl_in_rule__MountedPart__Group__32260);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1115:1: rule__MountedPart__Group__3__Impl : ( ( rule__MountedPart__SourceAssignment_3 ) ) ;
    public final void rule__MountedPart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1119:1: ( ( ( rule__MountedPart__SourceAssignment_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1120:1: ( ( rule__MountedPart__SourceAssignment_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1120:1: ( ( rule__MountedPart__SourceAssignment_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1121:1: ( rule__MountedPart__SourceAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedPartAccess().getSourceAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1122:1: ( rule__MountedPart__SourceAssignment_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1122:2: rule__MountedPart__SourceAssignment_3
            {
            pushFollow(FOLLOW_rule__MountedPart__SourceAssignment_3_in_rule__MountedPart__Group__3__Impl2287);
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


    // $ANTLR start "rule__Action__Group__0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1140:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1144:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1145:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__02325);
            rule__Action__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Action__Group__1_in_rule__Action__Group__02328);
            rule__Action__Group__1();

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
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1152:1: rule__Action__Group__0__Impl : ( ( rule__Action__NameAssignment_0 ) ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1156:1: ( ( ( rule__Action__NameAssignment_0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1157:1: ( ( rule__Action__NameAssignment_0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1157:1: ( ( rule__Action__NameAssignment_0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1158:1: ( rule__Action__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getNameAssignment_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1159:1: ( rule__Action__NameAssignment_0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1159:2: rule__Action__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Action__NameAssignment_0_in_rule__Action__Group__0__Impl2355);
            rule__Action__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1169:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1173:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1174:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__12385);
            rule__Action__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Action__Group__2_in_rule__Action__Group__12388);
            rule__Action__Group__2();

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
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1181:1: rule__Action__Group__1__Impl : ( ( rule__Action__TypeAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1185:1: ( ( ( rule__Action__TypeAssignment_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1186:1: ( ( rule__Action__TypeAssignment_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1186:1: ( ( rule__Action__TypeAssignment_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1187:1: ( rule__Action__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getTypeAssignment_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1188:1: ( rule__Action__TypeAssignment_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1188:2: rule__Action__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Action__TypeAssignment_1_in_rule__Action__Group__1__Impl2415);
            rule__Action__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getTypeAssignment_1()); 
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
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__2"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1198:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1202:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1203:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__22445);
            rule__Action__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Action__Group__3_in_rule__Action__Group__22448);
            rule__Action__Group__3();

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
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1210:1: rule__Action__Group__2__Impl : ( ( rule__Action__AxisAssignment_2 ) ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1214:1: ( ( ( rule__Action__AxisAssignment_2 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1215:1: ( ( rule__Action__AxisAssignment_2 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1215:1: ( ( rule__Action__AxisAssignment_2 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1216:1: ( rule__Action__AxisAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getAxisAssignment_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1217:1: ( rule__Action__AxisAssignment_2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1217:2: rule__Action__AxisAssignment_2
            {
            pushFollow(FOLLOW_rule__Action__AxisAssignment_2_in_rule__Action__Group__2__Impl2475);
            rule__Action__AxisAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getAxisAssignment_2()); 
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
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__Action__Group__3"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1227:1: rule__Action__Group__3 : rule__Action__Group__3__Impl rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1231:1: ( rule__Action__Group__3__Impl rule__Action__Group__4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1232:2: rule__Action__Group__3__Impl rule__Action__Group__4
            {
            pushFollow(FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__32505);
            rule__Action__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Action__Group__4_in_rule__Action__Group__32508);
            rule__Action__Group__4();

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
    // $ANTLR end "rule__Action__Group__3"


    // $ANTLR start "rule__Action__Group__3__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1239:1: rule__Action__Group__3__Impl : ( ( rule__Action__AngleAssignment_3 ) ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1243:1: ( ( ( rule__Action__AngleAssignment_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1244:1: ( ( rule__Action__AngleAssignment_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1244:1: ( ( rule__Action__AngleAssignment_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1245:1: ( rule__Action__AngleAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getAngleAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1246:1: ( rule__Action__AngleAssignment_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1246:2: rule__Action__AngleAssignment_3
            {
            pushFollow(FOLLOW_rule__Action__AngleAssignment_3_in_rule__Action__Group__3__Impl2535);
            rule__Action__AngleAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getAngleAssignment_3()); 
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
    // $ANTLR end "rule__Action__Group__3__Impl"


    // $ANTLR start "rule__Action__Group__4"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1256:1: rule__Action__Group__4 : rule__Action__Group__4__Impl rule__Action__Group__5 ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1260:1: ( rule__Action__Group__4__Impl rule__Action__Group__5 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1261:2: rule__Action__Group__4__Impl rule__Action__Group__5
            {
            pushFollow(FOLLOW_rule__Action__Group__4__Impl_in_rule__Action__Group__42565);
            rule__Action__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Action__Group__5_in_rule__Action__Group__42568);
            rule__Action__Group__5();

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
    // $ANTLR end "rule__Action__Group__4"


    // $ANTLR start "rule__Action__Group__4__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1268:1: rule__Action__Group__4__Impl : ( 'duration' ) ;
    public final void rule__Action__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1272:1: ( ( 'duration' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1273:1: ( 'duration' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1273:1: ( 'duration' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1274:1: 'duration'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getDurationKeyword_4()); 
            }
            match(input,22,FOLLOW_22_in_rule__Action__Group__4__Impl2596); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getDurationKeyword_4()); 
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
    // $ANTLR end "rule__Action__Group__4__Impl"


    // $ANTLR start "rule__Action__Group__5"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1287:1: rule__Action__Group__5 : rule__Action__Group__5__Impl rule__Action__Group__6 ;
    public final void rule__Action__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1291:1: ( rule__Action__Group__5__Impl rule__Action__Group__6 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1292:2: rule__Action__Group__5__Impl rule__Action__Group__6
            {
            pushFollow(FOLLOW_rule__Action__Group__5__Impl_in_rule__Action__Group__52627);
            rule__Action__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Action__Group__6_in_rule__Action__Group__52630);
            rule__Action__Group__6();

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
    // $ANTLR end "rule__Action__Group__5"


    // $ANTLR start "rule__Action__Group__5__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1299:1: rule__Action__Group__5__Impl : ( ( rule__Action__DurationAssignment_5 ) ) ;
    public final void rule__Action__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1303:1: ( ( ( rule__Action__DurationAssignment_5 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1304:1: ( ( rule__Action__DurationAssignment_5 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1304:1: ( ( rule__Action__DurationAssignment_5 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1305:1: ( rule__Action__DurationAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getDurationAssignment_5()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1306:1: ( rule__Action__DurationAssignment_5 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1306:2: rule__Action__DurationAssignment_5
            {
            pushFollow(FOLLOW_rule__Action__DurationAssignment_5_in_rule__Action__Group__5__Impl2657);
            rule__Action__DurationAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getDurationAssignment_5()); 
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
    // $ANTLR end "rule__Action__Group__5__Impl"


    // $ANTLR start "rule__Action__Group__6"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1316:1: rule__Action__Group__6 : rule__Action__Group__6__Impl ;
    public final void rule__Action__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1320:1: ( rule__Action__Group__6__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1321:2: rule__Action__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group__6__Impl_in_rule__Action__Group__62687);
            rule__Action__Group__6__Impl();

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
    // $ANTLR end "rule__Action__Group__6"


    // $ANTLR start "rule__Action__Group__6__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1327:1: rule__Action__Group__6__Impl : ( ( rule__Action__Group_6__0 )? ) ;
    public final void rule__Action__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1331:1: ( ( ( rule__Action__Group_6__0 )? ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1332:1: ( ( rule__Action__Group_6__0 )? )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1332:1: ( ( rule__Action__Group_6__0 )? )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1333:1: ( rule__Action__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getGroup_6()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1334:1: ( rule__Action__Group_6__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1334:2: rule__Action__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Action__Group_6__0_in_rule__Action__Group__6__Impl2714);
                    rule__Action__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getGroup_6()); 
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
    // $ANTLR end "rule__Action__Group__6__Impl"


    // $ANTLR start "rule__Action__Group_6__0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1358:1: rule__Action__Group_6__0 : rule__Action__Group_6__0__Impl rule__Action__Group_6__1 ;
    public final void rule__Action__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1362:1: ( rule__Action__Group_6__0__Impl rule__Action__Group_6__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1363:2: rule__Action__Group_6__0__Impl rule__Action__Group_6__1
            {
            pushFollow(FOLLOW_rule__Action__Group_6__0__Impl_in_rule__Action__Group_6__02759);
            rule__Action__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Action__Group_6__1_in_rule__Action__Group_6__02762);
            rule__Action__Group_6__1();

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
    // $ANTLR end "rule__Action__Group_6__0"


    // $ANTLR start "rule__Action__Group_6__0__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1370:1: rule__Action__Group_6__0__Impl : ( 'sound-file' ) ;
    public final void rule__Action__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1374:1: ( ( 'sound-file' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1375:1: ( 'sound-file' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1375:1: ( 'sound-file' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1376:1: 'sound-file'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getSoundFileKeyword_6_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Action__Group_6__0__Impl2790); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getSoundFileKeyword_6_0()); 
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
    // $ANTLR end "rule__Action__Group_6__0__Impl"


    // $ANTLR start "rule__Action__Group_6__1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1389:1: rule__Action__Group_6__1 : rule__Action__Group_6__1__Impl ;
    public final void rule__Action__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1393:1: ( rule__Action__Group_6__1__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1394:2: rule__Action__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group_6__1__Impl_in_rule__Action__Group_6__12821);
            rule__Action__Group_6__1__Impl();

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
    // $ANTLR end "rule__Action__Group_6__1"


    // $ANTLR start "rule__Action__Group_6__1__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1400:1: rule__Action__Group_6__1__Impl : ( ( rule__Action__SoundfileAssignment_6_1 ) ) ;
    public final void rule__Action__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1404:1: ( ( ( rule__Action__SoundfileAssignment_6_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1405:1: ( ( rule__Action__SoundfileAssignment_6_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1405:1: ( ( rule__Action__SoundfileAssignment_6_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1406:1: ( rule__Action__SoundfileAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getSoundfileAssignment_6_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1407:1: ( rule__Action__SoundfileAssignment_6_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1407:2: rule__Action__SoundfileAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Action__SoundfileAssignment_6_1_in_rule__Action__Group_6__1__Impl2848);
            rule__Action__SoundfileAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getSoundfileAssignment_6_1()); 
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
    // $ANTLR end "rule__Action__Group_6__1__Impl"


    // $ANTLR start "rule__Color__Group__0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1421:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1425:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1426:2: rule__Color__Group__0__Impl rule__Color__Group__1
            {
            pushFollow(FOLLOW_rule__Color__Group__0__Impl_in_rule__Color__Group__02882);
            rule__Color__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Color__Group__1_in_rule__Color__Group__02885);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1433:1: rule__Color__Group__0__Impl : ( 'rgb' ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1437:1: ( ( 'rgb' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1438:1: ( 'rgb' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1438:1: ( 'rgb' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1439:1: 'rgb'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getRgbKeyword_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Color__Group__0__Impl2913); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1452:1: rule__Color__Group__1 : rule__Color__Group__1__Impl rule__Color__Group__2 ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1456:1: ( rule__Color__Group__1__Impl rule__Color__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1457:2: rule__Color__Group__1__Impl rule__Color__Group__2
            {
            pushFollow(FOLLOW_rule__Color__Group__1__Impl_in_rule__Color__Group__12944);
            rule__Color__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Color__Group__2_in_rule__Color__Group__12947);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1464:1: rule__Color__Group__1__Impl : ( ( rule__Color__RAssignment_1 ) ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1468:1: ( ( ( rule__Color__RAssignment_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1469:1: ( ( rule__Color__RAssignment_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1469:1: ( ( rule__Color__RAssignment_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1470:1: ( rule__Color__RAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getRAssignment_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1471:1: ( rule__Color__RAssignment_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1471:2: rule__Color__RAssignment_1
            {
            pushFollow(FOLLOW_rule__Color__RAssignment_1_in_rule__Color__Group__1__Impl2974);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1481:1: rule__Color__Group__2 : rule__Color__Group__2__Impl rule__Color__Group__3 ;
    public final void rule__Color__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1485:1: ( rule__Color__Group__2__Impl rule__Color__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1486:2: rule__Color__Group__2__Impl rule__Color__Group__3
            {
            pushFollow(FOLLOW_rule__Color__Group__2__Impl_in_rule__Color__Group__23004);
            rule__Color__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Color__Group__3_in_rule__Color__Group__23007);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1493:1: rule__Color__Group__2__Impl : ( ( rule__Color__GAssignment_2 ) ) ;
    public final void rule__Color__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1497:1: ( ( ( rule__Color__GAssignment_2 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1498:1: ( ( rule__Color__GAssignment_2 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1498:1: ( ( rule__Color__GAssignment_2 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1499:1: ( rule__Color__GAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getGAssignment_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1500:1: ( rule__Color__GAssignment_2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1500:2: rule__Color__GAssignment_2
            {
            pushFollow(FOLLOW_rule__Color__GAssignment_2_in_rule__Color__Group__2__Impl3034);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1510:1: rule__Color__Group__3 : rule__Color__Group__3__Impl ;
    public final void rule__Color__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1514:1: ( rule__Color__Group__3__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1515:2: rule__Color__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Color__Group__3__Impl_in_rule__Color__Group__33064);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1521:1: rule__Color__Group__3__Impl : ( ( rule__Color__BAssignment_3 ) ) ;
    public final void rule__Color__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1525:1: ( ( ( rule__Color__BAssignment_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1526:1: ( ( rule__Color__BAssignment_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1526:1: ( ( rule__Color__BAssignment_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1527:1: ( rule__Color__BAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getBAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1528:1: ( rule__Color__BAssignment_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1528:2: rule__Color__BAssignment_3
            {
            pushFollow(FOLLOW_rule__Color__BAssignment_3_in_rule__Color__Group__3__Impl3091);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1546:1: rule__Brick__Group__0 : rule__Brick__Group__0__Impl rule__Brick__Group__1 ;
    public final void rule__Brick__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1550:1: ( rule__Brick__Group__0__Impl rule__Brick__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1551:2: rule__Brick__Group__0__Impl rule__Brick__Group__1
            {
            pushFollow(FOLLOW_rule__Brick__Group__0__Impl_in_rule__Brick__Group__03129);
            rule__Brick__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Brick__Group__1_in_rule__Brick__Group__03132);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1558:1: rule__Brick__Group__0__Impl : ( 'brick' ) ;
    public final void rule__Brick__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1562:1: ( ( 'brick' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1563:1: ( 'brick' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1563:1: ( 'brick' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1564:1: 'brick'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getBrickKeyword_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Brick__Group__0__Impl3160); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1577:1: rule__Brick__Group__1 : rule__Brick__Group__1__Impl rule__Brick__Group__2 ;
    public final void rule__Brick__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1581:1: ( rule__Brick__Group__1__Impl rule__Brick__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1582:2: rule__Brick__Group__1__Impl rule__Brick__Group__2
            {
            pushFollow(FOLLOW_rule__Brick__Group__1__Impl_in_rule__Brick__Group__13191);
            rule__Brick__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Brick__Group__2_in_rule__Brick__Group__13194);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1589:1: rule__Brick__Group__1__Impl : ( ( rule__Brick__NameAssignment_1 ) ) ;
    public final void rule__Brick__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1593:1: ( ( ( rule__Brick__NameAssignment_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1594:1: ( ( rule__Brick__NameAssignment_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1594:1: ( ( rule__Brick__NameAssignment_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1595:1: ( rule__Brick__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1596:1: ( rule__Brick__NameAssignment_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1596:2: rule__Brick__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Brick__NameAssignment_1_in_rule__Brick__Group__1__Impl3221);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1606:1: rule__Brick__Group__2 : rule__Brick__Group__2__Impl rule__Brick__Group__3 ;
    public final void rule__Brick__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1610:1: ( rule__Brick__Group__2__Impl rule__Brick__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1611:2: rule__Brick__Group__2__Impl rule__Brick__Group__3
            {
            pushFollow(FOLLOW_rule__Brick__Group__2__Impl_in_rule__Brick__Group__23251);
            rule__Brick__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Brick__Group__3_in_rule__Brick__Group__23254);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1618:1: rule__Brick__Group__2__Impl : ( 'units' ) ;
    public final void rule__Brick__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1622:1: ( ( 'units' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1623:1: ( 'units' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1623:1: ( 'units' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1624:1: 'units'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getUnitsKeyword_2()); 
            }
            match(input,26,FOLLOW_26_in_rule__Brick__Group__2__Impl3282); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1637:1: rule__Brick__Group__3 : rule__Brick__Group__3__Impl rule__Brick__Group__4 ;
    public final void rule__Brick__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1641:1: ( rule__Brick__Group__3__Impl rule__Brick__Group__4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1642:2: rule__Brick__Group__3__Impl rule__Brick__Group__4
            {
            pushFollow(FOLLOW_rule__Brick__Group__3__Impl_in_rule__Brick__Group__33313);
            rule__Brick__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Brick__Group__4_in_rule__Brick__Group__33316);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1649:1: rule__Brick__Group__3__Impl : ( ( rule__Brick__XUnitsAssignment_3 ) ) ;
    public final void rule__Brick__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1653:1: ( ( ( rule__Brick__XUnitsAssignment_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1654:1: ( ( rule__Brick__XUnitsAssignment_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1654:1: ( ( rule__Brick__XUnitsAssignment_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1655:1: ( rule__Brick__XUnitsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getXUnitsAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1656:1: ( rule__Brick__XUnitsAssignment_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1656:2: rule__Brick__XUnitsAssignment_3
            {
            pushFollow(FOLLOW_rule__Brick__XUnitsAssignment_3_in_rule__Brick__Group__3__Impl3343);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1666:1: rule__Brick__Group__4 : rule__Brick__Group__4__Impl rule__Brick__Group__5 ;
    public final void rule__Brick__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1670:1: ( rule__Brick__Group__4__Impl rule__Brick__Group__5 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1671:2: rule__Brick__Group__4__Impl rule__Brick__Group__5
            {
            pushFollow(FOLLOW_rule__Brick__Group__4__Impl_in_rule__Brick__Group__43373);
            rule__Brick__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Brick__Group__5_in_rule__Brick__Group__43376);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1678:1: rule__Brick__Group__4__Impl : ( ( rule__Brick__YUnitsAssignment_4 ) ) ;
    public final void rule__Brick__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1682:1: ( ( ( rule__Brick__YUnitsAssignment_4 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1683:1: ( ( rule__Brick__YUnitsAssignment_4 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1683:1: ( ( rule__Brick__YUnitsAssignment_4 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1684:1: ( rule__Brick__YUnitsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getYUnitsAssignment_4()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1685:1: ( rule__Brick__YUnitsAssignment_4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1685:2: rule__Brick__YUnitsAssignment_4
            {
            pushFollow(FOLLOW_rule__Brick__YUnitsAssignment_4_in_rule__Brick__Group__4__Impl3403);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1695:1: rule__Brick__Group__5 : rule__Brick__Group__5__Impl rule__Brick__Group__6 ;
    public final void rule__Brick__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1699:1: ( rule__Brick__Group__5__Impl rule__Brick__Group__6 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1700:2: rule__Brick__Group__5__Impl rule__Brick__Group__6
            {
            pushFollow(FOLLOW_rule__Brick__Group__5__Impl_in_rule__Brick__Group__53433);
            rule__Brick__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Brick__Group__6_in_rule__Brick__Group__53436);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1707:1: rule__Brick__Group__5__Impl : ( ( rule__Brick__ZUnitsAssignment_5 ) ) ;
    public final void rule__Brick__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1711:1: ( ( ( rule__Brick__ZUnitsAssignment_5 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1712:1: ( ( rule__Brick__ZUnitsAssignment_5 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1712:1: ( ( rule__Brick__ZUnitsAssignment_5 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1713:1: ( rule__Brick__ZUnitsAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getZUnitsAssignment_5()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1714:1: ( rule__Brick__ZUnitsAssignment_5 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1714:2: rule__Brick__ZUnitsAssignment_5
            {
            pushFollow(FOLLOW_rule__Brick__ZUnitsAssignment_5_in_rule__Brick__Group__5__Impl3463);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1724:1: rule__Brick__Group__6 : rule__Brick__Group__6__Impl rule__Brick__Group__7 ;
    public final void rule__Brick__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1728:1: ( rule__Brick__Group__6__Impl rule__Brick__Group__7 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1729:2: rule__Brick__Group__6__Impl rule__Brick__Group__7
            {
            pushFollow(FOLLOW_rule__Brick__Group__6__Impl_in_rule__Brick__Group__63493);
            rule__Brick__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Brick__Group__7_in_rule__Brick__Group__63496);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1736:1: rule__Brick__Group__6__Impl : ( ( rule__Brick__FillAssignment_6 ) ) ;
    public final void rule__Brick__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1740:1: ( ( ( rule__Brick__FillAssignment_6 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1741:1: ( ( rule__Brick__FillAssignment_6 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1741:1: ( ( rule__Brick__FillAssignment_6 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1742:1: ( rule__Brick__FillAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getFillAssignment_6()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1743:1: ( rule__Brick__FillAssignment_6 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1743:2: rule__Brick__FillAssignment_6
            {
            pushFollow(FOLLOW_rule__Brick__FillAssignment_6_in_rule__Brick__Group__6__Impl3523);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1753:1: rule__Brick__Group__7 : rule__Brick__Group__7__Impl ;
    public final void rule__Brick__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1757:1: ( rule__Brick__Group__7__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1758:2: rule__Brick__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Brick__Group__7__Impl_in_rule__Brick__Group__73553);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1764:1: rule__Brick__Group__7__Impl : ( ( rule__Brick__SourceAssignment_7 ) ) ;
    public final void rule__Brick__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1768:1: ( ( ( rule__Brick__SourceAssignment_7 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1769:1: ( ( rule__Brick__SourceAssignment_7 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1769:1: ( ( rule__Brick__SourceAssignment_7 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1770:1: ( rule__Brick__SourceAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getSourceAssignment_7()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1771:1: ( rule__Brick__SourceAssignment_7 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1771:2: rule__Brick__SourceAssignment_7
            {
            pushFollow(FOLLOW_rule__Brick__SourceAssignment_7_in_rule__Brick__Group__7__Impl3580);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1797:1: rule__Generated__Group__0 : rule__Generated__Group__0__Impl rule__Generated__Group__1 ;
    public final void rule__Generated__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1801:1: ( rule__Generated__Group__0__Impl rule__Generated__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1802:2: rule__Generated__Group__0__Impl rule__Generated__Group__1
            {
            pushFollow(FOLLOW_rule__Generated__Group__0__Impl_in_rule__Generated__Group__03626);
            rule__Generated__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generated__Group__1_in_rule__Generated__Group__03629);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1809:1: rule__Generated__Group__0__Impl : ( 'generated' ) ;
    public final void rule__Generated__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1813:1: ( ( 'generated' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1814:1: ( 'generated' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1814:1: ( 'generated' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1815:1: 'generated'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getGeneratedKeyword_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Generated__Group__0__Impl3657); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1828:1: rule__Generated__Group__1 : rule__Generated__Group__1__Impl rule__Generated__Group__2 ;
    public final void rule__Generated__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1832:1: ( rule__Generated__Group__1__Impl rule__Generated__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1833:2: rule__Generated__Group__1__Impl rule__Generated__Group__2
            {
            pushFollow(FOLLOW_rule__Generated__Group__1__Impl_in_rule__Generated__Group__13688);
            rule__Generated__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generated__Group__2_in_rule__Generated__Group__13691);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1840:1: rule__Generated__Group__1__Impl : ( () ) ;
    public final void rule__Generated__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1844:1: ( ( () ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1845:1: ( () )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1845:1: ( () )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1846:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getGeneratedAction_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1847:1: ()
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1849:1: 
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1859:1: rule__Generated__Group__2 : rule__Generated__Group__2__Impl ;
    public final void rule__Generated__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1863:1: ( rule__Generated__Group__2__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1864:2: rule__Generated__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Generated__Group__2__Impl_in_rule__Generated__Group__23749);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1870:1: rule__Generated__Group__2__Impl : ( ( rule__Generated__Group_2__0 )? ) ;
    public final void rule__Generated__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1874:1: ( ( ( rule__Generated__Group_2__0 )? ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1875:1: ( ( rule__Generated__Group_2__0 )? )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1875:1: ( ( rule__Generated__Group_2__0 )? )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1876:1: ( rule__Generated__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getGroup_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1877:1: ( rule__Generated__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==35) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1877:2: rule__Generated__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Generated__Group_2__0_in_rule__Generated__Group__2__Impl3776);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1893:1: rule__Generated__Group_2__0 : rule__Generated__Group_2__0__Impl rule__Generated__Group_2__1 ;
    public final void rule__Generated__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1897:1: ( rule__Generated__Group_2__0__Impl rule__Generated__Group_2__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1898:2: rule__Generated__Group_2__0__Impl rule__Generated__Group_2__1
            {
            pushFollow(FOLLOW_rule__Generated__Group_2__0__Impl_in_rule__Generated__Group_2__03813);
            rule__Generated__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generated__Group_2__1_in_rule__Generated__Group_2__03816);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1905:1: rule__Generated__Group_2__0__Impl : ( ( rule__Generated__TypeAssignment_2_0 ) ) ;
    public final void rule__Generated__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1909:1: ( ( ( rule__Generated__TypeAssignment_2_0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1910:1: ( ( rule__Generated__TypeAssignment_2_0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1910:1: ( ( rule__Generated__TypeAssignment_2_0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1911:1: ( rule__Generated__TypeAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getTypeAssignment_2_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1912:1: ( rule__Generated__TypeAssignment_2_0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1912:2: rule__Generated__TypeAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Generated__TypeAssignment_2_0_in_rule__Generated__Group_2__0__Impl3843);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1922:1: rule__Generated__Group_2__1 : rule__Generated__Group_2__1__Impl rule__Generated__Group_2__2 ;
    public final void rule__Generated__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1926:1: ( rule__Generated__Group_2__1__Impl rule__Generated__Group_2__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1927:2: rule__Generated__Group_2__1__Impl rule__Generated__Group_2__2
            {
            pushFollow(FOLLOW_rule__Generated__Group_2__1__Impl_in_rule__Generated__Group_2__13873);
            rule__Generated__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generated__Group_2__2_in_rule__Generated__Group_2__13876);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1934:1: rule__Generated__Group_2__1__Impl : ( ( rule__Generated__WidthAssignment_2_1 ) ) ;
    public final void rule__Generated__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1938:1: ( ( ( rule__Generated__WidthAssignment_2_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1939:1: ( ( rule__Generated__WidthAssignment_2_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1939:1: ( ( rule__Generated__WidthAssignment_2_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1940:1: ( rule__Generated__WidthAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getWidthAssignment_2_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1941:1: ( rule__Generated__WidthAssignment_2_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1941:2: rule__Generated__WidthAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Generated__WidthAssignment_2_1_in_rule__Generated__Group_2__1__Impl3903);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1951:1: rule__Generated__Group_2__2 : rule__Generated__Group_2__2__Impl rule__Generated__Group_2__3 ;
    public final void rule__Generated__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1955:1: ( rule__Generated__Group_2__2__Impl rule__Generated__Group_2__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1956:2: rule__Generated__Group_2__2__Impl rule__Generated__Group_2__3
            {
            pushFollow(FOLLOW_rule__Generated__Group_2__2__Impl_in_rule__Generated__Group_2__23933);
            rule__Generated__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generated__Group_2__3_in_rule__Generated__Group_2__23936);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1963:1: rule__Generated__Group_2__2__Impl : ( ( rule__Generated__HeightAssignment_2_2 ) ) ;
    public final void rule__Generated__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1967:1: ( ( ( rule__Generated__HeightAssignment_2_2 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1968:1: ( ( rule__Generated__HeightAssignment_2_2 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1968:1: ( ( rule__Generated__HeightAssignment_2_2 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1969:1: ( rule__Generated__HeightAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getHeightAssignment_2_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1970:1: ( rule__Generated__HeightAssignment_2_2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1970:2: rule__Generated__HeightAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Generated__HeightAssignment_2_2_in_rule__Generated__Group_2__2__Impl3963);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1980:1: rule__Generated__Group_2__3 : rule__Generated__Group_2__3__Impl rule__Generated__Group_2__4 ;
    public final void rule__Generated__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1984:1: ( rule__Generated__Group_2__3__Impl rule__Generated__Group_2__4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1985:2: rule__Generated__Group_2__3__Impl rule__Generated__Group_2__4
            {
            pushFollow(FOLLOW_rule__Generated__Group_2__3__Impl_in_rule__Generated__Group_2__33993);
            rule__Generated__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generated__Group_2__4_in_rule__Generated__Group_2__33996);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1992:1: rule__Generated__Group_2__3__Impl : ( ( rule__Generated__DepthAssignment_2_3 ) ) ;
    public final void rule__Generated__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1996:1: ( ( ( rule__Generated__DepthAssignment_2_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1997:1: ( ( rule__Generated__DepthAssignment_2_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1997:1: ( ( rule__Generated__DepthAssignment_2_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1998:1: ( rule__Generated__DepthAssignment_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getDepthAssignment_2_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1999:1: ( rule__Generated__DepthAssignment_2_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1999:2: rule__Generated__DepthAssignment_2_3
            {
            pushFollow(FOLLOW_rule__Generated__DepthAssignment_2_3_in_rule__Generated__Group_2__3__Impl4023);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2009:1: rule__Generated__Group_2__4 : rule__Generated__Group_2__4__Impl ;
    public final void rule__Generated__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2013:1: ( rule__Generated__Group_2__4__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2014:2: rule__Generated__Group_2__4__Impl
            {
            pushFollow(FOLLOW_rule__Generated__Group_2__4__Impl_in_rule__Generated__Group_2__44053);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2020:1: rule__Generated__Group_2__4__Impl : ( ( rule__Generated__Group_2_4__0 )? ) ;
    public final void rule__Generated__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2024:1: ( ( ( rule__Generated__Group_2_4__0 )? ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2025:1: ( ( rule__Generated__Group_2_4__0 )? )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2025:1: ( ( rule__Generated__Group_2_4__0 )? )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2026:1: ( rule__Generated__Group_2_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getGroup_2_4()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2027:1: ( rule__Generated__Group_2_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2027:2: rule__Generated__Group_2_4__0
                    {
                    pushFollow(FOLLOW_rule__Generated__Group_2_4__0_in_rule__Generated__Group_2__4__Impl4080);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2047:1: rule__Generated__Group_2_4__0 : rule__Generated__Group_2_4__0__Impl rule__Generated__Group_2_4__1 ;
    public final void rule__Generated__Group_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2051:1: ( rule__Generated__Group_2_4__0__Impl rule__Generated__Group_2_4__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2052:2: rule__Generated__Group_2_4__0__Impl rule__Generated__Group_2_4__1
            {
            pushFollow(FOLLOW_rule__Generated__Group_2_4__0__Impl_in_rule__Generated__Group_2_4__04121);
            rule__Generated__Group_2_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generated__Group_2_4__1_in_rule__Generated__Group_2_4__04124);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2059:1: rule__Generated__Group_2_4__0__Impl : ( 'origin' ) ;
    public final void rule__Generated__Group_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2063:1: ( ( 'origin' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2064:1: ( 'origin' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2064:1: ( 'origin' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2065:1: 'origin'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getOriginKeyword_2_4_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__Generated__Group_2_4__0__Impl4152); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2078:1: rule__Generated__Group_2_4__1 : rule__Generated__Group_2_4__1__Impl rule__Generated__Group_2_4__2 ;
    public final void rule__Generated__Group_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2082:1: ( rule__Generated__Group_2_4__1__Impl rule__Generated__Group_2_4__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2083:2: rule__Generated__Group_2_4__1__Impl rule__Generated__Group_2_4__2
            {
            pushFollow(FOLLOW_rule__Generated__Group_2_4__1__Impl_in_rule__Generated__Group_2_4__14183);
            rule__Generated__Group_2_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generated__Group_2_4__2_in_rule__Generated__Group_2_4__14186);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2090:1: rule__Generated__Group_2_4__1__Impl : ( ( rule__Generated__OriginXAssignment_2_4_1 ) ) ;
    public final void rule__Generated__Group_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2094:1: ( ( ( rule__Generated__OriginXAssignment_2_4_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2095:1: ( ( rule__Generated__OriginXAssignment_2_4_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2095:1: ( ( rule__Generated__OriginXAssignment_2_4_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2096:1: ( rule__Generated__OriginXAssignment_2_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getOriginXAssignment_2_4_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2097:1: ( rule__Generated__OriginXAssignment_2_4_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2097:2: rule__Generated__OriginXAssignment_2_4_1
            {
            pushFollow(FOLLOW_rule__Generated__OriginXAssignment_2_4_1_in_rule__Generated__Group_2_4__1__Impl4213);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2107:1: rule__Generated__Group_2_4__2 : rule__Generated__Group_2_4__2__Impl rule__Generated__Group_2_4__3 ;
    public final void rule__Generated__Group_2_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2111:1: ( rule__Generated__Group_2_4__2__Impl rule__Generated__Group_2_4__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2112:2: rule__Generated__Group_2_4__2__Impl rule__Generated__Group_2_4__3
            {
            pushFollow(FOLLOW_rule__Generated__Group_2_4__2__Impl_in_rule__Generated__Group_2_4__24243);
            rule__Generated__Group_2_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generated__Group_2_4__3_in_rule__Generated__Group_2_4__24246);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2119:1: rule__Generated__Group_2_4__2__Impl : ( ( rule__Generated__OriginYAssignment_2_4_2 ) ) ;
    public final void rule__Generated__Group_2_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2123:1: ( ( ( rule__Generated__OriginYAssignment_2_4_2 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2124:1: ( ( rule__Generated__OriginYAssignment_2_4_2 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2124:1: ( ( rule__Generated__OriginYAssignment_2_4_2 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2125:1: ( rule__Generated__OriginYAssignment_2_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getOriginYAssignment_2_4_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2126:1: ( rule__Generated__OriginYAssignment_2_4_2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2126:2: rule__Generated__OriginYAssignment_2_4_2
            {
            pushFollow(FOLLOW_rule__Generated__OriginYAssignment_2_4_2_in_rule__Generated__Group_2_4__2__Impl4273);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2136:1: rule__Generated__Group_2_4__3 : rule__Generated__Group_2_4__3__Impl ;
    public final void rule__Generated__Group_2_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2140:1: ( rule__Generated__Group_2_4__3__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2141:2: rule__Generated__Group_2_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Generated__Group_2_4__3__Impl_in_rule__Generated__Group_2_4__34303);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2147:1: rule__Generated__Group_2_4__3__Impl : ( ( rule__Generated__OriginZAssignment_2_4_3 ) ) ;
    public final void rule__Generated__Group_2_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2151:1: ( ( ( rule__Generated__OriginZAssignment_2_4_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2152:1: ( ( rule__Generated__OriginZAssignment_2_4_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2152:1: ( ( rule__Generated__OriginZAssignment_2_4_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2153:1: ( rule__Generated__OriginZAssignment_2_4_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getOriginZAssignment_2_4_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2154:1: ( rule__Generated__OriginZAssignment_2_4_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2154:2: rule__Generated__OriginZAssignment_2_4_3
            {
            pushFollow(FOLLOW_rule__Generated__OriginZAssignment_2_4_3_in_rule__Generated__Group_2_4__3__Impl4330);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2172:1: rule__FxmlInclude__Group__0 : rule__FxmlInclude__Group__0__Impl rule__FxmlInclude__Group__1 ;
    public final void rule__FxmlInclude__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2176:1: ( rule__FxmlInclude__Group__0__Impl rule__FxmlInclude__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2177:2: rule__FxmlInclude__Group__0__Impl rule__FxmlInclude__Group__1
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group__0__Impl_in_rule__FxmlInclude__Group__04368);
            rule__FxmlInclude__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FxmlInclude__Group__1_in_rule__FxmlInclude__Group__04371);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2184:1: rule__FxmlInclude__Group__0__Impl : ( 'fxml' ) ;
    public final void rule__FxmlInclude__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2188:1: ( ( 'fxml' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2189:1: ( 'fxml' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2189:1: ( 'fxml' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2190:1: 'fxml'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getFxmlKeyword_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__FxmlInclude__Group__0__Impl4399); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2203:1: rule__FxmlInclude__Group__1 : rule__FxmlInclude__Group__1__Impl rule__FxmlInclude__Group__2 ;
    public final void rule__FxmlInclude__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2207:1: ( rule__FxmlInclude__Group__1__Impl rule__FxmlInclude__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2208:2: rule__FxmlInclude__Group__1__Impl rule__FxmlInclude__Group__2
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group__1__Impl_in_rule__FxmlInclude__Group__14430);
            rule__FxmlInclude__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FxmlInclude__Group__2_in_rule__FxmlInclude__Group__14433);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2215:1: rule__FxmlInclude__Group__1__Impl : ( ( rule__FxmlInclude__Source3dAssignment_1 ) ) ;
    public final void rule__FxmlInclude__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2219:1: ( ( ( rule__FxmlInclude__Source3dAssignment_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2220:1: ( ( rule__FxmlInclude__Source3dAssignment_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2220:1: ( ( rule__FxmlInclude__Source3dAssignment_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2221:1: ( rule__FxmlInclude__Source3dAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getSource3dAssignment_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2222:1: ( rule__FxmlInclude__Source3dAssignment_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2222:2: rule__FxmlInclude__Source3dAssignment_1
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Source3dAssignment_1_in_rule__FxmlInclude__Group__1__Impl4460);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2232:1: rule__FxmlInclude__Group__2 : rule__FxmlInclude__Group__2__Impl ;
    public final void rule__FxmlInclude__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2236:1: ( rule__FxmlInclude__Group__2__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2237:2: rule__FxmlInclude__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group__2__Impl_in_rule__FxmlInclude__Group__24490);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2243:1: rule__FxmlInclude__Group__2__Impl : ( ( rule__FxmlInclude__Group_2__0 )? ) ;
    public final void rule__FxmlInclude__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2247:1: ( ( ( rule__FxmlInclude__Group_2__0 )? ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2248:1: ( ( rule__FxmlInclude__Group_2__0 )? )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2248:1: ( ( rule__FxmlInclude__Group_2__0 )? )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2249:1: ( rule__FxmlInclude__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getGroup_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2250:1: ( rule__FxmlInclude__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2250:2: rule__FxmlInclude__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__FxmlInclude__Group_2__0_in_rule__FxmlInclude__Group__2__Impl4517);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2266:1: rule__FxmlInclude__Group_2__0 : rule__FxmlInclude__Group_2__0__Impl rule__FxmlInclude__Group_2__1 ;
    public final void rule__FxmlInclude__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2270:1: ( rule__FxmlInclude__Group_2__0__Impl rule__FxmlInclude__Group_2__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2271:2: rule__FxmlInclude__Group_2__0__Impl rule__FxmlInclude__Group_2__1
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group_2__0__Impl_in_rule__FxmlInclude__Group_2__04554);
            rule__FxmlInclude__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FxmlInclude__Group_2__1_in_rule__FxmlInclude__Group_2__04557);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2278:1: rule__FxmlInclude__Group_2__0__Impl : ( 'origin' ) ;
    public final void rule__FxmlInclude__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2282:1: ( ( 'origin' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2283:1: ( 'origin' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2283:1: ( 'origin' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2284:1: 'origin'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getOriginKeyword_2_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__FxmlInclude__Group_2__0__Impl4585); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2297:1: rule__FxmlInclude__Group_2__1 : rule__FxmlInclude__Group_2__1__Impl rule__FxmlInclude__Group_2__2 ;
    public final void rule__FxmlInclude__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2301:1: ( rule__FxmlInclude__Group_2__1__Impl rule__FxmlInclude__Group_2__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2302:2: rule__FxmlInclude__Group_2__1__Impl rule__FxmlInclude__Group_2__2
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group_2__1__Impl_in_rule__FxmlInclude__Group_2__14616);
            rule__FxmlInclude__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FxmlInclude__Group_2__2_in_rule__FxmlInclude__Group_2__14619);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2309:1: rule__FxmlInclude__Group_2__1__Impl : ( ( rule__FxmlInclude__OriginXAssignment_2_1 ) ) ;
    public final void rule__FxmlInclude__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2313:1: ( ( ( rule__FxmlInclude__OriginXAssignment_2_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2314:1: ( ( rule__FxmlInclude__OriginXAssignment_2_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2314:1: ( ( rule__FxmlInclude__OriginXAssignment_2_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2315:1: ( rule__FxmlInclude__OriginXAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getOriginXAssignment_2_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2316:1: ( rule__FxmlInclude__OriginXAssignment_2_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2316:2: rule__FxmlInclude__OriginXAssignment_2_1
            {
            pushFollow(FOLLOW_rule__FxmlInclude__OriginXAssignment_2_1_in_rule__FxmlInclude__Group_2__1__Impl4646);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2326:1: rule__FxmlInclude__Group_2__2 : rule__FxmlInclude__Group_2__2__Impl rule__FxmlInclude__Group_2__3 ;
    public final void rule__FxmlInclude__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2330:1: ( rule__FxmlInclude__Group_2__2__Impl rule__FxmlInclude__Group_2__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2331:2: rule__FxmlInclude__Group_2__2__Impl rule__FxmlInclude__Group_2__3
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group_2__2__Impl_in_rule__FxmlInclude__Group_2__24676);
            rule__FxmlInclude__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FxmlInclude__Group_2__3_in_rule__FxmlInclude__Group_2__24679);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2338:1: rule__FxmlInclude__Group_2__2__Impl : ( ( rule__FxmlInclude__OriginYAssignment_2_2 ) ) ;
    public final void rule__FxmlInclude__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2342:1: ( ( ( rule__FxmlInclude__OriginYAssignment_2_2 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2343:1: ( ( rule__FxmlInclude__OriginYAssignment_2_2 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2343:1: ( ( rule__FxmlInclude__OriginYAssignment_2_2 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2344:1: ( rule__FxmlInclude__OriginYAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getOriginYAssignment_2_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2345:1: ( rule__FxmlInclude__OriginYAssignment_2_2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2345:2: rule__FxmlInclude__OriginYAssignment_2_2
            {
            pushFollow(FOLLOW_rule__FxmlInclude__OriginYAssignment_2_2_in_rule__FxmlInclude__Group_2__2__Impl4706);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2355:1: rule__FxmlInclude__Group_2__3 : rule__FxmlInclude__Group_2__3__Impl ;
    public final void rule__FxmlInclude__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2359:1: ( rule__FxmlInclude__Group_2__3__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2360:2: rule__FxmlInclude__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group_2__3__Impl_in_rule__FxmlInclude__Group_2__34736);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2366:1: rule__FxmlInclude__Group_2__3__Impl : ( ( rule__FxmlInclude__OriginZAssignment_2_3 ) ) ;
    public final void rule__FxmlInclude__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2370:1: ( ( ( rule__FxmlInclude__OriginZAssignment_2_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2371:1: ( ( rule__FxmlInclude__OriginZAssignment_2_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2371:1: ( ( rule__FxmlInclude__OriginZAssignment_2_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2372:1: ( rule__FxmlInclude__OriginZAssignment_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getOriginZAssignment_2_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2373:1: ( rule__FxmlInclude__OriginZAssignment_2_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2373:2: rule__FxmlInclude__OriginZAssignment_2_3
            {
            pushFollow(FOLLOW_rule__FxmlInclude__OriginZAssignment_2_3_in_rule__FxmlInclude__Group_2__3__Impl4763);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2391:1: rule__Assembly__Group__0 : rule__Assembly__Group__0__Impl rule__Assembly__Group__1 ;
    public final void rule__Assembly__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2395:1: ( rule__Assembly__Group__0__Impl rule__Assembly__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2396:2: rule__Assembly__Group__0__Impl rule__Assembly__Group__1
            {
            pushFollow(FOLLOW_rule__Assembly__Group__0__Impl_in_rule__Assembly__Group__04801);
            rule__Assembly__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assembly__Group__1_in_rule__Assembly__Group__04804);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2403:1: rule__Assembly__Group__0__Impl : ( 'assembly' ) ;
    public final void rule__Assembly__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2407:1: ( ( 'assembly' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2408:1: ( 'assembly' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2408:1: ( 'assembly' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2409:1: 'assembly'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getAssemblyKeyword_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__Assembly__Group__0__Impl4832); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2422:1: rule__Assembly__Group__1 : rule__Assembly__Group__1__Impl rule__Assembly__Group__2 ;
    public final void rule__Assembly__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2426:1: ( rule__Assembly__Group__1__Impl rule__Assembly__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2427:2: rule__Assembly__Group__1__Impl rule__Assembly__Group__2
            {
            pushFollow(FOLLOW_rule__Assembly__Group__1__Impl_in_rule__Assembly__Group__14863);
            rule__Assembly__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assembly__Group__2_in_rule__Assembly__Group__14866);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2434:1: rule__Assembly__Group__1__Impl : ( ( rule__Assembly__NameAssignment_1 ) ) ;
    public final void rule__Assembly__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2438:1: ( ( ( rule__Assembly__NameAssignment_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2439:1: ( ( rule__Assembly__NameAssignment_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2439:1: ( ( rule__Assembly__NameAssignment_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2440:1: ( rule__Assembly__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2441:1: ( rule__Assembly__NameAssignment_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2441:2: rule__Assembly__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Assembly__NameAssignment_1_in_rule__Assembly__Group__1__Impl4893);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2451:1: rule__Assembly__Group__2 : rule__Assembly__Group__2__Impl rule__Assembly__Group__3 ;
    public final void rule__Assembly__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2455:1: ( rule__Assembly__Group__2__Impl rule__Assembly__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2456:2: rule__Assembly__Group__2__Impl rule__Assembly__Group__3
            {
            pushFollow(FOLLOW_rule__Assembly__Group__2__Impl_in_rule__Assembly__Group__24923);
            rule__Assembly__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assembly__Group__3_in_rule__Assembly__Group__24926);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2463:1: rule__Assembly__Group__2__Impl : ( '{' ) ;
    public final void rule__Assembly__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2467:1: ( ( '{' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2468:1: ( '{' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2468:1: ( '{' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2469:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,19,FOLLOW_19_in_rule__Assembly__Group__2__Impl4954); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2482:1: rule__Assembly__Group__3 : rule__Assembly__Group__3__Impl rule__Assembly__Group__4 ;
    public final void rule__Assembly__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2486:1: ( rule__Assembly__Group__3__Impl rule__Assembly__Group__4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2487:2: rule__Assembly__Group__3__Impl rule__Assembly__Group__4
            {
            pushFollow(FOLLOW_rule__Assembly__Group__3__Impl_in_rule__Assembly__Group__34985);
            rule__Assembly__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assembly__Group__4_in_rule__Assembly__Group__34988);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2494:1: rule__Assembly__Group__3__Impl : ( ( ( rule__Assembly__ItemsAssignment_3 ) ) ( ( rule__Assembly__ItemsAssignment_3 )* ) ) ;
    public final void rule__Assembly__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2498:1: ( ( ( ( rule__Assembly__ItemsAssignment_3 ) ) ( ( rule__Assembly__ItemsAssignment_3 )* ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2499:1: ( ( ( rule__Assembly__ItemsAssignment_3 ) ) ( ( rule__Assembly__ItemsAssignment_3 )* ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2499:1: ( ( ( rule__Assembly__ItemsAssignment_3 ) ) ( ( rule__Assembly__ItemsAssignment_3 )* ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2500:1: ( ( rule__Assembly__ItemsAssignment_3 ) ) ( ( rule__Assembly__ItemsAssignment_3 )* )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2500:1: ( ( rule__Assembly__ItemsAssignment_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2501:1: ( rule__Assembly__ItemsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getItemsAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2502:1: ( rule__Assembly__ItemsAssignment_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2502:2: rule__Assembly__ItemsAssignment_3
            {
            pushFollow(FOLLOW_rule__Assembly__ItemsAssignment_3_in_rule__Assembly__Group__3__Impl5017);
            rule__Assembly__ItemsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyAccess().getItemsAssignment_3()); 
            }

            }

            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2505:1: ( ( rule__Assembly__ItemsAssignment_3 )* )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2506:1: ( rule__Assembly__ItemsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getItemsAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2507:1: ( rule__Assembly__ItemsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2507:2: rule__Assembly__ItemsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Assembly__ItemsAssignment_3_in_rule__Assembly__Group__3__Impl5029);
            	    rule__Assembly__ItemsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2518:1: rule__Assembly__Group__4 : rule__Assembly__Group__4__Impl ;
    public final void rule__Assembly__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2522:1: ( rule__Assembly__Group__4__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2523:2: rule__Assembly__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Assembly__Group__4__Impl_in_rule__Assembly__Group__45062);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2529:1: rule__Assembly__Group__4__Impl : ( '}' ) ;
    public final void rule__Assembly__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2533:1: ( ( '}' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2534:1: ( '}' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2534:1: ( '}' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2535:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,20,FOLLOW_20_in_rule__Assembly__Group__4__Impl5090); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2558:1: rule__RasterAssemblyItem__Group__0 : rule__RasterAssemblyItem__Group__0__Impl rule__RasterAssemblyItem__Group__1 ;
    public final void rule__RasterAssemblyItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2562:1: ( rule__RasterAssemblyItem__Group__0__Impl rule__RasterAssemblyItem__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2563:2: rule__RasterAssemblyItem__Group__0__Impl rule__RasterAssemblyItem__Group__1
            {
            pushFollow(FOLLOW_rule__RasterAssemblyItem__Group__0__Impl_in_rule__RasterAssemblyItem__Group__05131);
            rule__RasterAssemblyItem__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RasterAssemblyItem__Group__1_in_rule__RasterAssemblyItem__Group__05134);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2570:1: rule__RasterAssemblyItem__Group__0__Impl : ( ( rule__RasterAssemblyItem__ElementAssignment_0 ) ) ;
    public final void rule__RasterAssemblyItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2574:1: ( ( ( rule__RasterAssemblyItem__ElementAssignment_0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2575:1: ( ( rule__RasterAssemblyItem__ElementAssignment_0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2575:1: ( ( rule__RasterAssemblyItem__ElementAssignment_0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2576:1: ( rule__RasterAssemblyItem__ElementAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRasterAssemblyItemAccess().getElementAssignment_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2577:1: ( rule__RasterAssemblyItem__ElementAssignment_0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2577:2: rule__RasterAssemblyItem__ElementAssignment_0
            {
            pushFollow(FOLLOW_rule__RasterAssemblyItem__ElementAssignment_0_in_rule__RasterAssemblyItem__Group__0__Impl5161);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2587:1: rule__RasterAssemblyItem__Group__1 : rule__RasterAssemblyItem__Group__1__Impl rule__RasterAssemblyItem__Group__2 ;
    public final void rule__RasterAssemblyItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2591:1: ( rule__RasterAssemblyItem__Group__1__Impl rule__RasterAssemblyItem__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2592:2: rule__RasterAssemblyItem__Group__1__Impl rule__RasterAssemblyItem__Group__2
            {
            pushFollow(FOLLOW_rule__RasterAssemblyItem__Group__1__Impl_in_rule__RasterAssemblyItem__Group__15191);
            rule__RasterAssemblyItem__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RasterAssemblyItem__Group__2_in_rule__RasterAssemblyItem__Group__15194);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2599:1: rule__RasterAssemblyItem__Group__1__Impl : ( 'pos' ) ;
    public final void rule__RasterAssemblyItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2603:1: ( ( 'pos' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2604:1: ( 'pos' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2604:1: ( 'pos' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2605:1: 'pos'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRasterAssemblyItemAccess().getPosKeyword_1()); 
            }
            match(input,31,FOLLOW_31_in_rule__RasterAssemblyItem__Group__1__Impl5222); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2618:1: rule__RasterAssemblyItem__Group__2 : rule__RasterAssemblyItem__Group__2__Impl rule__RasterAssemblyItem__Group__3 ;
    public final void rule__RasterAssemblyItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2622:1: ( rule__RasterAssemblyItem__Group__2__Impl rule__RasterAssemblyItem__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2623:2: rule__RasterAssemblyItem__Group__2__Impl rule__RasterAssemblyItem__Group__3
            {
            pushFollow(FOLLOW_rule__RasterAssemblyItem__Group__2__Impl_in_rule__RasterAssemblyItem__Group__25253);
            rule__RasterAssemblyItem__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RasterAssemblyItem__Group__3_in_rule__RasterAssemblyItem__Group__25256);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2630:1: rule__RasterAssemblyItem__Group__2__Impl : ( ( rule__RasterAssemblyItem__XUnitsAssignment_2 ) ) ;
    public final void rule__RasterAssemblyItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2634:1: ( ( ( rule__RasterAssemblyItem__XUnitsAssignment_2 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2635:1: ( ( rule__RasterAssemblyItem__XUnitsAssignment_2 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2635:1: ( ( rule__RasterAssemblyItem__XUnitsAssignment_2 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2636:1: ( rule__RasterAssemblyItem__XUnitsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRasterAssemblyItemAccess().getXUnitsAssignment_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2637:1: ( rule__RasterAssemblyItem__XUnitsAssignment_2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2637:2: rule__RasterAssemblyItem__XUnitsAssignment_2
            {
            pushFollow(FOLLOW_rule__RasterAssemblyItem__XUnitsAssignment_2_in_rule__RasterAssemblyItem__Group__2__Impl5283);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2647:1: rule__RasterAssemblyItem__Group__3 : rule__RasterAssemblyItem__Group__3__Impl rule__RasterAssemblyItem__Group__4 ;
    public final void rule__RasterAssemblyItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2651:1: ( rule__RasterAssemblyItem__Group__3__Impl rule__RasterAssemblyItem__Group__4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2652:2: rule__RasterAssemblyItem__Group__3__Impl rule__RasterAssemblyItem__Group__4
            {
            pushFollow(FOLLOW_rule__RasterAssemblyItem__Group__3__Impl_in_rule__RasterAssemblyItem__Group__35313);
            rule__RasterAssemblyItem__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RasterAssemblyItem__Group__4_in_rule__RasterAssemblyItem__Group__35316);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2659:1: rule__RasterAssemblyItem__Group__3__Impl : ( ( rule__RasterAssemblyItem__YUnitsAssignment_3 ) ) ;
    public final void rule__RasterAssemblyItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2663:1: ( ( ( rule__RasterAssemblyItem__YUnitsAssignment_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2664:1: ( ( rule__RasterAssemblyItem__YUnitsAssignment_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2664:1: ( ( rule__RasterAssemblyItem__YUnitsAssignment_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2665:1: ( rule__RasterAssemblyItem__YUnitsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRasterAssemblyItemAccess().getYUnitsAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2666:1: ( rule__RasterAssemblyItem__YUnitsAssignment_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2666:2: rule__RasterAssemblyItem__YUnitsAssignment_3
            {
            pushFollow(FOLLOW_rule__RasterAssemblyItem__YUnitsAssignment_3_in_rule__RasterAssemblyItem__Group__3__Impl5343);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2676:1: rule__RasterAssemblyItem__Group__4 : rule__RasterAssemblyItem__Group__4__Impl rule__RasterAssemblyItem__Group__5 ;
    public final void rule__RasterAssemblyItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2680:1: ( rule__RasterAssemblyItem__Group__4__Impl rule__RasterAssemblyItem__Group__5 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2681:2: rule__RasterAssemblyItem__Group__4__Impl rule__RasterAssemblyItem__Group__5
            {
            pushFollow(FOLLOW_rule__RasterAssemblyItem__Group__4__Impl_in_rule__RasterAssemblyItem__Group__45373);
            rule__RasterAssemblyItem__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RasterAssemblyItem__Group__5_in_rule__RasterAssemblyItem__Group__45376);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2688:1: rule__RasterAssemblyItem__Group__4__Impl : ( ( rule__RasterAssemblyItem__ZUnitsAssignment_4 ) ) ;
    public final void rule__RasterAssemblyItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2692:1: ( ( ( rule__RasterAssemblyItem__ZUnitsAssignment_4 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2693:1: ( ( rule__RasterAssemblyItem__ZUnitsAssignment_4 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2693:1: ( ( rule__RasterAssemblyItem__ZUnitsAssignment_4 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2694:1: ( rule__RasterAssemblyItem__ZUnitsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRasterAssemblyItemAccess().getZUnitsAssignment_4()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2695:1: ( rule__RasterAssemblyItem__ZUnitsAssignment_4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2695:2: rule__RasterAssemblyItem__ZUnitsAssignment_4
            {
            pushFollow(FOLLOW_rule__RasterAssemblyItem__ZUnitsAssignment_4_in_rule__RasterAssemblyItem__Group__4__Impl5403);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2705:1: rule__RasterAssemblyItem__Group__5 : rule__RasterAssemblyItem__Group__5__Impl ;
    public final void rule__RasterAssemblyItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2709:1: ( rule__RasterAssemblyItem__Group__5__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2710:2: rule__RasterAssemblyItem__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__RasterAssemblyItem__Group__5__Impl_in_rule__RasterAssemblyItem__Group__55433);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2716:1: rule__RasterAssemblyItem__Group__5__Impl : ( ( rule__RasterAssemblyItem__Group_5__0 )? ) ;
    public final void rule__RasterAssemblyItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2720:1: ( ( ( rule__RasterAssemblyItem__Group_5__0 )? ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2721:1: ( ( rule__RasterAssemblyItem__Group_5__0 )? )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2721:1: ( ( rule__RasterAssemblyItem__Group_5__0 )? )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2722:1: ( rule__RasterAssemblyItem__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRasterAssemblyItemAccess().getGroup_5()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2723:1: ( rule__RasterAssemblyItem__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2723:2: rule__RasterAssemblyItem__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__RasterAssemblyItem__Group_5__0_in_rule__RasterAssemblyItem__Group__5__Impl5460);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2745:1: rule__RasterAssemblyItem__Group_5__0 : rule__RasterAssemblyItem__Group_5__0__Impl rule__RasterAssemblyItem__Group_5__1 ;
    public final void rule__RasterAssemblyItem__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2749:1: ( rule__RasterAssemblyItem__Group_5__0__Impl rule__RasterAssemblyItem__Group_5__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2750:2: rule__RasterAssemblyItem__Group_5__0__Impl rule__RasterAssemblyItem__Group_5__1
            {
            pushFollow(FOLLOW_rule__RasterAssemblyItem__Group_5__0__Impl_in_rule__RasterAssemblyItem__Group_5__05503);
            rule__RasterAssemblyItem__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RasterAssemblyItem__Group_5__1_in_rule__RasterAssemblyItem__Group_5__05506);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2757:1: rule__RasterAssemblyItem__Group_5__0__Impl : ( 'transform' ) ;
    public final void rule__RasterAssemblyItem__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2761:1: ( ( 'transform' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2762:1: ( 'transform' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2762:1: ( 'transform' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2763:1: 'transform'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRasterAssemblyItemAccess().getTransformKeyword_5_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__RasterAssemblyItem__Group_5__0__Impl5534); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2776:1: rule__RasterAssemblyItem__Group_5__1 : rule__RasterAssemblyItem__Group_5__1__Impl ;
    public final void rule__RasterAssemblyItem__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2780:1: ( rule__RasterAssemblyItem__Group_5__1__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2781:2: rule__RasterAssemblyItem__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__RasterAssemblyItem__Group_5__1__Impl_in_rule__RasterAssemblyItem__Group_5__15565);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2787:1: rule__RasterAssemblyItem__Group_5__1__Impl : ( ( rule__RasterAssemblyItem__TransformAssignment_5_1 ) ) ;
    public final void rule__RasterAssemblyItem__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2791:1: ( ( ( rule__RasterAssemblyItem__TransformAssignment_5_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2792:1: ( ( rule__RasterAssemblyItem__TransformAssignment_5_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2792:1: ( ( rule__RasterAssemblyItem__TransformAssignment_5_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2793:1: ( rule__RasterAssemblyItem__TransformAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRasterAssemblyItemAccess().getTransformAssignment_5_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2794:1: ( rule__RasterAssemblyItem__TransformAssignment_5_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2794:2: rule__RasterAssemblyItem__TransformAssignment_5_1
            {
            pushFollow(FOLLOW_rule__RasterAssemblyItem__TransformAssignment_5_1_in_rule__RasterAssemblyItem__Group_5__1__Impl5592);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2808:1: rule__MountedAssemblyItem__Group__0 : rule__MountedAssemblyItem__Group__0__Impl rule__MountedAssemblyItem__Group__1 ;
    public final void rule__MountedAssemblyItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2812:1: ( rule__MountedAssemblyItem__Group__0__Impl rule__MountedAssemblyItem__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2813:2: rule__MountedAssemblyItem__Group__0__Impl rule__MountedAssemblyItem__Group__1
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group__0__Impl_in_rule__MountedAssemblyItem__Group__05626);
            rule__MountedAssemblyItem__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group__1_in_rule__MountedAssemblyItem__Group__05629);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2820:1: rule__MountedAssemblyItem__Group__0__Impl : ( ( rule__MountedAssemblyItem__ElementAssignment_0 ) ) ;
    public final void rule__MountedAssemblyItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2824:1: ( ( ( rule__MountedAssemblyItem__ElementAssignment_0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2825:1: ( ( rule__MountedAssemblyItem__ElementAssignment_0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2825:1: ( ( rule__MountedAssemblyItem__ElementAssignment_0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2826:1: ( rule__MountedAssemblyItem__ElementAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getElementAssignment_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2827:1: ( rule__MountedAssemblyItem__ElementAssignment_0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2827:2: rule__MountedAssemblyItem__ElementAssignment_0
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__ElementAssignment_0_in_rule__MountedAssemblyItem__Group__0__Impl5656);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2837:1: rule__MountedAssemblyItem__Group__1 : rule__MountedAssemblyItem__Group__1__Impl rule__MountedAssemblyItem__Group__2 ;
    public final void rule__MountedAssemblyItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2841:1: ( rule__MountedAssemblyItem__Group__1__Impl rule__MountedAssemblyItem__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2842:2: rule__MountedAssemblyItem__Group__1__Impl rule__MountedAssemblyItem__Group__2
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group__1__Impl_in_rule__MountedAssemblyItem__Group__15686);
            rule__MountedAssemblyItem__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group__2_in_rule__MountedAssemblyItem__Group__15689);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2849:1: rule__MountedAssemblyItem__Group__1__Impl : ( 'pos' ) ;
    public final void rule__MountedAssemblyItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2853:1: ( ( 'pos' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2854:1: ( 'pos' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2854:1: ( 'pos' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2855:1: 'pos'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getPosKeyword_1()); 
            }
            match(input,31,FOLLOW_31_in_rule__MountedAssemblyItem__Group__1__Impl5717); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2868:1: rule__MountedAssemblyItem__Group__2 : rule__MountedAssemblyItem__Group__2__Impl rule__MountedAssemblyItem__Group__3 ;
    public final void rule__MountedAssemblyItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2872:1: ( rule__MountedAssemblyItem__Group__2__Impl rule__MountedAssemblyItem__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2873:2: rule__MountedAssemblyItem__Group__2__Impl rule__MountedAssemblyItem__Group__3
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group__2__Impl_in_rule__MountedAssemblyItem__Group__25748);
            rule__MountedAssemblyItem__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group__3_in_rule__MountedAssemblyItem__Group__25751);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2880:1: rule__MountedAssemblyItem__Group__2__Impl : ( ( rule__MountedAssemblyItem__XUnitsAssignment_2 ) ) ;
    public final void rule__MountedAssemblyItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2884:1: ( ( ( rule__MountedAssemblyItem__XUnitsAssignment_2 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2885:1: ( ( rule__MountedAssemblyItem__XUnitsAssignment_2 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2885:1: ( ( rule__MountedAssemblyItem__XUnitsAssignment_2 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2886:1: ( rule__MountedAssemblyItem__XUnitsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getXUnitsAssignment_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2887:1: ( rule__MountedAssemblyItem__XUnitsAssignment_2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2887:2: rule__MountedAssemblyItem__XUnitsAssignment_2
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__XUnitsAssignment_2_in_rule__MountedAssemblyItem__Group__2__Impl5778);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2897:1: rule__MountedAssemblyItem__Group__3 : rule__MountedAssemblyItem__Group__3__Impl rule__MountedAssemblyItem__Group__4 ;
    public final void rule__MountedAssemblyItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2901:1: ( rule__MountedAssemblyItem__Group__3__Impl rule__MountedAssemblyItem__Group__4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2902:2: rule__MountedAssemblyItem__Group__3__Impl rule__MountedAssemblyItem__Group__4
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group__3__Impl_in_rule__MountedAssemblyItem__Group__35808);
            rule__MountedAssemblyItem__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group__4_in_rule__MountedAssemblyItem__Group__35811);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2909:1: rule__MountedAssemblyItem__Group__3__Impl : ( ( rule__MountedAssemblyItem__YUnitsAssignment_3 ) ) ;
    public final void rule__MountedAssemblyItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2913:1: ( ( ( rule__MountedAssemblyItem__YUnitsAssignment_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2914:1: ( ( rule__MountedAssemblyItem__YUnitsAssignment_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2914:1: ( ( rule__MountedAssemblyItem__YUnitsAssignment_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2915:1: ( rule__MountedAssemblyItem__YUnitsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getYUnitsAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2916:1: ( rule__MountedAssemblyItem__YUnitsAssignment_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2916:2: rule__MountedAssemblyItem__YUnitsAssignment_3
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__YUnitsAssignment_3_in_rule__MountedAssemblyItem__Group__3__Impl5838);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2926:1: rule__MountedAssemblyItem__Group__4 : rule__MountedAssemblyItem__Group__4__Impl rule__MountedAssemblyItem__Group__5 ;
    public final void rule__MountedAssemblyItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2930:1: ( rule__MountedAssemblyItem__Group__4__Impl rule__MountedAssemblyItem__Group__5 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2931:2: rule__MountedAssemblyItem__Group__4__Impl rule__MountedAssemblyItem__Group__5
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group__4__Impl_in_rule__MountedAssemblyItem__Group__45868);
            rule__MountedAssemblyItem__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group__5_in_rule__MountedAssemblyItem__Group__45871);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2938:1: rule__MountedAssemblyItem__Group__4__Impl : ( ( rule__MountedAssemblyItem__ZUnitsAssignment_4 ) ) ;
    public final void rule__MountedAssemblyItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2942:1: ( ( ( rule__MountedAssemblyItem__ZUnitsAssignment_4 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2943:1: ( ( rule__MountedAssemblyItem__ZUnitsAssignment_4 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2943:1: ( ( rule__MountedAssemblyItem__ZUnitsAssignment_4 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2944:1: ( rule__MountedAssemblyItem__ZUnitsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getZUnitsAssignment_4()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2945:1: ( rule__MountedAssemblyItem__ZUnitsAssignment_4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2945:2: rule__MountedAssemblyItem__ZUnitsAssignment_4
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__ZUnitsAssignment_4_in_rule__MountedAssemblyItem__Group__4__Impl5898);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2955:1: rule__MountedAssemblyItem__Group__5 : rule__MountedAssemblyItem__Group__5__Impl rule__MountedAssemblyItem__Group__6 ;
    public final void rule__MountedAssemblyItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2959:1: ( rule__MountedAssemblyItem__Group__5__Impl rule__MountedAssemblyItem__Group__6 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2960:2: rule__MountedAssemblyItem__Group__5__Impl rule__MountedAssemblyItem__Group__6
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group__5__Impl_in_rule__MountedAssemblyItem__Group__55928);
            rule__MountedAssemblyItem__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group__6_in_rule__MountedAssemblyItem__Group__55931);
            rule__MountedAssemblyItem__Group__6();

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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2967:1: rule__MountedAssemblyItem__Group__5__Impl : ( ( rule__MountedAssemblyItem__Group_5__0 )? ) ;
    public final void rule__MountedAssemblyItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2971:1: ( ( ( rule__MountedAssemblyItem__Group_5__0 )? ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2972:1: ( ( rule__MountedAssemblyItem__Group_5__0 )? )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2972:1: ( ( rule__MountedAssemblyItem__Group_5__0 )? )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2973:1: ( rule__MountedAssemblyItem__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getGroup_5()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2974:1: ( rule__MountedAssemblyItem__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2974:2: rule__MountedAssemblyItem__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__MountedAssemblyItem__Group_5__0_in_rule__MountedAssemblyItem__Group__5__Impl5958);
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


    // $ANTLR start "rule__MountedAssemblyItem__Group__6"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2984:1: rule__MountedAssemblyItem__Group__6 : rule__MountedAssemblyItem__Group__6__Impl ;
    public final void rule__MountedAssemblyItem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2988:1: ( rule__MountedAssemblyItem__Group__6__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2989:2: rule__MountedAssemblyItem__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group__6__Impl_in_rule__MountedAssemblyItem__Group__65989);
            rule__MountedAssemblyItem__Group__6__Impl();

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
    // $ANTLR end "rule__MountedAssemblyItem__Group__6"


    // $ANTLR start "rule__MountedAssemblyItem__Group__6__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2995:1: rule__MountedAssemblyItem__Group__6__Impl : ( ( rule__MountedAssemblyItem__Group_6__0 )? ) ;
    public final void rule__MountedAssemblyItem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2999:1: ( ( ( rule__MountedAssemblyItem__Group_6__0 )? ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3000:1: ( ( rule__MountedAssemblyItem__Group_6__0 )? )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3000:1: ( ( rule__MountedAssemblyItem__Group_6__0 )? )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3001:1: ( rule__MountedAssemblyItem__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getGroup_6()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3002:1: ( rule__MountedAssemblyItem__Group_6__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3002:2: rule__MountedAssemblyItem__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__MountedAssemblyItem__Group_6__0_in_rule__MountedAssemblyItem__Group__6__Impl6016);
                    rule__MountedAssemblyItem__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMountedAssemblyItemAccess().getGroup_6()); 
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
    // $ANTLR end "rule__MountedAssemblyItem__Group__6__Impl"


    // $ANTLR start "rule__MountedAssemblyItem__Group_5__0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3026:1: rule__MountedAssemblyItem__Group_5__0 : rule__MountedAssemblyItem__Group_5__0__Impl rule__MountedAssemblyItem__Group_5__1 ;
    public final void rule__MountedAssemblyItem__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3030:1: ( rule__MountedAssemblyItem__Group_5__0__Impl rule__MountedAssemblyItem__Group_5__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3031:2: rule__MountedAssemblyItem__Group_5__0__Impl rule__MountedAssemblyItem__Group_5__1
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group_5__0__Impl_in_rule__MountedAssemblyItem__Group_5__06061);
            rule__MountedAssemblyItem__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group_5__1_in_rule__MountedAssemblyItem__Group_5__06064);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3038:1: rule__MountedAssemblyItem__Group_5__0__Impl : ( 'transform' ) ;
    public final void rule__MountedAssemblyItem__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3042:1: ( ( 'transform' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3043:1: ( 'transform' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3043:1: ( 'transform' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3044:1: 'transform'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getTransformKeyword_5_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__MountedAssemblyItem__Group_5__0__Impl6092); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3057:1: rule__MountedAssemblyItem__Group_5__1 : rule__MountedAssemblyItem__Group_5__1__Impl rule__MountedAssemblyItem__Group_5__2 ;
    public final void rule__MountedAssemblyItem__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3061:1: ( rule__MountedAssemblyItem__Group_5__1__Impl rule__MountedAssemblyItem__Group_5__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3062:2: rule__MountedAssemblyItem__Group_5__1__Impl rule__MountedAssemblyItem__Group_5__2
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group_5__1__Impl_in_rule__MountedAssemblyItem__Group_5__16123);
            rule__MountedAssemblyItem__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group_5__2_in_rule__MountedAssemblyItem__Group_5__16126);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3069:1: rule__MountedAssemblyItem__Group_5__1__Impl : ( ( rule__MountedAssemblyItem__RotateXAssignment_5_1 ) ) ;
    public final void rule__MountedAssemblyItem__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3073:1: ( ( ( rule__MountedAssemblyItem__RotateXAssignment_5_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3074:1: ( ( rule__MountedAssemblyItem__RotateXAssignment_5_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3074:1: ( ( rule__MountedAssemblyItem__RotateXAssignment_5_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3075:1: ( rule__MountedAssemblyItem__RotateXAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getRotateXAssignment_5_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3076:1: ( rule__MountedAssemblyItem__RotateXAssignment_5_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3076:2: rule__MountedAssemblyItem__RotateXAssignment_5_1
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__RotateXAssignment_5_1_in_rule__MountedAssemblyItem__Group_5__1__Impl6153);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3086:1: rule__MountedAssemblyItem__Group_5__2 : rule__MountedAssemblyItem__Group_5__2__Impl rule__MountedAssemblyItem__Group_5__3 ;
    public final void rule__MountedAssemblyItem__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3090:1: ( rule__MountedAssemblyItem__Group_5__2__Impl rule__MountedAssemblyItem__Group_5__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3091:2: rule__MountedAssemblyItem__Group_5__2__Impl rule__MountedAssemblyItem__Group_5__3
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group_5__2__Impl_in_rule__MountedAssemblyItem__Group_5__26183);
            rule__MountedAssemblyItem__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group_5__3_in_rule__MountedAssemblyItem__Group_5__26186);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3098:1: rule__MountedAssemblyItem__Group_5__2__Impl : ( ( rule__MountedAssemblyItem__RotateYAssignment_5_2 ) ) ;
    public final void rule__MountedAssemblyItem__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3102:1: ( ( ( rule__MountedAssemblyItem__RotateYAssignment_5_2 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3103:1: ( ( rule__MountedAssemblyItem__RotateYAssignment_5_2 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3103:1: ( ( rule__MountedAssemblyItem__RotateYAssignment_5_2 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3104:1: ( rule__MountedAssemblyItem__RotateYAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getRotateYAssignment_5_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3105:1: ( rule__MountedAssemblyItem__RotateYAssignment_5_2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3105:2: rule__MountedAssemblyItem__RotateYAssignment_5_2
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__RotateYAssignment_5_2_in_rule__MountedAssemblyItem__Group_5__2__Impl6213);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3115:1: rule__MountedAssemblyItem__Group_5__3 : rule__MountedAssemblyItem__Group_5__3__Impl ;
    public final void rule__MountedAssemblyItem__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3119:1: ( rule__MountedAssemblyItem__Group_5__3__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3120:2: rule__MountedAssemblyItem__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group_5__3__Impl_in_rule__MountedAssemblyItem__Group_5__36243);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3126:1: rule__MountedAssemblyItem__Group_5__3__Impl : ( ( rule__MountedAssemblyItem__RotateZAssignment_5_3 ) ) ;
    public final void rule__MountedAssemblyItem__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3130:1: ( ( ( rule__MountedAssemblyItem__RotateZAssignment_5_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3131:1: ( ( rule__MountedAssemblyItem__RotateZAssignment_5_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3131:1: ( ( rule__MountedAssemblyItem__RotateZAssignment_5_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3132:1: ( rule__MountedAssemblyItem__RotateZAssignment_5_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getRotateZAssignment_5_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3133:1: ( rule__MountedAssemblyItem__RotateZAssignment_5_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3133:2: rule__MountedAssemblyItem__RotateZAssignment_5_3
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__RotateZAssignment_5_3_in_rule__MountedAssemblyItem__Group_5__3__Impl6270);
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


    // $ANTLR start "rule__MountedAssemblyItem__Group_6__0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3151:1: rule__MountedAssemblyItem__Group_6__0 : rule__MountedAssemblyItem__Group_6__0__Impl rule__MountedAssemblyItem__Group_6__1 ;
    public final void rule__MountedAssemblyItem__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3155:1: ( rule__MountedAssemblyItem__Group_6__0__Impl rule__MountedAssemblyItem__Group_6__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3156:2: rule__MountedAssemblyItem__Group_6__0__Impl rule__MountedAssemblyItem__Group_6__1
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group_6__0__Impl_in_rule__MountedAssemblyItem__Group_6__06308);
            rule__MountedAssemblyItem__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group_6__1_in_rule__MountedAssemblyItem__Group_6__06311);
            rule__MountedAssemblyItem__Group_6__1();

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
    // $ANTLR end "rule__MountedAssemblyItem__Group_6__0"


    // $ANTLR start "rule__MountedAssemblyItem__Group_6__0__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3163:1: rule__MountedAssemblyItem__Group_6__0__Impl : ( 'actions' ) ;
    public final void rule__MountedAssemblyItem__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3167:1: ( ( 'actions' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3168:1: ( 'actions' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3168:1: ( 'actions' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3169:1: 'actions'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getActionsKeyword_6_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__MountedAssemblyItem__Group_6__0__Impl6339); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMountedAssemblyItemAccess().getActionsKeyword_6_0()); 
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
    // $ANTLR end "rule__MountedAssemblyItem__Group_6__0__Impl"


    // $ANTLR start "rule__MountedAssemblyItem__Group_6__1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3182:1: rule__MountedAssemblyItem__Group_6__1 : rule__MountedAssemblyItem__Group_6__1__Impl ;
    public final void rule__MountedAssemblyItem__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3186:1: ( rule__MountedAssemblyItem__Group_6__1__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3187:2: rule__MountedAssemblyItem__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__Group_6__1__Impl_in_rule__MountedAssemblyItem__Group_6__16370);
            rule__MountedAssemblyItem__Group_6__1__Impl();

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
    // $ANTLR end "rule__MountedAssemblyItem__Group_6__1"


    // $ANTLR start "rule__MountedAssemblyItem__Group_6__1__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3193:1: rule__MountedAssemblyItem__Group_6__1__Impl : ( ( ( rule__MountedAssemblyItem__ActionsAssignment_6_1 ) ) ( ( rule__MountedAssemblyItem__ActionsAssignment_6_1 )* ) ) ;
    public final void rule__MountedAssemblyItem__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3197:1: ( ( ( ( rule__MountedAssemblyItem__ActionsAssignment_6_1 ) ) ( ( rule__MountedAssemblyItem__ActionsAssignment_6_1 )* ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3198:1: ( ( ( rule__MountedAssemblyItem__ActionsAssignment_6_1 ) ) ( ( rule__MountedAssemblyItem__ActionsAssignment_6_1 )* ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3198:1: ( ( ( rule__MountedAssemblyItem__ActionsAssignment_6_1 ) ) ( ( rule__MountedAssemblyItem__ActionsAssignment_6_1 )* ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3199:1: ( ( rule__MountedAssemblyItem__ActionsAssignment_6_1 ) ) ( ( rule__MountedAssemblyItem__ActionsAssignment_6_1 )* )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3199:1: ( ( rule__MountedAssemblyItem__ActionsAssignment_6_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3200:1: ( rule__MountedAssemblyItem__ActionsAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getActionsAssignment_6_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3201:1: ( rule__MountedAssemblyItem__ActionsAssignment_6_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3201:2: rule__MountedAssemblyItem__ActionsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__MountedAssemblyItem__ActionsAssignment_6_1_in_rule__MountedAssemblyItem__Group_6__1__Impl6399);
            rule__MountedAssemblyItem__ActionsAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMountedAssemblyItemAccess().getActionsAssignment_6_1()); 
            }

            }

            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3204:1: ( ( rule__MountedAssemblyItem__ActionsAssignment_6_1 )* )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3205:1: ( rule__MountedAssemblyItem__ActionsAssignment_6_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getActionsAssignment_6_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3206:1: ( rule__MountedAssemblyItem__ActionsAssignment_6_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    int LA17_2 = input.LA(2);

                    if ( (LA17_2==34) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3206:2: rule__MountedAssemblyItem__ActionsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_rule__MountedAssemblyItem__ActionsAssignment_6_1_in_rule__MountedAssemblyItem__Group_6__1__Impl6411);
            	    rule__MountedAssemblyItem__ActionsAssignment_6_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMountedAssemblyItemAccess().getActionsAssignment_6_1()); 
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
    // $ANTLR end "rule__MountedAssemblyItem__Group_6__1__Impl"


    // $ANTLR start "rule__Model__RepoAssignment_0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3222:1: rule__Model__RepoAssignment_0 : ( ruleItemRepository ) ;
    public final void rule__Model__RepoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3226:1: ( ( ruleItemRepository ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3227:1: ( ruleItemRepository )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3227:1: ( ruleItemRepository )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3228:1: ruleItemRepository
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRepoItemRepositoryParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleItemRepository_in_rule__Model__RepoAssignment_06453);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3237:1: rule__Model__AssemblyAssignment_1 : ( ruleAssembly ) ;
    public final void rule__Model__AssemblyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3241:1: ( ( ruleAssembly ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3242:1: ( ruleAssembly )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3242:1: ( ruleAssembly )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3243:1: ruleAssembly
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getAssemblyAssemblyParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleAssembly_in_rule__Model__AssemblyAssignment_16484);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3252:1: rule__ItemRepository__NameAssignment_0 : ( ruleValidID ) ;
    public final void rule__ItemRepository__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3256:1: ( ( ruleValidID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3257:1: ( ruleValidID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3257:1: ( ruleValidID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3258:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getNameValidIDParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__ItemRepository__NameAssignment_06515);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3267:1: rule__ItemRepository__ElementListAssignment_2 : ( ruleRepostoryItem ) ;
    public final void rule__ItemRepository__ElementListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3271:1: ( ( ruleRepostoryItem ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3272:1: ( ruleRepostoryItem )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3272:1: ( ruleRepostoryItem )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3273:1: ruleRepostoryItem
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getElementListRepostoryItemParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleRepostoryItem_in_rule__ItemRepository__ElementListAssignment_26546);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3282:1: rule__MountedPart__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__MountedPart__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3286:1: ( ( ruleValidID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3287:1: ( ruleValidID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3287:1: ( ruleValidID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3288:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedPartAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__MountedPart__NameAssignment_16577);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3297:1: rule__MountedPart__FillAssignment_2 : ( ruleColor ) ;
    public final void rule__MountedPart__FillAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3301:1: ( ( ruleColor ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3302:1: ( ruleColor )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3302:1: ( ruleColor )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3303:1: ruleColor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedPartAccess().getFillColorParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleColor_in_rule__MountedPart__FillAssignment_26608);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3312:1: rule__MountedPart__SourceAssignment_3 : ( ruleSource ) ;
    public final void rule__MountedPart__SourceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3316:1: ( ( ruleSource ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3317:1: ( ruleSource )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3317:1: ( ruleSource )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3318:1: ruleSource
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedPartAccess().getSourceSourceParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleSource_in_rule__MountedPart__SourceAssignment_36639);
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


    // $ANTLR start "rule__Action__NameAssignment_0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3327:1: rule__Action__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Action__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3331:1: ( ( RULE_ID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3332:1: ( RULE_ID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3332:1: ( RULE_ID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3333:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Action__NameAssignment_06670); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Action__NameAssignment_0"


    // $ANTLR start "rule__Action__TypeAssignment_1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3342:1: rule__Action__TypeAssignment_1 : ( ( 'rotate' ) ) ;
    public final void rule__Action__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3346:1: ( ( ( 'rotate' ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3347:1: ( ( 'rotate' ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3347:1: ( ( 'rotate' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3348:1: ( 'rotate' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getTypeRotateKeyword_1_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3349:1: ( 'rotate' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3350:1: 'rotate'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getTypeRotateKeyword_1_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__Action__TypeAssignment_16706); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getTypeRotateKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getTypeRotateKeyword_1_0()); 
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
    // $ANTLR end "rule__Action__TypeAssignment_1"


    // $ANTLR start "rule__Action__AxisAssignment_2"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3365:1: rule__Action__AxisAssignment_2 : ( ( rule__Action__AxisAlternatives_2_0 ) ) ;
    public final void rule__Action__AxisAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3369:1: ( ( ( rule__Action__AxisAlternatives_2_0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3370:1: ( ( rule__Action__AxisAlternatives_2_0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3370:1: ( ( rule__Action__AxisAlternatives_2_0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3371:1: ( rule__Action__AxisAlternatives_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getAxisAlternatives_2_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3372:1: ( rule__Action__AxisAlternatives_2_0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3372:2: rule__Action__AxisAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__Action__AxisAlternatives_2_0_in_rule__Action__AxisAssignment_26745);
            rule__Action__AxisAlternatives_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getAxisAlternatives_2_0()); 
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
    // $ANTLR end "rule__Action__AxisAssignment_2"


    // $ANTLR start "rule__Action__AngleAssignment_3"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3381:1: rule__Action__AngleAssignment_3 : ( RULE_FLOAT ) ;
    public final void rule__Action__AngleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3385:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3386:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3386:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3387:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getAngleFLOATTerminalRuleCall_3_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__Action__AngleAssignment_36778); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getAngleFLOATTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__Action__AngleAssignment_3"


    // $ANTLR start "rule__Action__DurationAssignment_5"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3396:1: rule__Action__DurationAssignment_5 : ( RULE_INT ) ;
    public final void rule__Action__DurationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3400:1: ( ( RULE_INT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3401:1: ( RULE_INT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3401:1: ( RULE_INT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3402:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getDurationINTTerminalRuleCall_5_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Action__DurationAssignment_56809); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getDurationINTTerminalRuleCall_5_0()); 
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
    // $ANTLR end "rule__Action__DurationAssignment_5"


    // $ANTLR start "rule__Action__SoundfileAssignment_6_1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3411:1: rule__Action__SoundfileAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__Action__SoundfileAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3415:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3416:1: ( RULE_STRING )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3416:1: ( RULE_STRING )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3417:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getSoundfileSTRINGTerminalRuleCall_6_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Action__SoundfileAssignment_6_16840); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getSoundfileSTRINGTerminalRuleCall_6_1_0()); 
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
    // $ANTLR end "rule__Action__SoundfileAssignment_6_1"


    // $ANTLR start "rule__Color__RAssignment_1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3426:1: rule__Color__RAssignment_1 : ( RULE_INT ) ;
    public final void rule__Color__RAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3430:1: ( ( RULE_INT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3431:1: ( RULE_INT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3431:1: ( RULE_INT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3432:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getRINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Color__RAssignment_16871); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3441:1: rule__Color__GAssignment_2 : ( RULE_INT ) ;
    public final void rule__Color__GAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3445:1: ( ( RULE_INT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3446:1: ( RULE_INT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3446:1: ( RULE_INT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3447:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getGINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Color__GAssignment_26902); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3456:1: rule__Color__BAssignment_3 : ( RULE_INT ) ;
    public final void rule__Color__BAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3460:1: ( ( RULE_INT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3461:1: ( RULE_INT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3461:1: ( RULE_INT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3462:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getBINTTerminalRuleCall_3_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Color__BAssignment_36933); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3471:1: rule__XUnit__UnitsAssignment : ( RULE_INT ) ;
    public final void rule__XUnit__UnitsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3475:1: ( ( RULE_INT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3476:1: ( RULE_INT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3476:1: ( RULE_INT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3477:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXUnitAccess().getUnitsINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__XUnit__UnitsAssignment6964); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3486:1: rule__YUnit__UnitsAssignment : ( RULE_INT ) ;
    public final void rule__YUnit__UnitsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3490:1: ( ( RULE_INT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3491:1: ( RULE_INT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3491:1: ( RULE_INT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3492:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYUnitAccess().getUnitsINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__YUnit__UnitsAssignment6995); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3501:1: rule__ZUnit__UnitsAssignment : ( RULE_INT ) ;
    public final void rule__ZUnit__UnitsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3505:1: ( ( RULE_INT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3506:1: ( RULE_INT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3506:1: ( RULE_INT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3507:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getZUnitAccess().getUnitsINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ZUnit__UnitsAssignment7026); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3516:1: rule__Brick__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__Brick__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3520:1: ( ( ruleValidID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3521:1: ( ruleValidID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3521:1: ( ruleValidID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3522:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__Brick__NameAssignment_17057);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3531:1: rule__Brick__XUnitsAssignment_3 : ( ruleXUnit ) ;
    public final void rule__Brick__XUnitsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3535:1: ( ( ruleXUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3536:1: ( ruleXUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3536:1: ( ruleXUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3537:1: ruleXUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getXUnitsXUnitParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleXUnit_in_rule__Brick__XUnitsAssignment_37088);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3546:1: rule__Brick__YUnitsAssignment_4 : ( ruleYUnit ) ;
    public final void rule__Brick__YUnitsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3550:1: ( ( ruleYUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3551:1: ( ruleYUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3551:1: ( ruleYUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3552:1: ruleYUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getYUnitsYUnitParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleYUnit_in_rule__Brick__YUnitsAssignment_47119);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3561:1: rule__Brick__ZUnitsAssignment_5 : ( ruleZUnit ) ;
    public final void rule__Brick__ZUnitsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3565:1: ( ( ruleZUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3566:1: ( ruleZUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3566:1: ( ruleZUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3567:1: ruleZUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getZUnitsZUnitParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleZUnit_in_rule__Brick__ZUnitsAssignment_57150);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3576:1: rule__Brick__FillAssignment_6 : ( ruleColor ) ;
    public final void rule__Brick__FillAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3580:1: ( ( ruleColor ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3581:1: ( ruleColor )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3581:1: ( ruleColor )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3582:1: ruleColor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getFillColorParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleColor_in_rule__Brick__FillAssignment_67181);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3591:1: rule__Brick__SourceAssignment_7 : ( ruleSource ) ;
    public final void rule__Brick__SourceAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3595:1: ( ( ruleSource ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3596:1: ( ruleSource )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3596:1: ( ruleSource )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3597:1: ruleSource
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getSourceSourceParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleSource_in_rule__Brick__SourceAssignment_77212);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3606:1: rule__Generated__TypeAssignment_2_0 : ( ( 'box' ) ) ;
    public final void rule__Generated__TypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3610:1: ( ( ( 'box' ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3611:1: ( ( 'box' ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3611:1: ( ( 'box' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3612:1: ( 'box' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getTypeBoxKeyword_2_0_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3613:1: ( 'box' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3614:1: 'box'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getTypeBoxKeyword_2_0_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__Generated__TypeAssignment_2_07248); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3629:1: rule__Generated__WidthAssignment_2_1 : ( RULE_FLOAT ) ;
    public final void rule__Generated__WidthAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3633:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3634:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3634:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3635:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getWidthFLOATTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__Generated__WidthAssignment_2_17287); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3644:1: rule__Generated__HeightAssignment_2_2 : ( RULE_FLOAT ) ;
    public final void rule__Generated__HeightAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3648:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3649:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3649:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3650:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getHeightFLOATTerminalRuleCall_2_2_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__Generated__HeightAssignment_2_27318); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3659:1: rule__Generated__DepthAssignment_2_3 : ( RULE_FLOAT ) ;
    public final void rule__Generated__DepthAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3663:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3664:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3664:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3665:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getDepthFLOATTerminalRuleCall_2_3_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__Generated__DepthAssignment_2_37349); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3674:1: rule__Generated__OriginXAssignment_2_4_1 : ( RULE_FLOAT ) ;
    public final void rule__Generated__OriginXAssignment_2_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3678:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3679:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3679:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3680:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getOriginXFLOATTerminalRuleCall_2_4_1_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__Generated__OriginXAssignment_2_4_17380); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3689:1: rule__Generated__OriginYAssignment_2_4_2 : ( RULE_FLOAT ) ;
    public final void rule__Generated__OriginYAssignment_2_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3693:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3694:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3694:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3695:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getOriginYFLOATTerminalRuleCall_2_4_2_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__Generated__OriginYAssignment_2_4_27411); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3704:1: rule__Generated__OriginZAssignment_2_4_3 : ( RULE_FLOAT ) ;
    public final void rule__Generated__OriginZAssignment_2_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3708:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3709:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3709:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3710:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getOriginZFLOATTerminalRuleCall_2_4_3_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__Generated__OriginZAssignment_2_4_37442); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3719:1: rule__FxmlInclude__Source3dAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FxmlInclude__Source3dAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3723:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3724:1: ( RULE_STRING )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3724:1: ( RULE_STRING )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3725:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getSource3dSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FxmlInclude__Source3dAssignment_17473); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3734:1: rule__FxmlInclude__OriginXAssignment_2_1 : ( RULE_FLOAT ) ;
    public final void rule__FxmlInclude__OriginXAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3738:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3739:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3739:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3740:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getOriginXFLOATTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__FxmlInclude__OriginXAssignment_2_17504); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3749:1: rule__FxmlInclude__OriginYAssignment_2_2 : ( RULE_FLOAT ) ;
    public final void rule__FxmlInclude__OriginYAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3753:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3754:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3754:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3755:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getOriginYFLOATTerminalRuleCall_2_2_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__FxmlInclude__OriginYAssignment_2_27535); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3764:1: rule__FxmlInclude__OriginZAssignment_2_3 : ( RULE_FLOAT ) ;
    public final void rule__FxmlInclude__OriginZAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3768:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3769:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3769:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3770:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getOriginZFLOATTerminalRuleCall_2_3_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__FxmlInclude__OriginZAssignment_2_37566); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3779:1: rule__Assembly__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__Assembly__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3783:1: ( ( ruleValidID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3784:1: ( ruleValidID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3784:1: ( ruleValidID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3785:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__Assembly__NameAssignment_17597);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3794:1: rule__Assembly__ItemsAssignment_3 : ( ruleAssemblyItem ) ;
    public final void rule__Assembly__ItemsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3798:1: ( ( ruleAssemblyItem ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3799:1: ( ruleAssemblyItem )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3799:1: ( ruleAssemblyItem )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3800:1: ruleAssemblyItem
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getItemsAssemblyItemParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleAssemblyItem_in_rule__Assembly__ItemsAssignment_37628);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3809:1: rule__RasterAssemblyItem__ElementAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RasterAssemblyItem__ElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3813:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3814:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3814:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3815:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRasterAssemblyItemAccess().getElementRasterItemCrossReference_0_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3816:1: ( ruleQualifiedName )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3817:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRasterAssemblyItemAccess().getElementRasterItemQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__RasterAssemblyItem__ElementAssignment_07663);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3828:1: rule__RasterAssemblyItem__XUnitsAssignment_2 : ( ruleXUnit ) ;
    public final void rule__RasterAssemblyItem__XUnitsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3832:1: ( ( ruleXUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3833:1: ( ruleXUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3833:1: ( ruleXUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3834:1: ruleXUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRasterAssemblyItemAccess().getXUnitsXUnitParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleXUnit_in_rule__RasterAssemblyItem__XUnitsAssignment_27698);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3843:1: rule__RasterAssemblyItem__YUnitsAssignment_3 : ( ruleYUnit ) ;
    public final void rule__RasterAssemblyItem__YUnitsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3847:1: ( ( ruleYUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3848:1: ( ruleYUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3848:1: ( ruleYUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3849:1: ruleYUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRasterAssemblyItemAccess().getYUnitsYUnitParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleYUnit_in_rule__RasterAssemblyItem__YUnitsAssignment_37729);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3858:1: rule__RasterAssemblyItem__ZUnitsAssignment_4 : ( ruleZUnit ) ;
    public final void rule__RasterAssemblyItem__ZUnitsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3862:1: ( ( ruleZUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3863:1: ( ruleZUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3863:1: ( ruleZUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3864:1: ruleZUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRasterAssemblyItemAccess().getZUnitsZUnitParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleZUnit_in_rule__RasterAssemblyItem__ZUnitsAssignment_47760);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3873:1: rule__RasterAssemblyItem__TransformAssignment_5_1 : ( ( rule__RasterAssemblyItem__TransformAlternatives_5_1_0 ) ) ;
    public final void rule__RasterAssemblyItem__TransformAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3877:1: ( ( ( rule__RasterAssemblyItem__TransformAlternatives_5_1_0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3878:1: ( ( rule__RasterAssemblyItem__TransformAlternatives_5_1_0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3878:1: ( ( rule__RasterAssemblyItem__TransformAlternatives_5_1_0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3879:1: ( rule__RasterAssemblyItem__TransformAlternatives_5_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRasterAssemblyItemAccess().getTransformAlternatives_5_1_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3880:1: ( rule__RasterAssemblyItem__TransformAlternatives_5_1_0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3880:2: rule__RasterAssemblyItem__TransformAlternatives_5_1_0
            {
            pushFollow(FOLLOW_rule__RasterAssemblyItem__TransformAlternatives_5_1_0_in_rule__RasterAssemblyItem__TransformAssignment_5_17791);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3889:1: rule__MountedAssemblyItem__ElementAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MountedAssemblyItem__ElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3893:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3894:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3894:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3895:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getElementMountedPartCrossReference_0_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3896:1: ( ruleQualifiedName )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3897:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getElementMountedPartQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__MountedAssemblyItem__ElementAssignment_07828);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3908:1: rule__MountedAssemblyItem__XUnitsAssignment_2 : ( RULE_FLOAT ) ;
    public final void rule__MountedAssemblyItem__XUnitsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3912:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3913:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3913:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3914:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getXUnitsFLOATTerminalRuleCall_2_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__MountedAssemblyItem__XUnitsAssignment_27863); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3923:1: rule__MountedAssemblyItem__YUnitsAssignment_3 : ( RULE_FLOAT ) ;
    public final void rule__MountedAssemblyItem__YUnitsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3927:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3928:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3928:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3929:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getYUnitsFLOATTerminalRuleCall_3_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__MountedAssemblyItem__YUnitsAssignment_37894); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3938:1: rule__MountedAssemblyItem__ZUnitsAssignment_4 : ( RULE_FLOAT ) ;
    public final void rule__MountedAssemblyItem__ZUnitsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3942:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3943:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3943:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3944:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getZUnitsFLOATTerminalRuleCall_4_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__MountedAssemblyItem__ZUnitsAssignment_47925); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3953:1: rule__MountedAssemblyItem__RotateXAssignment_5_1 : ( RULE_FLOAT ) ;
    public final void rule__MountedAssemblyItem__RotateXAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3957:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3958:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3958:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3959:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getRotateXFLOATTerminalRuleCall_5_1_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__MountedAssemblyItem__RotateXAssignment_5_17956); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3968:1: rule__MountedAssemblyItem__RotateYAssignment_5_2 : ( RULE_FLOAT ) ;
    public final void rule__MountedAssemblyItem__RotateYAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3972:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3973:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3973:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3974:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getRotateYFLOATTerminalRuleCall_5_2_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__MountedAssemblyItem__RotateYAssignment_5_27987); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3983:1: rule__MountedAssemblyItem__RotateZAssignment_5_3 : ( RULE_FLOAT ) ;
    public final void rule__MountedAssemblyItem__RotateZAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3987:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3988:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3988:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3989:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getRotateZFLOATTerminalRuleCall_5_3_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__MountedAssemblyItem__RotateZAssignment_5_38018); if (state.failed) return ;
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


    // $ANTLR start "rule__MountedAssemblyItem__ActionsAssignment_6_1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3998:1: rule__MountedAssemblyItem__ActionsAssignment_6_1 : ( ruleAction ) ;
    public final void rule__MountedAssemblyItem__ActionsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:4002:1: ( ( ruleAction ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:4003:1: ( ruleAction )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:4003:1: ( ruleAction )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:4004:1: ruleAction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMountedAssemblyItemAccess().getActionsActionParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_ruleAction_in_rule__MountedAssemblyItem__ActionsAssignment_6_18049);
            ruleAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMountedAssemblyItemAccess().getActionsActionParserRuleCall_6_1_0()); 
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
    // $ANTLR end "rule__MountedAssemblyItem__ActionsAssignment_6_1"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\7\uffff";
    static final String DFA5_eofS =
        "\7\uffff";
    static final String DFA5_minS =
        "\1\4\1\22\1\4\1\5\1\22\2\uffff";
    static final String DFA5_maxS =
        "\1\4\1\37\1\4\1\6\1\37\2\uffff";
    static final String DFA5_acceptS =
        "\5\uffff\1\2\1\1";
    static final String DFA5_specialS =
        "\7\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\1\2\14\uffff\1\3",
            "\1\4",
            "\1\5\1\6",
            "\1\2\14\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "699:1: rule__AssemblyItem__Alternatives : ( ( ruleRasterAssemblyItem ) | ( ruleMountedAssemblyItem ) );";
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
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0_in_ruleAction403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepostoryItem_in_entryRuleRepostoryItem430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepostoryItem437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepostoryItem__Alternatives_in_ruleRepostoryItem463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group__0_in_ruleColor523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnit_in_entryRuleXUnit550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnit557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XUnit__UnitsAssignment_in_ruleXUnit583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYUnit_in_entryRuleYUnit610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleYUnit617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__YUnit__UnitsAssignment_in_ruleYUnit643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZUnit_in_entryRuleZUnit670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleZUnit677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ZUnit__UnitsAssignment_in_ruleZUnit703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrick_in_entryRuleBrick730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBrick737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__0_in_ruleBrick763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSource_in_entryRuleSource790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSource797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Source__Alternatives_in_ruleSource823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerated_in_entryRuleGenerated850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenerated857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__Group__0_in_ruleGenerated883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFxmlInclude_in_entryRuleFxmlInclude910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFxmlInclude917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__0_in_ruleFxmlInclude943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssembly_in_entryRuleAssembly970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssembly977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assembly__Group__0_in_ruleAssembly1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssemblyItem_in_entryRuleAssemblyItem1030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssemblyItem1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Alternatives_in_ruleAssemblyItem1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRasterAssemblyItem_in_entryRuleRasterAssemblyItem1090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRasterAssemblyItem1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__Group__0_in_ruleRasterAssemblyItem1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMountedAssemblyItem_in_entryRuleMountedAssemblyItem1150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMountedAssemblyItem1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group__0_in_ruleMountedAssemblyItem1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__RepoAssignment_0_in_rule__Model__Alternatives1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__AssemblyAssignment_1_in_rule__Model__Alternatives1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Action__AxisAlternatives_2_01273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Action__AxisAlternatives_2_01293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Action__AxisAlternatives_2_01313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrick_in_rule__RepostoryItem__Alternatives1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMountedPart_in_rule__RepostoryItem__Alternatives1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerated_in_rule__Source__Alternatives1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFxmlInclude_in_rule__Source__Alternatives1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRasterAssemblyItem_in_rule__AssemblyItem__Alternatives1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMountedAssemblyItem_in_rule__AssemblyItem__Alternatives1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RasterAssemblyItem__TransformAlternatives_5_1_01495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__RasterAssemblyItem__TransformAlternatives_5_1_01515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__RasterAssemblyItem__TransformAlternatives_5_1_01535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01567 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1653 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01688 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__QualifiedName__Group_1__0__Impl1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__0__Impl_in_rule__ItemRepository__Group__01812 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__1_in_rule__ItemRepository__Group__01815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemRepository__NameAssignment_0_in_rule__ItemRepository__Group__0__Impl1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__1__Impl_in_rule__ItemRepository__Group__11872 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__2_in_rule__ItemRepository__Group__11875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ItemRepository__Group__1__Impl1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__2__Impl_in_rule__ItemRepository__Group__21934 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__3_in_rule__ItemRepository__Group__21937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemRepository__ElementListAssignment_2_in_rule__ItemRepository__Group__2__Impl1966 = new BitSet(new long[]{0x0000000002200002L});
    public static final BitSet FOLLOW_rule__ItemRepository__ElementListAssignment_2_in_rule__ItemRepository__Group__2__Impl1978 = new BitSet(new long[]{0x0000000002200002L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__3__Impl_in_rule__ItemRepository__Group__32011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ItemRepository__Group__3__Impl2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedPart__Group__0__Impl_in_rule__MountedPart__Group__02078 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MountedPart__Group__1_in_rule__MountedPart__Group__02081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MountedPart__Group__0__Impl2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedPart__Group__1__Impl_in_rule__MountedPart__Group__12140 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__MountedPart__Group__2_in_rule__MountedPart__Group__12143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedPart__NameAssignment_1_in_rule__MountedPart__Group__1__Impl2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedPart__Group__2__Impl_in_rule__MountedPart__Group__22200 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_rule__MountedPart__Group__3_in_rule__MountedPart__Group__22203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedPart__FillAssignment_2_in_rule__MountedPart__Group__2__Impl2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedPart__Group__3__Impl_in_rule__MountedPart__Group__32260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedPart__SourceAssignment_3_in_rule__MountedPart__Group__3__Impl2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__02325 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Action__Group__1_in_rule__Action__Group__02328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__NameAssignment_0_in_rule__Action__Group__0__Impl2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__12385 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_rule__Action__Group__2_in_rule__Action__Group__12388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__TypeAssignment_1_in_rule__Action__Group__1__Impl2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__22445 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Action__Group__3_in_rule__Action__Group__22448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__AxisAssignment_2_in_rule__Action__Group__2__Impl2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__32505 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Action__Group__4_in_rule__Action__Group__32508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__AngleAssignment_3_in_rule__Action__Group__3__Impl2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__4__Impl_in_rule__Action__Group__42565 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Action__Group__5_in_rule__Action__Group__42568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Action__Group__4__Impl2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__5__Impl_in_rule__Action__Group__52627 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Action__Group__6_in_rule__Action__Group__52630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__DurationAssignment_5_in_rule__Action__Group__5__Impl2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__6__Impl_in_rule__Action__Group__62687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_6__0_in_rule__Action__Group__6__Impl2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_6__0__Impl_in_rule__Action__Group_6__02759 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Action__Group_6__1_in_rule__Action__Group_6__02762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Action__Group_6__0__Impl2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_6__1__Impl_in_rule__Action__Group_6__12821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__SoundfileAssignment_6_1_in_rule__Action__Group_6__1__Impl2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group__0__Impl_in_rule__Color__Group__02882 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Color__Group__1_in_rule__Color__Group__02885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Color__Group__0__Impl2913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group__1__Impl_in_rule__Color__Group__12944 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Color__Group__2_in_rule__Color__Group__12947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__RAssignment_1_in_rule__Color__Group__1__Impl2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group__2__Impl_in_rule__Color__Group__23004 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Color__Group__3_in_rule__Color__Group__23007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__GAssignment_2_in_rule__Color__Group__2__Impl3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group__3__Impl_in_rule__Color__Group__33064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__BAssignment_3_in_rule__Color__Group__3__Impl3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__0__Impl_in_rule__Brick__Group__03129 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Brick__Group__1_in_rule__Brick__Group__03132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Brick__Group__0__Impl3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__1__Impl_in_rule__Brick__Group__13191 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Brick__Group__2_in_rule__Brick__Group__13194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__NameAssignment_1_in_rule__Brick__Group__1__Impl3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__2__Impl_in_rule__Brick__Group__23251 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Brick__Group__3_in_rule__Brick__Group__23254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Brick__Group__2__Impl3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__3__Impl_in_rule__Brick__Group__33313 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Brick__Group__4_in_rule__Brick__Group__33316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__XUnitsAssignment_3_in_rule__Brick__Group__3__Impl3343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__4__Impl_in_rule__Brick__Group__43373 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Brick__Group__5_in_rule__Brick__Group__43376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__YUnitsAssignment_4_in_rule__Brick__Group__4__Impl3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__5__Impl_in_rule__Brick__Group__53433 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Brick__Group__6_in_rule__Brick__Group__53436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__ZUnitsAssignment_5_in_rule__Brick__Group__5__Impl3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__6__Impl_in_rule__Brick__Group__63493 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_rule__Brick__Group__7_in_rule__Brick__Group__63496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__FillAssignment_6_in_rule__Brick__Group__6__Impl3523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__7__Impl_in_rule__Brick__Group__73553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__SourceAssignment_7_in_rule__Brick__Group__7__Impl3580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__Group__0__Impl_in_rule__Generated__Group__03626 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Generated__Group__1_in_rule__Generated__Group__03629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Generated__Group__0__Impl3657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__Group__1__Impl_in_rule__Generated__Group__13688 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Generated__Group__2_in_rule__Generated__Group__13691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__Group__2__Impl_in_rule__Generated__Group__23749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__Group_2__0_in_rule__Generated__Group__2__Impl3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__Group_2__0__Impl_in_rule__Generated__Group_2__03813 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Generated__Group_2__1_in_rule__Generated__Group_2__03816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__TypeAssignment_2_0_in_rule__Generated__Group_2__0__Impl3843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__Group_2__1__Impl_in_rule__Generated__Group_2__13873 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Generated__Group_2__2_in_rule__Generated__Group_2__13876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__WidthAssignment_2_1_in_rule__Generated__Group_2__1__Impl3903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__Group_2__2__Impl_in_rule__Generated__Group_2__23933 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Generated__Group_2__3_in_rule__Generated__Group_2__23936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__HeightAssignment_2_2_in_rule__Generated__Group_2__2__Impl3963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__Group_2__3__Impl_in_rule__Generated__Group_2__33993 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Generated__Group_2__4_in_rule__Generated__Group_2__33996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__DepthAssignment_2_3_in_rule__Generated__Group_2__3__Impl4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__Group_2__4__Impl_in_rule__Generated__Group_2__44053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__Group_2_4__0_in_rule__Generated__Group_2__4__Impl4080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__Group_2_4__0__Impl_in_rule__Generated__Group_2_4__04121 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Generated__Group_2_4__1_in_rule__Generated__Group_2_4__04124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Generated__Group_2_4__0__Impl4152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__Group_2_4__1__Impl_in_rule__Generated__Group_2_4__14183 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Generated__Group_2_4__2_in_rule__Generated__Group_2_4__14186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__OriginXAssignment_2_4_1_in_rule__Generated__Group_2_4__1__Impl4213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__Group_2_4__2__Impl_in_rule__Generated__Group_2_4__24243 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Generated__Group_2_4__3_in_rule__Generated__Group_2_4__24246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__OriginYAssignment_2_4_2_in_rule__Generated__Group_2_4__2__Impl4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__Group_2_4__3__Impl_in_rule__Generated__Group_2_4__34303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generated__OriginZAssignment_2_4_3_in_rule__Generated__Group_2_4__3__Impl4330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__0__Impl_in_rule__FxmlInclude__Group__04368 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__1_in_rule__FxmlInclude__Group__04371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__FxmlInclude__Group__0__Impl4399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__1__Impl_in_rule__FxmlInclude__Group__14430 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__2_in_rule__FxmlInclude__Group__14433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Source3dAssignment_1_in_rule__FxmlInclude__Group__1__Impl4460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__2__Impl_in_rule__FxmlInclude__Group__24490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group_2__0_in_rule__FxmlInclude__Group__2__Impl4517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group_2__0__Impl_in_rule__FxmlInclude__Group_2__04554 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group_2__1_in_rule__FxmlInclude__Group_2__04557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__FxmlInclude__Group_2__0__Impl4585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group_2__1__Impl_in_rule__FxmlInclude__Group_2__14616 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group_2__2_in_rule__FxmlInclude__Group_2__14619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__OriginXAssignment_2_1_in_rule__FxmlInclude__Group_2__1__Impl4646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group_2__2__Impl_in_rule__FxmlInclude__Group_2__24676 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group_2__3_in_rule__FxmlInclude__Group_2__24679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__OriginYAssignment_2_2_in_rule__FxmlInclude__Group_2__2__Impl4706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group_2__3__Impl_in_rule__FxmlInclude__Group_2__34736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__OriginZAssignment_2_3_in_rule__FxmlInclude__Group_2__3__Impl4763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assembly__Group__0__Impl_in_rule__Assembly__Group__04801 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Assembly__Group__1_in_rule__Assembly__Group__04804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Assembly__Group__0__Impl4832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assembly__Group__1__Impl_in_rule__Assembly__Group__14863 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Assembly__Group__2_in_rule__Assembly__Group__14866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assembly__NameAssignment_1_in_rule__Assembly__Group__1__Impl4893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assembly__Group__2__Impl_in_rule__Assembly__Group__24923 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Assembly__Group__3_in_rule__Assembly__Group__24926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Assembly__Group__2__Impl4954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assembly__Group__3__Impl_in_rule__Assembly__Group__34985 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Assembly__Group__4_in_rule__Assembly__Group__34988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assembly__ItemsAssignment_3_in_rule__Assembly__Group__3__Impl5017 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Assembly__ItemsAssignment_3_in_rule__Assembly__Group__3__Impl5029 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Assembly__Group__4__Impl_in_rule__Assembly__Group__45062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Assembly__Group__4__Impl5090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__Group__0__Impl_in_rule__RasterAssemblyItem__Group__05131 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__Group__1_in_rule__RasterAssemblyItem__Group__05134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__ElementAssignment_0_in_rule__RasterAssemblyItem__Group__0__Impl5161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__Group__1__Impl_in_rule__RasterAssemblyItem__Group__15191 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__Group__2_in_rule__RasterAssemblyItem__Group__15194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__RasterAssemblyItem__Group__1__Impl5222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__Group__2__Impl_in_rule__RasterAssemblyItem__Group__25253 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__Group__3_in_rule__RasterAssemblyItem__Group__25256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__XUnitsAssignment_2_in_rule__RasterAssemblyItem__Group__2__Impl5283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__Group__3__Impl_in_rule__RasterAssemblyItem__Group__35313 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__Group__4_in_rule__RasterAssemblyItem__Group__35316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__YUnitsAssignment_3_in_rule__RasterAssemblyItem__Group__3__Impl5343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__Group__4__Impl_in_rule__RasterAssemblyItem__Group__45373 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__Group__5_in_rule__RasterAssemblyItem__Group__45376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__ZUnitsAssignment_4_in_rule__RasterAssemblyItem__Group__4__Impl5403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__Group__5__Impl_in_rule__RasterAssemblyItem__Group__55433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__Group_5__0_in_rule__RasterAssemblyItem__Group__5__Impl5460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__Group_5__0__Impl_in_rule__RasterAssemblyItem__Group_5__05503 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__Group_5__1_in_rule__RasterAssemblyItem__Group_5__05506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__RasterAssemblyItem__Group_5__0__Impl5534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__Group_5__1__Impl_in_rule__RasterAssemblyItem__Group_5__15565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__TransformAssignment_5_1_in_rule__RasterAssemblyItem__Group_5__1__Impl5592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group__0__Impl_in_rule__MountedAssemblyItem__Group__05626 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group__1_in_rule__MountedAssemblyItem__Group__05629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__ElementAssignment_0_in_rule__MountedAssemblyItem__Group__0__Impl5656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group__1__Impl_in_rule__MountedAssemblyItem__Group__15686 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group__2_in_rule__MountedAssemblyItem__Group__15689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__MountedAssemblyItem__Group__1__Impl5717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group__2__Impl_in_rule__MountedAssemblyItem__Group__25748 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group__3_in_rule__MountedAssemblyItem__Group__25751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__XUnitsAssignment_2_in_rule__MountedAssemblyItem__Group__2__Impl5778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group__3__Impl_in_rule__MountedAssemblyItem__Group__35808 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group__4_in_rule__MountedAssemblyItem__Group__35811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__YUnitsAssignment_3_in_rule__MountedAssemblyItem__Group__3__Impl5838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group__4__Impl_in_rule__MountedAssemblyItem__Group__45868 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group__5_in_rule__MountedAssemblyItem__Group__45871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__ZUnitsAssignment_4_in_rule__MountedAssemblyItem__Group__4__Impl5898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group__5__Impl_in_rule__MountedAssemblyItem__Group__55928 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group__6_in_rule__MountedAssemblyItem__Group__55931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group_5__0_in_rule__MountedAssemblyItem__Group__5__Impl5958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group__6__Impl_in_rule__MountedAssemblyItem__Group__65989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group_6__0_in_rule__MountedAssemblyItem__Group__6__Impl6016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group_5__0__Impl_in_rule__MountedAssemblyItem__Group_5__06061 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group_5__1_in_rule__MountedAssemblyItem__Group_5__06064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__MountedAssemblyItem__Group_5__0__Impl6092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group_5__1__Impl_in_rule__MountedAssemblyItem__Group_5__16123 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group_5__2_in_rule__MountedAssemblyItem__Group_5__16126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__RotateXAssignment_5_1_in_rule__MountedAssemblyItem__Group_5__1__Impl6153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group_5__2__Impl_in_rule__MountedAssemblyItem__Group_5__26183 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group_5__3_in_rule__MountedAssemblyItem__Group_5__26186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__RotateYAssignment_5_2_in_rule__MountedAssemblyItem__Group_5__2__Impl6213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group_5__3__Impl_in_rule__MountedAssemblyItem__Group_5__36243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__RotateZAssignment_5_3_in_rule__MountedAssemblyItem__Group_5__3__Impl6270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group_6__0__Impl_in_rule__MountedAssemblyItem__Group_6__06308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group_6__1_in_rule__MountedAssemblyItem__Group_6__06311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__MountedAssemblyItem__Group_6__0__Impl6339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__Group_6__1__Impl_in_rule__MountedAssemblyItem__Group_6__16370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__ActionsAssignment_6_1_in_rule__MountedAssemblyItem__Group_6__1__Impl6399 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__MountedAssemblyItem__ActionsAssignment_6_1_in_rule__MountedAssemblyItem__Group_6__1__Impl6411 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleItemRepository_in_rule__Model__RepoAssignment_06453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssembly_in_rule__Model__AssemblyAssignment_16484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__ItemRepository__NameAssignment_06515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepostoryItem_in_rule__ItemRepository__ElementListAssignment_26546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__MountedPart__NameAssignment_16577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__MountedPart__FillAssignment_26608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSource_in_rule__MountedPart__SourceAssignment_36639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Action__NameAssignment_06670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Action__TypeAssignment_16706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__AxisAlternatives_2_0_in_rule__Action__AxisAssignment_26745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__Action__AngleAssignment_36778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Action__DurationAssignment_56809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Action__SoundfileAssignment_6_16840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Color__RAssignment_16871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Color__GAssignment_26902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Color__BAssignment_36933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__XUnit__UnitsAssignment6964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__YUnit__UnitsAssignment6995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ZUnit__UnitsAssignment7026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__Brick__NameAssignment_17057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnit_in_rule__Brick__XUnitsAssignment_37088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYUnit_in_rule__Brick__YUnitsAssignment_47119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZUnit_in_rule__Brick__ZUnitsAssignment_57150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__Brick__FillAssignment_67181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSource_in_rule__Brick__SourceAssignment_77212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Generated__TypeAssignment_2_07248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__Generated__WidthAssignment_2_17287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__Generated__HeightAssignment_2_27318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__Generated__DepthAssignment_2_37349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__Generated__OriginXAssignment_2_4_17380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__Generated__OriginYAssignment_2_4_27411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__Generated__OriginZAssignment_2_4_37442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FxmlInclude__Source3dAssignment_17473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FxmlInclude__OriginXAssignment_2_17504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FxmlInclude__OriginYAssignment_2_27535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FxmlInclude__OriginZAssignment_2_37566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__Assembly__NameAssignment_17597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssemblyItem_in_rule__Assembly__ItemsAssignment_37628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__RasterAssemblyItem__ElementAssignment_07663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnit_in_rule__RasterAssemblyItem__XUnitsAssignment_27698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYUnit_in_rule__RasterAssemblyItem__YUnitsAssignment_37729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZUnit_in_rule__RasterAssemblyItem__ZUnitsAssignment_47760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RasterAssemblyItem__TransformAlternatives_5_1_0_in_rule__RasterAssemblyItem__TransformAssignment_5_17791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__MountedAssemblyItem__ElementAssignment_07828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__MountedAssemblyItem__XUnitsAssignment_27863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__MountedAssemblyItem__YUnitsAssignment_37894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__MountedAssemblyItem__ZUnitsAssignment_47925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__MountedAssemblyItem__RotateXAssignment_5_17956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__MountedAssemblyItem__RotateYAssignment_5_27987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__MountedAssemblyItem__RotateZAssignment_5_38018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__MountedAssemblyItem__ActionsAssignment_6_18049 = new BitSet(new long[]{0x0000000000000002L});

}