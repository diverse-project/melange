/**
 */
package puzzle;

import fr.inria.diverse.melange.metamodel.melange.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link puzzle.Composition#getStatements <em>Statements</em>}</li>
 *   <li>{@link puzzle.Composition#getGenModel <em>Gen Model</em>}</li>
 * </ul>
 *
 * @see puzzle.PuzzlePackage#getComposition()
 * @model
 * @generated
 */
public interface Composition extends Element {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link puzzle.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see puzzle.PuzzlePackage#getComposition_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

	/**
	 * Returns the value of the '<em><b>Gen Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Model</em>' attribute.
	 * @see #setGenModel(Object)
	 * @see puzzle.PuzzlePackage#getComposition_GenModel()
	 * @model
	 * @generated
	 */
	Object getGenModel();

	/**
	 * Sets the value of the '{@link puzzle.Composition#getGenModel <em>Gen Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Model</em>' attribute.
	 * @see #getGenModel()
	 * @generated
	 */
	void setGenModel(Object value);

} // Composition
