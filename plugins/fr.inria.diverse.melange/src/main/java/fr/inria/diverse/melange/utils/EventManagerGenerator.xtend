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
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.diverse.melange.ast.LanguageExtensions
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.metamodel.melange.Language
import java.lang.reflect.Method
import java.net.URL
import java.net.URLClassLoader
import java.util.ArrayList
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.core.resources.IFolder
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Path
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.jdt.core.IJavaProject
import org.eclipse.jdt.core.IType
import org.eclipse.jdt.launching.JavaRuntime
import org.eclipse.pde.internal.core.project.PDEProject
import org.eclipse.xtext.naming.IQualifiedNameProvider

class EventManagerGenerator {

	@Inject extension EventExtensions
	@Inject extension EcoreExtensions
	@Inject extension IQualifiedNameProvider
	@Inject extension LanguageExtensions

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

	private Map<EClass, Method> inputEventToHandler = new HashMap

	private Map<EClass, Method> outputEventToHandler = new HashMap

	private Language language

	private Map<Method, Method> eventMethodToCondition

	private IJavaProject melangeProject

	private IJavaProject targetProject

	private String projectName

	private String eventManagerClassName

	private String packageName

	private EPackage ePackage

	private String aspectsPackageString

	private String scenarioPackageString

	private String languagePackageString
	
	private List<Method> initializeMethods
	
	private Set<EClassifier> eventParameterTypes
	
	private Set<String> elementReferences

	public def void generateEventManager(Language lang, IJavaProject melangeProject, IJavaProject targetProject, IProgressMonitor m) {
		if (!lang.isGeneratedByMelange)
			return;

		// clean before start
		language = lang
		this.melangeProject = melangeProject
		this.targetProject = targetProject
		aspectsByLang = HashMultimap.create
		aspected = newHashMap
		source = newHashMap
		eventMethodToCondition = newHashMap
		inputEventToHandler = newHashMap
		outputEventToHandler = newHashMap
		initializeMethods = newArrayList
		eventParameterTypes = newHashSet
		elementReferences = newHashSet
		projectName = language.reactiveInterfaceName
		eventManagerClassName = '''«language.name»EventManager'''
		packageName = language.reactiveInterfaceName

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
		
		// 2. Process
		lang.processLanguage(m)
		
		// 3. Generate plugin.xml
		val pluginXml = PDEProject::getPluginXml(targetProject.project)
		val changer = new PluginXmlChanger
		changer.load(pluginXml.location.toString)
		
		val extensionPoint = changer.addExtension("org.gemoc.gemoc_language_workbench.engine_addon")
		val element = changer.addChild(extensionPoint, "Addon")
		
		changer.addAttribute(element, "Class", packageName + "." + eventManagerClassName)
		changer.addAttribute(element, "Default", "false")
		changer.addAttribute(element, "id", packageName)
		changer.addAttribute(element, "Default", "false")
		changer.addAttribute(element, "Name", language.name + " Event Manager")
		changer.addAttribute(element, "ShortDescription", "Handles events for the " + language.name + " language")
		changer.addAttribute(element, "AddonGroupId", "Sequential.AddonGroup")
		
		changer.save(2)
	}
	
