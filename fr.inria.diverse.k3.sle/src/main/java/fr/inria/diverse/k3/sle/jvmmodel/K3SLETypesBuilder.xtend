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

import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder

class K3SLETypesBuilder
{
	@Inject extension EcoreExtensions
	@Inject extension ModelTypeExtensions
	@Inject extension JvmTypeReferenceBuilder
	@Inject extension NamingHelper
	@Inject TypeReferences typeReferences

	def dispatch JvmTypeReference typeRef(ModelType ctx, ETypedElement f, Iterable<JvmTypeParameterDeclarator> decl) {
		val baseType =
			switch (f) {
				case f.EGenericType !== null:
					ctx.typeRef(f.EGenericType, decl)
				case f.EType !== null:
					ctx.typeRef(f.EType, decl)
				EOperation:
					typeRef(Void.TYPE)
				default:
					typeRef(Object)
			}

		return if (f.many) typeRef(List, baseType) else baseType
	}

	def dispatch JvmTypeReference typeRef(ModelType ctx, EGenericType t, Iterable<JvmTypeParameterDeclarator> decl) {
		return
			if (t.ETypeParameter !== null)
				decl.createTypeParameterReference(t.ETypeParameter.name)
			else if (!t.ETypeArguments.empty)
				typeRef(
					ctx.getFqnFor(t.EClassifier),
					t.ETypeArguments.map[ta |
						if (ta.EClassifier !== null)
							// FIXME: Generic types can not be abstracted for now
							//        Uncomment when solved
							//
							//typeRef(ta.EClassifier, decl)
							if (ctx.isExtracted)
								typeRef(ctx.extracted.getFqnFor(ta.EClassifier))
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
				typeRef(Object)
	}

	def dispatch JvmTypeReference typeRef(ModelType ctx, EClassifier cls, Iterable<JvmTypeParameterDeclarator> decl) {
		return
			switch (cls) {
				case null:
					typeRef(Object)
				EClass:
					if (!cls.ETypeParameters.empty)
						typeRef(
							ctx.interfaceNameFor(cls),
							cls.ETypeParameters.map[p | decl.createTypeParameterReference(p.name)]
						)
					else if (cls.abstractable)
						typeRef(ctx.interfaceNameFor(cls))
					else if (cls.instanceClass !== null)
						typeRef(cls.instanceClass.name)
					else if (cls.instanceTypeName !== null)
						typeRef(cls.instanceTypeName)
				EEnum:
					typeRef(ctx.getFqnFor(cls))
				EDataType:
					if (cls.instanceClass !== null)
						typeRef(cls.instanceClass.name)
					else if (cls.instanceTypeName !== null)
						typeRef(cls.instanceTypeName)
				default:
					typeRef(Object)
			}
	}

	def dispatch JvmTypeReference typeRef(Metamodel ctx, EClassifier cls, Iterable<JvmTypeParameterDeclarator> decl) {
		return
			switch (cls) {
				case null:
					typeRef(Object)
				EClass:
					if (!cls.ETypeParameters.empty)
						typeRef(
							ctx.getFqnFor(cls),
							cls.ETypeParameters.map[p | decl.createTypeParameterReference(p.name)]
						)
					else if (cls.abstractable)
						typeRef(ctx.getFqnFor(cls))
					else if (cls.instanceClass !== null)
						typeRef(cls.instanceClass.name)
					else if (cls.instanceTypeName !== null)
						typeRef(cls.instanceTypeName)
				EEnum:
					typeRef(ctx.getFqnFor(cls))
				EDataType:
					if (cls.instanceClass !== null)
						typeRef(cls.instanceClass.name)
					else if (cls.instanceTypeName !== null)
						typeRef(cls.instanceTypeName)
				default:
					typeRef(Object)
			}
	}

	def dispatch JvmTypeReference typeRef(Metamodel ctx, Metamodel sup, EClassifier cls) {
		return
			switch (cls) {
				case null:
					typeRef(Object)
				EClass:
					if (cls.abstractable)
						typeRef(ctx.adapterNameFor(sup, cls))
					else if (cls.instanceClass !== null)
						typeRef(cls.instanceClass.name)
					else if (cls.instanceTypeName !== null)
						typeRef(cls.instanceTypeName)
				EEnum:
					typeRef(sup.getFqnFor(cls))
				EDataType:
					if (cls.instanceClass !== null)
						typeRef(cls.instanceClass.name)
					else if (cls.instanceTypeName !== null)
						typeRef(cls.instanceTypeName)
				default:
					typeRef(Object)
			}
	}

	def JvmTypeReference createTypeParameterReference(JvmTypeParameterDeclarator[] lst, String find) {
		return typeReferences.createTypeRef(lst.map[typeParameters].flatten.findFirst[name == find])
	}
}
