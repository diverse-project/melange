package fr.inria.diverse.melange.resource

import java.io.IOException

import java.util.Map

import org.eclipse.emf.common.util.URI

import org.eclipse.emf.ecore.resource.Resource

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl

import org.eclipse.xtend.lib.annotations.Delegate

/**
 * Just don't read this
 */
class MelangeResourceFactory implements Resource.Factory
{
	override Resource createResource(URI uri) {
		val splits = uri.query?.split("=")

		// Loading through a viewpoint
		if (splits !== null && splits.size == 2 && splits.head == "mt")
			return new MelangeResource(uri)
		// Nothing special: fallback to XMI resource creation
		else {
			val fallbackUri = URI::createFileURI(uri.toString.replaceFirst("melange:/", ""))
			return new XMIResourceImpl(fallbackUri)
		}
	}
}

class MelangeResource implements Resource$Internal
{
	@Delegate Resource$Internal xmiResource
	String expectedMt

	new(URI melangeUri) {
		super()

		val path = melangeUri.toString.replaceFirst("melange:/", "")
		val fallbackUri = path.substring(0, path.lastIndexOf("?"))
		val rs = new ResourceSetImpl
		xmiResource = rs.getResource(URI::createFileURI(fallbackUri), true) as Resource$Internal
		expectedMt = melangeUri.query.split("=").get(1)
	}

	override getContents() throws RuntimeException {
		val objs = xmiResource.getContents()

		if (objs.empty)
			return objs

		val actualPkgUri = objs.head.eClass.EPackage.nsURI
		val pair = actualPkgUri -> expectedMt
		val adapterCls = ModelTypeAdapter$Registry::INSTANCE.get(pair)

		if (adapterCls !== null) {
			try {
				val adapter = adapterCls.newInstance => [adaptee = xmiResource]
				return adapter.contents
			} catch (InstantiationException e) {
				throw new MelangeResourceException('''Cannot instantiate adapter type «adapterCls»''', e)
			} catch (IllegalAccessException e) {
				throw new MelangeResourceException('''Cannot access adapter type «adapterCls»''', e)
			}
		}

		throw new MelangeResourceException('''No adapter class registered for «pair»''')
	}

	override getAllContents() {
		// FIXME: Should perform adaptation here
		println("FIXME: Should perform adaptation here")
		return xmiResource.allContents
	}

	override getEObject(String uriFragment) {
		// FIXME: Should perform adaptation here
		println("FIXME: Should perform adaptation here")
		return xmiResource.getEObject(uriFragment)
	}

	override save(Map<?, ?> options) throws IOException {
		// FIXME: Should perform adaptation here
		println("FIXME: Should perform adaptation here")
		xmiResource.save(options)
	}
}

class MelangeResourceException extends RuntimeException {
	new(String msg) {
		super(msg)
	}

	new(String msg, Exception cause) {
		super(msg, cause)
	}
}
