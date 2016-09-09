package fr.inria.diverse.melange.lib

import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.plugin.EcorePlugin
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import com.google.inject.Inject

class ModelUtils
{
	@Inject extension EcoreExtensions
	
	def EPackage loadPkg(String path) {
		return loadAllPkgs(path)?.head
	}

	/**
	 * Load root EPackages from the model at {@link path}, including
	 * those from cross referenced resources.
	 */
	def Iterable<EPackage> loadAllPkgs(String path) {
		try {
			if (!EPackage.Registry.INSTANCE.containsKey(EcorePackage.eNS_URI))
				EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE)

			Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("ecore", new XMIResourceFactoryImpl)

			val rs = new ResourceSetImpl
			rs.URIConverter.URIMap.putAll(EcorePlugin::computePlatformURIMap(true))
			val uri = URI.createURI(path)
			val resource = rs.getResource(uri, true)

			
			val pkgs = newArrayList
			pkgs += resource.contents.filter(EPackage)
			
			//Add root EPackages from cross-references
			val refPkgs = newArrayList
			refPkgs += pkgs.map[referencedPkgs].flatten
			val refRoots = refPkgs.map[it.eResource.contents.filter(EPackage)].flatten
			refRoots.forEach[refPkg|
				if(!pkgs.exists[p | refPkg.uniqueId == p.uniqueId])
					pkgs.add(refPkg)
			]
			
			return pkgs
			
		} catch (Exception e) {
			// ...
		}

		return null
	}

	def GenModel loadGenmodel(String path) {
		try {
			if (!EPackage.Registry.INSTANCE.containsKey(GenModelPackage.eNS_URI))
				EPackage.Registry.INSTANCE.put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE)

			Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("genmodel", new XMIResourceFactoryImpl)

			val rs = new ResourceSetImpl
			val uri = URI.createURI(path)
			val pkg = rs.getResource(uri, true)

			return pkg.contents.get(0) as GenModel
		} catch (Exception e) {
			// ...
		}

		return null
	}

	def GenModel loadGenmodelFromXcore(String path) {
		try {
			if (!EPackage.Registry.INSTANCE.containsKey(EcorePackage.eNS_URI))
				EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE)

			val rs = new ResourceSetImpl
			val uri = URI.createURI(path)
			val xcore = rs.getResource(uri, true)

			return xcore.contents.filter(GenModel).head
		} catch (Exception e) {
			// ...
		}

		return null
	}
}
