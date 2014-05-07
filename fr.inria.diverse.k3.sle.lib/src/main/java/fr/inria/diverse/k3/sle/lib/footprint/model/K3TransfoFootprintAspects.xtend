package fr.inria.diverse.k3.sle.lib.footprint.model
 
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import org.eclipse.emf.ecore.EObject 
import org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue
import org.eclipse.xtext.common.types.JvmAnnotationReference 
import org.eclipse.xtext.common.types.JvmAnnotationTarget
import org.eclipse.xtext.common.types.JvmAnnotationType
import org.eclipse.xtext.common.types.JvmAnnotationValue
import org.eclipse.xtext.common.types.JvmAnyTypeReference
import org.eclipse.xtext.common.types.JvmArrayType
import org.eclipse.xtext.common.types.JvmBooleanAnnotationValue
import org.eclipse.xtext.common.types.JvmByteAnnotationValue
import org.eclipse.xtext.common.types.JvmCharAnnotationValue
import org.eclipse.xtext.common.types.JvmComponentType
import org.eclipse.xtext.common.types.JvmCompoundTypeReference
import org.eclipse.xtext.common.types.JvmConstraintOwner
import org.eclipse.xtext.common.types.JvmConstructor
import org.eclipse.xtext.common.types.JvmCustomAnnotationValue
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmDelegateTypeReference
import org.eclipse.xtext.common.types.JvmDoubleAnnotationValue
import org.eclipse.xtext.common.types.JvmEnumAnnotationValue
import org.eclipse.xtext.common.types.JvmEnumerationLiteral
import org.eclipse.xtext.common.types.JvmEnumerationType
import org.eclipse.xtext.common.types.JvmExecutable
import org.eclipse.xtext.common.types.JvmFeature
import org.eclipse.xtext.common.types.JvmField
import org.eclipse.xtext.common.types.JvmFloatAnnotationValue
import org.eclipse.xtext.common.types.JvmFormalParameter
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmIdentifiableElement
import org.eclipse.xtext.common.types.JvmIntAnnotationValue
import org.eclipse.xtext.common.types.JvmLongAnnotationValue
import org.eclipse.xtext.common.types.JvmLowerBound
import org.eclipse.xtext.common.types.JvmMember
import org.eclipse.xtext.common.types.JvmMultiTypeReference
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference
import org.eclipse.xtext.common.types.JvmPrimitiveType
import org.eclipse.xtext.common.types.JvmShortAnnotationValue
import org.eclipse.xtext.common.types.JvmSpecializedTypeReference
import org.eclipse.xtext.common.types.JvmStringAnnotationValue
import org.eclipse.xtext.common.types.JvmSynonymTypeReference
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.common.types.JvmTypeAnnotationValue
import org.eclipse.xtext.common.types.JvmTypeConstraint
import org.eclipse.xtext.common.types.JvmTypeParameter
import org.eclipse.xtext.common.types.JvmTypeParameterDeclarator
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.JvmUnknownTypeReference
import org.eclipse.xtext.common.types.JvmUpperBound
import org.eclipse.xtext.common.types.JvmVoid
import org.eclipse.xtext.common.types.JvmWildcardTypeReference
import org.eclipse.xtext.xbase.XAbstractFeatureCall
import org.eclipse.xtext.xbase.XAbstractWhileExpression
import org.eclipse.xtext.xbase.XAssignment
import org.eclipse.xtext.xbase.XBinaryOperation
import org.eclipse.xtext.xbase.XBlockExpression
import org.eclipse.xtext.xbase.XBooleanLiteral
import org.eclipse.xtext.xbase.XCasePart
import org.eclipse.xtext.xbase.XCastedExpression
import org.eclipse.xtext.xbase.XCatchClause
import org.eclipse.xtext.xbase.XClosure
import org.eclipse.xtext.xbase.XCollectionLiteral
import org.eclipse.xtext.xbase.XConstructorCall
import org.eclipse.xtext.xbase.XDoWhileExpression
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.XFeatureCall
import org.eclipse.xtext.xbase.XForLoopExpression
import org.eclipse.xtext.xbase.XIfExpression
import org.eclipse.xtext.xbase.XInstanceOfExpression
import org.eclipse.xtext.xbase.XListLiteral
import org.eclipse.xtext.xbase.XMemberFeatureCall
import org.eclipse.xtext.xbase.XNullLiteral
import org.eclipse.xtext.xbase.XNumberLiteral
import org.eclipse.xtext.xbase.XReturnExpression 
import org.eclipse.xtext.xbase.XSetLiteral
import org.eclipse.xtext.xbase.XStringLiteral
import org.eclipse.xtext.xbase.XSwitchExpression
import org.eclipse.xtext.xbase.XThrowExpression
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression
import org.eclipse.xtext.xbase.XTypeLiteral
import org.eclipse.xtext.xbase.XUnaryOperation
import org.eclipse.xtext.xbase.XVariableDeclaration
import org.eclipse.xtext.xbase.XWhileExpression

