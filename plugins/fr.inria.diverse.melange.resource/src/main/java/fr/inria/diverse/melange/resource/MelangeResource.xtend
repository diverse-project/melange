package fr.inria.diverse.melange.resource

import java.io.IOException
import java.util.Map
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl
import org.eclipse.xtend.lib.annotations.Delegate

class MelangeResourceUtils
{
	static def URI melangeToFallbackURI(URI uri) {
		val fallbackUri =
			if (#["resource", "plugin"].contains(uri.segments.head))
				uri.toString.replaceFirst("melange:/", "platform:/")
			else
				uri.toString.replaceFirst("melange:/file/", "file:")

		val trimmedUri =
			if (fallbackUri.contains("?"))
				fallbackUri.substring(0, fallbackUri.lastIndexOf("?"))
			else fallbackUri

		return URI::createURI(trimmedUri)
	}
}

class MelangeResourceFactoryImpl implements Resource.Factory
{
	override Resource createResource(URI uri) {
		if (!#["resource", "plugin", "file"].contains(uri.segments.head))
			throw new MelangeResourceException('''Melange resource only supports melange:/[resource,plugin,file]/ schemes''')

		val splits = uri.query?.split("=")

		// Loading through a viewpoint / language
		return
			if (splits !== null && splits.size == 2 && #["mt", "mm"].contains(splits.head))
				new MelangeResourceImpl(uri)
			// Nothing special: fallback to XMI resource creation
			else
				new XMIResourceImpl(MelangeResourceUtils.melangeToFallbackURI(uri))
	}
}

class MelangeResourceImpl implements Resource.Internal
{
	@Delegate Resource.Internal wrappedResource
	String expectedMt
	String expectedMm

	new(URI uri) {
		// FIXME: Retrieve the currently-used one
		val rs = new ResourceSetImpl
		val query = uri.query.split("=")

		wrappedResource = rs.getResource(MelangeResourceUtils.melangeToFallbackURI(uri), true) as Resource.Internal

		if (query.head == "mt")
			expectedMt = query.get(1)
		else if (query.head == "mm")
			expectedMm = query.get(1)
	}

	override getContents() throws RuntimeException {
		val objs = wrappedResource.getContents()

		if (objs.empty)
			return objs

		val actualPkgUri = objs.head.eClass.EPackage.nsURI

		if (expectedMt !== null) {
			val pair = actualPkgUri -> expectedMt
			val adapterCls = ModelTypeAdapter.Registry::INSTANCE.get(pair)

			if (adapterCls !== null) {
				try {
					val adapter = adapterCls.newInstance => [adaptee = wrappedResource]
					return adapter.contents
				} catch (InstantiationException e) {
					throw new MelangeResourceException('''Cannot instantiate adapter type «adapterCls»''', e)
				} catch (IllegalAccessException e) {
					throw new MelangeResourceException('''Cannot access adapter type «adapterCls»''', e)
				}
			}

			throw new MelangeResourceException('''No adapter class registered for «pair»''')
		}
		else if (expectedMm !== null) {
//			if (contents == null)
//			{
//				val fallbackUri = URI.melangeURIToPlatformURI
//				val rs = getResourceSet()
//				//wrappedResource = new ResourceSetImpl().getResource(fallbackUri, true) as Resource.Internal		
//				wrappedResource = rs.getResource(fallbackUri, true) as Resource		
//				
//				contents = objs
//			}
			return wrappedResource.contents
		}
		else
			return objs
	}

	override getAllContents() {
		// FIXME: Should perform adaptation here
		throw new UnsupportedOperationException("FIXME: Should perform adaptation here")
	}

	override getEObject(String uriFragment) {
		// FIXME: Should perform adaptation here
		throw new UnsupportedOperationException("FIXME: Should perform adaptation here")
	}

	override save(Map<?, ?> options) throws IOException {
		// FIXME: Should perform adaptation here
		throw new UnsupportedOperationException("FIXME: Should perform adaptation here")
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
