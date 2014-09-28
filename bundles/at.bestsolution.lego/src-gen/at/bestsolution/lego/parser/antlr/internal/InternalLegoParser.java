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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_FLOAT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'{'", "'}'", "'mpart'", "'rotate'", "'x'", "'y'", "'z'", "'duration'", "'sound-file'", "'rgb'", "'brick'", "'units'", "'generated'", "'box'", "'origin'", "'fxml'", "'assembly'", "'pos'", "'transform'", "'rotate180'", "'rotate90'", "'rotate270'", "'actions'"
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
            else if ( (LA1_0==29) ) {
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

                if ( (LA3_0==15||LA3_0==23) ) {
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


    // $ANTLR start "entryRuleAction"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:352:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:353:2: (iv_ruleAction= ruleAction EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:354:2: iv_ruleAction= ruleAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionRule()); 
            }
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction734);
            iv_ruleAction=ruleAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction744); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:361:1: ruleAction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'rotate' ) ) ( ( (lv_axis_2_1= 'x' | lv_axis_2_2= 'y' | lv_axis_2_3= 'z' ) ) ) ( (lv_angle_3_0= RULE_FLOAT ) ) otherlv_4= 'duration' ( (lv_duration_5_0= RULE_INT ) ) (otherlv_6= 'sound-file' ( (lv_soundfile_7_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_type_1_0=null;
        Token lv_axis_2_1=null;
        Token lv_axis_2_2=null;
        Token lv_axis_2_3=null;
        Token lv_angle_3_0=null;
        Token otherlv_4=null;
        Token lv_duration_5_0=null;
        Token otherlv_6=null;
        Token lv_soundfile_7_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:364:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'rotate' ) ) ( ( (lv_axis_2_1= 'x' | lv_axis_2_2= 'y' | lv_axis_2_3= 'z' ) ) ) ( (lv_angle_3_0= RULE_FLOAT ) ) otherlv_4= 'duration' ( (lv_duration_5_0= RULE_INT ) ) (otherlv_6= 'sound-file' ( (lv_soundfile_7_0= RULE_STRING ) ) )? ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:365:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'rotate' ) ) ( ( (lv_axis_2_1= 'x' | lv_axis_2_2= 'y' | lv_axis_2_3= 'z' ) ) ) ( (lv_angle_3_0= RULE_FLOAT ) ) otherlv_4= 'duration' ( (lv_duration_5_0= RULE_INT ) ) (otherlv_6= 'sound-file' ( (lv_soundfile_7_0= RULE_STRING ) ) )? )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:365:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'rotate' ) ) ( ( (lv_axis_2_1= 'x' | lv_axis_2_2= 'y' | lv_axis_2_3= 'z' ) ) ) ( (lv_angle_3_0= RULE_FLOAT ) ) otherlv_4= 'duration' ( (lv_duration_5_0= RULE_INT ) ) (otherlv_6= 'sound-file' ( (lv_soundfile_7_0= RULE_STRING ) ) )? )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:365:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'rotate' ) ) ( ( (lv_axis_2_1= 'x' | lv_axis_2_2= 'y' | lv_axis_2_3= 'z' ) ) ) ( (lv_angle_3_0= RULE_FLOAT ) ) otherlv_4= 'duration' ( (lv_duration_5_0= RULE_INT ) ) (otherlv_6= 'sound-file' ( (lv_soundfile_7_0= RULE_STRING ) ) )?
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:365:2: ( (lv_name_0_0= RULE_ID ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:366:1: (lv_name_0_0= RULE_ID )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:366:1: (lv_name_0_0= RULE_ID )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:367:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAction786); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getActionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:383:2: ( (lv_type_1_0= 'rotate' ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:384:1: (lv_type_1_0= 'rotate' )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:384:1: (lv_type_1_0= 'rotate' )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:385:3: lv_type_1_0= 'rotate'
            {
            lv_type_1_0=(Token)match(input,16,FOLLOW_16_in_ruleAction809); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_type_1_0, grammarAccess.getActionAccess().getTypeRotateKeyword_1_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getActionRule());
              	        }
                     		setWithLastConsumed(current, "type", lv_type_1_0, "rotate");
              	    
            }

            }


            }

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:398:2: ( ( (lv_axis_2_1= 'x' | lv_axis_2_2= 'y' | lv_axis_2_3= 'z' ) ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:399:1: ( (lv_axis_2_1= 'x' | lv_axis_2_2= 'y' | lv_axis_2_3= 'z' ) )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:399:1: ( (lv_axis_2_1= 'x' | lv_axis_2_2= 'y' | lv_axis_2_3= 'z' ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:400:1: (lv_axis_2_1= 'x' | lv_axis_2_2= 'y' | lv_axis_2_3= 'z' )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:400:1: (lv_axis_2_1= 'x' | lv_axis_2_2= 'y' | lv_axis_2_3= 'z' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
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
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:401:3: lv_axis_2_1= 'x'
                    {
                    lv_axis_2_1=(Token)match(input,17,FOLLOW_17_in_ruleAction842); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_axis_2_1, grammarAccess.getActionAccess().getAxisXKeyword_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getActionRule());
                      	        }
                             		setWithLastConsumed(current, "axis", lv_axis_2_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:413:8: lv_axis_2_2= 'y'
                    {
                    lv_axis_2_2=(Token)match(input,18,FOLLOW_18_in_ruleAction871); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_axis_2_2, grammarAccess.getActionAccess().getAxisYKeyword_2_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getActionRule());
                      	        }
                             		setWithLastConsumed(current, "axis", lv_axis_2_2, null);
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:425:8: lv_axis_2_3= 'z'
                    {
                    lv_axis_2_3=(Token)match(input,19,FOLLOW_19_in_ruleAction900); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_axis_2_3, grammarAccess.getActionAccess().getAxisZKeyword_2_0_2());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getActionRule());
                      	        }
                             		setWithLastConsumed(current, "axis", lv_axis_2_3, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:440:2: ( (lv_angle_3_0= RULE_FLOAT ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:441:1: (lv_angle_3_0= RULE_FLOAT )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:441:1: (lv_angle_3_0= RULE_FLOAT )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:442:3: lv_angle_3_0= RULE_FLOAT
            {
            lv_angle_3_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleAction933); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_angle_3_0, grammarAccess.getActionAccess().getAngleFLOATTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getActionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"angle",
                      		lv_angle_3_0, 
                      		"FLOAT");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleAction950); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getActionAccess().getDurationKeyword_4());
                  
            }
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:462:1: ( (lv_duration_5_0= RULE_INT ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:463:1: (lv_duration_5_0= RULE_INT )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:463:1: (lv_duration_5_0= RULE_INT )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:464:3: lv_duration_5_0= RULE_INT
            {
            lv_duration_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAction967); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_duration_5_0, grammarAccess.getActionAccess().getDurationINTTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getActionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"duration",
                      		lv_duration_5_0, 
                      		"INT");
              	    
            }

            }


            }

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:480:2: (otherlv_6= 'sound-file' ( (lv_soundfile_7_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:480:4: otherlv_6= 'sound-file' ( (lv_soundfile_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleAction985); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getActionAccess().getSoundFileKeyword_6_0());
                          
                    }
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:484:1: ( (lv_soundfile_7_0= RULE_STRING ) )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:485:1: (lv_soundfile_7_0= RULE_STRING )
                    {
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:485:1: (lv_soundfile_7_0= RULE_STRING )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:486:3: lv_soundfile_7_0= RULE_STRING
                    {
                    lv_soundfile_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAction1002); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_soundfile_7_0, grammarAccess.getActionAccess().getSoundfileSTRINGTerminalRuleCall_6_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getActionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"soundfile",
                              		lv_soundfile_7_0, 
                              		"STRING");
                      	    
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleRepostoryItem"
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:510:1: entryRuleRepostoryItem returns [EObject current=null] : iv_ruleRepostoryItem= ruleRepostoryItem EOF ;
    public final EObject entryRuleRepostoryItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepostoryItem = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:511:2: (iv_ruleRepostoryItem= ruleRepostoryItem EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:512:2: iv_ruleRepostoryItem= ruleRepostoryItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRepostoryItemRule()); 
            }
            pushFollow(FOLLOW_ruleRepostoryItem_in_entryRuleRepostoryItem1045);
            iv_ruleRepostoryItem=ruleRepostoryItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRepostoryItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepostoryItem1055); if (state.failed) return current;

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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:519:1: ruleRepostoryItem returns [EObject current=null] : (this_Brick_0= ruleBrick | this_MountedPart_1= ruleMountedPart ) ;
    public final EObject ruleRepostoryItem() throws RecognitionException {
        EObject current = null;

        EObject this_Brick_0 = null;

        EObject this_MountedPart_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:522:28: ( (this_Brick_0= ruleBrick | this_MountedPart_1= ruleMountedPart ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:523:1: (this_Brick_0= ruleBrick | this_MountedPart_1= ruleMountedPart )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:523:1: (this_Brick_0= ruleBrick | this_MountedPart_1= ruleMountedPart )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:524:5: this_Brick_0= ruleBrick
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRepostoryItemAccess().getBrickParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBrick_in_ruleRepostoryItem1102);
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
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:534:5: this_MountedPart_1= ruleMountedPart
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRepostoryItemAccess().getMountedPartParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMountedPart_in_ruleRepostoryItem1129);
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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:550:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:551:2: (iv_ruleColor= ruleColor EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:552:2: iv_ruleColor= ruleColor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColorRule()); 
            }
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor1164);
            iv_ruleColor=ruleColor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor1174); if (state.failed) return current;

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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:559:1: ruleColor returns [EObject current=null] : (otherlv_0= 'rgb' ( (lv_r_1_0= RULE_INT ) ) ( (lv_g_2_0= RULE_INT ) ) ( (lv_b_3_0= RULE_INT ) ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_r_1_0=null;
        Token lv_g_2_0=null;
        Token lv_b_3_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:562:28: ( (otherlv_0= 'rgb' ( (lv_r_1_0= RULE_INT ) ) ( (lv_g_2_0= RULE_INT ) ) ( (lv_b_3_0= RULE_INT ) ) ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:563:1: (otherlv_0= 'rgb' ( (lv_r_1_0= RULE_INT ) ) ( (lv_g_2_0= RULE_INT ) ) ( (lv_b_3_0= RULE_INT ) ) )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:563:1: (otherlv_0= 'rgb' ( (lv_r_1_0= RULE_INT ) ) ( (lv_g_2_0= RULE_INT ) ) ( (lv_b_3_0= RULE_INT ) ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:563:3: otherlv_0= 'rgb' ( (lv_r_1_0= RULE_INT ) ) ( (lv_g_2_0= RULE_INT ) ) ( (lv_b_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleColor1211); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getColorAccess().getRgbKeyword_0());
                  
            }
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:567:1: ( (lv_r_1_0= RULE_INT ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:568:1: (lv_r_1_0= RULE_INT )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:568:1: (lv_r_1_0= RULE_INT )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:569:3: lv_r_1_0= RULE_INT
            {
            lv_r_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleColor1228); if (state.failed) return current;
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

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:585:2: ( (lv_g_2_0= RULE_INT ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:586:1: (lv_g_2_0= RULE_INT )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:586:1: (lv_g_2_0= RULE_INT )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:587:3: lv_g_2_0= RULE_INT
            {
            lv_g_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleColor1250); if (state.failed) return current;
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

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:603:2: ( (lv_b_3_0= RULE_INT ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:604:1: (lv_b_3_0= RULE_INT )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:604:1: (lv_b_3_0= RULE_INT )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:605:3: lv_b_3_0= RULE_INT
            {
            lv_b_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleColor1272); if (state.failed) return current;
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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:629:1: entryRuleXUnit returns [EObject current=null] : iv_ruleXUnit= ruleXUnit EOF ;
    public final EObject entryRuleXUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnit = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:630:2: (iv_ruleXUnit= ruleXUnit EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:631:2: iv_ruleXUnit= ruleXUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnitRule()); 
            }
            pushFollow(FOLLOW_ruleXUnit_in_entryRuleXUnit1313);
            iv_ruleXUnit=ruleXUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnit1323); if (state.failed) return current;

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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:638:1: ruleXUnit returns [EObject current=null] : ( (lv_units_0_0= RULE_INT ) ) ;
    public final EObject ruleXUnit() throws RecognitionException {
        EObject current = null;

        Token lv_units_0_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:641:28: ( ( (lv_units_0_0= RULE_INT ) ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:642:1: ( (lv_units_0_0= RULE_INT ) )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:642:1: ( (lv_units_0_0= RULE_INT ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:643:1: (lv_units_0_0= RULE_INT )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:643:1: (lv_units_0_0= RULE_INT )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:644:3: lv_units_0_0= RULE_INT
            {
            lv_units_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXUnit1364); if (state.failed) return current;
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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:668:1: entryRuleYUnit returns [EObject current=null] : iv_ruleYUnit= ruleYUnit EOF ;
    public final EObject entryRuleYUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYUnit = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:669:2: (iv_ruleYUnit= ruleYUnit EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:670:2: iv_ruleYUnit= ruleYUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYUnitRule()); 
            }
            pushFollow(FOLLOW_ruleYUnit_in_entryRuleYUnit1404);
            iv_ruleYUnit=ruleYUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYUnit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleYUnit1414); if (state.failed) return current;

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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:677:1: ruleYUnit returns [EObject current=null] : ( (lv_units_0_0= RULE_INT ) ) ;
    public final EObject ruleYUnit() throws RecognitionException {
        EObject current = null;

        Token lv_units_0_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:680:28: ( ( (lv_units_0_0= RULE_INT ) ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:681:1: ( (lv_units_0_0= RULE_INT ) )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:681:1: ( (lv_units_0_0= RULE_INT ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:682:1: (lv_units_0_0= RULE_INT )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:682:1: (lv_units_0_0= RULE_INT )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:683:3: lv_units_0_0= RULE_INT
            {
            lv_units_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleYUnit1455); if (state.failed) return current;
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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:707:1: entryRuleZUnit returns [EObject current=null] : iv_ruleZUnit= ruleZUnit EOF ;
    public final EObject entryRuleZUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleZUnit = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:708:2: (iv_ruleZUnit= ruleZUnit EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:709:2: iv_ruleZUnit= ruleZUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getZUnitRule()); 
            }
            pushFollow(FOLLOW_ruleZUnit_in_entryRuleZUnit1495);
            iv_ruleZUnit=ruleZUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleZUnit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleZUnit1505); if (state.failed) return current;

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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:716:1: ruleZUnit returns [EObject current=null] : ( (lv_units_0_0= RULE_INT ) ) ;
    public final EObject ruleZUnit() throws RecognitionException {
        EObject current = null;

        Token lv_units_0_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:719:28: ( ( (lv_units_0_0= RULE_INT ) ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:720:1: ( (lv_units_0_0= RULE_INT ) )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:720:1: ( (lv_units_0_0= RULE_INT ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:721:1: (lv_units_0_0= RULE_INT )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:721:1: (lv_units_0_0= RULE_INT )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:722:3: lv_units_0_0= RULE_INT
            {
            lv_units_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleZUnit1546); if (state.failed) return current;
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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:746:1: entryRuleBrick returns [EObject current=null] : iv_ruleBrick= ruleBrick EOF ;
    public final EObject entryRuleBrick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrick = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:747:2: (iv_ruleBrick= ruleBrick EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:748:2: iv_ruleBrick= ruleBrick EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBrickRule()); 
            }
            pushFollow(FOLLOW_ruleBrick_in_entryRuleBrick1586);
            iv_ruleBrick=ruleBrick();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBrick; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBrick1596); if (state.failed) return current;

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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:755:1: ruleBrick returns [EObject current=null] : (otherlv_0= 'brick' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= 'units' ( (lv_xUnits_3_0= ruleXUnit ) ) ( (lv_yUnits_4_0= ruleYUnit ) ) ( (lv_zUnits_5_0= ruleZUnit ) ) ( (lv_fill_6_0= ruleColor ) ) ( (lv_source_7_0= ruleSource ) ) ) ;
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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:758:28: ( (otherlv_0= 'brick' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= 'units' ( (lv_xUnits_3_0= ruleXUnit ) ) ( (lv_yUnits_4_0= ruleYUnit ) ) ( (lv_zUnits_5_0= ruleZUnit ) ) ( (lv_fill_6_0= ruleColor ) ) ( (lv_source_7_0= ruleSource ) ) ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:759:1: (otherlv_0= 'brick' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= 'units' ( (lv_xUnits_3_0= ruleXUnit ) ) ( (lv_yUnits_4_0= ruleYUnit ) ) ( (lv_zUnits_5_0= ruleZUnit ) ) ( (lv_fill_6_0= ruleColor ) ) ( (lv_source_7_0= ruleSource ) ) )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:759:1: (otherlv_0= 'brick' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= 'units' ( (lv_xUnits_3_0= ruleXUnit ) ) ( (lv_yUnits_4_0= ruleYUnit ) ) ( (lv_zUnits_5_0= ruleZUnit ) ) ( (lv_fill_6_0= ruleColor ) ) ( (lv_source_7_0= ruleSource ) ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:759:3: otherlv_0= 'brick' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= 'units' ( (lv_xUnits_3_0= ruleXUnit ) ) ( (lv_yUnits_4_0= ruleYUnit ) ) ( (lv_zUnits_5_0= ruleZUnit ) ) ( (lv_fill_6_0= ruleColor ) ) ( (lv_source_7_0= ruleSource ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleBrick1633); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBrickAccess().getBrickKeyword_0());
                  
            }
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:763:1: ( (lv_name_1_0= ruleValidID ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:764:1: (lv_name_1_0= ruleValidID )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:764:1: (lv_name_1_0= ruleValidID )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:765:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBrickAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleBrick1654);
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

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleBrick1666); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBrickAccess().getUnitsKeyword_2());
                  
            }
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:785:1: ( (lv_xUnits_3_0= ruleXUnit ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:786:1: (lv_xUnits_3_0= ruleXUnit )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:786:1: (lv_xUnits_3_0= ruleXUnit )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:787:3: lv_xUnits_3_0= ruleXUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBrickAccess().getXUnitsXUnitParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXUnit_in_ruleBrick1687);
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

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:803:2: ( (lv_yUnits_4_0= ruleYUnit ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:804:1: (lv_yUnits_4_0= ruleYUnit )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:804:1: (lv_yUnits_4_0= ruleYUnit )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:805:3: lv_yUnits_4_0= ruleYUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBrickAccess().getYUnitsYUnitParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleYUnit_in_ruleBrick1708);
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

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:821:2: ( (lv_zUnits_5_0= ruleZUnit ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:822:1: (lv_zUnits_5_0= ruleZUnit )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:822:1: (lv_zUnits_5_0= ruleZUnit )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:823:3: lv_zUnits_5_0= ruleZUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBrickAccess().getZUnitsZUnitParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleZUnit_in_ruleBrick1729);
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

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:839:2: ( (lv_fill_6_0= ruleColor ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:840:1: (lv_fill_6_0= ruleColor )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:840:1: (lv_fill_6_0= ruleColor )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:841:3: lv_fill_6_0= ruleColor
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBrickAccess().getFillColorParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColor_in_ruleBrick1750);
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

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:857:2: ( (lv_source_7_0= ruleSource ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:858:1: (lv_source_7_0= ruleSource )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:858:1: (lv_source_7_0= ruleSource )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:859:3: lv_source_7_0= ruleSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBrickAccess().getSourceSourceParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSource_in_ruleBrick1771);
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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:883:1: entryRuleSource returns [EObject current=null] : iv_ruleSource= ruleSource EOF ;
    public final EObject entryRuleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSource = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:884:2: (iv_ruleSource= ruleSource EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:885:2: iv_ruleSource= ruleSource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSourceRule()); 
            }
            pushFollow(FOLLOW_ruleSource_in_entryRuleSource1807);
            iv_ruleSource=ruleSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSource; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSource1817); if (state.failed) return current;

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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:892:1: ruleSource returns [EObject current=null] : (this_Generated_0= ruleGenerated | this_FxmlInclude_1= ruleFxmlInclude ) ;
    public final EObject ruleSource() throws RecognitionException {
        EObject current = null;

        EObject this_Generated_0 = null;

        EObject this_FxmlInclude_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:895:28: ( (this_Generated_0= ruleGenerated | this_FxmlInclude_1= ruleFxmlInclude ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:896:1: (this_Generated_0= ruleGenerated | this_FxmlInclude_1= ruleFxmlInclude )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:896:1: (this_Generated_0= ruleGenerated | this_FxmlInclude_1= ruleFxmlInclude )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            else if ( (LA7_0==28) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:897:5: this_Generated_0= ruleGenerated
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSourceAccess().getGeneratedParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGenerated_in_ruleSource1864);
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
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:907:5: this_FxmlInclude_1= ruleFxmlInclude
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSourceAccess().getFxmlIncludeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFxmlInclude_in_ruleSource1891);
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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:923:1: entryRuleGenerated returns [EObject current=null] : iv_ruleGenerated= ruleGenerated EOF ;
    public final EObject entryRuleGenerated() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerated = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:924:2: (iv_ruleGenerated= ruleGenerated EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:925:2: iv_ruleGenerated= ruleGenerated EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGeneratedRule()); 
            }
            pushFollow(FOLLOW_ruleGenerated_in_entryRuleGenerated1926);
            iv_ruleGenerated=ruleGenerated();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGenerated; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenerated1936); if (state.failed) return current;

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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:932:1: ruleGenerated returns [EObject current=null] : (otherlv_0= 'generated' () ( ( (lv_type_2_0= 'box' ) ) ( (lv_width_3_0= RULE_FLOAT ) ) ( (lv_height_4_0= RULE_FLOAT ) ) ( (lv_depth_5_0= RULE_FLOAT ) ) (otherlv_6= 'origin' ( (lv_originX_7_0= RULE_FLOAT ) ) ( (lv_originY_8_0= RULE_FLOAT ) ) ( (lv_originZ_9_0= RULE_FLOAT ) ) )? )? ) ;
    public final EObject ruleGenerated() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_2_0=null;
        Token lv_width_3_0=null;
        Token lv_height_4_0=null;
        Token lv_depth_5_0=null;
        Token otherlv_6=null;
        Token lv_originX_7_0=null;
        Token lv_originY_8_0=null;
        Token lv_originZ_9_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:935:28: ( (otherlv_0= 'generated' () ( ( (lv_type_2_0= 'box' ) ) ( (lv_width_3_0= RULE_FLOAT ) ) ( (lv_height_4_0= RULE_FLOAT ) ) ( (lv_depth_5_0= RULE_FLOAT ) ) (otherlv_6= 'origin' ( (lv_originX_7_0= RULE_FLOAT ) ) ( (lv_originY_8_0= RULE_FLOAT ) ) ( (lv_originZ_9_0= RULE_FLOAT ) ) )? )? ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:936:1: (otherlv_0= 'generated' () ( ( (lv_type_2_0= 'box' ) ) ( (lv_width_3_0= RULE_FLOAT ) ) ( (lv_height_4_0= RULE_FLOAT ) ) ( (lv_depth_5_0= RULE_FLOAT ) ) (otherlv_6= 'origin' ( (lv_originX_7_0= RULE_FLOAT ) ) ( (lv_originY_8_0= RULE_FLOAT ) ) ( (lv_originZ_9_0= RULE_FLOAT ) ) )? )? )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:936:1: (otherlv_0= 'generated' () ( ( (lv_type_2_0= 'box' ) ) ( (lv_width_3_0= RULE_FLOAT ) ) ( (lv_height_4_0= RULE_FLOAT ) ) ( (lv_depth_5_0= RULE_FLOAT ) ) (otherlv_6= 'origin' ( (lv_originX_7_0= RULE_FLOAT ) ) ( (lv_originY_8_0= RULE_FLOAT ) ) ( (lv_originZ_9_0= RULE_FLOAT ) ) )? )? )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:936:3: otherlv_0= 'generated' () ( ( (lv_type_2_0= 'box' ) ) ( (lv_width_3_0= RULE_FLOAT ) ) ( (lv_height_4_0= RULE_FLOAT ) ) ( (lv_depth_5_0= RULE_FLOAT ) ) (otherlv_6= 'origin' ( (lv_originX_7_0= RULE_FLOAT ) ) ( (lv_originY_8_0= RULE_FLOAT ) ) ( (lv_originZ_9_0= RULE_FLOAT ) ) )? )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleGenerated1973); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGeneratedAccess().getGeneratedKeyword_0());
                  
            }
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:940:1: ()
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:941:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGeneratedAccess().getGeneratedAction_1(),
                          current);
                  
            }

            }

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:946:2: ( ( (lv_type_2_0= 'box' ) ) ( (lv_width_3_0= RULE_FLOAT ) ) ( (lv_height_4_0= RULE_FLOAT ) ) ( (lv_depth_5_0= RULE_FLOAT ) ) (otherlv_6= 'origin' ( (lv_originX_7_0= RULE_FLOAT ) ) ( (lv_originY_8_0= RULE_FLOAT ) ) ( (lv_originZ_9_0= RULE_FLOAT ) ) )? )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:946:3: ( (lv_type_2_0= 'box' ) ) ( (lv_width_3_0= RULE_FLOAT ) ) ( (lv_height_4_0= RULE_FLOAT ) ) ( (lv_depth_5_0= RULE_FLOAT ) ) (otherlv_6= 'origin' ( (lv_originX_7_0= RULE_FLOAT ) ) ( (lv_originY_8_0= RULE_FLOAT ) ) ( (lv_originZ_9_0= RULE_FLOAT ) ) )?
                    {
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:946:3: ( (lv_type_2_0= 'box' ) )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:947:1: (lv_type_2_0= 'box' )
                    {
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:947:1: (lv_type_2_0= 'box' )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:948:3: lv_type_2_0= 'box'
                    {
                    lv_type_2_0=(Token)match(input,26,FOLLOW_26_in_ruleGenerated2001); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_2_0, grammarAccess.getGeneratedAccess().getTypeBoxKeyword_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getGeneratedRule());
                      	        }
                             		setWithLastConsumed(current, "type", lv_type_2_0, "box");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:961:2: ( (lv_width_3_0= RULE_FLOAT ) )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:962:1: (lv_width_3_0= RULE_FLOAT )
                    {
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:962:1: (lv_width_3_0= RULE_FLOAT )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:963:3: lv_width_3_0= RULE_FLOAT
                    {
                    lv_width_3_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleGenerated2031); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_width_3_0, grammarAccess.getGeneratedAccess().getWidthFLOATTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getGeneratedRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"width",
                              		lv_width_3_0, 
                              		"FLOAT");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:979:2: ( (lv_height_4_0= RULE_FLOAT ) )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:980:1: (lv_height_4_0= RULE_FLOAT )
                    {
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:980:1: (lv_height_4_0= RULE_FLOAT )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:981:3: lv_height_4_0= RULE_FLOAT
                    {
                    lv_height_4_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleGenerated2053); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_height_4_0, grammarAccess.getGeneratedAccess().getHeightFLOATTerminalRuleCall_2_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getGeneratedRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"height",
                              		lv_height_4_0, 
                              		"FLOAT");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:997:2: ( (lv_depth_5_0= RULE_FLOAT ) )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:998:1: (lv_depth_5_0= RULE_FLOAT )
                    {
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:998:1: (lv_depth_5_0= RULE_FLOAT )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:999:3: lv_depth_5_0= RULE_FLOAT
                    {
                    lv_depth_5_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleGenerated2075); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_depth_5_0, grammarAccess.getGeneratedAccess().getDepthFLOATTerminalRuleCall_2_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getGeneratedRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"depth",
                              		lv_depth_5_0, 
                              		"FLOAT");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1015:2: (otherlv_6= 'origin' ( (lv_originX_7_0= RULE_FLOAT ) ) ( (lv_originY_8_0= RULE_FLOAT ) ) ( (lv_originZ_9_0= RULE_FLOAT ) ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==27) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1015:4: otherlv_6= 'origin' ( (lv_originX_7_0= RULE_FLOAT ) ) ( (lv_originY_8_0= RULE_FLOAT ) ) ( (lv_originZ_9_0= RULE_FLOAT ) )
                            {
                            otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleGenerated2093); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getGeneratedAccess().getOriginKeyword_2_4_0());
                                  
                            }
                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1019:1: ( (lv_originX_7_0= RULE_FLOAT ) )
                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1020:1: (lv_originX_7_0= RULE_FLOAT )
                            {
                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1020:1: (lv_originX_7_0= RULE_FLOAT )
                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1021:3: lv_originX_7_0= RULE_FLOAT
                            {
                            lv_originX_7_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleGenerated2110); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_originX_7_0, grammarAccess.getGeneratedAccess().getOriginXFLOATTerminalRuleCall_2_4_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getGeneratedRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"originX",
                                      		lv_originX_7_0, 
                                      		"FLOAT");
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1037:2: ( (lv_originY_8_0= RULE_FLOAT ) )
                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1038:1: (lv_originY_8_0= RULE_FLOAT )
                            {
                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1038:1: (lv_originY_8_0= RULE_FLOAT )
                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1039:3: lv_originY_8_0= RULE_FLOAT
                            {
                            lv_originY_8_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleGenerated2132); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_originY_8_0, grammarAccess.getGeneratedAccess().getOriginYFLOATTerminalRuleCall_2_4_2_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getGeneratedRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"originY",
                                      		lv_originY_8_0, 
                                      		"FLOAT");
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1055:2: ( (lv_originZ_9_0= RULE_FLOAT ) )
                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1056:1: (lv_originZ_9_0= RULE_FLOAT )
                            {
                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1056:1: (lv_originZ_9_0= RULE_FLOAT )
                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1057:3: lv_originZ_9_0= RULE_FLOAT
                            {
                            lv_originZ_9_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleGenerated2154); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_originZ_9_0, grammarAccess.getGeneratedAccess().getOriginZFLOATTerminalRuleCall_2_4_3_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getGeneratedRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"originZ",
                                      		lv_originZ_9_0, 
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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1081:1: entryRuleFxmlInclude returns [EObject current=null] : iv_ruleFxmlInclude= ruleFxmlInclude EOF ;
    public final EObject entryRuleFxmlInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFxmlInclude = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1082:2: (iv_ruleFxmlInclude= ruleFxmlInclude EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1083:2: iv_ruleFxmlInclude= ruleFxmlInclude EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFxmlIncludeRule()); 
            }
            pushFollow(FOLLOW_ruleFxmlInclude_in_entryRuleFxmlInclude2199);
            iv_ruleFxmlInclude=ruleFxmlInclude();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFxmlInclude; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFxmlInclude2209); if (state.failed) return current;

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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1090:1: ruleFxmlInclude returns [EObject current=null] : (otherlv_0= 'fxml' ( (lv_source3d_1_0= RULE_STRING ) ) (otherlv_2= 'origin' ( (lv_originX_3_0= RULE_FLOAT ) ) ( (lv_originY_4_0= RULE_FLOAT ) ) ( (lv_originZ_5_0= RULE_FLOAT ) ) )? ) ;
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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1093:28: ( (otherlv_0= 'fxml' ( (lv_source3d_1_0= RULE_STRING ) ) (otherlv_2= 'origin' ( (lv_originX_3_0= RULE_FLOAT ) ) ( (lv_originY_4_0= RULE_FLOAT ) ) ( (lv_originZ_5_0= RULE_FLOAT ) ) )? ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1094:1: (otherlv_0= 'fxml' ( (lv_source3d_1_0= RULE_STRING ) ) (otherlv_2= 'origin' ( (lv_originX_3_0= RULE_FLOAT ) ) ( (lv_originY_4_0= RULE_FLOAT ) ) ( (lv_originZ_5_0= RULE_FLOAT ) ) )? )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1094:1: (otherlv_0= 'fxml' ( (lv_source3d_1_0= RULE_STRING ) ) (otherlv_2= 'origin' ( (lv_originX_3_0= RULE_FLOAT ) ) ( (lv_originY_4_0= RULE_FLOAT ) ) ( (lv_originZ_5_0= RULE_FLOAT ) ) )? )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1094:3: otherlv_0= 'fxml' ( (lv_source3d_1_0= RULE_STRING ) ) (otherlv_2= 'origin' ( (lv_originX_3_0= RULE_FLOAT ) ) ( (lv_originY_4_0= RULE_FLOAT ) ) ( (lv_originZ_5_0= RULE_FLOAT ) ) )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleFxmlInclude2246); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFxmlIncludeAccess().getFxmlKeyword_0());
                  
            }
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1098:1: ( (lv_source3d_1_0= RULE_STRING ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1099:1: (lv_source3d_1_0= RULE_STRING )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1099:1: (lv_source3d_1_0= RULE_STRING )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1100:3: lv_source3d_1_0= RULE_STRING
            {
            lv_source3d_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFxmlInclude2263); if (state.failed) return current;
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

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1116:2: (otherlv_2= 'origin' ( (lv_originX_3_0= RULE_FLOAT ) ) ( (lv_originY_4_0= RULE_FLOAT ) ) ( (lv_originZ_5_0= RULE_FLOAT ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1116:4: otherlv_2= 'origin' ( (lv_originX_3_0= RULE_FLOAT ) ) ( (lv_originY_4_0= RULE_FLOAT ) ) ( (lv_originZ_5_0= RULE_FLOAT ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleFxmlInclude2281); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFxmlIncludeAccess().getOriginKeyword_2_0());
                          
                    }
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1120:1: ( (lv_originX_3_0= RULE_FLOAT ) )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1121:1: (lv_originX_3_0= RULE_FLOAT )
                    {
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1121:1: (lv_originX_3_0= RULE_FLOAT )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1122:3: lv_originX_3_0= RULE_FLOAT
                    {
                    lv_originX_3_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFxmlInclude2298); if (state.failed) return current;
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

                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1138:2: ( (lv_originY_4_0= RULE_FLOAT ) )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1139:1: (lv_originY_4_0= RULE_FLOAT )
                    {
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1139:1: (lv_originY_4_0= RULE_FLOAT )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1140:3: lv_originY_4_0= RULE_FLOAT
                    {
                    lv_originY_4_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFxmlInclude2320); if (state.failed) return current;
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

                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1156:2: ( (lv_originZ_5_0= RULE_FLOAT ) )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1157:1: (lv_originZ_5_0= RULE_FLOAT )
                    {
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1157:1: (lv_originZ_5_0= RULE_FLOAT )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1158:3: lv_originZ_5_0= RULE_FLOAT
                    {
                    lv_originZ_5_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFxmlInclude2342); if (state.failed) return current;
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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1182:1: entryRuleAssembly returns [EObject current=null] : iv_ruleAssembly= ruleAssembly EOF ;
    public final EObject entryRuleAssembly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssembly = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1183:2: (iv_ruleAssembly= ruleAssembly EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1184:2: iv_ruleAssembly= ruleAssembly EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssemblyRule()); 
            }
            pushFollow(FOLLOW_ruleAssembly_in_entryRuleAssembly2385);
            iv_ruleAssembly=ruleAssembly();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssembly; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssembly2395); if (state.failed) return current;

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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1191:1: ruleAssembly returns [EObject current=null] : (otherlv_0= 'assembly' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (lv_items_3_0= ruleAssemblyItem ) )+ otherlv_4= '}' ) ;
    public final EObject ruleAssembly() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_items_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1194:28: ( (otherlv_0= 'assembly' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (lv_items_3_0= ruleAssemblyItem ) )+ otherlv_4= '}' ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1195:1: (otherlv_0= 'assembly' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (lv_items_3_0= ruleAssemblyItem ) )+ otherlv_4= '}' )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1195:1: (otherlv_0= 'assembly' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (lv_items_3_0= ruleAssemblyItem ) )+ otherlv_4= '}' )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1195:3: otherlv_0= 'assembly' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (lv_items_3_0= ruleAssemblyItem ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleAssembly2432); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAssemblyAccess().getAssemblyKeyword_0());
                  
            }
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1199:1: ( (lv_name_1_0= ruleValidID ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1200:1: (lv_name_1_0= ruleValidID )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1200:1: (lv_name_1_0= ruleValidID )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1201:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssemblyAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleAssembly2453);
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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleAssembly2465); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAssemblyAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1221:1: ( (lv_items_3_0= ruleAssemblyItem ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1222:1: (lv_items_3_0= ruleAssemblyItem )
            	    {
            	    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1222:1: (lv_items_3_0= ruleAssemblyItem )
            	    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1223:3: lv_items_3_0= ruleAssemblyItem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssemblyAccess().getItemsAssemblyItemParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssemblyItem_in_ruleAssembly2486);
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
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleAssembly2499); if (state.failed) return current;
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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1251:1: entryRuleAssemblyItem returns [EObject current=null] : iv_ruleAssemblyItem= ruleAssemblyItem EOF ;
    public final EObject entryRuleAssemblyItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyItem = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1252:2: (iv_ruleAssemblyItem= ruleAssemblyItem EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1253:2: iv_ruleAssemblyItem= ruleAssemblyItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssemblyItemRule()); 
            }
            pushFollow(FOLLOW_ruleAssemblyItem_in_entryRuleAssemblyItem2535);
            iv_ruleAssemblyItem=ruleAssemblyItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssemblyItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssemblyItem2545); if (state.failed) return current;

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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1260:1: ruleAssemblyItem returns [EObject current=null] : (this_RasterAssemblyItem_0= ruleRasterAssemblyItem | this_MountedAssemblyItem_1= ruleMountedAssemblyItem ) ;
    public final EObject ruleAssemblyItem() throws RecognitionException {
        EObject current = null;

        EObject this_RasterAssemblyItem_0 = null;

        EObject this_MountedAssemblyItem_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1263:28: ( (this_RasterAssemblyItem_0= ruleRasterAssemblyItem | this_MountedAssemblyItem_1= ruleMountedAssemblyItem ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1264:1: (this_RasterAssemblyItem_0= ruleRasterAssemblyItem | this_MountedAssemblyItem_1= ruleMountedAssemblyItem )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1264:1: (this_RasterAssemblyItem_0= ruleRasterAssemblyItem | this_MountedAssemblyItem_1= ruleMountedAssemblyItem )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1265:5: this_RasterAssemblyItem_0= ruleRasterAssemblyItem
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssemblyItemAccess().getRasterAssemblyItemParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRasterAssemblyItem_in_ruleAssemblyItem2592);
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
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1275:5: this_MountedAssemblyItem_1= ruleMountedAssemblyItem
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssemblyItemAccess().getMountedAssemblyItemParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMountedAssemblyItem_in_ruleAssemblyItem2619);
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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1291:1: entryRuleRasterAssemblyItem returns [EObject current=null] : iv_ruleRasterAssemblyItem= ruleRasterAssemblyItem EOF ;
    public final EObject entryRuleRasterAssemblyItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRasterAssemblyItem = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1292:2: (iv_ruleRasterAssemblyItem= ruleRasterAssemblyItem EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1293:2: iv_ruleRasterAssemblyItem= ruleRasterAssemblyItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRasterAssemblyItemRule()); 
            }
            pushFollow(FOLLOW_ruleRasterAssemblyItem_in_entryRuleRasterAssemblyItem2654);
            iv_ruleRasterAssemblyItem=ruleRasterAssemblyItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRasterAssemblyItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRasterAssemblyItem2664); if (state.failed) return current;

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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1300:1: ruleRasterAssemblyItem returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'pos' ( (lv_xUnits_2_0= ruleXUnit ) ) ( (lv_yUnits_3_0= ruleYUnit ) ) ( (lv_zUnits_4_0= ruleZUnit ) ) (otherlv_5= 'transform' ( ( (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' ) ) ) )? ) ;
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
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1303:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'pos' ( (lv_xUnits_2_0= ruleXUnit ) ) ( (lv_yUnits_3_0= ruleYUnit ) ) ( (lv_zUnits_4_0= ruleZUnit ) ) (otherlv_5= 'transform' ( ( (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' ) ) ) )? ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1304:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'pos' ( (lv_xUnits_2_0= ruleXUnit ) ) ( (lv_yUnits_3_0= ruleYUnit ) ) ( (lv_zUnits_4_0= ruleZUnit ) ) (otherlv_5= 'transform' ( ( (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' ) ) ) )? )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1304:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'pos' ( (lv_xUnits_2_0= ruleXUnit ) ) ( (lv_yUnits_3_0= ruleYUnit ) ) ( (lv_zUnits_4_0= ruleZUnit ) ) (otherlv_5= 'transform' ( ( (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' ) ) ) )? )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1304:2: ( ( ruleQualifiedName ) ) otherlv_1= 'pos' ( (lv_xUnits_2_0= ruleXUnit ) ) ( (lv_yUnits_3_0= ruleYUnit ) ) ( (lv_zUnits_4_0= ruleZUnit ) ) (otherlv_5= 'transform' ( ( (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' ) ) ) )?
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1304:2: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1305:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1305:1: ( ruleQualifiedName )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1306:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getRasterAssemblyItemRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRasterAssemblyItemAccess().getElementRasterItemCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRasterAssemblyItem2712);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleRasterAssemblyItem2724); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRasterAssemblyItemAccess().getPosKeyword_1());
                  
            }
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1323:1: ( (lv_xUnits_2_0= ruleXUnit ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1324:1: (lv_xUnits_2_0= ruleXUnit )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1324:1: (lv_xUnits_2_0= ruleXUnit )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1325:3: lv_xUnits_2_0= ruleXUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRasterAssemblyItemAccess().getXUnitsXUnitParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXUnit_in_ruleRasterAssemblyItem2745);
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

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1341:2: ( (lv_yUnits_3_0= ruleYUnit ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1342:1: (lv_yUnits_3_0= ruleYUnit )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1342:1: (lv_yUnits_3_0= ruleYUnit )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1343:3: lv_yUnits_3_0= ruleYUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRasterAssemblyItemAccess().getYUnitsYUnitParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleYUnit_in_ruleRasterAssemblyItem2766);
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

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1359:2: ( (lv_zUnits_4_0= ruleZUnit ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1360:1: (lv_zUnits_4_0= ruleZUnit )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1360:1: (lv_zUnits_4_0= ruleZUnit )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1361:3: lv_zUnits_4_0= ruleZUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRasterAssemblyItemAccess().getZUnitsZUnitParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleZUnit_in_ruleRasterAssemblyItem2787);
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

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1377:2: (otherlv_5= 'transform' ( ( (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' ) ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1377:4: otherlv_5= 'transform' ( ( (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' ) ) )
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleRasterAssemblyItem2800); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getRasterAssemblyItemAccess().getTransformKeyword_5_0());
                          
                    }
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1381:1: ( ( (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' ) ) )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1382:1: ( (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' ) )
                    {
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1382:1: ( (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' ) )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1383:1: (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' )
                    {
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1383:1: (lv_transform_6_1= 'rotate180' | lv_transform_6_2= 'rotate90' | lv_transform_6_3= 'rotate270' )
                    int alt13=3;
                    switch ( input.LA(1) ) {
                    case 32:
                        {
                        alt13=1;
                        }
                        break;
                    case 33:
                        {
                        alt13=2;
                        }
                        break;
                    case 34:
                        {
                        alt13=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }

                    switch (alt13) {
                        case 1 :
                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1384:3: lv_transform_6_1= 'rotate180'
                            {
                            lv_transform_6_1=(Token)match(input,32,FOLLOW_32_in_ruleRasterAssemblyItem2820); if (state.failed) return current;
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
                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1396:8: lv_transform_6_2= 'rotate90'
                            {
                            lv_transform_6_2=(Token)match(input,33,FOLLOW_33_in_ruleRasterAssemblyItem2849); if (state.failed) return current;
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
                            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1408:8: lv_transform_6_3= 'rotate270'
                            {
                            lv_transform_6_3=(Token)match(input,34,FOLLOW_34_in_ruleRasterAssemblyItem2878); if (state.failed) return current;
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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1431:1: entryRuleMountedAssemblyItem returns [EObject current=null] : iv_ruleMountedAssemblyItem= ruleMountedAssemblyItem EOF ;
    public final EObject entryRuleMountedAssemblyItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMountedAssemblyItem = null;


        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1432:2: (iv_ruleMountedAssemblyItem= ruleMountedAssemblyItem EOF )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1433:2: iv_ruleMountedAssemblyItem= ruleMountedAssemblyItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMountedAssemblyItemRule()); 
            }
            pushFollow(FOLLOW_ruleMountedAssemblyItem_in_entryRuleMountedAssemblyItem2932);
            iv_ruleMountedAssemblyItem=ruleMountedAssemblyItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMountedAssemblyItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMountedAssemblyItem2942); if (state.failed) return current;

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
    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1440:1: ruleMountedAssemblyItem returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'pos' ( (lv_xUnits_2_0= RULE_FLOAT ) ) ( (lv_yUnits_3_0= RULE_FLOAT ) ) ( (lv_zUnits_4_0= RULE_FLOAT ) ) (otherlv_5= 'transform' ( (lv_rotateX_6_0= RULE_FLOAT ) ) ( (lv_rotateY_7_0= RULE_FLOAT ) ) ( (lv_rotateZ_8_0= RULE_FLOAT ) ) )? (otherlv_9= 'actions' ( (lv_actions_10_0= ruleAction ) )+ )? ) ;
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
        Token otherlv_9=null;
        EObject lv_actions_10_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1443:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'pos' ( (lv_xUnits_2_0= RULE_FLOAT ) ) ( (lv_yUnits_3_0= RULE_FLOAT ) ) ( (lv_zUnits_4_0= RULE_FLOAT ) ) (otherlv_5= 'transform' ( (lv_rotateX_6_0= RULE_FLOAT ) ) ( (lv_rotateY_7_0= RULE_FLOAT ) ) ( (lv_rotateZ_8_0= RULE_FLOAT ) ) )? (otherlv_9= 'actions' ( (lv_actions_10_0= ruleAction ) )+ )? ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1444:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'pos' ( (lv_xUnits_2_0= RULE_FLOAT ) ) ( (lv_yUnits_3_0= RULE_FLOAT ) ) ( (lv_zUnits_4_0= RULE_FLOAT ) ) (otherlv_5= 'transform' ( (lv_rotateX_6_0= RULE_FLOAT ) ) ( (lv_rotateY_7_0= RULE_FLOAT ) ) ( (lv_rotateZ_8_0= RULE_FLOAT ) ) )? (otherlv_9= 'actions' ( (lv_actions_10_0= ruleAction ) )+ )? )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1444:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'pos' ( (lv_xUnits_2_0= RULE_FLOAT ) ) ( (lv_yUnits_3_0= RULE_FLOAT ) ) ( (lv_zUnits_4_0= RULE_FLOAT ) ) (otherlv_5= 'transform' ( (lv_rotateX_6_0= RULE_FLOAT ) ) ( (lv_rotateY_7_0= RULE_FLOAT ) ) ( (lv_rotateZ_8_0= RULE_FLOAT ) ) )? (otherlv_9= 'actions' ( (lv_actions_10_0= ruleAction ) )+ )? )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1444:2: ( ( ruleQualifiedName ) ) otherlv_1= 'pos' ( (lv_xUnits_2_0= RULE_FLOAT ) ) ( (lv_yUnits_3_0= RULE_FLOAT ) ) ( (lv_zUnits_4_0= RULE_FLOAT ) ) (otherlv_5= 'transform' ( (lv_rotateX_6_0= RULE_FLOAT ) ) ( (lv_rotateY_7_0= RULE_FLOAT ) ) ( (lv_rotateZ_8_0= RULE_FLOAT ) ) )? (otherlv_9= 'actions' ( (lv_actions_10_0= ruleAction ) )+ )?
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1444:2: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1445:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1445:1: ( ruleQualifiedName )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1446:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMountedAssemblyItemRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMountedAssemblyItemAccess().getElementMountedPartCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleMountedAssemblyItem2990);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleMountedAssemblyItem3002); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMountedAssemblyItemAccess().getPosKeyword_1());
                  
            }
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1463:1: ( (lv_xUnits_2_0= RULE_FLOAT ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1464:1: (lv_xUnits_2_0= RULE_FLOAT )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1464:1: (lv_xUnits_2_0= RULE_FLOAT )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1465:3: lv_xUnits_2_0= RULE_FLOAT
            {
            lv_xUnits_2_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleMountedAssemblyItem3019); if (state.failed) return current;
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

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1481:2: ( (lv_yUnits_3_0= RULE_FLOAT ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1482:1: (lv_yUnits_3_0= RULE_FLOAT )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1482:1: (lv_yUnits_3_0= RULE_FLOAT )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1483:3: lv_yUnits_3_0= RULE_FLOAT
            {
            lv_yUnits_3_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleMountedAssemblyItem3041); if (state.failed) return current;
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

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1499:2: ( (lv_zUnits_4_0= RULE_FLOAT ) )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1500:1: (lv_zUnits_4_0= RULE_FLOAT )
            {
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1500:1: (lv_zUnits_4_0= RULE_FLOAT )
            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1501:3: lv_zUnits_4_0= RULE_FLOAT
            {
            lv_zUnits_4_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleMountedAssemblyItem3063); if (state.failed) return current;
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

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1517:2: (otherlv_5= 'transform' ( (lv_rotateX_6_0= RULE_FLOAT ) ) ( (lv_rotateY_7_0= RULE_FLOAT ) ) ( (lv_rotateZ_8_0= RULE_FLOAT ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1517:4: otherlv_5= 'transform' ( (lv_rotateX_6_0= RULE_FLOAT ) ) ( (lv_rotateY_7_0= RULE_FLOAT ) ) ( (lv_rotateZ_8_0= RULE_FLOAT ) )
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleMountedAssemblyItem3081); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getMountedAssemblyItemAccess().getTransformKeyword_5_0());
                          
                    }
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1521:1: ( (lv_rotateX_6_0= RULE_FLOAT ) )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1522:1: (lv_rotateX_6_0= RULE_FLOAT )
                    {
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1522:1: (lv_rotateX_6_0= RULE_FLOAT )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1523:3: lv_rotateX_6_0= RULE_FLOAT
                    {
                    lv_rotateX_6_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleMountedAssemblyItem3098); if (state.failed) return current;
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

                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1539:2: ( (lv_rotateY_7_0= RULE_FLOAT ) )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1540:1: (lv_rotateY_7_0= RULE_FLOAT )
                    {
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1540:1: (lv_rotateY_7_0= RULE_FLOAT )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1541:3: lv_rotateY_7_0= RULE_FLOAT
                    {
                    lv_rotateY_7_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleMountedAssemblyItem3120); if (state.failed) return current;
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

                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1557:2: ( (lv_rotateZ_8_0= RULE_FLOAT ) )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1558:1: (lv_rotateZ_8_0= RULE_FLOAT )
                    {
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1558:1: (lv_rotateZ_8_0= RULE_FLOAT )
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1559:3: lv_rotateZ_8_0= RULE_FLOAT
                    {
                    lv_rotateZ_8_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleMountedAssemblyItem3142); if (state.failed) return current;
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

            // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1575:4: (otherlv_9= 'actions' ( (lv_actions_10_0= ruleAction ) )+ )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1575:6: otherlv_9= 'actions' ( (lv_actions_10_0= ruleAction ) )+
                    {
                    otherlv_9=(Token)match(input,35,FOLLOW_35_in_ruleMountedAssemblyItem3162); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getMountedAssemblyItemAccess().getActionsKeyword_6_0());
                          
                    }
                    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1579:1: ( (lv_actions_10_0= ruleAction ) )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_ID) ) {
                            int LA16_2 = input.LA(2);

                            if ( (LA16_2==16) ) {
                                alt16=1;
                            }


                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1580:1: (lv_actions_10_0= ruleAction )
                    	    {
                    	    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1580:1: (lv_actions_10_0= ruleAction )
                    	    // ../at.bestsolution.lego/src-gen/at/bestsolution/lego/parser/antlr/internal/InternalLego.g:1581:3: lv_actions_10_0= ruleAction
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMountedAssemblyItemAccess().getActionsActionParserRuleCall_6_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAction_in_ruleMountedAssemblyItem3183);
                    	    lv_actions_10_0=ruleAction();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMountedAssemblyItemRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"actions",
                    	              		lv_actions_10_0, 
                    	              		"Action");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
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


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\7\uffff";
    static final String DFA12_eofS =
        "\7\uffff";
    static final String DFA12_minS =
        "\1\4\1\14\1\4\1\5\1\14\2\uffff";
    static final String DFA12_maxS =
        "\1\4\1\36\1\4\1\6\1\36\2\uffff";
    static final String DFA12_acceptS =
        "\5\uffff\1\2\1\1";
    static final String DFA12_specialS =
        "\7\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1",
            "\1\2\21\uffff\1\3",
            "\1\4",
            "\1\5\1\6",
            "\1\2\21\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1264:1: (this_RasterAssemblyItem_0= ruleRasterAssemblyItem | this_MountedAssemblyItem_1= ruleMountedAssemblyItem )";
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
    public static final BitSet FOLLOW_13_in_ruleItemRepository514 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_ruleRepostoryItem_in_ruleItemRepository535 = new BitSet(new long[]{0x000000000080C000L});
    public static final BitSet FOLLOW_14_in_ruleItemRepository548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMountedPart_in_entryRuleMountedPart588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMountedPart598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleMountedPart635 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleMountedPart656 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleMountedPart677 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_ruleSource_in_ruleMountedPart698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAction786 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAction809 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_17_in_ruleAction842 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18_in_ruleAction871 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19_in_ruleAction900 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleAction933 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAction950 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAction967 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleAction985 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAction1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepostoryItem_in_entryRuleRepostoryItem1045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepostoryItem1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrick_in_ruleRepostoryItem1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMountedPart_in_ruleRepostoryItem1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor1164 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleColor1211 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleColor1228 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleColor1250 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleColor1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnit_in_entryRuleXUnit1313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnit1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXUnit1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYUnit_in_entryRuleYUnit1404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleYUnit1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleYUnit1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZUnit_in_entryRuleZUnit1495 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleZUnit1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleZUnit1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBrick_in_entryRuleBrick1586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBrick1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleBrick1633 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleBrick1654 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleBrick1666 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleXUnit_in_ruleBrick1687 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleYUnit_in_ruleBrick1708 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleZUnit_in_ruleBrick1729 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleBrick1750 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_ruleSource_in_ruleBrick1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSource_in_entryRuleSource1807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSource1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerated_in_ruleSource1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFxmlInclude_in_ruleSource1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerated_in_entryRuleGenerated1926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenerated1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleGenerated1973 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleGenerated2001 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleGenerated2031 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleGenerated2053 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleGenerated2075 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleGenerated2093 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleGenerated2110 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleGenerated2132 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleGenerated2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFxmlInclude_in_entryRuleFxmlInclude2199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFxmlInclude2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleFxmlInclude2246 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFxmlInclude2263 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleFxmlInclude2281 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFxmlInclude2298 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFxmlInclude2320 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFxmlInclude2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssembly_in_entryRuleAssembly2385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssembly2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleAssembly2432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleAssembly2453 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAssembly2465 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAssemblyItem_in_ruleAssembly2486 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleAssembly2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssemblyItem_in_entryRuleAssemblyItem2535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssemblyItem2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRasterAssemblyItem_in_ruleAssemblyItem2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMountedAssemblyItem_in_ruleAssemblyItem2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRasterAssemblyItem_in_entryRuleRasterAssemblyItem2654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRasterAssemblyItem2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRasterAssemblyItem2712 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleRasterAssemblyItem2724 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleXUnit_in_ruleRasterAssemblyItem2745 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleYUnit_in_ruleRasterAssemblyItem2766 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleZUnit_in_ruleRasterAssemblyItem2787 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleRasterAssemblyItem2800 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_32_in_ruleRasterAssemblyItem2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleRasterAssemblyItem2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleRasterAssemblyItem2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMountedAssemblyItem_in_entryRuleMountedAssemblyItem2932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMountedAssemblyItem2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMountedAssemblyItem2990 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleMountedAssemblyItem3002 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleMountedAssemblyItem3019 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleMountedAssemblyItem3041 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleMountedAssemblyItem3063 = new BitSet(new long[]{0x0000000880000002L});
    public static final BitSet FOLLOW_31_in_ruleMountedAssemblyItem3081 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleMountedAssemblyItem3098 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleMountedAssemblyItem3120 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleMountedAssemblyItem3142 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleMountedAssemblyItem3162 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAction_in_ruleMountedAssemblyItem3183 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_12_in_synpred1_InternalLego367 = new BitSet(new long[]{0x0000000000000002L});

}