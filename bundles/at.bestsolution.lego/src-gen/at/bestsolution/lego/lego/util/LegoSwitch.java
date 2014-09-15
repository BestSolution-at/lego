/**
 */
package at.bestsolution.lego.lego.util;

import at.bestsolution.lego.lego.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see at.bestsolution.lego.lego.LegoPackage
 * @generated
 */
public class LegoSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LegoPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LegoSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = LegoPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case LegoPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LegoPackage.ITEM_REPOSITORY:
      {
        ItemRepository itemRepository = (ItemRepository)theEObject;
        T result = caseItemRepository(itemRepository);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LegoPackage.LEGO_ELEMENT:
      {
        LegoElement legoElement = (LegoElement)theEObject;
        T result = caseLegoElement(legoElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LegoPackage.ITEM:
      {
        Item item = (Item)theEObject;
        T result = caseItem(item);
        if (result == null) result = caseLegoElement(item);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LegoPackage.COLOR:
      {
        Color color = (Color)theEObject;
        T result = caseColor(color);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LegoPackage.XUNIT:
      {
        XUnit xUnit = (XUnit)theEObject;
        T result = caseXUnit(xUnit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LegoPackage.YUNIT:
      {
        YUnit yUnit = (YUnit)theEObject;
        T result = caseYUnit(yUnit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LegoPackage.ZUNIT:
      {
        ZUnit zUnit = (ZUnit)theEObject;
        T result = caseZUnit(zUnit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LegoPackage.BRICK:
      {
        Brick brick = (Brick)theEObject;
        T result = caseBrick(brick);
        if (result == null) result = caseItem(brick);
        if (result == null) result = caseLegoElement(brick);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LegoPackage.ROUND_BRICK:
      {
        RoundBrick roundBrick = (RoundBrick)theEObject;
        T result = caseRoundBrick(roundBrick);
        if (result == null) result = caseItem(roundBrick);
        if (result == null) result = caseLegoElement(roundBrick);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LegoPackage.DOOR_BRICK:
      {
        DoorBrick doorBrick = (DoorBrick)theEObject;
        T result = caseDoorBrick(doorBrick);
        if (result == null) result = caseItem(doorBrick);
        if (result == null) result = caseLegoElement(doorBrick);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LegoPackage.DOOR:
      {
        Door door = (Door)theEObject;
        T result = caseDoor(door);
        if (result == null) result = caseItem(door);
        if (result == null) result = caseLegoElement(door);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LegoPackage.ASSEMBLY:
      {
        Assembly assembly = (Assembly)theEObject;
        T result = caseAssembly(assembly);
        if (result == null) result = caseLegoElement(assembly);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LegoPackage.ASSEMBLY_ITEM:
      {
        AssemblyItem assemblyItem = (AssemblyItem)theEObject;
        T result = caseAssemblyItem(assemblyItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Item Repository</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item Repository</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItemRepository(ItemRepository object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLegoElement(LegoElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItem(Item object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColor(Color object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XUnit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XUnit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXUnit(XUnit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>YUnit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>YUnit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseYUnit(YUnit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ZUnit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ZUnit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseZUnit(ZUnit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Brick</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Brick</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBrick(Brick object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Round Brick</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Round Brick</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoundBrick(RoundBrick object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Door Brick</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Door Brick</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoorBrick(DoorBrick object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Door</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Door</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoor(Door object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assembly</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assembly</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssembly(Assembly object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assembly Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assembly Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssemblyItem(AssemblyItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //LegoSwitch
