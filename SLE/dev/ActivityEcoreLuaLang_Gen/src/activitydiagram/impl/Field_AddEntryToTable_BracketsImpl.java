/**
 */
package activitydiagram.impl;

import activitydiagram.ActivitydiagramPackage;
import activitydiagram.Expression;
import activitydiagram.Field_AddEntryToTable_Brackets;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Add Entry To Table Brackets</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagram.impl.Field_AddEntryToTable_BracketsImpl#getIndexExpression <em>Index Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Field_AddEntryToTable_BracketsImpl extends FieldImpl implements Field_AddEntryToTable_Brackets {
	/**
	 * The cached value of the '{@link #getIndexExpression() <em>Index Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression indexExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Field_AddEntryToTable_BracketsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.eINSTANCE.getField_AddEntryToTable_Brackets();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getIndexExpression() {
		return indexExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexExpression(Expression newIndexExpression, NotificationChain msgs) {
		Expression oldIndexExpression = indexExpression;
		indexExpression = newIndexExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.FIELD_ADD_ENTRY_TO_TABLE_BRACKETS__INDEX_EXPRESSION, oldIndexExpression, newIndexExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexExpression(Expression newIndexExpression) {
		if (newIndexExpression != indexExpression) {
			NotificationChain msgs = null;
			if (indexExpression != null)
				msgs = ((InternalEObject)indexExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.FIELD_ADD_ENTRY_TO_TABLE_BRACKETS__INDEX_EXPRESSION, null, msgs);
			if (newIndexExpression != null)
				msgs = ((InternalEObject)newIndexExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.FIELD_ADD_ENTRY_TO_TABLE_BRACKETS__INDEX_EXPRESSION, null, msgs);
			msgs = basicSetIndexExpression(newIndexExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.FIELD_ADD_ENTRY_TO_TABLE_BRACKETS__INDEX_EXPRESSION, newIndexExpression, newIndexExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitydiagramPackage.FIELD_ADD_ENTRY_TO_TABLE_BRACKETS__INDEX_EXPRESSION:
				return basicSetIndexExpression(null, msgs);
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
			case ActivitydiagramPackage.FIELD_ADD_ENTRY_TO_TABLE_BRACKETS__INDEX_EXPRESSION:
				return getIndexExpression();
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
			case ActivitydiagramPackage.FIELD_ADD_ENTRY_TO_TABLE_BRACKETS__INDEX_EXPRESSION:
				setIndexExpression((Expression)newValue);
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
			case ActivitydiagramPackage.FIELD_ADD_ENTRY_TO_TABLE_BRACKETS__INDEX_EXPRESSION:
				setIndexExpression((Expression)null);
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
			case ActivitydiagramPackage.FIELD_ADD_ENTRY_TO_TABLE_BRACKETS__INDEX_EXPRESSION:
				return indexExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //Field_AddEntryToTable_BracketsImpl
