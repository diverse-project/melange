package fr.inria.diverse.melange.utils

import com.google.common.collect.HashMultimap
import com.google.common.collect.SetMultimap
import com.google.inject.Inject
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.diverse.melange.ast.LanguageExtensions
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.metamodel.melange.Language
import java.lang.reflect.Method
import java.net.URL
import java.net.URLClassLoader
import java.util.ArrayList
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Map
import org.apache.log4j.Logger
import org.eclipse.core.resources.IFolder
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Path
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.jdt.core.IJavaProject
import org.eclipse.jdt.core.IType
import org.eclipse.jdt.core.JavaModelException
import org.eclipse.jdt.core.dom.AST
import org.eclipse.jdt.core.dom.ASTParser
import org.eclipse.jdt.core.dom.ASTVisitor
import org.eclipse.jdt.core.dom.Block
import org.eclipse.jdt.core.dom.CompilationUnit
import org.eclipse.jdt.core.dom.MethodDeclaration
import org.eclipse.jdt.core.dom.Statement
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite
import org.eclipse.jdt.core.dom.rewrite.ListRewrite
import org.eclipse.jdt.launching.JavaRuntime
import org.eclipse.jface.text.Document
import org.eclipse.text.edits.TextEdit
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.jdt.core.dom.SingleVariableDeclaration
import java.lang.reflect.TypeVariable

class EventManagerGenerator {

	@Inject extension ModelingElementExtensions
	@Inject extension IQualifiedNameProvider
	@Inject extension LanguageExtensions

	private static final Logger log = Logger.getLogger(EventManagerGenerator)

	/**
	 * Link Language to its Aspects' Java classes
	 */
	private SetMultimap<Language, Class<?>> aspectsByLang = HashMultimap.create

	/**
	 * Link Aspect's Java class to aspected EClass
	 */
	private HashMap<Class<?>, EClass> aspected = new HashMap

	/**
	 * Link Java class to JDT class
	 */
	private HashMap<Class<?>, IType> source = new HashMap

	private Map<EClass, Method> eventToHandler = new HashMap

	private Language language

	private List<Method> eventMethods

	private Map<Method, Method> eventMethodToCondition

	private IJavaProject project

	private String projectName

	private String eventManagerClassName

	private String aspectsPackageName

	private EPackage ePackage

	private String packageString

	public def void generateEventManager(Language lang, IJavaProject melangeProject, IProgressMonitor m) {
		if (!lang.isGeneratedByMelange)
			return;

		// clean before start
		language = lang
		project = melangeProject
		aspectsByLang = HashMultimap.create
		aspected = newHashMap
		source = newHashMap
		eventMethods = newArrayList
		eventMethodToCondition = newHashMap
		eventToHandler = newHashMap
		projectName = language.externalRuntimeName
		eventManagerClassName = '''«language.name»EventManager'''
		aspectsPackageName = language.aspectsNamespace

		val ClassLoader loader = createClassLoader(melangeProject)

		// 1. Init
		val aspects = new HashSet
		lang.semantics.forEach [ asp |
			val type = melangeProject.findType(asp.aspectTypeRef.type.qualifiedName)
			val aspType = loader.loadClass(asp.aspectTypeRef.type.qualifiedName)
			aspected.put(aspType, asp.aspectedClass)
			source.put(aspType, type)
			aspects.add(aspType)
		]
		aspectsByLang.putAll(lang, aspects)

		// 2. Rewrite dispatch
		lang.processLanguage(m)
	}

	private def void processLanguage(Language l, IProgressMonitor m) {
		gatherEventMethods(l)
		if (!eventToHandler.empty) {
			ePackage = eventToHandler.keySet.filterNull.head.EPackage
			val qNameSegments = new ArrayList(eventToHandler.keySet.filterNull.head.fullyQualifiedName.segments)
			qNameSegments.remove(qNameSegments.size - 1)
			packageString = projectName + "." + qNameSegments.reduce[p1, p2|p1 + "." + p2]
			val sourceFolder = project.allPackageFragmentRoots.findFirst [ p |
				if (p.resource instanceof IFolder) {
					val folder = p.resource as IFolder
					val path = folder.fullPath.toString
					return path == ("/" + projectName + "/src-gen")
				}
				return false
			]
			sourceFolder.getPackageFragment(aspectsPackageName)?.createCompilationUnit(eventManagerClassName + ".java",
				generateCode, true, m)
		}
	}

	private def void gatherEventMethods(Language l) {
		aspectsByLang.get(l).filter[isAspect].forEach[asp|processAspect(asp)]
	}

	private def boolean isAspect(Class<?> cls) {
		cls.declaredAnnotations.exists [
			annotationType.canonicalName == "fr.inria.diverse.k3.al.annotationprocessor.Aspect"
		]
	}

	private def boolean isInitialize(Method m) {
		val initializeAnnotation = m.getAnnotation(InitializeModel)
		return initializeAnnotation != null
	}

	private def boolean isEvent(Method m) {
		val stepAnnotation = m.getAnnotation(Step)
		if (stepAnnotation != null) {
			return stepAnnotation.eventTriggerable
		}
		return false
	}

