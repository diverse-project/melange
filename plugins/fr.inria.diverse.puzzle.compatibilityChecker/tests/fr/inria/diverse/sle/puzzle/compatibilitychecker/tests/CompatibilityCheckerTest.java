package fr.inria.diverse.sle.puzzle.compatibilitychecker.tests;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.mapping.MappingRoot;
import org.junit.Test;

import fr.inria.diverse.k3.sle.common.utils.ModelUtils;
import fr.inria.diverse.sle.puzzle.compatibilitychecker.impl.CompatibilityChecker;
import fr.inria.diverse.sle.puzzle.compatibilitychecker.impl.PuzzleDiagnosis;


public class CompatibilityCheckerTest {

	@Test
	public void testCheckCompatibility(){
		EPackage providedInterface = ModelUtils.loadEcoreFile("../fr.inria.diverse.examples.fsm.core/models/fsmcore-Required.ecore");
		EPackage requiredInterface = ModelUtils.loadEcoreFile("../org.emftext.language.java/models/Java-Provided.ecore");
		
		System.out.println("running tests");
		System.out.println(providedInterface.eContents());
		System.out.println(requiredInterface.eContents());
		
		MappingRoot binding = (MappingRoot) ModelUtils.loadEcore2EcoreFile(
				"../fr.inria.diverse.examples.fsm.core/bindings/fsmcore-java.ecore2ecore",
					requiredInterface, providedInterface);
		
		PuzzleDiagnosis diagnosis = CompatibilityChecker.getInstance().checkCompatibility(providedInterface, requiredInterface, binding);
		
		if(diagnosis != null){
			System.out.println(diagnosis);
		}else{
			System.out.println("The interfaces are compatible");
		}
	}
}