@Aspect(className=typeof(Object))
abstract class __SlicerAspect__ {
	var boolean visitedForRelations = false
	var boolean sliced = false
	

	def void visitToAddClasses(K3TransfoFootprint theSlicer){
		if(!_self.sliced) {
			_self.sliced = true
			_self._visitToAddClasses(theSlicer)
		}
	}

	protected def void _visitToAddClasses(K3TransfoFootprint theSlicer){}

	def void visitToAddRelations(K3TransfoFootprint theSlicer){
		if(!_self.visitedForRelations) {
			_self.visitedForRelations = true
			_self._visitToAddRelations(theSlicer)
		}
	} 

	protected def void _visitToAddRelations(K3TransfoFootprint theSlicer){}

	def void feedOpposites(){}
}

@Aspect(className=typeof(JvmIdentifiableElement), with=#[typeof(__SlicerAspect__)])
abstract class JvmIdentifiableElementAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		theSlicer.onJvmIdentifiableElementSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmType), with=#[typeof(JvmIdentifiableElementAspect)])
abstract class JvmTypeAspect extends JvmIdentifiableElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmVoid), with=#[typeof(JvmTypeAspect)])
class JvmVoidAspect extends JvmTypeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmComponentType), with=#[typeof(JvmTypeAspect)])
abstract class JvmComponentTypeAspect extends JvmTypeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^arrayType?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^arrayType!=null){
		_self.^arrayType.visitToAddRelations(theSlicer)
		}

	}
}

@Aspect(className=typeof(JvmPrimitiveType), with=#[typeof(JvmComponentTypeAspect)])
class JvmPrimitiveTypeAspect extends JvmComponentTypeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmArrayType), with=#[typeof(JvmComponentTypeAspect)])
class JvmArrayTypeAspect extends JvmComponentTypeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^componentType?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^componentType!=null){
		_self.^componentType.visitToAddRelations(theSlicer)
		}

	}
}

@Aspect(className=typeof(JvmDeclaredType), with=#[typeof(JvmMemberAspect), typeof(JvmComponentTypeAspect)])
abstract class JvmDeclaredTypeAspect extends JvmMemberAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super_JvmMember__visitToAddClasses(theSlicer)
		_self.super_JvmComponentType__visitToAddClasses(theSlicer)
		_self.^superTypes.forEach[visitToAddClasses(theSlicer)]
		_self.^members.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super_JvmMember__visitToAddRelations(theSlicer)
		_self.super_JvmComponentType__visitToAddRelations(theSlicer)
		_self.^superTypes.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]
		_self.^members.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(JvmTypeParameter), with=#[typeof(JvmComponentTypeAspect), typeof(JvmConstraintOwnerAspect)])
class JvmTypeParameterAspect extends JvmComponentTypeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super_JvmComponentType__visitToAddClasses(theSlicer)
		_self.super_JvmConstraintOwner__visitToAddClasses(theSlicer)
		_self.^declarator?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super_JvmComponentType__visitToAddRelations(theSlicer)
		_self.super_JvmConstraintOwner__visitToAddRelations(theSlicer)
		if(_self.^declarator!=null){
		_self.^declarator.visitToAddRelations(theSlicer)
		}

	}
}

