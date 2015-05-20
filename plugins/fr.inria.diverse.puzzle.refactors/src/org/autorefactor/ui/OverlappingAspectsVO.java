package org.autorefactor.ui;

import java.util.ArrayList;

import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.xtend.core.xtend.XtendFunction;

import fr.inria.diverse.melange.metamodel.melange.Aspect;

@SuppressWarnings("restriction")
public class OverlappingAspectsVO {

	public Aspect rightAspect;
	public String rightAspectClassName;
	public ArrayList<XtendFunction> rightAspectOperations;
	public String rightFile;
	
	public Aspect leftAspect;
	public String leftAspectClassName;
	public ArrayList<XtendFunction> leftAspectOperations;
	public String leftFile;
	
	public String mergedFile;
	
	public IJavaElement extensionElement;
	public IJavaElement baseElement; 
	public IJavaElement mergedElement;
	
	public OverlappingAspectsVO(Aspect rightAspect, String rightAspectClassName, Aspect leftAspect, String leftAspectClassName){
		this.rightAspect = rightAspect;
		this.rightAspectClassName = rightAspectClassName;
		this.leftAspect = leftAspect;
		this.leftAspectClassName = leftAspectClassName;
		rightAspectOperations = new ArrayList<XtendFunction>();
		leftAspectOperations = new ArrayList<XtendFunction>();
	}
	
	public String toString(){
		return "RIGHT: " + this.rightAspect.getAspectTypeRef().getIdentifier() + " rightFile: " + rightFile + " BASE_ELEMENT: " + baseElement +
			" - LEFT: " + this.leftAspect.getAspectTypeRef().getIdentifier() + " leftFile: " + leftFile + " EXTENSION_ELEMENT: " +  extensionElement + 
			" - MERGED: " + mergedFile + " MERGED_ELEMENT: " +  mergedElement;
	}
	
	public boolean equals(Object comparison){
		OverlappingAspectsVO comparisonObject = (OverlappingAspectsVO) comparison;
		return this.leftFile.equals(comparisonObject.leftFile); 
	}
}
