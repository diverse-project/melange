/**
 */
package fr.inria.diverse.iot2.iot2.iot2.impl;

import fr.inria.diverse.iot2.iot2.iot2.Expression;
import fr.inria.diverse.iot2.iot2.iot2.Expression_CallMemberFunction;
import fr.inria.diverse.iot2.iot2.iot2.Functioncall_Arguments;
import fr.inria.diverse.iot2.iot2.iot2.Iot2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Call Member Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_CallMemberFunctionImpl#getObject <em>Object</em>}</li>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_CallMemberFunctionImpl#getMemberFunctionName <em>Member Function Name</em>}</li>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.impl.Expression_CallMemberFunctionImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Expression_CallMemberFunctionImpl extends ExpressionImpl implements Expression_CallMemberFunction {
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
	 * The default value of the '{@link #getMemberFunctionName() <em>Member Function Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberFunctionName()
	 * @generated
	 * @ordered
	 */
	protected static final String MEMBER_FUNCTION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemberFunctionName() <em>Member Function Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberFunctionName()
	 * @generated
	 * @ordered
	 */
	protected String memberFunctionName = MEMBER_FUNCTION_NAME_EDEFAULT;

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
	protected Expression_CallMemberFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iot2Package.Literals.EXPRESSION_CALL_MEMBER_FUNCTION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Iot2Package.EXPRESSION_CALL_MEMBER_FUNCTION__OBJECT, oldObject, newObject);
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
				msgs = ((InternalEObject)object).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Iot2Package.EXPRESSION_CALL_MEMBER_FUNCTION__OBJECT, null, msgs);
			if (newObject != null)
				msgs = ((InternalEObject)newObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Iot2Package.EXPRESSION_CALL_MEMBER_FUNCTION__OBJECT, null, msgs);
			msgs = basicSetObject(newObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iot2Package.EXPRESSION_CALL_MEMBER_FUNCTION__OBJECT, newObject, newObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMemberFunctionName() {
		return memberFunctionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberFunctionName(String newMemberFunctionName) {
		String oldMemberFunctionName = memberFunctionName;
		memberFunctionName = newMemberFunctionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iot2Package.EXPRESSION_CALL_MEMBER_FUNCTION__MEMBER_FUNCTION_NAME, oldMemberFunctionName, memberFunctionName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Iot2Package.EXPRESSION_CALL_MEMBER_FUNCTION__ARGUMENTS, oldArguments, newArguments);
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
				msgs = ((InternalEObject)arguments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Iot2Package.EXPRESSION_CALL_MEMBER_FUNCTION__ARGUMENTS, null, msgs);
			if (newArguments != null)
				msgs = ((InternalEObject)newArguments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Iot2Package.EXPRESSION_CALL_MEMBER_FUNCTION__ARGUMENTS, null, msgs);
			msgs = basicSetArguments(newArguments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iot2Package.EXPRESSION_CALL_MEMBER_FUNCTION__ARGUMENTS, newArguments, newArguments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Iot2Package.EXPRESSION_CALL_MEMBER_FUNCTION__OBJECT:
				return basicSetObject(null, msgs);
			case Iot2Package.EXPRESSION_CALL_MEMBER_FUNCTION__ARGUMENTS:
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
			case Iot2Package.EXPRESSION_CALL_MEMBER_FUNCTION__OBJECT:
				return getObject();
			case Iot2Package.EXPRESSION_CALL_MEMBER_FUNCTION__MEMBER_FUNCTION_NAME:
				return getMemberFunctionName();
			case Iot2Package.EXPRESSION_CALL_MEMBER_FUNCTION__ARGUMENTS:
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
			case Iot2Package.EXPRESSION_CALL_MEMBER_FUNCTION__OBJECT:
				setObject((Expression)newValue);
				return;
			case Iot2Package.EXPRESSION_CALL_MEMBER_FUNCTION__MEMBER_FUNCTION_NAME:
				setMemberFunctionName((String)newValue);
				return;
			case Iot2Package.EXPRESSION_CALL_MEMBER_FUNCTION__ARGUMENTS:
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
			case Iot2Package.EXPRESSION_CALL_MEMBER_FUNCTION__OBJECT:
				setObject((Expression)null);
				return;
			case Iot2Package.EXPRESSION_CALL_MEMBER_FUNCTION__MEMBER_FUNCTION_NAME:
				setMemberFunctionName(MEMBER_FUNCTION_NAME_EDEFAULT);
				return;
			case Iot2Package.EXPRESSION_CALL_MEMBER_FUNCTION__ARGUMENTS:
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
			case Iot2Package.EXPRESSION_CALL_MEMBER_FUNCTION__OBJECT:
				return object != null;
			case Iot2Package.EXPRESSION_CALL_MEMBER_FUNCTION__MEMBER_FUNCTION_NAME:
				return MEMBER_FUNCTION_NAME_EDEFAULT == null ? memberFunctionName != null : !MEMBER_FUNCTION_NAME_EDEFAULT.equals(memberFunctionName);
			case Iot2Package.EXPRESSION_CALL_MEMBER_FUNCTION__ARGUMENTS:
				return arguments != null;
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
		result.append(" (memberFunctionName: ");
		result.append(memberFunctionName);
		result.append(')');
		return result.toString();
	}

} //Expression_CallMemberFunctionImpl
