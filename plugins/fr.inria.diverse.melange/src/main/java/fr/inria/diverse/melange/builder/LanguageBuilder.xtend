package fr.inria.diverse.melange.builder

import com.google.common.collect.HashBasedTable
import com.google.inject.Inject
import com.google.inject.Injector
import fr.inria.diverse.melange.algebra.EmfCompareAlgebra
import fr.inria.diverse.melange.ast.AspectExtensions
import fr.inria.diverse.melange.ast.MetamodelExtensions
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.lib.ModelUtils
import fr.inria.diverse.melange.lib.slicing.ecore.StrictEcore
import fr.inria.diverse.melange.metamodel.melange.Import
import fr.inria.diverse.melange.metamodel.melange.Inheritance
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.LanguageOperator
import fr.inria.diverse.melange.metamodel.melange.Merge
import fr.inria.diverse.melange.metamodel.melange.Operator
import fr.inria.diverse.melange.metamodel.melange.PackageBinding
import fr.inria.diverse.melange.metamodel.melange.Slice
import fr.inria.diverse.melange.metamodel.melange.Weave
import fr.inria.diverse.melange.utils.AspectToEcore
import java.util.ArrayList
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EModelElement
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.common.types.JvmDeclaredType

class Error{
	String message
	EObject location
	
	new(String m, EObject o){
		this.message = m
		this.location = o
	}
}


abstract class Builder{

	protected EPackage model

	def List<Error> make()
	
	def List<Error> preBuild(){
		return new ArrayList
	}
	def List<Error> postBuild(){
		return new ArrayList
	}
	
	def EPackage	getModel(){
		return model
	}
	
	def final List<Error> build(){
		val  List<Error> res = new ArrayList
		
		res.addAll(preBuild())
		res.addAll(make())
		res.addAll(postBuild())
		
		return res
	}
	
	def void reset(){
		model = null
	}
}

abstract class OperatorBuilder extends Builder{
	
	protected Operator source
	
}


abstract class LanguageOperatorBuilder extends OperatorBuilder{

	protected EPackage targetModel
	protected ModelTypingSpaceBuilder root

	override List<Error> preBuild(){
		val langBuilder = root.getBuilder((source as LanguageOperator).targetLanguage)
		if(langBuilder.isBuilding){
			val res = new ArrayList<Error>()
			res.add(new Error("Cyclic dependency between "+(source as LanguageOperator).targetLanguage+" and "+source.owningLanguage,source))
			return res
		}
		targetModel = langBuilder.getModel
		if(targetModel === null){
			val errors = langBuilder.build() //FIXME: avoid rebuild if yet in errors
			if(!errors.isEmpty){
				val res = new ArrayList<Error>()
				res.add(new Error("Language \'"+(source as LanguageOperator).targetLanguage+"\' has errors in its definition ",source))
				return res
			}
			targetModel = langBuilder.getModel()
		}
		return new ArrayList
	}
}

class ImportBuilder extends OperatorBuilder{
	
	@Inject ModelUtils modelUtils
	@Inject extension RenamerHelper
	
	new(Import op){
		this.source = op
	}
	
	override make() {
		val op = source as Import
		model = modelUtils.loadPkg(op.ecoreUri)
		model.applyRenaming(op.mappingRules)
		
		return new ArrayList //TODO: manage load & renaming errors
	}
	
}
class MergeBuilder extends LanguageOperatorBuilder{
	
	@Inject extension RenamerHelper
	
	new(Merge op, ModelTypingSpaceBuilder root){
		this.source = op
		this.root = root
	}
	
	override make() {
		if(targetModel !== null){
			val op = source as Merge
			model = EcoreUtil::copy(targetModel)
			model.applyRenaming(op.mappingRules)
		}
		return new ArrayList
	}
	
}
class SliceBuilder extends LanguageOperatorBuilder{
	
	@Inject extension RenamerHelper
	
	new(Slice op, ModelTypingSpaceBuilder root){
		this.source = op
		this.root = root
	}
	
	override make() {
		if(targetModel != null){
			val op = source as Slice
			val sliceBase = EcoreUtil::copy(targetModel)
			
			val roots = getClasses(sliceBase, op.roots)
			val slicer = new StrictEcore(roots,sliceBase,false,"ecore",false)
			slicer.slice
			
			model = slicer.getclonedElts.filter(EPackage).filter[eContainer===null].head
			model.applyRenaming(op.mappingRules)
		}
		
		return new ArrayList //TODO: manage slice error here?
	}
	
