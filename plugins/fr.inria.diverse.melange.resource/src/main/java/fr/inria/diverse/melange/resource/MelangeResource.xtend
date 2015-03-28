package fr.inria.diverse.melange.resource

import java.io.IOException
import java.util.Map
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl

class MelangeResourceFactoryImpl implements Resource.Factory
{
	override Resource createResource(URI uri) {
		if (!#["resource", "plugin"].contains(uri.segments.head)) {
			throw new MelangeResourceException('''Melange resource only supports melange:/resource/ and melange:/plugin/ URIs''')
		}

		val splits = uri.query?.split("=")

		// Loading through a viewpoint / metamodel
		if (splits !== null && splits.size == 2 && #["mt", "mm"].contains(splits.head))
			return new MelangeResourceImpl(uri)
		// Nothing special: fallback to XMI resource creation
		else {
//			val fallbackUri = URI::createURI(uri.toString.replaceFirst("melange:/", "platform:/"))
//			return new XMIResourceImpl(fallbackUri)
			return new XMIResourceImpl(uri)
		}
	}
}

class MelangeResourceImpl extends XMIResourceImpl
{
	String expectedMt
	String expectedMm

	new(URI melangeUri) {
		super(melangeUri)
		val query = melangeUri.query.split("=")
		if (query.head == "mt")
			expectedMt = query.get(1)
		else if (query.head == "mm")
			expectedMm = query.get(1)
	}

	override load(Map<?, ?> options) throws IOException
	{
		if (!this.loaded)
		{
			super.load(options)
			//EcoreUtil::resolveAll(resourceSet)
//			val loader = new DozerLoader
//			val expectedPkg = EPackage$Registry.INSTANCE.getEPackage(expectedMm)
//			val res = loader.loadBaseAsExtended(this, expectedPkg)
//			getContents().clear()
//			getContents().addAll(res.contents)
			this.loaded = true
		}		
	}



//	override getContents() throws RuntimeException {
//		createWrappedResource()
//		val objs = wrappedResource.getContents()
//
//		if (objs.empty)
//			return objs
//
//		val actualPkgUri = objs.head.eClass.EPackage.nsURI
//
//		if (expectedMt !== null) {
//			val pair = actualPkgUri -> expectedMt
//			val adapterCls = ModelTypeAdapter.Registry::INSTANCE.get(pair)
//
//			if (adapterCls !== null) {
//				try {
//					val adapter = adapterCls.newInstance => [adaptee = wrappedResource]
//					return adapter.contents
//				} catch (InstantiationException e) {
//					throw new MelangeResourceException('''Cannot instantiate adapter type «adapterCls»''', e)
//				} catch (IllegalAccessException e) {
//					throw new MelangeResourceException('''Cannot access adapter type «adapterCls»''', e)
//				}
//			}
//
//			throw new MelangeResourceException('''No adapter class registered for «pair»''')
//		}
//		else if (expectedMm !== null) {
//			if (contents == null)
//			{
//				val fallbackUri = URI.melangeURIToPlatformURI
//				val rs = getResourceSet()
//				//wrappedResource = new ResourceSetImpl().getResource(fallbackUri, true) as Resource.Internal		
//				wrappedResource = rs.getResource(fallbackUri, true) as Resource		
//				
//				contents = objs
//			}
//			return contents
//		}
//		else
//		{
//			return objs
//		}
//	}

//	override getAllContents() {
//		// FIXME: Should perform adaptation here
////		throw new UnsupportedOperationException("FIXME: Should perform adaptation here")
//		return wrappedResource.allContents
//	}

//	override getEObject(String uriFragment) {
//		// FIXME: Should perform adaptation here
////		throw new UnsupportedOperationException("FIXME: Should perform adaptation here")
//		return wrappedResource.getEObject(uriFragment)
//	}

	override save(Map<?, ?> options) throws IOException {
		// FIXME: Should perform adaptation here
		throw new UnsupportedOperationException("FIXME: Should perform adaptation here")
//		xmiResource.save(options)
	}

//	private def URI melangeURIToPlatformURI(URI uri) {
//		val path = uri.toString.replaceFirst("melange:/", "platform:/")
//		val fallbackUri = path.substring(0, path.lastIndexOf("?"))
//		return URI::createURI(fallbackUri)
//	}
}

class MelangeResourceException extends RuntimeException {
	new(String msg) {
		super(msg)
	}

	new(String msg, Exception cause) {
		super(msg, cause)
	}
}
