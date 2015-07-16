package fr.inria.diverse.melange.ast

import com.google.common.collect.Lists
import com.google.inject.Inject
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.utils.EPackageProvider
import java.io.IOException
import java.util.List
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

class MetamodelExtensions
{
	@Inject extension ModelingElementExtensions
	@Inject extension LanguageExtensions
	@Inject extension EcoreExtensions
	@Inject EPackageProvider provider

	def List<GenModel> getGenmodels(Metamodel mm) {
		return provider.getGenModels(mm)
	}

	def boolean getIsComplete(Metamodel mm) {
		return !mm.pkgs.empty && !mm.genmodels.empty
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
		return mm.pkgs.map[EClassifiers].flatten
	}

	def Iterable<EClass> getAllClasses(Metamodel mm) {
		return mm.allClassifiers.filter(EClass)
	}

	def void createGenmodel(Metamodel mm, String ecoreUri, String gmUri, String modelDirectory) {
		val genmodel = GenModelFactory.eINSTANCE.createGenModel => [
			it.complianceLevel = GenJDKLevel.JDK70_LITERAL
			it.modelDirectory = modelDirectory.replaceFirst("platform:/resource", "").replaceFirst("..", "")
			it.foreignModel += ecoreUri
			it.modelName = mm.name
			it.modelPluginID = mm.owningLanguage.externalRuntimeName
			it.initialize(Lists::newArrayList(mm.pkgs))
		]

		val resSet = new ResourceSetImpl
		val res = resSet.createResource(URI::createURI(gmUri))
		res.contents += genmodel

		try {
			res.save(null)
		} catch (IOException e) {
			e.printStackTrace
		}
	}
}
