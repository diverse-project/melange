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

	def dispatch void preProcess(Metamodel mm) {
		mm.aspects.forEach[asp |
			
			if (asp.isComplete) {
				var className = asp.aspectAnnotationValue
				var cls = mm.findClass(className)
				
				if(cls == null){
					className = getAspectedClassName(mm,asp)
					cls = mm.findClass(className)
				}
				
				asp.aspectedClass = cls

				if (asp.aspectedClass !== null) {
					asp.inferEcoreFragment
					algebra.weaveAspect(mm, asp)
				}
			}
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
