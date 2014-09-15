/**
 */
package at.bestsolution.lego.lego;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.lego.lego.Model#getRepo <em>Repo</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.Model#getAssembly <em>Assembly</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.lego.lego.LegoPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Repo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repo</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Repo</em>' containment reference.
   * @see #setRepo(ItemRepository)
   * @see at.bestsolution.lego.lego.LegoPackage#getModel_Repo()
   * @model containment="true"
   * @generated
   */
  ItemRepository getRepo();

  /**
   * Sets the value of the '{@link at.bestsolution.lego.lego.Model#getRepo <em>Repo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Repo</em>' containment reference.
   * @see #getRepo()
   * @generated
   */
  void setRepo(ItemRepository value);

  /**
   * Returns the value of the '<em><b>Assembly</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assembly</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assembly</em>' containment reference.
   * @see #setAssembly(Assembly)
   * @see at.bestsolution.lego.lego.LegoPackage#getModel_Assembly()
   * @model containment="true"
   * @generated
   */
  Assembly getAssembly();

  /**
   * Sets the value of the '{@link at.bestsolution.lego.lego.Model#getAssembly <em>Assembly</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assembly</em>' containment reference.
   * @see #getAssembly()
   * @generated
   */
  void setAssembly(Assembly value);

} // Model
