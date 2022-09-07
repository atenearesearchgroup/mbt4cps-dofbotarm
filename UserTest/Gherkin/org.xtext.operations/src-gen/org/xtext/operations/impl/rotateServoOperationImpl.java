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

import org.xtext.operations.Angle;
import org.xtext.operations.OperationsPackage;
import org.xtext.operations.Servo;
import org.xtext.operations.Time;
import org.xtext.operations.rotateServoOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>rotate Servo Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.operations.impl.rotateServoOperationImpl#getServo <em>Servo</em>}</li>
 *   <li>{@link org.xtext.operations.impl.rotateServoOperationImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link org.xtext.operations.impl.rotateServoOperationImpl#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class rotateServoOperationImpl extends CommandImpl implements rotateServoOperation
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
   * The cached value of the '{@link #getAngle() <em>Angle</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAngle()
   * @generated
   * @ordered
   */
  protected EList<Angle> angle;

  /**
   * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime()
   * @generated
   * @ordered
   */
  protected EList<Time> time;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected rotateServoOperationImpl()
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
    return OperationsPackage.Literals.ROTATE_SERVO_OPERATION;
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
      servo = new EObjectContainmentEList<Servo>(Servo.class, this, OperationsPackage.ROTATE_SERVO_OPERATION__SERVO);
    }
    return servo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Angle> getAngle()
  {
    if (angle == null)
    {
      angle = new EObjectContainmentEList<Angle>(Angle.class, this, OperationsPackage.ROTATE_SERVO_OPERATION__ANGLE);
    }
    return angle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Time> getTime()
  {
    if (time == null)
    {
      time = new EObjectContainmentEList<Time>(Time.class, this, OperationsPackage.ROTATE_SERVO_OPERATION__TIME);
    }
    return time;
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
      case OperationsPackage.ROTATE_SERVO_OPERATION__SERVO:
        return ((InternalEList<?>)getServo()).basicRemove(otherEnd, msgs);
      case OperationsPackage.ROTATE_SERVO_OPERATION__ANGLE:
        return ((InternalEList<?>)getAngle()).basicRemove(otherEnd, msgs);
      case OperationsPackage.ROTATE_SERVO_OPERATION__TIME:
        return ((InternalEList<?>)getTime()).basicRemove(otherEnd, msgs);
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
      case OperationsPackage.ROTATE_SERVO_OPERATION__SERVO:
        return getServo();
      case OperationsPackage.ROTATE_SERVO_OPERATION__ANGLE:
        return getAngle();
      case OperationsPackage.ROTATE_SERVO_OPERATION__TIME:
        return getTime();
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
      case OperationsPackage.ROTATE_SERVO_OPERATION__SERVO:
        getServo().clear();
        getServo().addAll((Collection<? extends Servo>)newValue);
        return;
      case OperationsPackage.ROTATE_SERVO_OPERATION__ANGLE:
        getAngle().clear();
        getAngle().addAll((Collection<? extends Angle>)newValue);
        return;
      case OperationsPackage.ROTATE_SERVO_OPERATION__TIME:
        getTime().clear();
        getTime().addAll((Collection<? extends Time>)newValue);
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
      case OperationsPackage.ROTATE_SERVO_OPERATION__SERVO:
        getServo().clear();
        return;
      case OperationsPackage.ROTATE_SERVO_OPERATION__ANGLE:
        getAngle().clear();
        return;
      case OperationsPackage.ROTATE_SERVO_OPERATION__TIME:
        getTime().clear();
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
      case OperationsPackage.ROTATE_SERVO_OPERATION__SERVO:
        return servo != null && !servo.isEmpty();
      case OperationsPackage.ROTATE_SERVO_OPERATION__ANGLE:
        return angle != null && !angle.isEmpty();
      case OperationsPackage.ROTATE_SERVO_OPERATION__TIME:
        return time != null && !time.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //rotateServoOperationImpl
