package fr.inria.diverse.melange.validation

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.google.common.collect.Multimap
import com.google.inject.Inject
import fr.inria.diverse.melange.ast.AspectExtensions
import fr.inria.diverse.melange.ast.LanguageExtensions
import fr.inria.diverse.melange.ast.MetamodelExtensions
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.ast.NamingHelper
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.lib.MatchingHelper
import fr.inria.diverse.melange.lib.ModelUtils
import fr.inria.diverse.melange.metamodel.melange.Aspect
import fr.inria.diverse.melange.metamodel.melange.Import
import fr.inria.diverse.melange.metamodel.melange.Inheritance
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.MelangePackage
import fr.inria.diverse.melange.metamodel.melange.Merge
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.metamodel.melange.NamedElement
import fr.inria.diverse.melange.metamodel.melange.Operator
import fr.inria.diverse.melange.metamodel.melange.ResourceType
import fr.inria.diverse.melange.metamodel.melange.Slice
import fr.inria.diverse.melange.metamodel.melange.Weave
import fr.inria.diverse.melange.utils.AspectToEcore
import java.util.ArrayList
import java.util.Collections
<<<<<<< 553867e488f5974d20ad10d6fdc7b2cf7292f2b7
import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EOperation
<<<<<<< 21ff547d139b128ab5a46850cfd568df196cd9a3
=======
import org.eclipse.emf.ecore.EClass
>>>>>>> Melange validator: refactor overriding error
=======
>>>>>>> Melange validator: add an error marker when an Aspect declare an operation already in a super Language with a different return type
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmField
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder

class MelangeValidator extends AbstractMelangeValidator
{
	@Inject extension AspectExtensions
	@Inject extension LanguageExtensions
	@Inject extension MetamodelExtensions
	@Inject extension ModelingElementExtensions
	@Inject extension NamingHelper
	@Inject ModelUtils modelUtils
	@Inject MatchingHelper matchingHelper
	@Inject extension EcoreExtensions
	@Inject extension AspectToEcore
	@Inject JvmTypeReferenceBuilder.Factory builderFactory

	@Check
	def void checkElementsAreNamed(NamedElement e) {
		if (e.name === null || e.name.length == 0)
			error(
				"All elements must be named",
				MelangePackage.Literals.NAMED_ELEMENT__NAME,
				MelangeValidationConstants.ELEMENT_NAME_EMPTY
			)
	}

	@Check
	def void checkNamesAreUnique(NamedElement e) {
		val root =
			if (e.eContainer instanceof ModelTypingSpace) e.eContainer
			else if (e.eContainer.eContainer instanceof ModelTypingSpace) e.eContainer.eContainer

		if ((root as ModelTypingSpace).elements.filter(NamedElement).exists[e_ |
			   e_ != e
			//&& e_.eClass == e.eClass
			&& e_.name == e.name
		])
			error(
				"Names must be unique",
				MelangePackage.Literals.NAMED_ELEMENT__NAME,
				MelangeValidationConstants.ELEMENT_NAME_DUPLICATED
			)
	}

	@Check
	def void checkNameIsValid(Language l) {
		if (l.name === null || l.name.empty || !Character.isUpperCase(l.name.charAt(0)))
			error(
				"Language name should start with an uppercase",
				MelangePackage.Literals.NAMED_ELEMENT__NAME,
				MelangeValidationConstants.LANGUAGE_NAME_INVALID
			)
	}

	@Check
	def void checkNameIsValid(ModelType mt) {
		if (mt.name === null || mt.name.empty || !Character.isUpperCase(mt.name.charAt(0)))
			error(
				"Model type name should start with an uppercase",
				MelangePackage.Literals.NAMED_ELEMENT__NAME,
				MelangeValidationConstants.MODELTYPE_NAME_INVALID
			)
	}

