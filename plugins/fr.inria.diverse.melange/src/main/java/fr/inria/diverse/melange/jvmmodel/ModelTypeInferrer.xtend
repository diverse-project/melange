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
import fr.inria.diverse.melange.lib.IModelType
import fr.inria.diverse.melange.metamodel.melange.ModelType
import java.io.IOException
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.util.internal.Stopwatches
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import org.eclipse.xtext.naming.IQualifiedNameProvider

/**
 * Infers the Java code supporting the definition of {@link ModelType}s
 */
class ModelTypeInferrer
{
	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject extension ModelingElementExtensions

	/**
	 * Currently only generates a Java class for a {@link ModelType}
	 * implementing the IModelType interface and providing basic access
	 * to the contents of the underlying model and the corresponding factory
	 * 
	 * @see IModelType
	 */
	def void generateInterfaces(
		ModelType mt,
		IJvmDeclaredTypeAcceptor acceptor,
		extension JvmTypeReferenceBuilder builder
	) {
		val task = Stopwatches.forTask("generate model types")
		task.start

		acceptor.accept(mt.toInterface(mt.fullyQualifiedName.toString)[
			superTypes += IModelType.typeRef

			members += mt.toMethod("getContents", EList.typeRef(EObject.typeRef))[
				^abstract = true
			]

			val excluded = mt.genmodels.map[usedGenPackages].flatten.toList
			mt.allGenPkgs
			.filter[genPkg|!excluded.contains(genPkg)]
			.forEach[genPkg|
				members += mt.toMethod("get"+genPkg.factoryName, genPkg.qualifiedFactoryInterfaceName.typeRef)[
					^abstract = true
				]
			]

			members += mt.toMethod("save", Void::TYPE.typeRef)[
				^abstract = true
				parameters += mt.toParameter("uri", String.typeRef)
				exceptions += IOException.typeRef
			]
		])

		// Currently disabled as we use Genmodels for generating the code
		// of the interfaces constituting a model type
//		acceptor.accept(mt.toInterface(mt.factoryName)[
//			superTypes += IFactory.typeRef
//
//			mt.allClasses.filter[instantiable].forEach[cls |
//				members += mt.toMethod("create" + cls.name, null)[m |
//					m.^abstract = true
//
//					cls.ETypeParameters.forEach[t |
//						m.typeParameters += TypesFactory.eINSTANCE.createJvmTypeParameter => [it.name = t.name]
//					]
//				] => [m |
//					m.returnType = mt.typeRef(cls, #[m])
//				]
//			]
//		])

//		mt.allClasses.filter[abstractable].forEach[cls |
//			mt.generateInterface(cls, acceptor, builder)
//		]

		//if (mt.isImported)
//			mt.allEnums.forEach[enu |
//				mt.generateEnum(enu, acceptor, builder)
//			]

		task.stop
	}
}
