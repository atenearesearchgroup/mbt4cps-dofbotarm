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

import org.xtext.operations.Color;
import org.xtext.operations.H_max;
import org.xtext.operations.H_min;
import org.xtext.operations.OperationsPackage;
import org.xtext.operations.S_max;
import org.xtext.operations.S_min;
import org.xtext.operations.V_max;
import org.xtext.operations.V_min;
import org.xtext.operations.colorConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>color Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.operations.impl.colorConfigurationImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.xtext.operations.impl.colorConfigurationImpl#getH_min <em>Hmin</em>}</li>
 *   <li>{@link org.xtext.operations.impl.colorConfigurationImpl#getS_min <em>Smin</em>}</li>
 *   <li>{@link org.xtext.operations.impl.colorConfigurationImpl#getV_min <em>Vmin</em>}</li>
 *   <li>{@link org.xtext.operations.impl.colorConfigurationImpl#getH_max <em>Hmax</em>}</li>
 *   <li>{@link org.xtext.operations.impl.colorConfigurationImpl#getS_max <em>Smax</em>}</li>
 *   <li>{@link org.xtext.operations.impl.colorConfigurationImpl#getV_max <em>Vmax</em>}</li>
 * </ul>
 *
 * @generated
 */
public class colorConfigurationImpl extends CommandImpl implements colorConfiguration
{
  /**
   * The cached value of the '{@link #getColor() <em>Color</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected EList<Color> color;

  /**
   * The cached value of the '{@link #getH_min() <em>Hmin</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getH_min()
   * @generated
   * @ordered
   */
  protected EList<H_min> h_min;

  /**
   * The cached value of the '{@link #getS_min() <em>Smin</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS_min()
   * @generated
   * @ordered
   */
  protected EList<S_min> s_min;

  /**
   * The cached value of the '{@link #getV_min() <em>Vmin</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV_min()
   * @generated
   * @ordered
   */
  protected EList<V_min> v_min;

  /**
   * The cached value of the '{@link #getH_max() <em>Hmax</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getH_max()
   * @generated
   * @ordered
   */
  protected EList<H_max> h_max;

  /**
   * The cached value of the '{@link #getS_max() <em>Smax</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS_max()
   * @generated
   * @ordered
   */
  protected EList<S_max> s_max;

  /**
   * The cached value of the '{@link #getV_max() <em>Vmax</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV_max()
   * @generated
   * @ordered
   */
  protected EList<V_max> v_max;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected colorConfigurationImpl()
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
    return OperationsPackage.Literals.COLOR_CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Color> getColor()
  {
    if (color == null)
    {
      color = new EObjectContainmentEList<Color>(Color.class, this, OperationsPackage.COLOR_CONFIGURATION__COLOR);
    }
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<H_min> getH_min()
  {
    if (h_min == null)
    {
      h_min = new EObjectContainmentEList<H_min>(H_min.class, this, OperationsPackage.COLOR_CONFIGURATION__HMIN);
    }
    return h_min;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<S_min> getS_min()
  {
    if (s_min == null)
    {
      s_min = new EObjectContainmentEList<S_min>(S_min.class, this, OperationsPackage.COLOR_CONFIGURATION__SMIN);
    }
    return s_min;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<V_min> getV_min()
  {
    if (v_min == null)
    {
      v_min = new EObjectContainmentEList<V_min>(V_min.class, this, OperationsPackage.COLOR_CONFIGURATION__VMIN);
    }
    return v_min;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<H_max> getH_max()
  {
    if (h_max == null)
    {
      h_max = new EObjectContainmentEList<H_max>(H_max.class, this, OperationsPackage.COLOR_CONFIGURATION__HMAX);
    }
    return h_max;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<S_max> getS_max()
  {
    if (s_max == null)
    {
      s_max = new EObjectContainmentEList<S_max>(S_max.class, this, OperationsPackage.COLOR_CONFIGURATION__SMAX);
    }
    return s_max;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<V_max> getV_max()
  {
    if (v_max == null)
    {
      v_max = new EObjectContainmentEList<V_max>(V_max.class, this, OperationsPackage.COLOR_CONFIGURATION__VMAX);
    }
    return v_max;
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
      case OperationsPackage.COLOR_CONFIGURATION__COLOR:
        return ((InternalEList<?>)getColor()).basicRemove(otherEnd, msgs);
      case OperationsPackage.COLOR_CONFIGURATION__HMIN:
        return ((InternalEList<?>)getH_min()).basicRemove(otherEnd, msgs);
      case OperationsPackage.COLOR_CONFIGURATION__SMIN:
        return ((InternalEList<?>)getS_min()).basicRemove(otherEnd, msgs);
      case OperationsPackage.COLOR_CONFIGURATION__VMIN:
        return ((InternalEList<?>)getV_min()).basicRemove(otherEnd, msgs);
      case OperationsPackage.COLOR_CONFIGURATION__HMAX:
        return ((InternalEList<?>)getH_max()).basicRemove(otherEnd, msgs);
      case OperationsPackage.COLOR_CONFIGURATION__SMAX:
        return ((InternalEList<?>)getS_max()).basicRemove(otherEnd, msgs);
      case OperationsPackage.COLOR_CONFIGURATION__VMAX:
        return ((InternalEList<?>)getV_max()).basicRemove(otherEnd, msgs);
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
      case OperationsPackage.COLOR_CONFIGURATION__COLOR:
        return getColor();
      case OperationsPackage.COLOR_CONFIGURATION__HMIN:
        return getH_min();
      case OperationsPackage.COLOR_CONFIGURATION__SMIN:
        return getS_min();
      case OperationsPackage.COLOR_CONFIGURATION__VMIN:
        return getV_min();
      case OperationsPackage.COLOR_CONFIGURATION__HMAX:
        return getH_max();
      case OperationsPackage.COLOR_CONFIGURATION__SMAX:
        return getS_max();
      case OperationsPackage.COLOR_CONFIGURATION__VMAX:
        return getV_max();
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
      case OperationsPackage.COLOR_CONFIGURATION__COLOR:
        getColor().clear();
        getColor().addAll((Collection<? extends Color>)newValue);
        return;
      case OperationsPackage.COLOR_CONFIGURATION__HMIN:
        getH_min().clear();
        getH_min().addAll((Collection<? extends H_min>)newValue);
        return;
      case OperationsPackage.COLOR_CONFIGURATION__SMIN:
        getS_min().clear();
        getS_min().addAll((Collection<? extends S_min>)newValue);
        return;
      case OperationsPackage.COLOR_CONFIGURATION__VMIN:
        getV_min().clear();
        getV_min().addAll((Collection<? extends V_min>)newValue);
        return;
      case OperationsPackage.COLOR_CONFIGURATION__HMAX:
        getH_max().clear();
        getH_max().addAll((Collection<? extends H_max>)newValue);
        return;
      case OperationsPackage.COLOR_CONFIGURATION__SMAX:
        getS_max().clear();
        getS_max().addAll((Collection<? extends S_max>)newValue);
        return;
      case OperationsPackage.COLOR_CONFIGURATION__VMAX:
        getV_max().clear();
        getV_max().addAll((Collection<? extends V_max>)newValue);
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
      case OperationsPackage.COLOR_CONFIGURATION__COLOR:
        getColor().clear();
        return;
      case OperationsPackage.COLOR_CONFIGURATION__HMIN:
        getH_min().clear();
        return;
      case OperationsPackage.COLOR_CONFIGURATION__SMIN:
        getS_min().clear();
        return;
      case OperationsPackage.COLOR_CONFIGURATION__VMIN:
        getV_min().clear();
        return;
      case OperationsPackage.COLOR_CONFIGURATION__HMAX:
        getH_max().clear();
        return;
      case OperationsPackage.COLOR_CONFIGURATION__SMAX:
        getS_max().clear();
        return;
      case OperationsPackage.COLOR_CONFIGURATION__VMAX:
        getV_max().clear();
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
      case OperationsPackage.COLOR_CONFIGURATION__COLOR:
        return color != null && !color.isEmpty();
      case OperationsPackage.COLOR_CONFIGURATION__HMIN:
        return h_min != null && !h_min.isEmpty();
      case OperationsPackage.COLOR_CONFIGURATION__SMIN:
        return s_min != null && !s_min.isEmpty();
      case OperationsPackage.COLOR_CONFIGURATION__VMIN:
        return v_min != null && !v_min.isEmpty();
      case OperationsPackage.COLOR_CONFIGURATION__HMAX:
        return h_max != null && !h_max.isEmpty();
      case OperationsPackage.COLOR_CONFIGURATION__SMAX:
        return s_max != null && !s_max.isEmpty();
      case OperationsPackage.COLOR_CONFIGURATION__VMAX:
        return v_max != null && !v_max.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //colorConfigurationImpl
