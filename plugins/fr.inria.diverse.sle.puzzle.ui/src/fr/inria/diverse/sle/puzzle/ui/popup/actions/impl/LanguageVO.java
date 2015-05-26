package fr.inria.diverse.sle.puzzle.ui.popup.actions.impl;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtend.core.xtend.XtendFile;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.resource.XtextResource;

@SuppressWarnings("restriction")
public class LanguageVO {

	private EPackage metamodel;
	
	private EPackage providedInterface;
	
	private EPackage requiredInterface;
	
	private ArrayList<JvmTypeReference> aspects;
	
	public LanguageVO(){
		aspects = new ArrayList<JvmTypeReference>();
	}

	public EPackage getMetamodel() {
		return metamodel;
	}

	public void setMetamodel(EPackage metamodel) {
		this.metamodel = metamodel;
	}

	public EPackage getProvidedInterface() {
		return providedInterface;
	}

	public void setProvidedInterface(EPackage providedInterface) {
		this.providedInterface = providedInterface;
	}

	public EPackage getRequiredInterface() {
		return requiredInterface;
	}

	public void setRequiredInterface(EPackage requiredInterface) {
		this.requiredInterface = requiredInterface;
	}

	public ArrayList<JvmTypeReference> getAspects() {
		return aspects;
	}
}
