package fr.inria.diverse.melange.ast

import com.google.inject.Inject
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import java.io.IOException
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtext.naming.IQualifiedNameProvider

class MetamodelExtensions
{
	@Inject extension IQualifiedNameProvider
	@Inject extension LanguageExtensions
	@Inject extension ModelingElementExtensions

	/**
	 * Checks whether the given {@link Metamodel} {@code mm} is well-formed,
	 * ie. it has at least one package and associated genmodel.
	 */
	def boolean isValid(Metamodel mm) {
		return
			   !mm.pkgs.filterNull.empty
			&& !mm.genmodels.filterNull.empty
	}

	/**
	 * Generates and serializes a {@link GenModel} at the location {@code gmUri}
	 * for the {@link Metamodel} {@code mm} whose Ecore file is located at
	 * {@code ecoreUri}, using {@code targetModelDirectory} as its model directory.
	 */
	def void createGenmodel(Metamodel mm, String ecoreUri,
			String gmUri, String targetModelDirectory) {
		val resSet = new ResourceSetImpl
		val pkgRes = resSet.getResource(URI::createURI(ecoreUri), true)
		val pkgs = pkgRes.contents.map[it as EPackage]

		val genmodel = GenModelFactory.eINSTANCE.createGenModel => [
			complianceLevel = GenJDKLevel.JDK70_LITERAL
			modelDirectory = targetModelDirectory
				.replaceFirst("platform:/resource", "").replaceFirst("..", "")
			foreignModel += ecoreUri
			modelName = mm.owningLanguage.name
			modelPluginID = mm.owningLanguage.externalRuntimeName
			initialize(pkgs)
			genPackages.forEach[gp |
				gp.basePackage = mm.owningLanguage.fullyQualifiedName.toLowerCase.toString
				if (!mm.owningLanguage.fileExtension.nullOrEmpty)
					gp.fileExtensions = mm.owningLanguage.fileExtension 
				else
					gp.fileExtensions = mm.owningLanguage.name.toLowerCase.toString
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
