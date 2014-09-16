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
 *   <li>{@link at.bestsolution.lego.lego.impl.FxmlIncludeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.impl.FxmlIncludeImpl#getOriginX <em>Origin X</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.impl.FxmlIncludeImpl#getOriginY <em>Origin Y</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.impl.FxmlIncludeImpl#getOriginZ <em>Origin Z</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FxmlIncludeImpl extends SourceImpl implements FxmlInclude
{
  /**
   * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected static final String SOURCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected String source = SOURCE_EDEFAULT;

  /**
   * The default value of the '{@link #getOriginX() <em>Origin X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOriginX()
   * @generated
   * @ordered
   */
  protected static final float ORIGIN_X_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getOriginX() <em>Origin X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOriginX()
   * @generated
   * @ordered
   */
  protected float originX = ORIGIN_X_EDEFAULT;

  /**
   * The default value of the '{@link #getOriginY() <em>Origin Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOriginY()
   * @generated
   * @ordered
   */
  protected static final float ORIGIN_Y_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getOriginY() <em>Origin Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOriginY()
   * @generated
   * @ordered
   */
  protected float originY = ORIGIN_Y_EDEFAULT;

  /**
   * The default value of the '{@link #getOriginZ() <em>Origin Z</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOriginZ()
   * @generated
   * @ordered
   */
  protected static final float ORIGIN_Z_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getOriginZ() <em>Origin Z</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOriginZ()
   * @generated
   * @ordered
   */
  protected float originZ = ORIGIN_Z_EDEFAULT;

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
  public String getSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(String newSource)
  {
    String oldSource = source;
    source = newSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.FXML_INCLUDE__SOURCE, oldSource, source));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getOriginX()
  {
    return originX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOriginX(float newOriginX)
  {
    float oldOriginX = originX;
    originX = newOriginX;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.FXML_INCLUDE__ORIGIN_X, oldOriginX, originX));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getOriginY()
  {
    return originY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOriginY(float newOriginY)
  {
    float oldOriginY = originY;
    originY = newOriginY;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.FXML_INCLUDE__ORIGIN_Y, oldOriginY, originY));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getOriginZ()
  {
    return originZ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOriginZ(float newOriginZ)
  {
    float oldOriginZ = originZ;
    originZ = newOriginZ;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.FXML_INCLUDE__ORIGIN_Z, oldOriginZ, originZ));
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
      case LegoPackage.FXML_INCLUDE__SOURCE:
        return getSource();
      case LegoPackage.FXML_INCLUDE__ORIGIN_X:
        return getOriginX();
      case LegoPackage.FXML_INCLUDE__ORIGIN_Y:
        return getOriginY();
      case LegoPackage.FXML_INCLUDE__ORIGIN_Z:
        return getOriginZ();
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
      case LegoPackage.FXML_INCLUDE__SOURCE:
        setSource((String)newValue);
        return;
      case LegoPackage.FXML_INCLUDE__ORIGIN_X:
        setOriginX((Float)newValue);
        return;
      case LegoPackage.FXML_INCLUDE__ORIGIN_Y:
        setOriginY((Float)newValue);
        return;
      case LegoPackage.FXML_INCLUDE__ORIGIN_Z:
        setOriginZ((Float)newValue);
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
      case LegoPackage.FXML_INCLUDE__SOURCE:
        setSource(SOURCE_EDEFAULT);
        return;
      case LegoPackage.FXML_INCLUDE__ORIGIN_X:
        setOriginX(ORIGIN_X_EDEFAULT);
        return;
      case LegoPackage.FXML_INCLUDE__ORIGIN_Y:
        setOriginY(ORIGIN_Y_EDEFAULT);
        return;
      case LegoPackage.FXML_INCLUDE__ORIGIN_Z:
        setOriginZ(ORIGIN_Z_EDEFAULT);
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
      case LegoPackage.FXML_INCLUDE__SOURCE:
        return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
      case LegoPackage.FXML_INCLUDE__ORIGIN_X:
        return originX != ORIGIN_X_EDEFAULT;
      case LegoPackage.FXML_INCLUDE__ORIGIN_Y:
        return originY != ORIGIN_Y_EDEFAULT;
      case LegoPackage.FXML_INCLUDE__ORIGIN_Z:
        return originZ != ORIGIN_Z_EDEFAULT;
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
    result.append(" (source: ");
    result.append(source);
    result.append(", originX: ");
    result.append(originX);
    result.append(", originY: ");
    result.append(originY);
    result.append(", originZ: ");
    result.append(originZ);
    result.append(')');
    return result.toString();
  }

} //FxmlIncludeImpl