@Aspect(className=typeof(JvmTypeParameterDeclarator), with=#[typeof(__SlicerAspect__)])
abstract class JvmTypeParameterDeclaratorAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^typeParameters.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^typeParameters.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(JvmConstraintOwner), with=#[typeof(__SlicerAspect__)])
abstract class JvmConstraintOwnerAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^constraints.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^constraints.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(JvmTypeConstraint), with=#[typeof(__SlicerAspect__)])
abstract class JvmTypeConstraintAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^typeReference?.visitToAddClasses(theSlicer)
		_self.^owner?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^typeReference!=null){
		_self.^typeReference.visitToAddRelations(theSlicer)
		}
		if(_self.^owner!=null){
		_self.^owner.visitToAddRelations(theSlicer)
		}

	}
}

@Aspect(className=typeof(JvmUpperBound), with=#[typeof(JvmTypeConstraintAspect)])
class JvmUpperBoundAspect extends JvmTypeConstraintAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmLowerBound), with=#[typeof(JvmTypeConstraintAspect)])
class JvmLowerBoundAspect extends JvmTypeConstraintAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmAnnotationType), with=#[typeof(JvmDeclaredTypeAspect)])
class JvmAnnotationTypeAspect extends JvmDeclaredTypeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmEnumerationType), with=#[typeof(JvmDeclaredTypeAspect)])
class JvmEnumerationTypeAspect extends JvmDeclaredTypeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^literals.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^literals.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(JvmEnumerationLiteral), with=#[typeof(JvmFieldAspect)])
class JvmEnumerationLiteralAspect extends JvmFieldAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmGenericType), with=#[typeof(JvmDeclaredTypeAspect), typeof(JvmTypeParameterDeclaratorAspect)])
class JvmGenericTypeAspect extends JvmDeclaredTypeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super_JvmDeclaredType__visitToAddClasses(theSlicer)
		_self.super_JvmTypeParameterDeclarator__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super_JvmDeclaredType__visitToAddRelations(theSlicer)
		_self.super_JvmTypeParameterDeclarator__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmTypeReference), with=#[typeof(__SlicerAspect__)])
abstract class JvmTypeReferenceAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		theSlicer.onJvmTypeReferenceSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmParameterizedTypeReference), with=#[typeof(JvmTypeReferenceAspect)])
class JvmParameterizedTypeReferenceAspect extends JvmTypeReferenceAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^arguments.forEach[visitToAddClasses(theSlicer)]
		_self.^type?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^arguments.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]
		if(_self.^type!=null){
		_self.^type.visitToAddRelations(theSlicer)
		}

	}
}

@Aspect(className=typeof(JvmGenericArrayTypeReference), with=#[typeof(JvmTypeReferenceAspect)])
class JvmGenericArrayTypeReferenceAspect extends JvmTypeReferenceAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^componentType?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^componentType!=null){
		_self.^componentType.visitToAddRelations(theSlicer)
		}

	}
}

@Aspect(className=typeof(JvmWildcardTypeReference), with=#[typeof(JvmTypeReferenceAspect), typeof(JvmConstraintOwnerAspect)])
class JvmWildcardTypeReferenceAspect extends JvmTypeReferenceAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super_JvmTypeReference__visitToAddClasses(theSlicer)
		_self.super_JvmConstraintOwner__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super_JvmTypeReference__visitToAddRelations(theSlicer)
		_self.super_JvmConstraintOwner__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmAnyTypeReference), with=#[typeof(JvmTypeReferenceAspect)])
class JvmAnyTypeReferenceAspect extends JvmTypeReferenceAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^type?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^type!=null){
		_self.^type.visitToAddRelations(theSlicer)
		}

	}
}

@Aspect(className=typeof(JvmMultiTypeReference), with=#[typeof(JvmCompoundTypeReferenceAspect)])
class JvmMultiTypeReferenceAspect extends JvmCompoundTypeReferenceAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmMember), with=#[typeof(JvmAnnotationTargetAspect)])
abstract class JvmMemberAspect extends JvmAnnotationTargetAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^declaringType?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^declaringType!=null){
		_self.^declaringType.visitToAddRelations(theSlicer)
		}

	}
}

