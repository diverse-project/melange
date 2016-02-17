package fr.inria.diverse.melange.ui.contentassist;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;

public interface IProposal {
	
	/**
	 * Text diplayed in the proposal list
	 */
	public String getDisplayText();
	
	
	/**
	 * Text inserted in the document
	 */
	public String getReplacementText();
	
	/**
	 * Add dependencies to make valid this proposal 
	 */
	public void configureProject(IProject project);
	
	public void configureProposal(EObject context);
}
