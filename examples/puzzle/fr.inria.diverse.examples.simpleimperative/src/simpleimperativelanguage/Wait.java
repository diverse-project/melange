/**
 */
package simpleimperativelanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wait</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simpleimperativelanguage.Wait#getMiliseconds <em>Miliseconds</em>}</li>
 * </ul>
 * </p>
 *
 * @see simpleimperativelanguage.SimpleimperativelanguagePackage#getWait()
 * @model
 * @generated
 */
public interface Wait extends Statement {
	/**
	 * Returns the value of the '<em><b>Miliseconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Miliseconds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Miliseconds</em>' attribute.
	 * @see #setMiliseconds(long)
	 * @see simpleimperativelanguage.SimpleimperativelanguagePackage#getWait_Miliseconds()
	 * @model required="true"
	 * @generated
	 */
	long getMiliseconds();

	/**
	 * Sets the value of the '{@link simpleimperativelanguage.Wait#getMiliseconds <em>Miliseconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Miliseconds</em>' attribute.
	 * @see #getMiliseconds()
	 * @generated
	 */
	void setMiliseconds(long value);

} // Wait
