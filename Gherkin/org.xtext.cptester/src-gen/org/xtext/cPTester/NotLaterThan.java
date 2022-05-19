/**
 * generated by Xtext 2.26.0
 */
package org.xtext.cPTester;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Later Than</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.cPTester.NotLaterThan#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see org.xtext.cPTester.CPTesterPackage#getNotLaterThan()
 * @model
 * @generated
 */
public interface NotLaterThan extends Conditions
{
  /**
   * Returns the value of the '<em><b>Time</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.cPTester.Time}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' containment reference list.
   * @see org.xtext.cPTester.CPTesterPackage#getNotLaterThan_Time()
   * @model containment="true"
   * @generated
   */
  EList<Time> getTime();

} // NotLaterThan
