/**
 */
package kmlogo.asm.impl;

import java.util.Collection;

import kmlogo.asm.AsmPackage;
import kmlogo.asm.Instruction;
import kmlogo.asm.Parameter;
import kmlogo.asm.ProcCall;
import kmlogo.asm.ProcDeclaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proc Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kmlogo.asm.impl.ProcDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link kmlogo.asm.impl.ProcDeclarationImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link kmlogo.asm.impl.ProcDeclarationImpl#getProcCall <em>Proc Call</em>}</li>
 *   <li>{@link kmlogo.asm.impl.ProcDeclarationImpl#getInstructions <em>Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcDeclarationImpl extends InstructionImpl implements ProcDeclaration {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> args;

	/**
	 * The cached value of the '{@link #getProcCall() <em>Proc Call</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcCall()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcCall> procCall;

	/**
	 * The cached value of the '{@link #getInstructions() <em>Instructions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions()
	 * @generated
	 * @ordered
	 */
	protected EList<Instruction> instructions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsmPackage.Literals.PROC_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsmPackage.PROC_DECLARATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getArgs() {
		if (args == null) {
			args = new EObjectContainmentEList<Parameter>(Parameter.class, this, AsmPackage.PROC_DECLARATION__ARGS);
		}
		return args;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcCall> getProcCall() {
		if (procCall == null) {
			procCall = new EObjectWithInverseResolvingEList<ProcCall>(ProcCall.class, this, AsmPackage.PROC_DECLARATION__PROC_CALL, AsmPackage.PROC_CALL__DECLARATION);
		}
		return procCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instruction> getInstructions() {
		if (instructions == null) {
			instructions = new EObjectContainmentEList<Instruction>(Instruction.class, this, AsmPackage.PROC_DECLARATION__INSTRUCTIONS);
		}
		return instructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AsmPackage.PROC_DECLARATION__PROC_CALL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcCall()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AsmPackage.PROC_DECLARATION__ARGS:
				return ((InternalEList<?>)getArgs()).basicRemove(otherEnd, msgs);
			case AsmPackage.PROC_DECLARATION__PROC_CALL:
				return ((InternalEList<?>)getProcCall()).basicRemove(otherEnd, msgs);
			case AsmPackage.PROC_DECLARATION__INSTRUCTIONS:
				return ((InternalEList<?>)getInstructions()).basicRemove(otherEnd, msgs);
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
			case AsmPackage.PROC_DECLARATION__NAME:
				return getName();
			case AsmPackage.PROC_DECLARATION__ARGS:
				return getArgs();
			case AsmPackage.PROC_DECLARATION__PROC_CALL:
				return getProcCall();
			case AsmPackage.PROC_DECLARATION__INSTRUCTIONS:
				return getInstructions();
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
			case AsmPackage.PROC_DECLARATION__NAME:
				setName((String)newValue);
				return;
			case AsmPackage.PROC_DECLARATION__ARGS:
				getArgs().clear();
				getArgs().addAll((Collection<? extends Parameter>)newValue);
				return;
			case AsmPackage.PROC_DECLARATION__PROC_CALL:
				getProcCall().clear();
				getProcCall().addAll((Collection<? extends ProcCall>)newValue);
				return;
			case AsmPackage.PROC_DECLARATION__INSTRUCTIONS:
				getInstructions().clear();
				getInstructions().addAll((Collection<? extends Instruction>)newValue);
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
			case AsmPackage.PROC_DECLARATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AsmPackage.PROC_DECLARATION__ARGS:
				getArgs().clear();
				return;
			case AsmPackage.PROC_DECLARATION__PROC_CALL:
				getProcCall().clear();
				return;
			case AsmPackage.PROC_DECLARATION__INSTRUCTIONS:
				getInstructions().clear();
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
			case AsmPackage.PROC_DECLARATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AsmPackage.PROC_DECLARATION__ARGS:
				return args != null && !args.isEmpty();
			case AsmPackage.PROC_DECLARATION__PROC_CALL:
				return procCall != null && !procCall.isEmpty();
			case AsmPackage.PROC_DECLARATION__INSTRUCTIONS:
				return instructions != null && !instructions.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ProcDeclarationImpl
