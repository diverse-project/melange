/**
 */
package org.xtext.lua.lua.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.lua.lua.Block;
import org.xtext.lua.lua.LastStatement;
import org.xtext.lua.lua.LuaPackage;
import org.xtext.lua.lua.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.lua.lua.impl.BlockImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.xtext.lua.lua.impl.BlockImpl#getReturnValue <em>Return Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlockImpl extends ChunkImpl implements Block
{
  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<Statement> statements;

  /**
   * The cached value of the '{@link #getReturnValue() <em>Return Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnValue()
   * @generated
   * @ordered
   */
  protected LastStatement returnValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BlockImpl()
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
    return LuaPackage.Literals.BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList<Statement>(Statement.class, this, LuaPackage.BLOCK__STATEMENTS);
    }
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LastStatement getReturnValue()
  {
    return returnValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnValue(LastStatement newReturnValue, NotificationChain msgs)
  {
    LastStatement oldReturnValue = returnValue;
    returnValue = newReturnValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LuaPackage.BLOCK__RETURN_VALUE, oldReturnValue, newReturnValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnValue(LastStatement newReturnValue)
  {
    if (newReturnValue != returnValue)
    {
      NotificationChain msgs = null;
      if (returnValue != null)
        msgs = ((InternalEObject)returnValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LuaPackage.BLOCK__RETURN_VALUE, null, msgs);
      if (newReturnValue != null)
        msgs = ((InternalEObject)newReturnValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LuaPackage.BLOCK__RETURN_VALUE, null, msgs);
      msgs = basicSetReturnValue(newReturnValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuaPackage.BLOCK__RETURN_VALUE, newReturnValue, newReturnValue));
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
      case LuaPackage.BLOCK__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
      case LuaPackage.BLOCK__RETURN_VALUE:
        return basicSetReturnValue(null, msgs);
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
      case LuaPackage.BLOCK__STATEMENTS:
        return getStatements();
      case LuaPackage.BLOCK__RETURN_VALUE:
        return getReturnValue();
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
      case LuaPackage.BLOCK__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends Statement>)newValue);
        return;
      case LuaPackage.BLOCK__RETURN_VALUE:
        setReturnValue((LastStatement)newValue);
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
      case LuaPackage.BLOCK__STATEMENTS:
        getStatements().clear();
        return;
      case LuaPackage.BLOCK__RETURN_VALUE:
        setReturnValue((LastStatement)null);
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
      case LuaPackage.BLOCK__STATEMENTS:
        return statements != null && !statements.isEmpty();
      case LuaPackage.BLOCK__RETURN_VALUE:
        return returnValue != null;
    }
    return super.eIsSet(featureID);
  }

} //BlockImpl
