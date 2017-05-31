/**
 */
package testcopy;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see testcopy.TestcopyFactory
 * @model kind="package"
 * @generated
 */
public interface TestcopyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "testcopy";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://testcopy";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "testcopy";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestcopyPackage eINSTANCE = testcopy.impl.TestcopyPackageImpl.init();

	/**
	 * The meta object id for the '{@link testcopy.impl.AttributesImpl <em>Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testcopy.impl.AttributesImpl
	 * @see testcopy.impl.TestcopyPackageImpl#getAttributes()
	 * @generated
	 */
	int ATTRIBUTES = 0;

	/**
	 * The feature id for the '<em><b>Int Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__INT_ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Enum Attibute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__ENUM_ATTIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link testcopy.impl.SimpleReferencesImpl <em>Simple References</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testcopy.impl.SimpleReferencesImpl
	 * @see testcopy.impl.TestcopyPackageImpl#getSimpleReferences()
	 * @generated
	 */
	int SIMPLE_REFERENCES = 1;

	/**
	 * The feature id for the '<em><b>Simple Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_REFERENCES__SIMPLE_REF = 0;

	/**
	 * The feature id for the '<em><b>Containment Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_REFERENCES__CONTAINMENT_REF = 1;

	/**
	 * The number of structural features of the '<em>Simple References</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_REFERENCES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Simple References</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_REFERENCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link testcopy.impl.OppositesAImpl <em>Opposites A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testcopy.impl.OppositesAImpl
	 * @see testcopy.impl.TestcopyPackageImpl#getOppositesA()
	 * @generated
	 */
	int OPPOSITES_A = 2;

	/**
	 * The feature id for the '<em><b>To B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITES_A__TO_B = 0;

	/**
	 * The feature id for the '<em><b>One To Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITES_A__ONE_TO_MANY = 1;

	/**
	 * The feature id for the '<em><b>Many To Many</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITES_A__MANY_TO_MANY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITES_A__NAME = 3;

	/**
	 * The number of structural features of the '<em>Opposites A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITES_A_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Opposites A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITES_A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link testcopy.impl.OppositesBImpl <em>Opposites B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testcopy.impl.OppositesBImpl
	 * @see testcopy.impl.TestcopyPackageImpl#getOppositesB()
	 * @generated
	 */
	int OPPOSITES_B = 3;

	/**
	 * The feature id for the '<em><b>To A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITES_B__TO_A = 0;

	/**
	 * The feature id for the '<em><b>Many To One</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITES_B__MANY_TO_ONE = 1;

	/**
	 * The feature id for the '<em><b>Many To Many</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITES_B__MANY_TO_MANY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITES_B__NAME = 3;

	/**
	 * The number of structural features of the '<em>Opposites B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITES_B_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Opposites B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITES_B_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link testcopy.MyEnum <em>My Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testcopy.MyEnum
	 * @see testcopy.impl.TestcopyPackageImpl#getMyEnum()
	 * @generated
	 */
	int MY_ENUM = 4;


	/**
	 * Returns the meta object for class '{@link testcopy.Attributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributes</em>'.
	 * @see testcopy.Attributes
	 * @generated
	 */
	EClass getAttributes();

	/**
	 * Returns the meta object for the attribute '{@link testcopy.Attributes#getIntAttribute <em>Int Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int Attribute</em>'.
	 * @see testcopy.Attributes#getIntAttribute()
	 * @see #getAttributes()
	 * @generated
	 */
	EAttribute getAttributes_IntAttribute();

	/**
	 * Returns the meta object for the attribute '{@link testcopy.Attributes#getEnumAttibute <em>Enum Attibute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enum Attibute</em>'.
	 * @see testcopy.Attributes#getEnumAttibute()
	 * @see #getAttributes()
	 * @generated
	 */
	EAttribute getAttributes_EnumAttibute();

	/**
	 * Returns the meta object for class '{@link testcopy.SimpleReferences <em>Simple References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple References</em>'.
	 * @see testcopy.SimpleReferences
	 * @generated
	 */
	EClass getSimpleReferences();

	/**
	 * Returns the meta object for the reference '{@link testcopy.SimpleReferences#getSimpleRef <em>Simple Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Simple Ref</em>'.
	 * @see testcopy.SimpleReferences#getSimpleRef()
	 * @see #getSimpleReferences()
	 * @generated
	 */
	EReference getSimpleReferences_SimpleRef();

	/**
	 * Returns the meta object for the containment reference list '{@link testcopy.SimpleReferences#getContainmentRef <em>Containment Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containment Ref</em>'.
	 * @see testcopy.SimpleReferences#getContainmentRef()
	 * @see #getSimpleReferences()
	 * @generated
	 */
	EReference getSimpleReferences_ContainmentRef();

	/**
	 * Returns the meta object for class '{@link testcopy.OppositesA <em>Opposites A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opposites A</em>'.
	 * @see testcopy.OppositesA
	 * @generated
	 */
	EClass getOppositesA();

	/**
	 * Returns the meta object for the reference '{@link testcopy.OppositesA#getToB <em>To B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To B</em>'.
	 * @see testcopy.OppositesA#getToB()
	 * @see #getOppositesA()
	 * @generated
	 */
	EReference getOppositesA_ToB();

	/**
	 * Returns the meta object for the containment reference list '{@link testcopy.OppositesA#getOneToMany <em>One To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>One To Many</em>'.
	 * @see testcopy.OppositesA#getOneToMany()
	 * @see #getOppositesA()
	 * @generated
	 */
	EReference getOppositesA_OneToMany();

	/**
	 * Returns the meta object for the reference list '{@link testcopy.OppositesA#getManyToMany <em>Many To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Many To Many</em>'.
	 * @see testcopy.OppositesA#getManyToMany()
	 * @see #getOppositesA()
	 * @generated
	 */
	EReference getOppositesA_ManyToMany();

	/**
	 * Returns the meta object for the attribute '{@link testcopy.OppositesA#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see testcopy.OppositesA#getName()
	 * @see #getOppositesA()
	 * @generated
	 */
	EAttribute getOppositesA_Name();

	/**
	 * Returns the meta object for class '{@link testcopy.OppositesB <em>Opposites B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opposites B</em>'.
	 * @see testcopy.OppositesB
	 * @generated
	 */
	EClass getOppositesB();

	/**
	 * Returns the meta object for the reference '{@link testcopy.OppositesB#getToA <em>To A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To A</em>'.
	 * @see testcopy.OppositesB#getToA()
	 * @see #getOppositesB()
	 * @generated
	 */
	EReference getOppositesB_ToA();

	/**
	 * Returns the meta object for the container reference '{@link testcopy.OppositesB#getManyToOne <em>Many To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Many To One</em>'.
	 * @see testcopy.OppositesB#getManyToOne()
	 * @see #getOppositesB()
	 * @generated
	 */
	EReference getOppositesB_ManyToOne();

	/**
	 * Returns the meta object for the reference list '{@link testcopy.OppositesB#getManyToMany <em>Many To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Many To Many</em>'.
	 * @see testcopy.OppositesB#getManyToMany()
	 * @see #getOppositesB()
	 * @generated
	 */
	EReference getOppositesB_ManyToMany();

	/**
	 * Returns the meta object for the attribute '{@link testcopy.OppositesB#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see testcopy.OppositesB#getName()
	 * @see #getOppositesB()
	 * @generated
	 */
	EAttribute getOppositesB_Name();

	/**
	 * Returns the meta object for enum '{@link testcopy.MyEnum <em>My Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>My Enum</em>'.
	 * @see testcopy.MyEnum
	 * @generated
	 */
	EEnum getMyEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestcopyFactory getTestcopyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link testcopy.impl.AttributesImpl <em>Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testcopy.impl.AttributesImpl
		 * @see testcopy.impl.TestcopyPackageImpl#getAttributes()
		 * @generated
		 */
		EClass ATTRIBUTES = eINSTANCE.getAttributes();

		/**
		 * The meta object literal for the '<em><b>Int Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES__INT_ATTRIBUTE = eINSTANCE.getAttributes_IntAttribute();

		/**
		 * The meta object literal for the '<em><b>Enum Attibute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES__ENUM_ATTIBUTE = eINSTANCE.getAttributes_EnumAttibute();

		/**
		 * The meta object literal for the '{@link testcopy.impl.SimpleReferencesImpl <em>Simple References</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testcopy.impl.SimpleReferencesImpl
		 * @see testcopy.impl.TestcopyPackageImpl#getSimpleReferences()
		 * @generated
		 */
		EClass SIMPLE_REFERENCES = eINSTANCE.getSimpleReferences();

		/**
		 * The meta object literal for the '<em><b>Simple Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_REFERENCES__SIMPLE_REF = eINSTANCE.getSimpleReferences_SimpleRef();

		/**
		 * The meta object literal for the '<em><b>Containment Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_REFERENCES__CONTAINMENT_REF = eINSTANCE.getSimpleReferences_ContainmentRef();

		/**
		 * The meta object literal for the '{@link testcopy.impl.OppositesAImpl <em>Opposites A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testcopy.impl.OppositesAImpl
		 * @see testcopy.impl.TestcopyPackageImpl#getOppositesA()
		 * @generated
		 */
		EClass OPPOSITES_A = eINSTANCE.getOppositesA();

		/**
		 * The meta object literal for the '<em><b>To B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPPOSITES_A__TO_B = eINSTANCE.getOppositesA_ToB();

		/**
		 * The meta object literal for the '<em><b>One To Many</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPPOSITES_A__ONE_TO_MANY = eINSTANCE.getOppositesA_OneToMany();

		/**
		 * The meta object literal for the '<em><b>Many To Many</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPPOSITES_A__MANY_TO_MANY = eINSTANCE.getOppositesA_ManyToMany();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPPOSITES_A__NAME = eINSTANCE.getOppositesA_Name();

		/**
		 * The meta object literal for the '{@link testcopy.impl.OppositesBImpl <em>Opposites B</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testcopy.impl.OppositesBImpl
		 * @see testcopy.impl.TestcopyPackageImpl#getOppositesB()
		 * @generated
		 */
		EClass OPPOSITES_B = eINSTANCE.getOppositesB();

		/**
		 * The meta object literal for the '<em><b>To A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPPOSITES_B__TO_A = eINSTANCE.getOppositesB_ToA();

		/**
		 * The meta object literal for the '<em><b>Many To One</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPPOSITES_B__MANY_TO_ONE = eINSTANCE.getOppositesB_ManyToOne();

		/**
		 * The meta object literal for the '<em><b>Many To Many</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPPOSITES_B__MANY_TO_MANY = eINSTANCE.getOppositesB_ManyToMany();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPPOSITES_B__NAME = eINSTANCE.getOppositesB_Name();

		/**
		 * The meta object literal for the '{@link testcopy.MyEnum <em>My Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testcopy.MyEnum
		 * @see testcopy.impl.TestcopyPackageImpl#getMyEnum()
		 * @generated
		 */
		EEnum MY_ENUM = eINSTANCE.getMyEnum();

	}

} //TestcopyPackage
