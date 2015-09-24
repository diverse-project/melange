/**
 */
package fr.inria.diverse.iot2.iot2.iot2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opaque Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.OpaqueAction#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.OpaqueAction#getService <em>Service</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getOpaqueAction()
 * @model
 * @generated
 */
public interface OpaqueAction extends Action {
	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.diverse.iot2.iot2.iot2.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' reference list.
	 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getOpaqueAction_Expressions()
	 * @model
	 * @generated
	 */
	EList<Expression> getExpressions();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(OperationDef)
	 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getOpaqueAction_Service()
	 * @model
	 * @generated
	 */
	OperationDef getService();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.iot2.iot2.iot2.OpaqueAction#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(OperationDef value);

} // OpaqueAction
