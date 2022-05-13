/**
 * generated by Xtext 2.26.0
 */
package org.xtext.operations.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.operations.OperationalArm;
import org.xtext.operations.OperationsPackage;
import org.xtext.operations.time;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operational Arm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.operations.impl.OperationalArmImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.operations.impl.OperationalArmImpl#getTIME <em>TIME</em>}</li>
 *   <li>{@link org.xtext.operations.impl.OperationalArmImpl#getEND <em>END</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationalArmImpl extends InitialImpl implements OperationalArm
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
   * The cached value of the '{@link #getTIME() <em>TIME</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTIME()
   * @generated
   * @ordered
   */
  protected time time;

  /**
   * The default value of the '{@link #getEND() <em>END</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEND()
   * @generated
   * @ordered
   */
  protected static final String END_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEND() <em>END</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEND()
   * @generated
   * @ordered
   */
  protected String end = END_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationalArmImpl()
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
    return OperationsPackage.Literals.OPERATIONAL_ARM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.OPERATIONAL_ARM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public time getTIME()
  {
    return time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTIME(time newTIME, NotificationChain msgs)
  {
    time oldTIME = time;
    time = newTIME;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OperationsPackage.OPERATIONAL_ARM__TIME, oldTIME, newTIME);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTIME(time newTIME)
  {
    if (newTIME != time)
    {
      NotificationChain msgs = null;
      if (time != null)
        msgs = ((InternalEObject)time).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OperationsPackage.OPERATIONAL_ARM__TIME, null, msgs);
      if (newTIME != null)
        msgs = ((InternalEObject)newTIME).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OperationsPackage.OPERATIONAL_ARM__TIME, null, msgs);
      msgs = basicSetTIME(newTIME, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.OPERATIONAL_ARM__TIME, newTIME, newTIME));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getEND()
  {
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEND(String newEND)
  {
    String oldEND = end;
    end = newEND;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.OPERATIONAL_ARM__END, oldEND, end));
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
      case OperationsPackage.OPERATIONAL_ARM__TIME:
        return basicSetTIME(null, msgs);
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
      case OperationsPackage.OPERATIONAL_ARM__NAME:
        return getName();
      case OperationsPackage.OPERATIONAL_ARM__TIME:
        return getTIME();
      case OperationsPackage.OPERATIONAL_ARM__END:
        return getEND();
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
      case OperationsPackage.OPERATIONAL_ARM__NAME:
        setName((String)newValue);
        return;
      case OperationsPackage.OPERATIONAL_ARM__TIME:
        setTIME((time)newValue);
        return;
      case OperationsPackage.OPERATIONAL_ARM__END:
        setEND((String)newValue);
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
      case OperationsPackage.OPERATIONAL_ARM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OperationsPackage.OPERATIONAL_ARM__TIME:
        setTIME((time)null);
        return;
      case OperationsPackage.OPERATIONAL_ARM__END:
        setEND(END_EDEFAULT);
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
      case OperationsPackage.OPERATIONAL_ARM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OperationsPackage.OPERATIONAL_ARM__TIME:
        return time != null;
      case OperationsPackage.OPERATIONAL_ARM__END:
        return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", END: ");
    result.append(end);
    result.append(')');
    return result.toString();
  }

} //OperationalArmImpl
