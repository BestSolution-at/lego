/**
 */
package at.bestsolution.lego.lego;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.bestsolution.lego.lego.LegoFactory
 * @model kind="package"
 * @generated
 */
public interface LegoPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "lego";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bestsolution.at/lego/Lego";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "lego";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LegoPackage eINSTANCE = at.bestsolution.lego.lego.impl.LegoPackageImpl.init();

  /**
   * The meta object id for the '{@link at.bestsolution.lego.lego.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.lego.lego.impl.ModelImpl
   * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Repo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__REPO = 0;

  /**
   * The feature id for the '<em><b>Assembly</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ASSEMBLY = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.lego.lego.impl.ItemRepositoryImpl <em>Item Repository</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.lego.lego.impl.ItemRepositoryImpl
   * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getItemRepository()
   * @generated
   */
  int ITEM_REPOSITORY = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_REPOSITORY__NAME = 0;

  /**
   * The feature id for the '<em><b>Element List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_REPOSITORY__ELEMENT_LIST = 1;

  /**
   * The number of structural features of the '<em>Item Repository</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_REPOSITORY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.lego.lego.impl.LegoElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.lego.lego.impl.LegoElementImpl
   * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getLegoElement()
   * @generated
   */
  int LEGO_ELEMENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEGO_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEGO_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.lego.lego.impl.RasterItemImpl <em>Raster Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.lego.lego.impl.RasterItemImpl
   * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getRasterItem()
   * @generated
   */
  int RASTER_ITEM = 3;

  /**
   * The number of structural features of the '<em>Raster Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RASTER_ITEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bestsolution.lego.lego.impl.RepostoryItemImpl <em>Repostory Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.lego.lego.impl.RepostoryItemImpl
   * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getRepostoryItem()
   * @generated
   */
  int REPOSTORY_ITEM = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSTORY_ITEM__NAME = LEGO_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Fill</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSTORY_ITEM__FILL = LEGO_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSTORY_ITEM__SOURCE = LEGO_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Repostory Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSTORY_ITEM_FEATURE_COUNT = LEGO_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.lego.lego.impl.MountedPartImpl <em>Mounted Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.lego.lego.impl.MountedPartImpl
   * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getMountedPart()
   * @generated
   */
  int MOUNTED_PART = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOUNTED_PART__NAME = REPOSTORY_ITEM__NAME;

  /**
   * The feature id for the '<em><b>Fill</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOUNTED_PART__FILL = REPOSTORY_ITEM__FILL;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOUNTED_PART__SOURCE = REPOSTORY_ITEM__SOURCE;

  /**
   * The number of structural features of the '<em>Mounted Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOUNTED_PART_FEATURE_COUNT = REPOSTORY_ITEM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bestsolution.lego.lego.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.lego.lego.impl.ActionImpl
   * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getAction()
   * @generated
   */
  int ACTION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__TYPE = 1;

  /**
   * The feature id for the '<em><b>Axis</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__AXIS = 2;

  /**
   * The feature id for the '<em><b>Angle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__ANGLE = 3;

  /**
   * The feature id for the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__DURATION = 4;

  /**
   * The feature id for the '<em><b>Soundfile</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__SOUNDFILE = 5;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link at.bestsolution.lego.lego.impl.ColorImpl <em>Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.lego.lego.impl.ColorImpl
   * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getColor()
   * @generated
   */
  int COLOR = 7;

  /**
   * The feature id for the '<em><b>R</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR__R = 0;

  /**
   * The feature id for the '<em><b>G</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR__G = 1;

  /**
   * The feature id for the '<em><b>B</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR__B = 2;

  /**
   * The number of structural features of the '<em>Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bestsolution.lego.lego.impl.XUnitImpl <em>XUnit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.lego.lego.impl.XUnitImpl
   * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getXUnit()
   * @generated
   */
  int XUNIT = 8;

  /**
   * The feature id for the '<em><b>Units</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XUNIT__UNITS = 0;

  /**
   * The number of structural features of the '<em>XUnit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XUNIT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.lego.lego.impl.YUnitImpl <em>YUnit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.lego.lego.impl.YUnitImpl
   * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getYUnit()
   * @generated
   */
  int YUNIT = 9;

  /**
   * The feature id for the '<em><b>Units</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int YUNIT__UNITS = 0;

  /**
   * The number of structural features of the '<em>YUnit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int YUNIT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.lego.lego.impl.ZUnitImpl <em>ZUnit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.lego.lego.impl.ZUnitImpl
   * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getZUnit()
   * @generated
   */
  int ZUNIT = 10;

  /**
   * The feature id for the '<em><b>Units</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ZUNIT__UNITS = 0;

  /**
   * The number of structural features of the '<em>ZUnit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ZUNIT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.lego.lego.impl.BrickImpl <em>Brick</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.lego.lego.impl.BrickImpl
   * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getBrick()
   * @generated
   */
  int BRICK = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRICK__NAME = RASTER_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fill</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRICK__FILL = RASTER_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRICK__SOURCE = RASTER_ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>XUnits</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRICK__XUNITS = RASTER_ITEM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>YUnits</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRICK__YUNITS = RASTER_ITEM_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>ZUnits</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRICK__ZUNITS = RASTER_ITEM_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Brick</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRICK_FEATURE_COUNT = RASTER_ITEM_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link at.bestsolution.lego.lego.impl.SourceImpl <em>Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.lego.lego.impl.SourceImpl
   * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getSource()
   * @generated
   */
  int SOURCE = 12;

  /**
   * The feature id for the '<em><b>Origin X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE__ORIGIN_X = 0;

  /**
   * The feature id for the '<em><b>Origin Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE__ORIGIN_Y = 1;

  /**
   * The feature id for the '<em><b>Origin Z</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE__ORIGIN_Z = 2;

  /**
   * The number of structural features of the '<em>Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bestsolution.lego.lego.impl.GeneratedImpl <em>Generated</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.lego.lego.impl.GeneratedImpl
   * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getGenerated()
   * @generated
   */
  int GENERATED = 13;

  /**
   * The feature id for the '<em><b>Origin X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATED__ORIGIN_X = SOURCE__ORIGIN_X;

  /**
   * The feature id for the '<em><b>Origin Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATED__ORIGIN_Y = SOURCE__ORIGIN_Y;

  /**
   * The feature id for the '<em><b>Origin Z</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATED__ORIGIN_Z = SOURCE__ORIGIN_Z;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATED__TYPE = SOURCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATED__WIDTH = SOURCE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATED__HEIGHT = SOURCE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Depth</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATED__DEPTH = SOURCE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Generated</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATED_FEATURE_COUNT = SOURCE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link at.bestsolution.lego.lego.impl.FxmlIncludeImpl <em>Fxml Include</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.lego.lego.impl.FxmlIncludeImpl
   * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getFxmlInclude()
   * @generated
   */
  int FXML_INCLUDE = 14;

  /**
   * The feature id for the '<em><b>Origin X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FXML_INCLUDE__ORIGIN_X = SOURCE__ORIGIN_X;

  /**
   * The feature id for the '<em><b>Origin Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FXML_INCLUDE__ORIGIN_Y = SOURCE__ORIGIN_Y;

  /**
   * The feature id for the '<em><b>Origin Z</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FXML_INCLUDE__ORIGIN_Z = SOURCE__ORIGIN_Z;

  /**
   * The feature id for the '<em><b>Source3d</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FXML_INCLUDE__SOURCE3D = SOURCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Fxml Include</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FXML_INCLUDE_FEATURE_COUNT = SOURCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.lego.lego.impl.AssemblyImpl <em>Assembly</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.lego.lego.impl.AssemblyImpl
   * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getAssembly()
   * @generated
   */
  int ASSEMBLY = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLY__NAME = LEGO_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLY__ITEMS = LEGO_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Assembly</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLY_FEATURE_COUNT = LEGO_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.lego.lego.impl.AssemblyItemImpl <em>Assembly Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.lego.lego.impl.AssemblyItemImpl
   * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getAssemblyItem()
   * @generated
   */
  int ASSEMBLY_ITEM = 16;

  /**
   * The number of structural features of the '<em>Assembly Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLY_ITEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bestsolution.lego.lego.impl.RasterAssemblyItemImpl <em>Raster Assembly Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.lego.lego.impl.RasterAssemblyItemImpl
   * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getRasterAssemblyItem()
   * @generated
   */
  int RASTER_ASSEMBLY_ITEM = 17;

  /**
   * The feature id for the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RASTER_ASSEMBLY_ITEM__ELEMENT = ASSEMBLY_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>XUnits</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RASTER_ASSEMBLY_ITEM__XUNITS = ASSEMBLY_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>YUnits</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RASTER_ASSEMBLY_ITEM__YUNITS = ASSEMBLY_ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>ZUnits</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RASTER_ASSEMBLY_ITEM__ZUNITS = ASSEMBLY_ITEM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Transform</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RASTER_ASSEMBLY_ITEM__TRANSFORM = ASSEMBLY_ITEM_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Raster Assembly Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RASTER_ASSEMBLY_ITEM_FEATURE_COUNT = ASSEMBLY_ITEM_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link at.bestsolution.lego.lego.impl.MountedAssemblyItemImpl <em>Mounted Assembly Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.lego.lego.impl.MountedAssemblyItemImpl
   * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getMountedAssemblyItem()
   * @generated
   */
  int MOUNTED_ASSEMBLY_ITEM = 18;

  /**
   * The feature id for the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOUNTED_ASSEMBLY_ITEM__ELEMENT = ASSEMBLY_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>XUnits</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOUNTED_ASSEMBLY_ITEM__XUNITS = ASSEMBLY_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>YUnits</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOUNTED_ASSEMBLY_ITEM__YUNITS = ASSEMBLY_ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>ZUnits</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOUNTED_ASSEMBLY_ITEM__ZUNITS = ASSEMBLY_ITEM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Rotate X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOUNTED_ASSEMBLY_ITEM__ROTATE_X = ASSEMBLY_ITEM_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Rotate Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOUNTED_ASSEMBLY_ITEM__ROTATE_Y = ASSEMBLY_ITEM_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Rotate Z</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOUNTED_ASSEMBLY_ITEM__ROTATE_Z = ASSEMBLY_ITEM_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOUNTED_ASSEMBLY_ITEM__ACTIONS = ASSEMBLY_ITEM_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Mounted Assembly Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOUNTED_ASSEMBLY_ITEM_FEATURE_COUNT = ASSEMBLY_ITEM_FEATURE_COUNT + 8;


  /**
   * Returns the meta object for class '{@link at.bestsolution.lego.lego.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see at.bestsolution.lego.lego.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.lego.lego.Model#getRepo <em>Repo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Repo</em>'.
   * @see at.bestsolution.lego.lego.Model#getRepo()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Repo();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.lego.lego.Model#getAssembly <em>Assembly</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assembly</em>'.
   * @see at.bestsolution.lego.lego.Model#getAssembly()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Assembly();

  /**
   * Returns the meta object for class '{@link at.bestsolution.lego.lego.ItemRepository <em>Item Repository</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item Repository</em>'.
   * @see at.bestsolution.lego.lego.ItemRepository
   * @generated
   */
  EClass getItemRepository();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.lego.lego.ItemRepository#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.lego.lego.ItemRepository#getName()
   * @see #getItemRepository()
   * @generated
   */
  EAttribute getItemRepository_Name();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.lego.lego.ItemRepository#getElementList <em>Element List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Element List</em>'.
   * @see at.bestsolution.lego.lego.ItemRepository#getElementList()
   * @see #getItemRepository()
   * @generated
   */
  EReference getItemRepository_ElementList();

  /**
   * Returns the meta object for class '{@link at.bestsolution.lego.lego.LegoElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see at.bestsolution.lego.lego.LegoElement
   * @generated
   */
  EClass getLegoElement();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.lego.lego.LegoElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.lego.lego.LegoElement#getName()
   * @see #getLegoElement()
   * @generated
   */
  EAttribute getLegoElement_Name();

  /**
   * Returns the meta object for class '{@link at.bestsolution.lego.lego.RasterItem <em>Raster Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Raster Item</em>'.
   * @see at.bestsolution.lego.lego.RasterItem
   * @generated
   */
  EClass getRasterItem();

  /**
   * Returns the meta object for class '{@link at.bestsolution.lego.lego.MountedPart <em>Mounted Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mounted Part</em>'.
   * @see at.bestsolution.lego.lego.MountedPart
   * @generated
   */
  EClass getMountedPart();

  /**
   * Returns the meta object for class '{@link at.bestsolution.lego.lego.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see at.bestsolution.lego.lego.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.lego.lego.Action#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.lego.lego.Action#getName()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Name();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.lego.lego.Action#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.bestsolution.lego.lego.Action#getType()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Type();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.lego.lego.Action#getAxis <em>Axis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Axis</em>'.
   * @see at.bestsolution.lego.lego.Action#getAxis()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Axis();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.lego.lego.Action#getAngle <em>Angle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Angle</em>'.
   * @see at.bestsolution.lego.lego.Action#getAngle()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Angle();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.lego.lego.Action#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Duration</em>'.
   * @see at.bestsolution.lego.lego.Action#getDuration()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Duration();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.lego.lego.Action#getSoundfile <em>Soundfile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Soundfile</em>'.
   * @see at.bestsolution.lego.lego.Action#getSoundfile()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Soundfile();

  /**
   * Returns the meta object for class '{@link at.bestsolution.lego.lego.RepostoryItem <em>Repostory Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Repostory Item</em>'.
   * @see at.bestsolution.lego.lego.RepostoryItem
   * @generated
   */
  EClass getRepostoryItem();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.lego.lego.RepostoryItem#getFill <em>Fill</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fill</em>'.
   * @see at.bestsolution.lego.lego.RepostoryItem#getFill()
   * @see #getRepostoryItem()
   * @generated
   */
  EReference getRepostoryItem_Fill();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.lego.lego.RepostoryItem#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see at.bestsolution.lego.lego.RepostoryItem#getSource()
   * @see #getRepostoryItem()
   * @generated
   */
  EReference getRepostoryItem_Source();

  /**
   * Returns the meta object for class '{@link at.bestsolution.lego.lego.Color <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Color</em>'.
   * @see at.bestsolution.lego.lego.Color
   * @generated
   */
  EClass getColor();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.lego.lego.Color#getR <em>R</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R</em>'.
   * @see at.bestsolution.lego.lego.Color#getR()
   * @see #getColor()
   * @generated
   */
  EAttribute getColor_R();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.lego.lego.Color#getG <em>G</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>G</em>'.
   * @see at.bestsolution.lego.lego.Color#getG()
   * @see #getColor()
   * @generated
   */
  EAttribute getColor_G();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.lego.lego.Color#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>B</em>'.
   * @see at.bestsolution.lego.lego.Color#getB()
   * @see #getColor()
   * @generated
   */
  EAttribute getColor_B();

  /**
   * Returns the meta object for class '{@link at.bestsolution.lego.lego.XUnit <em>XUnit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XUnit</em>'.
   * @see at.bestsolution.lego.lego.XUnit
   * @generated
   */
  EClass getXUnit();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.lego.lego.XUnit#getUnits <em>Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Units</em>'.
   * @see at.bestsolution.lego.lego.XUnit#getUnits()
   * @see #getXUnit()
   * @generated
   */
  EAttribute getXUnit_Units();

  /**
   * Returns the meta object for class '{@link at.bestsolution.lego.lego.YUnit <em>YUnit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>YUnit</em>'.
   * @see at.bestsolution.lego.lego.YUnit
   * @generated
   */
  EClass getYUnit();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.lego.lego.YUnit#getUnits <em>Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Units</em>'.
   * @see at.bestsolution.lego.lego.YUnit#getUnits()
   * @see #getYUnit()
   * @generated
   */
  EAttribute getYUnit_Units();

  /**
   * Returns the meta object for class '{@link at.bestsolution.lego.lego.ZUnit <em>ZUnit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ZUnit</em>'.
   * @see at.bestsolution.lego.lego.ZUnit
   * @generated
   */
  EClass getZUnit();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.lego.lego.ZUnit#getUnits <em>Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Units</em>'.
   * @see at.bestsolution.lego.lego.ZUnit#getUnits()
   * @see #getZUnit()
   * @generated
   */
  EAttribute getZUnit_Units();

  /**
   * Returns the meta object for class '{@link at.bestsolution.lego.lego.Brick <em>Brick</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Brick</em>'.
   * @see at.bestsolution.lego.lego.Brick
   * @generated
   */
  EClass getBrick();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.lego.lego.Brick#getXUnits <em>XUnits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>XUnits</em>'.
   * @see at.bestsolution.lego.lego.Brick#getXUnits()
   * @see #getBrick()
   * @generated
   */
  EReference getBrick_XUnits();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.lego.lego.Brick#getYUnits <em>YUnits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>YUnits</em>'.
   * @see at.bestsolution.lego.lego.Brick#getYUnits()
   * @see #getBrick()
   * @generated
   */
  EReference getBrick_YUnits();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.lego.lego.Brick#getZUnits <em>ZUnits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>ZUnits</em>'.
   * @see at.bestsolution.lego.lego.Brick#getZUnits()
   * @see #getBrick()
   * @generated
   */
  EReference getBrick_ZUnits();

  /**
   * Returns the meta object for class '{@link at.bestsolution.lego.lego.Source <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Source</em>'.
   * @see at.bestsolution.lego.lego.Source
   * @generated
   */
  EClass getSource();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.lego.lego.Source#getOriginX <em>Origin X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Origin X</em>'.
   * @see at.bestsolution.lego.lego.Source#getOriginX()
   * @see #getSource()
   * @generated
   */
  EAttribute getSource_OriginX();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.lego.lego.Source#getOriginY <em>Origin Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Origin Y</em>'.
   * @see at.bestsolution.lego.lego.Source#getOriginY()
   * @see #getSource()
   * @generated
   */
  EAttribute getSource_OriginY();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.lego.lego.Source#getOriginZ <em>Origin Z</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Origin Z</em>'.
   * @see at.bestsolution.lego.lego.Source#getOriginZ()
   * @see #getSource()
   * @generated
   */
  EAttribute getSource_OriginZ();

  /**
   * Returns the meta object for class '{@link at.bestsolution.lego.lego.Generated <em>Generated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generated</em>'.
   * @see at.bestsolution.lego.lego.Generated
   * @generated
   */
  EClass getGenerated();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.lego.lego.Generated#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.bestsolution.lego.lego.Generated#getType()
   * @see #getGenerated()
   * @generated
   */
  EAttribute getGenerated_Type();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.lego.lego.Generated#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see at.bestsolution.lego.lego.Generated#getWidth()
   * @see #getGenerated()
   * @generated
   */
  EAttribute getGenerated_Width();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.lego.lego.Generated#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Height</em>'.
   * @see at.bestsolution.lego.lego.Generated#getHeight()
   * @see #getGenerated()
   * @generated
   */
  EAttribute getGenerated_Height();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.lego.lego.Generated#getDepth <em>Depth</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Depth</em>'.
   * @see at.bestsolution.lego.lego.Generated#getDepth()
   * @see #getGenerated()
   * @generated
   */
  EAttribute getGenerated_Depth();

  /**
   * Returns the meta object for class '{@link at.bestsolution.lego.lego.FxmlInclude <em>Fxml Include</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fxml Include</em>'.
   * @see at.bestsolution.lego.lego.FxmlInclude
   * @generated
   */
  EClass getFxmlInclude();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.lego.lego.FxmlInclude#getSource3d <em>Source3d</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source3d</em>'.
   * @see at.bestsolution.lego.lego.FxmlInclude#getSource3d()
   * @see #getFxmlInclude()
   * @generated
   */
  EAttribute getFxmlInclude_Source3d();

  /**
   * Returns the meta object for class '{@link at.bestsolution.lego.lego.Assembly <em>Assembly</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assembly</em>'.
   * @see at.bestsolution.lego.lego.Assembly
   * @generated
   */
  EClass getAssembly();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.lego.lego.Assembly#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see at.bestsolution.lego.lego.Assembly#getItems()
   * @see #getAssembly()
   * @generated
   */
  EReference getAssembly_Items();

  /**
   * Returns the meta object for class '{@link at.bestsolution.lego.lego.AssemblyItem <em>Assembly Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assembly Item</em>'.
   * @see at.bestsolution.lego.lego.AssemblyItem
   * @generated
   */
  EClass getAssemblyItem();

  /**
   * Returns the meta object for class '{@link at.bestsolution.lego.lego.RasterAssemblyItem <em>Raster Assembly Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Raster Assembly Item</em>'.
   * @see at.bestsolution.lego.lego.RasterAssemblyItem
   * @generated
   */
  EClass getRasterAssemblyItem();

  /**
   * Returns the meta object for the reference '{@link at.bestsolution.lego.lego.RasterAssemblyItem#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Element</em>'.
   * @see at.bestsolution.lego.lego.RasterAssemblyItem#getElement()
   * @see #getRasterAssemblyItem()
   * @generated
   */
  EReference getRasterAssemblyItem_Element();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.lego.lego.RasterAssemblyItem#getXUnits <em>XUnits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>XUnits</em>'.
   * @see at.bestsolution.lego.lego.RasterAssemblyItem#getXUnits()
   * @see #getRasterAssemblyItem()
   * @generated
   */
  EReference getRasterAssemblyItem_XUnits();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.lego.lego.RasterAssemblyItem#getYUnits <em>YUnits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>YUnits</em>'.
   * @see at.bestsolution.lego.lego.RasterAssemblyItem#getYUnits()
   * @see #getRasterAssemblyItem()
   * @generated
   */
  EReference getRasterAssemblyItem_YUnits();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.lego.lego.RasterAssemblyItem#getZUnits <em>ZUnits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>ZUnits</em>'.
   * @see at.bestsolution.lego.lego.RasterAssemblyItem#getZUnits()
   * @see #getRasterAssemblyItem()
   * @generated
   */
  EReference getRasterAssemblyItem_ZUnits();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.lego.lego.RasterAssemblyItem#getTransform <em>Transform</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Transform</em>'.
   * @see at.bestsolution.lego.lego.RasterAssemblyItem#getTransform()
   * @see #getRasterAssemblyItem()
   * @generated
   */
  EAttribute getRasterAssemblyItem_Transform();

  /**
   * Returns the meta object for class '{@link at.bestsolution.lego.lego.MountedAssemblyItem <em>Mounted Assembly Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mounted Assembly Item</em>'.
   * @see at.bestsolution.lego.lego.MountedAssemblyItem
   * @generated
   */
  EClass getMountedAssemblyItem();

  /**
   * Returns the meta object for the reference '{@link at.bestsolution.lego.lego.MountedAssemblyItem#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Element</em>'.
   * @see at.bestsolution.lego.lego.MountedAssemblyItem#getElement()
   * @see #getMountedAssemblyItem()
   * @generated
   */
  EReference getMountedAssemblyItem_Element();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.lego.lego.MountedAssemblyItem#getXUnits <em>XUnits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>XUnits</em>'.
   * @see at.bestsolution.lego.lego.MountedAssemblyItem#getXUnits()
   * @see #getMountedAssemblyItem()
   * @generated
   */
  EAttribute getMountedAssemblyItem_XUnits();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.lego.lego.MountedAssemblyItem#getYUnits <em>YUnits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>YUnits</em>'.
   * @see at.bestsolution.lego.lego.MountedAssemblyItem#getYUnits()
   * @see #getMountedAssemblyItem()
   * @generated
   */
  EAttribute getMountedAssemblyItem_YUnits();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.lego.lego.MountedAssemblyItem#getZUnits <em>ZUnits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>ZUnits</em>'.
   * @see at.bestsolution.lego.lego.MountedAssemblyItem#getZUnits()
   * @see #getMountedAssemblyItem()
   * @generated
   */
  EAttribute getMountedAssemblyItem_ZUnits();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.lego.lego.MountedAssemblyItem#getRotateX <em>Rotate X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rotate X</em>'.
   * @see at.bestsolution.lego.lego.MountedAssemblyItem#getRotateX()
   * @see #getMountedAssemblyItem()
   * @generated
   */
  EAttribute getMountedAssemblyItem_RotateX();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.lego.lego.MountedAssemblyItem#getRotateY <em>Rotate Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rotate Y</em>'.
   * @see at.bestsolution.lego.lego.MountedAssemblyItem#getRotateY()
   * @see #getMountedAssemblyItem()
   * @generated
   */
  EAttribute getMountedAssemblyItem_RotateY();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.lego.lego.MountedAssemblyItem#getRotateZ <em>Rotate Z</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rotate Z</em>'.
   * @see at.bestsolution.lego.lego.MountedAssemblyItem#getRotateZ()
   * @see #getMountedAssemblyItem()
   * @generated
   */
  EAttribute getMountedAssemblyItem_RotateZ();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.lego.lego.MountedAssemblyItem#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see at.bestsolution.lego.lego.MountedAssemblyItem#getActions()
   * @see #getMountedAssemblyItem()
   * @generated
   */
  EReference getMountedAssemblyItem_Actions();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LegoFactory getLegoFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link at.bestsolution.lego.lego.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.lego.lego.impl.ModelImpl
     * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Repo</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__REPO = eINSTANCE.getModel_Repo();

    /**
     * The meta object literal for the '<em><b>Assembly</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ASSEMBLY = eINSTANCE.getModel_Assembly();

    /**
     * The meta object literal for the '{@link at.bestsolution.lego.lego.impl.ItemRepositoryImpl <em>Item Repository</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.lego.lego.impl.ItemRepositoryImpl
     * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getItemRepository()
     * @generated
     */
    EClass ITEM_REPOSITORY = eINSTANCE.getItemRepository();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITEM_REPOSITORY__NAME = eINSTANCE.getItemRepository_Name();

    /**
     * The meta object literal for the '<em><b>Element List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITEM_REPOSITORY__ELEMENT_LIST = eINSTANCE.getItemRepository_ElementList();

    /**
     * The meta object literal for the '{@link at.bestsolution.lego.lego.impl.LegoElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.lego.lego.impl.LegoElementImpl
     * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getLegoElement()
     * @generated
     */
    EClass LEGO_ELEMENT = eINSTANCE.getLegoElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LEGO_ELEMENT__NAME = eINSTANCE.getLegoElement_Name();

    /**
     * The meta object literal for the '{@link at.bestsolution.lego.lego.impl.RasterItemImpl <em>Raster Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.lego.lego.impl.RasterItemImpl
     * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getRasterItem()
     * @generated
     */
    EClass RASTER_ITEM = eINSTANCE.getRasterItem();

    /**
     * The meta object literal for the '{@link at.bestsolution.lego.lego.impl.MountedPartImpl <em>Mounted Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.lego.lego.impl.MountedPartImpl
     * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getMountedPart()
     * @generated
     */
    EClass MOUNTED_PART = eINSTANCE.getMountedPart();

    /**
     * The meta object literal for the '{@link at.bestsolution.lego.lego.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.lego.lego.impl.ActionImpl
     * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__TYPE = eINSTANCE.getAction_Type();

    /**
     * The meta object literal for the '<em><b>Axis</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__AXIS = eINSTANCE.getAction_Axis();

    /**
     * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__ANGLE = eINSTANCE.getAction_Angle();

    /**
     * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__DURATION = eINSTANCE.getAction_Duration();

    /**
     * The meta object literal for the '<em><b>Soundfile</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__SOUNDFILE = eINSTANCE.getAction_Soundfile();

    /**
     * The meta object literal for the '{@link at.bestsolution.lego.lego.impl.RepostoryItemImpl <em>Repostory Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.lego.lego.impl.RepostoryItemImpl
     * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getRepostoryItem()
     * @generated
     */
    EClass REPOSTORY_ITEM = eINSTANCE.getRepostoryItem();

    /**
     * The meta object literal for the '<em><b>Fill</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPOSTORY_ITEM__FILL = eINSTANCE.getRepostoryItem_Fill();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPOSTORY_ITEM__SOURCE = eINSTANCE.getRepostoryItem_Source();

    /**
     * The meta object literal for the '{@link at.bestsolution.lego.lego.impl.ColorImpl <em>Color</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.lego.lego.impl.ColorImpl
     * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getColor()
     * @generated
     */
    EClass COLOR = eINSTANCE.getColor();

    /**
     * The meta object literal for the '<em><b>R</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR__R = eINSTANCE.getColor_R();

    /**
     * The meta object literal for the '<em><b>G</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR__G = eINSTANCE.getColor_G();

    /**
     * The meta object literal for the '<em><b>B</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR__B = eINSTANCE.getColor_B();

    /**
     * The meta object literal for the '{@link at.bestsolution.lego.lego.impl.XUnitImpl <em>XUnit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.lego.lego.impl.XUnitImpl
     * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getXUnit()
     * @generated
     */
    EClass XUNIT = eINSTANCE.getXUnit();

    /**
     * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XUNIT__UNITS = eINSTANCE.getXUnit_Units();

    /**
     * The meta object literal for the '{@link at.bestsolution.lego.lego.impl.YUnitImpl <em>YUnit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.lego.lego.impl.YUnitImpl
     * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getYUnit()
     * @generated
     */
    EClass YUNIT = eINSTANCE.getYUnit();

    /**
     * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute YUNIT__UNITS = eINSTANCE.getYUnit_Units();

    /**
     * The meta object literal for the '{@link at.bestsolution.lego.lego.impl.ZUnitImpl <em>ZUnit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.lego.lego.impl.ZUnitImpl
     * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getZUnit()
     * @generated
     */
    EClass ZUNIT = eINSTANCE.getZUnit();

    /**
     * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ZUNIT__UNITS = eINSTANCE.getZUnit_Units();

    /**
     * The meta object literal for the '{@link at.bestsolution.lego.lego.impl.BrickImpl <em>Brick</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.lego.lego.impl.BrickImpl
     * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getBrick()
     * @generated
     */
    EClass BRICK = eINSTANCE.getBrick();

    /**
     * The meta object literal for the '<em><b>XUnits</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BRICK__XUNITS = eINSTANCE.getBrick_XUnits();

    /**
     * The meta object literal for the '<em><b>YUnits</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BRICK__YUNITS = eINSTANCE.getBrick_YUnits();

    /**
     * The meta object literal for the '<em><b>ZUnits</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BRICK__ZUNITS = eINSTANCE.getBrick_ZUnits();

    /**
     * The meta object literal for the '{@link at.bestsolution.lego.lego.impl.SourceImpl <em>Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.lego.lego.impl.SourceImpl
     * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getSource()
     * @generated
     */
    EClass SOURCE = eINSTANCE.getSource();

    /**
     * The meta object literal for the '<em><b>Origin X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOURCE__ORIGIN_X = eINSTANCE.getSource_OriginX();

    /**
     * The meta object literal for the '<em><b>Origin Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOURCE__ORIGIN_Y = eINSTANCE.getSource_OriginY();

    /**
     * The meta object literal for the '<em><b>Origin Z</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOURCE__ORIGIN_Z = eINSTANCE.getSource_OriginZ();

    /**
     * The meta object literal for the '{@link at.bestsolution.lego.lego.impl.GeneratedImpl <em>Generated</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.lego.lego.impl.GeneratedImpl
     * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getGenerated()
     * @generated
     */
    EClass GENERATED = eINSTANCE.getGenerated();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERATED__TYPE = eINSTANCE.getGenerated_Type();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERATED__WIDTH = eINSTANCE.getGenerated_Width();

    /**
     * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERATED__HEIGHT = eINSTANCE.getGenerated_Height();

    /**
     * The meta object literal for the '<em><b>Depth</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERATED__DEPTH = eINSTANCE.getGenerated_Depth();

    /**
     * The meta object literal for the '{@link at.bestsolution.lego.lego.impl.FxmlIncludeImpl <em>Fxml Include</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.lego.lego.impl.FxmlIncludeImpl
     * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getFxmlInclude()
     * @generated
     */
    EClass FXML_INCLUDE = eINSTANCE.getFxmlInclude();

    /**
     * The meta object literal for the '<em><b>Source3d</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FXML_INCLUDE__SOURCE3D = eINSTANCE.getFxmlInclude_Source3d();

    /**
     * The meta object literal for the '{@link at.bestsolution.lego.lego.impl.AssemblyImpl <em>Assembly</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.lego.lego.impl.AssemblyImpl
     * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getAssembly()
     * @generated
     */
    EClass ASSEMBLY = eINSTANCE.getAssembly();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSEMBLY__ITEMS = eINSTANCE.getAssembly_Items();

    /**
     * The meta object literal for the '{@link at.bestsolution.lego.lego.impl.AssemblyItemImpl <em>Assembly Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.lego.lego.impl.AssemblyItemImpl
     * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getAssemblyItem()
     * @generated
     */
    EClass ASSEMBLY_ITEM = eINSTANCE.getAssemblyItem();

    /**
     * The meta object literal for the '{@link at.bestsolution.lego.lego.impl.RasterAssemblyItemImpl <em>Raster Assembly Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.lego.lego.impl.RasterAssemblyItemImpl
     * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getRasterAssemblyItem()
     * @generated
     */
    EClass RASTER_ASSEMBLY_ITEM = eINSTANCE.getRasterAssemblyItem();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RASTER_ASSEMBLY_ITEM__ELEMENT = eINSTANCE.getRasterAssemblyItem_Element();

    /**
     * The meta object literal for the '<em><b>XUnits</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RASTER_ASSEMBLY_ITEM__XUNITS = eINSTANCE.getRasterAssemblyItem_XUnits();

    /**
     * The meta object literal for the '<em><b>YUnits</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RASTER_ASSEMBLY_ITEM__YUNITS = eINSTANCE.getRasterAssemblyItem_YUnits();

    /**
     * The meta object literal for the '<em><b>ZUnits</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RASTER_ASSEMBLY_ITEM__ZUNITS = eINSTANCE.getRasterAssemblyItem_ZUnits();

    /**
     * The meta object literal for the '<em><b>Transform</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RASTER_ASSEMBLY_ITEM__TRANSFORM = eINSTANCE.getRasterAssemblyItem_Transform();

    /**
     * The meta object literal for the '{@link at.bestsolution.lego.lego.impl.MountedAssemblyItemImpl <em>Mounted Assembly Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.lego.lego.impl.MountedAssemblyItemImpl
     * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getMountedAssemblyItem()
     * @generated
     */
    EClass MOUNTED_ASSEMBLY_ITEM = eINSTANCE.getMountedAssemblyItem();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOUNTED_ASSEMBLY_ITEM__ELEMENT = eINSTANCE.getMountedAssemblyItem_Element();

    /**
     * The meta object literal for the '<em><b>XUnits</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOUNTED_ASSEMBLY_ITEM__XUNITS = eINSTANCE.getMountedAssemblyItem_XUnits();

    /**
     * The meta object literal for the '<em><b>YUnits</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOUNTED_ASSEMBLY_ITEM__YUNITS = eINSTANCE.getMountedAssemblyItem_YUnits();

    /**
     * The meta object literal for the '<em><b>ZUnits</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOUNTED_ASSEMBLY_ITEM__ZUNITS = eINSTANCE.getMountedAssemblyItem_ZUnits();

    /**
     * The meta object literal for the '<em><b>Rotate X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOUNTED_ASSEMBLY_ITEM__ROTATE_X = eINSTANCE.getMountedAssemblyItem_RotateX();

    /**
     * The meta object literal for the '<em><b>Rotate Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOUNTED_ASSEMBLY_ITEM__ROTATE_Y = eINSTANCE.getMountedAssemblyItem_RotateY();

    /**
     * The meta object literal for the '<em><b>Rotate Z</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOUNTED_ASSEMBLY_ITEM__ROTATE_Z = eINSTANCE.getMountedAssemblyItem_RotateZ();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOUNTED_ASSEMBLY_ITEM__ACTIONS = eINSTANCE.getMountedAssemblyItem_Actions();

  }

} //LegoPackage
