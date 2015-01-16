/**
 */
package exhaustive;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Unserializable Enum Test</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see exhaustive.ExhaustivePackage#getUnserializableEnumTest()
 * @model
 * @generated
 */
public enum UnserializableEnumTest implements Enumerator {
	/**
	 * The '<em><b>Name1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAME1_VALUE
	 * @generated
	 * @ordered
	 */
	NAME1(1, "name1", "literal1"),

	/**
	 * The '<em><b>Name2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAME2_VALUE
	 * @generated
	 * @ordered
	 */
	NAME2(2, "name2", "literal2");

	/**
	 * The '<em><b>Name1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Name1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAME1
	 * @model name="name1" literal="literal1"
	 * @generated
	 * @ordered
	 */
	public static final int NAME1_VALUE = 1;

	/**
	 * The '<em><b>Name2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Name2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAME2
	 * @model name="name2" literal="literal2"
	 * @generated
	 * @ordered
	 */
	public static final int NAME2_VALUE = 2;

	/**
	 * An array of all the '<em><b>Unserializable Enum Test</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UnserializableEnumTest[] VALUES_ARRAY =
		new UnserializableEnumTest[] {
			NAME1,
			NAME2,
		};

	/**
	 * A public read-only list of all the '<em><b>Unserializable Enum Test</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UnserializableEnumTest> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Unserializable Enum Test</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UnserializableEnumTest get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnserializableEnumTest result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unserializable Enum Test</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UnserializableEnumTest getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnserializableEnumTest result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unserializable Enum Test</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UnserializableEnumTest get(int value) {
		switch (value) {
			case NAME1_VALUE: return NAME1;
			case NAME2_VALUE: return NAME2;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private UnserializableEnumTest(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //UnserializableEnumTest
