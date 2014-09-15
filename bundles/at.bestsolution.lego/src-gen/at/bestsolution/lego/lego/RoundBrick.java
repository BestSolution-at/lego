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
 *   <li>{@link at.bestsolution.lego.lego.RoundBrick#getRound <em>Round</em>}</li>
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
   * Returns the value of the '<em><b>Round</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Round</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Round</em>' attribute.
   * @see #setRound(String)
   * @see at.bestsolution.lego.lego.LegoPackage#getRoundBrick_Round()
   * @model
   * @generated
   */
  String getRound();

  /**
   * Sets the value of the '{@link at.bestsolution.lego.lego.RoundBrick#getRound <em>Round</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Round</em>' attribute.
   * @see #getRound()
   * @generated
   */
  void setRound(String value);

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
