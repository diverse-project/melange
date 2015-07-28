package fr.inria.diverse.melange.utils

import org.eclipse.jdt.core.dom.ASTVisitor
import java.util.List
import java.util.Map
import org.eclipse.jdt.core.dom.ImportDeclaration
import org.eclipse.jdt.core.dom.SimpleType
import org.eclipse.jdt.core.dom.Name
import org.eclipse.jdt.core.dom.MethodInvocation
import org.eclipse.jdt.core.dom.SimpleName
import org.eclipse.jdt.core.dom.MethodDeclaration
import org.eclipse.jdt.core.dom.QualifiedName
import org.eclipse.jdt.core.dom.CastExpression
import org.eclipse.jdt.core.dom.TypeDeclaration
import org.eclipse.jdt.core.dom.NormalAnnotation
import org.eclipse.jdt.core.dom.MemberValuePair
import org.eclipse.jdt.core.dom.CompilationUnit
import org.eclipse.jdt.core.dom.ASTNode
import org.eclipse.jdt.core.dom.NameQualifiedType
import org.eclipse.jdt.core.dom.QualifiedType
import org.eclipse.jdt.core.dom.EnhancedForStatement
import org.eclipse.jdt.core.dom.VariableDeclarationStatement
import org.eclipse.jdt.core.dom.Block
import org.eclipse.jdt.core.dom.Statement
import org.eclipse.jdt.core.dom.Expression
import org.eclipse.jdt.core.dom.VariableDeclarationFragment
import org.eclipse.jdt.core.dom.SingleVariableDeclaration
import org.eclipse.jdt.core.dom.ForStatement
import org.eclipse.jdt.core.dom.VariableDeclarationExpression
import org.eclipse.jdt.core.dom.AST

class RenamerVisitor extends ASTVisitor{
	
	List<Pair<String,String>> classRules
	List<Pair<String,String>> packageRules
	List<Pair<String,String>> propertiesRules
	
	Map<ImportDeclaration,Name> newImportsNames
	Map<SimpleType,Name> newSimpleTypesNames
	Map<MethodInvocation,SimpleName> newMethodNames
	Map<MethodDeclaration,SimpleName> newMethodDeclNames
	
	new(List<Pair<String,String>> classRenaming, List<Pair<String,String>> packageRenaming, List<Pair<String,String>> propertiesRenaming) {
		classRules = classRenaming
		packageRules = packageRenaming
		propertiesRules = propertiesRenaming
		
		newImportsNames = newHashMap
		newSimpleTypesNames = newHashMap
		newMethodNames = newHashMap
		newMethodDeclNames = newHashMap 
	}
	
	override visit(ImportDeclaration node) {
		
		val rule = packageRules.findFirst[key == node.name]
		if(rule != null){
			val newName = node.AST.newSimpleName(rule.value)
			newImportsNames.put(node,newName)
		}
		else{
			val pack = node.name.toString.qualifierPart
			val rule2 = packageRules.findFirst[key == pack]
			if(rule2 != null){
				val packageName = node.AST.toName(rule2.value)
				
				val clazz = node.name.toString.lastPart
				val classRule = classRules.findFirst[clRule |
						clRule.key.lastPart == clazz &&
						clRule.key.qualifierPart == pack
					]
				val clazzName = node.AST.newSimpleName(classRule.value.lastPart)
				
				val newName = node.AST.newQualifiedName(packageName,clazzName)
				newImportsNames.put(node,newName)
			}
		}
		
		super.visit(node)
	}
	
