package fr.inria.diverse.k3.sle.jvmmodel

import com.google.inject.Inject

import fr.inria.diverse.k3.sle.ast.ModelTypeExtensions
import fr.inria.diverse.k3.sle.ast.NamingHelper

import fr.inria.diverse.k3.sle.lib.EcoreExtensions

import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType

import java.util.List

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EStructuralFeature

import org.eclipse.xtext.common.types.JvmFormalParameter
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmTypeReference

import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

class JvmModelInferrerHelper
{
	@Inject extension EcoreExtensions
	@Inject extension ModelTypeExtensions
	@Inject extension JvmTypesBuilder
	@Inject extension NamingHelper

	/*--- Getters / Setters  ---*/
	def JvmOperation toGetterSignature(EStructuralFeature f, String name, JvmTypeReference type) {
		val g =	f.toGetter(name, type)
		g.removeExistingBody

		if (#["java.lang.Boolean", "boolean"].contains(type.qualifiedName))
			g.simpleName = g.simpleName.replaceFirst("get", "is")

		return g
	}

	def JvmOperation toUmlGetterSignature(EStructuralFeature f, String name, JvmTypeReference type) {
		val g =	f.toGetter(name, type)
		g.removeExistingBody

		if (
			   g.simpleName.startsWith("isIs")
			&& Character.isUpperCase(g.simpleName.charAt(4))
			&& #["java.lang.Boolean", "boolean"].contains(type.qualifiedName)
		)
			g.simpleName = g.simpleName.replaceFirst("is", "").toFirstLower

		return g
	}

	def JvmOperation toSetterSignature(EStructuralFeature f, String name, JvmTypeReference type) {
		val s = f.toSetter(name, type)
		s.removeExistingBody

		return s
	}

	def JvmOperation toUnsetter(EStructuralFeature f, String name) {
		val s = f.toMethod("unset" + name.toFirstUpper, f.newTypeRef(Void.TYPE))[
			body = '''
				adaptee.unset«name.toFirstUpper»() ;
			'''
		]

		return s
	}

	def JvmOperation toUnsetterSignature(EStructuralFeature f, String name) {
		val u = f.toUnsetter(name)
		u.removeExistingBody

		return u
	}

	/*--- Type references helpers ---*/
	def JvmTypeReference newTypeRef(ModelType ctx, EClassifier cls) {
		// TODO: Handle generics
		return
			switch (cls) {
				case null: ctx.newTypeRef(Object)
				EClass:
					if (cls.abstractable)
						ctx.newTypeRef(ctx.interfaceNameFor(cls))
					else if (cls.instanceClass !== null)
						ctx.newTypeRef(cls.instanceClass.name)
					else if (cls.instanceTypeName !== null)
						ctx.newTypeRef(cls.instanceTypeName)
				EEnum:
					if (ctx.isExtracted)
						ctx.newTypeRef(ctx.extracted.getFqnFor(cls))
				EDataType:
					if (cls.instanceClass !== null)
						ctx.newTypeRef(cls.instanceClass.name)
					else if (cls.instanceTypeName !== null)
						ctx.newTypeRef(cls.instanceTypeName)
				default: ctx.newTypeRef(Object)
			}
	}

	def boolean overrides(JvmOperation o1, JvmOperation o2) {
		return
		   o1.simpleName == o2.simpleName
		   // FIXME: Covariant return types
		&& o1.returnType.qualifiedName == o2.returnType.qualifiedName
		&& parameterEquals(o1.parameters, o2.parameters)
	}

	def boolean parameterEquals(List<JvmFormalParameter> p1, List<JvmFormalParameter> p2) {
		if (p1.size != p2.size)
			return false

		for (i : 0 ..< p1.size)
			if (p1.get(i).parameterType.qualifiedName != p2.get(i).parameterType.qualifiedName)
				return false

		return true
	}
}

class TypeReferenceException extends Exception
{
	new(String msg) {
		super(msg)
	}
}
