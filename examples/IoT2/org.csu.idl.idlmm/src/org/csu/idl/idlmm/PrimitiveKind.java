/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.csu.idl.idlmm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Primitive Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.csu.idl.idlmm.IdlmmPackage#getPrimitiveKind()
 * @model
 * @generated
 */
public enum PrimitiveKind implements Enumerator {
	/**
	 * The '<em><b>PK NULL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PK_NULL_VALUE
	 * @generated
	 * @ordered
	 */
	PK_NULL(0, "PK_NULL", "PK_NULL"),

	/**
	 * The '<em><b>PK VOID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PK_VOID_VALUE
	 * @generated
	 * @ordered
	 */
	PK_VOID(1, "PK_VOID", "PK_VOID"),

	/**
	 * The '<em><b>PK SHORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PK_SHORT_VALUE
	 * @generated
	 * @ordered
	 */
	PK_SHORT(2, "PK_SHORT", "PK_SHORT"),

	/**
	 * The '<em><b>PK LONG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PK_LONG_VALUE
	 * @generated
	 * @ordered
	 */
	PK_LONG(3, "PK_LONG", "PK_LONG"),

	/**
	 * The '<em><b>PK USHORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PK_USHORT_VALUE
	 * @generated
	 * @ordered
	 */
	PK_USHORT(4, "PK_USHORT", "PK_USHORT"),

	/**
	 * The '<em><b>PK ULONG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PK_ULONG_VALUE
	 * @generated
	 * @ordered
	 */
	PK_ULONG(5, "PK_ULONG", "PK_ULONG"),

	/**
	 * The '<em><b>PK FLOAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PK_FLOAT_VALUE
	 * @generated
	 * @ordered
	 */
	PK_FLOAT(6, "PK_FLOAT", "PK_FLOAT"),

	/**
	 * The '<em><b>PK DOUBLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PK_DOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	PK_DOUBLE(7, "PK_DOUBLE", "PK_DOUBLE"),

	/**
	 * The '<em><b>PK BOOLEAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PK_BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	PK_BOOLEAN(8, "PK_BOOLEAN", "PK_BOOLEAN"),

	/**
	 * The '<em><b>PK CHAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PK_CHAR_VALUE
	 * @generated
	 * @ordered
	 */
	PK_CHAR(9, "PK_CHAR", "PK_CHAR"),

	/**
	 * The '<em><b>PK OCTET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PK_OCTET_VALUE
	 * @generated
	 * @ordered
	 */
	PK_OCTET(10, "PK_OCTET", "PK_OCTET"),

	/**
	 * The '<em><b>PK ANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PK_ANY_VALUE
	 * @generated
	 * @ordered
	 */
	PK_ANY(11, "PK_ANY", "PK_ANY"),

	/**
	 * The '<em><b>PK LONGDOUBLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PK_LONGDOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	PK_LONGDOUBLE(12, "PK_LONGDOUBLE", "PK_LONGDOUBLE"),

	/**
	 * The '<em><b>PK WSTRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PK_WSTRING_VALUE
	 * @generated
	 * @ordered
	 */
	PK_WSTRING(13, "PK_WSTRING", "PK_WSTRING"),

	/**
	 * The '<em><b>PK TYPECODE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PK_TYPECODE_VALUE
	 * @generated
	 * @ordered
	 */
	PK_TYPECODE(14, "PK_TYPECODE", "PK_TYPECODE"),

	/**
	 * The '<em><b>PK WCHAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PK_WCHAR_VALUE
	 * @generated
	 * @ordered
	 */
	PK_WCHAR(15, "PK_WCHAR", "PK_WCHAR"),

	/**
	 * The '<em><b>PK PRINCIPAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PK_PRINCIPAL_VALUE
	 * @generated
	 * @ordered
	 */
	PK_PRINCIPAL(16, "PK_PRINCIPAL", "PK_PRINCIPAL"),

	/**
	 * The '<em><b>PK STRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PK_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	PK_STRING(17, "PK_STRING", "PK_STRING"),

	/**
	 * The '<em><b>PK ULONGLONG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PK_ULONGLONG_VALUE
	 * @generated
	 * @ordered
	 */
	PK_ULONGLONG(18, "PK_ULONGLONG", "PK_ULONGLONG"),

	/**
	 * The '<em><b>PK OBJREF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PK_OBJREF_VALUE
	 * @generated
	 * @ordered
	 */
	PK_OBJREF(19, "PK_OBJREF", "PK_OBJREF"),

	/**
	 * The '<em><b>PK LONGLONG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PK_LONGLONG_VALUE
	 * @generated
	 * @ordered
	 */
	PK_LONGLONG(20, "PK_LONGLONG", "PK_LONGLONG");

