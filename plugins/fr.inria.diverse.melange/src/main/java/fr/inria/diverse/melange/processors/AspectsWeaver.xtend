package fr.inria.diverse.melange.processors

import com.google.inject.Inject
import fr.inria.diverse.melange.algebra.ModelTypeAlgebra
import fr.inria.diverse.melange.ast.MetamodelExtensions
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.utils.AspectToEcore
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import fr.inria.diverse.melange.eclipse.EclipseProjectHelper
import org.eclipse.core.resources.IProject
import fr.inria.diverse.melange.metamodel.melange.Aspect
import java.util.Properties

/**
 * This class merges all aspects into the Metamodel
 */
class AspectsWeaver extends DispatchMelangeProcessor
{
	@Inject ModelTypeAlgebra algebra
	@Inject extension MetamodelExtensions
	@Inject extension AspectToEcore
	@Inject extension EclipseProjectHelper

	def dispatch void preProcess(Metamodel mm, boolean preLinkingPhase) {
		mm.aspects
		.filter[isComplete]
		// First, create all the new meta-classes
		// then, weave aspects
		.sortWith[aspA, aspB |
			if (aspA.hasAspectAnnotation)
				1
			else
				-1
		].forEach[asp |
			val className = asp.aspectAnnotationValue

			if (className !== null)
				asp.aspectedClass = mm.findClass(className)

			asp.ecoreFragment = asp.inferEcoreFragment(mm)
			algebra.weaveAspect(mm, asp)
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
