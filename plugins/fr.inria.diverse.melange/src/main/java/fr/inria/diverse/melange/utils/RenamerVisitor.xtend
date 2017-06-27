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

import java.util.Map
import org.eclipse.jdt.core.dom.AST
import org.eclipse.jdt.core.dom.ASTNode
import org.eclipse.jdt.core.dom.ASTVisitor
import org.eclipse.jdt.core.dom.Block
import org.eclipse.jdt.core.dom.CastExpression
import org.eclipse.jdt.core.dom.CompilationUnit
import org.eclipse.jdt.core.dom.EnhancedForStatement
import org.eclipse.jdt.core.dom.Expression
import org.eclipse.jdt.core.dom.ForStatement
import org.eclipse.jdt.core.dom.ImportDeclaration
import org.eclipse.jdt.core.dom.MemberValuePair
import org.eclipse.jdt.core.dom.MethodDeclaration
import org.eclipse.jdt.core.dom.MethodInvocation
import org.eclipse.jdt.core.dom.Name
import org.eclipse.jdt.core.dom.NameQualifiedType
import org.eclipse.jdt.core.dom.NormalAnnotation
import org.eclipse.jdt.core.dom.QualifiedName
import org.eclipse.jdt.core.dom.QualifiedType
import org.eclipse.jdt.core.dom.SimpleName
import org.eclipse.jdt.core.dom.SimpleType
import org.eclipse.jdt.core.dom.SingleVariableDeclaration
import org.eclipse.jdt.core.dom.Statement
import org.eclipse.jdt.core.dom.TypeDeclaration
import org.eclipse.jdt.core.dom.VariableDeclarationExpression
import org.eclipse.jdt.core.dom.VariableDeclarationFragment
import org.eclipse.jdt.core.dom.VariableDeclarationStatement
import org.eclipse.emf.ecore.EClass
import java.util.List

class RenamerVisitor extends ASTVisitor{

	RenamingRuleManager rulesManager
	
	Map<ImportDeclaration,Name> newImportsNames
	Map<SimpleType,Name> newSimpleTypesNames
	Map<MethodInvocation,SimpleName> newMethodNames
	Map<MethodDeclaration,SimpleName> newMethodDeclNames
	
	List<EClass> allClasses
		
	new(RenamingRuleManager rulesManager, List<EClass> allClasses) {
		this.rulesManager = rulesManager
		
		newImportsNames = newHashMap
		newSimpleTypesNames = newHashMap
		newMethodNames = newHashMap
		newMethodDeclNames = newHashMap 
		
		this.allClasses = allClasses
	}
	
	override visit(ImportDeclaration node) {
		
		val String nodeName = node.name.toString
		var String newNodeName = null
		
		if(nodeName.endsWith(".*")){ //Package import
			val importedPackage = nodeName.substring(0, nodeName.length - 2);
			newNodeName = importedPackage.getDirectRenaming + ".*"
		}
		else{ //Class import
			val rule = rulesManager.allClassRules.findFirst[key == nodeName]
			if(rule !== null){
				newNodeName = rule.value
			}
			else{
				val packageName = nodeName.qualifierPart
				val newPackageName = packageName.getDirectRenaming
				if(newPackageName !== null){
					val className = nodeName.lastPart
					newNodeName = newPackageName + "." + className
				}
			}
		}
		
		if(newNodeName !== null){
			val newName = node.AST.toName(newNodeName)
			newImportsNames.put(node,newName)	
		}
		
		return super.visit(node)
	}
	
	override visit(SimpleType node) {
		
		val typeName = node.name
		
		val rule = typeName.getClassRule()
		if(rule !== null){
			
			if(typeName instanceof SimpleName){
				val toName = rule.value.lastPart
				val newName = node.AST.newSimpleName(toName)
				newSimpleTypesNames.put(node,newName)	
			}
			else if(typeName instanceof QualifiedName){
				val newName = node.AST.toName(rule.value)
				newSimpleTypesNames.put(node,newName)	
			}
		}
		else{
			if(typeName instanceof QualifiedName){
				val packagePart = typeName.toString.substring(0,typeName.toString.lastIndexOf("."))
				val simpleName = typeName.toString.substring(typeName.toString.lastIndexOf(".")+1)
				val renamedType = packagePart.renaming+"."+simpleName
				val candidate = allClasses.findFirst[renamedType.endsWith(it.fqn)]
				
				if(candidate !== null){
					val newName = node.AST.toName(renamedType)
					newSimpleTypesNames.put(node,newName)	
				}
			}
		}
		
		return super.visit(node)
	}
	
