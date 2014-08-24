package fr.inria.diverse.k3.sle.jvmmodel

import com.google.inject.Inject

import fr.inria.diverse.k3.sle.ast.ModelTypeExtensions
import fr.inria.diverse.k3.sle.ast.NamingHelper

import fr.inria.diverse.k3.sle.lib.EcoreExtensions

import fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType

import java.util.List

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EGenericType
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.ETypedElement

import org.eclipse.xtext.common.types.JvmTypeParameterDeclarator
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.TypesFactory

import org.eclipse.xtext.common.types.util.TypeReferences

import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

class K3SLETypesBuilder
{
	@Inject extension EcoreExtensions
	@Inject extension ModelTypeExtensions
	@Inject extension JvmTypesBuilder
	@Inject extension NamingHelper
	@Inject TypeReferences typeReferences

	def dispatch JvmTypeReference newTypeRef(ModelType ctx, ETypedElement f, Iterable<JvmTypeParameterDeclarator> decl) {
		val baseType =
			switch (f) {
				case f.EGenericType !== null:
					ctx.newTypeRef(f.EGenericType, decl)
				case f.EType !== null:
					ctx.newTypeRef(f.EType, decl)
				EOperation:
					ctx.newTypeRef(Void.TYPE)
				default:
					ctx.newTypeRef(Object)
			}

		return if (f.many) ctx.newTypeRef(List, baseType) else baseType
	}

	def dispatch JvmTypeReference newTypeRef(ModelType ctx, EGenericType t, Iterable<JvmTypeParameterDeclarator> decl) {
		return
			if (t.ETypeParameter !== null)
				decl.createTypeParameterReference(t.ETypeParameter.name)
			else if (!t.ETypeArguments.empty)
				ctx.newTypeRef(
					ctx.getFqnFor(t.EClassifier),
					t.ETypeArguments.map[ta |
						if (ta.EClassifier !== null)
							// FIXME: Generic types can not be abstracted for now
							//        Uncomment when solved
							//
							//ctx.newTypeRef(ta.EClassifier, decl)
							if (ctx.isExtracted)
								ctx.newTypeRef(ctx.extracted.getFqnFor(ta.EClassifier))
							else
								ctx.newTypeRef(ta.EClassifier, decl)
						else if (ta.ETypeParameter !== null)
							decl.createTypeParameterReference(ta.ETypeParameter.name)
						else
							TypesFactory.eINSTANCE.createJvmWildcardTypeReference
					]
				)
			else if (t.EClassifier !== null)
				ctx.newTypeRef(t.EClassifier, decl)
			else
				ctx.newTypeRef(Object)
	}

	def dispatch JvmTypeReference newTypeRef(ModelType ctx, EClassifier cls, Iterable<JvmTypeParameterDeclarator> decl) {
		return
			switch (cls) {
				case null:
					ctx.newTypeRef(Object)
				EClass:
					if (!cls.ETypeParameters.empty)
						ctx.newTypeRef(
							ctx.interfaceNameFor(cls),
							cls.ETypeParameters.map[p | decl.createTypeParameterReference(p.name)]
						)
					else if (cls.abstractable)
						ctx.newTypeRef(ctx.interfaceNameFor(cls))
					else if (cls.instanceClass !== null)
						ctx.newTypeRef(cls.instanceClass.name)
					else if (cls.instanceTypeName !== null)
						ctx.newTypeRef(cls.instanceTypeName)
				EEnum:
					ctx.newTypeRef(ctx.getFqnFor(cls))
				EDataType:
					if (cls.instanceClass !== null)
						ctx.newTypeRef(cls.instanceClass.name)
					else if (cls.instanceTypeName !== null)
						ctx.newTypeRef(cls.instanceTypeName)
				default:
					ctx.newTypeRef(Object)
			}
	}

	def dispatch JvmTypeReference newTypeRef(Metamodel ctx, EClassifier cls, Iterable<JvmTypeParameterDeclarator> decl) {
		return
			switch (cls) {
				case null:
					ctx.newTypeRef(Object)
				EClass:
					if (!cls.ETypeParameters.empty)
						ctx.newTypeRef(
							ctx.getFqnFor(cls),
							cls.ETypeParameters.map[p | decl.createTypeParameterReference(p.name)]
						)
					else if (cls.abstractable)
						ctx.newTypeRef(ctx.getFqnFor(cls))
					else if (cls.instanceClass !== null)
						ctx.newTypeRef(cls.instanceClass.name)
					else if (cls.instanceTypeName !== null)
						ctx.newTypeRef(cls.instanceTypeName)
				EEnum:
					ctx.newTypeRef(ctx.getFqnFor(cls))
				EDataType:
					if (cls.instanceClass !== null)
						ctx.newTypeRef(cls.instanceClass.name)
					else if (cls.instanceTypeName !== null)
						ctx.newTypeRef(cls.instanceTypeName)
				default:
					ctx.newTypeRef(Object)
			}
	}

	def dispatch JvmTypeReference newTypeRef(Metamodel ctx, Metamodel sup, EClassifier cls) {
		return
			switch (cls) {
				case null:
					ctx.newTypeRef(Object)
				EClass:
					if (cls.abstractable)
						ctx.newTypeRef(ctx.adapterNameFor(sup, cls))
					else if (cls.instanceClass !== null)
						ctx.newTypeRef(cls.instanceClass.name)
					else if (cls.instanceTypeName !== null)
						ctx.newTypeRef(cls.instanceTypeName)
				EEnum:
					ctx.newTypeRef(sup.getFqnFor(cls))
				EDataType:
					if (cls.instanceClass !== null)
						ctx.newTypeRef(cls.instanceClass.name)
					else if (cls.instanceTypeName !== null)
						ctx.newTypeRef(cls.instanceTypeName)
				default:
					ctx.newTypeRef(Object)
			}
	}

	def JvmTypeReference createTypeParameterReference(JvmTypeParameterDeclarator[] lst, String find) {
		return typeReferences.createTypeRef(lst.map[typeParameters].flatten.findFirst[name == find])
	}
}
