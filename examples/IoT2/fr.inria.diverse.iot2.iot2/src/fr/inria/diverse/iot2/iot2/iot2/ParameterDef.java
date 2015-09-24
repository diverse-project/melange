/**
 */
package fr.inria.diverse.iot2.iot2.iot2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.ParameterDef#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.ParameterDef#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getParameterDef()
 * @model
 * @generated
 */
public interface ParameterDef extends Typed {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getParameterDef_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.iot2.iot2.iot2.ParameterDef#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.inria.diverse.iot2.iot2.iot2.ParameterMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see fr.inria.diverse.iot2.iot2.iot2.ParameterMode
	 * @see #setDirection(ParameterMode)
	 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getParameterDef_Direction()
	 * @model
	 * @generated
	 */
	ParameterMode getDirection();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.iot2.iot2.iot2.ParameterDef#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see fr.inria.diverse.iot2.iot2.iot2.ParameterMode
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(ParameterMode value);

} // ParameterDef
