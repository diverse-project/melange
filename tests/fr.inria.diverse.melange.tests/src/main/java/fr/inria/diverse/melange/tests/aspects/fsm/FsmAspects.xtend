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
package fr.inria.diverse.melange.tests.aspects.fsm

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

@Aspect(className = fsm.State)
class StateAspect1 {
	public String foo = "foo1"

	def String bar()'''bar1'''
}

@Aspect(className = timedfsm.fsm.State)
class StateAspect2 {
	public String foo = "foo2"

	def String bar()'''bar2'''
	
	def timedfsm.fsm.State barbar(timedfsm.fsm.State arg){ null }
}

// No "bar" => not a subtype
@Aspect(className = fsm.State)
class StateAspect3 {
	def int baz(String s) { return -1 }
}
