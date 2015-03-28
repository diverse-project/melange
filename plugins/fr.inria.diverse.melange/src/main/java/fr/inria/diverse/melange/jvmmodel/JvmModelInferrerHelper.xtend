package fr.inria.diverse.melange.jvmmodel

import com.google.inject.Inject
import com.google.inject.Singleton
import fr.inria.diverse.melange.ast.NamingHelper
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

	def void setContext(ResourceSet rs) {
		typeBuilder = typeBuilderFactory.create(rs)
		annotationBuilder = annotationBuilderFactory.create(rs)
	}

	/*--- Getters / Setters  ---*/
	def JvmOperation toGetterSignature(EObject o, EStructuralFeature f, JvmTypeReference type) {
		return o.toMethod(f.getterName, type)[]
	}

	def JvmOperation toSetterSignature(EObject o, EStructuralFeature f, JvmTypeReference type) {
		return o.toMethod(f.setterName, Void::TYPE.typeRef)[
			parameters += o.toParameter('''new«f.name.toFirstUpper»''', type)
		]
	}

	def JvmOperation toUnsetter(EObject o, EStructuralFeature f) {
		val s = o.toMethod(f.unsetterName, Void::TYPE.typeRef)[
//			annotations += Override.annotationRef

			body = '''
				adaptee.«f.unsetterName»() ;
			'''
		]

		return s
	}

	def JvmOperation toUnsetterCheck(EObject o, EStructuralFeature f) {
		val s = o.toMethod(f.unsetterCheckName, Boolean::TYPE.typeRef)[
//			annotations += Override.annotationRef

			body = '''
				return adaptee.«f.unsetterCheckName»() ;
			'''
		]

		return s
	}

	def JvmOperation toUnsetterSignature(EObject o, EStructuralFeature f) {
		val u = o.toUnsetter(f)
		u.removeExistingBody

		return u
	}

	def JvmOperation toUnsetterCheckSignature(EObject o, EStructuralFeature f) {
		return o.toMethod(f.unsetterCheckName, Boolean::TYPE.typeRef)[]
	}

	def boolean overrides(JvmOperation o1, JvmOperation o2) {
		return
			   o1.simpleName == o2.simpleName
			&& ((o1.returnType === null && o2.returnType === null) || o2.returnType.isSubtypeOf(o1.returnType))
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
