package fr.inria.diverse.melange.utils

import com.google.common.collect.HashMultimap
import com.google.common.collect.SetMultimap
import com.google.inject.Inject
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.melange.ast.LanguageExtensions
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import java.lang.reflect.Method
import java.lang.reflect.Modifier
import java.net.URL
import java.net.URLClassLoader
import java.util.ArrayList
import java.util.HashMap
import java.util.HashSet
import java.util.List
import org.eclipse.core.runtime.Path
import org.eclipse.emf.ecore.EClass
import org.eclipse.jdt.core.IJavaProject
import org.eclipse.jdt.core.IType
import org.eclipse.jdt.core.Signature
import org.eclipse.jdt.core.dom.AST
import org.eclipse.jdt.core.dom.ASTNode
import org.eclipse.jdt.core.dom.ASTParser
import org.eclipse.jdt.core.dom.ASTVisitor
import org.eclipse.jdt.core.dom.Block
import org.eclipse.jdt.core.dom.CompilationUnit
import org.eclipse.jdt.core.dom.MethodDeclaration
import org.eclipse.jdt.core.dom.SingleVariableDeclaration
import org.eclipse.jdt.launching.JavaRuntime
import org.eclipse.jface.text.Document
import org.eclipse.text.edits.TextEdit
import org.eclipse.xtext.naming.IQualifiedNameProvider

/**
 * This class recomputes the dispatch of Aspect's methods and rewrite
 * their body
 */
class DispatchOverrider {
	
	@Inject extension ModelingElementExtensions
	@Inject extension IQualifiedNameProvider
	@Inject extension EcoreExtensions
	@Inject extension LanguageExtensions
	
	ModelTypingSpace mtSpace
	IJavaProject project
	ClassLoader loader
	
	private SetMultimap<Language, Class<?>> aspectsByLang = HashMultimap.create
	private HashMap<Class<?>,EClass> aspected = new HashMap
	private HashMap<Class<?>,IType> source = new HashMap
	private HashMap<EClass,Language> eClassToLanguage = new HashMap
	private SetMultimap<EClass, EClass> subTypes = HashMultimap.create
	
	def overrideDispatch(ModelTypingSpace mtSpace, IJavaProject project) {
		//clean before start
		aspectsByLang = HashMultimap.create
		aspected = new HashMap
		source = new HashMap
		eClassToLanguage = new HashMap
		subTypes = HashMultimap.create
		
		mtSpace.makeAllSemantics
		
		this.mtSpace = mtSpace
		this.project = project
		
		loader = createClassLoader(project)
		
		mtSpace.elements
			.filter(Language)
			.filter[isGeneratedByMelange]
			.forEach[lang |
				
				//DEBUG
//				println(lang.name)
//				println("------------")
//				lang.syntax.allClasses.forEach[println(it)]
//				println("************")
//				lang.semantics.forEach[println(aspectedClass)]
//				println
				
				
				initSubClasses(lang)
				val aspects = new HashSet
				lang.semantics
					.forEach[asp |
						val type = project.findType(asp.aspectTypeRef.type.qualifiedName)
						val aspType = loader.loadClass(asp.aspectTypeRef.type.qualifiedName)
						aspected.put(aspType,asp.aspectedClass)
						source.put(aspType,type)
						aspects.add(aspType)
					]
				aspectsByLang.putAll(lang,aspects)
				lang.processLanguage
			]
	}
	

	// ****************************
	//      Java reflexivity
	// ****************************
	
	private def getHierachy(Language l){
		val pool = aspectsByLang.get(l)
		
		val SetMultimap<Class<?>, Class<?>> subClasses = HashMultimap.create
		pool.forEach[cls1|
			val subCls = pool.filter[cls2 | cls1 !== cls2 && cls1.isAssignableFrom(cls2)]
			subClasses.putAll(cls1,subCls)
		]
		return subClasses
	}
	
	private def void processLanguage(Language l) {
		val hierarchy = l.hierachy
		aspectsByLang.get(l).forEach[asp |
			processAspect(asp, hierarchy)
		]
	}
	
		
	private def void processAspect(Class<?> aspect, SetMultimap<Class<?>, Class<?>> hierarchy) {
		
		val HashMap<Method,String> bodies = new HashMap
		 
		aspect.getDispatchMethods.forEach[m |
			val body = m.genCode(hierarchy)
			bodies.put(m,body)
			//DEBUG
//			println(body)
		]
		
		applyRenaming(aspect,bodies)
	}
	
