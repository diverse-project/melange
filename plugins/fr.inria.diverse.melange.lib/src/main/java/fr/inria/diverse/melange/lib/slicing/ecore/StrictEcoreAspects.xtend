package fr.inria.diverse.melange.lib.slicing.ecore

import static extension fr.inria.diverse.melange.lib.slicing.ecore.orgeclipseemfecoreEClassifierAspect.*
import static extension fr.inria.diverse.melange.lib.slicing.ecore.orgeclipseemfecoreETypedElementAspect.*
import static extension fr.inria.diverse.melange.lib.slicing.ecore.orgeclipseemfecoreEOperationAspect.*
import static extension fr.inria.diverse.melange.lib.slicing.ecore.orgeclipseemfecoreEAnnotationAspect.*
import static extension fr.inria.diverse.melange.lib.slicing.ecore.orgeclipseemfecoreETypeParameterAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import org.eclipse.emf.ecore.EDataType

@Aspect(className=typeof(java.lang.Object))
abstract class __SlicerAspect__ {
	protected var boolean visitedForRelations = false
	protected var boolean sliced = false
	protected var org.eclipse.emf.ecore.EObject clonedElt = null

	def void visitToAddClasses(StrictEcore theSlicer){
		if(!_self.sliced) {
			_self.sliced = true
			_self._visitToAddClasses(theSlicer)
		}
	}
	 
	protected def void _visitToAddClasses(StrictEcore theSlicer){
		//println("visitToAddClasses("+_self+")")
	}

	def void visitToAddRelations(StrictEcore theSlicer){
		if(!_self.visitedForRelations) {
			_self.visitedForRelations = true
			_self._visitToAddRelations(theSlicer)
		}
	}
	
	protected def void _visitToAddRelations(StrictEcore theSlicer){}

	def void feedOpposites(){}

	def void reinit(){
		_self.visitedForRelations = false
		_self.sliced = false
		_self.clonedElt = null
	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EAttribute), with=#[typeof(orgeclipseemfecoreEStructuralFeatureAspect)])
class orgeclipseemfecoreEAttributeAspect extends orgeclipseemfecoreEStructuralFeatureAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){//println("visitToAddClasses("+_self+")")
		if((!theSlicer.card1 || _self.checkcard1)){
		if(_self.clonedElt===null){
			_self.clonedElt = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAttribute
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)
		_self.^EAttributeType?.visitToAddClasses(theSlicer)

		}
	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		if((!theSlicer.card1 || _self.checkcard1)){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^EAttributeType!==null){
		_self.^EAttributeType.visitToAddRelations(theSlicer)
		}

		}
	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EAnnotation), with=#[typeof(orgeclipseemfecoreEModelElementAspect)])
class orgeclipseemfecoreEAnnotationAspect extends orgeclipseemfecoreEModelElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){
		_self.super_feedOpposites
_self.^details.forEach[feedOpposites]
_self.^contents.forEach[feedOpposites]
	}

	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^details.forEach[reinit]
