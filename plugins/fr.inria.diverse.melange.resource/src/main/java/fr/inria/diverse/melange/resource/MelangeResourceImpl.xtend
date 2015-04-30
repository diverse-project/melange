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
import org.eclipse.xtend.lib.annotations.Delegate

class MelangeResourceImpl implements Resource.Internal
{
	@Delegate Resource.Internal wrappedResource
	String expectedMt
	String expectedLang
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
		else if (query.head == "lang")
			expectedLang = query.get(1)
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
		else if (expectedLang !== null) {
			val expectedLanguage = MelangeRegistry.INSTANCE.getLanguageByIdentifier(expectedLang)

			if (expectedLanguage === null)
				throw new MelangeResourceException("Cannot find a registered language with URI " + expectedLang)

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
		return
			new AbstractTreeIterator<EObject>(this, false) {
				override getChildren(Object object) {
					return
						if (object instanceof Resource)
							object.contents.iterator
						else if (object instanceof EObject)
							object.eContents.iterator
				}
			}
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
