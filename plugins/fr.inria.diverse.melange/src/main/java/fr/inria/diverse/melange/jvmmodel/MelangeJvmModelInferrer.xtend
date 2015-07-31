package fr.inria.diverse.melange.jvmmodel

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.ASTHelper
import fr.inria.diverse.melange.ast.ASTProcessingException
import fr.inria.diverse.melange.ast.LanguageExtensions
import fr.inria.diverse.melange.ast.MetamodelExtensions
import fr.inria.diverse.melange.ast.ModelTypeExtensions
import fr.inria.diverse.melange.ast.NamingHelper
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.metamodel.melange.ResourceType
import fr.inria.diverse.melange.preferences.MelangePreferencesAccess
import org.apache.log4j.Logger
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

/**
 * This class manages Java source code generation for a Melange model
 */
class MelangeJvmModelInferrer extends AbstractModelInferrer
{
	@Inject extension ASTHelper
	@Inject extension ModelTypeInferrer
	@Inject extension LanguageInferrer
	@Inject extension TransformationInferrer
	@Inject extension LanguageExtensions
	@Inject extension MetamodelExtensions
	@Inject extension ModelTypeExtensions
	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject extension NamingHelper
//	@Inject extension KomprenInferrer

	static final Logger logger = Logger.getLogger(MelangeJvmModelInferrer)

	/**
	 * Create Java source code for each Model types, Metamodels and Transformations
	 * defined in {@link typingSpace}  
	 * 
	 * @param root Melange model
	 * @param acceptor
	 * @param isPreIndexingPhase
	 */
	def dispatch void infer(ModelTypingSpace root, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
			// Only run codegen if everything's ready
			if (root.languages.exists[!isComplete || !runtimeHasBeenGenerated] || root.modelTypes.exists[!isComplete])
				return;

			try {
	//			if (Diagnostician.INSTANCE.validate(typingSpace).severity != Diagnostic.ERROR) {
	
				root.modelTypes.forEach[generateInterfaces(acceptor, _typeReferenceBuilder)]
				
				if (MelangePreferencesAccess.instance.generateAdaptersCode || (MelangePreferencesAccess.instance.isUserLaunch && !isPreIndexingPhase)) {
					root.languages.forEach[generateAdapters(root, acceptor, _typeReferenceBuilder)]
					root.transformations.forEach[generateTransformation(acceptor, _typeReferenceBuilder)]
					root.createStandaloneSetup(acceptor)
	//				root.slicers.forEach[generateSlicer]
	
					//If user request the compilation, we generate code only once
					//and turn off to avoid automatic build
					MelangePreferencesAccess.instance.disableCodeGenerator()
				} // else shhh...
				
	//			} else {
	//				logger.error('''Inferrer cannot proceed: there are errors in the model.''')
	//			}
			} catch (ASTProcessingException e) {
				logger.error('''ASTProcessingException: «e.message»''')
			} catch (Exception e) {
				logger.error('''Exception: «e.message»''', e)
			}
	}

	/**
	 * Creates a generic StandaloneSetup class meant to be used for
	 * registering language, interfaces and adapters in a standalone context.
	 */
	def void createStandaloneSetup(ModelTypingSpace root, IJvmDeclaredTypeAcceptor acceptor) {
		acceptor.accept(root.toClass(root.standaloneSetupClassName))
		[
			members += root.toMethod("doSetup", Void::TYPE.typeRef)[
				^static = true
				body = '''
					StandaloneSetup setup = new StandaloneSetup() ;
					setup.doEMFRegistration() ;
					setup.doAdaptersRegistration() ;
				'''
			]

			members += root.toMethod("doEMFRegistration", Void::TYPE.typeRef)[
				body = '''
					«FOR l : root.languages»
						«IF l.resourceType == ResourceType.XTEXT && l.xtextSetupRef !== null»
							«l.xtextSetupRef.qualifiedName».doSetup() ;
						«ELSE»
							«FOR gm : l.syntax.genmodels.filterNull»
								«FOR gp : gm.genPackages.filterNull»
									org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(
										«gp.packageFqn».eNS_URI,
										«gp.packageFqn».eINSTANCE
									) ;
								«ENDFOR»
							«ENDFOR»
						«ENDIF»
					«ENDFOR»

					org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
						"*",
						new org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl()
					) ;
					org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
						"melange",
						new fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl()
					) ;
				'''
			]

			members += root.toMethod("doAdaptersRegistration", Void::TYPE.typeRef)[
				body = '''
					«FOR l : root.languages»
						fr.inria.diverse.melange.resource.MelangeRegistryImpl.LanguageDescriptorImpl «l.name.toFirstLower» = new fr.inria.diverse.melange.resource.MelangeRegistryImpl.LanguageDescriptorImpl(
							"«l.fullyQualifiedName»", "«l.documentation»", "«l.syntax.packageUri»", "«l.exactType.fullyQualifiedName»"
						) ;
						«FOR mt : l.^implements»
							«l.name.toFirstLower».addAdapter("«mt.fullyQualifiedName»", «l.syntax.adapterNameFor(mt)».class) ;
						«ENDFOR»
						fr.inria.diverse.melange.resource.MelangeRegistry.INSTANCE.getLanguageMap().put(
							"«l.fullyQualifiedName»",
							«l.name.toFirstLower»
						) ;
					«ENDFOR»
					«FOR mt : root.modelTypes»
						fr.inria.diverse.melange.resource.MelangeRegistryImpl.ModelTypeDescriptorImpl «mt.name.toFirstLower» = new fr.inria.diverse.melange.resource.MelangeRegistryImpl.ModelTypeDescriptorImpl(
							"«mt.fullyQualifiedName»", "«mt.documentation»", "«mt.uri»"
						) ;
						«FOR superMt : mt.subtypingRelations»
							«mt.name.toFirstLower».addSuperType("«superMt.superType.fullyQualifiedName»") ;
						«ENDFOR»
						fr.inria.diverse.melange.resource.MelangeRegistry.INSTANCE.getModelTypeMap().put(
							"«mt.fullyQualifiedName»",
							«mt.name.toFirstLower»
						) ;
					«ENDFOR»
				'''
			]
		]
	}
}
