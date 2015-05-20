/**
 */
package puzzle;

import fr.inria.diverse.melange.metamodel.melange.Metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link puzzle.LanguageRef#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see puzzle.PuzzlePackage#getLanguageRef()
 * @model
 * @generated
 */
public interface LanguageRef extends Expression {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(Metamodel)
	 * @see puzzle.PuzzlePackage#getLanguageRef_Ref()
	 * @model required="true"
	 * @generated
	 */
	Metamodel getRef();

	/**
	 * Sets the value of the '{@link puzzle.LanguageRef#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(Metamodel value);

} // LanguageRef
