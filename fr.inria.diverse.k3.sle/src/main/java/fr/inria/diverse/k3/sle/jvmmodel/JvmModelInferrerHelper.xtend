package fr.inria.diverse.k3.sle.jvmmodel

import com.google.inject.Inject

import fr.inria.diverse.k3.sle.ast.MetamodelExtensions
import fr.inria.diverse.k3.sle.ast.ModelTypeExtensions
import fr.inria.diverse.k3.sle.ast.NamingHelper

import fr.inria.diverse.k3.sle.lib.EcoreExtensions

import fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType
import fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation

import java.util.List

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EStructuralFeature

import org.eclipse.xtext.common.types.JvmFormalParameter
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmTypeReference

import org.eclipse.xtext.naming.IQualifiedNameProvider

import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

class JvmModelInferrerHelper
{
	@Inject extension EcoreExtensions
	@Inject extension ModelTypeExtensions
	@Inject extension MetamodelExtensions
	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject extension NamingHelper

	/*--- Getters / Setters  ---*/
	def toGetterSignature(EStructuralFeature f, String name, JvmTypeReference type) {
		val g =	f.toGetter(name, type)
		g.removeExistingBody

		if (#["java.lang.Boolean", "boolean"].contains(type.qualifiedName))
			g.simpleName = g.simpleName.replaceFirst("get", "is")

		return g
	}

	def toUmlGetterSignature(EStructuralFeature f, String name, JvmTypeReference type) {
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

	def toSetterSignature(EStructuralFeature f, String name, JvmTypeReference type) {
		val s = f.toSetter(name, type)
		s.removeExistingBody

		return s
	}

	/*--- Naming helpers ---*/
	def getFactoryName(ModelType mt) {
		mt.fullyQualifiedName.append(mt.name + "Factory").normalize.toString
	}

	def interfaceNameFor(ModelType mt, EClass cls) {
		if (cls === null)
			return ""

		mt.fullyQualifiedName.append(cls.name).normalize.toString
	}

	def adapterNameFor(Metamodel mm, ModelType mt, EClass cls) {
		mm.adapterNameFor(mt, cls.name)
	}

	def adapterNameFor(Metamodel mm, ModelType mt, String name) {
		mm.fullyQualifiedName.append("adapters").append(mt.fullyQualifiedName.lastSegment).append(name + "Adapter").normalize.toString
	}

	def adapterNameFor(Metamodel mm, ModelType mt) {
		mm.fullyQualifiedName.append("adapters").append(mt.fullyQualifiedName.lastSegment).append(mm.name + "Adapter").normalize.toString
	}

	def adapterNameFor(Metamodel mm, Metamodel superMM, EClass cls) {
		mm.fullyQualifiedName.append("adapters").append(superMM.name).append(cls.name + "Adapter").normalize.toString
	}

	def factoryAdapterNameFor(Metamodel mm, ModelType mt) {
		mm.fullyQualifiedName.append("adapters").append(mt.fullyQualifiedName.lastSegment).append(mt.name + "FactoryAdapter").normalize.toString
	}

	def getClassName(Transformation t) {
		t.fullyQualifiedName.skipLast(1).toLowerCase.append(t.name)
	}

	/*--- Type references helpers ---*/
	def newTypeRef(ModelType ctx, EClassifier cls) {
		// TODO: Handle generics
		switch (cls) {
			case null: ctx.newTypeRef(Object)
			EClass:
				if (cls.abstractable)
					ctx.newTypeRef(ctx.interfaceNameFor(cls))
				else if (cls.instanceClass !== null)
					ctx.newTypeRef(cls.instanceClass.name)
				else if (cls.instanceTypeName !== null)
					ctx.newTypeRef(cls.instanceTypeName)
				else throw new TypeReferenceException("Cannot find type reference for class " + cls)
			EEnum:
				if (ctx.isExtracted)
					ctx.newTypeRef(ctx.extracted.getFqnFor(cls))
				else throw new TypeReferenceException("A model type cannot explicitly define an enumeration: " + cls)
			EDataType:
				if (cls.instanceClass !== null)
					ctx.newTypeRef(cls.instanceClass.name)
				else if (cls.instanceTypeName !== null)
					ctx.newTypeRef(cls.instanceTypeName)
				else throw new TypeReferenceException("EDataType should declare its instance class/type name: " + cls)
		}
	}

	def overrides(JvmOperation o1, JvmOperation o2) {
		   o1.simpleName == o2.simpleName
		   // FIXME: Covariant return types
		&& o1.returnType.qualifiedName == o2.returnType.qualifiedName
		&& parameterEquals(o1.parameters, o2.parameters)
	}

	def parameterEquals(List<JvmFormalParameter> p1, List<JvmFormalParameter> p2) {
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
