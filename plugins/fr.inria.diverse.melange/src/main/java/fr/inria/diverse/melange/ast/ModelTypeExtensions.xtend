package fr.inria.diverse.melange.ast

import com.google.inject.Inject
import fr.inria.diverse.melange.codegen.ModelTypeGeneratorAdapterFactory
import fr.inria.diverse.melange.eclipse.EclipseProjectHelper
import fr.inria.diverse.melange.lib.MatchingHelper
import fr.inria.diverse.melange.metamodel.melange.ModelType
import java.io.IOException
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
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.plugin.EcorePlugin
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtext.naming.IQualifiedNameProvider

class ModelTypeExtensions
{
	@Inject extension LanguageExtensions
	@Inject extension ModelingElementExtensions
	@Inject extension IQualifiedNameProvider
	@Inject extension EclipseProjectHelper
	@Inject MatchingHelper matchingHelper
	@Inject EclipseProjectHelper helper

	def String getInferredEcoreUri(ModelType mt) {
		val project = mt.eResource.project
		return '''platform:/resource/«project.name»/model-gen/«mt.name».ecore'''
	}

	def GenModel createGenmodel(ModelType mt, String ecoreUri, String gmUri) {
		val resSet = new ResourceSetImpl
		resSet.URIConverter.URIMap.putAll(EcorePlugin::computePlatformURIMap(true))
		val pkgRes = resSet.getResource(URI::createURI(ecoreUri), true)
		val pkgs = pkgRes.contents
		val ecoreGmUri = EcorePlugin::getEPackageNsURIToGenModelLocationMap(true).get(EcorePackage.eNS_URI)
		val ecoreGmRes = resSet.getResource(ecoreGmUri, true)
		val ecoreGm = ecoreGmRes.contents.head as GenModel

		val genmodel = GenModelFactory.eINSTANCE.createGenModel => [
			complianceLevel = GenJDKLevel.JDK70_LITERAL
			modelDirectory = helper.getProject(mt.eResource).getFolder("src-gen").fullPath.toString
			foreignModel += ecoreUri
			modelName = mt.name
			initialize(pkgs.map[it as EPackage])
			genPackages.forEach[gp |
				gp.basePackage = mt.fullyQualifiedName.toString.toLowerCase
			]
			usedGenPackages.add(ecoreGm.genPackages.head)
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

	def GenModel createTransientGenmodel(ModelType mt) {
		val resSet = new ResourceSetImpl
		resSet.URIConverter.URIMap.putAll(EcorePlugin::computePlatformURIMap(true))
		val ecoreGmUri = EcorePlugin::getEPackageNsURIToGenModelLocationMap(true).get(EcorePackage.eNS_URI)
		val ecoreGmRes = resSet.getResource(ecoreGmUri, true)
		val ecoreGm = ecoreGmRes.contents.head as GenModel

		return GenModelFactory.eINSTANCE.createGenModel => [
			complianceLevel = GenJDKLevel.JDK70_LITERAL
			modelDirectory = helper.getProject(mt.eResource).getFolder("src-gen").fullPath.toString
			modelName = mt.name
			initialize(mt.pkgs)
			genPackages.forEach[gp |
				gp.basePackage = mt.fullyQualifiedName.toString.toLowerCase
			]
			usedGenPackages.add(ecoreGm.genPackages.head)
		]
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

	def boolean isValid(ModelType mt) {
		return
			mt.name !== null &&
			if (mt.isExtracted)
				mt.extracted.isValid
			else
				!mt.pkgs.filterNull.empty
	}

	def boolean isExtracted(ModelType mt) {
		return mt.extracted !== null
	}

	def boolean isImported(ModelType mt) {
		return mt.ecoreUri !== null
	}

	def boolean isSubtypeOf(ModelType mt1, ModelType mt2) {
		return matchingHelper.match(mt1.pkgs, mt2.pkgs, null)
	}
}