	private def getDispatchMethods(Class<?> type){
		type.declaredMethods.filter[m|
			Modifier.isPublic(m.modifiers)
			&& !m.name.startsWith("_privk3")
			&& !m.name.startsWith("super_")
		]
	}
	
	private def String genCode(Method m, SetMultimap<Class<?>, Class<?>> hierarchy) {
		val res = new StringBuffer
		res.append(methodProcessingChangeBody(m,hierarchy)+"\n\n")
		res.toString
	}
	
	/**
	 * Return the sorted list of all methods overriding m
	 */
	private def getRedefinition(Method m, SetMultimap<Class<?>, Class<?>> hierarchy) {
		val type = m.declaringClass
		hierarchy.get(type)
			.sortByOverridingPriority
			.map[getSimilar(m)]
			.filterNull
	}
	
	/**
	 * Return the method from {@link type} that match {@link m} by
	 * same name and same argument types
	 */
	private def Method getSimilar(Class<?> type, Method m) {
		type.declaredMethods.findFirst[isMatching(m)]
	}
	
	private def boolean isMatching(Method m1, Method m2) {
			m1.name == m2.name
		&& 	m1.parameterTypes.length == m2.parameterTypes.length
		&& 	m1.parameterTypes.forall[param |
				val index = m1.parameterTypes.indexOf(param)
				if(index !== 0)
					param.simpleName == m2.parameterTypes.get(index).simpleName
				else
					true
			]		
	}
	
	/**
	 * Sort types by
	 * 1) aspected classe hierachy
	 * 2) inheritance
	 * 3) source Language 
	 */
	private def Iterable<Class<?>> sortByOverridingPriority(Iterable<Class<?>> types) {
		if(types.isEmpty)
			return types
		val a = aspected.get(types.head)
		val b = eClassToLanguage.get(a)
		val originalOrder = eClassToLanguage.get(aspected.get(types.head)).semantics
		
		return types.sortWith[asp1, asp2 |
			val cls1 = aspected.get(asp1)
			val cls2 = aspected.get(asp2)
			
			if(cls2.EAllSuperTypes.contains(cls1))
				1
			else if(cls1.EAllSuperTypes.contains(cls2))
				-1
			else {
				if(asp1.isAssignableFrom(asp2))
				1
				else if(asp2.isAssignableFrom(asp1))
					-1
				else {
					val index1 = originalOrder.indexOf(asp1)
					val index2 = originalOrder.indexOf(asp2)
					if(index1 > index2)
						1
					else if(index2 > index1)
						-1
					else
						0
				}
			}
		]
	}
	
	/*
	 * Names of parameter may not be in the bytecode (depends of compiler options)
	 * so we rely on the JDT
	 */
	private def String getParameterList(Method m1) {
		val type = source.get(m1.declaringClass)
		val res = type.methods.findFirst[m2 |
				m2.elementName == m1.name
			&& 	m2.parameterTypes.length == m1.parameterTypes.length
			&& 	m2.parameterTypes.forall[param |
				val index = m2.parameterTypes.indexOf(param)
				if(index !== 0)
					m1.parameterTypes.get(index).simpleName == Signature.toString(param)
				else
					true
			]
		]
		if(res !==null)
			res.parameterNames.join(',')
		else
			SELF_VAR_NAME
	}
	
	private def ClassLoader createClassLoader(IJavaProject project) {
		val classPathEntries = JavaRuntime.computeDefaultRuntimeClassPath(project);
		val urlList = new ArrayList<URL>();
		for (var i = 0; i < classPathEntries.length; i++) {
		 val entry = classPathEntries.get(i);
		 val path = new Path(entry);
		 val url = path.toFile().toURI().toURL();
		 urlList.add(url);
		}
//		val parentClassLoader = project.getClass().getClassLoader();
		val parentClassLoader = Thread.currentThread().getContextClassLoader()
		return new URLClassLoader(urlList, parentClassLoader);
	}	
	
	
	/**************************
	 *        K3 Stuff
	 **************************/
	