_self.^contents.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){//println("visitToAddClasses("+_self+")")
		if(_self.clonedElt===null){
			_self.clonedElt = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAnnotation
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EClass), with=#[typeof(orgeclipseemfecoreEClassifierAspect)])
class orgeclipseemfecoreEClassAspect extends orgeclipseemfecoreEClassifierAspect{
	val java.util.List<org.eclipse.emf.ecore.EClass> ^lowerTypes = newArrayList

	@OverrideAspectMethod
	def void feedOpposites(){
		_self.super_feedOpposites
_self.^ESuperTypes.forEach[^lowerTypes.add(_self)]
_self.^EOperations.forEach[feedOpposites]
_self.^EStructuralFeatures.forEach[feedOpposites]
_self.^EGenericSuperTypes.forEach[feedOpposites]
	}

	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^EOperations.forEach[reinit]
_self.^EStructuralFeatures.forEach[reinit]
_self.^EGenericSuperTypes.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){//println("visitToAddClasses("+_self+")")
		if(_self.clonedElt===null){
			_self.clonedElt = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEClass
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)
		_self.^ESuperTypes.forEach[visitToAddClasses(theSlicer)]
		if(theSlicer.optionlowerTypes){
		_self.^lowerTypes.forEach[visitToAddClasses(theSlicer)]
		}
		_self.^EStructuralFeatures.forEach[visitToAddClasses(theSlicer)]
		_self.^EOperations.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^ESuperTypes.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced && _elt.clonedElt!==null) (_self.clonedElt as org.eclipse.emf.ecore.EClass).^ESuperTypes.add( _elt.clonedElt as org.eclipse.emf.ecore.EClass)
		]
		if(theSlicer.optionlowerTypes){
		_self.^lowerTypes.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced && _elt.clonedElt!==null) (_self.clonedElt as org.eclipse.emf.ecore.EClass).^lowerTypes.add( _elt.clonedElt as org.eclipse.emf.ecore.EClass)
		]
		}
		_self.^EStructuralFeatures.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced && _elt.clonedElt!==null) (_self.clonedElt as org.eclipse.emf.ecore.EClass).^EStructuralFeatures.add( _elt.clonedElt as org.eclipse.emf.ecore.EStructuralFeature)
		]
		_self.^EOperations.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced && _elt.clonedElt!==null) (_self.clonedElt as org.eclipse.emf.ecore.EClass).^EOperations.add( _elt.clonedElt as org.eclipse.emf.ecore.EOperation)
		]

		if(_self.sliced) (_self.clonedElt as org.eclipse.emf.ecore.EClass).^abstract = _self.^abstract

		if(_self.sliced) (_self.clonedElt as org.eclipse.emf.ecore.EClass).^interface = _self.^interface

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EClassifier), with=#[typeof(orgeclipseemfecoreENamedElementAspect)])
abstract class orgeclipseemfecoreEClassifierAspect extends orgeclipseemfecoreENamedElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){
		_self.super_feedOpposites
_self.^ETypeParameters.forEach[feedOpposites]
	}

	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^ETypeParameters.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){//println("visitToAddClasses("+_self+")")
		_self.super__visitToAddClasses(theSlicer)
		_self.^EPackage?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^EPackage!==null){
		_self.^EPackage.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^EPackage.sliced) (_self.EPackage.clonedElt as org.eclipse.emf.ecore.EPackage).^EClassifiers.add(_self.clonedElt as org.eclipse.emf.ecore.EClassifier)
		}

		if(_self.sliced) (_self.clonedElt as org.eclipse.emf.ecore.EClassifier).^instanceTypeName = _self.^instanceTypeName

		if(_self.sliced) (_self.clonedElt as org.eclipse.emf.ecore.EClassifier).^instanceClassName = _self.^instanceClassName

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EDataType), with=#[typeof(orgeclipseemfecoreEClassifierAspect)])
class orgeclipseemfecoreEDataTypeAspect extends orgeclipseemfecoreEClassifierAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){//println("visitToAddClasses("+_self+")")
		if(_self.clonedElt===null){
			_self.clonedElt = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEDataType
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)
	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EEnum), with=#[typeof(orgeclipseemfecoreEDataTypeAspect)])
class orgeclipseemfecoreEEnumAspect extends orgeclipseemfecoreEDataTypeAspect{
	@OverrideAspectMethod
	def void feedOpposites(){
		_self.super_feedOpposites
_self.^ELiterals.forEach[feedOpposites]
	}

	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^ELiterals.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){//println("visitToAddClasses("+_self+")")
		if(_self.clonedElt===null){
			_self.clonedElt = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEEnum
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)
		_self.^ELiterals.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^ELiterals.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced && _elt.clonedElt!==null) (_self.clonedElt as org.eclipse.emf.ecore.EEnum).^ELiterals.add( _elt.clonedElt as org.eclipse.emf.ecore.EEnumLiteral)
		]

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EEnumLiteral), with=#[typeof(orgeclipseemfecoreENamedElementAspect)])
class orgeclipseemfecoreEEnumLiteralAspect extends orgeclipseemfecoreENamedElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){//println("visitToAddClasses("+_self+")")
		if(_self.clonedElt===null){
			_self.clonedElt = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEEnumLiteral
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)
		_self.^EEnum?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^EEnum!==null){
		_self.^EEnum.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^EEnum.sliced) (_self.EEnum.clonedElt as org.eclipse.emf.ecore.EEnum).^ELiterals.add(_self.clonedElt as org.eclipse.emf.ecore.EEnumLiteral)
		}

		if(_self.sliced) (_self.clonedElt as org.eclipse.emf.ecore.EEnumLiteral).^value = _self.^value

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EModelElement), with=#[typeof(__SlicerAspect__)])
abstract class orgeclipseemfecoreEModelElementAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void feedOpposites(){
		_self.super_feedOpposites
_self.^EAnnotations.forEach[feedOpposites]
	}

	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^EAnnotations.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){//println("visitToAddClasses("+_self+")")
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.ENamedElement), with=#[typeof(orgeclipseemfecoreEModelElementAspect)])
abstract class orgeclipseemfecoreENamedElementAspect extends orgeclipseemfecoreEModelElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){//println("visitToAddClasses("+_self+")")
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)

		if(_self.sliced) (_self.clonedElt as org.eclipse.emf.ecore.ENamedElement).^name = _self.^name

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EOperation), with=#[typeof(orgeclipseemfecoreETypedElementAspect)])
class orgeclipseemfecoreEOperationAspect extends orgeclipseemfecoreETypedElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){
		_self.super_feedOpposites
_self.^ETypeParameters.forEach[feedOpposites]
_self.^EParameters.forEach[feedOpposites]
_self.^EGenericExceptions.forEach[feedOpposites]
	}

	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^ETypeParameters.forEach[reinit]
