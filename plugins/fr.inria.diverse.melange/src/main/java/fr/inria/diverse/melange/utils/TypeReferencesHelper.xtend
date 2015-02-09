package fr.inria.diverse.melange.utils

import com.google.inject.Inject

import java.util.Collection

import org.eclipse.emf.ecore.resource.Resource

import org.eclipse.xtext.common.types.JvmTypeParameterDeclarator
import org.eclipse.xtext.common.types.JvmTypeReference

import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference
import org.eclipse.xtext.xbase.typesystem.references.StandardTypeReferenceOwner

import org.eclipse.xtext.xbase.typesystem.util.CommonTypeComputationServices

class TypeReferencesHelper
{
	@Inject CommonTypeComputationServices services

	def LightweightTypeReference toLightweightTypeReference(JvmTypeReference typeRef, Resource context) {
		return new StandardTypeReferenceOwner(services, context).toLightweightTypeReference(typeRef)
	}

	def boolean isSubtypeOf(JvmTypeReference ref, Class<?> cls) {
		return ref.toLightweightTypeReference(ref.eResource).isSubtypeOf(cls)
	}

	def boolean isSubtypeOf(JvmTypeReference r1, JvmTypeReference r2) {
		return r1.toLightweightTypeReference(r1.eResource).isSubtypeOf(r2.type)
	}

	def boolean isCollection(JvmTypeReference ref) {
		return ref.isSubtypeOf(Collection) && ref.type instanceof JvmTypeParameterDeclarator
	}
}
