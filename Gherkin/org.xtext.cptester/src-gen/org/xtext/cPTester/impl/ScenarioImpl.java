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

import org.xtext.cPTester.And;
import org.xtext.cPTester.CPTesterPackage;
import org.xtext.cPTester.Given;
import org.xtext.cPTester.Scenario;
import org.xtext.cPTester.Then;
import org.xtext.cPTester.When;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.cPTester.impl.ScenarioImpl#getSurname <em>Surname</em>}</li>
 *   <li>{@link org.xtext.cPTester.impl.ScenarioImpl#getGiven <em>Given</em>}</li>
 *   <li>{@link org.xtext.cPTester.impl.ScenarioImpl#getWhen <em>When</em>}</li>
 *   <li>{@link org.xtext.cPTester.impl.ScenarioImpl#getThen <em>Then</em>}</li>
 *   <li>{@link org.xtext.cPTester.impl.ScenarioImpl#getAnd <em>And</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends MinimalEObjectImpl.Container implements Scenario
{
  /**
   * The default value of the '{@link #getSurname() <em>Surname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSurname()
   * @generated
   * @ordered
   */
  protected static final String SURNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSurname() <em>Surname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSurname()
   * @generated
   * @ordered
   */
  protected String surname = SURNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getGiven() <em>Given</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGiven()
   * @generated
   * @ordered
   */
  protected Given given;

  /**
   * The cached value of the '{@link #getWhen() <em>When</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhen()
   * @generated
   * @ordered
   */
  protected When when;

  /**
   * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThen()
   * @generated
   * @ordered
   */
  protected Then then;

  /**
   * The cached value of the '{@link #getAnd() <em>And</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnd()
   * @generated
   * @ordered
   */
  protected And and;

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
  public String getSurname()
  {
    return surname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSurname(String newSurname)
  {
    String oldSurname = surname;
    surname = newSurname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CPTesterPackage.SCENARIO__SURNAME, oldSurname, surname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Given getGiven()
  {
    return given;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGiven(Given newGiven, NotificationChain msgs)
  {
    Given oldGiven = given;
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
  public void setGiven(Given newGiven)
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
  public When getWhen()
  {
    return when;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhen(When newWhen, NotificationChain msgs)
  {
    When oldWhen = when;
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
  public void setWhen(When newWhen)
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
  public Then getThen()
  {
    return then;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThen(Then newThen, NotificationChain msgs)
  {
    Then oldThen = then;
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
  public void setThen(Then newThen)
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
  public And getAnd()
  {
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnd(And newAnd, NotificationChain msgs)
  {
    And oldAnd = and;
    and = newAnd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CPTesterPackage.SCENARIO__AND, oldAnd, newAnd);
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
  public void setAnd(And newAnd)
  {
    if (newAnd != and)
    {
      NotificationChain msgs = null;
      if (and != null)
        msgs = ((InternalEObject)and).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CPTesterPackage.SCENARIO__AND, null, msgs);
      if (newAnd != null)
        msgs = ((InternalEObject)newAnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CPTesterPackage.SCENARIO__AND, null, msgs);
      msgs = basicSetAnd(newAnd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CPTesterPackage.SCENARIO__AND, newAnd, newAnd));
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
      case CPTesterPackage.SCENARIO__GIVEN:
        return basicSetGiven(null, msgs);
      case CPTesterPackage.SCENARIO__WHEN:
        return basicSetWhen(null, msgs);
      case CPTesterPackage.SCENARIO__THEN:
        return basicSetThen(null, msgs);
      case CPTesterPackage.SCENARIO__AND:
        return basicSetAnd(null, msgs);
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
      case CPTesterPackage.SCENARIO__SURNAME:
        return getSurname();
      case CPTesterPackage.SCENARIO__GIVEN:
        return getGiven();
      case CPTesterPackage.SCENARIO__WHEN:
        return getWhen();
      case CPTesterPackage.SCENARIO__THEN:
        return getThen();
      case CPTesterPackage.SCENARIO__AND:
        return getAnd();
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
      case CPTesterPackage.SCENARIO__SURNAME:
        setSurname((String)newValue);
        return;
      case CPTesterPackage.SCENARIO__GIVEN:
        setGiven((Given)newValue);
        return;
      case CPTesterPackage.SCENARIO__WHEN:
        setWhen((When)newValue);
        return;
      case CPTesterPackage.SCENARIO__THEN:
        setThen((Then)newValue);
        return;
      case CPTesterPackage.SCENARIO__AND:
        setAnd((And)newValue);
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
      case CPTesterPackage.SCENARIO__SURNAME:
        setSurname(SURNAME_EDEFAULT);
        return;
      case CPTesterPackage.SCENARIO__GIVEN:
        setGiven((Given)null);
        return;
      case CPTesterPackage.SCENARIO__WHEN:
        setWhen((When)null);
        return;
      case CPTesterPackage.SCENARIO__THEN:
        setThen((Then)null);
        return;
      case CPTesterPackage.SCENARIO__AND:
        setAnd((And)null);
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
      case CPTesterPackage.SCENARIO__SURNAME:
        return SURNAME_EDEFAULT == null ? surname != null : !SURNAME_EDEFAULT.equals(surname);
      case CPTesterPackage.SCENARIO__GIVEN:
        return given != null;
      case CPTesterPackage.SCENARIO__WHEN:
        return when != null;
      case CPTesterPackage.SCENARIO__THEN:
        return then != null;
      case CPTesterPackage.SCENARIO__AND:
        return and != null;
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
    result.append(" (surname: ");
    result.append(surname);
    result.append(')');
    return result.toString();
  }

} //ScenarioImpl
