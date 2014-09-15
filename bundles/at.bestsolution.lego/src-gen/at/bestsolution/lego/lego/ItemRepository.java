/**
 */
package at.bestsolution.lego.lego;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.lego.lego.ItemRepository#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.ItemRepository#getElementList <em>Element List</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.lego.lego.LegoPackage#getItemRepository()
 * @model
 * @generated
 */
public interface ItemRepository extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see at.bestsolution.lego.lego.LegoPackage#getItemRepository_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.bestsolution.lego.lego.ItemRepository#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Element List</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.lego.lego.Item}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element List</em>' containment reference list.
   * @see at.bestsolution.lego.lego.LegoPackage#getItemRepository_ElementList()
   * @model containment="true"
   * @generated
   */
  EList<Item> getElementList();

} // ItemRepository
