/**
 */
package activitydiagram.impl;

import activitydiagram.ActivitydiagramPackage;
import activitydiagram.Expression;
import activitydiagram.Expression_CallFunction;
import activitydiagram.Functioncall_Arguments;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Call Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagram.impl.Expression_CallFunctionImpl#getObject <em>Object</em>}</li>
 *   <li>{@link activitydiagram.impl.Expression_CallFunctionImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Expression_CallFunctionImpl extends ExpressionImpl implements Expression_CallFunction {
	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected Expression object;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected Functioncall_Arguments arguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Expression_CallFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.eINSTANCE.getExpression_CallFunction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObject(Expression newObject, NotificationChain msgs) {
		Expression oldObject = object;
		object = newObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.EXPRESSION_CALL_FUNCTION__OBJECT, oldObject, newObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(Expression newObject) {
		if (newObject != object) {
			NotificationChain msgs = null;
			if (object != null)
				msgs = ((InternalEObject)object).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.EXPRESSION_CALL_FUNCTION__OBJECT, null, msgs);
			if (newObject != null)
				msgs = ((InternalEObject)newObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.EXPRESSION_CALL_FUNCTION__OBJECT, null, msgs);
			msgs = basicSetObject(newObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.EXPRESSION_CALL_FUNCTION__OBJECT, newObject, newObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Functioncall_Arguments getArguments() {
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArguments(Functioncall_Arguments newArguments, NotificationChain msgs) {
		Functioncall_Arguments oldArguments = arguments;
		arguments = newArguments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.EXPRESSION_CALL_FUNCTION__ARGUMENTS, oldArguments, newArguments);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArguments(Functioncall_Arguments newArguments) {
		if (newArguments != arguments) {
			NotificationChain msgs = null;
			if (arguments != null)
				msgs = ((InternalEObject)arguments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.EXPRESSION_CALL_FUNCTION__ARGUMENTS, null, msgs);
			if (newArguments != null)
				msgs = ((InternalEObject)newArguments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.EXPRESSION_CALL_FUNCTION__ARGUMENTS, null, msgs);
			msgs = basicSetArguments(newArguments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.EXPRESSION_CALL_FUNCTION__ARGUMENTS, newArguments, newArguments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitydiagramPackage.EXPRESSION_CALL_FUNCTION__OBJECT:
				return basicSetObject(null, msgs);
			case ActivitydiagramPackage.EXPRESSION_CALL_FUNCTION__ARGUMENTS:
				return basicSetArguments(null, msgs);
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
			case ActivitydiagramPackage.EXPRESSION_CALL_FUNCTION__OBJECT:
				return getObject();
			case ActivitydiagramPackage.EXPRESSION_CALL_FUNCTION__ARGUMENTS:
				return getArguments();
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
			case ActivitydiagramPackage.EXPRESSION_CALL_FUNCTION__OBJECT:
				setObject((Expression)newValue);
				return;
			case ActivitydiagramPackage.EXPRESSION_CALL_FUNCTION__ARGUMENTS:
				setArguments((Functioncall_Arguments)newValue);
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
			case ActivitydiagramPackage.EXPRESSION_CALL_FUNCTION__OBJECT:
				setObject((Expression)null);
				return;
			case ActivitydiagramPackage.EXPRESSION_CALL_FUNCTION__ARGUMENTS:
				setArguments((Functioncall_Arguments)null);
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
			case ActivitydiagramPackage.EXPRESSION_CALL_FUNCTION__OBJECT:
				return object != null;
			case ActivitydiagramPackage.EXPRESSION_CALL_FUNCTION__ARGUMENTS:
				return arguments != null;
		}
		return super.eIsSet(featureID);
	}

} //Expression_CallFunctionImpl
