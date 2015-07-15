/**
 */
package activitydiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagram.EClass#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link activitydiagram.EClass#isInterface <em>Interface</em>}</li>
 *   <li>{@link activitydiagram.EClass#getESuperTypes <em>ESuper Types</em>}</li>
 *   <li>{@link activitydiagram.EClass#getEOperations <em>EOperations</em>}</li>
 *   <li>{@link activitydiagram.EClass#getEAllAttributes <em>EAll Attributes</em>}</li>
 *   <li>{@link activitydiagram.EClass#getEAllReferences <em>EAll References</em>}</li>
 *   <li>{@link activitydiagram.EClass#getEReferences <em>EReferences</em>}</li>
 *   <li>{@link activitydiagram.EClass#getEAttributes <em>EAttributes</em>}</li>
 *   <li>{@link activitydiagram.EClass#getEAllContainments <em>EAll Containments</em>}</li>
 *   <li>{@link activitydiagram.EClass#getEAllOperations <em>EAll Operations</em>}</li>
 *   <li>{@link activitydiagram.EClass#getEAllStructuralFeatures <em>EAll Structural Features</em>}</li>
 *   <li>{@link activitydiagram.EClass#getEAllSuperTypes <em>EAll Super Types</em>}</li>
 *   <li>{@link activitydiagram.EClass#getEIDAttribute <em>EID Attribute</em>}</li>
 *   <li>{@link activitydiagram.EClass#getEStructuralFeatures <em>EStructural Features</em>}</li>
 *   <li>{@link activitydiagram.EClass#getEGenericSuperTypes <em>EGeneric Super Types</em>}</li>
 *   <li>{@link activitydiagram.EClass#getEAllGenericSuperTypes <em>EAll Generic Super Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagram.EcorePackage#getEClass()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InterfaceIsAbstract AtMostOneID UniqueFeatureNames UniqueOperationSignatures NoCircularSuperTypes WellFormedMapEntryClass ConsistentSuperTypes DisjointFeatureAndOperationSignatures'"
 * @generated
 */
public interface EClass extends EClassifier {
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see activitydiagram.EcorePackage#getEClass_Abstract()
	 * @model dataType="activitydiagram.EBoolean"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link activitydiagram.EClass#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' attribute.
	 * @see #setInterface(boolean)
	 * @see activitydiagram.EcorePackage#getEClass_Interface()
	 * @model dataType="activitydiagram.EBoolean"
	 * @generated
	 */
	boolean isInterface();

	/**
	 * Sets the value of the '{@link activitydiagram.EClass#isInterface <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' attribute.
	 * @see #isInterface()
	 * @generated
	 */
	void setInterface(boolean value);

	/**
	 * Returns the value of the '<em><b>ESuper Types</b></em>' reference list.
	 * The list contents are of type {@link activitydiagram.EClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ESuper Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ESuper Types</em>' reference list.
	 * @see activitydiagram.EcorePackage#getEClass_ESuperTypes()
	 * @model unsettable="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<EClass> getESuperTypes();

	/**
	 * Returns the value of the '<em><b>EOperations</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagram.EOperation}.
	 * It is bidirectional and its opposite is '{@link activitydiagram.EOperation#getEContainingClass <em>EContaining Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EOperations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EOperations</em>' containment reference list.
	 * @see activitydiagram.EcorePackage#getEClass_EOperations()
	 * @see activitydiagram.EOperation#getEContainingClass
	 * @model opposite="eContainingClass" containment="true"
	 * @generated
	 */
	EList<EOperation> getEOperations();

	/**
	 * Returns the value of the '<em><b>EAll Attributes</b></em>' reference list.
	 * The list contents are of type {@link activitydiagram.EAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAll Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAll Attributes</em>' reference list.
	 * @see activitydiagram.EcorePackage#getEClass_EAllAttributes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EAttribute> getEAllAttributes();

	/**
	 * Returns the value of the '<em><b>EAll References</b></em>' reference list.
	 * The list contents are of type {@link activitydiagram.EReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAll References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAll References</em>' reference list.
	 * @see activitydiagram.EcorePackage#getEClass_EAllReferences()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EReference> getEAllReferences();

	/**
	 * Returns the value of the '<em><b>EReferences</b></em>' reference list.
	 * The list contents are of type {@link activitydiagram.EReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReferences</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReferences</em>' reference list.
	 * @see activitydiagram.EcorePackage#getEClass_EReferences()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EReference> getEReferences();

	/**
	 * Returns the value of the '<em><b>EAttributes</b></em>' reference list.
	 * The list contents are of type {@link activitydiagram.EAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAttributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAttributes</em>' reference list.
	 * @see activitydiagram.EcorePackage#getEClass_EAttributes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EAttribute> getEAttributes();

	/**
	 * Returns the value of the '<em><b>EAll Containments</b></em>' reference list.
	 * The list contents are of type {@link activitydiagram.EReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAll Containments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAll Containments</em>' reference list.
	 * @see activitydiagram.EcorePackage#getEClass_EAllContainments()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EReference> getEAllContainments();

	/**
	 * Returns the value of the '<em><b>EAll Operations</b></em>' reference list.
	 * The list contents are of type {@link activitydiagram.EOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAll Operations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAll Operations</em>' reference list.
	 * @see activitydiagram.EcorePackage#getEClass_EAllOperations()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EOperation> getEAllOperations();

	/**
	 * Returns the value of the '<em><b>EAll Structural Features</b></em>' reference list.
	 * The list contents are of type {@link activitydiagram.EStructuralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAll Structural Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAll Structural Features</em>' reference list.
	 * @see activitydiagram.EcorePackage#getEClass_EAllStructuralFeatures()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EStructuralFeature> getEAllStructuralFeatures();

	/**
	 * Returns the value of the '<em><b>EAll Super Types</b></em>' reference list.
	 * The list contents are of type {@link activitydiagram.EClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAll Super Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAll Super Types</em>' reference list.
	 * @see activitydiagram.EcorePackage#getEClass_EAllSuperTypes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EClass> getEAllSuperTypes();

	/**
	 * Returns the value of the '<em><b>EID Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EID Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EID Attribute</em>' reference.
	 * @see activitydiagram.EcorePackage#getEClass_EIDAttribute()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EAttribute getEIDAttribute();

	/**
	 * Returns the value of the '<em><b>EStructural Features</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagram.EStructuralFeature}.
	 * It is bidirectional and its opposite is '{@link activitydiagram.EStructuralFeature#getEContainingClass <em>EContaining Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EStructural Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EStructural Features</em>' containment reference list.
	 * @see activitydiagram.EcorePackage#getEClass_EStructuralFeatures()
	 * @see activitydiagram.EStructuralFeature#getEContainingClass
	 * @model opposite="eContainingClass" containment="true"
	 * @generated
	 */
	EList<EStructuralFeature> getEStructuralFeatures();

	/**
	 * Returns the value of the '<em><b>EGeneric Super Types</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagram.EGenericType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EGeneric Super Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EGeneric Super Types</em>' containment reference list.
	 * @see activitydiagram.EcorePackage#getEClass_EGenericSuperTypes()
	 * @model containment="true" unsettable="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<EGenericType> getEGenericSuperTypes();

	/**
	 * Returns the value of the '<em><b>EAll Generic Super Types</b></em>' reference list.
	 * The list contents are of type {@link activitydiagram.EGenericType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAll Generic Super Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAll Generic Super Types</em>' reference list.
	 * @see activitydiagram.EcorePackage#getEClass_EAllGenericSuperTypes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EGenericType> getEAllGenericSuperTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="activitydiagram.EBoolean"
	 * @generated
	 */
	boolean isSuperTypeOf(EClass someClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="activitydiagram.EInt"
	 * @generated
	 */
	int getFeatureCount();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model featureIDDataType="activitydiagram.EInt"
	 * @generated
	 */
	EStructuralFeature getEStructuralFeature(int featureID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="activitydiagram.EInt"
	 * @generated
	 */
	int getFeatureID(EStructuralFeature feature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model featureNameDataType="activitydiagram.EString"
	 * @generated
	 */
	EStructuralFeature getEStructuralFeature(String featureName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="activitydiagram.EInt"
	 * @generated
	 */
	int getOperationCount();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model operationIDDataType="activitydiagram.EInt"
	 * @generated
	 */
	EOperation getEOperation(int operationID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="activitydiagram.EInt"
	 * @generated
	 */
	int getOperationID(EOperation operation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EOperation getOverride(EOperation operation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EGenericType getFeatureType(EStructuralFeature feature);

} // EClass
