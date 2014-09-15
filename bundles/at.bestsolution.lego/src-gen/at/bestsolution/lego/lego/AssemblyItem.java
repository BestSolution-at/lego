/**
 */
package at.bestsolution.lego.lego;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.lego.lego.AssemblyItem#getElement <em>Element</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.AssemblyItem#getXUnits <em>XUnits</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.AssemblyItem#getYUnits <em>YUnits</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.AssemblyItem#getZUnits <em>ZUnits</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.lego.lego.LegoPackage#getAssemblyItem()
 * @model
 * @generated
 */
public interface AssemblyItem extends EObject
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' reference.
   * @see #setElement(LegoElement)
   * @see at.bestsolution.lego.lego.LegoPackage#getAssemblyItem_Element()
   * @model
   * @generated
   */
  LegoElement getElement();

  /**
   * Sets the value of the '{@link at.bestsolution.lego.lego.AssemblyItem#getElement <em>Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' reference.
   * @see #getElement()
   * @generated
   */
  void setElement(LegoElement value);

  /**
   * Returns the value of the '<em><b>XUnits</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>XUnits</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>XUnits</em>' containment reference.
   * @see #setXUnits(XUnit)
   * @see at.bestsolution.lego.lego.LegoPackage#getAssemblyItem_XUnits()
   * @model containment="true"
   * @generated
   */
  XUnit getXUnits();

  /**
   * Sets the value of the '{@link at.bestsolution.lego.lego.AssemblyItem#getXUnits <em>XUnits</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>XUnits</em>' containment reference.
   * @see #getXUnits()
   * @generated
   */
  void setXUnits(XUnit value);

  /**
   * Returns the value of the '<em><b>YUnits</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>YUnits</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>YUnits</em>' containment reference.
   * @see #setYUnits(YUnit)
   * @see at.bestsolution.lego.lego.LegoPackage#getAssemblyItem_YUnits()
   * @model containment="true"
   * @generated
   */
  YUnit getYUnits();

  /**
   * Sets the value of the '{@link at.bestsolution.lego.lego.AssemblyItem#getYUnits <em>YUnits</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>YUnits</em>' containment reference.
   * @see #getYUnits()
   * @generated
   */
  void setYUnits(YUnit value);

  /**
   * Returns the value of the '<em><b>ZUnits</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>ZUnits</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>ZUnits</em>' containment reference.
   * @see #setZUnits(ZUnit)
   * @see at.bestsolution.lego.lego.LegoPackage#getAssemblyItem_ZUnits()
   * @model containment="true"
   * @generated
   */
  ZUnit getZUnits();

  /**
   * Sets the value of the '{@link at.bestsolution.lego.lego.AssemblyItem#getZUnits <em>ZUnits</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>ZUnits</em>' containment reference.
   * @see #getZUnits()
   * @generated
   */
  void setZUnits(ZUnit value);

} // AssemblyItem
