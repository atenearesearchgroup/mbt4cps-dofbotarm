/**
 * generated by Xtext 2.26.0
 */
package org.xtext.operations.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.operations.OperationsPackage;
import org.xtext.operations.Servo;
import org.xtext.operations.readServoOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>read Servo Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.operations.impl.readServoOperationImpl#getServo <em>Servo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class readServoOperationImpl extends CommandImpl implements readServoOperation
{
  /**
   * The cached value of the '{@link #getServo() <em>Servo</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServo()
   * @generated
   * @ordered
   */
  protected EList<Servo> servo;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected readServoOperationImpl()
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
    return OperationsPackage.Literals.READ_SERVO_OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Servo> getServo()
  {
    if (servo == null)
    {
      servo = new EObjectContainmentEList<Servo>(Servo.class, this, OperationsPackage.READ_SERVO_OPERATION__SERVO);
    }
    return servo;
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
      case OperationsPackage.READ_SERVO_OPERATION__SERVO:
        return ((InternalEList<?>)getServo()).basicRemove(otherEnd, msgs);
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
      case OperationsPackage.READ_SERVO_OPERATION__SERVO:
        return getServo();
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
      case OperationsPackage.READ_SERVO_OPERATION__SERVO:
        getServo().clear();
        getServo().addAll((Collection<? extends Servo>)newValue);
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
      case OperationsPackage.READ_SERVO_OPERATION__SERVO:
        getServo().clear();
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
      case OperationsPackage.READ_SERVO_OPERATION__SERVO:
        return servo != null && !servo.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //readServoOperationImpl
