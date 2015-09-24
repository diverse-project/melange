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
 * A representation of the literals of the enumeration '<em><b>Parameter Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.csu.idl.idlmm.IdlmmPackage#getParameterMode()
 * @model
 * @generated
 */
public enum ParameterMode implements Enumerator {
	/**
	 * The '<em><b>PARAM IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAM_IN_VALUE
	 * @generated
	 * @ordered
	 */
	PARAM_IN(0, "PARAM_IN", "PARAM_IN"),

	/**
	 * The '<em><b>PARAM OUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAM_OUT_VALUE
	 * @generated
	 * @ordered
	 */
	PARAM_OUT(1, "PARAM_OUT", "PARAM_OUT"),

	/**
	 * The '<em><b>PARAM INOUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAM_INOUT_VALUE
	 * @generated
	 * @ordered
	 */
	PARAM_INOUT(2, "PARAM_INOUT", "PARAM_INOUT");

	/**
	 * The '<em><b>PARAM IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PARAM IN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARAM_IN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PARAM_IN_VALUE = 0;

	/**
	 * The '<em><b>PARAM OUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PARAM OUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARAM_OUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PARAM_OUT_VALUE = 1;

	/**
	 * The '<em><b>PARAM INOUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PARAM INOUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARAM_INOUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PARAM_INOUT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Parameter Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ParameterMode[] VALUES_ARRAY =
		new ParameterMode[] {
			PARAM_IN,
			PARAM_OUT,
			PARAM_INOUT,
		};

	/**
	 * A public read-only list of all the '<em><b>Parameter Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ParameterMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Parameter Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParameterMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParameterMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parameter Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParameterMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParameterMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parameter Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParameterMode get(int value) {
		switch (value) {
			case PARAM_IN_VALUE: return PARAM_IN;
			case PARAM_OUT_VALUE: return PARAM_OUT;
			case PARAM_INOUT_VALUE: return PARAM_INOUT;
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
	private ParameterMode(int value, String name, String literal) {
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
	
} //ParameterMode
