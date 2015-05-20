/**
 */
package simpleconstraintslanguage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import simpleconstraintslanguage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleconstraintslanguageFactoryImpl extends EFactoryImpl implements SimpleconstraintslanguageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimpleconstraintslanguageFactory init() {
		try {
			SimpleconstraintslanguageFactory theSimpleconstraintslanguageFactory = (SimpleconstraintslanguageFactory)EPackage.Registry.INSTANCE.getEFactory(SimpleconstraintslanguagePackage.eNS_URI);
			if (theSimpleconstraintslanguageFactory != null) {
				return theSimpleconstraintslanguageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimpleconstraintslanguageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleconstraintslanguageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SimpleconstraintslanguagePackage.CONSTRAINT: return createConstraint();
			case SimpleconstraintslanguagePackage.RELATIONAL_CONSTRAINT: return createRelationalConstraint();
			case SimpleconstraintslanguagePackage.CINTEGER: return createCInteger();
			case SimpleconstraintslanguagePackage.CVAR_REF: return createCVarRef();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SimpleconstraintslanguagePackage.CRELATIONAL_OPERATOR:
				return createCRelationalOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SimpleconstraintslanguagePackage.CRELATIONAL_OPERATOR:
				return convertCRelationalOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalConstraint createRelationalConstraint() {
		RelationalConstraintImpl relationalConstraint = new RelationalConstraintImpl();
		return relationalConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CInteger createCInteger() {
		CIntegerImpl cInteger = new CIntegerImpl();
		return cInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CVarRef createCVarRef() {
		CVarRefImpl cVarRef = new CVarRefImpl();
		return cVarRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRelationalOperator createCRelationalOperatorFromString(EDataType eDataType, String initialValue) {
		CRelationalOperator result = CRelationalOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCRelationalOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleconstraintslanguagePackage getSimpleconstraintslanguagePackage() {
		return (SimpleconstraintslanguagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimpleconstraintslanguagePackage getPackage() {
		return SimpleconstraintslanguagePackage.eINSTANCE;
	}

} //SimpleconstraintslanguageFactoryImpl
