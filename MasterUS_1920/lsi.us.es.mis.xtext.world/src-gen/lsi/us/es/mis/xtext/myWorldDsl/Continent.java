/**
 * generated by Xtext 2.21.0
 */
package lsi.us.es.mis.xtext.myWorldDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Continent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lsi.us.es.mis.xtext.myWorldDsl.Continent#getCountries <em>Countries</em>}</li>
 * </ul>
 *
 * @see lsi.us.es.mis.xtext.myWorldDsl.MyWorldDslPackage#getContinent()
 * @model
 * @generated
 */
public interface Continent extends Space
{
  /**
   * Returns the value of the '<em><b>Countries</b></em>' containment reference list.
   * The list contents are of type {@link lsi.us.es.mis.xtext.myWorldDsl.Country}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Countries</em>' containment reference list.
   * @see lsi.us.es.mis.xtext.myWorldDsl.MyWorldDslPackage#getContinent_Countries()
   * @model containment="true"
   * @generated
   */
  EList<Country> getCountries();

} // Continent