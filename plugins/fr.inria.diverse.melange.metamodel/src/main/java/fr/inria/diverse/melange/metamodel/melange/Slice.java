/**
 */
package fr.inria.diverse.melange.metamodel.melange;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Slice#getSlicedLanguage <em>Sliced Language</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Slice#getMappingRules <em>Mapping Rules</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Slice#getRoots <em>Roots</em>}</li>
 * </ul>
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

	/**
	 * Returns the value of the '<em><b>Roots</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roots</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roots</em>' reference list.
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getSlice_Roots()
	 * @model
	 * @generated
	 */
	EList<EClass> getRoots();

} // Slice
