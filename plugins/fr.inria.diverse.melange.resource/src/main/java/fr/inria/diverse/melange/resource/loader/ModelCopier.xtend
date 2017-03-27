package fr.inria.diverse.melange.resource.loader

import fr.inria.diverse.melange.lib.EcoreExtensions
import java.util.Map
import java.util.Set
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.Enumerator
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil

/**
 * Helper to copy a model conform to a Metamodel into a model conform to another Metamodel.
 * Use a name based mapping between Metaclasses
 */
class ModelCopier {
	
	extension EcoreExtensions = new EcoreExtensions
	
	/**
	 * Mapping between source model and target model
	 */
	Map<EObject,EObject> modelsMapping
	
	/**
	 * Source Metamodel
	 */
	Set<EPackage> sourceMM
	
	/**
	 * Expected Metamodel
	 */
	Set<EPackage> targetMM
	
	boolean isXmof = false

	/**
	 * @param baseMM Metamodel of copied Resource
	 * @param expectedMM Metamodel of the copy
	 */
	new (Set<EPackage> baseMM, Set<EPackage> expectedMM) {
		modelsMapping = newHashMap
		sourceMM = baseMM
		targetMM = expectedMM
	}
	
	new (Set<EPackage> baseMM, Set<EPackage> expectedMM, boolean isXmof) {
		modelsMapping = newHashMap
		sourceMM = baseMM
		targetMM = expectedMM
		this.isXmof = isXmof
	}
	
	/**
	 * Return a copy of {@link res} conform to the expected Metamodel
	 */
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
		val extendedURI = URI.createURI(sourceMM.head.nsURI +"/as/"+ targetMM.head.nsURI)
		val extendedResource = (new ResourceSetImpl).createResource(extendedURI)
		extendedResource.contents.addAll(res.contents.map[modelsMapping.get(it)].toList)
		
		//Add copies of elements from crossref
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
			
			if(srcAtt.EType instanceof EEnum) {
				val literal = (attVal as Enumerator).literal;
				val copyAttVal = trgAtt.EType.EPackage.EFactoryInstance.createFromString((trgAtt.EType as EEnum),literal);
				copy.eSet(trgAtt,copyAttVal)
			}
			else {
				copy.eSet(trgAtt,attVal)
			}
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
		val suffix = if(isXmof) "Configuration" else ""
		val allClasses = targetMM.map[eAllContents.toList]?.flatten?.filter(EClass)
		val res = allClasses?.findFirst[uniqueId == source.uniqueId+suffix]
		if(res !== null)
			return res
		else
			return allClasses.findFirst[name == source.name+suffix]
	}
}