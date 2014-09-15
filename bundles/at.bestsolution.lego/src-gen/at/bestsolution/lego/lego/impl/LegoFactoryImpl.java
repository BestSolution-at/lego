/**
 */
package at.bestsolution.lego.lego.impl;

import at.bestsolution.lego.lego.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LegoFactoryImpl extends EFactoryImpl implements LegoFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LegoFactory init()
  {
    try
    {
      LegoFactory theLegoFactory = (LegoFactory)EPackage.Registry.INSTANCE.getEFactory(LegoPackage.eNS_URI);
      if (theLegoFactory != null)
      {
        return theLegoFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LegoFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LegoFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LegoPackage.MODEL: return createModel();
      case LegoPackage.ITEM_REPOSITORY: return createItemRepository();
      case LegoPackage.LEGO_ELEMENT: return createLegoElement();
      case LegoPackage.ITEM: return createItem();
      case LegoPackage.COLOR: return createColor();
      case LegoPackage.XUNIT: return createXUnit();
      case LegoPackage.YUNIT: return createYUnit();
      case LegoPackage.ZUNIT: return createZUnit();
      case LegoPackage.BRICK: return createBrick();
      case LegoPackage.ROUND_BRICK: return createRoundBrick();
      case LegoPackage.DOOR_BRICK: return createDoorBrick();
      case LegoPackage.DOOR: return createDoor();
      case LegoPackage.ASSEMBLY: return createAssembly();
      case LegoPackage.ASSEMBLY_ITEM: return createAssemblyItem();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemRepository createItemRepository()
  {
    ItemRepositoryImpl itemRepository = new ItemRepositoryImpl();
    return itemRepository;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LegoElement createLegoElement()
  {
    LegoElementImpl legoElement = new LegoElementImpl();
    return legoElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Item createItem()
  {
    ItemImpl item = new ItemImpl();
    return item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color createColor()
  {
    ColorImpl color = new ColorImpl();
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XUnit createXUnit()
  {
    XUnitImpl xUnit = new XUnitImpl();
    return xUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YUnit createYUnit()
  {
    YUnitImpl yUnit = new YUnitImpl();
    return yUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ZUnit createZUnit()
  {
    ZUnitImpl zUnit = new ZUnitImpl();
    return zUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Brick createBrick()
  {
    BrickImpl brick = new BrickImpl();
    return brick;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoundBrick createRoundBrick()
  {
    RoundBrickImpl roundBrick = new RoundBrickImpl();
    return roundBrick;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoorBrick createDoorBrick()
  {
    DoorBrickImpl doorBrick = new DoorBrickImpl();
    return doorBrick;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Door createDoor()
  {
    DoorImpl door = new DoorImpl();
    return door;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assembly createAssembly()
  {
    AssemblyImpl assembly = new AssemblyImpl();
    return assembly;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssemblyItem createAssemblyItem()
  {
    AssemblyItemImpl assemblyItem = new AssemblyItemImpl();
    return assemblyItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LegoPackage getLegoPackage()
  {
    return (LegoPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LegoPackage getPackage()
  {
    return LegoPackage.eINSTANCE;
  }

} //LegoFactoryImpl
