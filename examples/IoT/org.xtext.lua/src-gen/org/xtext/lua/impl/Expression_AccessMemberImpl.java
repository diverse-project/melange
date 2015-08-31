/**
 */
package org.xtext.lua.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.lua.Expression;
import org.xtext.lua.Expression_AccessMember;
import org.xtext.lua.LuaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Access Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.lua.impl.Expression_AccessMemberImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.xtext.lua.impl.Expression_AccessMemberImpl#getMemberName <em>Member Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Expression_AccessMemberImpl extends ExpressionImpl implements Expression_AccessMember
{
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
   * The default value of the '{@link #getMemberName() <em>Member Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMemberName()
   * @generated
   * @ordered
   */
  protected static final String MEMBER_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMemberName() <em>Member Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMemberName()
   * @generated
   * @ordered
   */
  protected String memberName = MEMBER_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Expression_AccessMemberImpl()
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
    return LuaPackage.Literals.EXPRESSION_ACCESS_MEMBER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getObject()
  {
    return object;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObject(Expression newObject, NotificationChain msgs)
  {
    Expression oldObject = object;
    object = newObject;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LuaPackage.EXPRESSION_ACCESS_MEMBER__OBJECT, oldObject, newObject);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObject(Expression newObject)
  {
    if (newObject != object)
    {
      NotificationChain msgs = null;
      if (object != null)
        msgs = ((InternalEObject)object).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LuaPackage.EXPRESSION_ACCESS_MEMBER__OBJECT, null, msgs);
      if (newObject != null)
        msgs = ((InternalEObject)newObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LuaPackage.EXPRESSION_ACCESS_MEMBER__OBJECT, null, msgs);
      msgs = basicSetObject(newObject, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuaPackage.EXPRESSION_ACCESS_MEMBER__OBJECT, newObject, newObject));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMemberName()
  {
    return memberName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMemberName(String newMemberName)
  {
    String oldMemberName = memberName;
    memberName = newMemberName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuaPackage.EXPRESSION_ACCESS_MEMBER__MEMBER_NAME, oldMemberName, memberName));
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
      case LuaPackage.EXPRESSION_ACCESS_MEMBER__OBJECT:
        return basicSetObject(null, msgs);
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
      case LuaPackage.EXPRESSION_ACCESS_MEMBER__OBJECT:
        return getObject();
      case LuaPackage.EXPRESSION_ACCESS_MEMBER__MEMBER_NAME:
        return getMemberName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LuaPackage.EXPRESSION_ACCESS_MEMBER__OBJECT:
        setObject((Expression)newValue);
        return;
      case LuaPackage.EXPRESSION_ACCESS_MEMBER__MEMBER_NAME:
        setMemberName((String)newValue);
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
      case LuaPackage.EXPRESSION_ACCESS_MEMBER__OBJECT:
        setObject((Expression)null);
        return;
      case LuaPackage.EXPRESSION_ACCESS_MEMBER__MEMBER_NAME:
        setMemberName(MEMBER_NAME_EDEFAULT);
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
      case LuaPackage.EXPRESSION_ACCESS_MEMBER__OBJECT:
        return object != null;
      case LuaPackage.EXPRESSION_ACCESS_MEMBER__MEMBER_NAME:
        return MEMBER_NAME_EDEFAULT == null ? memberName != null : !MEMBER_NAME_EDEFAULT.equals(memberName);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (memberName: ");
    result.append(memberName);
    result.append(')');
    return result.toString();
  }

} //Expression_AccessMemberImpl
