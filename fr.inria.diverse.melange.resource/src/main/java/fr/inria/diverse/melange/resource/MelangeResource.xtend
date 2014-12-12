package fr.inria.diverse.melange.resource

import org.eclipse.emf.common.util.URI

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl

class MelangeResourceFactory implements Resource.Factory
{
	// TODO: Properly convert from melange:/ to EMF URIs
	override Resource createResource(URI uri) {
		val mt = uri.query.split("=").get(1)
		val wrappedUri = uri.toString.replaceFirst("melange:/resource", "..")
		val y = wrappedUri.substring(0, wrappedUri.lastIndexOf("?"))

		return new MelangeResource(URI.createFileURI(y), mt)
	}
}

// Parameterized with MyAdapter or something
class MelangeResource extends XMIResourceImpl
{
	String expectedMT

	new(URI uri, String mt) {
		super(uri)
		expectedMT = mt
		println("Loading " + uri + " as " + mt)
	}

	override getContents() {
		val rs = new ResourceSetImpl
		val res = rs.getResource(URI::createFileURI(uri.toString), true)
		val actualPkgUri = res.contents.head.eClass.EPackage.nsURI
		val pair = actualPkgUri -> expectedMT
		val adapterCls = ModelTypeAdapter.Registry.INSTANCE.get(pair)

		if (adapterCls === null)
			throw new MelangeResourceException("Cannot find adapter class for " + pair + " in the registry.")

		try {
			val adapter = adapterCls.newInstance => [adaptee = res]

			return adapter.contents
		} catch (InstantiationException e) {
			// ...
			e.printStackTrace
		} catch (IllegalAccessException e) {
			// ...
			e.printStackTrace
		}

		return null
	}
}

class MelangeResourceException extends Exception
{
	new(String msg) {
		super(msg)
	}
}
