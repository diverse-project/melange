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
import com.google.inject.Singleton
import fr.inria.diverse.melange.ast.ModelTypeExtensions
import fr.inria.diverse.melange.ast.NamingHelper
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.metamodel.melange.ModelType
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EGenericType
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.ETypedElement
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.common.types.JvmTypeParameterDeclarator
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

/**
 * This class holds the generation of {@link JvmTypeReference} towards elements
 * of a {@link Metamodel} or a {@link ModelType}. The various inferrers use it
 * to harmonize the code generation.
 */
@Singleton
class MelangeTypesBuilder
{
	@Inject extension EcoreExtensions
	@Inject extension ModelTypeExtensions
	@Inject extension NamingHelper
	@Inject TypeReferences typeReferences
	@Inject JvmTypeReferenceBuilder.Factory builderFactory
	@Inject extension JvmTypeReferenceBuilder builder
	@Inject extension JvmTypesBuilder

	/**
	 * Should be invoked first to inject the required dependencies as the
	 * framework doesn't know anything about this class and won't inject
	 * it automatically.
	 */
	def void setContext(ResourceSet rs) {
		builder = builderFactory.create(rs)
	}

	/**
	 * @param ctx  The {@link ModelType} defining the group of types of interest
	 * @param f    The feature for which a {@link JvmTypeReference} must be created
	 * @param decl A list of type parameter declarators in case {@code f}
	 *              depends on generic types
	 * @return The {@link JvmTypeReference} to be used in the JVM model
	 */
	def dispatch JvmTypeReference typeRef(ModelType ctx, ETypedElement f,
		Iterable<JvmTypeParameterDeclarator> decl
	) {
		val baseType =
			switch (f) {
				case f.EGenericType !== null:
					ctx.typeRef(f.EGenericType, decl)
				case f.EType !== null:
					ctx.typeRef(f.EType, decl)
				EOperation:
					Void::TYPE.typeRef
				default:
					Object.typeRef
			}

		return
			if (f.many)
				EList.typeRef(baseType.cloneWithProxies)
			else
				baseType
	}

	/**
	 * @param ctx  The {@link ModelType} defining the group of types of interest
	 * @param t    The {@link EGenericType} for which a type reference is requested
	 * @param decl A list of type parameter declarators in case {@code t}
	 *              depends on generic types
	 * @return The {@link JvmTypeReference} to be used in the JVM model
	 */
	def dispatch JvmTypeReference typeRef(ModelType ctx, EGenericType t,
		Iterable<JvmTypeParameterDeclarator> decl
	) {
		return
			if (t.ETypeParameter !== null)
				decl.createTypeParameterReference(t.ETypeParameter.name)
			else if (!t.ETypeArguments.empty)
				ctx.getFqnFor(t.EClassifier).typeRef(
					t.ETypeArguments.map[ta |
						if (ta.EClassifier !== null)
							// FIXME: Generic types can not be abstracted for now
							//        Uncomment when solved
							//
							//typeRef(ta.EClassifier, decl)
							if (ctx.isExtracted)
								ctx.extracted.syntax.getFqnFor(ta.EClassifier).typeRef
							else
								ctx.typeRef(ta.EClassifier, decl)
						else if (ta.ETypeParameter !== null)
							decl.createTypeParameterReference(ta.ETypeParameter.name)
						else
							TypesFactory.eINSTANCE.createJvmWildcardTypeReference
					]
				)
			else if (t.EClassifier !== null)
				ctx.typeRef(t.EClassifier, decl)
			else
				Object.typeRef
	}

	/**
	 * @param ctx  The {@link ModelType} defining the group of types of interest
	 * @param cls  The {@link EClassifier} for which a {@link JvmTypeReference}
	 *              must be created
	 * @param decl A list of type parameter declarators in case {@code cls}
	 *              depends on generic types
	 * @return The {@link JvmTypeReference} to be used in the JVM model
	 */
	def dispatch JvmTypeReference typeRef(ModelType ctx, EClassifier cls,
		Iterable<JvmTypeParameterDeclarator> decl
	) {
		return
			switch (cls) {
				case null:
					Object.typeRef
				EClass:
					if (!cls.ETypeParameters.empty)
						ctx.getFqnFor(cls).typeRef(
							cls.ETypeParameters.map[p |
								decl.createTypeParameterReference(p.name)
							]
						)
					else if (cls.abstractable)
						ctx.getFqnFor(cls).typeRef
					else if (cls.instanceClass !== null)
						cls.instanceClass.name.typeRef
					else if (cls.instanceTypeName !== null)
						cls.instanceTypeName.typeRef
					else
						EObject.typeRef
				EEnum:
					ctx.getFqnFor(cls).typeRef
				EDataType:
					if (cls.instanceClass !== null)
						cls.instanceClass.name.typeRef
					else if (cls.instanceTypeName !== null)
						cls.instanceTypeName.typeRef
				default:
					Object.typeRef
			}
	}

	/**
	 * @param ctx  The {@link Metamodel} defining the group of types of interest
	 * @param cls  The {@link EClassifier} for which a {@link JvmTypeReference}
	 *              must be created
	 * @param decl A list of type parameter declarators in case {@code cls}
	 *              depends on generic types
	 * @return The {@link JvmTypeReference} to be used in the JVM model
	 */
	def dispatch JvmTypeReference typeRef(Metamodel ctx, EClassifier cls,
		Iterable<JvmTypeParameterDeclarator> decl
	) {
		return
			switch (cls) {
				case null:
					Object.typeRef
				EClass:
					if (!cls.ETypeParameters.empty)
						ctx.getFqnFor(cls).typeRef(
							cls.ETypeParameters.map[p |
								decl.createTypeParameterReference(p.name)
							]
						)
					else if (cls.abstractable)
						ctx.getFqnFor(cls).typeRef
					else if (cls.instanceClass !== null)
						cls.instanceClass.name.typeRef
					else if (cls.instanceTypeName !== null)
						cls.instanceTypeName.typeRef
					else
						EObject.typeRef
				EEnum:
					ctx.getFqnFor(cls).typeRef
				EDataType:
					if (cls.instanceClass !== null)
						cls.instanceClass.name.typeRef
					else if (cls.instanceTypeName !== null)
						cls.instanceTypeName.typeRef
				default:
					Object.typeRef
			}
	}

	def dispatch JvmTypeReference typeRef(Metamodel ctx, Metamodel sup, EClassifier cls) {
		return
			switch (cls) {
				case null:
					Object.typeRef
				EClass:
					if (cls.abstractable)
						ctx.adapterNameFor(sup, cls).typeRef
					else if (cls.instanceClass !== null)
						cls.instanceClass.name.typeRef
					else if (cls.instanceTypeName !== null)
						cls.instanceTypeName.typeRef
					else
						EObject.typeRef
				EEnum:
					sup.getFqnFor(cls).typeRef
				EDataType:
					if (cls.instanceClass !== null)
						cls.instanceClass.name.typeRef
					else if (cls.instanceTypeName !== null)
						cls.instanceTypeName.typeRef
				default:
					Object.typeRef
			}
	}

	/**
	 * Returns a new {@link JvmParameterizedTypeReference} to the type parameter
	 * named {@code find} in {@code lst}
	 */
	def JvmTypeReference createTypeParameterReference(
		JvmTypeParameterDeclarator[] lst, String find) {
		val findRef = lst.map[typeParameters].flatten.findFirst[name == find]

		return
			if (findRef !== null)
				typeReferences.createTypeRef(findRef)
			else
				Object.typeRef
	}
}
