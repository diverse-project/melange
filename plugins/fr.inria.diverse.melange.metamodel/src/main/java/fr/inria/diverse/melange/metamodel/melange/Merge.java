/**
 */
package fr.inria.diverse.melange.metamodel.melange;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Merge#getMergedLanguage <em>Merged Language</em>}</li>
 * </ul>
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

} // Merge
