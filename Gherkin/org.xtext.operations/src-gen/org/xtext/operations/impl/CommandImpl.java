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
import org.xtext.operations.Command;
import org.xtext.operations.OperationsPackage;
import org.xtext.operations.Time;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.operations.impl.CommandImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link org.xtext.operations.impl.CommandImpl#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandImpl extends OperacionesImpl implements Command
{
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
  protected CommandImpl()
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
    return OperationsPackage.Literals.COMMAND;
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
      angle = new EObjectContainmentEList<Angle>(Angle.class, this, OperationsPackage.COMMAND__ANGLE);
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
      time = new EObjectContainmentEList<Time>(Time.class, this, OperationsPackage.COMMAND__TIME);
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
      case OperationsPackage.COMMAND__ANGLE:
        return ((InternalEList<?>)getAngle()).basicRemove(otherEnd, msgs);
      case OperationsPackage.COMMAND__TIME:
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
      case OperationsPackage.COMMAND__ANGLE:
        return getAngle();
      case OperationsPackage.COMMAND__TIME:
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
      case OperationsPackage.COMMAND__ANGLE:
        getAngle().clear();
        getAngle().addAll((Collection<? extends Angle>)newValue);
        return;
      case OperationsPackage.COMMAND__TIME:
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
      case OperationsPackage.COMMAND__ANGLE:
        getAngle().clear();
        return;
      case OperationsPackage.COMMAND__TIME:
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
      case OperationsPackage.COMMAND__ANGLE:
        return angle != null && !angle.isEmpty();
      case OperationsPackage.COMMAND__TIME:
        return time != null && !time.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CommandImpl
