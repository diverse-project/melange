/**
 */
package fr.inria.diverse.melange.metamodel.melange;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Slice#getSlicedLanguage <em>Sliced Language</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Slice#getRoots <em>Roots</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Slice#getMappingRules <em>Mapping Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getSlice()
 * @model
 * @generated
 */
public interface Slice extends Operator {
	/**
	 * Returns the value of the '<em><b>Sliced Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sliced Language</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sliced Language</em>' reference.
	 * @see #setSlicedLanguage(Language)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getSlice_SlicedLanguage()
	 * @model required="true"
	 * @generated
	 */
	Language getSlicedLanguage();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.Slice#getSlicedLanguage <em>Sliced Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sliced Language</em>' reference.
	 * @see #getSlicedLanguage()
	 * @generated
	 */
	void setSlicedLanguage(Language value);

	/**
	 * Returns the value of the '<em><b>Roots</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roots</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roots</em>' attribute list.
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getSlice_Roots()
	 * @model
	 * @generated
	 */
	EList<String> getRoots();

	/**
	 * Returns the value of the '<em><b>Mapping Rules</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.melange.metamodel.melange.PackageBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Rules</em>' containment reference list.
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getSlice_MappingRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageBinding> getMappingRules();

} // Slice
