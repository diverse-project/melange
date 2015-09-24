/**
 */
package fr.inria.diverse.iot2.iot2.iot2.impl;

import fr.inria.diverse.iot2.iot2.iot2.Block;
import fr.inria.diverse.iot2.iot2.iot2.Expression;
import fr.inria.diverse.iot2.iot2.iot2.Iot2Package;
import fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else;
import fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else_ElseIfPart;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement If Then Else</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_If_Then_ElseImpl#getIfExpression <em>If Expression</em>}</li>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_If_Then_ElseImpl#getIfBlock <em>If Block</em>}</li>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_If_Then_ElseImpl#getElseIf <em>Else If</em>}</li>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_If_Then_ElseImpl#getElseBlock <em>Else Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Statement_If_Then_ElseImpl extends StatementImpl implements Statement_If_Then_Else {
	/**
	 * The cached value of the '{@link #getIfExpression() <em>If Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression ifExpression;

	/**
	 * The cached value of the '{@link #getIfBlock() <em>If Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfBlock()
	 * @generated
	 * @ordered
	 */
	protected Block ifBlock;

	/**
	 * The cached value of the '{@link #getElseIf() <em>Else If</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseIf()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement_If_Then_Else_ElseIfPart> elseIf;

	/**
	 * The cached value of the '{@link #getElseBlock() <em>Else Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseBlock()
	 * @generated
	 * @ordered
	 */
	protected Block elseBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Statement_If_Then_ElseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iot2Package.Literals.STATEMENT_IF_THEN_ELSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getIfExpression() {
		return ifExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfExpression(Expression newIfExpression, NotificationChain msgs) {
		Expression oldIfExpression = ifExpression;
		ifExpression = newIfExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Iot2Package.STATEMENT_IF_THEN_ELSE__IF_EXPRESSION, oldIfExpression, newIfExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfExpression(Expression newIfExpression) {
		if (newIfExpression != ifExpression) {
			NotificationChain msgs = null;
			if (ifExpression != null)
				msgs = ((InternalEObject)ifExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Iot2Package.STATEMENT_IF_THEN_ELSE__IF_EXPRESSION, null, msgs);
			if (newIfExpression != null)
				msgs = ((InternalEObject)newIfExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Iot2Package.STATEMENT_IF_THEN_ELSE__IF_EXPRESSION, null, msgs);
			msgs = basicSetIfExpression(newIfExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iot2Package.STATEMENT_IF_THEN_ELSE__IF_EXPRESSION, newIfExpression, newIfExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getIfBlock() {
		return ifBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfBlock(Block newIfBlock, NotificationChain msgs) {
		Block oldIfBlock = ifBlock;
		ifBlock = newIfBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Iot2Package.STATEMENT_IF_THEN_ELSE__IF_BLOCK, oldIfBlock, newIfBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfBlock(Block newIfBlock) {
		if (newIfBlock != ifBlock) {
			NotificationChain msgs = null;
			if (ifBlock != null)
				msgs = ((InternalEObject)ifBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Iot2Package.STATEMENT_IF_THEN_ELSE__IF_BLOCK, null, msgs);
			if (newIfBlock != null)
				msgs = ((InternalEObject)newIfBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Iot2Package.STATEMENT_IF_THEN_ELSE__IF_BLOCK, null, msgs);
			msgs = basicSetIfBlock(newIfBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iot2Package.STATEMENT_IF_THEN_ELSE__IF_BLOCK, newIfBlock, newIfBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement_If_Then_Else_ElseIfPart> getElseIf() {
		if (elseIf == null) {
			elseIf = new EObjectContainmentEList<Statement_If_Then_Else_ElseIfPart>(Statement_If_Then_Else_ElseIfPart.class, this, Iot2Package.STATEMENT_IF_THEN_ELSE__ELSE_IF);
		}
		return elseIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getElseBlock() {
		return elseBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseBlock(Block newElseBlock, NotificationChain msgs) {
		Block oldElseBlock = elseBlock;
		elseBlock = newElseBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Iot2Package.STATEMENT_IF_THEN_ELSE__ELSE_BLOCK, oldElseBlock, newElseBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseBlock(Block newElseBlock) {
		if (newElseBlock != elseBlock) {
			NotificationChain msgs = null;
			if (elseBlock != null)
				msgs = ((InternalEObject)elseBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Iot2Package.STATEMENT_IF_THEN_ELSE__ELSE_BLOCK, null, msgs);
			if (newElseBlock != null)
				msgs = ((InternalEObject)newElseBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Iot2Package.STATEMENT_IF_THEN_ELSE__ELSE_BLOCK, null, msgs);
			msgs = basicSetElseBlock(newElseBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iot2Package.STATEMENT_IF_THEN_ELSE__ELSE_BLOCK, newElseBlock, newElseBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Iot2Package.STATEMENT_IF_THEN_ELSE__IF_EXPRESSION:
				return basicSetIfExpression(null, msgs);
			case Iot2Package.STATEMENT_IF_THEN_ELSE__IF_BLOCK:
				return basicSetIfBlock(null, msgs);
			case Iot2Package.STATEMENT_IF_THEN_ELSE__ELSE_IF:
				return ((InternalEList<?>)getElseIf()).basicRemove(otherEnd, msgs);
			case Iot2Package.STATEMENT_IF_THEN_ELSE__ELSE_BLOCK:
				return basicSetElseBlock(null, msgs);
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
			case Iot2Package.STATEMENT_IF_THEN_ELSE__IF_EXPRESSION:
				return getIfExpression();
			case Iot2Package.STATEMENT_IF_THEN_ELSE__IF_BLOCK:
				return getIfBlock();
			case Iot2Package.STATEMENT_IF_THEN_ELSE__ELSE_IF:
				return getElseIf();
			case Iot2Package.STATEMENT_IF_THEN_ELSE__ELSE_BLOCK:
				return getElseBlock();
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
			case Iot2Package.STATEMENT_IF_THEN_ELSE__IF_EXPRESSION:
				setIfExpression((Expression)newValue);
				return;
			case Iot2Package.STATEMENT_IF_THEN_ELSE__IF_BLOCK:
				setIfBlock((Block)newValue);
				return;
			case Iot2Package.STATEMENT_IF_THEN_ELSE__ELSE_IF:
				getElseIf().clear();
				getElseIf().addAll((Collection<? extends Statement_If_Then_Else_ElseIfPart>)newValue);
				return;
			case Iot2Package.STATEMENT_IF_THEN_ELSE__ELSE_BLOCK:
				setElseBlock((Block)newValue);
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
			case Iot2Package.STATEMENT_IF_THEN_ELSE__IF_EXPRESSION:
				setIfExpression((Expression)null);
				return;
			case Iot2Package.STATEMENT_IF_THEN_ELSE__IF_BLOCK:
				setIfBlock((Block)null);
				return;
			case Iot2Package.STATEMENT_IF_THEN_ELSE__ELSE_IF:
				getElseIf().clear();
				return;
			case Iot2Package.STATEMENT_IF_THEN_ELSE__ELSE_BLOCK:
				setElseBlock((Block)null);
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
			case Iot2Package.STATEMENT_IF_THEN_ELSE__IF_EXPRESSION:
				return ifExpression != null;
			case Iot2Package.STATEMENT_IF_THEN_ELSE__IF_BLOCK:
				return ifBlock != null;
			case Iot2Package.STATEMENT_IF_THEN_ELSE__ELSE_IF:
				return elseIf != null && !elseIf.isEmpty();
			case Iot2Package.STATEMENT_IF_THEN_ELSE__ELSE_BLOCK:
				return elseBlock != null;
		}
		return super.eIsSet(featureID);
	}

} //Statement_If_Then_ElseImpl
