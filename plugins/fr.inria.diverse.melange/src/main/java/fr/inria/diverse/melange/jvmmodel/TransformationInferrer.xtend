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
package fr.inria.diverse.melange.jvmmodel

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.NamingHelper
import fr.inria.diverse.melange.metamodel.melange.XbaseTransformation
import org.eclipse.xtext.util.internal.Stopwatches
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

/**
 * Compiles Melange's {@link Transformation}s
 */
class TransformationInferrer
{
	@Inject extension JvmTypesBuilder
	@Inject extension NamingHelper

	/**
	 * Creates a Java class for the given {@code transfo} with a unique static
	 * method "call" where the code of the transformation is compiled.
	 * If the supplied {@link XbaseTransformation} is annotated with @Main,
	 * also generates a {@code public static void main(String[] args)} method.
	 */
	def void generateTransformation(
		XbaseTransformation transfo,
		IJvmDeclaredTypeAcceptor acceptor,
		extension JvmTypeReferenceBuilder builder
	) {
		val task = Stopwatches.forTask("generate transformations")
		task.start

		acceptor.accept(transfo.toClass(transfo.className))
		[
			val returnType = transfo.returnTypeRef ?: Void::TYPE.typeRef

			members += transfo.toMethod("call", returnType)[
				^static = true

				transfo.parameters.forEach[p |
					parameters += transfo.toParameter(p.name, p.parameterType)
				]

				body = transfo.body
			]

			if (transfo.main) {
				members += transfo.toMethod("main", Void::TYPE.typeRef)[
					^static = true

					parameters += transfo.toParameter("args",
						String.typeRef.addArrayTypeDimension)

					// TODO: Remove hardcoded types in the following body code
					body = '''
						StandaloneSetup.doSetup() ;
						call() ;
					'''
				]
			}
		]

		task.stop
	}
}
