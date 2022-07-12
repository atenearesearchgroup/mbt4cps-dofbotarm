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

import org.xtext.operations.B;
import org.xtext.operations.G;
import org.xtext.operations.OperationsPackage;
import org.xtext.operations.R;
import org.xtext.operations.lightRGBOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>light RGB Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.operations.impl.lightRGBOperationImpl#getR <em>R</em>}</li>
 *   <li>{@link org.xtext.operations.impl.lightRGBOperationImpl#getG <em>G</em>}</li>
 *   <li>{@link org.xtext.operations.impl.lightRGBOperationImpl#getB <em>B</em>}</li>
 * </ul>
 *
 * @generated
 */
public class lightRGBOperationImpl extends CommandImpl implements lightRGBOperation
{
  /**
   * The cached value of the '{@link #getR() <em>R</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getR()
   * @generated
   * @ordered
   */
  protected EList<R> r;

  /**
   * The cached value of the '{@link #getG() <em>G</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getG()
   * @generated
   * @ordered
   */
  protected EList<G> g;

  /**
   * The cached value of the '{@link #getB() <em>B</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getB()
   * @generated
   * @ordered
   */
  protected EList<B> b;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected lightRGBOperationImpl()
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
    return OperationsPackage.Literals.LIGHT_RGB_OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<R> getR()
  {
    if (r == null)
    {
      r = new EObjectContainmentEList<R>(R.class, this, OperationsPackage.LIGHT_RGB_OPERATION__R);
    }
    return r;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<G> getG()
  {
    if (g == null)
    {
      g = new EObjectContainmentEList<G>(G.class, this, OperationsPackage.LIGHT_RGB_OPERATION__G);
    }
    return g;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<B> getB()
  {
    if (b == null)
    {
      b = new EObjectContainmentEList<B>(B.class, this, OperationsPackage.LIGHT_RGB_OPERATION__B);
    }
    return b;
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
      case OperationsPackage.LIGHT_RGB_OPERATION__R:
        return ((InternalEList<?>)getR()).basicRemove(otherEnd, msgs);
      case OperationsPackage.LIGHT_RGB_OPERATION__G:
        return ((InternalEList<?>)getG()).basicRemove(otherEnd, msgs);
      case OperationsPackage.LIGHT_RGB_OPERATION__B:
        return ((InternalEList<?>)getB()).basicRemove(otherEnd, msgs);
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
      case OperationsPackage.LIGHT_RGB_OPERATION__R:
        return getR();
      case OperationsPackage.LIGHT_RGB_OPERATION__G:
        return getG();
      case OperationsPackage.LIGHT_RGB_OPERATION__B:
        return getB();
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
      case OperationsPackage.LIGHT_RGB_OPERATION__R:
        getR().clear();
        getR().addAll((Collection<? extends R>)newValue);
        return;
      case OperationsPackage.LIGHT_RGB_OPERATION__G:
        getG().clear();
        getG().addAll((Collection<? extends G>)newValue);
        return;
      case OperationsPackage.LIGHT_RGB_OPERATION__B:
        getB().clear();
        getB().addAll((Collection<? extends B>)newValue);
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
      case OperationsPackage.LIGHT_RGB_OPERATION__R:
        getR().clear();
        return;
      case OperationsPackage.LIGHT_RGB_OPERATION__G:
        getG().clear();
        return;
      case OperationsPackage.LIGHT_RGB_OPERATION__B:
        getB().clear();
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
      case OperationsPackage.LIGHT_RGB_OPERATION__R:
        return r != null && !r.isEmpty();
      case OperationsPackage.LIGHT_RGB_OPERATION__G:
        return g != null && !g.isEmpty();
      case OperationsPackage.LIGHT_RGB_OPERATION__B:
        return b != null && !b.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //lightRGBOperationImpl