	private def void processAspect(Class<?> aspect) {
		aspect.methods.filter[m|isInitialize(m)].forEach [ m |
			aspect.rewriteBody(m)
		]
		val aspectEvents = aspect.methods.filter[m|isEvent(m)]
		aspect.methods.forEach [ condition |
			val eventMethod = aspectEvents.findFirst [ n |
				n.name + "_PreCondition" == condition.name
			]
			eventMethodToCondition.put(eventMethod, condition)
		]
		aspectEvents.forEach [ m |
			val eventName = '''«aspected.get(aspect).name.toFirstUpper»«m.name.toFirstUpper»Event'''
			val eventClass = language.syntax.findClassifier(eventName)
			if (eventClass != null) {
				eventToHandler.put(eventClass as EClass, m)
			}
		]
		eventMethods += aspectEvents
	}

	private def void rewriteBody(Class<?> aspect, Method method) {
		try {
			val sourceUnit = source.get(aspect).compilationUnit
			// textual document
			val String source = sourceUnit.getSource();
			val Document document = new Document(source);

			// get the AST
			val ASTParser parser = ASTParser.newParser(AST.JLS8)
			parser.setSource(sourceUnit)
			// parser.setResolveBindings(true) --not working
			val astRoot = parser.createAST(null) as CompilationUnit

			// start record of the modifications
			astRoot.recordModifications()
			val edits = new ArrayList<TextEdit>
			astRoot.accept(
				new ASTVisitor() {
					override visit(MethodDeclaration node) {
						if (node.matching) {
							val Block block = node.getBody();
							val AST blockAst = block.getAST();
							val ASTParser parser = ASTParser.newParser(AST.JLS8)
							parser.kind = ASTParser.K_STATEMENTS
							val parserSource = "fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry.getInstance().registerManager(new XPetrinetEventManager());"
							parser.setSource(parserSource.toCharArray)
							val registerInvocation = parser.createAST(null) as Statement
							val ASTRewrite rewriteStatements = ASTRewrite.create(blockAst);
							val ListRewrite listRewriteStatements = rewriteStatements.getListRewrite(block, Block.STATEMENTS_PROPERTY);
							listRewriteStatements.insertAt((registerInvocation as Block).statements.head, 1, null);
							try {
								edits.add(rewriteStatements.rewriteAST());
							} catch (JavaModelException e) {
								throw e;
							} catch (IllegalArgumentException e) {
								throw e;
							}
						}
						super.visit(node)
					}
					
					private def String getSimpleName(String s) {
						val i = s.lastIndexOf(".")
						if (i != -1) {
							s.substring(i + 1, s.length)
						} else {
							s
						}
					}
					
					private def String getBaseType(String s) {
						val i = s.indexOf("<")
						if (i != -1) {
							s.substring(0, i)
						} else {
							s
						}
					}
					
					private def List<String> getTypeParameters(String s) {
						val i = s.indexOf("<")
						if (i != -1) {
							s.substring(i + 1, s.length - 1).replace(" ", "").split(",")
						} else {
							emptyList
						}
					}
					
					private def String flattenType(String typeName) {
						val baseType = typeName.baseType.simpleName
						val typeParameters = typeName.typeParameters.map[s|s.flattenType].reduce[s1, s2|s1 + s2]
						return '''«baseType»«IF typeParameters != null»«typeParameters»«ENDIF»'''
					}
					
					private def boolean compareParameterizedTypes(String s1, String s2) {
						s1.flattenType == s2.flattenType
					}

					private def boolean isMatching(MethodDeclaration m) {
						val parameterTypes= method.parameters
						method.name == m.name.toString && parameterTypes.length == m.parameters.length &&
							parameterTypes.forall [ param |
								val index = parameterTypes.indexOf(param)
								val mParamType = (m.parameters.get(index) as SingleVariableDeclaration).type.toString
								if (index !== 0) {
									val TypeVariable<?>[] typeParameters = param.type.typeParameters
									if (!typeParameters.empty) {
										compareParameterizedTypes(mParamType, param.parameterizedType.typeName)
									} else {
										param.type.typeName == mParamType
									}
								} else {
									true
								}
							]
					}
				})
			// computation of the new source code
			edits.forEach[e|e.apply(document)];
			var String newSource = document.get()

			// update of the compilation unit
			sourceUnit.getBuffer().setContents(newSource)
			sourceUnit.getBuffer().save(null, true)
		} catch (Exception e) {
			log.error("Couldn't apply rewriteBody on " + aspect.name, e)
		}
	}

	private def ClassLoader createClassLoader(IJavaProject project) {
		val classPathEntries = JavaRuntime.computeDefaultRuntimeClassPath(project)
		val urlList = new ArrayList<URL>()
		for (var i = 0; i < classPathEntries.length; i++) {
			val entry = classPathEntries.get(i)
			val path = new Path(entry)
			val url = path.toFile().toURI().toURL()
			urlList.add(url)
		}
		val parentClassLoader = Thread.currentThread().getContextClassLoader()
		return new URLClassLoader(urlList, parentClassLoader)
	}

