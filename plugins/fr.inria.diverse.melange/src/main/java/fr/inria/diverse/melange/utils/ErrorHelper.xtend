package fr.inria.diverse.melange.utils

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.diagnostics.Severity
import org.eclipse.xtext.validation.EObjectDiagnosticImpl

class ErrorHelper
{
	static final String DEFAULT_PROBLEM_CODE = "MelangeProblemCode"
	

	/** 
	 * Add an error diagnostic (and marker) to an EObject
	 */
	def void addError(EObject eo, String message, String problemCode) {
		var String _problemCode = 
		if(problemCode == null || problemCode.equals("")) DEFAULT_PROBLEM_CODE else problemCode
		eo.eResource.errors.add(new EObjectDiagnosticImpl(
			Severity.ERROR,
			_problemCode,
			message,
			eo,
			null,
			-1,
			null
		))	
	}
	/** 
	 * Add a warning diagnostic (and marker) to an EObject
	 */
	def void addWarning(EObject eo, String message, String problemCode) {
		var String _problemCode = 
		if(problemCode == null || problemCode.equals("")) DEFAULT_PROBLEM_CODE else problemCode
		eo.eResource.errors.add(new EObjectDiagnosticImpl(
			Severity.WARNING,
			_problemCode,
			message,
			eo,
			null,
			-1,
			null
		))	
	}
}
