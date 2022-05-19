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

import org.xtext.cPTester.Angle;
import org.xtext.cPTester.Angle_res;
import org.xtext.cPTester.CPTesterPackage;
import org.xtext.cPTester.Servo;
import org.xtext.cPTester.isAtSingle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>is At Single</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.cPTester.impl.isAtSingleImpl#getServo <em>Servo</em>}</li>
 *   <li>{@link org.xtext.cPTester.impl.isAtSingleImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link org.xtext.cPTester.impl.isAtSingleImpl#getAngle_res <em>Angle res</em>}</li>
 * </ul>
 *
 * @generated
 */
public class isAtSingleImpl extends ConditionsImpl implements isAtSingle
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
   * The cached value of the '{@link #getAngle_res() <em>Angle res</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAngle_res()
   * @generated
   * @ordered
   */
  protected EList<Angle_res> angle_res;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected isAtSingleImpl()
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
    return CPTesterPackage.Literals.IS_AT_SINGLE;
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
      servo = new EObjectContainmentEList<Servo>(Servo.class, this, CPTesterPackage.IS_AT_SINGLE__SERVO);
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
      angle = new EObjectContainmentEList<Angle>(Angle.class, this, CPTesterPackage.IS_AT_SINGLE__ANGLE);
    }
    return angle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Angle_res> getAngle_res()
  {
    if (angle_res == null)
    {
      angle_res = new EObjectContainmentEList<Angle_res>(Angle_res.class, this, CPTesterPackage.IS_AT_SINGLE__ANGLE_RES);
    }
    return angle_res;
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
      case CPTesterPackage.IS_AT_SINGLE__SERVO:
        return ((InternalEList<?>)getServo()).basicRemove(otherEnd, msgs);
      case CPTesterPackage.IS_AT_SINGLE__ANGLE:
        return ((InternalEList<?>)getAngle()).basicRemove(otherEnd, msgs);
      case CPTesterPackage.IS_AT_SINGLE__ANGLE_RES:
        return ((InternalEList<?>)getAngle_res()).basicRemove(otherEnd, msgs);
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
      case CPTesterPackage.IS_AT_SINGLE__SERVO:
        return getServo();
      case CPTesterPackage.IS_AT_SINGLE__ANGLE:
        return getAngle();
      case CPTesterPackage.IS_AT_SINGLE__ANGLE_RES:
        return getAngle_res();
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
      case CPTesterPackage.IS_AT_SINGLE__SERVO:
        getServo().clear();
        getServo().addAll((Collection<? extends Servo>)newValue);
        return;
      case CPTesterPackage.IS_AT_SINGLE__ANGLE:
        getAngle().clear();
        getAngle().addAll((Collection<? extends Angle>)newValue);
        return;
      case CPTesterPackage.IS_AT_SINGLE__ANGLE_RES:
        getAngle_res().clear();
        getAngle_res().addAll((Collection<? extends Angle_res>)newValue);
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
      case CPTesterPackage.IS_AT_SINGLE__SERVO:
        getServo().clear();
        return;
      case CPTesterPackage.IS_AT_SINGLE__ANGLE:
        getAngle().clear();
        return;
      case CPTesterPackage.IS_AT_SINGLE__ANGLE_RES:
        getAngle_res().clear();
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
      case CPTesterPackage.IS_AT_SINGLE__SERVO:
        return servo != null && !servo.isEmpty();
      case CPTesterPackage.IS_AT_SINGLE__ANGLE:
        return angle != null && !angle.isEmpty();
      case CPTesterPackage.IS_AT_SINGLE__ANGLE_RES:
        return angle_res != null && !angle_res.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //isAtSingleImpl
