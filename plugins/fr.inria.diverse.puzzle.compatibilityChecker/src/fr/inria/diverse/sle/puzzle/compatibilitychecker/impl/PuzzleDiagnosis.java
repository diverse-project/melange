package fr.inria.diverse.sle.puzzle.compatibilitychecker.impl;

import java.util.ArrayList;

public class PuzzleDiagnosis {

	// -----------------------------------------------------
	// Attributes
	// -----------------------------------------------------

	private ArrayList<PuzzleDiagnosisItem> items;
	
	// -----------------------------------------------------
	// Constructor
	// -----------------------------------------------------
	
	public PuzzleDiagnosis(){
		this.items = new ArrayList<PuzzleDiagnosisItem>();
	}

	// -----------------------------------------------------
	// Methods
	// -----------------------------------------------------
	
	public ArrayList<PuzzleDiagnosisItem> getItems() {
		return items;
	}
	
	public void addItem(PuzzleDiagnosisItem item){
		items.add(item);
	}
	
	public String toString(){
		String _toString = "";
		for (PuzzleDiagnosisItem puzzleDiagnosisItem : items) {
			_toString += puzzleDiagnosisItem.getKind() + ": " +
					puzzleDiagnosisItem.getInput() + ", " + puzzleDiagnosisItem.getOutput() + "\n";
		}
		return _toString;
	}
	
}