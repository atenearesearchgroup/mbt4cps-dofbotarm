/**
 * generated by Xtext 2.26.0
 */
package org.xtext.solution.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.solution.Angle_res;
import org.xtext.solution.SolutionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Angle res</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.solution.impl.Angle_resImpl#getAngle_res <em>Angle res</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Angle_resImpl extends MinimalEObjectImpl.Container implements Angle_res
{
  /**
   * The default value of the '{@link #getAngle_res() <em>Angle res</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAngle_res()
   * @generated
   * @ordered
   */
  protected static final int ANGLE_RES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAngle_res() <em>Angle res</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAngle_res()
   * @generated
   * @ordered
   */
  protected int angle_res = ANGLE_RES_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Angle_resImpl()
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
    return SolutionPackage.Literals.ANGLE_RES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getAngle_res()
  {
    return angle_res;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAngle_res(int newAngle_res)
  {
    int oldAngle_res = angle_res;
    angle_res = newAngle_res;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SolutionPackage.ANGLE_RES__ANGLE_RES, oldAngle_res, angle_res));
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
      case SolutionPackage.ANGLE_RES__ANGLE_RES:
        return getAngle_res();
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
      case SolutionPackage.ANGLE_RES__ANGLE_RES:
        setAngle_res((Integer)newValue);
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
      case SolutionPackage.ANGLE_RES__ANGLE_RES:
        setAngle_res(ANGLE_RES_EDEFAULT);
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
      case SolutionPackage.ANGLE_RES__ANGLE_RES:
        return angle_res != ANGLE_RES_EDEFAULT;
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
    result.append(" (angle_res: ");
    result.append(angle_res);
    result.append(')');
    return result.toString();
  }

} //Angle_resImpl
