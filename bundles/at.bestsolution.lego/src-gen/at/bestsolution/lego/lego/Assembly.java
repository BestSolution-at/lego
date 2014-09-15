/**
 */
package at.bestsolution.lego.lego;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.lego.lego.Assembly#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.lego.lego.LegoPackage#getAssembly()
 * @model
 * @generated
 */
public interface Assembly extends LegoElement
{
  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.lego.lego.AssemblyItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see at.bestsolution.lego.lego.LegoPackage#getAssembly_Items()
   * @model containment="true"
   * @generated
   */
  EList<AssemblyItem> getItems();

} // Assembly
