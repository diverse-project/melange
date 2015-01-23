package fr.inria.diverse.melange.jvmmodel

import com.google.inject.Inject
import com.google.inject.Singleton

import fr.inria.diverse.melange.utils.TypeReferencesHelper

import java.util.List

import org.eclipse.emf.ecore.EObject

import org.eclipse.emf.ecore.resource.ResourceSet

import org.eclipse.xtext.common.types.JvmFormalParameter
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmTypeReference

import org.eclipse.xtext.naming.QualifiedName

import org.eclipse.xtext.xbase.compiler.JavaKeywords

import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

@Singleton
class JvmModelInferrerHelper
{
	@Inject JvmTypeReferenceBuilder.Factory builderFactory
	@Inject extension JvmTypeReferenceBuilder builder
	@Inject extension JvmTypesBuilder
	@Inject extension JavaKeywords
	@Inject extension TypeReferencesHelper

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
		val s = f.toSetter(name.safeName, type)
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
		val u = f.toUnsetter(name.safeName)
		u.removeExistingBody

		return u
	}

	def JvmOperation toUnsetterCheckSignature(EObject f, String name) {
		val u = f.toUnsetterCheck(name.safeName)
		u.removeExistingBody

		return u
	}

	def String getSafeName(String name) {
		return
			if (name.isJavaKeyword)
				name + "_"
			else
				name
	}

	def String getPrimitiveIfWrapType(String name) {
		val fqn = QualifiedName::create(name.split("\\."))

		if (#[
				"java.lang.Boolean", "java.lang.Byte",
				"java.lang.Double",	"java.lang.Float",
				"java.lang.Integer", "java.lang.Long",
				"java.lang.Short"
			].contains(fqn.toString))
			return fqn.lastSegment.toString.toLowerCase
		else return name
	}

	def boolean overrides(JvmOperation o1, JvmOperation o2) {
		return
			   o1.simpleName == o2.simpleName
			&& o2.returnType.isSubtypeOf(o1.returnType)
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
