package fr.inria.diverse.melange.ast

import com.google.inject.Inject
import fr.inria.diverse.melange.algebra.ModelTypeAlgebra
import fr.inria.diverse.melange.codegen.ModelTypeGeneratorAdapterFactory
import fr.inria.diverse.melange.eclipse.EclipseProjectHelper
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.metamodel.melange.ModelType
import java.io.IOException
import java.util.List
import org.eclipse.emf.codegen.ecore.generator.Generator
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory.Descriptor
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter
import org.eclipse.emf.common.util.Diagnostic
import org.eclipse.emf.common.util.Monitor
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtext.naming.IQualifiedNameProvider

class ModelTypeExtensions
{
	@Inject extension LanguageExtensions
	@Inject extension ModelingElementExtensions
	@Inject extension EcoreExtensions
	@Inject extension IQualifiedNameProvider
	@Inject extension EclipseProjectHelper
	@Inject ModelTypeAlgebra algebra
	@Inject EclipseProjectHelper helper

	def String getInferredEcoreUri(ModelType mt) {
		val project = mt.eResource.project
		return '''platform:/resource/«project.name»/model-gen/«mt.name».ecore'''
	}

	def GenModel createGenmodel(ModelType mt, String ecoreUri, String gmUri) {
		val resSet = new ResourceSetImpl
		val pkgRes = resSet.getResource(URI::createURI(ecoreUri), true)
		val pkgs = pkgRes.contents

		val genmodel = GenModelFactory.eINSTANCE.createGenModel => [
			complianceLevel = GenJDKLevel.JDK70_LITERAL
			modelDirectory = helper.getProject(mt.eResource).getFolder("src-gen").fullPath.toString
			foreignModel += ecoreUri
			modelName = mt.name
			initialize(pkgs.map[it as EPackage])
			genPackages.forEach[gp |
				gp.basePackage = mt.fullyQualifiedName.toString.toLowerCase
			]
		]

		val res = resSet.createResource(URI::createURI(gmUri))
		res.contents += genmodel

		try {
			res.save(null)
			return genmodel
		} catch (IOException e) {
			e.printStackTrace
			return null
		}
	}

	def void generateModelTypeCode(GenModel genModel) {
		val gmUri = "http://www.eclipse.org/emf/2002/GenModel"

		genModel.reconcile
		genModel.canGenerate = true
		genModel.validateModel = true

		val reg = GeneratorAdapterFactory.Descriptor.Registry.INSTANCE
		val old = reg.getDescriptors(gmUri).head
		reg.removeDescriptors(gmUri)
		reg.addDescriptor(gmUri, new Descriptor {
			override createAdapterFactory() {
				return new ModelTypeGeneratorAdapterFactory
			}
		})

		val generator = new Generator(reg) => [
			input = genModel
		]

		generator.generate(
			genModel,
			GenBaseGeneratorAdapter::MODEL_PROJECT_TYPE,
			// NullMonitor
			new Monitor() {
				override beginTask(String name, int totalWork) {}
				override clearBlocked() {}
				override done() {}
				override internalWorked(double work) {}
				override isCanceled() { return false }
				override setBlocked(Diagnostic reason) {}
				override setCanceled(boolean value) {}
				override setTaskName(String name) {}
				override subTask(String name) {}
				override worked(int work) {}
			}
		)

		reg.removeDescriptors(gmUri)
		reg.addDescriptor(gmUri, old)
	}

	def String getUri(ModelType mt) {
		val userDefinedUri =
			if (mt.isExtracted) mt.extracted.exactTypeUri
			else mt.mtUri
		return userDefinedUri ?: '''http://«mt.name.toLowerCase»/'''
	}

	def boolean getIsComplete(ModelType mt) {
		return
			mt.name !== null &&
			if (mt.isExtracted)
				mt.extracted.isComplete
			else
				!mt.pkgs.filterNull.empty
	}

	def boolean isExtracted(ModelType mt) {
		return mt.extracted !== null
	}

	def boolean isImported(ModelType mt) {
		return mt.ecoreUri !== null
	}

	def List<EPackage> getAllSubPkgs(ModelType mt) {
		return mt.pkgs.head.allSubPkgs
	}

	def boolean isSubtypeOf(ModelType mt1, ModelType mt2) {
		return algebra.isSubtypeOf(mt1, mt2)
	}

	def EClassifier findClassifier(ModelType mt, String clsName) {
		return mt.allClassifiers.findFirst[name == clsName]
	}

	def EClass findClass(ModelType mt, String clsName) {
		return mt.allClasses.findFirst[name == clsName]
	}

	def List<EClassifier> getAllClassifiers(ModelType mt) {
		return mt.pkgs.map[EClassifiers].flatten.toList
	}

	def Iterable<EClass> getAllClasses(ModelType mt) {
		return mt.allClassifiers.filter(EClass)
	}

	def Iterable<EEnum> getAllEnums(ModelType mt) {
		return mt.allClassifiers.filter(EEnum)
	}
}
