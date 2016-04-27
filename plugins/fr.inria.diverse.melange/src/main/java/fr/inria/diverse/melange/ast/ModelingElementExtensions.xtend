package fr.inria.diverse.melange.ast

import com.google.inject.Inject
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.metamodel.melange.ModelingElement
import fr.inria.diverse.melange.utils.EPackageProvider
import java.io.IOException
import java.util.Set
import org.apache.log4j.Logger
import org.eclipse.emf.codegen.ecore.genmodel.GenClass
import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier
import org.eclipse.emf.codegen.ecore.genmodel.GenDataType
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EModelElement
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import fr.inria.diverse.melange.metamodel.melange.Import
import fr.inria.diverse.melange.lib.ModelUtils

/**
 * A collection of utilities around {@link ModelingElement}s
 */
class ModelingElementExtensions
{
	@Inject extension EcoreExtensions
	@Inject EPackageProvider registry
	@Inject ModelUtils modelUtils

	private static final Logger log = Logger.getLogger(ModelingElementExtensions)

	/**
	 * Returns all the {@link EPackage}s defined in {@code m}.
	 * 
	 * @see EPackageProvider#getPackages
	 */
	def Set<EPackage> getPkgs(ModelingElement m) {
		return registry.getPackages(m)
	}

	/**
	 * Returns all the {@link GenModel}s used by {@code m}.
	 * 
	 * @see EPackageProvider#getGenModels
	 */
	def Set<GenModel> getGenmodels(ModelingElement m) {
		return registry.getGenModels(m)
	}
	
	/**
	 * Returns all the {@link GenModel}s used by {@code withOperator}.
	 */
	def Set<GenModel> getGenmodels(Import withOperator) {
		
		//TODO: refactor with EPackageProvider
		val genmodelUris = newHashSet 
		genmodelUris += withOperator.genmodelUris
		if (withOperator.genmodelUris.size == 0 && withOperator.ecoreUri !== null)
			genmodelUris += withOperator.ecoreUri.substring(0, withOperator.ecoreUri.lastIndexOf(".")) + ".genmodel"
		
		return
			genmodelUris.map[modelUtils.loadGenmodel(it)].toSet
	}

	/**
	 * Checks whether the Ecore pointed by the {@code ecoreUri} of {@code m}
	 * is an Xcore file.
	 */
	def boolean isXcore(ModelingElement m) {
		return
			   !m.ecoreUri.nullOrEmpty
			&& m.ecoreUri.endsWith(".xcore")
	}

	/**
	 * Returns the set of all {@link GenPackage}s defined by the {@link GenModel}s
	 * of the {@link ModelingElement} {@code m}.
	 */
	def Set<GenPackage> getAllGenPkgs(ModelingElement m) {
		return
			m.genmodels
			.map[allGenPkgs]
			.flatten
			.toSet
	}
	
	/**
	 * Returns the set of all {@link GenPackage}s defined by the {@link GenModel}s
	 * of the {@link Import} {@code withOperator}.
	 */
	def Set<GenPackage> getAllGenPkgs(Import withOperator) {
		return
			withOperator.genmodels
			.map[allGenPkgs]
			.flatten
			.toSet
	}

	/**
	 * Returns the {@link GenPackage} corresponding to the {@link EPackage}
	 * {@code pkg} in {@code m}.
	 */
	def GenPackage getGenPkgFor(ModelingElement m, EPackage pkg) {
		return
			m.allGenPkgs
			.findFirst[getEcorePackage.name == pkg.name]
	}

	/**
	 * Returns the {@link GenClassifier} corresponding to the {@link EClassifier}
	 * {@code cls} in {@code m}.
	 */
	def GenClassifier getGenClassifierFor(ModelingElement m, EClassifier cls) {
		return
			m.getGenPkgFor(cls.EPackage)
			.genClassifiers
			.findFirst[name == cls.name]
	}

	/**
	 * Returns the {@link GenClass} corresponding to the {@link EClass}
	 * {@code cls} in {@code m}.
	 */
	def GenClass getGenClsFor(ModelingElement m, EClass cls) {
		return
			m.getGenPkgFor(cls.EPackage)
			.genClasses
			.findFirst[name == cls.name]
	}

	/**
	 * Returns the {@link GenDataType} corresponding to the {@link EDataType}
	 * {@code dt} in {@code m}.
	 */
	def GenDataType getGenDataTypeFor(ModelingElement m, EDataType dt) {
		return
			if (dt instanceof EEnum)
				m.getGenPkgFor(dt.EPackage)
				.genEnums
				.findFirst[name == dt.name]
			else // EDataType
				m.getGenPkgFor(dt.EPackage)
				.genDataTypes
				.findFirst[name == dt.name]
	}

