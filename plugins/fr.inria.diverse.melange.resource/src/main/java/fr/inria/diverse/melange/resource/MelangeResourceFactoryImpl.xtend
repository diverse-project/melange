package fr.inria.diverse.melange.resource

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl

class MelangeResourceFactoryImpl implements Resource.Factory
{
	override Resource createResource(URI uri) {
		if (!#["resource", "plugin", "file"].contains(uri.segments.head))
			throw new MelangeResourceException('''Melange resource only supports melange:/[resource,plugin,file]/ schemes''')

		val query = uri.query
		val SEPARATOR = "&|;"
		val pairs = query?.split(SEPARATOR)
		
		val mtQry = pairs?.filter[startsWith("mt=")]
		val langQry = pairs?.filter[startsWith("lang=")]
		val isValidQry =
			pairs !== null
			&& (mtQry.size <= 1 && langQry.size <= 1) // no duplicate mt= or lang=
			&& (mtQry.size + langQry.size >= 1) // at least one mt= or lang=

		// Loading through a viewpoint / language
		return
			if (isValidQry)
				new MelangeResourceImpl(uri)
			// Nothing special: fallback to XMI resource creation
			else
				new XMIResourceImpl(MelangeResourceUtils.melangeToFallbackURI(uri))
	}
}