	/**
	 * The '<em><b>PK NULL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PK NULL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PK_NULL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PK_NULL_VALUE = 0;

	/**
	 * The '<em><b>PK VOID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PK VOID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PK_VOID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PK_VOID_VALUE = 1;

	/**
	 * The '<em><b>PK SHORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PK SHORT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PK_SHORT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PK_SHORT_VALUE = 2;

	/**
	 * The '<em><b>PK LONG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PK LONG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PK_LONG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PK_LONG_VALUE = 3;

	/**
	 * The '<em><b>PK USHORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PK USHORT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PK_USHORT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PK_USHORT_VALUE = 4;

	/**
	 * The '<em><b>PK ULONG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PK ULONG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PK_ULONG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PK_ULONG_VALUE = 5;

	/**
	 * The '<em><b>PK FLOAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PK FLOAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PK_FLOAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PK_FLOAT_VALUE = 6;

	/**
	 * The '<em><b>PK DOUBLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PK DOUBLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PK_DOUBLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PK_DOUBLE_VALUE = 7;

	/**
	 * The '<em><b>PK BOOLEAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PK BOOLEAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PK_BOOLEAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PK_BOOLEAN_VALUE = 8;

	/**
	 * The '<em><b>PK CHAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PK CHAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PK_CHAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PK_CHAR_VALUE = 9;

	/**
	 * The '<em><b>PK OCTET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PK OCTET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PK_OCTET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PK_OCTET_VALUE = 10;

	/**
	 * The '<em><b>PK ANY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PK ANY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PK_ANY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PK_ANY_VALUE = 11;

	/**
	 * The '<em><b>PK LONGDOUBLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PK LONGDOUBLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PK_LONGDOUBLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PK_LONGDOUBLE_VALUE = 12;

	/**
	 * The '<em><b>PK WSTRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PK WSTRING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PK_WSTRING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PK_WSTRING_VALUE = 13;

	/**
	 * The '<em><b>PK TYPECODE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PK TYPECODE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PK_TYPECODE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PK_TYPECODE_VALUE = 14;

	/**
	 * The '<em><b>PK WCHAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PK WCHAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PK_WCHAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PK_WCHAR_VALUE = 15;

	/**
	 * The '<em><b>PK PRINCIPAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PK PRINCIPAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PK_PRINCIPAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PK_PRINCIPAL_VALUE = 16;

	/**
	 * The '<em><b>PK STRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PK STRING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PK_STRING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PK_STRING_VALUE = 17;

	/**
	 * The '<em><b>PK ULONGLONG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PK ULONGLONG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PK_ULONGLONG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PK_ULONGLONG_VALUE = 18;

	/**
	 * The '<em><b>PK OBJREF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PK OBJREF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PK_OBJREF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PK_OBJREF_VALUE = 19;

	/**
	 * The '<em><b>PK LONGLONG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PK LONGLONG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PK_LONGLONG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PK_LONGLONG_VALUE = 20;

	/**
	 * An array of all the '<em><b>Primitive Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PrimitiveKind[] VALUES_ARRAY =
		new PrimitiveKind[] {
			PK_NULL,
			PK_VOID,
			PK_SHORT,
			PK_LONG,
			PK_USHORT,
			PK_ULONG,
			PK_FLOAT,
			PK_DOUBLE,
			PK_BOOLEAN,
			PK_CHAR,
			PK_OCTET,
			PK_ANY,
			PK_LONGDOUBLE,
			PK_WSTRING,
			PK_TYPECODE,
			PK_WCHAR,
			PK_PRINCIPAL,
			PK_STRING,
			PK_ULONGLONG,
			PK_OBJREF,
			PK_LONGLONG,
		};

	/**
	 * A public read-only list of all the '<em><b>Primitive Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PrimitiveKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Primitive Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrimitiveKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrimitiveKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Primitive Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrimitiveKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrimitiveKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Primitive Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrimitiveKind get(int value) {
		switch (value) {
			case PK_NULL_VALUE: return PK_NULL;
			case PK_VOID_VALUE: return PK_VOID;
			case PK_SHORT_VALUE: return PK_SHORT;
			case PK_LONG_VALUE: return PK_LONG;
			case PK_USHORT_VALUE: return PK_USHORT;
			case PK_ULONG_VALUE: return PK_ULONG;
			case PK_FLOAT_VALUE: return PK_FLOAT;
			case PK_DOUBLE_VALUE: return PK_DOUBLE;
			case PK_BOOLEAN_VALUE: return PK_BOOLEAN;
			case PK_CHAR_VALUE: return PK_CHAR;
			case PK_OCTET_VALUE: return PK_OCTET;
			case PK_ANY_VALUE: return PK_ANY;
			case PK_LONGDOUBLE_VALUE: return PK_LONGDOUBLE;
			case PK_WSTRING_VALUE: return PK_WSTRING;
			case PK_TYPECODE_VALUE: return PK_TYPECODE;
			case PK_WCHAR_VALUE: return PK_WCHAR;
			case PK_PRINCIPAL_VALUE: return PK_PRINCIPAL;
			case PK_STRING_VALUE: return PK_STRING;
			case PK_ULONGLONG_VALUE: return PK_ULONGLONG;
			case PK_OBJREF_VALUE: return PK_OBJREF;
			case PK_LONGLONG_VALUE: return PK_LONGLONG;
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
	private PrimitiveKind(int value, String name, String literal) {
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
	
} //PrimitiveKind
