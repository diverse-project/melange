package fr.inria.diverse.melange.builder

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.AspectExtensions
import fr.inria.diverse.melange.metamodel.melange.Weave
import fr.inria.diverse.melange.utils.AspectToEcore
import org.eclipse.xtext.common.types.JvmDeclaredType

class WeaveBuilder extends OperatorBuilder<Weave> {
	@Inject extension AspectExtensions
	@Inject extension AspectToEcore
	LanguageBuilder rootLanguage

	new(Weave op, LanguageBuilder langBuilder) {
		super(op)
		this.rootLanguage = langBuilder
	}

	override make() {
		val aspRef = source.aspectTypeRef

		if (aspRef?.type instanceof JvmDeclaredType) {
			val className = aspRef.aspectAnnotationValue
			val baseClass = rootLanguage.findClass(className)
			val aspect = aspRef.type as JvmDeclaredType
			model = aspect.inferEcoreFragment(baseClass)
		}
	}

	def Weave getSource() {
		return source
	}
}
