package fr.inria.diverse.melange.builder

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.AspectExtensions
import fr.inria.diverse.melange.metamodel.melange.Weave
import fr.inria.diverse.melange.utils.AspectToEcore
import java.util.ArrayList
import org.eclipse.xtext.common.types.JvmDeclaredType

class WeaveBuilder extends OperatorBuilder{
	
	@Inject extension AspectExtensions
	@Inject extension AspectToEcore
	
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
	
	def Weave getSource(){
		return source as Weave
	}
}