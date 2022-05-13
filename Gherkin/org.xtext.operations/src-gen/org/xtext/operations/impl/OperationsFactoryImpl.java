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
      case OperationsPackage.INITIAL: return createInitial();
      case OperationsPackage.OPERATION: return createOperation();
      case OperationsPackage.SOLUTION: return createSolution();
      case OperationsPackage.CONDITIONS: return createConditions();
      case OperationsPackage.OPERATIONAL_ARM: return createOperationalArm();
      case OperationsPackage.ROTATE_SERVO_OPERATION: return createrotateServoOperation();
      case OperationsPackage.ROTATE_ALL_SERVOS_OPERATION: return createrotateAllServosOperation();
      case OperationsPackage.RESULT: return createresult();
      case OperationsPackage.NOT_LATER_THAN: return createNotLaterThan();
      case OperationsPackage.IS_AT_SINGLE_OPERATION: return createisAtSingleOperation();
      case OperationsPackage.IS_AT_OPERATION: return createisAtOperation();
      case OperationsPackage.TIME: return createtime();
      case OperationsPackage.SERVO: return createservo();
      case OperationsPackage.ANGLE: return createangle();
      case OperationsPackage.ANGLE_RES: return createangle_res();
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
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
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
  public OperationalArm createOperationalArm()
  {
    OperationalArmImpl operationalArm = new OperationalArmImpl();
    return operationalArm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public rotateServoOperation createrotateServoOperation()
  {
    rotateServoOperationImpl rotateServoOperation = new rotateServoOperationImpl();
    return rotateServoOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public rotateAllServosOperation createrotateAllServosOperation()
  {
    rotateAllServosOperationImpl rotateAllServosOperation = new rotateAllServosOperationImpl();
    return rotateAllServosOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public result createresult()
  {
    resultImpl result = new resultImpl();
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotLaterThan createNotLaterThan()
  {
    NotLaterThanImpl notLaterThan = new NotLaterThanImpl();
    return notLaterThan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public isAtSingleOperation createisAtSingleOperation()
  {
    isAtSingleOperationImpl isAtSingleOperation = new isAtSingleOperationImpl();
    return isAtSingleOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public isAtOperation createisAtOperation()
  {
    isAtOperationImpl isAtOperation = new isAtOperationImpl();
    return isAtOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public time createtime()
  {
    timeImpl time = new timeImpl();
    return time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public servo createservo()
  {
    servoImpl servo = new servoImpl();
    return servo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public angle createangle()
  {
    angleImpl angle = new angleImpl();
    return angle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public angle_res createangle_res()
  {
    angle_resImpl angle_res = new angle_resImpl();
    return angle_res;
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