@Aspect(className=typeof(JvmFeature), with=#[typeof(JvmMemberAspect)])
abstract class JvmFeatureAspect extends JvmMemberAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmField), with=#[typeof(JvmFeatureAspect)])
class JvmFieldAspect extends JvmFeatureAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^type?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^type!=null){
		_self.^type.visitToAddRelations(theSlicer)
		}

	}
}

@Aspect(className=typeof(JvmExecutable), with=#[typeof(JvmFeatureAspect), typeof(JvmTypeParameterDeclaratorAspect)])
abstract class JvmExecutableAspect extends JvmFeatureAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super_JvmFeature__visitToAddClasses(theSlicer)
		_self.super_JvmTypeParameterDeclarator__visitToAddClasses(theSlicer)
		_self.^parameters.forEach[visitToAddClasses(theSlicer)]
		_self.^exceptions.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super_JvmFeature__visitToAddRelations(theSlicer)
		_self.super_JvmTypeParameterDeclarator__visitToAddRelations(theSlicer)
		_self.^parameters.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]
		_self.^exceptions.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(JvmConstructor), with=#[typeof(JvmExecutableAspect)])
class JvmConstructorAspect extends JvmExecutableAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmOperation), with=#[typeof(JvmExecutableAspect)])
class JvmOperationAspect extends JvmExecutableAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^returnType?.visitToAddClasses(theSlicer)
		_self.^defaultValue?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^returnType!=null){
		_self.^returnType.visitToAddRelations(theSlicer)
		}
		if(_self.^defaultValue!=null){
		_self.^defaultValue.visitToAddRelations(theSlicer)
		}

	}
}

@Aspect(className=typeof(JvmFormalParameter), with=#[typeof(JvmAnnotationTargetAspect)])
class JvmFormalParameterAspect extends JvmAnnotationTargetAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^parameterType?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^parameterType!=null){
		_self.^parameterType.visitToAddRelations(theSlicer)
		}

	}
}

@Aspect(className=typeof(JvmAnnotationTarget), with=#[typeof(JvmIdentifiableElementAspect)])
abstract class JvmAnnotationTargetAspect extends JvmIdentifiableElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^annotations.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^annotations.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(JvmAnnotationReference), with=#[typeof(__SlicerAspect__)])
class JvmAnnotationReferenceAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^annotation?.visitToAddClasses(theSlicer)
		_self.^explicitValues.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^annotation!=null){
		_self.^annotation.visitToAddRelations(theSlicer)
		}
		_self.^explicitValues.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(JvmAnnotationValue), with=#[typeof(__SlicerAspect__)])
abstract class JvmAnnotationValueAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^operation?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^operation!=null){
		_self.^operation.visitToAddRelations(theSlicer)
		}

	}
}

@Aspect(className=typeof(JvmIntAnnotationValue), with=#[typeof(JvmAnnotationValueAspect)])
class JvmIntAnnotationValueAspect extends JvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmBooleanAnnotationValue), with=#[typeof(JvmAnnotationValueAspect)])
class JvmBooleanAnnotationValueAspect extends JvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmByteAnnotationValue), with=#[typeof(JvmAnnotationValueAspect)])
class JvmByteAnnotationValueAspect extends JvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmShortAnnotationValue), with=#[typeof(JvmAnnotationValueAspect)])
class JvmShortAnnotationValueAspect extends JvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmLongAnnotationValue), with=#[typeof(JvmAnnotationValueAspect)])
class JvmLongAnnotationValueAspect extends JvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmDoubleAnnotationValue), with=#[typeof(JvmAnnotationValueAspect)])
class JvmDoubleAnnotationValueAspect extends JvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmFloatAnnotationValue), with=#[typeof(JvmAnnotationValueAspect)])
class JvmFloatAnnotationValueAspect extends JvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmCharAnnotationValue), with=#[typeof(JvmAnnotationValueAspect)])
class JvmCharAnnotationValueAspect extends JvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmStringAnnotationValue), with=#[typeof(JvmAnnotationValueAspect)])
class JvmStringAnnotationValueAspect extends JvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmTypeAnnotationValue), with=#[typeof(JvmAnnotationValueAspect)])
class JvmTypeAnnotationValueAspect extends JvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^values.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^values.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(JvmAnnotationAnnotationValue), with=#[typeof(JvmAnnotationValueAspect)])
class JvmAnnotationAnnotationValueAspect extends JvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^values.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^values.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(JvmEnumAnnotationValue), with=#[typeof(JvmAnnotationValueAspect)])
class JvmEnumAnnotationValueAspect extends JvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^values.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^values.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(JvmDelegateTypeReference), with=#[typeof(JvmTypeReferenceAspect)])
class JvmDelegateTypeReferenceAspect extends JvmTypeReferenceAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^delegate?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^delegate!=null){
		_self.^delegate.visitToAddRelations(theSlicer)
		}

	}
}