_self.^EParameters.forEach[reinit]
_self.^EGenericExceptions.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){//println("visitToAddClasses("+_self+")")
		if(_self.clonedElt===null){
			_self.clonedElt = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEOperation
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)
		_self.^EParameters.forEach[visitToAddClasses(theSlicer)]
		_self.^EContainingClass?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^EParameters.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced && _elt.clonedElt!==null) (_self.clonedElt as org.eclipse.emf.ecore.EOperation).^EParameters.add( _elt.clonedElt as org.eclipse.emf.ecore.EParameter)
		]
		if(_self.^EContainingClass!==null){
		_self.^EContainingClass.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^EContainingClass.sliced) (_self.EContainingClass.clonedElt as org.eclipse.emf.ecore.EClass).^EOperations.add(_self.clonedElt as org.eclipse.emf.ecore.EOperation)
		}

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EPackage), with=#[typeof(orgeclipseemfecoreENamedElementAspect)])
class orgeclipseemfecoreEPackageAspect extends orgeclipseemfecoreENamedElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){
		_self.super_feedOpposites
_self.^EClassifiers.forEach[feedOpposites]
_self.^ESubpackages.forEach[feedOpposites]
	}

	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^EClassifiers.forEach[reinit]
_self.^ESubpackages.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){//println("visitToAddClasses("+_self+")")
		if(_self.clonedElt===null){
			_self.clonedElt = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEPackage
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)
		_self.^ESuperPackage?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^ESuperPackage!==null){
		_self.^ESuperPackage.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^ESuperPackage.sliced) (_self.ESuperPackage.clonedElt as org.eclipse.emf.ecore.EPackage).^ESubpackages.add(_self.clonedElt as org.eclipse.emf.ecore.EPackage)
		}

		if(_self.sliced) (_self.clonedElt as org.eclipse.emf.ecore.EPackage).^nsPrefix = _self.^nsPrefix

		if(_self.sliced) (_self.clonedElt as org.eclipse.emf.ecore.EPackage).^nsURI = _self.^nsURI

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EParameter), with=#[typeof(orgeclipseemfecoreETypedElementAspect)])
class orgeclipseemfecoreEParameterAspect extends orgeclipseemfecoreETypedElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){//println("visitToAddClasses("+_self+")")
		if(_self.clonedElt===null){
			_self.clonedElt = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEParameter
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EReference), with=#[typeof(orgeclipseemfecoreEStructuralFeatureAspect)])
class orgeclipseemfecoreEReferenceAspect extends orgeclipseemfecoreEStructuralFeatureAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){//println("visitToAddClasses("+_self+")")
		if((!theSlicer.card1 || _self.checkcard1)){
		if(_self.clonedElt===null){
			_self.clonedElt = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEReference
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)
		_self.^EReferenceType?.visitToAddClasses(theSlicer)

		}
	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		if((!theSlicer.card1 || _self.checkcard1)){
		_self.super__visitToAddRelations(theSlicer)

		if(_self.sliced) (_self.clonedElt as org.eclipse.emf.ecore.EReference).^containment = _self.^containment

		if(_self.sliced) (_self.clonedElt as org.eclipse.emf.ecore.EReference).^resolveProxies = _self.^resolveProxies
		
		if(_self.sliced && _self.^EOpposite.clonedElt != null){
			(_self.clonedElt as org.eclipse.emf.ecore.EReference).^EOpposite = _self.^EOpposite.clonedElt as org.eclipse.emf.ecore.EReference
		}
		
		if(_self.^EReferenceType!==null){
		_self.^EReferenceType.visitToAddRelations(theSlicer)
		}

		}
	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EStructuralFeature), with=#[typeof(orgeclipseemfecoreETypedElementAspect)])