	private def String generateCode() {
		'''
			package «aspectsPackageName»;
			
			«generateImports»
			
			public class «language.name»EventManager implements IEventManager {
			
				«generateBody»
			}
		'''
	}

	private def String generateImports() {
		'''
			import java.util.HashSet;
			import java.util.Set;
			import java.util.Queue;
			import java.util.concurrent.ConcurrentLinkedQueue;
			
			import org.eclipse.emf.ecore.EClass;
			import org.eclipse.emf.ecore.EObject;
			import «packageString».«ePackage.name.toFirstUpper»Package;
			«FOR event : eventToHandler.keySet.filterNull»
				import «packageString».«event.name»;
			«ENDFOR»
			import fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager;
		'''
	}

	private def String generateBody() {
		'''
			private final Queue<EObject> eventQueue = new ConcurrentLinkedQueue<>();
			
			private boolean canManageEvents = true;
			
			@Override
			public void sendEvent(Object event) {
				if (event instanceof EObject) {
					eventQueue.add((EObject) event);
				}
			}
			
			«generateCanSendEventMethod»
			
			«generateEventClassesGetter»
			
			@Override
			public void manageEvents() {
				if (canManageEvents) {
					canManageEvents = false;
					EObject event = eventQueue.poll();
					while (event != null) {
						dispatchEvent(event);
						event = eventQueue.poll();
					}
					canManageEvents = true;
				}
			}
			
			«generateDispatch»
			«generateEventHandlers»
			«generateEventConditions»
		'''
	}

	private def String generateCanSendEventMethod() {
		'''
			@Override
			public boolean canSendEvent(Object event) {
				«FOR entry : eventToHandler.entrySet SEPARATOR " else"»
					«val eventClass = entry.key»
					«val eventHandler = entry.value»
					«val eventClassName = eventClass.name»
					if (event instanceof «eventClassName») {
						«val eventCondition = eventMethodToCondition.get(eventHandler)»
						«IF eventCondition == null»
							return true;
						«ELSE»
							return canSend«eventClassName»((«eventClassName») event);
						«ENDIF»
					}
				«ENDFOR»
				return false;
			}
		'''
	}

	private def String generateDispatch() {
		'''
			private void dispatchEvent(EObject event) {
				«FOR eventHandler : eventToHandler.entrySet SEPARATOR " else"»
					«val eventClassName = eventHandler.key.name»
					if (event instanceof «eventClassName») {
						handle«eventClassName»((«eventClassName») event);
					}
				«ENDFOR»
			}
		'''
	}

	private def String generateEventHandlers() {
		'''
			«FOR entry : eventToHandler.entrySet»
				«val eventClass = entry.key»
				«val eventHandler = entry.value»
				
				«generateEventHandler(eventClass as EClass, eventHandler)»
			«ENDFOR»
		'''
	}

	private def String generateEventHandler(EClass eventClass, Method eventHandler) {
		val eventClassName = eventClass.name
		val eventHandlerName = eventHandler.name
		val eventHandlingClass = eventHandler.declaringClass.simpleName
		val eventParameters = eventClass.eventHandlerParameters
		return '''
			private void handle«eventClassName»(«eventClassName» event) {
				if («eventHandlingClass».«eventHandlerName»_PreCondition(«eventParameters»)) {
					«eventHandlingClass».«eventHandlerName»(«eventParameters»);
				}
			}
		'''
	}

	private def String generateEventConditions() {
		'''
			«FOR entry : eventToHandler.entrySet»
				«val eventClass = entry.key»
				«val eventCondition = eventMethodToCondition.get(entry.value)»
				«IF eventCondition != null»
					
					«generateEventCondition(eventClass as EClass, eventCondition)»
				«ENDIF»
			«ENDFOR»
		'''
	}

	private def String generateEventCondition(EClass eventClass, Method eventCondition) {
		val eventClassName = eventClass.name
		val eventHandlerName = eventCondition.name
		val eventHandlingClass = eventCondition.declaringClass.simpleName
		return '''
			private boolean canSend«eventClassName»(«eventClassName» event) {
				return «eventHandlingClass».«eventHandlerName»(«eventClass.eventHandlerParameters»);
			}
		'''
	}

	private def String getEventHandlerParameters(EClass eventClass) {
		val parameters = eventClass.EReferences.map[p|p.EType]
		'''«FOR p : parameters SEPARATOR ", "»event.get«p.name»()«ENDFOR»'''
	}

	private def String generateEventClassesGetter() {
		'''
			@Override
			public Set<EClass> getEventClasses() {
				final Set<EClass> eventClasses = new HashSet<>();
				«FOR entry : eventToHandler.entrySet»
					«val eventClass = entry.key as EClass»
					eventClasses.add(«ePackage.name.toFirstUpper»Package.eINSTANCE.get«eventClass.name»());
				«ENDFOR»
				return eventClasses;
			}
		'''
	}
}
