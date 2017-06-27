/*******************************************************************************
 * Copyright (c) 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
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
