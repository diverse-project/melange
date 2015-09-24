/**
 */
package fr.inria.diverse.iot2.iot2.iot2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.OperationDef#getParameters <em>Parameters</em>}</li>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.OperationDef#isIsOneway <em>Is Oneway</em>}</li>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.OperationDef#getContexts <em>Contexts</em>}</li>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.OperationDef#getCanRaise <em>Can Raise</em>}</li>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.OperationDef#getLua <em>Lua</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getOperationDef()
 * @model
 * @generated
 */
public interface OperationDef extends Contained, Typed {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.iot2.iot2.iot2.ParameterDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getOperationDef_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterDef> getParameters();

	/**
	 * Returns the value of the '<em><b>Is Oneway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Oneway</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Oneway</em>' attribute.
	 * @see #setIsOneway(boolean)
	 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getOperationDef_IsOneway()
	 * @model
	 * @generated
	 */
	boolean isIsOneway();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.iot2.iot2.iot2.OperationDef#isIsOneway <em>Is Oneway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Oneway</em>' attribute.
	 * @see #isIsOneway()
	 * @generated
	 */
	void setIsOneway(boolean value);

	/**
	 * Returns the value of the '<em><b>Contexts</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contexts</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contexts</em>' attribute list.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getOperationDef_Contexts()
	 * @model
	 * @generated
	 */
	EList<String> getContexts();

	/**
	 * Returns the value of the '<em><b>Can Raise</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.diverse.iot2.iot2.iot2.ExceptionDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Raise</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Raise</em>' reference list.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getOperationDef_CanRaise()
	 * @model
	 * @generated
	 */
	EList<ExceptionDef> getCanRaise();

	/**
	 * Returns the value of the '<em><b>Lua</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lua</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lua</em>' containment reference.
	 * @see #setLua(Block)
	 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getOperationDef_Lua()
	 * @model containment="true"
	 * @generated
	 */
	Block getLua();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.iot2.iot2.iot2.OperationDef#getLua <em>Lua</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lua</em>' containment reference.
	 * @see #getLua()
	 * @generated
	 */
	void setLua(Block value);

} // OperationDef
