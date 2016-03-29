package fr.inria.diverse.melange.experimental

import fr.inria.diverse.melange.metamodel.melange.CustomLanguageOperator
import java.util.List
import fr.inria.diverse.melange.builder.BuilderError

interface Parser{
	def void parse(String rawText)
}

abstract class AbstractParser implements Parser{
	
	protected String source
	protected List<BuilderError> errors
	
	new(CustomLanguageOperator op){
		errors = newArrayList
		val args = op.parameters.trim
		
		if(args.charAt(0) != "[" || args.charAt(args.length-1) != "]"){
			//Raise syntax error
		}
		
		if(args.length > 2){
			source = args.substring(1,args.length-1)
		}
		else{
			source = ""
		}
	}
	
	def void doParse(){
		parse(source)
	}
	
	def List<BuilderError> getErrors(){
		return errors
	}
	
}

class Slice2Parser extends AbstractParser{
	
	/*
	 * Parse result
	 */
	List<String> roots
	boolean optionLowerTypes
	boolean card1
	
	/*
	 * Parameters
	 */
	final public String SUBTYPES = "SUBTYPES"
	final public String CARD1 = "CARD1"
	
	new(CustomLanguageOperator op) {
		super(op)
		roots = newArrayList
		optionLowerTypes= false
		card1 = false
	}
	
	override parse(String rawText) {
		//FIXME: simple stupid parsing
		
		if(source.contains(SUBTYPES)){
			optionLowerTypes = true
		}
		if(source.contains(CARD1)){
			card1 = true
		}
		
		val startClasses = rawText.indexOf("<")
		val endClasses = rawText.indexOf(">")
		val classes = rawText.substring(startClasses+1,endClasses).split(",")
		roots.addAll(classes)
	}
	
	def List<String> getRoots(){
		return roots
	}
	
	def boolean isLowerTypes(){
		return optionLowerTypes
	}
	
	def boolean isCard1(){
		return card1
	}
}