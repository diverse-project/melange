package fr.inria.diverse.melange.jvmmodel

import fr.inria.diverse.melange.metamodel.melange.Mapping
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import org.eclipse.xtext.util.internal.Stopwatches
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.ast.ASTHelper
import com.google.inject.Inject

class MappersInferrer{
	
	@Inject extension ASTHelper
	@Inject extension MetaclassMapperInferrer
	def void generateMappers(Mapping mapping, ModelTypingSpace root, IJvmDeclaredTypeAcceptor acceptor, extension JvmTypeReferenceBuilder builder){
		val task = Stopwatches.forTask("generate mapping")
		task.start
		
		val sourceMT = root.modelTypes.findFirst[name == mapping.from]
		val targetMT = root.modelTypes.findFirst[name == mapping.to]
		
		mapping.rules.forEach[classMapping | classMapping.generateMapper(sourceMT, targetMT, acceptor, builder)]
		
		task.stop
	}
}