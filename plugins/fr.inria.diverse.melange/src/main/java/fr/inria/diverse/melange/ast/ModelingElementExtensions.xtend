package fr.inria.diverse.melange.ast

import com.google.inject.Inject
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.metamodel.melange.ModelingElement
import fr.inria.diverse.melange.utils.EPackageProvider
import java.io.IOException
import java.util.List
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

class ModelingElementExtensions
{
	@Inject EPackageProvider registry
	@Inject extension EcoreExtensions

	def List<EPackage> getPkgs(ModelingElement m) {
		return registry.getPackages(m)
	}

	def List<GenModel> getGenmodels(ModelingElement m) {
		return registry.getGenModels(m)
	}

	def boolean isXcore(ModelingElement m) {
		return !m.ecoreUri.nullOrEmpty && m.ecoreUri.endsWith(".xcore")
	}

	def Iterable<GenPackage> getAllGenPkgs(ModelingElement m) {
		return m.genmodels.map[allGenPkgs].flatten
	}

	def GenPackage getGenPkgFor(ModelingElement m, EPackage pkg) {
		return m.allGenPkgs.findFirst[getEcorePackage.name == pkg.name]
	}

	def GenClassifier getGenClassifierFor(ModelingElement m, EClassifier cls) {
		return m.getGenPkgFor(cls.EPackage).genClassifiers.findFirst[name == cls.name]
	}

	def GenClass getGenClsFor(ModelingElement m, EClass cls) {
		return m.getGenPkgFor(cls.EPackage).genClasses.findFirst[name == cls.name]
	}

	def GenDataType getGenDataTypeFor(ModelingElement m, EDataType dt) {
		return
			if (dt instanceof EEnum)
				m.getGenPkgFor(dt.EPackage).genEnums.findFirst[name == dt.name]
			else
				m.getGenPkgFor(dt.EPackage).genDataTypes.findFirst[name == dt.name]
	}

	def String getRootPackageUri(ModelingElement m) {
		return m.allGenPkgs.head.getEcorePackage.nsURI
	}

	def List<EPackage> getAllSubPkgs(ModelingElement m) {
		return m.pkgs.head.allSubPkgs
	}

	def Iterable<EClassifier> getAllClassifiers(ModelingElement m) {
		return m.pkgs.map[getAllClassifiers].flatten
	}

	def Iterable<EClass> getAllClasses(ModelingElement m) {
		return m.pkgs.map[getAllClasses].flatten
	}

	def EClass findClass(ModelingElement m, String simpleName) {
		return m.allClasses.findFirst[name == simpleName]
	}

	def EClassifier findClassifier(ModelingElement m, String simpleName) {
		return m.allClassifiers.findFirst[name == simpleName]
	}

	/**
 	 * create the ecore for this ModelingElement
 	 * return the root package  
 	 */
	def EPackage createEcore(ModelingElement m, String uri, String pkgUri, boolean hideAspectElements) {
		val resSet = new ResourceSetImpl
		val res = resSet.createResource(URI::createURI(uri))
		val rootPkg = m.pkgs.head

		if (pkgUri !== null)
			rootPkg.nsURI = pkgUri

		val copy = EcoreUtil::copyAll(m.pkgs.filter[ESuperPackage === null].toList)

		if (m instanceof Metamodel) {
			val toRemove = <EModelElement>newArrayList
			val i = copy.head.eAllContents
			while (i.hasNext) {
				val obj = i.next
				
				if(hideAspectElements){
					if (obj instanceof EModelElement) {
						if (obj.EAnnotations.exists[source == "aspect"]) {
							if (obj instanceof EStructuralFeature)
								if (!obj.EType.EAnnotations.exists[source == "aspect"]) {}
								else toRemove += obj
							else
								toRemove += obj
						}
					}
				}
				
				if (obj instanceof EStructuralFeature) {
					if (obj.volatile) {
						obj.volatile = false
					}
				}
			}
			toRemove.forEach[EcoreUtil::delete(it)]
		}

		// FIXME:
		copy.forEach[pkg |
			pkg.replaceLocalEObjectReferencesToEcoreEObjectReferences
			EcoreUtil.ExternalCrossReferencer.find(pkg).forEach[o, s |
				s.forEach[ss |
					if (ss.EStructuralFeature !== null && !ss.EStructuralFeature.derived && !ss.EStructuralFeature.many) {
						if (o instanceof EClassifier) {
							val corresponding = copy.map[EClassifiers].flatten.findFirst[name == o.name]
							if (corresponding !== null)
								ss.EObject.eSet(ss.EStructuralFeature, corresponding)
						} else if (o instanceof EReference) {
							if (o.EOpposite !== null) {
								val correspondingCls = copy.map[EClassifiers].flatten.findFirst[name == o.EContainingClass.name] as EClass
								val correspondingRef = correspondingCls.EReferences.findFirst[name == o.name]

								if (correspondingRef !== null)
									ss.EObject.eSet(ss.EStructuralFeature, correspondingRef)
							}
						}
					}
				]
			]
		]

		res.contents += copy

//		new Job("Serializing Ecore") {
//			override run(IProgressMonitor monitor) {
				try {
					val options = newHashMap
					options.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER)
					res.save(options)
				} catch (IOException e) {
					e.printStackTrace
				}

//				return Status.OK_STATUS
//			}
//		}.schedule

		return rootPkg
	}
}
