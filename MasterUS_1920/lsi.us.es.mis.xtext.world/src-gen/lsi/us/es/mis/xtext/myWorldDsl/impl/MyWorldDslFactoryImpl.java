/**
 * generated by Xtext 2.21.0
 */
package lsi.us.es.mis.xtext.myWorldDsl.impl;

import lsi.us.es.mis.xtext.myWorldDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyWorldDslFactoryImpl extends EFactoryImpl implements MyWorldDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyWorldDslFactory init()
  {
    try
    {
      MyWorldDslFactory theMyWorldDslFactory = (MyWorldDslFactory)EPackage.Registry.INSTANCE.getEFactory(MyWorldDslPackage.eNS_URI);
      if (theMyWorldDslFactory != null)
      {
        return theMyWorldDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyWorldDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyWorldDslFactoryImpl()
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
      case MyWorldDslPackage.WORLD: return createWorld();
      case MyWorldDslPackage.SPACE: return createSpace();
      case MyWorldDslPackage.WATER: return createWater();
      case MyWorldDslPackage.OCEAN: return createOcean();
      case MyWorldDslPackage.LAKE: return createLake();
      case MyWorldDslPackage.SEA: return createSea();
      case MyWorldDslPackage.CONTINENT: return createContinent();
      case MyWorldDslPackage.COUNTRY: return createCountry();
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
  public World createWorld()
  {
    WorldImpl world = new WorldImpl();
    return world;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Space createSpace()
  {
    SpaceImpl space = new SpaceImpl();
    return space;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Water createWater()
  {
    WaterImpl water = new WaterImpl();
    return water;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Ocean createOcean()
  {
    OceanImpl ocean = new OceanImpl();
    return ocean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Lake createLake()
  {
    LakeImpl lake = new LakeImpl();
    return lake;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Sea createSea()
  {
    SeaImpl sea = new SeaImpl();
    return sea;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Continent createContinent()
  {
    ContinentImpl continent = new ContinentImpl();
    return continent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Country createCountry()
  {
    CountryImpl country = new CountryImpl();
    return country;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MyWorldDslPackage getMyWorldDslPackage()
  {
    return (MyWorldDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyWorldDslPackage getPackage()
  {
    return MyWorldDslPackage.eINSTANCE;
  }

} //MyWorldDslFactoryImpl