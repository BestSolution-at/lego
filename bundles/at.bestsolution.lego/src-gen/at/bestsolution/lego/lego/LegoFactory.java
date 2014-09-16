/**
 */
package at.bestsolution.lego.lego;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see at.bestsolution.lego.lego.LegoPackage
 * @generated
 */
public interface LegoFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LegoFactory eINSTANCE = at.bestsolution.lego.lego.impl.LegoFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Item Repository</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Item Repository</em>'.
   * @generated
   */
  ItemRepository createItemRepository();

  /**
   * Returns a new object of class '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element</em>'.
   * @generated
   */
  LegoElement createLegoElement();

  /**
   * Returns a new object of class '<em>Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Item</em>'.
   * @generated
   */
  Item createItem();

  /**
   * Returns a new object of class '<em>Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Color</em>'.
   * @generated
   */
  Color createColor();

  /**
   * Returns a new object of class '<em>XUnit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XUnit</em>'.
   * @generated
   */
  XUnit createXUnit();

  /**
   * Returns a new object of class '<em>YUnit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>YUnit</em>'.
   * @generated
   */
  YUnit createYUnit();

  /**
   * Returns a new object of class '<em>ZUnit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ZUnit</em>'.
   * @generated
   */
  ZUnit createZUnit();

  /**
   * Returns a new object of class '<em>Brick</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Brick</em>'.
   * @generated
   */
  Brick createBrick();

  /**
   * Returns a new object of class '<em>Source</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Source</em>'.
   * @generated
   */
  Source createSource();

  /**
   * Returns a new object of class '<em>Fxml Include</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fxml Include</em>'.
   * @generated
   */
  FxmlInclude createFxmlInclude();

  /**
   * Returns a new object of class '<em>Round Brick</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Round Brick</em>'.
   * @generated
   */
  RoundBrick createRoundBrick();

  /**
   * Returns a new object of class '<em>Door Brick</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Door Brick</em>'.
   * @generated
   */
  DoorBrick createDoorBrick();

  /**
   * Returns a new object of class '<em>Door</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Door</em>'.
   * @generated
   */
  Door createDoor();

  /**
   * Returns a new object of class '<em>Assembly</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assembly</em>'.
   * @generated
   */
  Assembly createAssembly();

  /**
   * Returns a new object of class '<em>Assembly Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assembly Item</em>'.
   * @generated
   */
  AssemblyItem createAssemblyItem();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LegoPackage getLegoPackage();

} //LegoFactory
