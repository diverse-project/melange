/**
 */
package fr.inria.diverse.k3.sle.metamodel.k3sle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation#isMain <em>Main</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation#getBody <em>Body</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation#getReturnTypeRef <em>Return Type Ref</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation#getInput <em>Input</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends Element {
	/**
	 * Returns the value of the '<em><b>Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main</em>' attribute.
	 * @see #setMain(boolean)
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getTransformation_Main()
	 * @model
	 * @generated
	 */
	boolean isMain();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation#isMain <em>Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main</em>' attribute.
	 * @see #isMain()
	 * @generated
	 */
	void setMain(boolean value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtext.common.types.JvmFormalParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getTransformation_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<JvmFormalParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(XExpression)
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getTransformation_Body()
	 * @model containment="true" required="true"
	 * @generated
	 */
	XExpression getBody();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(XExpression value);

	/**
	 * Returns the value of the '<em><b>Return Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type Ref</em>' containment reference.
	 * @see #setReturnTypeRef(JvmTypeReference)
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getTransformation_ReturnTypeRef()
	 * @model containment="true"
	 * @generated
	 */
	JvmTypeReference getReturnTypeRef();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation#getReturnTypeRef <em>Return Type Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type Ref</em>' containment reference.
	 * @see #getReturnTypeRef()
	 * @generated
	 */
	void setReturnTypeRef(JvmTypeReference value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.diverse.k3.sle.metamodel.k3sle.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getTransformation_Input()
	 * @model
	 * @generated
	 */
	EList<Element> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.diverse.k3.sle.metamodel.k3sle.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference list.
	 * @see fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage#getTransformation_Output()
	 * @model
	 * @generated
	 */
	EList<Element> getOutput();

} // Transformation
