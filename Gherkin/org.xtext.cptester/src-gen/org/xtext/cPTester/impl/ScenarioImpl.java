/**
 * generated by Xtext 2.26.0
 */
package org.xtext.cPTester.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.cPTester.CPTesterPackage;
import org.xtext.cPTester.Scenario;

import org.xtext.operations.Operation;
import org.xtext.operations.Result;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.cPTester.impl.ScenarioImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.cPTester.impl.ScenarioImpl#getWhen <em>When</em>}</li>
 *   <li>{@link org.xtext.cPTester.impl.ScenarioImpl#getGiven <em>Given</em>}</li>
 *   <li>{@link org.xtext.cPTester.impl.ScenarioImpl#getThen <em>Then</em>}</li>
 *   <li>{@link org.xtext.cPTester.impl.ScenarioImpl#getAnd1 <em>And1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends MinimalEObjectImpl.Container implements Scenario
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
   * The cached value of the '{@link #getWhen() <em>When</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhen()
   * @generated
   * @ordered
   */
  protected Operation when;

  /**
   * The cached value of the '{@link #getGiven() <em>Given</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGiven()
   * @generated
   * @ordered
   */
  protected Operation given;

  /**
   * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThen()
   * @generated
   * @ordered
   */
  protected Result then;

  /**
   * The cached value of the '{@link #getAnd1() <em>And1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnd1()
   * @generated
   * @ordered
   */
  protected Operation and1;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScenarioImpl()
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
    return CPTesterPackage.Literals.SCENARIO;
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
      eNotify(new ENotificationImpl(this, Notification.SET, CPTesterPackage.SCENARIO__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Operation getWhen()
  {
    return when;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhen(Operation newWhen, NotificationChain msgs)
  {
    Operation oldWhen = when;
    when = newWhen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPTesterPackage.SCENARIO__WHEN, oldWhen, newWhen);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setWhen(Operation newWhen)
  {
    if (newWhen != when)
    {
      NotificationChain msgs = null;
      if (when != null)
        msgs = ((InternalEObject)when).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CPTesterPackage.SCENARIO__WHEN, null, msgs);
      if (newWhen != null)
        msgs = ((InternalEObject)newWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CPTesterPackage.SCENARIO__WHEN, null, msgs);
      msgs = basicSetWhen(newWhen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CPTesterPackage.SCENARIO__WHEN, newWhen, newWhen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Operation getGiven()
  {
    return given;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGiven(Operation newGiven, NotificationChain msgs)
  {
    Operation oldGiven = given;
    given = newGiven;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPTesterPackage.SCENARIO__GIVEN, oldGiven, newGiven);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGiven(Operation newGiven)
  {
    if (newGiven != given)
    {
      NotificationChain msgs = null;
      if (given != null)
        msgs = ((InternalEObject)given).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CPTesterPackage.SCENARIO__GIVEN, null, msgs);
      if (newGiven != null)
        msgs = ((InternalEObject)newGiven).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CPTesterPackage.SCENARIO__GIVEN, null, msgs);
      msgs = basicSetGiven(newGiven, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CPTesterPackage.SCENARIO__GIVEN, newGiven, newGiven));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Result getThen()
  {
    return then;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThen(Result newThen, NotificationChain msgs)
  {
    Result oldThen = then;
    then = newThen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPTesterPackage.SCENARIO__THEN, oldThen, newThen);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setThen(Result newThen)
  {
    if (newThen != then)
    {
      NotificationChain msgs = null;
      if (then != null)
        msgs = ((InternalEObject)then).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CPTesterPackage.SCENARIO__THEN, null, msgs);
      if (newThen != null)
        msgs = ((InternalEObject)newThen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CPTesterPackage.SCENARIO__THEN, null, msgs);
      msgs = basicSetThen(newThen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CPTesterPackage.SCENARIO__THEN, newThen, newThen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Operation getAnd1()
  {
    return and1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnd1(Operation newAnd1, NotificationChain msgs)
  {
    Operation oldAnd1 = and1;
    and1 = newAnd1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPTesterPackage.SCENARIO__AND1, oldAnd1, newAnd1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAnd1(Operation newAnd1)
  {
    if (newAnd1 != and1)
    {
      NotificationChain msgs = null;
      if (and1 != null)
        msgs = ((InternalEObject)and1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CPTesterPackage.SCENARIO__AND1, null, msgs);
      if (newAnd1 != null)
        msgs = ((InternalEObject)newAnd1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CPTesterPackage.SCENARIO__AND1, null, msgs);
      msgs = basicSetAnd1(newAnd1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CPTesterPackage.SCENARIO__AND1, newAnd1, newAnd1));
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
      case CPTesterPackage.SCENARIO__WHEN:
        return basicSetWhen(null, msgs);
      case CPTesterPackage.SCENARIO__GIVEN:
        return basicSetGiven(null, msgs);
      case CPTesterPackage.SCENARIO__THEN:
        return basicSetThen(null, msgs);
      case CPTesterPackage.SCENARIO__AND1:
        return basicSetAnd1(null, msgs);
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
      case CPTesterPackage.SCENARIO__NAME:
        return getName();
      case CPTesterPackage.SCENARIO__WHEN:
        return getWhen();
      case CPTesterPackage.SCENARIO__GIVEN:
        return getGiven();
      case CPTesterPackage.SCENARIO__THEN:
        return getThen();
      case CPTesterPackage.SCENARIO__AND1:
        return getAnd1();
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
      case CPTesterPackage.SCENARIO__NAME:
        setName((String)newValue);
        return;
      case CPTesterPackage.SCENARIO__WHEN:
        setWhen((Operation)newValue);
        return;
      case CPTesterPackage.SCENARIO__GIVEN:
        setGiven((Operation)newValue);
        return;
      case CPTesterPackage.SCENARIO__THEN:
        setThen((Result)newValue);
        return;
      case CPTesterPackage.SCENARIO__AND1:
        setAnd1((Operation)newValue);
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
      case CPTesterPackage.SCENARIO__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CPTesterPackage.SCENARIO__WHEN:
        setWhen((Operation)null);
        return;
      case CPTesterPackage.SCENARIO__GIVEN:
        setGiven((Operation)null);
        return;
      case CPTesterPackage.SCENARIO__THEN:
        setThen((Result)null);
        return;
      case CPTesterPackage.SCENARIO__AND1:
        setAnd1((Operation)null);
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
      case CPTesterPackage.SCENARIO__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CPTesterPackage.SCENARIO__WHEN:
        return when != null;
      case CPTesterPackage.SCENARIO__GIVEN:
        return given != null;
      case CPTesterPackage.SCENARIO__THEN:
        return then != null;
      case CPTesterPackage.SCENARIO__AND1:
        return and1 != null;
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
    result.append(')');
    return result.toString();
  }

} //ScenarioImpl