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
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EEnum
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
	@Inject extension ModelTypeExtensions

	def String normalize(QualifiedName name) {
		val res = new StringBuilder

		res.append(name.skipLast(1).segments.map[toFirstLower].join("."))
		res.append("." + name.lastSegment.toFirstUpper)

		return res.toString
	}

	def String getFqnFor(GenPackage gp, String name) {
		return
			if (gp.basePackage !== null)
				QualifiedName.create(gp.basePackage, gp.prefix, name).normalize.toString
			else
				QualifiedName.create(gp.prefix, name).normalize.toString
	}

	def String getPackageFqn(GenPackage gp) {
		return gp.getFqnFor(gp.prefix + "Package")
	}

	def String getFactoryFqn(GenPackage gp) {
		return gp.getFqnFor(gp.prefix + "Factory")
	}

	def String getFqnFor(Metamodel mm, EClassifier cls) {
		return
			if (cls instanceof EClass || cls instanceof EEnum)
				mm.genmodels
					.map[allGenPkgs].flatten
					.findFirst[getEcorePackage.nsURI == mm.pkgs.findFirst[EClassifiers.exists[name == cls.name]].nsURI]
					.getFqnFor(cls.name)
			else
				cls.instanceClass?.name ?: cls.instanceClassName
	}

	def String getPackageFqn(Metamodel mm) {
		return mm.genmodels.head.genPackages.head.packageFqn
	}

	def String getFactoryFqn(Metamodel mm) {
		return mm.genmodels.head.genPackages.head.factoryFqn
	}

	def String getFactoryFqnFor(Metamodel mm, EPackage pkg) {
		return
			mm.genmodels.head.allGenPkgs
			.findFirst[gp | gp.getEcorePackage.nsURI == pkg.nsURI]
			.factoryFqn
	}

	def String getFqnFor(ModelType mt, EClassifier cls) {
		return
			switch (cls) {
				EClass:
					mt.interfaceNameFor(cls)
				EEnum:
					if (mt.isExtracted)
						mt.extracted.getFqnFor(cls)
					else
						mt.fullyQualifiedName.toLowerCase.append(cls.name).normalize.toString
				EDataType:
					cls.instanceClass.name ?: cls.instanceTypeName
			}
	}

	def String getFactoryName(ModelType mt) {
		return mt.fullyQualifiedName.toLowerCase.append(mt.name + "Factory").normalize.toString
	}

	def String interfaceNameFor(ModelType mt, EClass cls) {
		return mt.fullyQualifiedName.toLowerCase.append(cls.name).normalize.toString
	}

	def String adapterNameFor(Metamodel mm, ModelType mt, EClass cls) {
		return mm.adapterNameFor(mt, cls.name)
	}

	def String adapterNameFor(Metamodel mm, ModelType mt, String name) {
		return mm.fullyQualifiedName.append("adapters").append(mt.fullyQualifiedName.lastSegment).toLowerCase.append(name + "Adapter").normalize.toString
	}

	def String adapterNameFor(Metamodel mm, ModelType mt) {
		return mm.fullyQualifiedName.append("adapters").append(mt.fullyQualifiedName.lastSegment).toLowerCase.append(mm.name + "Adapter").normalize.toString
	}

	def String adapterNameFor(Metamodel mm, Metamodel superMM, EClass cls) {
		return mm.fullyQualifiedName.append("adapters").append(superMM.name).toLowerCase.append(cls.name + "Adapter").normalize.toString
	}

	def String factoryAdapterNameFor(Metamodel mm, ModelType mt) {
		return mm.fullyQualifiedName.append("adapters").append(mt.fullyQualifiedName.lastSegment).toLowerCase.append(mt.name + "FactoryAdapter").normalize.toString
	}

	def QualifiedName getClassName(Transformation t) {
		return t.fullyQualifiedName.skipLast(1).toLowerCase.append(t.name)
	}

	def String getGetterName(EStructuralFeature f) {
		return
			switch (f) {
				EAttribute:
					if (f.EAttributeType.instanceClassName == "boolean" && !f.many)
						'''is«f.name.toFirstUpper»'''.toString
					else
						'''get«f.name.toFirstUpper»'''.toString
				EReference:
					'''get«f.name.toFirstUpper»'''.toString
			}
	}

	def String getGetterName(JvmOperation op) {
		return
			if (op.returnType.type.simpleName == "boolean")
				'''is«op.simpleName.toFirstUpper»'''.toString
			else
				'''get«op.simpleName.toFirstUpper»'''.toString
	}

	def String getUmlGetterName(EStructuralFeature f) {
		return
			switch (f) {
				EAttribute:
					if (f.EAttributeType.instanceClassName == "boolean")
						'''«f.name.toFirstUpper»'''.toString
					else
						'''get«f.name.toFirstUpper»'''.toString
				EReference:
					'''get«f.formatUmlReferenceName.toFirstUpper»'''.toString
			}
	}

	def String getSetterName(EStructuralFeature f) {
		return '''set«f.name.toFirstUpper»'''.toString
	}

	def String getSetterName(JvmOperation op) {
		return '''set«op.simpleName.toFirstUpper»'''.toString
	}

	def String formatUmlOperationName(EOperation op) {
		val opName = op.name.toCamelCase

		if (op.EParameters.head?.EType?.name == "EDiagnosticChain") {
			return '''validate«opName.toFirstUpper»'''.toString
		}

		return opName
	}

	def String formatUmlReferenceName(EReference ref) {
		return
			if (ref.name == "class")
				"class_"
			else if (ref.many) {
				if (ref.name.endsWith("es"))
					'''«ref.name.toFirstUpper»es'''.toString
				else if (ref.name.endsWith("y"))
					'''«ref.name.substring(0, ref.name.length - 1).toFirstUpper»ies'''.toString
				else if (ref.name.endsWith("ex"))
					'''«ref.name.substring(0, ref.name.length - 2).toFirstUpper»ices'''.toString
				else
					'''«ref.name.toFirstUpper»s'''.toString
			} else
				ref.name
	}

	def String toCamelCase(String s) {
		val parts = s.split("_")
		val res = new StringBuilder

		parts.forEach[p, i |
			res.append(if (i == 0) p else p.toFirstUpper)
		]

		return res.toString
	}
}
