/**
 * generated by Xtext 2.26.0
 */
package org.xtext.operations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.operations.OperationsFactory
 * @model kind="package"
 * @generated
 */
public interface OperationsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "operations";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/Operations";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "operations";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OperationsPackage eINSTANCE = org.xtext.operations.impl.OperationsPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.operations.impl.PruebaImpl <em>Prueba</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.operations.impl.PruebaImpl
   * @see org.xtext.operations.impl.OperationsPackageImpl#getPrueba()
   * @generated
   */
  int PRUEBA = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRUEBA__NAME = 0;

  /**
   * The number of structural features of the '<em>Prueba</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRUEBA_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.operations.Prueba <em>Prueba</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prueba</em>'.
   * @see org.xtext.operations.Prueba
   * @generated
   */
  EClass getPrueba();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.operations.Prueba#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.operations.Prueba#getName()
   * @see #getPrueba()
   * @generated
   */
  EAttribute getPrueba_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  OperationsFactory getOperationsFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.operations.impl.PruebaImpl <em>Prueba</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.operations.impl.PruebaImpl
     * @see org.xtext.operations.impl.OperationsPackageImpl#getPrueba()
     * @generated
     */
    EClass PRUEBA = eINSTANCE.getPrueba();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRUEBA__NAME = eINSTANCE.getPrueba_Name();

  }

} //OperationsPackage
