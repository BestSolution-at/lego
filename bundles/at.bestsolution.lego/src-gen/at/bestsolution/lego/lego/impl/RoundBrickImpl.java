/**
 */
package at.bestsolution.lego.lego.impl;

import at.bestsolution.lego.lego.LegoPackage;
import at.bestsolution.lego.lego.RoundBrick;
import at.bestsolution.lego.lego.ZUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Round Brick</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.lego.lego.impl.RoundBrickImpl#getRound <em>Round</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.impl.RoundBrickImpl#getZUnits <em>ZUnits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoundBrickImpl extends ItemImpl implements RoundBrick
{
  /**
   * The default value of the '{@link #getRound() <em>Round</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRound()
   * @generated
   * @ordered
   */
  protected static final String ROUND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRound() <em>Round</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRound()
   * @generated
   * @ordered
   */
  protected String round = ROUND_EDEFAULT;

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
  protected RoundBrickImpl()
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
    return LegoPackage.Literals.ROUND_BRICK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRound()
  {
    return round;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRound(String newRound)
  {
    String oldRound = round;
    round = newRound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.ROUND_BRICK__ROUND, oldRound, round));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LegoPackage.ROUND_BRICK__ZUNITS, oldZUnits, newZUnits);
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
        msgs = ((InternalEObject)zUnits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LegoPackage.ROUND_BRICK__ZUNITS, null, msgs);
      if (newZUnits != null)
        msgs = ((InternalEObject)newZUnits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LegoPackage.ROUND_BRICK__ZUNITS, null, msgs);
      msgs = basicSetZUnits(newZUnits, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.ROUND_BRICK__ZUNITS, newZUnits, newZUnits));
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
      case LegoPackage.ROUND_BRICK__ZUNITS:
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
      case LegoPackage.ROUND_BRICK__ROUND:
        return getRound();
      case LegoPackage.ROUND_BRICK__ZUNITS:
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
      case LegoPackage.ROUND_BRICK__ROUND:
        setRound((String)newValue);
        return;
      case LegoPackage.ROUND_BRICK__ZUNITS:
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
      case LegoPackage.ROUND_BRICK__ROUND:
        setRound(ROUND_EDEFAULT);
        return;
      case LegoPackage.ROUND_BRICK__ZUNITS:
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
      case LegoPackage.ROUND_BRICK__ROUND:
        return ROUND_EDEFAULT == null ? round != null : !ROUND_EDEFAULT.equals(round);
      case LegoPackage.ROUND_BRICK__ZUNITS:
        return zUnits != null;
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
    result.append(" (round: ");
    result.append(round);
    result.append(')');
    return result.toString();
  }

} //RoundBrickImpl
