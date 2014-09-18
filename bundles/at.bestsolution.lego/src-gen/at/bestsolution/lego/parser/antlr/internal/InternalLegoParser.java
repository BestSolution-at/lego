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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'{'", "'}'", "'mpart'", "'rgb'", "'brick'", "'units'", "'generated'", "'box'", "'origin'", "'fxml'", "'assembly'", "'pos'", "'transform'", "'rotate180'", "'rotate90'", "'rotate270'"
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
            else if ( (LA1_0==23) ) {
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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:213:1: ruleItemRepository returns [EObject current=null] : ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '{' ( (lv_elementList_2_0= ruleRepostoryItem ) )+ otherlv_3= '}' ) ;
    public final EObject ruleItemRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_elementList_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:216:28: ( ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '{' ( (lv_elementList_2_0= ruleRepostoryItem ) )+ otherlv_3= '}' ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:217:1: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '{' ( (lv_elementList_2_0= ruleRepostoryItem ) )+ otherlv_3= '}' )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:217:1: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '{' ( (lv_elementList_2_0= ruleRepostoryItem ) )+ otherlv_3= '}' )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:217:2: ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '{' ( (lv_elementList_2_0= ruleRepostoryItem ) )+ otherlv_3= '}'
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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:239:1: ( (lv_elementList_2_0= ruleRepostoryItem ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15||LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:240:1: (lv_elementList_2_0= ruleRepostoryItem )
            	    {
            	    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:240:1: (lv_elementList_2_0= ruleRepostoryItem )
            	    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:241:3: lv_elementList_2_0= ruleRepostoryItem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getItemRepositoryAccess().getElementListRepostoryItemParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRepostoryItem_in_ruleItemRepository535);
            	    lv_elementList_2_0=ruleRepostoryItem();

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
            	              		"RepostoryItem");
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


    // $ANTLR start "entryRuleMountedPart"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:273:1: entryRuleMountedPart returns [EObject current=null] : iv_ruleMountedPart= ruleMountedPart EOF ;
    public final EObject entryRuleMountedPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMountedPart = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:274:2: (iv_ruleMountedPart= ruleMountedPart EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:275:2: iv_ruleMountedPart= ruleMountedPart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMountedPartRule()); 
            }
            pushFollow(FOLLOW_ruleMountedPart_in_entryRuleMountedPart588);
            iv_ruleMountedPart=ruleMountedPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMountedPart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMountedPart598); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMountedPart"


    // $ANTLR start "ruleMountedPart"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:282:1: ruleMountedPart returns [EObject current=null] : (otherlv_0= 'mpart' ( (lv_name_1_0= ruleValidID ) ) ( (lv_fill_2_0= ruleColor ) ) ( (lv_source_3_0= ruleSource ) ) ) ;
    public final EObject ruleMountedPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_fill_2_0 = null;

        EObject lv_source_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:285:28: ( (otherlv_0= 'mpart' ( (lv_name_1_0= ruleValidID ) ) ( (lv_fill_2_0= ruleColor ) ) ( (lv_source_3_0= ruleSource ) ) ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:286:1: (otherlv_0= 'mpart' ( (lv_name_1_0= ruleValidID ) ) ( (lv_fill_2_0= ruleColor ) ) ( (lv_source_3_0= ruleSource ) ) )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:286:1: (otherlv_0= 'mpart' ( (lv_name_1_0= ruleValidID ) ) ( (lv_fill_2_0= ruleColor ) ) ( (lv_source_3_0= ruleSource ) ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:286:3: otherlv_0= 'mpart' ( (lv_name_1_0= ruleValidID ) ) ( (lv_fill_2_0= ruleColor ) ) ( (lv_source_3_0= ruleSource ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleMountedPart635); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMountedPartAccess().getMpartKeyword_0());
                  
            }
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:290:1: ( (lv_name_1_0= ruleValidID ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:291:1: (lv_name_1_0= ruleValidID )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:291:1: (lv_name_1_0= ruleValidID )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:292:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMountedPartAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleMountedPart656);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMountedPartRule());
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

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:308:2: ( (lv_fill_2_0= ruleColor ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:309:1: (lv_fill_2_0= ruleColor )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:309:1: (lv_fill_2_0= ruleColor )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:310:3: lv_fill_2_0= ruleColor
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMountedPartAccess().getFillColorParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColor_in_ruleMountedPart677);
            lv_fill_2_0=ruleColor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMountedPartRule());
              	        }
                     		set(
                     			current, 
                     			"fill",
                      		lv_fill_2_0, 
                      		"Color");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:326:2: ( (lv_source_3_0= ruleSource ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:327:1: (lv_source_3_0= ruleSource )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:327:1: (lv_source_3_0= ruleSource )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:328:3: lv_source_3_0= ruleSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMountedPartAccess().getSourceSourceParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSource_in_ruleMountedPart698);
            lv_source_3_0=ruleSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMountedPartRule());
              	        }
                     		set(
                     			current, 
                     			"source",
                      		lv_source_3_0, 
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
    // $ANTLR end "ruleMountedPart"


    // $ANTLR start "entryRuleRepostoryItem"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:352:1: entryRuleRepostoryItem returns [EObject current=null] : iv_ruleRepostoryItem= ruleRepostoryItem EOF ;
    public final EObject entryRuleRepostoryItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepostoryItem = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:353:2: (iv_ruleRepostoryItem= ruleRepostoryItem EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:354:2: iv_ruleRepostoryItem= ruleRepostoryItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRepostoryItemRule()); 
            }
            pushFollow(FOLLOW_ruleRepostoryItem_in_entryRuleRepostoryItem734);
            iv_ruleRepostoryItem=ruleRepostoryItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRepostoryItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepostoryItem744); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRepostoryItem"


    // $ANTLR start "ruleRepostoryItem"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:361:1: ruleRepostoryItem returns [EObject current=null] : (this_Brick_0= ruleBrick | this_MountedPart_1= ruleMountedPart ) ;
    public final EObject ruleRepostoryItem() throws RecognitionException {
        EObject current = null;

        EObject this_Brick_0 = null;

        EObject this_MountedPart_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:364:28: ( (this_Brick_0= ruleBrick | this_MountedPart_1= ruleMountedPart ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:365:1: (this_Brick_0= ruleBrick | this_MountedPart_1= ruleMountedPart )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:365:1: (this_Brick_0= ruleBrick | this_MountedPart_1= ruleMountedPart )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:366:5: this_Brick_0= ruleBrick
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRepostoryItemAccess().getBrickParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBrick_in_ruleRepostoryItem791);
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
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:376:5: this_MountedPart_1= ruleMountedPart
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRepostoryItemAccess().getMountedPartParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMountedPart_in_ruleRepostoryItem818);
                    this_MountedPart_1=ruleMountedPart();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MountedPart_1; 
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
    // $ANTLR end "ruleRepostoryItem"


    // $ANTLR start "entryRuleColor"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:392:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:393:2: (iv_ruleColor= ruleColor EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:394:2: iv_ruleColor= ruleColor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColorRule()); 
            }
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor853);
            iv_ruleColor=ruleColor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor863); if (state.failed) return current;

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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:401:1: ruleColor returns [EObject current=null] : (otherlv_0= 'rgb' ( (lv_r_1_0= RULE_INT ) ) ( (lv_g_2_0= RULE_INT ) ) ( (lv_b_3_0= RULE_INT ) ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_r_1_0=null;
        Token lv_g_2_0=null;
        Token lv_b_3_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:404:28: ( (otherlv_0= 'rgb' ( (lv_r_1_0= RULE_INT ) ) ( (lv_g_2_0= RULE_INT ) ) ( (lv_b_3_0= RULE_INT ) ) ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:405:1: (otherlv_0= 'rgb' ( (lv_r_1_0= RULE_INT ) ) ( (lv_g_2_0= RULE_INT ) ) ( (lv_b_3_0= RULE_INT ) ) )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:405:1: (otherlv_0= 'rgb' ( (lv_r_1_0= RULE_INT ) ) ( (lv_g_2_0= RULE_INT ) ) ( (lv_b_3_0= RULE_INT ) ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:405:3: otherlv_0= 'rgb' ( (lv_r_1_0= RULE_INT ) ) ( (lv_g_2_0= RULE_INT ) ) ( (lv_b_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleColor900); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getColorAccess().getRgbKeyword_0());
                  
            }
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:409:1: ( (lv_r_1_0= RULE_INT ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:410:1: (lv_r_1_0= RULE_INT )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:410:1: (lv_r_1_0= RULE_INT )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:411:3: lv_r_1_0= RULE_INT
            {
            lv_r_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleColor917); if (state.failed) return current;
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

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:427:2: ( (lv_g_2_0= RULE_INT ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:428:1: (lv_g_2_0= RULE_INT )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:428:1: (lv_g_2_0= RULE_INT )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:429:3: lv_g_2_0= RULE_INT
            {
            lv_g_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleColor939); if (state.failed) return current;
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

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:445:2: ( (lv_b_3_0= RULE_INT ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:446:1: (lv_b_3_0= RULE_INT )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:446:1: (lv_b_3_0= RULE_INT )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:447:3: lv_b_3_0= RULE_INT
            {
            lv_b_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleColor961); if (state.failed) return current;
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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:471:1: entryRuleXUnit returns [EObject current=null] : iv_ruleXUnit= ruleXUnit EOF ;
    public final EObject entryRuleXUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnit = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:472:2: (iv_ruleXUnit= ruleXUnit EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:473:2: iv_ruleXUnit= ruleXUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnitRule()); 
            }
            pushFollow(FOLLOW_ruleXUnit_in_entryRuleXUnit1002);
            iv_ruleXUnit=ruleXUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnit1012); if (state.failed) return current;

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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:480:1: ruleXUnit returns [EObject current=null] : ( (lv_units_0_0= RULE_INT ) ) ;
    public final EObject ruleXUnit() throws RecognitionException {
        EObject current = null;

        Token lv_units_0_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:483:28: ( ( (lv_units_0_0= RULE_INT ) ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:484:1: ( (lv_units_0_0= RULE_INT ) )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:484:1: ( (lv_units_0_0= RULE_INT ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:485:1: (lv_units_0_0= RULE_INT )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:485:1: (lv_units_0_0= RULE_INT )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:486:3: lv_units_0_0= RULE_INT
            {
            lv_units_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXUnit1053); if (state.failed) return current;
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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:510:1: entryRuleYUnit returns [EObject current=null] : iv_ruleYUnit= ruleYUnit EOF ;
    public final EObject entryRuleYUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYUnit = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:511:2: (iv_ruleYUnit= ruleYUnit EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:512:2: iv_ruleYUnit= ruleYUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYUnitRule()); 
            }
            pushFollow(FOLLOW_ruleYUnit_in_entryRuleYUnit1093);
            iv_ruleYUnit=ruleYUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYUnit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleYUnit1103); if (state.failed) return current;

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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:519:1: ruleYUnit returns [EObject current=null] : ( (lv_units_0_0= RULE_INT ) ) ;
    public final EObject ruleYUnit() throws RecognitionException {
        EObject current = null;

        Token lv_units_0_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:522:28: ( ( (lv_units_0_0= RULE_INT ) ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:523:1: ( (lv_units_0_0= RULE_INT ) )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:523:1: ( (lv_units_0_0= RULE_INT ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:524:1: (lv_units_0_0= RULE_INT )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:524:1: (lv_units_0_0= RULE_INT )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:525:3: lv_units_0_0= RULE_INT
            {
            lv_units_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleYUnit1144); if (state.failed) return current;
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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:549:1: entryRuleZUnit returns [EObject current=null] : iv_ruleZUnit= ruleZUnit EOF ;
    public final EObject entryRuleZUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleZUnit = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:550:2: (iv_ruleZUnit= ruleZUnit EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:551:2: iv_ruleZUnit= ruleZUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getZUnitRule()); 
            }
            pushFollow(FOLLOW_ruleZUnit_in_entryRuleZUnit1184);
            iv_ruleZUnit=ruleZUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleZUnit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleZUnit1194); if (state.failed) return current;

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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:558:1: ruleZUnit returns [EObject current=null] : ( (lv_units_0_0= RULE_INT ) ) ;
    public final EObject ruleZUnit() throws RecognitionException {
        EObject current = null;

        Token lv_units_0_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:561:28: ( ( (lv_units_0_0= RULE_INT ) ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:562:1: ( (lv_units_0_0= RULE_INT ) )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:562:1: ( (lv_units_0_0= RULE_INT ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:563:1: (lv_units_0_0= RULE_INT )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:563:1: (lv_units_0_0= RULE_INT )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:564:3: lv_units_0_0= RULE_INT
            {
            lv_units_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleZUnit1235); if (state.failed) return current;
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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:588:1: entryRuleBrick returns [EObject current=null] : iv_ruleBrick= ruleBrick EOF ;
    public final EObject entryRuleBrick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrick = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:589:2: (iv_ruleBrick= ruleBrick EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:590:2: iv_ruleBrick= ruleBrick EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBrickRule()); 
            }
            pushFollow(FOLLOW_ruleBrick_in_entryRuleBrick1275);
            iv_ruleBrick=ruleBrick();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBrick; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBrick1285); if (state.failed) return current;

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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:597:1: ruleBrick returns [EObject current=null] : (otherlv_0= 'brick' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= 'units' ( (lv_xUnits_3_0= ruleXUnit ) ) ( (lv_yUnits_4_0= ruleYUnit ) ) ( (lv_zUnits_5_0= ruleZUnit ) ) ( (lv_fill_6_0= ruleColor ) ) ( (lv_source_7_0= ruleSource ) ) ) ;
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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:600:28: ( (otherlv_0= 'brick' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= 'units' ( (lv_xUnits_3_0= ruleXUnit ) ) ( (lv_yUnits_4_0= ruleYUnit ) ) ( (lv_zUnits_5_0= ruleZUnit ) ) ( (lv_fill_6_0= ruleColor ) ) ( (lv_source_7_0= ruleSource ) ) ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:601:1: (otherlv_0= 'brick' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= 'units' ( (lv_xUnits_3_0= ruleXUnit ) ) ( (lv_yUnits_4_0= ruleYUnit ) ) ( (lv_zUnits_5_0= ruleZUnit ) ) ( (lv_fill_6_0= ruleColor ) ) ( (lv_source_7_0= ruleSource ) ) )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:601:1: (otherlv_0= 'brick' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= 'units' ( (lv_xUnits_3_0= ruleXUnit ) ) ( (lv_yUnits_4_0= ruleYUnit ) ) ( (lv_zUnits_5_0= ruleZUnit ) ) ( (lv_fill_6_0= ruleColor ) ) ( (lv_source_7_0= ruleSource ) ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:601:3: otherlv_0= 'brick' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= 'units' ( (lv_xUnits_3_0= ruleXUnit ) ) ( (lv_yUnits_4_0= ruleYUnit ) ) ( (lv_zUnits_5_0= ruleZUnit ) ) ( (lv_fill_6_0= ruleColor ) ) ( (lv_source_7_0= ruleSource ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleBrick1322); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBrickAccess().getBrickKeyword_0());
                  
            }
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:605:1: ( (lv_name_1_0= ruleValidID ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:606:1: (lv_name_1_0= ruleValidID )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:606:1: (lv_name_1_0= ruleValidID )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:607:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBrickAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleBrick1343);
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleBrick1355); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBrickAccess().getUnitsKeyword_2());
                  
            }
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:627:1: ( (lv_xUnits_3_0= ruleXUnit ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:628:1: (lv_xUnits_3_0= ruleXUnit )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:628:1: (lv_xUnits_3_0= ruleXUnit )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:629:3: lv_xUnits_3_0= ruleXUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBrickAccess().getXUnitsXUnitParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXUnit_in_ruleBrick1376);
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

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:645:2: ( (lv_yUnits_4_0= ruleYUnit ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:646:1: (lv_yUnits_4_0= ruleYUnit )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:646:1: (lv_yUnits_4_0= ruleYUnit )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:647:3: lv_yUnits_4_0= ruleYUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBrickAccess().getYUnitsYUnitParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleYUnit_in_ruleBrick1397);
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

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:663:2: ( (lv_zUnits_5_0= ruleZUnit ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:664:1: (lv_zUnits_5_0= ruleZUnit )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:664:1: (lv_zUnits_5_0= ruleZUnit )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:665:3: lv_zUnits_5_0= ruleZUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBrickAccess().getZUnitsZUnitParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleZUnit_in_ruleBrick1418);
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

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:681:2: ( (lv_fill_6_0= ruleColor ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:682:1: (lv_fill_6_0= ruleColor )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:682:1: (lv_fill_6_0= ruleColor )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:683:3: lv_fill_6_0= ruleColor
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBrickAccess().getFillColorParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColor_in_ruleBrick1439);
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

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:699:2: ( (lv_source_7_0= ruleSource ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:700:1: (lv_source_7_0= ruleSource )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:700:1: (lv_source_7_0= ruleSource )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:701:3: lv_source_7_0= ruleSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBrickAccess().getSourceSourceParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSource_in_ruleBrick1460);
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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:725:1: entryRuleSource returns [EObject current=null] : iv_ruleSource= ruleSource EOF ;
    public final EObject entryRuleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSource = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:726:2: (iv_ruleSource= ruleSource EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:727:2: iv_ruleSource= ruleSource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSourceRule()); 
            }
            pushFollow(FOLLOW_ruleSource_in_entryRuleSource1496);
            iv_ruleSource=ruleSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSource; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSource1506); if (state.failed) return current;

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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:734:1: ruleSource returns [EObject current=null] : (this_Generated_0= ruleGenerated | this_FxmlInclude_1= ruleFxmlInclude ) ;
    public final EObject ruleSource() throws RecognitionException {
        EObject current = null;

        EObject this_Generated_0 = null;

        EObject this_FxmlInclude_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:737:28: ( (this_Generated_0= ruleGenerated | this_FxmlInclude_1= ruleFxmlInclude ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:738:1: (this_Generated_0= ruleGenerated | this_FxmlInclude_1= ruleFxmlInclude )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:738:1: (this_Generated_0= ruleGenerated | this_FxmlInclude_1= ruleFxmlInclude )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            else if ( (LA5_0==22) ) {
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
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:739:5: this_Generated_0= ruleGenerated
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSourceAccess().getGeneratedParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGenerated_in_ruleSource1553);
                    this_Generated_0=ruleGenerated();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Generated_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:749:5: this_FxmlInclude_1= ruleFxmlInclude
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSourceAccess().getFxmlIncludeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFxmlInclude_in_ruleSource1580);
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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:765:1: entryRuleGenerated returns [EObject current=null] : iv_ruleGenerated= ruleGenerated EOF ;
    public final EObject entryRuleGenerated() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerated = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:766:2: (iv_ruleGenerated= ruleGenerated EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:767:2: iv_ruleGenerated= ruleGenerated EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGeneratedRule()); 
            }
            pushFollow(FOLLOW_ruleGenerated_in_entryRuleGenerated1615);
            iv_ruleGenerated=ruleGenerated();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGenerated; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenerated1625); if (state.failed) return current;

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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:774:1: ruleGenerated returns [EObject current=null] : (otherlv_0= 'generated' (otherlv_1= 'box' ( (lv_width_2_0= RULE_FLOAT ) ) ( (lv_height_3_0= RULE_FLOAT ) ) ( (lv_depth_4_0= RULE_FLOAT ) ) (otherlv_5= 'origin' ( (lv_originX_6_0= RULE_FLOAT ) ) ( (lv_originY_7_0= RULE_FLOAT ) ) ( (lv_originZ_8_0= RULE_FLOAT ) ) )? )? ) ;
    public final EObject ruleGenerated() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_width_2_0=null;
        Token lv_height_3_0=null;
        Token lv_depth_4_0=null;
        Token otherlv_5=null;
        Token lv_originX_6_0=null;
        Token lv_originY_7_0=null;
        Token lv_originZ_8_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:777:28: ( (otherlv_0= 'generated' (otherlv_1= 'box' ( (lv_width_2_0= RULE_FLOAT ) ) ( (lv_height_3_0= RULE_FLOAT ) ) ( (lv_depth_4_0= RULE_FLOAT ) ) (otherlv_5= 'origin' ( (lv_originX_6_0= RULE_FLOAT ) ) ( (lv_originY_7_0= RULE_FLOAT ) ) ( (lv_originZ_8_0= RULE_FLOAT ) ) )? )? ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:778:1: (otherlv_0= 'generated' (otherlv_1= 'box' ( (lv_width_2_0= RULE_FLOAT ) ) ( (lv_height_3_0= RULE_FLOAT ) ) ( (lv_depth_4_0= RULE_FLOAT ) ) (otherlv_5= 'origin' ( (lv_originX_6_0= RULE_FLOAT ) ) ( (lv_originY_7_0= RULE_FLOAT ) ) ( (lv_originZ_8_0= RULE_FLOAT ) ) )? )? )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:778:1: (otherlv_0= 'generated' (otherlv_1= 'box' ( (lv_width_2_0= RULE_FLOAT ) ) ( (lv_height_3_0= RULE_FLOAT ) ) ( (lv_depth_4_0= RULE_FLOAT ) ) (otherlv_5= 'origin' ( (lv_originX_6_0= RULE_FLOAT ) ) ( (lv_originY_7_0= RULE_FLOAT ) ) ( (lv_originZ_8_0= RULE_FLOAT ) ) )? )? )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:778:3: otherlv_0= 'generated' (otherlv_1= 'box' ( (lv_width_2_0= RULE_FLOAT ) ) ( (lv_height_3_0= RULE_FLOAT ) ) ( (lv_depth_4_0= RULE_FLOAT ) ) (otherlv_5= 'origin' ( (lv_originX_6_0= RULE_FLOAT ) ) ( (lv_originY_7_0= RULE_FLOAT ) ) ( (lv_originZ_8_0= RULE_FLOAT ) ) )? )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleGenerated1662); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGeneratedAccess().getGeneratedKeyword_0());
                  
            }
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:782:1: (otherlv_1= 'box' ( (lv_width_2_0= RULE_FLOAT ) ) ( (lv_height_3_0= RULE_FLOAT ) ) ( (lv_depth_4_0= RULE_FLOAT ) ) (otherlv_5= 'origin' ( (lv_originX_6_0= RULE_FLOAT ) ) ( (lv_originY_7_0= RULE_FLOAT ) ) ( (lv_originZ_8_0= RULE_FLOAT ) ) )? )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:782:3: otherlv_1= 'box' ( (lv_width_2_0= RULE_FLOAT ) ) ( (lv_height_3_0= RULE_FLOAT ) ) ( (lv_depth_4_0= RULE_FLOAT ) ) (otherlv_5= 'origin' ( (lv_originX_6_0= RULE_FLOAT ) ) ( (lv_originY_7_0= RULE_FLOAT ) ) ( (lv_originZ_8_0= RULE_FLOAT ) ) )?
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleGenerated1675); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getGeneratedAccess().getBoxKeyword_1_0());
                          
                    }
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:786:1: ( (lv_width_2_0= RULE_FLOAT ) )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:787:1: (lv_width_2_0= RULE_FLOAT )
                    {
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:787:1: (lv_width_2_0= RULE_FLOAT )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:788:3: lv_width_2_0= RULE_FLOAT
                    {
                    lv_width_2_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleGenerated1692); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_width_2_0, grammarAccess.getGeneratedAccess().getWidthFLOATTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getGeneratedRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"width",
                              		lv_width_2_0, 
                              		"FLOAT");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:804:2: ( (lv_height_3_0= RULE_FLOAT ) )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:805:1: (lv_height_3_0= RULE_FLOAT )
                    {
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:805:1: (lv_height_3_0= RULE_FLOAT )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:806:3: lv_height_3_0= RULE_FLOAT
                    {
                    lv_height_3_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleGenerated1714); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_height_3_0, grammarAccess.getGeneratedAccess().getHeightFLOATTerminalRuleCall_1_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getGeneratedRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"height",
                              		lv_height_3_0, 
                              		"FLOAT");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:822:2: ( (lv_depth_4_0= RULE_FLOAT ) )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:823:1: (lv_depth_4_0= RULE_FLOAT )
                    {
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:823:1: (lv_depth_4_0= RULE_FLOAT )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:824:3: lv_depth_4_0= RULE_FLOAT
                    {
                    lv_depth_4_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleGenerated1736); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_depth_4_0, grammarAccess.getGeneratedAccess().getDepthFLOATTerminalRuleCall_1_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getGeneratedRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"depth",
                              		lv_depth_4_0, 
                              		"FLOAT");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:840:2: (otherlv_5= 'origin' ( (lv_originX_6_0= RULE_FLOAT ) ) ( (lv_originY_7_0= RULE_FLOAT ) ) ( (lv_originZ_8_0= RULE_FLOAT ) ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==21) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:840:4: otherlv_5= 'origin' ( (lv_originX_6_0= RULE_FLOAT ) ) ( (lv_originY_7_0= RULE_FLOAT ) ) ( (lv_originZ_8_0= RULE_FLOAT ) )
                            {
                            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleGenerated1754); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getGeneratedAccess().getOriginKeyword_1_4_0());
                                  
                            }
                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:844:1: ( (lv_originX_6_0= RULE_FLOAT ) )
                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:845:1: (lv_originX_6_0= RULE_FLOAT )
                            {
                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:845:1: (lv_originX_6_0= RULE_FLOAT )
                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:846:3: lv_originX_6_0= RULE_FLOAT
                            {
                            lv_originX_6_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleGenerated1771); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_originX_6_0, grammarAccess.getGeneratedAccess().getOriginXFLOATTerminalRuleCall_1_4_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getGeneratedRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"originX",
                                      		lv_originX_6_0, 
                                      		"FLOAT");
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:862:2: ( (lv_originY_7_0= RULE_FLOAT ) )
                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:863:1: (lv_originY_7_0= RULE_FLOAT )
                            {
                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:863:1: (lv_originY_7_0= RULE_FLOAT )
                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:864:3: lv_originY_7_0= RULE_FLOAT
                            {
                            lv_originY_7_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleGenerated1793); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_originY_7_0, grammarAccess.getGeneratedAccess().getOriginYFLOATTerminalRuleCall_1_4_2_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getGeneratedRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"originY",
                                      		lv_originY_7_0, 
                                      		"FLOAT");
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:880:2: ( (lv_originZ_8_0= RULE_FLOAT ) )
                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:881:1: (lv_originZ_8_0= RULE_FLOAT )
                            {
                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:881:1: (lv_originZ_8_0= RULE_FLOAT )
                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:882:3: lv_originZ_8_0= RULE_FLOAT
                            {
                            lv_originZ_8_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleGenerated1815); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_originZ_8_0, grammarAccess.getGeneratedAccess().getOriginZFLOATTerminalRuleCall_1_4_3_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getGeneratedRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"originZ",
                                      		lv_originZ_8_0, 
                                      		"FLOAT");
                              	    
                            }

                            }


                            }


                            }
                            break;

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
    // $ANTLR end "ruleGenerated"


    // $ANTLR start "entryRuleFxmlInclude"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:906:1: entryRuleFxmlInclude returns [EObject current=null] : iv_ruleFxmlInclude= ruleFxmlInclude EOF ;
    public final EObject entryRuleFxmlInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFxmlInclude = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:907:2: (iv_ruleFxmlInclude= ruleFxmlInclude EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:908:2: iv_ruleFxmlInclude= ruleFxmlInclude EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFxmlIncludeRule()); 
            }
            pushFollow(FOLLOW_ruleFxmlInclude_in_entryRuleFxmlInclude1860);
            iv_ruleFxmlInclude=ruleFxmlInclude();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFxmlInclude; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFxmlInclude1870); if (state.failed) return current;

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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:915:1: ruleFxmlInclude returns [EObject current=null] : (otherlv_0= 'fxml' ( (lv_source3d_1_0= RULE_STRING ) ) (otherlv_2= 'origin' ( (lv_originX_3_0= RULE_FLOAT ) ) ( (lv_originY_4_0= RULE_FLOAT ) ) ( (lv_originZ_5_0= RULE_FLOAT ) ) )? ) ;
    public final EObject ruleFxmlInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_source3d_1_0=null;
        Token otherlv_2=null;
        Token lv_originX_3_0=null;
        Token lv_originY_4_0=null;
        Token lv_originZ_5_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:918:28: ( (otherlv_0= 'fxml' ( (lv_source3d_1_0= RULE_STRING ) ) (otherlv_2= 'origin' ( (lv_originX_3_0= RULE_FLOAT ) ) ( (lv_originY_4_0= RULE_FLOAT ) ) ( (lv_originZ_5_0= RULE_FLOAT ) ) )? ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:919:1: (otherlv_0= 'fxml' ( (lv_source3d_1_0= RULE_STRING ) ) (otherlv_2= 'origin' ( (lv_originX_3_0= RULE_FLOAT ) ) ( (lv_originY_4_0= RULE_FLOAT ) ) ( (lv_originZ_5_0= RULE_FLOAT ) ) )? )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:919:1: (otherlv_0= 'fxml' ( (lv_source3d_1_0= RULE_STRING ) ) (otherlv_2= 'origin' ( (lv_originX_3_0= RULE_FLOAT ) ) ( (lv_originY_4_0= RULE_FLOAT ) ) ( (lv_originZ_5_0= RULE_FLOAT ) ) )? )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:919:3: otherlv_0= 'fxml' ( (lv_source3d_1_0= RULE_STRING ) ) (otherlv_2= 'origin' ( (lv_originX_3_0= RULE_FLOAT ) ) ( (lv_originY_4_0= RULE_FLOAT ) ) ( (lv_originZ_5_0= RULE_FLOAT ) ) )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleFxmlInclude1907); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFxmlIncludeAccess().getFxmlKeyword_0());
                  
            }
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:923:1: ( (lv_source3d_1_0= RULE_STRING ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:924:1: (lv_source3d_1_0= RULE_STRING )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:924:1: (lv_source3d_1_0= RULE_STRING )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:925:3: lv_source3d_1_0= RULE_STRING
            {
            lv_source3d_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFxmlInclude1924); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_source3d_1_0, grammarAccess.getFxmlIncludeAccess().getSource3dSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFxmlIncludeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"source3d",
                      		lv_source3d_1_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:941:2: (otherlv_2= 'origin' ( (lv_originX_3_0= RULE_FLOAT ) ) ( (lv_originY_4_0= RULE_FLOAT ) ) ( (lv_originZ_5_0= RULE_FLOAT ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:941:4: otherlv_2= 'origin' ( (lv_originX_3_0= RULE_FLOAT ) ) ( (lv_originY_4_0= RULE_FLOAT ) ) ( (lv_originZ_5_0= RULE_FLOAT ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleFxmlInclude1942); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFxmlIncludeAccess().getOriginKeyword_2_0());
                          
                    }
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:945:1: ( (lv_originX_3_0= RULE_FLOAT ) )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:946:1: (lv_originX_3_0= RULE_FLOAT )
                    {
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:946:1: (lv_originX_3_0= RULE_FLOAT )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:947:3: lv_originX_3_0= RULE_FLOAT
                    {
                    lv_originX_3_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFxmlInclude1959); if (state.failed) return current;
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

                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:963:2: ( (lv_originY_4_0= RULE_FLOAT ) )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:964:1: (lv_originY_4_0= RULE_FLOAT )
                    {
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:964:1: (lv_originY_4_0= RULE_FLOAT )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:965:3: lv_originY_4_0= RULE_FLOAT
                    {
                    lv_originY_4_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFxmlInclude1981); if (state.failed) return current;
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

                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:981:2: ( (lv_originZ_5_0= RULE_FLOAT ) )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:982:1: (lv_originZ_5_0= RULE_FLOAT )
                    {
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:982:1: (lv_originZ_5_0= RULE_FLOAT )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:983:3: lv_originZ_5_0= RULE_FLOAT
                    {
                    lv_originZ_5_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFxmlInclude2003); if (state.failed) return current;
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


    // $ANTLR start "entryRuleAssembly"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1007:1: entryRuleAssembly returns [EObject current=null] : iv_ruleAssembly= ruleAssembly EOF ;
    public final EObject entryRuleAssembly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssembly = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1008:2: (iv_ruleAssembly= ruleAssembly EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1009:2: iv_ruleAssembly= ruleAssembly EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssemblyRule()); 
            }
            pushFollow(FOLLOW_ruleAssembly_in_entryRuleAssembly2046);
            iv_ruleAssembly=ruleAssembly();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssembly; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssembly2056); if (state.failed) return current;

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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1016:1: ruleAssembly returns [EObject current=null] : (otherlv_0= 'assembly' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (lv_items_3_0= ruleAssemblyItem ) )+ otherlv_4= '}' ) ;
    public final EObject ruleAssembly() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_items_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1019:28: ( (otherlv_0= 'assembly' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (lv_items_3_0= ruleAssemblyItem ) )+ otherlv_4= '}' ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1020:1: (otherlv_0= 'assembly' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (lv_items_3_0= ruleAssemblyItem ) )+ otherlv_4= '}' )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1020:1: (otherlv_0= 'assembly' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (lv_items_3_0= ruleAssemblyItem ) )+ otherlv_4= '}' )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1020:3: otherlv_0= 'assembly' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (lv_items_3_0= ruleAssemblyItem ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleAssembly2093); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAssemblyAccess().getAssemblyKeyword_0());
                  
            }
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1024:1: ( (lv_name_1_0= ruleValidID ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1025:1: (lv_name_1_0= ruleValidID )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1025:1: (lv_name_1_0= ruleValidID )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1026:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssemblyAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleAssembly2114);
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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleAssembly2126); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAssemblyAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1046:1: ( (lv_items_3_0= ruleAssemblyItem ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1047:1: (lv_items_3_0= ruleAssemblyItem )
            	    {
            	    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1047:1: (lv_items_3_0= ruleAssemblyItem )
            	    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1048:3: lv_items_3_0= ruleAssemblyItem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssemblyAccess().getItemsAssemblyItemParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssemblyItem_in_ruleAssembly2147);
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
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleAssembly2160); if (state.failed) return current;
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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1076:1: entryRuleAssemblyItem returns [EObject current=null] : iv_ruleAssemblyItem= ruleAssemblyItem EOF ;
    public final EObject entryRuleAssemblyItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyItem = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1077:2: (iv_ruleAssemblyItem= ruleAssemblyItem EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1078:2: iv_ruleAssemblyItem= ruleAssemblyItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssemblyItemRule()); 
            }
            pushFollow(FOLLOW_ruleAssemblyItem_in_entryRuleAssemblyItem2196);
            iv_ruleAssemblyItem=ruleAssemblyItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssemblyItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssemblyItem2206); if (state.failed) return current;

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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1085:1: ruleAssemblyItem returns [EObject current=null] : (this_RasterAssemblyItem_0= ruleRasterAssemblyItem | this_MountedAssemblyItem_1= ruleMountedAssemblyItem ) ;
    public final EObject ruleAssemblyItem() throws RecognitionException {
        EObject current = null;

        EObject this_RasterAssemblyItem_0 = null;

        EObject this_MountedAssemblyItem_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1088:28: ( (this_RasterAssemblyItem_0= ruleRasterAssemblyItem | this_MountedAssemblyItem_1= ruleMountedAssemblyItem ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1089:1: (this_RasterAssemblyItem_0= ruleRasterAssemblyItem | this_MountedAssemblyItem_1= ruleMountedAssemblyItem )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1089:1: (this_RasterAssemblyItem_0= ruleRasterAssemblyItem | this_MountedAssemblyItem_1= ruleMountedAssemblyItem )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1090:5: this_RasterAssemblyItem_0= ruleRasterAssemblyItem
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssemblyItemAccess().getRasterAssemblyItemParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRasterAssemblyItem_in_ruleAssemblyItem2253);
                    this_RasterAssemblyItem_0=ruleRasterAssemblyItem();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RasterAssemblyItem_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1100:5: this_MountedAssemblyItem_1= ruleMountedAssemblyItem
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssemblyItemAccess().getMountedAssemblyItemParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMountedAssemblyItem_in_ruleAssemblyItem2280);
                    this_MountedAssemblyItem_1=ruleMountedAssemblyItem();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MountedAssemblyItem_1; 
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
    // $ANTLR end "ruleAssemblyItem"


    // $ANTLR start "entryRuleRasterAssemblyItem"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1116:1: entryRuleRasterAssemblyItem returns [EObject current=null] : iv_ruleRasterAssemblyItem= ruleRasterAssemblyItem EOF ;
    public final EObject entryRuleRasterAssemblyItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRasterAssemblyItem = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1117:2: (iv_ruleRasterAssemblyItem= ruleRasterAssemblyItem EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1118:2: iv_ruleRasterAssemblyItem= ruleRasterAssemblyItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRasterAssemblyItemRule()); 
            }
            pushFollow(FOLLOW_ruleRasterAssemblyItem_in_entryRuleRasterAssemblyItem2315);
            iv_ruleRasterAssemblyItem=ruleRasterAssemblyItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRasterAssemblyItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRasterAssemblyItem2325); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRasterAssemblyItem"


    // $ANTLR start "ruleRasterAssemblyItem"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1125:1: ruleRasterAssemblyItem returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'pos' ( (lv_xUnits_2_0= ruleXUnit ) ) ( (lv_yUnits_3_0= ruleYUnit ) ) ( (lv_zUnits_4_0= ruleZUnit ) ) (otherlv_5= 'transform' ( ( (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' ) ) ) )? ) ;
    public final EObject ruleRasterAssemblyItem() throws RecognitionException {
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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1128:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'pos' ( (lv_xUnits_2_0= ruleXUnit ) ) ( (lv_yUnits_3_0= ruleYUnit ) ) ( (lv_zUnits_4_0= ruleZUnit ) ) (otherlv_5= 'transform' ( ( (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' ) ) ) )? ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1129:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'pos' ( (lv_xUnits_2_0= ruleXUnit ) ) ( (lv_yUnits_3_0= ruleYUnit ) ) ( (lv_zUnits_4_0= ruleZUnit ) ) (otherlv_5= 'transform' ( ( (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' ) ) ) )? )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1129:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'pos' ( (lv_xUnits_2_0= ruleXUnit ) ) ( (lv_yUnits_3_0= ruleYUnit ) ) ( (lv_zUnits_4_0= ruleZUnit ) ) (otherlv_5= 'transform' ( ( (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' ) ) ) )? )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1129:2: ( ( ruleQualifiedName ) ) otherlv_1= 'pos' ( (lv_xUnits_2_0= ruleXUnit ) ) ( (lv_yUnits_3_0= ruleYUnit ) ) ( (lv_zUnits_4_0= ruleZUnit ) ) (otherlv_5= 'transform' ( ( (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' ) ) ) )?
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1129:2: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1130:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1130:1: ( ruleQualifiedName )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1131:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getRasterAssemblyItemRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRasterAssemblyItemAccess().getElementRasterItemCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRasterAssemblyItem2373);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleRasterAssemblyItem2385); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRasterAssemblyItemAccess().getPosKeyword_1());
                  
            }
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1148:1: ( (lv_xUnits_2_0= ruleXUnit ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1149:1: (lv_xUnits_2_0= ruleXUnit )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1149:1: (lv_xUnits_2_0= ruleXUnit )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1150:3: lv_xUnits_2_0= ruleXUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRasterAssemblyItemAccess().getXUnitsXUnitParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXUnit_in_ruleRasterAssemblyItem2406);
            lv_xUnits_2_0=ruleXUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRasterAssemblyItemRule());
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

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1166:2: ( (lv_yUnits_3_0= ruleYUnit ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1167:1: (lv_yUnits_3_0= ruleYUnit )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1167:1: (lv_yUnits_3_0= ruleYUnit )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1168:3: lv_yUnits_3_0= ruleYUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRasterAssemblyItemAccess().getYUnitsYUnitParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleYUnit_in_ruleRasterAssemblyItem2427);
            lv_yUnits_3_0=ruleYUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRasterAssemblyItemRule());
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

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1184:2: ( (lv_zUnits_4_0= ruleZUnit ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1185:1: (lv_zUnits_4_0= ruleZUnit )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1185:1: (lv_zUnits_4_0= ruleZUnit )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1186:3: lv_zUnits_4_0= ruleZUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRasterAssemblyItemAccess().getZUnitsZUnitParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleZUnit_in_ruleRasterAssemblyItem2448);
            lv_zUnits_4_0=ruleZUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRasterAssemblyItemRule());
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

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1202:2: (otherlv_5= 'transform' ( ( (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' ) ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1202:4: otherlv_5= 'transform' ( ( (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' ) ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleRasterAssemblyItem2461); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getRasterAssemblyItemAccess().getTransformKeyword_5_0());
                          
                    }
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1206:1: ( ( (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' ) ) )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1207:1: ( (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' ) )
                    {
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1207:1: ( (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' ) )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1208:1: (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' )
                    {
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1208:1: (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' )
                    int alt11=3;
                    switch ( input.LA(1) ) {
                    case 26:
                        {
                        alt11=1;
                        }
                        break;
                    case 27:
                        {
                        alt11=2;
                        }
                        break;
                    case 28:
                        {
                        alt11=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }

                    switch (alt11) {
                        case 1 :
                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1209:3: lv_transform_6_1= 'rotate180'
                            {
                            lv_transform_6_1=(Token)match(input,26,FOLLOW_26_in_ruleRasterAssemblyItem2481); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_transform_6_1, grammarAccess.getRasterAssemblyItemAccess().getTransformRotate180Keyword_5_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getRasterAssemblyItemRule());
                              	        }
                                     		setWithLastConsumed(current, "transform", lv_transform_6_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1221:8: lv_transform_6_2= 'rotate90'
                            {
                            lv_transform_6_2=(Token)match(input,27,FOLLOW_27_in_ruleRasterAssemblyItem2510); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_transform_6_2, grammarAccess.getRasterAssemblyItemAccess().getTransformRotate90Keyword_5_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getRasterAssemblyItemRule());
                              	        }
                                     		setWithLastConsumed(current, "transform", lv_transform_6_2, null);
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1233:8: lv_transform_6_3= 'rotate270'
                            {
                            lv_transform_6_3=(Token)match(input,28,FOLLOW_28_in_ruleRasterAssemblyItem2539); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_transform_6_3, grammarAccess.getRasterAssemblyItemAccess().getTransformRotate270Keyword_5_1_0_2());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getRasterAssemblyItemRule());
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
    // $ANTLR end "ruleRasterAssemblyItem"


    // $ANTLR start "entryRuleMountedAssemblyItem"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1256:1: entryRuleMountedAssemblyItem returns [EObject current=null] : iv_ruleMountedAssemblyItem= ruleMountedAssemblyItem EOF ;
    public final EObject entryRuleMountedAssemblyItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMountedAssemblyItem = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1257:2: (iv_ruleMountedAssemblyItem= ruleMountedAssemblyItem EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1258:2: iv_ruleMountedAssemblyItem= ruleMountedAssemblyItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMountedAssemblyItemRule()); 
            }
            pushFollow(FOLLOW_ruleMountedAssemblyItem_in_entryRuleMountedAssemblyItem2593);
            iv_ruleMountedAssemblyItem=ruleMountedAssemblyItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMountedAssemblyItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMountedAssemblyItem2603); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMountedAssemblyItem"


    // $ANTLR start "ruleMountedAssemblyItem"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1265:1: ruleMountedAssemblyItem returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'pos' ( (lv_xUnits_2_0= RULE_FLOAT ) ) ( (lv_yUnits_3_0= RULE_FLOAT ) ) ( (lv_zUnits_4_0= RULE_FLOAT ) ) (otherlv_5= 'transform' ( (lv_rotateX_6_0= RULE_FLOAT ) ) ( (lv_rotateY_7_0= RULE_FLOAT ) ) ( (lv_rotateZ_8_0= RULE_FLOAT ) ) )? ) ;
    public final EObject ruleMountedAssemblyItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_xUnits_2_0=null;
        Token lv_yUnits_3_0=null;
        Token lv_zUnits_4_0=null;
        Token otherlv_5=null;
        Token lv_rotateX_6_0=null;
        Token lv_rotateY_7_0=null;
        Token lv_rotateZ_8_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1268:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'pos' ( (lv_xUnits_2_0= RULE_FLOAT ) ) ( (lv_yUnits_3_0= RULE_FLOAT ) ) ( (lv_zUnits_4_0= RULE_FLOAT ) ) (otherlv_5= 'transform' ( (lv_rotateX_6_0= RULE_FLOAT ) ) ( (lv_rotateY_7_0= RULE_FLOAT ) ) ( (lv_rotateZ_8_0= RULE_FLOAT ) ) )? ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1269:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'pos' ( (lv_xUnits_2_0= RULE_FLOAT ) ) ( (lv_yUnits_3_0= RULE_FLOAT ) ) ( (lv_zUnits_4_0= RULE_FLOAT ) ) (otherlv_5= 'transform' ( (lv_rotateX_6_0= RULE_FLOAT ) ) ( (lv_rotateY_7_0= RULE_FLOAT ) ) ( (lv_rotateZ_8_0= RULE_FLOAT ) ) )? )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1269:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'pos' ( (lv_xUnits_2_0= RULE_FLOAT ) ) ( (lv_yUnits_3_0= RULE_FLOAT ) ) ( (lv_zUnits_4_0= RULE_FLOAT ) ) (otherlv_5= 'transform' ( (lv_rotateX_6_0= RULE_FLOAT ) ) ( (lv_rotateY_7_0= RULE_FLOAT ) ) ( (lv_rotateZ_8_0= RULE_FLOAT ) ) )? )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1269:2: ( ( ruleQualifiedName ) ) otherlv_1= 'pos' ( (lv_xUnits_2_0= RULE_FLOAT ) ) ( (lv_yUnits_3_0= RULE_FLOAT ) ) ( (lv_zUnits_4_0= RULE_FLOAT ) ) (otherlv_5= 'transform' ( (lv_rotateX_6_0= RULE_FLOAT ) ) ( (lv_rotateY_7_0= RULE_FLOAT ) ) ( (lv_rotateZ_8_0= RULE_FLOAT ) ) )?
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1269:2: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1270:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1270:1: ( ruleQualifiedName )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1271:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMountedAssemblyItemRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMountedAssemblyItemAccess().getElementRasterItemCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleMountedAssemblyItem2651);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleMountedAssemblyItem2663); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMountedAssemblyItemAccess().getPosKeyword_1());
                  
            }
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1288:1: ( (lv_xUnits_2_0= RULE_FLOAT ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1289:1: (lv_xUnits_2_0= RULE_FLOAT )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1289:1: (lv_xUnits_2_0= RULE_FLOAT )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1290:3: lv_xUnits_2_0= RULE_FLOAT
            {
            lv_xUnits_2_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleMountedAssemblyItem2680); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_xUnits_2_0, grammarAccess.getMountedAssemblyItemAccess().getXUnitsFLOATTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMountedAssemblyItemRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"xUnits",
                      		lv_xUnits_2_0, 
                      		"FLOAT");
              	    
            }

            }


            }

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1306:2: ( (lv_yUnits_3_0= RULE_FLOAT ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1307:1: (lv_yUnits_3_0= RULE_FLOAT )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1307:1: (lv_yUnits_3_0= RULE_FLOAT )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1308:3: lv_yUnits_3_0= RULE_FLOAT
            {
            lv_yUnits_3_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleMountedAssemblyItem2702); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_yUnits_3_0, grammarAccess.getMountedAssemblyItemAccess().getYUnitsFLOATTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMountedAssemblyItemRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"yUnits",
                      		lv_yUnits_3_0, 
                      		"FLOAT");
              	    
            }

            }


            }

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1324:2: ( (lv_zUnits_4_0= RULE_FLOAT ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1325:1: (lv_zUnits_4_0= RULE_FLOAT )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1325:1: (lv_zUnits_4_0= RULE_FLOAT )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1326:3: lv_zUnits_4_0= RULE_FLOAT
            {
            lv_zUnits_4_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleMountedAssemblyItem2724); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_zUnits_4_0, grammarAccess.getMountedAssemblyItemAccess().getZUnitsFLOATTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMountedAssemblyItemRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"zUnits",
                      		lv_zUnits_4_0, 
                      		"FLOAT");
              	    
            }

            }


            }

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1342:2: (otherlv_5= 'transform' ( (lv_rotateX_6_0= RULE_FLOAT ) ) ( (lv_rotateY_7_0= RULE_FLOAT ) ) ( (lv_rotateZ_8_0= RULE_FLOAT ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1342:4: otherlv_5= 'transform' ( (lv_rotateX_6_0= RULE_FLOAT ) ) ( (lv_rotateY_7_0= RULE_FLOAT ) ) ( (lv_rotateZ_8_0= RULE_FLOAT ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleMountedAssemblyItem2742); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getMountedAssemblyItemAccess().getTransformKeyword_5_0());
                          
                    }
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1346:1: ( (lv_rotateX_6_0= RULE_FLOAT ) )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1347:1: (lv_rotateX_6_0= RULE_FLOAT )
                    {
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1347:1: (lv_rotateX_6_0= RULE_FLOAT )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1348:3: lv_rotateX_6_0= RULE_FLOAT
                    {
                    lv_rotateX_6_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleMountedAssemblyItem2759); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_rotateX_6_0, grammarAccess.getMountedAssemblyItemAccess().getRotateXFLOATTerminalRuleCall_5_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMountedAssemblyItemRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"rotateX",
                              		lv_rotateX_6_0, 
                              		"FLOAT");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1364:2: ( (lv_rotateY_7_0= RULE_FLOAT ) )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1365:1: (lv_rotateY_7_0= RULE_FLOAT )
                    {
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1365:1: (lv_rotateY_7_0= RULE_FLOAT )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1366:3: lv_rotateY_7_0= RULE_FLOAT
                    {
                    lv_rotateY_7_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleMountedAssemblyItem2781); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_rotateY_7_0, grammarAccess.getMountedAssemblyItemAccess().getRotateYFLOATTerminalRuleCall_5_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMountedAssemblyItemRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"rotateY",
                              		lv_rotateY_7_0, 
                              		"FLOAT");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1382:2: ( (lv_rotateZ_8_0= RULE_FLOAT ) )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1383:1: (lv_rotateZ_8_0= RULE_FLOAT )
                    {
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1383:1: (lv_rotateZ_8_0= RULE_FLOAT )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1384:3: lv_rotateZ_8_0= RULE_FLOAT
                    {
                    lv_rotateZ_8_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleMountedAssemblyItem2803); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_rotateZ_8_0, grammarAccess.getMountedAssemblyItemAccess().getRotateZFLOATTerminalRuleCall_5_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMountedAssemblyItemRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"rotateZ",
                              		lv_rotateZ_8_0, 
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
    // $ANTLR end "ruleMountedAssemblyItem"

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


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\7\uffff";
    static final String DFA10_eofS =
        "\7\uffff";
    static final String DFA10_minS =
        "\1\4\1\14\1\4\1\5\1\14\2\uffff";
    static final String DFA10_maxS =
        "\1\4\1\30\1\4\1\6\1\30\2\uffff";
    static final String DFA10_acceptS =
        "\5\uffff\1\1\1\2";
    static final String DFA10_specialS =
        "\7\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1",
            "\1\2\13\uffff\1\3",
            "\1\4",
            "\1\5\1\6",
            "\1\2\13\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1089:1: (this_RasterAssemblyItem_0= ruleRasterAssemblyItem | this_MountedAssemblyItem_1= ruleMountedAssemblyItem )";
        }
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
    public static final BitSet FOLLOW_13_in_ruleItemRepository514 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_ruleRepostoryItem_in_ruleItemRepository535 = new BitSet(new long[]{0x000000000002C000L});
    public static final BitSet FOLLOW_14_in_ruleItemRepository548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMountedPart_in_entryRuleMountedPart588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMountedPart598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleMountedPart635 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleMountedPart656 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleMountedPart677 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_ruleSource_in_ruleMountedPart698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepostoryItem_in_entryRuleRepostoryItem734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepostoryItem744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrick_in_ruleRepostoryItem791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMountedPart_in_ruleRepostoryItem818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleColor900 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleColor917 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleColor939 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleColor961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnit_in_entryRuleXUnit1002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnit1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXUnit1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYUnit_in_entryRuleYUnit1093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleYUnit1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleYUnit1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZUnit_in_entryRuleZUnit1184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleZUnit1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleZUnit1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrick_in_entryRuleBrick1275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBrick1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleBrick1322 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleBrick1343 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBrick1355 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleXUnit_in_ruleBrick1376 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleYUnit_in_ruleBrick1397 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleZUnit_in_ruleBrick1418 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleBrick1439 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_ruleSource_in_ruleBrick1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSource_in_entryRuleSource1496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSource1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerated_in_ruleSource1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFxmlInclude_in_ruleSource1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerated_in_entryRuleGenerated1615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenerated1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleGenerated1662 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleGenerated1675 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleGenerated1692 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleGenerated1714 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleGenerated1736 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleGenerated1754 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleGenerated1771 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleGenerated1793 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleGenerated1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFxmlInclude_in_entryRuleFxmlInclude1860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFxmlInclude1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleFxmlInclude1907 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFxmlInclude1924 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleFxmlInclude1942 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFxmlInclude1959 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFxmlInclude1981 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFxmlInclude2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssembly_in_entryRuleAssembly2046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssembly2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleAssembly2093 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleAssembly2114 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAssembly2126 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAssemblyItem_in_ruleAssembly2147 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleAssembly2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssemblyItem_in_entryRuleAssemblyItem2196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssemblyItem2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRasterAssemblyItem_in_ruleAssemblyItem2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMountedAssemblyItem_in_ruleAssemblyItem2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRasterAssemblyItem_in_entryRuleRasterAssemblyItem2315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRasterAssemblyItem2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRasterAssemblyItem2373 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleRasterAssemblyItem2385 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleXUnit_in_ruleRasterAssemblyItem2406 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleYUnit_in_ruleRasterAssemblyItem2427 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleZUnit_in_ruleRasterAssemblyItem2448 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleRasterAssemblyItem2461 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_26_in_ruleRasterAssemblyItem2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleRasterAssemblyItem2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleRasterAssemblyItem2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMountedAssemblyItem_in_entryRuleMountedAssemblyItem2593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMountedAssemblyItem2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMountedAssemblyItem2651 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleMountedAssemblyItem2663 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleMountedAssemblyItem2680 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleMountedAssemblyItem2702 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleMountedAssemblyItem2724 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleMountedAssemblyItem2742 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleMountedAssemblyItem2759 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleMountedAssemblyItem2781 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleMountedAssemblyItem2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred1_InternalLego367 = new BitSet(new long[]{0x0000000000000002L});

}