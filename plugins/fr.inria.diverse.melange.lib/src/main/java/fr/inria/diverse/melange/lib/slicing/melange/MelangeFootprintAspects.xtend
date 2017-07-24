/*******************************************************************************
 * Copyright (c) 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package fr.inria.diverse.melange.lib.slicing.melange

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

@Aspect(className=typeof(java.lang.Object))
abstract class __SlicerAspect__ {
	protected var boolean visitedForRelations = false
	protected var boolean sliced = false
	protected var org.eclipse.emf.ecore.EObject clonedElt = null

	def void visitToAddClasses(MelangeFootprint theSlicer){
		if(!_self.sliced) {
			_self.sliced = true
			_self._visitToAddClasses(theSlicer)
		}
	}
	 
	protected def void _visitToAddClasses(MelangeFootprint theSlicer){}

	def void visitToAddRelations(MelangeFootprint theSlicer){
		if(!_self.visitedForRelations) {
			_self.visitedForRelations = true
			_self._visitToAddRelations(theSlicer)
		}
	}
	
	protected def void _visitToAddRelations(MelangeFootprint theSlicer){}

//	def void feedOpposites(){}

	def void reinit(){
		_self.visitedForRelations = false
		_self.sliced = false
		_self.clonedElt = null
	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmIdentifiableElement), with=#[typeof(__SlicerAspect__)])
abstract class orgeclipsextextcommontypesJvmIdentifiableElementAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		theSlicer.onJvmIdentifiableElementSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmType), with=#[typeof(orgeclipsextextcommontypesJvmIdentifiableElementAspect)])
abstract class orgeclipsextextcommontypesJvmTypeAspect extends orgeclipsextextcommontypesJvmIdentifiableElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmVoid), with=#[typeof(orgeclipsextextcommontypesJvmTypeAspect)])
class orgeclipsextextcommontypesJvmVoidAspect extends orgeclipsextextcommontypesJvmTypeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmComponentType), with=#[typeof(orgeclipsextextcommontypesJvmTypeAspect)])
abstract class orgeclipsextextcommontypesJvmComponentTypeAspect extends orgeclipsextextcommontypesJvmTypeAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^arrayType?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^arrayType?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^arrayType!==null){
		_self.^arrayType.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^arrayType.sliced) 		theSlicer.onarrayTypeSliced(_self, _self.^arrayType)
		}

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmPrimitiveType), with=#[typeof(orgeclipsextextcommontypesJvmComponentTypeAspect)])
class orgeclipsextextcommontypesJvmPrimitiveTypeAspect extends orgeclipsextextcommontypesJvmComponentTypeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmArrayType), with=#[typeof(orgeclipsextextcommontypesJvmComponentTypeAspect)])
class orgeclipsextextcommontypesJvmArrayTypeAspect extends orgeclipsextextcommontypesJvmComponentTypeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^componentType?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^componentType!==null){
		_self.^componentType.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^componentType.sliced) 		theSlicer.oncomponentTypeSliced(_self, _self.^componentType)
		}

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmDeclaredType), with=#[typeof(orgeclipsextextcommontypesJvmMemberAspect), typeof(orgeclipsextextcommontypesJvmComponentTypeAspect)])
abstract class orgeclipsextextcommontypesJvmDeclaredTypeAspect extends orgeclipsextextcommontypesJvmMemberAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_JvmAnnotationTarget_reinit
		_self.super_JvmComponentType_reinit
		_self.^superTypes.forEach[reinit]
		_self.^members.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super_JvmMember__visitToAddClasses(theSlicer)
		_self.super_JvmComponentType__visitToAddClasses(theSlicer)
		_self.^superTypes.forEach[visitToAddClasses(theSlicer)]
		_self.^members.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super_JvmMember__visitToAddRelations(theSlicer)
		_self.super_JvmComponentType__visitToAddRelations(theSlicer)
		_self.^superTypes.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onsuperTypesSliced(_self, _elt)
		]
		_self.^members.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onmembersSliced(_self, _elt)
		]

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmTypeParameter), with=#[typeof(orgeclipsextextcommontypesJvmComponentTypeAspect), typeof(orgeclipsextextcommontypesJvmConstraintOwnerAspect)])
class orgeclipsextextcommontypesJvmTypeParameterAspect extends orgeclipsextextcommontypesJvmComponentTypeAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_JvmComponentType_reinit
		_self.super_JvmConstraintOwner_reinit
	}
	
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super_JvmComponentType__visitToAddClasses(theSlicer)
		_self.super_JvmConstraintOwner__visitToAddClasses(theSlicer)
		_self.^declarator?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super_JvmComponentType__visitToAddRelations(theSlicer)
		_self.super_JvmConstraintOwner__visitToAddRelations(theSlicer)
		if(_self.^declarator!==null){
		_self.^declarator.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^declarator.sliced) 		theSlicer.ondeclaratorSliced(_self, _self.^declarator)
		}

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmTypeParameterDeclarator), with=#[typeof(__SlicerAspect__)])
abstract class orgeclipsextextcommontypesJvmTypeParameterDeclaratorAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^typeParameters.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^typeParameters.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^typeParameters.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.ontypeParametersSliced(_self, _elt)
		]

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmConstraintOwner), with=#[typeof(__SlicerAspect__)])
abstract class orgeclipsextextcommontypesJvmConstraintOwnerAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^constraints.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^constraints.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^constraints.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onconstraintsSliced(_self, _elt)
		]

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmTypeConstraint), with=#[typeof(__SlicerAspect__)])
abstract class orgeclipsextextcommontypesJvmTypeConstraintAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^typeReference?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^typeReference?.visitToAddClasses(theSlicer)
		_self.^owner?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^typeReference!==null){
		_self.^typeReference.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^typeReference.sliced) 		theSlicer.ontypeReferenceSliced(_self, _self.^typeReference)
		}
		if(_self.^owner!==null){
		_self.^owner.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^owner.sliced) 		theSlicer.onownerSliced(_self, _self.^owner)
		}

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmUpperBound), with=#[typeof(orgeclipsextextcommontypesJvmTypeConstraintAspect)])
class orgeclipsextextcommontypesJvmUpperBoundAspect extends orgeclipsextextcommontypesJvmTypeConstraintAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmLowerBound), with=#[typeof(orgeclipsextextcommontypesJvmTypeConstraintAspect)])
class orgeclipsextextcommontypesJvmLowerBoundAspect extends orgeclipsextextcommontypesJvmTypeConstraintAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmAnnotationType), with=#[typeof(orgeclipsextextcommontypesJvmDeclaredTypeAspect)])
class orgeclipsextextcommontypesJvmAnnotationTypeAspect extends orgeclipsextextcommontypesJvmDeclaredTypeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmEnumerationType), with=#[typeof(orgeclipsextextcommontypesJvmDeclaredTypeAspect)])
class orgeclipsextextcommontypesJvmEnumerationTypeAspect extends orgeclipsextextcommontypesJvmDeclaredTypeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^literals.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^literals.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmEnumerationLiteral), with=#[typeof(orgeclipsextextcommontypesJvmFieldAspect)])
class orgeclipsextextcommontypesJvmEnumerationLiteralAspect extends orgeclipsextextcommontypesJvmFieldAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

//@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmGenericType), with=#[typeof(orgeclipsextextcommontypesJvmDeclaredTypeAspect), typeof(orgeclipsextextcommontypesJvmTypeParameterDeclaratorAspect)])
//class orgeclipsextextcommontypesJvmGenericTypeAspect extends orgeclipsextextcommontypesJvmDeclaredTypeAspect{
//	@OverrideAspectMethod
//	def void reinit(){
//		_self.super_JvmDeclaredType_reinit
//		_self.super_JvmTypeParameterDeclarator_reinit
//	}
//	
//	@OverrideAspectMethod
//	def void _visitToAddClasses(MelangeFootprint theSlicer){
//		_self.super_JvmDeclaredType__visitToAddClasses(theSlicer)
//		_self.super_JvmTypeParameterDeclarator__visitToAddClasses(theSlicer)
//
//	}
//	@OverrideAspectMethod
//	def void _visitToAddRelations(MelangeFootprint theSlicer){
//		_self.super_JvmDeclaredType__visitToAddRelations(theSlicer)
//		_self.super_JvmTypeParameterDeclarator__visitToAddRelations(theSlicer)
//
//	}
//}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmTypeReference), with=#[typeof(__SlicerAspect__)])
abstract class orgeclipsextextcommontypesJvmTypeReferenceAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		theSlicer.onJvmTypeReferenceSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmParameterizedTypeReference), with=#[typeof(orgeclipsextextcommontypesJvmTypeReferenceAspect)])
class orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspect extends orgeclipsextextcommontypesJvmTypeReferenceAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^arguments.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^arguments.forEach[visitToAddClasses(theSlicer)]
		_self.^type?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^arguments.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onargumentsSliced(_self, _elt)
		]
		if(_self.^type!==null){
		_self.^type.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^type.sliced) 		theSlicer.ontypeSliced(_self, _self.^type)
		}

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmGenericArrayTypeReference), with=#[typeof(orgeclipsextextcommontypesJvmTypeReferenceAspect)])
class orgeclipsextextcommontypesJvmGenericArrayTypeReferenceAspect extends orgeclipsextextcommontypesJvmTypeReferenceAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^componentType?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^componentType?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^componentType!==null){
		_self.^componentType.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^componentType.sliced) 		theSlicer.oncomponentTypeSliced(_self, _self.^componentType)
		}

	}
}

//@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmWildcardTypeReference), with=#[typeof(orgeclipsextextcommontypesJvmTypeReferenceAspect), typeof(orgeclipsextextcommontypesJvmConstraintOwnerAspect)])
//class orgeclipsextextcommontypesJvmWildcardTypeReferenceAspect extends orgeclipsextextcommontypesJvmTypeReferenceAspect{
//	@OverrideAspectMethod
//	def void reinit(){
//		_self.super_JvmConstraintOwner_reinit
//		_self.super_Object_reinit
//	}
//	
//	@OverrideAspectMethod
//	def void _visitToAddClasses(MelangeFootprint theSlicer){
//		_self.super_JvmTypeReference__visitToAddClasses(theSlicer)
//		_self.super_JvmConstraintOwner__visitToAddClasses(theSlicer)
//
//	}
//	@OverrideAspectMethod
//	def void _visitToAddRelations(MelangeFootprint theSlicer){
//		_self.super_JvmTypeReference__visitToAddRelations(theSlicer)
//		_self.super_JvmConstraintOwner__visitToAddRelations(theSlicer)
//
//	}
//}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmAnyTypeReference), with=#[typeof(orgeclipsextextcommontypesJvmTypeReferenceAspect)])
class orgeclipsextextcommontypesJvmAnyTypeReferenceAspect extends orgeclipsextextcommontypesJvmTypeReferenceAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^type?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^type!==null){
		_self.^type.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^type.sliced) 		theSlicer.ontypeSliced(_self, _self.^type)
		}

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmMultiTypeReference), with=#[typeof(orgeclipsextextcommontypesJvmCompoundTypeReferenceAspect)])
class orgeclipsextextcommontypesJvmMultiTypeReferenceAspect extends orgeclipsextextcommontypesJvmCompoundTypeReferenceAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmMember), with=#[typeof(orgeclipsextextcommontypesJvmAnnotationTargetAspect)])
abstract class orgeclipsextextcommontypesJvmMemberAspect extends orgeclipsextextcommontypesJvmAnnotationTargetAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^declaringType?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^declaringType!==null){
		_self.^declaringType.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^declaringType.sliced) 		theSlicer.ondeclaringTypeSliced(_self, _self.^declaringType)
		}

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmFeature), with=#[typeof(orgeclipsextextcommontypesJvmMemberAspect)])
abstract class orgeclipsextextcommontypesJvmFeatureAspect extends orgeclipsextextcommontypesJvmMemberAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^localClasses.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^localClasses.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^localClasses.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onlocalClassesSliced(_self, _elt)
		]

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmField), with=#[typeof(orgeclipsextextcommontypesJvmFeatureAspect)])
class orgeclipsextextcommontypesJvmFieldAspect extends orgeclipsextextcommontypesJvmFeatureAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^type?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^type?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^type!==null){
		_self.^type.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^type.sliced) 		theSlicer.ontypeSliced(_self, _self.^type)
		}

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmExecutable), with=#[typeof(orgeclipsextextcommontypesJvmFeatureAspect), typeof(orgeclipsextextcommontypesJvmTypeParameterDeclaratorAspect)])
abstract class orgeclipsextextcommontypesJvmExecutableAspect extends orgeclipsextextcommontypesJvmFeatureAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_JvmFeature_reinit
		_self.super_JvmTypeParameterDeclarator_reinit
		_self.^parameters.forEach[reinit]
		_self.^exceptions.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super_JvmFeature__visitToAddClasses(theSlicer)
		_self.super_JvmTypeParameterDeclarator__visitToAddClasses(theSlicer)
		_self.^parameters.forEach[visitToAddClasses(theSlicer)]
		_self.^exceptions.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super_JvmFeature__visitToAddRelations(theSlicer)
		_self.super_JvmTypeParameterDeclarator__visitToAddRelations(theSlicer)
		_self.^parameters.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onparametersSliced(_self, _elt)
		]
		_self.^exceptions.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onexceptionsSliced(_self, _elt)
		]

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmConstructor), with=#[typeof(orgeclipsextextcommontypesJvmExecutableAspect)])
class orgeclipsextextcommontypesJvmConstructorAspect extends orgeclipsextextcommontypesJvmExecutableAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmOperation), with=#[typeof(orgeclipsextextcommontypesJvmExecutableAspect)])
class orgeclipsextextcommontypesJvmOperationAspect extends orgeclipsextextcommontypesJvmExecutableAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^returnType?.reinit
_self.^defaultValue?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^returnType?.visitToAddClasses(theSlicer)
		_self.^defaultValue?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^returnType!==null){
		_self.^returnType.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^returnType.sliced) 		theSlicer.onreturnTypeSliced(_self, _self.^returnType)
		}
		if(_self.^defaultValue!==null){
		_self.^defaultValue.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^defaultValue.sliced) 		theSlicer.ondefaultValueSliced(_self, _self.^defaultValue)
		}

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmFormalParameter), with=#[typeof(orgeclipsextextcommontypesJvmAnnotationTargetAspect)])
class orgeclipsextextcommontypesJvmFormalParameterAspect extends orgeclipsextextcommontypesJvmAnnotationTargetAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^parameterType?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^parameterType?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^parameterType!==null){
		_self.^parameterType.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^parameterType.sliced) 		theSlicer.onparameterTypeSliced(_self, _self.^parameterType)
		}

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmAnnotationTarget), with=#[typeof(orgeclipsextextcommontypesJvmIdentifiableElementAspect)])
abstract class orgeclipsextextcommontypesJvmAnnotationTargetAspect extends orgeclipsextextcommontypesJvmIdentifiableElementAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^annotations.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^annotations.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^annotations.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onannotationsSliced(_self, _elt)
		]

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmAnnotationReference), with=#[typeof(__SlicerAspect__)])
class orgeclipsextextcommontypesJvmAnnotationReferenceAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^explicitValues.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^annotation?.visitToAddClasses(theSlicer)
		_self.^explicitValues.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^annotation!==null){
		_self.^annotation.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^annotation.sliced) 		theSlicer.onannotationSliced(_self, _self.^annotation)
		}
		_self.^explicitValues.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onexplicitValuesSliced(_self, _elt)
		]

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmAnnotationValue), with=#[typeof(__SlicerAspect__)])
abstract class orgeclipsextextcommontypesJvmAnnotationValueAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^operation?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^operation!==null){
		_self.^operation.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^operation.sliced) 		theSlicer.onoperationSliced(_self, _self.^operation)
		}

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmIntAnnotationValue), with=#[typeof(orgeclipsextextcommontypesJvmAnnotationValueAspect)])
class orgeclipsextextcommontypesJvmIntAnnotationValueAspect extends orgeclipsextextcommontypesJvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmBooleanAnnotationValue), with=#[typeof(orgeclipsextextcommontypesJvmAnnotationValueAspect)])
class orgeclipsextextcommontypesJvmBooleanAnnotationValueAspect extends orgeclipsextextcommontypesJvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmByteAnnotationValue), with=#[typeof(orgeclipsextextcommontypesJvmAnnotationValueAspect)])
class orgeclipsextextcommontypesJvmByteAnnotationValueAspect extends orgeclipsextextcommontypesJvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmShortAnnotationValue), with=#[typeof(orgeclipsextextcommontypesJvmAnnotationValueAspect)])
class orgeclipsextextcommontypesJvmShortAnnotationValueAspect extends orgeclipsextextcommontypesJvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmLongAnnotationValue), with=#[typeof(orgeclipsextextcommontypesJvmAnnotationValueAspect)])
class orgeclipsextextcommontypesJvmLongAnnotationValueAspect extends orgeclipsextextcommontypesJvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmDoubleAnnotationValue), with=#[typeof(orgeclipsextextcommontypesJvmAnnotationValueAspect)])
class orgeclipsextextcommontypesJvmDoubleAnnotationValueAspect extends orgeclipsextextcommontypesJvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmFloatAnnotationValue), with=#[typeof(orgeclipsextextcommontypesJvmAnnotationValueAspect)])
class orgeclipsextextcommontypesJvmFloatAnnotationValueAspect extends orgeclipsextextcommontypesJvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmCharAnnotationValue), with=#[typeof(orgeclipsextextcommontypesJvmAnnotationValueAspect)])
class orgeclipsextextcommontypesJvmCharAnnotationValueAspect extends orgeclipsextextcommontypesJvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmStringAnnotationValue), with=#[typeof(orgeclipsextextcommontypesJvmAnnotationValueAspect)])
class orgeclipsextextcommontypesJvmStringAnnotationValueAspect extends orgeclipsextextcommontypesJvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmTypeAnnotationValue), with=#[typeof(orgeclipsextextcommontypesJvmAnnotationValueAspect)])
class orgeclipsextextcommontypesJvmTypeAnnotationValueAspect extends orgeclipsextextcommontypesJvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^values.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^values.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^values.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onvaluesSliced(_self, _elt)
		]

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue), with=#[typeof(orgeclipsextextcommontypesJvmAnnotationValueAspect)])
class orgeclipsextextcommontypesJvmAnnotationAnnotationValueAspect extends orgeclipsextextcommontypesJvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^values.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^values.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^values.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onvaluesSliced(_self, _elt)
		]

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmEnumAnnotationValue), with=#[typeof(orgeclipsextextcommontypesJvmAnnotationValueAspect)])
class orgeclipsextextcommontypesJvmEnumAnnotationValueAspect extends orgeclipsextextcommontypesJvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^values.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^values.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onvaluesSliced(_self, _elt)
		]

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmDelegateTypeReference), with=#[typeof(orgeclipsextextcommontypesJvmTypeReferenceAspect)])
class orgeclipsextextcommontypesJvmDelegateTypeReferenceAspect extends orgeclipsextextcommontypesJvmTypeReferenceAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^delegate?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^delegate!==null){
		_self.^delegate.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^delegate.sliced) 		theSlicer.ondelegateSliced(_self, _self.^delegate)
		}

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmSpecializedTypeReference), with=#[typeof(orgeclipsextextcommontypesJvmTypeReferenceAspect)])
abstract class orgeclipsextextcommontypesJvmSpecializedTypeReferenceAspect extends orgeclipsextextcommontypesJvmTypeReferenceAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^equivalent?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^equivalent?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^equivalent!==null){
		_self.^equivalent.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^equivalent.sliced) 		theSlicer.onequivalentSliced(_self, _self.^equivalent)
		}

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmSynonymTypeReference), with=#[typeof(orgeclipsextextcommontypesJvmCompoundTypeReferenceAspect)])
class orgeclipsextextcommontypesJvmSynonymTypeReferenceAspect extends orgeclipsextextcommontypesJvmCompoundTypeReferenceAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmUnknownTypeReference), with=#[typeof(orgeclipsextextcommontypesJvmTypeReferenceAspect)])
class orgeclipsextextcommontypesJvmUnknownTypeReferenceAspect extends orgeclipsextextcommontypesJvmTypeReferenceAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmCompoundTypeReference), with=#[typeof(orgeclipsextextcommontypesJvmTypeReferenceAspect)])
abstract class orgeclipsextextcommontypesJvmCompoundTypeReferenceAspect extends orgeclipsextextcommontypesJvmTypeReferenceAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^references.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^type?.visitToAddClasses(theSlicer)
		_self.^references.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^type!==null){
		_self.^type.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^type.sliced) 		theSlicer.ontypeSliced(_self, _self.^type)
		}
		_self.^references.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onreferencesSliced(_self, _elt)
		]

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmCustomAnnotationValue), with=#[typeof(orgeclipsextextcommontypesJvmAnnotationValueAspect)])
class orgeclipsextextcommontypesJvmCustomAnnotationValueAspect extends orgeclipsextextcommontypesJvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.xtext.common.types.JvmInnerTypeReference), with=#[typeof(orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspect)])
class orgeclipsextextcommontypesJvmInnerTypeReferenceAspect extends orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^outer?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^outer?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^outer!==null){
		_self.^outer.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^outer.sliced) 		theSlicer.onouterSliced(_self, _self.^outer)
		}

	}
}

@Aspect(className=typeof(org.eclipse.xtext.xbase.XExpression), with=#[typeof(__SlicerAspect__)])
abstract class orgeclipsextextxbaseXExpressionAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.xtext.xbase.XIfExpression), with=#[typeof(orgeclipsextextxbaseXExpressionAspect)])
class orgeclipsextextxbaseXIfExpressionAspect extends orgeclipsextextxbaseXExpressionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^if?.reinit
_self.^then?.reinit
_self.^else?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^if?.visitToAddClasses(theSlicer)
		_self.^then?.visitToAddClasses(theSlicer)
		_self.^else?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^if!==null){
		_self.^if.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^if.sliced) 		theSlicer.onifSliced(_self, _self.^if)
		}
		if(_self.^then!==null){
		_self.^then.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^then.sliced) 		theSlicer.onthenSliced(_self, _self.^then)
		}
		if(_self.^else!==null){
		_self.^else.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^else.sliced) 		theSlicer.onelseSliced(_self, _self.^else)
		}

	}
}

@Aspect(className=typeof(org.eclipse.xtext.xbase.XSwitchExpression), with=#[typeof(orgeclipsextextxbaseXExpressionAspect)])
class orgeclipsextextxbaseXSwitchExpressionAspect extends orgeclipsextextxbaseXExpressionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^switch?.reinit
_self.^cases.forEach[reinit]
_self.^default?.reinit
_self.^declaredParam?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^switch?.visitToAddClasses(theSlicer)
		_self.^cases.forEach[visitToAddClasses(theSlicer)]
		_self.^default?.visitToAddClasses(theSlicer)
		_self.^declaredParam?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^switch!==null){
		_self.^switch.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^switch.sliced) 		theSlicer.onswitchSliced(_self, _self.^switch)
		}
		_self.^cases.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.oncasesSliced(_self, _elt)
		]
		if(_self.^default!==null){
		_self.^default.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^default.sliced) 		theSlicer.ondefaultSliced(_self, _self.^default)
		}
		if(_self.^declaredParam!==null){
		_self.^declaredParam.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^declaredParam.sliced) 		theSlicer.ondeclaredParamSliced(_self, _self.^declaredParam)
		}

	}
}

@Aspect(className=typeof(org.eclipse.xtext.xbase.XCasePart), with=#[typeof(__SlicerAspect__)])
class orgeclipsextextxbaseXCasePartAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^case?.reinit
_self.^then?.reinit
_self.^typeGuard?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^case?.visitToAddClasses(theSlicer)
		_self.^then?.visitToAddClasses(theSlicer)
		_self.^typeGuard?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^case!==null){
		_self.^case.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^case.sliced) 		theSlicer.oncaseSliced(_self, _self.^case)
		}
		if(_self.^then!==null){
		_self.^then.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^then.sliced) 		theSlicer.onthenSliced(_self, _self.^then)
		}
		if(_self.^typeGuard!==null){
		_self.^typeGuard.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^typeGuard.sliced) 		theSlicer.ontypeGuardSliced(_self, _self.^typeGuard)
		}

	}
}

@Aspect(className=typeof(org.eclipse.xtext.xbase.XBlockExpression), with=#[typeof(orgeclipsextextxbaseXExpressionAspect)])
class orgeclipsextextxbaseXBlockExpressionAspect extends orgeclipsextextxbaseXExpressionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^expressions.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^expressions.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^expressions.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onexpressionsSliced(_self, _elt)
		]

	}
}

@Aspect(className=typeof(org.eclipse.xtext.xbase.XVariableDeclaration), with=#[typeof(orgeclipsextextxbaseXExpressionAspect)])
class orgeclipsextextxbaseXVariableDeclarationAspect extends orgeclipsextextxbaseXExpressionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^type?.reinit
_self.^right?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^type?.visitToAddClasses(theSlicer)
		_self.^right?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^type!==null){
		_self.^type.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^type.sliced) 		theSlicer.ontypeSliced(_self, _self.^type)
		}
		if(_self.^right!==null){
		_self.^right.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^right.sliced) 		theSlicer.onrightSliced(_self, _self.^right)
		}

	}
}

@Aspect(className=typeof(org.eclipse.xtext.xbase.XAbstractFeatureCall), with=#[typeof(orgeclipsextextxbaseXExpressionAspect)])
abstract class orgeclipsextextxbaseXAbstractFeatureCallAspect extends orgeclipsextextxbaseXExpressionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^typeArguments.forEach[reinit]
_self.^implicitReceiver?.reinit
_self.^implicitFirstArgument?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^feature?.visitToAddClasses(theSlicer)
		_self.^typeArguments.forEach[visitToAddClasses(theSlicer)]
		_self.^implicitReceiver?.visitToAddClasses(theSlicer)
		_self.^implicitFirstArgument?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^feature!==null){
		_self.^feature.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^feature.sliced) 		theSlicer.onfeatureSliced(_self, _self.^feature)
		}
		_self.^typeArguments.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.ontypeArgumentsSliced(_self, _elt)
		]
		if(_self.^implicitReceiver!==null){
		_self.^implicitReceiver.visitToAddRelations(theSlicer)
		}
		if(_self.^implicitFirstArgument!==null){
		_self.^implicitFirstArgument.visitToAddRelations(theSlicer)
		}

	}
}

@Aspect(className=typeof(org.eclipse.xtext.xbase.XMemberFeatureCall), with=#[typeof(orgeclipsextextxbaseXAbstractFeatureCallAspect)])
class orgeclipsextextxbaseXMemberFeatureCallAspect extends orgeclipsextextxbaseXAbstractFeatureCallAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^memberCallTarget?.reinit
_self.^memberCallArguments.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^memberCallTarget?.visitToAddClasses(theSlicer)
		_self.^memberCallArguments.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^memberCallTarget!==null){
		_self.^memberCallTarget.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^memberCallTarget.sliced) 		theSlicer.onmemberCallTargetSliced(_self, _self.^memberCallTarget)
		}
		_self.^memberCallArguments.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onmemberCallArgumentsSliced(_self, _elt)
		]

	}
}

@Aspect(className=typeof(org.eclipse.xtext.xbase.XFeatureCall), with=#[typeof(orgeclipsextextxbaseXAbstractFeatureCallAspect)])
class orgeclipsextextxbaseXFeatureCallAspect extends orgeclipsextextxbaseXAbstractFeatureCallAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^featureCallArguments.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^featureCallArguments.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^featureCallArguments.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onfeatureCallArgumentsSliced(_self, _elt)
		]

	}
}

@Aspect(className=typeof(org.eclipse.xtext.xbase.XConstructorCall), with=#[typeof(orgeclipsextextxbaseXExpressionAspect)])
class orgeclipsextextxbaseXConstructorCallAspect extends orgeclipsextextxbaseXExpressionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^arguments.forEach[reinit]
_self.^typeArguments.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^constructor?.visitToAddClasses(theSlicer)
		_self.^arguments.forEach[visitToAddClasses(theSlicer)]
		_self.^typeArguments.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^constructor!==null){
		_self.^constructor.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^constructor.sliced) 		theSlicer.onconstructorSliced(_self, _self.^constructor)
		}
		_self.^arguments.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onargumentsSliced(_self, _elt)
		]
		_self.^typeArguments.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.ontypeArgumentsSliced(_self, _elt)
		]

	}
}

@Aspect(className=typeof(org.eclipse.xtext.xbase.XBooleanLiteral), with=#[typeof(orgeclipsextextxbaseXExpressionAspect)])
class orgeclipsextextxbaseXBooleanLiteralAspect extends orgeclipsextextxbaseXExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.xtext.xbase.XNullLiteral), with=#[typeof(orgeclipsextextxbaseXExpressionAspect)])
class orgeclipsextextxbaseXNullLiteralAspect extends orgeclipsextextxbaseXExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.xtext.xbase.XNumberLiteral), with=#[typeof(orgeclipsextextxbaseXExpressionAspect)])
class orgeclipsextextxbaseXNumberLiteralAspect extends orgeclipsextextxbaseXExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.xtext.xbase.XStringLiteral), with=#[typeof(orgeclipsextextxbaseXExpressionAspect)])
class orgeclipsextextxbaseXStringLiteralAspect extends orgeclipsextextxbaseXExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.xtext.xbase.XCollectionLiteral), with=#[typeof(orgeclipsextextxbaseXExpressionAspect)])
abstract class orgeclipsextextxbaseXCollectionLiteralAspect extends orgeclipsextextxbaseXExpressionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^elements.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^elements.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^elements.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onelementsSliced(_self, _elt)
		]

	}
}

@Aspect(className=typeof(org.eclipse.xtext.xbase.XListLiteral), with=#[typeof(orgeclipsextextxbaseXCollectionLiteralAspect)])
class orgeclipsextextxbaseXListLiteralAspect extends orgeclipsextextxbaseXCollectionLiteralAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.xtext.xbase.XSetLiteral), with=#[typeof(orgeclipsextextxbaseXCollectionLiteralAspect)])
class orgeclipsextextxbaseXSetLiteralAspect extends orgeclipsextextxbaseXCollectionLiteralAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.xtext.xbase.XClosure), with=#[typeof(orgeclipsextextxbaseXExpressionAspect)])
class orgeclipsextextxbaseXClosureAspect extends orgeclipsextextxbaseXExpressionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^declaredFormalParameters.forEach[reinit]
_self.^expression?.reinit
_self.^implicitFormalParameters.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^declaredFormalParameters.forEach[visitToAddClasses(theSlicer)]
		_self.^expression?.visitToAddClasses(theSlicer)
		_self.^implicitFormalParameters.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^declaredFormalParameters.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.ondeclaredFormalParametersSliced(_self, _elt)
		]
		if(_self.^expression!==null){
		_self.^expression.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^expression.sliced) 		theSlicer.onexpressionSliced(_self, _self.^expression)
		}
		_self.^implicitFormalParameters.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(org.eclipse.xtext.xbase.XCastedExpression), with=#[typeof(orgeclipsextextxbaseXExpressionAspect)])
class orgeclipsextextxbaseXCastedExpressionAspect extends orgeclipsextextxbaseXExpressionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^type?.reinit
_self.^target?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^type?.visitToAddClasses(theSlicer)
		_self.^target?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^type!==null){
		_self.^type.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^type.sliced) 		theSlicer.ontypeSliced(_self, _self.^type)
		}
		if(_self.^target!==null){
		_self.^target.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^target.sliced) 		theSlicer.ontargetSliced(_self, _self.^target)
		}

	}
}

@Aspect(className=typeof(org.eclipse.xtext.xbase.XBinaryOperation), with=#[typeof(orgeclipsextextxbaseXAbstractFeatureCallAspect)])
class orgeclipsextextxbaseXBinaryOperationAspect extends orgeclipsextextxbaseXAbstractFeatureCallAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^leftOperand?.reinit
_self.^rightOperand?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^leftOperand?.visitToAddClasses(theSlicer)
		_self.^rightOperand?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^leftOperand!==null){
		_self.^leftOperand.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^leftOperand.sliced) 		theSlicer.onleftOperandSliced(_self, _self.^leftOperand)
		}
		if(_self.^rightOperand!==null){
		_self.^rightOperand.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^rightOperand.sliced) 		theSlicer.onrightOperandSliced(_self, _self.^rightOperand)
		}

	}
}

@Aspect(className=typeof(org.eclipse.xtext.xbase.XUnaryOperation), with=#[typeof(orgeclipsextextxbaseXAbstractFeatureCallAspect)])
class orgeclipsextextxbaseXUnaryOperationAspect extends orgeclipsextextxbaseXAbstractFeatureCallAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^operand?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^operand?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^operand!==null){
		_self.^operand.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^operand.sliced) 		theSlicer.onoperandSliced(_self, _self.^operand)
		}

	}
}

@Aspect(className=typeof(org.eclipse.xtext.xbase.XPostfixOperation), with=#[typeof(orgeclipsextextxbaseXAbstractFeatureCallAspect)])
class orgeclipsextextxbaseXPostfixOperationAspect extends orgeclipsextextxbaseXAbstractFeatureCallAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^operand?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^operand?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^operand!==null){
		_self.^operand.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^operand.sliced) 		theSlicer.onoperandSliced(_self, _self.^operand)
		}

	}
}

@Aspect(className=typeof(org.eclipse.xtext.xbase.XForLoopExpression), with=#[typeof(orgeclipsextextxbaseXExpressionAspect)])
class orgeclipsextextxbaseXForLoopExpressionAspect extends orgeclipsextextxbaseXExpressionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^forExpression?.reinit
_self.^eachExpression?.reinit
_self.^declaredParam?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^forExpression?.visitToAddClasses(theSlicer)
		_self.^eachExpression?.visitToAddClasses(theSlicer)
		_self.^declaredParam?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^forExpression!==null){
		_self.^forExpression.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^forExpression.sliced) 		theSlicer.onforExpressionSliced(_self, _self.^forExpression)
		}
		if(_self.^eachExpression!==null){
		_self.^eachExpression.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^eachExpression.sliced) 		theSlicer.oneachExpressionSliced(_self, _self.^eachExpression)
		}
		if(_self.^declaredParam!==null){
		_self.^declaredParam.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^declaredParam.sliced) 		theSlicer.ondeclaredParamSliced(_self, _self.^declaredParam)
		}

	}
}

@Aspect(className=typeof(org.eclipse.xtext.xbase.XBasicForLoopExpression), with=#[typeof(orgeclipsextextxbaseXExpressionAspect)])
class orgeclipsextextxbaseXBasicForLoopExpressionAspect extends orgeclipsextextxbaseXExpressionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^expression?.reinit
_self.^eachExpression?.reinit
_self.^initExpressions.forEach[reinit]
_self.^updateExpressions.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^eachExpression?.visitToAddClasses(theSlicer)
		_self.^expression?.visitToAddClasses(theSlicer)
		_self.^initExpressions.forEach[visitToAddClasses(theSlicer)]
		_self.^updateExpressions.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^eachExpression!==null){
		_self.^eachExpression.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^eachExpression.sliced) 		theSlicer.oneachExpressionSliced(_self, _self.^eachExpression)
		}
		if(_self.^expression!==null){
		_self.^expression.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^expression.sliced) 		theSlicer.onexpressionSliced(_self, _self.^expression)
		}
		_self.^initExpressions.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.oninitExpressionsSliced(_self, _elt)
		]
		_self.^updateExpressions.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onupdateExpressionsSliced(_self, _elt)
		]

	}
}

@Aspect(className=typeof(org.eclipse.xtext.xbase.XAbstractWhileExpression), with=#[typeof(orgeclipsextextxbaseXExpressionAspect)])
abstract class orgeclipsextextxbaseXAbstractWhileExpressionAspect extends orgeclipsextextxbaseXExpressionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^predicate?.reinit
_self.^body?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^predicate?.visitToAddClasses(theSlicer)
		_self.^body?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^predicate!==null){
		_self.^predicate.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^predicate.sliced) 		theSlicer.onpredicateSliced(_self, _self.^predicate)
		}
		if(_self.^body!==null){
		_self.^body.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^body.sliced) 		theSlicer.onbodySliced(_self, _self.^body)
		}

	}
}

@Aspect(className=typeof(org.eclipse.xtext.xbase.XDoWhileExpression), with=#[typeof(orgeclipsextextxbaseXAbstractWhileExpressionAspect)])
class orgeclipsextextxbaseXDoWhileExpressionAspect extends orgeclipsextextxbaseXAbstractWhileExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.xtext.xbase.XWhileExpression), with=#[typeof(orgeclipsextextxbaseXAbstractWhileExpressionAspect)])
class orgeclipsextextxbaseXWhileExpressionAspect extends orgeclipsextextxbaseXAbstractWhileExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.xtext.xbase.XTypeLiteral), with=#[typeof(orgeclipsextextxbaseXExpressionAspect)])
class orgeclipsextextxbaseXTypeLiteralAspect extends orgeclipsextextxbaseXExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^type?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^type!==null){
		_self.^type.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^type.sliced) 		theSlicer.ontypeSliced(_self, _self.^type)
		}

	}
}

@Aspect(className=typeof(org.eclipse.xtext.xbase.XInstanceOfExpression), with=#[typeof(orgeclipsextextxbaseXExpressionAspect)])
class orgeclipsextextxbaseXInstanceOfExpressionAspect extends orgeclipsextextxbaseXExpressionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^type?.reinit
_self.^expression?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^type?.visitToAddClasses(theSlicer)
		_self.^expression?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^type!==null){
		_self.^type.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^type.sliced) 		theSlicer.ontypeSliced(_self, _self.^type)
		}
		if(_self.^expression!==null){
		_self.^expression.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^expression.sliced) 		theSlicer.onexpressionSliced(_self, _self.^expression)
		}

	}
}

@Aspect(className=typeof(org.eclipse.xtext.xbase.XThrowExpression), with=#[typeof(orgeclipsextextxbaseXExpressionAspect)])
class orgeclipsextextxbaseXThrowExpressionAspect extends orgeclipsextextxbaseXExpressionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^expression?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^expression?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^expression!==null){
		_self.^expression.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^expression.sliced) 		theSlicer.onexpressionSliced(_self, _self.^expression)
		}

	}
}

@Aspect(className=typeof(org.eclipse.xtext.xbase.XTryCatchFinallyExpression), with=#[typeof(orgeclipsextextxbaseXExpressionAspect)])
class orgeclipsextextxbaseXTryCatchFinallyExpressionAspect extends orgeclipsextextxbaseXExpressionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^expression?.reinit
_self.^finallyExpression?.reinit
_self.^catchClauses.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^expression?.visitToAddClasses(theSlicer)
		_self.^finallyExpression?.visitToAddClasses(theSlicer)
		_self.^catchClauses.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^expression!==null){
		_self.^expression.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^expression.sliced) 		theSlicer.onexpressionSliced(_self, _self.^expression)
		}
		if(_self.^finallyExpression!==null){
		_self.^finallyExpression.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^finallyExpression.sliced) 		theSlicer.onfinallyExpressionSliced(_self, _self.^finallyExpression)
		}
		_self.^catchClauses.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.oncatchClausesSliced(_self, _elt)
		]

	}
}

@Aspect(className=typeof(org.eclipse.xtext.xbase.XCatchClause), with=#[typeof(__SlicerAspect__)])
class orgeclipsextextxbaseXCatchClauseAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^expression?.reinit
_self.^declaredParam?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^expression?.visitToAddClasses(theSlicer)
		_self.^declaredParam?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^expression!==null){
		_self.^expression.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^expression.sliced) 		theSlicer.onexpressionSliced(_self, _self.^expression)
		}
		if(_self.^declaredParam!==null){
		_self.^declaredParam.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^declaredParam.sliced) 		theSlicer.ondeclaredParamSliced(_self, _self.^declaredParam)
		}

	}
}

@Aspect(className=typeof(org.eclipse.xtext.xbase.XAssignment), with=#[typeof(orgeclipsextextxbaseXAbstractFeatureCallAspect)])
class orgeclipsextextxbaseXAssignmentAspect extends orgeclipsextextxbaseXAbstractFeatureCallAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^assignable?.reinit
_self.^value?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^assignable?.visitToAddClasses(theSlicer)
		_self.^value?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^assignable!==null){
		_self.^assignable.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^assignable.sliced) 		theSlicer.onassignableSliced(_self, _self.^assignable)
		}
		if(_self.^value!==null){
		_self.^value.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^value.sliced) 		theSlicer.onvalueSliced(_self, _self.^value)
		}

	}
}

@Aspect(className=typeof(org.eclipse.xtext.xbase.XReturnExpression), with=#[typeof(orgeclipsextextxbaseXExpressionAspect)])
class orgeclipsextextxbaseXReturnExpressionAspect extends orgeclipsextextxbaseXExpressionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^expression?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^expression?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^expression!==null){
		_self.^expression.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^expression.sliced) 		theSlicer.onexpressionSliced(_self, _self.^expression)
		}

	}
}

@Aspect(className=typeof(org.eclipse.xtext.xbase.XSynchronizedExpression), with=#[typeof(orgeclipsextextxbaseXExpressionAspect)])
class orgeclipsextextxbaseXSynchronizedExpressionAspect extends orgeclipsextextxbaseXExpressionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^param?.reinit
_self.^expression?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(MelangeFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^expression?.visitToAddClasses(theSlicer)
		_self.^param?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(MelangeFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^expression!==null){
		_self.^expression.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^expression.sliced) 		theSlicer.onexpressionSliced(_self, _self.^expression)
		}
		if(_self.^param!==null){
		_self.^param.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^param.sliced) 		theSlicer.onparamSliced(_self, _self.^param)
		}

	}
}