	public static final String CTX_NAME = "AspectContext"
	public static final String PROP_NAME = "AspectProperties"
	public static final String PRIV_PREFIX = "_privk3_"
	public static final String PROP_VAR_NAME = "_self_"
	public static final String SELF_VAR_NAME = "_self"
	
	
	private def String methodProcessingChangeBody(Method m, SetMultimap<Class<?>, Class<?>> hierarchy) {
		val clazz = m.declaringClass
		val className = clazz.getAspectedSimpleName
//		val s = m.parameters.map[name].join(',')
		val s = getParameterList(m)
		val boolean isStep = m.isStep
		val ret = getReturnInstruction(m)
		val call = new StringBuilder

		val redefs = m.getRedefinition(hierarchy)
		if (!redefs.isEmpty) {
			val declTypes = redefs.map[declaringClass].toList
			declTypes.add(m.declaringClass)

			val ifst = transformIfStatements(m, declTypes, s, ret,isStep, className)
			call.append(ifst).
				append(''' { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(«SELF_VAR_NAME»).toString()); }''')
		} else {
			val instruction = transformNormalStatement(m, s,isStep, className)
			call.append(instruction) // for getters & setters
		}
		
		return getBody(clazz, className, call.toString, ret)
	}
	
	private def String getBody(Class<?> clazz, String className,
		String call, String returnStatement) {

		return '''
		final «clazz.canonicalName + className + PROP_NAME» «PROP_VAR_NAME» = «clazz.canonicalName + className + CTX_NAME».getSelf(«SELF_VAR_NAME»);
		«IF returnStatement.contains("return")»
			Object result = null;
		«ENDIF»
		«call.toString»;
		«returnStatement»'''
	}
	
	private def getReturnInstruction(Method method) {
			return
				if (method.hasReturnType)
					"return (" + method.returnType.canonicalName + ")result;"
				else
					""
		}
	
	private def hasReturnType(Method method) {
		return method.returnType != Void.TYPE
	}
	
	private def transformIfStatements(Method m, 
		List<Class<?>> declTypes, String parameters, String returnStatement, boolean isStep, String className) {
			val hasReturn = returnStatement.contains("return")
			val resultVar = "result"
			val StringBuilder sb = new StringBuilder
			
			
			val dispatchOrder = aspected.get(m.declaringClass).getEAllSubTypes
			for(cls : dispatchOrder){
				val dt = cls.bestCandidate(declTypes)
				var String call = "" 
				
				if (m.declaringClass == dt) {
					
					// if the method is local, call it
					call = '''«dt.canonicalName».«PRIV_PREFIX+m.name»(_self_, «parameters.replaceFirst(SELF_VAR_NAME,
				"(" + cls.javaFqn + ")"+SELF_VAR_NAME)»)'''
				
					if (isStep) 
						call = surroundWithStepCommandExecution(className, m.name , call, hasReturn, resultVar)
					 else if (hasReturn) 
						call = '''«resultVar» = «call»'''
						
				} else {
					
					// if the method is local, otherwise call the public helper for this type (this ensures that the correct XXXAspectProperties will be set
					call = '''«dt.canonicalName».«m.name»(«parameters.replaceFirst(SELF_VAR_NAME,
				"(" + cls.javaFqn + ")"+SELF_VAR_NAME)»)'''
					if (hasReturn) 
						call = '''«resultVar» = «call»'''
				}
				
				sb.append(''' if («SELF_VAR_NAME» instanceof «cls.javaFqn»){
					«call»;
} else ''')
			}
			return sb.toString
		}
	
	private def transformNormalStatement(Method method, String parameters, boolean isStep, String className) {
		val hasReturn = method.hasReturnType
		val resultVar = "result"
					
		var String call = '''«PRIV_PREFIX+method.name»(_self_, «parameters»)'''
		
		if (isStep)
			call = surroundWithStepCommandExecution(className, method.name , call, hasReturn, resultVar)
		else if (hasReturn)
			call = '''«resultVar» = «call»'''
		
		return call + ";"
	}
	
	private def String surroundWithStepCommandExecution(String className, String methodName, String code, boolean hasReturn, String resultVar) {
		return '''
			fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
				@Override
				public void execute() {
					«IF hasReturn»
					addToResult(«code»);
					«ELSE»
					«code»;
					«ENDIF»
				}
			};
			fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
			if (manager != null) {
				manager.executeStep(_self,command,"«className»","«methodName»");
			} else {
				command.execute();
			}
			«IF hasReturn»
			«resultVar» = command.getResult();
			«ENDIF»
			'''
	}
		
	private def String getAspectedClassName(Class<?> type){
		val aspTag = type.declaredAnnotations.filter[annotationType.canonicalName == "fr.inria.diverse.k3.al.annotationprocessor.Aspect"].head
		if(aspTag !== null)
			(aspTag as Aspect).className.canonicalName
		else
			""
	}
	
