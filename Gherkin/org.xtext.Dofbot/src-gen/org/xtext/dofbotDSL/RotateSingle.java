/**
 * generated by Xtext 2.26.0
 */
package org.xtext.dofbotDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotate Single</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.dofbotDSL.RotateSingle#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.dofbotDSL.RotateSingle#getServo <em>Servo</em>}</li>
 *   <li>{@link org.xtext.dofbotDSL.RotateSingle#getAngle <em>Angle</em>}</li>
 *   <li>{@link org.xtext.dofbotDSL.RotateSingle#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see org.xtext.dofbotDSL.DofbotDSLPackage#getRotateSingle()
 * @model
 * @generated
 */
public interface RotateSingle extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.dofbotDSL.DofbotDSLPackage#getRotateSingle_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.dofbotDSL.RotateSingle#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Servo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Servo</em>' containment reference.
   * @see #setServo(Servos)
   * @see org.xtext.dofbotDSL.DofbotDSLPackage#getRotateSingle_Servo()
   * @model containment="true"
   * @generated
   */
  Servos getServo();

  /**
   * Sets the value of the '{@link org.xtext.dofbotDSL.RotateSingle#getServo <em>Servo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Servo</em>' containment reference.
   * @see #getServo()
   * @generated
   */
  void setServo(Servos value);

  /**
   * Returns the value of the '<em><b>Angle</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Angle</em>' containment reference.
   * @see #setAngle(Angles)
   * @see org.xtext.dofbotDSL.DofbotDSLPackage#getRotateSingle_Angle()
   * @model containment="true"
   * @generated
   */
  Angles getAngle();

  /**
   * Sets the value of the '{@link org.xtext.dofbotDSL.RotateSingle#getAngle <em>Angle</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Angle</em>' containment reference.
   * @see #getAngle()
   * @generated
   */
  void setAngle(Angles value);

  /**
   * Returns the value of the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' attribute.
   * @see #setTime(int)
   * @see org.xtext.dofbotDSL.DofbotDSLPackage#getRotateSingle_Time()
   * @model
   * @generated
   */
  int getTime();

  /**
   * Sets the value of the '{@link org.xtext.dofbotDSL.RotateSingle#getTime <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' attribute.
   * @see #getTime()
   * @generated
   */
  void setTime(int value);

} // RotateSingle
