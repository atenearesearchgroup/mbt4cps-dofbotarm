/**
 * generated by Xtext 2.26.0
 */
package org.xtext.operations.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.operations.NotLaterThan;
import org.xtext.operations.OperationsPackage;
import org.xtext.operations.time;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Later Than</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.operations.impl.NotLaterThanImpl#getTIME <em>TIME</em>}</li>
 *   <li>{@link org.xtext.operations.impl.NotLaterThanImpl#getSEP <em>SEP</em>}</li>
 *   <li>{@link org.xtext.operations.impl.NotLaterThanImpl#getQUERY <em>QUERY</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotLaterThanImpl extends ConditionsImpl implements NotLaterThan
{
  /**
   * The cached value of the '{@link #getTIME() <em>TIME</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTIME()
   * @generated
   * @ordered
   */
  protected time time;

  /**
   * The default value of the '{@link #getSEP() <em>SEP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSEP()
   * @generated
   * @ordered
   */
  protected static final String SEP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSEP() <em>SEP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSEP()
   * @generated
   * @ordered
   */
  protected String sep = SEP_EDEFAULT;

  /**
   * The default value of the '{@link #getQUERY() <em>QUERY</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQUERY()
   * @generated
   * @ordered
   */
  protected static final String QUERY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQUERY() <em>QUERY</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQUERY()
   * @generated
   * @ordered
   */
  protected String query = QUERY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NotLaterThanImpl()
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
    return OperationsPackage.Literals.NOT_LATER_THAN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public time getTIME()
  {
    return time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTIME(time newTIME, NotificationChain msgs)
  {
    time oldTIME = time;
    time = newTIME;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OperationsPackage.NOT_LATER_THAN__TIME, oldTIME, newTIME);
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
  public void setTIME(time newTIME)
  {
    if (newTIME != time)
    {
      NotificationChain msgs = null;
      if (time != null)
        msgs = ((InternalEObject)time).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OperationsPackage.NOT_LATER_THAN__TIME, null, msgs);
      if (newTIME != null)
        msgs = ((InternalEObject)newTIME).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OperationsPackage.NOT_LATER_THAN__TIME, null, msgs);
      msgs = basicSetTIME(newTIME, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.NOT_LATER_THAN__TIME, newTIME, newTIME));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSEP()
  {
    return sep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSEP(String newSEP)
  {
    String oldSEP = sep;
    sep = newSEP;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.NOT_LATER_THAN__SEP, oldSEP, sep));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getQUERY()
  {
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setQUERY(String newQUERY)
  {
    String oldQUERY = query;
    query = newQUERY;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.NOT_LATER_THAN__QUERY, oldQUERY, query));
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
      case OperationsPackage.NOT_LATER_THAN__TIME:
        return basicSetTIME(null, msgs);
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
      case OperationsPackage.NOT_LATER_THAN__TIME:
        return getTIME();
      case OperationsPackage.NOT_LATER_THAN__SEP:
        return getSEP();
      case OperationsPackage.NOT_LATER_THAN__QUERY:
        return getQUERY();
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
      case OperationsPackage.NOT_LATER_THAN__TIME:
        setTIME((time)newValue);
        return;
      case OperationsPackage.NOT_LATER_THAN__SEP:
        setSEP((String)newValue);
        return;
      case OperationsPackage.NOT_LATER_THAN__QUERY:
        setQUERY((String)newValue);
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
      case OperationsPackage.NOT_LATER_THAN__TIME:
        setTIME((time)null);
        return;
      case OperationsPackage.NOT_LATER_THAN__SEP:
        setSEP(SEP_EDEFAULT);
        return;
      case OperationsPackage.NOT_LATER_THAN__QUERY:
        setQUERY(QUERY_EDEFAULT);
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
      case OperationsPackage.NOT_LATER_THAN__TIME:
        return time != null;
      case OperationsPackage.NOT_LATER_THAN__SEP:
        return SEP_EDEFAULT == null ? sep != null : !SEP_EDEFAULT.equals(sep);
      case OperationsPackage.NOT_LATER_THAN__QUERY:
        return QUERY_EDEFAULT == null ? query != null : !QUERY_EDEFAULT.equals(query);
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
    result.append(" (SEP: ");
    result.append(sep);
    result.append(", QUERY: ");
    result.append(query);
    result.append(')');
    return result.toString();
  }

} //NotLaterThanImpl
