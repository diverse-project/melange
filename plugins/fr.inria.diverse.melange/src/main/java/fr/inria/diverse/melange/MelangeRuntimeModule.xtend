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
package fr.inria.diverse.melange

import org.eclipse.xtext.resource.IDerivedStateComputer
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.typesystem.computation.SynonymTypesProvider

class MelangeRuntimeModule extends fr.inria.diverse.melange.AbstractMelangeRuntimeModule
{
	override Class<? extends IDerivedStateComputer> bindIDerivedStateComputer() {
		return typeof(fr.inria.diverse.melange.resource.MelangeDerivedStateComputer)
	}

	def Class<? extends SynonymTypesProvider> bindSynonymTypesProvider() {
		return typeof(fr.inria.diverse.melange.typesystem.MelangeSynonymTypesProvider)
	}

	def Class<? extends XbaseCompiler> bindXbaseCompiler() {
		return typeof(fr.inria.diverse.melange.compiler.ModelOrientedXbaseCompiler)
	}

	override bindIResourceValidator() {
		return typeof(fr.inria.diverse.melange.validation.MelangeLocalResourceValidator)
	}
}
