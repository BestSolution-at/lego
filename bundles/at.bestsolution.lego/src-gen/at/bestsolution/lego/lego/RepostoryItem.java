/**
 */
package at.bestsolution.lego.lego;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repostory Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.lego.lego.RepostoryItem#getFill <em>Fill</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.RepostoryItem#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.lego.lego.LegoPackage#getRepostoryItem()
 * @model
 * @generated
 */
public interface RepostoryItem extends LegoElement
{
  /**
   * Returns the value of the '<em><b>Fill</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fill</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fill</em>' containment reference.
   * @see #setFill(Color)
   * @see at.bestsolution.lego.lego.LegoPackage#getRepostoryItem_Fill()
   * @model containment="true"
   * @generated
   */
  Color getFill();

  /**
   * Sets the value of the '{@link at.bestsolution.lego.lego.RepostoryItem#getFill <em>Fill</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fill</em>' containment reference.
   * @see #getFill()
   * @generated
   */
  void setFill(Color value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' containment reference.
   * @see #setSource(Source)
   * @see at.bestsolution.lego.lego.LegoPackage#getRepostoryItem_Source()
   * @model containment="true"
   * @generated
   */
  Source getSource();

  /**
   * Sets the value of the '{@link at.bestsolution.lego.lego.RepostoryItem#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(Source value);

} // RepostoryItem
