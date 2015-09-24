/**
 */
package fr.inria.diverse.iot2.iot2.iot2.impl;

import fr.inria.diverse.iot2.iot2.iot2.Expression;
import fr.inria.diverse.iot2.iot2.iot2.Iot2Package;
import fr.inria.diverse.iot2.iot2.iot2.Statement_Local_Variable_Declaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement Local Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_Local_Variable_DeclarationImpl#getVariableNames <em>Variable Names</em>}</li>
 *   <li>{@link fr.inria.diverse.iot2.iot2.iot2.impl.Statement_Local_Variable_DeclarationImpl#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Statement_Local_Variable_DeclarationImpl extends StatementImpl implements Statement_Local_Variable_Declaration {
	/**
	 * The cached value of the '{@link #getVariableNames() <em>Variable Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> variableNames;

	/**
	 * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> initialValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Statement_Local_Variable_DeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iot2Package.Literals.STATEMENT_LOCAL_VARIABLE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getVariableNames() {
		if (variableNames == null) {
			variableNames = new EDataTypeEList<String>(String.class, this, Iot2Package.STATEMENT_LOCAL_VARIABLE_DECLARATION__VARIABLE_NAMES);
		}
		return variableNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getInitialValue() {
		if (initialValue == null) {
			initialValue = new EObjectContainmentEList<Expression>(Expression.class, this, Iot2Package.STATEMENT_LOCAL_VARIABLE_DECLARATION__INITIAL_VALUE);
		}
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Iot2Package.STATEMENT_LOCAL_VARIABLE_DECLARATION__INITIAL_VALUE:
				return ((InternalEList<?>)getInitialValue()).basicRemove(otherEnd, msgs);
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
			case Iot2Package.STATEMENT_LOCAL_VARIABLE_DECLARATION__VARIABLE_NAMES:
				return getVariableNames();
			case Iot2Package.STATEMENT_LOCAL_VARIABLE_DECLARATION__INITIAL_VALUE:
				return getInitialValue();
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
			case Iot2Package.STATEMENT_LOCAL_VARIABLE_DECLARATION__VARIABLE_NAMES:
				getVariableNames().clear();
				getVariableNames().addAll((Collection<? extends String>)newValue);
				return;
			case Iot2Package.STATEMENT_LOCAL_VARIABLE_DECLARATION__INITIAL_VALUE:
				getInitialValue().clear();
				getInitialValue().addAll((Collection<? extends Expression>)newValue);
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
			case Iot2Package.STATEMENT_LOCAL_VARIABLE_DECLARATION__VARIABLE_NAMES:
				getVariableNames().clear();
				return;
			case Iot2Package.STATEMENT_LOCAL_VARIABLE_DECLARATION__INITIAL_VALUE:
				getInitialValue().clear();
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
			case Iot2Package.STATEMENT_LOCAL_VARIABLE_DECLARATION__VARIABLE_NAMES:
				return variableNames != null && !variableNames.isEmpty();
			case Iot2Package.STATEMENT_LOCAL_VARIABLE_DECLARATION__INITIAL_VALUE:
				return initialValue != null && !initialValue.isEmpty();
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
		result.append(" (variableNames: ");
		result.append(variableNames);
		result.append(')');
		return result.toString();
	}

} //Statement_Local_Variable_DeclarationImpl
