package fr.inria.diverse.sle.puzzle.merge.impl;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.mapping.Mapping;
import org.eclipse.emf.mapping.MappingFactory;
import org.eclipse.emf.mapping.MappingRoot;
import org.eclipse.emf.mapping.ecore2ecore.Ecore2EcoreFactory;
import org.eclipse.xtext.common.types.JvmTypeReference;

import java.util.List;

/**
 * Service of merging for languages DiverSE Team - INRIA/IRISA Rennes.
 * 
 * @author David Mendez-Acuna
 */
public class PuzzleMerge {

	// -----------------------------------------------------
	// Attributes
	// -----------------------------------------------------

	private static PuzzleMerge instance;
	
	// -----------------------------------------------------
	// Constructor and Singleton
	// -----------------------------------------------------

	private PuzzleMerge() {
		
	}

	public static PuzzleMerge getInstance() {
		if (instance == null)
			instance = new PuzzleMerge();
		return instance;
	}

	// -----------------------------------------------------
	// Methods
	// -----------------------------------------------------

	public EPackage mergeAbstractSyntax(EPackage baseLanguage,
			EPackage providedInterface, EPackage extensionLanguage,
			EPackage requiredInterface, MappingRoot binding, 
			EPackage recalculatedRequiredInterface, String languageName) {
		
		Hashtable<String, EClassifier> oldEClassifiers = new Hashtable<String, EClassifier>();
		Hashtable<String, EClassifier> unifiedEClassifiers = new Hashtable<String, EClassifier>();
		
		// 1. Initialize the merged metamodel with a copy of the base language.
		EPackage clone = EcoreFactory.eINSTANCE.createEPackage();
		clone.setName(baseLanguage.getName());
		clone.setNsPrefix(baseLanguage.getNsPrefix());
		clone.setNsURI(baseLanguage.getNsURI());
		
		cloneEPackage(baseLanguage, clone, oldEClassifiers, unifiedEClassifiers, "http://" + languageName, false);
		resolveLocalEAttributes(oldEClassifiers, unifiedEClassifiers, clone);
		resolveLocalEReferences(oldEClassifiers, unifiedEClassifiers, clone, false);
		resolveLocalEOperationTypes(oldEClassifiers, unifiedEClassifiers, clone);
		resolveLocalSuperTypes(oldEClassifiers, unifiedEClassifiers, clone);
		
		clone.setName(languageName);
		clone.setNsPrefix(languageName);
		clone.setNsURI("http://" + languageName);
		
		// 2. Copy the extension language to the merged metamodel
		for (EClassifier eClassifier : extensionLanguage.getEClassifiers()) {
			if(eClassifier.getEAnnotation("required") == null && eClassifier.getEAnnotation("extension") == null){
				if(eClassifier instanceof EClass){
					if(unifiedEClassifiers.get(((EClass)eClassifier).getName()) == null){
						oldEClassifiers.put(((EClass)eClassifier).getName(), (EClass)eClassifier);
						EClass newEClass = cloneEClass(EcoreFactory.eINSTANCE, (EClass)eClassifier);
						clone.getEClassifiers().add(newEClass);
						unifiedEClassifiers.put(newEClass.getName(), newEClass);
					}
				}
				else if(eClassifier instanceof EEnum){
					oldEClassifiers.put(((EEnum)eClassifier).getName(), (EEnum)eClassifier);
					EEnum newEEnum = cloneEEnum(EcoreFactory.eINSTANCE, (EEnum)eClassifier);
					clone.getEClassifiers().add(newEEnum);
					unifiedEClassifiers.put(newEEnum.getName(), newEEnum);
				}
			}
			else if(eClassifier.getEAnnotation("required") == null && eClassifier.getEAnnotation("extension") != null){
				if(eClassifier instanceof EClass){
					if(unifiedEClassifiers.get(eClassifier.getName()) != null){
						oldEClassifiers.put(eClassifier.getName() + "-extension", (EClass)eClassifier);
						EClass extendedClass = extendEClass((EClass)unifiedEClassifiers.get(eClassifier.getName()), (EClass)eClassifier);
						unifiedEClassifiers.put(extendedClass.getName(), extendedClass);
					}
					
				}
				else if(eClassifier instanceof EEnum){
					if(unifiedEClassifiers.get(eClassifier.getName()) != null){
						oldEClassifiers.put(eClassifier.getName() + "-extension", (EEnum)eClassifier);
						EEnum extendedEEnum = extendEEnum((EEnum)unifiedEClassifiers.get(eClassifier.getName()), (EEnum)eClassifier);
						unifiedEClassifiers.put(extendedEEnum.getName(), extendedEEnum);
					}
				}
			}
		}
		
		for (EPackage _ePackage : extensionLanguage.getESubpackages()) {
			addEPackageClasses(_ePackage, clone, oldEClassifiers, unifiedEClassifiers);
		}
		
		if(recalculatedRequiredInterface != null){
			resolveCrossCuttingEReferences(oldEClassifiers, unifiedEClassifiers, baseLanguage, binding, recalculatedRequiredInterface);
			resolveCrossCuttingESuperTypes(oldEClassifiers, unifiedEClassifiers, baseLanguage, binding, recalculatedRequiredInterface);
		}
		resolveLocalEAttributes(oldEClassifiers, unifiedEClassifiers, clone);
		resolveEOppositeReferences(oldEClassifiers, unifiedEClassifiers, clone);
		resolveLocalEOperationTypes(oldEClassifiers, unifiedEClassifiers, clone);
		
		return clone;
	}

	private EClass extendEClass(EClass baseEClass,
			EClass extensionEClass) {
		
		for(EStructuralFeature _eStructuralFeature : extensionEClass.getEStructuralFeatures()){
			if(_eStructuralFeature.getEAnnotation("addition") != null){
				if(_eStructuralFeature instanceof EAttribute){
					EAttribute eAttribute = (EAttribute) _eStructuralFeature;
					EAttribute newAttribute = EcoreFactory.eINSTANCE.createEAttribute();
					newAttribute.setName(eAttribute.getName());
					if(!(eAttribute.getEType() instanceof EEnum)) newAttribute.setEType(eAttribute.getEType());
					baseEClass.getEStructuralFeatures().add(newAttribute);
					
					for(EAnnotation annotation : eAttribute.getEAnnotations()){
						EAnnotation newEAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
						newEAnnotation.setSource(annotation.getSource());
						newAttribute.getEAnnotations().add(newEAnnotation);
					}
				}
				else if(_eStructuralFeature instanceof EReference){
					EReference eReference = (EReference)_eStructuralFeature;
					EReference newEReference = EcoreFactory.eINSTANCE.createEReference();
					newEReference.setName(eReference.getName());
					newEReference.setLowerBound(eReference.getLowerBound());
					newEReference.setUpperBound(eReference.getUpperBound());
					newEReference.setContainment(eReference.isContainment());
					newEReference.setChangeable(eReference.isChangeable());
					newEReference.setDerived(eReference.isDerived());
					baseEClass.getEStructuralFeatures().add(newEReference);
					
					for(EAnnotation eAnnotation : eReference.getEAnnotations()){
						EAnnotation newEAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
						newEAnnotation.setSource(eAnnotation.getSource());
						newEReference.getEAnnotations().add(newEAnnotation);
					}
				}
			}
		}
		
		return baseEClass;
	}
	
