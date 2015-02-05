/**
 */
package kmlogo.asm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proc Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kmlogo.asm.ProcCall#getActualArgs <em>Actual Args</em>}</li>
 *   <li>{@link kmlogo.asm.ProcCall#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see kmlogo.asm.AsmPackage#getProcCall()
 * @model
 * @generated
 */
public interface ProcCall extends Expression {
	/**
	 * Returns the value of the '<em><b>Actual Args</b></em>' containment reference list.
	 * The list contents are of type {@link kmlogo.asm.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Args</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Args</em>' containment reference list.
	 * @see kmlogo.asm.AsmPackage#getProcCall_ActualArgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getActualArgs();

	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link kmlogo.asm.ProcDeclaration#getProcCall <em>Proc Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' reference.
	 * @see #setDeclaration(ProcDeclaration)
	 * @see kmlogo.asm.AsmPackage#getProcCall_Declaration()
	 * @see kmlogo.asm.ProcDeclaration#getProcCall
	 * @model opposite="procCall" required="true"
	 * @generated
	 */
	ProcDeclaration getDeclaration();

	/**
	 * Sets the value of the '{@link kmlogo.asm.ProcCall#getDeclaration <em>Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' reference.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(ProcDeclaration value);

} // ProcCall