	/**
	 * Search in {@link rootPackage} for EClass named as in {@link classes}
	 */
	private def List<EModelElement> getClasses(EPackage rootPackage, List<String> classes){
		//TODO: manage sub packages
		val res = new ArrayList<EModelElement>()
		
		rootPackage.EClassifiers.filter(EClass).forEach[cl|
			if(classes.contains(cl.name)) res.add(cl)
		]
		
		return res
	}
	
}
class InheritanceBuilder extends LanguageOperatorBuilder{
	
	new(Inheritance op, ModelTypingSpaceBuilder root){
		this.source = op
		this.root = root
	}
	
	override make() {
		if(targetModel != null){
			model = EcoreUtil::copy(targetModel)
		}
		return new ArrayList
	}
	
}
class WeaveBuilder extends OperatorBuilder{
	
	@Inject extension AspectExtensions
	@Inject extension AspectToEcore
	@Inject extension MetamodelExtensions
	
	LanguageBuilder rootLanguage
	
	new(Weave op, LanguageBuilder langBuilder){
		this.source = op
		this.rootLanguage = langBuilder
	}
	
	override make() {
		val className = (source as Weave).aspectTypeRef.aspectAnnotationValue
		val baseClass = rootLanguage.findClass(className)
		val aspect = (source as Weave).aspectTypeRef.type as JvmDeclaredType
		model = aspect.inferEcoreFragment(baseClass)
		
		return new ArrayList
	}
}



class LanguageBuilder extends Builder{
	
	@Inject EmfCompareAlgebra algebra
	@Inject Injector injector
	@Inject extension EcoreExtensions

	ModelTypingSpaceBuilder root
	
	Language source

	boolean isBuilding = false
	List<OperatorBuilder> builders
	
	new(Language l, ModelTypingSpaceBuilder root){
		this.source = l
		this.root = root
	}

	override List<Error> preBuild(){
		isBuilding = true
		return new ArrayList
	}

	override List<Error> postBuild(){
		isBuilding = false
		return new ArrayList
	}

	override List<Error> make(){

		val List<Error> errors = new ArrayList()

		/*
		 * Aspect operators are built at the end since we need to retrieve the aspected
		 * EClass to infer the ecore fragment 
		 */
		val otherOperators = source.operators.filter[!(it instanceof Weave)].toList
		val aspectOperators = source.operators.filter(Weave).map[it as Operator].toList

		builders = new ArrayList
		builders.addAll(createBuilders(otherOperators))
		builders.addAll(createBuilders(aspectOperators))
		builders.forEach[builder |
			errors.addAll(builder.build())
		]

		val EPackage base = builders.head.getModel
		builders.drop(1).forEach[ 
			errors.addAll(base.merge(it.getModel))
		]

		if(base == null){
			errors.add(new Error("Can't build "+source.name, source))
		}

		model = base

		return errors
	}

	/*
	 * Add @merged into @base (-> both can be null)
	 */
	def List<Error> merge(EPackage base, EPackage merged){
		//TODO: Custom merge
		algebra.merge(merged,base)
		
		return new ArrayList //TODO: manage merge errors
	}
	
	def List<OperatorBuilder> createBuilders(List<Operator> operators){
		val List<OperatorBuilder> res = new ArrayList
		
		operators.forEach[op |
			val OperatorBuilder builder = 
				switch op{
					Inheritance : new InheritanceBuilder(op,root)
					Merge       : new MergeBuilder(op,root)
					Slice       : new SliceBuilder(op,root)
					Import      : new ImportBuilder(op)
					Weave       : new WeaveBuilder(op,this)
				}
			res.add(builder)
			injector.injectMembers(builder)
		]
		
		return res
	}
	
	def boolean isBuilding(){
		return isBuilding
	}
	
	def Language getSource(){
		return source
	}
	
	/**
	 * Search in builder for an EClass {@link simpleName}
	 */
	def EClass findClass(String simpleName){
		for(builder : builders){
			val pack = builder.model
			val candidate = pack?.allClasses.findFirst[name == simpleName]
			if(candidate !== null) return candidate
		}
		return null
	}
}

class ModelTypingSpaceBuilder{
	
	@Inject Injector injector
	Map<Language,LanguageBuilder> registry = new HashMap
	
