/**
 */
package testcopy;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link testcopy.Attributes#getIntAttribute <em>Int Attribute</em>}</li>
 *   <li>{@link testcopy.Attributes#getEnumAttibute <em>Enum Attibute</em>}</li>
 * </ul>
 *
 * @see testcopy.TestcopyPackage#getAttributes()
 * @model
 * @generated
 */
public interface Attributes extends EObject {
	/**
	 * Returns the value of the '<em><b>Int Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Attribute</em>' attribute.
	 * @see #setIntAttribute(int)
	 * @see testcopy.TestcopyPackage#getAttributes_IntAttribute()
	 * @model
	 * @generated
	 */
	int getIntAttribute();

	/**
	 * Sets the value of the '{@link testcopy.Attributes#getIntAttribute <em>Int Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int Attribute</em>' attribute.
	 * @see #getIntAttribute()
	 * @generated
	 */
	void setIntAttribute(int value);

	/**
	 * Returns the value of the '<em><b>Enum Attibute</b></em>' attribute.
	 * The default value is <code>"ITEM1"</code>.
	 * The literals are from the enumeration {@link testcopy.MyEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Attibute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Attibute</em>' attribute.
	 * @see testcopy.MyEnum
	 * @see #setEnumAttibute(MyEnum)
	 * @see testcopy.TestcopyPackage#getAttributes_EnumAttibute()
	 * @model default="ITEM1"
	 * @generated
	 */
	MyEnum getEnumAttibute();

	/**
	 * Sets the value of the '{@link testcopy.Attributes#getEnumAttibute <em>Enum Attibute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Attibute</em>' attribute.
	 * @see testcopy.MyEnum
	 * @see #getEnumAttibute()
	 * @generated
	 */
	void setEnumAttibute(MyEnum value);

} // Attributes
