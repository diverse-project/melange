package fr.inria.diverse.melange.resource

import org.eclipse.emf.common.util.URI

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
