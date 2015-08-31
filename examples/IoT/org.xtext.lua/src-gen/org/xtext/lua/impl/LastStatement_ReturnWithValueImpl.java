/**
 */
package org.xtext.lua.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.lua.Expression;
import org.xtext.lua.LastStatement_ReturnWithValue;
import org.xtext.lua.LuaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Last Statement Return With Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.lua.impl.LastStatement_ReturnWithValueImpl#getReturnValues <em>Return Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LastStatement_ReturnWithValueImpl extends LastStatement_ReturnImpl implements LastStatement_ReturnWithValue
{
  /**
   * The cached value of the '{@link #getReturnValues() <em>Return Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnValues()
   * @generated
   * @ordered
   */
  protected EList<Expression> returnValues;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LastStatement_ReturnWithValueImpl()
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
    return LuaPackage.Literals.LAST_STATEMENT_RETURN_WITH_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getReturnValues()
  {
    if (returnValues == null)
    {
      returnValues = new EObjectContainmentEList<Expression>(Expression.class, this, LuaPackage.LAST_STATEMENT_RETURN_WITH_VALUE__RETURN_VALUES);
    }
    return returnValues;
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
      case LuaPackage.LAST_STATEMENT_RETURN_WITH_VALUE__RETURN_VALUES:
        return ((InternalEList<?>)getReturnValues()).basicRemove(otherEnd, msgs);
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
      case LuaPackage.LAST_STATEMENT_RETURN_WITH_VALUE__RETURN_VALUES:
        return getReturnValues();
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
      case LuaPackage.LAST_STATEMENT_RETURN_WITH_VALUE__RETURN_VALUES:
        getReturnValues().clear();
        getReturnValues().addAll((Collection<? extends Expression>)newValue);
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
      case LuaPackage.LAST_STATEMENT_RETURN_WITH_VALUE__RETURN_VALUES:
        getReturnValues().clear();
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
      case LuaPackage.LAST_STATEMENT_RETURN_WITH_VALUE__RETURN_VALUES:
        return returnValues != null && !returnValues.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //LastStatement_ReturnWithValueImpl
