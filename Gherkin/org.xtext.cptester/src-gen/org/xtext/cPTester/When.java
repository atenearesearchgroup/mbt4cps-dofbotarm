/**
 * generated by Xtext 2.26.0
 */
package org.xtext.cPTester;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.xtext.command.Command;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.cPTester.When#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.cPTester.When#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @see org.xtext.cPTester.CPTesterPackage#getWhen()
 * @model
 * @generated
 */
public interface When extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.cPTester.CPTesterPackage#getWhen_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.cPTester.When#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Command</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.command.Command}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Command</em>' containment reference list.
   * @see org.xtext.cPTester.CPTesterPackage#getWhen_Command()
   * @model containment="true"
   * @generated
   */
  EList<Command> getCommand();

} // When