	private EEnum extendEEnum(EEnum baseEEnum, EEnum extensionEEnum) {
		for(EEnumLiteral _extensionLiteral : extensionEEnum.getELiterals()){
			if(_extensionLiteral.getEAnnotation("addition") != null){
				EEnumLiteral _newEEnumLiteral = EcoreFactory.eINSTANCE.createEEnumLiteral();
				_newEEnumLiteral.setName(_extensionLiteral.getName());
				_newEEnumLiteral.setLiteral(_extensionLiteral.getLiteral());
				_newEEnumLiteral.setValue(_extensionLiteral.getValue());
				_newEEnumLiteral.setInstance(_extensionLiteral.getInstance());
				
				baseEEnum.getELiterals().add(_newEEnumLiteral);
			}
		}
		return baseEEnum;
	}

	/**
	 * Recalculates a required interface of the extension language by substracting the elements provided by the current base language. 
	 * @param _extensionLanguageRequiredInterface
	 * @param binding
	 * @return
	 */
	public EPackage recalculateRequiredInterface(EPackage _extensionLanguageRequiredInterface, MappingRoot binding, 
			String languageName, EPackage _baseLanguageRequiredInterface){
		
		Hashtable<String, EClassifier> _oldClassifiers = new Hashtable<String, EClassifier>();
		Hashtable<String, EClassifier> _newClassifiers = new Hashtable<String, EClassifier>();
		
		// 1. Initialize the new required interface as a clone of the old one.
		EPackage clone = EcoreFactory.eINSTANCE.createEPackage();
		clone.setName(languageName + "required");
		clone.setNsPrefix(languageName + "required");
		clone.setNsURI("http://" + languageName + "required");
		
		cloneEPackage(_extensionLanguageRequiredInterface, clone, _oldClassifiers, _newClassifiers, "http://" + languageName, true);
		resolveLocalEAttributes(_oldClassifiers, _newClassifiers, clone);
		resolveLocalEReferences(_oldClassifiers, _newClassifiers, clone, false);
		resolveLocalEOperationTypes(_oldClassifiers, _newClassifiers, clone);
		resolveLocalSuperTypes(_oldClassifiers, _newClassifiers, clone);
		resolveEOppositeReferences(_oldClassifiers, _newClassifiers, clone);
		
		if(binding != null){
			// 2. Remove the elements (attributes, references, and operations) of the required interface that are mapped in the binding
			TreeIterator<Mapping> it = binding.treeIterator();
			while (it.hasNext()) {
				Mapping _mapping = (Mapping) it.next();
				
				EObject _input = _mapping.getInputs().get(0);
				EObject _output = _mapping.getOutputs().get(0);

				if ((_input instanceof EAttribute) && (_output instanceof EAttribute)) {
					EClass _ownerClass = searchEClassByName(((EClass)_input.eContainer()).getName(), clone);
					if(_ownerClass != null){
						EStructuralFeature _toDelete = searchStructuralFeatureByName(_ownerClass, ((EAttribute)_input).getName());
						_ownerClass.getEStructuralFeatures().remove(_toDelete);
					}
				}
				else if ((_input instanceof EReference) && (_output instanceof EReference)) {
					EClass _ownerClass = searchEClassByName(((EClass)_input.eContainer()).getName(), clone);
					if(_ownerClass != null){
						EStructuralFeature _toDelete = searchStructuralFeatureByName(_ownerClass, ((EReference)_input).getName());
						_ownerClass.getEStructuralFeatures().remove(_toDelete);
					}
				}
				else if ((_input instanceof EOperation) && (_output instanceof EOperation)) {
					EClass _ownerClass = searchEClassByName(((EClass)_input.eContainer()).getName(), clone);
					if(_ownerClass != null){
						EOperation _toDelete1 = searchEOperationByName(_ownerClass, ((EOperation)_input).getName());
						_ownerClass.getEOperations().remove(_toDelete1);
						EOperation _toDelete2 = searchEOperationByName(_ownerClass, "_original_" + ((EOperation)_input).getName());
						if(_toDelete2 != null)
							_ownerClass.getEOperations().remove(_toDelete2);
					}
				}
			}
			
			// 3. Remove the classes of the required interface that are mapped in the binding and whose requirements have been fully satisfied.
			it = binding.treeIterator();
			while (it.hasNext()) {
				Mapping _mapping = (Mapping) it.next();
				
				EObject _input = _mapping.getInputs().get(0);
				EObject _output = _mapping.getOutputs().get(0);

				if ((_input instanceof EClass) && (_output instanceof EClass)) {
					EClass _class = searchEClassByName(((EClass)_input).getName(), clone);
					if(_class != null){
						if((_class.getEStructuralFeatures().size() == 0 || this.allStructuralFeaturesAreAdditions(_class)) && _class.getEOperations().size() == 0){
							clone.getEClassifiers().remove(_class);
						}
					}
				}
			}
			
			// 4. All the elements of the legacy required interface should be added to the new one.
			if(_baseLanguageRequiredInterface != null){
				Hashtable<String, EClassifier> _oldLegacyClassifiers = new Hashtable<String, EClassifier>();
				Hashtable<String, EClassifier> _newLegacyClassifiers = new Hashtable<String, EClassifier>();
				
				cloneEPackage(_baseLanguageRequiredInterface, clone, _oldLegacyClassifiers, 
						_newLegacyClassifiers, "http://" + languageName, true);

				resolveLocalEAttributes(_oldLegacyClassifiers, _newLegacyClassifiers, clone);
				resolveLocalEReferences(_oldLegacyClassifiers, _newLegacyClassifiers, clone, false);
				resolveLocalEOperationTypes(_oldLegacyClassifiers, _newLegacyClassifiers, clone);
				resolveLocalSuperTypes(_oldLegacyClassifiers, _newLegacyClassifiers, clone);
				resolveEOppositeReferences(_oldLegacyClassifiers, _newLegacyClassifiers, clone);
			}
		}
		return clone;
	}
	
	private boolean allStructuralFeaturesAreAdditions(EClass eClass){
		for (EStructuralFeature _eStructuralFeature : eClass.getEStructuralFeatures()) {
			if(_eStructuralFeature.getEAnnotation("addition") == null)
				return false;
		}
		return true;
	}
	
