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
import java.util.HashSet
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

/**
 * Helper to copy a model conform to a Metamodel into a model conform to another Metamodel.
 * Use a name based mapping between Metaclasses
 */
class ModelCopier {

	extension EcoreExtensions = new EcoreExtensions

	/**
	 * Mapping between source model and target model
	 */
	Map<EObject, EObject> modelsMapping

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
	new(Set<EPackage> baseMM, Set<EPackage> expectedMM) {
		modelsMapping = newHashMap
		sourceMM = baseMM
		targetMM = expectedMM
	}

	new(Set<EPackage> baseMM, Set<EPackage> expectedMM, boolean isXmof) {
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
		res.allContents.forEach [ obj |
			val image = clone(obj)
			modelsMapping.put(obj, image)
		]
		/*
		 * Step 3: copy references values
		 */
		res.allContents.forEach [ obj |
			val image = modelsMapping.get(obj)
			cloneReferences(obj, image)
		]

		/*
		 * Step 4: create a new resource & fill it
		 */
		val rs = new ResourceSetImpl
		rs.resourceFactoryRegistry.extensionToFactoryMap.put("*", new XMIResourceFactoryImpl)
		val extendedURI = URI.createURI(sourceMM.head.nsURI + "/as/" + targetMM.head.nsURI)
		val extendedResource = rs.createResource(extendedURI)
		extendedResource.contents.addAll(res.contents.map[modelsMapping.get(it)].toList)

		// Add copies of elements from crossref
		extendedResource.contents.addAll(modelsMapping.values.filter[img|img.eResource === null])

		return extendedResource
	}

	private def EObject clone(EObject source) {
		val EClass srcClass = source.eClass
		val EClass trgClass = getTargetClass(srcClass)

		val copy = EcoreUtil.create(trgClass)
		srcClass.EAllAttributes.forEach [ srcAtt |
			val trgAtt = trgClass.EAllAttributes.findFirst[name == srcAtt.name]

			val attVal = source.eGet(srcAtt)

			if (srcAtt.EType instanceof EEnum) {
				val literal = (attVal as Enumerator).literal;
				val copyAttVal = trgAtt.EType.EPackage.EFactoryInstance.createFromString((trgAtt.EType as EEnum),
					literal);
				copy.eSet(trgAtt, copyAttVal)
			} else {
				copy.eSet(trgAtt, attVal)
			}
		]

		return copy
	}

	/**
	 * Store references that have been copied at least once.
	 * Used to avoid copying opposite collection references both ways,
	 * to keep element order.
	 */
	private Set<EReference> managedReferences = new HashSet

	private def void cloneReferences(EObject source, EObject target) {
		val EClass srcClass = source.eClass
		val EClass trgClass = getTargetClass(srcClass)

		srcClass.EAllReferences.forEach [ srcRef |

			val boolean opposite = srcRef.EOpposite != null
			val boolean oppositeOneCollectionMax = opposite && (!srcRef.EOpposite.many || !srcRef.EOpposite.many)
			val boolean oppositeBothCollectionsOneNotManaged = opposite && srcRef.many && srcRef.EOpposite.many &&
				!managedReferences.contains(srcRef.EOpposite)

			// We copy the reference content if we are in one of these case:
			// - it has no opposite
			// - it has an opposite, but at max one of the references is a collection (hence no need to care about keeping order)
			// - it has an opposite, and both references are collections, and the opposite one is not the one that will be copied (since we cannot copy both, to be sure to preserve order)
			if (!opposite || oppositeOneCollectionMax || oppositeBothCollectionsOneNotManaged) {
				managedReferences.add(srcRef)
				val trgRef = trgClass.EAllReferences.findFirst[name == srcRef.name]
				val refVal = source.eGet(srcRef)
				if (refVal instanceof EList<?>) {
					val copy = new BasicEList
					copy.addAll(refVal.map[modelsMapping.get(it)])
					target.eSet(trgRef, copy)
				} else if (refVal instanceof EObject) {
					target.eSet(trgRef, modelsMapping.get(refVal))
				}
			}
		]
	}

	private def EClass getTargetClass(EClass source) {
		val suffix = if(isXmof) "Configuration" else ""
		val allClasses = targetMM.map[eAllContents.toList]?.flatten?.filter(EClass)
		val res = allClasses?.findFirst[uniqueId == source.uniqueId + suffix]
		if (res !== null)
			return res
		else
			return allClasses.findFirst[name == source.name + suffix]
	}
}
