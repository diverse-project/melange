/**
 */
package activitydiagram.impl;

import activitydiagram.ActivitydiagramPackage;
import activitydiagram.Block;
import activitydiagram.Expression;
import activitydiagram.Statement_If_Then_Else_ElseIfPart;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.k3.lua.dynamic.environment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement If Then Else Else If Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagram.impl.Statement_If_Then_Else_ElseIfPartImpl#getElseifExpression <em>Elseif Expression</em>}</li>
 *   <li>{@link activitydiagram.impl.Statement_If_Then_Else_ElseIfPartImpl#getElseifBlock <em>Elseif Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Statement_If_Then_Else_ElseIfPartImpl extends EObjectImpl implements Statement_If_Then_Else_ElseIfPart {
	/**
	 * The cached value of the '{@link #getElseifExpression() <em>Elseif Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseifExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression elseifExpression;

	/**
	 * The cached value of the '{@link #getElseifBlock() <em>Elseif Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseifBlock()
	 * @generated
	 * @ordered
	 */
	protected Block elseifBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Statement_If_Then_Else_ElseIfPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.eINSTANCE.getStatement_If_Then_Else_ElseIfPart();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getElseifExpression() {
		return elseifExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseifExpression(Expression newElseifExpression, NotificationChain msgs) {
		Expression oldElseifExpression = elseifExpression;
		elseifExpression = newElseifExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_EXPRESSION, oldElseifExpression, newElseifExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseifExpression(Expression newElseifExpression) {
		if (newElseifExpression != elseifExpression) {
			NotificationChain msgs = null;
			if (elseifExpression != null)
				msgs = ((InternalEObject)elseifExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_EXPRESSION, null, msgs);
			if (newElseifExpression != null)
				msgs = ((InternalEObject)newElseifExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_EXPRESSION, null, msgs);
			msgs = basicSetElseifExpression(newElseifExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_EXPRESSION, newElseifExpression, newElseifExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getElseifBlock() {
		return elseifBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseifBlock(Block newElseifBlock, NotificationChain msgs) {
		Block oldElseifBlock = elseifBlock;
		elseifBlock = newElseifBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_BLOCK, oldElseifBlock, newElseifBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseifBlock(Block newElseifBlock) {
		if (newElseifBlock != elseifBlock) {
			NotificationChain msgs = null;
			if (elseifBlock != null)
				msgs = ((InternalEObject)elseifBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_BLOCK, null, msgs);
			if (newElseifBlock != null)
				msgs = ((InternalEObject)newElseifBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_BLOCK, null, msgs);
			msgs = basicSetElseifBlock(newElseifBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_BLOCK, newElseifBlock, newElseifBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void execute(environment c) {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitydiagramPackage.STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_EXPRESSION:
				return basicSetElseifExpression(null, msgs);
			case ActivitydiagramPackage.STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_BLOCK:
				return basicSetElseifBlock(null, msgs);
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
			case ActivitydiagramPackage.STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_EXPRESSION:
				return getElseifExpression();
			case ActivitydiagramPackage.STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_BLOCK:
				return getElseifBlock();
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
			case ActivitydiagramPackage.STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_EXPRESSION:
				setElseifExpression((Expression)newValue);
				return;
			case ActivitydiagramPackage.STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_BLOCK:
				setElseifBlock((Block)newValue);
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
			case ActivitydiagramPackage.STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_EXPRESSION:
				setElseifExpression((Expression)null);
				return;
			case ActivitydiagramPackage.STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_BLOCK:
				setElseifBlock((Block)null);
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
			case ActivitydiagramPackage.STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_EXPRESSION:
				return elseifExpression != null;
			case ActivitydiagramPackage.STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_BLOCK:
				return elseifBlock != null;
		}
		return super.eIsSet(featureID);
	}

} //Statement_If_Then_Else_ElseIfPartImpl
