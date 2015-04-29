package fr.inria.diverse.melange.resource

import fr.inria.diverse.melange.resource.loader.DozerLoader
import java.io.IOException
import java.util.Map
import org.eclipse.emf.common.util.AbstractTreeIterator
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
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
	URI melangeUri
	DozerLoader loader = new DozerLoader

	new(URI uri) {
		// FIXME: Retrieve the currently-used one
		val rs = new ResourceSetImpl
		val query = uri.query.split("=")

		melangeUri = uri
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
		val actualLanguage = MelangeRegistry.INSTANCE.getLanguageByUri(actualPkgUri)

		if (actualLanguage === null)
			throw new MelangeResourceException("Cannot find a registered language with URI " + actualPkgUri)

		if (expectedMt !== null) {
			val adapterCls = actualLanguage.getAdapterFor(expectedMt)

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

			throw new MelangeResourceException('''No adapter class registered for <«actualLanguage.identifier», «expectedMt»>''')
		}
		else if (expectedMm !== null) {
			val expectedLanguage = MelangeRegistry.INSTANCE.getLanguageByIdentifier(expectedMm)

			if (expectedLanguage === null)
				throw new MelangeResourceException("Cannot find a registered language with URI " + expectedMm)

			val actualMt = MelangeRegistry.INSTANCE.getModelTypeByIdentifier(actualLanguage.exactType)
			val expectedMt = MelangeRegistry.INSTANCE.getModelTypeByIdentifier(expectedLanguage.exactType)

			if (actualMt.identifier == expectedMt.identifier) {
				// Nothing to do
				return wrappedResource.contents
			}
			else if (actualMt.superTypes.contains(expectedMt.identifier)) {
				// Downcast
//				val actualPkg = EPackage.Registry.INSTANCE.getEPackage(actualLanguage.uri)
//				val expectedPkg = EPackage.Registry.INSTANCE.getEPackage(expectedLanguage.uri)
//				loader.initialize(actualPkg, expectedPkg)
//				return loader.loadExtendedAsBase(wrappedResource, expectedPkg).contents
				return wrappedResource.contents
			}
			else if (expectedMt.superTypes.contains(actualMt.identifier)) {
				// Downcast
				val actualPkg = EPackage.Registry.INSTANCE.getEPackage(actualLanguage.uri)
				val expectedPkg = EPackage.Registry.INSTANCE.getEPackage(expectedLanguage.uri)
				loader.initialize(actualPkg, expectedPkg)
				return loader.loadBaseAsExtended(wrappedResource, expectedPkg).contents
			}
			else
				// No typing hierarchy found
				throw new MelangeResourceException('''«actualMt.identifier» cannot be transtyped to «expectedMt.identifier»''')
//			val expectedPkg = EPackage.Registry.INSTANCE.getEPackage(expectedMm)
//			if (contents == null)
//			{
//				val fallbackUri = URI.melangeURIToPlatformURI
//				val rs = getResourceSet()
//				//wrappedResource = new ResourceSetImpl().getResource(fallbackUri, true) as Resource.Internal		
//				wrappedResource = rs.getResource(fallbackUri, true) as Resource		
//				
//				contents = objs
//			}
//			return wrappedResource.contents
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

	override getURI() {
		return melangeUri
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
