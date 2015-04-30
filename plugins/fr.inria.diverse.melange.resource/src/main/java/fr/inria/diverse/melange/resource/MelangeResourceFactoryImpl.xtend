package fr.inria.diverse.melange.resource

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl

class MelangeResourceFactoryImpl implements Resource.Factory
{
	override Resource createResource(URI uri) {
		if (!#["resource", "plugin", "file"].contains(uri.segments.head))
			throw new MelangeResourceException('''Melange resource only supports melange:/[resource,plugin,file]/ schemes''')

		val splits = uri.query?.split("=")

		// Loading through a viewpoint / language
		return
			if (splits !== null && splits.size == 2 && #["mt", "lang"].contains(splits.head))
				new MelangeResourceImpl(uri)
			// Nothing special: fallback to XMI resource creation
			else
				new XMIResourceImpl(MelangeResourceUtils.melangeToFallbackURI(uri))
	}
}
