package at.bestsolution.lego.serializer;

import at.bestsolution.lego.lego.Action;
import at.bestsolution.lego.lego.Assembly;
import at.bestsolution.lego.lego.Brick;
import at.bestsolution.lego.lego.Color;
import at.bestsolution.lego.lego.FxmlInclude;
import at.bestsolution.lego.lego.Generated;
import at.bestsolution.lego.lego.ItemRepository;
import at.bestsolution.lego.lego.LegoPackage;
import at.bestsolution.lego.lego.Model;
import at.bestsolution.lego.lego.MountedAssemblyItem;
import at.bestsolution.lego.lego.MountedPart;
import at.bestsolution.lego.lego.RasterAssemblyItem;
import at.bestsolution.lego.lego.XUnit;
import at.bestsolution.lego.lego.YUnit;
import at.bestsolution.lego.lego.ZUnit;
import at.bestsolution.lego.services.LegoGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class LegoSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LegoGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == LegoPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case LegoPackage.ACTION:
				if(context == grammarAccess.getActionRule()) {
					sequence_Action(context, (Action) semanticObject); 
					return; 
				}
				else break;
			case LegoPackage.ASSEMBLY:
				if(context == grammarAccess.getAssemblyRule() ||
				   context == grammarAccess.getLegoElementRule() ||
				   context == grammarAccess.getRasterItemRule()) {
					sequence_Assembly(context, (Assembly) semanticObject); 
					return; 
				}
				else break;
			case LegoPackage.BRICK:
				if(context == grammarAccess.getBrickRule() ||
				   context == grammarAccess.getLegoElementRule() ||
				   context == grammarAccess.getRasterItemRule() ||
				   context == grammarAccess.getRepostoryItemRule()) {
					sequence_Brick(context, (Brick) semanticObject); 
					return; 
				}
				else break;
			case LegoPackage.COLOR:
				if(context == grammarAccess.getColorRule()) {
					sequence_Color(context, (Color) semanticObject); 
					return; 
				}
				else break;
			case LegoPackage.FXML_INCLUDE:
				if(context == grammarAccess.getFxmlIncludeRule() ||
				   context == grammarAccess.getSourceRule()) {
					sequence_FxmlInclude(context, (FxmlInclude) semanticObject); 
					return; 
				}
				else break;
			case LegoPackage.GENERATED:
				if(context == grammarAccess.getGeneratedRule() ||
				   context == grammarAccess.getSourceRule()) {
					sequence_Generated(context, (Generated) semanticObject); 
					return; 
				}
				else break;
			case LegoPackage.ITEM_REPOSITORY:
				if(context == grammarAccess.getItemRepositoryRule()) {
					sequence_ItemRepository(context, (ItemRepository) semanticObject); 
					return; 
				}
				else break;
			case LegoPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case LegoPackage.MOUNTED_ASSEMBLY_ITEM:
				if(context == grammarAccess.getAssemblyItemRule() ||
				   context == grammarAccess.getMountedAssemblyItemRule()) {
					sequence_MountedAssemblyItem(context, (MountedAssemblyItem) semanticObject); 
					return; 
				}
				else break;
			case LegoPackage.MOUNTED_PART:
				if(context == grammarAccess.getLegoElementRule() ||
				   context == grammarAccess.getMountedPartRule() ||
				   context == grammarAccess.getRepostoryItemRule()) {
					sequence_MountedPart(context, (MountedPart) semanticObject); 
					return; 
				}
				else break;
			case LegoPackage.RASTER_ASSEMBLY_ITEM:
				if(context == grammarAccess.getAssemblyItemRule() ||
				   context == grammarAccess.getRasterAssemblyItemRule()) {
					sequence_RasterAssemblyItem(context, (RasterAssemblyItem) semanticObject); 
					return; 
				}
				else break;
			case LegoPackage.XUNIT:
				if(context == grammarAccess.getXUnitRule()) {
					sequence_XUnit(context, (XUnit) semanticObject); 
					return; 
				}
				else break;
			case LegoPackage.YUNIT:
				if(context == grammarAccess.getYUnitRule()) {
					sequence_YUnit(context, (YUnit) semanticObject); 
					return; 
				}
				else break;
			case LegoPackage.ZUNIT:
				if(context == grammarAccess.getZUnitRule()) {
					sequence_ZUnit(context, (ZUnit) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         type='rotate' 
	 *         (axis='x' | axis='y' | axis='z') 
	 *         angle=FLOAT 
	 *         duration=INT 
	 *         soundfile=STRING?
	 *     )
	 */
	protected void sequence_Action(EObject context, Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID items+=AssemblyItem+)
	 */
	protected void sequence_Assembly(EObject context, Assembly semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ValidID 
	 *         xUnits=XUnit 
	 *         yUnits=YUnit 
	 *         zUnits=ZUnit 
	 *         fill=Color 
	 *         source=Source
	 *     )
	 */
	protected void sequence_Brick(EObject context, Brick semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LegoPackage.Literals.LEGO_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegoPackage.Literals.LEGO_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, LegoPackage.Literals.REPOSTORY_ITEM__FILL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegoPackage.Literals.REPOSTORY_ITEM__FILL));
			if(transientValues.isValueTransient(semanticObject, LegoPackage.Literals.REPOSTORY_ITEM__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegoPackage.Literals.REPOSTORY_ITEM__SOURCE));
			if(transientValues.isValueTransient(semanticObject, LegoPackage.Literals.BRICK__XUNITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegoPackage.Literals.BRICK__XUNITS));
			if(transientValues.isValueTransient(semanticObject, LegoPackage.Literals.BRICK__YUNITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegoPackage.Literals.BRICK__YUNITS));
			if(transientValues.isValueTransient(semanticObject, LegoPackage.Literals.BRICK__ZUNITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegoPackage.Literals.BRICK__ZUNITS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBrickAccess().getNameValidIDParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getBrickAccess().getXUnitsXUnitParserRuleCall_3_0(), semanticObject.getXUnits());
		feeder.accept(grammarAccess.getBrickAccess().getYUnitsYUnitParserRuleCall_4_0(), semanticObject.getYUnits());
		feeder.accept(grammarAccess.getBrickAccess().getZUnitsZUnitParserRuleCall_5_0(), semanticObject.getZUnits());
		feeder.accept(grammarAccess.getBrickAccess().getFillColorParserRuleCall_6_0(), semanticObject.getFill());
		feeder.accept(grammarAccess.getBrickAccess().getSourceSourceParserRuleCall_7_0(), semanticObject.getSource());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (r=INT g=INT b=INT)
	 */
	protected void sequence_Color(EObject context, Color semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LegoPackage.Literals.COLOR__R) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegoPackage.Literals.COLOR__R));
			if(transientValues.isValueTransient(semanticObject, LegoPackage.Literals.COLOR__G) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegoPackage.Literals.COLOR__G));
			if(transientValues.isValueTransient(semanticObject, LegoPackage.Literals.COLOR__B) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegoPackage.Literals.COLOR__B));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getColorAccess().getRINTTerminalRuleCall_1_0(), semanticObject.getR());
		feeder.accept(grammarAccess.getColorAccess().getGINTTerminalRuleCall_2_0(), semanticObject.getG());
		feeder.accept(grammarAccess.getColorAccess().getBINTTerminalRuleCall_3_0(), semanticObject.getB());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (source3d=STRING (originX=FLOAT originY=FLOAT originZ=FLOAT)?)
	 */
	protected void sequence_FxmlInclude(EObject context, FxmlInclude semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((type='box' width=FLOAT height=FLOAT depth=FLOAT (originX=FLOAT originY=FLOAT originZ=FLOAT)?)?)
	 */
	protected void sequence_Generated(EObject context, Generated semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID elementList+=RepostoryItem+)
	 */
	protected void sequence_ItemRepository(EObject context, ItemRepository semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (repo=ItemRepository | assembly=Assembly)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         element=[MountedPart|QualifiedName] 
	 *         xUnits=FLOAT 
	 *         yUnits=FLOAT 
	 *         zUnits=FLOAT 
	 *         (rotateX=FLOAT rotateY=FLOAT rotateZ=FLOAT)? 
	 *         actions+=Action*
	 *     )
	 */
	protected void sequence_MountedAssemblyItem(EObject context, MountedAssemblyItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID fill=Color source=Source)
	 */
	protected void sequence_MountedPart(EObject context, MountedPart semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LegoPackage.Literals.LEGO_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegoPackage.Literals.LEGO_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, LegoPackage.Literals.REPOSTORY_ITEM__FILL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegoPackage.Literals.REPOSTORY_ITEM__FILL));
			if(transientValues.isValueTransient(semanticObject, LegoPackage.Literals.REPOSTORY_ITEM__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegoPackage.Literals.REPOSTORY_ITEM__SOURCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMountedPartAccess().getNameValidIDParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMountedPartAccess().getFillColorParserRuleCall_2_0(), semanticObject.getFill());
		feeder.accept(grammarAccess.getMountedPartAccess().getSourceSourceParserRuleCall_3_0(), semanticObject.getSource());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         element=[RasterItem|QualifiedName] 
	 *         xUnits=XUnit 
	 *         yUnits=YUnit 
	 *         zUnits=ZUnit 
	 *         (transform='rotate180' | transform='rotate90' | transform='rotate270')?
	 *     )
	 */
	protected void sequence_RasterAssemblyItem(EObject context, RasterAssemblyItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     units=INT
	 */
	protected void sequence_XUnit(EObject context, XUnit semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LegoPackage.Literals.XUNIT__UNITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegoPackage.Literals.XUNIT__UNITS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXUnitAccess().getUnitsINTTerminalRuleCall_0(), semanticObject.getUnits());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     units=INT
	 */
	protected void sequence_YUnit(EObject context, YUnit semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LegoPackage.Literals.YUNIT__UNITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegoPackage.Literals.YUNIT__UNITS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getYUnitAccess().getUnitsINTTerminalRuleCall_0(), semanticObject.getUnits());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     units=INT
	 */
	protected void sequence_ZUnit(EObject context, ZUnit semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LegoPackage.Literals.ZUNIT__UNITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegoPackage.Literals.ZUNIT__UNITS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getZUnitAccess().getUnitsINTTerminalRuleCall_0(), semanticObject.getUnits());
		feeder.finish();
	}
}
