package fr.inria.diverse.melange.puzzle

import com.google.inject.Inject

import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.metamodel.melange.ModelType

import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EClassifier
import java.util.Hashtable
import java.util.Iterator
import org.eclipse.emf.ecore.EClass
import fr.inria.diverse.sle.puzzle.merge.impl.PuzzleMerge
import org.eclipse.emf.ecore.EcoreFactory
import java.util.List
import fr.inria.diverse.melange.metamodel.melange.Aspect
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.emf.ecore.EOperation
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.EParameter

/**
 * This class offers the services needed for  manipulating
 * required interfaces for metamodels. 
 * 
 * @author David Mendez-Acuna
 */
class CompositionInterfacesHelper {
	
	@Inject extension ModelingElementExtensions
	@Inject extension EcoreQueries
	
	/**
	 * Indicates if the metamodel needs a required interface
	 * i.e., it contains required elements (meta-classes annotated with @required)
	 * 
	 * @param metamodel
	 * 			Metamodel under study
	 * 
	 * @return requiredInterfaceNeeded
	 * 			True if the metamodel contains metaclasses annotated with @required
	 */
	def public boolean requiredInterfaceExists(Metamodel metamodel){
		for(EPackage pckg : metamodel.pkgs){
			if(pckg.containsRequiredAnnotation){
				return true
			}
		}
		return false
	}
	
	/**
	 * Indicates if the package in the parameter contains required classifiers.
	 */
	def private boolean containsRequiredAnnotation(EPackage pckg){
		for(EClassifier classifier : pckg.EClassifiers){
			if(classifier.getEAnnotation('required') != null || classifier.getEAnnotation('extension') != null)
				return true
		}
		for(EPackage _subPckg : pckg.ESubpackages){
			if(_subPckg.containsRequiredAnnotation){
				return true
			}
		}
		return false
	}
	
	/**
	 * Calculates the required interface of the metamodel and stores it
	 * in the model type in the parameter.
	 * 
	 * @param metamodel
	 * 			Metamodel whose required interface will be calculated
	 * 
	 * @param requiredInterface
	 * 			Model type that will contain the calculated required interface.
	 */
	def public void inferRequiredInterface(Metamodel metamodel, ModelType requiredInterface){
		var Hashtable<String,EClassifier> table = new Hashtable<String,EClassifier>()
		for(EPackage pckg : metamodel.pkgs){
			pckg.getRequiredClassifiersRefs(table)
		}
		
		var EPackage requiredInterfacePckg = EcoreFactory.eINSTANCE.createEPackage => [
			name = metamodel.name + 'required'
			nsPrefix = metamodel.name + 'required'
			nsURI = 'http://' + metamodel.name + 'required'
		]
		
		var Hashtable<String,EClassifier> clonedRequiredClassifiers = new Hashtable<String,EClassifier>()
		var Iterator<String> keys = table.keySet.iterator
		while(keys.hasNext()){
			var String currentKey = keys.next
			var EClassifier currentClassifier = table.get(currentKey) 
			if(currentClassifier instanceof EClass){
				var EClass clonedRequiredEClass = PuzzleMerge.getInstance.cloneEClass(EcoreFactory.eINSTANCE, currentClassifier as EClass)
				requiredInterfacePckg.EClassifiers.add(clonedRequiredEClass)
				clonedRequiredClassifiers.put(clonedRequiredEClass.name, clonedRequiredEClass)
			}
			//TODO: Complete for EEnums
		}
		PuzzleMerge.getInstance.resolveLocalEReferences(table, clonedRequiredClassifiers, requiredInterfacePckg, false)
		PuzzleMerge.getInstance.resolveLocalSuperTypes(table, clonedRequiredClassifiers, requiredInterfacePckg)
		PuzzleMerge.getInstance.resolveLocalEOperationTypes(table, clonedRequiredClassifiers, requiredInterfacePckg)
		requiredInterface.pkgs.add(requiredInterfacePckg)
	}
	
	/**
	 * Puts a reference for each required classifier in a given package.
	 * Returns the result in the hash-table in the parameter.
	 */
	def private void getRequiredClassifiersRefs(EPackage pckg, Hashtable<String, EClassifier> table){
		pckg.EClassifiers.forEach[ classifier |
			if(classifier.getEAnnotation('required') != null){
				table.put(classifier.name, classifier)
			}
		]
		pckg.ESubpackages.forEach[ _subPckg |
			_subPckg.getRequiredClassifiersRefs(table)
		]
	}
	