	override visit(MethodInvocation node) {
		
		//Match name
		val methodName = node.name
		val candidateRules = rulesManager.allPropertyRules.filter["get"+key.lastPart.toFirstUpper == methodName.toString ||
				"set"+key.lastPart.toFirstUpper == methodName.toString
			]
		
		//Match parameters
		
		//Match return type
		
		//Match invocator
		val exp = node.expression
		if(exp instanceof Name){
			val invokerName = exp
			
			val aspectEntry = rulesManager.getRulesForAspect(invokerName.toString)
			if(!aspectEntry.isNullOrEmpty){ //Aspect's method calls
				val rule = aspectEntry.findFirst[rule | rule.key.lastPart == methodName.toString]
				if(rule !== null){
					val newName = rule.value.lastPart
					newMethodNames.put(node,node.AST.newSimpleName(newName))
				}
			}
			else{ //other calls
				val typeName = getType(invokerName)
				val targetedRules = candidateRules.filter[rule |
						rule.key.qualifierPart == typeName ||
						rule.key.qualifierPart.lastPart == typeName
					]
				val importedRule = targetedRules.findFirst[rule | 
													val clazz = rule.key.qualifierPart
													return isImported(methodName.root as CompilationUnit,clazz)
												]
				if(importedRule !== null){
					//Rename
					val prefix = methodName.toString.substring(0,3) //'get' or 'set'
					val newName = prefix + importedRule.value.lastPart.toFirstUpper
					newMethodNames.put(node,node.AST.newSimpleName(newName))
				}
			}
		}
		else if(exp instanceof CastExpression){
			//TODO
		}
		else{
			//FIXME: should check other kind of expression
		}

		return super.visit(node)
	}
	
	override visit(MethodDeclaration node) {
		
		val methodName = node.name.toString
		val candidateRules = rulesManager.allPropertyRules.filter[rule | rule.key.lastPart == methodName]
		
		val container = node.parent
		if(container instanceof TypeDeclaration){
			val clazz = container
			val aspectAnnot = clazz.modifiers().filter(NormalAnnotation).findFirst[typeName.toString == "Aspect"]
			if(aspectAnnot !== null){
				val aspectedClazz = (aspectAnnot.values.get(0) as MemberValuePair).value.toString.qualifierPart
				val rule = candidateRules.findFirst[rule | 
					val candidateClazz = rule.key.qualifierPart
					candidateClazz.lastPart == aspectedClazz &&
					isImported(node.root as CompilationUnit,candidateClazz)
				]
				if(rule !== null){
					val newName = rule.value.lastPart
					newMethodDeclNames.put(node, node.AST.newSimpleName(newName))
				}
			}
		}
//		boolean needRenaming = isProperty(MethodDeclaration method, )
		
		return super.visit(node)
	}
	
	/**
	 * Update the AST after all visits
	 */
	override postVisit(ASTNode node) {
		if(node instanceof CompilationUnit){
			newImportsNames.entrySet.forEach[entry|
				entry.key.name = entry.value
			]
			newSimpleTypesNames.entrySet.forEach[entry|
				entry.key.name = entry.value
			]
			newMethodNames.entrySet.forEach[entry|
				entry.key.name = entry.value
			]
			newMethodDeclNames.entrySet.forEach[entry|
				entry.key.name = entry.value
			]
		}
		
		super.postVisit(node)
	}
	
	
	/**
	 * Return the type in the declaration of {@link variable}.
	 * Return null if can't find any declaration
	 */
	def String getType(Name variable){
		return getType(variable,variable.parent)		
	}
	
