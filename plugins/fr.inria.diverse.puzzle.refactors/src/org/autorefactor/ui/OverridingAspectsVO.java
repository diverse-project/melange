package org.autorefactor.ui;

import java.util.ArrayList;

import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.xtend.core.xtend.XtendFunction;

import fr.inria.diverse.melange.metamodel.melange.Aspect;

/**
 * Value Object containing the information of an aspect overriding pattern
 * @author David Mendez-Acuna
 */
public class OverridingAspectsVO {

	public Aspect baseAspect;
	public String baseAspectClassName;
	public ArrayList<XtendFunction> baseAspectOperations;
	public String baseFile;
	
	public Aspect leftAspect;
	public String leftAspectClassName;
	public ArrayList<XtendFunction> leftAspectOperations;
	public String leftFile;
	
	public String mergedFile;
	
	public IJavaElement extensionElement;
	public IJavaElement baseElement; 
	public IJavaElement mergedElement;
	
	public OverridingAspectsVO(Aspect rightAspect, String rightAspectClassName, Aspect leftAspect, String leftAspectClassName){
		this.baseAspect = rightAspect;
		this.baseAspectClassName = rightAspectClassName;
		this.leftAspect = leftAspect;
		this.leftAspectClassName = leftAspectClassName;
		baseAspectOperations = new ArrayList<XtendFunction>();
		leftAspectOperations = new ArrayList<XtendFunction>();
	}
	
	public String toString(){
		return "RIGHT: " + this.baseAspect.getAspectTypeRef().getIdentifier() + " rightFile: " + baseFile + " BASE_ELEMENT: " + baseElement +
			" - LEFT: " + this.leftAspect.getAspectTypeRef().getIdentifier() + " leftFile: " + leftFile + " EXTENSION_ELEMENT: " +  extensionElement + 
			" - MERGED: " + mergedFile + " MERGED_ELEMENT: " +  mergedElement;
	}
	
	public boolean equals(Object comparison){
		OverridingAspectsVO comparisonObject = (OverridingAspectsVO) comparison;
		return this.leftFile.equals(comparisonObject.leftFile); 
	}
}