	/**
	 * Extracts the provided interface of a metamodel and the list of aspects.
	 */
	def public EPackage extractProvidedInterface(EPackage metamodel, List<Aspect> aspects){
		val EPackage providedInterfacePckg = EcoreFactory.eINSTANCE.createEPackage => [
			name = metamodel.name + 'provided'
			nsPrefix = metamodel.name + 'provided'
			nsURI = 'http://' + metamodel.name + 'provided'
		]
		
		var Hashtable<String, EClassifier> _oldClassifiers = new Hashtable<String, EClassifier>()
		var Hashtable<String, EClassifier> _newClassifiers = new Hashtable<String, EClassifier>()
		
		PuzzleMerge.getInstance.cloneEPackage(metamodel, providedInterfacePckg, _oldClassifiers, _newClassifiers, "", false)
		PuzzleMerge.getInstance.resolveLocalEAttributes(_oldClassifiers, _newClassifiers, providedInterfacePckg)
		PuzzleMerge.getInstance.resolveLocalEReferences(_oldClassifiers, _newClassifiers, providedInterfacePckg, true)
		PuzzleMerge.getInstance.resolveLocalEOperationTypes(_oldClassifiers, _newClassifiers, providedInterfacePckg)
//		PuzzleMerge.getInstance.resolveLocalSuperTypes(_oldClassifiers, _newClassifiers, providedInterfacePckg)
		
		aspects.forEach[ _aspect |
			if(_aspect.aspectedClass != null){
				val aspectedClass = PuzzleMerge.getInstance.searchEClassByName(_aspect.aspectedClass.name, providedInterfacePckg)
				_aspect.aspectTypeRef.type.eContents.forEach[ typeContent | 
					if(typeContent instanceof JvmOperation){
						val JvmOperation currentJvmOperation = typeContent as JvmOperation
						if((currentJvmOperation.visibility == JvmVisibility.PUBLIC || 
							currentJvmOperation.visibility == JvmVisibility.PROTECTED) && 
								PuzzleMerge.getInstance.searchEOperationByName(aspectedClass, currentJvmOperation.simpleName) == null &&
									!currentJvmOperation.simpleName.startsWith('_privk3_')){
							val EOperation currentEOperation = EcoreFactory.eINSTANCE.createEOperation => [
								name = currentJvmOperation.simpleName
								if(currentJvmOperation.returnType != null){
									val EClassifier _newOperationType = providedInterfacePckg.getETypeFromName(currentJvmOperation.returnType.simpleName)
									if(_newOperationType != null)
										EType = _newOperationType
								}
								
								currentJvmOperation.parameters.forEach[ _parameter |
									val EParameter newParameter = EcoreFactory.eINSTANCE.createEParameter => [
										name = _parameter.name
										val EClassifier newParameterType = providedInterfacePckg.getETypeFromName(_parameter.parameterType.simpleName)
										if(newParameterType != null)
											EType = newParameterType;
									]
									EParameters += newParameter
								]
								EAnnotations += EcoreFactory.eINSTANCE.createEAnnotation => [
									source = 'aspect'
								]
							]
							if(aspectedClass != null && aspectedClass.EOperations != null && currentEOperation != null)
								aspectedClass.EOperations.add(currentEOperation)
						}
					}
				]
			}
			
		]
		
		return providedInterfacePckg
	}
	
	def EClassifier getETypeFromName(EPackage ePackage, String eTypeName){
		// Native java types
//		println("eTypeName: " + eTypeName)
		if(eTypeName.equals("boolean") || eTypeName.equals("Boolean")){
			return EcorePackage.eINSTANCE.EBoolean
		}else if(eTypeName.equals("EMap") || eTypeName.contains("Hashtable")){
			return EcorePackage.eINSTANCE.EMap
		}else if(eTypeName.equals("EString") || eTypeName.equals("String")){
			return EcorePackage.eINSTANCE.EString
		}else if(eTypeName.startsWith("EList") || eTypeName.startsWith("EEList")){
			//TODO we can use a regular expression here to improve this EList<([a-z,0,9])?>
			return EcorePackage.eINSTANCE.EEList
		}
		// Non-native types
		else{
			var EClassifier _type = ePackage.searchClassByName(eTypeName)
				return _type
		}
	}
	
	/**
	 * Extracts a metamodel from an ecore file that contains the metamodel and the required interface annotated with @required
	 */
	def public EPackage extractMetamodelFromRequiredAnhanotatedEcore(EPackage ePackage, EPackage requiredInterface){
		val EPackage newPackg = EcoreFactory.eINSTANCE.createEPackage => [
			name = ePackage.name
			nsPrefix = ePackage.nsPrefix
			nsURI = ePackage.nsURI
		]
		var Hashtable<String, EClassifier> _oldClassifiers = new Hashtable<String, EClassifier>()
		ePackage.getClassifiersHashtable(_oldClassifiers)
		
		var Hashtable<String, EClassifier> _newClassifiers = new Hashtable<String, EClassifier>()
		requiredInterface.getClassifiersHashtable(_newClassifiers)
		
		PuzzleMerge.getInstance.cloneEPackage(ePackage, newPackg, new Hashtable<String, EClassifier>(), 
			_newClassifiers, "", false)
		
		PuzzleMerge.getInstance.resolveLocalEAttributes(_oldClassifiers, _newClassifiers, newPackg)
		PuzzleMerge.getInstance.resolveLocalEReferences(_oldClassifiers, _newClassifiers, newPackg, false)
		PuzzleMerge.getInstance.resolveLocalSuperTypes(_oldClassifiers, _newClassifiers, newPackg)
		PuzzleMerge.getInstance.resolveLocalEOperationTypes(_oldClassifiers, _newClassifiers, newPackg)
		PuzzleMerge.getInstance.resolveEOppositeReferences(_oldClassifiers, _newClassifiers, newPackg)
		
		return newPackg
	}
	
	def private void getClassifiersHashtable(EPackage ePackage, Hashtable<String, EClassifier> hashtable){
		ePackage.EClassifiers.forEach[ classifier |
			hashtable.put(classifier.name, classifier)
		]
		ePackage.ESubpackages.forEach[ subPackg | 
			subPackg.getClassifiersHashtable(hashtable)
		]
	}
}