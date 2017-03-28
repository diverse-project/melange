/**
 */
package testcopy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opposites A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link testcopy.OppositesA#getToB <em>To B</em>}</li>
 *   <li>{@link testcopy.OppositesA#getOneToMany <em>One To Many</em>}</li>
 *   <li>{@link testcopy.OppositesA#getManyToMany <em>Many To Many</em>}</li>
 *   <li>{@link testcopy.OppositesA#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see testcopy.TestcopyPackage#getOppositesA()
 * @model
 * @generated
 */
public interface OppositesA extends EObject {
	/**
	 * Returns the value of the '<em><b>To B</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link testcopy.OppositesB#getToA <em>To A</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To B</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To B</em>' reference.
	 * @see #setToB(OppositesB)
	 * @see testcopy.TestcopyPackage#getOppositesA_ToB()
	 * @see testcopy.OppositesB#getToA
	 * @model opposite="toA"
	 * @generated
	 */
	OppositesB getToB();

	/**
	 * Sets the value of the '{@link testcopy.OppositesA#getToB <em>To B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To B</em>' reference.
	 * @see #getToB()
	 * @generated
	 */
	void setToB(OppositesB value);

	/**
	 * Returns the value of the '<em><b>One To Many</b></em>' containment reference list.
	 * The list contents are of type {@link testcopy.OppositesB}.
	 * It is bidirectional and its opposite is '{@link testcopy.OppositesB#getManyToOne <em>Many To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>One To Many</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One To Many</em>' containment reference list.
	 * @see testcopy.TestcopyPackage#getOppositesA_OneToMany()
	 * @see testcopy.OppositesB#getManyToOne
	 * @model opposite="manyToOne" containment="true"
	 * @generated
	 */
	EList<OppositesB> getOneToMany();

	/**
	 * Returns the value of the '<em><b>Many To Many</b></em>' reference list.
	 * The list contents are of type {@link testcopy.OppositesB}.
	 * It is bidirectional and its opposite is '{@link testcopy.OppositesB#getManyToMany <em>Many To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Many To Many</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Many To Many</em>' reference list.
	 * @see testcopy.TestcopyPackage#getOppositesA_ManyToMany()
	 * @see testcopy.OppositesB#getManyToMany
	 * @model opposite="manyToMany"
	 * @generated
	 */
	EList<OppositesB> getManyToMany();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see testcopy.TestcopyPackage#getOppositesA_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link testcopy.OppositesA#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // OppositesA
