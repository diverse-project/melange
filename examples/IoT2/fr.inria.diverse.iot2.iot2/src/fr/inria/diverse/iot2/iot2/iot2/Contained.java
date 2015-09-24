/**
 */
package fr.inria.diverse.iot2.iot2.iot2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contained</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.Contained#getRepositoryId <em>Repository Id</em>}</li>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.Contained#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.Contained#getAbsoluteName <em>Absolute Name</em>}</li>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.Contained#getDefinedIn <em>Defined In</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getContained()
 * @model abstract="true"
 * @generated
 */
public interface Contained extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Repository Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository Id</em>' attribute.
	 * @see #setRepositoryId(String)
	 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getContained_RepositoryId()
	 * @model
	 * @generated
	 */
	String getRepositoryId();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.iot2.iot2.iot2.Contained#getRepositoryId <em>Repository Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository Id</em>' attribute.
	 * @see #getRepositoryId()
	 * @generated
	 */
	void setRepositoryId(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getContained_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.iot2.iot2.iot2.Contained#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Absolute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Absolute Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Absolute Name</em>' attribute.
	 * @see #setAbsoluteName(String)
	 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getContained_AbsoluteName()
	 * @model
	 * @generated
	 */
	String getAbsoluteName();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.iot2.iot2.iot2.Contained#getAbsoluteName <em>Absolute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Absolute Name</em>' attribute.
	 * @see #getAbsoluteName()
	 * @generated
	 */
	void setAbsoluteName(String value);

	/**
	 * Returns the value of the '<em><b>Defined In</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.iot2.iot2.iot2.Container#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defined In</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined In</em>' container reference.
	 * @see #setDefinedIn(Container)
	 * @see fr.inria.diverse.iot2.iot2.iot2.Iot2Package#getContained_DefinedIn()
	 * @see fr.inria.diverse.iot2.iot2.iot2.Container#getContains
	 * @model opposite="contains" transient="false"
	 * @generated
	 */
	Container getDefinedIn();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.iot2.iot2.iot2.Contained#getDefinedIn <em>Defined In</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defined In</em>' container reference.
	 * @see #getDefinedIn()
	 * @generated
	 */
	void setDefinedIn(Container value);

} // Contained
