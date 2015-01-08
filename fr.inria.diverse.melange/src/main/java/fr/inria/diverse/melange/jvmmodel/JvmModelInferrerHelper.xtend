package fr.inria.diverse.melange.jvmmodel

import com.google.inject.Inject
import com.google.inject.Singleton

import java.util.List

import org.eclipse.emf.ecore.EObject

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet

import org.eclipse.xtext.common.types.JvmFormalParameter
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmTypeReference

import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference
import org.eclipse.xtext.xbase.typesystem.references.StandardTypeReferenceOwner

import org.eclipse.xtext.xbase.typesystem.util.CommonTypeComputationServices
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder

@Singleton
class JvmModelInferrerHelper
{
	@Inject JvmTypeReferenceBuilder$Factory builderFactory
	@Inject extension JvmTypeReferenceBuilder builder
	@Inject extension JvmTypesBuilder
	@Inject CommonTypeComputationServices services

	def void setContext(ResourceSet rs) {
		builder = builderFactory.create(rs)
	}

	/*--- Getters / Setters  ---*/
	def JvmOperation toGetterSignature(EObject f, String name, JvmTypeReference type) {
		val g =	f.toGetter(name, type)
		g.removeExistingBody

		if (type.qualifiedName == "boolean")
			g.simpleName = g.simpleName.replaceFirst("get", "is")

		return g
	}

	def JvmOperation toUmlGetterSignature(EObject f, String name, JvmTypeReference type) {
		val g =	f.toGetter(name, type)
		g.removeExistingBody

		if (
			   g.simpleName.startsWith("isIs")
			&& Character.isUpperCase(g.simpleName.charAt(4))
			&& type.qualifiedName == "boolean"
		)
			g.simpleName = g.simpleName.replaceFirst("is", "").toFirstLower

		return g
	}

	def JvmOperation toSetterSignature(EObject f, String name, JvmTypeReference type) {
		val s = f.toSetter(name, type)
		s.removeExistingBody

		return s
	}

	def JvmOperation toUnsetter(EObject f, String name) {
		val s = f.toMethod("unset" + name.toFirstUpper, Void::TYPE.typeRef)[
			body = '''
				adaptee.unset«name.toFirstUpper»() ;
			'''
		]

		return s
	}

	def JvmOperation toUnsetterCheck(EObject f, String name) {
		val s = f.toMethod("isSet" + name.toFirstUpper, Boolean::TYPE.typeRef)[
			body = '''
				return adaptee.isSet«name.toFirstUpper»() ;
			'''
		]

		return s
	}

	def JvmOperation toUnsetterSignature(EObject f, String name) {
		val u = f.toUnsetter(name)
		u.removeExistingBody

		return u
	}

	def JvmOperation toUnsetterCheckSignature(EObject f, String name) {
		val u = f.toUnsetterCheck(name)
		u.removeExistingBody

		return u
	}

	def boolean overrides(JvmOperation o1, JvmOperation o2) {
		return
			   o1.simpleName == o2.simpleName
			&& o2.returnType.toLightweightTypeReference(o1.eResource).isAssignableFrom(o1.returnType.toLightweightTypeReference(o1.eResource))
			&& parameterEquals(o1.parameters, o2.parameters)
	}

	def LightweightTypeReference toLightweightTypeReference(JvmTypeReference typeRef, Resource context) {
		return new StandardTypeReferenceOwner(services, context).toLightweightTypeReference(typeRef)
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