	@Check
	def void checkEcoreIsSet(ModelType mt) {
		if (mt.extracted === null) {
			if (mt.ecoreUri === null || mt.ecoreUri.empty)
				error(
					"A valid Ecore file must be imported",
					MelangePackage.Literals.MODELING_ELEMENT__ECORE_URI,
					MelangeValidationConstants.MODELTYPE_ECORE_EMPTY
				)
			else if (mt.ecoreUri !== null && modelUtils.loadPkg(mt.ecoreUri) === null)
				error(
					"Couldn't load specified Ecore",
					MelangePackage.Literals.MODELING_ELEMENT__ECORE_URI,
					MelangeValidationConstants.MODELTYPE_ECORE_UNLOADABLE
				)
		}
	}

	@Check
	def void checkEcoreIsSet(Language l) {
		if (l.operators.filter(Import).filter[ecoreUri !== null].empty
			&& l.operators.filter(Inheritance).forall[targetLanguage?.syntax.ecoreUri === null]
			&& l.operators.empty
			&& l.syntax?.ecoreUri === null
		)
			error(
				"A valid Ecore file must be imported",
				l.syntax,
				MelangePackage.Literals.MODELING_ELEMENT__ECORE_URI,
				MelangeValidationConstants.METAMODEL_ECORE_EMPTY
			)
	}

	@Check
	def void checkImportIsValid(Import i) {
		try {
			val ecore = modelUtils.loadPkg(i.ecoreUri)

			if (ecore === null)
				error(
					"Couldn't load specified Ecore",
					MelangePackage.Literals.IMPORT__ECORE_URI,
					MelangeValidationConstants.IMPORT_INVALID_URI
				)

			if (i.genmodelUris.empty) {
				val speculativeGenmodelPath = i.ecoreUri.substring(0, i.ecoreUri.lastIndexOf(".")) + ".genmodel"
				if (modelUtils.loadGenmodel(speculativeGenmodelPath) === null)
					error(
						"A valid Genmodel file must be imported",
						MelangePackage.Literals.IMPORT__GENMODEL_URIS,
						MelangeValidationConstants.IMPORT_INVALID_GENMODEL
					)
			} else {
				i.genmodelUris.forEach[gmUri |
					if (modelUtils.loadGenmodel(gmUri) === null)
						error(
							"A valid Genmodel file must be imported",
							MelangePackage.Literals.IMPORT__GENMODEL_URIS,
							MelangeValidationConstants.IMPORT_INVALID_GENMODEL
						)
				]
			}
		} catch (Exception e) {
			error(
				"Unexpected error while loading Ecore/Genmodel",
				MelangePackage.Literals.IMPORT__ECORE_URI,
				MelangeValidationConstants.IMPORT_LOADING_EXCEPTION
			)
		}
	}

	@Check
	def void checkHasAnnotationProcessorDependency(Aspect asp) {
		if (asp.aspectTypeRef?.type !== null && asp.aspectTypeRef.type instanceof JvmDeclaredType && 
			(asp.aspectTypeRef.type as JvmDeclaredType).annotations.exists[annotation.eIsProxy]
		)
			error(
				"Cannot find dependency to annotation processor. Please add k3.al.annotationprocessor",
				MelangePackage.Literals.ASPECT__ASPECT_TYPE_REF,
				MelangeValidationConstants.INVALID_ASPECT_IMPORT
			)
	}

	// FIXME: Only one package is checked there,
	//        and mtPkg may be null
	// TODO: This should be replaced by an algebra call.
	//       -> ecore files must be loaded prior to this
	@Check
	def void checkImplements(Language l) {
		val mmPkg = modelUtils.loadPkg(l.syntax.ecoreUri)

		l.^implements
		.forEach[mt |
			val mtPkg = modelUtils.loadPkg(mt.ecoreUri)

			if (!matchingHelper.match(
				Collections.singletonList(mmPkg), Collections.singletonList(mtPkg), null
			))
				error(
					'''«l.name» doesn't match the interface «mt.name»''',
					MelangePackage.Literals.LANGUAGE__IMPLEMENTS,
					MelangeValidationConstants.METAMODEL_IMPLEMENTS_ERROR
				)
		]
	}

