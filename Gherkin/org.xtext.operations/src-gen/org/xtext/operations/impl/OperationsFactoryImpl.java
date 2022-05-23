/**
 * generated by Xtext 2.26.0
 */
package org.xtext.operations.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.operations.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationsFactoryImpl extends EFactoryImpl implements OperationsFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OperationsFactory init()
  {
    try
    {
      OperationsFactory theOperationsFactory = (OperationsFactory)EPackage.Registry.INSTANCE.getEFactory(OperationsPackage.eNS_URI);
      if (theOperationsFactory != null)
      {
        return theOperationsFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new OperationsFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationsFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case OperationsPackage.OPERACIONES: return createOperaciones();
      case OperationsPackage.INITIAL: return createInitial();
      case OperationsPackage.COMMAND: return createCommand();
      case OperationsPackage.ROTATE_SERVO: return createrotateServo();
      case OperationsPackage.ROTATE_ALL_SERVOS: return createrotateAllServos();
      case OperationsPackage.RESULT: return createResult();
      case OperationsPackage.SOLUTION: return createSolution();
      case OperationsPackage.CONDITIONS: return createConditions();
      case OperationsPackage.IS_AT_SINGLE: return createisAtSingle();
      case OperationsPackage.IS_AT: return createisAt();
      case OperationsPackage.ANGLE_RES: return createAngle_res();
      case OperationsPackage.ANGLE: return createAngle();
      case OperationsPackage.TIME: return createTime();
      case OperationsPackage.SERVO: return createServo();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Operaciones createOperaciones()
  {
    OperacionesImpl operaciones = new OperacionesImpl();
    return operaciones;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Initial createInitial()
  {
    InitialImpl initial = new InitialImpl();
    return initial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Command createCommand()
  {
    CommandImpl command = new CommandImpl();
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public rotateServo createrotateServo()
  {
    rotateServoImpl rotateServo = new rotateServoImpl();
    return rotateServo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public rotateAllServos createrotateAllServos()
  {
    rotateAllServosImpl rotateAllServos = new rotateAllServosImpl();
    return rotateAllServos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Result createResult()
  {
    ResultImpl result = new ResultImpl();
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Solution createSolution()
  {
    SolutionImpl solution = new SolutionImpl();
    return solution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Conditions createConditions()
  {
    ConditionsImpl conditions = new ConditionsImpl();
    return conditions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public isAtSingle createisAtSingle()
  {
    isAtSingleImpl isAtSingle = new isAtSingleImpl();
    return isAtSingle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public isAt createisAt()
  {
    isAtImpl isAt = new isAtImpl();
    return isAt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Angle_res createAngle_res()
  {
    Angle_resImpl angle_res = new Angle_resImpl();
    return angle_res;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Angle createAngle()
  {
    AngleImpl angle = new AngleImpl();
    return angle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Time createTime()
  {
    TimeImpl time = new TimeImpl();
    return time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Servo createServo()
  {
    ServoImpl servo = new ServoImpl();
    return servo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OperationsPackage getOperationsPackage()
  {
    return (OperationsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static OperationsPackage getPackage()
  {
    return OperationsPackage.eINSTANCE;
  }

} //OperationsFactoryImpl
