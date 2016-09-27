package fr.inria.diverse.melange.utils

import com.google.inject.Inject
import java.util.Collection
import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.common.types.JvmTypeParameterDeclarator
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference
import org.eclipse.xtext.xbase.typesystem.references.StandardTypeReferenceOwner
import org.eclipse.xtext.xbase.typesystem.util.CommonTypeComputationServices

class TypeReferencesHelper
{
	@Inject CommonTypeComputationServices services

	def LightweightTypeReference toLightweightTypeReference(JvmTypeReference typeRef, Resource context) {
		return
			if (typeRef !== null && context !== null)
				new StandardTypeReferenceOwner(services, context).toLightweightTypeReference(typeRef)
			else
				null
	}

	def boolean isSubtypeOf(JvmTypeReference ref, Class<?> cls) {
		val lightweightRef = ref?.toLightweightTypeReference(ref?.eResource)

		return
			if (lightweightRef !== null)
				lightweightRef.isSubtypeOf(cls)
			else
				false
	}

	def boolean isSubtypeOf(JvmTypeReference r1, JvmTypeReference r2) {
		return
			if (r1 !== null && r2 !== null)
				r1.toLightweightTypeReference(r1.eResource).isSubtypeOf(r2.type)
			else
				false
	}

	def boolean isCollection(JvmTypeReference ref) {
		return
			if (ref !== null)
				ref.isSubtypeOf(Collection) && ref.type instanceof JvmTypeParameterDeclarator
			else false
	}

	def boolean isList(JvmTypeReference ref) {
		return
			if (ref !== null)
				ref.isSubtypeOf(List)
				&& #[
					"java.util.List",
					"java.util.ArrayList",
					"org.eclipse.emf.common.util.EList",
					"org.eclipse.emf.common.util.BasicEList",
					"org.eclipse.emf.common.util.UniqueEList"].contains(ref.type.qualifiedName)
			else false
	}
	
	def boolean isUnique(JvmTypeReference ref) {
		if (ref !== null)
			"org.eclipse.emf.common.util.UniqueEList".equals(ref.type.qualifiedName)
		else
			false
	}
	
	def JvmType getContainedElementsType(JvmTypeReference ref) {
		if (ref.isList)
			return (ref as JvmParameterizedTypeReference).arguments.head.type
	}
}
