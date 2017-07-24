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
package fr.inria.diverse.melange.tests.aspect.mergetest

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import exhaustive.AttributesTest
import exhaustive.ReferencesTest
import exhaustive.OperationsTest
import exhaustive.AbstractTest

@Aspect(className = AttributesTest)
class AttributesTestAspect {
	String changeableYes
}

@Aspect(className = ReferencesTest)
class ReferencesTestAspect {
	OperationsTest upperBoundN
}

@Aspect(className = OperationsTest)
class OperationsTestAspect {
	def boolean lowerBound1(){
		return true
	}
	
	def String manyParameters( AbstractTest param1, int param2){
		return "test"
	}
}
