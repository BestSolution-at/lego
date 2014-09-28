/**
 */
package at.bestsolution.lego.lego.impl;

import at.bestsolution.lego.lego.Action;
import at.bestsolution.lego.lego.LegoPackage;
import at.bestsolution.lego.lego.MountedAssemblyItem;
import at.bestsolution.lego.lego.MountedPart;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mounted Assembly Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.lego.lego.impl.MountedAssemblyItemImpl#getElement <em>Element</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.impl.MountedAssemblyItemImpl#getXUnits <em>XUnits</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.impl.MountedAssemblyItemImpl#getYUnits <em>YUnits</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.impl.MountedAssemblyItemImpl#getZUnits <em>ZUnits</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.impl.MountedAssemblyItemImpl#getRotateX <em>Rotate X</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.impl.MountedAssemblyItemImpl#getRotateY <em>Rotate Y</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.impl.MountedAssemblyItemImpl#getRotateZ <em>Rotate Z</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.impl.MountedAssemblyItemImpl#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MountedAssemblyItemImpl extends AssemblyItemImpl implements MountedAssemblyItem
{
  /**
   * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected MountedPart element;

  /**
   * The default value of the '{@link #getXUnits() <em>XUnits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXUnits()
   * @generated
   * @ordered
   */
  protected static final float XUNITS_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getXUnits() <em>XUnits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXUnits()
   * @generated
   * @ordered
   */
  protected float xUnits = XUNITS_EDEFAULT;

  /**
   * The default value of the '{@link #getYUnits() <em>YUnits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYUnits()
   * @generated
   * @ordered
   */
  protected static final float YUNITS_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getYUnits() <em>YUnits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYUnits()
   * @generated
   * @ordered
   */
  protected float yUnits = YUNITS_EDEFAULT;

  /**
   * The default value of the '{@link #getZUnits() <em>ZUnits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZUnits()
   * @generated
   * @ordered
   */
  protected static final float ZUNITS_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getZUnits() <em>ZUnits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZUnits()
   * @generated
   * @ordered
   */
  protected float zUnits = ZUNITS_EDEFAULT;

  /**
   * The default value of the '{@link #getRotateX() <em>Rotate X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRotateX()
   * @generated
   * @ordered
   */
  protected static final float ROTATE_X_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getRotateX() <em>Rotate X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRotateX()
   * @generated
   * @ordered
   */
  protected float rotateX = ROTATE_X_EDEFAULT;

  /**
   * The default value of the '{@link #getRotateY() <em>Rotate Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRotateY()
   * @generated
   * @ordered
   */
  protected static final float ROTATE_Y_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getRotateY() <em>Rotate Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRotateY()
   * @generated
   * @ordered
   */
  protected float rotateY = ROTATE_Y_EDEFAULT;

  /**
   * The default value of the '{@link #getRotateZ() <em>Rotate Z</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRotateZ()
   * @generated
   * @ordered
   */
  protected static final float ROTATE_Z_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getRotateZ() <em>Rotate Z</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRotateZ()
   * @generated
   * @ordered
   */
  protected float rotateZ = ROTATE_Z_EDEFAULT;

  /**
   * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected EList<Action> actions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MountedAssemblyItemImpl()
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
    return LegoPackage.Literals.MOUNTED_ASSEMBLY_ITEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MountedPart getElement()
  {
    if (element != null && element.eIsProxy())
    {
      InternalEObject oldElement = (InternalEObject)element;
      element = (MountedPart)eResolveProxy(oldElement);
      if (element != oldElement)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LegoPackage.MOUNTED_ASSEMBLY_ITEM__ELEMENT, oldElement, element));
      }
    }
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MountedPart basicGetElement()
  {
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElement(MountedPart newElement)
  {
    MountedPart oldElement = element;
    element = newElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.MOUNTED_ASSEMBLY_ITEM__ELEMENT, oldElement, element));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getXUnits()
  {
    return xUnits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setXUnits(float newXUnits)
  {
    float oldXUnits = xUnits;
    xUnits = newXUnits;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.MOUNTED_ASSEMBLY_ITEM__XUNITS, oldXUnits, xUnits));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getYUnits()
  {
    return yUnits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setYUnits(float newYUnits)
  {
    float oldYUnits = yUnits;
    yUnits = newYUnits;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.MOUNTED_ASSEMBLY_ITEM__YUNITS, oldYUnits, yUnits));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getZUnits()
  {
    return zUnits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setZUnits(float newZUnits)
  {
    float oldZUnits = zUnits;
    zUnits = newZUnits;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.MOUNTED_ASSEMBLY_ITEM__ZUNITS, oldZUnits, zUnits));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getRotateX()
  {
    return rotateX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRotateX(float newRotateX)
  {
    float oldRotateX = rotateX;
    rotateX = newRotateX;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.MOUNTED_ASSEMBLY_ITEM__ROTATE_X, oldRotateX, rotateX));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getRotateY()
  {
    return rotateY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRotateY(float newRotateY)
  {
    float oldRotateY = rotateY;
    rotateY = newRotateY;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.MOUNTED_ASSEMBLY_ITEM__ROTATE_Y, oldRotateY, rotateY));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getRotateZ()
  {
    return rotateZ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRotateZ(float newRotateZ)
  {
    float oldRotateZ = rotateZ;
    rotateZ = newRotateZ;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.MOUNTED_ASSEMBLY_ITEM__ROTATE_Z, oldRotateZ, rotateZ));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Action> getActions()
  {
    if (actions == null)
    {
      actions = new EObjectContainmentEList<Action>(Action.class, this, LegoPackage.MOUNTED_ASSEMBLY_ITEM__ACTIONS);
    }
    return actions;
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
      case LegoPackage.MOUNTED_ASSEMBLY_ITEM__ACTIONS:
        return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
      case LegoPackage.MOUNTED_ASSEMBLY_ITEM__ELEMENT:
        if (resolve) return getElement();
        return basicGetElement();
      case LegoPackage.MOUNTED_ASSEMBLY_ITEM__XUNITS:
        return getXUnits();
      case LegoPackage.MOUNTED_ASSEMBLY_ITEM__YUNITS:
        return getYUnits();
      case LegoPackage.MOUNTED_ASSEMBLY_ITEM__ZUNITS:
        return getZUnits();
      case LegoPackage.MOUNTED_ASSEMBLY_ITEM__ROTATE_X:
        return getRotateX();
      case LegoPackage.MOUNTED_ASSEMBLY_ITEM__ROTATE_Y:
        return getRotateY();
      case LegoPackage.MOUNTED_ASSEMBLY_ITEM__ROTATE_Z:
        return getRotateZ();
      case LegoPackage.MOUNTED_ASSEMBLY_ITEM__ACTIONS:
        return getActions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LegoPackage.MOUNTED_ASSEMBLY_ITEM__ELEMENT:
        setElement((MountedPart)newValue);
        return;
      case LegoPackage.MOUNTED_ASSEMBLY_ITEM__XUNITS:
        setXUnits((Float)newValue);
        return;
      case LegoPackage.MOUNTED_ASSEMBLY_ITEM__YUNITS:
        setYUnits((Float)newValue);
        return;
      case LegoPackage.MOUNTED_ASSEMBLY_ITEM__ZUNITS:
        setZUnits((Float)newValue);
        return;
      case LegoPackage.MOUNTED_ASSEMBLY_ITEM__ROTATE_X:
        setRotateX((Float)newValue);
        return;
      case LegoPackage.MOUNTED_ASSEMBLY_ITEM__ROTATE_Y:
        setRotateY((Float)newValue);
        return;
      case LegoPackage.MOUNTED_ASSEMBLY_ITEM__ROTATE_Z:
        setRotateZ((Float)newValue);
        return;
      case LegoPackage.MOUNTED_ASSEMBLY_ITEM__ACTIONS:
        getActions().clear();
        getActions().addAll((Collection<? extends Action>)newValue);
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
      case LegoPackage.MOUNTED_ASSEMBLY_ITEM__ELEMENT:
        setElement((MountedPart)null);
        return;
      case LegoPackage.MOUNTED_ASSEMBLY_ITEM__XUNITS:
        setXUnits(XUNITS_EDEFAULT);
        return;
      case LegoPackage.MOUNTED_ASSEMBLY_ITEM__YUNITS:
        setYUnits(YUNITS_EDEFAULT);
        return;
      case LegoPackage.MOUNTED_ASSEMBLY_ITEM__ZUNITS:
        setZUnits(ZUNITS_EDEFAULT);
        return;
      case LegoPackage.MOUNTED_ASSEMBLY_ITEM__ROTATE_X:
        setRotateX(ROTATE_X_EDEFAULT);
        return;
      case LegoPackage.MOUNTED_ASSEMBLY_ITEM__ROTATE_Y:
        setRotateY(ROTATE_Y_EDEFAULT);
        return;
      case LegoPackage.MOUNTED_ASSEMBLY_ITEM__ROTATE_Z:
        setRotateZ(ROTATE_Z_EDEFAULT);
        return;
      case LegoPackage.MOUNTED_ASSEMBLY_ITEM__ACTIONS:
        getActions().clear();
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
      case LegoPackage.MOUNTED_ASSEMBLY_ITEM__ELEMENT:
        return element != null;
      case LegoPackage.MOUNTED_ASSEMBLY_ITEM__XUNITS:
        return xUnits != XUNITS_EDEFAULT;
      case LegoPackage.MOUNTED_ASSEMBLY_ITEM__YUNITS:
        return yUnits != YUNITS_EDEFAULT;
      case LegoPackage.MOUNTED_ASSEMBLY_ITEM__ZUNITS:
        return zUnits != ZUNITS_EDEFAULT;
      case LegoPackage.MOUNTED_ASSEMBLY_ITEM__ROTATE_X:
        return rotateX != ROTATE_X_EDEFAULT;
      case LegoPackage.MOUNTED_ASSEMBLY_ITEM__ROTATE_Y:
        return rotateY != ROTATE_Y_EDEFAULT;
      case LegoPackage.MOUNTED_ASSEMBLY_ITEM__ROTATE_Z:
        return rotateZ != ROTATE_Z_EDEFAULT;
      case LegoPackage.MOUNTED_ASSEMBLY_ITEM__ACTIONS:
        return actions != null && !actions.isEmpty();
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
    result.append(" (xUnits: ");
    result.append(xUnits);
    result.append(", yUnits: ");
    result.append(yUnits);
    result.append(", zUnits: ");
    result.append(zUnits);
    result.append(", rotateX: ");
    result.append(rotateX);
    result.append(", rotateY: ");
    result.append(rotateY);
    result.append(", rotateZ: ");
    result.append(rotateZ);
    result.append(')');
    return result.toString();
  }

} //MountedAssemblyItemImpl
