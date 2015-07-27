package fr.inria.diverse.melange.utils

import fr.inria.diverse.melange.metamodel.melange.Aspect
import fr.inria.diverse.melange.metamodel.melange.Language
import java.util.List
import fr.inria.diverse.melange.ast.AspectExtensions
import com.google.inject.Inject
import org.eclipse.jdt.core.JavaCore
import org.eclipse.core.resources.IWorkspace
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IWorkspaceRoot
import fr.inria.diverse.melange.ast.LanguageExtensions
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.jdt.core.dom.CompilationUnit
import org.eclipse.jdt.core.dom.ASTVisitor
import org.eclipse.jface.text.Document
import org.eclipse.text.edits.TextEdit
import org.eclipse.jdt.core.dom.ASTParser
import org.eclipse.jdt.core.dom.AST
import org.eclipse.jdt.core.ICompilationUnit
import org.eclipse.jdt.core.dom.ImportDeclaration
import org.eclipse.jdt.core.dom.PackageDeclaration
import org.eclipse.jdt.core.dom.TypeDeclaration
import org.eclipse.jdt.core.dom.FieldDeclaration
import org.eclipse.jdt.core.dom.TypeLiteral
import org.eclipse.jdt.core.dom.CastExpression
import org.eclipse.jdt.core.dom.FieldAccess
import org.eclipse.jdt.core.dom.InstanceofExpression
import org.eclipse.jdt.core.dom.MethodInvocation
import org.eclipse.jdt.core.dom.SimpleType
import org.eclipse.jdt.core.dom.VariableDeclarationStatement
import org.eclipse.jdt.core.dom.ASTNode
import org.eclipse.jdt.core.dom.Name
import java.util.Map

class AspectRenamer {
	
	@Inject extension IQualifiedNameConverter
	@Inject extension AspectExtensions
	@Inject extension LanguageExtensions
	
	def void processRenaming(Aspect asp, Language l, List<Pair<String,String>> classRenaming, List<Pair<String,String>> packageRenaming){
		val targetClass = asp.aspectAnnotationValue
		val fileName1 = targetClass+"Aspect.java"
		val fileName2 = targetClass+"Aspect"+targetClass+"AspectContext.java"
		val fileName3 = targetClass+"Aspect"+targetClass+"AspectProperties.java"
		
		val sourceAspectNamespace = asp.aspectTypeRef.identifier.toQualifiedName.skipLast(1)
    	val targetAspectNamespace = AspectCopier.getAspectTargetNamespace(sourceAspectNamespace, l)
		
		val IWorkspace workspace = ResourcesPlugin.getWorkspace();
    	val IWorkspaceRoot root = workspace.getRoot();
    	val IProject[] projects = root.getProjects();
    	val targetProject = projects.findFirst[name == l.externalRuntimeName]
		val javaProject = JavaCore.create(targetProject)
		
		val roots = javaProject.allPackageFragmentRoots
		val aspectNamespace = roots.findFirst[elementName == "src-gen"].getPackageFragment(targetAspectNamespace.toString)
		
		val cu1 = aspectNamespace.getCompilationUnit(fileName1)
		val cu2 = aspectNamespace.getCompilationUnit(fileName2)
		val cu3 = aspectNamespace.getCompilationUnit(fileName3)
		
		applyRenaming(cu1, new RenamerVisitor(classRenaming,packageRenaming))
		applyRenaming(cu2, new RenamerVisitor(classRenaming,packageRenaming))
		applyRenaming(cu3, new RenamerVisitor(classRenaming,packageRenaming))
	}
	
	/**
	 * Visit {@link sourceUnit} with {@link renamer} and apply changes in
	 * the corresponding textual file
	 */
	private def void applyRenaming(ICompilationUnit sourceUnit, RenamerVisitor renamer){
		
		// textual document
		val String source = sourceUnit.getSource();
		val Document document= new Document(source);
		
		// get the AST
		val ASTParser parser = ASTParser.newParser(AST.JLS8)
		parser.setSource(sourceUnit)
		parser.setResolveBindings(true)
		val astRoot = parser.createAST(null) as CompilationUnit
		
		// start record of the modifications
		astRoot.recordModifications()
	
		astRoot.accept(renamer)
		
		// computation of the text edits
	   	val TextEdit edits = astRoot.rewrite(document, sourceUnit.getJavaProject().getOptions(true))
	
	   	// computation of the new source code
	   	edits.apply(document);
	   	val String newSource = document.get();
	
	   	// update of the compilation unit
	   	sourceUnit.getBuffer().setContents(newSource);
	   	sourceUnit.getBuffer().save(null,true)
		
	}
}

