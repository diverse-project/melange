/**
 */
package exhaustive;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Serializable Enum Test</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see exhaustive.ExhaustivePackage#getSerializableEnumTest()
 * @model
 * @generated
 */
public enum SerializableEnumTest implements Enumerator {
	/**
	 * The '<em><b>Name3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAME3_VALUE
	 * @generated
	 * @ordered
	 */
	NAME3(3, "name3", "literal3"),

	/**
	 * The '<em><b>Name4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAME4_VALUE
	 * @generated
	 * @ordered
	 */
	NAME4(4, "name4", "literal4");

	/**
	 * The '<em><b>Name3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Name3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAME3
	 * @model name="name3" literal="literal3"
	 * @generated
	 * @ordered
	 */
	public static final int NAME3_VALUE = 3;

	/**
	 * The '<em><b>Name4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Name4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAME4
	 * @model name="name4" literal="literal4"
	 * @generated
	 * @ordered
	 */
	public static final int NAME4_VALUE = 4;

	/**
	 * An array of all the '<em><b>Serializable Enum Test</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SerializableEnumTest[] VALUES_ARRAY =
		new SerializableEnumTest[] {
			NAME3,
			NAME4,
		};

	/**
	 * A public read-only list of all the '<em><b>Serializable Enum Test</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SerializableEnumTest> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Serializable Enum Test</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SerializableEnumTest get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SerializableEnumTest result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Serializable Enum Test</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SerializableEnumTest getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SerializableEnumTest result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Serializable Enum Test</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SerializableEnumTest get(int value) {
		switch (value) {
			case NAME3_VALUE: return NAME3;
			case NAME4_VALUE: return NAME4;
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
	private SerializableEnumTest(int value, String name, String literal) {
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
	
} //SerializableEnumTest
