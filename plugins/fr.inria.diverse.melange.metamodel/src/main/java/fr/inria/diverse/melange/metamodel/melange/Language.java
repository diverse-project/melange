/**
 */
package fr.inria.diverse.melange.metamodel.melange;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Language#getOperators <em>Operators</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Language#getExactType <em>Exact Type</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Language#getImplements <em>Implements</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Language#getRequires <em>Requires</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Language#getSyntax <em>Syntax</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Language#getExactTypeName <em>Exact Type Name</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Language#getExactTypeUri <em>Exact Type Uri</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Language#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Language#getResourceUri <em>Resource Uri</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Language#getXtextSetupRef <em>Xtext Setup Ref</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Language#getMappings <em>Mappings</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.Language#getSemantics <em>Semantics</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getLanguage()
 * @model
 * @generated
 */
public interface Language extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Operators</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.melange.metamodel.melange.Operator}.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.melange.metamodel.melange.Operator#getOwningLanguage <em>Owning Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operators</em>' containment reference list.
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getLanguage_Operators()
	 * @see fr.inria.diverse.melange.metamodel.melange.Operator#getOwningLanguage
	 * @model opposite="owningLanguage" containment="true"
	 * @generated
	 */
	EList<Operator> getOperators();

	/**
	 * Returns the value of the '<em><b>Exact Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.melange.metamodel.melange.ModelType#getExtracted <em>Extracted</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exact Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exact Type</em>' reference.
	 * @see #setExactType(ModelType)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getLanguage_ExactType()
	 * @see fr.inria.diverse.melange.metamodel.melange.ModelType#getExtracted
	 * @model opposite="extracted"
	 * @generated
	 */
	ModelType getExactType();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.Language#getExactType <em>Exact Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exact Type</em>' reference.
	 * @see #getExactType()
	 * @generated
	 */
	void setExactType(ModelType value);

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.diverse.melange.metamodel.melange.ModelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference list.
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getLanguage_Implements()
	 * @model
	 * @generated
	 */
	EList<ModelType> getImplements();

	/**
	 * Returns the value of the '<em><b>Requires</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.diverse.melange.metamodel.melange.ModelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' reference list.
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getLanguage_Requires()
	 * @model
	 * @generated
	 */
	EList<ModelType> getRequires();

	/**
	 * Returns the value of the '<em><b>Syntax</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.melange.metamodel.melange.Metamodel#getOwningLanguage <em>Owning Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Syntax</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Syntax</em>' containment reference.
	 * @see #setSyntax(Metamodel)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getLanguage_Syntax()
	 * @see fr.inria.diverse.melange.metamodel.melange.Metamodel#getOwningLanguage
	 * @model opposite="owningLanguage" containment="true" required="true"
	 * @generated
	 */
	Metamodel getSyntax();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.Language#getSyntax <em>Syntax</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Syntax</em>' containment reference.
	 * @see #getSyntax()
	 * @generated
	 */
	void setSyntax(Metamodel value);

	/**
	 * Returns the value of the '<em><b>Exact Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exact Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exact Type Name</em>' attribute.
	 * @see #setExactTypeName(String)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getLanguage_ExactTypeName()
	 * @model
	 * @generated
	 */
	String getExactTypeName();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.Language#getExactTypeName <em>Exact Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exact Type Name</em>' attribute.
	 * @see #getExactTypeName()
	 * @generated
	 */
	void setExactTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Exact Type Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exact Type Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exact Type Uri</em>' attribute.
	 * @see #setExactTypeUri(String)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getLanguage_ExactTypeUri()
	 * @model
	 * @generated
	 */
	String getExactTypeUri();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.Language#getExactTypeUri <em>Exact Type Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exact Type Uri</em>' attribute.
	 * @see #getExactTypeUri()
	 * @generated
	 */
	void setExactTypeUri(String value);

	/**
	 * Returns the value of the '<em><b>Resource Type</b></em>' attribute.
	 * The default value is <code>"MELANGE"</code>.
	 * The literals are from the enumeration {@link fr.inria.diverse.melange.metamodel.melange.ResourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Type</em>' attribute.
	 * @see fr.inria.diverse.melange.metamodel.melange.ResourceType
	 * @see #setResourceType(ResourceType)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getLanguage_ResourceType()
	 * @model default="MELANGE"
	 * @generated
	 */
	ResourceType getResourceType();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.Language#getResourceType <em>Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Type</em>' attribute.
	 * @see fr.inria.diverse.melange.metamodel.melange.ResourceType
	 * @see #getResourceType()
	 * @generated
	 */
	void setResourceType(ResourceType value);

	/**
	 * Returns the value of the '<em><b>Resource Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Uri</em>' attribute.
	 * @see #setResourceUri(String)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getLanguage_ResourceUri()
	 * @model
	 * @generated
	 */
	String getResourceUri();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.Language#getResourceUri <em>Resource Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Uri</em>' attribute.
	 * @see #getResourceUri()
	 * @generated
	 */
	void setResourceUri(String value);

	/**
	 * Returns the value of the '<em><b>Xtext Setup Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xtext Setup Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xtext Setup Ref</em>' containment reference.
	 * @see #setXtextSetupRef(JvmTypeReference)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getLanguage_XtextSetupRef()
	 * @model containment="true"
	 * @generated
	 */
	JvmTypeReference getXtextSetupRef();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.Language#getXtextSetupRef <em>Xtext Setup Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xtext Setup Ref</em>' containment reference.
	 * @see #getXtextSetupRef()
	 * @generated
	 */
	void setXtextSetupRef(JvmTypeReference value);

	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.diverse.melange.metamodel.melange.Mapping}.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.melange.metamodel.melange.Mapping#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' reference list.
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getLanguage_Mappings()
	 * @see fr.inria.diverse.melange.metamodel.melange.Mapping#getFrom
	 * @model opposite="from" resolveProxies="false"
	 * @generated
	 */
	EList<Mapping> getMappings();

	/**
	 * Returns the value of the '<em><b>Semantics</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.diverse.melange.metamodel.melange.Aspect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantics</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantics</em>' reference list.
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getLanguage_Semantics()
	 * @model
	 * @generated
	 */
	EList<Aspect> getSemantics();

} // Language
