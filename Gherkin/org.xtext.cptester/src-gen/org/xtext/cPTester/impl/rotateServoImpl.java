/**
 * generated by Xtext 2.26.0
 */
package org.xtext.cPTester.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.cPTester.CPTesterPackage;
import org.xtext.cPTester.rotateServo;

import org.xtext.operations.Servo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>rotate Servo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.cPTester.impl.rotateServoImpl#getServo <em>Servo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class rotateServoImpl extends CommandImpl implements rotateServo
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
  protected rotateServoImpl()
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
    return CPTesterPackage.Literals.ROTATE_SERVO;
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
      servo = new EObjectContainmentEList<Servo>(Servo.class, this, CPTesterPackage.ROTATE_SERVO__SERVO);
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
      case CPTesterPackage.ROTATE_SERVO__SERVO:
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
      case CPTesterPackage.ROTATE_SERVO__SERVO:
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
      case CPTesterPackage.ROTATE_SERVO__SERVO:
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
      case CPTesterPackage.ROTATE_SERVO__SERVO:
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
      case CPTesterPackage.ROTATE_SERVO__SERVO:
        return servo != null && !servo.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //rotateServoImpl
