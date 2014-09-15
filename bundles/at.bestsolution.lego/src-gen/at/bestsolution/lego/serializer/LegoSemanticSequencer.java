package at.bestsolution.lego.serializer;

import at.bestsolution.lego.lego.Assembly;
import at.bestsolution.lego.lego.AssemblyItem;
import at.bestsolution.lego.lego.Brick;
import at.bestsolution.lego.lego.Color;
import at.bestsolution.lego.lego.Door;
import at.bestsolution.lego.lego.DoorBrick;
import at.bestsolution.lego.lego.ItemRepository;
import at.bestsolution.lego.lego.LegoPackage;
import at.bestsolution.lego.lego.Model;
import at.bestsolution.lego.lego.RoundBrick;
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
			case LegoPackage.ASSEMBLY:
				if(context == grammarAccess.getAssemblyRule() ||
				   context == grammarAccess.getLegoElementRule()) {
					sequence_Assembly(context, (Assembly) semanticObject); 
					return; 
				}
				else break;
			case LegoPackage.ASSEMBLY_ITEM:
				if(context == grammarAccess.getAssemblyItemRule()) {
					sequence_AssemblyItem(context, (AssemblyItem) semanticObject); 
					return; 
				}
				else break;
			case LegoPackage.BRICK:
				if(context == grammarAccess.getBrickRule() ||
				   context == grammarAccess.getItemRule() ||
				   context == grammarAccess.getLegoElementRule()) {
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
			case LegoPackage.DOOR:
				if(context == grammarAccess.getDoorRule() ||
				   context == grammarAccess.getItemRule() ||
				   context == grammarAccess.getLegoElementRule()) {
					sequence_Door(context, (Door) semanticObject); 
					return; 
				}
				else break;
			case LegoPackage.DOOR_BRICK:
				if(context == grammarAccess.getDoorBrickRule() ||
				   context == grammarAccess.getItemRule() ||
				   context == grammarAccess.getLegoElementRule()) {
					sequence_DoorBrick(context, (DoorBrick) semanticObject); 
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
			case LegoPackage.ROUND_BRICK:
				if(context == grammarAccess.getItemRule() ||
				   context == grammarAccess.getLegoElementRule() ||
				   context == grammarAccess.getRoundBrickRule()) {
					sequence_RoundBrick(context, (RoundBrick) semanticObject); 
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
	 *     (element=[LegoElement|QualifiedName] xUnits=XUnit yUnits=YUnit zUnits=ZUnit)
	 */
	protected void sequence_AssemblyItem(EObject context, AssemblyItem semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LegoPackage.Literals.ASSEMBLY_ITEM__ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegoPackage.Literals.ASSEMBLY_ITEM__ELEMENT));
			if(transientValues.isValueTransient(semanticObject, LegoPackage.Literals.ASSEMBLY_ITEM__XUNITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegoPackage.Literals.ASSEMBLY_ITEM__XUNITS));
			if(transientValues.isValueTransient(semanticObject, LegoPackage.Literals.ASSEMBLY_ITEM__YUNITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegoPackage.Literals.ASSEMBLY_ITEM__YUNITS));
			if(transientValues.isValueTransient(semanticObject, LegoPackage.Literals.ASSEMBLY_ITEM__ZUNITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegoPackage.Literals.ASSEMBLY_ITEM__ZUNITS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssemblyItemAccess().getElementLegoElementQualifiedNameParserRuleCall_0_0_1(), semanticObject.getElement());
		feeder.accept(grammarAccess.getAssemblyItemAccess().getXUnitsXUnitParserRuleCall_2_0(), semanticObject.getXUnits());
		feeder.accept(grammarAccess.getAssemblyItemAccess().getYUnitsYUnitParserRuleCall_3_0(), semanticObject.getYUnits());
		feeder.accept(grammarAccess.getAssemblyItemAccess().getZUnitsZUnitParserRuleCall_4_0(), semanticObject.getZUnits());
		feeder.finish();
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
	 *     (name=ValidID xUnits=XUnit yUnits=YUnit zUnits=ZUnit fill=Color)
	 */
	protected void sequence_Brick(EObject context, Brick semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LegoPackage.Literals.LEGO_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegoPackage.Literals.LEGO_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, LegoPackage.Literals.ITEM__XUNITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegoPackage.Literals.ITEM__XUNITS));
			if(transientValues.isValueTransient(semanticObject, LegoPackage.Literals.ITEM__YUNITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegoPackage.Literals.ITEM__YUNITS));
			if(transientValues.isValueTransient(semanticObject, LegoPackage.Literals.ITEM__FILL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegoPackage.Literals.ITEM__FILL));
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
	 *     (name=ValidID xUnits=XUnit yUnits=YUnit zUnits=ZUnit fill=Color)
	 */
	protected void sequence_DoorBrick(EObject context, DoorBrick semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LegoPackage.Literals.LEGO_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegoPackage.Literals.LEGO_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, LegoPackage.Literals.ITEM__XUNITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegoPackage.Literals.ITEM__XUNITS));
			if(transientValues.isValueTransient(semanticObject, LegoPackage.Literals.ITEM__YUNITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegoPackage.Literals.ITEM__YUNITS));
			if(transientValues.isValueTransient(semanticObject, LegoPackage.Literals.ITEM__FILL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegoPackage.Literals.ITEM__FILL));
			if(transientValues.isValueTransient(semanticObject, LegoPackage.Literals.DOOR_BRICK__ZUNITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegoPackage.Literals.DOOR_BRICK__ZUNITS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDoorBrickAccess().getNameValidIDParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDoorBrickAccess().getXUnitsXUnitParserRuleCall_3_0(), semanticObject.getXUnits());
		feeder.accept(grammarAccess.getDoorBrickAccess().getYUnitsYUnitParserRuleCall_4_0(), semanticObject.getYUnits());
		feeder.accept(grammarAccess.getDoorBrickAccess().getZUnitsZUnitParserRuleCall_5_0(), semanticObject.getZUnits());
		feeder.accept(grammarAccess.getDoorBrickAccess().getFillColorParserRuleCall_6_0(), semanticObject.getFill());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID xUnits=XUnit yUnits=YUnit fill=Color)
	 */
	protected void sequence_Door(EObject context, Door semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LegoPackage.Literals.LEGO_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegoPackage.Literals.LEGO_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, LegoPackage.Literals.ITEM__XUNITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegoPackage.Literals.ITEM__XUNITS));
			if(transientValues.isValueTransient(semanticObject, LegoPackage.Literals.ITEM__YUNITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegoPackage.Literals.ITEM__YUNITS));
			if(transientValues.isValueTransient(semanticObject, LegoPackage.Literals.ITEM__FILL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LegoPackage.Literals.ITEM__FILL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDoorAccess().getNameValidIDParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDoorAccess().getXUnitsXUnitParserRuleCall_3_0(), semanticObject.getXUnits());
		feeder.accept(grammarAccess.getDoorAccess().getYUnitsYUnitParserRuleCall_4_0(), semanticObject.getYUnits());
		feeder.accept(grammarAccess.getDoorAccess().getFillColorParserRuleCall_5_0(), semanticObject.getFill());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID elementList+=Item+)
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
	 *         (round='left' | round='right') 
	 *         name=ValidID 
	 *         xUnits=XUnit 
	 *         yUnits=YUnit 
	 *         zUnits=ZUnit 
	 *         fill=Color
	 *     )
	 */
	protected void sequence_RoundBrick(EObject context, RoundBrick semanticObject) {
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
