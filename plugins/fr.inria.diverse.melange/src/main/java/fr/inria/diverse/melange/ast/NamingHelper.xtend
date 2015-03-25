package fr.inria.diverse.melange.ast

import com.google.inject.Inject

import fr.inria.diverse.melange.lib.EcoreExtensions

import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.metamodel.melange.Transformation

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
	@Inject extension ModelingElementExtensions
	@Inject extension MetamodelExtensions
	@Inject extension EcoreExtensions
	@Inject extension IQualifiedNameProvider

	def String normalize(QualifiedName name) {
		val res = new StringBuilder

		res.append(name.skipLast(1).segments.map[toLowerCase].join("."))
		res.append("." + name.lastSegment/*.toFirstUpper*/)

		return res.toString
	}

	def String getFqnFor(GenPackage gp, String name) {
		val segments = newArrayList

		if (gp.basePackage !== null && gp.basePackage.length > 0)
			segments += gp.basePackage
		if (gp.prefix !== null && gp.prefix.length > 0)
			segments += gp.prefix
		if (gp.interfacePackageSuffix !== null && gp.interfacePackageSuffix.length > 0)
			segments += gp.interfacePackageSuffix

		segments += name

		return QualifiedName::create(segments).normalize.toString
	}

	def String getPackageFqn(GenPackage gp) {
		return gp.getFqnFor(gp.prefix + "Package")
	}

	def String getFactoryFqn(GenPackage gp) {
		return gp.getFqnFor(gp.prefix + "Factory")
	}

	def String getPackageUri(GenPackage gp) {
		return gp.getEcorePackage.nsURI
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

	def String getPackageUri(Metamodel mm) {
		return mm.genmodels.head.genPackages.head.packageUri
	}

	def String getFactoryFqn(Metamodel mm) {
		return mm.genmodels.head.genPackages.head.factoryFqn
	}

	def String getFactoryFqnFor(Metamodel mm, EPackage pkg) {
		return
			mm.genmodels.map[allGenPkgs].flatten
			.findFirst[gp | gp.getEcorePackage.nsURI == pkg.nsURI]
			.factoryFqn
	}

	def String getAdaptersFactoryNameFor(Metamodel mm, ModelType mt) {
		return mm.fullyQualifiedName.append("adapters").append(mt.fullyQualifiedName.lastSegment).toLowerCase.append(mt.name + "AdaptersFactory").normalize.toString
	}
	
	def String getMappersFactoryNameFor(ModelType sourceMT, ModelType targetMT) {
		return sourceMT.fullyQualifiedName.append("mappers").append(targetMT.fullyQualifiedName.lastSegment).toLowerCase.append(targetMT.name + "MappersFactory").normalize.toString
	}

	def String getFqnFor(ModelType mt, EClassifier cls) {
		return
			switch (cls) {
				EClass:
					mt.interfaceNameFor(cls)
				EEnum:
//					if (mt.isExtracted)
//						mt.extracted.getFqnFor(cls)
//					else
						mt.fullyQualifiedName.toLowerCase.append(cls.name).normalize.toString
				EDataType:
					cls.instanceClass.name ?: cls.instanceTypeName
			}
	}

	def String getFactoryName(ModelType mt) {
		return mt.fullyQualifiedName.toLowerCase.append(mt.name + "Factory").normalize.toString
	}

	def String interfaceNameFor(ModelType mt, EClass cls) {
		return
			if (cls.EPackage.isEcore)
				"org.eclipse.emf.ecore." + cls.name
			else
				mt.fullyQualifiedName.toLowerCase.append(cls.name).normalize.toString
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
	
	def String mapperNameFor(ModelType sourceMT, ModelType targetMT) {
		return sourceMT.fullyQualifiedName.append("mappers").append(targetMT.fullyQualifiedName.lastSegment).toLowerCase.append(sourceMT.name + "Adapter").normalize.toString
	}

	def String adapterNameFor(Metamodel mm, Metamodel superMM, EClass cls) {
		return mm.fullyQualifiedName.append("adapters").append(superMM.name).toLowerCase.append(cls.name + "Adapter").normalize.toString
	}
	
	def String mapperNameFor(ModelType sourceMT, ModelType targetMT, EClass targetClass){
		return sourceMT.fullyQualifiedName.append("mappers").append(targetMT.fullyQualifiedName.lastSegment).toLowerCase.append(targetClass.name + "Mapper").normalize.toString
	}
	
	def String simpleMapperNameFor(ModelType sourceMT, ModelType targetMT, EClass targetClass){
		return targetClass.name + "Mapper"
	}

	def String simpleAdapterNameFor(Metamodel mm, ModelType mt, EClass cls) {
		return mm.simpleAdapterNameFor(mt, cls.name)
	}

	def String simpleAdapterNameFor(Metamodel mm, ModelType mt, String name) {
		return mm.fullyQualifiedName.append("adapters").append(mt.fullyQualifiedName.lastSegment).toLowerCase.append(name + "Adapter").lastSegment.toString
	}

	def String factoryAdapterNameFor(Metamodel mm, ModelType mt) {
		return mm.fullyQualifiedName.append("adapters").append(mt.fullyQualifiedName.lastSegment).toLowerCase.append(mt.name + "FactoryAdapter").normalize.toString
	}

	def String getClassName(Transformation t) {
		return t.fullyQualifiedName.skipLast(1).toLowerCase.append(t.name).toString
	}

	def String getStandaloneSetupClassName(ModelTypingSpace root) {
		return root.fullyQualifiedName + ".StandaloneSetup"
	}

	def String getGetterName(EStructuralFeature f) {
		return
			switch (f) {
				case f.EContainingClass.EPackage.isUml:
					f.umlGetterName
				EAttribute:
					if (f.EAttributeType.instanceClassName == "boolean" && !f.many)
						'''is«f.name.toFirstUpper»'''
					else
						'''get«f.name.toFirstUpper»'''
				EReference:
					'''get«f.name.toFirstUpper»'''
			}
	}

	def String getGetterName(JvmOperation op) {
		return
			if (op.returnType.type.simpleName == "boolean")
				'''is«op.simpleName.toFirstUpper»'''
			else
				'''get«op.simpleName.toFirstUpper»'''
	}

	def String getUmlGetterName(EStructuralFeature f) {
		return
			switch (f) {
				EAttribute:
					if (f.EAttributeType.instanceClassName == "boolean")
						if (f.name.startsWith("is") && Character::isUpperCase(f.name.charAt(2)))
							'''«f.formatUmlFeatureName»'''
						else if (f.many)
							'''get«f.formatUmlFeatureName.toFirstUpper»'''
						else
							'''is«f.formatUmlFeatureName.toFirstUpper»'''
					else
						'''get«f.formatUmlFeatureName.toFirstUpper»'''
				EReference:
					'''get«f.formatUmlFeatureName.toFirstUpper»'''
			}
	}

	def String getUmlSetterName(EStructuralFeature f) {
		return '''set«f.formatUmlFeatureName.toFirstUpper»'''
	}

	def String getSetterName(EStructuralFeature f) {
		return
			if (f.EContainingClass.EPackage.isUml)
				f.umlSetterName
			else
				'''set«f.name.toFirstUpper»'''
	}

	def String getSetterName(JvmOperation op) {
		return '''set«op.simpleName.toFirstUpper»'''
	}

	def String getUnsetterName(EStructuralFeature f) {
		return
			if (f.EContainingClass.EPackage.isUml)
				'''unset«f.formatUmlFeatureName.toFirstUpper»'''
			else
				'''unset«f.name.toFirstUpper»'''
	}

	def String getUnsetterCheckName(EStructuralFeature f) {
		return
			if (f.EContainingClass.EPackage.isUml)
				'''isSet«f.formatUmlFeatureName.toFirstUpper»'''
			else
				'''isSet«f.name.toFirstUpper»'''
	}

	def String formatUmlOperationName(EOperation op) {
		val opName = op.name.toCamelCase

		if (op.EParameters.head?.EType?.name == "EDiagnosticChain") {
			return '''validate«opName.toFirstUpper»'''
		}

		return opName
	}

	def String formatUmlFeatureName(EStructuralFeature f) {
		return
			if (f.name == "class")
				"class_"
			else if (f.many) {
				if (f.name.endsWith("es"))
					'''«f.name»es'''
				else if (f.name.endsWith("y") && !f.name.endsWith("By"))
					'''«f.name.substring(0, f.name.length - 1)»ies'''
				else if (f.name.endsWith("ex"))
					'''«f.name.substring(0, f.name.length - 2)»ices'''
				else if (f.name.endsWith("ss"))
					'''«f.name»es'''
				else if (!f.name.endsWith("Data"))
					'''«f.name»s'''
				else
					f.name
			} else
				f.name
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
