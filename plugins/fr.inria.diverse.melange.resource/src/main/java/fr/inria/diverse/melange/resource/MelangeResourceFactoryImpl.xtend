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
import org.eclipse.emf.ecore.resource.Resource

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
		
		if(mtQry !==  null && mtQry.size > 1)
			throw new MelangeResourceException('''Melange resource accept only one \'mt=\''')
		if(langQry !== null && langQry.size > 1)
			throw new MelangeResourceException('''Melange resource accept only one \'lang=\''')

		// Loading through a viewpoint / language
		return new MelangeResourceImpl(uri)
	}
}
