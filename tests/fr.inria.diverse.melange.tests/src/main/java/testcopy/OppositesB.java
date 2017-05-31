/**
 */
package testcopy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opposites B</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link testcopy.OppositesB#getToA <em>To A</em>}</li>
 *   <li>{@link testcopy.OppositesB#getManyToOne <em>Many To One</em>}</li>
 *   <li>{@link testcopy.OppositesB#getManyToMany <em>Many To Many</em>}</li>
 *   <li>{@link testcopy.OppositesB#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see testcopy.TestcopyPackage#getOppositesB()
 * @model
 * @generated
 */
public interface OppositesB extends EObject {
	/**
	 * Returns the value of the '<em><b>To A</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link testcopy.OppositesA#getToB <em>To B</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To A</em>' reference.
	 * @see #setToA(OppositesA)
	 * @see testcopy.TestcopyPackage#getOppositesB_ToA()
	 * @see testcopy.OppositesA#getToB
	 * @model opposite="toB"
	 * @generated
	 */
	OppositesA getToA();

	/**
	 * Sets the value of the '{@link testcopy.OppositesB#getToA <em>To A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To A</em>' reference.
	 * @see #getToA()
	 * @generated
	 */
	void setToA(OppositesA value);

	/**
	 * Returns the value of the '<em><b>Many To One</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link testcopy.OppositesA#getOneToMany <em>One To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Many To One</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Many To One</em>' container reference.
	 * @see #setManyToOne(OppositesA)
	 * @see testcopy.TestcopyPackage#getOppositesB_ManyToOne()
	 * @see testcopy.OppositesA#getOneToMany
	 * @model opposite="oneToMany" transient="false"
	 * @generated
	 */
	OppositesA getManyToOne();

	/**
	 * Sets the value of the '{@link testcopy.OppositesB#getManyToOne <em>Many To One</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Many To One</em>' container reference.
	 * @see #getManyToOne()
	 * @generated
	 */
	void setManyToOne(OppositesA value);

	/**
	 * Returns the value of the '<em><b>Many To Many</b></em>' reference list.
	 * The list contents are of type {@link testcopy.OppositesA}.
	 * It is bidirectional and its opposite is '{@link testcopy.OppositesA#getManyToMany <em>Many To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Many To Many</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Many To Many</em>' reference list.
	 * @see testcopy.TestcopyPackage#getOppositesB_ManyToMany()
	 * @see testcopy.OppositesA#getManyToMany
	 * @model opposite="manyToMany"
	 * @generated
	 */
	EList<OppositesA> getManyToMany();

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
	 * @see testcopy.TestcopyPackage#getOppositesB_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link testcopy.OppositesB#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // OppositesB
