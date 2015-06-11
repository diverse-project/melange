/**
 */
package activitydiagram;

import org.eclipse.emf.common.util.EList;

import org.k3.lua.dynamic.environment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement For Generic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagram.Statement_For_Generic#getNames <em>Names</em>}</li>
 *   <li>{@link activitydiagram.Statement_For_Generic#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link activitydiagram.Statement_For_Generic#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagram.ActivitydiagramPackage#getStatement_For_Generic()
 * @model
 * @generated
 */
public interface Statement_For_Generic extends Statement {
	/**
	 * Returns the value of the '<em><b>Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Names</em>' attribute list.
	 * @see activitydiagram.ActivitydiagramPackage#getStatement_For_Generic_Names()
	 * @model unique="false" dataType="activitydiagram.EString"
	 * @generated
	 */
	EList<String> getNames();

	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagram.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see activitydiagram.ActivitydiagramPackage#getStatement_For_Generic_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getExpressions();

	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference.
	 * @see #setBlock(Block)
	 * @see activitydiagram.ActivitydiagramPackage#getStatement_For_Generic_Block()
	 * @model containment="true"
	 * @generated
	 */
	Block getBlock();

	/**
	 * Sets the value of the '{@link activitydiagram.Statement_For_Generic#getBlock <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' containment reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(Block value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model cDataType="activitydiagram.environment"
	 * @generated
	 */
	void execute(environment c);

} // Statement_For_Generic
