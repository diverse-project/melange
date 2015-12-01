package fr.inria.diverse.melange.ast

import com.google.inject.Inject
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.utils.EPackageProvider
import java.io.IOException
import java.util.List
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtext.naming.IQualifiedNameProvider

class MetamodelExtensions
{
	@Inject extension ModelingElementExtensions
	@Inject extension LanguageExtensions
	@Inject extension EcoreExtensions
	@Inject extension IQualifiedNameProvider
	@Inject EPackageProvider provider

	def boolean getIsComplete(Metamodel mm) {
		return !mm.pkgs.filterNull.empty && !mm.genmodels.filterNull.empty
	}

	def EClass findClass(Metamodel mm, String clsName) {
		return mm.allClasses.filter(EClass).findFirst[name == clsName]
	}

	def EClassifier findClassifier(Metamodel mm, String clsName) {
		return mm.allClassifiers.filter(EClassifier).findFirst[name == clsName]
	}

	def EClassifier findClassifierFor(Metamodel mm, String clsName) {
		val cls = mm.findClass(clsName)
		if (cls !== null)
			return cls

		val dt = EcorePackage.eINSTANCE.findClassifier("E" + clsName.toFirstUpper)
		if (dt !== null)
			return dt
	}

	def List<EPackage> getAllSubPkgs(Metamodel mm) {
		return mm.pkgs.head.allSubPkgs
	}

	def Iterable<EClassifier> getAllClassifiers(Metamodel mm) {
		return mm.pkgs.map[getAllClassifiers].flatten
	}

	def Iterable<EClass> getAllClasses(Metamodel mm) {
		return mm.pkgs.map[getAllClasses].flatten
	}

	def void createGenmodel(Metamodel mm, String ecoreUri, String gmUri, String modelDirectory) {
		val resSet = new ResourceSetImpl
		val pkgRes = resSet.getResource(URI::createURI(ecoreUri), true)
		val pkgs = pkgRes.contents

		val genmodel = GenModelFactory.eINSTANCE.createGenModel => [
			it.complianceLevel = GenJDKLevel.JDK70_LITERAL
			it.modelDirectory = modelDirectory.replaceFirst("platform:/resource", "").replaceFirst("..", "")
			it.foreignModel += ecoreUri
			it.modelName = mm.owningLanguage.name
			it.modelPluginID = mm.owningLanguage.externalRuntimeName
			it.initialize(pkgs.map[it as EPackage])
			genPackages.forEach[gp |
				gp.basePackage = mm.owningLanguage.fullyQualifiedName.toLowerCase.toString
			]
		]

		val res = resSet.createResource(URI::createURI(gmUri))
		res.contents += genmodel

		try {
			res.save(null)
		} catch (IOException e) {
			e.printStackTrace
		}
	}
}
