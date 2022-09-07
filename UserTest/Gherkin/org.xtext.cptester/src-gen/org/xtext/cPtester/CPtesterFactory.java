/**
 * generated by Xtext 2.26.0
 */
package org.xtext.cPtester;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.cPtester.CPtesterPackage
 * @generated
 */
public interface CPtesterFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CPtesterFactory eINSTANCE = org.xtext.cPtester.impl.CPtesterFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Scenario</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scenario</em>'.
   * @generated
   */
  Scenario createScenario();

  /**
   * Returns a new object of class '<em>Given</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Given</em>'.
   * @generated
   */
  Given createGiven();

  /**
   * Returns a new object of class '<em>And When</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And When</em>'.
   * @generated
   */
  AndWhen createAndWhen();

  /**
   * Returns a new object of class '<em>When</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>When</em>'.
   * @generated
   */
  When createWhen();

  /**
   * Returns a new object of class '<em>Then</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Then</em>'.
   * @generated
   */
  Then createThen();

  /**
   * Returns a new object of class '<em>And</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And</em>'.
   * @generated
   */
  And createAnd();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CPtesterPackage getCPtesterPackage();

} //CPtesterFactory