/**
 */
package activitydiagram;

import org.k3.lua.dynamic.Environment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Add Entry To Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagram.Field_AddEntryToTable#getKey <em>Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagram.ActivitydiagramPackage#getField_AddEntryToTable()
 * @model
 * @generated
 */
public interface Field_AddEntryToTable extends Field {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see activitydiagram.ActivitydiagramPackage#getField_AddEntryToTable_Key()
	 * @model dataType="activitydiagram.EString"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link activitydiagram.Field_AddEntryToTable#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model cDataType="activitydiagram.Environment"
	 * @generated
	 */
	void execute(Environment c);

} // Field_AddEntryToTable
