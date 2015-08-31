package fr.inria.diverse.melange.builder

import org.eclipse.emf.ecore.EPackage
import java.util.List
import fr.inria.diverse.melange.metamodel.melange.LanguageOperator
import java.util.ArrayList

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