	/**
	 * Recalculates the provided interface for a composition by merging the provided interfaces of the two languages involved.
	 * 
	 * <Pre> There are not two classes with the same name in the interfaces.
	 * 
	 * @param baseLanguageProvidedInterface
	 * 			Provided interface of the base language. It can be null if the base language does not offer any provided interface. 
	 * @param extensionLanguageProvidedInterface
	 * 			Provided interface of the extension language. It can be null if the base language does not offer any provided interface. 
	 * @return recalculatedProvidedInterface
	 * 			Recalculated provided interface as the merge of the two interfaces in the parameters.
	 */
	public EPackage recalculateProvidedInterface(EPackage extensionLanguageProvidedInterface, EPackage baseLanguageProvidedInterface){
		if(extensionLanguageProvidedInterface != null && baseLanguageProvidedInterface != null){
			EPackage recalculatedProvidedInterface = EcoreFactory.eINSTANCE.createEPackage();
			recalculatedProvidedInterface.setName(extensionLanguageProvidedInterface.getName() + 
					baseLanguageProvidedInterface.getName());
			recalculatedProvidedInterface.setNsPrefix(extensionLanguageProvidedInterface.getNsPrefix() + 
					extensionLanguageProvidedInterface.getNsPrefix());
			recalculatedProvidedInterface.setNsURI("http://" + extensionLanguageProvidedInterface.getNsURI().
					replace("http://", "") + "/" + baseLanguageProvidedInterface.getNsURI().replace("http://", ""));
			
			Hashtable<String, EClassifier> _oldClassifiers = new Hashtable<String, EClassifier>();
			Hashtable<String, EClassifier> _newClassifiers = new Hashtable<String, EClassifier>();
			
			cloneEPackage(baseLanguageProvidedInterface, recalculatedProvidedInterface, _oldClassifiers, 
					_newClassifiers, recalculatedProvidedInterface.getNsPrefix(), false);
			resolveLocalEAttributes(_oldClassifiers, _newClassifiers, recalculatedProvidedInterface);
			resolveLocalEReferences(_oldClassifiers, _newClassifiers, recalculatedProvidedInterface, true);
			resolveLocalSuperTypes(_oldClassifiers, _newClassifiers, recalculatedProvidedInterface);
			resolveLocalEOperationTypes(_oldClassifiers, _newClassifiers, recalculatedProvidedInterface);
			resolveEOppositeReferences(_oldClassifiers, _oldClassifiers, recalculatedProvidedInterface);
			
			sumEPackage(recalculatedProvidedInterface, extensionLanguageProvidedInterface, _oldClassifiers,
					_newClassifiers, recalculatedProvidedInterface.getNsPrefix(), false);
			resolveLocalEAttributes(_oldClassifiers, _newClassifiers, recalculatedProvidedInterface);
			resolveLocalEReferences(_oldClassifiers, _newClassifiers, recalculatedProvidedInterface, true);
			resolveLocalSuperTypes(_oldClassifiers, _newClassifiers, recalculatedProvidedInterface);
			resolveLocalEOperationTypes(_oldClassifiers, _newClassifiers, recalculatedProvidedInterface);
			resolveEOppositeReferences(_oldClassifiers, _oldClassifiers, recalculatedProvidedInterface);
			
			
			return recalculatedProvidedInterface;
		}
		else if(extensionLanguageProvidedInterface == null && baseLanguageProvidedInterface != null){
			EPackage recalculatedProvidedInterface = EcoreFactory.eINSTANCE.createEPackage();
			recalculatedProvidedInterface.setName(baseLanguageProvidedInterface.getName());
			recalculatedProvidedInterface.setNsPrefix(baseLanguageProvidedInterface.getNsPrefix());
			recalculatedProvidedInterface.setNsURI(baseLanguageProvidedInterface.getNsURI());
			
			Hashtable<String, EClassifier> _oldClassifiers = new Hashtable<String, EClassifier>();
			Hashtable<String, EClassifier> _newClassifiers = new Hashtable<String, EClassifier>();
			
			cloneEPackage(baseLanguageProvidedInterface, recalculatedProvidedInterface, _oldClassifiers, 
					_newClassifiers, recalculatedProvidedInterface.getNsPrefix(), true);
			
			resolveLocalEAttributes(_oldClassifiers, _newClassifiers, recalculatedProvidedInterface);
			resolveLocalEReferences(_oldClassifiers, _newClassifiers, recalculatedProvidedInterface, true);
			resolveLocalSuperTypes(_oldClassifiers, _newClassifiers, recalculatedProvidedInterface);
			resolveLocalEOperationTypes(_oldClassifiers, _newClassifiers, recalculatedProvidedInterface);
			resolveEOppositeReferences(_oldClassifiers, _oldClassifiers, recalculatedProvidedInterface);
			
			return recalculatedProvidedInterface;
		}
		else if(extensionLanguageProvidedInterface != null && baseLanguageProvidedInterface == null){
			EPackage recalculatedProvidedInterface = EcoreFactory.eINSTANCE.createEPackage();
			recalculatedProvidedInterface.setName(extensionLanguageProvidedInterface.getName());
			recalculatedProvidedInterface.setNsPrefix(extensionLanguageProvidedInterface.getNsPrefix());
			recalculatedProvidedInterface.setNsURI(extensionLanguageProvidedInterface.getNsURI());
			
			Hashtable<String, EClassifier> _oldClassifiers = new Hashtable<String, EClassifier>();
			Hashtable<String, EClassifier> _newClassifiers = new Hashtable<String, EClassifier>();
			
			cloneEPackage(extensionLanguageProvidedInterface, recalculatedProvidedInterface, _oldClassifiers, 
					_newClassifiers, recalculatedProvidedInterface.getNsPrefix(), true);
			
			resolveLocalEAttributes(_oldClassifiers, _newClassifiers, recalculatedProvidedInterface);
			resolveLocalEReferences(_oldClassifiers, _newClassifiers, recalculatedProvidedInterface, true);
			resolveLocalSuperTypes(_oldClassifiers, _newClassifiers, recalculatedProvidedInterface);
			resolveLocalEOperationTypes(_oldClassifiers, _newClassifiers, recalculatedProvidedInterface);
			resolveEOppositeReferences(_oldClassifiers, _oldClassifiers, recalculatedProvidedInterface);
			
			return recalculatedProvidedInterface;
		}
		else{
			return null;
		}
	}
	
	private void sumEPackage(EPackage baseEPackage,
			EPackage sumEPackage,
			Hashtable<String, EClassifier> _oldClassifiers,
			Hashtable<String, EClassifier> _newClassifiers, String nsPrefix,
			boolean b) {
		
		ArrayList<ClassPair> classesToAdd = new ArrayList<ClassPair>();
		ArrayList<ClassPair> classesToMerge = new ArrayList<ClassPair>();
		ArrayList<ClassPair> enumsToAdd = new ArrayList<ClassPair>();
		for (EClassifier eClassifier : sumEPackage.getEClassifiers()) {
			if(eClassifier instanceof EClass){
				EClass legacyEClass = searchEClassByName(eClassifier.getName(), baseEPackage);
				if(legacyEClass == null){
					classesToAdd.add(new ClassPair(((EClass)eClassifier), null));
				}
				else{
					classesToMerge.add(new ClassPair(legacyEClass, (EClass)eClassifier));
				}
			}
			else if(eClassifier instanceof EEnum){
				enumsToAdd.add(new ClassPair((EEnum)eClassifier, null));
			}
		}
		
		for(ClassPair pair : classesToAdd){
			_oldClassifiers.put(pair.getLeftClass().getName(), pair.getLeftClass());
			EClass newEClass = cloneEClass(EcoreFactory.eINSTANCE, (EClass)pair.getLeftClass());
			sumEPackage.getEClassifiers().add(newEClass);
			_newClassifiers.put(newEClass.getName(), newEClass);
		}
		
		for(ClassPair pair : classesToMerge){
			sumEClass((EClass)pair.getLeftClass(), (EClass)pair.getRightClass(), _oldClassifiers, _newClassifiers);
			_oldClassifiers.put(pair.getLeftClass().getName(), (EClass)pair.getLeftClass());
			EClass newEClass = cloneEClass(EcoreFactory.eINSTANCE, (EClass)pair.getLeftClass());
			sumEPackage.getEClassifiers().add(newEClass);
			_newClassifiers.put(newEClass.getName(), newEClass);
		}
		
		for(ClassPair pair : enumsToAdd){
			EEnum _oldEEnum = (EEnum)pair.getLeftClass();
			_oldClassifiers.put(_oldEEnum.getName(), _oldEEnum);
			EEnum newEEnum = cloneEEnum(EcoreFactory.eINSTANCE, _oldEEnum);
			sumEPackage.getEClassifiers().add(newEEnum);
			_newClassifiers.put(newEEnum.getName(), newEEnum);
		}
	}

