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
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.ast.NamingHelper
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.metamodel.melange.ModelingElement
import fr.inria.diverse.melange.utils.TypeReferencesHelper
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.common.types.JvmFormalParameter
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.xbase.jvmmodel.JvmAnnotationReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

/**
 * A collection of utilities around JVM model generation
 * to ease some common tasks.
 */
@Singleton
class JvmModelInferrerHelper
{
	@Inject JvmTypeReferenceBuilder.Factory typeBuilderFactory
	@Inject JvmAnnotationReferenceBuilder.Factory annotationBuilderFactory
	@Inject extension JvmTypeReferenceBuilder typeBuilder
	@Inject extension JvmAnnotationReferenceBuilder annotationBuilder
	@Inject extension JvmTypesBuilder
	@Inject extension TypeReferencesHelper
	@Inject extension NamingHelper
	@Inject extension ModelingElementExtensions
	@Inject extension EcoreExtensions

	/**
	 * Should be invoked first to inject the required dependencies as the
	 * framework doesn't know anything about this class and won't inject
	 * it automatically.
	 */
	def void setContext(ResourceSet rs) {
		typeBuilder = typeBuilderFactory.create(rs)
		annotationBuilder = annotationBuilderFactory.create(rs)
	}

	/**
	 * Returns the {@link JvmOperation} defining the getter signature
	 * of the {@link EStructuralFeature} {@code f} whose type is {@code type}
	 * in the context of {@code o}.
	 */
	def JvmOperation toGetterSignature(EObject o, EStructuralFeature f,
			JvmTypeReference type) {
		return o.toMethod(f.getterName, type)[
			^abstract = true
		]
	}

	/**
	 * Returns the {@link JvmOperation} defining the setter signature
	 * of the {@link EStructuralFeature} {@code f} whose type is {@code type}
	 * in the context of {@code o}.
	 */
	def JvmOperation toSetterSignature(EObject o, EStructuralFeature f,
			JvmTypeReference type) {
		return o.toMethod(f.setterName, Void::TYPE.typeRef)[
			^abstract = true
			parameters += o.toParameter('''new«f.name.toFirstUpper»''', type)
		]
	}

	/**
	 * Returns the {@link JvmOperation} defining the unsetter ({@code eUnset()})
	 * of the {@link EStructuralFeature} {@code f} in the context of {@code o}.
	 */
	def JvmOperation toUnsetter(EObject o, EStructuralFeature f, ModelingElement m) {
		val genCls = m.getGenClsFor(f.EContainingClass)

		return o.toMethod(f.unsetterName, Void::TYPE.typeRef)[
			if (f.needsUnsetterInterface)
				annotations += Override.annotationRef

			body = '''
				«IF f.needsUnsetterInterface»
					adaptee.«f.unsetterName»() ;
				«ELSE»
					((«genCls.qualifiedClassName») adaptee).«f.unsetterName»() ;
				«ENDIF»
			'''
		]
	}

	/**
	 * Returns the {@link JvmOperation} defining the unsetter check
	 * ({@code eIsSet()}) of the {@link EStructuralFeature} {@code f}
	 * in the context of {@code o}.
	 */
	def JvmOperation toUnsetterCheck(EObject o, EStructuralFeature f, ModelingElement m) {
		val genCls = m.getGenClsFor(f.EContainingClass)

		return o.toMethod(f.unsetterCheckName, Boolean::TYPE.typeRef)[
			if (f.needsUnsetterInterface)
				annotations += Override.annotationRef

			body = '''
				«IF f.needsUnsetterInterface»
					return adaptee.«f.unsetterCheckName»() ;
				«ELSE»
					return ((«genCls.qualifiedClassName») adaptee).«f.unsetterCheckName»() ;
				«ENDIF»
			'''
		]
	}

	/**
	 * Returns the {@link JvmOperation} defining the unsetter signature
	 * ({@code eUnset()}) of the {@link EStructuralFeature} {@code f}
	 * in the context of {@code o}.
	 */
	def JvmOperation toUnsetterSignature(EObject o, EStructuralFeature f) {
		return o.toMethod(f.unsetterName, Void::TYPE.typeRef)[
			^abstract = true
		]
	}

	/**
	 * Returns the {@link JvmOperation} defining the unsetter check signature
	 * ({@code eIsSet()}) of the {@link EStructuralFeature} {@code f}
	 * in the context of {@code o}.
	 */
	def JvmOperation toUnsetterCheckSignature(EObject o, EStructuralFeature f) {
		return o.toMethod(f.unsetterCheckName, Boolean::TYPE.typeRef)[
			^abstract = true
		]
	}

	/**
	 * Checks whether the {@link JvmOperation} {@code op1} overrides (in the
	 * Java sense) the {@link JvmOperation} {@code op2}
	 */
	def boolean overrides(JvmOperation o1, JvmOperation o2) {
		return
			   o1.simpleName == o2.simpleName
			&& ((o1.returnType === null && o2.returnType === null)
				|| o2.returnType.isSubtypeOf(o1.returnType))
			&& parameterEquals(o1.parameters, o2.parameters)
	}

	private def boolean parameterEquals(List<JvmFormalParameter> p1, List<JvmFormalParameter> p2) {
		if (p1.size != p2.size)
			return false

		for (i : 0 ..< p1.size)
			if (p1.get(i).parameterType.qualifiedName !=
				p2.get(i).parameterType.qualifiedName)
				return false

		return true
	}
}
