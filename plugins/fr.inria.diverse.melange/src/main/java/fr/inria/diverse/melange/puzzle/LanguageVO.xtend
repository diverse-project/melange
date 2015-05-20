package fr.inria.diverse.melange.puzzle

import java.util.List
import org.eclipse.emf.ecore.EPackage
import fr.inria.diverse.melange.metamodel.melange.Aspect

class LanguageVO {
	
	public String name
	public String mergedPackage
	public String metamodelSerializationPath
	public List<Aspect> aspects = newArrayList
	public EPackage metamodel
	public EPackage providedInterface
	public EPackage requiredInterface
	public List<String> oldNamespaces = newArrayList
	
	def setMetamodel(org.eclipse.emf.ecore.EPackage ePackage) {
		metamodel = ePackage
	}
	
	def setProvidedInterface(org.eclipse.emf.ecore.EPackage ePackage) {
		providedInterface = ePackage
	}
	
	def setRequiredInterface(org.eclipse.emf.ecore.EPackage ePackage) {
		requiredInterface = ePackage
	}
}