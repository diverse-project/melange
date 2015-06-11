/**
 */
package activitydiagram;

import org.eclipse.emf.common.util.EList;

import org.k3.lua.dynamic.environment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement Local Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagram.Statement_Local_Variable_Declaration#getVariableNames <em>Variable Names</em>}</li>
 *   <li>{@link activitydiagram.Statement_Local_Variable_Declaration#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagram.ActivitydiagramPackage#getStatement_Local_Variable_Declaration()
 * @model
 * @generated
 */
public interface Statement_Local_Variable_Declaration extends Statement {
	/**
	 * Returns the value of the '<em><b>Variable Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Names</em>' attribute list.
	 * @see activitydiagram.ActivitydiagramPackage#getStatement_Local_Variable_Declaration_VariableNames()
	 * @model unique="false" dataType="activitydiagram.EString"
	 * @generated
	 */
	EList<String> getVariableNames();

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagram.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' containment reference list.
	 * @see activitydiagram.ActivitydiagramPackage#getStatement_Local_Variable_Declaration_InitialValue()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getInitialValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model cDataType="activitydiagram.environment"
	 * @generated
	 */
	void execute(environment c);

} // Statement_Local_Variable_Declaration
