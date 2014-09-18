/**
 */
package at.bestsolution.lego.lego.impl;

import at.bestsolution.lego.lego.Assembly;
import at.bestsolution.lego.lego.AssemblyItem;
import at.bestsolution.lego.lego.Brick;
import at.bestsolution.lego.lego.Color;
import at.bestsolution.lego.lego.FxmlInclude;
import at.bestsolution.lego.lego.Generated;
import at.bestsolution.lego.lego.ItemRepository;
import at.bestsolution.lego.lego.LegoElement;
import at.bestsolution.lego.lego.LegoFactory;
import at.bestsolution.lego.lego.LegoPackage;
import at.bestsolution.lego.lego.Model;
import at.bestsolution.lego.lego.MountedAssemblyItem;
import at.bestsolution.lego.lego.MountedPart;
import at.bestsolution.lego.lego.RasterAssemblyItem;
import at.bestsolution.lego.lego.RasterItem;
import at.bestsolution.lego.lego.RepostoryItem;
import at.bestsolution.lego.lego.Source;
import at.bestsolution.lego.lego.XUnit;
import at.bestsolution.lego.lego.YUnit;
import at.bestsolution.lego.lego.ZUnit;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LegoPackageImpl extends EPackageImpl implements LegoPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itemRepositoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass legoElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rasterItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mountedPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass repostoryItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xUnitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass yUnitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass zUnitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass brickEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass generatedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fxmlIncludeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assemblyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assemblyItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rasterAssemblyItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mountedAssemblyItemEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see at.bestsolution.lego.lego.LegoPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private LegoPackageImpl()
  {
    super(eNS_URI, LegoFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link LegoPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static LegoPackage init()
  {
    if (isInited) return (LegoPackage)EPackage.Registry.INSTANCE.getEPackage(LegoPackage.eNS_URI);

    // Obtain or create and register package
    LegoPackageImpl theLegoPackage = (LegoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LegoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LegoPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theLegoPackage.createPackageContents();

    // Initialize created meta-data
    theLegoPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theLegoPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(LegoPackage.eNS_URI, theLegoPackage);
    return theLegoPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Repo()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Assembly()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItemRepository()
  {
    return itemRepositoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItemRepository_Name()
  {
    return (EAttribute)itemRepositoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getItemRepository_ElementList()
  {
    return (EReference)itemRepositoryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLegoElement()
  {
    return legoElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLegoElement_Name()
  {
    return (EAttribute)legoElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRasterItem()
  {
    return rasterItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMountedPart()
  {
    return mountedPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRepostoryItem()
  {
    return repostoryItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepostoryItem_Fill()
  {
    return (EReference)repostoryItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepostoryItem_Source()
  {
    return (EReference)repostoryItemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColor()
  {
    return colorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColor_R()
  {
    return (EAttribute)colorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColor_G()
  {
    return (EAttribute)colorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColor_B()
  {
    return (EAttribute)colorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXUnit()
  {
    return xUnitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXUnit_Units()
  {
    return (EAttribute)xUnitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getYUnit()
  {
    return yUnitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getYUnit_Units()
  {
    return (EAttribute)yUnitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getZUnit()
  {
    return zUnitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getZUnit_Units()
  {
    return (EAttribute)zUnitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBrick()
  {
    return brickEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBrick_XUnits()
  {
    return (EReference)brickEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBrick_YUnits()
  {
    return (EReference)brickEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBrick_ZUnits()
  {
    return (EReference)brickEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSource()
  {
    return sourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSource_OriginX()
  {
    return (EAttribute)sourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSource_OriginY()
  {
    return (EAttribute)sourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSource_OriginZ()
  {
    return (EAttribute)sourceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGenerated()
  {
    return generatedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGenerated_Width()
  {
    return (EAttribute)generatedEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGenerated_Height()
  {
    return (EAttribute)generatedEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGenerated_Depth()
  {
    return (EAttribute)generatedEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFxmlInclude()
  {
    return fxmlIncludeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFxmlInclude_Source3d()
  {
    return (EAttribute)fxmlIncludeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssembly()
  {
    return assemblyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssembly_Items()
  {
    return (EReference)assemblyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssemblyItem()
  {
    return assemblyItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssemblyItem_Element()
  {
    return (EReference)assemblyItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRasterAssemblyItem()
  {
    return rasterAssemblyItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRasterAssemblyItem_XUnits()
  {
    return (EReference)rasterAssemblyItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRasterAssemblyItem_YUnits()
  {
    return (EReference)rasterAssemblyItemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRasterAssemblyItem_ZUnits()
  {
    return (EReference)rasterAssemblyItemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRasterAssemblyItem_Transform()
  {
    return (EAttribute)rasterAssemblyItemEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMountedAssemblyItem()
  {
    return mountedAssemblyItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMountedAssemblyItem_XUnits()
  {
    return (EAttribute)mountedAssemblyItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMountedAssemblyItem_YUnits()
  {
    return (EAttribute)mountedAssemblyItemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMountedAssemblyItem_ZUnits()
  {
    return (EAttribute)mountedAssemblyItemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMountedAssemblyItem_RotateX()
  {
    return (EAttribute)mountedAssemblyItemEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMountedAssemblyItem_RotateY()
  {
    return (EAttribute)mountedAssemblyItemEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMountedAssemblyItem_RotateZ()
  {
    return (EAttribute)mountedAssemblyItemEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LegoFactory getLegoFactory()
  {
    return (LegoFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__REPO);
    createEReference(modelEClass, MODEL__ASSEMBLY);

    itemRepositoryEClass = createEClass(ITEM_REPOSITORY);
    createEAttribute(itemRepositoryEClass, ITEM_REPOSITORY__NAME);
    createEReference(itemRepositoryEClass, ITEM_REPOSITORY__ELEMENT_LIST);

    legoElementEClass = createEClass(LEGO_ELEMENT);
    createEAttribute(legoElementEClass, LEGO_ELEMENT__NAME);

    rasterItemEClass = createEClass(RASTER_ITEM);

    mountedPartEClass = createEClass(MOUNTED_PART);

    repostoryItemEClass = createEClass(REPOSTORY_ITEM);
    createEReference(repostoryItemEClass, REPOSTORY_ITEM__FILL);
    createEReference(repostoryItemEClass, REPOSTORY_ITEM__SOURCE);

    colorEClass = createEClass(COLOR);
    createEAttribute(colorEClass, COLOR__R);
    createEAttribute(colorEClass, COLOR__G);
    createEAttribute(colorEClass, COLOR__B);

    xUnitEClass = createEClass(XUNIT);
    createEAttribute(xUnitEClass, XUNIT__UNITS);

    yUnitEClass = createEClass(YUNIT);
    createEAttribute(yUnitEClass, YUNIT__UNITS);

    zUnitEClass = createEClass(ZUNIT);
    createEAttribute(zUnitEClass, ZUNIT__UNITS);

    brickEClass = createEClass(BRICK);
    createEReference(brickEClass, BRICK__XUNITS);
    createEReference(brickEClass, BRICK__YUNITS);
    createEReference(brickEClass, BRICK__ZUNITS);

    sourceEClass = createEClass(SOURCE);
    createEAttribute(sourceEClass, SOURCE__ORIGIN_X);
    createEAttribute(sourceEClass, SOURCE__ORIGIN_Y);
    createEAttribute(sourceEClass, SOURCE__ORIGIN_Z);

    generatedEClass = createEClass(GENERATED);
    createEAttribute(generatedEClass, GENERATED__WIDTH);
    createEAttribute(generatedEClass, GENERATED__HEIGHT);
    createEAttribute(generatedEClass, GENERATED__DEPTH);

    fxmlIncludeEClass = createEClass(FXML_INCLUDE);
    createEAttribute(fxmlIncludeEClass, FXML_INCLUDE__SOURCE3D);

    assemblyEClass = createEClass(ASSEMBLY);
    createEReference(assemblyEClass, ASSEMBLY__ITEMS);

    assemblyItemEClass = createEClass(ASSEMBLY_ITEM);
    createEReference(assemblyItemEClass, ASSEMBLY_ITEM__ELEMENT);

    rasterAssemblyItemEClass = createEClass(RASTER_ASSEMBLY_ITEM);
    createEReference(rasterAssemblyItemEClass, RASTER_ASSEMBLY_ITEM__XUNITS);
    createEReference(rasterAssemblyItemEClass, RASTER_ASSEMBLY_ITEM__YUNITS);
    createEReference(rasterAssemblyItemEClass, RASTER_ASSEMBLY_ITEM__ZUNITS);
    createEAttribute(rasterAssemblyItemEClass, RASTER_ASSEMBLY_ITEM__TRANSFORM);

    mountedAssemblyItemEClass = createEClass(MOUNTED_ASSEMBLY_ITEM);
    createEAttribute(mountedAssemblyItemEClass, MOUNTED_ASSEMBLY_ITEM__XUNITS);
    createEAttribute(mountedAssemblyItemEClass, MOUNTED_ASSEMBLY_ITEM__YUNITS);
    createEAttribute(mountedAssemblyItemEClass, MOUNTED_ASSEMBLY_ITEM__ZUNITS);
    createEAttribute(mountedAssemblyItemEClass, MOUNTED_ASSEMBLY_ITEM__ROTATE_X);
    createEAttribute(mountedAssemblyItemEClass, MOUNTED_ASSEMBLY_ITEM__ROTATE_Y);
    createEAttribute(mountedAssemblyItemEClass, MOUNTED_ASSEMBLY_ITEM__ROTATE_Z);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    mountedPartEClass.getESuperTypes().add(this.getRepostoryItem());
    repostoryItemEClass.getESuperTypes().add(this.getLegoElement());
    brickEClass.getESuperTypes().add(this.getRasterItem());
    brickEClass.getESuperTypes().add(this.getRepostoryItem());
    generatedEClass.getESuperTypes().add(this.getSource());
    fxmlIncludeEClass.getESuperTypes().add(this.getSource());
    assemblyEClass.getESuperTypes().add(this.getLegoElement());
    assemblyEClass.getESuperTypes().add(this.getRasterItem());
    rasterAssemblyItemEClass.getESuperTypes().add(this.getAssemblyItem());
    mountedAssemblyItemEClass.getESuperTypes().add(this.getAssemblyItem());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Repo(), this.getItemRepository(), null, "repo", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Assembly(), this.getAssembly(), null, "assembly", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(itemRepositoryEClass, ItemRepository.class, "ItemRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getItemRepository_Name(), ecorePackage.getEString(), "name", null, 0, 1, ItemRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getItemRepository_ElementList(), this.getRepostoryItem(), null, "elementList", null, 0, -1, ItemRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(legoElementEClass, LegoElement.class, "LegoElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLegoElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, LegoElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rasterItemEClass, RasterItem.class, "RasterItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mountedPartEClass, MountedPart.class, "MountedPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(repostoryItemEClass, RepostoryItem.class, "RepostoryItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRepostoryItem_Fill(), this.getColor(), null, "fill", null, 0, 1, RepostoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRepostoryItem_Source(), this.getSource(), null, "source", null, 0, 1, RepostoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colorEClass, Color.class, "Color", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColor_R(), ecorePackage.getEInt(), "r", null, 0, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColor_G(), ecorePackage.getEInt(), "g", null, 0, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColor_B(), ecorePackage.getEInt(), "b", null, 0, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xUnitEClass, XUnit.class, "XUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXUnit_Units(), ecorePackage.getEInt(), "units", null, 0, 1, XUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(yUnitEClass, YUnit.class, "YUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getYUnit_Units(), ecorePackage.getEInt(), "units", null, 0, 1, YUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(zUnitEClass, ZUnit.class, "ZUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getZUnit_Units(), ecorePackage.getEInt(), "units", null, 0, 1, ZUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(brickEClass, Brick.class, "Brick", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBrick_XUnits(), this.getXUnit(), null, "xUnits", null, 0, 1, Brick.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBrick_YUnits(), this.getYUnit(), null, "yUnits", null, 0, 1, Brick.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBrick_ZUnits(), this.getZUnit(), null, "zUnits", null, 0, 1, Brick.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sourceEClass, Source.class, "Source", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSource_OriginX(), ecorePackage.getEFloat(), "originX", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSource_OriginY(), ecorePackage.getEFloat(), "originY", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSource_OriginZ(), ecorePackage.getEFloat(), "originZ", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(generatedEClass, Generated.class, "Generated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGenerated_Width(), ecorePackage.getEFloat(), "width", null, 0, 1, Generated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGenerated_Height(), ecorePackage.getEFloat(), "height", null, 0, 1, Generated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGenerated_Depth(), ecorePackage.getEFloat(), "depth", null, 0, 1, Generated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fxmlIncludeEClass, FxmlInclude.class, "FxmlInclude", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFxmlInclude_Source3d(), ecorePackage.getEString(), "source3d", null, 0, 1, FxmlInclude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assemblyEClass, Assembly.class, "Assembly", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssembly_Items(), this.getAssemblyItem(), null, "items", null, 0, -1, Assembly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assemblyItemEClass, AssemblyItem.class, "AssemblyItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssemblyItem_Element(), this.getRasterItem(), null, "element", null, 0, 1, AssemblyItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rasterAssemblyItemEClass, RasterAssemblyItem.class, "RasterAssemblyItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRasterAssemblyItem_XUnits(), this.getXUnit(), null, "xUnits", null, 0, 1, RasterAssemblyItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRasterAssemblyItem_YUnits(), this.getYUnit(), null, "yUnits", null, 0, 1, RasterAssemblyItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRasterAssemblyItem_ZUnits(), this.getZUnit(), null, "zUnits", null, 0, 1, RasterAssemblyItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRasterAssemblyItem_Transform(), ecorePackage.getEString(), "transform", null, 0, 1, RasterAssemblyItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mountedAssemblyItemEClass, MountedAssemblyItem.class, "MountedAssemblyItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMountedAssemblyItem_XUnits(), ecorePackage.getEFloat(), "xUnits", null, 0, 1, MountedAssemblyItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMountedAssemblyItem_YUnits(), ecorePackage.getEFloat(), "yUnits", null, 0, 1, MountedAssemblyItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMountedAssemblyItem_ZUnits(), ecorePackage.getEFloat(), "zUnits", null, 0, 1, MountedAssemblyItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMountedAssemblyItem_RotateX(), ecorePackage.getEFloat(), "rotateX", null, 0, 1, MountedAssemblyItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMountedAssemblyItem_RotateY(), ecorePackage.getEFloat(), "rotateY", null, 0, 1, MountedAssemblyItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMountedAssemblyItem_RotateZ(), ecorePackage.getEFloat(), "rotateZ", null, 0, 1, MountedAssemblyItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //LegoPackageImpl
