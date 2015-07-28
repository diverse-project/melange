/**
 */
package fr.inria.diverse.melange.metamodel.melange;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Merge#getMergedLanguage <em>Merged Language</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Merge#getMappingRules <em>Mapping Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getMerge()
 * @model
 * @generated
 */
public interface Merge extends Operator {
	/**
	 * Returns the value of the '<em><b>Merged Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merged Language</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merged Language</em>' reference.
	 * @see #setMergedLanguage(Language)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getMerge_MergedLanguage()
	 * @model required="true"
	 * @generated
	 */
	Language getMergedLanguage();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.Merge#getMergedLanguage <em>Merged Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merged Language</em>' reference.
	 * @see #getMergedLanguage()
	 * @generated
	 */
	void setMergedLanguage(Language value);

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
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getMerge_MappingRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageBinding> getMappingRules();

} // Merge
