package at.bestsolution.lego.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.bestsolution.lego.services.LegoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalLegoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'{'", "'}'", "'rgb'", "'brick'", "'units'", "'generated'", "'fxml'", "'origin'", "'rbrick'", "'dbrick'", "'door'", "'assembly'", "'pos'", "'transform'", "'rotate180'", "'rotate90'", "'rotate270'"
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
    public String getGrammarFileName() { return "../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g"; }



     	private LegoGrammarAccess grammarAccess;
     	
        public InternalLegoParser(TokenStream input, LegoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected LegoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:69:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_repo_0_0= ruleItemRepository ) ) | ( (lv_assembly_1_0= ruleAssembly ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_repo_0_0 = null;

        EObject lv_assembly_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:79:28: ( ( ( (lv_repo_0_0= ruleItemRepository ) ) | ( (lv_assembly_1_0= ruleAssembly ) ) ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:80:1: ( ( (lv_repo_0_0= ruleItemRepository ) ) | ( (lv_assembly_1_0= ruleAssembly ) ) )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:80:1: ( ( (lv_repo_0_0= ruleItemRepository ) ) | ( (lv_assembly_1_0= ruleAssembly ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==24) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:80:2: ( (lv_repo_0_0= ruleItemRepository ) )
                    {
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:80:2: ( (lv_repo_0_0= ruleItemRepository ) )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:81:1: (lv_repo_0_0= ruleItemRepository )
                    {
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:81:1: (lv_repo_0_0= ruleItemRepository )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:82:3: lv_repo_0_0= ruleItemRepository
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModelAccess().getRepoItemRepositoryParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleItemRepository_in_ruleModel131);
                    lv_repo_0_0=ruleItemRepository();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getModelRule());
                      	        }
                             		set(
                             			current, 
                             			"repo",
                              		lv_repo_0_0, 
                              		"ItemRepository");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:99:6: ( (lv_assembly_1_0= ruleAssembly ) )
                    {
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:99:6: ( (lv_assembly_1_0= ruleAssembly ) )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:100:1: (lv_assembly_1_0= ruleAssembly )
                    {
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:100:1: (lv_assembly_1_0= ruleAssembly )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:101:3: lv_assembly_1_0= ruleAssembly
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModelAccess().getAssemblyAssemblyParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAssembly_in_ruleModel158);
                    lv_assembly_1_0=ruleAssembly();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getModelRule());
                      	        }
                             		set(
                             			current, 
                             			"assembly",
                              		lv_assembly_1_0, 
                              		"Assembly");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleValidID"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:125:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:126:2: (iv_ruleValidID= ruleValidID EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:127:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID195);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID206); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:134:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:137:28: (this_ID_0= RULE_ID )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:138:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID245); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleQualifiedName"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:153:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:154:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:155:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName290);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName301); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:162:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:165:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:166:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:166:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:167:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName348);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:177:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) && (synpred1_InternalLego())) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:177:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:177:2: ( ( '.' )=>kw= '.' )
            	    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:177:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,12,FOLLOW_12_in_ruleQualifiedName376); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName399);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleItemRepository"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:204:1: entryRuleItemRepository returns [EObject current=null] : iv_ruleItemRepository= ruleItemRepository EOF ;
    public final EObject entryRuleItemRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemRepository = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:205:2: (iv_ruleItemRepository= ruleItemRepository EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:206:2: iv_ruleItemRepository= ruleItemRepository EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getItemRepositoryRule()); 
            }
            pushFollow(FOLLOW_ruleItemRepository_in_entryRuleItemRepository446);
            iv_ruleItemRepository=ruleItemRepository();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleItemRepository; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleItemRepository456); if (state.failed) return current;

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
    // $ANTLR end "entryRuleItemRepository"


    // $ANTLR start "ruleItemRepository"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:213:1: ruleItemRepository returns [EObject current=null] : ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '{' ( (lv_elementList_2_0= ruleItem ) )+ otherlv_3= '}' ) ;
    public final EObject ruleItemRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_elementList_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:216:28: ( ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '{' ( (lv_elementList_2_0= ruleItem ) )+ otherlv_3= '}' ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:217:1: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '{' ( (lv_elementList_2_0= ruleItem ) )+ otherlv_3= '}' )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:217:1: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '{' ( (lv_elementList_2_0= ruleItem ) )+ otherlv_3= '}' )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:217:2: ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '{' ( (lv_elementList_2_0= ruleItem ) )+ otherlv_3= '}'
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:217:2: ( (lv_name_0_0= ruleValidID ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:218:1: (lv_name_0_0= ruleValidID )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:218:1: (lv_name_0_0= ruleValidID )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:219:3: lv_name_0_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getItemRepositoryAccess().getNameValidIDParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleItemRepository502);
            lv_name_0_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getItemRepositoryRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleItemRepository514); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getItemRepositoryAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:239:1: ( (lv_elementList_2_0= ruleItem ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16||(LA3_0>=21 && LA3_0<=23)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:240:1: (lv_elementList_2_0= ruleItem )
            	    {
            	    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:240:1: (lv_elementList_2_0= ruleItem )
            	    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:241:3: lv_elementList_2_0= ruleItem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getItemRepositoryAccess().getElementListItemParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleItem_in_ruleItemRepository535);
            	    lv_elementList_2_0=ruleItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getItemRepositoryRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elementList",
            	              		lv_elementList_2_0, 
            	              		"Item");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleItemRepository548); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getItemRepositoryAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleItemRepository"


    // $ANTLR start "entryRuleItem"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:271:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:272:2: (iv_ruleItem= ruleItem EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:273:2: iv_ruleItem= ruleItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getItemRule()); 
            }
            pushFollow(FOLLOW_ruleItem_in_entryRuleItem586);
            iv_ruleItem=ruleItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleItem596); if (state.failed) return current;

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
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:280:1: ruleItem returns [EObject current=null] : (this_Brick_0= ruleBrick | this_RoundBrick_1= ruleRoundBrick | this_DoorBrick_2= ruleDoorBrick | this_Door_3= ruleDoor ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        EObject this_Brick_0 = null;

        EObject this_RoundBrick_1 = null;

        EObject this_DoorBrick_2 = null;

        EObject this_Door_3 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:283:28: ( (this_Brick_0= ruleBrick | this_RoundBrick_1= ruleRoundBrick | this_DoorBrick_2= ruleDoorBrick | this_Door_3= ruleDoor ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:284:1: (this_Brick_0= ruleBrick | this_RoundBrick_1= ruleRoundBrick | this_DoorBrick_2= ruleDoorBrick | this_Door_3= ruleDoor )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:284:1: (this_Brick_0= ruleBrick | this_RoundBrick_1= ruleRoundBrick | this_DoorBrick_2= ruleDoorBrick | this_Door_3= ruleDoor )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 21:
                {
                alt4=2;
                }
                break;
            case 22:
                {
                alt4=3;
                }
                break;
            case 23:
                {
                alt4=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:285:5: this_Brick_0= ruleBrick
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getItemAccess().getBrickParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBrick_in_ruleItem643);
                    this_Brick_0=ruleBrick();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Brick_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:295:5: this_RoundBrick_1= ruleRoundBrick
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getItemAccess().getRoundBrickParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRoundBrick_in_ruleItem670);
                    this_RoundBrick_1=ruleRoundBrick();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RoundBrick_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:305:5: this_DoorBrick_2= ruleDoorBrick
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getItemAccess().getDoorBrickParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDoorBrick_in_ruleItem697);
                    this_DoorBrick_2=ruleDoorBrick();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DoorBrick_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:315:5: this_Door_3= ruleDoor
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getItemAccess().getDoorParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDoor_in_ruleItem724);
                    this_Door_3=ruleDoor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Door_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleColor"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:331:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:332:2: (iv_ruleColor= ruleColor EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:333:2: iv_ruleColor= ruleColor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColorRule()); 
            }
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor759);
            iv_ruleColor=ruleColor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor769); if (state.failed) return current;

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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:340:1: ruleColor returns [EObject current=null] : (otherlv_0= 'rgb' ( (lv_r_1_0= RULE_INT ) ) ( (lv_g_2_0= RULE_INT ) ) ( (lv_b_3_0= RULE_INT ) ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_r_1_0=null;
        Token lv_g_2_0=null;
        Token lv_b_3_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:343:28: ( (otherlv_0= 'rgb' ( (lv_r_1_0= RULE_INT ) ) ( (lv_g_2_0= RULE_INT ) ) ( (lv_b_3_0= RULE_INT ) ) ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:344:1: (otherlv_0= 'rgb' ( (lv_r_1_0= RULE_INT ) ) ( (lv_g_2_0= RULE_INT ) ) ( (lv_b_3_0= RULE_INT ) ) )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:344:1: (otherlv_0= 'rgb' ( (lv_r_1_0= RULE_INT ) ) ( (lv_g_2_0= RULE_INT ) ) ( (lv_b_3_0= RULE_INT ) ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:344:3: otherlv_0= 'rgb' ( (lv_r_1_0= RULE_INT ) ) ( (lv_g_2_0= RULE_INT ) ) ( (lv_b_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleColor806); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getColorAccess().getRgbKeyword_0());
                  
            }
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:348:1: ( (lv_r_1_0= RULE_INT ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:349:1: (lv_r_1_0= RULE_INT )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:349:1: (lv_r_1_0= RULE_INT )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:350:3: lv_r_1_0= RULE_INT
            {
            lv_r_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleColor823); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_r_1_0, grammarAccess.getColorAccess().getRINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getColorRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"r",
                      		lv_r_1_0, 
                      		"INT");
              	    
            }

            }


            }

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:366:2: ( (lv_g_2_0= RULE_INT ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:367:1: (lv_g_2_0= RULE_INT )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:367:1: (lv_g_2_0= RULE_INT )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:368:3: lv_g_2_0= RULE_INT
            {
            lv_g_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleColor845); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_g_2_0, grammarAccess.getColorAccess().getGINTTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getColorRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"g",
                      		lv_g_2_0, 
                      		"INT");
              	    
            }

            }


            }

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:384:2: ( (lv_b_3_0= RULE_INT ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:385:1: (lv_b_3_0= RULE_INT )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:385:1: (lv_b_3_0= RULE_INT )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:386:3: lv_b_3_0= RULE_INT
            {
            lv_b_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleColor867); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_b_3_0, grammarAccess.getColorAccess().getBINTTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getColorRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"b",
                      		lv_b_3_0, 
                      		"INT");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleXUnit"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:410:1: entryRuleXUnit returns [EObject current=null] : iv_ruleXUnit= ruleXUnit EOF ;
    public final EObject entryRuleXUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnit = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:411:2: (iv_ruleXUnit= ruleXUnit EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:412:2: iv_ruleXUnit= ruleXUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnitRule()); 
            }
            pushFollow(FOLLOW_ruleXUnit_in_entryRuleXUnit908);
            iv_ruleXUnit=ruleXUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnit918); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXUnit"


    // $ANTLR start "ruleXUnit"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:419:1: ruleXUnit returns [EObject current=null] : ( (lv_units_0_0= RULE_INT ) ) ;
    public final EObject ruleXUnit() throws RecognitionException {
        EObject current = null;

        Token lv_units_0_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:422:28: ( ( (lv_units_0_0= RULE_INT ) ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:423:1: ( (lv_units_0_0= RULE_INT ) )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:423:1: ( (lv_units_0_0= RULE_INT ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:424:1: (lv_units_0_0= RULE_INT )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:424:1: (lv_units_0_0= RULE_INT )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:425:3: lv_units_0_0= RULE_INT
            {
            lv_units_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXUnit959); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_units_0_0, grammarAccess.getXUnitAccess().getUnitsINTTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXUnitRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"units",
                      		lv_units_0_0, 
                      		"INT");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXUnit"


    // $ANTLR start "entryRuleYUnit"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:449:1: entryRuleYUnit returns [EObject current=null] : iv_ruleYUnit= ruleYUnit EOF ;
    public final EObject entryRuleYUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYUnit = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:450:2: (iv_ruleYUnit= ruleYUnit EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:451:2: iv_ruleYUnit= ruleYUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYUnitRule()); 
            }
            pushFollow(FOLLOW_ruleYUnit_in_entryRuleYUnit999);
            iv_ruleYUnit=ruleYUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYUnit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleYUnit1009); if (state.failed) return current;

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
    // $ANTLR end "entryRuleYUnit"


    // $ANTLR start "ruleYUnit"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:458:1: ruleYUnit returns [EObject current=null] : ( (lv_units_0_0= RULE_INT ) ) ;
    public final EObject ruleYUnit() throws RecognitionException {
        EObject current = null;

        Token lv_units_0_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:461:28: ( ( (lv_units_0_0= RULE_INT ) ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:462:1: ( (lv_units_0_0= RULE_INT ) )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:462:1: ( (lv_units_0_0= RULE_INT ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:463:1: (lv_units_0_0= RULE_INT )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:463:1: (lv_units_0_0= RULE_INT )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:464:3: lv_units_0_0= RULE_INT
            {
            lv_units_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleYUnit1050); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_units_0_0, grammarAccess.getYUnitAccess().getUnitsINTTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getYUnitRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"units",
                      		lv_units_0_0, 
                      		"INT");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleYUnit"


    // $ANTLR start "entryRuleZUnit"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:488:1: entryRuleZUnit returns [EObject current=null] : iv_ruleZUnit= ruleZUnit EOF ;
    public final EObject entryRuleZUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleZUnit = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:489:2: (iv_ruleZUnit= ruleZUnit EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:490:2: iv_ruleZUnit= ruleZUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getZUnitRule()); 
            }
            pushFollow(FOLLOW_ruleZUnit_in_entryRuleZUnit1090);
            iv_ruleZUnit=ruleZUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleZUnit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleZUnit1100); if (state.failed) return current;

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
    // $ANTLR end "entryRuleZUnit"


    // $ANTLR start "ruleZUnit"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:497:1: ruleZUnit returns [EObject current=null] : ( (lv_units_0_0= RULE_INT ) ) ;
    public final EObject ruleZUnit() throws RecognitionException {
        EObject current = null;

        Token lv_units_0_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:500:28: ( ( (lv_units_0_0= RULE_INT ) ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:501:1: ( (lv_units_0_0= RULE_INT ) )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:501:1: ( (lv_units_0_0= RULE_INT ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:502:1: (lv_units_0_0= RULE_INT )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:502:1: (lv_units_0_0= RULE_INT )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:503:3: lv_units_0_0= RULE_INT
            {
            lv_units_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleZUnit1141); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_units_0_0, grammarAccess.getZUnitAccess().getUnitsINTTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getZUnitRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"units",
                      		lv_units_0_0, 
                      		"INT");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleZUnit"


    // $ANTLR start "entryRuleBrick"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:527:1: entryRuleBrick returns [EObject current=null] : iv_ruleBrick= ruleBrick EOF ;
    public final EObject entryRuleBrick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrick = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:528:2: (iv_ruleBrick= ruleBrick EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:529:2: iv_ruleBrick= ruleBrick EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBrickRule()); 
            }
            pushFollow(FOLLOW_ruleBrick_in_entryRuleBrick1181);
            iv_ruleBrick=ruleBrick();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBrick; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBrick1191); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBrick"


    // $ANTLR start "ruleBrick"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:536:1: ruleBrick returns [EObject current=null] : (otherlv_0= 'brick' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= 'units' ( (lv_xUnits_3_0= ruleXUnit ) ) ( (lv_yUnits_4_0= ruleYUnit ) ) ( (lv_zUnits_5_0= ruleZUnit ) ) ( (lv_fill_6_0= ruleColor ) ) ( (lv_source_7_0= ruleSource ) ) ) ;
    public final EObject ruleBrick() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_xUnits_3_0 = null;

        EObject lv_yUnits_4_0 = null;

        EObject lv_zUnits_5_0 = null;

        EObject lv_fill_6_0 = null;

        EObject lv_source_7_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:539:28: ( (otherlv_0= 'brick' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= 'units' ( (lv_xUnits_3_0= ruleXUnit ) ) ( (lv_yUnits_4_0= ruleYUnit ) ) ( (lv_zUnits_5_0= ruleZUnit ) ) ( (lv_fill_6_0= ruleColor ) ) ( (lv_source_7_0= ruleSource ) ) ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:540:1: (otherlv_0= 'brick' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= 'units' ( (lv_xUnits_3_0= ruleXUnit ) ) ( (lv_yUnits_4_0= ruleYUnit ) ) ( (lv_zUnits_5_0= ruleZUnit ) ) ( (lv_fill_6_0= ruleColor ) ) ( (lv_source_7_0= ruleSource ) ) )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:540:1: (otherlv_0= 'brick' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= 'units' ( (lv_xUnits_3_0= ruleXUnit ) ) ( (lv_yUnits_4_0= ruleYUnit ) ) ( (lv_zUnits_5_0= ruleZUnit ) ) ( (lv_fill_6_0= ruleColor ) ) ( (lv_source_7_0= ruleSource ) ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:540:3: otherlv_0= 'brick' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= 'units' ( (lv_xUnits_3_0= ruleXUnit ) ) ( (lv_yUnits_4_0= ruleYUnit ) ) ( (lv_zUnits_5_0= ruleZUnit ) ) ( (lv_fill_6_0= ruleColor ) ) ( (lv_source_7_0= ruleSource ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleBrick1228); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBrickAccess().getBrickKeyword_0());
                  
            }
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:544:1: ( (lv_name_1_0= ruleValidID ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:545:1: (lv_name_1_0= ruleValidID )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:545:1: (lv_name_1_0= ruleValidID )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:546:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBrickAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleBrick1249);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBrickRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleBrick1261); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBrickAccess().getUnitsKeyword_2());
                  
            }
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:566:1: ( (lv_xUnits_3_0= ruleXUnit ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:567:1: (lv_xUnits_3_0= ruleXUnit )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:567:1: (lv_xUnits_3_0= ruleXUnit )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:568:3: lv_xUnits_3_0= ruleXUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBrickAccess().getXUnitsXUnitParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXUnit_in_ruleBrick1282);
            lv_xUnits_3_0=ruleXUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBrickRule());
              	        }
                     		set(
                     			current, 
                     			"xUnits",
                      		lv_xUnits_3_0, 
                      		"XUnit");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:584:2: ( (lv_yUnits_4_0= ruleYUnit ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:585:1: (lv_yUnits_4_0= ruleYUnit )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:585:1: (lv_yUnits_4_0= ruleYUnit )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:586:3: lv_yUnits_4_0= ruleYUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBrickAccess().getYUnitsYUnitParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleYUnit_in_ruleBrick1303);
            lv_yUnits_4_0=ruleYUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBrickRule());
              	        }
                     		set(
                     			current, 
                     			"yUnits",
                      		lv_yUnits_4_0, 
                      		"YUnit");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:602:2: ( (lv_zUnits_5_0= ruleZUnit ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:603:1: (lv_zUnits_5_0= ruleZUnit )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:603:1: (lv_zUnits_5_0= ruleZUnit )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:604:3: lv_zUnits_5_0= ruleZUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBrickAccess().getZUnitsZUnitParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleZUnit_in_ruleBrick1324);
            lv_zUnits_5_0=ruleZUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBrickRule());
              	        }
                     		set(
                     			current, 
                     			"zUnits",
                      		lv_zUnits_5_0, 
                      		"ZUnit");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:620:2: ( (lv_fill_6_0= ruleColor ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:621:1: (lv_fill_6_0= ruleColor )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:621:1: (lv_fill_6_0= ruleColor )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:622:3: lv_fill_6_0= ruleColor
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBrickAccess().getFillColorParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColor_in_ruleBrick1345);
            lv_fill_6_0=ruleColor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBrickRule());
              	        }
                     		set(
                     			current, 
                     			"fill",
                      		lv_fill_6_0, 
                      		"Color");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:638:2: ( (lv_source_7_0= ruleSource ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:639:1: (lv_source_7_0= ruleSource )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:639:1: (lv_source_7_0= ruleSource )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:640:3: lv_source_7_0= ruleSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBrickAccess().getSourceSourceParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSource_in_ruleBrick1366);
            lv_source_7_0=ruleSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBrickRule());
              	        }
                     		set(
                     			current, 
                     			"source",
                      		lv_source_7_0, 
                      		"Source");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBrick"


    // $ANTLR start "entryRuleSource"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:664:1: entryRuleSource returns [EObject current=null] : iv_ruleSource= ruleSource EOF ;
    public final EObject entryRuleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSource = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:665:2: (iv_ruleSource= ruleSource EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:666:2: iv_ruleSource= ruleSource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSourceRule()); 
            }
            pushFollow(FOLLOW_ruleSource_in_entryRuleSource1402);
            iv_ruleSource=ruleSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSource; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSource1412); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSource"


    // $ANTLR start "ruleSource"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:673:1: ruleSource returns [EObject current=null] : ( ruleGenerated | this_FxmlInclude_1= ruleFxmlInclude ) ;
    public final EObject ruleSource() throws RecognitionException {
        EObject current = null;

        EObject this_FxmlInclude_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:676:28: ( ( ruleGenerated | this_FxmlInclude_1= ruleFxmlInclude ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:677:1: ( ruleGenerated | this_FxmlInclude_1= ruleFxmlInclude )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:677:1: ( ruleGenerated | this_FxmlInclude_1= ruleFxmlInclude )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:678:5: ruleGenerated
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSourceAccess().getGeneratedParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGenerated_in_ruleSource1453);
                    ruleGenerated();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:687:5: this_FxmlInclude_1= ruleFxmlInclude
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSourceAccess().getFxmlIncludeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFxmlInclude_in_ruleSource1480);
                    this_FxmlInclude_1=ruleFxmlInclude();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FxmlInclude_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSource"


    // $ANTLR start "entryRuleGenerated"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:703:1: entryRuleGenerated returns [String current=null] : iv_ruleGenerated= ruleGenerated EOF ;
    public final String entryRuleGenerated() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGenerated = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:704:2: (iv_ruleGenerated= ruleGenerated EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:705:2: iv_ruleGenerated= ruleGenerated EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGeneratedRule()); 
            }
            pushFollow(FOLLOW_ruleGenerated_in_entryRuleGenerated1516);
            iv_ruleGenerated=ruleGenerated();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGenerated.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenerated1527); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGenerated"


    // $ANTLR start "ruleGenerated"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:712:1: ruleGenerated returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'generated' ;
    public final AntlrDatatypeRuleToken ruleGenerated() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:715:28: (kw= 'generated' )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:717:2: kw= 'generated'
            {
            kw=(Token)match(input,18,FOLLOW_18_in_ruleGenerated1564); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getGeneratedAccess().getGeneratedKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGenerated"


    // $ANTLR start "entryRuleFxmlInclude"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:730:1: entryRuleFxmlInclude returns [EObject current=null] : iv_ruleFxmlInclude= ruleFxmlInclude EOF ;
    public final EObject entryRuleFxmlInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFxmlInclude = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:731:2: (iv_ruleFxmlInclude= ruleFxmlInclude EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:732:2: iv_ruleFxmlInclude= ruleFxmlInclude EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFxmlIncludeRule()); 
            }
            pushFollow(FOLLOW_ruleFxmlInclude_in_entryRuleFxmlInclude1603);
            iv_ruleFxmlInclude=ruleFxmlInclude();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFxmlInclude; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFxmlInclude1613); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFxmlInclude"


    // $ANTLR start "ruleFxmlInclude"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:739:1: ruleFxmlInclude returns [EObject current=null] : (otherlv_0= 'fxml' ( (lv_source_1_0= RULE_STRING ) ) (otherlv_2= 'origin' ( (lv_originX_3_0= RULE_FLOAT ) ) ( (lv_originY_4_0= RULE_FLOAT ) ) ( (lv_originZ_5_0= RULE_FLOAT ) ) )? ) ;
    public final EObject ruleFxmlInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_source_1_0=null;
        Token otherlv_2=null;
        Token lv_originX_3_0=null;
        Token lv_originY_4_0=null;
        Token lv_originZ_5_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:742:28: ( (otherlv_0= 'fxml' ( (lv_source_1_0= RULE_STRING ) ) (otherlv_2= 'origin' ( (lv_originX_3_0= RULE_FLOAT ) ) ( (lv_originY_4_0= RULE_FLOAT ) ) ( (lv_originZ_5_0= RULE_FLOAT ) ) )? ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:743:1: (otherlv_0= 'fxml' ( (lv_source_1_0= RULE_STRING ) ) (otherlv_2= 'origin' ( (lv_originX_3_0= RULE_FLOAT ) ) ( (lv_originY_4_0= RULE_FLOAT ) ) ( (lv_originZ_5_0= RULE_FLOAT ) ) )? )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:743:1: (otherlv_0= 'fxml' ( (lv_source_1_0= RULE_STRING ) ) (otherlv_2= 'origin' ( (lv_originX_3_0= RULE_FLOAT ) ) ( (lv_originY_4_0= RULE_FLOAT ) ) ( (lv_originZ_5_0= RULE_FLOAT ) ) )? )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:743:3: otherlv_0= 'fxml' ( (lv_source_1_0= RULE_STRING ) ) (otherlv_2= 'origin' ( (lv_originX_3_0= RULE_FLOAT ) ) ( (lv_originY_4_0= RULE_FLOAT ) ) ( (lv_originZ_5_0= RULE_FLOAT ) ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleFxmlInclude1650); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFxmlIncludeAccess().getFxmlKeyword_0());
                  
            }
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:747:1: ( (lv_source_1_0= RULE_STRING ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:748:1: (lv_source_1_0= RULE_STRING )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:748:1: (lv_source_1_0= RULE_STRING )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:749:3: lv_source_1_0= RULE_STRING
            {
            lv_source_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFxmlInclude1667); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_source_1_0, grammarAccess.getFxmlIncludeAccess().getSourceSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFxmlIncludeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"source",
                      		lv_source_1_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:765:2: (otherlv_2= 'origin' ( (lv_originX_3_0= RULE_FLOAT ) ) ( (lv_originY_4_0= RULE_FLOAT ) ) ( (lv_originZ_5_0= RULE_FLOAT ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:765:4: otherlv_2= 'origin' ( (lv_originX_3_0= RULE_FLOAT ) ) ( (lv_originY_4_0= RULE_FLOAT ) ) ( (lv_originZ_5_0= RULE_FLOAT ) )
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleFxmlInclude1685); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFxmlIncludeAccess().getOriginKeyword_2_0());
                          
                    }
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:769:1: ( (lv_originX_3_0= RULE_FLOAT ) )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:770:1: (lv_originX_3_0= RULE_FLOAT )
                    {
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:770:1: (lv_originX_3_0= RULE_FLOAT )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:771:3: lv_originX_3_0= RULE_FLOAT
                    {
                    lv_originX_3_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFxmlInclude1702); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_originX_3_0, grammarAccess.getFxmlIncludeAccess().getOriginXFLOATTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFxmlIncludeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"originX",
                              		lv_originX_3_0, 
                              		"FLOAT");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:787:2: ( (lv_originY_4_0= RULE_FLOAT ) )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:788:1: (lv_originY_4_0= RULE_FLOAT )
                    {
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:788:1: (lv_originY_4_0= RULE_FLOAT )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:789:3: lv_originY_4_0= RULE_FLOAT
                    {
                    lv_originY_4_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFxmlInclude1724); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_originY_4_0, grammarAccess.getFxmlIncludeAccess().getOriginYFLOATTerminalRuleCall_2_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFxmlIncludeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"originY",
                              		lv_originY_4_0, 
                              		"FLOAT");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:805:2: ( (lv_originZ_5_0= RULE_FLOAT ) )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:806:1: (lv_originZ_5_0= RULE_FLOAT )
                    {
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:806:1: (lv_originZ_5_0= RULE_FLOAT )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:807:3: lv_originZ_5_0= RULE_FLOAT
                    {
                    lv_originZ_5_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFxmlInclude1746); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_originZ_5_0, grammarAccess.getFxmlIncludeAccess().getOriginZFLOATTerminalRuleCall_2_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFxmlIncludeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"originZ",
                              		lv_originZ_5_0, 
                              		"FLOAT");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFxmlInclude"


    // $ANTLR start "entryRuleRoundBrick"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:831:1: entryRuleRoundBrick returns [EObject current=null] : iv_ruleRoundBrick= ruleRoundBrick EOF ;
    public final EObject entryRuleRoundBrick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoundBrick = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:832:2: (iv_ruleRoundBrick= ruleRoundBrick EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:833:2: iv_ruleRoundBrick= ruleRoundBrick EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRoundBrickRule()); 
            }
            pushFollow(FOLLOW_ruleRoundBrick_in_entryRuleRoundBrick1789);
            iv_ruleRoundBrick=ruleRoundBrick();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRoundBrick; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRoundBrick1799); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRoundBrick"


    // $ANTLR start "ruleRoundBrick"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:840:1: ruleRoundBrick returns [EObject current=null] : (otherlv_0= 'rbrick' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= 'units' ( (lv_xUnits_3_0= ruleXUnit ) ) ( (lv_yUnits_4_0= ruleYUnit ) ) ( (lv_zUnits_5_0= ruleZUnit ) ) ( (lv_fill_6_0= ruleColor ) ) ) ;
    public final EObject ruleRoundBrick() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_xUnits_3_0 = null;

        EObject lv_yUnits_4_0 = null;

        EObject lv_zUnits_5_0 = null;

        EObject lv_fill_6_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:843:28: ( (otherlv_0= 'rbrick' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= 'units' ( (lv_xUnits_3_0= ruleXUnit ) ) ( (lv_yUnits_4_0= ruleYUnit ) ) ( (lv_zUnits_5_0= ruleZUnit ) ) ( (lv_fill_6_0= ruleColor ) ) ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:844:1: (otherlv_0= 'rbrick' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= 'units' ( (lv_xUnits_3_0= ruleXUnit ) ) ( (lv_yUnits_4_0= ruleYUnit ) ) ( (lv_zUnits_5_0= ruleZUnit ) ) ( (lv_fill_6_0= ruleColor ) ) )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:844:1: (otherlv_0= 'rbrick' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= 'units' ( (lv_xUnits_3_0= ruleXUnit ) ) ( (lv_yUnits_4_0= ruleYUnit ) ) ( (lv_zUnits_5_0= ruleZUnit ) ) ( (lv_fill_6_0= ruleColor ) ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:844:3: otherlv_0= 'rbrick' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= 'units' ( (lv_xUnits_3_0= ruleXUnit ) ) ( (lv_yUnits_4_0= ruleYUnit ) ) ( (lv_zUnits_5_0= ruleZUnit ) ) ( (lv_fill_6_0= ruleColor ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleRoundBrick1836); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRoundBrickAccess().getRbrickKeyword_0());
                  
            }
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:848:1: ( (lv_name_1_0= ruleValidID ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:849:1: (lv_name_1_0= ruleValidID )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:849:1: (lv_name_1_0= ruleValidID )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:850:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRoundBrickAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleRoundBrick1857);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRoundBrickRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleRoundBrick1869); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRoundBrickAccess().getUnitsKeyword_2());
                  
            }
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:870:1: ( (lv_xUnits_3_0= ruleXUnit ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:871:1: (lv_xUnits_3_0= ruleXUnit )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:871:1: (lv_xUnits_3_0= ruleXUnit )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:872:3: lv_xUnits_3_0= ruleXUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRoundBrickAccess().getXUnitsXUnitParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXUnit_in_ruleRoundBrick1890);
            lv_xUnits_3_0=ruleXUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRoundBrickRule());
              	        }
                     		set(
                     			current, 
                     			"xUnits",
                      		lv_xUnits_3_0, 
                      		"XUnit");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:888:2: ( (lv_yUnits_4_0= ruleYUnit ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:889:1: (lv_yUnits_4_0= ruleYUnit )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:889:1: (lv_yUnits_4_0= ruleYUnit )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:890:3: lv_yUnits_4_0= ruleYUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRoundBrickAccess().getYUnitsYUnitParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleYUnit_in_ruleRoundBrick1911);
            lv_yUnits_4_0=ruleYUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRoundBrickRule());
              	        }
                     		set(
                     			current, 
                     			"yUnits",
                      		lv_yUnits_4_0, 
                      		"YUnit");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:906:2: ( (lv_zUnits_5_0= ruleZUnit ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:907:1: (lv_zUnits_5_0= ruleZUnit )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:907:1: (lv_zUnits_5_0= ruleZUnit )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:908:3: lv_zUnits_5_0= ruleZUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRoundBrickAccess().getZUnitsZUnitParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleZUnit_in_ruleRoundBrick1932);
            lv_zUnits_5_0=ruleZUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRoundBrickRule());
              	        }
                     		set(
                     			current, 
                     			"zUnits",
                      		lv_zUnits_5_0, 
                      		"ZUnit");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:924:2: ( (lv_fill_6_0= ruleColor ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:925:1: (lv_fill_6_0= ruleColor )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:925:1: (lv_fill_6_0= ruleColor )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:926:3: lv_fill_6_0= ruleColor
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRoundBrickAccess().getFillColorParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColor_in_ruleRoundBrick1953);
            lv_fill_6_0=ruleColor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRoundBrickRule());
              	        }
                     		set(
                     			current, 
                     			"fill",
                      		lv_fill_6_0, 
                      		"Color");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRoundBrick"


    // $ANTLR start "entryRuleDoorBrick"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:950:1: entryRuleDoorBrick returns [EObject current=null] : iv_ruleDoorBrick= ruleDoorBrick EOF ;
    public final EObject entryRuleDoorBrick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoorBrick = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:951:2: (iv_ruleDoorBrick= ruleDoorBrick EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:952:2: iv_ruleDoorBrick= ruleDoorBrick EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoorBrickRule()); 
            }
            pushFollow(FOLLOW_ruleDoorBrick_in_entryRuleDoorBrick1989);
            iv_ruleDoorBrick=ruleDoorBrick();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDoorBrick; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoorBrick1999); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDoorBrick"


    // $ANTLR start "ruleDoorBrick"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:959:1: ruleDoorBrick returns [EObject current=null] : (otherlv_0= 'dbrick' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= 'units' ( (lv_xUnits_3_0= ruleXUnit ) ) ( (lv_yUnits_4_0= ruleYUnit ) ) ( (lv_zUnits_5_0= ruleZUnit ) ) ( (lv_fill_6_0= ruleColor ) ) ) ;
    public final EObject ruleDoorBrick() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_xUnits_3_0 = null;

        EObject lv_yUnits_4_0 = null;

        EObject lv_zUnits_5_0 = null;

        EObject lv_fill_6_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:962:28: ( (otherlv_0= 'dbrick' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= 'units' ( (lv_xUnits_3_0= ruleXUnit ) ) ( (lv_yUnits_4_0= ruleYUnit ) ) ( (lv_zUnits_5_0= ruleZUnit ) ) ( (lv_fill_6_0= ruleColor ) ) ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:963:1: (otherlv_0= 'dbrick' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= 'units' ( (lv_xUnits_3_0= ruleXUnit ) ) ( (lv_yUnits_4_0= ruleYUnit ) ) ( (lv_zUnits_5_0= ruleZUnit ) ) ( (lv_fill_6_0= ruleColor ) ) )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:963:1: (otherlv_0= 'dbrick' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= 'units' ( (lv_xUnits_3_0= ruleXUnit ) ) ( (lv_yUnits_4_0= ruleYUnit ) ) ( (lv_zUnits_5_0= ruleZUnit ) ) ( (lv_fill_6_0= ruleColor ) ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:963:3: otherlv_0= 'dbrick' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= 'units' ( (lv_xUnits_3_0= ruleXUnit ) ) ( (lv_yUnits_4_0= ruleYUnit ) ) ( (lv_zUnits_5_0= ruleZUnit ) ) ( (lv_fill_6_0= ruleColor ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleDoorBrick2036); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDoorBrickAccess().getDbrickKeyword_0());
                  
            }
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:967:1: ( (lv_name_1_0= ruleValidID ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:968:1: (lv_name_1_0= ruleValidID )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:968:1: (lv_name_1_0= ruleValidID )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:969:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDoorBrickAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleDoorBrick2057);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDoorBrickRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleDoorBrick2069); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDoorBrickAccess().getUnitsKeyword_2());
                  
            }
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:989:1: ( (lv_xUnits_3_0= ruleXUnit ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:990:1: (lv_xUnits_3_0= ruleXUnit )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:990:1: (lv_xUnits_3_0= ruleXUnit )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:991:3: lv_xUnits_3_0= ruleXUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDoorBrickAccess().getXUnitsXUnitParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXUnit_in_ruleDoorBrick2090);
            lv_xUnits_3_0=ruleXUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDoorBrickRule());
              	        }
                     		set(
                     			current, 
                     			"xUnits",
                      		lv_xUnits_3_0, 
                      		"XUnit");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1007:2: ( (lv_yUnits_4_0= ruleYUnit ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1008:1: (lv_yUnits_4_0= ruleYUnit )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1008:1: (lv_yUnits_4_0= ruleYUnit )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1009:3: lv_yUnits_4_0= ruleYUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDoorBrickAccess().getYUnitsYUnitParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleYUnit_in_ruleDoorBrick2111);
            lv_yUnits_4_0=ruleYUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDoorBrickRule());
              	        }
                     		set(
                     			current, 
                     			"yUnits",
                      		lv_yUnits_4_0, 
                      		"YUnit");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1025:2: ( (lv_zUnits_5_0= ruleZUnit ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1026:1: (lv_zUnits_5_0= ruleZUnit )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1026:1: (lv_zUnits_5_0= ruleZUnit )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1027:3: lv_zUnits_5_0= ruleZUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDoorBrickAccess().getZUnitsZUnitParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleZUnit_in_ruleDoorBrick2132);
            lv_zUnits_5_0=ruleZUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDoorBrickRule());
              	        }
                     		set(
                     			current, 
                     			"zUnits",
                      		lv_zUnits_5_0, 
                      		"ZUnit");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1043:2: ( (lv_fill_6_0= ruleColor ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1044:1: (lv_fill_6_0= ruleColor )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1044:1: (lv_fill_6_0= ruleColor )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1045:3: lv_fill_6_0= ruleColor
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDoorBrickAccess().getFillColorParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColor_in_ruleDoorBrick2153);
            lv_fill_6_0=ruleColor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDoorBrickRule());
              	        }
                     		set(
                     			current, 
                     			"fill",
                      		lv_fill_6_0, 
                      		"Color");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDoorBrick"


    // $ANTLR start "entryRuleDoor"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1069:1: entryRuleDoor returns [EObject current=null] : iv_ruleDoor= ruleDoor EOF ;
    public final EObject entryRuleDoor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoor = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1070:2: (iv_ruleDoor= ruleDoor EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1071:2: iv_ruleDoor= ruleDoor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoorRule()); 
            }
            pushFollow(FOLLOW_ruleDoor_in_entryRuleDoor2189);
            iv_ruleDoor=ruleDoor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDoor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoor2199); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDoor"


    // $ANTLR start "ruleDoor"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1078:1: ruleDoor returns [EObject current=null] : (otherlv_0= 'door' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= 'units' ( (lv_xUnits_3_0= ruleXUnit ) ) ( (lv_yUnits_4_0= ruleYUnit ) ) ( (lv_fill_5_0= ruleColor ) ) ) ;
    public final EObject ruleDoor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_xUnits_3_0 = null;

        EObject lv_yUnits_4_0 = null;

        EObject lv_fill_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1081:28: ( (otherlv_0= 'door' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= 'units' ( (lv_xUnits_3_0= ruleXUnit ) ) ( (lv_yUnits_4_0= ruleYUnit ) ) ( (lv_fill_5_0= ruleColor ) ) ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1082:1: (otherlv_0= 'door' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= 'units' ( (lv_xUnits_3_0= ruleXUnit ) ) ( (lv_yUnits_4_0= ruleYUnit ) ) ( (lv_fill_5_0= ruleColor ) ) )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1082:1: (otherlv_0= 'door' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= 'units' ( (lv_xUnits_3_0= ruleXUnit ) ) ( (lv_yUnits_4_0= ruleYUnit ) ) ( (lv_fill_5_0= ruleColor ) ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1082:3: otherlv_0= 'door' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= 'units' ( (lv_xUnits_3_0= ruleXUnit ) ) ( (lv_yUnits_4_0= ruleYUnit ) ) ( (lv_fill_5_0= ruleColor ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleDoor2236); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDoorAccess().getDoorKeyword_0());
                  
            }
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1086:1: ( (lv_name_1_0= ruleValidID ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1087:1: (lv_name_1_0= ruleValidID )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1087:1: (lv_name_1_0= ruleValidID )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1088:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDoorAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleDoor2257);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDoorRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleDoor2269); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDoorAccess().getUnitsKeyword_2());
                  
            }
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1108:1: ( (lv_xUnits_3_0= ruleXUnit ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1109:1: (lv_xUnits_3_0= ruleXUnit )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1109:1: (lv_xUnits_3_0= ruleXUnit )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1110:3: lv_xUnits_3_0= ruleXUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDoorAccess().getXUnitsXUnitParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXUnit_in_ruleDoor2290);
            lv_xUnits_3_0=ruleXUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDoorRule());
              	        }
                     		set(
                     			current, 
                     			"xUnits",
                      		lv_xUnits_3_0, 
                      		"XUnit");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1126:2: ( (lv_yUnits_4_0= ruleYUnit ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1127:1: (lv_yUnits_4_0= ruleYUnit )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1127:1: (lv_yUnits_4_0= ruleYUnit )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1128:3: lv_yUnits_4_0= ruleYUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDoorAccess().getYUnitsYUnitParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleYUnit_in_ruleDoor2311);
            lv_yUnits_4_0=ruleYUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDoorRule());
              	        }
                     		set(
                     			current, 
                     			"yUnits",
                      		lv_yUnits_4_0, 
                      		"YUnit");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1144:2: ( (lv_fill_5_0= ruleColor ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1145:1: (lv_fill_5_0= ruleColor )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1145:1: (lv_fill_5_0= ruleColor )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1146:3: lv_fill_5_0= ruleColor
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDoorAccess().getFillColorParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColor_in_ruleDoor2332);
            lv_fill_5_0=ruleColor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDoorRule());
              	        }
                     		set(
                     			current, 
                     			"fill",
                      		lv_fill_5_0, 
                      		"Color");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDoor"


    // $ANTLR start "entryRuleAssembly"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1170:1: entryRuleAssembly returns [EObject current=null] : iv_ruleAssembly= ruleAssembly EOF ;
    public final EObject entryRuleAssembly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssembly = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1171:2: (iv_ruleAssembly= ruleAssembly EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1172:2: iv_ruleAssembly= ruleAssembly EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssemblyRule()); 
            }
            pushFollow(FOLLOW_ruleAssembly_in_entryRuleAssembly2368);
            iv_ruleAssembly=ruleAssembly();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssembly; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssembly2378); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssembly"


    // $ANTLR start "ruleAssembly"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1179:1: ruleAssembly returns [EObject current=null] : (otherlv_0= 'assembly' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (lv_items_3_0= ruleAssemblyItem ) )+ otherlv_4= '}' ) ;
    public final EObject ruleAssembly() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_items_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1182:28: ( (otherlv_0= 'assembly' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (lv_items_3_0= ruleAssemblyItem ) )+ otherlv_4= '}' ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1183:1: (otherlv_0= 'assembly' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (lv_items_3_0= ruleAssemblyItem ) )+ otherlv_4= '}' )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1183:1: (otherlv_0= 'assembly' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (lv_items_3_0= ruleAssemblyItem ) )+ otherlv_4= '}' )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1183:3: otherlv_0= 'assembly' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (lv_items_3_0= ruleAssemblyItem ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleAssembly2415); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAssemblyAccess().getAssemblyKeyword_0());
                  
            }
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1187:1: ( (lv_name_1_0= ruleValidID ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1188:1: (lv_name_1_0= ruleValidID )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1188:1: (lv_name_1_0= ruleValidID )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1189:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssemblyAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleAssembly2436);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssemblyRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleAssembly2448); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAssemblyAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1209:1: ( (lv_items_3_0= ruleAssemblyItem ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1210:1: (lv_items_3_0= ruleAssemblyItem )
            	    {
            	    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1210:1: (lv_items_3_0= ruleAssemblyItem )
            	    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1211:3: lv_items_3_0= ruleAssemblyItem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssemblyAccess().getItemsAssemblyItemParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssemblyItem_in_ruleAssembly2469);
            	    lv_items_3_0=ruleAssemblyItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAssemblyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"items",
            	              		lv_items_3_0, 
            	              		"AssemblyItem");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleAssembly2482); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAssemblyAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAssembly"


    // $ANTLR start "entryRuleAssemblyItem"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1239:1: entryRuleAssemblyItem returns [EObject current=null] : iv_ruleAssemblyItem= ruleAssemblyItem EOF ;
    public final EObject entryRuleAssemblyItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyItem = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1240:2: (iv_ruleAssemblyItem= ruleAssemblyItem EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1241:2: iv_ruleAssemblyItem= ruleAssemblyItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssemblyItemRule()); 
            }
            pushFollow(FOLLOW_ruleAssemblyItem_in_entryRuleAssemblyItem2518);
            iv_ruleAssemblyItem=ruleAssemblyItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssemblyItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssemblyItem2528); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssemblyItem"


    // $ANTLR start "ruleAssemblyItem"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1248:1: ruleAssemblyItem returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'pos' ( (lv_xUnits_2_0= ruleXUnit ) ) ( (lv_yUnits_3_0= ruleYUnit ) ) ( (lv_zUnits_4_0= ruleZUnit ) ) (otherlv_5= 'transform' ( ( (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' ) ) ) )? ) ;
    public final EObject ruleAssemblyItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        Token lv_transform_6_1=null;
        Token lv_transform_6_2=null;
        Token lv_transform_6_3=null;
        EObject lv_xUnits_2_0 = null;

        EObject lv_yUnits_3_0 = null;

        EObject lv_zUnits_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1251:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'pos' ( (lv_xUnits_2_0= ruleXUnit ) ) ( (lv_yUnits_3_0= ruleYUnit ) ) ( (lv_zUnits_4_0= ruleZUnit ) ) (otherlv_5= 'transform' ( ( (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' ) ) ) )? ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1252:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'pos' ( (lv_xUnits_2_0= ruleXUnit ) ) ( (lv_yUnits_3_0= ruleYUnit ) ) ( (lv_zUnits_4_0= ruleZUnit ) ) (otherlv_5= 'transform' ( ( (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' ) ) ) )? )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1252:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'pos' ( (lv_xUnits_2_0= ruleXUnit ) ) ( (lv_yUnits_3_0= ruleYUnit ) ) ( (lv_zUnits_4_0= ruleZUnit ) ) (otherlv_5= 'transform' ( ( (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' ) ) ) )? )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1252:2: ( ( ruleQualifiedName ) ) otherlv_1= 'pos' ( (lv_xUnits_2_0= ruleXUnit ) ) ( (lv_yUnits_3_0= ruleYUnit ) ) ( (lv_zUnits_4_0= ruleZUnit ) ) (otherlv_5= 'transform' ( ( (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' ) ) ) )?
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1252:2: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1253:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1253:1: ( ruleQualifiedName )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1254:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAssemblyItemRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssemblyItemAccess().getElementLegoElementCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAssemblyItem2576);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleAssemblyItem2588); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAssemblyItemAccess().getPosKeyword_1());
                  
            }
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1271:1: ( (lv_xUnits_2_0= ruleXUnit ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1272:1: (lv_xUnits_2_0= ruleXUnit )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1272:1: (lv_xUnits_2_0= ruleXUnit )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1273:3: lv_xUnits_2_0= ruleXUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssemblyItemAccess().getXUnitsXUnitParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXUnit_in_ruleAssemblyItem2609);
            lv_xUnits_2_0=ruleXUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssemblyItemRule());
              	        }
                     		set(
                     			current, 
                     			"xUnits",
                      		lv_xUnits_2_0, 
                      		"XUnit");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1289:2: ( (lv_yUnits_3_0= ruleYUnit ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1290:1: (lv_yUnits_3_0= ruleYUnit )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1290:1: (lv_yUnits_3_0= ruleYUnit )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1291:3: lv_yUnits_3_0= ruleYUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssemblyItemAccess().getYUnitsYUnitParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleYUnit_in_ruleAssemblyItem2630);
            lv_yUnits_3_0=ruleYUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssemblyItemRule());
              	        }
                     		set(
                     			current, 
                     			"yUnits",
                      		lv_yUnits_3_0, 
                      		"YUnit");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1307:2: ( (lv_zUnits_4_0= ruleZUnit ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1308:1: (lv_zUnits_4_0= ruleZUnit )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1308:1: (lv_zUnits_4_0= ruleZUnit )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1309:3: lv_zUnits_4_0= ruleZUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssemblyItemAccess().getZUnitsZUnitParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleZUnit_in_ruleAssemblyItem2651);
            lv_zUnits_4_0=ruleZUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssemblyItemRule());
              	        }
                     		set(
                     			current, 
                     			"zUnits",
                      		lv_zUnits_4_0, 
                      		"ZUnit");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1325:2: (otherlv_5= 'transform' ( ( (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' ) ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1325:4: otherlv_5= 'transform' ( ( (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' ) ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleAssemblyItem2664); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getAssemblyItemAccess().getTransformKeyword_5_0());
                          
                    }
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1329:1: ( ( (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' ) ) )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1330:1: ( (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' ) )
                    {
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1330:1: ( (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' ) )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1331:1: (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' )
                    {
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1331:1: (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' )
                    int alt8=3;
                    switch ( input.LA(1) ) {
                    case 27:
                        {
                        alt8=1;
                        }
                        break;
                    case 28:
                        {
                        alt8=2;
                        }
                        break;
                    case 29:
                        {
                        alt8=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }

                    switch (alt8) {
                        case 1 :
                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1332:3: lv_transform_6_1= 'rotate180'
                            {
                            lv_transform_6_1=(Token)match(input,27,FOLLOW_27_in_ruleAssemblyItem2684); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_transform_6_1, grammarAccess.getAssemblyItemAccess().getTransformRotate180Keyword_5_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAssemblyItemRule());
                              	        }
                                     		setWithLastConsumed(current, "transform", lv_transform_6_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1344:8: lv_transform_6_2= 'rotate90'
                            {
                            lv_transform_6_2=(Token)match(input,28,FOLLOW_28_in_ruleAssemblyItem2713); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_transform_6_2, grammarAccess.getAssemblyItemAccess().getTransformRotate90Keyword_5_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAssemblyItemRule());
                              	        }
                                     		setWithLastConsumed(current, "transform", lv_transform_6_2, null);
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1356:8: lv_transform_6_3= 'rotate270'
                            {
                            lv_transform_6_3=(Token)match(input,29,FOLLOW_29_in_ruleAssemblyItem2742); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_transform_6_3, grammarAccess.getAssemblyItemAccess().getTransformRotate270Keyword_5_1_0_2());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAssemblyItemRule());
                              	        }
                                     		setWithLastConsumed(current, "transform", lv_transform_6_3, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAssemblyItem"

    // $ANTLR start synpred1_InternalLego
    public final void synpred1_InternalLego_fragment() throws RecognitionException {   
        // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:177:3: ( '.' )
        // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:178:2: '.'
        {
        match(input,12,FOLLOW_12_in_synpred1_InternalLego367); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalLego

    // Delegated rules

    public final boolean synpred1_InternalLego() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalLego_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemRepository_in_ruleModel131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssembly_in_ruleModel158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName290 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName348 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleQualifiedName376 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName399 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleItemRepository_in_entryRuleItemRepository446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItemRepository456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleItemRepository502 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleItemRepository514 = new BitSet(new long[]{0x0000000000E10000L});
    public static final BitSet FOLLOW_ruleItem_in_ruleItemRepository535 = new BitSet(new long[]{0x0000000000E14000L});
    public static final BitSet FOLLOW_14_in_ruleItemRepository548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_entryRuleItem586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItem596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrick_in_ruleItem643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoundBrick_in_ruleItem670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoorBrick_in_ruleItem697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoor_in_ruleItem724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleColor806 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleColor823 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleColor845 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleColor867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnit_in_entryRuleXUnit908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnit918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXUnit959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYUnit_in_entryRuleYUnit999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleYUnit1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleYUnit1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZUnit_in_entryRuleZUnit1090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleZUnit1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleZUnit1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrick_in_entryRuleBrick1181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBrick1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleBrick1228 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleBrick1249 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleBrick1261 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleXUnit_in_ruleBrick1282 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleYUnit_in_ruleBrick1303 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleZUnit_in_ruleBrick1324 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleBrick1345 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_ruleSource_in_ruleBrick1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSource_in_entryRuleSource1402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSource1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerated_in_ruleSource1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFxmlInclude_in_ruleSource1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerated_in_entryRuleGenerated1516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenerated1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleGenerated1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFxmlInclude_in_entryRuleFxmlInclude1603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFxmlInclude1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleFxmlInclude1650 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFxmlInclude1667 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleFxmlInclude1685 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFxmlInclude1702 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFxmlInclude1724 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFxmlInclude1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoundBrick_in_entryRuleRoundBrick1789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRoundBrick1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleRoundBrick1836 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleRoundBrick1857 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRoundBrick1869 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleXUnit_in_ruleRoundBrick1890 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleYUnit_in_ruleRoundBrick1911 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleZUnit_in_ruleRoundBrick1932 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleRoundBrick1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoorBrick_in_entryRuleDoorBrick1989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoorBrick1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleDoorBrick2036 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleDoorBrick2057 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDoorBrick2069 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleXUnit_in_ruleDoorBrick2090 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleYUnit_in_ruleDoorBrick2111 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleZUnit_in_ruleDoorBrick2132 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleDoorBrick2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoor_in_entryRuleDoor2189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoor2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleDoor2236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleDoor2257 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDoor2269 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleXUnit_in_ruleDoor2290 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleYUnit_in_ruleDoor2311 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleDoor2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssembly_in_entryRuleAssembly2368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssembly2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleAssembly2415 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleAssembly2436 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAssembly2448 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAssemblyItem_in_ruleAssembly2469 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleAssembly2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssemblyItem_in_entryRuleAssemblyItem2518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssemblyItem2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAssemblyItem2576 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAssemblyItem2588 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleXUnit_in_ruleAssemblyItem2609 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleYUnit_in_ruleAssemblyItem2630 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleZUnit_in_ruleAssemblyItem2651 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleAssemblyItem2664 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_27_in_ruleAssemblyItem2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleAssemblyItem2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleAssemblyItem2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred1_InternalLego367 = new BitSet(new long[]{0x0000000000000002L});

}