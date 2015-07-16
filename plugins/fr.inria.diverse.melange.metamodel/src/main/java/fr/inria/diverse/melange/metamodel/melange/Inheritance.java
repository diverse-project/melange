/**
 */
package fr.inria.diverse.melange.metamodel.melange;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inheritance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Inheritance#getSuperLanguage <em>Super Language</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getInheritance()
 * @model
 * @generated
 */
public interface Inheritance extends Operator {
	/**
	 * Returns the value of the '<em><b>Super Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Language</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Language</em>' reference.
	 * @see #setSuperLanguage(Language)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getInheritance_SuperLanguage()
	 * @model required="true"
	 * @generated
	 */
	Language getSuperLanguage();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.Inheritance#getSuperLanguage <em>Super Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Language</em>' reference.
	 * @see #getSuperLanguage()
	 * @generated
	 */
	void setSuperLanguage(Language value);

} // Inheritance