@Aspect(className=typeof(JvmSpecializedTypeReference), with=#[typeof(JvmTypeReferenceAspect)])
abstract class JvmSpecializedTypeReferenceAspect extends JvmTypeReferenceAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^equivalent?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^equivalent!=null){
		_self.^equivalent.visitToAddRelations(theSlicer)
		}

	}
}

@Aspect(className=typeof(JvmSynonymTypeReference), with=#[typeof(JvmCompoundTypeReferenceAspect)])
class JvmSynonymTypeReferenceAspect extends JvmCompoundTypeReferenceAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmUnknownTypeReference), with=#[typeof(JvmTypeReferenceAspect)])
class JvmUnknownTypeReferenceAspect extends JvmTypeReferenceAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmCompoundTypeReference), with=#[typeof(JvmTypeReferenceAspect)])
abstract class JvmCompoundTypeReferenceAspect extends JvmTypeReferenceAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^type?.visitToAddClasses(theSlicer)
		_self.^references.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^type!=null){
		_self.^type.visitToAddRelations(theSlicer)
		}
		_self.^references.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(JvmCustomAnnotationValue), with=#[typeof(JvmAnnotationValueAspect)])
class JvmCustomAnnotationValueAspect extends JvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(XExpression), with=#[typeof(__SlicerAspect__)])
abstract class XExpressionAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(XIfExpression), with=#[typeof(XExpressionAspect)])
class XIfExpressionAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^if?.visitToAddClasses(theSlicer)
		_self.^then?.visitToAddClasses(theSlicer)
		_self.^else?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^if!=null){
		_self.^if.visitToAddRelations(theSlicer)
		}
		if(_self.^then!=null){
		_self.^then.visitToAddRelations(theSlicer)
		}
		if(_self.^else!=null){
		_self.^else.visitToAddRelations(theSlicer)
		}

	}
}

@Aspect(className=typeof(XSwitchExpression), with=#[typeof(XExpressionAspect)])
class XSwitchExpressionAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^switch?.visitToAddClasses(theSlicer)
		_self.^cases.forEach[visitToAddClasses(theSlicer)]
		_self.^default?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^switch!=null){
		_self.^switch.visitToAddRelations(theSlicer)
		}
		_self.^cases.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]
		if(_self.^default!=null){
		_self.^default.visitToAddRelations(theSlicer)
		}

	}
}

@Aspect(className=typeof(XCasePart), with=#[typeof(__SlicerAspect__)])
class XCasePartAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^case?.visitToAddClasses(theSlicer)
		_self.^then?.visitToAddClasses(theSlicer)
		_self.^typeGuard?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^case!=null){
		_self.^case.visitToAddRelations(theSlicer)
		}
		if(_self.^then!=null){
		_self.^then.visitToAddRelations(theSlicer)
		}
		if(_self.^typeGuard!=null){
		_self.^typeGuard.visitToAddRelations(theSlicer)
		}

	}
}

@Aspect(className=typeof(XBlockExpression), with=#[typeof(XExpressionAspect)])
class XBlockExpressionAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^expressions.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^expressions.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(XVariableDeclaration), with=#[typeof(XExpressionAspect)])
class XVariableDeclarationAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^type?.visitToAddClasses(theSlicer)
		_self.^right?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^type!=null){
		_self.^type.visitToAddRelations(theSlicer)
		}
		if(_self.^right!=null){
		_self.^right.visitToAddRelations(theSlicer)
		}

	}
}

