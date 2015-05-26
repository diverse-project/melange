package fr.inria.diverse.sle.puzzle.ui.popup.actions.impl;

import fr.inria.diverse.sle.puzzle.compatibilitychecker.impl.PuzzleDiagnosis;

public class IncompatibleLanguagesException extends Exception{
	
	private static final long serialVersionUID = 8007984679913389580L;
	
	private PuzzleDiagnosis diagnosis;
	
	public IncompatibleLanguagesException(PuzzleDiagnosis diagnosis){
		super();
		
		this.diagnosis = diagnosis;
	}

	public PuzzleDiagnosis getDiagnosis() {
		return diagnosis;
	}
}