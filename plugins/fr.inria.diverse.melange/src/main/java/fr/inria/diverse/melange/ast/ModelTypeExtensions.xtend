package fr.inria.diverse.melange.ast

import com.google.inject.Inject
import fr.inria.diverse.melange.codegen.ModelTypeGeneratorAdapterFactory
import fr.inria.diverse.melange.eclipse.EclipseProjectHelper
import fr.inria.diverse.melange.lib.MatchingHelper
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.ModelType
import java.io.IOException
import org.apache.log4j.Logger
import org.eclipse.emf.codegen.ecore.generator.Generator
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory.Descriptor
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter
import org.eclipse.emf.common.util.Diagnostic
import org.eclipse.emf.common.util.Monitor
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.plugin.EcorePlugin
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.emf.ecore.resource.Resource

/**
 * A collection of utilities around {@link ModelType}s
 */
class ModelTypeExtensions
{
	@Inject extension EclipseProjectHelper
	@Inject extension IQualifiedNameProvider
	@Inject extension LanguageExtensions
	@Inject extension ModelingElementExtensions
	@Inject MatchingHelper matchingHelper
	@Inject EclipseProjectHelper helper

	private static final Logger log = Logger.getLogger(ModelTypeExtensions)

	/**
	 * Returns the URI of the serialized Ecore of the {@link ModelType}
	 * {@code mt}.
	 */
	def String getInferredEcoreUri(ModelType mt) {
		val project = mt.eResource.project
		return '''platform:/resource/«project.name»/model-gen/«mt.name».ecore'''
	}

	/**
	 * Creates and serializes the {@link GenModel} for {@code mt} at the
	 * location {@code gmUri}, pointing to the Ecore file located at {@code ecoreUri}.
	 */
	def GenModel createGenmodel(ModelType mt, String ecoreUri, String gmUri) {
		val resSet = new ResourceSetImpl
		resSet.URIConverter.URIMap.putAll(
			EcorePlugin::computePlatformURIMap(true))

		val pkgRes = resSet.getResource(URI::createURI(ecoreUri), true)
		val pkgs = pkgRes.contents.map[it as EPackage]
		val ecoreGmUri =
			EcorePlugin::getEPackageNsURIToGenModelLocationMap(true)
			.get(EcorePackage.eNS_URI)
		val ecoreGmRes = resSet.getResource(ecoreGmUri, true)
		val ecoreGm = ecoreGmRes.contents.head as GenModel

		val genmodel = GenModelFactory.eINSTANCE.createGenModel => [
			complianceLevel = GenJDKLevel.JDK70_LITERAL
			modelDirectory = helper.getProject(mt.eResource)
							.getFolder("src-gen").fullPath.toString
			foreignModel += ecoreUri
			modelName = mt.name
			initialize(pkgs)
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
			log.error("Error while serializing new genmodel", e)
			return null
		}
	}

	/**
	 * Creates an in-memory {@link GenModel} for {@code mt} to be used when the
	 * serialized version created by {@link #createGenmodel} is not available yet.
	 */
	def GenModel createTransientGenmodel(ModelType mt) {
		val resSet = new ResourceSetImpl
		resSet.URIConverter.URIMap.putAll(EcorePlugin::computePlatformURIMap(true))
		val ecoreGmUri = EcorePlugin::getEPackageNsURIToGenModelLocationMap(true).get(EcorePackage.eNS_URI)
		var Resource ecoreGmRes = null
		if(ecoreGmUri !== null)
			ecoreGmRes = resSet.getResource(ecoreGmUri, true)
		val ecoreGm = ecoreGmRes?.contents?.head as GenModel

		return GenModelFactory.eINSTANCE.createGenModel => [
			complianceLevel = GenJDKLevel.JDK70_LITERAL
			modelDirectory = helper.getProject(mt.eResource)
							?.getFolder("src-gen")?.fullPath?.toString
			modelName = mt.name
			initialize(mt.pkgs)
			genPackages.forEach[gp |
				gp.basePackage = mt.fullyQualifiedName.toString.toLowerCase
			]
			if(ecoreGm !== null)
				usedGenPackages.add(ecoreGm.genPackages.head)
		]
	}

	/**
	 * Generates the Java code corresponding to the {@link Genmodel}
	 * {@code genModel}. This code generator uses a specialized generation
	 * strategy: the code implementing the meta-classes' interfaces is not
	 * generated (the .impl package).
	 * <br>
	 * Only the interfaces and the .util package are generated.
	 * 
	 * @see Generator#generate
	 */
	def void generateModelTypeCode(GenModel genModel) {
		val gmUri = GenModelPackage.eNS_URI

		genModel.reconcile
		genModel.canGenerate = true
		genModel.validateModel = true
		genModel.updateClasspath = false

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

	/**
	 * Returns the URI of the {@link ModelType} {@code mt}.
	 * May be automatically crafted by configuration or explicitly defined
	 * by the user using the 'uri' keywork in the Melange file.
	 */
	def String getUri(ModelType mt) {
		val userDefinedUri =
			if (mt.isExtracted) mt.extracted.exactTypeUri
			else mt.mtUri
		return userDefinedUri ?: '''http://«mt.name.toLowerCase»/'''
	}

	/**
	 * Checks whether the {@link ModelType} {@code mt} is well-formed and can
	 * be processed.
	 */
	def boolean isValid(ModelType mt) {
		return
				!mt.name.nullOrEmpty
			&&
				if (mt.isExtracted)
					mt.extracted.isValid
				else
					!mt.pkgs.filterNull.empty
	}
	
	def boolean isComparable(ModelType mt) {
		return
				!mt.name.nullOrEmpty
			&&
				if (mt.isExtracted)
					mt.extracted.isTypable
				else
					!mt.pkgs.filterNull.empty
	}

	/**
	 * Returns whether the {@link ModelType} {@code mt} is extracted from
	 * a {@link Language} implementation or manually crafted.
	 */
	def boolean isExtracted(ModelType mt) {
		return mt.extracted !== null
	}

	/**
	 * Checks whether the {@link ModelType} {@code mt1} is a subtype of the
	 * {@link ModelType} {@code mt2}.
	 * 
	 * @see MatchingHelper#match
	 */
	def boolean isSubtypeOf(ModelType mt1, ModelType mt2) {
		return matchingHelper.match(
			mt1.pkgs.toList, mt2.pkgs.toList, null)
	}
}
