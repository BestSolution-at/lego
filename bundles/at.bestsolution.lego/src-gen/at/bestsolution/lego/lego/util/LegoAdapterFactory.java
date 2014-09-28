/**
 */
package at.bestsolution.lego.lego.util;

import at.bestsolution.lego.lego.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.bestsolution.lego.lego.LegoPackage
 * @generated
 */
public class LegoAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LegoPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LegoAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = LegoPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LegoSwitch<Adapter> modelSwitch =
    new LegoSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseItemRepository(ItemRepository object)
      {
        return createItemRepositoryAdapter();
      }
      @Override
      public Adapter caseLegoElement(LegoElement object)
      {
        return createLegoElementAdapter();
      }
      @Override
      public Adapter caseRasterItem(RasterItem object)
      {
        return createRasterItemAdapter();
      }
      @Override
      public Adapter caseMountedPart(MountedPart object)
      {
        return createMountedPartAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseRepostoryItem(RepostoryItem object)
      {
        return createRepostoryItemAdapter();
      }
      @Override
      public Adapter caseColor(Color object)
      {
        return createColorAdapter();
      }
      @Override
      public Adapter caseXUnit(XUnit object)
      {
        return createXUnitAdapter();
      }
      @Override
      public Adapter caseYUnit(YUnit object)
      {
        return createYUnitAdapter();
      }
      @Override
      public Adapter caseZUnit(ZUnit object)
      {
        return createZUnitAdapter();
      }
      @Override
      public Adapter caseBrick(Brick object)
      {
        return createBrickAdapter();
      }
      @Override
      public Adapter caseSource(Source object)
      {
        return createSourceAdapter();
      }
      @Override
      public Adapter caseGenerated(Generated object)
      {
        return createGeneratedAdapter();
      }
      @Override
      public Adapter caseFxmlInclude(FxmlInclude object)
      {
        return createFxmlIncludeAdapter();
      }
      @Override
      public Adapter caseAssembly(Assembly object)
      {
        return createAssemblyAdapter();
      }
      @Override
      public Adapter caseAssemblyItem(AssemblyItem object)
      {
        return createAssemblyItemAdapter();
      }
      @Override
      public Adapter caseRasterAssemblyItem(RasterAssemblyItem object)
      {
        return createRasterAssemblyItemAdapter();
      }
      @Override
      public Adapter caseMountedAssemblyItem(MountedAssemblyItem object)
      {
        return createMountedAssemblyItemAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.lego.lego.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.lego.lego.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.lego.lego.ItemRepository <em>Item Repository</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.lego.lego.ItemRepository
   * @generated
   */
  public Adapter createItemRepositoryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.lego.lego.LegoElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.lego.lego.LegoElement
   * @generated
   */
  public Adapter createLegoElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.lego.lego.RasterItem <em>Raster Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.lego.lego.RasterItem
   * @generated
   */
  public Adapter createRasterItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.lego.lego.MountedPart <em>Mounted Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.lego.lego.MountedPart
   * @generated
   */
  public Adapter createMountedPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.lego.lego.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.lego.lego.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.lego.lego.RepostoryItem <em>Repostory Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.lego.lego.RepostoryItem
   * @generated
   */
  public Adapter createRepostoryItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.lego.lego.Color <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.lego.lego.Color
   * @generated
   */
  public Adapter createColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.lego.lego.XUnit <em>XUnit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.lego.lego.XUnit
   * @generated
   */
  public Adapter createXUnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.lego.lego.YUnit <em>YUnit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.lego.lego.YUnit
   * @generated
   */
  public Adapter createYUnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.lego.lego.ZUnit <em>ZUnit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.lego.lego.ZUnit
   * @generated
   */
  public Adapter createZUnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.lego.lego.Brick <em>Brick</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.lego.lego.Brick
   * @generated
   */
  public Adapter createBrickAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.lego.lego.Source <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.lego.lego.Source
   * @generated
   */
  public Adapter createSourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.lego.lego.Generated <em>Generated</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.lego.lego.Generated
   * @generated
   */
  public Adapter createGeneratedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.lego.lego.FxmlInclude <em>Fxml Include</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.lego.lego.FxmlInclude
   * @generated
   */
  public Adapter createFxmlIncludeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.lego.lego.Assembly <em>Assembly</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.lego.lego.Assembly
   * @generated
   */
  public Adapter createAssemblyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.lego.lego.AssemblyItem <em>Assembly Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.lego.lego.AssemblyItem
   * @generated
   */
  public Adapter createAssemblyItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.lego.lego.RasterAssemblyItem <em>Raster Assembly Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.lego.lego.RasterAssemblyItem
   * @generated
   */
  public Adapter createRasterAssemblyItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.lego.lego.MountedAssemblyItem <em>Mounted Assembly Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.lego.lego.MountedAssemblyItem
   * @generated
   */
  public Adapter createMountedAssemblyItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //LegoAdapterFactory
