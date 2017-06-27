/*******************************************************************************
 * Copyright (c) 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
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
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.ast.LanguageExtensions
import fr.inria.diverse.melange.ast.ASTHelper
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode
import org.eclipse.xtext.ui.IImageHelper
import fr.inria.diverse.melange.metamodel.melange.Inheritance

class MelangeOutlineTreeProvider extends DefaultOutlineTreeProvider
{
	@Inject extension ModelingElementExtensions
	@Inject extension EcoreExtensions
	@Inject extension LanguageExtensions
	@Inject extension ASTHelper
	
	@Inject
	private IImageHelper imageHelper;

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

    def void _createChildren(IOutlineNode parentNode, ModelTypingSpace root) {
    	super._createChildren(parentNode,root)
    	val externalLangs = root
			.languages
			.map[allDependencies]
			.flatten
			.filter[it.eContainer !== root]
			.toSet
		externalLangs.forEach[lang |
			val img = imageHelper.getImage("link.png")
			val txt = '''«lang.name»«FOR t : lang.operators.filter(Inheritance).map[targetLanguage] BEFORE '\u25C0' SEPARATOR ', '»«t.name»«ENDFOR»«FOR t : lang.implements BEFORE ' \u25C1 ' SEPARATOR ', '»«t.name»«ENDFOR»'''.toString
			createEObjectNode(parentNode, lang, img, txt, true)
		]
    }
}
