/**
 */
package testcopy.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import testcopy.Attributes;
import testcopy.MyEnum;
import testcopy.TestcopyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link testcopy.impl.AttributesImpl#getIntAttribute <em>Int Attribute</em>}</li>
 *   <li>{@link testcopy.impl.AttributesImpl#getEnumAttibute <em>Enum Attibute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributesImpl extends MinimalEObjectImpl.Container implements Attributes {
	/**
	 * The default value of the '{@link #getIntAttribute() <em>Int Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final int INT_ATTRIBUTE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIntAttribute() <em>Int Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntAttribute()
	 * @generated
	 * @ordered
	 */
	protected int intAttribute = INT_ATTRIBUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnumAttibute() <em>Enum Attibute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumAttibute()
	 * @generated
	 * @ordered
	 */
	protected static final MyEnum ENUM_ATTIBUTE_EDEFAULT = MyEnum.ITEM1;

	/**
	 * The cached value of the '{@link #getEnumAttibute() <em>Enum Attibute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumAttibute()
	 * @generated
	 * @ordered
	 */
	protected MyEnum enumAttibute = ENUM_ATTIBUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestcopyPackage.Literals.ATTRIBUTES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIntAttribute() {
		return intAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntAttribute(int newIntAttribute) {
		int oldIntAttribute = intAttribute;
		intAttribute = newIntAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestcopyPackage.ATTRIBUTES__INT_ATTRIBUTE, oldIntAttribute, intAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyEnum getEnumAttibute() {
		return enumAttibute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumAttibute(MyEnum newEnumAttibute) {
		MyEnum oldEnumAttibute = enumAttibute;
		enumAttibute = newEnumAttibute == null ? ENUM_ATTIBUTE_EDEFAULT : newEnumAttibute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestcopyPackage.ATTRIBUTES__ENUM_ATTIBUTE, oldEnumAttibute, enumAttibute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestcopyPackage.ATTRIBUTES__INT_ATTRIBUTE:
				return getIntAttribute();
			case TestcopyPackage.ATTRIBUTES__ENUM_ATTIBUTE:
				return getEnumAttibute();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TestcopyPackage.ATTRIBUTES__INT_ATTRIBUTE:
				setIntAttribute((Integer)newValue);
				return;
			case TestcopyPackage.ATTRIBUTES__ENUM_ATTIBUTE:
				setEnumAttibute((MyEnum)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TestcopyPackage.ATTRIBUTES__INT_ATTRIBUTE:
				setIntAttribute(INT_ATTRIBUTE_EDEFAULT);
				return;
			case TestcopyPackage.ATTRIBUTES__ENUM_ATTIBUTE:
				setEnumAttibute(ENUM_ATTIBUTE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TestcopyPackage.ATTRIBUTES__INT_ATTRIBUTE:
				return intAttribute != INT_ATTRIBUTE_EDEFAULT;
			case TestcopyPackage.ATTRIBUTES__ENUM_ATTIBUTE:
				return enumAttibute != ENUM_ATTIBUTE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (intAttribute: ");
		result.append(intAttribute);
		result.append(", enumAttibute: ");
		result.append(enumAttibute);
		result.append(')');
		return result.toString();
	}

} //AttributesImpl
