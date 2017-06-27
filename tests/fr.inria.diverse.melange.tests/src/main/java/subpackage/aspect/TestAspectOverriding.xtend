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
package subpackage.aspect

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import toppkg.subpkg1.Subpkg1Class1
import toppkg.TopClass1

@Aspect(className = Subpkg1Class1)
class Subpkg1Class1Aspect {
	public String changeableYes
	public TopClass1 toTopClass1
}

@Aspect(className = TopClass1)
class TopClass1Aspect {
	public Subpkg1Class1 toSubpkg1Class1
}