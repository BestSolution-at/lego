/**
 */
package at.bestsolution.lego.lego.impl;

import at.bestsolution.lego.lego.Assembly;
import at.bestsolution.lego.lego.ItemRepository;
import at.bestsolution.lego.lego.LegoPackage;
import at.bestsolution.lego.lego.Model;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.lego.lego.impl.ModelImpl#getRepo <em>Repo</em>}</li>
 *   <li>{@link at.bestsolution.lego.lego.impl.ModelImpl#getAssembly <em>Assembly</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getRepo() <em>Repo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepo()
   * @generated
   * @ordered
   */
  protected ItemRepository repo;

  /**
   * The cached value of the '{@link #getAssembly() <em>Assembly</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssembly()
   * @generated
   * @ordered
   */
  protected Assembly assembly;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return LegoPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemRepository getRepo()
  {
    return repo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRepo(ItemRepository newRepo, NotificationChain msgs)
  {
    ItemRepository oldRepo = repo;
    repo = newRepo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LegoPackage.MODEL__REPO, oldRepo, newRepo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRepo(ItemRepository newRepo)
  {
    if (newRepo != repo)
    {
      NotificationChain msgs = null;
      if (repo != null)
        msgs = ((InternalEObject)repo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LegoPackage.MODEL__REPO, null, msgs);
      if (newRepo != null)
        msgs = ((InternalEObject)newRepo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LegoPackage.MODEL__REPO, null, msgs);
      msgs = basicSetRepo(newRepo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.MODEL__REPO, newRepo, newRepo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assembly getAssembly()
  {
    return assembly;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssembly(Assembly newAssembly, NotificationChain msgs)
  {
    Assembly oldAssembly = assembly;
    assembly = newAssembly;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LegoPackage.MODEL__ASSEMBLY, oldAssembly, newAssembly);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssembly(Assembly newAssembly)
  {
    if (newAssembly != assembly)
    {
      NotificationChain msgs = null;
      if (assembly != null)
        msgs = ((InternalEObject)assembly).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LegoPackage.MODEL__ASSEMBLY, null, msgs);
      if (newAssembly != null)
        msgs = ((InternalEObject)newAssembly).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LegoPackage.MODEL__ASSEMBLY, null, msgs);
      msgs = basicSetAssembly(newAssembly, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LegoPackage.MODEL__ASSEMBLY, newAssembly, newAssembly));
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
      case LegoPackage.MODEL__REPO:
        return basicSetRepo(null, msgs);
      case LegoPackage.MODEL__ASSEMBLY:
        return basicSetAssembly(null, msgs);
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
      case LegoPackage.MODEL__REPO:
        return getRepo();
      case LegoPackage.MODEL__ASSEMBLY:
        return getAssembly();
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
      case LegoPackage.MODEL__REPO:
        setRepo((ItemRepository)newValue);
        return;
      case LegoPackage.MODEL__ASSEMBLY:
        setAssembly((Assembly)newValue);
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
      case LegoPackage.MODEL__REPO:
        setRepo((ItemRepository)null);
        return;
      case LegoPackage.MODEL__ASSEMBLY:
        setAssembly((Assembly)null);
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
      case LegoPackage.MODEL__REPO:
        return repo != null;
      case LegoPackage.MODEL__ASSEMBLY:
        return assembly != null;
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
