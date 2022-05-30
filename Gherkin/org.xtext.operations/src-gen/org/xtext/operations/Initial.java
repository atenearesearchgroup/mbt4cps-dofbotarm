/**
 * generated by Xtext 2.26.0
 */
package org.xtext.operations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initial</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.operations.Initial#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.operations.Initial#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see org.xtext.operations.OperationsPackage#getInitial()
 * @model
 * @generated
 */
public interface Initial extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.operations.OperationsPackage#getInitial_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.operations.Initial#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Time</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.operations.Time}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' containment reference list.
   * @see org.xtext.operations.OperationsPackage#getInitial_Time()
   * @model containment="true"
   * @generated
   */
  EList<Time> getTime();

} // Initial