	private def String getAspectedSimpleName(Class<?> type){
		val eClass = aspected.get(type)
		if(eClass !== null)
			return eClass.name
		else
			""
	}
	
	private def boolean isStep(Method m){
		m.declaringClass.declaredAnnotations.exists[annotationType.canonicalName == "fr.inria.diverse.k3.al.annotationprocessor.Step"]
	}
	
	private def void initSubClasses(Language lang){
		val allClasses = lang.syntax.getAllClasses 
		allClasses.forEach[cls|eClassToLanguage.put(cls,lang)] //TODO: rename method or move code
		
		allClasses.forEach[cls1 |
			val subClasses = allClasses.filter[cls2| cls1.isSuperTypeOf(cls2)]
			subTypes.putAll(cls1,subClasses)
		]
	}
	
	/**
	 * Among {@link declTypes}, get the best applicable aspects on {@link cls}
	 */
	private def Class<?> bestCandidate(EClass cls, List<Class<?>> declTypes) {
		declTypes.filter[
			val dtCls = aspected.get(it)
			cls == dtCls || cls.EAllSuperTypes.contains(dtCls)
		].head
	}
	
	/**
	 * Returns ordered list of the subclasses of cls, including itself
	 */
	private def getEAllSubTypes(EClass cls) {
		subTypes.get(cls)
		.sortWith[clsA, clsB |
			if (clsA.EAllSuperTypes.contains(clsB))
				return -1
			else if (clsB.EAllSuperTypes.contains(clsA))
				return 1
			else return 0
		]
	}
	
	private def String getJavaFqn(EClass cls){
		val l = eClassToLanguage.get(cls)
		val prefix = l.fullyQualifiedName.toLowerCase.toString
		return prefix+"."+cls.uniqueId
	}
	
	
	private def void applyRenaming(Class<?> aspect, HashMap<Method,String> bodies){
		try {
			val sourceUnit = source.get(aspect).compilationUnit
			// textual document
			val String source = sourceUnit.getSource();
			val Document document= new Document(source);

			// get the AST
			val ASTParser parser = ASTParser.newParser(AST.JLS8)
			parser.setSource(sourceUnit)
			//parser.setResolveBindings(true) --not working
			val astRoot = parser.createAST(null) as CompilationUnit

			// start record of the modifications
			astRoot.recordModifications()

			astRoot.accept(new MyVisitor(aspect,bodies))
			// computation of the text edits
		   	val TextEdit edits = astRoot.rewrite(document, sourceUnit.getJavaProject().getOptions(true))

		   	// computation of the new source code
		   	edits.apply(document);
		   	var String newSource = document.get()

		   	// update of the compilation unit
		   	sourceUnit.getBuffer().setContents(newSource)
		   	sourceUnit.getBuffer().save(null,true)
		} catch (Exception e) {
			println(e)
//			log.error("Couldn't apply renaming rules", e)
		}
	}
	
	static class MyVisitor extends ASTVisitor{
		
		Class<?> aspect
		HashMap<Method,String> bodies
		
		new(Class<?> aspect, HashMap<Method,String> bodies){
			this.aspect = aspect
			this.bodies = bodies
		}
		
		override visit(MethodDeclaration node) {
			
			val rawBody = node.findBody
			if(!rawBody.empty){
				val ASTParser parser = ASTParser.newParser(AST.JLS8)
				parser.setSource(rawBody.toCharArray)
				parser.setKind(ASTParser.K_STATEMENTS);
				val genNode = parser.createAST(null)
				
				if(genNode instanceof Block){
					node.body = ASTNode.copySubtree(node.AST,genNode) as Block
				}
			}
			
			super.visit(node)
		}
		
		def String findBody(MethodDeclaration method){
			val match = bodies.keySet
				.filter[declaringClass == aspect]
				.findFirst[isMatching(method)]
			if(match !== null)
				return bodies.get(match)
			else ""
		}
		
		private def boolean isMatching(Method m1, MethodDeclaration m2) {
				m1.name == m2.name.toString
			&& 	m1.parameterTypes.length == m2.parameters.length
			&& 	m1.parameterTypes.forall[param |
					val index = m1.parameterTypes.indexOf(param)
					if(index !== 0)
						param.simpleName == (m2.parameters.get(index) as SingleVariableDeclaration).type.toString
					else
						true
				]		
		}
		
	}
}
