/**
 * generated by Xtext 2.26.0
 */
package org.xtext.operations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operational Arm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.operations.OperationalArm#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.operations.OperationalArm#getTIME <em>TIME</em>}</li>
 *   <li>{@link org.xtext.operations.OperationalArm#getEND <em>END</em>}</li>
 * </ul>
 *
 * @see org.xtext.operations.OperationsPackage#getOperationalArm()
 * @model
 * @generated
 */
public interface OperationalArm extends Initial
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.operations.OperationsPackage#getOperationalArm_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.operations.OperationalArm#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>TIME</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>TIME</em>' containment reference.
   * @see #setTIME(time)
   * @see org.xtext.operations.OperationsPackage#getOperationalArm_TIME()
   * @model containment="true"
   * @generated
   */
  time getTIME();

  /**
   * Sets the value of the '{@link org.xtext.operations.OperationalArm#getTIME <em>TIME</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TIME</em>' containment reference.
   * @see #getTIME()
   * @generated
   */
  void setTIME(time value);

  /**
   * Returns the value of the '<em><b>END</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>END</em>' attribute.
   * @see #setEND(String)
   * @see org.xtext.operations.OperationsPackage#getOperationalArm_END()
   * @model
   * @generated
   */
  String getEND();

  /**
   * Sets the value of the '{@link org.xtext.operations.OperationalArm#getEND <em>END</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>END</em>' attribute.
   * @see #getEND()
   * @generated
   */
  void setEND(String value);

} // OperationalArm
