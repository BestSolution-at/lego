/**
 */
package at.bestsolution.lego.lego;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YUnit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.lego.lego.YUnit#getUnits <em>Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.lego.lego.LegoPackage#getYUnit()
 * @model
 * @generated
 */
public interface YUnit extends EObject
{
  /**
   * Returns the value of the '<em><b>Units</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Units</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Units</em>' attribute.
   * @see #setUnits(int)
   * @see at.bestsolution.lego.lego.LegoPackage#getYUnit_Units()
   * @model
   * @generated
   */
  int getUnits();

  /**
   * Sets the value of the '{@link at.bestsolution.lego.lego.YUnit#getUnits <em>Units</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Units</em>' attribute.
   * @see #getUnits()
   * @generated
   */
  void setUnits(int value);

} // YUnit
