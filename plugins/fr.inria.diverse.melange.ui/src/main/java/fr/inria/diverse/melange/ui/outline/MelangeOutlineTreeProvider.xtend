package fr.inria.diverse.melange.ui.outline

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.Transformation
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.ecore.EAnnotation
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode
import org.eclipse.emf.ecore.EClass
import fr.inria.diverse.melange.lib.EcoreExtensions
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EOperation

class MelangeOutlineTreeProvider extends DefaultOutlineTreeProvider
{
	@Inject extension ModelingElementExtensions
	@Inject extension EcoreExtensions

	def boolean _isLeaf(Transformation t) {
		return true
	}

	def boolean _isLeaf(EStructuralFeature a){
	    return true
	}

    def void _createNode(IOutlineNode parentNode, JvmTypeReference ref) {
		// Nope
    }

    def void _createNode(IOutlineNode parentNode, GenModel gm) {
		// Nope
    }

	def void _createNode(IOutlineNode parentNode, Metamodel mm) {
		// Nope
	}

	def void _createNode(IOutlineNode parentNode, EAnnotation a){
	    // Nope
	}


	def void _createNode(IOutlineNode parentNode, ModelType mt) {
		val mNode = createEObjectNode(parentNode, mt)

		mt.pkgs.filter[ESuperPackage === null].forEach[pkg |
		    createNode(mNode, pkg)
		]
	}

	def void _createNode(IOutlineNode parentNode, Language l) {
		val mNode = createEObjectNode(parentNode, l)

		l.syntax.pkgs.filter[ESuperPackage === null].forEach[pkg |
		    createNode(mNode, pkg)
		]

		l.semantics.forEach[asp |
		    createNode(mNode, asp)
		]
	}

    def void _createNode(IOutlineNode parentNode, EPackage p){
        val mNode = createEObjectNode(parentNode, p)
        
        val target = mNode.isInsideModelTypeOrAspect
    }
    
    def void _createNode(IOutlineNode parentNode, EClass c){
    	if(parentNode.isInsideModelTypeOrAspect || !c.isAspectSpecific){
    		createEObjectNode(parentNode, c)
    	}
    }
    
    def void _createNode(IOutlineNode parentNode, EReference r) {
    	if(parentNode.isInsideModelTypeOrAspect || !r.isAspectSpecific){
			createEObjectNode(parentNode, r)
		}
    }
    
	def void _createNode(IOutlineNode parentNode, EAttribute a) {
		if(parentNode.isInsideModelTypeOrAspect || !a.isAspectSpecific){
			createEObjectNode(parentNode, a)
		}
    }
    
    def void _createNode(IOutlineNode parentNode, EOperation o) {
		if(parentNode.isInsideModelTypeOrAspect || !o.isAspectSpecific){
			createEObjectNode(parentNode, o)
		}
    }
    
    private def isInsideModelTypeOrAspect(IOutlineNode node){
    	var parent = node?.parent
    	while(parent !== null){
    		if(parent instanceof EObjectNode){
    			if(parent.EClass.name == "ModelType" || parent.EClass.name == "Aspect"){
    				return true
    			}
    		}
    		
    		parent = parent.parent
    	}
    	return false
    }

}