	private void sumEClass(EClass baseEClass, EClass sumEClass,
			Hashtable<String, EClassifier> _oldClassifiers,
			Hashtable<String, EClassifier> _newClassifiers) {
		for(EStructuralFeature structuralFeature : sumEClass.getEStructuralFeatures()){
			if(searchEReferenceByName(baseEClass, structuralFeature.getName()) == null){
				if(structuralFeature instanceof EReference){
					EReference eReference = (EReference) structuralFeature;
					EReference newEReference = EcoreFactory.eINSTANCE.createEReference();
					newEReference.setName(eReference.getName());
					newEReference.setLowerBound(eReference.getLowerBound());
					newEReference.setUpperBound(eReference.getUpperBound());
					newEReference.setContainment(eReference.isContainment());
					newEReference.setChangeable(eReference.isChangeable());
					newEReference.setDerived(eReference.isDerived());
					baseEClass.getEStructuralFeatures().add(newEReference);
					
					for(EAnnotation eAnnotation : eReference.getEAnnotations()){
						EAnnotation newEAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
						newEAnnotation.setSource(eAnnotation.getSource());
						newEReference.getEAnnotations().add(newEAnnotation);
					}
				}
				else if(structuralFeature instanceof EAttribute){
					EAttribute eAttribute = (EAttribute)structuralFeature;
					EAttribute newAttribute = EcoreFactory.eINSTANCE.createEAttribute();
					newAttribute.setName(eAttribute.getName());
					if(!(eAttribute.getEType() instanceof EEnum)) newAttribute.setEType(eAttribute.getEType());
					baseEClass.getEStructuralFeatures().add(newAttribute);
					
					for(EAnnotation annotation : eAttribute.getEAnnotations()){
						EAnnotation newEAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
						newEAnnotation.setSource(annotation.getSource());
						newAttribute.getEAnnotations().add(newEAnnotation);
					}
				}
			}
		}
	}

	/**
	 * Calculates a binding by default (based in naming matching) for the interfaces in the parameters. 
	 * @param extensionLanguageRequiredInterface
	 * @param baseLanguageProvidedInterface
	 * @return
	 */
	public MappingRoot calculateBinding(EPackage extensionLanguageRequiredInterface, EPackage baseLanguageProvidedInterface){
		MappingRoot result = Ecore2EcoreFactory.eINSTANCE.createEcore2EcoreMappingRoot();
		result.getInputs().add(extensionLanguageRequiredInterface);
		result.getOutputs().add(baseLanguageProvidedInterface);
		
		Hashtable<String, EObject> requiredInterfaceTable = new Hashtable<String, EObject>();
		getElementsTable(extensionLanguageRequiredInterface, requiredInterfaceTable);
		System.out.println("requiredInterfaceTable: " + requiredInterfaceTable);
		
		Hashtable<String, EObject> providedInterfaceTable = new Hashtable<String, EObject>();
		getElementsTable(baseLanguageProvidedInterface, providedInterfaceTable);
		System.out.println("providedInterfaceTable: " + providedInterfaceTable);
		
		Enumeration<String> requiredInterfaceElementKeys = requiredInterfaceTable.keys();
		while(requiredInterfaceElementKeys.hasMoreElements()){
			String _currentKey = requiredInterfaceElementKeys.nextElement();
			EObject _correspondingProvidedElement = providedInterfaceTable.get(_currentKey);
			
			// If there is a correspondence, create the mapping element and add it to the root mapping. 
			if(_correspondingProvidedElement != null){
				EObject _requiredElement = requiredInterfaceTable.get(_currentKey);
				Mapping _currentMapping = MappingFactory.eINSTANCE.createMapping();
				_currentMapping.getInputs().add(_requiredElement);
				_currentMapping.getOutputs().add(_correspondingProvidedElement);
				result.getNested().add(_currentMapping);
			}
		}
		return result;
	}
	
	/**
	 * Fills a hashtable with the elements of the package in the parameter.
	 */
	private void getElementsTable(EPackage ePackage, Hashtable<String, EObject> table){
		table.put(PuzzleConstants.EPackage + ":" + ePackage.getName(), ePackage);
		
		//Scan the subpackages
		for(EPackage _eSubPackage : ePackage.getESubpackages()){
			this.getElementsTable(_eSubPackage, table);
		}
		
		//Scan the eclassifiers
		for(EClassifier _eClassifier : ePackage.getEClassifiers()){
			if(_eClassifier instanceof EClass){
				fillTableWithEClass((EClass)_eClassifier, table);
			}
			else if(_eClassifier instanceof EEnum){
				fillTableWithEEnum((EEnum)_eClassifier, table);
			}
		}
	}
	
	/**
	 * Fills the hash table in the parameter with the elements of a given EClass in the parameter
	 * @param eClass
	 * @param table
	 */
	private void fillTableWithEClass(EClass eClass,
			Hashtable<String, EObject> table) {
		table.put(PuzzleConstants.EClass + ":" + eClass.getName(), eClass);
		
		for(EAttribute _eAttribute : eClass.getEAttributes()){
			table.put(PuzzleConstants.EAttribute + ":" + eClass.getName() + ":" + _eAttribute.getName() + ":" + _eAttribute.getEType().getName(), _eAttribute);
		}
		
		for(EReference _eReference : eClass.getEReferences()){
			if(_eReference.getEAnnotation("addition") == null){
				table.put(PuzzleConstants.EReference + ":" + eClass.getName() + ":" + _eReference.getName() + ":" +  _eReference.getEType().getName(), _eReference);
			}
		}
		
		for(EOperation _eOperation : eClass.getEOperations()){
			String params = "";
			for(EParameter _eParameter : _eOperation.getEParameters()){
				if(!_eParameter.getName().equals("_self")){
					if(_eParameter.getEType() != null)
						params += _eParameter.getName() + ":" +  _eParameter.getEType().getName() + ",";
					else
						params += _eParameter.getName() + ":" + "null" + ",";
				}
			}
			
			if(params.equals(""))
				params = "()";
			else
				params = "(" + params.substring(0, params.length() - 1) + ")";
			
			String eOperationType = _eOperation.getEType() == null ? "void" : _eOperation.getEType().getName();
			table.put(PuzzleConstants.EOperation + ":" + eClass.getName() + ":" + _eOperation.getName() + ":" + eOperationType + ":" + params, _eOperation);
		}
		
		List<EClass> allSuperTypes = new ArrayList<EClass>();
		getAllSuperTypes(eClass, allSuperTypes);
	
		for(EClass _superType : allSuperTypes){
			for(EAttribute _eAttribute : _superType.getEAttributes()){
				table.put(PuzzleConstants.EAttribute + ":" + eClass.getName() + ":" + _eAttribute.getName() + ":" + _eAttribute.getEType().getName(), _eAttribute);
			}
			for(EReference _eReference : _superType.getEReferences()){
				table.put(PuzzleConstants.EReference + ":" + eClass.getName() + ":" + _eReference.getName() + ":" + _eReference.getEType().getName(), _eReference);
			}
			for(EOperation _eOperation : _superType.getEOperations()){
				String params = "";
				for(EParameter _eParameter : _eOperation.getEParameters()){
					params += _eParameter.getName() + ":" + _eParameter.getEType().getName();
				}
				
				if(params.equals(""))
					params = "()";
				else
					params = "(" + params.substring(0, params.length() - 1) + ")";
				
				String eOperationType = _eOperation.getEType() == null ? "void" : _eOperation.getEType().getName();
				table.put(PuzzleConstants.EOperation + ":" + eClass.getName() + ":" + _eOperation.getName() + ":" + eOperationType + ":" + params, _eOperation);
			}
		}
	}
	
