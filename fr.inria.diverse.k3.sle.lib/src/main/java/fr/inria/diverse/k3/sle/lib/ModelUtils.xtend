package fr.inria.diverse.k3.sle.lib

import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage

import org.eclipse.emf.common.util.URI

import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcorePackage

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

class ModelUtils
{
	def EPackage loadPkg(String path) {
		return loadAllPkgs(path).head
	}

	def Iterable<EPackage> loadAllPkgs(String path) {
		if (!EPackage.Registry.INSTANCE.containsKey(EcorePackage.eNS_URI))
			EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE)

		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("ecore", new XMIResourceFactoryImpl)

		val rs = new ResourceSetImpl
		val uri = URI.createURI(path)
		val pkg = rs.getResource(uri, true)

		return pkg.contents.filter(EPackage)
	}

	def GenModel loadGenmodel(String path) {
		if (!EPackage.Registry.INSTANCE.containsKey(GenModelPackage.eNS_URI))
			EPackage.Registry.INSTANCE.put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE)

		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("genmodel", new XMIResourceFactoryImpl)

		val rs = new ResourceSetImpl
		val uri = URI.createURI(path)
		val pkg = rs.getResource(uri, true)

		return pkg.contents.get(0) as GenModel
	}
}
