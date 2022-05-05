/**
 * generated by Xtext 2.26.0
 */
package org.xtext.dofbotDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotate Multiple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.dofbotDSL.RotateMultiple#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.dofbotDSL.RotateMultiple#getAngle <em>Angle</em>}</li>
 *   <li>{@link org.xtext.dofbotDSL.RotateMultiple#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see org.xtext.dofbotDSL.DofbotDSLPackage#getRotateMultiple()
 * @model
 * @generated
 */
public interface RotateMultiple extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.dofbotDSL.DofbotDSLPackage#getRotateMultiple_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.dofbotDSL.RotateMultiple#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Angle</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.dofbotDSL.Angles}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Angle</em>' containment reference list.
   * @see org.xtext.dofbotDSL.DofbotDSLPackage#getRotateMultiple_Angle()
   * @model containment="true"
   * @generated
   */
  EList<Angles> getAngle();

  /**
   * Returns the value of the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' attribute.
   * @see #setTime(int)
   * @see org.xtext.dofbotDSL.DofbotDSLPackage#getRotateMultiple_Time()
   * @model
   * @generated
   */
  int getTime();

  /**
   * Sets the value of the '{@link org.xtext.dofbotDSL.RotateMultiple#getTime <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' attribute.
   * @see #getTime()
   * @generated
   */
  void setTime(int value);

} // RotateMultiple
