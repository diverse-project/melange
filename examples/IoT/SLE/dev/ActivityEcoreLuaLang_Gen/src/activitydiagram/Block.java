/**
 */
package activitydiagram;

import org.eclipse.emf.common.util.EList;

import org.k3.lua.dynamic.Environment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagram.Block#getStatements <em>Statements</em>}</li>
 *   <li>{@link activitydiagram.Block#getReturnValue <em>Return Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagram.ActivitydiagramPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends Chunk {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagram.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see activitydiagram.ActivitydiagramPackage#getBlock_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

	/**
	 * Returns the value of the '<em><b>Return Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Value</em>' containment reference.
	 * @see #setReturnValue(LastStatement)
	 * @see activitydiagram.ActivitydiagramPackage#getBlock_ReturnValue()
	 * @model containment="true"
	 * @generated
	 */
	LastStatement getReturnValue();

	/**
	 * Sets the value of the '{@link activitydiagram.Block#getReturnValue <em>Return Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Value</em>' containment reference.
	 * @see #getReturnValue()
	 * @generated
	 */
	void setReturnValue(LastStatement value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model cDataType="activitydiagram.Environment"
	 * @generated
	 */
	void execute(Environment c);

} // Block
