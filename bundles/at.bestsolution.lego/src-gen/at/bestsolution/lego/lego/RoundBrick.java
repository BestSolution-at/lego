/**
 */
package at.bestsolution.lego.lego;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Round Brick</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.lego.lego.RoundBrick#getZUnits <em>ZUnits</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.lego.lego.LegoPackage#getRoundBrick()
 * @model
 * @generated
 */
public interface RoundBrick extends Item
{
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
   * @see at.bestsolution.lego.lego.LegoPackage#getRoundBrick_ZUnits()
   * @model containment="true"
   * @generated
   */
  ZUnit getZUnits();

  /**
   * Sets the value of the '{@link at.bestsolution.lego.lego.RoundBrick#getZUnits <em>ZUnits</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>ZUnits</em>' containment reference.
   * @see #getZUnits()
   * @generated
   */
  void setZUnits(ZUnit value);

} // RoundBrick
