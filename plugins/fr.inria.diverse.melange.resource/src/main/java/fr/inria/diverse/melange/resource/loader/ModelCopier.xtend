package fr.inria.diverse.melange.resource.loader

import java.util.Set
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EObject
import java.util.Map
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI

class ModelCopier {


	/**
	 * Mapping between models elements
	 */
	Map<EObject,EObject> modelsMapping = newHashMap
	
	Set<EPackage> sourceMM
	Set<EPackage> targetMM

	def void setMapping(Set<EPackage> from, Set<EPackage> to) {
		sourceMM = from
		targetMM = to
		//TODO: mapping between metamodels
	}
	
	def Resource clone(Resource res) {
		
		/*
		 * Step 1: resolve proxies
		 */
		EcoreUtil.resolveAll(res)
		
		/*
		 * Step 2: copy EObjects & EAttributes values
		 */
		res.allContents.forEach[ obj |
			val image = clone(obj)
			modelsMapping.put(obj,image)
		]
		/*
		 * Step 3: copy references values
		 */
		res.allContents.forEach[ obj |
			val image = modelsMapping.get(obj)
			cloneReferences(obj,image)
		]
		
		/*
		 * Step 4: create a new resource & fill it
		 */
		val extendedURI = URI.createURI("modelAsExtended") //TODO: find better URI
		val extendedResource = (new ResourceSetImpl).createResource(extendedURI)
		extendedResource.contents.addAll(res.contents.map[modelsMapping.get(it)].toList)
		
		//Add copy of elements from crossref
		extendedResource.contents.addAll(modelsMapping.values.filter[img |img.eResource === null])
		
		return extendedResource
	}
	
	private def EObject clone(EObject source) {
		val EClass srcClass = source.eClass
		val EClass trgClass = getTargetClass(srcClass)
		
		val copy = EcoreUtil.create(trgClass)
		srcClass.EAllAttributes.forEach[srcAtt |
			val trgAtt = trgClass.EAllAttributes.findFirst[name == srcAtt.name]
			
			val attVal = source.eGet(srcAtt)
			copy.eSet(trgAtt,attVal)
			//setting.set(attVal)
		]
		
		return copy
	}
	
	private def void cloneReferences(EObject source, EObject target) {
		val EClass srcClass = source.eClass
		val EClass trgClass = getTargetClass(srcClass)
		
		srcClass.EAllReferences.forEach[ srcRef |
			
			//Don't process oppsite of 0..* to keep elements order
			if(srcRef.EOpposite === null || srcRef.EOpposite.upperBound != -1){
				val trgRef = trgClass.EAllReferences.findFirst[name == srcRef.name]
			
				val refVal = source.eGet(srcRef)
				if(refVal instanceof EList) {
					val copy = new BasicEList
					copy.addAll(refVal.map[modelsMapping.get(it)])
					target.eSet(trgRef,copy)
				}
				else if(refVal instanceof EObject) {
					target.eSet(trgRef,modelsMapping.get(refVal))
				}
			}
		]
	}
	
	private def EClass getTargetClass(EClass source) {
		return targetMM.map[EClassifiers].flatten.filter(EClass).findFirst[name == source.name]
	}
	
	private def EReference getTargetReference(EReference source) {
		return null
	}
	
	private def EAttribute getTargetReference(EAttribute source) {
		return null
	}
}