@Aspect(className=typeof(XAbstractFeatureCall), with=#[typeof(XExpressionAspect)])
abstract class XAbstractFeatureCallAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^feature?.visitToAddClasses(theSlicer)
		_self.^typeArguments.forEach[visitToAddClasses(theSlicer)]
		_self.^implicitReceiver?.visitToAddClasses(theSlicer)
		_self.^implicitFirstArgument?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^feature!=null){
		_self.^feature.visitToAddRelations(theSlicer)
		}
		_self.^typeArguments.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]
		if(_self.^implicitReceiver!=null){
		_self.^implicitReceiver.visitToAddRelations(theSlicer)
		}
		if(_self.^implicitFirstArgument!=null){
		_self.^implicitFirstArgument.visitToAddRelations(theSlicer)
		}

	}
}

@Aspect(className=typeof(XMemberFeatureCall), with=#[typeof(XAbstractFeatureCallAspect)])
class XMemberFeatureCallAspect extends XAbstractFeatureCallAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^memberCallTarget?.visitToAddClasses(theSlicer)
		_self.^memberCallArguments.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^memberCallTarget!=null){
		_self.^memberCallTarget.visitToAddRelations(theSlicer)
		}
		_self.^memberCallArguments.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(XFeatureCall), with=#[typeof(XAbstractFeatureCallAspect)])
class XFeatureCallAspect extends XAbstractFeatureCallAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^featureCallArguments.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^featureCallArguments.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(XConstructorCall), with=#[typeof(XExpressionAspect)])
class XConstructorCallAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^constructor?.visitToAddClasses(theSlicer)
		_self.^arguments.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^constructor!=null){
		_self.^constructor.visitToAddRelations(theSlicer)
		}
		_self.^arguments.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(XBooleanLiteral), with=#[typeof(XExpressionAspect)])
class XBooleanLiteralAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(XNullLiteral), with=#[typeof(XExpressionAspect)])
class XNullLiteralAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(XNumberLiteral), with=#[typeof(XExpressionAspect)])
class XNumberLiteralAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(XStringLiteral), with=#[typeof(XExpressionAspect)])
class XStringLiteralAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(XCollectionLiteral), with=#[typeof(XExpressionAspect)])
abstract class XCollectionLiteralAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^elements.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^elements.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(XListLiteral), with=#[typeof(XCollectionLiteralAspect)])
class XListLiteralAspect extends XCollectionLiteralAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(XSetLiteral), with=#[typeof(XCollectionLiteralAspect)])
class XSetLiteralAspect extends XCollectionLiteralAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(XClosure), with=#[typeof(XExpressionAspect)])
class XClosureAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^declaredFormalParameters.forEach[visitToAddClasses(theSlicer)]
		_self.^expression?.visitToAddClasses(theSlicer)
		_self.^implicitParameter?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^declaredFormalParameters.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]
		if(_self.^expression!=null){
		_self.^expression.visitToAddRelations(theSlicer)
		}
		if(_self.^implicitParameter!=null){
		_self.^implicitParameter.visitToAddRelations(theSlicer)
		}

	}
}

@Aspect(className=typeof(XCastedExpression), with=#[typeof(XExpressionAspect)])
class XCastedExpressionAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^type?.visitToAddClasses(theSlicer)
		_self.^target?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^type!=null){
		_self.^type.visitToAddRelations(theSlicer)
		}
		if(_self.^target!=null){
		_self.^target.visitToAddRelations(theSlicer)
		}

	}
}

@Aspect(className=typeof(XBinaryOperation), with=#[typeof(XAbstractFeatureCallAspect)])
class XBinaryOperationAspect extends XAbstractFeatureCallAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^leftOperand?.visitToAddClasses(theSlicer)
		_self.^rightOperand?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^leftOperand!=null){
		_self.^leftOperand.visitToAddRelations(theSlicer)
		}
		if(_self.^rightOperand!=null){
		_self.^rightOperand.visitToAddRelations(theSlicer)
		}

	}
}

