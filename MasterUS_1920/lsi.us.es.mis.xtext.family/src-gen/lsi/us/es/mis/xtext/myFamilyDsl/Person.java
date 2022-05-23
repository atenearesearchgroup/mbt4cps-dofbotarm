/**
 * generated by Xtext 2.21.0
 */
package lsi.us.es.mis.xtext.myFamilyDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lsi.us.es.mis.xtext.myFamilyDsl.Person#getName <em>Name</em>}</li>
 *   <li>{@link lsi.us.es.mis.xtext.myFamilyDsl.Person#getParents <em>Parents</em>}</li>
 *   <li>{@link lsi.us.es.mis.xtext.myFamilyDsl.Person#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see lsi.us.es.mis.xtext.myFamilyDsl.MyFamilyDslPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see lsi.us.es.mis.xtext.myFamilyDsl.MyFamilyDslPackage#getPerson_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link lsi.us.es.mis.xtext.myFamilyDsl.Person#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parents</b></em>' reference list.
   * The list contents are of type {@link lsi.us.es.mis.xtext.myFamilyDsl.Person}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parents</em>' reference list.
   * @see lsi.us.es.mis.xtext.myFamilyDsl.MyFamilyDslPackage#getPerson_Parents()
   * @model
   * @generated
   */
  EList<Person> getParents();

  /**
   * Returns the value of the '<em><b>Children</b></em>' reference list.
   * The list contents are of type {@link lsi.us.es.mis.xtext.myFamilyDsl.Person}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' reference list.
   * @see lsi.us.es.mis.xtext.myFamilyDsl.MyFamilyDslPackage#getPerson_Children()
   * @model
   * @generated
   */
  EList<Person> getChildren();

} // Person
