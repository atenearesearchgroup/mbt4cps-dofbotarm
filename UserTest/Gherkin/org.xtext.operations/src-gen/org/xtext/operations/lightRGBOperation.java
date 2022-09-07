/**
 * generated by Xtext 2.26.0
 */
package org.xtext.operations;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>light RGB Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.operations.lightRGBOperation#getR <em>R</em>}</li>
 *   <li>{@link org.xtext.operations.lightRGBOperation#getG <em>G</em>}</li>
 *   <li>{@link org.xtext.operations.lightRGBOperation#getB <em>B</em>}</li>
 * </ul>
 *
 * @see org.xtext.operations.OperationsPackage#getlightRGBOperation()
 * @model
 * @generated
 */
public interface lightRGBOperation extends Command
{
  /**
   * Returns the value of the '<em><b>R</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.operations.R}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>R</em>' containment reference list.
   * @see org.xtext.operations.OperationsPackage#getlightRGBOperation_R()
   * @model containment="true"
   * @generated
   */
  EList<R> getR();

  /**
   * Returns the value of the '<em><b>G</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.operations.G}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>G</em>' containment reference list.
   * @see org.xtext.operations.OperationsPackage#getlightRGBOperation_G()
   * @model containment="true"
   * @generated
   */
  EList<G> getG();

  /**
   * Returns the value of the '<em><b>B</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.operations.B}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>B</em>' containment reference list.
   * @see org.xtext.operations.OperationsPackage#getlightRGBOperation_B()
   * @model containment="true"
   * @generated
   */
  EList<B> getB();

} // lightRGBOperation
