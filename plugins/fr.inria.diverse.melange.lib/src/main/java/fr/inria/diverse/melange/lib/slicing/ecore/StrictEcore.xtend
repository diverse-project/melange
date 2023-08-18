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
package fr.inria.diverse.melange.lib.slicing.ecore

import java.io.IOException
import java.util.Collections
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EModelElement
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

import static extension fr.inria.diverse.melange.lib.slicing.ecore.__SlicerAspect__.*

class StrictEcore{
	val List<EModelElement> inputEModelElement
	val List<EObject> clonedElts = newArrayList
	public val boolean optionlowerTypes
	val String nameExtension
	public val boolean card1
	public val boolean keepAnnotations

	val EObject _root

	new(List<EModelElement> inputEModelElement, EObject metamodelRoot, boolean optionlowerTypes, String nameExtension, boolean card1, boolean keepAnnotations){
		this.inputEModelElement = inputEModelElement
		if(metamodelRoot===null) throw new IllegalArgumentException
		this._root = metamodelRoot
		this.optionlowerTypes = optionlowerTypes
		this.nameExtension=nameExtension
		this.card1=card1
		this.keepAnnotations = keepAnnotations
	}

	def void slice(){
		_root.feedOpposites
		inputEModelElement?.forEach[visitToAddClasses(this)]
		inputEModelElement?.forEach[visitToAddRelations(this)]
	}

	def void objectCloned(EObject object){
		this.clonedElts.add(object)
	}

	def void save(String uri) throws IOException {
		val objs = this.clonedElts.filter[eContainer===null]
		val resSet = new ResourceSetImpl
		resSet.getResourceFactoryRegistry.getExtensionToFactoryMap.put("*", new XMIResourceFactoryImpl)
		val res = resSet.createResource(URI.createURI(uri))
		res.getContents.addAll(objs)
    	res.save(Collections.emptyMap)
	    res.unload
	}
	
	def getclonedElts(){
		return clonedElts
	}

	def void reinit() {
		_root.reinit
	}
}
