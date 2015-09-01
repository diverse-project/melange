package fr.inria.diverse.melange.builder

import org.eclipse.emf.ecore.EPackage
import java.util.List
import fr.inria.diverse.melange.metamodel.melange.LanguageOperator
import java.util.ArrayList

abstract class LanguageOperatorBuilder extends OperatorBuilder{

	protected EPackage targetModel
	protected ModelTypingSpaceBuilder root

	override preBuild(){
		super.preBuild
		
		val langBuilder = root.getBuilder((source as LanguageOperator).targetLanguage)
		
		if(langBuilder.isBuilding){
			errors.add(new Error("Cyclic dependency between "+(source as LanguageOperator).targetLanguage+" and "+source.owningLanguage,source))
		}
		
		targetModel = langBuilder.getModel
		if(targetModel === null && langBuilder.errors.isEmpty){
			langBuilder.build()
			if(!langBuilder.errors.isEmpty){
				errors.add(new Error("Language \'"+(source as LanguageOperator).targetLanguage+"\' has errors in its definition ",source))
			}
			targetModel = langBuilder.getModel()
		}
	}
}