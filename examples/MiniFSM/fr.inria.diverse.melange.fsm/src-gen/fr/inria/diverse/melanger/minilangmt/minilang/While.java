/**
 */
package fr.inria.diverse.melanger.minilangmt.minilang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melanger.minilangmt.minilang.While#getCondition <em>Condition</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.minilangmt.minilang.While#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melanger.minilangmt.minilang.MinilangPackage#getWhile()
 * @model
 * @generated
 */
public interface While extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(BooleanExpression)
	 * @see fr.inria.diverse.melanger.minilangmt.minilang.MinilangPackage#getWhile_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanExpression getCondition();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.minilangmt.minilang.While#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(BooleanExpression value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference.
	 * @see #setBody(Block)
	 * @see fr.inria.diverse.melanger.minilangmt.minilang.MinilangPackage#getWhile_Body()
	 * @model required="true"
	 * @generated
	 */
	Block getBody();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.minilangmt.minilang.While#getBody <em>Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Block value);

} // While
