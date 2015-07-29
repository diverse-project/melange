package fr.inria.diverse.melange.processors

import com.google.inject.Inject
import fr.inria.diverse.melange.algebra.ModelTypeAlgebra
import fr.inria.diverse.melange.ast.AspectExtensions
import fr.inria.diverse.melange.ast.MetamodelExtensions
import fr.inria.diverse.melange.eclipse.EclipseProjectHelper
import fr.inria.diverse.melange.metamodel.melange.Aspect
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.utils.AspectToEcore
import java.util.Properties
import org.eclipse.core.resources.IProject

/**
 * This class merges all aspects into the Metamodel
 */
class AspectsWeaver extends DispatchMelangeProcessor
{
	@Inject ModelTypeAlgebra algebra
	@Inject extension AspectExtensions
	@Inject extension MetamodelExtensions
	@Inject extension AspectToEcore
	@Inject extension EclipseProjectHelper

	def dispatch void preProcess(Language l, boolean preLinkingPhase) {
		l.semantics
		.filter[isComplete]
		// First, create all the new meta-classes
		// then, weave aspects
		.sortWith[aspA, aspB |
			if (aspA.hasAspectAnnotation)
				1
			else
				-1
		].forEach[asp |
			val className = asp.aspectTypeRef.aspectAnnotationValue

			if (className !== null)
				asp.aspectedClass = l.syntax.findClass(className)

			asp.ecoreFragment = asp.inferEcoreFragment(l)
			algebra.weaveAspect(l, asp)
		]
	}

	def dispatch void postProcess(Language l) {
		l.semantics
		.filter[isComplete]
		.forEach[asp |
			asp.aspectedClass = null
			asp.ecoreFragment = null
		]
	}
	
	/**
	 * Look in Properties file to get the class associated to the aspect
	 */
	def String getAspectedClassName(Metamodel mm, Aspect asp){
		var res = ""
		
		val typeAspect = asp.aspectTypeRef.type
		val fqnAspect = typeAspect.getQualifiedName()
		val IProject aspectProject = typeAspect.eResource.project
		val file = aspectProject.getFile("/META-INF/xtend-gen/"+aspectProject.getName()+".k3_aspect_mapping.properties")
		val Properties properties = new Properties();
		properties.load(file.getContents());
		res = properties.entrySet.findFirst[elem | elem.value.equals(fqnAspect)].key as String
		val cut = res.lastIndexOf('.')
		res = res.substring(cut+1)
	    
	    return res
	}
}
