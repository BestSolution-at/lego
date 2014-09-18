/**
 */
package at.bestsolution.lego.lego.impl;

import at.bestsolution.lego.lego.LegoPackage;
import at.bestsolution.lego.lego.RasterAssemblyItem;
import at.bestsolution.lego.lego.RasterItem;
import at.bestsolution.lego.lego.XUnit;
import at.bestsolution.lego.lego.YUnit;
import at.bestsolution.lego.lego.ZUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Raster Assembly Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.lego.lego.impl.RasterAssemblyItemImpl#getElement <em>Element</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.impl.RasterAssemblyItemImpl#getXUnits <em>XUnits</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.impl.RasterAssemblyItemImpl#getYUnits <em>YUnits</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.impl.RasterAssemblyItemImpl#getZUnits <em>ZUnits</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.impl.RasterAssemblyItemImpl#getTransform <em>Transform</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RasterAssemblyItemImpl extends AssemblyItemImpl implements RasterAssemblyItem
{
  /**
   * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected RasterItem element;

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
   * The cached value of the '{@link #getZUnits() <em>ZUnits</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZUnits()
   * @generated
   * @ordered
   */
  protected ZUnit zUnits;

  /**
   * The default value of the '{@link #getTransform() <em>Transform</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransform()
   * @generated
   * @ordered
   */
  protected static final String TRANSFORM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTransform() <em>Transform</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransform()
   * @generated
   * @ordered
   */
  protected String transform = TRANSFORM_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RasterAssemblyItemImpl()
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
    return LegoPackage.Literals.RASTER_ASSEMBLY_ITEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RasterItem getElement()
  {
    if (element != null && element.eIsProxy())
    {
      InternalEObject oldElement = (InternalEObject)element;
      element = (RasterItem)eResolveProxy(oldElement);
      if (element != oldElement)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LegoPackage.RASTER_ASSEMBLY_ITEM__ELEMENT, oldElement, element));
      }
    }
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RasterItem basicGetElement()
  {
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElement(RasterItem newElement)
  {
    RasterItem oldElement = element;
    element = newElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.RASTER_ASSEMBLY_ITEM__ELEMENT, oldElement, element));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LegoPackage.RASTER_ASSEMBLY_ITEM__XUNITS, oldXUnits, newXUnits);
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
        msgs = ((InternalEObject)xUnits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LegoPackage.RASTER_ASSEMBLY_ITEM__XUNITS, null, msgs);
      if (newXUnits != null)
        msgs = ((InternalEObject)newXUnits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LegoPackage.RASTER_ASSEMBLY_ITEM__XUNITS, null, msgs);
      msgs = basicSetXUnits(newXUnits, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.RASTER_ASSEMBLY_ITEM__XUNITS, newXUnits, newXUnits));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LegoPackage.RASTER_ASSEMBLY_ITEM__YUNITS, oldYUnits, newYUnits);
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
        msgs = ((InternalEObject)yUnits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LegoPackage.RASTER_ASSEMBLY_ITEM__YUNITS, null, msgs);
      if (newYUnits != null)
        msgs = ((InternalEObject)newYUnits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LegoPackage.RASTER_ASSEMBLY_ITEM__YUNITS, null, msgs);
      msgs = basicSetYUnits(newYUnits, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.RASTER_ASSEMBLY_ITEM__YUNITS, newYUnits, newYUnits));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LegoPackage.RASTER_ASSEMBLY_ITEM__ZUNITS, oldZUnits, newZUnits);
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
        msgs = ((InternalEObject)zUnits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LegoPackage.RASTER_ASSEMBLY_ITEM__ZUNITS, null, msgs);
      if (newZUnits != null)
        msgs = ((InternalEObject)newZUnits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LegoPackage.RASTER_ASSEMBLY_ITEM__ZUNITS, null, msgs);
      msgs = basicSetZUnits(newZUnits, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.RASTER_ASSEMBLY_ITEM__ZUNITS, newZUnits, newZUnits));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTransform()
  {
    return transform;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTransform(String newTransform)
  {
    String oldTransform = transform;
    transform = newTransform;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.RASTER_ASSEMBLY_ITEM__TRANSFORM, oldTransform, transform));
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
      case LegoPackage.RASTER_ASSEMBLY_ITEM__XUNITS:
        return basicSetXUnits(null, msgs);
      case LegoPackage.RASTER_ASSEMBLY_ITEM__YUNITS:
        return basicSetYUnits(null, msgs);
      case LegoPackage.RASTER_ASSEMBLY_ITEM__ZUNITS:
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
      case LegoPackage.RASTER_ASSEMBLY_ITEM__ELEMENT:
        if (resolve) return getElement();
        return basicGetElement();
      case LegoPackage.RASTER_ASSEMBLY_ITEM__XUNITS:
        return getXUnits();
      case LegoPackage.RASTER_ASSEMBLY_ITEM__YUNITS:
        return getYUnits();
      case LegoPackage.RASTER_ASSEMBLY_ITEM__ZUNITS:
        return getZUnits();
      case LegoPackage.RASTER_ASSEMBLY_ITEM__TRANSFORM:
        return getTransform();
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
      case LegoPackage.RASTER_ASSEMBLY_ITEM__ELEMENT:
        setElement((RasterItem)newValue);
        return;
      case LegoPackage.RASTER_ASSEMBLY_ITEM__XUNITS:
        setXUnits((XUnit)newValue);
        return;
      case LegoPackage.RASTER_ASSEMBLY_ITEM__YUNITS:
        setYUnits((YUnit)newValue);
        return;
      case LegoPackage.RASTER_ASSEMBLY_ITEM__ZUNITS:
        setZUnits((ZUnit)newValue);
        return;
      case LegoPackage.RASTER_ASSEMBLY_ITEM__TRANSFORM:
        setTransform((String)newValue);
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
      case LegoPackage.RASTER_ASSEMBLY_ITEM__ELEMENT:
        setElement((RasterItem)null);
        return;
      case LegoPackage.RASTER_ASSEMBLY_ITEM__XUNITS:
        setXUnits((XUnit)null);
        return;
      case LegoPackage.RASTER_ASSEMBLY_ITEM__YUNITS:
        setYUnits((YUnit)null);
        return;
      case LegoPackage.RASTER_ASSEMBLY_ITEM__ZUNITS:
        setZUnits((ZUnit)null);
        return;
      case LegoPackage.RASTER_ASSEMBLY_ITEM__TRANSFORM:
        setTransform(TRANSFORM_EDEFAULT);
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
      case LegoPackage.RASTER_ASSEMBLY_ITEM__ELEMENT:
        return element != null;
      case LegoPackage.RASTER_ASSEMBLY_ITEM__XUNITS:
        return xUnits != null;
      case LegoPackage.RASTER_ASSEMBLY_ITEM__YUNITS:
        return yUnits != null;
      case LegoPackage.RASTER_ASSEMBLY_ITEM__ZUNITS:
        return zUnits != null;
      case LegoPackage.RASTER_ASSEMBLY_ITEM__TRANSFORM:
        return TRANSFORM_EDEFAULT == null ? transform != null : !TRANSFORM_EDEFAULT.equals(transform);
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
    result.append(" (transform: ");
    result.append(transform);
    result.append(')');
    return result.toString();
  }

} //RasterAssemblyItemImpl
