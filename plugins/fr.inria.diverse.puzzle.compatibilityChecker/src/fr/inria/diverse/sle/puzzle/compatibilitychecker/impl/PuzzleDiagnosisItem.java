package fr.inria.diverse.sle.puzzle.compatibilitychecker.impl;

import org.eclipse.emf.ecore.EObject;

public class PuzzleDiagnosisItem {

	// -----------------------------------------------------
	// Attributes
	// -----------------------------------------------------
	
	private PuzzleDiagnosisItemKind kind;
	private EObject input;
	private EObject output;

	// -----------------------------------------------------
	// Constructor
	// -----------------------------------------------------

	public PuzzleDiagnosisItem(PuzzleDiagnosisItemKind kind, EObject input, EObject output){
		this.kind = kind;
		this.input = input;
		this.output = output;
	}
	
	// -----------------------------------------------------
	// Getters and setters
	// -----------------------------------------------------

	public PuzzleDiagnosisItemKind getKind() {
		return kind;
	}

	public void setKind(PuzzleDiagnosisItemKind kind) {
		this.kind = kind;
	}

	public EObject getInput() {
		return input;
	}

	public void setInput(EObject input) {
		this.input = input;
	}

	public EObject getOutput() {
		return output;
	}

	public void setOutput(EObject output) {
		this.output = output;
	}
}
