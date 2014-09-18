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
      case LegoPackage.RASTER_ITEM: return createRasterItem();
      case LegoPackage.MOUNTED_PART: return createMountedPart();
      case LegoPackage.REPOSTORY_ITEM: return createRepostoryItem();
      case LegoPackage.COLOR: return createColor();
      case LegoPackage.XUNIT: return createXUnit();
      case LegoPackage.YUNIT: return createYUnit();
      case LegoPackage.ZUNIT: return createZUnit();
      case LegoPackage.BRICK: return createBrick();
      case LegoPackage.SOURCE: return createSource();
      case LegoPackage.GENERATED: return createGenerated();
      case LegoPackage.FXML_INCLUDE: return createFxmlInclude();
      case LegoPackage.ASSEMBLY: return createAssembly();
      case LegoPackage.ASSEMBLY_ITEM: return createAssemblyItem();
      case LegoPackage.RASTER_ASSEMBLY_ITEM: return createRasterAssemblyItem();
      case LegoPackage.MOUNTED_ASSEMBLY_ITEM: return createMountedAssemblyItem();
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
  public RasterItem createRasterItem()
  {
    RasterItemImpl rasterItem = new RasterItemImpl();
    return rasterItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MountedPart createMountedPart()
  {
    MountedPartImpl mountedPart = new MountedPartImpl();
    return mountedPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RepostoryItem createRepostoryItem()
  {
    RepostoryItemImpl repostoryItem = new RepostoryItemImpl();
    return repostoryItem;
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
  public Source createSource()
  {
    SourceImpl source = new SourceImpl();
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Generated createGenerated()
  {
    GeneratedImpl generated = new GeneratedImpl();
    return generated;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FxmlInclude createFxmlInclude()
  {
    FxmlIncludeImpl fxmlInclude = new FxmlIncludeImpl();
    return fxmlInclude;
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
  public RasterAssemblyItem createRasterAssemblyItem()
  {
    RasterAssemblyItemImpl rasterAssemblyItem = new RasterAssemblyItemImpl();
    return rasterAssemblyItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MountedAssemblyItem createMountedAssemblyItem()
  {
    MountedAssemblyItemImpl mountedAssemblyItem = new MountedAssemblyItemImpl();
    return mountedAssemblyItem;
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
