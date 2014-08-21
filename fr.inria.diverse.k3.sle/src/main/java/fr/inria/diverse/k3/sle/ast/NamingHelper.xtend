package fr.inria.diverse.k3.sle.ast

import com.google.inject.Inject

import fr.inria.diverse.k3.sle.lib.EcoreExtensions

import fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType
import fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation

import org.eclipse.emf.codegen.ecore.genmodel.GenPackage

import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature

import org.eclipse.xtext.common.types.JvmOperation

import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName

class NamingHelper
{
	@Inject extension EcoreExtensions
	@Inject extension IQualifiedNameProvider

	def normalize(QualifiedName name) {
		val res = new StringBuilder

		res.append(name.skipLast(1).segments.map[toFirstLower].join("."))
		res.append("." + name.lastSegment.toFirstUpper)
		return res.toString
	}

	def getFqnFor(GenPackage gp, String name) {
		return
			if (gp.basePackage !== null)
				QualifiedName.create(gp.basePackage, gp.prefix, name).normalize.toString
			else
				QualifiedName.create(gp.prefix, name).normalize.toString
	}

	def getPackageFqn(GenPackage gp) {
		gp.getFqnFor(gp.prefix + "Package")
	}

	def getFactoryFqn(GenPackage gp) {
		gp.getFqnFor(gp.prefix + "Factory")
	}

	def getFqnFor(Metamodel mm, EClassifier cls) {
		val pkg = mm.pkgs.findFirst[EClassifiers.exists[name == cls.name]]
		val gp = mm.genmodels.map[allGenPkgs].flatten.findFirst[getEcorePackage.nsURI == pkg.nsURI]

		gp.getFqnFor(cls.name)
	}

	def getPackageFqn(Metamodel mm) {
		mm.genmodels.head.genPackages.head.packageFqn
	}

	def getFactoryFqn(Metamodel mm) {
		mm.genmodels.head.genPackages.head.factoryFqn
	}

	def getFactoryFqnFor(Metamodel mm, EPackage pkg) {
		val gp = mm.genmodels.head.allGenPkgs.findFirst[gp | gp.getEcorePackage.nsURI == pkg.nsURI]

		gp.factoryFqn

	}

	def getFactoryName(ModelType mt) {
		mt.fullyQualifiedName.toLowerCase.append(mt.name + "Factory").normalize.toString
	}

	def interfaceNameFor(ModelType mt, EClass cls) {
		mt.fullyQualifiedName.toLowerCase.append(cls.name).normalize.toString
	}

	def adapterNameFor(Metamodel mm, ModelType mt, EClass cls) {
		mm.adapterNameFor(mt, cls.name)
	}

	def adapterNameFor(Metamodel mm, ModelType mt, String name) {
		mm.fullyQualifiedName.append("adapters").append(mt.fullyQualifiedName.lastSegment).toLowerCase.append(name + "Adapter").normalize.toString
	}

	def adapterNameFor(Metamodel mm, ModelType mt) {
		mm.fullyQualifiedName.append("adapters").append(mt.fullyQualifiedName.lastSegment).toLowerCase.append(mm.name + "Adapter").normalize.toString
	}

	def adapterNameFor(Metamodel mm, Metamodel superMM, EClass cls) {
		mm.fullyQualifiedName.append("adapters").append(superMM.name).toLowerCase.append(cls.name + "Adapter").normalize.toString
	}

	def factoryAdapterNameFor(Metamodel mm, ModelType mt) {
		mm.fullyQualifiedName.append("adapters").append(mt.fullyQualifiedName.lastSegment).toLowerCase.append(mt.name + "FactoryAdapter").normalize.toString
	}

	def getClassName(Transformation t) {
		t.fullyQualifiedName.skipLast(1).toLowerCase.append(t.name)
	}

	def getGetterName(EStructuralFeature f) {
		switch (f) {
			EAttribute:
				if (#["java.lang.Boolean", "boolean"].contains(f.EAttributeType.instanceClassName) && !f.many)
					'''is«f.name.toFirstUpper»'''.toString
				else
					'''get«f.name.toFirstUpper»'''.toString
			EReference:
				'''get«f.name.toFirstUpper»'''.toString
		}
	}

	def getGetterName(JvmOperation op) {
		if (#["java.lang.Boolean", "boolean"].contains(op.returnType.type.simpleName))
			'''is«op.simpleName.toFirstUpper»'''.toString
		else
			'''get«op.simpleName.toFirstUpper»'''.toString
	}

	def getUmlGetterName(EStructuralFeature f) {
		switch (f) {
			EAttribute:
				if (#["java.lang.Boolean", "boolean"].contains(f.EAttributeType.instanceClassName))
					'''«f.name.toFirstUpper»'''.toString
				else
					'''get«f.name.toFirstUpper»'''.toString
			EReference:
				'''get«f.formatUmlReferenceName.toFirstUpper»'''.toString
		}
	}

	def getSetterName(EStructuralFeature f) {
		'''set«f.name.toFirstUpper»'''.toString
	}

	def getSetterName(JvmOperation op) {
		'''set«op.simpleName.toFirstUpper»'''.toString
	}

	def formatUmlOperationName(EOperation op) {
		val opName = op.name.toCamelCase

		if (op.EParameters.head?.EType?.name == "EDiagnosticChain") {
			return '''validate«opName.toFirstUpper»'''.toString
		}

		return opName
	}

	def formatUmlReferenceName(EReference ref) {
		if (ref.name == "class")
			return "class_"
		else if (ref.many) {
			if (ref.name.endsWith("es"))
				'''«ref.name.toFirstUpper»es'''.toString
			else if (ref.name.endsWith("y"))
				'''«ref.name.substring(0, ref.name.length - 1).toFirstUpper»ies'''.toString
			else if (ref.name.endsWith("ex"))
				'''«ref.name.substring(0, ref.name.length - 2).toFirstUpper»ices'''.toString
			else
				'''«ref.name.toFirstUpper»s'''.toString
		}
		else
			return ref.name
	}

	def toCamelCase(String s) {
		val parts = s.split("_")
		val res = new StringBuilder

		parts.forEach[p, i |
			res.append(if (i == 0) p else p.toFirstUpper)
		]

		return res.toString
	}
}