@Aspect(className=typeof(XUnaryOperation), with=#[typeof(XAbstractFeatureCallAspect)])
class XUnaryOperationAspect extends XAbstractFeatureCallAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^operand?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^operand!=null){
		_self.^operand.visitToAddRelations(theSlicer)
		}

	}
}

@Aspect(className=typeof(XForLoopExpression), with=#[typeof(XExpressionAspect)])
class XForLoopExpressionAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^forExpression?.visitToAddClasses(theSlicer)
		_self.^eachExpression?.visitToAddClasses(theSlicer)
		_self.^declaredParam?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^forExpression!=null){
		_self.^forExpression.visitToAddRelations(theSlicer)
		}
		if(_self.^eachExpression!=null){
		_self.^eachExpression.visitToAddRelations(theSlicer)
		}
		if(_self.^declaredParam!=null){
		_self.^declaredParam.visitToAddRelations(theSlicer)
		}

	}
}

@Aspect(className=typeof(XAbstractWhileExpression), with=#[typeof(XExpressionAspect)])
abstract class XAbstractWhileExpressionAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^predicate?.visitToAddClasses(theSlicer)
		_self.^body?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^predicate!=null){
		_self.^predicate.visitToAddRelations(theSlicer)
		}
		if(_self.^body!=null){
		_self.^body.visitToAddRelations(theSlicer)
		}

	}
}

@Aspect(className=typeof(XDoWhileExpression), with=#[typeof(XAbstractWhileExpressionAspect)])
class XDoWhileExpressionAspect extends XAbstractWhileExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(XWhileExpression), with=#[typeof(XAbstractWhileExpressionAspect)])
class XWhileExpressionAspect extends XAbstractWhileExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(XTypeLiteral), with=#[typeof(XExpressionAspect)])
class XTypeLiteralAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^type?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^type!=null){
		_self.^type.visitToAddRelations(theSlicer)
		}

	}
}

@Aspect(className=typeof(XInstanceOfExpression), with=#[typeof(XExpressionAspect)])
class XInstanceOfExpressionAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^type?.visitToAddClasses(theSlicer)
		_self.^expression?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^type!=null){
		_self.^type.visitToAddRelations(theSlicer)
		}
		if(_self.^expression!=null){
		_self.^expression.visitToAddRelations(theSlicer)
		}

	}
}

@Aspect(className=typeof(XThrowExpression), with=#[typeof(XExpressionAspect)])
class XThrowExpressionAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^expression?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^expression!=null){
		_self.^expression.visitToAddRelations(theSlicer)
		}

	}
}

@Aspect(className=typeof(XTryCatchFinallyExpression), with=#[typeof(XExpressionAspect)])
class XTryCatchFinallyExpressionAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^expression?.visitToAddClasses(theSlicer)
		_self.^finallyExpression?.visitToAddClasses(theSlicer)
		_self.^catchClauses.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^expression!=null){
		_self.^expression.visitToAddRelations(theSlicer)
		}
		if(_self.^finallyExpression!=null){
		_self.^finallyExpression.visitToAddRelations(theSlicer)
		}
		_self.^catchClauses.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(XCatchClause), with=#[typeof(__SlicerAspect__)])
class XCatchClauseAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^expression?.visitToAddClasses(theSlicer)
		_self.^declaredParam?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^expression!=null){
		_self.^expression.visitToAddRelations(theSlicer)
		}
		if(_self.^declaredParam!=null){
		_self.^declaredParam.visitToAddRelations(theSlicer)
		}

	}
}

@Aspect(className=typeof(XAssignment), with=#[typeof(XAbstractFeatureCallAspect)])
class XAssignmentAspect extends XAbstractFeatureCallAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^assignable?.visitToAddClasses(theSlicer)
		_self.^value?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^assignable!=null){
		_self.^assignable.visitToAddRelations(theSlicer)
		}
		if(_self.^value!=null){
		_self.^value.visitToAddRelations(theSlicer)
		}

	}
}

@Aspect(className=typeof(XReturnExpression), with=#[typeof(XExpressionAspect)])
class XReturnExpressionAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^expression?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^expression!=null){
		_self.^expression.visitToAddRelations(theSlicer)
		}

	}
}