	/**
	 * Returns the URI of the first {@link EPackage} defined by {@code m}.
	 */
	def String getRootPackageUri(ModelingElement m) {
		return
			m.allGenPkgs
			.head
			.getEcorePackage
			.nsURI
	}

	/**
	 * Returns all the {@link EClassifier}s defined by {@code m}.
	 */
	def Iterable<EClassifier> getAllClassifiers(ModelingElement m) {
		return
			m.pkgs
			.map[allClassifiers]
			.flatten
			.toSet
	}

	/**
	 * Returns all the {@link EClass}es defined in {@code m}.
	 */
	def Iterable<EClass> getAllClasses(ModelingElement m) {
		return
			m.pkgs
			.map[allClasses]
			.flatten
			.toSet
	}

	/**
	 * Returns the {@link EClass} in {@code m} with the name {@code clsName}.
	 * {@code clsName} can be simple or qualified.
	 * 
	 * Return null if not found
	 * 
	 * @see EcoreExtensions.findClass(EPackage pkg, String clsName)
	 */
	def EClass findClass(ModelingElement m, String clsName) {
		
		return 
			m.pkgs
			.filter[ESuperPackage == null]
			.map[findClass(clsName)]
			.filterNull
			.head
	}

	/**
	 * Returns the {@link EClassifier} in {@code m} with the name {@code clsName}.
	 * {@code clsName} can be simple or qualified.
	 * 
	 * Return null if not found
	 * 
	 * @see EcoreExtensions.findClassifier(EPackage pkg, String clsName)
	 */
	def EClassifier findClassifier(ModelingElement m, String clsName) {
		return
			m.pkgs
			.filter[ESuperPackage == null]
			.map[findClassifier(clsName)]
			.filterNull
			.head
	}

	/**
 	 * Creates the Ecore file corresponding to {@code m} at the location
 	 * {@code uri} using {@code baseUri} as beginning for its EPackages nsURI
 	 * 
 	 * @param hideAspectElements whether the elements coming from aspects
 	 * (ie. annotated with 'aspect') should be hidden in the serialized Ecore
 	 * @return the serialized root {@link EPackage}
 	 */
	def EPackage createEcore(ModelingElement m, String uri, String baseUri,
		boolean hideAspectElements) {
		val resSet = new ResourceSetImpl
		val res = resSet.createResource(URI::createURI(uri))
		val rootPkgs = m.pkgs.filter[ESuperPackage === null]

		if (baseUri !== null){
			rootPkgs.forEach[initializeNsUriWith(baseUri)]
		}

		val copy = EcoreUtil::copyAll(m.pkgs.filter[ESuperPackage === null].toList)

		if (m instanceof Metamodel) {
			val toRemove = <EModelElement>newArrayList
			val i = copy.head.eAllContents

			while (i.hasNext) {
				val obj = i.next

				if (hideAspectElements) {
					if (obj instanceof EModelElement) {
						if (obj.isAspectSpecific) {
							if (obj instanceof EStructuralFeature)
								if (!obj.EType.isAspectSpecific) {}
								else toRemove += obj
							else
								toRemove += obj
						}
					}
				}

				// FIXME: wtf?
				if (obj instanceof EStructuralFeature) {
					if (obj.volatile) {
						obj.volatile = false
					}
				}
			}

			toRemove.forEach[EcoreUtil::delete(it)]
		}

		// FIXME: :/
		copy.forEach[pkg |
			pkg.replaceLocalEObjectReferencesToEcoreEObjectReferences
			EcoreUtil.ExternalCrossReferencer.find(pkg).forEach[obj, settings |
				settings
				.filter[
					   EStructuralFeature !== null
					&& !EStructuralFeature.derived
					&& !EStructuralFeature.many
				]
				.forEach[ss |
					if (obj instanceof EClassifier) {
						val corresponding = copy.map[EClassifiers].flatten
											.findFirst[name == obj.name]

						if (corresponding !== null)
							ss.EObject.eSet(ss.EStructuralFeature, corresponding)
					} else if (obj instanceof EReference) {
						if (obj.EOpposite !== null) {
							val correspondingCls =
								copy.map[EClassifiers].flatten
								.findFirst[name == obj.EContainingClass.name] as EClass
							val correspondingRef =
								correspondingCls.EReferences
								.findFirst[name == obj.name]

							if (correspondingRef !== null)
								ss.EObject.eSet(ss.EStructuralFeature, correspondingRef)
						}
					}
				]
			]
		]

		res.contents += copy

		try {
			val options = newHashMap
			options.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED,
				Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER)
			res.save(options)
		} catch (IOException e) {
			log.error("Error while serializing new Ecore for " + m, e)
		}

		return rootPkgs.head
	}
}
