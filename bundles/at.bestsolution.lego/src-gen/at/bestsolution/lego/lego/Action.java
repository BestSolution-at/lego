/**
 */
package at.bestsolution.lego.lego;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.lego.lego.Action#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.Action#getType <em>Type</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.Action#getAxis <em>Axis</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.Action#getAngle <em>Angle</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.Action#getDuration <em>Duration</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.Action#getSoundfile <em>Soundfile</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.lego.lego.LegoPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject
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
   * @see at.bestsolution.lego.lego.LegoPackage#getAction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.bestsolution.lego.lego.Action#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see at.bestsolution.lego.lego.LegoPackage#getAction_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link at.bestsolution.lego.lego.Action#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Axis</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Axis</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Axis</em>' attribute.
   * @see #setAxis(String)
   * @see at.bestsolution.lego.lego.LegoPackage#getAction_Axis()
   * @model
   * @generated
   */
  String getAxis();

  /**
   * Sets the value of the '{@link at.bestsolution.lego.lego.Action#getAxis <em>Axis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Axis</em>' attribute.
   * @see #getAxis()
   * @generated
   */
  void setAxis(String value);

  /**
   * Returns the value of the '<em><b>Angle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Angle</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Angle</em>' attribute.
   * @see #setAngle(float)
   * @see at.bestsolution.lego.lego.LegoPackage#getAction_Angle()
   * @model
   * @generated
   */
  float getAngle();

  /**
   * Sets the value of the '{@link at.bestsolution.lego.lego.Action#getAngle <em>Angle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Angle</em>' attribute.
   * @see #getAngle()
   * @generated
   */
  void setAngle(float value);

  /**
   * Returns the value of the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Duration</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duration</em>' attribute.
   * @see #setDuration(int)
   * @see at.bestsolution.lego.lego.LegoPackage#getAction_Duration()
   * @model
   * @generated
   */
  int getDuration();

  /**
   * Sets the value of the '{@link at.bestsolution.lego.lego.Action#getDuration <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duration</em>' attribute.
   * @see #getDuration()
   * @generated
   */
  void setDuration(int value);

  /**
   * Returns the value of the '<em><b>Soundfile</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Soundfile</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Soundfile</em>' attribute.
   * @see #setSoundfile(String)
   * @see at.bestsolution.lego.lego.LegoPackage#getAction_Soundfile()
   * @model
   * @generated
   */
  String getSoundfile();

  /**
   * Sets the value of the '{@link at.bestsolution.lego.lego.Action#getSoundfile <em>Soundfile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Soundfile</em>' attribute.
   * @see #getSoundfile()
   * @generated
   */
  void setSoundfile(String value);

} // Action
