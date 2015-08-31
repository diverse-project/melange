/**
 */
package activitydiagram.impl;

import activitydiagram.ActivitydiagramPackage;
import activitydiagram.Function;
import activitydiagram.Statement_LocalFunction_Declaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement Local Function Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagram.impl.Statement_LocalFunction_DeclarationImpl#getFunctionName <em>Function Name</em>}</li>
 *   <li>{@link activitydiagram.impl.Statement_LocalFunction_DeclarationImpl#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Statement_LocalFunction_DeclarationImpl extends StatementImpl implements Statement_LocalFunction_Declaration {
	/**
	 * The default value of the '{@link #getFunctionName() <em>Function Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionName()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunctionName() <em>Function Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionName()
	 * @generated
	 * @ordered
	 */
	protected String functionName = FUNCTION_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected Function function;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Statement_LocalFunction_DeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.eINSTANCE.getStatement_LocalFunction_Declaration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFunctionName() {
		return functionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionName(String newFunctionName) {
		String oldFunctionName = functionName;
		functionName = newFunctionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION_NAME, oldFunctionName, functionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunction(Function newFunction, NotificationChain msgs) {
		Function oldFunction = function;
		function = newFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION, oldFunction, newFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(Function newFunction) {
		if (newFunction != function) {
			NotificationChain msgs = null;
			if (function != null)
				msgs = ((InternalEObject)function).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION, null, msgs);
			if (newFunction != null)
				msgs = ((InternalEObject)newFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION, null, msgs);
			msgs = basicSetFunction(newFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION, newFunction, newFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitydiagramPackage.STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION:
				return basicSetFunction(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivitydiagramPackage.STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION_NAME:
				return getFunctionName();
			case ActivitydiagramPackage.STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION:
				return getFunction();
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
			case ActivitydiagramPackage.STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION_NAME:
				setFunctionName((String)newValue);
				return;
			case ActivitydiagramPackage.STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION:
				setFunction((Function)newValue);
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
			case ActivitydiagramPackage.STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION_NAME:
				setFunctionName(FUNCTION_NAME_EDEFAULT);
				return;
			case ActivitydiagramPackage.STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION:
				setFunction((Function)null);
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
			case ActivitydiagramPackage.STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION_NAME:
				return FUNCTION_NAME_EDEFAULT == null ? functionName != null : !FUNCTION_NAME_EDEFAULT.equals(functionName);
			case ActivitydiagramPackage.STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION:
				return function != null;
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
		result.append(" (functionName: ");
		result.append(functionName);
		result.append(')');
		return result.toString();
	}

} //Statement_LocalFunction_DeclarationImpl