	@Check
	def void checkNoCyclicInheritance(Language l) {
		if (l.allSuperLanguages.exists[ll | ll.allSuperLanguages.contains(l)])
			error(
				"Cannot inherit from self",
				MelangePackage.Literals.LANGUAGE_OPERATOR__TARGET_LANGUAGE,
				MelangeValidationConstants.METAMODEL_SELF_INHERITANCE
			)
	}

	@Check
	def void checkXtextResourceProperlyConfigured(Language l) {
		if (
			   l.resourceType == ResourceType.XTEXT
			&& l.xtextSetupRef === null
		)
			error(
				"Xtext resources needs a 'setup' class",
				MelangePackage.Literals.LANGUAGE__RESOURCE_TYPE,
				MelangeValidationConstants.METAMODEL_XTEXT_SETUP
			)
	}

	@Check
	def void checkRuntimeHasBeenGenerated(Language l) {
		if (l.isGeneratedByMelange && !l.runtimeHasBeenGenerated) {
			warning(
				"Cannot find EMF runtime for" + l.name,
				l.syntax,
				MelangePackage.Literals.MODELING_ELEMENT__ECORE_URI,
				MelangeValidationConstants.METAMODEL_NO_EMF_RUNTIME
			)
		}
	}

	@Check
	def void checkAspectAnnotationIsValid(Aspect asp) {
		val clsName = asp.aspectTypeRef.aspectAnnotationValue
		val lang = asp.eContainer as Language
		val correspondingWeave = lang.operators.filter(Weave).findFirst[aspectTypeRef.simpleName == asp.aspectTypeRef.simpleName]

		if (clsName !== null && correspondingWeave !== null && asp.aspectedClass === null)
			error(
				'''Cannot find target class «clsName»''',
				correspondingWeave,
				MelangePackage.Literals.WEAVE__ASPECT_TYPE_REF,
				MelangeValidationConstants.WEAVE_INVALID_TARGET
			)
	}

	@Check
	def void checkWildcardAspectImport(Weave w) {
		if (
			   w.aspectWildcardImport !== null
			&& !w.aspectWildcardImport.endsWith(".*")
		)
			error(
				"Only wildcard imports are supported, e.g. my.pkg.*",
				MelangePackage.Literals.WEAVE__ASPECT_WILDCARD_IMPORT,
				MelangeValidationConstants.ASPECT_INVALID_WILDCARD
			)
	}

	@Check
	def void checkSliceCriteria(Slice s) {
		val invalidRoots = s.roots.filter[clsName | s.targetLanguage.syntax.findClassifier(clsName) === null]
		val invalidRootsSize = invalidRoots.size

		if (invalidRootsSize > 0)
			error(
				'''Invalid slicing criterion: cannot find class«IF invalidRootsSize > 1»es«ENDIF»: «invalidRoots.join(", ")»''',
				MelangePackage.Literals.SLICE__ROOTS,
				MelangeValidationConstants.SLICE_INVALID_ROOT
			)
	}

	@Check
	def void checkEveryPackageHasAGenPackage(Language l) {
		if (!l.isGeneratedByMelange) {
			val invalidPkgs = l.syntax.pkgs.filter[l.syntax.getGenPackageFor(it) === null]

			if (invalidPkgs.size > 0)
				error(
					'''Unexpected error: cannot find a GenPackage for: «invalidPkgs.map[name].join(", ")»''',
					MelangePackage.Literals.LANGUAGE__SYNTAX,
					MelangeValidationConstants.METAMODEL_NO_GENPACKAGE
				)
		}
	}

