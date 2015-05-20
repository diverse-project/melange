package fr.inria.diverse.sle.puzzle.merge.tests;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.mapping.MappingRoot;
import org.junit.Test;

import fr.inria.diverse.k3.sle.common.utils.ModelUtils;
import fr.inria.diverse.sle.puzzle.merge.impl.PuzzleMerge;

public class PuzzleMergeTest {

	@Test
	public void testMerge() throws URISyntaxException, IOException {

		EPackage providedInterface = ModelUtils
				.loadEcoreFile("data-test/Java-Provided.ecore");
		
		EPackage requiredInterface = ModelUtils
				.loadEcoreFile("data-test/fsmcore-Required.ecore");

		EPackage extensionLanguage = ModelUtils
				.loadEcoreFile("data-test/fsmcore.ecore");
		EPackage baseLanguage = ModelUtils
				.loadEcoreFile("data-test/Java.ecore");

		MappingRoot binding = (MappingRoot) ModelUtils
				.loadEcore2EcoreFile("data-test/fsmcore-java.ecore2ecore",
						requiredInterface, providedInterface);

		EPackage newRequiredInterface = PuzzleMerge.getInstance().recalculateRequiredInterface(requiredInterface, 
				binding, "CompleteFSM", null);
		
		File newRequiredInterfaceFile = new File("data-test/fsmcore-java-required.ecore");
		ModelUtils.saveEcoreFile(
				newRequiredInterfaceFile.getAbsolutePath(), newRequiredInterface);
		
//		EPackage mergedLanguage = PuzzleMerge.getInstance()
//				.mergeAbstractSyntax(baseLanguage, providedInterface,
//						extensionLanguage, requiredInterface, binding, newRequiredInterface, "CompleteFSM");
//		
//		File mergedLanguageFile = new File("data-test/fsmcore-java.ecore");;
//		ModelUtils.saveEcoreFile(
//				mergedLanguageFile.getAbsolutePath(), mergedLanguage);
	}
}
