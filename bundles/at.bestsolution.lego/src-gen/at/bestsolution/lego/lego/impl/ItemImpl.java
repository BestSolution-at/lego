/**
 */
package at.bestsolution.lego.lego.impl;

import at.bestsolution.lego.lego.Color;
import at.bestsolution.lego.lego.Item;
import at.bestsolution.lego.lego.LegoPackage;
import at.bestsolution.lego.lego.XUnit;
import at.bestsolution.lego.lego.YUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.lego.lego.impl.ItemImpl#getXUnits <em>XUnits</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.impl.ItemImpl#getYUnits <em>YUnits</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.impl.ItemImpl#getFill <em>Fill</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemImpl extends LegoElementImpl implements Item
{
  /**
   * The cached value of the '{@link #getXUnits() <em>XUnits</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXUnits()
   * @generated
   * @ordered
   */
  protected XUnit xUnits;

  /**
   * The cached value of the '{@link #getYUnits() <em>YUnits</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYUnits()
   * @generated
   * @ordered
   */
  protected YUnit yUnits;

  /**
   * The cached value of the '{@link #getFill() <em>Fill</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFill()
   * @generated
   * @ordered
   */
  protected Color fill;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ItemImpl()
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
    return LegoPackage.Literals.ITEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XUnit getXUnits()
  {
    return xUnits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetXUnits(XUnit newXUnits, NotificationChain msgs)
  {
    XUnit oldXUnits = xUnits;
    xUnits = newXUnits;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LegoPackage.ITEM__XUNITS, oldXUnits, newXUnits);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setXUnits(XUnit newXUnits)
  {
    if (newXUnits != xUnits)
    {
      NotificationChain msgs = null;
      if (xUnits != null)
        msgs = ((InternalEObject)xUnits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LegoPackage.ITEM__XUNITS, null, msgs);
      if (newXUnits != null)
        msgs = ((InternalEObject)newXUnits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LegoPackage.ITEM__XUNITS, null, msgs);
      msgs = basicSetXUnits(newXUnits, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.ITEM__XUNITS, newXUnits, newXUnits));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YUnit getYUnits()
  {
    return yUnits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetYUnits(YUnit newYUnits, NotificationChain msgs)
  {
    YUnit oldYUnits = yUnits;
    yUnits = newYUnits;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LegoPackage.ITEM__YUNITS, oldYUnits, newYUnits);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setYUnits(YUnit newYUnits)
  {
    if (newYUnits != yUnits)
    {
      NotificationChain msgs = null;
      if (yUnits != null)
        msgs = ((InternalEObject)yUnits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LegoPackage.ITEM__YUNITS, null, msgs);
      if (newYUnits != null)
        msgs = ((InternalEObject)newYUnits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LegoPackage.ITEM__YUNITS, null, msgs);
      msgs = basicSetYUnits(newYUnits, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.ITEM__YUNITS, newYUnits, newYUnits));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getFill()
  {
    return fill;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFill(Color newFill, NotificationChain msgs)
  {
    Color oldFill = fill;
    fill = newFill;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LegoPackage.ITEM__FILL, oldFill, newFill);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFill(Color newFill)
  {
    if (newFill != fill)
    {
      NotificationChain msgs = null;
      if (fill != null)
        msgs = ((InternalEObject)fill).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LegoPackage.ITEM__FILL, null, msgs);
      if (newFill != null)
        msgs = ((InternalEObject)newFill).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LegoPackage.ITEM__FILL, null, msgs);
      msgs = basicSetFill(newFill, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.ITEM__FILL, newFill, newFill));
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
      case LegoPackage.ITEM__XUNITS:
        return basicSetXUnits(null, msgs);
      case LegoPackage.ITEM__YUNITS:
        return basicSetYUnits(null, msgs);
      case LegoPackage.ITEM__FILL:
        return basicSetFill(null, msgs);
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
      case LegoPackage.ITEM__XUNITS:
        return getXUnits();
      case LegoPackage.ITEM__YUNITS:
        return getYUnits();
      case LegoPackage.ITEM__FILL:
        return getFill();
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
      case LegoPackage.ITEM__XUNITS:
        setXUnits((XUnit)newValue);
        return;
      case LegoPackage.ITEM__YUNITS:
        setYUnits((YUnit)newValue);
        return;
      case LegoPackage.ITEM__FILL:
        setFill((Color)newValue);
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
      case LegoPackage.ITEM__XUNITS:
        setXUnits((XUnit)null);
        return;
      case LegoPackage.ITEM__YUNITS:
        setYUnits((YUnit)null);
        return;
      case LegoPackage.ITEM__FILL:
        setFill((Color)null);
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
      case LegoPackage.ITEM__XUNITS:
        return xUnits != null;
      case LegoPackage.ITEM__YUNITS:
        return yUnits != null;
      case LegoPackage.ITEM__FILL:
        return fill != null;
    }
    return super.eIsSet(featureID);
  }

} //ItemImpl