	/**
	 * Fills the hash table in the parameter with the elements of a given EEnum in the parameter
	 * @param eEnum
	 * @param table
	 */
	private void fillTableWithEEnum(EEnum eEnum,
			Hashtable<String, EObject> table) {
		table.put(PuzzleConstants.EEnum + ":" + eEnum.getName(), eEnum);
		
		//Scan the literals
		for(EEnumLiteral _literal : eEnum.getELiterals()){
			table.put(PuzzleConstants.EEnumLiteral + ":" + eEnum.getName() + ":" + _literal.getName(), _literal);
		}
	}

	private void getAllSuperTypes(EClass eClass, List<EClass> allSuperTypes) {
		for(EClass _superType : eClass.getESuperTypes()){
			allSuperTypes.add(_superType);
			getAllSuperTypes(_superType, allSuperTypes);
		}
	}
	
	// -----------------------------------------------------
	// Auxiliary merging methods
	// -----------------------------------------------------
	
	/**
	 * Clones the metamodel in the parameter. 
	 * TODO This method breaks the packages hierarchy of the old metamodel.
	 * All the classifiers are added to the root package. 
	 * @param oldMetamodel
	 * @return
	 */
	public void cloneEPackage(EPackage toClone, EPackage clone, Hashtable<String, EClassifier> _oldClassifiers, 
			Hashtable<String, EClassifier> _newClassifiers, String targetNamespace, boolean includeRequired){
		
		for(EPackage _subPackage : toClone.getESubpackages()){
			EPackage _subPackageClone = EcoreFactory.eINSTANCE.createEPackage();
			_subPackageClone.setName(_subPackage.getName());
			_subPackageClone.setNsPrefix(_subPackage.getNsPrefix());
			_subPackageClone.setNsURI(targetNamespace + "/" + _subPackage.getName());
			
			cloneEPackage(_subPackage, _subPackageClone, _oldClassifiers, _newClassifiers, targetNamespace, includeRequired);
			clone.getESubpackages().add(_subPackageClone);
		}
		
		if(includeRequired){
			for (EClassifier eClassifier : toClone.getEClassifiers()) {
				if(eClassifier instanceof EClass){
					if(searchEClassByName(eClassifier.getName(), clone) == null){
						_oldClassifiers.put(((EClass)eClassifier).getName(), (EClass)eClassifier);
						EClass newEClass = cloneEClass(EcoreFactory.eINSTANCE, (EClass)eClassifier);
						clone.getEClassifiers().add(newEClass);
						_newClassifiers.put(newEClass.getName(), newEClass);
					}
					else{
						// TODO!
					}
				}
				else if(eClassifier instanceof EEnum){
					EEnum _oldEEnum = (EEnum)eClassifier;
					_oldClassifiers.put(_oldEEnum.getName(), _oldEEnum);
					EEnum newEEnum = cloneEEnum(EcoreFactory.eINSTANCE, _oldEEnum);
					clone.getEClassifiers().add(newEEnum);
					_newClassifiers.put(newEEnum.getName(), newEEnum);
				}
			}
		}
		else{
			for (EClassifier eClassifier : toClone.getEClassifiers()) {
				if(eClassifier.getEAnnotation("required") == null){
					if(eClassifier instanceof EClass){
						EClass legacyEClass = searchEClassByName(eClassifier.getName(), clone);
						if(legacyEClass == null){
							_oldClassifiers.put(((EClass)eClassifier).getName(), (EClass)eClassifier);
							EClass newEClass = cloneEClass(EcoreFactory.eINSTANCE, (EClass)eClassifier);
							clone.getEClassifiers().add(newEClass);
							_newClassifiers.put(newEClass.getName(), newEClass);
						}
					}
					else if(eClassifier instanceof EEnum){
						EEnum _oldEEnum = (EEnum)eClassifier;
						_oldClassifiers.put(_oldEEnum.getName(), _oldEEnum);
						EEnum newEEnum = cloneEEnum(EcoreFactory.eINSTANCE, _oldEEnum);
						clone.getEClassifiers().add(newEEnum);
						_newClassifiers.put(newEEnum.getName(), newEEnum);
					}
				}
			}
		}
		
	}
	
	private EAnnotation cloneEAnnotation(EAnnotation _annotation) {
		EAnnotation clone = EcoreFactory.eINSTANCE.createEAnnotation();
		clone.setSource(_annotation.getSource());
		return clone;
	}

	/**
	 * Resolution of the local attributes of the recently cloned metamodel
	 * @param _oldClassifiers
	 * @param metamodel
	 */
	public void resolveLocalEAttributes(Hashtable<String, EClassifier> _oldClassifiers, 
			Hashtable<String, EClassifier> _newClassifiers, EPackage metamodel){
	
		for (EClassifier _eClassifier : metamodel.getEClassifiers()) {
			if(_eClassifier instanceof EClass){
				EClass newClass = (EClass) _eClassifier;
				EClass oldClass = (EClass) _oldClassifiers.get(_eClassifier.getName());
			
				if(newClass != null && oldClass != null){
					for(EAttribute eAttribute : newClass.getEAttributes()){
						EAttribute _oldAttribute = ((EAttribute)searchStructuralFeatureByName(oldClass, eAttribute.getName()));
						String _resolvedTypeName = _oldAttribute.getEType().getName();
						
						if(_resolvedTypeName != null && ( _oldAttribute.getEType() instanceof EEnum)){
							EClassifier _resolvedType = _newClassifiers.get(_resolvedTypeName);
							eAttribute.setEType(_resolvedType);
						}
					}
				}
			}
		}
		
		for(EPackage _subPackage : metamodel.getESubpackages()){
			resolveLocalEAttributes(_oldClassifiers, _newClassifiers, _subPackage);
		}
	}
	
