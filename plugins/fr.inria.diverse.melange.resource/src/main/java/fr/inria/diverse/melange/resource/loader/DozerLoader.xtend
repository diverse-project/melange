package fr.inria.diverse.melange.resource.loader

import org.dozer.DozerBeanMapper
import org.dozer.config.BeanContainer
import org.dozer.loader.api.BeanMappingBuilder
import org.dozer.loader.api.FieldsMappingOptions
import org.dozer.loader.api.TypeMappingOptions
import org.dozer.util.DozerClassLoader
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

import static extension fr.inria.diverse.melange.resource.loader.EcoreHelper.*
import org.eclipse.emf.ecore.EClassifier
import com.google.common.collect.SetMultimap
import com.google.common.collect.HashMultimap
import java.util.List
import java.util.ArrayList
import java.util.Set
import fr.inria.diverse.melange.resource.Activator

class DozerLoader implements ExtensionsAwareLoader
{
	private EPackage pkgBase
	private EPackage pkgExtended
	
	private DozerBeanMapper currentMapper 
	
	var MappingDirection currentMapperDirection = MappingDirection.NO_SET
	var EPackage currentRequestedBase
	var EPackage currentRequestedExtended
	
	enum MappingDirection {
		NO_SET, BASE_TO_EXTENDED, EXTENTED_TO_BASE
	}

	override initialize(EPackage base, EPackage extended) {
		pkgBase = base
		pkgExtended = extended

		// Regular EMF Registration
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put(base.nsPrefix,     new XMIResourceFactoryImpl)
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put(extended.nsPrefix, new XMIResourceFactoryImpl)

		EPackage.Registry.INSTANCE.put(base.nsURI,     base)
		EPackage.Registry.INSTANCE.put(extended.nsURI, extended)
	}

	override loadExtendedAsBase(String uri, boolean loadOnDemand) throws PackageCompatibilityException {
		val rs = new ResourceSetImpl
		val res = loadModel(uri, loadOnDemand) // Just propagate thrown exceptions if any
		val newRes = rs.createResource(URI::createURI(uri))
		val root = res.contents.head

		// Ensure that loaded model conforms to the extended metamodel
		if (root.eClass.EPackage != pkgExtended)
			throw new PackageCompatibilityException('''«uri» doesn't conform to the extended metamodel''')

		// Remove all extension-specific elements
		cleanExtendedResource(res)

		// Use Dozer to map a new graph of instances
		// in the newly created resource
		val mapper = getMapper(MappingDirection.EXTENTED_TO_BASE, pkgBase, pkgExtended)
		res.contents.forEach[o |
			newRes.contents += mapper.map(o, pkgBase.eAllContents.filter(EClassifier).findFirst[name == o.eClass.name].implementationClass) as EObject
		]

		return newRes
	}

	override loadBaseAsExtended(String uri, boolean loadOnDemand) throws PackageCompatibilityException {
		
		val rs = new ResourceSetImpl
		val res = loadModel(uri, loadOnDemand) // Just propagate thrown exceptions if any
		val newRes = rs.createResource(URI::createURI(uri))
		val root = res.contents.head

		// Ensure that loaded model conforms to the base metamodel
		if (root.eClass.EPackage != pkgBase)
			throw new PackageCompatibilityException('''«uri» doesn't conform to the base metamodel''')

		val mapper = getMapper(MappingDirection.BASE_TO_EXTENDED, pkgBase, pkgExtended)		
		res.contents.forEach[o |
			newRes.contents += mapper.map(o, pkgExtended.eAllContents.filter(EClassifier).findFirst[name == o.eClass.name].implementationClass) as EObject
		]

		return newRes
	}
	
	
//	public def Resource loadBaseAsExtended(URI baseModelURI, EPackage expectedPackage) throws PackageCompatibilityException {
//		val baseResource = loadModel(baseModelURI, true) // Just propagate thrown exceptions if any
//		val rs = baseResource.resourceSet
//
//		pkgBase = baseResource.contents.head.eClass.EPackage
//
//		val mapper = new DozerBeanMapper
//		val builder = new BaseToExtendedBuilder(pkgBase, expectedPackage)
//
//		val extendedURI = baseModelURI.appendSegment("extended")
//		val extendedResource = rs.createResource(extendedURI)
//
//		mapper.addMapping(builder)
//		baseResource.contents.forEach[o |
//			extendedResource.contents += mapper.map(o, pkgExtended.EClassifiers.findFirst[name == o.eClass.name].implementationClass) as EObject
//		]
//		extendedResource.contents.addAll(baseResource.contents)
//		return extendedResource
//	}
	
