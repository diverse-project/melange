package fr.inria.diverse.melange.lib.slicing.ecore

import static extension fr.inria.diverse.melange.lib.slicing.ecore.__SlicerAspect__.*
import java.io.IOException

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
	}

	def void objectCloned(org.eclipse.emf.ecore.EObject object){
		this.clonedElts.add(object)
	}

	def void save() throws IOException {
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
