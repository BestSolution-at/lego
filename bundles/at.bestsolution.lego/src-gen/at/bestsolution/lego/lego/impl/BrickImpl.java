/**
 */
package at.bestsolution.lego.lego.impl;

import at.bestsolution.lego.lego.Brick;
import at.bestsolution.lego.lego.LegoPackage;
import at.bestsolution.lego.lego.Source;
import at.bestsolution.lego.lego.ZUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Brick</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.lego.lego.impl.BrickImpl#getZUnits <em>ZUnits</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.impl.BrickImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BrickImpl extends ItemImpl implements Brick
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
   * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected Source source;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BrickImpl()
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
    return LegoPackage.Literals.BRICK;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LegoPackage.BRICK__ZUNITS, oldZUnits, newZUnits);
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
        msgs = ((InternalEObject)zUnits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LegoPackage.BRICK__ZUNITS, null, msgs);
      if (newZUnits != null)
        msgs = ((InternalEObject)newZUnits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LegoPackage.BRICK__ZUNITS, null, msgs);
      msgs = basicSetZUnits(newZUnits, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.BRICK__ZUNITS, newZUnits, newZUnits));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Source getSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource(Source newSource, NotificationChain msgs)
  {
    Source oldSource = source;
    source = newSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LegoPackage.BRICK__SOURCE, oldSource, newSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(Source newSource)
  {
    if (newSource != source)
    {
      NotificationChain msgs = null;
      if (source != null)
        msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LegoPackage.BRICK__SOURCE, null, msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LegoPackage.BRICK__SOURCE, null, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.BRICK__SOURCE, newSource, newSource));
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
      case LegoPackage.BRICK__ZUNITS:
        return basicSetZUnits(null, msgs);
      case LegoPackage.BRICK__SOURCE:
        return basicSetSource(null, msgs);
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
      case LegoPackage.BRICK__ZUNITS:
        return getZUnits();
      case LegoPackage.BRICK__SOURCE:
        return getSource();
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
      case LegoPackage.BRICK__ZUNITS:
        setZUnits((ZUnit)newValue);
        return;
      case LegoPackage.BRICK__SOURCE:
        setSource((Source)newValue);
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
      case LegoPackage.BRICK__ZUNITS:
        setZUnits((ZUnit)null);
        return;
      case LegoPackage.BRICK__SOURCE:
        setSource((Source)null);
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
      case LegoPackage.BRICK__ZUNITS:
        return zUnits != null;
      case LegoPackage.BRICK__SOURCE:
        return source != null;
    }
    return super.eIsSet(featureID);
  }

} //BrickImpl
