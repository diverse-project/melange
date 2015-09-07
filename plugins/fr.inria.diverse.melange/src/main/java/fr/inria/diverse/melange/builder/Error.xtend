package fr.inria.diverse.melange.builder

import org.eclipse.emf.ecore.EObject

class Error{
	String message
	EObject location
	
	new(String m, EObject o){
		this.message = m
		this.location = o
	}
}