	/**
	 * Get a builder to construct a model for {@link l}.
	 * Return always the same builder for a same Language.
	 */
	def LanguageBuilder getBuilder(Language l){
		var res = registry.get(l)
		if(res === null){
			
			res = new LanguageBuilder(l,this)
			injector.injectMembers(res)
			registry.put(l, res)
		}
		return res
	}
}

class RenamerHelper{
	
	@Inject extension EcoreExtensions
	
	/**
	 * Renames packages, classes & features from {@link model} according to the rules from {@link mappingRules}
	 */
	def void applyRenaming(EPackage modelRoot, List<PackageBinding> mappingRules){
		if (mappingRules.empty)
			return;

		mappingRules.forEach[ packageRule |
			val sourcePack = if(modelRoot.name == packageRule.from) modelRoot else modelRoot.findSubPackage(packageRule.from.substring(packageRule.from.indexOf(".")+1))
			packageRule.classes.forEach[classRule |
				sourcePack.EClassifiers.filter(EClass).filter[name == classRule.from].forEach[ clazz |
					
					//Change name for properties
					classRule.properties.forEach[propertyRule |
						var EStructuralFeature target = clazz.EReferences.findFirst[name == propertyRule.from]
						if(target == null) target = clazz.EAttributes.findFirst[name == propertyRule.from]
						
						if(target != null) target.name = propertyRule.to
					]
					
					//Change name for classes
					clazz.name = classRule.to
				]
			]
		]
		
		//Build new package hierachy
		val oldRootName = modelRoot.name
		val renamedPackages = new HashSet<EPackage>() 
		val targetedPackages = new HashSet<EPackage>()
		mappingRules.forEach[ packageRule |
			val oldPackages = packageRule.from.split("\\.")
			val newPackages = packageRule.to.split("\\.")

			//Register source packages
			var current = modelRoot
			for(var int i = 1; i < oldPackages.size; i++){
				val packName = oldPackages.get(i)
				current = current.ESubpackages.findFirst[name == packName]
			}
			renamedPackages.add(current)
			
			//Register targeted packages & Creates new packages
			current = modelRoot
			targetedPackages.add(current)
			for(var int i = 1; i < newPackages.size; i++){
				val packName = newPackages.get(i)
				var nextCurrent = current.ESubpackages.findFirst[name == packName]
				if(nextCurrent == null){
					nextCurrent = EcoreFactory.eINSTANCE.createEPackage
					nextCurrent.name = packName
					nextCurrent.nsPrefix = packName
					nextCurrent.nsURI = current.nsURI+packName+"/"
					current.ESubpackages.add(nextCurrent)
				}
				current = nextCurrent
				targetedPackages.add(current)
			}
			
			if(newPackages.head != modelRoot.name){
				modelRoot.name = newPackages.head
			}
		]
		
		//Register classes to be moved
		val movedClasses = HashBasedTable.create
		val movedPackages = HashBasedTable.create
		mappingRules.forEach[ packageRule |
			val sourcePack = if(oldRootName == packageRule.from) modelRoot else modelRoot.findSubPackage(packageRule.from.substring(packageRule.from.indexOf(".")+1))
			val targetPack = if(modelRoot.name == packageRule.to) modelRoot else modelRoot.findSubPackage(packageRule.to.substring(packageRule.to.indexOf(".")+1))
			
			if(sourcePack != targetPack){
				val classes = new ArrayList(sourcePack.EClassifiers)
				movedClasses.put(sourcePack,targetPack,classes)
				
				val subPackages = new ArrayList(sourcePack.ESubpackages)
				subPackages.removeAll(targetedPackages)
				subPackages.removeAll(renamedPackages)
				movedPackages.put(sourcePack,targetPack,subPackages)
			}
		]
		
		//Move classes
		movedClasses.cellSet.forEach[cell |
			val sourcePack = cell.rowKey
			val targetPack = cell.columnKey
			val classes = cell.value
			targetPack.EClassifiers.addAll(classes)
			sourcePack.EClassifiers.remove(classes)
			
		]
		//Move subpackages
		movedPackages.cellSet.forEach[cell |
			val sourcePack = cell.rowKey
			val targetPack = cell.columnKey
			val subPackages = cell.value
			targetPack.ESubpackages.addAll(subPackages)
			sourcePack.ESubpackages.remove(subPackages)
			
			//Deleted renamed packages
			if(!targetedPackages.contains(sourcePack)){
				sourcePack.ESuperPackage.ESubpackages.remove(sourcePack)
			}
		]
		
	}
}