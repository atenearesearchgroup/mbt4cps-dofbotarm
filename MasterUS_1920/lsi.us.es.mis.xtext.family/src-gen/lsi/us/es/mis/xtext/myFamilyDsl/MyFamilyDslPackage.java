/**
 * generated by Xtext 2.21.0
 */
package lsi.us.es.mis.xtext.myFamilyDsl;

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
 * @see lsi.us.es.mis.xtext.myFamilyDsl.MyFamilyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyFamilyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myFamilyDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.us.lsi/es/mis/xtext/MyFamilyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myFamilyDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyFamilyDslPackage eINSTANCE = lsi.us.es.mis.xtext.myFamilyDsl.impl.MyFamilyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link lsi.us.es.mis.xtext.myFamilyDsl.impl.FamilyImpl <em>Family</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lsi.us.es.mis.xtext.myFamilyDsl.impl.FamilyImpl
   * @see lsi.us.es.mis.xtext.myFamilyDsl.impl.MyFamilyDslPackageImpl#getFamily()
   * @generated
   */
  int FAMILY = 0;

  /**
   * The feature id for the '<em><b>Surname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAMILY__SURNAME = 0;

  /**
   * The feature id for the '<em><b>Persons</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAMILY__PERSONS = 1;

  /**
   * The number of structural features of the '<em>Family</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAMILY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link lsi.us.es.mis.xtext.myFamilyDsl.impl.PersonImpl <em>Person</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lsi.us.es.mis.xtext.myFamilyDsl.impl.PersonImpl
   * @see lsi.us.es.mis.xtext.myFamilyDsl.impl.MyFamilyDslPackageImpl#getPerson()
   * @generated
   */
  int PERSON = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__NAME = 0;

  /**
   * The feature id for the '<em><b>Parents</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__PARENTS = 1;

  /**
   * The feature id for the '<em><b>Children</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__CHILDREN = 2;

  /**
   * The number of structural features of the '<em>Person</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link lsi.us.es.mis.xtext.myFamilyDsl.impl.ManImpl <em>Man</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lsi.us.es.mis.xtext.myFamilyDsl.impl.ManImpl
   * @see lsi.us.es.mis.xtext.myFamilyDsl.impl.MyFamilyDslPackageImpl#getMan()
   * @generated
   */
  int MAN = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAN__NAME = PERSON__NAME;

  /**
   * The feature id for the '<em><b>Parents</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAN__PARENTS = PERSON__PARENTS;

  /**
   * The feature id for the '<em><b>Children</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAN__CHILDREN = PERSON__CHILDREN;

  /**
   * The number of structural features of the '<em>Man</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAN_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link lsi.us.es.mis.xtext.myFamilyDsl.impl.WomanImpl <em>Woman</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lsi.us.es.mis.xtext.myFamilyDsl.impl.WomanImpl
   * @see lsi.us.es.mis.xtext.myFamilyDsl.impl.MyFamilyDslPackageImpl#getWoman()
   * @generated
   */
  int WOMAN = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WOMAN__NAME = PERSON__NAME;

  /**
   * The feature id for the '<em><b>Parents</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WOMAN__PARENTS = PERSON__PARENTS;

  /**
   * The feature id for the '<em><b>Children</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WOMAN__CHILDREN = PERSON__CHILDREN;

  /**
   * The number of structural features of the '<em>Woman</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WOMAN_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link lsi.us.es.mis.xtext.myFamilyDsl.Family <em>Family</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Family</em>'.
   * @see lsi.us.es.mis.xtext.myFamilyDsl.Family
   * @generated
   */
  EClass getFamily();

  /**
   * Returns the meta object for the attribute '{@link lsi.us.es.mis.xtext.myFamilyDsl.Family#getSurname <em>Surname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Surname</em>'.
   * @see lsi.us.es.mis.xtext.myFamilyDsl.Family#getSurname()
   * @see #getFamily()
   * @generated
   */
  EAttribute getFamily_Surname();

  /**
   * Returns the meta object for the containment reference list '{@link lsi.us.es.mis.xtext.myFamilyDsl.Family#getPersons <em>Persons</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Persons</em>'.
   * @see lsi.us.es.mis.xtext.myFamilyDsl.Family#getPersons()
   * @see #getFamily()
   * @generated
   */
  EReference getFamily_Persons();

  /**
   * Returns the meta object for class '{@link lsi.us.es.mis.xtext.myFamilyDsl.Person <em>Person</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Person</em>'.
   * @see lsi.us.es.mis.xtext.myFamilyDsl.Person
   * @generated
   */
  EClass getPerson();

  /**
   * Returns the meta object for the attribute '{@link lsi.us.es.mis.xtext.myFamilyDsl.Person#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see lsi.us.es.mis.xtext.myFamilyDsl.Person#getName()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_Name();

  /**
   * Returns the meta object for the reference list '{@link lsi.us.es.mis.xtext.myFamilyDsl.Person#getParents <em>Parents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Parents</em>'.
   * @see lsi.us.es.mis.xtext.myFamilyDsl.Person#getParents()
   * @see #getPerson()
   * @generated
   */
  EReference getPerson_Parents();

  /**
   * Returns the meta object for the reference list '{@link lsi.us.es.mis.xtext.myFamilyDsl.Person#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Children</em>'.
   * @see lsi.us.es.mis.xtext.myFamilyDsl.Person#getChildren()
   * @see #getPerson()
   * @generated
   */
  EReference getPerson_Children();

  /**
   * Returns the meta object for class '{@link lsi.us.es.mis.xtext.myFamilyDsl.Man <em>Man</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Man</em>'.
   * @see lsi.us.es.mis.xtext.myFamilyDsl.Man
   * @generated
   */
  EClass getMan();

  /**
   * Returns the meta object for class '{@link lsi.us.es.mis.xtext.myFamilyDsl.Woman <em>Woman</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Woman</em>'.
   * @see lsi.us.es.mis.xtext.myFamilyDsl.Woman
   * @generated
   */
  EClass getWoman();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyFamilyDslFactory getMyFamilyDslFactory();

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
     * The meta object literal for the '{@link lsi.us.es.mis.xtext.myFamilyDsl.impl.FamilyImpl <em>Family</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lsi.us.es.mis.xtext.myFamilyDsl.impl.FamilyImpl
     * @see lsi.us.es.mis.xtext.myFamilyDsl.impl.MyFamilyDslPackageImpl#getFamily()
     * @generated
     */
    EClass FAMILY = eINSTANCE.getFamily();

    /**
     * The meta object literal for the '<em><b>Surname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FAMILY__SURNAME = eINSTANCE.getFamily_Surname();

    /**
     * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FAMILY__PERSONS = eINSTANCE.getFamily_Persons();

    /**
     * The meta object literal for the '{@link lsi.us.es.mis.xtext.myFamilyDsl.impl.PersonImpl <em>Person</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lsi.us.es.mis.xtext.myFamilyDsl.impl.PersonImpl
     * @see lsi.us.es.mis.xtext.myFamilyDsl.impl.MyFamilyDslPackageImpl#getPerson()
     * @generated
     */
    EClass PERSON = eINSTANCE.getPerson();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

    /**
     * The meta object literal for the '<em><b>Parents</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSON__PARENTS = eINSTANCE.getPerson_Parents();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSON__CHILDREN = eINSTANCE.getPerson_Children();

    /**
     * The meta object literal for the '{@link lsi.us.es.mis.xtext.myFamilyDsl.impl.ManImpl <em>Man</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lsi.us.es.mis.xtext.myFamilyDsl.impl.ManImpl
     * @see lsi.us.es.mis.xtext.myFamilyDsl.impl.MyFamilyDslPackageImpl#getMan()
     * @generated
     */
    EClass MAN = eINSTANCE.getMan();

    /**
     * The meta object literal for the '{@link lsi.us.es.mis.xtext.myFamilyDsl.impl.WomanImpl <em>Woman</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lsi.us.es.mis.xtext.myFamilyDsl.impl.WomanImpl
     * @see lsi.us.es.mis.xtext.myFamilyDsl.impl.MyFamilyDslPackageImpl#getWoman()
     * @generated
     */
    EClass WOMAN = eINSTANCE.getWoman();

  }

} //MyFamilyDslPackage