	/**
	 * Resolution of the local references of the recently cloned metamodel
	 * @param _oldClassifiers
	 * @param metamodel
	 */
	public void resolveLocalEReferences(Hashtable<String, EClassifier> _oldClassifiers, 
			Hashtable<String, EClassifier> _newClassifiers, EPackage metamodel, boolean deleteUntyped){
		
		for (EClassifier _eClassifier : metamodel.getEClassifiers()) {
			if(_eClassifier instanceof EClass){
				EClass newClass = (EClass) _eClassifier;
				EClass oldClass = (EClass) _oldClassifiers.get(_eClassifier.getName());
				if(oldClass != null){
					ArrayList<EReference> toDelete = new ArrayList<EReference>();
					for (EReference _newReference : newClass.getEReferences() ) {
						EReference _oldReference = ((EReference)searchStructuralFeatureByName(oldClass, _newReference.getName()));
						
						if(_oldReference != null && _oldReference.getEType() != null){
							String _resolvedTypeName = _oldReference.getEType().getName();
							if(_resolvedTypeName != null){
								EClassifier _resolvedType = _newClassifiers.get(_resolvedTypeName);
								_newReference.setEType(_resolvedType);
							}
							if(_newReference.getEType() == null)
								toDelete.add(_newReference);
						}
					}
					
					if(deleteUntyped){
						for (EReference eReference : toDelete) {
							newClass.getEStructuralFeatures().remove(eReference);
						}
					}
				}
			}
		}
		
		for(EPackage _subPackage : metamodel.getESubpackages()){
			resolveLocalEReferences(_oldClassifiers, _newClassifiers, _subPackage, deleteUntyped);
		}
	}
	
