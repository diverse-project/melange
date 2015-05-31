package fr.inria.diverse.sle.puzzle.merge.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

public class ClassPair {

	private EClassifier leftClass;
	private EClassifier rightClass;
	
	public ClassPair(EClassifier leftClass, EClassifier rightClass){
		this.leftClass = leftClass;
		this.rightClass = rightClass;
	}
	
	public EClassifier getLeftClass() {
		return leftClass;
	}
	public void setLeftClass(EClassifier leftClass) {
		this.leftClass = leftClass;
	}
	public EClassifier getRightClass() {
		return rightClass;
	}
	public void setRightClass(EClassifier rightClass) {
		this.rightClass = rightClass;
	}
	
	
}
