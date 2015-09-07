package fr.inria.diverse.melange.builder

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Data

@Data
class BuilderError {
	String message
	EObject location
}
