/**
 */
package at.bestsolution.lego.lego.impl;

import at.bestsolution.lego.lego.DoorBrick;
import at.bestsolution.lego.lego.LegoPackage;
import at.bestsolution.lego.lego.ZUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Door Brick</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.lego.lego.impl.DoorBrickImpl#getZUnits <em>ZUnits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DoorBrickImpl extends ItemImpl implements DoorBrick
{
  /**
   * The cached value of the '{@link #getZUnits() <em>ZUnits</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZUnits()
   * @generated
   * @ordered
   */
  protected ZUnit zUnits;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DoorBrickImpl()
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
    return LegoPackage.Literals.DOOR_BRICK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ZUnit getZUnits()
  {
    return zUnits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetZUnits(ZUnit newZUnits, NotificationChain msgs)
  {
    ZUnit oldZUnits = zUnits;
    zUnits = newZUnits;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LegoPackage.DOOR_BRICK__ZUNITS, oldZUnits, newZUnits);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setZUnits(ZUnit newZUnits)
  {
    if (newZUnits != zUnits)
    {
      NotificationChain msgs = null;
      if (zUnits != null)
        msgs = ((InternalEObject)zUnits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LegoPackage.DOOR_BRICK__ZUNITS, null, msgs);
      if (newZUnits != null)
        msgs = ((InternalEObject)newZUnits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LegoPackage.DOOR_BRICK__ZUNITS, null, msgs);
      msgs = basicSetZUnits(newZUnits, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.DOOR_BRICK__ZUNITS, newZUnits, newZUnits));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LegoPackage.DOOR_BRICK__ZUNITS:
        return basicSetZUnits(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case LegoPackage.DOOR_BRICK__ZUNITS:
        return getZUnits();
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
      case LegoPackage.DOOR_BRICK__ZUNITS:
        setZUnits((ZUnit)newValue);
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
      case LegoPackage.DOOR_BRICK__ZUNITS:
        setZUnits((ZUnit)null);
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
      case LegoPackage.DOOR_BRICK__ZUNITS:
        return zUnits != null;
    }
    return super.eIsSet(featureID);
  }

} //DoorBrickImpl