	/**
	 * Search if {@link container} (or its parents) defines {@link variable} and return
	 * the corresponding type.
	 * 
	 * Return null if not found
	 */
	def String getType(Name variable, ASTNode container){
		
		if(container === null){
			
			return null
		}
		else if(container instanceof Expression){
			
			return getType(variable, container.parent)
		}
		else if(container instanceof Statement){
			
			if(container instanceof Block){
				val block = container
				val varDef = block.statements.filter(VariableDeclarationStatement).findFirst[varDecl |
						varDecl.fragments.exists[va | (va as VariableDeclarationFragment).name.toString == variable.toString]
					]
				if(varDef !== null && varDef.startPosition < variable.startPosition){//check the varDef is before 
					if(varDef !== null){
						val type = varDef.type
						if(type instanceof NameQualifiedType){
							return type.name.toString
						}
						else if(type instanceof QualifiedType){
							return type.name.toString
						}
						else if(type instanceof SimpleType){
							return type.name.toString
						}
					}
				}
			}
			else if(container instanceof EnhancedForStatement){
				val forLoop = container
				if(forLoop.parameter.name == variable){
					val type = forLoop.parameter.type
					if(type instanceof NameQualifiedType){
						return type.name.toString
					}
					else if(type instanceof QualifiedType){
						return type.name.toString
					}
					else if(type instanceof SimpleType){
						return type.name.toString
					}
				}
				
			}
			else if(container instanceof ForStatement){
				val forLoop = container
				val initDecl = forLoop.initializers.filter(VariableDeclarationExpression).findFirst[varDecl |
						varDecl.fragments.exists[va | (va as VariableDeclarationFragment).name.toString == variable.toString]
					]
				if(initDecl !== null){
					val type = initDecl.type
					if(type instanceof NameQualifiedType){
						return type.name.toString
					}
					else if(type instanceof QualifiedType){
						return type.name.toString
					}
					else if(type instanceof SimpleType){
						return type.name.toString
					}
				}
				
			}
			
			//		AssertStatement,
			//	    BreakStatement,
			//	    ConstructorInvocation,
			//	    ContinueStatement,
			//	    EmptyStatement,
			//	    ExpressionStatement,
			//	    IfStatement,
			//	    LabeledStatement,
			//	    ReturnStatement,
			//	    SuperConstructorInvocation,
			//	    SwitchCase,
			//	    SynchronizedStatement,
			//	    ThrowStatement,
			//	    TryStatement,
			//	    TypeDeclarationStatement,
			//	    VariableDeclarationStatement,
			//	    WhileStatement
			//	    SwitchStatement, -> param
			return getType(variable, container.parent)
		}
		else if(container instanceof MethodDeclaration){
			
			val method = container
			
			val param = method.parameters.findFirst[paramDecl |	(paramDecl as SingleVariableDeclaration).name.toString == variable.toString]
			
			if(param !== null){
				val type = (param as SingleVariableDeclaration).type
				if(type instanceof NameQualifiedType){
					return type.name.toString
				}
				else if(type instanceof QualifiedType){
					return type.name.toString
				}
				else if(type instanceof SimpleType){
					return type.name.toString
				}
			}
			
			return getType(variable, container.parent)
		}
		else if(container instanceof TypeDeclaration){
			
			val typeDef = container
			
			val fieldDef = typeDef.fields.findFirst[fieldDecl | 
					val fragments = fieldDecl.fragments
					fragments.exists[field | (field as VariableDeclarationFragment).name.toString == variable.toString]
				]
				
			if(fieldDef !== null){
				val type = fieldDef.type
				if(type instanceof NameQualifiedType){
					return type.name.toString
				}
				else if(type instanceof QualifiedType){
					return type.name.toString
				}
				else if(type instanceof SimpleType){
					return type.name.toString
				}
			}
			
			return getType(variable, container.parent)
		}
		
		return getType(variable, container.parent)
	}
	
