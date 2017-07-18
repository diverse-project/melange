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
package fr.inria.diverse.melange.resource.loader

import org.eclipse.emf.ecore.EClassifier

class EcoreHelper
{
	// FIXME: How ugly is that!
	static def Class<?> getImplementationClass(EClassifier cls) {
		val clsInterface = cls.instanceClass
		try {
			val className = '''«clsInterface.package.name».impl.«clsInterface.simpleName»Impl'''
			val c = clsInterface.classLoader.loadClass(className)
			return c
//			return Class.forName('''«clsInterface.package.name».impl.«clsInterface.simpleName»Impl''')
		} catch (Exception e) {
			// ...
		}

		return null
	}
}
