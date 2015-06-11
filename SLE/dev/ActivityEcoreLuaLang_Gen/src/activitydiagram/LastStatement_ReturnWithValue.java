/**
 */
package activitydiagram;

import org.eclipse.emf.common.util.EList;

import org.k3.lua.dynamic.environment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Last Statement Return With Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagram.LastStatement_ReturnWithValue#getReturnValues <em>Return Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagram.ActivitydiagramPackage#getLastStatement_ReturnWithValue()
 * @model
 * @generated
 */
public interface LastStatement_ReturnWithValue extends LastStatement_Return {
	/**
	 * Returns the value of the '<em><b>Return Values</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagram.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Values</em>' containment reference list.
	 * @see activitydiagram.ActivitydiagramPackage#getLastStatement_ReturnWithValue_ReturnValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getReturnValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model cDataType="activitydiagram.environment"
	 * @generated
	 */
	void execute(environment c);

} // LastStatement_ReturnWithValue
