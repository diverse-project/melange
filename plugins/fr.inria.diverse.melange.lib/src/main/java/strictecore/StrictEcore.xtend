package strictecore

import static extension strictecore.__SlicerAspect__.*
import static extension strictecore.orgeclipseemfecoreENamedElementAspect.*
import static extension strictecore.orgeclipseemfecoreEStructuralFeatureAspect.*
import static extension strictecore.orgeclipseemfecoreEReferenceAspect.*
import static extension strictecore.orgeclipseemfecoreEAttributeAspect.*
import static extension strictecore.orgeclipseemfecoreEDataTypeAspect.*
import static extension strictecore.orgeclipseemfecoreEClassifierAspect.*
import static extension strictecore.orgeclipseemfecoreEEnumAspect.*
import static extension strictecore.orgeclipseemfecoreEClassAspect.*
import static extension strictecore.orgeclipseemfecoreEEnumLiteralAspect.*
import static extension strictecore.orgeclipseemfecoreETypedElementAspect.*
import static extension strictecore.orgeclipseemfecoreEOperationAspect.*
import static extension strictecore.orgeclipseemfecoreEPackageAspect.*
import static extension strictecore.orgeclipseemfecoreEParameterAspect.*
import static extension strictecore.orgeclipseemfecoreEModelElementAspect.*
import static extension strictecore.orgeclipseemfecoreEAnnotationAspect.*
import static extension strictecore.orgeclipseemfecoreETypeParameterAspect.*
class StrictEcore{
	val java.util.List<org.eclipse.emf.ecore.EModelElement> inputEModelElement
	private val java.util.List<org.eclipse.emf.ecore.EObject> clonedElts = newArrayList
	public val boolean optionlowerTypes
	val String nameExtension
	public val boolean card1

	val org.eclipse.emf.ecore.EObject _root

	new(java.util.List<org.eclipse.emf.ecore.EModelElement> inputEModelElement, org.eclipse.emf.ecore.EObject metamodelRoot, boolean optionlowerTypes, String nameExtension, boolean card1){
		this.inputEModelElement = inputEModelElement
		if(metamodelRoot===null) throw new IllegalArgumentException
		this._root = metamodelRoot
		this.optionlowerTypes = optionlowerTypes
		this.nameExtension=nameExtension
		this.card1=card1
	}

	def void slice(){
		_root.feedOpposites
		inputEModelElement?.forEach[visitToAddClasses(this)]
		inputEModelElement?.forEach[visitToAddRelations(this)]
		save
	}

	def void objectCloned(org.eclipse.emf.ecore.EObject object){
		this.clonedElts.add(object)
	}

	def void save(){
		val objs = this.clonedElts.filter[eContainer===null]
		val resSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
		resSet.getResourceFactoryRegistry.getExtensionToFactoryMap.put("*", new org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl)
		val res = resSet.createResource(org.eclipse.emf.common.util.URI.createURI("modelSlice."+this.nameExtension))
		res.getContents.addAll(objs)
	    res.save(java.util.Collections.emptyMap)
	    res.unload
	}

	def void reinit() {
		_root.reinit
	}
}
