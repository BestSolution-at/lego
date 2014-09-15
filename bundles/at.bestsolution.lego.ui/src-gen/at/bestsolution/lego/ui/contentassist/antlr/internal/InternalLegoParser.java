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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'left'", "'right'", "'.'", "'{'", "'}'", "'rgb'", "'brick'", "'units'", "'rbrick'", "'dbrick'", "'door'", "'assembly'", "'pos'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
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


    // $ANTLR start "entryRuleRoundBrick"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:343:1: entryRuleRoundBrick : ruleRoundBrick EOF ;
    public final void entryRuleRoundBrick() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:344:1: ( ruleRoundBrick EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:345:1: ruleRoundBrick EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoundBrickRule()); 
            }
            pushFollow(FOLLOW_ruleRoundBrick_in_entryRuleRoundBrick668);
            ruleRoundBrick();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoundBrickRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRoundBrick675); if (state.failed) return ;

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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:352:1: ruleRoundBrick : ( ( rule__RoundBrick__Group__0 ) ) ;
    public final void ruleRoundBrick() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:356:2: ( ( ( rule__RoundBrick__Group__0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:357:1: ( ( rule__RoundBrick__Group__0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:357:1: ( ( rule__RoundBrick__Group__0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:358:1: ( rule__RoundBrick__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoundBrickAccess().getGroup()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:359:1: ( rule__RoundBrick__Group__0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:359:2: rule__RoundBrick__Group__0
            {
            pushFollow(FOLLOW_rule__RoundBrick__Group__0_in_ruleRoundBrick701);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:371:1: entryRuleDoorBrick : ruleDoorBrick EOF ;
    public final void entryRuleDoorBrick() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:372:1: ( ruleDoorBrick EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:373:1: ruleDoorBrick EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorBrickRule()); 
            }
            pushFollow(FOLLOW_ruleDoorBrick_in_entryRuleDoorBrick728);
            ruleDoorBrick();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoorBrickRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoorBrick735); if (state.failed) return ;

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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:380:1: ruleDoorBrick : ( ( rule__DoorBrick__Group__0 ) ) ;
    public final void ruleDoorBrick() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:384:2: ( ( ( rule__DoorBrick__Group__0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:385:1: ( ( rule__DoorBrick__Group__0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:385:1: ( ( rule__DoorBrick__Group__0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:386:1: ( rule__DoorBrick__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorBrickAccess().getGroup()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:387:1: ( rule__DoorBrick__Group__0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:387:2: rule__DoorBrick__Group__0
            {
            pushFollow(FOLLOW_rule__DoorBrick__Group__0_in_ruleDoorBrick761);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:399:1: entryRuleDoor : ruleDoor EOF ;
    public final void entryRuleDoor() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:400:1: ( ruleDoor EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:401:1: ruleDoor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorRule()); 
            }
            pushFollow(FOLLOW_ruleDoor_in_entryRuleDoor788);
            ruleDoor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoor795); if (state.failed) return ;

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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:408:1: ruleDoor : ( ( rule__Door__Group__0 ) ) ;
    public final void ruleDoor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:412:2: ( ( ( rule__Door__Group__0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:413:1: ( ( rule__Door__Group__0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:413:1: ( ( rule__Door__Group__0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:414:1: ( rule__Door__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorAccess().getGroup()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:415:1: ( rule__Door__Group__0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:415:2: rule__Door__Group__0
            {
            pushFollow(FOLLOW_rule__Door__Group__0_in_ruleDoor821);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:427:1: entryRuleAssembly : ruleAssembly EOF ;
    public final void entryRuleAssembly() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:428:1: ( ruleAssembly EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:429:1: ruleAssembly EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyRule()); 
            }
            pushFollow(FOLLOW_ruleAssembly_in_entryRuleAssembly848);
            ruleAssembly();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssembly855); if (state.failed) return ;

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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:436:1: ruleAssembly : ( ( rule__Assembly__Group__0 ) ) ;
    public final void ruleAssembly() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:440:2: ( ( ( rule__Assembly__Group__0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:441:1: ( ( rule__Assembly__Group__0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:441:1: ( ( rule__Assembly__Group__0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:442:1: ( rule__Assembly__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getGroup()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:443:1: ( rule__Assembly__Group__0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:443:2: rule__Assembly__Group__0
            {
            pushFollow(FOLLOW_rule__Assembly__Group__0_in_ruleAssembly881);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:455:1: entryRuleAssemblyItem : ruleAssemblyItem EOF ;
    public final void entryRuleAssemblyItem() throws RecognitionException {
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:456:1: ( ruleAssemblyItem EOF )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:457:1: ruleAssemblyItem EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemRule()); 
            }
            pushFollow(FOLLOW_ruleAssemblyItem_in_entryRuleAssemblyItem908);
            ruleAssemblyItem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyItemRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssemblyItem915); if (state.failed) return ;

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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:464:1: ruleAssemblyItem : ( ( rule__AssemblyItem__Group__0 ) ) ;
    public final void ruleAssemblyItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:468:2: ( ( ( rule__AssemblyItem__Group__0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:469:1: ( ( rule__AssemblyItem__Group__0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:469:1: ( ( rule__AssemblyItem__Group__0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:470:1: ( rule__AssemblyItem__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getGroup()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:471:1: ( rule__AssemblyItem__Group__0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:471:2: rule__AssemblyItem__Group__0
            {
            pushFollow(FOLLOW_rule__AssemblyItem__Group__0_in_ruleAssemblyItem941);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:483:1: rule__Model__Alternatives : ( ( ( rule__Model__RepoAssignment_0 ) ) | ( ( rule__Model__AssemblyAssignment_1 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:487:1: ( ( ( rule__Model__RepoAssignment_0 ) ) | ( ( rule__Model__AssemblyAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==22) ) {
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
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:488:1: ( ( rule__Model__RepoAssignment_0 ) )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:488:1: ( ( rule__Model__RepoAssignment_0 ) )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:489:1: ( rule__Model__RepoAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getRepoAssignment_0()); 
                    }
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:490:1: ( rule__Model__RepoAssignment_0 )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:490:2: rule__Model__RepoAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Model__RepoAssignment_0_in_rule__Model__Alternatives977);
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
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:494:6: ( ( rule__Model__AssemblyAssignment_1 ) )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:494:6: ( ( rule__Model__AssemblyAssignment_1 ) )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:495:1: ( rule__Model__AssemblyAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getAssemblyAssignment_1()); 
                    }
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:496:1: ( rule__Model__AssemblyAssignment_1 )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:496:2: rule__Model__AssemblyAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__AssemblyAssignment_1_in_rule__Model__Alternatives995);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:506:1: rule__Item__Alternatives : ( ( ruleBrick ) | ( ruleRoundBrick ) | ( ruleDoorBrick ) | ( ruleDoor ) );
    public final void rule__Item__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:510:1: ( ( ruleBrick ) | ( ruleRoundBrick ) | ( ruleDoorBrick ) | ( ruleDoor ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            case 21:
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
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:511:1: ( ruleBrick )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:511:1: ( ruleBrick )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:512:1: ruleBrick
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getItemAccess().getBrickParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleBrick_in_rule__Item__Alternatives1029);
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
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:517:6: ( ruleRoundBrick )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:517:6: ( ruleRoundBrick )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:518:1: ruleRoundBrick
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getItemAccess().getRoundBrickParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleRoundBrick_in_rule__Item__Alternatives1046);
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
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:523:6: ( ruleDoorBrick )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:523:6: ( ruleDoorBrick )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:524:1: ruleDoorBrick
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getItemAccess().getDoorBrickParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleDoorBrick_in_rule__Item__Alternatives1063);
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
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:529:6: ( ruleDoor )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:529:6: ( ruleDoor )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:530:1: ruleDoor
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getItemAccess().getDoorParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleDoor_in_rule__Item__Alternatives1080);
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


    // $ANTLR start "rule__RoundBrick__RoundAlternatives_1_0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:540:1: rule__RoundBrick__RoundAlternatives_1_0 : ( ( 'left' ) | ( 'right' ) );
    public final void rule__RoundBrick__RoundAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:544:1: ( ( 'left' ) | ( 'right' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
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
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:545:1: ( 'left' )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:545:1: ( 'left' )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:546:1: 'left'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRoundBrickAccess().getRoundLeftKeyword_1_0_0()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__RoundBrick__RoundAlternatives_1_01113); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRoundBrickAccess().getRoundLeftKeyword_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:553:6: ( 'right' )
                    {
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:553:6: ( 'right' )
                    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:554:1: 'right'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRoundBrickAccess().getRoundRightKeyword_1_0_1()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__RoundBrick__RoundAlternatives_1_01133); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRoundBrickAccess().getRoundRightKeyword_1_0_1()); 
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
    // $ANTLR end "rule__RoundBrick__RoundAlternatives_1_0"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:568:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:572:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:573:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01165);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01168);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:580:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:584:1: ( ( ruleValidID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:585:1: ( ruleValidID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:585:1: ( ruleValidID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:586:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl1195);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:597:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:601:1: ( rule__QualifiedName__Group__1__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:602:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11224);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:608:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:612:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:613:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:613:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:614:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:615:1: ( rule__QualifiedName__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:615:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1251);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:629:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:633:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:634:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01286);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01289);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:641:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:645:1: ( ( ( '.' ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:646:1: ( ( '.' ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:646:1: ( ( '.' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:647:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:648:1: ( '.' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:649:2: '.'
            {
            match(input,13,FOLLOW_13_in_rule__QualifiedName__Group_1__0__Impl1318); if (state.failed) return ;

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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:660:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:664:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:665:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11350);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:671:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:675:1: ( ( ruleValidID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:676:1: ( ruleValidID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:676:1: ( ruleValidID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:677:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl1377);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:692:1: rule__ItemRepository__Group__0 : rule__ItemRepository__Group__0__Impl rule__ItemRepository__Group__1 ;
    public final void rule__ItemRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:696:1: ( rule__ItemRepository__Group__0__Impl rule__ItemRepository__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:697:2: rule__ItemRepository__Group__0__Impl rule__ItemRepository__Group__1
            {
            pushFollow(FOLLOW_rule__ItemRepository__Group__0__Impl_in_rule__ItemRepository__Group__01410);
            rule__ItemRepository__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ItemRepository__Group__1_in_rule__ItemRepository__Group__01413);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:704:1: rule__ItemRepository__Group__0__Impl : ( ( rule__ItemRepository__NameAssignment_0 ) ) ;
    public final void rule__ItemRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:708:1: ( ( ( rule__ItemRepository__NameAssignment_0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:709:1: ( ( rule__ItemRepository__NameAssignment_0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:709:1: ( ( rule__ItemRepository__NameAssignment_0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:710:1: ( rule__ItemRepository__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getNameAssignment_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:711:1: ( rule__ItemRepository__NameAssignment_0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:711:2: rule__ItemRepository__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ItemRepository__NameAssignment_0_in_rule__ItemRepository__Group__0__Impl1440);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:721:1: rule__ItemRepository__Group__1 : rule__ItemRepository__Group__1__Impl rule__ItemRepository__Group__2 ;
    public final void rule__ItemRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:725:1: ( rule__ItemRepository__Group__1__Impl rule__ItemRepository__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:726:2: rule__ItemRepository__Group__1__Impl rule__ItemRepository__Group__2
            {
            pushFollow(FOLLOW_rule__ItemRepository__Group__1__Impl_in_rule__ItemRepository__Group__11470);
            rule__ItemRepository__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ItemRepository__Group__2_in_rule__ItemRepository__Group__11473);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:733:1: rule__ItemRepository__Group__1__Impl : ( '{' ) ;
    public final void rule__ItemRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:737:1: ( ( '{' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:738:1: ( '{' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:738:1: ( '{' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:739:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,14,FOLLOW_14_in_rule__ItemRepository__Group__1__Impl1501); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:752:1: rule__ItemRepository__Group__2 : rule__ItemRepository__Group__2__Impl rule__ItemRepository__Group__3 ;
    public final void rule__ItemRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:756:1: ( rule__ItemRepository__Group__2__Impl rule__ItemRepository__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:757:2: rule__ItemRepository__Group__2__Impl rule__ItemRepository__Group__3
            {
            pushFollow(FOLLOW_rule__ItemRepository__Group__2__Impl_in_rule__ItemRepository__Group__21532);
            rule__ItemRepository__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ItemRepository__Group__3_in_rule__ItemRepository__Group__21535);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:764:1: rule__ItemRepository__Group__2__Impl : ( ( ( rule__ItemRepository__ElementListAssignment_2 ) ) ( ( rule__ItemRepository__ElementListAssignment_2 )* ) ) ;
    public final void rule__ItemRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:768:1: ( ( ( ( rule__ItemRepository__ElementListAssignment_2 ) ) ( ( rule__ItemRepository__ElementListAssignment_2 )* ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:769:1: ( ( ( rule__ItemRepository__ElementListAssignment_2 ) ) ( ( rule__ItemRepository__ElementListAssignment_2 )* ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:769:1: ( ( ( rule__ItemRepository__ElementListAssignment_2 ) ) ( ( rule__ItemRepository__ElementListAssignment_2 )* ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:770:1: ( ( rule__ItemRepository__ElementListAssignment_2 ) ) ( ( rule__ItemRepository__ElementListAssignment_2 )* )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:770:1: ( ( rule__ItemRepository__ElementListAssignment_2 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:771:1: ( rule__ItemRepository__ElementListAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getElementListAssignment_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:772:1: ( rule__ItemRepository__ElementListAssignment_2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:772:2: rule__ItemRepository__ElementListAssignment_2
            {
            pushFollow(FOLLOW_rule__ItemRepository__ElementListAssignment_2_in_rule__ItemRepository__Group__2__Impl1564);
            rule__ItemRepository__ElementListAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemRepositoryAccess().getElementListAssignment_2()); 
            }

            }

            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:775:1: ( ( rule__ItemRepository__ElementListAssignment_2 )* )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:776:1: ( rule__ItemRepository__ElementListAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getElementListAssignment_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:777:1: ( rule__ItemRepository__ElementListAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17||(LA5_0>=19 && LA5_0<=21)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:777:2: rule__ItemRepository__ElementListAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ItemRepository__ElementListAssignment_2_in_rule__ItemRepository__Group__2__Impl1576);
            	    rule__ItemRepository__ElementListAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:788:1: rule__ItemRepository__Group__3 : rule__ItemRepository__Group__3__Impl ;
    public final void rule__ItemRepository__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:792:1: ( rule__ItemRepository__Group__3__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:793:2: rule__ItemRepository__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ItemRepository__Group__3__Impl_in_rule__ItemRepository__Group__31609);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:799:1: rule__ItemRepository__Group__3__Impl : ( '}' ) ;
    public final void rule__ItemRepository__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:803:1: ( ( '}' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:804:1: ( '}' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:804:1: ( '}' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:805:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,15,FOLLOW_15_in_rule__ItemRepository__Group__3__Impl1637); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:826:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:830:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:831:2: rule__Color__Group__0__Impl rule__Color__Group__1
            {
            pushFollow(FOLLOW_rule__Color__Group__0__Impl_in_rule__Color__Group__01676);
            rule__Color__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Color__Group__1_in_rule__Color__Group__01679);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:838:1: rule__Color__Group__0__Impl : ( 'rgb' ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:842:1: ( ( 'rgb' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:843:1: ( 'rgb' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:843:1: ( 'rgb' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:844:1: 'rgb'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getRgbKeyword_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__Color__Group__0__Impl1707); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:857:1: rule__Color__Group__1 : rule__Color__Group__1__Impl rule__Color__Group__2 ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:861:1: ( rule__Color__Group__1__Impl rule__Color__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:862:2: rule__Color__Group__1__Impl rule__Color__Group__2
            {
            pushFollow(FOLLOW_rule__Color__Group__1__Impl_in_rule__Color__Group__11738);
            rule__Color__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Color__Group__2_in_rule__Color__Group__11741);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:869:1: rule__Color__Group__1__Impl : ( ( rule__Color__RAssignment_1 ) ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:873:1: ( ( ( rule__Color__RAssignment_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:874:1: ( ( rule__Color__RAssignment_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:874:1: ( ( rule__Color__RAssignment_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:875:1: ( rule__Color__RAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getRAssignment_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:876:1: ( rule__Color__RAssignment_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:876:2: rule__Color__RAssignment_1
            {
            pushFollow(FOLLOW_rule__Color__RAssignment_1_in_rule__Color__Group__1__Impl1768);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:886:1: rule__Color__Group__2 : rule__Color__Group__2__Impl rule__Color__Group__3 ;
    public final void rule__Color__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:890:1: ( rule__Color__Group__2__Impl rule__Color__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:891:2: rule__Color__Group__2__Impl rule__Color__Group__3
            {
            pushFollow(FOLLOW_rule__Color__Group__2__Impl_in_rule__Color__Group__21798);
            rule__Color__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Color__Group__3_in_rule__Color__Group__21801);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:898:1: rule__Color__Group__2__Impl : ( ( rule__Color__GAssignment_2 ) ) ;
    public final void rule__Color__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:902:1: ( ( ( rule__Color__GAssignment_2 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:903:1: ( ( rule__Color__GAssignment_2 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:903:1: ( ( rule__Color__GAssignment_2 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:904:1: ( rule__Color__GAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getGAssignment_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:905:1: ( rule__Color__GAssignment_2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:905:2: rule__Color__GAssignment_2
            {
            pushFollow(FOLLOW_rule__Color__GAssignment_2_in_rule__Color__Group__2__Impl1828);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:915:1: rule__Color__Group__3 : rule__Color__Group__3__Impl ;
    public final void rule__Color__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:919:1: ( rule__Color__Group__3__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:920:2: rule__Color__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Color__Group__3__Impl_in_rule__Color__Group__31858);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:926:1: rule__Color__Group__3__Impl : ( ( rule__Color__BAssignment_3 ) ) ;
    public final void rule__Color__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:930:1: ( ( ( rule__Color__BAssignment_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:931:1: ( ( rule__Color__BAssignment_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:931:1: ( ( rule__Color__BAssignment_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:932:1: ( rule__Color__BAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getBAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:933:1: ( rule__Color__BAssignment_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:933:2: rule__Color__BAssignment_3
            {
            pushFollow(FOLLOW_rule__Color__BAssignment_3_in_rule__Color__Group__3__Impl1885);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:951:1: rule__Brick__Group__0 : rule__Brick__Group__0__Impl rule__Brick__Group__1 ;
    public final void rule__Brick__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:955:1: ( rule__Brick__Group__0__Impl rule__Brick__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:956:2: rule__Brick__Group__0__Impl rule__Brick__Group__1
            {
            pushFollow(FOLLOW_rule__Brick__Group__0__Impl_in_rule__Brick__Group__01923);
            rule__Brick__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Brick__Group__1_in_rule__Brick__Group__01926);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:963:1: rule__Brick__Group__0__Impl : ( 'brick' ) ;
    public final void rule__Brick__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:967:1: ( ( 'brick' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:968:1: ( 'brick' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:968:1: ( 'brick' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:969:1: 'brick'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getBrickKeyword_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Brick__Group__0__Impl1954); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:982:1: rule__Brick__Group__1 : rule__Brick__Group__1__Impl rule__Brick__Group__2 ;
    public final void rule__Brick__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:986:1: ( rule__Brick__Group__1__Impl rule__Brick__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:987:2: rule__Brick__Group__1__Impl rule__Brick__Group__2
            {
            pushFollow(FOLLOW_rule__Brick__Group__1__Impl_in_rule__Brick__Group__11985);
            rule__Brick__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Brick__Group__2_in_rule__Brick__Group__11988);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:994:1: rule__Brick__Group__1__Impl : ( ( rule__Brick__NameAssignment_1 ) ) ;
    public final void rule__Brick__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:998:1: ( ( ( rule__Brick__NameAssignment_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:999:1: ( ( rule__Brick__NameAssignment_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:999:1: ( ( rule__Brick__NameAssignment_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1000:1: ( rule__Brick__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1001:1: ( rule__Brick__NameAssignment_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1001:2: rule__Brick__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Brick__NameAssignment_1_in_rule__Brick__Group__1__Impl2015);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1011:1: rule__Brick__Group__2 : rule__Brick__Group__2__Impl rule__Brick__Group__3 ;
    public final void rule__Brick__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1015:1: ( rule__Brick__Group__2__Impl rule__Brick__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1016:2: rule__Brick__Group__2__Impl rule__Brick__Group__3
            {
            pushFollow(FOLLOW_rule__Brick__Group__2__Impl_in_rule__Brick__Group__22045);
            rule__Brick__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Brick__Group__3_in_rule__Brick__Group__22048);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1023:1: rule__Brick__Group__2__Impl : ( 'units' ) ;
    public final void rule__Brick__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1027:1: ( ( 'units' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1028:1: ( 'units' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1028:1: ( 'units' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1029:1: 'units'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getUnitsKeyword_2()); 
            }
            match(input,18,FOLLOW_18_in_rule__Brick__Group__2__Impl2076); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1042:1: rule__Brick__Group__3 : rule__Brick__Group__3__Impl rule__Brick__Group__4 ;
    public final void rule__Brick__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1046:1: ( rule__Brick__Group__3__Impl rule__Brick__Group__4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1047:2: rule__Brick__Group__3__Impl rule__Brick__Group__4
            {
            pushFollow(FOLLOW_rule__Brick__Group__3__Impl_in_rule__Brick__Group__32107);
            rule__Brick__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Brick__Group__4_in_rule__Brick__Group__32110);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1054:1: rule__Brick__Group__3__Impl : ( ( rule__Brick__XUnitsAssignment_3 ) ) ;
    public final void rule__Brick__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1058:1: ( ( ( rule__Brick__XUnitsAssignment_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1059:1: ( ( rule__Brick__XUnitsAssignment_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1059:1: ( ( rule__Brick__XUnitsAssignment_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1060:1: ( rule__Brick__XUnitsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getXUnitsAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1061:1: ( rule__Brick__XUnitsAssignment_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1061:2: rule__Brick__XUnitsAssignment_3
            {
            pushFollow(FOLLOW_rule__Brick__XUnitsAssignment_3_in_rule__Brick__Group__3__Impl2137);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1071:1: rule__Brick__Group__4 : rule__Brick__Group__4__Impl rule__Brick__Group__5 ;
    public final void rule__Brick__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1075:1: ( rule__Brick__Group__4__Impl rule__Brick__Group__5 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1076:2: rule__Brick__Group__4__Impl rule__Brick__Group__5
            {
            pushFollow(FOLLOW_rule__Brick__Group__4__Impl_in_rule__Brick__Group__42167);
            rule__Brick__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Brick__Group__5_in_rule__Brick__Group__42170);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1083:1: rule__Brick__Group__4__Impl : ( ( rule__Brick__YUnitsAssignment_4 ) ) ;
    public final void rule__Brick__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1087:1: ( ( ( rule__Brick__YUnitsAssignment_4 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1088:1: ( ( rule__Brick__YUnitsAssignment_4 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1088:1: ( ( rule__Brick__YUnitsAssignment_4 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1089:1: ( rule__Brick__YUnitsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getYUnitsAssignment_4()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1090:1: ( rule__Brick__YUnitsAssignment_4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1090:2: rule__Brick__YUnitsAssignment_4
            {
            pushFollow(FOLLOW_rule__Brick__YUnitsAssignment_4_in_rule__Brick__Group__4__Impl2197);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1100:1: rule__Brick__Group__5 : rule__Brick__Group__5__Impl rule__Brick__Group__6 ;
    public final void rule__Brick__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1104:1: ( rule__Brick__Group__5__Impl rule__Brick__Group__6 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1105:2: rule__Brick__Group__5__Impl rule__Brick__Group__6
            {
            pushFollow(FOLLOW_rule__Brick__Group__5__Impl_in_rule__Brick__Group__52227);
            rule__Brick__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Brick__Group__6_in_rule__Brick__Group__52230);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1112:1: rule__Brick__Group__5__Impl : ( ( rule__Brick__ZUnitsAssignment_5 ) ) ;
    public final void rule__Brick__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1116:1: ( ( ( rule__Brick__ZUnitsAssignment_5 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1117:1: ( ( rule__Brick__ZUnitsAssignment_5 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1117:1: ( ( rule__Brick__ZUnitsAssignment_5 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1118:1: ( rule__Brick__ZUnitsAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getZUnitsAssignment_5()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1119:1: ( rule__Brick__ZUnitsAssignment_5 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1119:2: rule__Brick__ZUnitsAssignment_5
            {
            pushFollow(FOLLOW_rule__Brick__ZUnitsAssignment_5_in_rule__Brick__Group__5__Impl2257);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1129:1: rule__Brick__Group__6 : rule__Brick__Group__6__Impl ;
    public final void rule__Brick__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1133:1: ( rule__Brick__Group__6__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1134:2: rule__Brick__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Brick__Group__6__Impl_in_rule__Brick__Group__62287);
            rule__Brick__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1140:1: rule__Brick__Group__6__Impl : ( ( rule__Brick__FillAssignment_6 ) ) ;
    public final void rule__Brick__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1144:1: ( ( ( rule__Brick__FillAssignment_6 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1145:1: ( ( rule__Brick__FillAssignment_6 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1145:1: ( ( rule__Brick__FillAssignment_6 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1146:1: ( rule__Brick__FillAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getFillAssignment_6()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1147:1: ( rule__Brick__FillAssignment_6 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1147:2: rule__Brick__FillAssignment_6
            {
            pushFollow(FOLLOW_rule__Brick__FillAssignment_6_in_rule__Brick__Group__6__Impl2314);
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


    // $ANTLR start "rule__RoundBrick__Group__0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1171:1: rule__RoundBrick__Group__0 : rule__RoundBrick__Group__0__Impl rule__RoundBrick__Group__1 ;
    public final void rule__RoundBrick__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1175:1: ( rule__RoundBrick__Group__0__Impl rule__RoundBrick__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1176:2: rule__RoundBrick__Group__0__Impl rule__RoundBrick__Group__1
            {
            pushFollow(FOLLOW_rule__RoundBrick__Group__0__Impl_in_rule__RoundBrick__Group__02358);
            rule__RoundBrick__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RoundBrick__Group__1_in_rule__RoundBrick__Group__02361);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1183:1: rule__RoundBrick__Group__0__Impl : ( 'rbrick' ) ;
    public final void rule__RoundBrick__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1187:1: ( ( 'rbrick' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1188:1: ( 'rbrick' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1188:1: ( 'rbrick' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1189:1: 'rbrick'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoundBrickAccess().getRbrickKeyword_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__RoundBrick__Group__0__Impl2389); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1202:1: rule__RoundBrick__Group__1 : rule__RoundBrick__Group__1__Impl rule__RoundBrick__Group__2 ;
    public final void rule__RoundBrick__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1206:1: ( rule__RoundBrick__Group__1__Impl rule__RoundBrick__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1207:2: rule__RoundBrick__Group__1__Impl rule__RoundBrick__Group__2
            {
            pushFollow(FOLLOW_rule__RoundBrick__Group__1__Impl_in_rule__RoundBrick__Group__12420);
            rule__RoundBrick__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RoundBrick__Group__2_in_rule__RoundBrick__Group__12423);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1214:1: rule__RoundBrick__Group__1__Impl : ( ( rule__RoundBrick__RoundAssignment_1 ) ) ;
    public final void rule__RoundBrick__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1218:1: ( ( ( rule__RoundBrick__RoundAssignment_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1219:1: ( ( rule__RoundBrick__RoundAssignment_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1219:1: ( ( rule__RoundBrick__RoundAssignment_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1220:1: ( rule__RoundBrick__RoundAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoundBrickAccess().getRoundAssignment_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1221:1: ( rule__RoundBrick__RoundAssignment_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1221:2: rule__RoundBrick__RoundAssignment_1
            {
            pushFollow(FOLLOW_rule__RoundBrick__RoundAssignment_1_in_rule__RoundBrick__Group__1__Impl2450);
            rule__RoundBrick__RoundAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoundBrickAccess().getRoundAssignment_1()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1231:1: rule__RoundBrick__Group__2 : rule__RoundBrick__Group__2__Impl rule__RoundBrick__Group__3 ;
    public final void rule__RoundBrick__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1235:1: ( rule__RoundBrick__Group__2__Impl rule__RoundBrick__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1236:2: rule__RoundBrick__Group__2__Impl rule__RoundBrick__Group__3
            {
            pushFollow(FOLLOW_rule__RoundBrick__Group__2__Impl_in_rule__RoundBrick__Group__22480);
            rule__RoundBrick__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RoundBrick__Group__3_in_rule__RoundBrick__Group__22483);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1243:1: rule__RoundBrick__Group__2__Impl : ( ( rule__RoundBrick__NameAssignment_2 ) ) ;
    public final void rule__RoundBrick__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1247:1: ( ( ( rule__RoundBrick__NameAssignment_2 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1248:1: ( ( rule__RoundBrick__NameAssignment_2 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1248:1: ( ( rule__RoundBrick__NameAssignment_2 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1249:1: ( rule__RoundBrick__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoundBrickAccess().getNameAssignment_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1250:1: ( rule__RoundBrick__NameAssignment_2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1250:2: rule__RoundBrick__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__RoundBrick__NameAssignment_2_in_rule__RoundBrick__Group__2__Impl2510);
            rule__RoundBrick__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoundBrickAccess().getNameAssignment_2()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1260:1: rule__RoundBrick__Group__3 : rule__RoundBrick__Group__3__Impl rule__RoundBrick__Group__4 ;
    public final void rule__RoundBrick__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1264:1: ( rule__RoundBrick__Group__3__Impl rule__RoundBrick__Group__4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1265:2: rule__RoundBrick__Group__3__Impl rule__RoundBrick__Group__4
            {
            pushFollow(FOLLOW_rule__RoundBrick__Group__3__Impl_in_rule__RoundBrick__Group__32540);
            rule__RoundBrick__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RoundBrick__Group__4_in_rule__RoundBrick__Group__32543);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1272:1: rule__RoundBrick__Group__3__Impl : ( 'units' ) ;
    public final void rule__RoundBrick__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1276:1: ( ( 'units' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1277:1: ( 'units' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1277:1: ( 'units' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1278:1: 'units'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoundBrickAccess().getUnitsKeyword_3()); 
            }
            match(input,18,FOLLOW_18_in_rule__RoundBrick__Group__3__Impl2571); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoundBrickAccess().getUnitsKeyword_3()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1291:1: rule__RoundBrick__Group__4 : rule__RoundBrick__Group__4__Impl rule__RoundBrick__Group__5 ;
    public final void rule__RoundBrick__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1295:1: ( rule__RoundBrick__Group__4__Impl rule__RoundBrick__Group__5 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1296:2: rule__RoundBrick__Group__4__Impl rule__RoundBrick__Group__5
            {
            pushFollow(FOLLOW_rule__RoundBrick__Group__4__Impl_in_rule__RoundBrick__Group__42602);
            rule__RoundBrick__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RoundBrick__Group__5_in_rule__RoundBrick__Group__42605);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1303:1: rule__RoundBrick__Group__4__Impl : ( ( rule__RoundBrick__XUnitsAssignment_4 ) ) ;
    public final void rule__RoundBrick__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1307:1: ( ( ( rule__RoundBrick__XUnitsAssignment_4 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1308:1: ( ( rule__RoundBrick__XUnitsAssignment_4 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1308:1: ( ( rule__RoundBrick__XUnitsAssignment_4 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1309:1: ( rule__RoundBrick__XUnitsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoundBrickAccess().getXUnitsAssignment_4()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1310:1: ( rule__RoundBrick__XUnitsAssignment_4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1310:2: rule__RoundBrick__XUnitsAssignment_4
            {
            pushFollow(FOLLOW_rule__RoundBrick__XUnitsAssignment_4_in_rule__RoundBrick__Group__4__Impl2632);
            rule__RoundBrick__XUnitsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoundBrickAccess().getXUnitsAssignment_4()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1320:1: rule__RoundBrick__Group__5 : rule__RoundBrick__Group__5__Impl rule__RoundBrick__Group__6 ;
    public final void rule__RoundBrick__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1324:1: ( rule__RoundBrick__Group__5__Impl rule__RoundBrick__Group__6 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1325:2: rule__RoundBrick__Group__5__Impl rule__RoundBrick__Group__6
            {
            pushFollow(FOLLOW_rule__RoundBrick__Group__5__Impl_in_rule__RoundBrick__Group__52662);
            rule__RoundBrick__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RoundBrick__Group__6_in_rule__RoundBrick__Group__52665);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1332:1: rule__RoundBrick__Group__5__Impl : ( ( rule__RoundBrick__YUnitsAssignment_5 ) ) ;
    public final void rule__RoundBrick__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1336:1: ( ( ( rule__RoundBrick__YUnitsAssignment_5 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1337:1: ( ( rule__RoundBrick__YUnitsAssignment_5 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1337:1: ( ( rule__RoundBrick__YUnitsAssignment_5 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1338:1: ( rule__RoundBrick__YUnitsAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoundBrickAccess().getYUnitsAssignment_5()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1339:1: ( rule__RoundBrick__YUnitsAssignment_5 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1339:2: rule__RoundBrick__YUnitsAssignment_5
            {
            pushFollow(FOLLOW_rule__RoundBrick__YUnitsAssignment_5_in_rule__RoundBrick__Group__5__Impl2692);
            rule__RoundBrick__YUnitsAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoundBrickAccess().getYUnitsAssignment_5()); 
            }

            }


            }

        }
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1349:1: rule__RoundBrick__Group__6 : rule__RoundBrick__Group__6__Impl rule__RoundBrick__Group__7 ;
    public final void rule__RoundBrick__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1353:1: ( rule__RoundBrick__Group__6__Impl rule__RoundBrick__Group__7 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1354:2: rule__RoundBrick__Group__6__Impl rule__RoundBrick__Group__7
            {
            pushFollow(FOLLOW_rule__RoundBrick__Group__6__Impl_in_rule__RoundBrick__Group__62722);
            rule__RoundBrick__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RoundBrick__Group__7_in_rule__RoundBrick__Group__62725);
            rule__RoundBrick__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1361:1: rule__RoundBrick__Group__6__Impl : ( ( rule__RoundBrick__ZUnitsAssignment_6 ) ) ;
    public final void rule__RoundBrick__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1365:1: ( ( ( rule__RoundBrick__ZUnitsAssignment_6 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1366:1: ( ( rule__RoundBrick__ZUnitsAssignment_6 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1366:1: ( ( rule__RoundBrick__ZUnitsAssignment_6 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1367:1: ( rule__RoundBrick__ZUnitsAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoundBrickAccess().getZUnitsAssignment_6()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1368:1: ( rule__RoundBrick__ZUnitsAssignment_6 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1368:2: rule__RoundBrick__ZUnitsAssignment_6
            {
            pushFollow(FOLLOW_rule__RoundBrick__ZUnitsAssignment_6_in_rule__RoundBrick__Group__6__Impl2752);
            rule__RoundBrick__ZUnitsAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoundBrickAccess().getZUnitsAssignment_6()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__RoundBrick__Group__7"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1378:1: rule__RoundBrick__Group__7 : rule__RoundBrick__Group__7__Impl ;
    public final void rule__RoundBrick__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1382:1: ( rule__RoundBrick__Group__7__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1383:2: rule__RoundBrick__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__RoundBrick__Group__7__Impl_in_rule__RoundBrick__Group__72782);
            rule__RoundBrick__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundBrick__Group__7"


    // $ANTLR start "rule__RoundBrick__Group__7__Impl"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1389:1: rule__RoundBrick__Group__7__Impl : ( ( rule__RoundBrick__FillAssignment_7 ) ) ;
    public final void rule__RoundBrick__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1393:1: ( ( ( rule__RoundBrick__FillAssignment_7 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1394:1: ( ( rule__RoundBrick__FillAssignment_7 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1394:1: ( ( rule__RoundBrick__FillAssignment_7 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1395:1: ( rule__RoundBrick__FillAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoundBrickAccess().getFillAssignment_7()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1396:1: ( rule__RoundBrick__FillAssignment_7 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1396:2: rule__RoundBrick__FillAssignment_7
            {
            pushFollow(FOLLOW_rule__RoundBrick__FillAssignment_7_in_rule__RoundBrick__Group__7__Impl2809);
            rule__RoundBrick__FillAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoundBrickAccess().getFillAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundBrick__Group__7__Impl"


    // $ANTLR start "rule__DoorBrick__Group__0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1422:1: rule__DoorBrick__Group__0 : rule__DoorBrick__Group__0__Impl rule__DoorBrick__Group__1 ;
    public final void rule__DoorBrick__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1426:1: ( rule__DoorBrick__Group__0__Impl rule__DoorBrick__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1427:2: rule__DoorBrick__Group__0__Impl rule__DoorBrick__Group__1
            {
            pushFollow(FOLLOW_rule__DoorBrick__Group__0__Impl_in_rule__DoorBrick__Group__02855);
            rule__DoorBrick__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DoorBrick__Group__1_in_rule__DoorBrick__Group__02858);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1434:1: rule__DoorBrick__Group__0__Impl : ( 'dbrick' ) ;
    public final void rule__DoorBrick__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1438:1: ( ( 'dbrick' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1439:1: ( 'dbrick' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1439:1: ( 'dbrick' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1440:1: 'dbrick'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorBrickAccess().getDbrickKeyword_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__DoorBrick__Group__0__Impl2886); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1453:1: rule__DoorBrick__Group__1 : rule__DoorBrick__Group__1__Impl rule__DoorBrick__Group__2 ;
    public final void rule__DoorBrick__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1457:1: ( rule__DoorBrick__Group__1__Impl rule__DoorBrick__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1458:2: rule__DoorBrick__Group__1__Impl rule__DoorBrick__Group__2
            {
            pushFollow(FOLLOW_rule__DoorBrick__Group__1__Impl_in_rule__DoorBrick__Group__12917);
            rule__DoorBrick__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DoorBrick__Group__2_in_rule__DoorBrick__Group__12920);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1465:1: rule__DoorBrick__Group__1__Impl : ( ( rule__DoorBrick__NameAssignment_1 ) ) ;
    public final void rule__DoorBrick__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1469:1: ( ( ( rule__DoorBrick__NameAssignment_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1470:1: ( ( rule__DoorBrick__NameAssignment_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1470:1: ( ( rule__DoorBrick__NameAssignment_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1471:1: ( rule__DoorBrick__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorBrickAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1472:1: ( rule__DoorBrick__NameAssignment_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1472:2: rule__DoorBrick__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DoorBrick__NameAssignment_1_in_rule__DoorBrick__Group__1__Impl2947);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1482:1: rule__DoorBrick__Group__2 : rule__DoorBrick__Group__2__Impl rule__DoorBrick__Group__3 ;
    public final void rule__DoorBrick__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1486:1: ( rule__DoorBrick__Group__2__Impl rule__DoorBrick__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1487:2: rule__DoorBrick__Group__2__Impl rule__DoorBrick__Group__3
            {
            pushFollow(FOLLOW_rule__DoorBrick__Group__2__Impl_in_rule__DoorBrick__Group__22977);
            rule__DoorBrick__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DoorBrick__Group__3_in_rule__DoorBrick__Group__22980);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1494:1: rule__DoorBrick__Group__2__Impl : ( 'units' ) ;
    public final void rule__DoorBrick__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1498:1: ( ( 'units' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1499:1: ( 'units' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1499:1: ( 'units' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1500:1: 'units'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorBrickAccess().getUnitsKeyword_2()); 
            }
            match(input,18,FOLLOW_18_in_rule__DoorBrick__Group__2__Impl3008); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1513:1: rule__DoorBrick__Group__3 : rule__DoorBrick__Group__3__Impl rule__DoorBrick__Group__4 ;
    public final void rule__DoorBrick__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1517:1: ( rule__DoorBrick__Group__3__Impl rule__DoorBrick__Group__4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1518:2: rule__DoorBrick__Group__3__Impl rule__DoorBrick__Group__4
            {
            pushFollow(FOLLOW_rule__DoorBrick__Group__3__Impl_in_rule__DoorBrick__Group__33039);
            rule__DoorBrick__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DoorBrick__Group__4_in_rule__DoorBrick__Group__33042);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1525:1: rule__DoorBrick__Group__3__Impl : ( ( rule__DoorBrick__XUnitsAssignment_3 ) ) ;
    public final void rule__DoorBrick__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1529:1: ( ( ( rule__DoorBrick__XUnitsAssignment_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1530:1: ( ( rule__DoorBrick__XUnitsAssignment_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1530:1: ( ( rule__DoorBrick__XUnitsAssignment_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1531:1: ( rule__DoorBrick__XUnitsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorBrickAccess().getXUnitsAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1532:1: ( rule__DoorBrick__XUnitsAssignment_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1532:2: rule__DoorBrick__XUnitsAssignment_3
            {
            pushFollow(FOLLOW_rule__DoorBrick__XUnitsAssignment_3_in_rule__DoorBrick__Group__3__Impl3069);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1542:1: rule__DoorBrick__Group__4 : rule__DoorBrick__Group__4__Impl rule__DoorBrick__Group__5 ;
    public final void rule__DoorBrick__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1546:1: ( rule__DoorBrick__Group__4__Impl rule__DoorBrick__Group__5 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1547:2: rule__DoorBrick__Group__4__Impl rule__DoorBrick__Group__5
            {
            pushFollow(FOLLOW_rule__DoorBrick__Group__4__Impl_in_rule__DoorBrick__Group__43099);
            rule__DoorBrick__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DoorBrick__Group__5_in_rule__DoorBrick__Group__43102);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1554:1: rule__DoorBrick__Group__4__Impl : ( ( rule__DoorBrick__YUnitsAssignment_4 ) ) ;
    public final void rule__DoorBrick__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1558:1: ( ( ( rule__DoorBrick__YUnitsAssignment_4 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1559:1: ( ( rule__DoorBrick__YUnitsAssignment_4 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1559:1: ( ( rule__DoorBrick__YUnitsAssignment_4 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1560:1: ( rule__DoorBrick__YUnitsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorBrickAccess().getYUnitsAssignment_4()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1561:1: ( rule__DoorBrick__YUnitsAssignment_4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1561:2: rule__DoorBrick__YUnitsAssignment_4
            {
            pushFollow(FOLLOW_rule__DoorBrick__YUnitsAssignment_4_in_rule__DoorBrick__Group__4__Impl3129);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1571:1: rule__DoorBrick__Group__5 : rule__DoorBrick__Group__5__Impl rule__DoorBrick__Group__6 ;
    public final void rule__DoorBrick__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1575:1: ( rule__DoorBrick__Group__5__Impl rule__DoorBrick__Group__6 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1576:2: rule__DoorBrick__Group__5__Impl rule__DoorBrick__Group__6
            {
            pushFollow(FOLLOW_rule__DoorBrick__Group__5__Impl_in_rule__DoorBrick__Group__53159);
            rule__DoorBrick__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DoorBrick__Group__6_in_rule__DoorBrick__Group__53162);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1583:1: rule__DoorBrick__Group__5__Impl : ( ( rule__DoorBrick__ZUnitsAssignment_5 ) ) ;
    public final void rule__DoorBrick__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1587:1: ( ( ( rule__DoorBrick__ZUnitsAssignment_5 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1588:1: ( ( rule__DoorBrick__ZUnitsAssignment_5 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1588:1: ( ( rule__DoorBrick__ZUnitsAssignment_5 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1589:1: ( rule__DoorBrick__ZUnitsAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorBrickAccess().getZUnitsAssignment_5()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1590:1: ( rule__DoorBrick__ZUnitsAssignment_5 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1590:2: rule__DoorBrick__ZUnitsAssignment_5
            {
            pushFollow(FOLLOW_rule__DoorBrick__ZUnitsAssignment_5_in_rule__DoorBrick__Group__5__Impl3189);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1600:1: rule__DoorBrick__Group__6 : rule__DoorBrick__Group__6__Impl ;
    public final void rule__DoorBrick__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1604:1: ( rule__DoorBrick__Group__6__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1605:2: rule__DoorBrick__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__DoorBrick__Group__6__Impl_in_rule__DoorBrick__Group__63219);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1611:1: rule__DoorBrick__Group__6__Impl : ( ( rule__DoorBrick__FillAssignment_6 ) ) ;
    public final void rule__DoorBrick__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1615:1: ( ( ( rule__DoorBrick__FillAssignment_6 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1616:1: ( ( rule__DoorBrick__FillAssignment_6 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1616:1: ( ( rule__DoorBrick__FillAssignment_6 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1617:1: ( rule__DoorBrick__FillAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorBrickAccess().getFillAssignment_6()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1618:1: ( rule__DoorBrick__FillAssignment_6 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1618:2: rule__DoorBrick__FillAssignment_6
            {
            pushFollow(FOLLOW_rule__DoorBrick__FillAssignment_6_in_rule__DoorBrick__Group__6__Impl3246);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1642:1: rule__Door__Group__0 : rule__Door__Group__0__Impl rule__Door__Group__1 ;
    public final void rule__Door__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1646:1: ( rule__Door__Group__0__Impl rule__Door__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1647:2: rule__Door__Group__0__Impl rule__Door__Group__1
            {
            pushFollow(FOLLOW_rule__Door__Group__0__Impl_in_rule__Door__Group__03290);
            rule__Door__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Door__Group__1_in_rule__Door__Group__03293);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1654:1: rule__Door__Group__0__Impl : ( 'door' ) ;
    public final void rule__Door__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1658:1: ( ( 'door' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1659:1: ( 'door' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1659:1: ( 'door' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1660:1: 'door'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorAccess().getDoorKeyword_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__Door__Group__0__Impl3321); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1673:1: rule__Door__Group__1 : rule__Door__Group__1__Impl rule__Door__Group__2 ;
    public final void rule__Door__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1677:1: ( rule__Door__Group__1__Impl rule__Door__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1678:2: rule__Door__Group__1__Impl rule__Door__Group__2
            {
            pushFollow(FOLLOW_rule__Door__Group__1__Impl_in_rule__Door__Group__13352);
            rule__Door__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Door__Group__2_in_rule__Door__Group__13355);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1685:1: rule__Door__Group__1__Impl : ( ( rule__Door__NameAssignment_1 ) ) ;
    public final void rule__Door__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1689:1: ( ( ( rule__Door__NameAssignment_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1690:1: ( ( rule__Door__NameAssignment_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1690:1: ( ( rule__Door__NameAssignment_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1691:1: ( rule__Door__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1692:1: ( rule__Door__NameAssignment_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1692:2: rule__Door__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Door__NameAssignment_1_in_rule__Door__Group__1__Impl3382);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1702:1: rule__Door__Group__2 : rule__Door__Group__2__Impl rule__Door__Group__3 ;
    public final void rule__Door__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1706:1: ( rule__Door__Group__2__Impl rule__Door__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1707:2: rule__Door__Group__2__Impl rule__Door__Group__3
            {
            pushFollow(FOLLOW_rule__Door__Group__2__Impl_in_rule__Door__Group__23412);
            rule__Door__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Door__Group__3_in_rule__Door__Group__23415);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1714:1: rule__Door__Group__2__Impl : ( 'units' ) ;
    public final void rule__Door__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1718:1: ( ( 'units' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1719:1: ( 'units' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1719:1: ( 'units' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1720:1: 'units'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorAccess().getUnitsKeyword_2()); 
            }
            match(input,18,FOLLOW_18_in_rule__Door__Group__2__Impl3443); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1733:1: rule__Door__Group__3 : rule__Door__Group__3__Impl rule__Door__Group__4 ;
    public final void rule__Door__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1737:1: ( rule__Door__Group__3__Impl rule__Door__Group__4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1738:2: rule__Door__Group__3__Impl rule__Door__Group__4
            {
            pushFollow(FOLLOW_rule__Door__Group__3__Impl_in_rule__Door__Group__33474);
            rule__Door__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Door__Group__4_in_rule__Door__Group__33477);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1745:1: rule__Door__Group__3__Impl : ( ( rule__Door__XUnitsAssignment_3 ) ) ;
    public final void rule__Door__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1749:1: ( ( ( rule__Door__XUnitsAssignment_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1750:1: ( ( rule__Door__XUnitsAssignment_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1750:1: ( ( rule__Door__XUnitsAssignment_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1751:1: ( rule__Door__XUnitsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorAccess().getXUnitsAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1752:1: ( rule__Door__XUnitsAssignment_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1752:2: rule__Door__XUnitsAssignment_3
            {
            pushFollow(FOLLOW_rule__Door__XUnitsAssignment_3_in_rule__Door__Group__3__Impl3504);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1762:1: rule__Door__Group__4 : rule__Door__Group__4__Impl rule__Door__Group__5 ;
    public final void rule__Door__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1766:1: ( rule__Door__Group__4__Impl rule__Door__Group__5 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1767:2: rule__Door__Group__4__Impl rule__Door__Group__5
            {
            pushFollow(FOLLOW_rule__Door__Group__4__Impl_in_rule__Door__Group__43534);
            rule__Door__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Door__Group__5_in_rule__Door__Group__43537);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1774:1: rule__Door__Group__4__Impl : ( ( rule__Door__YUnitsAssignment_4 ) ) ;
    public final void rule__Door__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1778:1: ( ( ( rule__Door__YUnitsAssignment_4 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1779:1: ( ( rule__Door__YUnitsAssignment_4 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1779:1: ( ( rule__Door__YUnitsAssignment_4 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1780:1: ( rule__Door__YUnitsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorAccess().getYUnitsAssignment_4()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1781:1: ( rule__Door__YUnitsAssignment_4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1781:2: rule__Door__YUnitsAssignment_4
            {
            pushFollow(FOLLOW_rule__Door__YUnitsAssignment_4_in_rule__Door__Group__4__Impl3564);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1791:1: rule__Door__Group__5 : rule__Door__Group__5__Impl ;
    public final void rule__Door__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1795:1: ( rule__Door__Group__5__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1796:2: rule__Door__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Door__Group__5__Impl_in_rule__Door__Group__53594);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1802:1: rule__Door__Group__5__Impl : ( ( rule__Door__FillAssignment_5 ) ) ;
    public final void rule__Door__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1806:1: ( ( ( rule__Door__FillAssignment_5 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1807:1: ( ( rule__Door__FillAssignment_5 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1807:1: ( ( rule__Door__FillAssignment_5 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1808:1: ( rule__Door__FillAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorAccess().getFillAssignment_5()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1809:1: ( rule__Door__FillAssignment_5 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1809:2: rule__Door__FillAssignment_5
            {
            pushFollow(FOLLOW_rule__Door__FillAssignment_5_in_rule__Door__Group__5__Impl3621);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1831:1: rule__Assembly__Group__0 : rule__Assembly__Group__0__Impl rule__Assembly__Group__1 ;
    public final void rule__Assembly__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1835:1: ( rule__Assembly__Group__0__Impl rule__Assembly__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1836:2: rule__Assembly__Group__0__Impl rule__Assembly__Group__1
            {
            pushFollow(FOLLOW_rule__Assembly__Group__0__Impl_in_rule__Assembly__Group__03663);
            rule__Assembly__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assembly__Group__1_in_rule__Assembly__Group__03666);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1843:1: rule__Assembly__Group__0__Impl : ( 'assembly' ) ;
    public final void rule__Assembly__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1847:1: ( ( 'assembly' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1848:1: ( 'assembly' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1848:1: ( 'assembly' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1849:1: 'assembly'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getAssemblyKeyword_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__Assembly__Group__0__Impl3694); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1862:1: rule__Assembly__Group__1 : rule__Assembly__Group__1__Impl rule__Assembly__Group__2 ;
    public final void rule__Assembly__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1866:1: ( rule__Assembly__Group__1__Impl rule__Assembly__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1867:2: rule__Assembly__Group__1__Impl rule__Assembly__Group__2
            {
            pushFollow(FOLLOW_rule__Assembly__Group__1__Impl_in_rule__Assembly__Group__13725);
            rule__Assembly__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assembly__Group__2_in_rule__Assembly__Group__13728);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1874:1: rule__Assembly__Group__1__Impl : ( ( rule__Assembly__NameAssignment_1 ) ) ;
    public final void rule__Assembly__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1878:1: ( ( ( rule__Assembly__NameAssignment_1 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1879:1: ( ( rule__Assembly__NameAssignment_1 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1879:1: ( ( rule__Assembly__NameAssignment_1 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1880:1: ( rule__Assembly__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1881:1: ( rule__Assembly__NameAssignment_1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1881:2: rule__Assembly__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Assembly__NameAssignment_1_in_rule__Assembly__Group__1__Impl3755);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1891:1: rule__Assembly__Group__2 : rule__Assembly__Group__2__Impl rule__Assembly__Group__3 ;
    public final void rule__Assembly__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1895:1: ( rule__Assembly__Group__2__Impl rule__Assembly__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1896:2: rule__Assembly__Group__2__Impl rule__Assembly__Group__3
            {
            pushFollow(FOLLOW_rule__Assembly__Group__2__Impl_in_rule__Assembly__Group__23785);
            rule__Assembly__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assembly__Group__3_in_rule__Assembly__Group__23788);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1903:1: rule__Assembly__Group__2__Impl : ( '{' ) ;
    public final void rule__Assembly__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1907:1: ( ( '{' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1908:1: ( '{' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1908:1: ( '{' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1909:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,14,FOLLOW_14_in_rule__Assembly__Group__2__Impl3816); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1922:1: rule__Assembly__Group__3 : rule__Assembly__Group__3__Impl rule__Assembly__Group__4 ;
    public final void rule__Assembly__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1926:1: ( rule__Assembly__Group__3__Impl rule__Assembly__Group__4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1927:2: rule__Assembly__Group__3__Impl rule__Assembly__Group__4
            {
            pushFollow(FOLLOW_rule__Assembly__Group__3__Impl_in_rule__Assembly__Group__33847);
            rule__Assembly__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assembly__Group__4_in_rule__Assembly__Group__33850);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1934:1: rule__Assembly__Group__3__Impl : ( ( ( rule__Assembly__ItemsAssignment_3 ) ) ( ( rule__Assembly__ItemsAssignment_3 )* ) ) ;
    public final void rule__Assembly__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1938:1: ( ( ( ( rule__Assembly__ItemsAssignment_3 ) ) ( ( rule__Assembly__ItemsAssignment_3 )* ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1939:1: ( ( ( rule__Assembly__ItemsAssignment_3 ) ) ( ( rule__Assembly__ItemsAssignment_3 )* ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1939:1: ( ( ( rule__Assembly__ItemsAssignment_3 ) ) ( ( rule__Assembly__ItemsAssignment_3 )* ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1940:1: ( ( rule__Assembly__ItemsAssignment_3 ) ) ( ( rule__Assembly__ItemsAssignment_3 )* )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1940:1: ( ( rule__Assembly__ItemsAssignment_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1941:1: ( rule__Assembly__ItemsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getItemsAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1942:1: ( rule__Assembly__ItemsAssignment_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1942:2: rule__Assembly__ItemsAssignment_3
            {
            pushFollow(FOLLOW_rule__Assembly__ItemsAssignment_3_in_rule__Assembly__Group__3__Impl3879);
            rule__Assembly__ItemsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssemblyAccess().getItemsAssignment_3()); 
            }

            }

            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1945:1: ( ( rule__Assembly__ItemsAssignment_3 )* )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1946:1: ( rule__Assembly__ItemsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getItemsAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1947:1: ( rule__Assembly__ItemsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1947:2: rule__Assembly__ItemsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Assembly__ItemsAssignment_3_in_rule__Assembly__Group__3__Impl3891);
            	    rule__Assembly__ItemsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1958:1: rule__Assembly__Group__4 : rule__Assembly__Group__4__Impl ;
    public final void rule__Assembly__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1962:1: ( rule__Assembly__Group__4__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1963:2: rule__Assembly__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Assembly__Group__4__Impl_in_rule__Assembly__Group__43924);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1969:1: rule__Assembly__Group__4__Impl : ( '}' ) ;
    public final void rule__Assembly__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1973:1: ( ( '}' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1974:1: ( '}' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1974:1: ( '}' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1975:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,15,FOLLOW_15_in_rule__Assembly__Group__4__Impl3952); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:1998:1: rule__AssemblyItem__Group__0 : rule__AssemblyItem__Group__0__Impl rule__AssemblyItem__Group__1 ;
    public final void rule__AssemblyItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2002:1: ( rule__AssemblyItem__Group__0__Impl rule__AssemblyItem__Group__1 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2003:2: rule__AssemblyItem__Group__0__Impl rule__AssemblyItem__Group__1
            {
            pushFollow(FOLLOW_rule__AssemblyItem__Group__0__Impl_in_rule__AssemblyItem__Group__03993);
            rule__AssemblyItem__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssemblyItem__Group__1_in_rule__AssemblyItem__Group__03996);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2010:1: rule__AssemblyItem__Group__0__Impl : ( ( rule__AssemblyItem__ElementAssignment_0 ) ) ;
    public final void rule__AssemblyItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2014:1: ( ( ( rule__AssemblyItem__ElementAssignment_0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2015:1: ( ( rule__AssemblyItem__ElementAssignment_0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2015:1: ( ( rule__AssemblyItem__ElementAssignment_0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2016:1: ( rule__AssemblyItem__ElementAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getElementAssignment_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2017:1: ( rule__AssemblyItem__ElementAssignment_0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2017:2: rule__AssemblyItem__ElementAssignment_0
            {
            pushFollow(FOLLOW_rule__AssemblyItem__ElementAssignment_0_in_rule__AssemblyItem__Group__0__Impl4023);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2027:1: rule__AssemblyItem__Group__1 : rule__AssemblyItem__Group__1__Impl rule__AssemblyItem__Group__2 ;
    public final void rule__AssemblyItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2031:1: ( rule__AssemblyItem__Group__1__Impl rule__AssemblyItem__Group__2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2032:2: rule__AssemblyItem__Group__1__Impl rule__AssemblyItem__Group__2
            {
            pushFollow(FOLLOW_rule__AssemblyItem__Group__1__Impl_in_rule__AssemblyItem__Group__14053);
            rule__AssemblyItem__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssemblyItem__Group__2_in_rule__AssemblyItem__Group__14056);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2039:1: rule__AssemblyItem__Group__1__Impl : ( 'pos' ) ;
    public final void rule__AssemblyItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2043:1: ( ( 'pos' ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2044:1: ( 'pos' )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2044:1: ( 'pos' )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2045:1: 'pos'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getPosKeyword_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__AssemblyItem__Group__1__Impl4084); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2058:1: rule__AssemblyItem__Group__2 : rule__AssemblyItem__Group__2__Impl rule__AssemblyItem__Group__3 ;
    public final void rule__AssemblyItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2062:1: ( rule__AssemblyItem__Group__2__Impl rule__AssemblyItem__Group__3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2063:2: rule__AssemblyItem__Group__2__Impl rule__AssemblyItem__Group__3
            {
            pushFollow(FOLLOW_rule__AssemblyItem__Group__2__Impl_in_rule__AssemblyItem__Group__24115);
            rule__AssemblyItem__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssemblyItem__Group__3_in_rule__AssemblyItem__Group__24118);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2070:1: rule__AssemblyItem__Group__2__Impl : ( ( rule__AssemblyItem__XUnitsAssignment_2 ) ) ;
    public final void rule__AssemblyItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2074:1: ( ( ( rule__AssemblyItem__XUnitsAssignment_2 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2075:1: ( ( rule__AssemblyItem__XUnitsAssignment_2 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2075:1: ( ( rule__AssemblyItem__XUnitsAssignment_2 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2076:1: ( rule__AssemblyItem__XUnitsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getXUnitsAssignment_2()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2077:1: ( rule__AssemblyItem__XUnitsAssignment_2 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2077:2: rule__AssemblyItem__XUnitsAssignment_2
            {
            pushFollow(FOLLOW_rule__AssemblyItem__XUnitsAssignment_2_in_rule__AssemblyItem__Group__2__Impl4145);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2087:1: rule__AssemblyItem__Group__3 : rule__AssemblyItem__Group__3__Impl rule__AssemblyItem__Group__4 ;
    public final void rule__AssemblyItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2091:1: ( rule__AssemblyItem__Group__3__Impl rule__AssemblyItem__Group__4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2092:2: rule__AssemblyItem__Group__3__Impl rule__AssemblyItem__Group__4
            {
            pushFollow(FOLLOW_rule__AssemblyItem__Group__3__Impl_in_rule__AssemblyItem__Group__34175);
            rule__AssemblyItem__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssemblyItem__Group__4_in_rule__AssemblyItem__Group__34178);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2099:1: rule__AssemblyItem__Group__3__Impl : ( ( rule__AssemblyItem__YUnitsAssignment_3 ) ) ;
    public final void rule__AssemblyItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2103:1: ( ( ( rule__AssemblyItem__YUnitsAssignment_3 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2104:1: ( ( rule__AssemblyItem__YUnitsAssignment_3 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2104:1: ( ( rule__AssemblyItem__YUnitsAssignment_3 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2105:1: ( rule__AssemblyItem__YUnitsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getYUnitsAssignment_3()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2106:1: ( rule__AssemblyItem__YUnitsAssignment_3 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2106:2: rule__AssemblyItem__YUnitsAssignment_3
            {
            pushFollow(FOLLOW_rule__AssemblyItem__YUnitsAssignment_3_in_rule__AssemblyItem__Group__3__Impl4205);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2116:1: rule__AssemblyItem__Group__4 : rule__AssemblyItem__Group__4__Impl ;
    public final void rule__AssemblyItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2120:1: ( rule__AssemblyItem__Group__4__Impl )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2121:2: rule__AssemblyItem__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AssemblyItem__Group__4__Impl_in_rule__AssemblyItem__Group__44235);
            rule__AssemblyItem__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2127:1: rule__AssemblyItem__Group__4__Impl : ( ( rule__AssemblyItem__ZUnitsAssignment_4 ) ) ;
    public final void rule__AssemblyItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2131:1: ( ( ( rule__AssemblyItem__ZUnitsAssignment_4 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2132:1: ( ( rule__AssemblyItem__ZUnitsAssignment_4 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2132:1: ( ( rule__AssemblyItem__ZUnitsAssignment_4 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2133:1: ( rule__AssemblyItem__ZUnitsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getZUnitsAssignment_4()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2134:1: ( rule__AssemblyItem__ZUnitsAssignment_4 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2134:2: rule__AssemblyItem__ZUnitsAssignment_4
            {
            pushFollow(FOLLOW_rule__AssemblyItem__ZUnitsAssignment_4_in_rule__AssemblyItem__Group__4__Impl4262);
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


    // $ANTLR start "rule__Model__RepoAssignment_0"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2155:1: rule__Model__RepoAssignment_0 : ( ruleItemRepository ) ;
    public final void rule__Model__RepoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2159:1: ( ( ruleItemRepository ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2160:1: ( ruleItemRepository )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2160:1: ( ruleItemRepository )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2161:1: ruleItemRepository
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRepoItemRepositoryParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleItemRepository_in_rule__Model__RepoAssignment_04307);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2170:1: rule__Model__AssemblyAssignment_1 : ( ruleAssembly ) ;
    public final void rule__Model__AssemblyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2174:1: ( ( ruleAssembly ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2175:1: ( ruleAssembly )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2175:1: ( ruleAssembly )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2176:1: ruleAssembly
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getAssemblyAssemblyParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleAssembly_in_rule__Model__AssemblyAssignment_14338);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2185:1: rule__ItemRepository__NameAssignment_0 : ( ruleValidID ) ;
    public final void rule__ItemRepository__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2189:1: ( ( ruleValidID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2190:1: ( ruleValidID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2190:1: ( ruleValidID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2191:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getNameValidIDParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__ItemRepository__NameAssignment_04369);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2200:1: rule__ItemRepository__ElementListAssignment_2 : ( ruleItem ) ;
    public final void rule__ItemRepository__ElementListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2204:1: ( ( ruleItem ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2205:1: ( ruleItem )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2205:1: ( ruleItem )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2206:1: ruleItem
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemRepositoryAccess().getElementListItemParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleItem_in_rule__ItemRepository__ElementListAssignment_24400);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2215:1: rule__Color__RAssignment_1 : ( RULE_INT ) ;
    public final void rule__Color__RAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2219:1: ( ( RULE_INT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2220:1: ( RULE_INT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2220:1: ( RULE_INT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2221:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getRINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Color__RAssignment_14431); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2230:1: rule__Color__GAssignment_2 : ( RULE_INT ) ;
    public final void rule__Color__GAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2234:1: ( ( RULE_INT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2235:1: ( RULE_INT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2235:1: ( RULE_INT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2236:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getGINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Color__GAssignment_24462); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2245:1: rule__Color__BAssignment_3 : ( RULE_INT ) ;
    public final void rule__Color__BAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2249:1: ( ( RULE_INT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2250:1: ( RULE_INT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2250:1: ( RULE_INT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2251:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getBINTTerminalRuleCall_3_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Color__BAssignment_34493); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2260:1: rule__XUnit__UnitsAssignment : ( RULE_INT ) ;
    public final void rule__XUnit__UnitsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2264:1: ( ( RULE_INT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2265:1: ( RULE_INT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2265:1: ( RULE_INT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2266:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXUnitAccess().getUnitsINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__XUnit__UnitsAssignment4524); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2275:1: rule__YUnit__UnitsAssignment : ( RULE_INT ) ;
    public final void rule__YUnit__UnitsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2279:1: ( ( RULE_INT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2280:1: ( RULE_INT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2280:1: ( RULE_INT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2281:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYUnitAccess().getUnitsINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__YUnit__UnitsAssignment4555); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2290:1: rule__ZUnit__UnitsAssignment : ( RULE_INT ) ;
    public final void rule__ZUnit__UnitsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2294:1: ( ( RULE_INT ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2295:1: ( RULE_INT )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2295:1: ( RULE_INT )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2296:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getZUnitAccess().getUnitsINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ZUnit__UnitsAssignment4586); if (state.failed) return ;
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2305:1: rule__Brick__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__Brick__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2309:1: ( ( ruleValidID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2310:1: ( ruleValidID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2310:1: ( ruleValidID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2311:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__Brick__NameAssignment_14617);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2320:1: rule__Brick__XUnitsAssignment_3 : ( ruleXUnit ) ;
    public final void rule__Brick__XUnitsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2324:1: ( ( ruleXUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2325:1: ( ruleXUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2325:1: ( ruleXUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2326:1: ruleXUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getXUnitsXUnitParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleXUnit_in_rule__Brick__XUnitsAssignment_34648);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2335:1: rule__Brick__YUnitsAssignment_4 : ( ruleYUnit ) ;
    public final void rule__Brick__YUnitsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2339:1: ( ( ruleYUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2340:1: ( ruleYUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2340:1: ( ruleYUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2341:1: ruleYUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getYUnitsYUnitParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleYUnit_in_rule__Brick__YUnitsAssignment_44679);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2350:1: rule__Brick__ZUnitsAssignment_5 : ( ruleZUnit ) ;
    public final void rule__Brick__ZUnitsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2354:1: ( ( ruleZUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2355:1: ( ruleZUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2355:1: ( ruleZUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2356:1: ruleZUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getZUnitsZUnitParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleZUnit_in_rule__Brick__ZUnitsAssignment_54710);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2365:1: rule__Brick__FillAssignment_6 : ( ruleColor ) ;
    public final void rule__Brick__FillAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2369:1: ( ( ruleColor ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2370:1: ( ruleColor )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2370:1: ( ruleColor )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2371:1: ruleColor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrickAccess().getFillColorParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleColor_in_rule__Brick__FillAssignment_64741);
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


    // $ANTLR start "rule__RoundBrick__RoundAssignment_1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2380:1: rule__RoundBrick__RoundAssignment_1 : ( ( rule__RoundBrick__RoundAlternatives_1_0 ) ) ;
    public final void rule__RoundBrick__RoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2384:1: ( ( ( rule__RoundBrick__RoundAlternatives_1_0 ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2385:1: ( ( rule__RoundBrick__RoundAlternatives_1_0 ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2385:1: ( ( rule__RoundBrick__RoundAlternatives_1_0 ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2386:1: ( rule__RoundBrick__RoundAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoundBrickAccess().getRoundAlternatives_1_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2387:1: ( rule__RoundBrick__RoundAlternatives_1_0 )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2387:2: rule__RoundBrick__RoundAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__RoundBrick__RoundAlternatives_1_0_in_rule__RoundBrick__RoundAssignment_14772);
            rule__RoundBrick__RoundAlternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoundBrickAccess().getRoundAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundBrick__RoundAssignment_1"


    // $ANTLR start "rule__RoundBrick__NameAssignment_2"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2396:1: rule__RoundBrick__NameAssignment_2 : ( ruleValidID ) ;
    public final void rule__RoundBrick__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2400:1: ( ( ruleValidID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2401:1: ( ruleValidID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2401:1: ( ruleValidID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2402:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoundBrickAccess().getNameValidIDParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__RoundBrick__NameAssignment_24805);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoundBrickAccess().getNameValidIDParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundBrick__NameAssignment_2"


    // $ANTLR start "rule__RoundBrick__XUnitsAssignment_4"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2411:1: rule__RoundBrick__XUnitsAssignment_4 : ( ruleXUnit ) ;
    public final void rule__RoundBrick__XUnitsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2415:1: ( ( ruleXUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2416:1: ( ruleXUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2416:1: ( ruleXUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2417:1: ruleXUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoundBrickAccess().getXUnitsXUnitParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleXUnit_in_rule__RoundBrick__XUnitsAssignment_44836);
            ruleXUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoundBrickAccess().getXUnitsXUnitParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundBrick__XUnitsAssignment_4"


    // $ANTLR start "rule__RoundBrick__YUnitsAssignment_5"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2426:1: rule__RoundBrick__YUnitsAssignment_5 : ( ruleYUnit ) ;
    public final void rule__RoundBrick__YUnitsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2430:1: ( ( ruleYUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2431:1: ( ruleYUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2431:1: ( ruleYUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2432:1: ruleYUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoundBrickAccess().getYUnitsYUnitParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleYUnit_in_rule__RoundBrick__YUnitsAssignment_54867);
            ruleYUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoundBrickAccess().getYUnitsYUnitParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundBrick__YUnitsAssignment_5"


    // $ANTLR start "rule__RoundBrick__ZUnitsAssignment_6"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2441:1: rule__RoundBrick__ZUnitsAssignment_6 : ( ruleZUnit ) ;
    public final void rule__RoundBrick__ZUnitsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2445:1: ( ( ruleZUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2446:1: ( ruleZUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2446:1: ( ruleZUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2447:1: ruleZUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoundBrickAccess().getZUnitsZUnitParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleZUnit_in_rule__RoundBrick__ZUnitsAssignment_64898);
            ruleZUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoundBrickAccess().getZUnitsZUnitParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundBrick__ZUnitsAssignment_6"


    // $ANTLR start "rule__RoundBrick__FillAssignment_7"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2456:1: rule__RoundBrick__FillAssignment_7 : ( ruleColor ) ;
    public final void rule__RoundBrick__FillAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2460:1: ( ( ruleColor ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2461:1: ( ruleColor )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2461:1: ( ruleColor )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2462:1: ruleColor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoundBrickAccess().getFillColorParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleColor_in_rule__RoundBrick__FillAssignment_74929);
            ruleColor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoundBrickAccess().getFillColorParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundBrick__FillAssignment_7"


    // $ANTLR start "rule__DoorBrick__NameAssignment_1"
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2471:1: rule__DoorBrick__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__DoorBrick__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2475:1: ( ( ruleValidID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2476:1: ( ruleValidID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2476:1: ( ruleValidID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2477:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorBrickAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__DoorBrick__NameAssignment_14960);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2486:1: rule__DoorBrick__XUnitsAssignment_3 : ( ruleXUnit ) ;
    public final void rule__DoorBrick__XUnitsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2490:1: ( ( ruleXUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2491:1: ( ruleXUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2491:1: ( ruleXUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2492:1: ruleXUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorBrickAccess().getXUnitsXUnitParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleXUnit_in_rule__DoorBrick__XUnitsAssignment_34991);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2501:1: rule__DoorBrick__YUnitsAssignment_4 : ( ruleYUnit ) ;
    public final void rule__DoorBrick__YUnitsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2505:1: ( ( ruleYUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2506:1: ( ruleYUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2506:1: ( ruleYUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2507:1: ruleYUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorBrickAccess().getYUnitsYUnitParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleYUnit_in_rule__DoorBrick__YUnitsAssignment_45022);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2516:1: rule__DoorBrick__ZUnitsAssignment_5 : ( ruleZUnit ) ;
    public final void rule__DoorBrick__ZUnitsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2520:1: ( ( ruleZUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2521:1: ( ruleZUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2521:1: ( ruleZUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2522:1: ruleZUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorBrickAccess().getZUnitsZUnitParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleZUnit_in_rule__DoorBrick__ZUnitsAssignment_55053);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2531:1: rule__DoorBrick__FillAssignment_6 : ( ruleColor ) ;
    public final void rule__DoorBrick__FillAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2535:1: ( ( ruleColor ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2536:1: ( ruleColor )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2536:1: ( ruleColor )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2537:1: ruleColor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorBrickAccess().getFillColorParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleColor_in_rule__DoorBrick__FillAssignment_65084);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2546:1: rule__Door__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__Door__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2550:1: ( ( ruleValidID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2551:1: ( ruleValidID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2551:1: ( ruleValidID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2552:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__Door__NameAssignment_15115);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2561:1: rule__Door__XUnitsAssignment_3 : ( ruleXUnit ) ;
    public final void rule__Door__XUnitsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2565:1: ( ( ruleXUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2566:1: ( ruleXUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2566:1: ( ruleXUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2567:1: ruleXUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorAccess().getXUnitsXUnitParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleXUnit_in_rule__Door__XUnitsAssignment_35146);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2576:1: rule__Door__YUnitsAssignment_4 : ( ruleYUnit ) ;
    public final void rule__Door__YUnitsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2580:1: ( ( ruleYUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2581:1: ( ruleYUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2581:1: ( ruleYUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2582:1: ruleYUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorAccess().getYUnitsYUnitParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleYUnit_in_rule__Door__YUnitsAssignment_45177);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2591:1: rule__Door__FillAssignment_5 : ( ruleColor ) ;
    public final void rule__Door__FillAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2595:1: ( ( ruleColor ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2596:1: ( ruleColor )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2596:1: ( ruleColor )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2597:1: ruleColor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoorAccess().getFillColorParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleColor_in_rule__Door__FillAssignment_55208);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2606:1: rule__Assembly__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__Assembly__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2610:1: ( ( ruleValidID ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2611:1: ( ruleValidID )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2611:1: ( ruleValidID )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2612:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__Assembly__NameAssignment_15239);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2621:1: rule__Assembly__ItemsAssignment_3 : ( ruleAssemblyItem ) ;
    public final void rule__Assembly__ItemsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2625:1: ( ( ruleAssemblyItem ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2626:1: ( ruleAssemblyItem )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2626:1: ( ruleAssemblyItem )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2627:1: ruleAssemblyItem
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyAccess().getItemsAssemblyItemParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleAssemblyItem_in_rule__Assembly__ItemsAssignment_35270);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2636:1: rule__AssemblyItem__ElementAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__AssemblyItem__ElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2640:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2641:1: ( ( ruleQualifiedName ) )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2641:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2642:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getElementLegoElementCrossReference_0_0()); 
            }
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2643:1: ( ruleQualifiedName )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2644:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getElementLegoElementQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__AssemblyItem__ElementAssignment_05305);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2655:1: rule__AssemblyItem__XUnitsAssignment_2 : ( ruleXUnit ) ;
    public final void rule__AssemblyItem__XUnitsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2659:1: ( ( ruleXUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2660:1: ( ruleXUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2660:1: ( ruleXUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2661:1: ruleXUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getXUnitsXUnitParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleXUnit_in_rule__AssemblyItem__XUnitsAssignment_25340);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2670:1: rule__AssemblyItem__YUnitsAssignment_3 : ( ruleYUnit ) ;
    public final void rule__AssemblyItem__YUnitsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2674:1: ( ( ruleYUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2675:1: ( ruleYUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2675:1: ( ruleYUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2676:1: ruleYUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getYUnitsYUnitParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleYUnit_in_rule__AssemblyItem__YUnitsAssignment_35371);
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
    // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2685:1: rule__AssemblyItem__ZUnitsAssignment_4 : ( ruleZUnit ) ;
    public final void rule__AssemblyItem__ZUnitsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2689:1: ( ( ruleZUnit ) )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2690:1: ( ruleZUnit )
            {
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2690:1: ( ruleZUnit )
            // ../at.bestsolution.lego.ui/src-gen/at/bestsolution/lego/ui/contentassist/antlr/internal/InternalLego.g:2691:1: ruleZUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssemblyItemAccess().getZUnitsZUnitParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleZUnit_in_rule__AssemblyItem__ZUnitsAssignment_45402);
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
    public static final BitSet FOLLOW_ruleRoundBrick_in_entryRuleRoundBrick668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRoundBrick675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoundBrick__Group__0_in_ruleRoundBrick701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoorBrick_in_entryRuleDoorBrick728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoorBrick735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoorBrick__Group__0_in_ruleDoorBrick761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoor_in_entryRuleDoor788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoor795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Door__Group__0_in_ruleDoor821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssembly_in_entryRuleAssembly848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssembly855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assembly__Group__0_in_ruleAssembly881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssemblyItem_in_entryRuleAssemblyItem908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssemblyItem915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group__0_in_ruleAssemblyItem941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__RepoAssignment_0_in_rule__Model__Alternatives977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__AssemblyAssignment_1_in_rule__Model__Alternatives995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrick_in_rule__Item__Alternatives1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoundBrick_in_rule__Item__Alternatives1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoorBrick_in_rule__Item__Alternatives1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoor_in_rule__Item__Alternatives1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__RoundBrick__RoundAlternatives_1_01113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RoundBrick__RoundAlternatives_1_01133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01165 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1251 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01286 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__QualifiedName__Group_1__0__Impl1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__0__Impl_in_rule__ItemRepository__Group__01410 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__1_in_rule__ItemRepository__Group__01413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemRepository__NameAssignment_0_in_rule__ItemRepository__Group__0__Impl1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__1__Impl_in_rule__ItemRepository__Group__11470 = new BitSet(new long[]{0x00000000003A0000L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__2_in_rule__ItemRepository__Group__11473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ItemRepository__Group__1__Impl1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__2__Impl_in_rule__ItemRepository__Group__21532 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__3_in_rule__ItemRepository__Group__21535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemRepository__ElementListAssignment_2_in_rule__ItemRepository__Group__2__Impl1564 = new BitSet(new long[]{0x00000000003A0002L});
    public static final BitSet FOLLOW_rule__ItemRepository__ElementListAssignment_2_in_rule__ItemRepository__Group__2__Impl1576 = new BitSet(new long[]{0x00000000003A0002L});
    public static final BitSet FOLLOW_rule__ItemRepository__Group__3__Impl_in_rule__ItemRepository__Group__31609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ItemRepository__Group__3__Impl1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group__0__Impl_in_rule__Color__Group__01676 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Color__Group__1_in_rule__Color__Group__01679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Color__Group__0__Impl1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group__1__Impl_in_rule__Color__Group__11738 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Color__Group__2_in_rule__Color__Group__11741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__RAssignment_1_in_rule__Color__Group__1__Impl1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group__2__Impl_in_rule__Color__Group__21798 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Color__Group__3_in_rule__Color__Group__21801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__GAssignment_2_in_rule__Color__Group__2__Impl1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group__3__Impl_in_rule__Color__Group__31858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__BAssignment_3_in_rule__Color__Group__3__Impl1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__0__Impl_in_rule__Brick__Group__01923 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Brick__Group__1_in_rule__Brick__Group__01926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Brick__Group__0__Impl1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__1__Impl_in_rule__Brick__Group__11985 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Brick__Group__2_in_rule__Brick__Group__11988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__NameAssignment_1_in_rule__Brick__Group__1__Impl2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__2__Impl_in_rule__Brick__Group__22045 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Brick__Group__3_in_rule__Brick__Group__22048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Brick__Group__2__Impl2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__3__Impl_in_rule__Brick__Group__32107 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Brick__Group__4_in_rule__Brick__Group__32110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__XUnitsAssignment_3_in_rule__Brick__Group__3__Impl2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__4__Impl_in_rule__Brick__Group__42167 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Brick__Group__5_in_rule__Brick__Group__42170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__YUnitsAssignment_4_in_rule__Brick__Group__4__Impl2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__5__Impl_in_rule__Brick__Group__52227 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Brick__Group__6_in_rule__Brick__Group__52230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__ZUnitsAssignment_5_in_rule__Brick__Group__5__Impl2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__Group__6__Impl_in_rule__Brick__Group__62287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Brick__FillAssignment_6_in_rule__Brick__Group__6__Impl2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoundBrick__Group__0__Impl_in_rule__RoundBrick__Group__02358 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__RoundBrick__Group__1_in_rule__RoundBrick__Group__02361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RoundBrick__Group__0__Impl2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoundBrick__Group__1__Impl_in_rule__RoundBrick__Group__12420 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RoundBrick__Group__2_in_rule__RoundBrick__Group__12423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoundBrick__RoundAssignment_1_in_rule__RoundBrick__Group__1__Impl2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoundBrick__Group__2__Impl_in_rule__RoundBrick__Group__22480 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__RoundBrick__Group__3_in_rule__RoundBrick__Group__22483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoundBrick__NameAssignment_2_in_rule__RoundBrick__Group__2__Impl2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoundBrick__Group__3__Impl_in_rule__RoundBrick__Group__32540 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RoundBrick__Group__4_in_rule__RoundBrick__Group__32543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__RoundBrick__Group__3__Impl2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoundBrick__Group__4__Impl_in_rule__RoundBrick__Group__42602 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RoundBrick__Group__5_in_rule__RoundBrick__Group__42605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoundBrick__XUnitsAssignment_4_in_rule__RoundBrick__Group__4__Impl2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoundBrick__Group__5__Impl_in_rule__RoundBrick__Group__52662 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RoundBrick__Group__6_in_rule__RoundBrick__Group__52665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoundBrick__YUnitsAssignment_5_in_rule__RoundBrick__Group__5__Impl2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoundBrick__Group__6__Impl_in_rule__RoundBrick__Group__62722 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__RoundBrick__Group__7_in_rule__RoundBrick__Group__62725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoundBrick__ZUnitsAssignment_6_in_rule__RoundBrick__Group__6__Impl2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoundBrick__Group__7__Impl_in_rule__RoundBrick__Group__72782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoundBrick__FillAssignment_7_in_rule__RoundBrick__Group__7__Impl2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoorBrick__Group__0__Impl_in_rule__DoorBrick__Group__02855 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DoorBrick__Group__1_in_rule__DoorBrick__Group__02858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__DoorBrick__Group__0__Impl2886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoorBrick__Group__1__Impl_in_rule__DoorBrick__Group__12917 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__DoorBrick__Group__2_in_rule__DoorBrick__Group__12920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoorBrick__NameAssignment_1_in_rule__DoorBrick__Group__1__Impl2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoorBrick__Group__2__Impl_in_rule__DoorBrick__Group__22977 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DoorBrick__Group__3_in_rule__DoorBrick__Group__22980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DoorBrick__Group__2__Impl3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoorBrick__Group__3__Impl_in_rule__DoorBrick__Group__33039 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DoorBrick__Group__4_in_rule__DoorBrick__Group__33042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoorBrick__XUnitsAssignment_3_in_rule__DoorBrick__Group__3__Impl3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoorBrick__Group__4__Impl_in_rule__DoorBrick__Group__43099 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DoorBrick__Group__5_in_rule__DoorBrick__Group__43102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoorBrick__YUnitsAssignment_4_in_rule__DoorBrick__Group__4__Impl3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoorBrick__Group__5__Impl_in_rule__DoorBrick__Group__53159 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__DoorBrick__Group__6_in_rule__DoorBrick__Group__53162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoorBrick__ZUnitsAssignment_5_in_rule__DoorBrick__Group__5__Impl3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoorBrick__Group__6__Impl_in_rule__DoorBrick__Group__63219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoorBrick__FillAssignment_6_in_rule__DoorBrick__Group__6__Impl3246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Door__Group__0__Impl_in_rule__Door__Group__03290 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Door__Group__1_in_rule__Door__Group__03293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Door__Group__0__Impl3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Door__Group__1__Impl_in_rule__Door__Group__13352 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Door__Group__2_in_rule__Door__Group__13355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Door__NameAssignment_1_in_rule__Door__Group__1__Impl3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Door__Group__2__Impl_in_rule__Door__Group__23412 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Door__Group__3_in_rule__Door__Group__23415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Door__Group__2__Impl3443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Door__Group__3__Impl_in_rule__Door__Group__33474 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Door__Group__4_in_rule__Door__Group__33477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Door__XUnitsAssignment_3_in_rule__Door__Group__3__Impl3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Door__Group__4__Impl_in_rule__Door__Group__43534 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Door__Group__5_in_rule__Door__Group__43537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Door__YUnitsAssignment_4_in_rule__Door__Group__4__Impl3564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Door__Group__5__Impl_in_rule__Door__Group__53594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Door__FillAssignment_5_in_rule__Door__Group__5__Impl3621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assembly__Group__0__Impl_in_rule__Assembly__Group__03663 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Assembly__Group__1_in_rule__Assembly__Group__03666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Assembly__Group__0__Impl3694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assembly__Group__1__Impl_in_rule__Assembly__Group__13725 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Assembly__Group__2_in_rule__Assembly__Group__13728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assembly__NameAssignment_1_in_rule__Assembly__Group__1__Impl3755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assembly__Group__2__Impl_in_rule__Assembly__Group__23785 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Assembly__Group__3_in_rule__Assembly__Group__23788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Assembly__Group__2__Impl3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assembly__Group__3__Impl_in_rule__Assembly__Group__33847 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Assembly__Group__4_in_rule__Assembly__Group__33850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assembly__ItemsAssignment_3_in_rule__Assembly__Group__3__Impl3879 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Assembly__ItemsAssignment_3_in_rule__Assembly__Group__3__Impl3891 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Assembly__Group__4__Impl_in_rule__Assembly__Group__43924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Assembly__Group__4__Impl3952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group__0__Impl_in_rule__AssemblyItem__Group__03993 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group__1_in_rule__AssemblyItem__Group__03996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__ElementAssignment_0_in_rule__AssemblyItem__Group__0__Impl4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group__1__Impl_in_rule__AssemblyItem__Group__14053 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group__2_in_rule__AssemblyItem__Group__14056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__AssemblyItem__Group__1__Impl4084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group__2__Impl_in_rule__AssemblyItem__Group__24115 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group__3_in_rule__AssemblyItem__Group__24118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__XUnitsAssignment_2_in_rule__AssemblyItem__Group__2__Impl4145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group__3__Impl_in_rule__AssemblyItem__Group__34175 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group__4_in_rule__AssemblyItem__Group__34178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__YUnitsAssignment_3_in_rule__AssemblyItem__Group__3__Impl4205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__Group__4__Impl_in_rule__AssemblyItem__Group__44235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssemblyItem__ZUnitsAssignment_4_in_rule__AssemblyItem__Group__4__Impl4262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemRepository_in_rule__Model__RepoAssignment_04307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssembly_in_rule__Model__AssemblyAssignment_14338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__ItemRepository__NameAssignment_04369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_rule__ItemRepository__ElementListAssignment_24400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Color__RAssignment_14431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Color__GAssignment_24462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Color__BAssignment_34493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__XUnit__UnitsAssignment4524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__YUnit__UnitsAssignment4555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ZUnit__UnitsAssignment4586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__Brick__NameAssignment_14617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnit_in_rule__Brick__XUnitsAssignment_34648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYUnit_in_rule__Brick__YUnitsAssignment_44679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZUnit_in_rule__Brick__ZUnitsAssignment_54710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__Brick__FillAssignment_64741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoundBrick__RoundAlternatives_1_0_in_rule__RoundBrick__RoundAssignment_14772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__RoundBrick__NameAssignment_24805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnit_in_rule__RoundBrick__XUnitsAssignment_44836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYUnit_in_rule__RoundBrick__YUnitsAssignment_54867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZUnit_in_rule__RoundBrick__ZUnitsAssignment_64898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__RoundBrick__FillAssignment_74929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__DoorBrick__NameAssignment_14960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnit_in_rule__DoorBrick__XUnitsAssignment_34991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYUnit_in_rule__DoorBrick__YUnitsAssignment_45022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZUnit_in_rule__DoorBrick__ZUnitsAssignment_55053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__DoorBrick__FillAssignment_65084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__Door__NameAssignment_15115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnit_in_rule__Door__XUnitsAssignment_35146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYUnit_in_rule__Door__YUnitsAssignment_45177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__Door__FillAssignment_55208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__Assembly__NameAssignment_15239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssemblyItem_in_rule__Assembly__ItemsAssignment_35270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__AssemblyItem__ElementAssignment_05305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnit_in_rule__AssemblyItem__XUnitsAssignment_25340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYUnit_in_rule__AssemblyItem__YUnitsAssignment_35371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZUnit_in_rule__AssemblyItem__ZUnitsAssignment_45402 = new BitSet(new long[]{0x0000000000000002L});

}