	@Check
	def void checkLanguageNameDoesntConflictWithClassifier(Language l) {
		if (l.syntax.findClassifier(l.name) !== null)
			error(
				'''Language name conflicts with one of its meta-classes: «l.name»''',
				MelangePackage.Literals.NAMED_ELEMENT__NAME,
				MelangeValidationConstants.LANGUAGE_NAME_CONFLICTS_METACLASS
			)
	}
	
	@Check
	def void checkPropertiesOverriding(Aspect asp){
		val aspectName = asp.aspectTypeRef.qualifiedName
		val aspectedClass = asp.aspectTypeRef.aspectAnnotationValue
		
		val language = asp.eContainer as Language 
		val typeRefBuilder = builderFactory.create(language.eResource.resourceSet)
		
		val ref = typeRefBuilder.typeRef(aspectName+aspectedClass+"AspectProperties")
		val aspectProperties = ref.type as JvmGenericType
		
		aspectProperties.members.filter(JvmField).forEach[field |
			val fieldName = field.simpleName
			val fieldType = field.type.type
			
			language.operators.forEach[operator | 
				
<<<<<<< 553867e488f5974d20ad10d6fdc7b2cf7292f2b7
<<<<<<< b1d4537b77632763b1bb6c8c9206ff142d0d2f01
				val superClass = operator.findClass(aspectedClass)
=======
				val superLang = getLanguage(operator)
				
				val superClass = superLang.syntax.findClass(aspectedClass)
>>>>>>> Melange validator: overriding error marker for Merge, Slice and Inherit operator
=======
				val superClass = operator.findClass(aspectedClass)
>>>>>>> Melange validator: refactor overriding error
				if(superClass !== null){
					val superField = superClass.EAllAttributes.findFirst[name == fieldName]
					if(superField !== null){
						val superFieldType = superField.EType
						
						if(fieldType.simpleName != superFieldType.name){
							error(
								"Aspect \'"+aspectName+"\' has an attribute \'"+fieldName+"\' typed "+fieldType.simpleName+" but in \'"+operator.language.name+"\' it is typed "+superFieldType.name,
								MelangePackage.Literals.ASPECT__ASPECT_TYPE_REF,
								MelangeValidationConstants.MERGE_ATTRIBUTE_OVERRIDING
							)
						}
					}
					
					val superRef = superClass.EAllReferences.findFirst[name == fieldName]
					if(superRef !== null){
						val superFieldType = superRef.EType
						
						if(fieldType.simpleName != superFieldType.name){
							error(
								"Aspect \'"+aspectName+"\' has a reference \'"+fieldName+"\' typed "+fieldType.simpleName+" but in \'"+operator.language.name+"\' it is typed "+superFieldType.name,
								MelangePackage.Literals.ASPECT__ASPECT_TYPE_REF,
								MelangeValidationConstants.MERGE_REFERENCE_OVERRIDING
							)
						}
					}
				}
			]
		]
	}
	
<<<<<<< 21ff547d139b128ab5a46850cfd568df196cd9a3
<<<<<<< b1d4537b77632763b1bb6c8c9206ff142d0d2f01
=======
>>>>>>> Melange validator: add an error marker when an Aspect declare an operation already in a super Language with a different return type
	@Check
	def void checkOperationOverriding(Aspect asp){
		val language = asp.eContainer as Language
		val aspectName = asp.aspectTypeRef.qualifiedName
		val aspectedClass = asp.aspectTypeRef.aspectAnnotationValue
		
		val aspectClass = asp.aspectTypeRef.type as JvmGenericType
		aspectClass.members.filter(JvmOperation).forEach[method |
			val methodType = method.returnType.type
			
			language.operators.forEach[operator | 
				
				val superClass = operator.findClass(aspectedClass)
				if(superClass !== null){
					superClass.EAllOperations.forEach[operation |
						val operationType = operation.EType
						val opTypeName = if(operationType === null){
								"Void"
							}
							else{
								operationType.name
							}
						val metTypeName = if(methodType === null){
								"Void"
							}
							else{
								methodType.simpleName
							}
						if(method.isMatching(operation) && metTypeName != opTypeName){
							error(
								"Aspect \'"+aspectName+"\' has an operation \'"+method.simpleName+"\' typed "+metTypeName+" but in \'"+operator.language.name+"\' it is typed "+opTypeName,
								MelangePackage.Literals.ASPECT__ASPECT_TYPE_REF,
								MelangeValidationConstants.MERGE_OPERATION_OVERRIDING
							)
						}
					]
				}
			]
		]
	}
	
<<<<<<< 21ff547d139b128ab5a46850cfd568df196cd9a3
	@Check
	def void checkStructuralOverriding(Language lang){
		val operators = lang.operators
		val candidateClasses = findMergedClasses(operators)
		candidateClasses.keys.forEach[className |
			val candidates = candidateClasses.get(className)
			
			//Compare an element with its following
			for(var int i = 0; i < candidates.size; i++){
				val first = candidates.get(i)
				for(var int j = i+1; j < candidates.size; j++){
					val second = candidates.get(j)
					checkConflict(first,second)
				}
			}
		]
	}
	
=======
>>>>>>> Melange validator: add an error marker when an Aspect declare an operation already in a super Language with a different return type
	/**
	 * Return the Language referenced if {@link operator} is an Inheritance, Merge or Slice.
=======
	/**
<<<<<<< 553867e488f5974d20ad10d6fdc7b2cf7292f2b7
	 * Return the Language if {@link operator} is a Inheritance, Merge or Slice.
>>>>>>> Melange validator: overriding error marker for Merge, Slice and Inherit operator
=======
	 * Return the Language referenced if {@link operator} is an Inheritance, Merge or Slice.
>>>>>>> Melange validator: refactor overriding error
	 * Return null otherwise. 
	 */
	private def Language getLanguage(Operator operator){
		if(operator instanceof Inheritance){
<<<<<<< b1d4537b77632763b1bb6c8c9206ff142d0d2f01
			return (operator as Inheritance).targetLanguage
		}
		else if(operator instanceof Merge){
			return (operator as Merge).targetLanguage
		}
		else if(operator instanceof Slice){
			return (operator as Slice).targetLanguage
		}
		return null
	}
	
