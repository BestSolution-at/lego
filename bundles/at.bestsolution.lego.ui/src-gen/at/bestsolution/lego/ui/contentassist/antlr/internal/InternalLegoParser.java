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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'generated'", "'rotate180'", "'rotate90'", "'rotate270'", "'.'", "'{'", "'}'", "'rgb'", "'brick'", "'units'", "'fxml'", "'2d'", "'3d'", "'origin'", "'door'", "'assembly'", "'pos'", "'transform'"
    };
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


    // $ANTLR start "entryRuleItem"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:175:1: entryRuleItem : ruleItem EOF ;
    public final void entryRuleItem() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:176:1: ( ruleItem EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:177:1: ruleItem EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRule()); 
            }
            pushFollow(FOLLOW_ruleItem_in_entryRuleItem308);
            ruleItem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleItem315); if (state.failed) return ;

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
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:184:1: ruleItem : ( ( rule__Item__Alternatives ) ) ;
    public final void ruleItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:188:2: ( ( ( rule__Item__Alternatives ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:189:1: ( ( rule__Item__Alternatives ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:189:1: ( ( rule__Item__Alternatives ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:190:1: ( rule__Item__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemAccess().getAlternatives()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:191:1: ( rule__Item__Alternatives )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:191:2: rule__Item__Alternatives
            {
            pushFollow(FOLLOW_rule__Item__Alternatives_in_ruleItem341);
            rule__Item__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleColor"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:203:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:204:1: ( ruleColor EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:205:1: ruleColor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorRule()); 
            }
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor368);
            ruleColor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor375); if (state.failed) return ;

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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:212:1: ruleColor : ( ( rule__Color__Group__0 ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:216:2: ( ( ( rule__Color__Group__0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:217:1: ( ( rule__Color__Group__0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:217:1: ( ( rule__Color__Group__0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:218:1: ( rule__Color__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getGroup()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:219:1: ( rule__Color__Group__0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:219:2: rule__Color__Group__0
            {
            pushFollow(FOLLOW_rule__Color__Group__0_in_ruleColor401);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:231:1: entryRuleXUnit : ruleXUnit EOF ;
    public final void entryRuleXUnit() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:232:1: ( ruleXUnit EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:233:1: ruleXUnit EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXUnitRule()); 
            }
            pushFollow(FOLLOW_ruleXUnit_in_entryRuleXUnit428);
            ruleXUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXUnitRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnit435); if (state.failed) return ;

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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:240:1: ruleXUnit : ( ( rule__XUnit__UnitsAssignment ) ) ;
    public final void ruleXUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:244:2: ( ( ( rule__XUnit__UnitsAssignment ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:245:1: ( ( rule__XUnit__UnitsAssignment ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:245:1: ( ( rule__XUnit__UnitsAssignment ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:246:1: ( rule__XUnit__UnitsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXUnitAccess().getUnitsAssignment()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:247:1: ( rule__XUnit__UnitsAssignment )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:247:2: rule__XUnit__UnitsAssignment
            {
            pushFollow(FOLLOW_rule__XUnit__UnitsAssignment_in_ruleXUnit461);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:259:1: entryRuleYUnit : ruleYUnit EOF ;
    public final void entryRuleYUnit() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:260:1: ( ruleYUnit EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:261:1: ruleYUnit EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYUnitRule()); 
            }
            pushFollow(FOLLOW_ruleYUnit_in_entryRuleYUnit488);
            ruleYUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYUnitRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleYUnit495); if (state.failed) return ;

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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:268:1: ruleYUnit : ( ( rule__YUnit__UnitsAssignment ) ) ;
    public final void ruleYUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:272:2: ( ( ( rule__YUnit__UnitsAssignment ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:273:1: ( ( rule__YUnit__UnitsAssignment ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:273:1: ( ( rule__YUnit__UnitsAssignment ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:274:1: ( rule__YUnit__UnitsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYUnitAccess().getUnitsAssignment()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:275:1: ( rule__YUnit__UnitsAssignment )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:275:2: rule__YUnit__UnitsAssignment
            {
            pushFollow(FOLLOW_rule__YUnit__UnitsAssignment_in_ruleYUnit521);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:287:1: entryRuleZUnit : ruleZUnit EOF ;
    public final void entryRuleZUnit() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:288:1: ( ruleZUnit EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:289:1: ruleZUnit EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getZUnitRule()); 
            }
            pushFollow(FOLLOW_ruleZUnit_in_entryRuleZUnit548);
            ruleZUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getZUnitRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleZUnit555); if (state.failed) return ;

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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:296:1: ruleZUnit : ( ( rule__ZUnit__UnitsAssignment ) ) ;
    public final void ruleZUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:300:2: ( ( ( rule__ZUnit__UnitsAssignment ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:301:1: ( ( rule__ZUnit__UnitsAssignment ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:301:1: ( ( rule__ZUnit__UnitsAssignment ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:302:1: ( rule__ZUnit__UnitsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getZUnitAccess().getUnitsAssignment()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:303:1: ( rule__ZUnit__UnitsAssignment )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:303:2: rule__ZUnit__UnitsAssignment
            {
            pushFollow(FOLLOW_rule__ZUnit__UnitsAssignment_in_ruleZUnit581);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:315:1: entryRuleBrick : ruleBrick EOF ;
    public final void entryRuleBrick() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:316:1: ( ruleBrick EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:317:1: ruleBrick EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickRule()); 
            }
            pushFollow(FOLLOW_ruleBrick_in_entryRuleBrick608);
            ruleBrick();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBrickRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBrick615); if (state.failed) return ;

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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:324:1: ruleBrick : ( ( rule__Brick__Group__0 ) ) ;
    public final void ruleBrick() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:328:2: ( ( ( rule__Brick__Group__0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:329:1: ( ( rule__Brick__Group__0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:329:1: ( ( rule__Brick__Group__0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:330:1: ( rule__Brick__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getGroup()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:331:1: ( rule__Brick__Group__0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:331:2: rule__Brick__Group__0
            {
            pushFollow(FOLLOW_rule__Brick__Group__0_in_ruleBrick641);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:343:1: entryRuleSource : ruleSource EOF ;
    public final void entryRuleSource() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:344:1: ( ruleSource EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:345:1: ruleSource EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceRule()); 
            }
            pushFollow(FOLLOW_ruleSource_in_entryRuleSource668);
            ruleSource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSource675); if (state.failed) return ;

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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:352:1: ruleSource : ( ( rule__Source__Alternatives ) ) ;
    public final void ruleSource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:356:2: ( ( ( rule__Source__Alternatives ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:357:1: ( ( rule__Source__Alternatives ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:357:1: ( ( rule__Source__Alternatives ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:358:1: ( rule__Source__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceAccess().getAlternatives()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:359:1: ( rule__Source__Alternatives )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:359:2: rule__Source__Alternatives
            {
            pushFollow(FOLLOW_rule__Source__Alternatives_in_ruleSource701);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:371:1: entryRuleGenerated : ruleGenerated EOF ;
    public final void entryRuleGenerated() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:372:1: ( ruleGenerated EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:373:1: ruleGenerated EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedRule()); 
            }
            pushFollow(FOLLOW_ruleGenerated_in_entryRuleGenerated728);
            ruleGenerated();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratedRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenerated735); if (state.failed) return ;

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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:380:1: ruleGenerated : ( 'generated' ) ;
    public final void ruleGenerated() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:384:2: ( ( 'generated' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:385:1: ( 'generated' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:385:1: ( 'generated' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:386:1: 'generated'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratedAccess().getGeneratedKeyword()); 
            }
            match(input,12,FOLLOW_12_in_ruleGenerated762); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratedAccess().getGeneratedKeyword()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:401:1: entryRuleFxmlInclude : ruleFxmlInclude EOF ;
    public final void entryRuleFxmlInclude() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:402:1: ( ruleFxmlInclude EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:403:1: ruleFxmlInclude EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeRule()); 
            }
            pushFollow(FOLLOW_ruleFxmlInclude_in_entryRuleFxmlInclude790);
            ruleFxmlInclude();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFxmlIncludeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFxmlInclude797); if (state.failed) return ;

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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:410:1: ruleFxmlInclude : ( ( rule__FxmlInclude__Group__0 ) ) ;
    public final void ruleFxmlInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:414:2: ( ( ( rule__FxmlInclude__Group__0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:415:1: ( ( rule__FxmlInclude__Group__0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:415:1: ( ( rule__FxmlInclude__Group__0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:416:1: ( rule__FxmlInclude__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getGroup()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:417:1: ( rule__FxmlInclude__Group__0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:417:2: rule__FxmlInclude__Group__0
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group__0_in_ruleFxmlInclude823);
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


    // $ANTLR start "entryRuleDoor"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:429:1: entryRuleDoor : ruleDoor EOF ;
    public final void entryRuleDoor() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:430:1: ( ruleDoor EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:431:1: ruleDoor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorRule()); 
            }
            pushFollow(FOLLOW_ruleDoor_in_entryRuleDoor850);
            ruleDoor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoor857); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDoor"


    // $ANTLR start "ruleDoor"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:438:1: ruleDoor : ( ( rule__Door__Group__0 ) ) ;
    public final void ruleDoor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:442:2: ( ( ( rule__Door__Group__0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:443:1: ( ( rule__Door__Group__0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:443:1: ( ( rule__Door__Group__0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:444:1: ( rule__Door__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorAccess().getGroup()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:445:1: ( rule__Door__Group__0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:445:2: rule__Door__Group__0
            {
            pushFollow(FOLLOW_rule__Door__Group__0_in_ruleDoor883);
            rule__Door__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoor"


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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:494:1: ruleAssemblyItem : ( ( rule__AssemblyItem__Group__0 ) ) ;
    public final void ruleAssemblyItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:498:2: ( ( ( rule__AssemblyItem__Group__0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:499:1: ( ( rule__AssemblyItem__Group__0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:499:1: ( ( rule__AssemblyItem__Group__0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:500:1: ( rule__AssemblyItem__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getGroup()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:501:1: ( rule__AssemblyItem__Group__0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:501:2: rule__AssemblyItem__Group__0
            {
            pushFollow(FOLLOW_rule__AssemblyItem__Group__0_in_ruleAssemblyItem1003);
            rule__AssemblyItem__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyItemAccess().getGroup()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Model__Alternatives"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:513:1: rule__Model__Alternatives : ( ( ( rule__Model__RepoAssignment_0 ) ) | ( ( rule__Model__AssemblyAssignment_1 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:517:1: ( ( ( rule__Model__RepoAssignment_0 ) ) | ( ( rule__Model__AssemblyAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==27) ) {
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
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:518:1: ( ( rule__Model__RepoAssignment_0 ) )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:518:1: ( ( rule__Model__RepoAssignment_0 ) )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:519:1: ( rule__Model__RepoAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getRepoAssignment_0()); 
                    }
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:520:1: ( rule__Model__RepoAssignment_0 )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:520:2: rule__Model__RepoAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Model__RepoAssignment_0_in_rule__Model__Alternatives1039);
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
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:524:6: ( ( rule__Model__AssemblyAssignment_1 ) )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:524:6: ( ( rule__Model__AssemblyAssignment_1 ) )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:525:1: ( rule__Model__AssemblyAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getAssemblyAssignment_1()); 
                    }
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:526:1: ( rule__Model__AssemblyAssignment_1 )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:526:2: rule__Model__AssemblyAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__AssemblyAssignment_1_in_rule__Model__Alternatives1057);
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


    // $ANTLR start "rule__Item__Alternatives"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:536:1: rule__Item__Alternatives : ( ( ruleBrick ) | ( ruleDoor ) );
    public final void rule__Item__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:540:1: ( ( ruleBrick ) | ( ruleDoor ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            else if ( (LA2_0==26) ) {
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
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:541:1: ( ruleBrick )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:541:1: ( ruleBrick )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:542:1: ruleBrick
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getItemAccess().getBrickParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleBrick_in_rule__Item__Alternatives1091);
                    ruleBrick();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getItemAccess().getBrickParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:547:6: ( ruleDoor )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:547:6: ( ruleDoor )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:548:1: ruleDoor
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getItemAccess().getDoorParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleDoor_in_rule__Item__Alternatives1108);
                    ruleDoor();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getItemAccess().getDoorParserRuleCall_1()); 
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
    // $ANTLR end "rule__Item__Alternatives"


    // $ANTLR start "rule__Source__Alternatives"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:558:1: rule__Source__Alternatives : ( ( ruleGenerated ) | ( ruleFxmlInclude ) );
    public final void rule__Source__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:562:1: ( ( ruleGenerated ) | ( ruleFxmlInclude ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==22) ) {
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
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:563:1: ( ruleGenerated )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:563:1: ( ruleGenerated )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:564:1: ruleGenerated
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSourceAccess().getGeneratedParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleGenerated_in_rule__Source__Alternatives1140);
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
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:569:6: ( ruleFxmlInclude )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:569:6: ( ruleFxmlInclude )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:570:1: ruleFxmlInclude
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSourceAccess().getFxmlIncludeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleFxmlInclude_in_rule__Source__Alternatives1157);
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


    // $ANTLR start "rule__AssemblyItem__TransformAlternatives_5_1_0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:580:1: rule__AssemblyItem__TransformAlternatives_5_1_0 : ( ( 'rotate180' ) | ( 'rotate90' ) | ( 'rotate270' ) );
    public final void rule__AssemblyItem__TransformAlternatives_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:584:1: ( ( 'rotate180' ) | ( 'rotate90' ) | ( 'rotate270' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:585:1: ( 'rotate180' )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:585:1: ( 'rotate180' )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:586:1: 'rotate180'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssemblyItemAccess().getTransformRotate180Keyword_5_1_0_0()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__AssemblyItem__TransformAlternatives_5_1_01190); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssemblyItemAccess().getTransformRotate180Keyword_5_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:593:6: ( 'rotate90' )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:593:6: ( 'rotate90' )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:594:1: 'rotate90'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssemblyItemAccess().getTransformRotate90Keyword_5_1_0_1()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__AssemblyItem__TransformAlternatives_5_1_01210); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssemblyItemAccess().getTransformRotate90Keyword_5_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:601:6: ( 'rotate270' )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:601:6: ( 'rotate270' )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:602:1: 'rotate270'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssemblyItemAccess().getTransformRotate270Keyword_5_1_0_2()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__AssemblyItem__TransformAlternatives_5_1_01230); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssemblyItemAccess().getTransformRotate270Keyword_5_1_0_2()); 
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
    // $ANTLR end "rule__AssemblyItem__TransformAlternatives_5_1_0"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:616:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:620:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:621:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01262);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01265);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:628:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:632:1: ( ( ruleValidID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:633:1: ( ruleValidID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:633:1: ( ruleValidID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:634:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl1292);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:645:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:649:1: ( rule__QualifiedName__Group__1__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:650:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11321);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:656:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:660:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:661:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:661:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:662:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:663:1: ( rule__QualifiedName__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:663:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1348);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:677:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:681:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:682:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01383);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01386);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:689:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:693:1: ( ( ( '.' ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:694:1: ( ( '.' ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:694:1: ( ( '.' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:695:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:696:1: ( '.' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:697:2: '.'
            {
            match(input,16,FOLLOW_16_in_rule__QualifiedName__Group_1__0__Impl1415); if (state.failed) return ;

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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:708:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:712:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:713:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11447);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:719:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:723:1: ( ( ruleValidID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:724:1: ( ruleValidID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:724:1: ( ruleValidID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:725:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl1474);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:740:1: rule__ItemRepository__Group__0 : rule__ItemRepository__Group__0__Impl rule__ItemRepository__Group__1 ;
    public final void rule__ItemRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:744:1: ( rule__ItemRepository__Group__0__Impl rule__ItemRepository__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:745:2: rule__ItemRepository__Group__0__Impl rule__ItemRepository__Group__1
            {
            pushFollow(FOLLOW_rule__ItemRepository__Group__0__Impl_in_rule__ItemRepository__Group__01507);
            rule__ItemRepository__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ItemRepository__Group__1_in_rule__ItemRepository__Group__01510);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:752:1: rule__ItemRepository__Group__0__Impl : ( ( rule__ItemRepository__NameAssignment_0 ) ) ;
    public final void rule__ItemRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:756:1: ( ( ( rule__ItemRepository__NameAssignment_0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:757:1: ( ( rule__ItemRepository__NameAssignment_0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:757:1: ( ( rule__ItemRepository__NameAssignment_0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:758:1: ( rule__ItemRepository__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getNameAssignment_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:759:1: ( rule__ItemRepository__NameAssignment_0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:759:2: rule__ItemRepository__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ItemRepository__NameAssignment_0_in_rule__ItemRepository__Group__0__Impl1537);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:769:1: rule__ItemRepository__Group__1 : rule__ItemRepository__Group__1__Impl rule__ItemRepository__Group__2 ;
    public final void rule__ItemRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:773:1: ( rule__ItemRepository__Group__1__Impl rule__ItemRepository__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:774:2: rule__ItemRepository__Group__1__Impl rule__ItemRepository__Group__2
            {
            pushFollow(FOLLOW_rule__ItemRepository__Group__1__Impl_in_rule__ItemRepository__Group__11567);
            rule__ItemRepository__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ItemRepository__Group__2_in_rule__ItemRepository__Group__11570);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:781:1: rule__ItemRepository__Group__1__Impl : ( '{' ) ;
    public final void rule__ItemRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:785:1: ( ( '{' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:786:1: ( '{' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:786:1: ( '{' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:787:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,17,FOLLOW_17_in_rule__ItemRepository__Group__1__Impl1598); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:800:1: rule__ItemRepository__Group__2 : rule__ItemRepository__Group__2__Impl rule__ItemRepository__Group__3 ;
    public final void rule__ItemRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:804:1: ( rule__ItemRepository__Group__2__Impl rule__ItemRepository__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:805:2: rule__ItemRepository__Group__2__Impl rule__ItemRepository__Group__3
            {
            pushFollow(FOLLOW_rule__ItemRepository__Group__2__Impl_in_rule__ItemRepository__Group__21629);
            rule__ItemRepository__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ItemRepository__Group__3_in_rule__ItemRepository__Group__21632);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:812:1: rule__ItemRepository__Group__2__Impl : ( ( ( rule__ItemRepository__ElementListAssignment_2 ) ) ( ( rule__ItemRepository__ElementListAssignment_2 )* ) ) ;
    public final void rule__ItemRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:816:1: ( ( ( ( rule__ItemRepository__ElementListAssignment_2 ) ) ( ( rule__ItemRepository__ElementListAssignment_2 )* ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:817:1: ( ( ( rule__ItemRepository__ElementListAssignment_2 ) ) ( ( rule__ItemRepository__ElementListAssignment_2 )* ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:817:1: ( ( ( rule__ItemRepository__ElementListAssignment_2 ) ) ( ( rule__ItemRepository__ElementListAssignment_2 )* ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:818:1: ( ( rule__ItemRepository__ElementListAssignment_2 ) ) ( ( rule__ItemRepository__ElementListAssignment_2 )* )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:818:1: ( ( rule__ItemRepository__ElementListAssignment_2 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:819:1: ( rule__ItemRepository__ElementListAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getElementListAssignment_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:820:1: ( rule__ItemRepository__ElementListAssignment_2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:820:2: rule__ItemRepository__ElementListAssignment_2
            {
            pushFollow(FOLLOW_rule__ItemRepository__ElementListAssignment_2_in_rule__ItemRepository__Group__2__Impl1661);
            rule__ItemRepository__ElementListAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemRepositoryAccess().getElementListAssignment_2()); 
            }

            }

            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:823:1: ( ( rule__ItemRepository__ElementListAssignment_2 )* )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:824:1: ( rule__ItemRepository__ElementListAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getElementListAssignment_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:825:1: ( rule__ItemRepository__ElementListAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20||LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:825:2: rule__ItemRepository__ElementListAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ItemRepository__ElementListAssignment_2_in_rule__ItemRepository__Group__2__Impl1673);
            	    rule__ItemRepository__ElementListAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:836:1: rule__ItemRepository__Group__3 : rule__ItemRepository__Group__3__Impl ;
    public final void rule__ItemRepository__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:840:1: ( rule__ItemRepository__Group__3__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:841:2: rule__ItemRepository__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ItemRepository__Group__3__Impl_in_rule__ItemRepository__Group__31706);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:847:1: rule__ItemRepository__Group__3__Impl : ( '}' ) ;
    public final void rule__ItemRepository__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:851:1: ( ( '}' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:852:1: ( '}' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:852:1: ( '}' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:853:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,18,FOLLOW_18_in_rule__ItemRepository__Group__3__Impl1734); if (state.failed) return ;
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


    // $ANTLR start "rule__Color__Group__0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:874:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:878:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:879:2: rule__Color__Group__0__Impl rule__Color__Group__1
            {
            pushFollow(FOLLOW_rule__Color__Group__0__Impl_in_rule__Color__Group__01773);
            rule__Color__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Color__Group__1_in_rule__Color__Group__01776);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:886:1: rule__Color__Group__0__Impl : ( 'rgb' ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:890:1: ( ( 'rgb' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:891:1: ( 'rgb' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:891:1: ( 'rgb' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:892:1: 'rgb'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getRgbKeyword_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__Color__Group__0__Impl1804); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:905:1: rule__Color__Group__1 : rule__Color__Group__1__Impl rule__Color__Group__2 ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:909:1: ( rule__Color__Group__1__Impl rule__Color__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:910:2: rule__Color__Group__1__Impl rule__Color__Group__2
            {
            pushFollow(FOLLOW_rule__Color__Group__1__Impl_in_rule__Color__Group__11835);
            rule__Color__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Color__Group__2_in_rule__Color__Group__11838);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:917:1: rule__Color__Group__1__Impl : ( ( rule__Color__RAssignment_1 ) ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:921:1: ( ( ( rule__Color__RAssignment_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:922:1: ( ( rule__Color__RAssignment_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:922:1: ( ( rule__Color__RAssignment_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:923:1: ( rule__Color__RAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getRAssignment_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:924:1: ( rule__Color__RAssignment_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:924:2: rule__Color__RAssignment_1
            {
            pushFollow(FOLLOW_rule__Color__RAssignment_1_in_rule__Color__Group__1__Impl1865);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:934:1: rule__Color__Group__2 : rule__Color__Group__2__Impl rule__Color__Group__3 ;
    public final void rule__Color__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:938:1: ( rule__Color__Group__2__Impl rule__Color__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:939:2: rule__Color__Group__2__Impl rule__Color__Group__3
            {
            pushFollow(FOLLOW_rule__Color__Group__2__Impl_in_rule__Color__Group__21895);
            rule__Color__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Color__Group__3_in_rule__Color__Group__21898);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:946:1: rule__Color__Group__2__Impl : ( ( rule__Color__GAssignment_2 ) ) ;
    public final void rule__Color__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:950:1: ( ( ( rule__Color__GAssignment_2 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:951:1: ( ( rule__Color__GAssignment_2 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:951:1: ( ( rule__Color__GAssignment_2 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:952:1: ( rule__Color__GAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getGAssignment_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:953:1: ( rule__Color__GAssignment_2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:953:2: rule__Color__GAssignment_2
            {
            pushFollow(FOLLOW_rule__Color__GAssignment_2_in_rule__Color__Group__2__Impl1925);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:963:1: rule__Color__Group__3 : rule__Color__Group__3__Impl ;
    public final void rule__Color__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:967:1: ( rule__Color__Group__3__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:968:2: rule__Color__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Color__Group__3__Impl_in_rule__Color__Group__31955);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:974:1: rule__Color__Group__3__Impl : ( ( rule__Color__BAssignment_3 ) ) ;
    public final void rule__Color__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:978:1: ( ( ( rule__Color__BAssignment_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:979:1: ( ( rule__Color__BAssignment_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:979:1: ( ( rule__Color__BAssignment_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:980:1: ( rule__Color__BAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getBAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:981:1: ( rule__Color__BAssignment_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:981:2: rule__Color__BAssignment_3
            {
            pushFollow(FOLLOW_rule__Color__BAssignment_3_in_rule__Color__Group__3__Impl1982);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:999:1: rule__Brick__Group__0 : rule__Brick__Group__0__Impl rule__Brick__Group__1 ;
    public final void rule__Brick__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1003:1: ( rule__Brick__Group__0__Impl rule__Brick__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1004:2: rule__Brick__Group__0__Impl rule__Brick__Group__1
            {
            pushFollow(FOLLOW_rule__Brick__Group__0__Impl_in_rule__Brick__Group__02020);
            rule__Brick__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Brick__Group__1_in_rule__Brick__Group__02023);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1011:1: rule__Brick__Group__0__Impl : ( 'brick' ) ;
    public final void rule__Brick__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1015:1: ( ( 'brick' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1016:1: ( 'brick' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1016:1: ( 'brick' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1017:1: 'brick'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getBrickKeyword_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Brick__Group__0__Impl2051); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1030:1: rule__Brick__Group__1 : rule__Brick__Group__1__Impl rule__Brick__Group__2 ;
    public final void rule__Brick__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1034:1: ( rule__Brick__Group__1__Impl rule__Brick__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1035:2: rule__Brick__Group__1__Impl rule__Brick__Group__2
            {
            pushFollow(FOLLOW_rule__Brick__Group__1__Impl_in_rule__Brick__Group__12082);
            rule__Brick__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Brick__Group__2_in_rule__Brick__Group__12085);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1042:1: rule__Brick__Group__1__Impl : ( ( rule__Brick__NameAssignment_1 ) ) ;
    public final void rule__Brick__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1046:1: ( ( ( rule__Brick__NameAssignment_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1047:1: ( ( rule__Brick__NameAssignment_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1047:1: ( ( rule__Brick__NameAssignment_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1048:1: ( rule__Brick__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1049:1: ( rule__Brick__NameAssignment_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1049:2: rule__Brick__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Brick__NameAssignment_1_in_rule__Brick__Group__1__Impl2112);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1059:1: rule__Brick__Group__2 : rule__Brick__Group__2__Impl rule__Brick__Group__3 ;
    public final void rule__Brick__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1063:1: ( rule__Brick__Group__2__Impl rule__Brick__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1064:2: rule__Brick__Group__2__Impl rule__Brick__Group__3
            {
            pushFollow(FOLLOW_rule__Brick__Group__2__Impl_in_rule__Brick__Group__22142);
            rule__Brick__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Brick__Group__3_in_rule__Brick__Group__22145);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1071:1: rule__Brick__Group__2__Impl : ( 'units' ) ;
    public final void rule__Brick__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1075:1: ( ( 'units' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1076:1: ( 'units' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1076:1: ( 'units' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1077:1: 'units'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getUnitsKeyword_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__Brick__Group__2__Impl2173); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1090:1: rule__Brick__Group__3 : rule__Brick__Group__3__Impl rule__Brick__Group__4 ;
    public final void rule__Brick__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1094:1: ( rule__Brick__Group__3__Impl rule__Brick__Group__4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1095:2: rule__Brick__Group__3__Impl rule__Brick__Group__4
            {
            pushFollow(FOLLOW_rule__Brick__Group__3__Impl_in_rule__Brick__Group__32204);
            rule__Brick__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Brick__Group__4_in_rule__Brick__Group__32207);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1102:1: rule__Brick__Group__3__Impl : ( ( rule__Brick__XUnitsAssignment_3 ) ) ;
    public final void rule__Brick__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1106:1: ( ( ( rule__Brick__XUnitsAssignment_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1107:1: ( ( rule__Brick__XUnitsAssignment_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1107:1: ( ( rule__Brick__XUnitsAssignment_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1108:1: ( rule__Brick__XUnitsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getXUnitsAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1109:1: ( rule__Brick__XUnitsAssignment_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1109:2: rule__Brick__XUnitsAssignment_3
            {
            pushFollow(FOLLOW_rule__Brick__XUnitsAssignment_3_in_rule__Brick__Group__3__Impl2234);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1119:1: rule__Brick__Group__4 : rule__Brick__Group__4__Impl rule__Brick__Group__5 ;
    public final void rule__Brick__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1123:1: ( rule__Brick__Group__4__Impl rule__Brick__Group__5 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1124:2: rule__Brick__Group__4__Impl rule__Brick__Group__5
            {
            pushFollow(FOLLOW_rule__Brick__Group__4__Impl_in_rule__Brick__Group__42264);
            rule__Brick__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Brick__Group__5_in_rule__Brick__Group__42267);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1131:1: rule__Brick__Group__4__Impl : ( ( rule__Brick__YUnitsAssignment_4 ) ) ;
    public final void rule__Brick__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1135:1: ( ( ( rule__Brick__YUnitsAssignment_4 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1136:1: ( ( rule__Brick__YUnitsAssignment_4 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1136:1: ( ( rule__Brick__YUnitsAssignment_4 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1137:1: ( rule__Brick__YUnitsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getYUnitsAssignment_4()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1138:1: ( rule__Brick__YUnitsAssignment_4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1138:2: rule__Brick__YUnitsAssignment_4
            {
            pushFollow(FOLLOW_rule__Brick__YUnitsAssignment_4_in_rule__Brick__Group__4__Impl2294);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1148:1: rule__Brick__Group__5 : rule__Brick__Group__5__Impl rule__Brick__Group__6 ;
    public final void rule__Brick__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1152:1: ( rule__Brick__Group__5__Impl rule__Brick__Group__6 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1153:2: rule__Brick__Group__5__Impl rule__Brick__Group__6
            {
            pushFollow(FOLLOW_rule__Brick__Group__5__Impl_in_rule__Brick__Group__52324);
            rule__Brick__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Brick__Group__6_in_rule__Brick__Group__52327);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1160:1: rule__Brick__Group__5__Impl : ( ( rule__Brick__ZUnitsAssignment_5 ) ) ;
    public final void rule__Brick__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1164:1: ( ( ( rule__Brick__ZUnitsAssignment_5 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1165:1: ( ( rule__Brick__ZUnitsAssignment_5 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1165:1: ( ( rule__Brick__ZUnitsAssignment_5 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1166:1: ( rule__Brick__ZUnitsAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getZUnitsAssignment_5()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1167:1: ( rule__Brick__ZUnitsAssignment_5 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1167:2: rule__Brick__ZUnitsAssignment_5
            {
            pushFollow(FOLLOW_rule__Brick__ZUnitsAssignment_5_in_rule__Brick__Group__5__Impl2354);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1177:1: rule__Brick__Group__6 : rule__Brick__Group__6__Impl rule__Brick__Group__7 ;
    public final void rule__Brick__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1181:1: ( rule__Brick__Group__6__Impl rule__Brick__Group__7 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1182:2: rule__Brick__Group__6__Impl rule__Brick__Group__7
            {
            pushFollow(FOLLOW_rule__Brick__Group__6__Impl_in_rule__Brick__Group__62384);
            rule__Brick__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Brick__Group__7_in_rule__Brick__Group__62387);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1189:1: rule__Brick__Group__6__Impl : ( ( rule__Brick__FillAssignment_6 ) ) ;
    public final void rule__Brick__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1193:1: ( ( ( rule__Brick__FillAssignment_6 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1194:1: ( ( rule__Brick__FillAssignment_6 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1194:1: ( ( rule__Brick__FillAssignment_6 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1195:1: ( rule__Brick__FillAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getFillAssignment_6()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1196:1: ( rule__Brick__FillAssignment_6 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1196:2: rule__Brick__FillAssignment_6
            {
            pushFollow(FOLLOW_rule__Brick__FillAssignment_6_in_rule__Brick__Group__6__Impl2414);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1206:1: rule__Brick__Group__7 : rule__Brick__Group__7__Impl ;
    public final void rule__Brick__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1210:1: ( rule__Brick__Group__7__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1211:2: rule__Brick__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Brick__Group__7__Impl_in_rule__Brick__Group__72444);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1217:1: rule__Brick__Group__7__Impl : ( ( rule__Brick__SourceAssignment_7 ) ) ;
    public final void rule__Brick__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1221:1: ( ( ( rule__Brick__SourceAssignment_7 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1222:1: ( ( rule__Brick__SourceAssignment_7 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1222:1: ( ( rule__Brick__SourceAssignment_7 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1223:1: ( rule__Brick__SourceAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getSourceAssignment_7()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1224:1: ( rule__Brick__SourceAssignment_7 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1224:2: rule__Brick__SourceAssignment_7
            {
            pushFollow(FOLLOW_rule__Brick__SourceAssignment_7_in_rule__Brick__Group__7__Impl2471);
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


    // $ANTLR start "rule__FxmlInclude__Group__0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1250:1: rule__FxmlInclude__Group__0 : rule__FxmlInclude__Group__0__Impl rule__FxmlInclude__Group__1 ;
    public final void rule__FxmlInclude__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1254:1: ( rule__FxmlInclude__Group__0__Impl rule__FxmlInclude__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1255:2: rule__FxmlInclude__Group__0__Impl rule__FxmlInclude__Group__1
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group__0__Impl_in_rule__FxmlInclude__Group__02517);
            rule__FxmlInclude__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FxmlInclude__Group__1_in_rule__FxmlInclude__Group__02520);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1262:1: rule__FxmlInclude__Group__0__Impl : ( 'fxml' ) ;
    public final void rule__FxmlInclude__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1266:1: ( ( 'fxml' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1267:1: ( 'fxml' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1267:1: ( 'fxml' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1268:1: 'fxml'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getFxmlKeyword_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__FxmlInclude__Group__0__Impl2548); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1281:1: rule__FxmlInclude__Group__1 : rule__FxmlInclude__Group__1__Impl rule__FxmlInclude__Group__2 ;
    public final void rule__FxmlInclude__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1285:1: ( rule__FxmlInclude__Group__1__Impl rule__FxmlInclude__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1286:2: rule__FxmlInclude__Group__1__Impl rule__FxmlInclude__Group__2
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group__1__Impl_in_rule__FxmlInclude__Group__12579);
            rule__FxmlInclude__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FxmlInclude__Group__2_in_rule__FxmlInclude__Group__12582);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1293:1: rule__FxmlInclude__Group__1__Impl : ( '2d' ) ;
    public final void rule__FxmlInclude__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1297:1: ( ( '2d' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1298:1: ( '2d' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1298:1: ( '2d' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1299:1: '2d'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getDKeyword_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__FxmlInclude__Group__1__Impl2610); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFxmlIncludeAccess().getDKeyword_1()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1312:1: rule__FxmlInclude__Group__2 : rule__FxmlInclude__Group__2__Impl rule__FxmlInclude__Group__3 ;
    public final void rule__FxmlInclude__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1316:1: ( rule__FxmlInclude__Group__2__Impl rule__FxmlInclude__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1317:2: rule__FxmlInclude__Group__2__Impl rule__FxmlInclude__Group__3
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group__2__Impl_in_rule__FxmlInclude__Group__22641);
            rule__FxmlInclude__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FxmlInclude__Group__3_in_rule__FxmlInclude__Group__22644);
            rule__FxmlInclude__Group__3();

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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1324:1: rule__FxmlInclude__Group__2__Impl : ( '{' ) ;
    public final void rule__FxmlInclude__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1328:1: ( ( '{' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1329:1: ( '{' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1329:1: ( '{' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1330:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,17,FOLLOW_17_in_rule__FxmlInclude__Group__2__Impl2672); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFxmlIncludeAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__FxmlInclude__Group__3"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1343:1: rule__FxmlInclude__Group__3 : rule__FxmlInclude__Group__3__Impl rule__FxmlInclude__Group__4 ;
    public final void rule__FxmlInclude__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1347:1: ( rule__FxmlInclude__Group__3__Impl rule__FxmlInclude__Group__4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1348:2: rule__FxmlInclude__Group__3__Impl rule__FxmlInclude__Group__4
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group__3__Impl_in_rule__FxmlInclude__Group__32703);
            rule__FxmlInclude__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FxmlInclude__Group__4_in_rule__FxmlInclude__Group__32706);
            rule__FxmlInclude__Group__4();

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
    // $ANTLR end "rule__FxmlInclude__Group__3"


    // $ANTLR start "rule__FxmlInclude__Group__3__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1355:1: rule__FxmlInclude__Group__3__Impl : ( ( rule__FxmlInclude__Source2dAssignment_3 ) ) ;
    public final void rule__FxmlInclude__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1359:1: ( ( ( rule__FxmlInclude__Source2dAssignment_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1360:1: ( ( rule__FxmlInclude__Source2dAssignment_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1360:1: ( ( rule__FxmlInclude__Source2dAssignment_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1361:1: ( rule__FxmlInclude__Source2dAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getSource2dAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1362:1: ( rule__FxmlInclude__Source2dAssignment_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1362:2: rule__FxmlInclude__Source2dAssignment_3
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Source2dAssignment_3_in_rule__FxmlInclude__Group__3__Impl2733);
            rule__FxmlInclude__Source2dAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFxmlIncludeAccess().getSource2dAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FxmlInclude__Group__3__Impl"


    // $ANTLR start "rule__FxmlInclude__Group__4"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1372:1: rule__FxmlInclude__Group__4 : rule__FxmlInclude__Group__4__Impl rule__FxmlInclude__Group__5 ;
    public final void rule__FxmlInclude__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1376:1: ( rule__FxmlInclude__Group__4__Impl rule__FxmlInclude__Group__5 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1377:2: rule__FxmlInclude__Group__4__Impl rule__FxmlInclude__Group__5
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group__4__Impl_in_rule__FxmlInclude__Group__42763);
            rule__FxmlInclude__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FxmlInclude__Group__5_in_rule__FxmlInclude__Group__42766);
            rule__FxmlInclude__Group__5();

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
    // $ANTLR end "rule__FxmlInclude__Group__4"


    // $ANTLR start "rule__FxmlInclude__Group__4__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1384:1: rule__FxmlInclude__Group__4__Impl : ( '}' ) ;
    public final void rule__FxmlInclude__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1388:1: ( ( '}' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1389:1: ( '}' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1389:1: ( '}' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1390:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,18,FOLLOW_18_in_rule__FxmlInclude__Group__4__Impl2794); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFxmlIncludeAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FxmlInclude__Group__4__Impl"


    // $ANTLR start "rule__FxmlInclude__Group__5"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1403:1: rule__FxmlInclude__Group__5 : rule__FxmlInclude__Group__5__Impl rule__FxmlInclude__Group__6 ;
    public final void rule__FxmlInclude__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1407:1: ( rule__FxmlInclude__Group__5__Impl rule__FxmlInclude__Group__6 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1408:2: rule__FxmlInclude__Group__5__Impl rule__FxmlInclude__Group__6
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group__5__Impl_in_rule__FxmlInclude__Group__52825);
            rule__FxmlInclude__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FxmlInclude__Group__6_in_rule__FxmlInclude__Group__52828);
            rule__FxmlInclude__Group__6();

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
    // $ANTLR end "rule__FxmlInclude__Group__5"


    // $ANTLR start "rule__FxmlInclude__Group__5__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1415:1: rule__FxmlInclude__Group__5__Impl : ( '3d' ) ;
    public final void rule__FxmlInclude__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1419:1: ( ( '3d' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1420:1: ( '3d' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1420:1: ( '3d' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1421:1: '3d'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getDKeyword_5()); 
            }
            match(input,24,FOLLOW_24_in_rule__FxmlInclude__Group__5__Impl2856); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFxmlIncludeAccess().getDKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FxmlInclude__Group__5__Impl"


    // $ANTLR start "rule__FxmlInclude__Group__6"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1434:1: rule__FxmlInclude__Group__6 : rule__FxmlInclude__Group__6__Impl rule__FxmlInclude__Group__7 ;
    public final void rule__FxmlInclude__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1438:1: ( rule__FxmlInclude__Group__6__Impl rule__FxmlInclude__Group__7 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1439:2: rule__FxmlInclude__Group__6__Impl rule__FxmlInclude__Group__7
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group__6__Impl_in_rule__FxmlInclude__Group__62887);
            rule__FxmlInclude__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FxmlInclude__Group__7_in_rule__FxmlInclude__Group__62890);
            rule__FxmlInclude__Group__7();

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
    // $ANTLR end "rule__FxmlInclude__Group__6"


    // $ANTLR start "rule__FxmlInclude__Group__6__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1446:1: rule__FxmlInclude__Group__6__Impl : ( '{' ) ;
    public final void rule__FxmlInclude__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1450:1: ( ( '{' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1451:1: ( '{' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1451:1: ( '{' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1452:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getLeftCurlyBracketKeyword_6()); 
            }
            match(input,17,FOLLOW_17_in_rule__FxmlInclude__Group__6__Impl2918); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFxmlIncludeAccess().getLeftCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FxmlInclude__Group__6__Impl"


    // $ANTLR start "rule__FxmlInclude__Group__7"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1465:1: rule__FxmlInclude__Group__7 : rule__FxmlInclude__Group__7__Impl rule__FxmlInclude__Group__8 ;
    public final void rule__FxmlInclude__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1469:1: ( rule__FxmlInclude__Group__7__Impl rule__FxmlInclude__Group__8 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1470:2: rule__FxmlInclude__Group__7__Impl rule__FxmlInclude__Group__8
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group__7__Impl_in_rule__FxmlInclude__Group__72949);
            rule__FxmlInclude__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FxmlInclude__Group__8_in_rule__FxmlInclude__Group__72952);
            rule__FxmlInclude__Group__8();

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
    // $ANTLR end "rule__FxmlInclude__Group__7"


    // $ANTLR start "rule__FxmlInclude__Group__7__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1477:1: rule__FxmlInclude__Group__7__Impl : ( ( rule__FxmlInclude__Source3dAssignment_7 ) ) ;
    public final void rule__FxmlInclude__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1481:1: ( ( ( rule__FxmlInclude__Source3dAssignment_7 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1482:1: ( ( rule__FxmlInclude__Source3dAssignment_7 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1482:1: ( ( rule__FxmlInclude__Source3dAssignment_7 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1483:1: ( rule__FxmlInclude__Source3dAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getSource3dAssignment_7()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1484:1: ( rule__FxmlInclude__Source3dAssignment_7 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1484:2: rule__FxmlInclude__Source3dAssignment_7
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Source3dAssignment_7_in_rule__FxmlInclude__Group__7__Impl2979);
            rule__FxmlInclude__Source3dAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFxmlIncludeAccess().getSource3dAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FxmlInclude__Group__7__Impl"


    // $ANTLR start "rule__FxmlInclude__Group__8"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1494:1: rule__FxmlInclude__Group__8 : rule__FxmlInclude__Group__8__Impl rule__FxmlInclude__Group__9 ;
    public final void rule__FxmlInclude__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1498:1: ( rule__FxmlInclude__Group__8__Impl rule__FxmlInclude__Group__9 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1499:2: rule__FxmlInclude__Group__8__Impl rule__FxmlInclude__Group__9
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group__8__Impl_in_rule__FxmlInclude__Group__83009);
            rule__FxmlInclude__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FxmlInclude__Group__9_in_rule__FxmlInclude__Group__83012);
            rule__FxmlInclude__Group__9();

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
    // $ANTLR end "rule__FxmlInclude__Group__8"


    // $ANTLR start "rule__FxmlInclude__Group__8__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1506:1: rule__FxmlInclude__Group__8__Impl : ( ( rule__FxmlInclude__Group_8__0 )? ) ;
    public final void rule__FxmlInclude__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1510:1: ( ( ( rule__FxmlInclude__Group_8__0 )? ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1511:1: ( ( rule__FxmlInclude__Group_8__0 )? )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1511:1: ( ( rule__FxmlInclude__Group_8__0 )? )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1512:1: ( rule__FxmlInclude__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getGroup_8()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1513:1: ( rule__FxmlInclude__Group_8__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1513:2: rule__FxmlInclude__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__FxmlInclude__Group_8__0_in_rule__FxmlInclude__Group__8__Impl3039);
                    rule__FxmlInclude__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFxmlIncludeAccess().getGroup_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FxmlInclude__Group__8__Impl"


    // $ANTLR start "rule__FxmlInclude__Group__9"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1523:1: rule__FxmlInclude__Group__9 : rule__FxmlInclude__Group__9__Impl ;
    public final void rule__FxmlInclude__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1527:1: ( rule__FxmlInclude__Group__9__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1528:2: rule__FxmlInclude__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group__9__Impl_in_rule__FxmlInclude__Group__93070);
            rule__FxmlInclude__Group__9__Impl();

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
    // $ANTLR end "rule__FxmlInclude__Group__9"


    // $ANTLR start "rule__FxmlInclude__Group__9__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1534:1: rule__FxmlInclude__Group__9__Impl : ( '}' ) ;
    public final void rule__FxmlInclude__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1538:1: ( ( '}' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1539:1: ( '}' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1539:1: ( '}' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1540:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getRightCurlyBracketKeyword_9()); 
            }
            match(input,18,FOLLOW_18_in_rule__FxmlInclude__Group__9__Impl3098); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFxmlIncludeAccess().getRightCurlyBracketKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FxmlInclude__Group__9__Impl"


    // $ANTLR start "rule__FxmlInclude__Group_8__0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1573:1: rule__FxmlInclude__Group_8__0 : rule__FxmlInclude__Group_8__0__Impl rule__FxmlInclude__Group_8__1 ;
    public final void rule__FxmlInclude__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1577:1: ( rule__FxmlInclude__Group_8__0__Impl rule__FxmlInclude__Group_8__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1578:2: rule__FxmlInclude__Group_8__0__Impl rule__FxmlInclude__Group_8__1
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group_8__0__Impl_in_rule__FxmlInclude__Group_8__03149);
            rule__FxmlInclude__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FxmlInclude__Group_8__1_in_rule__FxmlInclude__Group_8__03152);
            rule__FxmlInclude__Group_8__1();

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
    // $ANTLR end "rule__FxmlInclude__Group_8__0"


    // $ANTLR start "rule__FxmlInclude__Group_8__0__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1585:1: rule__FxmlInclude__Group_8__0__Impl : ( 'origin' ) ;
    public final void rule__FxmlInclude__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1589:1: ( ( 'origin' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1590:1: ( 'origin' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1590:1: ( 'origin' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1591:1: 'origin'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getOriginKeyword_8_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__FxmlInclude__Group_8__0__Impl3180); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFxmlIncludeAccess().getOriginKeyword_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FxmlInclude__Group_8__0__Impl"


    // $ANTLR start "rule__FxmlInclude__Group_8__1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1604:1: rule__FxmlInclude__Group_8__1 : rule__FxmlInclude__Group_8__1__Impl rule__FxmlInclude__Group_8__2 ;
    public final void rule__FxmlInclude__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1608:1: ( rule__FxmlInclude__Group_8__1__Impl rule__FxmlInclude__Group_8__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1609:2: rule__FxmlInclude__Group_8__1__Impl rule__FxmlInclude__Group_8__2
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group_8__1__Impl_in_rule__FxmlInclude__Group_8__13211);
            rule__FxmlInclude__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FxmlInclude__Group_8__2_in_rule__FxmlInclude__Group_8__13214);
            rule__FxmlInclude__Group_8__2();

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
    // $ANTLR end "rule__FxmlInclude__Group_8__1"


    // $ANTLR start "rule__FxmlInclude__Group_8__1__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1616:1: rule__FxmlInclude__Group_8__1__Impl : ( ( rule__FxmlInclude__OriginXAssignment_8_1 ) ) ;
    public final void rule__FxmlInclude__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1620:1: ( ( ( rule__FxmlInclude__OriginXAssignment_8_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1621:1: ( ( rule__FxmlInclude__OriginXAssignment_8_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1621:1: ( ( rule__FxmlInclude__OriginXAssignment_8_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1622:1: ( rule__FxmlInclude__OriginXAssignment_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getOriginXAssignment_8_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1623:1: ( rule__FxmlInclude__OriginXAssignment_8_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1623:2: rule__FxmlInclude__OriginXAssignment_8_1
            {
            pushFollow(FOLLOW_rule__FxmlInclude__OriginXAssignment_8_1_in_rule__FxmlInclude__Group_8__1__Impl3241);
            rule__FxmlInclude__OriginXAssignment_8_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFxmlIncludeAccess().getOriginXAssignment_8_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FxmlInclude__Group_8__1__Impl"


    // $ANTLR start "rule__FxmlInclude__Group_8__2"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1633:1: rule__FxmlInclude__Group_8__2 : rule__FxmlInclude__Group_8__2__Impl rule__FxmlInclude__Group_8__3 ;
    public final void rule__FxmlInclude__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1637:1: ( rule__FxmlInclude__Group_8__2__Impl rule__FxmlInclude__Group_8__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1638:2: rule__FxmlInclude__Group_8__2__Impl rule__FxmlInclude__Group_8__3
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group_8__2__Impl_in_rule__FxmlInclude__Group_8__23271);
            rule__FxmlInclude__Group_8__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FxmlInclude__Group_8__3_in_rule__FxmlInclude__Group_8__23274);
            rule__FxmlInclude__Group_8__3();

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
    // $ANTLR end "rule__FxmlInclude__Group_8__2"


    // $ANTLR start "rule__FxmlInclude__Group_8__2__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1645:1: rule__FxmlInclude__Group_8__2__Impl : ( ( rule__FxmlInclude__OriginYAssignment_8_2 ) ) ;
    public final void rule__FxmlInclude__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1649:1: ( ( ( rule__FxmlInclude__OriginYAssignment_8_2 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1650:1: ( ( rule__FxmlInclude__OriginYAssignment_8_2 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1650:1: ( ( rule__FxmlInclude__OriginYAssignment_8_2 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1651:1: ( rule__FxmlInclude__OriginYAssignment_8_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getOriginYAssignment_8_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1652:1: ( rule__FxmlInclude__OriginYAssignment_8_2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1652:2: rule__FxmlInclude__OriginYAssignment_8_2
            {
            pushFollow(FOLLOW_rule__FxmlInclude__OriginYAssignment_8_2_in_rule__FxmlInclude__Group_8__2__Impl3301);
            rule__FxmlInclude__OriginYAssignment_8_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFxmlIncludeAccess().getOriginYAssignment_8_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FxmlInclude__Group_8__2__Impl"


    // $ANTLR start "rule__FxmlInclude__Group_8__3"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1662:1: rule__FxmlInclude__Group_8__3 : rule__FxmlInclude__Group_8__3__Impl ;
    public final void rule__FxmlInclude__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1666:1: ( rule__FxmlInclude__Group_8__3__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1667:2: rule__FxmlInclude__Group_8__3__Impl
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group_8__3__Impl_in_rule__FxmlInclude__Group_8__33331);
            rule__FxmlInclude__Group_8__3__Impl();

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
    // $ANTLR end "rule__FxmlInclude__Group_8__3"


    // $ANTLR start "rule__FxmlInclude__Group_8__3__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1673:1: rule__FxmlInclude__Group_8__3__Impl : ( ( rule__FxmlInclude__OriginZAssignment_8_3 ) ) ;
    public final void rule__FxmlInclude__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1677:1: ( ( ( rule__FxmlInclude__OriginZAssignment_8_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1678:1: ( ( rule__FxmlInclude__OriginZAssignment_8_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1678:1: ( ( rule__FxmlInclude__OriginZAssignment_8_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1679:1: ( rule__FxmlInclude__OriginZAssignment_8_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getOriginZAssignment_8_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1680:1: ( rule__FxmlInclude__OriginZAssignment_8_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1680:2: rule__FxmlInclude__OriginZAssignment_8_3
            {
            pushFollow(FOLLOW_rule__FxmlInclude__OriginZAssignment_8_3_in_rule__FxmlInclude__Group_8__3__Impl3358);
            rule__FxmlInclude__OriginZAssignment_8_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFxmlIncludeAccess().getOriginZAssignment_8_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FxmlInclude__Group_8__3__Impl"


    // $ANTLR start "rule__Door__Group__0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1698:1: rule__Door__Group__0 : rule__Door__Group__0__Impl rule__Door__Group__1 ;
    public final void rule__Door__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1702:1: ( rule__Door__Group__0__Impl rule__Door__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1703:2: rule__Door__Group__0__Impl rule__Door__Group__1
            {
            pushFollow(FOLLOW_rule__Door__Group__0__Impl_in_rule__Door__Group__03396);
            rule__Door__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Door__Group__1_in_rule__Door__Group__03399);
            rule__Door__Group__1();

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
    // $ANTLR end "rule__Door__Group__0"


    // $ANTLR start "rule__Door__Group__0__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1710:1: rule__Door__Group__0__Impl : ( 'door' ) ;
    public final void rule__Door__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1714:1: ( ( 'door' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1715:1: ( 'door' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1715:1: ( 'door' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1716:1: 'door'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorAccess().getDoorKeyword_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Door__Group__0__Impl3427); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoorAccess().getDoorKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Door__Group__0__Impl"


    // $ANTLR start "rule__Door__Group__1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1729:1: rule__Door__Group__1 : rule__Door__Group__1__Impl rule__Door__Group__2 ;
    public final void rule__Door__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1733:1: ( rule__Door__Group__1__Impl rule__Door__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1734:2: rule__Door__Group__1__Impl rule__Door__Group__2
            {
            pushFollow(FOLLOW_rule__Door__Group__1__Impl_in_rule__Door__Group__13458);
            rule__Door__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Door__Group__2_in_rule__Door__Group__13461);
            rule__Door__Group__2();

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
    // $ANTLR end "rule__Door__Group__1"


    // $ANTLR start "rule__Door__Group__1__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1741:1: rule__Door__Group__1__Impl : ( ( rule__Door__NameAssignment_1 ) ) ;
    public final void rule__Door__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1745:1: ( ( ( rule__Door__NameAssignment_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1746:1: ( ( rule__Door__NameAssignment_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1746:1: ( ( rule__Door__NameAssignment_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1747:1: ( rule__Door__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1748:1: ( rule__Door__NameAssignment_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1748:2: rule__Door__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Door__NameAssignment_1_in_rule__Door__Group__1__Impl3488);
            rule__Door__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoorAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Door__Group__1__Impl"


    // $ANTLR start "rule__Door__Group__2"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1758:1: rule__Door__Group__2 : rule__Door__Group__2__Impl rule__Door__Group__3 ;
    public final void rule__Door__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1762:1: ( rule__Door__Group__2__Impl rule__Door__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1763:2: rule__Door__Group__2__Impl rule__Door__Group__3
            {
            pushFollow(FOLLOW_rule__Door__Group__2__Impl_in_rule__Door__Group__23518);
            rule__Door__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Door__Group__3_in_rule__Door__Group__23521);
            rule__Door__Group__3();

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
    // $ANTLR end "rule__Door__Group__2"


    // $ANTLR start "rule__Door__Group__2__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1770:1: rule__Door__Group__2__Impl : ( 'units' ) ;
    public final void rule__Door__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1774:1: ( ( 'units' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1775:1: ( 'units' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1775:1: ( 'units' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1776:1: 'units'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorAccess().getUnitsKeyword_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__Door__Group__2__Impl3549); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoorAccess().getUnitsKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Door__Group__2__Impl"


    // $ANTLR start "rule__Door__Group__3"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1789:1: rule__Door__Group__3 : rule__Door__Group__3__Impl rule__Door__Group__4 ;
    public final void rule__Door__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1793:1: ( rule__Door__Group__3__Impl rule__Door__Group__4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1794:2: rule__Door__Group__3__Impl rule__Door__Group__4
            {
            pushFollow(FOLLOW_rule__Door__Group__3__Impl_in_rule__Door__Group__33580);
            rule__Door__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Door__Group__4_in_rule__Door__Group__33583);
            rule__Door__Group__4();

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
    // $ANTLR end "rule__Door__Group__3"


    // $ANTLR start "rule__Door__Group__3__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1801:1: rule__Door__Group__3__Impl : ( ( rule__Door__XUnitsAssignment_3 ) ) ;
    public final void rule__Door__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1805:1: ( ( ( rule__Door__XUnitsAssignment_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1806:1: ( ( rule__Door__XUnitsAssignment_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1806:1: ( ( rule__Door__XUnitsAssignment_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1807:1: ( rule__Door__XUnitsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorAccess().getXUnitsAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1808:1: ( rule__Door__XUnitsAssignment_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1808:2: rule__Door__XUnitsAssignment_3
            {
            pushFollow(FOLLOW_rule__Door__XUnitsAssignment_3_in_rule__Door__Group__3__Impl3610);
            rule__Door__XUnitsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoorAccess().getXUnitsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Door__Group__3__Impl"


    // $ANTLR start "rule__Door__Group__4"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1818:1: rule__Door__Group__4 : rule__Door__Group__4__Impl rule__Door__Group__5 ;
    public final void rule__Door__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1822:1: ( rule__Door__Group__4__Impl rule__Door__Group__5 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1823:2: rule__Door__Group__4__Impl rule__Door__Group__5
            {
            pushFollow(FOLLOW_rule__Door__Group__4__Impl_in_rule__Door__Group__43640);
            rule__Door__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Door__Group__5_in_rule__Door__Group__43643);
            rule__Door__Group__5();

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
    // $ANTLR end "rule__Door__Group__4"


    // $ANTLR start "rule__Door__Group__4__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1830:1: rule__Door__Group__4__Impl : ( ( rule__Door__YUnitsAssignment_4 ) ) ;
    public final void rule__Door__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1834:1: ( ( ( rule__Door__YUnitsAssignment_4 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1835:1: ( ( rule__Door__YUnitsAssignment_4 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1835:1: ( ( rule__Door__YUnitsAssignment_4 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1836:1: ( rule__Door__YUnitsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorAccess().getYUnitsAssignment_4()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1837:1: ( rule__Door__YUnitsAssignment_4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1837:2: rule__Door__YUnitsAssignment_4
            {
            pushFollow(FOLLOW_rule__Door__YUnitsAssignment_4_in_rule__Door__Group__4__Impl3670);
            rule__Door__YUnitsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoorAccess().getYUnitsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Door__Group__4__Impl"


    // $ANTLR start "rule__Door__Group__5"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1847:1: rule__Door__Group__5 : rule__Door__Group__5__Impl ;
    public final void rule__Door__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1851:1: ( rule__Door__Group__5__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1852:2: rule__Door__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Door__Group__5__Impl_in_rule__Door__Group__53700);
            rule__Door__Group__5__Impl();

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
    // $ANTLR end "rule__Door__Group__5"


    // $ANTLR start "rule__Door__Group__5__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1858:1: rule__Door__Group__5__Impl : ( ( rule__Door__FillAssignment_5 ) ) ;
    public final void rule__Door__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1862:1: ( ( ( rule__Door__FillAssignment_5 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1863:1: ( ( rule__Door__FillAssignment_5 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1863:1: ( ( rule__Door__FillAssignment_5 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1864:1: ( rule__Door__FillAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorAccess().getFillAssignment_5()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1865:1: ( rule__Door__FillAssignment_5 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1865:2: rule__Door__FillAssignment_5
            {
            pushFollow(FOLLOW_rule__Door__FillAssignment_5_in_rule__Door__Group__5__Impl3727);
            rule__Door__FillAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoorAccess().getFillAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Door__Group__5__Impl"


    // $ANTLR start "rule__Assembly__Group__0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1887:1: rule__Assembly__Group__0 : rule__Assembly__Group__0__Impl rule__Assembly__Group__1 ;
    public final void rule__Assembly__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1891:1: ( rule__Assembly__Group__0__Impl rule__Assembly__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1892:2: rule__Assembly__Group__0__Impl rule__Assembly__Group__1
            {
            pushFollow(FOLLOW_rule__Assembly__Group__0__Impl_in_rule__Assembly__Group__03769);
            rule__Assembly__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assembly__Group__1_in_rule__Assembly__Group__03772);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1899:1: rule__Assembly__Group__0__Impl : ( 'assembly' ) ;
    public final void rule__Assembly__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1903:1: ( ( 'assembly' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1904:1: ( 'assembly' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1904:1: ( 'assembly' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1905:1: 'assembly'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getAssemblyKeyword_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Assembly__Group__0__Impl3800); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1918:1: rule__Assembly__Group__1 : rule__Assembly__Group__1__Impl rule__Assembly__Group__2 ;
    public final void rule__Assembly__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1922:1: ( rule__Assembly__Group__1__Impl rule__Assembly__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1923:2: rule__Assembly__Group__1__Impl rule__Assembly__Group__2
            {
            pushFollow(FOLLOW_rule__Assembly__Group__1__Impl_in_rule__Assembly__Group__13831);
            rule__Assembly__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assembly__Group__2_in_rule__Assembly__Group__13834);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1930:1: rule__Assembly__Group__1__Impl : ( ( rule__Assembly__NameAssignment_1 ) ) ;
    public final void rule__Assembly__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1934:1: ( ( ( rule__Assembly__NameAssignment_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1935:1: ( ( rule__Assembly__NameAssignment_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1935:1: ( ( rule__Assembly__NameAssignment_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1936:1: ( rule__Assembly__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1937:1: ( rule__Assembly__NameAssignment_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1937:2: rule__Assembly__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Assembly__NameAssignment_1_in_rule__Assembly__Group__1__Impl3861);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1947:1: rule__Assembly__Group__2 : rule__Assembly__Group__2__Impl rule__Assembly__Group__3 ;
    public final void rule__Assembly__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1951:1: ( rule__Assembly__Group__2__Impl rule__Assembly__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1952:2: rule__Assembly__Group__2__Impl rule__Assembly__Group__3
            {
            pushFollow(FOLLOW_rule__Assembly__Group__2__Impl_in_rule__Assembly__Group__23891);
            rule__Assembly__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assembly__Group__3_in_rule__Assembly__Group__23894);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1959:1: rule__Assembly__Group__2__Impl : ( '{' ) ;
    public final void rule__Assembly__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1963:1: ( ( '{' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1964:1: ( '{' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1964:1: ( '{' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1965:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,17,FOLLOW_17_in_rule__Assembly__Group__2__Impl3922); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1978:1: rule__Assembly__Group__3 : rule__Assembly__Group__3__Impl rule__Assembly__Group__4 ;
    public final void rule__Assembly__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1982:1: ( rule__Assembly__Group__3__Impl rule__Assembly__Group__4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1983:2: rule__Assembly__Group__3__Impl rule__Assembly__Group__4
            {
            pushFollow(FOLLOW_rule__Assembly__Group__3__Impl_in_rule__Assembly__Group__33953);
            rule__Assembly__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assembly__Group__4_in_rule__Assembly__Group__33956);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1990:1: rule__Assembly__Group__3__Impl : ( ( ( rule__Assembly__ItemsAssignment_3 ) ) ( ( rule__Assembly__ItemsAssignment_3 )* ) ) ;
    public final void rule__Assembly__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1994:1: ( ( ( ( rule__Assembly__ItemsAssignment_3 ) ) ( ( rule__Assembly__ItemsAssignment_3 )* ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1995:1: ( ( ( rule__Assembly__ItemsAssignment_3 ) ) ( ( rule__Assembly__ItemsAssignment_3 )* ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1995:1: ( ( ( rule__Assembly__ItemsAssignment_3 ) ) ( ( rule__Assembly__ItemsAssignment_3 )* ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1996:1: ( ( rule__Assembly__ItemsAssignment_3 ) ) ( ( rule__Assembly__ItemsAssignment_3 )* )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1996:1: ( ( rule__Assembly__ItemsAssignment_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1997:1: ( rule__Assembly__ItemsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getItemsAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1998:1: ( rule__Assembly__ItemsAssignment_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1998:2: rule__Assembly__ItemsAssignment_3
            {
            pushFollow(FOLLOW_rule__Assembly__ItemsAssignment_3_in_rule__Assembly__Group__3__Impl3985);
            rule__Assembly__ItemsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyAccess().getItemsAssignment_3()); 
            }

            }

            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2001:1: ( ( rule__Assembly__ItemsAssignment_3 )* )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2002:1: ( rule__Assembly__ItemsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getItemsAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2003:1: ( rule__Assembly__ItemsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2003:2: rule__Assembly__ItemsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Assembly__ItemsAssignment_3_in_rule__Assembly__Group__3__Impl3997);
            	    rule__Assembly__ItemsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2014:1: rule__Assembly__Group__4 : rule__Assembly__Group__4__Impl ;
    public final void rule__Assembly__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2018:1: ( rule__Assembly__Group__4__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2019:2: rule__Assembly__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Assembly__Group__4__Impl_in_rule__Assembly__Group__44030);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2025:1: rule__Assembly__Group__4__Impl : ( '}' ) ;
    public final void rule__Assembly__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2029:1: ( ( '}' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2030:1: ( '}' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2030:1: ( '}' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2031:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,18,FOLLOW_18_in_rule__Assembly__Group__4__Impl4058); if (state.failed) return ;
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


    // $ANTLR start "rule__AssemblyItem__Group__0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2054:1: rule__AssemblyItem__Group__0 : rule__AssemblyItem__Group__0__Impl rule__AssemblyItem__Group__1 ;
    public final void rule__AssemblyItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2058:1: ( rule__AssemblyItem__Group__0__Impl rule__AssemblyItem__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2059:2: rule__AssemblyItem__Group__0__Impl rule__AssemblyItem__Group__1
            {
            pushFollow(FOLLOW_rule__AssemblyItem__Group__0__Impl_in_rule__AssemblyItem__Group__04099);
            rule__AssemblyItem__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssemblyItem__Group__1_in_rule__AssemblyItem__Group__04102);
            rule__AssemblyItem__Group__1();

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
    // $ANTLR end "rule__AssemblyItem__Group__0"


    // $ANTLR start "rule__AssemblyItem__Group__0__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2066:1: rule__AssemblyItem__Group__0__Impl : ( ( rule__AssemblyItem__ElementAssignment_0 ) ) ;
    public final void rule__AssemblyItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2070:1: ( ( ( rule__AssemblyItem__ElementAssignment_0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2071:1: ( ( rule__AssemblyItem__ElementAssignment_0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2071:1: ( ( rule__AssemblyItem__ElementAssignment_0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2072:1: ( rule__AssemblyItem__ElementAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getElementAssignment_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2073:1: ( rule__AssemblyItem__ElementAssignment_0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2073:2: rule__AssemblyItem__ElementAssignment_0
            {
            pushFollow(FOLLOW_rule__AssemblyItem__ElementAssignment_0_in_rule__AssemblyItem__Group__0__Impl4129);
            rule__AssemblyItem__ElementAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyItemAccess().getElementAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyItem__Group__0__Impl"


    // $ANTLR start "rule__AssemblyItem__Group__1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2083:1: rule__AssemblyItem__Group__1 : rule__AssemblyItem__Group__1__Impl rule__AssemblyItem__Group__2 ;
    public final void rule__AssemblyItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2087:1: ( rule__AssemblyItem__Group__1__Impl rule__AssemblyItem__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2088:2: rule__AssemblyItem__Group__1__Impl rule__AssemblyItem__Group__2
            {
            pushFollow(FOLLOW_rule__AssemblyItem__Group__1__Impl_in_rule__AssemblyItem__Group__14159);
            rule__AssemblyItem__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssemblyItem__Group__2_in_rule__AssemblyItem__Group__14162);
            rule__AssemblyItem__Group__2();

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
    // $ANTLR end "rule__AssemblyItem__Group__1"


    // $ANTLR start "rule__AssemblyItem__Group__1__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2095:1: rule__AssemblyItem__Group__1__Impl : ( 'pos' ) ;
    public final void rule__AssemblyItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2099:1: ( ( 'pos' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2100:1: ( 'pos' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2100:1: ( 'pos' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2101:1: 'pos'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getPosKeyword_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__AssemblyItem__Group__1__Impl4190); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyItemAccess().getPosKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyItem__Group__1__Impl"


    // $ANTLR start "rule__AssemblyItem__Group__2"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2114:1: rule__AssemblyItem__Group__2 : rule__AssemblyItem__Group__2__Impl rule__AssemblyItem__Group__3 ;
    public final void rule__AssemblyItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2118:1: ( rule__AssemblyItem__Group__2__Impl rule__AssemblyItem__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2119:2: rule__AssemblyItem__Group__2__Impl rule__AssemblyItem__Group__3
            {
            pushFollow(FOLLOW_rule__AssemblyItem__Group__2__Impl_in_rule__AssemblyItem__Group__24221);
            rule__AssemblyItem__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssemblyItem__Group__3_in_rule__AssemblyItem__Group__24224);
            rule__AssemblyItem__Group__3();

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
    // $ANTLR end "rule__AssemblyItem__Group__2"


    // $ANTLR start "rule__AssemblyItem__Group__2__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2126:1: rule__AssemblyItem__Group__2__Impl : ( ( rule__AssemblyItem__XUnitsAssignment_2 ) ) ;
    public final void rule__AssemblyItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2130:1: ( ( ( rule__AssemblyItem__XUnitsAssignment_2 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2131:1: ( ( rule__AssemblyItem__XUnitsAssignment_2 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2131:1: ( ( rule__AssemblyItem__XUnitsAssignment_2 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2132:1: ( rule__AssemblyItem__XUnitsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getXUnitsAssignment_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2133:1: ( rule__AssemblyItem__XUnitsAssignment_2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2133:2: rule__AssemblyItem__XUnitsAssignment_2
            {
            pushFollow(FOLLOW_rule__AssemblyItem__XUnitsAssignment_2_in_rule__AssemblyItem__Group__2__Impl4251);
            rule__AssemblyItem__XUnitsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyItemAccess().getXUnitsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyItem__Group__2__Impl"


    // $ANTLR start "rule__AssemblyItem__Group__3"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2143:1: rule__AssemblyItem__Group__3 : rule__AssemblyItem__Group__3__Impl rule__AssemblyItem__Group__4 ;
    public final void rule__AssemblyItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2147:1: ( rule__AssemblyItem__Group__3__Impl rule__AssemblyItem__Group__4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2148:2: rule__AssemblyItem__Group__3__Impl rule__AssemblyItem__Group__4
            {
            pushFollow(FOLLOW_rule__AssemblyItem__Group__3__Impl_in_rule__AssemblyItem__Group__34281);
            rule__AssemblyItem__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssemblyItem__Group__4_in_rule__AssemblyItem__Group__34284);
            rule__AssemblyItem__Group__4();

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
    // $ANTLR end "rule__AssemblyItem__Group__3"


    // $ANTLR start "rule__AssemblyItem__Group__3__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2155:1: rule__AssemblyItem__Group__3__Impl : ( ( rule__AssemblyItem__YUnitsAssignment_3 ) ) ;
    public final void rule__AssemblyItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2159:1: ( ( ( rule__AssemblyItem__YUnitsAssignment_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2160:1: ( ( rule__AssemblyItem__YUnitsAssignment_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2160:1: ( ( rule__AssemblyItem__YUnitsAssignment_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2161:1: ( rule__AssemblyItem__YUnitsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getYUnitsAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2162:1: ( rule__AssemblyItem__YUnitsAssignment_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2162:2: rule__AssemblyItem__YUnitsAssignment_3
            {
            pushFollow(FOLLOW_rule__AssemblyItem__YUnitsAssignment_3_in_rule__AssemblyItem__Group__3__Impl4311);
            rule__AssemblyItem__YUnitsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyItemAccess().getYUnitsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyItem__Group__3__Impl"


    // $ANTLR start "rule__AssemblyItem__Group__4"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2172:1: rule__AssemblyItem__Group__4 : rule__AssemblyItem__Group__4__Impl rule__AssemblyItem__Group__5 ;
    public final void rule__AssemblyItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2176:1: ( rule__AssemblyItem__Group__4__Impl rule__AssemblyItem__Group__5 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2177:2: rule__AssemblyItem__Group__4__Impl rule__AssemblyItem__Group__5
            {
            pushFollow(FOLLOW_rule__AssemblyItem__Group__4__Impl_in_rule__AssemblyItem__Group__44341);
            rule__AssemblyItem__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssemblyItem__Group__5_in_rule__AssemblyItem__Group__44344);
            rule__AssemblyItem__Group__5();

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
    // $ANTLR end "rule__AssemblyItem__Group__4"


    // $ANTLR start "rule__AssemblyItem__Group__4__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2184:1: rule__AssemblyItem__Group__4__Impl : ( ( rule__AssemblyItem__ZUnitsAssignment_4 ) ) ;
    public final void rule__AssemblyItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2188:1: ( ( ( rule__AssemblyItem__ZUnitsAssignment_4 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2189:1: ( ( rule__AssemblyItem__ZUnitsAssignment_4 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2189:1: ( ( rule__AssemblyItem__ZUnitsAssignment_4 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2190:1: ( rule__AssemblyItem__ZUnitsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getZUnitsAssignment_4()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2191:1: ( rule__AssemblyItem__ZUnitsAssignment_4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2191:2: rule__AssemblyItem__ZUnitsAssignment_4
            {
            pushFollow(FOLLOW_rule__AssemblyItem__ZUnitsAssignment_4_in_rule__AssemblyItem__Group__4__Impl4371);
            rule__AssemblyItem__ZUnitsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyItemAccess().getZUnitsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyItem__Group__4__Impl"


    // $ANTLR start "rule__AssemblyItem__Group__5"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2201:1: rule__AssemblyItem__Group__5 : rule__AssemblyItem__Group__5__Impl ;
    public final void rule__AssemblyItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2205:1: ( rule__AssemblyItem__Group__5__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2206:2: rule__AssemblyItem__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__AssemblyItem__Group__5__Impl_in_rule__AssemblyItem__Group__54401);
            rule__AssemblyItem__Group__5__Impl();

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
    // $ANTLR end "rule__AssemblyItem__Group__5"


    // $ANTLR start "rule__AssemblyItem__Group__5__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2212:1: rule__AssemblyItem__Group__5__Impl : ( ( rule__AssemblyItem__Group_5__0 )? ) ;
    public final void rule__AssemblyItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2216:1: ( ( ( rule__AssemblyItem__Group_5__0 )? ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2217:1: ( ( rule__AssemblyItem__Group_5__0 )? )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2217:1: ( ( rule__AssemblyItem__Group_5__0 )? )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2218:1: ( rule__AssemblyItem__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getGroup_5()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2219:1: ( rule__AssemblyItem__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2219:2: rule__AssemblyItem__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__AssemblyItem__Group_5__0_in_rule__AssemblyItem__Group__5__Impl4428);
                    rule__AssemblyItem__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyItemAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyItem__Group__5__Impl"


    // $ANTLR start "rule__AssemblyItem__Group_5__0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2241:1: rule__AssemblyItem__Group_5__0 : rule__AssemblyItem__Group_5__0__Impl rule__AssemblyItem__Group_5__1 ;
    public final void rule__AssemblyItem__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2245:1: ( rule__AssemblyItem__Group_5__0__Impl rule__AssemblyItem__Group_5__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2246:2: rule__AssemblyItem__Group_5__0__Impl rule__AssemblyItem__Group_5__1
            {
            pushFollow(FOLLOW_rule__AssemblyItem__Group_5__0__Impl_in_rule__AssemblyItem__Group_5__04471);
            rule__AssemblyItem__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssemblyItem__Group_5__1_in_rule__AssemblyItem__Group_5__04474);
            rule__AssemblyItem__Group_5__1();

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
    // $ANTLR end "rule__AssemblyItem__Group_5__0"


    // $ANTLR start "rule__AssemblyItem__Group_5__0__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2253:1: rule__AssemblyItem__Group_5__0__Impl : ( 'transform' ) ;
    public final void rule__AssemblyItem__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2257:1: ( ( 'transform' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2258:1: ( 'transform' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2258:1: ( 'transform' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2259:1: 'transform'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getTransformKeyword_5_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__AssemblyItem__Group_5__0__Impl4502); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyItemAccess().getTransformKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyItem__Group_5__0__Impl"


    // $ANTLR start "rule__AssemblyItem__Group_5__1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2272:1: rule__AssemblyItem__Group_5__1 : rule__AssemblyItem__Group_5__1__Impl ;
    public final void rule__AssemblyItem__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2276:1: ( rule__AssemblyItem__Group_5__1__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2277:2: rule__AssemblyItem__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__AssemblyItem__Group_5__1__Impl_in_rule__AssemblyItem__Group_5__14533);
            rule__AssemblyItem__Group_5__1__Impl();

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
    // $ANTLR end "rule__AssemblyItem__Group_5__1"


    // $ANTLR start "rule__AssemblyItem__Group_5__1__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2283:1: rule__AssemblyItem__Group_5__1__Impl : ( ( rule__AssemblyItem__TransformAssignment_5_1 ) ) ;
    public final void rule__AssemblyItem__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2287:1: ( ( ( rule__AssemblyItem__TransformAssignment_5_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2288:1: ( ( rule__AssemblyItem__TransformAssignment_5_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2288:1: ( ( rule__AssemblyItem__TransformAssignment_5_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2289:1: ( rule__AssemblyItem__TransformAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getTransformAssignment_5_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2290:1: ( rule__AssemblyItem__TransformAssignment_5_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2290:2: rule__AssemblyItem__TransformAssignment_5_1
            {
            pushFollow(FOLLOW_rule__AssemblyItem__TransformAssignment_5_1_in_rule__AssemblyItem__Group_5__1__Impl4560);
            rule__AssemblyItem__TransformAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyItemAccess().getTransformAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyItem__Group_5__1__Impl"


    // $ANTLR start "rule__Model__RepoAssignment_0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2305:1: rule__Model__RepoAssignment_0 : ( ruleItemRepository ) ;
    public final void rule__Model__RepoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2309:1: ( ( ruleItemRepository ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2310:1: ( ruleItemRepository )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2310:1: ( ruleItemRepository )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2311:1: ruleItemRepository
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRepoItemRepositoryParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleItemRepository_in_rule__Model__RepoAssignment_04599);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2320:1: rule__Model__AssemblyAssignment_1 : ( ruleAssembly ) ;
    public final void rule__Model__AssemblyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2324:1: ( ( ruleAssembly ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2325:1: ( ruleAssembly )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2325:1: ( ruleAssembly )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2326:1: ruleAssembly
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getAssemblyAssemblyParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleAssembly_in_rule__Model__AssemblyAssignment_14630);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2335:1: rule__ItemRepository__NameAssignment_0 : ( ruleValidID ) ;
    public final void rule__ItemRepository__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2339:1: ( ( ruleValidID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2340:1: ( ruleValidID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2340:1: ( ruleValidID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2341:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getNameValidIDParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__ItemRepository__NameAssignment_04661);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2350:1: rule__ItemRepository__ElementListAssignment_2 : ( ruleItem ) ;
    public final void rule__ItemRepository__ElementListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2354:1: ( ( ruleItem ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2355:1: ( ruleItem )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2355:1: ( ruleItem )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2356:1: ruleItem
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getElementListItemParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleItem_in_rule__ItemRepository__ElementListAssignment_24692);
            ruleItem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemRepositoryAccess().getElementListItemParserRuleCall_2_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Color__RAssignment_1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2365:1: rule__Color__RAssignment_1 : ( RULE_INT ) ;
    public final void rule__Color__RAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2369:1: ( ( RULE_INT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2370:1: ( RULE_INT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2370:1: ( RULE_INT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2371:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getRINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Color__RAssignment_14723); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2380:1: rule__Color__GAssignment_2 : ( RULE_INT ) ;
    public final void rule__Color__GAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2384:1: ( ( RULE_INT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2385:1: ( RULE_INT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2385:1: ( RULE_INT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2386:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getGINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Color__GAssignment_24754); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2395:1: rule__Color__BAssignment_3 : ( RULE_INT ) ;
    public final void rule__Color__BAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2399:1: ( ( RULE_INT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2400:1: ( RULE_INT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2400:1: ( RULE_INT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2401:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getBINTTerminalRuleCall_3_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Color__BAssignment_34785); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2410:1: rule__XUnit__UnitsAssignment : ( RULE_INT ) ;
    public final void rule__XUnit__UnitsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2414:1: ( ( RULE_INT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2415:1: ( RULE_INT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2415:1: ( RULE_INT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2416:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXUnitAccess().getUnitsINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__XUnit__UnitsAssignment4816); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2425:1: rule__YUnit__UnitsAssignment : ( RULE_INT ) ;
    public final void rule__YUnit__UnitsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2429:1: ( ( RULE_INT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2430:1: ( RULE_INT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2430:1: ( RULE_INT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2431:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYUnitAccess().getUnitsINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__YUnit__UnitsAssignment4847); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2440:1: rule__ZUnit__UnitsAssignment : ( RULE_INT ) ;
    public final void rule__ZUnit__UnitsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2444:1: ( ( RULE_INT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2445:1: ( RULE_INT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2445:1: ( RULE_INT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2446:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getZUnitAccess().getUnitsINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ZUnit__UnitsAssignment4878); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2455:1: rule__Brick__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__Brick__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2459:1: ( ( ruleValidID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2460:1: ( ruleValidID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2460:1: ( ruleValidID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2461:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__Brick__NameAssignment_14909);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2470:1: rule__Brick__XUnitsAssignment_3 : ( ruleXUnit ) ;
    public final void rule__Brick__XUnitsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2474:1: ( ( ruleXUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2475:1: ( ruleXUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2475:1: ( ruleXUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2476:1: ruleXUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getXUnitsXUnitParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleXUnit_in_rule__Brick__XUnitsAssignment_34940);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2485:1: rule__Brick__YUnitsAssignment_4 : ( ruleYUnit ) ;
    public final void rule__Brick__YUnitsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2489:1: ( ( ruleYUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2490:1: ( ruleYUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2490:1: ( ruleYUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2491:1: ruleYUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getYUnitsYUnitParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleYUnit_in_rule__Brick__YUnitsAssignment_44971);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2500:1: rule__Brick__ZUnitsAssignment_5 : ( ruleZUnit ) ;
    public final void rule__Brick__ZUnitsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2504:1: ( ( ruleZUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2505:1: ( ruleZUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2505:1: ( ruleZUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2506:1: ruleZUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getZUnitsZUnitParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleZUnit_in_rule__Brick__ZUnitsAssignment_55002);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2515:1: rule__Brick__FillAssignment_6 : ( ruleColor ) ;
    public final void rule__Brick__FillAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2519:1: ( ( ruleColor ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2520:1: ( ruleColor )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2520:1: ( ruleColor )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2521:1: ruleColor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getFillColorParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleColor_in_rule__Brick__FillAssignment_65033);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2530:1: rule__Brick__SourceAssignment_7 : ( ruleSource ) ;
    public final void rule__Brick__SourceAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2534:1: ( ( ruleSource ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2535:1: ( ruleSource )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2535:1: ( ruleSource )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2536:1: ruleSource
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getSourceSourceParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleSource_in_rule__Brick__SourceAssignment_75064);
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


    // $ANTLR start "rule__FxmlInclude__Source2dAssignment_3"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2545:1: rule__FxmlInclude__Source2dAssignment_3 : ( RULE_STRING ) ;
    public final void rule__FxmlInclude__Source2dAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2549:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2550:1: ( RULE_STRING )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2550:1: ( RULE_STRING )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2551:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getSource2dSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FxmlInclude__Source2dAssignment_35095); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFxmlIncludeAccess().getSource2dSTRINGTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FxmlInclude__Source2dAssignment_3"


    // $ANTLR start "rule__FxmlInclude__Source3dAssignment_7"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2560:1: rule__FxmlInclude__Source3dAssignment_7 : ( RULE_STRING ) ;
    public final void rule__FxmlInclude__Source3dAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2564:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2565:1: ( RULE_STRING )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2565:1: ( RULE_STRING )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2566:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getSource3dSTRINGTerminalRuleCall_7_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FxmlInclude__Source3dAssignment_75126); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFxmlIncludeAccess().getSource3dSTRINGTerminalRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FxmlInclude__Source3dAssignment_7"


    // $ANTLR start "rule__FxmlInclude__OriginXAssignment_8_1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2575:1: rule__FxmlInclude__OriginXAssignment_8_1 : ( RULE_FLOAT ) ;
    public final void rule__FxmlInclude__OriginXAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2579:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2580:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2580:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2581:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getOriginXFLOATTerminalRuleCall_8_1_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__FxmlInclude__OriginXAssignment_8_15157); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFxmlIncludeAccess().getOriginXFLOATTerminalRuleCall_8_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FxmlInclude__OriginXAssignment_8_1"


    // $ANTLR start "rule__FxmlInclude__OriginYAssignment_8_2"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2590:1: rule__FxmlInclude__OriginYAssignment_8_2 : ( RULE_FLOAT ) ;
    public final void rule__FxmlInclude__OriginYAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2594:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2595:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2595:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2596:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getOriginYFLOATTerminalRuleCall_8_2_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__FxmlInclude__OriginYAssignment_8_25188); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFxmlIncludeAccess().getOriginYFLOATTerminalRuleCall_8_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FxmlInclude__OriginYAssignment_8_2"


    // $ANTLR start "rule__FxmlInclude__OriginZAssignment_8_3"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2605:1: rule__FxmlInclude__OriginZAssignment_8_3 : ( RULE_FLOAT ) ;
    public final void rule__FxmlInclude__OriginZAssignment_8_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2609:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2610:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2610:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2611:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getOriginZFLOATTerminalRuleCall_8_3_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__FxmlInclude__OriginZAssignment_8_35219); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFxmlIncludeAccess().getOriginZFLOATTerminalRuleCall_8_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FxmlInclude__OriginZAssignment_8_3"


    // $ANTLR start "rule__Door__NameAssignment_1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2620:1: rule__Door__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__Door__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2624:1: ( ( ruleValidID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2625:1: ( ruleValidID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2625:1: ( ruleValidID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2626:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__Door__NameAssignment_15250);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoorAccess().getNameValidIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Door__NameAssignment_1"


    // $ANTLR start "rule__Door__XUnitsAssignment_3"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2635:1: rule__Door__XUnitsAssignment_3 : ( ruleXUnit ) ;
    public final void rule__Door__XUnitsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2639:1: ( ( ruleXUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2640:1: ( ruleXUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2640:1: ( ruleXUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2641:1: ruleXUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorAccess().getXUnitsXUnitParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleXUnit_in_rule__Door__XUnitsAssignment_35281);
            ruleXUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoorAccess().getXUnitsXUnitParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Door__XUnitsAssignment_3"


    // $ANTLR start "rule__Door__YUnitsAssignment_4"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2650:1: rule__Door__YUnitsAssignment_4 : ( ruleYUnit ) ;
    public final void rule__Door__YUnitsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2654:1: ( ( ruleYUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2655:1: ( ruleYUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2655:1: ( ruleYUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2656:1: ruleYUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorAccess().getYUnitsYUnitParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleYUnit_in_rule__Door__YUnitsAssignment_45312);
            ruleYUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoorAccess().getYUnitsYUnitParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Door__YUnitsAssignment_4"


    // $ANTLR start "rule__Door__FillAssignment_5"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2665:1: rule__Door__FillAssignment_5 : ( ruleColor ) ;
    public final void rule__Door__FillAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2669:1: ( ( ruleColor ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2670:1: ( ruleColor )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2670:1: ( ruleColor )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2671:1: ruleColor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorAccess().getFillColorParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleColor_in_rule__Door__FillAssignment_55343);
            ruleColor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoorAccess().getFillColorParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Door__FillAssignment_5"


    // $ANTLR start "rule__Assembly__NameAssignment_1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2680:1: rule__Assembly__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__Assembly__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2684:1: ( ( ruleValidID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2685:1: ( ruleValidID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2685:1: ( ruleValidID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2686:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__Assembly__NameAssignment_15374);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2695:1: rule__Assembly__ItemsAssignment_3 : ( ruleAssemblyItem ) ;
    public final void rule__Assembly__ItemsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2699:1: ( ( ruleAssemblyItem ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2700:1: ( ruleAssemblyItem )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2700:1: ( ruleAssemblyItem )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2701:1: ruleAssemblyItem
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getItemsAssemblyItemParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleAssemblyItem_in_rule__Assembly__ItemsAssignment_35405);
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


    // $ANTLR start "rule__AssemblyItem__ElementAssignment_0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2710:1: rule__AssemblyItem__ElementAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__AssemblyItem__ElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2714:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2715:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2715:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2716:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getElementLegoElementCrossReference_0_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2717:1: ( ruleQualifiedName )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2718:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getElementLegoElementQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__AssemblyItem__ElementAssignment_05440);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyItemAccess().getElementLegoElementQualifiedNameParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyItemAccess().getElementLegoElementCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyItem__ElementAssignment_0"


    // $ANTLR start "rule__AssemblyItem__XUnitsAssignment_2"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2729:1: rule__AssemblyItem__XUnitsAssignment_2 : ( ruleXUnit ) ;
    public final void rule__AssemblyItem__XUnitsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2733:1: ( ( ruleXUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2734:1: ( ruleXUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2734:1: ( ruleXUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2735:1: ruleXUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getXUnitsXUnitParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleXUnit_in_rule__AssemblyItem__XUnitsAssignment_25475);
            ruleXUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyItemAccess().getXUnitsXUnitParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyItem__XUnitsAssignment_2"


    // $ANTLR start "rule__AssemblyItem__YUnitsAssignment_3"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2744:1: rule__AssemblyItem__YUnitsAssignment_3 : ( ruleYUnit ) ;
    public final void rule__AssemblyItem__YUnitsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2748:1: ( ( ruleYUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2749:1: ( ruleYUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2749:1: ( ruleYUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2750:1: ruleYUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getYUnitsYUnitParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleYUnit_in_rule__AssemblyItem__YUnitsAssignment_35506);
            ruleYUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyItemAccess().getYUnitsYUnitParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyItem__YUnitsAssignment_3"


    // $ANTLR start "rule__AssemblyItem__ZUnitsAssignment_4"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2759:1: rule__AssemblyItem__ZUnitsAssignment_4 : ( ruleZUnit ) ;
    public final void rule__AssemblyItem__ZUnitsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2763:1: ( ( ruleZUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2764:1: ( ruleZUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2764:1: ( ruleZUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2765:1: ruleZUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getZUnitsZUnitParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleZUnit_in_rule__AssemblyItem__ZUnitsAssignment_45537);
            ruleZUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyItemAccess().getZUnitsZUnitParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyItem__ZUnitsAssignment_4"


    // $ANTLR start "rule__AssemblyItem__TransformAssignment_5_1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2774:1: rule__AssemblyItem__TransformAssignment_5_1 : ( ( rule__AssemblyItem__TransformAlternatives_5_1_0 ) ) ;
    public final void rule__AssemblyItem__TransformAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2778:1: ( ( ( rule__AssemblyItem__TransformAlternatives_5_1_0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2779:1: ( ( rule__AssemblyItem__TransformAlternatives_5_1_0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2779:1: ( ( rule__AssemblyItem__TransformAlternatives_5_1_0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2780:1: ( rule__AssemblyItem__TransformAlternatives_5_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getTransformAlternatives_5_1_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2781:1: ( rule__AssemblyItem__TransformAlternatives_5_1_0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2781:2: rule__AssemblyItem__TransformAlternatives_5_1_0
            {
            pushFollow(FOLLOW_rule__AssemblyItem__TransformAlternatives_5_1_0_in_rule__AssemblyItem__TransformAssignment_5_15568);
            rule__AssemblyItem__TransformAlternatives_5_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyItemAccess().getTransformAlternatives_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyItem__TransformAssignment_5_1"

    // Delegated rules


 

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
    public static final BitSet FOLLOW_ruleItem_in_entryRuleItem308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItem315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Alternatives_in_ruleItem341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group__0_in_ruleColor401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnit_in_entryRuleXUnit428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnit435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XUnit__UnitsAssignment_in_ruleXUnit461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYUnit_in_entryRuleYUnit488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleYUnit495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__YUnit__UnitsAssignment_in_ruleYUnit521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZUnit_in_entryRuleZUnit548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleZUnit555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ZUnit__UnitsAssignment_in_ruleZUnit581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrick_in_entryRuleBrick608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBrick615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__0_in_ruleBrick641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSource_in_entryRuleSource668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSource675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Source__Alternatives_in_ruleSource701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerated_in_entryRuleGenerated728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenerated735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleGenerated762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFxmlInclude_in_entryRuleFxmlInclude790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFxmlInclude797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__0_in_ruleFxmlInclude823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoor_in_entryRuleDoor850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoor857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Door__Group__0_in_ruleDoor883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssembly_in_entryRuleAssembly910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssembly917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assembly__Group__0_in_ruleAssembly943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssemblyItem_in_entryRuleAssemblyItem970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssemblyItem977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group__0_in_ruleAssemblyItem1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__RepoAssignment_0_in_rule__Model__Alternatives1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__AssemblyAssignment_1_in_rule__Model__Alternatives1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrick_in_rule__Item__Alternatives1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoor_in_rule__Item__Alternatives1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerated_in_rule__Source__Alternatives1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFxmlInclude_in_rule__Source__Alternatives1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__AssemblyItem__TransformAlternatives_5_1_01190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__AssemblyItem__TransformAlternatives_5_1_01210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__AssemblyItem__TransformAlternatives_5_1_01230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01262 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1348 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01383 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__QualifiedName__Group_1__0__Impl1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__0__Impl_in_rule__ItemRepository__Group__01507 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__1_in_rule__ItemRepository__Group__01510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemRepository__NameAssignment_0_in_rule__ItemRepository__Group__0__Impl1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__1__Impl_in_rule__ItemRepository__Group__11567 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__2_in_rule__ItemRepository__Group__11570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ItemRepository__Group__1__Impl1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__2__Impl_in_rule__ItemRepository__Group__21629 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__3_in_rule__ItemRepository__Group__21632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemRepository__ElementListAssignment_2_in_rule__ItemRepository__Group__2__Impl1661 = new BitSet(new long[]{0x0000000004100002L});
    public static final BitSet FOLLOW_rule__ItemRepository__ElementListAssignment_2_in_rule__ItemRepository__Group__2__Impl1673 = new BitSet(new long[]{0x0000000004100002L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__3__Impl_in_rule__ItemRepository__Group__31706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ItemRepository__Group__3__Impl1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group__0__Impl_in_rule__Color__Group__01773 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Color__Group__1_in_rule__Color__Group__01776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Color__Group__0__Impl1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group__1__Impl_in_rule__Color__Group__11835 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Color__Group__2_in_rule__Color__Group__11838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__RAssignment_1_in_rule__Color__Group__1__Impl1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group__2__Impl_in_rule__Color__Group__21895 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Color__Group__3_in_rule__Color__Group__21898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__GAssignment_2_in_rule__Color__Group__2__Impl1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group__3__Impl_in_rule__Color__Group__31955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__BAssignment_3_in_rule__Color__Group__3__Impl1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__0__Impl_in_rule__Brick__Group__02020 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Brick__Group__1_in_rule__Brick__Group__02023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Brick__Group__0__Impl2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__1__Impl_in_rule__Brick__Group__12082 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Brick__Group__2_in_rule__Brick__Group__12085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__NameAssignment_1_in_rule__Brick__Group__1__Impl2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__2__Impl_in_rule__Brick__Group__22142 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Brick__Group__3_in_rule__Brick__Group__22145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Brick__Group__2__Impl2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__3__Impl_in_rule__Brick__Group__32204 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Brick__Group__4_in_rule__Brick__Group__32207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__XUnitsAssignment_3_in_rule__Brick__Group__3__Impl2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__4__Impl_in_rule__Brick__Group__42264 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Brick__Group__5_in_rule__Brick__Group__42267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__YUnitsAssignment_4_in_rule__Brick__Group__4__Impl2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__5__Impl_in_rule__Brick__Group__52324 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Brick__Group__6_in_rule__Brick__Group__52327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__ZUnitsAssignment_5_in_rule__Brick__Group__5__Impl2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__6__Impl_in_rule__Brick__Group__62384 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_rule__Brick__Group__7_in_rule__Brick__Group__62387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__FillAssignment_6_in_rule__Brick__Group__6__Impl2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__7__Impl_in_rule__Brick__Group__72444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__SourceAssignment_7_in_rule__Brick__Group__7__Impl2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__0__Impl_in_rule__FxmlInclude__Group__02517 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__1_in_rule__FxmlInclude__Group__02520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FxmlInclude__Group__0__Impl2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__1__Impl_in_rule__FxmlInclude__Group__12579 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__2_in_rule__FxmlInclude__Group__12582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FxmlInclude__Group__1__Impl2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__2__Impl_in_rule__FxmlInclude__Group__22641 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__3_in_rule__FxmlInclude__Group__22644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__FxmlInclude__Group__2__Impl2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__3__Impl_in_rule__FxmlInclude__Group__32703 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__4_in_rule__FxmlInclude__Group__32706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Source2dAssignment_3_in_rule__FxmlInclude__Group__3__Impl2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__4__Impl_in_rule__FxmlInclude__Group__42763 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__5_in_rule__FxmlInclude__Group__42766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FxmlInclude__Group__4__Impl2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__5__Impl_in_rule__FxmlInclude__Group__52825 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__6_in_rule__FxmlInclude__Group__52828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__FxmlInclude__Group__5__Impl2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__6__Impl_in_rule__FxmlInclude__Group__62887 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__7_in_rule__FxmlInclude__Group__62890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__FxmlInclude__Group__6__Impl2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__7__Impl_in_rule__FxmlInclude__Group__72949 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__8_in_rule__FxmlInclude__Group__72952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Source3dAssignment_7_in_rule__FxmlInclude__Group__7__Impl2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__8__Impl_in_rule__FxmlInclude__Group__83009 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__9_in_rule__FxmlInclude__Group__83012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group_8__0_in_rule__FxmlInclude__Group__8__Impl3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__9__Impl_in_rule__FxmlInclude__Group__93070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FxmlInclude__Group__9__Impl3098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group_8__0__Impl_in_rule__FxmlInclude__Group_8__03149 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group_8__1_in_rule__FxmlInclude__Group_8__03152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__FxmlInclude__Group_8__0__Impl3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group_8__1__Impl_in_rule__FxmlInclude__Group_8__13211 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group_8__2_in_rule__FxmlInclude__Group_8__13214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__OriginXAssignment_8_1_in_rule__FxmlInclude__Group_8__1__Impl3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group_8__2__Impl_in_rule__FxmlInclude__Group_8__23271 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group_8__3_in_rule__FxmlInclude__Group_8__23274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__OriginYAssignment_8_2_in_rule__FxmlInclude__Group_8__2__Impl3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group_8__3__Impl_in_rule__FxmlInclude__Group_8__33331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__OriginZAssignment_8_3_in_rule__FxmlInclude__Group_8__3__Impl3358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Door__Group__0__Impl_in_rule__Door__Group__03396 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Door__Group__1_in_rule__Door__Group__03399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Door__Group__0__Impl3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Door__Group__1__Impl_in_rule__Door__Group__13458 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Door__Group__2_in_rule__Door__Group__13461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Door__NameAssignment_1_in_rule__Door__Group__1__Impl3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Door__Group__2__Impl_in_rule__Door__Group__23518 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Door__Group__3_in_rule__Door__Group__23521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Door__Group__2__Impl3549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Door__Group__3__Impl_in_rule__Door__Group__33580 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Door__Group__4_in_rule__Door__Group__33583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Door__XUnitsAssignment_3_in_rule__Door__Group__3__Impl3610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Door__Group__4__Impl_in_rule__Door__Group__43640 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Door__Group__5_in_rule__Door__Group__43643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Door__YUnitsAssignment_4_in_rule__Door__Group__4__Impl3670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Door__Group__5__Impl_in_rule__Door__Group__53700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Door__FillAssignment_5_in_rule__Door__Group__5__Impl3727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assembly__Group__0__Impl_in_rule__Assembly__Group__03769 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Assembly__Group__1_in_rule__Assembly__Group__03772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Assembly__Group__0__Impl3800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assembly__Group__1__Impl_in_rule__Assembly__Group__13831 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Assembly__Group__2_in_rule__Assembly__Group__13834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assembly__NameAssignment_1_in_rule__Assembly__Group__1__Impl3861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assembly__Group__2__Impl_in_rule__Assembly__Group__23891 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Assembly__Group__3_in_rule__Assembly__Group__23894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Assembly__Group__2__Impl3922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assembly__Group__3__Impl_in_rule__Assembly__Group__33953 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Assembly__Group__4_in_rule__Assembly__Group__33956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assembly__ItemsAssignment_3_in_rule__Assembly__Group__3__Impl3985 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Assembly__ItemsAssignment_3_in_rule__Assembly__Group__3__Impl3997 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Assembly__Group__4__Impl_in_rule__Assembly__Group__44030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Assembly__Group__4__Impl4058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group__0__Impl_in_rule__AssemblyItem__Group__04099 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group__1_in_rule__AssemblyItem__Group__04102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__ElementAssignment_0_in_rule__AssemblyItem__Group__0__Impl4129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group__1__Impl_in_rule__AssemblyItem__Group__14159 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group__2_in_rule__AssemblyItem__Group__14162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__AssemblyItem__Group__1__Impl4190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group__2__Impl_in_rule__AssemblyItem__Group__24221 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group__3_in_rule__AssemblyItem__Group__24224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__XUnitsAssignment_2_in_rule__AssemblyItem__Group__2__Impl4251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group__3__Impl_in_rule__AssemblyItem__Group__34281 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group__4_in_rule__AssemblyItem__Group__34284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__YUnitsAssignment_3_in_rule__AssemblyItem__Group__3__Impl4311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group__4__Impl_in_rule__AssemblyItem__Group__44341 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group__5_in_rule__AssemblyItem__Group__44344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__ZUnitsAssignment_4_in_rule__AssemblyItem__Group__4__Impl4371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group__5__Impl_in_rule__AssemblyItem__Group__54401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group_5__0_in_rule__AssemblyItem__Group__5__Impl4428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group_5__0__Impl_in_rule__AssemblyItem__Group_5__04471 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group_5__1_in_rule__AssemblyItem__Group_5__04474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__AssemblyItem__Group_5__0__Impl4502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group_5__1__Impl_in_rule__AssemblyItem__Group_5__14533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__TransformAssignment_5_1_in_rule__AssemblyItem__Group_5__1__Impl4560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemRepository_in_rule__Model__RepoAssignment_04599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssembly_in_rule__Model__AssemblyAssignment_14630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__ItemRepository__NameAssignment_04661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_rule__ItemRepository__ElementListAssignment_24692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Color__RAssignment_14723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Color__GAssignment_24754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Color__BAssignment_34785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__XUnit__UnitsAssignment4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__YUnit__UnitsAssignment4847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ZUnit__UnitsAssignment4878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__Brick__NameAssignment_14909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnit_in_rule__Brick__XUnitsAssignment_34940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYUnit_in_rule__Brick__YUnitsAssignment_44971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZUnit_in_rule__Brick__ZUnitsAssignment_55002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__Brick__FillAssignment_65033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSource_in_rule__Brick__SourceAssignment_75064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FxmlInclude__Source2dAssignment_35095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FxmlInclude__Source3dAssignment_75126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FxmlInclude__OriginXAssignment_8_15157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FxmlInclude__OriginYAssignment_8_25188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FxmlInclude__OriginZAssignment_8_35219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__Door__NameAssignment_15250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnit_in_rule__Door__XUnitsAssignment_35281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYUnit_in_rule__Door__YUnitsAssignment_45312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__Door__FillAssignment_55343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__Assembly__NameAssignment_15374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssemblyItem_in_rule__Assembly__ItemsAssignment_35405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__AssemblyItem__ElementAssignment_05440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnit_in_rule__AssemblyItem__XUnitsAssignment_25475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYUnit_in_rule__AssemblyItem__YUnitsAssignment_35506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZUnit_in_rule__AssemblyItem__ZUnitsAssignment_45537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__TransformAlternatives_5_1_0_in_rule__AssemblyItem__TransformAssignment_5_15568 = new BitSet(new long[]{0x0000000000000002L});

}