	private def void processLanguage(Language l, IProgressMonitor m) {
		val resSet = new ResourceSetImpl
		val res = resSet.getResource(URI.createURI(l.scenarioEcoreUri), true)
		ePackage = (res.contents.head as EPackage).ESubpackages.findFirst[name == l.name + "Event"]
		gatherEventMethods(l)
		if (!inputEventToHandler.empty || !outputEventToHandler.empty) {
			val qNameSegments = new ArrayList(inputEventToHandler.keySet.filterNull.head.fullyQualifiedName.segments)
			qNameSegments.remove(qNameSegments.size - 1)
			scenarioPackageString = l.externalRuntimeName + ".scenario." + qNameSegments.join(".")
			languagePackageString = l.externalRuntimeName
			aspectsPackageString = l.aspectsNamespace + qNameSegments.join(".")
			val sourceFolder = targetProject.allPackageFragmentRoots.findFirst [ p |
				if (p.resource instanceof IFolder) {
					val folder = p.resource as IFolder
					val path = folder.fullPath.toString
					return path == ("/" + projectName + "/src")
				}
				return false
			]
			
			sourceFolder.createPackageFragment(packageName, true, m)
				.createCompilationUnit(eventManagerClassName + ".java", generateCode, true, m)
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

	private def boolean isInputEvent(Method m) {
		val stepAnnotation = m.getAnnotation(Step)
		if (stepAnnotation != null) {
			return stepAnnotation.eventTriggerable
		}
		return false
	}

	private def boolean isOutputEvent(Method m) {
		val stepAnnotation = m.getAnnotation(Step)
		if (stepAnnotation != null) {
			return stepAnnotation.outputEvent
		}
		return false
	}
	
	private def String getConditionName(Method m) {
		val stepAnnotation = m.getAnnotation(Step)
		if (stepAnnotation != null) {
			return stepAnnotation.precondition
		}
		return ""
	}

	private def void processAspect(Class<?> aspect) {
		val aspectInputEventHandlers = aspect.methods.filter[m|isInputEvent(m)]
		
		aspectInputEventHandlers.forEach[e|
			val conditionName = e.conditionName
			if (conditionName != "") {
				val conditionMethods = aspect.methods.filter[m|
					m.name == conditionName
				].toList
				if (conditionMethods.size == 1) {
					eventMethodToCondition.put(e, conditionMethods.get(0))
				}
			}
		]
		
		aspectInputEventHandlers.forEach [ m |
			val eventName = '''«aspected.get(aspect).name.toFirstUpper»«m.name.toFirstUpper»Event'''
			val eventClass = ePackage.findClassifier(eventName)
			if (eventClass != null) {
				inputEventToHandler.put(eventClass as EClass, m)
			}
		]
		
		val aspectOutputEventHandlers = aspect.methods.filter[m|isOutputEvent(m)]
		
		aspectOutputEventHandlers.forEach [ m |
			val eventName = '''«aspected.get(aspect).name.toFirstUpper»«m.name.toFirstUpper»Event'''
			val eventClass = ePackage.findClassifier(eventName)
			if (eventClass != null) {
				outputEventToHandler.put(eventClass as EClass, m)
			}
		]
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
		val body = generateBody
		
		'''
			package «packageName»;
			
			«generateImports»
			
			public class «language.name»EventManager extends AbstractEventManager {
			
				«body»
			}
		'''
	}

	private def String generateImports() {
		'''
			import java.util.Collections;
			import java.util.HashSet;
			import java.util.Set;
			
			import org.eclipse.emf.ecore.EClass;
			
			import fr.inria.diverse.event.commons.interpreter.event.AbstractEventManager;
			import fr.inria.diverse.event.commons.model.EventInstance;
			import fr.inria.diverse.event.commons.model.scenario.ScenarioPackage;
			«FOR handler : inputEventToHandler.values.filterNull.toSet»
			import «handler.declaringClass.name»;
			«ENDFOR»
			import «scenarioPackageString».«ePackage.name.toFirstUpper»Package;
			import «scenarioPackageString».«ePackage.name.toFirstUpper»Factory;
			«FOR event : inputEventToHandler.keySet.filterNull»
			import «scenarioPackageString».«event.name»;
			«ENDFOR»
			«FOR event : outputEventToHandler.keySet.filterNull»
			import «scenarioPackageString».«event.name»;
			«ENDFOR»
			«FOR elementReference : elementReferences»
			import «scenarioPackageString».«elementReference»;
			«ENDFOR»
			«FOR parameterType : eventParameterTypes»
			import «languagePackageString».«parameterType.fullyQualifiedName»;
			«ENDFOR»
		'''
	}

	private def String generateBody() {
		'''
			«generateCanSendEventMethod»
			
			«generateEventClassesGetter»
			
			«generateDispatch»
			«generateEventHandlers»
			«generateEventConditions»
			
			«generateEventBuilders»
		'''
	}

	private def String generateCanSendEventMethod() {
		'''
			@Override
			public boolean canSendEvent(Object input) {
				if (input instanceof EventInstance) {
					final EventInstance event = (EventInstance) input;
					«FOR entry : inputEventToHandler.entrySet SEPARATOR " else"»
					«val eventClass = entry.key»
					«val eventHandler = entry.value»
					«val eventClassName = eventClass.name»
					if (event.getOriginalEvent() instanceof «eventClassName») {
						«val eventCondition = eventMethodToCondition.get(eventHandler)»
						«IF eventCondition == null»
						return true;
						«ELSE»
						return canSend«eventClassName»(event);
						«ENDIF»
					}
					«ENDFOR»
				}
				return false;
			}
		'''
	}

	private def String generateDispatch() {
		'''
			@Override
			protected void dispatchEvent(EventInstance event) {
				«FOR eventHandler : inputEventToHandler.entrySet SEPARATOR " else"»
					«val eventClassName = eventHandler.key.name»
					if (event.getOriginalEvent() instanceof «eventClassName») {
						handle«eventClassName»(event);
					}
				«ENDFOR»
			}
		'''
	}

	private def String generateEventHandlers() {
		'''
			«FOR entry : inputEventToHandler.entrySet»
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
		val eventParametersDeclaration = eventClass.eventHandlerParametersDeclaration
		val eventParameters = eventClass.eventHandlerParameters
		val eventCondition = eventMethodToCondition.get(eventHandler)
		return '''
			private void handle«eventClassName»(EventInstance _event) {
				«eventParametersDeclaration»
				«IF eventCondition != null»
				if («eventHandlingClass».«eventCondition.name»(«eventParameters»)) {
					«eventHandlingClass».«eventHandlerName»(«eventParameters»);
				}
				«ELSE»
				«eventHandlingClass».«eventHandlerName»(«eventParameters»);
				«ENDIF»
			}
		'''
	}

	private def String generateEventConditions() {
		'''
			«FOR entry : inputEventToHandler.entrySet»
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
		val eventParametersDeclaration = eventClass.eventHandlerParametersDeclaration
		val eventParameters = eventClass.eventHandlerParameters
		return '''
			private boolean canSend«eventClassName»(EventInstance _event) {
				«eventParametersDeclaration»
				return «eventHandlingClass».«eventHandlerName»(«eventParameters»);
			}
		'''
	}

	private def void addType(EClassifier type) {
		eventParameterTypes.add(type)
	}
	
	private def String getEventHandlerParametersDeclaration(EClass eventClass) {
		'''
			«val targetType = eventClass.EGenericSuperTypes.head.ETypeArguments.head.EClassifier»
			«addType(targetType)»
			final «targetType.name» target = («targetType.name») _event.getParameters().get(ScenarioPackage.Literals.EVENT__TARGET_PROVIDER);
			«IF !eventClass.EStructuralFeatures.empty»
			«FOR i : 0..(eventClass.EStructuralFeatures.size - 1)»
			«val f = eventClass.EStructuralFeatures.get(i)»
			«val name = if (f.name.contains("Provider")) f.name.substring(0, f.name.indexOf("Provider")) else f.name»
			«val parameterType =
				if (f.EType instanceof EClass) {
					val type = (f.EType as EClass).EGenericSuperTypes.head.ETypeArguments.head.EClassifier
					addType(type)
					type.name
				}
				else f.EType.instanceClass.simpleName»
			final «parameterType» «name» = («parameterType») _event.getParameters().get(_event.getOriginalEvent().eClass().getEStructuralFeatures().get(«i»));
			«ENDFOR»
			«ENDIF»
		'''
	}

	private def String getEventHandlerParameters(EClass eventClass) {
		val parameters = new ArrayList
		parameters += '''target'''
		eventClass.EStructuralFeatures.forEach[f|
			val name = if (f.name.contains("Provider")) f.name.substring(0, f.name.indexOf("Provider")) else f.name
			parameters += '''«name»'''
		]
		parameters.join(", ")
	}

	private def String generateEventClassesGetter() {
		'''
			@Override
			public Set<EClass> getEventClasses() {
				final Set<EClass> eventClasses = new HashSet<>();
				«FOR entry : inputEventToHandler.entrySet»
					«val eventClass = entry.key as EClass»
					eventClasses.add(«ePackage.name.toFirstUpper»Package.eINSTANCE.get«eventClass.name»());
				«ENDFOR»
				return eventClasses;
			}
		'''
	}
	
	private def void addElementReference(String className) {
		elementReferences.add(className)
	}
	
	private def String generateEventBuilders() {
		'''
			@Override
			protected EventInstance rebuildEvent(Object result, Object caller, String className, String methodName) {
				«FOR entry : outputEventToHandler.entrySet SEPARATOR " else "»
				«val targetTypeName = entry.getKey.EGenericSuperTypes.head.ETypeArguments.head.EClassifier.name»
				if (className.equals("«targetTypeName»") && methodName.equals("«entry.getValue.name»")) {
					final «entry.getKey.name» event = «ePackage.name.toFirstUpper»Factory.eINSTANCE.create«entry.getKey.name»();
					event.setValue((String) result);
					final «targetTypeName»Reference targetProvider = «ePackage.name.toFirstUpper»Factory.eINSTANCE.create«targetTypeName»Reference();
					«addElementReference(targetTypeName + "Reference")»
					targetProvider.setElement((«targetTypeName») caller);
					event.setTargetProvider(targetProvider);
					return new EventInstance(event, Collections.emptyMap());
				}
				«ENDFOR»
				return null;
			}
		'''
	}
}
