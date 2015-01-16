package fr.inria.diverse.melange.resource.loader

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.EPackage

interface ExtensionsAwareLoader
{
	def void     initialize(EPackage base, EPackage extended)

	def Resource loadExtendedAsBase(String uri, boolean loadOnDemand) throws PackageCompatibilityException
	def Resource loadBaseAsExtended(String uri, boolean loadOnDemand) throws PackageCompatibilityException
}

class PackageCompatibilityException extends Exception
{
	new(String msg) {
		super(msg)
	}
}
