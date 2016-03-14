package fr.inria.diverse.melange.builder

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Data

/**
 * A dummy data object containing representing an error during the build.
 */
@Data
class BuilderError {
	/**
	 * The error message
	 */
	String message
	/**
	 * The {@link EObject} to which the message is associated
	 */
	EObject location
}
