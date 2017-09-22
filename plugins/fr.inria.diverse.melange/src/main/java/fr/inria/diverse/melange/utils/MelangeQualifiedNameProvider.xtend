package fr.inria.diverse.melange.utils

import org.eclipse.xtext.xbase.scoping.XbaseQualifiedNameProvider
import org.eclipse.emf.ecore.EObject
import fr.inria.diverse.melange.metamodel.melange.ImportDsl
import fr.inria.diverse.melange.metamodel.melange.ModelType
import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.nodemodel.util.NodeModelUtils

class MelangeQualifiedNameProvider extends XbaseQualifiedNameProvider {
	
	@Inject extension IQualifiedNameConverter
	
	override getFullyQualifiedName(EObject obj) {
		
		if(obj instanceof ImportDsl) {
			return getFullyQualifiedName(obj)
		}
		else if(obj instanceof ModelType) {
			if(obj.extracted instanceof ImportDsl) {
				val importName = getFullyQualifiedName(obj.extracted as ImportDsl)
				val simpleName = importName.lastSegment + "MT"
				return importName.skipLast(1).append(simpleName)
			}
		}
		
		super.getFullyQualifiedName(obj)
	}
	
	def QualifiedName getFullyQualifiedName(ImportDsl lang) {
		
		if(lang.name !== null)
			return lang.name.toQualifiedName
		
		val dslRef = lang.eClass.EReferences.findFirst[name == "dsl"]
		val node = NodeModelUtils.findNodesForFeature(lang,dslRef)
		return node.head.text.toQualifiedName
	}
}