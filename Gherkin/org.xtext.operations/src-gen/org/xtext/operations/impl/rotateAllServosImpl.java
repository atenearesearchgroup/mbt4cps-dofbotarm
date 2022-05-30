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
import org.xtext.operations.rotateAllServos;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>rotate All Servos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.operations.impl.rotateAllServosImpl#getAngle1 <em>Angle1</em>}</li>
 *   <li>{@link org.xtext.operations.impl.rotateAllServosImpl#getAngle2 <em>Angle2</em>}</li>
 *   <li>{@link org.xtext.operations.impl.rotateAllServosImpl#getAngle3 <em>Angle3</em>}</li>
 *   <li>{@link org.xtext.operations.impl.rotateAllServosImpl#getAngle4 <em>Angle4</em>}</li>
 *   <li>{@link org.xtext.operations.impl.rotateAllServosImpl#getAngle5 <em>Angle5</em>}</li>
 *   <li>{@link org.xtext.operations.impl.rotateAllServosImpl#getAngle6 <em>Angle6</em>}</li>
 * </ul>
 *
 * @generated
 */
public class rotateAllServosImpl extends CommandImpl implements rotateAllServos
{
  /**
   * The cached value of the '{@link #getAngle1() <em>Angle1</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAngle1()
   * @generated
   * @ordered
   */
  protected EList<Angle> angle1;

  /**
   * The cached value of the '{@link #getAngle2() <em>Angle2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAngle2()
   * @generated
   * @ordered
   */
  protected EList<Angle> angle2;

  /**
   * The cached value of the '{@link #getAngle3() <em>Angle3</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAngle3()
   * @generated
   * @ordered
   */
  protected EList<Angle> angle3;

  /**
   * The cached value of the '{@link #getAngle4() <em>Angle4</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAngle4()
   * @generated
   * @ordered
   */
  protected EList<Angle> angle4;

  /**
   * The cached value of the '{@link #getAngle5() <em>Angle5</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAngle5()
   * @generated
   * @ordered
   */
  protected EList<Angle> angle5;

  /**
   * The cached value of the '{@link #getAngle6() <em>Angle6</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAngle6()
   * @generated
   * @ordered
   */
  protected EList<Angle> angle6;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected rotateAllServosImpl()
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
    return OperationsPackage.Literals.ROTATE_ALL_SERVOS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Angle> getAngle1()
  {
    if (angle1 == null)
    {
      angle1 = new EObjectContainmentEList<Angle>(Angle.class, this, OperationsPackage.ROTATE_ALL_SERVOS__ANGLE1);
    }
    return angle1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Angle> getAngle2()
  {
    if (angle2 == null)
    {
      angle2 = new EObjectContainmentEList<Angle>(Angle.class, this, OperationsPackage.ROTATE_ALL_SERVOS__ANGLE2);
    }
    return angle2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Angle> getAngle3()
  {
    if (angle3 == null)
    {
      angle3 = new EObjectContainmentEList<Angle>(Angle.class, this, OperationsPackage.ROTATE_ALL_SERVOS__ANGLE3);
    }
    return angle3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Angle> getAngle4()
  {
    if (angle4 == null)
    {
      angle4 = new EObjectContainmentEList<Angle>(Angle.class, this, OperationsPackage.ROTATE_ALL_SERVOS__ANGLE4);
    }
    return angle4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Angle> getAngle5()
  {
    if (angle5 == null)
    {
      angle5 = new EObjectContainmentEList<Angle>(Angle.class, this, OperationsPackage.ROTATE_ALL_SERVOS__ANGLE5);
    }
    return angle5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Angle> getAngle6()
  {
    if (angle6 == null)
    {
      angle6 = new EObjectContainmentEList<Angle>(Angle.class, this, OperationsPackage.ROTATE_ALL_SERVOS__ANGLE6);
    }
    return angle6;
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
      case OperationsPackage.ROTATE_ALL_SERVOS__ANGLE1:
        return ((InternalEList<?>)getAngle1()).basicRemove(otherEnd, msgs);
      case OperationsPackage.ROTATE_ALL_SERVOS__ANGLE2:
        return ((InternalEList<?>)getAngle2()).basicRemove(otherEnd, msgs);
      case OperationsPackage.ROTATE_ALL_SERVOS__ANGLE3:
        return ((InternalEList<?>)getAngle3()).basicRemove(otherEnd, msgs);
      case OperationsPackage.ROTATE_ALL_SERVOS__ANGLE4:
        return ((InternalEList<?>)getAngle4()).basicRemove(otherEnd, msgs);
      case OperationsPackage.ROTATE_ALL_SERVOS__ANGLE5:
        return ((InternalEList<?>)getAngle5()).basicRemove(otherEnd, msgs);
      case OperationsPackage.ROTATE_ALL_SERVOS__ANGLE6:
        return ((InternalEList<?>)getAngle6()).basicRemove(otherEnd, msgs);
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
      case OperationsPackage.ROTATE_ALL_SERVOS__ANGLE1:
        return getAngle1();
      case OperationsPackage.ROTATE_ALL_SERVOS__ANGLE2:
        return getAngle2();
      case OperationsPackage.ROTATE_ALL_SERVOS__ANGLE3:
        return getAngle3();
      case OperationsPackage.ROTATE_ALL_SERVOS__ANGLE4:
        return getAngle4();
      case OperationsPackage.ROTATE_ALL_SERVOS__ANGLE5:
        return getAngle5();
      case OperationsPackage.ROTATE_ALL_SERVOS__ANGLE6:
        return getAngle6();
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
      case OperationsPackage.ROTATE_ALL_SERVOS__ANGLE1:
        getAngle1().clear();
        getAngle1().addAll((Collection<? extends Angle>)newValue);
        return;
      case OperationsPackage.ROTATE_ALL_SERVOS__ANGLE2:
        getAngle2().clear();
        getAngle2().addAll((Collection<? extends Angle>)newValue);
        return;
      case OperationsPackage.ROTATE_ALL_SERVOS__ANGLE3:
        getAngle3().clear();
        getAngle3().addAll((Collection<? extends Angle>)newValue);
        return;
      case OperationsPackage.ROTATE_ALL_SERVOS__ANGLE4:
        getAngle4().clear();
        getAngle4().addAll((Collection<? extends Angle>)newValue);
        return;
      case OperationsPackage.ROTATE_ALL_SERVOS__ANGLE5:
        getAngle5().clear();
        getAngle5().addAll((Collection<? extends Angle>)newValue);
        return;
      case OperationsPackage.ROTATE_ALL_SERVOS__ANGLE6:
        getAngle6().clear();
        getAngle6().addAll((Collection<? extends Angle>)newValue);
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
      case OperationsPackage.ROTATE_ALL_SERVOS__ANGLE1:
        getAngle1().clear();
        return;
      case OperationsPackage.ROTATE_ALL_SERVOS__ANGLE2:
        getAngle2().clear();
        return;
      case OperationsPackage.ROTATE_ALL_SERVOS__ANGLE3:
        getAngle3().clear();
        return;
      case OperationsPackage.ROTATE_ALL_SERVOS__ANGLE4:
        getAngle4().clear();
        return;
      case OperationsPackage.ROTATE_ALL_SERVOS__ANGLE5:
        getAngle5().clear();
        return;
      case OperationsPackage.ROTATE_ALL_SERVOS__ANGLE6:
        getAngle6().clear();
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
      case OperationsPackage.ROTATE_ALL_SERVOS__ANGLE1:
        return angle1 != null && !angle1.isEmpty();
      case OperationsPackage.ROTATE_ALL_SERVOS__ANGLE2:
        return angle2 != null && !angle2.isEmpty();
      case OperationsPackage.ROTATE_ALL_SERVOS__ANGLE3:
        return angle3 != null && !angle3.isEmpty();
      case OperationsPackage.ROTATE_ALL_SERVOS__ANGLE4:
        return angle4 != null && !angle4.isEmpty();
      case OperationsPackage.ROTATE_ALL_SERVOS__ANGLE5:
        return angle5 != null && !angle5.isEmpty();
      case OperationsPackage.ROTATE_ALL_SERVOS__ANGLE6:
        return angle6 != null && !angle6.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //rotateAllServosImpl
