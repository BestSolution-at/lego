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
   * The meta object id for the '{@link at.bestsolution.lego.lego.impl.ItemImpl <em>Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.lego.lego.impl.ItemImpl
   * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getItem()
   * @generated
   */
  int ITEM = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__NAME = LEGO_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>XUnits</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__XUNITS = LEGO_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>YUnits</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__YUNITS = LEGO_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Fill</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__FILL = LEGO_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_FEATURE_COUNT = LEGO_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link at.bestsolution.lego.lego.impl.ColorImpl <em>Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.lego.lego.impl.ColorImpl
   * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getColor()
   * @generated
   */
  int COLOR = 4;

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
  int XUNIT = 5;

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
  int YUNIT = 6;

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
  int ZUNIT = 7;

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
  int BRICK = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRICK__NAME = ITEM__NAME;

  /**
   * The feature id for the '<em><b>XUnits</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRICK__XUNITS = ITEM__XUNITS;

  /**
   * The feature id for the '<em><b>YUnits</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRICK__YUNITS = ITEM__YUNITS;

  /**
   * The feature id for the '<em><b>Fill</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRICK__FILL = ITEM__FILL;

  /**
   * The feature id for the '<em><b>ZUnits</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRICK__ZUNITS = ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRICK__SOURCE = ITEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Brick</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRICK_FEATURE_COUNT = ITEM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.lego.lego.impl.SourceImpl <em>Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.lego.lego.impl.SourceImpl
   * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getSource()
   * @generated
   */
  int SOURCE = 9;

  /**
   * The number of structural features of the '<em>Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bestsolution.lego.lego.impl.FxmlIncludeImpl <em>Fxml Include</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.lego.lego.impl.FxmlIncludeImpl
   * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getFxmlInclude()
   * @generated
   */
  int FXML_INCLUDE = 10;

  /**
   * The feature id for the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FXML_INCLUDE__SOURCE = SOURCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Origin X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FXML_INCLUDE__ORIGIN_X = SOURCE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Origin Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FXML_INCLUDE__ORIGIN_Y = SOURCE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Origin Z</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FXML_INCLUDE__ORIGIN_Z = SOURCE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Fxml Include</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FXML_INCLUDE_FEATURE_COUNT = SOURCE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link at.bestsolution.lego.lego.impl.RoundBrickImpl <em>Round Brick</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.lego.lego.impl.RoundBrickImpl
   * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getRoundBrick()
   * @generated
   */
  int ROUND_BRICK = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUND_BRICK__NAME = ITEM__NAME;

  /**
   * The feature id for the '<em><b>XUnits</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUND_BRICK__XUNITS = ITEM__XUNITS;

  /**
   * The feature id for the '<em><b>YUnits</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUND_BRICK__YUNITS = ITEM__YUNITS;

  /**
   * The feature id for the '<em><b>Fill</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUND_BRICK__FILL = ITEM__FILL;

  /**
   * The feature id for the '<em><b>ZUnits</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUND_BRICK__ZUNITS = ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Round Brick</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUND_BRICK_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.lego.lego.impl.DoorBrickImpl <em>Door Brick</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.lego.lego.impl.DoorBrickImpl
   * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getDoorBrick()
   * @generated
   */
  int DOOR_BRICK = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOOR_BRICK__NAME = ITEM__NAME;

  /**
   * The feature id for the '<em><b>XUnits</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOOR_BRICK__XUNITS = ITEM__XUNITS;

  /**
   * The feature id for the '<em><b>YUnits</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOOR_BRICK__YUNITS = ITEM__YUNITS;

  /**
   * The feature id for the '<em><b>Fill</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOOR_BRICK__FILL = ITEM__FILL;

  /**
   * The feature id for the '<em><b>ZUnits</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOOR_BRICK__ZUNITS = ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Door Brick</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOOR_BRICK_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.lego.lego.impl.DoorImpl <em>Door</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.lego.lego.impl.DoorImpl
   * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getDoor()
   * @generated
   */
  int DOOR = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOOR__NAME = ITEM__NAME;

  /**
   * The feature id for the '<em><b>XUnits</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOOR__XUNITS = ITEM__XUNITS;

  /**
   * The feature id for the '<em><b>YUnits</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOOR__YUNITS = ITEM__YUNITS;

  /**
   * The feature id for the '<em><b>Fill</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOOR__FILL = ITEM__FILL;

  /**
   * The number of structural features of the '<em>Door</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOOR_FEATURE_COUNT = ITEM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bestsolution.lego.lego.impl.AssemblyImpl <em>Assembly</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.lego.lego.impl.AssemblyImpl
   * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getAssembly()
   * @generated
   */
  int ASSEMBLY = 14;

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
  int ASSEMBLY_ITEM = 15;

  /**
   * The feature id for the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLY_ITEM__ELEMENT = 0;

  /**
   * The feature id for the '<em><b>XUnits</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLY_ITEM__XUNITS = 1;

  /**
   * The feature id for the '<em><b>YUnits</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLY_ITEM__YUNITS = 2;

  /**
   * The feature id for the '<em><b>ZUnits</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLY_ITEM__ZUNITS = 3;

  /**
   * The feature id for the '<em><b>Transform</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLY_ITEM__TRANSFORM = 4;

  /**
   * The number of structural features of the '<em>Assembly Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLY_ITEM_FEATURE_COUNT = 5;


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
   * Returns the meta object for class '{@link at.bestsolution.lego.lego.Item <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item</em>'.
   * @see at.bestsolution.lego.lego.Item
   * @generated
   */
  EClass getItem();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.lego.lego.Item#getXUnits <em>XUnits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>XUnits</em>'.
   * @see at.bestsolution.lego.lego.Item#getXUnits()
   * @see #getItem()
   * @generated
   */
  EReference getItem_XUnits();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.lego.lego.Item#getYUnits <em>YUnits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>YUnits</em>'.
   * @see at.bestsolution.lego.lego.Item#getYUnits()
   * @see #getItem()
   * @generated
   */
  EReference getItem_YUnits();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.lego.lego.Item#getFill <em>Fill</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fill</em>'.
   * @see at.bestsolution.lego.lego.Item#getFill()
   * @see #getItem()
   * @generated
   */
  EReference getItem_Fill();

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
   * Returns the meta object for the containment reference '{@link at.bestsolution.lego.lego.Brick#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see at.bestsolution.lego.lego.Brick#getSource()
   * @see #getBrick()
   * @generated
   */
  EReference getBrick_Source();

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
   * Returns the meta object for class '{@link at.bestsolution.lego.lego.FxmlInclude <em>Fxml Include</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fxml Include</em>'.
   * @see at.bestsolution.lego.lego.FxmlInclude
   * @generated
   */
  EClass getFxmlInclude();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.lego.lego.FxmlInclude#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source</em>'.
   * @see at.bestsolution.lego.lego.FxmlInclude#getSource()
   * @see #getFxmlInclude()
   * @generated
   */
  EAttribute getFxmlInclude_Source();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.lego.lego.FxmlInclude#getOriginX <em>Origin X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Origin X</em>'.
   * @see at.bestsolution.lego.lego.FxmlInclude#getOriginX()
   * @see #getFxmlInclude()
   * @generated
   */
  EAttribute getFxmlInclude_OriginX();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.lego.lego.FxmlInclude#getOriginY <em>Origin Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Origin Y</em>'.
   * @see at.bestsolution.lego.lego.FxmlInclude#getOriginY()
   * @see #getFxmlInclude()
   * @generated
   */
  EAttribute getFxmlInclude_OriginY();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.lego.lego.FxmlInclude#getOriginZ <em>Origin Z</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Origin Z</em>'.
   * @see at.bestsolution.lego.lego.FxmlInclude#getOriginZ()
   * @see #getFxmlInclude()
   * @generated
   */
  EAttribute getFxmlInclude_OriginZ();

  /**
   * Returns the meta object for class '{@link at.bestsolution.lego.lego.RoundBrick <em>Round Brick</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Round Brick</em>'.
   * @see at.bestsolution.lego.lego.RoundBrick
   * @generated
   */
  EClass getRoundBrick();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.lego.lego.RoundBrick#getZUnits <em>ZUnits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>ZUnits</em>'.
   * @see at.bestsolution.lego.lego.RoundBrick#getZUnits()
   * @see #getRoundBrick()
   * @generated
   */
  EReference getRoundBrick_ZUnits();

  /**
   * Returns the meta object for class '{@link at.bestsolution.lego.lego.DoorBrick <em>Door Brick</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Door Brick</em>'.
   * @see at.bestsolution.lego.lego.DoorBrick
   * @generated
   */
  EClass getDoorBrick();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.lego.lego.DoorBrick#getZUnits <em>ZUnits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>ZUnits</em>'.
   * @see at.bestsolution.lego.lego.DoorBrick#getZUnits()
   * @see #getDoorBrick()
   * @generated
   */
  EReference getDoorBrick_ZUnits();

  /**
   * Returns the meta object for class '{@link at.bestsolution.lego.lego.Door <em>Door</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Door</em>'.
   * @see at.bestsolution.lego.lego.Door
   * @generated
   */
  EClass getDoor();

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
   * Returns the meta object for the reference '{@link at.bestsolution.lego.lego.AssemblyItem#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Element</em>'.
   * @see at.bestsolution.lego.lego.AssemblyItem#getElement()
   * @see #getAssemblyItem()
   * @generated
   */
  EReference getAssemblyItem_Element();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.lego.lego.AssemblyItem#getXUnits <em>XUnits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>XUnits</em>'.
   * @see at.bestsolution.lego.lego.AssemblyItem#getXUnits()
   * @see #getAssemblyItem()
   * @generated
   */
  EReference getAssemblyItem_XUnits();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.lego.lego.AssemblyItem#getYUnits <em>YUnits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>YUnits</em>'.
   * @see at.bestsolution.lego.lego.AssemblyItem#getYUnits()
   * @see #getAssemblyItem()
   * @generated
   */
  EReference getAssemblyItem_YUnits();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.lego.lego.AssemblyItem#getZUnits <em>ZUnits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>ZUnits</em>'.
   * @see at.bestsolution.lego.lego.AssemblyItem#getZUnits()
   * @see #getAssemblyItem()
   * @generated
   */
  EReference getAssemblyItem_ZUnits();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.lego.lego.AssemblyItem#getTransform <em>Transform</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Transform</em>'.
   * @see at.bestsolution.lego.lego.AssemblyItem#getTransform()
   * @see #getAssemblyItem()
   * @generated
   */
  EAttribute getAssemblyItem_Transform();

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
     * The meta object literal for the '{@link at.bestsolution.lego.lego.impl.ItemImpl <em>Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.lego.lego.impl.ItemImpl
     * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getItem()
     * @generated
     */
    EClass ITEM = eINSTANCE.getItem();

    /**
     * The meta object literal for the '<em><b>XUnits</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITEM__XUNITS = eINSTANCE.getItem_XUnits();

    /**
     * The meta object literal for the '<em><b>YUnits</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITEM__YUNITS = eINSTANCE.getItem_YUnits();

    /**
     * The meta object literal for the '<em><b>Fill</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITEM__FILL = eINSTANCE.getItem_Fill();

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
     * The meta object literal for the '<em><b>ZUnits</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BRICK__ZUNITS = eINSTANCE.getBrick_ZUnits();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BRICK__SOURCE = eINSTANCE.getBrick_Source();

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
     * The meta object literal for the '{@link at.bestsolution.lego.lego.impl.FxmlIncludeImpl <em>Fxml Include</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.lego.lego.impl.FxmlIncludeImpl
     * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getFxmlInclude()
     * @generated
     */
    EClass FXML_INCLUDE = eINSTANCE.getFxmlInclude();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FXML_INCLUDE__SOURCE = eINSTANCE.getFxmlInclude_Source();

    /**
     * The meta object literal for the '<em><b>Origin X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FXML_INCLUDE__ORIGIN_X = eINSTANCE.getFxmlInclude_OriginX();

    /**
     * The meta object literal for the '<em><b>Origin Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FXML_INCLUDE__ORIGIN_Y = eINSTANCE.getFxmlInclude_OriginY();

    /**
     * The meta object literal for the '<em><b>Origin Z</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FXML_INCLUDE__ORIGIN_Z = eINSTANCE.getFxmlInclude_OriginZ();

    /**
     * The meta object literal for the '{@link at.bestsolution.lego.lego.impl.RoundBrickImpl <em>Round Brick</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.lego.lego.impl.RoundBrickImpl
     * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getRoundBrick()
     * @generated
     */
    EClass ROUND_BRICK = eINSTANCE.getRoundBrick();

    /**
     * The meta object literal for the '<em><b>ZUnits</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROUND_BRICK__ZUNITS = eINSTANCE.getRoundBrick_ZUnits();

    /**
     * The meta object literal for the '{@link at.bestsolution.lego.lego.impl.DoorBrickImpl <em>Door Brick</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.lego.lego.impl.DoorBrickImpl
     * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getDoorBrick()
     * @generated
     */
    EClass DOOR_BRICK = eINSTANCE.getDoorBrick();

    /**
     * The meta object literal for the '<em><b>ZUnits</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOOR_BRICK__ZUNITS = eINSTANCE.getDoorBrick_ZUnits();

    /**
     * The meta object literal for the '{@link at.bestsolution.lego.lego.impl.DoorImpl <em>Door</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.lego.lego.impl.DoorImpl
     * @see at.bestsolution.lego.lego.impl.LegoPackageImpl#getDoor()
     * @generated
     */
    EClass DOOR = eINSTANCE.getDoor();

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
     * The meta object literal for the '<em><b>Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSEMBLY_ITEM__ELEMENT = eINSTANCE.getAssemblyItem_Element();

    /**
     * The meta object literal for the '<em><b>XUnits</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSEMBLY_ITEM__XUNITS = eINSTANCE.getAssemblyItem_XUnits();

    /**
     * The meta object literal for the '<em><b>YUnits</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSEMBLY_ITEM__YUNITS = eINSTANCE.getAssemblyItem_YUnits();

    /**
     * The meta object literal for the '<em><b>ZUnits</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSEMBLY_ITEM__ZUNITS = eINSTANCE.getAssemblyItem_ZUnits();

    /**
     * The meta object literal for the '<em><b>Transform</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSEMBLY_ITEM__TRANSFORM = eINSTANCE.getAssemblyItem_Transform();

  }

} //LegoPackage
