/**
 * generated by Xtext 2.26.0
 */
package org.xtext.operations;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>read Servo Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.operations.readServoOperation#getServo <em>Servo</em>}</li>
 * </ul>
 *
 * @see org.xtext.operations.OperationsPackage#getreadServoOperation()
 * @model
 * @generated
 */
public interface readServoOperation extends Command
{
  /**
   * Returns the value of the '<em><b>Servo</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.operations.Servo}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Servo</em>' containment reference list.
   * @see org.xtext.operations.OperationsPackage#getreadServoOperation_Servo()
   * @model containment="true"
   * @generated
   */
  EList<Servo> getServo();

} // readServoOperation