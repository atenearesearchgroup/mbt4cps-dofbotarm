/**
 * generated by Xtext 2.26.0
 */
package org.xtext.cPTester.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.cPTester.And;
import org.xtext.cPTester.CPTesterPackage;

import org.xtext.condition.Conditions;

import org.xtext.solution.Solution;
import org.xtext.solution.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>And</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.cPTester.impl.AndImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.cPTester.impl.AndImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link org.xtext.cPTester.impl.AndImpl#getSolution <em>Solution</em>}</li>
 *   <li>{@link org.xtext.cPTester.impl.AndImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AndImpl extends MinimalEObjectImpl.Container implements And
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
   * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditions()
   * @generated
   * @ordered
   */
  protected EList<Conditions> conditions;

  /**
   * The cached value of the '{@link #getSolution() <em>Solution</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSolution()
   * @generated
   * @ordered
   */
  protected EList<Solution> solution;

  /**
   * The default value of the '{@link #getState() <em>State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected static final State STATE_EDEFAULT = State.TRUE;

  /**
   * The cached value of the '{@link #getState() <em>State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected State state = STATE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AndImpl()
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
    return CPTesterPackage.Literals.AND;
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
      eNotify(new ENotificationImpl(this, Notification.SET, CPTesterPackage.AND__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Conditions> getConditions()
  {
    if (conditions == null)
    {
      conditions = new EObjectContainmentEList<Conditions>(Conditions.class, this, CPTesterPackage.AND__CONDITIONS);
    }
    return conditions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Solution> getSolution()
  {
    if (solution == null)
    {
      solution = new EObjectContainmentEList<Solution>(Solution.class, this, CPTesterPackage.AND__SOLUTION);
    }
    return solution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public State getState()
  {
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setState(State newState)
  {
    State oldState = state;
    state = newState == null ? STATE_EDEFAULT : newState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CPTesterPackage.AND__STATE, oldState, state));
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
      case CPTesterPackage.AND__CONDITIONS:
        return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
      case CPTesterPackage.AND__SOLUTION:
        return ((InternalEList<?>)getSolution()).basicRemove(otherEnd, msgs);
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
      case CPTesterPackage.AND__NAME:
        return getName();
      case CPTesterPackage.AND__CONDITIONS:
        return getConditions();
      case CPTesterPackage.AND__SOLUTION:
        return getSolution();
      case CPTesterPackage.AND__STATE:
        return getState();
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
      case CPTesterPackage.AND__NAME:
        setName((String)newValue);
        return;
      case CPTesterPackage.AND__CONDITIONS:
        getConditions().clear();
        getConditions().addAll((Collection<? extends Conditions>)newValue);
        return;
      case CPTesterPackage.AND__SOLUTION:
        getSolution().clear();
        getSolution().addAll((Collection<? extends Solution>)newValue);
        return;
      case CPTesterPackage.AND__STATE:
        setState((State)newValue);
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
      case CPTesterPackage.AND__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CPTesterPackage.AND__CONDITIONS:
        getConditions().clear();
        return;
      case CPTesterPackage.AND__SOLUTION:
        getSolution().clear();
        return;
      case CPTesterPackage.AND__STATE:
        setState(STATE_EDEFAULT);
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
      case CPTesterPackage.AND__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CPTesterPackage.AND__CONDITIONS:
        return conditions != null && !conditions.isEmpty();
      case CPTesterPackage.AND__SOLUTION:
        return solution != null && !solution.isEmpty();
      case CPTesterPackage.AND__STATE:
        return state != STATE_EDEFAULT;
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
    result.append(", state: ");
    result.append(state);
    result.append(')');
    return result.toString();
  }

} //AndImpl
