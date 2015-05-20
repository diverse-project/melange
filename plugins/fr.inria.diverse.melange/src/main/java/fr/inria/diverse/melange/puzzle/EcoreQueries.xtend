package fr.inria.diverse.melange.puzzle

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import java.util.List
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EClassifier
import java.util.ArrayList
import org.eclipse.emf.ecore.EObject

/**
 * Some queries on Ecore models.
 * 
 * @author David Mendez-Acuna
 */
class EcoreQueries {
	
	def EClassifier searchClassByName(EPackage ePackage, String className) {
		for(EClassifier _eClassifier : ePackage.EClassifiers){
			if(_eClassifier.name.equals(className)){
				return _eClassifier
			}
		}
		for(EPackage _subPackage : ePackage.ESubpackages){
			var EClassifier result = searchClassByName(_subPackage, className)
			if(result != null) return result
		}
		return null
	}
	
	def String getQualifiedName(EObject _eObject) {
		if(_eObject == null){
			return ""
		}
		else if(_eObject instanceof EPackage){
			var String answer = getQualifiedName((_eObject as EPackage).ESuperPackage)
			if(!answer.equals("")){
				answer = answer + "."
			}
			answer = answer + (_eObject as EPackage).name
			return answer
		}
		else{
			var String answer = getQualifiedName((_eObject as EClassifier).EPackage) + 
				"." + (_eObject as EClassifier).name
			return answer
		}
	}
	
	/**
	 * Fills the parameter 'incomingReference' with the collection of EReferences whose type corresponds to the 
	 * parameter 'targetClass'.
	 */
	def void getIncomingReferences(EClass targetClass, EPackage ePackage, List<EReference> incomingReferences) {
		for(EClassifier _eClassifier : ePackage.EClassifiers){
			if(_eClassifier instanceof EClass){
				var EClass _eClass = _eClassifier as EClass
				for(EReference _eReference : _eClass.EReferences){
					if(_eReference.EType.name.equals(targetClass.name)){
						incomingReferences.add(_eReference)
					}
				}
			}			
		}
		for(EPackage _eSubpackage : ePackage.ESubpackages){
			getIncomingReferences(targetClass, _eSubpackage, incomingReferences)
		}
	}
	
	/**
	 * Fills the parameter 'referringEClasses' with the classes that contain some references to the class 'targetClass'
	 */
	def void getReferringClasses(EClass _targetClass, EPackage ePackage, ArrayList<EClass> referringEClasses) {
		for(EClassifier _eClassifier : ePackage.EClassifiers){
			if(_eClassifier instanceof EClass){
				if(containsReferencesTo((_eClassifier as EClass), _targetClass)){
					referringEClasses.add((_eClassifier as EClass))
				}
			}			
		}
		for(EPackage _eSubPackage : ePackage.ESubpackages){
			getReferringClasses(_targetClass, _eSubPackage, referringEClasses)
		}
	}
	
	def boolean containsReferencesTo(EClass _studiedClass, EClass _targetClass) {
		for(EReference _eReference : _studiedClass.EReferences){
			if(_eReference.EType.name.equals(_targetClass.name)){
				return true
			}
		}return false
	}
}