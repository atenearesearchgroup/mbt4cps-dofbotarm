/**
 * generated by Xtext 2.20.0
 */
package lsi.us.es.mis.xtext.exercise.myDomainModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lsi.us.es.mis.xtext.exercise.myDomainModel.Class#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link lsi.us.es.mis.xtext.exercise.myDomainModel.Class#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see lsi.us.es.mis.xtext.exercise.myDomainModel.MyDomainModelPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Type
{
  /**
   * Returns the value of the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract</em>' attribute.
   * @see #setAbstract(boolean)
   * @see lsi.us.es.mis.xtext.exercise.myDomainModel.MyDomainModelPackage#getClass_Abstract()
   * @model
   * @generated
   */
  boolean isAbstract();

  /**
   * Sets the value of the '{@link lsi.us.es.mis.xtext.exercise.myDomainModel.Class#isAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #isAbstract()
   * @generated
   */
  void setAbstract(boolean value);

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link lsi.us.es.mis.xtext.exercise.myDomainModel.Feature}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see lsi.us.es.mis.xtext.exercise.myDomainModel.MyDomainModelPackage#getClass_Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeatures();

} // Class