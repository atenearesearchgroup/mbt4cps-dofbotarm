/**
 * generated by Xtext 2.26.0
 */
package org.xtext.cPTester;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.xtext.cPTester.CPTesterFactory
 * @model kind="package"
 * @generated
 */
public interface CPTesterPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "cPTester";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/CPTester";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "cPTester";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CPTesterPackage eINSTANCE = org.xtext.cPTester.impl.CPTesterPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.cPTester.impl.ScenarioImpl <em>Scenario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cPTester.impl.ScenarioImpl
   * @see org.xtext.cPTester.impl.CPTesterPackageImpl#getScenario()
   * @generated
   */
  int SCENARIO = 0;

  /**
   * The feature id for the '<em><b>Surname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__SURNAME = 0;

  /**
   * The feature id for the '<em><b>Given</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__GIVEN = 1;

  /**
   * The feature id for the '<em><b>When</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__WHEN = 2;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__THEN = 3;

  /**
   * The feature id for the '<em><b>And</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__AND = 4;

  /**
   * The number of structural features of the '<em>Scenario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.cPTester.impl.GivenImpl <em>Given</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cPTester.impl.GivenImpl
   * @see org.xtext.cPTester.impl.CPTesterPackageImpl#getGiven()
   * @generated
   */
  int GIVEN = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GIVEN__NAME = 0;

  /**
   * The feature id for the '<em><b>Initial</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GIVEN__INITIAL = 1;

  /**
   * The number of structural features of the '<em>Given</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GIVEN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.cPTester.impl.WhenImpl <em>When</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cPTester.impl.WhenImpl
   * @see org.xtext.cPTester.impl.CPTesterPackageImpl#getWhen()
   * @generated
   */
  int WHEN = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN__NAME = 0;

  /**
   * The feature id for the '<em><b>Command</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN__COMMAND = 1;

  /**
   * The number of structural features of the '<em>When</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.cPTester.impl.ThenImpl <em>Then</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cPTester.impl.ThenImpl
   * @see org.xtext.cPTester.impl.CPTesterPackageImpl#getThen()
   * @generated
   */
  int THEN = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN__NAME = 0;

  /**
   * The feature id for the '<em><b>Result</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN__RESULT = 1;

  /**
   * The number of structural features of the '<em>Then</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.cPTester.impl.AndImpl <em>And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cPTester.impl.AndImpl
   * @see org.xtext.cPTester.impl.CPTesterPackageImpl#getAnd()
   * @generated
   */
  int AND = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__NAME = 0;

  /**
   * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__CONDITIONS = 1;

  /**
   * The feature id for the '<em><b>Solution</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__SOLUTION = 2;

  /**
   * The number of structural features of the '<em>And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.xtext.cPTester.Scenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scenario</em>'.
   * @see org.xtext.cPTester.Scenario
   * @generated
   */
  EClass getScenario();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cPTester.Scenario#getSurname <em>Surname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Surname</em>'.
   * @see org.xtext.cPTester.Scenario#getSurname()
   * @see #getScenario()
   * @generated
   */
  EAttribute getScenario_Surname();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cPTester.Scenario#getGiven <em>Given</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Given</em>'.
   * @see org.xtext.cPTester.Scenario#getGiven()
   * @see #getScenario()
   * @generated
   */
  EReference getScenario_Given();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cPTester.Scenario#getWhen <em>When</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>When</em>'.
   * @see org.xtext.cPTester.Scenario#getWhen()
   * @see #getScenario()
   * @generated
   */
  EReference getScenario_When();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cPTester.Scenario#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see org.xtext.cPTester.Scenario#getThen()
   * @see #getScenario()
   * @generated
   */
  EReference getScenario_Then();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cPTester.Scenario#getAnd <em>And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>And</em>'.
   * @see org.xtext.cPTester.Scenario#getAnd()
   * @see #getScenario()
   * @generated
   */
  EReference getScenario_And();

  /**
   * Returns the meta object for class '{@link org.xtext.cPTester.Given <em>Given</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Given</em>'.
   * @see org.xtext.cPTester.Given
   * @generated
   */
  EClass getGiven();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cPTester.Given#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.cPTester.Given#getName()
   * @see #getGiven()
   * @generated
   */
  EAttribute getGiven_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.cPTester.Given#getInitial <em>Initial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Initial</em>'.
   * @see org.xtext.cPTester.Given#getInitial()
   * @see #getGiven()
   * @generated
   */
  EReference getGiven_Initial();

  /**
   * Returns the meta object for class '{@link org.xtext.cPTester.When <em>When</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When</em>'.
   * @see org.xtext.cPTester.When
   * @generated
   */
  EClass getWhen();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cPTester.When#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.cPTester.When#getName()
   * @see #getWhen()
   * @generated
   */
  EAttribute getWhen_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.cPTester.When#getCommand <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Command</em>'.
   * @see org.xtext.cPTester.When#getCommand()
   * @see #getWhen()
   * @generated
   */
  EReference getWhen_Command();

  /**
   * Returns the meta object for class '{@link org.xtext.cPTester.Then <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Then</em>'.
   * @see org.xtext.cPTester.Then
   * @generated
   */
  EClass getThen();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cPTester.Then#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.cPTester.Then#getName()
   * @see #getThen()
   * @generated
   */
  EAttribute getThen_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.cPTester.Then#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Result</em>'.
   * @see org.xtext.cPTester.Then#getResult()
   * @see #getThen()
   * @generated
   */
  EReference getThen_Result();

  /**
   * Returns the meta object for class '{@link org.xtext.cPTester.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And</em>'.
   * @see org.xtext.cPTester.And
   * @generated
   */
  EClass getAnd();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cPTester.And#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.cPTester.And#getName()
   * @see #getAnd()
   * @generated
   */
  EAttribute getAnd_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.cPTester.And#getConditions <em>Conditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Conditions</em>'.
   * @see org.xtext.cPTester.And#getConditions()
   * @see #getAnd()
   * @generated
   */
  EReference getAnd_Conditions();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.cPTester.And#getSolution <em>Solution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Solution</em>'.
   * @see org.xtext.cPTester.And#getSolution()
   * @see #getAnd()
   * @generated
   */
  EReference getAnd_Solution();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CPTesterFactory getCPTesterFactory();

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
     * The meta object literal for the '{@link org.xtext.cPTester.impl.ScenarioImpl <em>Scenario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cPTester.impl.ScenarioImpl
     * @see org.xtext.cPTester.impl.CPTesterPackageImpl#getScenario()
     * @generated
     */
    EClass SCENARIO = eINSTANCE.getScenario();

    /**
     * The meta object literal for the '<em><b>Surname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCENARIO__SURNAME = eINSTANCE.getScenario_Surname();

    /**
     * The meta object literal for the '<em><b>Given</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCENARIO__GIVEN = eINSTANCE.getScenario_Given();

    /**
     * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCENARIO__WHEN = eINSTANCE.getScenario_When();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCENARIO__THEN = eINSTANCE.getScenario_Then();

    /**
     * The meta object literal for the '<em><b>And</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCENARIO__AND = eINSTANCE.getScenario_And();

    /**
     * The meta object literal for the '{@link org.xtext.cPTester.impl.GivenImpl <em>Given</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cPTester.impl.GivenImpl
     * @see org.xtext.cPTester.impl.CPTesterPackageImpl#getGiven()
     * @generated
     */
    EClass GIVEN = eINSTANCE.getGiven();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GIVEN__NAME = eINSTANCE.getGiven_Name();

    /**
     * The meta object literal for the '<em><b>Initial</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GIVEN__INITIAL = eINSTANCE.getGiven_Initial();

    /**
     * The meta object literal for the '{@link org.xtext.cPTester.impl.WhenImpl <em>When</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cPTester.impl.WhenImpl
     * @see org.xtext.cPTester.impl.CPTesterPackageImpl#getWhen()
     * @generated
     */
    EClass WHEN = eINSTANCE.getWhen();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WHEN__NAME = eINSTANCE.getWhen_Name();

    /**
     * The meta object literal for the '<em><b>Command</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN__COMMAND = eINSTANCE.getWhen_Command();

    /**
     * The meta object literal for the '{@link org.xtext.cPTester.impl.ThenImpl <em>Then</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cPTester.impl.ThenImpl
     * @see org.xtext.cPTester.impl.CPTesterPackageImpl#getThen()
     * @generated
     */
    EClass THEN = eINSTANCE.getThen();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THEN__NAME = eINSTANCE.getThen_Name();

    /**
     * The meta object literal for the '<em><b>Result</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THEN__RESULT = eINSTANCE.getThen_Result();

    /**
     * The meta object literal for the '{@link org.xtext.cPTester.impl.AndImpl <em>And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cPTester.impl.AndImpl
     * @see org.xtext.cPTester.impl.CPTesterPackageImpl#getAnd()
     * @generated
     */
    EClass AND = eINSTANCE.getAnd();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AND__NAME = eINSTANCE.getAnd_Name();

    /**
     * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND__CONDITIONS = eINSTANCE.getAnd_Conditions();

    /**
     * The meta object literal for the '<em><b>Solution</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND__SOLUTION = eINSTANCE.getAnd_Solution();

  }

} //CPTesterPackage