	/**
	 * Return depending on the type of {@link operator}: <br>
	 * - the name of the Language <br>
	 * - the name of the Aspect <br>
	 * - the uri of the Ecore <br>
	 * 
	 * Return <Unknown source> by default
	 */
	private def String getSource(Operator operator){
		switch operator{
			Inheritance : (operator as Inheritance).targetLanguage.name
			Merge       : operator.targetLanguage.name
			Slice       : operator.targetLanguage.name
			Weave       : operator.aspectTypeRef.qualifiedName
			Import      : operator.ecoreUri
			default     : "<Unknown source>"
		}
	}
	
	/**
	 * Return depending on the type of {@link operator}: <br>
	 * - Language <br>
	 * - Aspect <br>
	 * - Ecore <br>
	 * 
	 * Return <Unknown type> by default
	 */
	private def String getSourceType(Operator operator){
		switch operator{
			Inheritance : "Language"
			Merge       : "Language"
			Slice       : "Language"
			Weave       : "Aspect"
			Import      : "Ecore"
			default     : "<Unknown type>"
		}
	}
	
	/**
	 * Return all classes from the result of the Operator
	 */
	private def List<EClass> getAllClasses(Operator operator){
		switch operator{
			Inheritance : operator.targetLanguage.syntax.allClasses.toList
			Merge       : operator.targetLanguage.syntax.allClasses.toList
			Slice       : operator.targetLanguage.syntax.allClasses.toList //FIXME: Slice result may be smaller than the ref Language
			Weave       : operator.owningLanguage.semantics.findFirst[aspectTypeRef.qualifiedName == operator.aspectTypeRef.qualifiedName]
			               ?.ecoreFragment.getAllClasses
			Import      : modelUtils.loadPkg(operator.ecoreUri).getAllClasses
			default     : new ArrayList
		}
	}
	
