package fr.inria.diverse.melange.builder

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import java.util.List
import fr.inria.diverse.melange.metamodel.melange.Operator
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import java.util.Map
import fr.inria.diverse.melange.metamodel.melange.Language
import java.util.HashMap
import java.util.ArrayList

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

	def List<Error> preBuild()
	def List<Error> postBuild()
	def List<Error> make()
	
	def EPackage	getModel(){
		return model
	}
	
	def final List<Error> build(){
		preBuild()
		make()
		postBuild()
	}
	
}


/*
 * To be subclassed for each operator
 */
abstract class OperatorBuilder extends Builder{
	
	protected Operator source

}


abstract class LanguageOperatorBuilder extends OperatorBuilder{

	ModelTypingSpace root

	override List<Error> preBuild(){
		val ModelTypingSpaceBuilder project = null//TODO
		val langBuilder = project.getBuilder(source.targetLanguage)
		if(langBuilder.isBuilding){
			val res = new ArrayList<Error>()
			res.add(new Error("Cyclic dependency between "+source.targetLanguage+" and "+source.owningLanguage,source))
			return res
		}
		var langModel = langBuilder.getModel
		if(langModel === null){
			val errors = langBuilder.build() //FIXME: avoid rebuild if yet in errors
			if(!errors.isEmpty){
				val res = new ArrayList<Error>()
				res.add(new Error("Language \'"+source.targetLanguage+"\' has errors in its definition ",source))
				return res
			}
			langModel = langBuilder.getModel()
		}
		return null//TODO
	}
}



class LanguageBuilder extends Builder{

	ModelTypingSpaceBuilder root
	
	Language source

	boolean isBuilding = false
	
	new(Language l, ModelTypingSpaceBuilder root){
		this.source = l
		this.root = root
	}

	override List<Error> preBuild(){
		isBuilding = true
		return null//TODO
	}

	override List<Error> postBuild(){
		isBuilding = false
		return null//TODO
	}

	def List<Error> make(Language lang){

		val List<Error> errors = new ArrayList()

		val List<OperatorBuilder> builders = createBuilder(lang.operators)
		builders.forEach[builder |
			errors.addAll(builder.build())
		]

		val EPackage base = builders.head.getModel
		builders.drop(1).forEach[ 
			errors.addAll(base.merge(it.model))
		]

		if(base == null){
			errors.add(new Error("Can't build "+lang.name, lang))
		}

		model = base

		return errors
	}

	/*
	 * Add @merged into @base (-> both can be null)
	 */
	def List<Error> merge(EPackage base, EPackage merged){
		//Custom merge
	}
	
	def List<OperatorBuilder> createBuilder(List<Operator> operators){
		
	}
	
	def boolean isBuilding(){
		return isBuilding
	}
	
	override make() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

}

class ModelTypingSpaceBuilder{
	
	Map<Language,LanguageBuilder> registry = new HashMap
	
	def LanguageBuilder getBuilder(Language l){
		var res = registry.get(l)
		if(res === null){
			res = new LanguageBuilder(l,this)
			registry.put(l, res)
		}
		return res
	}

}