	/**
	 * Resolution of the local references of the recently cloned metamodel
	 * @param _oldClassifiers
	 * @param metamodel
	 */
	public void resolveLocalEOperationTypes(Hashtable<String, EClassifier> _oldClassifiers, 
			Hashtable<String, EClassifier> _newClassifiers, EPackage metamodel){
		
		for (EClassifier _eClassifier : metamodel.getEClassifiers()) {
			if(_eClassifier instanceof EClass){
				EClass newClass = (EClass) _eClassifier;
				EClass oldClass = (EClass) _oldClassifiers.get(_eClassifier.getName());
				
				if(oldClass != null){
					for (EOperation _newEOperation : newClass.getEOperations()) {
						EOperation _legacyOperation = searchEOperationByName(oldClass, _newEOperation.getName());
						if(_legacyOperation != null && _legacyOperation.getEType() != null){
							String _resolvedTypeName = _legacyOperation.getEType().getName();
							if(_resolvedTypeName != null){
								if(_legacyOperation.getEType() instanceof EDataType){
									// TODO We need to improve this!!! A LOT indeed
									if(_resolvedTypeName.equals("EJavaObject") || _resolvedTypeName.equals("Object")){
										_newEOperation.setEType(EcorePackage.eINSTANCE.getEJavaObject()); 
									}else if(_resolvedTypeName.equals("EBoolean") || _resolvedTypeName.equals("EBooleanObject")){
										_newEOperation.setEType(EcorePackage.eINSTANCE.getEBoolean()); 
									}else if(_resolvedTypeName.equals("EMap")){
										_newEOperation.setEType(EcorePackage.eINSTANCE.getEMap()); 
									}else if(_resolvedTypeName.equals("EString") || _resolvedTypeName.equals("String")){
										_newEOperation.setEType(EcorePackage.eINSTANCE.getEString()); 
									}else if(_resolvedTypeName.equals("EEList") || _resolvedTypeName.equals("EList")){
										_newEOperation.setEType(EcorePackage.eINSTANCE.getEEList()); 
									}
								}else{
									EClassifier _resolvedType = _newClassifiers.get(_resolvedTypeName);
									_newEOperation.setEType(_resolvedType);
								}
							}
						}
						
						// Now, it is time for the types of the parameters..
						if(_legacyOperation != null){
							for(EParameter _newEParameter : _newEOperation.getEParameters()){
								EParameter _legacyParameter = searchEParameterByName(_legacyOperation, _newEParameter.getName());
								if(_legacyParameter.getEType() != null){
									String _resolvedTypeName = _legacyParameter.getEType().getName();
									if(_resolvedTypeName != null){
										if(_legacyParameter.getEType() instanceof EDataType){
											// TODO We need to improve this!!! A LOT indeed
											if(_resolvedTypeName.equals("EJavaObject") || _resolvedTypeName.equals("Object")){
												_newEParameter.setEType(EcorePackage.eINSTANCE.getEJavaObject()); 
											}else if(_resolvedTypeName.equals("EBoolean") || _resolvedTypeName.equals("EBooleanObject")){
												_newEParameter.setEType(EcorePackage.eINSTANCE.getEBoolean()); 
											}else if(_resolvedTypeName.equals("EMap") || _resolvedTypeName.equals("Hashtable")){
												_newEParameter.setEType(EcorePackage.eINSTANCE.getEMap()); 
											}else if(_resolvedTypeName.equals("EString") || _resolvedTypeName.equals("String")){
												_newEParameter.setEType(EcorePackage.eINSTANCE.getEString()); 
											}else if(_resolvedTypeName.equals("EEList") || _resolvedTypeName.equals("EList")){
												_newEParameter.setEType(EcorePackage.eINSTANCE.getEEList()); 
											}
										}else{
											EClassifier _resolvedType = _newClassifiers.get(_resolvedTypeName);
											_newEParameter.setEType(_resolvedType);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		for(EPackage _subPackage : metamodel.getESubpackages()){
			resolveLocalEOperationTypes(_oldClassifiers, _newClassifiers, _subPackage);
		}
	}
	
	private EParameter searchEParameterByName(EOperation operation,
			String name) {
		for(EParameter _parameter : operation.getEParameters()){
			if(_parameter.getName().equals(name))
				return _parameter;
		}
		return null;
	}

	/**
	 * Resolution of the local super types of the recently cloned metamodel
	 * @param _oldClassifiers
	 * @param metamodel
	 */
	public void resolveLocalSuperTypes(Hashtable<String, EClassifier> _oldClassifiers,
			Hashtable<String, EClassifier> _newClassifiers, EPackage metamodel) {
		
		for (EClassifier _eClassifier : metamodel.getEClassifiers()) {
			if(_eClassifier instanceof EClass){
				EClass newClass = (EClass) _eClassifier;
				EClass oldClass = (EClass) _oldClassifiers.get(_eClassifier.getName());
				
				if(oldClass != null){
					for (EClass _oldSuperType : oldClass.getESuperTypes() ) {
						newClass.getESuperTypes().add((EClass)_newClassifiers.get(_oldSuperType.getName()));
					}
				}
			}
		}
		
		for(EPackage _subPackage : metamodel.getESubpackages()){
			resolveLocalSuperTypes(_oldClassifiers, _newClassifiers, _subPackage);
		}
	}
	
	/**
	 * Resolution of the eOpposite references of the metamodel. 
	 * @param _oldClassifiers
	 * @param _newClassifiers
	 * @param metamodel
	 */
	public void resolveEOppositeReferences(Hashtable<String, EClassifier> _oldClassifiers, 
			Hashtable<String, EClassifier> _newClassifiers, EPackage metamodel){
		for (EClassifier _eClassifier : metamodel.getEClassifiers()) {
			if(_eClassifier instanceof EClass){
				EClass newClass = (EClass) _eClassifier;
				EClass oldClass = (EClass) _oldClassifiers.get(_eClassifier.getName());
				
				if(oldClass != null){
					
					ArrayList<EStructuralFeature> allReferences = new ArrayList<EStructuralFeature>();
					allReferences.addAll(oldClass.getEStructuralFeatures());
					
					EClass extensionClass = (EClass)_oldClassifiers.get(_eClassifier.getName() + "-extension");
					if(extensionClass != null)
						allReferences.addAll(extensionClass.getEStructuralFeatures());
					
					for (EStructuralFeature _oldStructuralFeature : allReferences ) {
						if(_oldStructuralFeature instanceof EReference){
							EReference _oldReference = (EReference)_oldStructuralFeature;
							if(_oldReference.getEOpposite() != null){
								EReference _newEOppositeReference = searchEReferenceByName((EClass)_newClassifiers.get(_oldReference.getEType().getName()), 
										_oldReference.getEOpposite().getName());
								EReference _currentEReference = searchEReferenceByName(newClass, _oldReference.getName());
								_currentEReference.setEOpposite(_newEOppositeReference);
								_newEOppositeReference.setEOpposite(_currentEReference);
							}
						}
					}
				}
			}
		}
		
		for(EPackage _subPackage : metamodel.getESubpackages()){
			resolveEOppositeReferences(_oldClassifiers, _newClassifiers, _subPackage);
		}
	}
	
	/**
	 * Searches an eReference by name in the given class and its super types. 
	 * @param eClass
	 * @param name
	 * @return
	 */
	private EReference searchEReferenceByName(EClass eClass, String name) {
		// 1. Looking for the reference in the eClass
		for(EReference _currentReference : eClass.getEReferences()){
			if(_currentReference.getName().equals(name))
				return _currentReference;
		}
		
		// 2. Looking for the reference in the super types.
		for(EClass _superType : eClass.getESuperTypes()){
			EReference _result = searchEReferenceByName(_superType, name);
			if(_result != null)
				return _result;
		}
		
		// 3. Reference not found. Let's return null. 
		return null;
		
	}
	
	/**
	 * Resolution of the cross-cutting references of the merged metamodel
	 * @param sourceTable
	 * @param targetPackage
	 * @param binding
	 */
	private void resolveCrossCuttingEReferences(Hashtable<String, EClassifier> oldEClassifiers, Hashtable<String, EClassifier> unifiedEClassifiers,
			EPackage targetPackage, MappingRoot binding, EPackage recalculatedRequiredInterface){
		
		Enumeration<String> keys = unifiedEClassifiers.keys();
		while(keys.hasMoreElements()){
			String currentKey = keys.nextElement();
			
			if(unifiedEClassifiers.get(currentKey) instanceof EClass){
				EClass oldClass = (EClass) oldEClassifiers.get(currentKey);
				
				if(oldClass != null){
					EClass newClass = (EClass) unifiedEClassifiers.get(currentKey);
					ArrayList<EReference> toDelete = new ArrayList<EReference>();
					
					
					ArrayList<EReference> allReferences = new ArrayList<EReference>();
					allReferences.addAll(oldClass.getEReferences());
					
					EClass extensionOldClass = (EClass) oldEClassifiers.get(currentKey + "-extension");
					if(extensionOldClass != null)
						allReferences.addAll(extensionOldClass.getEReferences());
					
					for (EReference eReference : allReferences ) {
						EReference newEReference = (EReference) searchStructuralFeatureByName(newClass, eReference.getName());
						
						//TODO Fix the conditions!!
						
						// Case 1: The reference type is a class already included in the current merged language and the names match. 
						if(eReference.getEType().getName() != null && unifiedEClassifiers.get(eReference.getEType().getName()) != null){
							newEReference.setEType(unifiedEClassifiers.get(eReference.getEType().getName()));
						}
						
						// Case 2: The reference type is a class already included in the current merged language, the name match, but it is currently defined as a non-resolved proxy. 
						else if(eReference.getEType().getName() == null){
							String superTypeName = eReference.getEType().toString().split("#//")[1].replace(')', ' ').trim();
							newEReference.setEType(unifiedEClassifiers.get(superTypeName));
						}
						
						// Case 3: The reference type is a class already included in the current merged language but the names do not match. 
						//         We need to look for the correspondence in the binding. 
						else {
							String requiredTypeName = eReference.getEType().getName();
							if(requiredTypeName != null){
								TreeIterator<Mapping> it = binding.treeIterator();
								while (it.hasNext()) {
									Mapping _mapping = (Mapping) it.next();
									
									EObject _input = _mapping.getInputs().get(0);
									EObject _output = _mapping.getOutputs().get(0);
									
									if ((_input instanceof EClass) && (_output instanceof EClass)) {
										EClass _inputClass = (EClass) _input;
										EClass _outputClass = (EClass) _output;
										if(_inputClass.getName().equals(requiredTypeName)){
											newEReference.setEType(unifiedEClassifiers.get(_outputClass.getName()));
										}
									}
								}
							}
						}

						// Case 4: The reference type is not included in the current merged language but it is part of the recalculated required interface. 
						if(newEReference.getEType() == null){
							String requiredTypeName = eReference.getEType().getName();
							for (EClassifier _eClassifierRequired : recalculatedRequiredInterface.getEClassifiers()) {
								if(_eClassifierRequired.getName().equals(requiredTypeName)){
									newEReference.setEType(_eClassifierRequired);
								}
							}
						}
						
						// Case 5: Removing untyped references
						if(newEReference.getEType() == null){
							toDelete.add(newEReference);
						}
					}
					
					for (EReference eReference : toDelete) {
						newClass.getEStructuralFeatures().remove(eReference);
					}
				}
			}
		}
	}
	
	/**
	 * Resolution of the cross-cutting references of the merged metamodel
	 * @param sourceTable
	 * @param targetPackage
	 * @param binding
	 */
	private void resolveCrossCuttingESuperTypes(Hashtable<String, EClassifier> oldEClassifiers, Hashtable<String, EClassifier> unifiedEClassifiers,
			EPackage targetPackage, MappingRoot binding, EPackage recalculatedRequiredInterface){
		
		Enumeration<String> keys = unifiedEClassifiers.keys();
		while(keys.hasMoreElements()){
			String currentKey = keys.nextElement();
			
			if(unifiedEClassifiers.get(currentKey) instanceof EClass){
				EClass oldClass = (EClass) oldEClassifiers.get(currentKey);
				
				if(oldClass != null){
					EClass newClass = (EClass) unifiedEClassifiers.get(currentKey);
					
					for (EClass eSuperType : oldClass.getESuperTypes() ) {
						newClass.getESuperTypes().add((EClass)unifiedEClassifiers.get(eSuperType.getName()));
					}
				}
			}
		}
	}
	
	/**
	 * Search a class by name in the given package
	 * TODO It does not go through the hierarchy.
	 * @param name
	 * @param ePackage
	 * @return
	 */
	public EClass searchEClassByName(String name, EPackage ePackage) {
		for (EClassifier _eClassifier : ePackage.getEClassifiers()) {
			if(_eClassifier instanceof EClass && _eClassifier.getName().equals(name)){
				return (EClass)_eClassifier;
			}
		}return null;
	}
	
	/**
	 * Search a structural feature by name in the given class and in the corresponding inheritance hierarchy.
	 * @param name
	 * @param eclass
	 * @return
	 */
	private EStructuralFeature searchStructuralFeatureByName(
			EClass _class, String name) {
		
		// Searching the structural feature in the given class
		for (EStructuralFeature _feature : _class.getEStructuralFeatures()) {
			if(_feature.getName().equals(name))
				return _feature;
		}
		// Searching the structural feature in the super classes
		for(EClass _superClass : _class.getESuperTypes()){
			EStructuralFeature _feature = searchStructuralFeatureByName(_superClass, name);
			if(_feature != null)
				return _feature;
		}
		
		return null;
	}
	
	public EOperation searchEOperationByName(EClass _class,
			String name) {
		// TODO Adicionar el tema de tipos y parametros a esta comparacion.
		if(_class != null && _class.getEOperations() != null){
			for(EOperation _eOperation : _class.getEOperations()){
				if(_eOperation.getName().equals(name))
					return _eOperation;
			}
		}
		return null;
	}

	/**
	 * Introduces recursively the classes of the given package
	 * @param _package
	 * @param rootPackage
	 */
	private void addEPackageClasses(EPackage _package, EPackage rootPackage, 
			Hashtable<String, EClassifier> oldEClassifiers, Hashtable<String, EClassifier> unifiedEClassifiers) {
		
		for (EClassifier eClassifier : _package.getEClassifiers()) {
			if(eClassifier instanceof EClass){
				oldEClassifiers.put(((EClass)eClassifier).getName(), (EClass)eClassifier);
				EClass newEClass = cloneEClass(EcoreFactory.eINSTANCE, (EClass)eClassifier);
				rootPackage.getEClassifiers().add(newEClass);
				unifiedEClassifiers.put(newEClass.getName(), newEClass);
			}
			else if(eClassifier instanceof EEnum){
				oldEClassifiers.put(((EEnum)eClassifier).getName(), (EEnum)eClassifier);
				EEnum newEEnum = cloneEEnum(EcoreFactory.eINSTANCE, (EEnum)eClassifier);
				rootPackage.getEClassifiers().add(newEEnum);
				unifiedEClassifiers.put(newEEnum.getName(), newEEnum);
			}
		}
		for (EPackage _subEPackage : _package.getESubpackages()) {
			addEPackageClasses(_subEPackage, rootPackage, oldEClassifiers, unifiedEClassifiers);
		}
	}
	
	/**
	 * Clones a EClass in the parameter by using the ECORE factory.
	 * @param ecoreFactory
	 * @param oldClass
	 * @return newClass A clone of the target class.
	 */
	public EClass cloneEClass(EcoreFactory ecoreFactory, EClass oldClass) {
		EClass newClass = ecoreFactory.createEClass();
		newClass.setName(oldClass.getName());
		newClass.setAbstract(oldClass.isAbstract());
		newClass.setInterface(oldClass.isInterface());
		
		//Clone the attributes
		for (EAttribute eAttribute : oldClass.getEAttributes()) {
			EAttribute newAttribute = ecoreFactory.createEAttribute();
			newAttribute.setName(eAttribute.getName());
			if(!(eAttribute.getEType() instanceof EEnum)) newAttribute.setEType(eAttribute.getEType());
			newClass.getEStructuralFeatures().add(newAttribute);
			
			for(EAnnotation annotation : eAttribute.getEAnnotations()){
				EAnnotation newEAnnotation = ecoreFactory.createEAnnotation();
				newEAnnotation.setSource(annotation.getSource());
				newAttribute.getEAnnotations().add(newEAnnotation);
			}
		}
		
		//Clone the references
		for (EReference eReference : oldClass.getEReferences()) {
			EReference newEReference = ecoreFactory.createEReference();
			newEReference.setName(eReference.getName());
			newEReference.setLowerBound(eReference.getLowerBound());
			newEReference.setUpperBound(eReference.getUpperBound());
			newEReference.setContainment(eReference.isContainment());
			newEReference.setChangeable(eReference.isChangeable());
			newEReference.setDerived(eReference.isDerived());
			newClass.getEStructuralFeatures().add(newEReference);
			
			for(EAnnotation eAnnotation : eReference.getEAnnotations()){
				EAnnotation newEAnnotation = ecoreFactory.createEAnnotation();
				newEAnnotation.setSource(eAnnotation.getSource());
				newEReference.getEAnnotations().add(newEAnnotation);
			}
		}
		
		//Clone the operations
		for (EOperation operation : oldClass.getEOperations()) {
				EOperation newOperation = ecoreFactory.createEOperation();
				newOperation.setName(operation.getName());
				
				// Clone the parameters of the operation... 
				for(EParameter _parameter : operation.getEParameters()){
					EParameter newParameter = ecoreFactory.createEParameter();
					newParameter.setName(_parameter.getName());
					newParameter.setOrdered(_parameter.isOrdered());
					newParameter.setUnique(_parameter.isUnique());
					newParameter.setLowerBound(_parameter.getLowerBound());
					newParameter.setUpperBound(_parameter.getUpperBound());
					newOperation.getEParameters().add(newParameter);
				}
				newClass.getEOperations().add(newOperation);
		}
		
		//Clone the annotations
		for(EAnnotation annotation : oldClass.getEAnnotations()){
			EAnnotation newEAnnotation = ecoreFactory.createEAnnotation();
			newEAnnotation.setSource(annotation.getSource());
			newClass.getEAnnotations().add(newEAnnotation);
		}
		return newClass;
	}
	
	/**
	 * Clones the EEnum in the parameter by using the given ecore factory.
	 * @param theCoreFactory
	 * @param eEnum
	 * @return
	 */
	public EEnum cloneEEnum(EcoreFactory theCoreFactory, EEnum eEnum) {
		EEnum newEEnum = theCoreFactory.createEEnum();
		newEEnum.setName(eEnum.getName());
		newEEnum.setSerializable(eEnum.isSerializable());
		newEEnum.setInstanceTypeName(eEnum.getInstanceTypeName());
		newEEnum.setInstanceClassName(eEnum.getInstanceClassName());
		newEEnum.setInstanceClass(eEnum.getInstanceClass());
		
		for (EEnumLiteral eEnumLiteral : eEnum.getELiterals()) {
			EEnumLiteral newEEnumLiteral = theCoreFactory.createEEnumLiteral();
			newEEnumLiteral.setInstance(eEnumLiteral.getInstance());
			newEEnumLiteral.setLiteral(eEnumLiteral.getLiteral());
			newEEnumLiteral.setName(eEnumLiteral.getName());
			newEEnumLiteral.setValue(eEnumLiteral.getValue());
			
			for(EAnnotation _eAnnotation : eEnumLiteral.getEAnnotations()){
				EAnnotation newAnnotation = cloneEAnnotation(_eAnnotation);
				newEEnumLiteral.getEAnnotations().add(newAnnotation);
			}
			
			newEEnum.getELiterals().add(newEEnumLiteral);
		}
		
		for (EAnnotation eAnnotation : eEnum.getEAnnotations()) {
			EAnnotation newEAnnotation = theCoreFactory.createEAnnotation();
			newEAnnotation.setSource(eAnnotation.getSource());
			newEEnum.getEAnnotations().add(newEAnnotation);
		}
		return newEEnum;
	}
	
	public List<JvmTypeReference> mergeOperationalSemantics(List<JvmTypeReference> baseLanguageAspects, 
			List<JvmTypeReference> extensionLanguageAspects, MappingRoot binding) {
		List<JvmTypeReference> result = new ArrayList<JvmTypeReference>();
		
		result.addAll(baseLanguageAspects);
		result.addAll(extensionLanguageAspects);
		return result;
	}
}