class RenamerVisitor extends ASTVisitor{
	
	List<Pair<String,String>> classRules
	List<Pair<String,String>> packageRules
	
	Map<ImportDeclaration,Name> newImportsNames
	Map<SimpleType,Name> newSimpleTypesNames
	
	new(List<Pair<String,String>> classRenaming, List<Pair<String,String>> packageRenaming) {
		classRules = classRenaming
		packageRules = packageRenaming
		
		newImportsNames = newHashMap
		newSimpleTypesNames = newHashMap
	}
	
	override visit(ImportDeclaration node) {
		
		val rule = packageRules.findFirst[key == node.name]
		if(rule != null){
			val newName = node.AST.newSimpleName(rule.value)
			newImportsNames.put(node,newName)
		}
		else{
			val pack = node.name.toString.substring(0,node.name.toString.lastIndexOf("."))
			val rule2 = packageRules.findFirst[key == pack]
			if(rule2 != null){
				
				val simpleNames = rule2.value.split("\\.").map[node.AST.newSimpleName(it)]
				var Name currentName =  simpleNames.get(0)
				for(var int i = 1; i<simpleNames.size; i++){
					currentName = node.AST.newQualifiedName(currentName,simpleNames.get(i))
				}
				
				val clazz = node.name.toString.substring(node.name.toString.lastIndexOf(".")+1)
				val classRule = classRules.findFirst[clRule |
						clRule.key.endsWith(clazz) &&
						clRule.key.substring(0,clRule.key.lastIndexOf(".")) == pack
					]
				val clazzName = node.AST.newSimpleName(classRule.value.substring(classRule.value.lastIndexOf(".")+1))
				
				val newName = node.AST.newQualifiedName(currentName,clazzName)
				newImportsNames.put(node,newName)
			}
		}
		
		super.visit(node)
	}
	
	override visit(SimpleType node) {
		
		val typeName = node.name
		
		val rule = classRules.findFirst[key == typeName]
		if(rule != null){
			//typeName is qualified
			val newName = node.AST.newSimpleName(rule.value)
			newSimpleTypesNames.put(node,newName)
		}
		else{
			//typeName is not qualified
			val importDecl = (node.root as CompilationUnit).imports.map[(it as ImportDeclaration).name]
			val candidatesRule = classRules.filter[key.endsWith(typeName.toString)]
			
			candidatesRule.forEach[candidateRule |
				if(candidateRule != null){
					//Check type is imported
					if(importDecl.exists[it.fullyQualifiedName == candidateRule.key]){
						val toName = candidateRule.value.substring(candidateRule.value.lastIndexOf(".")+1)
						val newName = node.AST.newSimpleName(toName)
						newSimpleTypesNames.put(node,newName)
					}
					//Check type's package is imported
					else{
						val candidatePackage = candidateRule.key.substring(0, candidateRule.key.lastIndexOf("."))
						if(importDecl.exists[it.fullyQualifiedName == candidatePackage+".*"]){
							val toName = candidateRule.value.substring(candidateRule.value.lastIndexOf(".")+1)
							val newName = node.AST.newSimpleName(toName)
							newSimpleTypesNames.put(node,newName)
						}
					}
				}
			]
		}
		
		super.visit(node)
	}
	
	override postVisit(ASTNode node) {
		if(node instanceof CompilationUnit){
			println("apply")
			newImportsNames.entrySet.forEach[entry|
				entry.key.name = entry.value
			]
			newSimpleTypesNames.entrySet.forEach[entry|
				entry.key.name = entry.value
			]
		}
		
		super.postVisit(node)
	}
}