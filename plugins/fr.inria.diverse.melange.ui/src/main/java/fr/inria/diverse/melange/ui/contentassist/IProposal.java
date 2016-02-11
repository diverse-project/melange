package fr.inria.diverse.melange.ui.contentassist;

public interface IProposal {
	
	/**
	 * Text diplayed in the proposal list
	 */
	public String getDisplayText();
	
	
	/**
	 * Text inserted in the document
	 */
	public String getReplacementText();
	
}
