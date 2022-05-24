/**
 * generated by Xtext 2.26.0
 */
package org.xtext.solution;

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
 * @see org.xtext.solution.SolutionFactory
 * @model kind="package"
 * @generated
 */
public interface SolutionPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "solution";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/Solution";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "solution";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SolutionPackage eINSTANCE = org.xtext.solution.impl.SolutionPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.solution.impl.SolutionImpl <em>Solution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.solution.impl.SolutionImpl
   * @see org.xtext.solution.impl.SolutionPackageImpl#getSolution()
   * @generated
   */
  int SOLUTION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOLUTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Angle res</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOLUTION__ANGLE_RES = 1;

  /**
   * The number of structural features of the '<em>Solution</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOLUTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.solution.impl.isAtSingleImpl <em>is At Single</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.solution.impl.isAtSingleImpl
   * @see org.xtext.solution.impl.SolutionPackageImpl#getisAtSingle()
   * @generated
   */
  int IS_AT_SINGLE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_AT_SINGLE__NAME = SOLUTION__NAME;

  /**
   * The feature id for the '<em><b>Angle res</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_AT_SINGLE__ANGLE_RES = SOLUTION__ANGLE_RES;

  /**
   * The feature id for the '<em><b>Servo</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_AT_SINGLE__SERVO = SOLUTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Angle</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_AT_SINGLE__ANGLE = SOLUTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>is At Single</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_AT_SINGLE_FEATURE_COUNT = SOLUTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.solution.impl.isAtImpl <em>is At</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.solution.impl.isAtImpl
   * @see org.xtext.solution.impl.SolutionPackageImpl#getisAt()
   * @generated
   */
  int IS_AT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_AT__NAME = SOLUTION__NAME;

  /**
   * The feature id for the '<em><b>Angle res</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_AT__ANGLE_RES = SOLUTION__ANGLE_RES;

  /**
   * The feature id for the '<em><b>Angle1</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_AT__ANGLE1 = SOLUTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Angle2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_AT__ANGLE2 = SOLUTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Angle3</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_AT__ANGLE3 = SOLUTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Angle4</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_AT__ANGLE4 = SOLUTION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Angle5</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_AT__ANGLE5 = SOLUTION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Angle6</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_AT__ANGLE6 = SOLUTION_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>is At</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_AT_FEATURE_COUNT = SOLUTION_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.xtext.solution.impl.Angle_resImpl <em>Angle res</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.solution.impl.Angle_resImpl
   * @see org.xtext.solution.impl.SolutionPackageImpl#getAngle_res()
   * @generated
   */
  int ANGLE_RES = 3;

  /**
   * The feature id for the '<em><b>Angle res</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANGLE_RES__ANGLE_RES = 0;

  /**
   * The number of structural features of the '<em>Angle res</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANGLE_RES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.solution.impl.AngleImpl <em>Angle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.solution.impl.AngleImpl
   * @see org.xtext.solution.impl.SolutionPackageImpl#getAngle()
   * @generated
   */
  int ANGLE = 4;

  /**
   * The feature id for the '<em><b>Angle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANGLE__ANGLE = 0;

  /**
   * The number of structural features of the '<em>Angle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANGLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.solution.impl.TimeImpl <em>Time</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.solution.impl.TimeImpl
   * @see org.xtext.solution.impl.SolutionPackageImpl#getTime()
   * @generated
   */
  int TIME = 5;

  /**
   * The feature id for the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME__TIME = 0;

  /**
   * The number of structural features of the '<em>Time</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.solution.impl.ServoImpl <em>Servo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.solution.impl.ServoImpl
   * @see org.xtext.solution.impl.SolutionPackageImpl#getServo()
   * @generated
   */
  int SERVO = 6;

  /**
   * The feature id for the '<em><b>Servo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVO__SERVO = 0;

  /**
   * The number of structural features of the '<em>Servo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVO_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.solution.Solution <em>Solution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Solution</em>'.
   * @see org.xtext.solution.Solution
   * @generated
   */
  EClass getSolution();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.solution.Solution#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.solution.Solution#getName()
   * @see #getSolution()
   * @generated
   */
  EAttribute getSolution_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.solution.Solution#getAngle_res <em>Angle res</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Angle res</em>'.
   * @see org.xtext.solution.Solution#getAngle_res()
   * @see #getSolution()
   * @generated
   */
  EReference getSolution_Angle_res();

  /**
   * Returns the meta object for class '{@link org.xtext.solution.isAtSingle <em>is At Single</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>is At Single</em>'.
   * @see org.xtext.solution.isAtSingle
   * @generated
   */
  EClass getisAtSingle();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.solution.isAtSingle#getServo <em>Servo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Servo</em>'.
   * @see org.xtext.solution.isAtSingle#getServo()
   * @see #getisAtSingle()
   * @generated
   */
  EReference getisAtSingle_Servo();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.solution.isAtSingle#getAngle <em>Angle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Angle</em>'.
   * @see org.xtext.solution.isAtSingle#getAngle()
   * @see #getisAtSingle()
   * @generated
   */
  EReference getisAtSingle_Angle();

  /**
   * Returns the meta object for class '{@link org.xtext.solution.isAt <em>is At</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>is At</em>'.
   * @see org.xtext.solution.isAt
   * @generated
   */
  EClass getisAt();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.solution.isAt#getAngle1 <em>Angle1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Angle1</em>'.
   * @see org.xtext.solution.isAt#getAngle1()
   * @see #getisAt()
   * @generated
   */
  EReference getisAt_Angle1();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.solution.isAt#getAngle2 <em>Angle2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Angle2</em>'.
   * @see org.xtext.solution.isAt#getAngle2()
   * @see #getisAt()
   * @generated
   */
  EReference getisAt_Angle2();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.solution.isAt#getAngle3 <em>Angle3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Angle3</em>'.
   * @see org.xtext.solution.isAt#getAngle3()
   * @see #getisAt()
   * @generated
   */
  EReference getisAt_Angle3();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.solution.isAt#getAngle4 <em>Angle4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Angle4</em>'.
   * @see org.xtext.solution.isAt#getAngle4()
   * @see #getisAt()
   * @generated
   */
  EReference getisAt_Angle4();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.solution.isAt#getAngle5 <em>Angle5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Angle5</em>'.
   * @see org.xtext.solution.isAt#getAngle5()
   * @see #getisAt()
   * @generated
   */
  EReference getisAt_Angle5();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.solution.isAt#getAngle6 <em>Angle6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Angle6</em>'.
   * @see org.xtext.solution.isAt#getAngle6()
   * @see #getisAt()
   * @generated
   */
  EReference getisAt_Angle6();

  /**
   * Returns the meta object for class '{@link org.xtext.solution.Angle_res <em>Angle res</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Angle res</em>'.
   * @see org.xtext.solution.Angle_res
   * @generated
   */
  EClass getAngle_res();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.solution.Angle_res#getAngle_res <em>Angle res</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Angle res</em>'.
   * @see org.xtext.solution.Angle_res#getAngle_res()
   * @see #getAngle_res()
   * @generated
   */
  EAttribute getAngle_res_Angle_res();

  /**
   * Returns the meta object for class '{@link org.xtext.solution.Angle <em>Angle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Angle</em>'.
   * @see org.xtext.solution.Angle
   * @generated
   */
  EClass getAngle();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.solution.Angle#getAngle <em>Angle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Angle</em>'.
   * @see org.xtext.solution.Angle#getAngle()
   * @see #getAngle()
   * @generated
   */
  EAttribute getAngle_Angle();

  /**
   * Returns the meta object for class '{@link org.xtext.solution.Time <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Time</em>'.
   * @see org.xtext.solution.Time
   * @generated
   */
  EClass getTime();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.solution.Time#getTime <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time</em>'.
   * @see org.xtext.solution.Time#getTime()
   * @see #getTime()
   * @generated
   */
  EAttribute getTime_Time();

  /**
   * Returns the meta object for class '{@link org.xtext.solution.Servo <em>Servo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Servo</em>'.
   * @see org.xtext.solution.Servo
   * @generated
   */
  EClass getServo();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.solution.Servo#getServo <em>Servo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Servo</em>'.
   * @see org.xtext.solution.Servo#getServo()
   * @see #getServo()
   * @generated
   */
  EAttribute getServo_Servo();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SolutionFactory getSolutionFactory();

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
     * The meta object literal for the '{@link org.xtext.solution.impl.SolutionImpl <em>Solution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.solution.impl.SolutionImpl
     * @see org.xtext.solution.impl.SolutionPackageImpl#getSolution()
     * @generated
     */
    EClass SOLUTION = eINSTANCE.getSolution();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOLUTION__NAME = eINSTANCE.getSolution_Name();

    /**
     * The meta object literal for the '<em><b>Angle res</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOLUTION__ANGLE_RES = eINSTANCE.getSolution_Angle_res();

    /**
     * The meta object literal for the '{@link org.xtext.solution.impl.isAtSingleImpl <em>is At Single</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.solution.impl.isAtSingleImpl
     * @see org.xtext.solution.impl.SolutionPackageImpl#getisAtSingle()
     * @generated
     */
    EClass IS_AT_SINGLE = eINSTANCE.getisAtSingle();

    /**
     * The meta object literal for the '<em><b>Servo</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IS_AT_SINGLE__SERVO = eINSTANCE.getisAtSingle_Servo();

    /**
     * The meta object literal for the '<em><b>Angle</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IS_AT_SINGLE__ANGLE = eINSTANCE.getisAtSingle_Angle();

    /**
     * The meta object literal for the '{@link org.xtext.solution.impl.isAtImpl <em>is At</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.solution.impl.isAtImpl
     * @see org.xtext.solution.impl.SolutionPackageImpl#getisAt()
     * @generated
     */
    EClass IS_AT = eINSTANCE.getisAt();

    /**
     * The meta object literal for the '<em><b>Angle1</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IS_AT__ANGLE1 = eINSTANCE.getisAt_Angle1();

    /**
     * The meta object literal for the '<em><b>Angle2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IS_AT__ANGLE2 = eINSTANCE.getisAt_Angle2();

    /**
     * The meta object literal for the '<em><b>Angle3</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IS_AT__ANGLE3 = eINSTANCE.getisAt_Angle3();

    /**
     * The meta object literal for the '<em><b>Angle4</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IS_AT__ANGLE4 = eINSTANCE.getisAt_Angle4();

    /**
     * The meta object literal for the '<em><b>Angle5</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IS_AT__ANGLE5 = eINSTANCE.getisAt_Angle5();

    /**
     * The meta object literal for the '<em><b>Angle6</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IS_AT__ANGLE6 = eINSTANCE.getisAt_Angle6();

    /**
     * The meta object literal for the '{@link org.xtext.solution.impl.Angle_resImpl <em>Angle res</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.solution.impl.Angle_resImpl
     * @see org.xtext.solution.impl.SolutionPackageImpl#getAngle_res()
     * @generated
     */
    EClass ANGLE_RES = eINSTANCE.getAngle_res();

    /**
     * The meta object literal for the '<em><b>Angle res</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANGLE_RES__ANGLE_RES = eINSTANCE.getAngle_res_Angle_res();

    /**
     * The meta object literal for the '{@link org.xtext.solution.impl.AngleImpl <em>Angle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.solution.impl.AngleImpl
     * @see org.xtext.solution.impl.SolutionPackageImpl#getAngle()
     * @generated
     */
    EClass ANGLE = eINSTANCE.getAngle();

    /**
     * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANGLE__ANGLE = eINSTANCE.getAngle_Angle();

    /**
     * The meta object literal for the '{@link org.xtext.solution.impl.TimeImpl <em>Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.solution.impl.TimeImpl
     * @see org.xtext.solution.impl.SolutionPackageImpl#getTime()
     * @generated
     */
    EClass TIME = eINSTANCE.getTime();

    /**
     * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME__TIME = eINSTANCE.getTime_Time();

    /**
     * The meta object literal for the '{@link org.xtext.solution.impl.ServoImpl <em>Servo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.solution.impl.ServoImpl
     * @see org.xtext.solution.impl.SolutionPackageImpl#getServo()
     * @generated
     */
    EClass SERVO = eINSTANCE.getServo();

    /**
     * The meta object literal for the '<em><b>Servo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVO__SERVO = eINSTANCE.getServo_Servo();

  }

} //SolutionPackage
