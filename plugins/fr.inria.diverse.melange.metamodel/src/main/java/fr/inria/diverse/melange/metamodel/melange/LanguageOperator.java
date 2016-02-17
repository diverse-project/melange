/**
 */
package fr.inria.diverse.melange.metamodel.melange;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.LanguageOperator#getTargetLanguage <em>Target Language</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getLanguageOperator()
 * @model
 * @generated
 */
public interface LanguageOperator extends Operator {
	/**
	 * Returns the value of the '<em><b>Target Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Language</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Language</em>' reference.
	 * @see #setTargetLanguage(Language)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getLanguageOperator_TargetLanguage()
	 * @model required="true"
	 * @generated
	 */
	Language getTargetLanguage();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.LanguageOperator#getTargetLanguage <em>Target Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Language</em>' reference.
	 * @see #getTargetLanguage()
	 * @generated
	 */
	void setTargetLanguage(Language value);

} // LanguageOperator
