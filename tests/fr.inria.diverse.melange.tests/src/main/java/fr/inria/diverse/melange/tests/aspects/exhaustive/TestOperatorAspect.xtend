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
package fr.inria.diverse.melange.tests.aspects.exhaustive

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import exhaustive.OperationsTest
import exhaustive.AttributesTest
import exhaustive.ReferencesTest
import exhaustive.MultipleSuperTest
import exhaustive.InterfaceTest
import exhaustive.AbstractTest
import exhaustive.GenericTest

@Aspect(className = OperationsTest)
class SuperLangAspect {
	public AttributesTest addedReference
}

@Aspect(className = OperationsTest)
class LangAspect {
	public ReferencesTest addedReference
}

@Aspect(className = OperationsTest)
class SubLangAspect {
	public MultipleSuperTest addedReference
}

@Aspect(className = InterfaceTest)
class OtherAspect {
	public AbstractTest addedReference
}

@Aspect(className = InterfaceTest)
class SubOtherAspect {
	public GenericTest addedReference
}