	override visit(SimpleType node) {
		
		val typeName = node.name
		
		//TODO: typeName can be a QualifiedName
		val rule = typeName.getClassRule()
		if(rule != null){
			
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
		
		super.visit(node)
	}
	
	override visit(MethodInvocation node) {
		
		//Match name
		val methodName = node.name
		val candidateRules = propertiesRules.filter["get"+key.lastPart.toFirstUpper == methodName.toString ||
				"set"+key.lastPart.toFirstUpper == methodName.toString
			]
		
		//Match parameters
		
		//Match return type
		
		//Match invocator
		val exp = node.expression
		if(exp instanceof Name){
			val invokerName = exp as Name
			val typeName = getType(invokerName)
			val targetedRules = candidateRules.filter[rule |
					rule.key.qualifierPart == typeName ||
					rule.key.qualifierPart.lastPart == typeName
				]
			val importedRule = targetedRules.findFirst[rule | 
												val clazz = rule.key.qualifierPart
												return isImported(methodName.root as CompilationUnit,clazz)
											]
			if(importedRule != null){
				//Rename
				val prefix = methodName.toString.substring(0,3) //'get' or 'set'
				val newName = prefix + importedRule.value.lastPart.toFirstUpper
				newMethodNames.put(node,node.AST.newSimpleName(newName))
			}
		}
		else if(exp instanceof CastExpression){
			val type = (exp as CastExpression).type
			val typeName = type.qualifiedType
			//TODO
		}
		else{
			//FIXME: should check other kind of expression
		}

		super.visit(node)
	}
	
	override visit(MethodDeclaration node) {
		
		val methodName = node.name.toString
		val candidateRules = propertiesRules.filter[rule | rule.key.lastPart == methodName]
		
		val container = node.parent
		if(container instanceof TypeDeclaration){
			val clazz = container as TypeDeclaration
			val aspectAnnot = clazz.modifiers().filter(NormalAnnotation).findFirst[typeName.toString == "Aspect"]
			if(aspectAnnot != null){
				val aspectedClazz = (aspectAnnot.values.get(0) as MemberValuePair).value.toString.qualifierPart
				val rule = candidateRules.findFirst[rule | 
					val candidateClazz = rule.key.qualifierPart
					candidateClazz.lastPart == aspectedClazz &&
					isImported(node.root as CompilationUnit,candidateClazz)
				]
				if(rule != null){
					val newName = rule.value.lastPart
					newMethodDeclNames.put(node, node.AST.newSimpleName(newName))
				}
			}
		}
//		boolean needRenaming = isProperty(MethodDeclaration method, )
		
		super.visit(node)
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
		
		if(container == null){
			
			return null
		}
		else if(container instanceof Expression){
			
			return getType(variable, container.parent)
		}
		else if(container instanceof Statement){
			
			if(container instanceof Block){
				val block = container as Block 
				val varDef = block.statements.filter(VariableDeclarationStatement).findFirst[varDecl |
						varDecl.fragments.exists[va | (va as VariableDeclarationFragment).name.toString == variable.toString]
					]
				if(varDef != null && varDef.startPosition < variable.startPosition){//check the varDef is before 
					if(varDef != null){
						val type = varDef.type
						if(type instanceof NameQualifiedType){
							return (type as NameQualifiedType).name.toString
						}
						else if(type instanceof QualifiedType){
							return (type as QualifiedType).name.toString
						}
						else if(type instanceof SimpleType){
							return (type as SimpleType).name.toString
						}
					}
				}
			}
			else if(container instanceof EnhancedForStatement){
				val forLoop = container as EnhancedForStatement
				if(forLoop.parameter.name == variable){
					val type = forLoop.parameter.type
					if(type instanceof NameQualifiedType){
						return (type as NameQualifiedType).name.toString
					}
					else if(type instanceof QualifiedType){
						return (type as QualifiedType).name.toString
					}
					else if(type instanceof SimpleType){
						return (type as SimpleType).name.toString
					}
				}
				
			}
			else if(container instanceof ForStatement){
				val forLoop = container as ForStatement
				val initDecl = forLoop.initializers.filter(VariableDeclarationExpression).findFirst[varDecl |
						varDecl.fragments.exists[va | (va as VariableDeclarationFragment).name.toString == variable.toString]
					]
				if(initDecl != null){
					val type = initDecl.type
					if(type instanceof NameQualifiedType){
						return (type as NameQualifiedType).name.toString
					}
					else if(type instanceof QualifiedType){
						return (type as QualifiedType).name.toString
					}
					else if(type instanceof SimpleType){
						return (type as SimpleType).name.toString
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
			
			val method = container as MethodDeclaration
			
			val param = method.parameters.findFirst[paramDecl |	(paramDecl as SingleVariableDeclaration).name.toString == variable.toString]
			
			if(param != null){
				val type = (param as SingleVariableDeclaration).type
				if(type instanceof NameQualifiedType){
					return (type as NameQualifiedType).name.toString
				}
				else if(type instanceof QualifiedType){
					return (type as QualifiedType).name.toString
				}
				else if(type instanceof SimpleType){
					return (type as SimpleType).name.toString
				}
			}
			
			return getType(variable, container.parent)
		}
		else if(container instanceof TypeDeclaration){
			
			val typeDef = container as TypeDeclaration
			
			val fieldDef = typeDef.fields.findFirst[fieldDecl | 
					val fragments = fieldDecl.fragments
					fragments.exists[field | (field as VariableDeclarationFragment).name.toString == variable.toString]
				]
				
			if(fieldDef != null){
				val type = fieldDef.type
				if(type instanceof NameQualifiedType){
					return (type as NameQualifiedType).name.toString
				}
				else if(type instanceof QualifiedType){
					return (type as QualifiedType).name.toString
				}
				else if(type instanceof SimpleType){
					return (type as SimpleType).name.toString
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
		
		val rule = classRules.findFirst[key == typeName]
		if(rule != null){
			//typeName is qualified
			return rule
		}
		else{
			//typeName is not qualified
			val importDecl = (type.root as CompilationUnit).imports.map[(it as ImportDeclaration).name]
			val candidatesRule = classRules.filter[key.lastPart == typeName]

			res = candidatesRule?.findFirst[candidateRule |
					//Check type is imported
					if(importDecl.exists[it.fullyQualifiedName == candidateRule.key]){
						true
					}
					//Check type's package is imported
					else{
						val candidatePackage = candidateRule.key.qualifierPart
						if(importDecl.exists[it.fullyQualifiedName == candidatePackage+".*"]){
							true
						}
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
}