	/**
	 * Return the substring after the last '.' 
	 */
	def String getLastPart(String qualifiedName){
		return qualifiedName.substring(qualifiedName.lastIndexOf(".")+1)
	}
	
	/**
	 * Return the substring before the last '.'
	 */
	def String getQualifierPart(String qualifiedName){
		return qualifiedName.substring(0,qualifiedName.lastIndexOf("."))
	}
	
	/**
	 * Return a ClassRule for {@link type}.
	 * Return null if {@link type} is not renamed.
	 */
	def Pair<String,String> getClassRule(Name type){
		
		var Pair<String,String> res = null 
		
		val typeName = type.toString
		
		val rule = rulesManager.getClassRule(typeName)
		if(rule !== null){
			//typeName is qualified
			return rule
		}
		else{
			//typeName is not qualified
			val importDecl = (type.root as CompilationUnit).imports.map[(it as ImportDeclaration).name]
			val candidatesRule = rulesManager.allClassRules.filter[key.lastPart == typeName]

			res = candidatesRule?.findFirst[candidateRule |
				//Check type is imported
				if(importDecl.exists[it.fullyQualifiedName == candidateRule.key]){
					true
				}
				//Check type's package is imported
				else{
					val candidatePackage = candidateRule.key.qualifierPart + ".*"
					return importDecl.exists[it.fullyQualifiedName == candidatePackage]
				}
			]
		}
		return res
	}
	
	/**
	 * Parse {@link qualifiedName} and produce a SimpleName
	 * or a QualifiedName
	 */
	def Name toName(AST ast, String qualifiedName){
		val simpleNames = qualifiedName.split("\\.").map[ast.newSimpleName(it)]
		
		var Name currentName =  simpleNames.get(0)
		for(var int i = 1; i<simpleNames.size; i++){
			currentName = ast.newQualifiedName(currentName,simpleNames.get(i))
		}
		
		return currentName
	}
	
	/**
	 * Return true if the qualified class {@link candidateImport} is imported
	 */
	def boolean isImported(CompilationUnit root, String candidateImport){
		val importDecl = root.imports.map[(it as ImportDeclaration).name]
		//Check type is imported
		if(importDecl.exists[it.fullyQualifiedName == candidateImport]){
			return true
		}
		//Check type's package is imported
		else{
			val candidatePackage = candidateImport.qualifierPart
			if(importDecl.exists[it.fullyQualifiedName == candidatePackage+".*"]){
				return true
			}
		}
		return false
	}
	
	/**
	 * Return true if {@link subpack} is a subpackage of {@link pack}
	 */
	def boolean isSubpackage(String pack, String subpack){
		return
			subpack.length > pack.length &&
			subpack.startsWith(pack) &&
			subpack.charAt(pack.length).toString == '.'
	}
	
	/**
	 * Return the renamed package name if their exist a rule for {@link packageName}
	 * will NOT apply for a super package.
	 * 
	 * Return null if not renamed.
	 */
	def String getDirectRenaming(String packageName){
		val rule = rulesManager.allPackageRules.findFirst[key == packageName]
		if(rule !== null){
			return rule.value
		}
		return null
	}
	/**
	 * Return the renamed package name if their exist a rule for {@link packageName}
	 * or for a super package.
	 * 
	 * Return null if not renamed.
	 */
	def String getRenaming(String packageName){
		val rule = rulesManager.allPackageRules.findFirst[key == packageName]
		if(rule !== null){
			return rule.value
		}
		else{
			val longestRule = rulesManager.allPackageRules.filter[isSubpackage(key,packageName)].sortBy[key.length].last
			if(longestRule !== null){
				val prefix = longestRule.value
				val sufix = packageName.substring(longestRule.key.length)
				return prefix+sufix
			}
		}
		return null
	}
	
	/**
	 * Return the fully qualified name of clazz
	 */
	def String getFqn(EClass clazz){
		 val List<String> parts = newArrayList
		
		parts.add(clazz.name)
		var current = clazz.EPackage
		while(current !== null){
			parts.add(current.name)
			current = current.ESuperPackage
		}
		
		return parts.reverse.join(".")
	}
}
