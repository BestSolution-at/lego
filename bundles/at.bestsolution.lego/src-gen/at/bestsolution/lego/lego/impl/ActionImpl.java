/**
 */
package at.bestsolution.lego.lego.impl;

import at.bestsolution.lego.lego.Action;
import at.bestsolution.lego.lego.LegoPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.lego.lego.impl.ActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.impl.ActionImpl#getType <em>Type</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.impl.ActionImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.impl.ActionImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.impl.ActionImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.impl.ActionImpl#getSoundfile <em>Soundfile</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action
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
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getAxis() <em>Axis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAxis()
   * @generated
   * @ordered
   */
  protected static final String AXIS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAxis() <em>Axis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAxis()
   * @generated
   * @ordered
   */
  protected String axis = AXIS_EDEFAULT;

  /**
   * The default value of the '{@link #getAngle() <em>Angle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAngle()
   * @generated
   * @ordered
   */
  protected static final float ANGLE_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getAngle() <em>Angle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAngle()
   * @generated
   * @ordered
   */
  protected float angle = ANGLE_EDEFAULT;

  /**
   * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuration()
   * @generated
   * @ordered
   */
  protected static final int DURATION_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuration()
   * @generated
   * @ordered
   */
  protected int duration = DURATION_EDEFAULT;

  /**
   * The default value of the '{@link #getSoundfile() <em>Soundfile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSoundfile()
   * @generated
   * @ordered
   */
  protected static final String SOUNDFILE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSoundfile() <em>Soundfile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSoundfile()
   * @generated
   * @ordered
   */
  protected String soundfile = SOUNDFILE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionImpl()
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
    return LegoPackage.Literals.ACTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.ACTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.ACTION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAxis()
  {
    return axis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAxis(String newAxis)
  {
    String oldAxis = axis;
    axis = newAxis;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.ACTION__AXIS, oldAxis, axis));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getAngle()
  {
    return angle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAngle(float newAngle)
  {
    float oldAngle = angle;
    angle = newAngle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.ACTION__ANGLE, oldAngle, angle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDuration()
  {
    return duration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDuration(int newDuration)
  {
    int oldDuration = duration;
    duration = newDuration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.ACTION__DURATION, oldDuration, duration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSoundfile()
  {
    return soundfile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSoundfile(String newSoundfile)
  {
    String oldSoundfile = soundfile;
    soundfile = newSoundfile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.ACTION__SOUNDFILE, oldSoundfile, soundfile));
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
      case LegoPackage.ACTION__NAME:
        return getName();
      case LegoPackage.ACTION__TYPE:
        return getType();
      case LegoPackage.ACTION__AXIS:
        return getAxis();
      case LegoPackage.ACTION__ANGLE:
        return getAngle();
      case LegoPackage.ACTION__DURATION:
        return getDuration();
      case LegoPackage.ACTION__SOUNDFILE:
        return getSoundfile();
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
      case LegoPackage.ACTION__NAME:
        setName((String)newValue);
        return;
      case LegoPackage.ACTION__TYPE:
        setType((String)newValue);
        return;
      case LegoPackage.ACTION__AXIS:
        setAxis((String)newValue);
        return;
      case LegoPackage.ACTION__ANGLE:
        setAngle((Float)newValue);
        return;
      case LegoPackage.ACTION__DURATION:
        setDuration((Integer)newValue);
        return;
      case LegoPackage.ACTION__SOUNDFILE:
        setSoundfile((String)newValue);
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
      case LegoPackage.ACTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LegoPackage.ACTION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case LegoPackage.ACTION__AXIS:
        setAxis(AXIS_EDEFAULT);
        return;
      case LegoPackage.ACTION__ANGLE:
        setAngle(ANGLE_EDEFAULT);
        return;
      case LegoPackage.ACTION__DURATION:
        setDuration(DURATION_EDEFAULT);
        return;
      case LegoPackage.ACTION__SOUNDFILE:
        setSoundfile(SOUNDFILE_EDEFAULT);
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
      case LegoPackage.ACTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LegoPackage.ACTION__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case LegoPackage.ACTION__AXIS:
        return AXIS_EDEFAULT == null ? axis != null : !AXIS_EDEFAULT.equals(axis);
      case LegoPackage.ACTION__ANGLE:
        return angle != ANGLE_EDEFAULT;
      case LegoPackage.ACTION__DURATION:
        return duration != DURATION_EDEFAULT;
      case LegoPackage.ACTION__SOUNDFILE:
        return SOUNDFILE_EDEFAULT == null ? soundfile != null : !SOUNDFILE_EDEFAULT.equals(soundfile);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", type: ");
    result.append(type);
    result.append(", axis: ");
    result.append(axis);
    result.append(", angle: ");
    result.append(angle);
    result.append(", duration: ");
    result.append(duration);
    result.append(", soundfile: ");
    result.append(soundfile);
    result.append(')');
    return result.toString();
  }

} //ActionImpl