abstract class orgeclipseemfecoreEStructuralFeatureAspect extends orgeclipseemfecoreETypedElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){//println("visitToAddClasses("+_self+")")
		if((!theSlicer.card1 || _self.checkcard1)){
		_self.super__visitToAddClasses(theSlicer)
		_self.^EContainingClass?.visitToAddClasses(theSlicer)

		}
	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		if((!theSlicer.card1 || _self.checkcard1)){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^EContainingClass!==null){
		_self.^EContainingClass.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^EContainingClass.sliced) (_self.EContainingClass.clonedElt as org.eclipse.emf.ecore.EClass).^EStructuralFeatures.add(_self.clonedElt as org.eclipse.emf.ecore.EStructuralFeature)
		}

		if(_self.sliced) (_self.clonedElt as org.eclipse.emf.ecore.EStructuralFeature).^changeable = _self.^changeable

		if(_self.sliced) (_self.clonedElt as org.eclipse.emf.ecore.EStructuralFeature).^defaultValueLiteral = _self.^defaultValueLiteral

		if(_self.sliced) (_self.clonedElt as org.eclipse.emf.ecore.EStructuralFeature).^derived = _self.^derived

		if(_self.sliced) (_self.clonedElt as org.eclipse.emf.ecore.EStructuralFeature).^transient = _self.^transient

		if(_self.sliced) (_self.clonedElt as org.eclipse.emf.ecore.EStructuralFeature).^unsettable = _self.^unsettable

		if(_self.sliced) (_self.clonedElt as org.eclipse.emf.ecore.EStructuralFeature).^volatile = _self.^volatile

		}
	}
	def boolean checkcard1(){
		val feat = _self
		 return feat.lowerBound>0 
	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.ETypedElement), with=#[typeof(orgeclipseemfecoreENamedElementAspect)])
abstract class orgeclipseemfecoreETypedElementAspect extends orgeclipseemfecoreENamedElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){
		_self.super_feedOpposites
_self.^EGenericType?.feedOpposites
	}

	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^EGenericType?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){//println("visitToAddClasses("+_self+")")
		_self.super__visitToAddClasses(theSlicer)
		_self.^EType?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^EType!==null){
		_self.^EType.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^EType.sliced){
			if(_self.^EType instanceof EDataType && _self.isEcoreDataTypeTyped(_self.^EType as EDataType)){
				(_self.clonedElt as org.eclipse.emf.ecore.ETypedElement).^EType = _self.^EType
			}
			else{
				(_self.clonedElt as org.eclipse.emf.ecore.ETypedElement).^EType = _self.^EType.clonedElt as org.eclipse.emf.ecore.EClassifier
			}
		}
		}

		if(_self.sliced) (_self.clonedElt as org.eclipse.emf.ecore.ETypedElement).^lowerBound = _self.^lowerBound

		if(_self.sliced) (_self.clonedElt as org.eclipse.emf.ecore.ETypedElement).^ordered = _self.^ordered

		if(_self.sliced) (_self.clonedElt as org.eclipse.emf.ecore.ETypedElement).^unique = _self.^unique

		if(_self.sliced) (_self.clonedElt as org.eclipse.emf.ecore.ETypedElement).^upperBound = _self.^upperBound

	}
	
	def boolean isEcoreDataTypeTyped(EDataType type){
		return (type.name == "EBoolean" ||
				type.name == "EString" ||
				type.name == "EByte" ||
				type.name == "EDouble" ||
				type.name == "EFloat" ||
				type.name == "EInteger" ||
				type.name == "EInt" ||
				type.name == "ELong" ||
				type.name == "EShort") &&
				type.EPackage.name == "ecore"
	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EGenericType), with=#[typeof(__SlicerAspect__)])
class orgeclipseemfecoreEGenericTypeAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void feedOpposites(){
		_self.super_feedOpposites
_self.^EUpperBound?.feedOpposites
_self.^ETypeArguments.forEach[feedOpposites]
_self.^ELowerBound?.feedOpposites
	}

	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^EUpperBound?.reinit
_self.^ETypeArguments.forEach[reinit]
_self.^ELowerBound?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){//println("visitToAddClasses("+_self+")")
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.ETypeParameter), with=#[typeof(orgeclipseemfecoreENamedElementAspect)])
class orgeclipseemfecoreETypeParameterAspect extends orgeclipseemfecoreENamedElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){
		_self.super_feedOpposites
_self.^EBounds.forEach[feedOpposites]
	}

	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^EBounds.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){//println("visitToAddClasses("+_self+")")
		if(_self.clonedElt===null){
			_self.clonedElt = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createETypeParameter
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

