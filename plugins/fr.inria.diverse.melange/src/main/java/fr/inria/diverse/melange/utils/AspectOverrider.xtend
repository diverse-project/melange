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
package fr.inria.diverse.melange.utils

import com.google.common.collect.HashMultimap
import com.google.common.collect.SetMultimap
import com.google.inject.Inject
import fr.inria.diverse.melange.ast.AspectExtensions
import fr.inria.diverse.melange.ast.LanguageExtensions
import fr.inria.diverse.melange.eclipse.EclipseProjectHelper
import fr.inria.diverse.melange.metamodel.melange.Language
import java.nio.file.Files
import java.nio.file.Paths
import java.util.List
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.core.resources.IResource

class AspectOverrider {
	
	@Inject extension LanguageExtensions
	@Inject extension AspectExtensions
	@Inject EclipseProjectHelper eclipseHelper
	
	def void generateAspectJ(Language l){
		val packageName = l.aspectsNamespace
		val aspectName = "_MelangeDispatcher"
		val targetProject = ResourcesPlugin.workspace.root.getProject(l.externalRuntimeName)
		val targetAspectFolder = targetProject.locationURI.path + "/src-gen/" + packageName.replaceAll("\\.","/")
		
		
		val aspects = l.semantics.map[it.aspectTypeRef.type as JvmDeclaredType]
		val advices = generateAdvices(aspects)
		if(!advices.isEmpty){
			val fileContent = new StringBuilder
			fileContent.append("package "+packageName + ";\n\n")
			fileContent.append("public aspect "+aspectName+" {\n")
			fileContent.append(advices)
			fileContent.append("}\n")
			
			val path = Paths.get(targetAspectFolder+"/"+aspectName+".aj");
			val writer = Files.newBufferedWriter(path)
			writer.write(fileContent.toString)
			writer.flush
			
			targetProject.convertToAspectJ
			targetProject.refreshLocal(IResource.DEPTH_INFINITE, null);
		}
	}
	
	/**
	 * Generate AspectJ advice to intercept methods calls when some
	 * K3 aspects override others K3 aspects
	 */
	private def String generateAdvices(List<JvmDeclaredType> aspects) {
		
		val content = new StringBuilder
		val SetMultimap<JvmOperation, JvmOperation> res = HashMultimap.create
		
		// Compute hierarchy
		val SetMultimap<JvmDeclaredType, JvmDeclaredType> overriders = HashMultimap.create
		aspects.forEach[ cls |
			val ancestors = cls.allSuperAspects
			if(!ancestors.isEmpty)
				overriders.putAll(cls,ancestors)
		]
		
		// Find overrides
		overriders.keySet.forEach[ childCls |
			val ancestors = overriders.get(childCls)
			childCls.members.filter(JvmOperation).forEach[ m |
				ancestors.filter[hasMethod(m)].forEach[ superCls |
					// add a new rule
					val target = superCls.members.filter(JvmOperation).findFirst[isEqual(m)]
					res.storeRule(m,target)
				]
			]
		]
		
		//Generate AspectJ advice
		if(res.keySet.size > 0) {
			
			res.keySet.forEach[ m1 |
				
				val returnType = m1.returnType.type.qualifiedName
				val calledMethodFqn = m1.qualifiedName
				val parameters = m1.parameters.map[parameterType.type.qualifiedName+" "+name].join(",")
				val parameterTypes = m1.parameters.map[parameterType.type.qualifiedName].join(",")
				val parameterNames = m1.parameters.map[name].join(",")
				
				res.get(m1).forEach[ m2 |
					val targetMethodFqn = m2.qualifiedName
					content.append("	"+returnType+" around("+parameters+") : call("+returnType+" "+targetMethodFqn+"("+parameterTypes+")) && args("+parameterNames+") {\n")
					if(returnType != "void")
						content.append("		return "+calledMethodFqn+"("+parameterNames+");\n")
					else
						content.append("		"+calledMethodFqn+"("+parameterNames+");\n")
					content.append("	}\n")
				]
			]
			
			return content.toString
		}
		
		return ""
	}
	
	private def void storeRule(SetMultimap<JvmOperation, JvmOperation> storage, JvmOperation called, JvmOperation hidden){
		val colider = storage.keySet.findFirst[isEqual(called)]
		if(colider ===  null || colider === called){
			storage.put(called,hidden)
		}
		else if(called.declaringType.allSuperAspects.contains(colider.declaringType)){
			val toMove = storage.get(colider)
			storage.removeAll(colider)
			storage.putAll(called,toMove)
			storage.put(called,hidden)
		}
	}
	
	private def boolean hasMethod(JvmDeclaredType cls, JvmOperation method) {
		cls.members.filter(JvmOperation).exists[isEqual(method)]
	}
	
	private def boolean isEqual(JvmOperation m1, JvmOperation m2) {
		   m1.simpleName == m2.simpleName
		&& m1.parameters.size == m2.parameters.size
		&& m1.parameters.forall[param |
			val index = m1.parameters.indexOf(param)
			m2.parameters.get(index).parameterType.type == param.parameterType.type
		]
	}
	
	private def List<JvmDeclaredType> getAllSuperAspects(JvmDeclaredType cls) {
		val res = newArrayList
		if(!cls.hasAspectAnnotation)
			return res
		
		var current = cls.superTypes.head.type as JvmDeclaredType
		while(current !== null && current.hasAspectAnnotation){
			res.add(current)
			current = current.superTypes.head.type as JvmDeclaredType
		}
		
		return res
	}
	
	private def void convertToAspectJ(IProject prj){
		eclipseHelper.addDependencies(prj,#["org.aspectj.runtime"])
		eclipseHelper.addNature(prj,"org.eclipse.ajdt.ui.ajnature")
		eclipseHelper.addBuilder(prj,"org.eclipse.ajdt.core.ajbuilder")
	}
}