	/**
	 * Find {@link className} in the result of {@link op}.
	 * Return null if not found or if {@link op} is not a Merge,Slice or Inheritance
	 */
	private def EClass findClass(Operator op, String className){
		val superLang = getLanguage(op) //FIXME: Slice result may be smaller than the ref Language
		if(superLang != null){
			return superLang.syntax.findClass(className)
		}
		return null
	}
	
	/**
	 * Return true if {@link method} and {@link operation} have the same name and their arguments'
	 * type are the same.
	 * 
	 * @param method method from a K3 Aspect
	 */
	private def boolean isMatching(JvmOperation method, EOperation operation){
		if(method.simpleName == operation.name){
			val methodParams = method.parameters
			val operationParams = operation.EParameters
			if((methodParams.size -1) == operationParams.size){ //drop the first argument who is the caller in k3 aspects
				for(var int i = 1; i < methodParams.size; i++){
					val methodParamType = methodParams.get(i).actualType.simpleName
					val operationParamType = 
						if(operationParams.get(i-1).EType instanceof EDataType){
							val type = operationParams.get(i-1).EType.name
							switch type {
								case "EBoolean" : "boolean"
								case "EString" : "String"
								case "EByte" : "byte"
								case "EDouble" : "double"
								case "EFloat" : "float"
								case "EInteger" : "Integer"
								case "EInt" : "int"
								case "ELong" : "long"
								case "EShort" : "short"
								default : type
							} 
						}
						else{
							operationParams.get(i-1).EType.name
						}
					if(methodParamType != operationParamType){
						return false
					}
				}
				return true
			}
		}
		return false
	}
	
	/**
	 * Return true if {@link op1} and {@link op2} have the same name and their arguments'
	 * type are the same.
	 */
	private def boolean isMatching(EOperation op1, EOperation op2){
		if(op1.name == op2.name){
			val opParams1 = op1.EParameters
			val opParams2 = op2.EParameters
			if(opParams1.size == opParams2.size){
				for(var int i = 0; i < opParams1.size; i++){
					val opParamType1 = opParams1.get(i).EType.name
					val opParamType2 = opParams2.get(i).EType.name
					if(opParamType1 != opParamType2){
						return false
					}
				}
				return true
			}
		}
		return false
	}
	
	/**
	 * Return classes from results of {@link operators} which have to be merged 
	 * (i.e classes with the same name).
	 * 
	 * Classes are associated with their containing Operator
	 */
	private def Multimap<String,Pair<EClass,Operator>> findMergedClasses(List<Operator> operators){
		val ListMultimap<String,Pair<EClass,Operator>> res = ArrayListMultimap.create
		
		val ListMultimap<String,Pair<EClass,Operator>> sortByName = ArrayListMultimap.create
		operators.forEach[op |
			op.allClasses.forEach[clazz|
				sortByName.put(clazz.name, clazz->op)
			]
		]
		
		sortByName.keys.toSet.forEach[className |
			val list = sortByName.get(className)
			if(list.size > 1){
				res.putAll(className,list)
			}
		]
		
		return res
	}
	
