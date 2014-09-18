/**
 */
package at.bestsolution.lego.lego.impl;

import at.bestsolution.lego.lego.FxmlInclude;
import at.bestsolution.lego.lego.LegoPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fxml Include</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.lego.lego.impl.FxmlIncludeImpl#getSource3d <em>Source3d</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FxmlIncludeImpl extends SourceImpl implements FxmlInclude
{
  /**
   * The default value of the '{@link #getSource3d() <em>Source3d</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource3d()
   * @generated
   * @ordered
   */
  protected static final String SOURCE3D_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSource3d() <em>Source3d</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource3d()
   * @generated
   * @ordered
   */
  protected String source3d = SOURCE3D_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FxmlIncludeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LegoPackage.Literals.FXML_INCLUDE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSource3d()
  {
    return source3d;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource3d(String newSource3d)
  {
    String oldSource3d = source3d;
    source3d = newSource3d;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.FXML_INCLUDE__SOURCE3D, oldSource3d, source3d));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LegoPackage.FXML_INCLUDE__SOURCE3D:
        return getSource3d();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LegoPackage.FXML_INCLUDE__SOURCE3D:
        setSource3d((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LegoPackage.FXML_INCLUDE__SOURCE3D:
        setSource3d(SOURCE3D_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LegoPackage.FXML_INCLUDE__SOURCE3D:
        return SOURCE3D_EDEFAULT == null ? source3d != null : !SOURCE3D_EDEFAULT.equals(source3d);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (source3d: ");
    result.append(source3d);
    result.append(')');
    return result.toString();
  }

} //FxmlIncludeImpl
