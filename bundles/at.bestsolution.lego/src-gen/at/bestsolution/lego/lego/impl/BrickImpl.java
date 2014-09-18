/**
 */
package at.bestsolution.lego.lego.impl;

import at.bestsolution.lego.lego.Brick;
import at.bestsolution.lego.lego.Color;
import at.bestsolution.lego.lego.LegoElement;
import at.bestsolution.lego.lego.LegoPackage;
import at.bestsolution.lego.lego.RepostoryItem;
import at.bestsolution.lego.lego.Source;
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
 * An implementation of the model object '<em><b>Brick</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.lego.lego.impl.BrickImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.impl.BrickImpl#getFill <em>Fill</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.impl.BrickImpl#getSource <em>Source</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.impl.BrickImpl#getXUnits <em>XUnits</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.impl.BrickImpl#getYUnits <em>YUnits</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.impl.BrickImpl#getZUnits <em>ZUnits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BrickImpl extends RasterItemImpl implements Brick
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
   * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected Source source;

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
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.BRICK__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LegoPackage.BRICK__FILL, oldFill, newFill);
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
        msgs = ((InternalEObject)fill).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LegoPackage.BRICK__FILL, null, msgs);
      if (newFill != null)
        msgs = ((InternalEObject)newFill).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LegoPackage.BRICK__FILL, null, msgs);
      msgs = basicSetFill(newFill, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.BRICK__FILL, newFill, newFill));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LegoPackage.BRICK__XUNITS, oldXUnits, newXUnits);
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
        msgs = ((InternalEObject)xUnits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LegoPackage.BRICK__XUNITS, null, msgs);
      if (newXUnits != null)
        msgs = ((InternalEObject)newXUnits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LegoPackage.BRICK__XUNITS, null, msgs);
      msgs = basicSetXUnits(newXUnits, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.BRICK__XUNITS, newXUnits, newXUnits));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LegoPackage.BRICK__YUNITS, oldYUnits, newYUnits);
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
        msgs = ((InternalEObject)yUnits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LegoPackage.BRICK__YUNITS, null, msgs);
      if (newYUnits != null)
        msgs = ((InternalEObject)newYUnits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LegoPackage.BRICK__YUNITS, null, msgs);
      msgs = basicSetYUnits(newYUnits, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.BRICK__YUNITS, newYUnits, newYUnits));
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
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LegoPackage.BRICK__FILL:
        return basicSetFill(null, msgs);
      case LegoPackage.BRICK__SOURCE:
        return basicSetSource(null, msgs);
      case LegoPackage.BRICK__XUNITS:
        return basicSetXUnits(null, msgs);
      case LegoPackage.BRICK__YUNITS:
        return basicSetYUnits(null, msgs);
      case LegoPackage.BRICK__ZUNITS:
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
      case LegoPackage.BRICK__NAME:
        return getName();
      case LegoPackage.BRICK__FILL:
        return getFill();
      case LegoPackage.BRICK__SOURCE:
        return getSource();
      case LegoPackage.BRICK__XUNITS:
        return getXUnits();
      case LegoPackage.BRICK__YUNITS:
        return getYUnits();
      case LegoPackage.BRICK__ZUNITS:
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
      case LegoPackage.BRICK__NAME:
        setName((String)newValue);
        return;
      case LegoPackage.BRICK__FILL:
        setFill((Color)newValue);
        return;
      case LegoPackage.BRICK__SOURCE:
        setSource((Source)newValue);
        return;
      case LegoPackage.BRICK__XUNITS:
        setXUnits((XUnit)newValue);
        return;
      case LegoPackage.BRICK__YUNITS:
        setYUnits((YUnit)newValue);
        return;
      case LegoPackage.BRICK__ZUNITS:
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
      case LegoPackage.BRICK__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LegoPackage.BRICK__FILL:
        setFill((Color)null);
        return;
      case LegoPackage.BRICK__SOURCE:
        setSource((Source)null);
        return;
      case LegoPackage.BRICK__XUNITS:
        setXUnits((XUnit)null);
        return;
      case LegoPackage.BRICK__YUNITS:
        setYUnits((YUnit)null);
        return;
      case LegoPackage.BRICK__ZUNITS:
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
      case LegoPackage.BRICK__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LegoPackage.BRICK__FILL:
        return fill != null;
      case LegoPackage.BRICK__SOURCE:
        return source != null;
      case LegoPackage.BRICK__XUNITS:
        return xUnits != null;
      case LegoPackage.BRICK__YUNITS:
        return yUnits != null;
      case LegoPackage.BRICK__ZUNITS:
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
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == LegoElement.class)
    {
      switch (derivedFeatureID)
      {
        case LegoPackage.BRICK__NAME: return LegoPackage.LEGO_ELEMENT__NAME;
        default: return -1;
      }
    }
    if (baseClass == RepostoryItem.class)
    {
      switch (derivedFeatureID)
      {
        case LegoPackage.BRICK__FILL: return LegoPackage.REPOSTORY_ITEM__FILL;
        case LegoPackage.BRICK__SOURCE: return LegoPackage.REPOSTORY_ITEM__SOURCE;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == LegoElement.class)
    {
      switch (baseFeatureID)
      {
        case LegoPackage.LEGO_ELEMENT__NAME: return LegoPackage.BRICK__NAME;
        default: return -1;
      }
    }
    if (baseClass == RepostoryItem.class)
    {
      switch (baseFeatureID)
      {
        case LegoPackage.REPOSTORY_ITEM__FILL: return LegoPackage.BRICK__FILL;
        case LegoPackage.REPOSTORY_ITEM__SOURCE: return LegoPackage.BRICK__SOURCE;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //BrickImpl
