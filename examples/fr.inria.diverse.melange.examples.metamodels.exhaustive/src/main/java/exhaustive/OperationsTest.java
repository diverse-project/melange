/**
 */
package exhaustive;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operations Test</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see exhaustive.ExhaustivePackage#getOperationsTest()
 * @model
 * @generated
 */
public interface OperationsTest extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void empty();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	byte lowerBound1();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model lower="2"
	 * @generated
	 */
	EList<InterfaceTest> lowerBound2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void orderedNo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void uniqueNo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model upper="2"
	 * @generated
	 */
	EList<SerializableEnumTest> upperBound2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="exhaustive.UnserializableDatatypeTest"
	 * @generated
	 */
	EList<Integer> upperBoundN();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void manyParameters(AbstractTest p1, int p2);

} // OperationsTest
