/**
 */
package fr.inria.diverse.iot2.iot2.iot2.impl;

import fr.inria.diverse.iot2.iot2.iot2.Block;
import fr.inria.diverse.iot2.iot2.iot2.Expression;
import fr.inria.diverse.iot2.iot2.iot2.Iot2Package;
import fr.inria.diverse.iot2.iot2.iot2.Statement_For_Numeric;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement For Numeric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_For_NumericImpl#getIteratorName <em>Iterator Name</em>}</li>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_For_NumericImpl#getStartExpr <em>Start Expr</em>}</li>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_For_NumericImpl#getUntilExpr <em>Until Expr</em>}</li>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_For_NumericImpl#getStepExpr <em>Step Expr</em>}</li>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_For_NumericImpl#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Statement_For_NumericImpl extends StatementImpl implements Statement_For_Numeric {
	/**
	 * The default value of the '{@link #getIteratorName() <em>Iterator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIteratorName()
	 * @generated
	 * @ordered
	 */
	protected static final String ITERATOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIteratorName() <em>Iterator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIteratorName()
	 * @generated
	 * @ordered
	 */
	protected String iteratorName = ITERATOR_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStartExpr() <em>Start Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartExpr()
	 * @generated
	 * @ordered
	 */
	protected Expression startExpr;

	/**
	 * The cached value of the '{@link #getUntilExpr() <em>Until Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntilExpr()
	 * @generated
	 * @ordered
	 */
	protected Expression untilExpr;

	/**
	 * The cached value of the '{@link #getStepExpr() <em>Step Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepExpr()
	 * @generated
	 * @ordered
	 */
	protected Expression stepExpr;

	/**
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected Block block;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Statement_For_NumericImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iot2Package.Literals.STATEMENT_FOR_NUMERIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIteratorName() {
		return iteratorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIteratorName(String newIteratorName) {
		String oldIteratorName = iteratorName;
		iteratorName = newIteratorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iot2Package.STATEMENT_FOR_NUMERIC__ITERATOR_NAME, oldIteratorName, iteratorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getStartExpr() {
		return startExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartExpr(Expression newStartExpr, NotificationChain msgs) {
		Expression oldStartExpr = startExpr;
		startExpr = newStartExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Iot2Package.STATEMENT_FOR_NUMERIC__START_EXPR, oldStartExpr, newStartExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartExpr(Expression newStartExpr) {
		if (newStartExpr != startExpr) {
			NotificationChain msgs = null;
			if (startExpr != null)
				msgs = ((InternalEObject)startExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Iot2Package.STATEMENT_FOR_NUMERIC__START_EXPR, null, msgs);
			if (newStartExpr != null)
				msgs = ((InternalEObject)newStartExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Iot2Package.STATEMENT_FOR_NUMERIC__START_EXPR, null, msgs);
			msgs = basicSetStartExpr(newStartExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iot2Package.STATEMENT_FOR_NUMERIC__START_EXPR, newStartExpr, newStartExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getUntilExpr() {
		return untilExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUntilExpr(Expression newUntilExpr, NotificationChain msgs) {
		Expression oldUntilExpr = untilExpr;
		untilExpr = newUntilExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Iot2Package.STATEMENT_FOR_NUMERIC__UNTIL_EXPR, oldUntilExpr, newUntilExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUntilExpr(Expression newUntilExpr) {
		if (newUntilExpr != untilExpr) {
			NotificationChain msgs = null;
			if (untilExpr != null)
				msgs = ((InternalEObject)untilExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Iot2Package.STATEMENT_FOR_NUMERIC__UNTIL_EXPR, null, msgs);
			if (newUntilExpr != null)
				msgs = ((InternalEObject)newUntilExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Iot2Package.STATEMENT_FOR_NUMERIC__UNTIL_EXPR, null, msgs);
			msgs = basicSetUntilExpr(newUntilExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iot2Package.STATEMENT_FOR_NUMERIC__UNTIL_EXPR, newUntilExpr, newUntilExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getStepExpr() {
		return stepExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStepExpr(Expression newStepExpr, NotificationChain msgs) {
		Expression oldStepExpr = stepExpr;
		stepExpr = newStepExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Iot2Package.STATEMENT_FOR_NUMERIC__STEP_EXPR, oldStepExpr, newStepExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepExpr(Expression newStepExpr) {
		if (newStepExpr != stepExpr) {
			NotificationChain msgs = null;
			if (stepExpr != null)
				msgs = ((InternalEObject)stepExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Iot2Package.STATEMENT_FOR_NUMERIC__STEP_EXPR, null, msgs);
			if (newStepExpr != null)
				msgs = ((InternalEObject)newStepExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Iot2Package.STATEMENT_FOR_NUMERIC__STEP_EXPR, null, msgs);
			msgs = basicSetStepExpr(newStepExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iot2Package.STATEMENT_FOR_NUMERIC__STEP_EXPR, newStepExpr, newStepExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getBlock() {
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlock(Block newBlock, NotificationChain msgs) {
		Block oldBlock = block;
		block = newBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Iot2Package.STATEMENT_FOR_NUMERIC__BLOCK, oldBlock, newBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlock(Block newBlock) {
		if (newBlock != block) {
			NotificationChain msgs = null;
			if (block != null)
				msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Iot2Package.STATEMENT_FOR_NUMERIC__BLOCK, null, msgs);
			if (newBlock != null)
				msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Iot2Package.STATEMENT_FOR_NUMERIC__BLOCK, null, msgs);
			msgs = basicSetBlock(newBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iot2Package.STATEMENT_FOR_NUMERIC__BLOCK, newBlock, newBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Iot2Package.STATEMENT_FOR_NUMERIC__START_EXPR:
				return basicSetStartExpr(null, msgs);
			case Iot2Package.STATEMENT_FOR_NUMERIC__UNTIL_EXPR:
				return basicSetUntilExpr(null, msgs);
			case Iot2Package.STATEMENT_FOR_NUMERIC__STEP_EXPR:
				return basicSetStepExpr(null, msgs);
			case Iot2Package.STATEMENT_FOR_NUMERIC__BLOCK:
				return basicSetBlock(null, msgs);
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
			case Iot2Package.STATEMENT_FOR_NUMERIC__ITERATOR_NAME:
				return getIteratorName();
			case Iot2Package.STATEMENT_FOR_NUMERIC__START_EXPR:
				return getStartExpr();
			case Iot2Package.STATEMENT_FOR_NUMERIC__UNTIL_EXPR:
				return getUntilExpr();
			case Iot2Package.STATEMENT_FOR_NUMERIC__STEP_EXPR:
				return getStepExpr();
			case Iot2Package.STATEMENT_FOR_NUMERIC__BLOCK:
				return getBlock();
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
			case Iot2Package.STATEMENT_FOR_NUMERIC__ITERATOR_NAME:
				setIteratorName((String)newValue);
				return;
			case Iot2Package.STATEMENT_FOR_NUMERIC__START_EXPR:
				setStartExpr((Expression)newValue);
				return;
			case Iot2Package.STATEMENT_FOR_NUMERIC__UNTIL_EXPR:
				setUntilExpr((Expression)newValue);
				return;
			case Iot2Package.STATEMENT_FOR_NUMERIC__STEP_EXPR:
				setStepExpr((Expression)newValue);
				return;
			case Iot2Package.STATEMENT_FOR_NUMERIC__BLOCK:
				setBlock((Block)newValue);
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
			case Iot2Package.STATEMENT_FOR_NUMERIC__ITERATOR_NAME:
				setIteratorName(ITERATOR_NAME_EDEFAULT);
				return;
			case Iot2Package.STATEMENT_FOR_NUMERIC__START_EXPR:
				setStartExpr((Expression)null);
				return;
			case Iot2Package.STATEMENT_FOR_NUMERIC__UNTIL_EXPR:
				setUntilExpr((Expression)null);
				return;
			case Iot2Package.STATEMENT_FOR_NUMERIC__STEP_EXPR:
				setStepExpr((Expression)null);
				return;
			case Iot2Package.STATEMENT_FOR_NUMERIC__BLOCK:
				setBlock((Block)null);
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
			case Iot2Package.STATEMENT_FOR_NUMERIC__ITERATOR_NAME:
				return ITERATOR_NAME_EDEFAULT == null ? iteratorName != null : !ITERATOR_NAME_EDEFAULT.equals(iteratorName);
			case Iot2Package.STATEMENT_FOR_NUMERIC__START_EXPR:
				return startExpr != null;
			case Iot2Package.STATEMENT_FOR_NUMERIC__UNTIL_EXPR:
				return untilExpr != null;
			case Iot2Package.STATEMENT_FOR_NUMERIC__STEP_EXPR:
				return stepExpr != null;
			case Iot2Package.STATEMENT_FOR_NUMERIC__BLOCK:
				return block != null;
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
		result.append(" (iteratorName: ");
		result.append(iteratorName);
		result.append(')');
		return result.toString();
	}

} //Statement_For_NumericImpl
