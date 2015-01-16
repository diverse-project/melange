/**
 */
package exhaustive.impl;

import exhaustive.AbstractTest;
import exhaustive.ExhaustivePackage;
import exhaustive.GenericTest;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link exhaustive.impl.GenericTestImpl#getGenericAttr <em>Generic Attr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenericTestImpl<A, B> extends MinimalEObjectImpl.Container implements GenericTest<A, B> {
	/**
	 * The cached value of the '{@link #getGenericAttr() <em>Generic Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericAttr()
	 * @generated
	 * @ordered
	 */
	protected A genericAttr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExhaustivePackage.Literals.GENERIC_TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A getGenericAttr() {
		return genericAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenericAttr(A newGenericAttr) {
		A oldGenericAttr = genericAttr;
		genericAttr = newGenericAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExhaustivePackage.GENERIC_TEST__GENERIC_ATTR, oldGenericAttr, genericAttr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public B genericOperationReturn() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <C extends AbstractTest> void genericOperationParameters(C foo, GenericTest<A, C> bar) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void genericOperationThrow() throws Exception {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExhaustivePackage.GENERIC_TEST__GENERIC_ATTR:
				return getGenericAttr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExhaustivePackage.GENERIC_TEST__GENERIC_ATTR:
				setGenericAttr((A)newValue);
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
			case ExhaustivePackage.GENERIC_TEST__GENERIC_ATTR:
				setGenericAttr((A)null);
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
			case ExhaustivePackage.GENERIC_TEST__GENERIC_ATTR:
				return genericAttr != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings({"rawtypes", "unchecked" })
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ExhaustivePackage.GENERIC_TEST___GENERIC_OPERATION_RETURN:
				return genericOperationReturn();
			case ExhaustivePackage.GENERIC_TEST___GENERIC_OPERATION_PARAMETERS__ABSTRACTTEST_GENERICTEST:
				genericOperationParameters((AbstractTest)arguments.get(0), (GenericTest)arguments.get(1));
				return null;
			case ExhaustivePackage.GENERIC_TEST___GENERIC_OPERATION_THROW:
				try {
					genericOperationThrow();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (genericAttr: ");
		result.append(genericAttr);
		result.append(')');
		return result.toString();
	}

} //GenericTestImpl