	public def Resource loadBaseAsExtended(Resource baseResource, EPackage expectedPackage) throws PackageCompatibilityException 
	{
		val resourceSet = new ResourceSetImpl

		val basePackage = baseResource.contents.head.eClass.EPackage
		
		val extendedURI = URI.createURI("modelAsExtended")
		val extendedResource = resourceSet.createResource(extendedURI)

		val mapper = getMapper(MappingDirection.BASE_TO_EXTENDED, basePackage, pkgExtended)		
		baseResource.getContents().forEach[o |
			extendedResource.getContents() += mapper.map(o, expectedPackage.eAllContents.filter(EClassifier).findFirst[name == o.eClass.name].implementationClass) as EObject
		]
		//extendedResource.contents.addAll(baseResource.contents)
		return extendedResource
	}
	
	private def loadModel(String uri, boolean loadOnDemand) {
		return loadModel(URI.createURI(uri), loadOnDemand)
	}

	private def loadModel(URI uri, boolean loadOnDemand) {
		val rs = new ResourceSetImpl
		val res = rs.getResource(uri, loadOnDemand)

		return res
	}

	/**
	 * Remove all extension-specific elements from a resource.
	 * Elements are extension-specific if their metaclass doesn't
	 * directly inherit from a metaclass of the base metamodel.
	 */
	private def cleanExtendedResource(Resource res) {
		res.allContents
			.filter[!eClass.ESuperTypes.exists[EPackage == pkgBase]]
			.map[EcoreUtil::copy(it)] // sigh
			.forEach[EcoreUtil::delete(it)]
	}
	
	
	/**
	 * do not create a dozer mapper for every call, use a cache 
	 * Invalidate the mapper if the base and extended packages changes or if the mapping direction changes
	 */
	private def DozerBeanMapper getMapper(MappingDirection requestedDirection, EPackage requestedBase, EPackage requestedExtented){
		if(currentMapperDirection == requestedDirection && 
			currentRequestedBase == requestedBase && 
			currentRequestedExtended == requestedExtented)
		{
			return currentMapper
		} else {
			// create a new mapper with the required mapping
			currentMapper = new DozerBeanMapper
			currentMapperDirection =  requestedDirection
			currentRequestedBase = requestedBase
			currentRequestedExtended = requestedExtented
			switch requestedDirection{
				case MappingDirection.BASE_TO_EXTENDED :
					currentMapper.addMapping(new BaseToExtendedBuilder(requestedBase, requestedExtented))
				case MappingDirection.EXTENTED_TO_BASE :
					currentMapper.addMapping(new ExtendedToBaseBuilder(requestedBase, requestedExtented))
				default: {
					}
				
			}
			return currentMapper
		}
	}
}

class ExtendedToBaseBuilder extends BeanMappingBuilder
{
	private EPackage pkgBase
	private EPackage pkgExtended

	new(EPackage base, EPackage extended) {
		pkgBase = base
		pkgExtended = extended
	}

