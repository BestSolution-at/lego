/**
 */
package at.bestsolution.lego.lego;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Brick</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.lego.lego.Brick#getXUnits <em>XUnits</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.Brick#getYUnits <em>YUnits</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.Brick#getZUnits <em>ZUnits</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.lego.lego.LegoPackage#getBrick()
 * @model
 * @generated
 */
public interface Brick extends RasterItem, RepostoryItem
{
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
   * @see at.bestsolution.lego.lego.LegoPackage#getBrick_XUnits()
   * @model containment="true"
   * @generated
   */
  XUnit getXUnits();

  /**
   * Sets the value of the '{@link at.bestsolution.lego.lego.Brick#getXUnits <em>XUnits</em>}' containment reference.
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
   * @see at.bestsolution.lego.lego.LegoPackage#getBrick_YUnits()
   * @model containment="true"
   * @generated
   */
  YUnit getYUnits();

  /**
   * Sets the value of the '{@link at.bestsolution.lego.lego.Brick#getYUnits <em>YUnits</em>}' containment reference.
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
   * @see at.bestsolution.lego.lego.LegoPackage#getBrick_ZUnits()
   * @model containment="true"
   * @generated
   */
  ZUnit getZUnits();

  /**
   * Sets the value of the '{@link at.bestsolution.lego.lego.Brick#getZUnits <em>ZUnits</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>ZUnits</em>' containment reference.
   * @see #getZUnits()
   * @generated
   */
  void setZUnits(ZUnit value);

} // Brick
