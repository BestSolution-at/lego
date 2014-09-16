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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'generated'", "'rotate180'", "'rotate90'", "'rotate270'", "'.'", "'{'", "'}'", "'rgb'", "'brick'", "'units'", "'fxml'", "'origin'", "'rbrick'", "'dbrick'", "'door'", "'assembly'", "'pos'", "'transform'"
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


    // $ANTLR start "entryRuleRoundBrick"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:429:1: entryRuleRoundBrick : ruleRoundBrick EOF ;
    public final void entryRuleRoundBrick() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:430:1: ( ruleRoundBrick EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:431:1: ruleRoundBrick EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoundBrickRule()); 
            }
            pushFollow(FOLLOW_ruleRoundBrick_in_entryRuleRoundBrick850);
            ruleRoundBrick();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoundBrickRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRoundBrick857); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRoundBrick"


    // $ANTLR start "ruleRoundBrick"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:438:1: ruleRoundBrick : ( ( rule__RoundBrick__Group__0 ) ) ;
    public final void ruleRoundBrick() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:442:2: ( ( ( rule__RoundBrick__Group__0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:443:1: ( ( rule__RoundBrick__Group__0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:443:1: ( ( rule__RoundBrick__Group__0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:444:1: ( rule__RoundBrick__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoundBrickAccess().getGroup()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:445:1: ( rule__RoundBrick__Group__0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:445:2: rule__RoundBrick__Group__0
            {
            pushFollow(FOLLOW_rule__RoundBrick__Group__0_in_ruleRoundBrick883);
            rule__RoundBrick__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoundBrickAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoundBrick"


    // $ANTLR start "entryRuleDoorBrick"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:457:1: entryRuleDoorBrick : ruleDoorBrick EOF ;
    public final void entryRuleDoorBrick() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:458:1: ( ruleDoorBrick EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:459:1: ruleDoorBrick EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorBrickRule()); 
            }
            pushFollow(FOLLOW_ruleDoorBrick_in_entryRuleDoorBrick910);
            ruleDoorBrick();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoorBrickRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoorBrick917); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDoorBrick"


    // $ANTLR start "ruleDoorBrick"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:466:1: ruleDoorBrick : ( ( rule__DoorBrick__Group__0 ) ) ;
    public final void ruleDoorBrick() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:470:2: ( ( ( rule__DoorBrick__Group__0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:471:1: ( ( rule__DoorBrick__Group__0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:471:1: ( ( rule__DoorBrick__Group__0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:472:1: ( rule__DoorBrick__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorBrickAccess().getGroup()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:473:1: ( rule__DoorBrick__Group__0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:473:2: rule__DoorBrick__Group__0
            {
            pushFollow(FOLLOW_rule__DoorBrick__Group__0_in_ruleDoorBrick943);
            rule__DoorBrick__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoorBrickAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoorBrick"


    // $ANTLR start "entryRuleDoor"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:485:1: entryRuleDoor : ruleDoor EOF ;
    public final void entryRuleDoor() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:486:1: ( ruleDoor EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:487:1: ruleDoor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorRule()); 
            }
            pushFollow(FOLLOW_ruleDoor_in_entryRuleDoor970);
            ruleDoor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoor977); if (state.failed) return ;

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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:494:1: ruleDoor : ( ( rule__Door__Group__0 ) ) ;
    public final void ruleDoor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:498:2: ( ( ( rule__Door__Group__0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:499:1: ( ( rule__Door__Group__0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:499:1: ( ( rule__Door__Group__0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:500:1: ( rule__Door__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorAccess().getGroup()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:501:1: ( rule__Door__Group__0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:501:2: rule__Door__Group__0
            {
            pushFollow(FOLLOW_rule__Door__Group__0_in_ruleDoor1003);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:513:1: entryRuleAssembly : ruleAssembly EOF ;
    public final void entryRuleAssembly() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:514:1: ( ruleAssembly EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:515:1: ruleAssembly EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyRule()); 
            }
            pushFollow(FOLLOW_ruleAssembly_in_entryRuleAssembly1030);
            ruleAssembly();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssembly1037); if (state.failed) return ;

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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:522:1: ruleAssembly : ( ( rule__Assembly__Group__0 ) ) ;
    public final void ruleAssembly() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:526:2: ( ( ( rule__Assembly__Group__0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:527:1: ( ( rule__Assembly__Group__0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:527:1: ( ( rule__Assembly__Group__0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:528:1: ( rule__Assembly__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getGroup()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:529:1: ( rule__Assembly__Group__0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:529:2: rule__Assembly__Group__0
            {
            pushFollow(FOLLOW_rule__Assembly__Group__0_in_ruleAssembly1063);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:541:1: entryRuleAssemblyItem : ruleAssemblyItem EOF ;
    public final void entryRuleAssemblyItem() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:542:1: ( ruleAssemblyItem EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:543:1: ruleAssemblyItem EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemRule()); 
            }
            pushFollow(FOLLOW_ruleAssemblyItem_in_entryRuleAssemblyItem1090);
            ruleAssemblyItem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyItemRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssemblyItem1097); if (state.failed) return ;

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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:550:1: ruleAssemblyItem : ( ( rule__AssemblyItem__Group__0 ) ) ;
    public final void ruleAssemblyItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:554:2: ( ( ( rule__AssemblyItem__Group__0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:555:1: ( ( rule__AssemblyItem__Group__0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:555:1: ( ( rule__AssemblyItem__Group__0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:556:1: ( rule__AssemblyItem__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getGroup()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:557:1: ( rule__AssemblyItem__Group__0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:557:2: rule__AssemblyItem__Group__0
            {
            pushFollow(FOLLOW_rule__AssemblyItem__Group__0_in_ruleAssemblyItem1123);
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


    // $ANTLR start "rule__Item__Alternatives"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:592:1: rule__Item__Alternatives : ( ( ruleBrick ) | ( ruleRoundBrick ) | ( ruleDoorBrick ) | ( ruleDoor ) );
    public final void rule__Item__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:596:1: ( ( ruleBrick ) | ( ruleRoundBrick ) | ( ruleDoorBrick ) | ( ruleDoor ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case 25:
                {
                alt2=3;
                }
                break;
            case 26:
                {
                alt2=4;
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
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:597:1: ( ruleBrick )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:597:1: ( ruleBrick )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:598:1: ruleBrick
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getItemAccess().getBrickParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleBrick_in_rule__Item__Alternatives1211);
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
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:603:6: ( ruleRoundBrick )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:603:6: ( ruleRoundBrick )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:604:1: ruleRoundBrick
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getItemAccess().getRoundBrickParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleRoundBrick_in_rule__Item__Alternatives1228);
                    ruleRoundBrick();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getItemAccess().getRoundBrickParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:609:6: ( ruleDoorBrick )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:609:6: ( ruleDoorBrick )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:610:1: ruleDoorBrick
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getItemAccess().getDoorBrickParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleDoorBrick_in_rule__Item__Alternatives1245);
                    ruleDoorBrick();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getItemAccess().getDoorBrickParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:615:6: ( ruleDoor )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:615:6: ( ruleDoor )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:616:1: ruleDoor
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getItemAccess().getDoorParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleDoor_in_rule__Item__Alternatives1262);
                    ruleDoor();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getItemAccess().getDoorParserRuleCall_3()); 
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:626:1: rule__Source__Alternatives : ( ( ruleGenerated ) | ( ruleFxmlInclude ) );
    public final void rule__Source__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:630:1: ( ( ruleGenerated ) | ( ruleFxmlInclude ) )
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
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:631:1: ( ruleGenerated )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:631:1: ( ruleGenerated )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:632:1: ruleGenerated
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSourceAccess().getGeneratedParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleGenerated_in_rule__Source__Alternatives1294);
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
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:637:6: ( ruleFxmlInclude )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:637:6: ( ruleFxmlInclude )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:638:1: ruleFxmlInclude
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSourceAccess().getFxmlIncludeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleFxmlInclude_in_rule__Source__Alternatives1311);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:648:1: rule__AssemblyItem__TransformAlternatives_5_1_0 : ( ( 'rotate180' ) | ( 'rotate90' ) | ( 'rotate270' ) );
    public final void rule__AssemblyItem__TransformAlternatives_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:652:1: ( ( 'rotate180' ) | ( 'rotate90' ) | ( 'rotate270' ) )
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
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:653:1: ( 'rotate180' )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:653:1: ( 'rotate180' )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:654:1: 'rotate180'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssemblyItemAccess().getTransformRotate180Keyword_5_1_0_0()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__AssemblyItem__TransformAlternatives_5_1_01344); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssemblyItemAccess().getTransformRotate180Keyword_5_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:661:6: ( 'rotate90' )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:661:6: ( 'rotate90' )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:662:1: 'rotate90'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssemblyItemAccess().getTransformRotate90Keyword_5_1_0_1()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__AssemblyItem__TransformAlternatives_5_1_01364); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssemblyItemAccess().getTransformRotate90Keyword_5_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:669:6: ( 'rotate270' )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:669:6: ( 'rotate270' )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:670:1: 'rotate270'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssemblyItemAccess().getTransformRotate270Keyword_5_1_0_2()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__AssemblyItem__TransformAlternatives_5_1_01384); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:684:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:688:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:689:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01416);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01419);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:696:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:700:1: ( ( ruleValidID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:701:1: ( ruleValidID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:701:1: ( ruleValidID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:702:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl1446);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:713:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:717:1: ( rule__QualifiedName__Group__1__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:718:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11475);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:724:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:728:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:729:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:729:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:730:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:731:1: ( rule__QualifiedName__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:731:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1502);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:745:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:749:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:750:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01537);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01540);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:757:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:761:1: ( ( ( '.' ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:762:1: ( ( '.' ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:762:1: ( ( '.' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:763:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:764:1: ( '.' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:765:2: '.'
            {
            match(input,16,FOLLOW_16_in_rule__QualifiedName__Group_1__0__Impl1569); if (state.failed) return ;

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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:776:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:780:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:781:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11601);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:787:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:791:1: ( ( ruleValidID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:792:1: ( ruleValidID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:792:1: ( ruleValidID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:793:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl1628);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:808:1: rule__ItemRepository__Group__0 : rule__ItemRepository__Group__0__Impl rule__ItemRepository__Group__1 ;
    public final void rule__ItemRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:812:1: ( rule__ItemRepository__Group__0__Impl rule__ItemRepository__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:813:2: rule__ItemRepository__Group__0__Impl rule__ItemRepository__Group__1
            {
            pushFollow(FOLLOW_rule__ItemRepository__Group__0__Impl_in_rule__ItemRepository__Group__01661);
            rule__ItemRepository__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ItemRepository__Group__1_in_rule__ItemRepository__Group__01664);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:820:1: rule__ItemRepository__Group__0__Impl : ( ( rule__ItemRepository__NameAssignment_0 ) ) ;
    public final void rule__ItemRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:824:1: ( ( ( rule__ItemRepository__NameAssignment_0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:825:1: ( ( rule__ItemRepository__NameAssignment_0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:825:1: ( ( rule__ItemRepository__NameAssignment_0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:826:1: ( rule__ItemRepository__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getNameAssignment_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:827:1: ( rule__ItemRepository__NameAssignment_0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:827:2: rule__ItemRepository__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ItemRepository__NameAssignment_0_in_rule__ItemRepository__Group__0__Impl1691);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:837:1: rule__ItemRepository__Group__1 : rule__ItemRepository__Group__1__Impl rule__ItemRepository__Group__2 ;
    public final void rule__ItemRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:841:1: ( rule__ItemRepository__Group__1__Impl rule__ItemRepository__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:842:2: rule__ItemRepository__Group__1__Impl rule__ItemRepository__Group__2
            {
            pushFollow(FOLLOW_rule__ItemRepository__Group__1__Impl_in_rule__ItemRepository__Group__11721);
            rule__ItemRepository__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ItemRepository__Group__2_in_rule__ItemRepository__Group__11724);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:849:1: rule__ItemRepository__Group__1__Impl : ( '{' ) ;
    public final void rule__ItemRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:853:1: ( ( '{' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:854:1: ( '{' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:854:1: ( '{' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:855:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,17,FOLLOW_17_in_rule__ItemRepository__Group__1__Impl1752); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:868:1: rule__ItemRepository__Group__2 : rule__ItemRepository__Group__2__Impl rule__ItemRepository__Group__3 ;
    public final void rule__ItemRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:872:1: ( rule__ItemRepository__Group__2__Impl rule__ItemRepository__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:873:2: rule__ItemRepository__Group__2__Impl rule__ItemRepository__Group__3
            {
            pushFollow(FOLLOW_rule__ItemRepository__Group__2__Impl_in_rule__ItemRepository__Group__21783);
            rule__ItemRepository__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ItemRepository__Group__3_in_rule__ItemRepository__Group__21786);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:880:1: rule__ItemRepository__Group__2__Impl : ( ( ( rule__ItemRepository__ElementListAssignment_2 ) ) ( ( rule__ItemRepository__ElementListAssignment_2 )* ) ) ;
    public final void rule__ItemRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:884:1: ( ( ( ( rule__ItemRepository__ElementListAssignment_2 ) ) ( ( rule__ItemRepository__ElementListAssignment_2 )* ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:885:1: ( ( ( rule__ItemRepository__ElementListAssignment_2 ) ) ( ( rule__ItemRepository__ElementListAssignment_2 )* ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:885:1: ( ( ( rule__ItemRepository__ElementListAssignment_2 ) ) ( ( rule__ItemRepository__ElementListAssignment_2 )* ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:886:1: ( ( rule__ItemRepository__ElementListAssignment_2 ) ) ( ( rule__ItemRepository__ElementListAssignment_2 )* )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:886:1: ( ( rule__ItemRepository__ElementListAssignment_2 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:887:1: ( rule__ItemRepository__ElementListAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getElementListAssignment_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:888:1: ( rule__ItemRepository__ElementListAssignment_2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:888:2: rule__ItemRepository__ElementListAssignment_2
            {
            pushFollow(FOLLOW_rule__ItemRepository__ElementListAssignment_2_in_rule__ItemRepository__Group__2__Impl1815);
            rule__ItemRepository__ElementListAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemRepositoryAccess().getElementListAssignment_2()); 
            }

            }

            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:891:1: ( ( rule__ItemRepository__ElementListAssignment_2 )* )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:892:1: ( rule__ItemRepository__ElementListAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getElementListAssignment_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:893:1: ( rule__ItemRepository__ElementListAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20||(LA6_0>=24 && LA6_0<=26)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:893:2: rule__ItemRepository__ElementListAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ItemRepository__ElementListAssignment_2_in_rule__ItemRepository__Group__2__Impl1827);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:904:1: rule__ItemRepository__Group__3 : rule__ItemRepository__Group__3__Impl ;
    public final void rule__ItemRepository__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:908:1: ( rule__ItemRepository__Group__3__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:909:2: rule__ItemRepository__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ItemRepository__Group__3__Impl_in_rule__ItemRepository__Group__31860);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:915:1: rule__ItemRepository__Group__3__Impl : ( '}' ) ;
    public final void rule__ItemRepository__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:919:1: ( ( '}' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:920:1: ( '}' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:920:1: ( '}' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:921:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,18,FOLLOW_18_in_rule__ItemRepository__Group__3__Impl1888); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:942:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:946:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:947:2: rule__Color__Group__0__Impl rule__Color__Group__1
            {
            pushFollow(FOLLOW_rule__Color__Group__0__Impl_in_rule__Color__Group__01927);
            rule__Color__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Color__Group__1_in_rule__Color__Group__01930);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:954:1: rule__Color__Group__0__Impl : ( 'rgb' ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:958:1: ( ( 'rgb' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:959:1: ( 'rgb' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:959:1: ( 'rgb' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:960:1: 'rgb'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getRgbKeyword_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__Color__Group__0__Impl1958); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:973:1: rule__Color__Group__1 : rule__Color__Group__1__Impl rule__Color__Group__2 ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:977:1: ( rule__Color__Group__1__Impl rule__Color__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:978:2: rule__Color__Group__1__Impl rule__Color__Group__2
            {
            pushFollow(FOLLOW_rule__Color__Group__1__Impl_in_rule__Color__Group__11989);
            rule__Color__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Color__Group__2_in_rule__Color__Group__11992);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:985:1: rule__Color__Group__1__Impl : ( ( rule__Color__RAssignment_1 ) ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:989:1: ( ( ( rule__Color__RAssignment_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:990:1: ( ( rule__Color__RAssignment_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:990:1: ( ( rule__Color__RAssignment_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:991:1: ( rule__Color__RAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getRAssignment_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:992:1: ( rule__Color__RAssignment_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:992:2: rule__Color__RAssignment_1
            {
            pushFollow(FOLLOW_rule__Color__RAssignment_1_in_rule__Color__Group__1__Impl2019);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1002:1: rule__Color__Group__2 : rule__Color__Group__2__Impl rule__Color__Group__3 ;
    public final void rule__Color__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1006:1: ( rule__Color__Group__2__Impl rule__Color__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1007:2: rule__Color__Group__2__Impl rule__Color__Group__3
            {
            pushFollow(FOLLOW_rule__Color__Group__2__Impl_in_rule__Color__Group__22049);
            rule__Color__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Color__Group__3_in_rule__Color__Group__22052);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1014:1: rule__Color__Group__2__Impl : ( ( rule__Color__GAssignment_2 ) ) ;
    public final void rule__Color__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1018:1: ( ( ( rule__Color__GAssignment_2 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1019:1: ( ( rule__Color__GAssignment_2 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1019:1: ( ( rule__Color__GAssignment_2 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1020:1: ( rule__Color__GAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getGAssignment_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1021:1: ( rule__Color__GAssignment_2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1021:2: rule__Color__GAssignment_2
            {
            pushFollow(FOLLOW_rule__Color__GAssignment_2_in_rule__Color__Group__2__Impl2079);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1031:1: rule__Color__Group__3 : rule__Color__Group__3__Impl ;
    public final void rule__Color__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1035:1: ( rule__Color__Group__3__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1036:2: rule__Color__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Color__Group__3__Impl_in_rule__Color__Group__32109);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1042:1: rule__Color__Group__3__Impl : ( ( rule__Color__BAssignment_3 ) ) ;
    public final void rule__Color__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1046:1: ( ( ( rule__Color__BAssignment_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1047:1: ( ( rule__Color__BAssignment_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1047:1: ( ( rule__Color__BAssignment_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1048:1: ( rule__Color__BAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getBAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1049:1: ( rule__Color__BAssignment_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1049:2: rule__Color__BAssignment_3
            {
            pushFollow(FOLLOW_rule__Color__BAssignment_3_in_rule__Color__Group__3__Impl2136);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1067:1: rule__Brick__Group__0 : rule__Brick__Group__0__Impl rule__Brick__Group__1 ;
    public final void rule__Brick__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1071:1: ( rule__Brick__Group__0__Impl rule__Brick__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1072:2: rule__Brick__Group__0__Impl rule__Brick__Group__1
            {
            pushFollow(FOLLOW_rule__Brick__Group__0__Impl_in_rule__Brick__Group__02174);
            rule__Brick__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Brick__Group__1_in_rule__Brick__Group__02177);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1079:1: rule__Brick__Group__0__Impl : ( 'brick' ) ;
    public final void rule__Brick__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1083:1: ( ( 'brick' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1084:1: ( 'brick' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1084:1: ( 'brick' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1085:1: 'brick'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getBrickKeyword_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Brick__Group__0__Impl2205); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1098:1: rule__Brick__Group__1 : rule__Brick__Group__1__Impl rule__Brick__Group__2 ;
    public final void rule__Brick__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1102:1: ( rule__Brick__Group__1__Impl rule__Brick__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1103:2: rule__Brick__Group__1__Impl rule__Brick__Group__2
            {
            pushFollow(FOLLOW_rule__Brick__Group__1__Impl_in_rule__Brick__Group__12236);
            rule__Brick__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Brick__Group__2_in_rule__Brick__Group__12239);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1110:1: rule__Brick__Group__1__Impl : ( ( rule__Brick__NameAssignment_1 ) ) ;
    public final void rule__Brick__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1114:1: ( ( ( rule__Brick__NameAssignment_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1115:1: ( ( rule__Brick__NameAssignment_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1115:1: ( ( rule__Brick__NameAssignment_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1116:1: ( rule__Brick__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1117:1: ( rule__Brick__NameAssignment_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1117:2: rule__Brick__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Brick__NameAssignment_1_in_rule__Brick__Group__1__Impl2266);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1127:1: rule__Brick__Group__2 : rule__Brick__Group__2__Impl rule__Brick__Group__3 ;
    public final void rule__Brick__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1131:1: ( rule__Brick__Group__2__Impl rule__Brick__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1132:2: rule__Brick__Group__2__Impl rule__Brick__Group__3
            {
            pushFollow(FOLLOW_rule__Brick__Group__2__Impl_in_rule__Brick__Group__22296);
            rule__Brick__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Brick__Group__3_in_rule__Brick__Group__22299);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1139:1: rule__Brick__Group__2__Impl : ( 'units' ) ;
    public final void rule__Brick__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1143:1: ( ( 'units' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1144:1: ( 'units' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1144:1: ( 'units' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1145:1: 'units'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getUnitsKeyword_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__Brick__Group__2__Impl2327); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1158:1: rule__Brick__Group__3 : rule__Brick__Group__3__Impl rule__Brick__Group__4 ;
    public final void rule__Brick__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1162:1: ( rule__Brick__Group__3__Impl rule__Brick__Group__4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1163:2: rule__Brick__Group__3__Impl rule__Brick__Group__4
            {
            pushFollow(FOLLOW_rule__Brick__Group__3__Impl_in_rule__Brick__Group__32358);
            rule__Brick__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Brick__Group__4_in_rule__Brick__Group__32361);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1170:1: rule__Brick__Group__3__Impl : ( ( rule__Brick__XUnitsAssignment_3 ) ) ;
    public final void rule__Brick__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1174:1: ( ( ( rule__Brick__XUnitsAssignment_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1175:1: ( ( rule__Brick__XUnitsAssignment_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1175:1: ( ( rule__Brick__XUnitsAssignment_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1176:1: ( rule__Brick__XUnitsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getXUnitsAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1177:1: ( rule__Brick__XUnitsAssignment_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1177:2: rule__Brick__XUnitsAssignment_3
            {
            pushFollow(FOLLOW_rule__Brick__XUnitsAssignment_3_in_rule__Brick__Group__3__Impl2388);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1187:1: rule__Brick__Group__4 : rule__Brick__Group__4__Impl rule__Brick__Group__5 ;
    public final void rule__Brick__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1191:1: ( rule__Brick__Group__4__Impl rule__Brick__Group__5 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1192:2: rule__Brick__Group__4__Impl rule__Brick__Group__5
            {
            pushFollow(FOLLOW_rule__Brick__Group__4__Impl_in_rule__Brick__Group__42418);
            rule__Brick__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Brick__Group__5_in_rule__Brick__Group__42421);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1199:1: rule__Brick__Group__4__Impl : ( ( rule__Brick__YUnitsAssignment_4 ) ) ;
    public final void rule__Brick__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1203:1: ( ( ( rule__Brick__YUnitsAssignment_4 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1204:1: ( ( rule__Brick__YUnitsAssignment_4 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1204:1: ( ( rule__Brick__YUnitsAssignment_4 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1205:1: ( rule__Brick__YUnitsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getYUnitsAssignment_4()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1206:1: ( rule__Brick__YUnitsAssignment_4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1206:2: rule__Brick__YUnitsAssignment_4
            {
            pushFollow(FOLLOW_rule__Brick__YUnitsAssignment_4_in_rule__Brick__Group__4__Impl2448);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1216:1: rule__Brick__Group__5 : rule__Brick__Group__5__Impl rule__Brick__Group__6 ;
    public final void rule__Brick__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1220:1: ( rule__Brick__Group__5__Impl rule__Brick__Group__6 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1221:2: rule__Brick__Group__5__Impl rule__Brick__Group__6
            {
            pushFollow(FOLLOW_rule__Brick__Group__5__Impl_in_rule__Brick__Group__52478);
            rule__Brick__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Brick__Group__6_in_rule__Brick__Group__52481);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1228:1: rule__Brick__Group__5__Impl : ( ( rule__Brick__ZUnitsAssignment_5 ) ) ;
    public final void rule__Brick__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1232:1: ( ( ( rule__Brick__ZUnitsAssignment_5 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1233:1: ( ( rule__Brick__ZUnitsAssignment_5 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1233:1: ( ( rule__Brick__ZUnitsAssignment_5 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1234:1: ( rule__Brick__ZUnitsAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getZUnitsAssignment_5()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1235:1: ( rule__Brick__ZUnitsAssignment_5 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1235:2: rule__Brick__ZUnitsAssignment_5
            {
            pushFollow(FOLLOW_rule__Brick__ZUnitsAssignment_5_in_rule__Brick__Group__5__Impl2508);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1245:1: rule__Brick__Group__6 : rule__Brick__Group__6__Impl rule__Brick__Group__7 ;
    public final void rule__Brick__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1249:1: ( rule__Brick__Group__6__Impl rule__Brick__Group__7 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1250:2: rule__Brick__Group__6__Impl rule__Brick__Group__7
            {
            pushFollow(FOLLOW_rule__Brick__Group__6__Impl_in_rule__Brick__Group__62538);
            rule__Brick__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Brick__Group__7_in_rule__Brick__Group__62541);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1257:1: rule__Brick__Group__6__Impl : ( ( rule__Brick__FillAssignment_6 ) ) ;
    public final void rule__Brick__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1261:1: ( ( ( rule__Brick__FillAssignment_6 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1262:1: ( ( rule__Brick__FillAssignment_6 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1262:1: ( ( rule__Brick__FillAssignment_6 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1263:1: ( rule__Brick__FillAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getFillAssignment_6()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1264:1: ( rule__Brick__FillAssignment_6 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1264:2: rule__Brick__FillAssignment_6
            {
            pushFollow(FOLLOW_rule__Brick__FillAssignment_6_in_rule__Brick__Group__6__Impl2568);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1274:1: rule__Brick__Group__7 : rule__Brick__Group__7__Impl ;
    public final void rule__Brick__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1278:1: ( rule__Brick__Group__7__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1279:2: rule__Brick__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Brick__Group__7__Impl_in_rule__Brick__Group__72598);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1285:1: rule__Brick__Group__7__Impl : ( ( rule__Brick__SourceAssignment_7 ) ) ;
    public final void rule__Brick__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1289:1: ( ( ( rule__Brick__SourceAssignment_7 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1290:1: ( ( rule__Brick__SourceAssignment_7 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1290:1: ( ( rule__Brick__SourceAssignment_7 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1291:1: ( rule__Brick__SourceAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getSourceAssignment_7()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1292:1: ( rule__Brick__SourceAssignment_7 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1292:2: rule__Brick__SourceAssignment_7
            {
            pushFollow(FOLLOW_rule__Brick__SourceAssignment_7_in_rule__Brick__Group__7__Impl2625);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1318:1: rule__FxmlInclude__Group__0 : rule__FxmlInclude__Group__0__Impl rule__FxmlInclude__Group__1 ;
    public final void rule__FxmlInclude__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1322:1: ( rule__FxmlInclude__Group__0__Impl rule__FxmlInclude__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1323:2: rule__FxmlInclude__Group__0__Impl rule__FxmlInclude__Group__1
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group__0__Impl_in_rule__FxmlInclude__Group__02671);
            rule__FxmlInclude__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FxmlInclude__Group__1_in_rule__FxmlInclude__Group__02674);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1330:1: rule__FxmlInclude__Group__0__Impl : ( 'fxml' ) ;
    public final void rule__FxmlInclude__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1334:1: ( ( 'fxml' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1335:1: ( 'fxml' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1335:1: ( 'fxml' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1336:1: 'fxml'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getFxmlKeyword_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__FxmlInclude__Group__0__Impl2702); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1349:1: rule__FxmlInclude__Group__1 : rule__FxmlInclude__Group__1__Impl rule__FxmlInclude__Group__2 ;
    public final void rule__FxmlInclude__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1353:1: ( rule__FxmlInclude__Group__1__Impl rule__FxmlInclude__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1354:2: rule__FxmlInclude__Group__1__Impl rule__FxmlInclude__Group__2
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group__1__Impl_in_rule__FxmlInclude__Group__12733);
            rule__FxmlInclude__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FxmlInclude__Group__2_in_rule__FxmlInclude__Group__12736);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1361:1: rule__FxmlInclude__Group__1__Impl : ( ( rule__FxmlInclude__SourceAssignment_1 ) ) ;
    public final void rule__FxmlInclude__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1365:1: ( ( ( rule__FxmlInclude__SourceAssignment_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1366:1: ( ( rule__FxmlInclude__SourceAssignment_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1366:1: ( ( rule__FxmlInclude__SourceAssignment_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1367:1: ( rule__FxmlInclude__SourceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getSourceAssignment_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1368:1: ( rule__FxmlInclude__SourceAssignment_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1368:2: rule__FxmlInclude__SourceAssignment_1
            {
            pushFollow(FOLLOW_rule__FxmlInclude__SourceAssignment_1_in_rule__FxmlInclude__Group__1__Impl2763);
            rule__FxmlInclude__SourceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFxmlIncludeAccess().getSourceAssignment_1()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1378:1: rule__FxmlInclude__Group__2 : rule__FxmlInclude__Group__2__Impl ;
    public final void rule__FxmlInclude__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1382:1: ( rule__FxmlInclude__Group__2__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1383:2: rule__FxmlInclude__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group__2__Impl_in_rule__FxmlInclude__Group__22793);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1389:1: rule__FxmlInclude__Group__2__Impl : ( ( rule__FxmlInclude__Group_2__0 )? ) ;
    public final void rule__FxmlInclude__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1393:1: ( ( ( rule__FxmlInclude__Group_2__0 )? ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1394:1: ( ( rule__FxmlInclude__Group_2__0 )? )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1394:1: ( ( rule__FxmlInclude__Group_2__0 )? )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1395:1: ( rule__FxmlInclude__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getGroup_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1396:1: ( rule__FxmlInclude__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1396:2: rule__FxmlInclude__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__FxmlInclude__Group_2__0_in_rule__FxmlInclude__Group__2__Impl2820);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1412:1: rule__FxmlInclude__Group_2__0 : rule__FxmlInclude__Group_2__0__Impl rule__FxmlInclude__Group_2__1 ;
    public final void rule__FxmlInclude__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1416:1: ( rule__FxmlInclude__Group_2__0__Impl rule__FxmlInclude__Group_2__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1417:2: rule__FxmlInclude__Group_2__0__Impl rule__FxmlInclude__Group_2__1
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group_2__0__Impl_in_rule__FxmlInclude__Group_2__02857);
            rule__FxmlInclude__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FxmlInclude__Group_2__1_in_rule__FxmlInclude__Group_2__02860);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1424:1: rule__FxmlInclude__Group_2__0__Impl : ( 'origin' ) ;
    public final void rule__FxmlInclude__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1428:1: ( ( 'origin' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1429:1: ( 'origin' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1429:1: ( 'origin' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1430:1: 'origin'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getOriginKeyword_2_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__FxmlInclude__Group_2__0__Impl2888); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1443:1: rule__FxmlInclude__Group_2__1 : rule__FxmlInclude__Group_2__1__Impl rule__FxmlInclude__Group_2__2 ;
    public final void rule__FxmlInclude__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1447:1: ( rule__FxmlInclude__Group_2__1__Impl rule__FxmlInclude__Group_2__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1448:2: rule__FxmlInclude__Group_2__1__Impl rule__FxmlInclude__Group_2__2
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group_2__1__Impl_in_rule__FxmlInclude__Group_2__12919);
            rule__FxmlInclude__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FxmlInclude__Group_2__2_in_rule__FxmlInclude__Group_2__12922);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1455:1: rule__FxmlInclude__Group_2__1__Impl : ( ( rule__FxmlInclude__OriginXAssignment_2_1 ) ) ;
    public final void rule__FxmlInclude__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1459:1: ( ( ( rule__FxmlInclude__OriginXAssignment_2_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1460:1: ( ( rule__FxmlInclude__OriginXAssignment_2_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1460:1: ( ( rule__FxmlInclude__OriginXAssignment_2_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1461:1: ( rule__FxmlInclude__OriginXAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getOriginXAssignment_2_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1462:1: ( rule__FxmlInclude__OriginXAssignment_2_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1462:2: rule__FxmlInclude__OriginXAssignment_2_1
            {
            pushFollow(FOLLOW_rule__FxmlInclude__OriginXAssignment_2_1_in_rule__FxmlInclude__Group_2__1__Impl2949);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1472:1: rule__FxmlInclude__Group_2__2 : rule__FxmlInclude__Group_2__2__Impl rule__FxmlInclude__Group_2__3 ;
    public final void rule__FxmlInclude__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1476:1: ( rule__FxmlInclude__Group_2__2__Impl rule__FxmlInclude__Group_2__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1477:2: rule__FxmlInclude__Group_2__2__Impl rule__FxmlInclude__Group_2__3
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group_2__2__Impl_in_rule__FxmlInclude__Group_2__22979);
            rule__FxmlInclude__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FxmlInclude__Group_2__3_in_rule__FxmlInclude__Group_2__22982);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1484:1: rule__FxmlInclude__Group_2__2__Impl : ( ( rule__FxmlInclude__OriginYAssignment_2_2 ) ) ;
    public final void rule__FxmlInclude__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1488:1: ( ( ( rule__FxmlInclude__OriginYAssignment_2_2 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1489:1: ( ( rule__FxmlInclude__OriginYAssignment_2_2 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1489:1: ( ( rule__FxmlInclude__OriginYAssignment_2_2 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1490:1: ( rule__FxmlInclude__OriginYAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getOriginYAssignment_2_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1491:1: ( rule__FxmlInclude__OriginYAssignment_2_2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1491:2: rule__FxmlInclude__OriginYAssignment_2_2
            {
            pushFollow(FOLLOW_rule__FxmlInclude__OriginYAssignment_2_2_in_rule__FxmlInclude__Group_2__2__Impl3009);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1501:1: rule__FxmlInclude__Group_2__3 : rule__FxmlInclude__Group_2__3__Impl ;
    public final void rule__FxmlInclude__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1505:1: ( rule__FxmlInclude__Group_2__3__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1506:2: rule__FxmlInclude__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__FxmlInclude__Group_2__3__Impl_in_rule__FxmlInclude__Group_2__33039);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1512:1: rule__FxmlInclude__Group_2__3__Impl : ( ( rule__FxmlInclude__OriginZAssignment_2_3 ) ) ;
    public final void rule__FxmlInclude__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1516:1: ( ( ( rule__FxmlInclude__OriginZAssignment_2_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1517:1: ( ( rule__FxmlInclude__OriginZAssignment_2_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1517:1: ( ( rule__FxmlInclude__OriginZAssignment_2_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1518:1: ( rule__FxmlInclude__OriginZAssignment_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getOriginZAssignment_2_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1519:1: ( rule__FxmlInclude__OriginZAssignment_2_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1519:2: rule__FxmlInclude__OriginZAssignment_2_3
            {
            pushFollow(FOLLOW_rule__FxmlInclude__OriginZAssignment_2_3_in_rule__FxmlInclude__Group_2__3__Impl3066);
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


    // $ANTLR start "rule__RoundBrick__Group__0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1537:1: rule__RoundBrick__Group__0 : rule__RoundBrick__Group__0__Impl rule__RoundBrick__Group__1 ;
    public final void rule__RoundBrick__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1541:1: ( rule__RoundBrick__Group__0__Impl rule__RoundBrick__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1542:2: rule__RoundBrick__Group__0__Impl rule__RoundBrick__Group__1
            {
            pushFollow(FOLLOW_rule__RoundBrick__Group__0__Impl_in_rule__RoundBrick__Group__03104);
            rule__RoundBrick__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RoundBrick__Group__1_in_rule__RoundBrick__Group__03107);
            rule__RoundBrick__Group__1();

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
    // $ANTLR end "rule__RoundBrick__Group__0"


    // $ANTLR start "rule__RoundBrick__Group__0__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1549:1: rule__RoundBrick__Group__0__Impl : ( 'rbrick' ) ;
    public final void rule__RoundBrick__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1553:1: ( ( 'rbrick' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1554:1: ( 'rbrick' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1554:1: ( 'rbrick' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1555:1: 'rbrick'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoundBrickAccess().getRbrickKeyword_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__RoundBrick__Group__0__Impl3135); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoundBrickAccess().getRbrickKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundBrick__Group__0__Impl"


    // $ANTLR start "rule__RoundBrick__Group__1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1568:1: rule__RoundBrick__Group__1 : rule__RoundBrick__Group__1__Impl rule__RoundBrick__Group__2 ;
    public final void rule__RoundBrick__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1572:1: ( rule__RoundBrick__Group__1__Impl rule__RoundBrick__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1573:2: rule__RoundBrick__Group__1__Impl rule__RoundBrick__Group__2
            {
            pushFollow(FOLLOW_rule__RoundBrick__Group__1__Impl_in_rule__RoundBrick__Group__13166);
            rule__RoundBrick__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RoundBrick__Group__2_in_rule__RoundBrick__Group__13169);
            rule__RoundBrick__Group__2();

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
    // $ANTLR end "rule__RoundBrick__Group__1"


    // $ANTLR start "rule__RoundBrick__Group__1__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1580:1: rule__RoundBrick__Group__1__Impl : ( ( rule__RoundBrick__NameAssignment_1 ) ) ;
    public final void rule__RoundBrick__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1584:1: ( ( ( rule__RoundBrick__NameAssignment_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1585:1: ( ( rule__RoundBrick__NameAssignment_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1585:1: ( ( rule__RoundBrick__NameAssignment_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1586:1: ( rule__RoundBrick__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoundBrickAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1587:1: ( rule__RoundBrick__NameAssignment_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1587:2: rule__RoundBrick__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__RoundBrick__NameAssignment_1_in_rule__RoundBrick__Group__1__Impl3196);
            rule__RoundBrick__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoundBrickAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundBrick__Group__1__Impl"


    // $ANTLR start "rule__RoundBrick__Group__2"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1597:1: rule__RoundBrick__Group__2 : rule__RoundBrick__Group__2__Impl rule__RoundBrick__Group__3 ;
    public final void rule__RoundBrick__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1601:1: ( rule__RoundBrick__Group__2__Impl rule__RoundBrick__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1602:2: rule__RoundBrick__Group__2__Impl rule__RoundBrick__Group__3
            {
            pushFollow(FOLLOW_rule__RoundBrick__Group__2__Impl_in_rule__RoundBrick__Group__23226);
            rule__RoundBrick__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RoundBrick__Group__3_in_rule__RoundBrick__Group__23229);
            rule__RoundBrick__Group__3();

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
    // $ANTLR end "rule__RoundBrick__Group__2"


    // $ANTLR start "rule__RoundBrick__Group__2__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1609:1: rule__RoundBrick__Group__2__Impl : ( 'units' ) ;
    public final void rule__RoundBrick__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1613:1: ( ( 'units' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1614:1: ( 'units' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1614:1: ( 'units' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1615:1: 'units'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoundBrickAccess().getUnitsKeyword_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__RoundBrick__Group__2__Impl3257); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoundBrickAccess().getUnitsKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundBrick__Group__2__Impl"


    // $ANTLR start "rule__RoundBrick__Group__3"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1628:1: rule__RoundBrick__Group__3 : rule__RoundBrick__Group__3__Impl rule__RoundBrick__Group__4 ;
    public final void rule__RoundBrick__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1632:1: ( rule__RoundBrick__Group__3__Impl rule__RoundBrick__Group__4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1633:2: rule__RoundBrick__Group__3__Impl rule__RoundBrick__Group__4
            {
            pushFollow(FOLLOW_rule__RoundBrick__Group__3__Impl_in_rule__RoundBrick__Group__33288);
            rule__RoundBrick__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RoundBrick__Group__4_in_rule__RoundBrick__Group__33291);
            rule__RoundBrick__Group__4();

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
    // $ANTLR end "rule__RoundBrick__Group__3"


    // $ANTLR start "rule__RoundBrick__Group__3__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1640:1: rule__RoundBrick__Group__3__Impl : ( ( rule__RoundBrick__XUnitsAssignment_3 ) ) ;
    public final void rule__RoundBrick__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1644:1: ( ( ( rule__RoundBrick__XUnitsAssignment_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1645:1: ( ( rule__RoundBrick__XUnitsAssignment_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1645:1: ( ( rule__RoundBrick__XUnitsAssignment_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1646:1: ( rule__RoundBrick__XUnitsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoundBrickAccess().getXUnitsAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1647:1: ( rule__RoundBrick__XUnitsAssignment_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1647:2: rule__RoundBrick__XUnitsAssignment_3
            {
            pushFollow(FOLLOW_rule__RoundBrick__XUnitsAssignment_3_in_rule__RoundBrick__Group__3__Impl3318);
            rule__RoundBrick__XUnitsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoundBrickAccess().getXUnitsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundBrick__Group__3__Impl"


    // $ANTLR start "rule__RoundBrick__Group__4"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1657:1: rule__RoundBrick__Group__4 : rule__RoundBrick__Group__4__Impl rule__RoundBrick__Group__5 ;
    public final void rule__RoundBrick__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1661:1: ( rule__RoundBrick__Group__4__Impl rule__RoundBrick__Group__5 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1662:2: rule__RoundBrick__Group__4__Impl rule__RoundBrick__Group__5
            {
            pushFollow(FOLLOW_rule__RoundBrick__Group__4__Impl_in_rule__RoundBrick__Group__43348);
            rule__RoundBrick__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RoundBrick__Group__5_in_rule__RoundBrick__Group__43351);
            rule__RoundBrick__Group__5();

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
    // $ANTLR end "rule__RoundBrick__Group__4"


    // $ANTLR start "rule__RoundBrick__Group__4__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1669:1: rule__RoundBrick__Group__4__Impl : ( ( rule__RoundBrick__YUnitsAssignment_4 ) ) ;
    public final void rule__RoundBrick__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1673:1: ( ( ( rule__RoundBrick__YUnitsAssignment_4 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1674:1: ( ( rule__RoundBrick__YUnitsAssignment_4 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1674:1: ( ( rule__RoundBrick__YUnitsAssignment_4 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1675:1: ( rule__RoundBrick__YUnitsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoundBrickAccess().getYUnitsAssignment_4()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1676:1: ( rule__RoundBrick__YUnitsAssignment_4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1676:2: rule__RoundBrick__YUnitsAssignment_4
            {
            pushFollow(FOLLOW_rule__RoundBrick__YUnitsAssignment_4_in_rule__RoundBrick__Group__4__Impl3378);
            rule__RoundBrick__YUnitsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoundBrickAccess().getYUnitsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundBrick__Group__4__Impl"


    // $ANTLR start "rule__RoundBrick__Group__5"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1686:1: rule__RoundBrick__Group__5 : rule__RoundBrick__Group__5__Impl rule__RoundBrick__Group__6 ;
    public final void rule__RoundBrick__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1690:1: ( rule__RoundBrick__Group__5__Impl rule__RoundBrick__Group__6 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1691:2: rule__RoundBrick__Group__5__Impl rule__RoundBrick__Group__6
            {
            pushFollow(FOLLOW_rule__RoundBrick__Group__5__Impl_in_rule__RoundBrick__Group__53408);
            rule__RoundBrick__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RoundBrick__Group__6_in_rule__RoundBrick__Group__53411);
            rule__RoundBrick__Group__6();

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
    // $ANTLR end "rule__RoundBrick__Group__5"


    // $ANTLR start "rule__RoundBrick__Group__5__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1698:1: rule__RoundBrick__Group__5__Impl : ( ( rule__RoundBrick__ZUnitsAssignment_5 ) ) ;
    public final void rule__RoundBrick__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1702:1: ( ( ( rule__RoundBrick__ZUnitsAssignment_5 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1703:1: ( ( rule__RoundBrick__ZUnitsAssignment_5 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1703:1: ( ( rule__RoundBrick__ZUnitsAssignment_5 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1704:1: ( rule__RoundBrick__ZUnitsAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoundBrickAccess().getZUnitsAssignment_5()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1705:1: ( rule__RoundBrick__ZUnitsAssignment_5 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1705:2: rule__RoundBrick__ZUnitsAssignment_5
            {
            pushFollow(FOLLOW_rule__RoundBrick__ZUnitsAssignment_5_in_rule__RoundBrick__Group__5__Impl3438);
            rule__RoundBrick__ZUnitsAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoundBrickAccess().getZUnitsAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundBrick__Group__5__Impl"


    // $ANTLR start "rule__RoundBrick__Group__6"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1715:1: rule__RoundBrick__Group__6 : rule__RoundBrick__Group__6__Impl ;
    public final void rule__RoundBrick__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1719:1: ( rule__RoundBrick__Group__6__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1720:2: rule__RoundBrick__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__RoundBrick__Group__6__Impl_in_rule__RoundBrick__Group__63468);
            rule__RoundBrick__Group__6__Impl();

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
    // $ANTLR end "rule__RoundBrick__Group__6"


    // $ANTLR start "rule__RoundBrick__Group__6__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1726:1: rule__RoundBrick__Group__6__Impl : ( ( rule__RoundBrick__FillAssignment_6 ) ) ;
    public final void rule__RoundBrick__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1730:1: ( ( ( rule__RoundBrick__FillAssignment_6 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1731:1: ( ( rule__RoundBrick__FillAssignment_6 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1731:1: ( ( rule__RoundBrick__FillAssignment_6 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1732:1: ( rule__RoundBrick__FillAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoundBrickAccess().getFillAssignment_6()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1733:1: ( rule__RoundBrick__FillAssignment_6 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1733:2: rule__RoundBrick__FillAssignment_6
            {
            pushFollow(FOLLOW_rule__RoundBrick__FillAssignment_6_in_rule__RoundBrick__Group__6__Impl3495);
            rule__RoundBrick__FillAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoundBrickAccess().getFillAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundBrick__Group__6__Impl"


    // $ANTLR start "rule__DoorBrick__Group__0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1757:1: rule__DoorBrick__Group__0 : rule__DoorBrick__Group__0__Impl rule__DoorBrick__Group__1 ;
    public final void rule__DoorBrick__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1761:1: ( rule__DoorBrick__Group__0__Impl rule__DoorBrick__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1762:2: rule__DoorBrick__Group__0__Impl rule__DoorBrick__Group__1
            {
            pushFollow(FOLLOW_rule__DoorBrick__Group__0__Impl_in_rule__DoorBrick__Group__03539);
            rule__DoorBrick__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DoorBrick__Group__1_in_rule__DoorBrick__Group__03542);
            rule__DoorBrick__Group__1();

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
    // $ANTLR end "rule__DoorBrick__Group__0"


    // $ANTLR start "rule__DoorBrick__Group__0__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1769:1: rule__DoorBrick__Group__0__Impl : ( 'dbrick' ) ;
    public final void rule__DoorBrick__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1773:1: ( ( 'dbrick' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1774:1: ( 'dbrick' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1774:1: ( 'dbrick' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1775:1: 'dbrick'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorBrickAccess().getDbrickKeyword_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__DoorBrick__Group__0__Impl3570); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoorBrickAccess().getDbrickKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoorBrick__Group__0__Impl"


    // $ANTLR start "rule__DoorBrick__Group__1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1788:1: rule__DoorBrick__Group__1 : rule__DoorBrick__Group__1__Impl rule__DoorBrick__Group__2 ;
    public final void rule__DoorBrick__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1792:1: ( rule__DoorBrick__Group__1__Impl rule__DoorBrick__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1793:2: rule__DoorBrick__Group__1__Impl rule__DoorBrick__Group__2
            {
            pushFollow(FOLLOW_rule__DoorBrick__Group__1__Impl_in_rule__DoorBrick__Group__13601);
            rule__DoorBrick__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DoorBrick__Group__2_in_rule__DoorBrick__Group__13604);
            rule__DoorBrick__Group__2();

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
    // $ANTLR end "rule__DoorBrick__Group__1"


    // $ANTLR start "rule__DoorBrick__Group__1__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1800:1: rule__DoorBrick__Group__1__Impl : ( ( rule__DoorBrick__NameAssignment_1 ) ) ;
    public final void rule__DoorBrick__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1804:1: ( ( ( rule__DoorBrick__NameAssignment_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1805:1: ( ( rule__DoorBrick__NameAssignment_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1805:1: ( ( rule__DoorBrick__NameAssignment_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1806:1: ( rule__DoorBrick__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorBrickAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1807:1: ( rule__DoorBrick__NameAssignment_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1807:2: rule__DoorBrick__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DoorBrick__NameAssignment_1_in_rule__DoorBrick__Group__1__Impl3631);
            rule__DoorBrick__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoorBrickAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoorBrick__Group__1__Impl"


    // $ANTLR start "rule__DoorBrick__Group__2"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1817:1: rule__DoorBrick__Group__2 : rule__DoorBrick__Group__2__Impl rule__DoorBrick__Group__3 ;
    public final void rule__DoorBrick__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1821:1: ( rule__DoorBrick__Group__2__Impl rule__DoorBrick__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1822:2: rule__DoorBrick__Group__2__Impl rule__DoorBrick__Group__3
            {
            pushFollow(FOLLOW_rule__DoorBrick__Group__2__Impl_in_rule__DoorBrick__Group__23661);
            rule__DoorBrick__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DoorBrick__Group__3_in_rule__DoorBrick__Group__23664);
            rule__DoorBrick__Group__3();

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
    // $ANTLR end "rule__DoorBrick__Group__2"


    // $ANTLR start "rule__DoorBrick__Group__2__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1829:1: rule__DoorBrick__Group__2__Impl : ( 'units' ) ;
    public final void rule__DoorBrick__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1833:1: ( ( 'units' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1834:1: ( 'units' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1834:1: ( 'units' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1835:1: 'units'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorBrickAccess().getUnitsKeyword_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__DoorBrick__Group__2__Impl3692); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoorBrickAccess().getUnitsKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoorBrick__Group__2__Impl"


    // $ANTLR start "rule__DoorBrick__Group__3"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1848:1: rule__DoorBrick__Group__3 : rule__DoorBrick__Group__3__Impl rule__DoorBrick__Group__4 ;
    public final void rule__DoorBrick__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1852:1: ( rule__DoorBrick__Group__3__Impl rule__DoorBrick__Group__4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1853:2: rule__DoorBrick__Group__3__Impl rule__DoorBrick__Group__4
            {
            pushFollow(FOLLOW_rule__DoorBrick__Group__3__Impl_in_rule__DoorBrick__Group__33723);
            rule__DoorBrick__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DoorBrick__Group__4_in_rule__DoorBrick__Group__33726);
            rule__DoorBrick__Group__4();

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
    // $ANTLR end "rule__DoorBrick__Group__3"


    // $ANTLR start "rule__DoorBrick__Group__3__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1860:1: rule__DoorBrick__Group__3__Impl : ( ( rule__DoorBrick__XUnitsAssignment_3 ) ) ;
    public final void rule__DoorBrick__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1864:1: ( ( ( rule__DoorBrick__XUnitsAssignment_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1865:1: ( ( rule__DoorBrick__XUnitsAssignment_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1865:1: ( ( rule__DoorBrick__XUnitsAssignment_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1866:1: ( rule__DoorBrick__XUnitsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorBrickAccess().getXUnitsAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1867:1: ( rule__DoorBrick__XUnitsAssignment_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1867:2: rule__DoorBrick__XUnitsAssignment_3
            {
            pushFollow(FOLLOW_rule__DoorBrick__XUnitsAssignment_3_in_rule__DoorBrick__Group__3__Impl3753);
            rule__DoorBrick__XUnitsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoorBrickAccess().getXUnitsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoorBrick__Group__3__Impl"


    // $ANTLR start "rule__DoorBrick__Group__4"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1877:1: rule__DoorBrick__Group__4 : rule__DoorBrick__Group__4__Impl rule__DoorBrick__Group__5 ;
    public final void rule__DoorBrick__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1881:1: ( rule__DoorBrick__Group__4__Impl rule__DoorBrick__Group__5 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1882:2: rule__DoorBrick__Group__4__Impl rule__DoorBrick__Group__5
            {
            pushFollow(FOLLOW_rule__DoorBrick__Group__4__Impl_in_rule__DoorBrick__Group__43783);
            rule__DoorBrick__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DoorBrick__Group__5_in_rule__DoorBrick__Group__43786);
            rule__DoorBrick__Group__5();

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
    // $ANTLR end "rule__DoorBrick__Group__4"


    // $ANTLR start "rule__DoorBrick__Group__4__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1889:1: rule__DoorBrick__Group__4__Impl : ( ( rule__DoorBrick__YUnitsAssignment_4 ) ) ;
    public final void rule__DoorBrick__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1893:1: ( ( ( rule__DoorBrick__YUnitsAssignment_4 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1894:1: ( ( rule__DoorBrick__YUnitsAssignment_4 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1894:1: ( ( rule__DoorBrick__YUnitsAssignment_4 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1895:1: ( rule__DoorBrick__YUnitsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorBrickAccess().getYUnitsAssignment_4()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1896:1: ( rule__DoorBrick__YUnitsAssignment_4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1896:2: rule__DoorBrick__YUnitsAssignment_4
            {
            pushFollow(FOLLOW_rule__DoorBrick__YUnitsAssignment_4_in_rule__DoorBrick__Group__4__Impl3813);
            rule__DoorBrick__YUnitsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoorBrickAccess().getYUnitsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoorBrick__Group__4__Impl"


    // $ANTLR start "rule__DoorBrick__Group__5"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1906:1: rule__DoorBrick__Group__5 : rule__DoorBrick__Group__5__Impl rule__DoorBrick__Group__6 ;
    public final void rule__DoorBrick__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1910:1: ( rule__DoorBrick__Group__5__Impl rule__DoorBrick__Group__6 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1911:2: rule__DoorBrick__Group__5__Impl rule__DoorBrick__Group__6
            {
            pushFollow(FOLLOW_rule__DoorBrick__Group__5__Impl_in_rule__DoorBrick__Group__53843);
            rule__DoorBrick__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DoorBrick__Group__6_in_rule__DoorBrick__Group__53846);
            rule__DoorBrick__Group__6();

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
    // $ANTLR end "rule__DoorBrick__Group__5"


    // $ANTLR start "rule__DoorBrick__Group__5__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1918:1: rule__DoorBrick__Group__5__Impl : ( ( rule__DoorBrick__ZUnitsAssignment_5 ) ) ;
    public final void rule__DoorBrick__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1922:1: ( ( ( rule__DoorBrick__ZUnitsAssignment_5 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1923:1: ( ( rule__DoorBrick__ZUnitsAssignment_5 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1923:1: ( ( rule__DoorBrick__ZUnitsAssignment_5 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1924:1: ( rule__DoorBrick__ZUnitsAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorBrickAccess().getZUnitsAssignment_5()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1925:1: ( rule__DoorBrick__ZUnitsAssignment_5 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1925:2: rule__DoorBrick__ZUnitsAssignment_5
            {
            pushFollow(FOLLOW_rule__DoorBrick__ZUnitsAssignment_5_in_rule__DoorBrick__Group__5__Impl3873);
            rule__DoorBrick__ZUnitsAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoorBrickAccess().getZUnitsAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoorBrick__Group__5__Impl"


    // $ANTLR start "rule__DoorBrick__Group__6"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1935:1: rule__DoorBrick__Group__6 : rule__DoorBrick__Group__6__Impl ;
    public final void rule__DoorBrick__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1939:1: ( rule__DoorBrick__Group__6__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1940:2: rule__DoorBrick__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__DoorBrick__Group__6__Impl_in_rule__DoorBrick__Group__63903);
            rule__DoorBrick__Group__6__Impl();

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
    // $ANTLR end "rule__DoorBrick__Group__6"


    // $ANTLR start "rule__DoorBrick__Group__6__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1946:1: rule__DoorBrick__Group__6__Impl : ( ( rule__DoorBrick__FillAssignment_6 ) ) ;
    public final void rule__DoorBrick__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1950:1: ( ( ( rule__DoorBrick__FillAssignment_6 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1951:1: ( ( rule__DoorBrick__FillAssignment_6 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1951:1: ( ( rule__DoorBrick__FillAssignment_6 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1952:1: ( rule__DoorBrick__FillAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorBrickAccess().getFillAssignment_6()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1953:1: ( rule__DoorBrick__FillAssignment_6 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1953:2: rule__DoorBrick__FillAssignment_6
            {
            pushFollow(FOLLOW_rule__DoorBrick__FillAssignment_6_in_rule__DoorBrick__Group__6__Impl3930);
            rule__DoorBrick__FillAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoorBrickAccess().getFillAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoorBrick__Group__6__Impl"


    // $ANTLR start "rule__Door__Group__0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1977:1: rule__Door__Group__0 : rule__Door__Group__0__Impl rule__Door__Group__1 ;
    public final void rule__Door__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1981:1: ( rule__Door__Group__0__Impl rule__Door__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1982:2: rule__Door__Group__0__Impl rule__Door__Group__1
            {
            pushFollow(FOLLOW_rule__Door__Group__0__Impl_in_rule__Door__Group__03974);
            rule__Door__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Door__Group__1_in_rule__Door__Group__03977);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1989:1: rule__Door__Group__0__Impl : ( 'door' ) ;
    public final void rule__Door__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1993:1: ( ( 'door' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1994:1: ( 'door' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1994:1: ( 'door' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1995:1: 'door'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorAccess().getDoorKeyword_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Door__Group__0__Impl4005); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2008:1: rule__Door__Group__1 : rule__Door__Group__1__Impl rule__Door__Group__2 ;
    public final void rule__Door__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2012:1: ( rule__Door__Group__1__Impl rule__Door__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2013:2: rule__Door__Group__1__Impl rule__Door__Group__2
            {
            pushFollow(FOLLOW_rule__Door__Group__1__Impl_in_rule__Door__Group__14036);
            rule__Door__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Door__Group__2_in_rule__Door__Group__14039);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2020:1: rule__Door__Group__1__Impl : ( ( rule__Door__NameAssignment_1 ) ) ;
    public final void rule__Door__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2024:1: ( ( ( rule__Door__NameAssignment_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2025:1: ( ( rule__Door__NameAssignment_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2025:1: ( ( rule__Door__NameAssignment_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2026:1: ( rule__Door__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2027:1: ( rule__Door__NameAssignment_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2027:2: rule__Door__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Door__NameAssignment_1_in_rule__Door__Group__1__Impl4066);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2037:1: rule__Door__Group__2 : rule__Door__Group__2__Impl rule__Door__Group__3 ;
    public final void rule__Door__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2041:1: ( rule__Door__Group__2__Impl rule__Door__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2042:2: rule__Door__Group__2__Impl rule__Door__Group__3
            {
            pushFollow(FOLLOW_rule__Door__Group__2__Impl_in_rule__Door__Group__24096);
            rule__Door__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Door__Group__3_in_rule__Door__Group__24099);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2049:1: rule__Door__Group__2__Impl : ( 'units' ) ;
    public final void rule__Door__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2053:1: ( ( 'units' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2054:1: ( 'units' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2054:1: ( 'units' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2055:1: 'units'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorAccess().getUnitsKeyword_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__Door__Group__2__Impl4127); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2068:1: rule__Door__Group__3 : rule__Door__Group__3__Impl rule__Door__Group__4 ;
    public final void rule__Door__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2072:1: ( rule__Door__Group__3__Impl rule__Door__Group__4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2073:2: rule__Door__Group__3__Impl rule__Door__Group__4
            {
            pushFollow(FOLLOW_rule__Door__Group__3__Impl_in_rule__Door__Group__34158);
            rule__Door__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Door__Group__4_in_rule__Door__Group__34161);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2080:1: rule__Door__Group__3__Impl : ( ( rule__Door__XUnitsAssignment_3 ) ) ;
    public final void rule__Door__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2084:1: ( ( ( rule__Door__XUnitsAssignment_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2085:1: ( ( rule__Door__XUnitsAssignment_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2085:1: ( ( rule__Door__XUnitsAssignment_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2086:1: ( rule__Door__XUnitsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorAccess().getXUnitsAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2087:1: ( rule__Door__XUnitsAssignment_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2087:2: rule__Door__XUnitsAssignment_3
            {
            pushFollow(FOLLOW_rule__Door__XUnitsAssignment_3_in_rule__Door__Group__3__Impl4188);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2097:1: rule__Door__Group__4 : rule__Door__Group__4__Impl rule__Door__Group__5 ;
    public final void rule__Door__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2101:1: ( rule__Door__Group__4__Impl rule__Door__Group__5 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2102:2: rule__Door__Group__4__Impl rule__Door__Group__5
            {
            pushFollow(FOLLOW_rule__Door__Group__4__Impl_in_rule__Door__Group__44218);
            rule__Door__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Door__Group__5_in_rule__Door__Group__44221);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2109:1: rule__Door__Group__4__Impl : ( ( rule__Door__YUnitsAssignment_4 ) ) ;
    public final void rule__Door__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2113:1: ( ( ( rule__Door__YUnitsAssignment_4 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2114:1: ( ( rule__Door__YUnitsAssignment_4 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2114:1: ( ( rule__Door__YUnitsAssignment_4 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2115:1: ( rule__Door__YUnitsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorAccess().getYUnitsAssignment_4()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2116:1: ( rule__Door__YUnitsAssignment_4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2116:2: rule__Door__YUnitsAssignment_4
            {
            pushFollow(FOLLOW_rule__Door__YUnitsAssignment_4_in_rule__Door__Group__4__Impl4248);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2126:1: rule__Door__Group__5 : rule__Door__Group__5__Impl ;
    public final void rule__Door__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2130:1: ( rule__Door__Group__5__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2131:2: rule__Door__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Door__Group__5__Impl_in_rule__Door__Group__54278);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2137:1: rule__Door__Group__5__Impl : ( ( rule__Door__FillAssignment_5 ) ) ;
    public final void rule__Door__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2141:1: ( ( ( rule__Door__FillAssignment_5 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2142:1: ( ( rule__Door__FillAssignment_5 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2142:1: ( ( rule__Door__FillAssignment_5 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2143:1: ( rule__Door__FillAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorAccess().getFillAssignment_5()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2144:1: ( rule__Door__FillAssignment_5 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2144:2: rule__Door__FillAssignment_5
            {
            pushFollow(FOLLOW_rule__Door__FillAssignment_5_in_rule__Door__Group__5__Impl4305);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2166:1: rule__Assembly__Group__0 : rule__Assembly__Group__0__Impl rule__Assembly__Group__1 ;
    public final void rule__Assembly__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2170:1: ( rule__Assembly__Group__0__Impl rule__Assembly__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2171:2: rule__Assembly__Group__0__Impl rule__Assembly__Group__1
            {
            pushFollow(FOLLOW_rule__Assembly__Group__0__Impl_in_rule__Assembly__Group__04347);
            rule__Assembly__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assembly__Group__1_in_rule__Assembly__Group__04350);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2178:1: rule__Assembly__Group__0__Impl : ( 'assembly' ) ;
    public final void rule__Assembly__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2182:1: ( ( 'assembly' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2183:1: ( 'assembly' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2183:1: ( 'assembly' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2184:1: 'assembly'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getAssemblyKeyword_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Assembly__Group__0__Impl4378); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2197:1: rule__Assembly__Group__1 : rule__Assembly__Group__1__Impl rule__Assembly__Group__2 ;
    public final void rule__Assembly__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2201:1: ( rule__Assembly__Group__1__Impl rule__Assembly__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2202:2: rule__Assembly__Group__1__Impl rule__Assembly__Group__2
            {
            pushFollow(FOLLOW_rule__Assembly__Group__1__Impl_in_rule__Assembly__Group__14409);
            rule__Assembly__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assembly__Group__2_in_rule__Assembly__Group__14412);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2209:1: rule__Assembly__Group__1__Impl : ( ( rule__Assembly__NameAssignment_1 ) ) ;
    public final void rule__Assembly__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2213:1: ( ( ( rule__Assembly__NameAssignment_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2214:1: ( ( rule__Assembly__NameAssignment_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2214:1: ( ( rule__Assembly__NameAssignment_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2215:1: ( rule__Assembly__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2216:1: ( rule__Assembly__NameAssignment_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2216:2: rule__Assembly__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Assembly__NameAssignment_1_in_rule__Assembly__Group__1__Impl4439);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2226:1: rule__Assembly__Group__2 : rule__Assembly__Group__2__Impl rule__Assembly__Group__3 ;
    public final void rule__Assembly__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2230:1: ( rule__Assembly__Group__2__Impl rule__Assembly__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2231:2: rule__Assembly__Group__2__Impl rule__Assembly__Group__3
            {
            pushFollow(FOLLOW_rule__Assembly__Group__2__Impl_in_rule__Assembly__Group__24469);
            rule__Assembly__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assembly__Group__3_in_rule__Assembly__Group__24472);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2238:1: rule__Assembly__Group__2__Impl : ( '{' ) ;
    public final void rule__Assembly__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2242:1: ( ( '{' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2243:1: ( '{' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2243:1: ( '{' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2244:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,17,FOLLOW_17_in_rule__Assembly__Group__2__Impl4500); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2257:1: rule__Assembly__Group__3 : rule__Assembly__Group__3__Impl rule__Assembly__Group__4 ;
    public final void rule__Assembly__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2261:1: ( rule__Assembly__Group__3__Impl rule__Assembly__Group__4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2262:2: rule__Assembly__Group__3__Impl rule__Assembly__Group__4
            {
            pushFollow(FOLLOW_rule__Assembly__Group__3__Impl_in_rule__Assembly__Group__34531);
            rule__Assembly__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assembly__Group__4_in_rule__Assembly__Group__34534);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2269:1: rule__Assembly__Group__3__Impl : ( ( ( rule__Assembly__ItemsAssignment_3 ) ) ( ( rule__Assembly__ItemsAssignment_3 )* ) ) ;
    public final void rule__Assembly__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2273:1: ( ( ( ( rule__Assembly__ItemsAssignment_3 ) ) ( ( rule__Assembly__ItemsAssignment_3 )* ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2274:1: ( ( ( rule__Assembly__ItemsAssignment_3 ) ) ( ( rule__Assembly__ItemsAssignment_3 )* ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2274:1: ( ( ( rule__Assembly__ItemsAssignment_3 ) ) ( ( rule__Assembly__ItemsAssignment_3 )* ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2275:1: ( ( rule__Assembly__ItemsAssignment_3 ) ) ( ( rule__Assembly__ItemsAssignment_3 )* )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2275:1: ( ( rule__Assembly__ItemsAssignment_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2276:1: ( rule__Assembly__ItemsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getItemsAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2277:1: ( rule__Assembly__ItemsAssignment_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2277:2: rule__Assembly__ItemsAssignment_3
            {
            pushFollow(FOLLOW_rule__Assembly__ItemsAssignment_3_in_rule__Assembly__Group__3__Impl4563);
            rule__Assembly__ItemsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyAccess().getItemsAssignment_3()); 
            }

            }

            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2280:1: ( ( rule__Assembly__ItemsAssignment_3 )* )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2281:1: ( rule__Assembly__ItemsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getItemsAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2282:1: ( rule__Assembly__ItemsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2282:2: rule__Assembly__ItemsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Assembly__ItemsAssignment_3_in_rule__Assembly__Group__3__Impl4575);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2293:1: rule__Assembly__Group__4 : rule__Assembly__Group__4__Impl ;
    public final void rule__Assembly__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2297:1: ( rule__Assembly__Group__4__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2298:2: rule__Assembly__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Assembly__Group__4__Impl_in_rule__Assembly__Group__44608);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2304:1: rule__Assembly__Group__4__Impl : ( '}' ) ;
    public final void rule__Assembly__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2308:1: ( ( '}' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2309:1: ( '}' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2309:1: ( '}' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2310:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,18,FOLLOW_18_in_rule__Assembly__Group__4__Impl4636); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2333:1: rule__AssemblyItem__Group__0 : rule__AssemblyItem__Group__0__Impl rule__AssemblyItem__Group__1 ;
    public final void rule__AssemblyItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2337:1: ( rule__AssemblyItem__Group__0__Impl rule__AssemblyItem__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2338:2: rule__AssemblyItem__Group__0__Impl rule__AssemblyItem__Group__1
            {
            pushFollow(FOLLOW_rule__AssemblyItem__Group__0__Impl_in_rule__AssemblyItem__Group__04677);
            rule__AssemblyItem__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssemblyItem__Group__1_in_rule__AssemblyItem__Group__04680);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2345:1: rule__AssemblyItem__Group__0__Impl : ( ( rule__AssemblyItem__ElementAssignment_0 ) ) ;
    public final void rule__AssemblyItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2349:1: ( ( ( rule__AssemblyItem__ElementAssignment_0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2350:1: ( ( rule__AssemblyItem__ElementAssignment_0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2350:1: ( ( rule__AssemblyItem__ElementAssignment_0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2351:1: ( rule__AssemblyItem__ElementAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getElementAssignment_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2352:1: ( rule__AssemblyItem__ElementAssignment_0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2352:2: rule__AssemblyItem__ElementAssignment_0
            {
            pushFollow(FOLLOW_rule__AssemblyItem__ElementAssignment_0_in_rule__AssemblyItem__Group__0__Impl4707);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2362:1: rule__AssemblyItem__Group__1 : rule__AssemblyItem__Group__1__Impl rule__AssemblyItem__Group__2 ;
    public final void rule__AssemblyItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2366:1: ( rule__AssemblyItem__Group__1__Impl rule__AssemblyItem__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2367:2: rule__AssemblyItem__Group__1__Impl rule__AssemblyItem__Group__2
            {
            pushFollow(FOLLOW_rule__AssemblyItem__Group__1__Impl_in_rule__AssemblyItem__Group__14737);
            rule__AssemblyItem__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssemblyItem__Group__2_in_rule__AssemblyItem__Group__14740);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2374:1: rule__AssemblyItem__Group__1__Impl : ( 'pos' ) ;
    public final void rule__AssemblyItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2378:1: ( ( 'pos' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2379:1: ( 'pos' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2379:1: ( 'pos' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2380:1: 'pos'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getPosKeyword_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__AssemblyItem__Group__1__Impl4768); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2393:1: rule__AssemblyItem__Group__2 : rule__AssemblyItem__Group__2__Impl rule__AssemblyItem__Group__3 ;
    public final void rule__AssemblyItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2397:1: ( rule__AssemblyItem__Group__2__Impl rule__AssemblyItem__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2398:2: rule__AssemblyItem__Group__2__Impl rule__AssemblyItem__Group__3
            {
            pushFollow(FOLLOW_rule__AssemblyItem__Group__2__Impl_in_rule__AssemblyItem__Group__24799);
            rule__AssemblyItem__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssemblyItem__Group__3_in_rule__AssemblyItem__Group__24802);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2405:1: rule__AssemblyItem__Group__2__Impl : ( ( rule__AssemblyItem__XUnitsAssignment_2 ) ) ;
    public final void rule__AssemblyItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2409:1: ( ( ( rule__AssemblyItem__XUnitsAssignment_2 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2410:1: ( ( rule__AssemblyItem__XUnitsAssignment_2 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2410:1: ( ( rule__AssemblyItem__XUnitsAssignment_2 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2411:1: ( rule__AssemblyItem__XUnitsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getXUnitsAssignment_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2412:1: ( rule__AssemblyItem__XUnitsAssignment_2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2412:2: rule__AssemblyItem__XUnitsAssignment_2
            {
            pushFollow(FOLLOW_rule__AssemblyItem__XUnitsAssignment_2_in_rule__AssemblyItem__Group__2__Impl4829);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2422:1: rule__AssemblyItem__Group__3 : rule__AssemblyItem__Group__3__Impl rule__AssemblyItem__Group__4 ;
    public final void rule__AssemblyItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2426:1: ( rule__AssemblyItem__Group__3__Impl rule__AssemblyItem__Group__4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2427:2: rule__AssemblyItem__Group__3__Impl rule__AssemblyItem__Group__4
            {
            pushFollow(FOLLOW_rule__AssemblyItem__Group__3__Impl_in_rule__AssemblyItem__Group__34859);
            rule__AssemblyItem__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssemblyItem__Group__4_in_rule__AssemblyItem__Group__34862);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2434:1: rule__AssemblyItem__Group__3__Impl : ( ( rule__AssemblyItem__YUnitsAssignment_3 ) ) ;
    public final void rule__AssemblyItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2438:1: ( ( ( rule__AssemblyItem__YUnitsAssignment_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2439:1: ( ( rule__AssemblyItem__YUnitsAssignment_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2439:1: ( ( rule__AssemblyItem__YUnitsAssignment_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2440:1: ( rule__AssemblyItem__YUnitsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getYUnitsAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2441:1: ( rule__AssemblyItem__YUnitsAssignment_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2441:2: rule__AssemblyItem__YUnitsAssignment_3
            {
            pushFollow(FOLLOW_rule__AssemblyItem__YUnitsAssignment_3_in_rule__AssemblyItem__Group__3__Impl4889);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2451:1: rule__AssemblyItem__Group__4 : rule__AssemblyItem__Group__4__Impl rule__AssemblyItem__Group__5 ;
    public final void rule__AssemblyItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2455:1: ( rule__AssemblyItem__Group__4__Impl rule__AssemblyItem__Group__5 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2456:2: rule__AssemblyItem__Group__4__Impl rule__AssemblyItem__Group__5
            {
            pushFollow(FOLLOW_rule__AssemblyItem__Group__4__Impl_in_rule__AssemblyItem__Group__44919);
            rule__AssemblyItem__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssemblyItem__Group__5_in_rule__AssemblyItem__Group__44922);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2463:1: rule__AssemblyItem__Group__4__Impl : ( ( rule__AssemblyItem__ZUnitsAssignment_4 ) ) ;
    public final void rule__AssemblyItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2467:1: ( ( ( rule__AssemblyItem__ZUnitsAssignment_4 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2468:1: ( ( rule__AssemblyItem__ZUnitsAssignment_4 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2468:1: ( ( rule__AssemblyItem__ZUnitsAssignment_4 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2469:1: ( rule__AssemblyItem__ZUnitsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getZUnitsAssignment_4()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2470:1: ( rule__AssemblyItem__ZUnitsAssignment_4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2470:2: rule__AssemblyItem__ZUnitsAssignment_4
            {
            pushFollow(FOLLOW_rule__AssemblyItem__ZUnitsAssignment_4_in_rule__AssemblyItem__Group__4__Impl4949);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2480:1: rule__AssemblyItem__Group__5 : rule__AssemblyItem__Group__5__Impl ;
    public final void rule__AssemblyItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2484:1: ( rule__AssemblyItem__Group__5__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2485:2: rule__AssemblyItem__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__AssemblyItem__Group__5__Impl_in_rule__AssemblyItem__Group__54979);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2491:1: rule__AssemblyItem__Group__5__Impl : ( ( rule__AssemblyItem__Group_5__0 )? ) ;
    public final void rule__AssemblyItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2495:1: ( ( ( rule__AssemblyItem__Group_5__0 )? ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2496:1: ( ( rule__AssemblyItem__Group_5__0 )? )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2496:1: ( ( rule__AssemblyItem__Group_5__0 )? )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2497:1: ( rule__AssemblyItem__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getGroup_5()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2498:1: ( rule__AssemblyItem__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2498:2: rule__AssemblyItem__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__AssemblyItem__Group_5__0_in_rule__AssemblyItem__Group__5__Impl5006);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2520:1: rule__AssemblyItem__Group_5__0 : rule__AssemblyItem__Group_5__0__Impl rule__AssemblyItem__Group_5__1 ;
    public final void rule__AssemblyItem__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2524:1: ( rule__AssemblyItem__Group_5__0__Impl rule__AssemblyItem__Group_5__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2525:2: rule__AssemblyItem__Group_5__0__Impl rule__AssemblyItem__Group_5__1
            {
            pushFollow(FOLLOW_rule__AssemblyItem__Group_5__0__Impl_in_rule__AssemblyItem__Group_5__05049);
            rule__AssemblyItem__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssemblyItem__Group_5__1_in_rule__AssemblyItem__Group_5__05052);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2532:1: rule__AssemblyItem__Group_5__0__Impl : ( 'transform' ) ;
    public final void rule__AssemblyItem__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2536:1: ( ( 'transform' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2537:1: ( 'transform' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2537:1: ( 'transform' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2538:1: 'transform'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getTransformKeyword_5_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__AssemblyItem__Group_5__0__Impl5080); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2551:1: rule__AssemblyItem__Group_5__1 : rule__AssemblyItem__Group_5__1__Impl ;
    public final void rule__AssemblyItem__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2555:1: ( rule__AssemblyItem__Group_5__1__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2556:2: rule__AssemblyItem__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__AssemblyItem__Group_5__1__Impl_in_rule__AssemblyItem__Group_5__15111);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2562:1: rule__AssemblyItem__Group_5__1__Impl : ( ( rule__AssemblyItem__TransformAssignment_5_1 ) ) ;
    public final void rule__AssemblyItem__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2566:1: ( ( ( rule__AssemblyItem__TransformAssignment_5_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2567:1: ( ( rule__AssemblyItem__TransformAssignment_5_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2567:1: ( ( rule__AssemblyItem__TransformAssignment_5_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2568:1: ( rule__AssemblyItem__TransformAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getTransformAssignment_5_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2569:1: ( rule__AssemblyItem__TransformAssignment_5_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2569:2: rule__AssemblyItem__TransformAssignment_5_1
            {
            pushFollow(FOLLOW_rule__AssemblyItem__TransformAssignment_5_1_in_rule__AssemblyItem__Group_5__1__Impl5138);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2584:1: rule__Model__RepoAssignment_0 : ( ruleItemRepository ) ;
    public final void rule__Model__RepoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2588:1: ( ( ruleItemRepository ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2589:1: ( ruleItemRepository )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2589:1: ( ruleItemRepository )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2590:1: ruleItemRepository
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRepoItemRepositoryParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleItemRepository_in_rule__Model__RepoAssignment_05177);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2599:1: rule__Model__AssemblyAssignment_1 : ( ruleAssembly ) ;
    public final void rule__Model__AssemblyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2603:1: ( ( ruleAssembly ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2604:1: ( ruleAssembly )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2604:1: ( ruleAssembly )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2605:1: ruleAssembly
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getAssemblyAssemblyParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleAssembly_in_rule__Model__AssemblyAssignment_15208);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2614:1: rule__ItemRepository__NameAssignment_0 : ( ruleValidID ) ;
    public final void rule__ItemRepository__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2618:1: ( ( ruleValidID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2619:1: ( ruleValidID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2619:1: ( ruleValidID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2620:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getNameValidIDParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__ItemRepository__NameAssignment_05239);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2629:1: rule__ItemRepository__ElementListAssignment_2 : ( ruleItem ) ;
    public final void rule__ItemRepository__ElementListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2633:1: ( ( ruleItem ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2634:1: ( ruleItem )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2634:1: ( ruleItem )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2635:1: ruleItem
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getElementListItemParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleItem_in_rule__ItemRepository__ElementListAssignment_25270);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2644:1: rule__Color__RAssignment_1 : ( RULE_INT ) ;
    public final void rule__Color__RAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2648:1: ( ( RULE_INT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2649:1: ( RULE_INT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2649:1: ( RULE_INT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2650:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getRINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Color__RAssignment_15301); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2659:1: rule__Color__GAssignment_2 : ( RULE_INT ) ;
    public final void rule__Color__GAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2663:1: ( ( RULE_INT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2664:1: ( RULE_INT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2664:1: ( RULE_INT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2665:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getGINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Color__GAssignment_25332); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2674:1: rule__Color__BAssignment_3 : ( RULE_INT ) ;
    public final void rule__Color__BAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2678:1: ( ( RULE_INT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2679:1: ( RULE_INT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2679:1: ( RULE_INT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2680:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getBINTTerminalRuleCall_3_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Color__BAssignment_35363); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2689:1: rule__XUnit__UnitsAssignment : ( RULE_INT ) ;
    public final void rule__XUnit__UnitsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2693:1: ( ( RULE_INT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2694:1: ( RULE_INT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2694:1: ( RULE_INT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2695:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXUnitAccess().getUnitsINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__XUnit__UnitsAssignment5394); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2704:1: rule__YUnit__UnitsAssignment : ( RULE_INT ) ;
    public final void rule__YUnit__UnitsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2708:1: ( ( RULE_INT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2709:1: ( RULE_INT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2709:1: ( RULE_INT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2710:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYUnitAccess().getUnitsINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__YUnit__UnitsAssignment5425); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2719:1: rule__ZUnit__UnitsAssignment : ( RULE_INT ) ;
    public final void rule__ZUnit__UnitsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2723:1: ( ( RULE_INT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2724:1: ( RULE_INT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2724:1: ( RULE_INT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2725:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getZUnitAccess().getUnitsINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ZUnit__UnitsAssignment5456); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2734:1: rule__Brick__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__Brick__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2738:1: ( ( ruleValidID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2739:1: ( ruleValidID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2739:1: ( ruleValidID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2740:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__Brick__NameAssignment_15487);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2749:1: rule__Brick__XUnitsAssignment_3 : ( ruleXUnit ) ;
    public final void rule__Brick__XUnitsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2753:1: ( ( ruleXUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2754:1: ( ruleXUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2754:1: ( ruleXUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2755:1: ruleXUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getXUnitsXUnitParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleXUnit_in_rule__Brick__XUnitsAssignment_35518);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2764:1: rule__Brick__YUnitsAssignment_4 : ( ruleYUnit ) ;
    public final void rule__Brick__YUnitsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2768:1: ( ( ruleYUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2769:1: ( ruleYUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2769:1: ( ruleYUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2770:1: ruleYUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getYUnitsYUnitParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleYUnit_in_rule__Brick__YUnitsAssignment_45549);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2779:1: rule__Brick__ZUnitsAssignment_5 : ( ruleZUnit ) ;
    public final void rule__Brick__ZUnitsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2783:1: ( ( ruleZUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2784:1: ( ruleZUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2784:1: ( ruleZUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2785:1: ruleZUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getZUnitsZUnitParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleZUnit_in_rule__Brick__ZUnitsAssignment_55580);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2794:1: rule__Brick__FillAssignment_6 : ( ruleColor ) ;
    public final void rule__Brick__FillAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2798:1: ( ( ruleColor ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2799:1: ( ruleColor )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2799:1: ( ruleColor )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2800:1: ruleColor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getFillColorParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleColor_in_rule__Brick__FillAssignment_65611);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2809:1: rule__Brick__SourceAssignment_7 : ( ruleSource ) ;
    public final void rule__Brick__SourceAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2813:1: ( ( ruleSource ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2814:1: ( ruleSource )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2814:1: ( ruleSource )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2815:1: ruleSource
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getSourceSourceParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleSource_in_rule__Brick__SourceAssignment_75642);
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


    // $ANTLR start "rule__FxmlInclude__SourceAssignment_1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2824:1: rule__FxmlInclude__SourceAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FxmlInclude__SourceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2828:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2829:1: ( RULE_STRING )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2829:1: ( RULE_STRING )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2830:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getSourceSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FxmlInclude__SourceAssignment_15673); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFxmlIncludeAccess().getSourceSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FxmlInclude__SourceAssignment_1"


    // $ANTLR start "rule__FxmlInclude__OriginXAssignment_2_1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2839:1: rule__FxmlInclude__OriginXAssignment_2_1 : ( RULE_FLOAT ) ;
    public final void rule__FxmlInclude__OriginXAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2843:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2844:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2844:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2845:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getOriginXFLOATTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__FxmlInclude__OriginXAssignment_2_15704); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2854:1: rule__FxmlInclude__OriginYAssignment_2_2 : ( RULE_FLOAT ) ;
    public final void rule__FxmlInclude__OriginYAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2858:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2859:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2859:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2860:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getOriginYFLOATTerminalRuleCall_2_2_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__FxmlInclude__OriginYAssignment_2_25735); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2869:1: rule__FxmlInclude__OriginZAssignment_2_3 : ( RULE_FLOAT ) ;
    public final void rule__FxmlInclude__OriginZAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2873:1: ( ( RULE_FLOAT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2874:1: ( RULE_FLOAT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2874:1: ( RULE_FLOAT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2875:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFxmlIncludeAccess().getOriginZFLOATTerminalRuleCall_2_3_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__FxmlInclude__OriginZAssignment_2_35766); if (state.failed) return ;
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


    // $ANTLR start "rule__RoundBrick__NameAssignment_1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2884:1: rule__RoundBrick__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__RoundBrick__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2888:1: ( ( ruleValidID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2889:1: ( ruleValidID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2889:1: ( ruleValidID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2890:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoundBrickAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__RoundBrick__NameAssignment_15797);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoundBrickAccess().getNameValidIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundBrick__NameAssignment_1"


    // $ANTLR start "rule__RoundBrick__XUnitsAssignment_3"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2899:1: rule__RoundBrick__XUnitsAssignment_3 : ( ruleXUnit ) ;
    public final void rule__RoundBrick__XUnitsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2903:1: ( ( ruleXUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2904:1: ( ruleXUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2904:1: ( ruleXUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2905:1: ruleXUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoundBrickAccess().getXUnitsXUnitParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleXUnit_in_rule__RoundBrick__XUnitsAssignment_35828);
            ruleXUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoundBrickAccess().getXUnitsXUnitParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundBrick__XUnitsAssignment_3"


    // $ANTLR start "rule__RoundBrick__YUnitsAssignment_4"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2914:1: rule__RoundBrick__YUnitsAssignment_4 : ( ruleYUnit ) ;
    public final void rule__RoundBrick__YUnitsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2918:1: ( ( ruleYUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2919:1: ( ruleYUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2919:1: ( ruleYUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2920:1: ruleYUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoundBrickAccess().getYUnitsYUnitParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleYUnit_in_rule__RoundBrick__YUnitsAssignment_45859);
            ruleYUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoundBrickAccess().getYUnitsYUnitParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundBrick__YUnitsAssignment_4"


    // $ANTLR start "rule__RoundBrick__ZUnitsAssignment_5"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2929:1: rule__RoundBrick__ZUnitsAssignment_5 : ( ruleZUnit ) ;
    public final void rule__RoundBrick__ZUnitsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2933:1: ( ( ruleZUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2934:1: ( ruleZUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2934:1: ( ruleZUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2935:1: ruleZUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoundBrickAccess().getZUnitsZUnitParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleZUnit_in_rule__RoundBrick__ZUnitsAssignment_55890);
            ruleZUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoundBrickAccess().getZUnitsZUnitParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundBrick__ZUnitsAssignment_5"


    // $ANTLR start "rule__RoundBrick__FillAssignment_6"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2944:1: rule__RoundBrick__FillAssignment_6 : ( ruleColor ) ;
    public final void rule__RoundBrick__FillAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2948:1: ( ( ruleColor ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2949:1: ( ruleColor )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2949:1: ( ruleColor )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2950:1: ruleColor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoundBrickAccess().getFillColorParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleColor_in_rule__RoundBrick__FillAssignment_65921);
            ruleColor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoundBrickAccess().getFillColorParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundBrick__FillAssignment_6"


    // $ANTLR start "rule__DoorBrick__NameAssignment_1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2959:1: rule__DoorBrick__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__DoorBrick__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2963:1: ( ( ruleValidID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2964:1: ( ruleValidID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2964:1: ( ruleValidID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2965:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorBrickAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__DoorBrick__NameAssignment_15952);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoorBrickAccess().getNameValidIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoorBrick__NameAssignment_1"


    // $ANTLR start "rule__DoorBrick__XUnitsAssignment_3"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2974:1: rule__DoorBrick__XUnitsAssignment_3 : ( ruleXUnit ) ;
    public final void rule__DoorBrick__XUnitsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2978:1: ( ( ruleXUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2979:1: ( ruleXUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2979:1: ( ruleXUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2980:1: ruleXUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorBrickAccess().getXUnitsXUnitParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleXUnit_in_rule__DoorBrick__XUnitsAssignment_35983);
            ruleXUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoorBrickAccess().getXUnitsXUnitParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoorBrick__XUnitsAssignment_3"


    // $ANTLR start "rule__DoorBrick__YUnitsAssignment_4"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2989:1: rule__DoorBrick__YUnitsAssignment_4 : ( ruleYUnit ) ;
    public final void rule__DoorBrick__YUnitsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2993:1: ( ( ruleYUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2994:1: ( ruleYUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2994:1: ( ruleYUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2995:1: ruleYUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorBrickAccess().getYUnitsYUnitParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleYUnit_in_rule__DoorBrick__YUnitsAssignment_46014);
            ruleYUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoorBrickAccess().getYUnitsYUnitParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoorBrick__YUnitsAssignment_4"


    // $ANTLR start "rule__DoorBrick__ZUnitsAssignment_5"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3004:1: rule__DoorBrick__ZUnitsAssignment_5 : ( ruleZUnit ) ;
    public final void rule__DoorBrick__ZUnitsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3008:1: ( ( ruleZUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3009:1: ( ruleZUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3009:1: ( ruleZUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3010:1: ruleZUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorBrickAccess().getZUnitsZUnitParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleZUnit_in_rule__DoorBrick__ZUnitsAssignment_56045);
            ruleZUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoorBrickAccess().getZUnitsZUnitParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoorBrick__ZUnitsAssignment_5"


    // $ANTLR start "rule__DoorBrick__FillAssignment_6"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3019:1: rule__DoorBrick__FillAssignment_6 : ( ruleColor ) ;
    public final void rule__DoorBrick__FillAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3023:1: ( ( ruleColor ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3024:1: ( ruleColor )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3024:1: ( ruleColor )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3025:1: ruleColor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorBrickAccess().getFillColorParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleColor_in_rule__DoorBrick__FillAssignment_66076);
            ruleColor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoorBrickAccess().getFillColorParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoorBrick__FillAssignment_6"


    // $ANTLR start "rule__Door__NameAssignment_1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3034:1: rule__Door__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__Door__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3038:1: ( ( ruleValidID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3039:1: ( ruleValidID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3039:1: ( ruleValidID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3040:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__Door__NameAssignment_16107);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3049:1: rule__Door__XUnitsAssignment_3 : ( ruleXUnit ) ;
    public final void rule__Door__XUnitsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3053:1: ( ( ruleXUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3054:1: ( ruleXUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3054:1: ( ruleXUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3055:1: ruleXUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorAccess().getXUnitsXUnitParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleXUnit_in_rule__Door__XUnitsAssignment_36138);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3064:1: rule__Door__YUnitsAssignment_4 : ( ruleYUnit ) ;
    public final void rule__Door__YUnitsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3068:1: ( ( ruleYUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3069:1: ( ruleYUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3069:1: ( ruleYUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3070:1: ruleYUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorAccess().getYUnitsYUnitParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleYUnit_in_rule__Door__YUnitsAssignment_46169);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3079:1: rule__Door__FillAssignment_5 : ( ruleColor ) ;
    public final void rule__Door__FillAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3083:1: ( ( ruleColor ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3084:1: ( ruleColor )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3084:1: ( ruleColor )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3085:1: ruleColor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorAccess().getFillColorParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleColor_in_rule__Door__FillAssignment_56200);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3094:1: rule__Assembly__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__Assembly__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3098:1: ( ( ruleValidID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3099:1: ( ruleValidID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3099:1: ( ruleValidID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3100:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__Assembly__NameAssignment_16231);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3109:1: rule__Assembly__ItemsAssignment_3 : ( ruleAssemblyItem ) ;
    public final void rule__Assembly__ItemsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3113:1: ( ( ruleAssemblyItem ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3114:1: ( ruleAssemblyItem )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3114:1: ( ruleAssemblyItem )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3115:1: ruleAssemblyItem
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getItemsAssemblyItemParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleAssemblyItem_in_rule__Assembly__ItemsAssignment_36262);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3124:1: rule__AssemblyItem__ElementAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__AssemblyItem__ElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3128:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3129:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3129:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3130:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getElementLegoElementCrossReference_0_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3131:1: ( ruleQualifiedName )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3132:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getElementLegoElementQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__AssemblyItem__ElementAssignment_06297);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3143:1: rule__AssemblyItem__XUnitsAssignment_2 : ( ruleXUnit ) ;
    public final void rule__AssemblyItem__XUnitsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3147:1: ( ( ruleXUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3148:1: ( ruleXUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3148:1: ( ruleXUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3149:1: ruleXUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getXUnitsXUnitParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleXUnit_in_rule__AssemblyItem__XUnitsAssignment_26332);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3158:1: rule__AssemblyItem__YUnitsAssignment_3 : ( ruleYUnit ) ;
    public final void rule__AssemblyItem__YUnitsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3162:1: ( ( ruleYUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3163:1: ( ruleYUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3163:1: ( ruleYUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3164:1: ruleYUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getYUnitsYUnitParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleYUnit_in_rule__AssemblyItem__YUnitsAssignment_36363);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3173:1: rule__AssemblyItem__ZUnitsAssignment_4 : ( ruleZUnit ) ;
    public final void rule__AssemblyItem__ZUnitsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3177:1: ( ( ruleZUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3178:1: ( ruleZUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3178:1: ( ruleZUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3179:1: ruleZUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getZUnitsZUnitParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleZUnit_in_rule__AssemblyItem__ZUnitsAssignment_46394);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3188:1: rule__AssemblyItem__TransformAssignment_5_1 : ( ( rule__AssemblyItem__TransformAlternatives_5_1_0 ) ) ;
    public final void rule__AssemblyItem__TransformAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3192:1: ( ( ( rule__AssemblyItem__TransformAlternatives_5_1_0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3193:1: ( ( rule__AssemblyItem__TransformAlternatives_5_1_0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3193:1: ( ( rule__AssemblyItem__TransformAlternatives_5_1_0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3194:1: ( rule__AssemblyItem__TransformAlternatives_5_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getTransformAlternatives_5_1_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3195:1: ( rule__AssemblyItem__TransformAlternatives_5_1_0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:3195:2: rule__AssemblyItem__TransformAlternatives_5_1_0
            {
            pushFollow(FOLLOW_rule__AssemblyItem__TransformAlternatives_5_1_0_in_rule__AssemblyItem__TransformAssignment_5_16425);
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
    public static final BitSet FOLLOW_ruleRoundBrick_in_entryRuleRoundBrick850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRoundBrick857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoundBrick__Group__0_in_ruleRoundBrick883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoorBrick_in_entryRuleDoorBrick910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoorBrick917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoorBrick__Group__0_in_ruleDoorBrick943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoor_in_entryRuleDoor970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoor977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Door__Group__0_in_ruleDoor1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssembly_in_entryRuleAssembly1030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssembly1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assembly__Group__0_in_ruleAssembly1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssemblyItem_in_entryRuleAssemblyItem1090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssemblyItem1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group__0_in_ruleAssemblyItem1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__RepoAssignment_0_in_rule__Model__Alternatives1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__AssemblyAssignment_1_in_rule__Model__Alternatives1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrick_in_rule__Item__Alternatives1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoundBrick_in_rule__Item__Alternatives1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoorBrick_in_rule__Item__Alternatives1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoor_in_rule__Item__Alternatives1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerated_in_rule__Source__Alternatives1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFxmlInclude_in_rule__Source__Alternatives1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__AssemblyItem__TransformAlternatives_5_1_01344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__AssemblyItem__TransformAlternatives_5_1_01364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__AssemblyItem__TransformAlternatives_5_1_01384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01416 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1502 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01537 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__QualifiedName__Group_1__0__Impl1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__0__Impl_in_rule__ItemRepository__Group__01661 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__1_in_rule__ItemRepository__Group__01664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemRepository__NameAssignment_0_in_rule__ItemRepository__Group__0__Impl1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__1__Impl_in_rule__ItemRepository__Group__11721 = new BitSet(new long[]{0x0000000007100000L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__2_in_rule__ItemRepository__Group__11724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ItemRepository__Group__1__Impl1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__2__Impl_in_rule__ItemRepository__Group__21783 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__3_in_rule__ItemRepository__Group__21786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemRepository__ElementListAssignment_2_in_rule__ItemRepository__Group__2__Impl1815 = new BitSet(new long[]{0x0000000007100002L});
    public static final BitSet FOLLOW_rule__ItemRepository__ElementListAssignment_2_in_rule__ItemRepository__Group__2__Impl1827 = new BitSet(new long[]{0x0000000007100002L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__3__Impl_in_rule__ItemRepository__Group__31860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ItemRepository__Group__3__Impl1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group__0__Impl_in_rule__Color__Group__01927 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Color__Group__1_in_rule__Color__Group__01930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Color__Group__0__Impl1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group__1__Impl_in_rule__Color__Group__11989 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Color__Group__2_in_rule__Color__Group__11992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__RAssignment_1_in_rule__Color__Group__1__Impl2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group__2__Impl_in_rule__Color__Group__22049 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Color__Group__3_in_rule__Color__Group__22052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__GAssignment_2_in_rule__Color__Group__2__Impl2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group__3__Impl_in_rule__Color__Group__32109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__BAssignment_3_in_rule__Color__Group__3__Impl2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__0__Impl_in_rule__Brick__Group__02174 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Brick__Group__1_in_rule__Brick__Group__02177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Brick__Group__0__Impl2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__1__Impl_in_rule__Brick__Group__12236 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Brick__Group__2_in_rule__Brick__Group__12239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__NameAssignment_1_in_rule__Brick__Group__1__Impl2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__2__Impl_in_rule__Brick__Group__22296 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Brick__Group__3_in_rule__Brick__Group__22299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Brick__Group__2__Impl2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__3__Impl_in_rule__Brick__Group__32358 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Brick__Group__4_in_rule__Brick__Group__32361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__XUnitsAssignment_3_in_rule__Brick__Group__3__Impl2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__4__Impl_in_rule__Brick__Group__42418 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Brick__Group__5_in_rule__Brick__Group__42421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__YUnitsAssignment_4_in_rule__Brick__Group__4__Impl2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__5__Impl_in_rule__Brick__Group__52478 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Brick__Group__6_in_rule__Brick__Group__52481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__ZUnitsAssignment_5_in_rule__Brick__Group__5__Impl2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__6__Impl_in_rule__Brick__Group__62538 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_rule__Brick__Group__7_in_rule__Brick__Group__62541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__FillAssignment_6_in_rule__Brick__Group__6__Impl2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__7__Impl_in_rule__Brick__Group__72598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__SourceAssignment_7_in_rule__Brick__Group__7__Impl2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__0__Impl_in_rule__FxmlInclude__Group__02671 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__1_in_rule__FxmlInclude__Group__02674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FxmlInclude__Group__0__Impl2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__1__Impl_in_rule__FxmlInclude__Group__12733 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__2_in_rule__FxmlInclude__Group__12736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__SourceAssignment_1_in_rule__FxmlInclude__Group__1__Impl2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group__2__Impl_in_rule__FxmlInclude__Group__22793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group_2__0_in_rule__FxmlInclude__Group__2__Impl2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group_2__0__Impl_in_rule__FxmlInclude__Group_2__02857 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group_2__1_in_rule__FxmlInclude__Group_2__02860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FxmlInclude__Group_2__0__Impl2888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group_2__1__Impl_in_rule__FxmlInclude__Group_2__12919 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group_2__2_in_rule__FxmlInclude__Group_2__12922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__OriginXAssignment_2_1_in_rule__FxmlInclude__Group_2__1__Impl2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group_2__2__Impl_in_rule__FxmlInclude__Group_2__22979 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group_2__3_in_rule__FxmlInclude__Group_2__22982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__OriginYAssignment_2_2_in_rule__FxmlInclude__Group_2__2__Impl3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__Group_2__3__Impl_in_rule__FxmlInclude__Group_2__33039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FxmlInclude__OriginZAssignment_2_3_in_rule__FxmlInclude__Group_2__3__Impl3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoundBrick__Group__0__Impl_in_rule__RoundBrick__Group__03104 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RoundBrick__Group__1_in_rule__RoundBrick__Group__03107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__RoundBrick__Group__0__Impl3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoundBrick__Group__1__Impl_in_rule__RoundBrick__Group__13166 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__RoundBrick__Group__2_in_rule__RoundBrick__Group__13169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoundBrick__NameAssignment_1_in_rule__RoundBrick__Group__1__Impl3196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoundBrick__Group__2__Impl_in_rule__RoundBrick__Group__23226 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RoundBrick__Group__3_in_rule__RoundBrick__Group__23229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RoundBrick__Group__2__Impl3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoundBrick__Group__3__Impl_in_rule__RoundBrick__Group__33288 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RoundBrick__Group__4_in_rule__RoundBrick__Group__33291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoundBrick__XUnitsAssignment_3_in_rule__RoundBrick__Group__3__Impl3318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoundBrick__Group__4__Impl_in_rule__RoundBrick__Group__43348 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RoundBrick__Group__5_in_rule__RoundBrick__Group__43351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoundBrick__YUnitsAssignment_4_in_rule__RoundBrick__Group__4__Impl3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoundBrick__Group__5__Impl_in_rule__RoundBrick__Group__53408 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__RoundBrick__Group__6_in_rule__RoundBrick__Group__53411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoundBrick__ZUnitsAssignment_5_in_rule__RoundBrick__Group__5__Impl3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoundBrick__Group__6__Impl_in_rule__RoundBrick__Group__63468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoundBrick__FillAssignment_6_in_rule__RoundBrick__Group__6__Impl3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoorBrick__Group__0__Impl_in_rule__DoorBrick__Group__03539 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DoorBrick__Group__1_in_rule__DoorBrick__Group__03542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__DoorBrick__Group__0__Impl3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoorBrick__Group__1__Impl_in_rule__DoorBrick__Group__13601 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__DoorBrick__Group__2_in_rule__DoorBrick__Group__13604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoorBrick__NameAssignment_1_in_rule__DoorBrick__Group__1__Impl3631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoorBrick__Group__2__Impl_in_rule__DoorBrick__Group__23661 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DoorBrick__Group__3_in_rule__DoorBrick__Group__23664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DoorBrick__Group__2__Impl3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoorBrick__Group__3__Impl_in_rule__DoorBrick__Group__33723 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DoorBrick__Group__4_in_rule__DoorBrick__Group__33726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoorBrick__XUnitsAssignment_3_in_rule__DoorBrick__Group__3__Impl3753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoorBrick__Group__4__Impl_in_rule__DoorBrick__Group__43783 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DoorBrick__Group__5_in_rule__DoorBrick__Group__43786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoorBrick__YUnitsAssignment_4_in_rule__DoorBrick__Group__4__Impl3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoorBrick__Group__5__Impl_in_rule__DoorBrick__Group__53843 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__DoorBrick__Group__6_in_rule__DoorBrick__Group__53846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoorBrick__ZUnitsAssignment_5_in_rule__DoorBrick__Group__5__Impl3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoorBrick__Group__6__Impl_in_rule__DoorBrick__Group__63903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoorBrick__FillAssignment_6_in_rule__DoorBrick__Group__6__Impl3930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Door__Group__0__Impl_in_rule__Door__Group__03974 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Door__Group__1_in_rule__Door__Group__03977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Door__Group__0__Impl4005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Door__Group__1__Impl_in_rule__Door__Group__14036 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Door__Group__2_in_rule__Door__Group__14039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Door__NameAssignment_1_in_rule__Door__Group__1__Impl4066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Door__Group__2__Impl_in_rule__Door__Group__24096 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Door__Group__3_in_rule__Door__Group__24099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Door__Group__2__Impl4127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Door__Group__3__Impl_in_rule__Door__Group__34158 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Door__Group__4_in_rule__Door__Group__34161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Door__XUnitsAssignment_3_in_rule__Door__Group__3__Impl4188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Door__Group__4__Impl_in_rule__Door__Group__44218 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Door__Group__5_in_rule__Door__Group__44221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Door__YUnitsAssignment_4_in_rule__Door__Group__4__Impl4248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Door__Group__5__Impl_in_rule__Door__Group__54278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Door__FillAssignment_5_in_rule__Door__Group__5__Impl4305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assembly__Group__0__Impl_in_rule__Assembly__Group__04347 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Assembly__Group__1_in_rule__Assembly__Group__04350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Assembly__Group__0__Impl4378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assembly__Group__1__Impl_in_rule__Assembly__Group__14409 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Assembly__Group__2_in_rule__Assembly__Group__14412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assembly__NameAssignment_1_in_rule__Assembly__Group__1__Impl4439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assembly__Group__2__Impl_in_rule__Assembly__Group__24469 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Assembly__Group__3_in_rule__Assembly__Group__24472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Assembly__Group__2__Impl4500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assembly__Group__3__Impl_in_rule__Assembly__Group__34531 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Assembly__Group__4_in_rule__Assembly__Group__34534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assembly__ItemsAssignment_3_in_rule__Assembly__Group__3__Impl4563 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Assembly__ItemsAssignment_3_in_rule__Assembly__Group__3__Impl4575 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Assembly__Group__4__Impl_in_rule__Assembly__Group__44608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Assembly__Group__4__Impl4636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group__0__Impl_in_rule__AssemblyItem__Group__04677 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group__1_in_rule__AssemblyItem__Group__04680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__ElementAssignment_0_in_rule__AssemblyItem__Group__0__Impl4707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group__1__Impl_in_rule__AssemblyItem__Group__14737 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group__2_in_rule__AssemblyItem__Group__14740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__AssemblyItem__Group__1__Impl4768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group__2__Impl_in_rule__AssemblyItem__Group__24799 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group__3_in_rule__AssemblyItem__Group__24802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__XUnitsAssignment_2_in_rule__AssemblyItem__Group__2__Impl4829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group__3__Impl_in_rule__AssemblyItem__Group__34859 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group__4_in_rule__AssemblyItem__Group__34862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__YUnitsAssignment_3_in_rule__AssemblyItem__Group__3__Impl4889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group__4__Impl_in_rule__AssemblyItem__Group__44919 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group__5_in_rule__AssemblyItem__Group__44922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__ZUnitsAssignment_4_in_rule__AssemblyItem__Group__4__Impl4949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group__5__Impl_in_rule__AssemblyItem__Group__54979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group_5__0_in_rule__AssemblyItem__Group__5__Impl5006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group_5__0__Impl_in_rule__AssemblyItem__Group_5__05049 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group_5__1_in_rule__AssemblyItem__Group_5__05052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__AssemblyItem__Group_5__0__Impl5080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group_5__1__Impl_in_rule__AssemblyItem__Group_5__15111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__TransformAssignment_5_1_in_rule__AssemblyItem__Group_5__1__Impl5138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemRepository_in_rule__Model__RepoAssignment_05177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssembly_in_rule__Model__AssemblyAssignment_15208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__ItemRepository__NameAssignment_05239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_rule__ItemRepository__ElementListAssignment_25270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Color__RAssignment_15301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Color__GAssignment_25332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Color__BAssignment_35363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__XUnit__UnitsAssignment5394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__YUnit__UnitsAssignment5425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ZUnit__UnitsAssignment5456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__Brick__NameAssignment_15487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnit_in_rule__Brick__XUnitsAssignment_35518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYUnit_in_rule__Brick__YUnitsAssignment_45549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZUnit_in_rule__Brick__ZUnitsAssignment_55580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__Brick__FillAssignment_65611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSource_in_rule__Brick__SourceAssignment_75642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FxmlInclude__SourceAssignment_15673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FxmlInclude__OriginXAssignment_2_15704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FxmlInclude__OriginYAssignment_2_25735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FxmlInclude__OriginZAssignment_2_35766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__RoundBrick__NameAssignment_15797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnit_in_rule__RoundBrick__XUnitsAssignment_35828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYUnit_in_rule__RoundBrick__YUnitsAssignment_45859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZUnit_in_rule__RoundBrick__ZUnitsAssignment_55890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__RoundBrick__FillAssignment_65921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__DoorBrick__NameAssignment_15952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnit_in_rule__DoorBrick__XUnitsAssignment_35983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYUnit_in_rule__DoorBrick__YUnitsAssignment_46014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZUnit_in_rule__DoorBrick__ZUnitsAssignment_56045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__DoorBrick__FillAssignment_66076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__Door__NameAssignment_16107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnit_in_rule__Door__XUnitsAssignment_36138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYUnit_in_rule__Door__YUnitsAssignment_46169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__Door__FillAssignment_56200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__Assembly__NameAssignment_16231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssemblyItem_in_rule__Assembly__ItemsAssignment_36262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__AssemblyItem__ElementAssignment_06297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnit_in_rule__AssemblyItem__XUnitsAssignment_26332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYUnit_in_rule__AssemblyItem__YUnitsAssignment_36363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZUnit_in_rule__AssemblyItem__ZUnitsAssignment_46394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__TransformAlternatives_5_1_0_in_rule__AssemblyItem__TransformAssignment_5_16425 = new BitSet(new long[]{0x0000000000000002L});

}