	override protected configure() {
		val classLoader = new OsgiDozerClassLoader
		//val  classLoader = Activator.context.class.getClassLoader()
		BeanContainer.getInstance.classLoader = classLoader

		pkgBase.EClassifiers.filter(EClass).forEach[cls |
			val extendedCls = pkgExtended.eAllContents.filter(EClass).findFirst[name == cls.name]
			val baseImpl = cls.implementationClass
			val extendedImpl = extendedCls.implementationClass
			classLoader.updateContext(baseImpl, extendedImpl)

			val map = mapping(
				extendedImpl,
				baseImpl
			)

			cls.EReferences
			.filter[many]
			.forEach[ref |
				val baseRefImpl = ref.EReferenceType.implementationClass
				val extendedRefImpl = extendedCls.EAllReferences.findFirst[name == ref.name].EReferenceType.implementationClass

				map.fields(
					ref.name,
					ref.name,
					FieldsMappingOptions.hintA(extendedRefImpl),
					FieldsMappingOptions.hintB(baseRefImpl)
				)
			]
		]
	}
}

class BaseToExtendedBuilder extends BeanMappingBuilder
{
	private EPackage pkgBase
	private EPackage pkgExtended

	new(EPackage base, EPackage extended) {
		pkgBase = base
		pkgExtended = extended
	}

	override protected configure() {
		val classLoader = new OsgiDozerClassLoader
		BeanContainer.getInstance.classLoader = classLoader
		
		val subClassesRegister = computeSubTypes(pkgBase.EClassifiers.filter(EClass).toList)
		
		pkgBase.EClassifiers.filter(EClass).forEach[cls |
			val extendedCls = pkgExtended.eAllContents.filter(EClass).findFirst[name == cls.name]

			val baseImpl = cls.implementationClass
			val extendedImpl = extendedCls.implementationClass
			classLoader.updateContext(baseImpl, extendedImpl)

				// borner la recherche
			val map = mapping(
				baseImpl,
				extendedImpl,
				TypeMappingOptions.oneWay()
			)

			cls.EReferences
			.filter[many]
			.forEach[ref |
				val Set<EClass> baseCandidates = subClassesRegister.get(ref.EReferenceType)
				
				val baseRefImpls = new ArrayList<Class>()
				baseRefImpls.add(ref.EReferenceType.implementationClass)
				baseRefImpls.addAll(baseCandidates.map[implementationClass])
				
				val extendedRefImpls = new ArrayList<Class>()
				extendedRefImpls.add(pkgExtended.eAllContents.filter(EClass).findFirst[name == ref.EReferenceType.name].implementationClass)
				extendedRefImpls.addAll(
					baseCandidates.map[cdt|
						pkgExtended
						.eAllContents
						.filter(EClass)
						.findFirst[name == cdt.name]
						.implementationClass
					]
				)

				map.fields(
					ref.name,
					ref.name,
					FieldsMappingOptions.hintA(baseRefImpls),
					FieldsMappingOptions.hintB(extendedRefImpls)
				)
			]
		]
	}

	/**
	 * Return a map of EClasses associated to their Subtypes
	 */
	def SetMultimap computeSubTypes(List<EClass> classes){
		val SetMultimap<EClass, EClass> res = HashMultimap.create
		
		classes.forEach[cls|
			val subclasses = classes.filter[cls2|
				cls2 !== cls && cls.isSuperTypeOf(cls2)
			]
			res.putAll(cls,subclasses)
		]
		
		return res
	}	
}

public class OsgiDozerClassLoader implements DozerClassLoader {

	private ClassLoader cl1
	private ClassLoader cl2
   
    override loadClass(String className) {
        try {
            return cl1.loadClass(className)
        } catch (ClassNotFoundException e1) {
	        try {
	            return cl2.loadClass(className)
	        } catch (ClassNotFoundException e2) {
	            return null
	        }
        }
    }
 
	override loadResource(String uri) {
		return
			cl1.getResource(uri) ?:
			cl2.getResource(uri) ?:
			class.classLoader.getResource(uri)
    }

	def void updateContext(Class<?> class1, Class<?> class2) {
		cl1 = class1.classLoader
		cl2 = class2.classLoader
	}
}