	private def void checkConflict(Pair<EClass,Operator> first, Pair<EClass,Operator> second){
		val op1 = first.value
		val op2 = second.value
		
		first.key.EAllAttributes.forEach[firstField |
			val fieldName = firstField.name
			val secondField = second.key.EAllAttributes.findFirst[name == fieldName]
			if(secondField !== null){
				if(firstField.EType.name != secondField.EType.name){
					error(
						op1.sourceType+" \'"+op1.source+"\' has an attribute \'"+fieldName+"\' typed "+firstField.EType.name+" but in \'"+op2.source+"\' it is "+secondField.EType.name,
						MelangePackage.Literals.LANGUAGE__OPERATORS,
						MelangeValidationConstants.MERGE_ATTRIBUTE_OVERRIDING
					)
				}
			}
		]
		
		first.key.EAllReferences.forEach[firstField |
			val fieldName = firstField.name
			val secondField = second.key.EAllReferences.findFirst[name == fieldName]
			if(secondField !== null){
				if(firstField.EType.name != secondField.EType.name){
					error(
						op1.sourceType+" \'"+op1.source+"\' has a reference \'"+fieldName+"\' typed "+firstField.EType.name+" but in \'"+op2.source+"\' it is "+secondField.EType.name,
						MelangePackage.Literals.LANGUAGE__OPERATORS,
						MelangeValidationConstants.MERGE_REFERENCE_OVERRIDING
					)
				}
			}
		]
		
		first.key.EAllOperations.forEach[firstOp |
			val secondOp = second.key.EAllOperations.findFirst[it.isMatching(firstOp)]
			if(secondOp !== null){
				val firstTypeName = if(firstOp.EType === null){
								"Void"
							}
							else{
								firstOp.EType.name
							}
				val secondTypeName = if(secondOp.EType === null){
								"Void"
							}
							else{
								secondOp.EType.name
							}
				if(firstTypeName != secondTypeName){
					error(
						op1.sourceType+" \'"+op1.source+"\' has an operation \'"+firstOp.name+"\' typed "+firstTypeName+" but in \'"+op2.source+"\' it is "+secondTypeName,
						MelangePackage.Literals.LANGUAGE__OPERATORS,
						MelangeValidationConstants.MERGE_OPERATION_OVERRIDING
					)
				}
			}
		]
	}
=======
			return (operator as Inheritance).superLanguage
		}
		else if(operator instanceof Merge){
			return (operator as Merge).mergedLanguage
		}
		else if(operator instanceof Slice){
			return (operator as Slice).slicedLanguage
		}
		return null
	}
<<<<<<< 553867e488f5974d20ad10d6fdc7b2cf7292f2b7
>>>>>>> Melange validator: overriding error marker for Merge, Slice and Inherit operator
=======
	
	/**
	 * Find {@link className} in the result of {@link op}.
	 * Return null if not found or if {@link op} is not a Merge,Slice or Inheritance
	 */
	private def EClass findClass(Operator op, String className){
		val superLang = getLanguage(op) //FIXME: Slice result may be smaller than the ref Language
		if(superLang != null){
			return superLang.syntax.findClass(className)
		}
		return null
	}
<<<<<<< 21ff547d139b128ab5a46850cfd568df196cd9a3
>>>>>>> Melange validator: refactor overriding error
=======
	
	/**
	 * Return true if {@link method} and {@link operation} have the same name and their arguments'
	 * type are the same.
	 * 
	 * @param method method from a K3 Aspect
	 */
	private def boolean isMatching(JvmOperation method, EOperation operation){
		if(method.simpleName == operation.name){
			val methodParams = method.parameters
			val operationParams = operation.EParameters
			if((methodParams.size -1) == operationParams.size){ //drop the first argument who is the caller in k3 aspects
				for(var int i = 1; i < methodParams.size; i++){
					val methodParamType = methodParams.get(i).actualType.simpleName
					val operationParamType = 
						if(operationParams.get(i-1).EType instanceof EDataType){
							val type = operationParams.get(i-1).EType.name
							switch type {
								case "EBoolean" : "boolean"
								case "EString" : "String"
								case "EByte" : "byte"
								case "EDouble" : "double"
								case "EFloat" : "float"
								case "EInteger" : "Integer"
								case "EInt" : "int"
								case "ELong" : "long"
								case "EShort" : "short"
								default : type
							} 
						}
						else{
							operationParams.get(i-1).EType.name
						}
					if(methodParamType != operationParamType){
						return false
					}
				}
				return true
			}
		}
		return false
	}
>>>>>>> Melange validator: add an error marker when an Aspect declare an operation already in a super Language with a different return type
}
