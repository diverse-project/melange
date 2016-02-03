package fr.inria.diverse.melange.ast

import com.google.inject.Inject
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.metamodel.melange.ModelingElement
import fr.inria.diverse.melange.utils.EPackageProvider
import java.io.IOException
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
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

		val copy = EcoreUtil::copyAll(m.pkgs.filter[ESuperPackage == null].toList)

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
