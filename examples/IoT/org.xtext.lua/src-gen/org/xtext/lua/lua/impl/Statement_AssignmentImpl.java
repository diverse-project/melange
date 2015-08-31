/**
 */
package org.xtext.lua.lua.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.lua.lua.Expression;
import org.xtext.lua.lua.LuaPackage;
import org.xtext.lua.lua.Statement_Assignment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.lua.lua.impl.Statement_AssignmentImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.lua.lua.impl.Statement_AssignmentImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Statement_AssignmentImpl extends Statement_FunctioncallOrAssignmentImpl implements Statement_Assignment
{
  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected EList<Expression> variable;

  /**
   * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected EList<Expression> values;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Statement_AssignmentImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LuaPackage.Literals.STATEMENT_ASSIGNMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getVariable()
  {
    if (variable == null)
    {
      variable = new EObjectContainmentEList<Expression>(Expression.class, this, LuaPackage.STATEMENT_ASSIGNMENT__VARIABLE);
    }
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getValues()
  {
    if (values == null)
    {
      values = new EObjectContainmentEList<Expression>(Expression.class, this, LuaPackage.STATEMENT_ASSIGNMENT__VALUES);
    }
    return values;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LuaPackage.STATEMENT_ASSIGNMENT__VARIABLE:
        return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
      case LuaPackage.STATEMENT_ASSIGNMENT__VALUES:
        return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LuaPackage.STATEMENT_ASSIGNMENT__VARIABLE:
        return getVariable();
      case LuaPackage.STATEMENT_ASSIGNMENT__VALUES:
        return getValues();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LuaPackage.STATEMENT_ASSIGNMENT__VARIABLE:
        getVariable().clear();
        getVariable().addAll((Collection<? extends Expression>)newValue);
        return;
      case LuaPackage.STATEMENT_ASSIGNMENT__VALUES:
        getValues().clear();
        getValues().addAll((Collection<? extends Expression>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LuaPackage.STATEMENT_ASSIGNMENT__VARIABLE:
        getVariable().clear();
        return;
      case LuaPackage.STATEMENT_ASSIGNMENT__VALUES:
        getValues().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LuaPackage.STATEMENT_ASSIGNMENT__VARIABLE:
        return variable != null && !variable.isEmpty();
      case LuaPackage.STATEMENT_ASSIGNMENT__VALUES:
        return values != null && !values.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //Statement_AssignmentImpl
