/**
 * generated by Xtext 2.26.0
 */
package org.xtext.operations;

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
   * The meta object id for the '{@link org.xtext.operations.impl.OperacionesImpl <em>Operaciones</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.operations.impl.OperacionesImpl
   * @see org.xtext.operations.impl.OperationsPackageImpl#getOperaciones()
   * @generated
   */
  int OPERACIONES = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERACIONES__NAME = 0;

  /**
   * The number of structural features of the '<em>Operaciones</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERACIONES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.operations.impl.InitialImpl <em>Initial</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.operations.impl.InitialImpl
   * @see org.xtext.operations.impl.OperationsPackageImpl#getInitial()
   * @generated
   */
  int INITIAL = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIAL__NAME = OPERACIONES__NAME;

  /**
   * The feature id for the '<em><b>Time</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIAL__TIME = OPERACIONES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Initial</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIAL_FEATURE_COUNT = OPERACIONES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.operations.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.operations.impl.CommandImpl
   * @see org.xtext.operations.impl.OperationsPackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__NAME = OPERACIONES__NAME;

  /**
   * The feature id for the '<em><b>Angle</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__ANGLE = OPERACIONES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Time</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__TIME = OPERACIONES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = OPERACIONES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.operations.impl.rotateServoImpl <em>rotate Servo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.operations.impl.rotateServoImpl
   * @see org.xtext.operations.impl.OperationsPackageImpl#getrotateServo()
   * @generated
   */
  int ROTATE_SERVO = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROTATE_SERVO__NAME = COMMAND__NAME;

  /**
   * The feature id for the '<em><b>Angle</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROTATE_SERVO__ANGLE = COMMAND__ANGLE;

  /**
   * The feature id for the '<em><b>Time</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROTATE_SERVO__TIME = COMMAND__TIME;

  /**
   * The feature id for the '<em><b>Servo</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROTATE_SERVO__SERVO = COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>rotate Servo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROTATE_SERVO_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.operations.impl.rotateAllServosImpl <em>rotate All Servos</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.operations.impl.rotateAllServosImpl
   * @see org.xtext.operations.impl.OperationsPackageImpl#getrotateAllServos()
   * @generated
   */
  int ROTATE_ALL_SERVOS = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROTATE_ALL_SERVOS__NAME = COMMAND__NAME;

  /**
   * The feature id for the '<em><b>Angle</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROTATE_ALL_SERVOS__ANGLE = COMMAND__ANGLE;

  /**
   * The feature id for the '<em><b>Time</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROTATE_ALL_SERVOS__TIME = COMMAND__TIME;

  /**
   * The number of structural features of the '<em>rotate All Servos</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROTATE_ALL_SERVOS_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.operations.impl.ResultImpl <em>Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.operations.impl.ResultImpl
   * @see org.xtext.operations.impl.OperationsPackageImpl#getResult()
   * @generated
   */
  int RESULT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT__NAME = OPERACIONES__NAME;

  /**
   * The feature id for the '<em><b>Time</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT__TIME = OPERACIONES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Result</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_FEATURE_COUNT = OPERACIONES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.operations.impl.SolutionImpl <em>Solution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.operations.impl.SolutionImpl
   * @see org.xtext.operations.impl.OperationsPackageImpl#getSolution()
   * @generated
   */
  int SOLUTION = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOLUTION__NAME = OPERACIONES__NAME;

  /**
   * The feature id for the '<em><b>Angle</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOLUTION__ANGLE = OPERACIONES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Angle res</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOLUTION__ANGLE_RES = OPERACIONES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Solution</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOLUTION_FEATURE_COUNT = OPERACIONES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.operations.impl.ConditionsImpl <em>Conditions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.operations.impl.ConditionsImpl
   * @see org.xtext.operations.impl.OperationsPackageImpl#getConditions()
   * @generated
   */
  int CONDITIONS = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONS__NAME = OPERACIONES__NAME;

  /**
   * The feature id for the '<em><b>Time</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONS__TIME = OPERACIONES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Conditions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONS_FEATURE_COUNT = OPERACIONES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.operations.impl.isAtSingleImpl <em>is At Single</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.operations.impl.isAtSingleImpl
   * @see org.xtext.operations.impl.OperationsPackageImpl#getisAtSingle()
   * @generated
   */
  int IS_AT_SINGLE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_AT_SINGLE__NAME = SOLUTION__NAME;

  /**
   * The feature id for the '<em><b>Angle</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_AT_SINGLE__ANGLE = SOLUTION__ANGLE;

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
   * The number of structural features of the '<em>is At Single</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_AT_SINGLE_FEATURE_COUNT = SOLUTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.operations.impl.isAtImpl <em>is At</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.operations.impl.isAtImpl
   * @see org.xtext.operations.impl.OperationsPackageImpl#getisAt()
   * @generated
   */
  int IS_AT = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_AT__NAME = SOLUTION__NAME;

  /**
   * The feature id for the '<em><b>Angle</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_AT__ANGLE = SOLUTION__ANGLE;

  /**
   * The feature id for the '<em><b>Angle res</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_AT__ANGLE_RES = SOLUTION__ANGLE_RES;

  /**
   * The number of structural features of the '<em>is At</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_AT_FEATURE_COUNT = SOLUTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.operations.impl.Angle_resImpl <em>Angle res</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.operations.impl.Angle_resImpl
   * @see org.xtext.operations.impl.OperationsPackageImpl#getAngle_res()
   * @generated
   */
  int ANGLE_RES = 10;

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
   * The meta object id for the '{@link org.xtext.operations.impl.AngleImpl <em>Angle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.operations.impl.AngleImpl
   * @see org.xtext.operations.impl.OperationsPackageImpl#getAngle()
   * @generated
   */
  int ANGLE = 11;

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
   * The meta object id for the '{@link org.xtext.operations.impl.TimeImpl <em>Time</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.operations.impl.TimeImpl
   * @see org.xtext.operations.impl.OperationsPackageImpl#getTime()
   * @generated
   */
  int TIME = 12;

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
   * The meta object id for the '{@link org.xtext.operations.impl.ServoImpl <em>Servo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.operations.impl.ServoImpl
   * @see org.xtext.operations.impl.OperationsPackageImpl#getServo()
   * @generated
   */
  int SERVO = 13;

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
   * Returns the meta object for class '{@link org.xtext.operations.Operaciones <em>Operaciones</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operaciones</em>'.
   * @see org.xtext.operations.Operaciones
   * @generated
   */
  EClass getOperaciones();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.operations.Operaciones#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.operations.Operaciones#getName()
   * @see #getOperaciones()
   * @generated
   */
  EAttribute getOperaciones_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.operations.Initial <em>Initial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Initial</em>'.
   * @see org.xtext.operations.Initial
   * @generated
   */
  EClass getInitial();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.operations.Initial#getTime <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Time</em>'.
   * @see org.xtext.operations.Initial#getTime()
   * @see #getInitial()
   * @generated
   */
  EReference getInitial_Time();

  /**
   * Returns the meta object for class '{@link org.xtext.operations.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see org.xtext.operations.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.operations.Command#getAngle <em>Angle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Angle</em>'.
   * @see org.xtext.operations.Command#getAngle()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Angle();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.operations.Command#getTime <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Time</em>'.
   * @see org.xtext.operations.Command#getTime()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Time();

  /**
   * Returns the meta object for class '{@link org.xtext.operations.rotateServo <em>rotate Servo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rotate Servo</em>'.
   * @see org.xtext.operations.rotateServo
   * @generated
   */
  EClass getrotateServo();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.operations.rotateServo#getServo <em>Servo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Servo</em>'.
   * @see org.xtext.operations.rotateServo#getServo()
   * @see #getrotateServo()
   * @generated
   */
  EReference getrotateServo_Servo();

  /**
   * Returns the meta object for class '{@link org.xtext.operations.rotateAllServos <em>rotate All Servos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rotate All Servos</em>'.
   * @see org.xtext.operations.rotateAllServos
   * @generated
   */
  EClass getrotateAllServos();

  /**
   * Returns the meta object for class '{@link org.xtext.operations.Result <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Result</em>'.
   * @see org.xtext.operations.Result
   * @generated
   */
  EClass getResult();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.operations.Result#getTime <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Time</em>'.
   * @see org.xtext.operations.Result#getTime()
   * @see #getResult()
   * @generated
   */
  EReference getResult_Time();

  /**
   * Returns the meta object for class '{@link org.xtext.operations.Solution <em>Solution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Solution</em>'.
   * @see org.xtext.operations.Solution
   * @generated
   */
  EClass getSolution();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.operations.Solution#getAngle <em>Angle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Angle</em>'.
   * @see org.xtext.operations.Solution#getAngle()
   * @see #getSolution()
   * @generated
   */
  EReference getSolution_Angle();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.operations.Solution#getAngle_res <em>Angle res</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Angle res</em>'.
   * @see org.xtext.operations.Solution#getAngle_res()
   * @see #getSolution()
   * @generated
   */
  EReference getSolution_Angle_res();

  /**
   * Returns the meta object for class '{@link org.xtext.operations.Conditions <em>Conditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditions</em>'.
   * @see org.xtext.operations.Conditions
   * @generated
   */
  EClass getConditions();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.operations.Conditions#getTime <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Time</em>'.
   * @see org.xtext.operations.Conditions#getTime()
   * @see #getConditions()
   * @generated
   */
  EReference getConditions_Time();

  /**
   * Returns the meta object for class '{@link org.xtext.operations.isAtSingle <em>is At Single</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>is At Single</em>'.
   * @see org.xtext.operations.isAtSingle
   * @generated
   */
  EClass getisAtSingle();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.operations.isAtSingle#getServo <em>Servo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Servo</em>'.
   * @see org.xtext.operations.isAtSingle#getServo()
   * @see #getisAtSingle()
   * @generated
   */
  EReference getisAtSingle_Servo();

  /**
   * Returns the meta object for class '{@link org.xtext.operations.isAt <em>is At</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>is At</em>'.
   * @see org.xtext.operations.isAt
   * @generated
   */
  EClass getisAt();

  /**
   * Returns the meta object for class '{@link org.xtext.operations.Angle_res <em>Angle res</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Angle res</em>'.
   * @see org.xtext.operations.Angle_res
   * @generated
   */
  EClass getAngle_res();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.operations.Angle_res#getAngle_res <em>Angle res</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Angle res</em>'.
   * @see org.xtext.operations.Angle_res#getAngle_res()
   * @see #getAngle_res()
   * @generated
   */
  EAttribute getAngle_res_Angle_res();

  /**
   * Returns the meta object for class '{@link org.xtext.operations.Angle <em>Angle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Angle</em>'.
   * @see org.xtext.operations.Angle
   * @generated
   */
  EClass getAngle();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.operations.Angle#getAngle <em>Angle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Angle</em>'.
   * @see org.xtext.operations.Angle#getAngle()
   * @see #getAngle()
   * @generated
   */
  EAttribute getAngle_Angle();

  /**
   * Returns the meta object for class '{@link org.xtext.operations.Time <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Time</em>'.
   * @see org.xtext.operations.Time
   * @generated
   */
  EClass getTime();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.operations.Time#getTime <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time</em>'.
   * @see org.xtext.operations.Time#getTime()
   * @see #getTime()
   * @generated
   */
  EAttribute getTime_Time();

  /**
   * Returns the meta object for class '{@link org.xtext.operations.Servo <em>Servo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Servo</em>'.
   * @see org.xtext.operations.Servo
   * @generated
   */
  EClass getServo();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.operations.Servo#getServo <em>Servo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Servo</em>'.
   * @see org.xtext.operations.Servo#getServo()
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
     * The meta object literal for the '{@link org.xtext.operations.impl.OperacionesImpl <em>Operaciones</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.operations.impl.OperacionesImpl
     * @see org.xtext.operations.impl.OperationsPackageImpl#getOperaciones()
     * @generated
     */
    EClass OPERACIONES = eINSTANCE.getOperaciones();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERACIONES__NAME = eINSTANCE.getOperaciones_Name();

    /**
     * The meta object literal for the '{@link org.xtext.operations.impl.InitialImpl <em>Initial</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.operations.impl.InitialImpl
     * @see org.xtext.operations.impl.OperationsPackageImpl#getInitial()
     * @generated
     */
    EClass INITIAL = eINSTANCE.getInitial();

    /**
     * The meta object literal for the '<em><b>Time</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INITIAL__TIME = eINSTANCE.getInitial_Time();

    /**
     * The meta object literal for the '{@link org.xtext.operations.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.operations.impl.CommandImpl
     * @see org.xtext.operations.impl.OperationsPackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '<em><b>Angle</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__ANGLE = eINSTANCE.getCommand_Angle();

    /**
     * The meta object literal for the '<em><b>Time</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__TIME = eINSTANCE.getCommand_Time();

    /**
     * The meta object literal for the '{@link org.xtext.operations.impl.rotateServoImpl <em>rotate Servo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.operations.impl.rotateServoImpl
     * @see org.xtext.operations.impl.OperationsPackageImpl#getrotateServo()
     * @generated
     */
    EClass ROTATE_SERVO = eINSTANCE.getrotateServo();

    /**
     * The meta object literal for the '<em><b>Servo</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROTATE_SERVO__SERVO = eINSTANCE.getrotateServo_Servo();

    /**
     * The meta object literal for the '{@link org.xtext.operations.impl.rotateAllServosImpl <em>rotate All Servos</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.operations.impl.rotateAllServosImpl
     * @see org.xtext.operations.impl.OperationsPackageImpl#getrotateAllServos()
     * @generated
     */
    EClass ROTATE_ALL_SERVOS = eINSTANCE.getrotateAllServos();

    /**
     * The meta object literal for the '{@link org.xtext.operations.impl.ResultImpl <em>Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.operations.impl.ResultImpl
     * @see org.xtext.operations.impl.OperationsPackageImpl#getResult()
     * @generated
     */
    EClass RESULT = eINSTANCE.getResult();

    /**
     * The meta object literal for the '<em><b>Time</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESULT__TIME = eINSTANCE.getResult_Time();

    /**
     * The meta object literal for the '{@link org.xtext.operations.impl.SolutionImpl <em>Solution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.operations.impl.SolutionImpl
     * @see org.xtext.operations.impl.OperationsPackageImpl#getSolution()
     * @generated
     */
    EClass SOLUTION = eINSTANCE.getSolution();

    /**
     * The meta object literal for the '<em><b>Angle</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOLUTION__ANGLE = eINSTANCE.getSolution_Angle();

    /**
     * The meta object literal for the '<em><b>Angle res</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOLUTION__ANGLE_RES = eINSTANCE.getSolution_Angle_res();

    /**
     * The meta object literal for the '{@link org.xtext.operations.impl.ConditionsImpl <em>Conditions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.operations.impl.ConditionsImpl
     * @see org.xtext.operations.impl.OperationsPackageImpl#getConditions()
     * @generated
     */
    EClass CONDITIONS = eINSTANCE.getConditions();

    /**
     * The meta object literal for the '<em><b>Time</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONS__TIME = eINSTANCE.getConditions_Time();

    /**
     * The meta object literal for the '{@link org.xtext.operations.impl.isAtSingleImpl <em>is At Single</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.operations.impl.isAtSingleImpl
     * @see org.xtext.operations.impl.OperationsPackageImpl#getisAtSingle()
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
     * The meta object literal for the '{@link org.xtext.operations.impl.isAtImpl <em>is At</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.operations.impl.isAtImpl
     * @see org.xtext.operations.impl.OperationsPackageImpl#getisAt()
     * @generated
     */
    EClass IS_AT = eINSTANCE.getisAt();

    /**
     * The meta object literal for the '{@link org.xtext.operations.impl.Angle_resImpl <em>Angle res</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.operations.impl.Angle_resImpl
     * @see org.xtext.operations.impl.OperationsPackageImpl#getAngle_res()
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
     * The meta object literal for the '{@link org.xtext.operations.impl.AngleImpl <em>Angle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.operations.impl.AngleImpl
     * @see org.xtext.operations.impl.OperationsPackageImpl#getAngle()
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
     * The meta object literal for the '{@link org.xtext.operations.impl.TimeImpl <em>Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.operations.impl.TimeImpl
     * @see org.xtext.operations.impl.OperationsPackageImpl#getTime()
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
     * The meta object literal for the '{@link org.xtext.operations.impl.ServoImpl <em>Servo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.operations.impl.ServoImpl
     * @see org.xtext.operations.impl.OperationsPackageImpl#getServo()
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

} //OperationsPackage
