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
package fr.inria.diverse.melange.lib

import java.io.IOException
import java.util.Set
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EFactory
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource

interface IMetamodel
{
	def Resource getResource()
	def void setResource(Resource res)
}

interface IModelType
{
	def EList<EObject> getContents()
	def Set<EFactory> getFactories()
	def void save(String uri) throws IOException
}

class ModelTypeException extends Exception
{
	new(String msg) {
		super(msg)
	}
}
