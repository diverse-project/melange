package fr.inria.diverse.melange.jvmmodel

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.ASTHelper
import fr.inria.diverse.melange.ast.LanguageExtensions
import fr.inria.diverse.melange.ast.ModelTypeExtensions
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.ast.NamingHelper
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.metamodel.melange.ResourceType
import fr.inria.diverse.melange.preferences.MelangePreferencesAccess
import fr.inria.diverse.melange.resource.MelangeRegistry
import fr.inria.diverse.melange.resource.MelangeRegistry.LanguageDescriptor
import fr.inria.diverse.melange.resource.MelangeRegistry.ModelTypeDescriptor
import fr.inria.diverse.melange.resource.MelangeRegistryImpl.LanguageDescriptorImpl
import fr.inria.diverse.melange.resource.MelangeRegistryImpl.ModelTypeDescriptorImpl
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

/**
 * Entry point for the generation of a JVM model from which Xtext will
 * ultimately generate Java code.
 */
class MelangeJvmModelInferrer extends AbstractModelInferrer
{
	@Inject extension ASTHelper
	@Inject extension ModelTypeInferrer
	@Inject extension LanguageInferrer
	@Inject extension TransformationInferrer
	@Inject extension LanguageExtensions
	@Inject extension ModelingElementExtensions
	@Inject extension ModelTypeExtensions
	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject extension NamingHelper

	private static final Logger log = Logger.getLogger(MelangeJvmModelInferrer)

	/**
	 * Generates all the Java code supporting languages, interfaces, and
	 * adapters. {@code infer} is invoked right after the fully derived state
	 * of the Melange model is computed by
	 * {@link MelangeDerivedStateComputer#installDerivedState}. Essentially
	 * delegates to the other inferrers.
	 * 
	 * @param root The Melange model for which we want to generate code
	 * @param acceptor Automatically filled by Xtext
	 * @param isPreIndexingPhase Automatically filled by Xtext
	 */
	def dispatch void infer(
		ModelTypingSpace root,
		IJvmDeclaredTypeAcceptor acceptor,
		boolean isPreIndexingPhase
	) {
			// Only run codegen if everything's ready
			if (root.languages.exists[!isValid || !runtimeHasBeenGenerated]
				|| root.modelTypes.exists[!isValid])
				return;

			try {
				root.modelTypes.forEach[generateInterfaces(acceptor, _typeReferenceBuilder)]
				
				if (MelangePreferencesAccess.instance.generateAdaptersCode ||
					(MelangePreferencesAccess.instance.isUserLaunch && !isPreIndexingPhase)) {
					root.makeAllSemantics
					root.languages.forEach[generateAdapters(root, acceptor, _typeReferenceBuilder)]
					root.transformations.forEach[generateTransformation(acceptor, _typeReferenceBuilder)]
					root.createStandaloneSetup(acceptor)
	
					// If the user explicitly requests the code generation,
					// we generate code only once and turn off to avoid
					// Eclipse automatic build
					// ... actually, I don't think this is used by anyone anyway
					MelangePreferencesAccess.instance.disableCodeGenerator()
				}
			} catch (Exception e) {
				log.error("Error while generating", e)
			}
	}

	/**
	 * Creates a generic StandaloneSetup class meant to be used for
	 * registering languages, interfaces and adapters in a standalone context.
	 */
	def void createStandaloneSetup(ModelTypingSpace root, IJvmDeclaredTypeAcceptor acceptor) {
		acceptor.accept(root.toClass(root.standaloneSetupClassName))
		[
			members += root.toMethod("doSetup", Void::TYPE.typeRef)[
				^static = true
				body = '''
					StandaloneSetup setup = new StandaloneSetup();
					setup.doEMFRegistration();
					setup.doAdaptersRegistration();
				'''
			]

			members += root.toMethod("doEMFRegistration", Void::TYPE.typeRef)[
				body = '''
					«FOR l : root.languages»
						«IF l.resourceType == ResourceType.XTEXT && l.xtextSetupRef !== null»
							«l.xtextSetupRef.qualifiedName».doSetup();
						«ELSE»
							«FOR gp : l.syntax.allGenPkgs»
								«EPackage.Registry».INSTANCE.put(
									«gp.qualifiedPackageInterfaceName».eNS_URI,
									«gp.qualifiedPackageInterfaceName».eINSTANCE
								);
							«ENDFOR»
						«ENDIF»
					«ENDFOR»

					«Resource.Factory.Registry».INSTANCE.getExtensionToFactoryMap().put(
						"*",
						new «XMIResourceFactoryImpl»()
					);
					«Resource.Factory.Registry».INSTANCE.getProtocolToFactoryMap().put(
						"melange",
						new «MelangeResourceFactoryImpl»()
					);
				'''
			]

			members += root.toMethod("doAdaptersRegistration", Void::TYPE.typeRef)[
				body = '''
					«FOR l : root.languages»
						«LanguageDescriptor» «l.name.toFirstLower» = new «LanguageDescriptorImpl»(
							"«l.fullyQualifiedName»", "«l.documentation?.replace("\"", "'")?.replace("\n", " ")»", "«l.syntax.rootPackageUri»", "«l.exactType.fullyQualifiedName»"
						);
						«FOR mt : l.^implements»
							«l.name.toFirstLower».addAdapter("«mt.fullyQualifiedName»", «l.syntax.adapterNameFor(mt)».class);
						«ENDFOR»
						«MelangeRegistry».INSTANCE.getLanguageMap().put(
							"«l.fullyQualifiedName»",
							«l.name.toFirstLower»
						);
					«ENDFOR»
					«FOR mt : root.modelTypes»
						«ModelTypeDescriptor» «mt.name.toFirstLower» = new «ModelTypeDescriptorImpl»(
							"«mt.fullyQualifiedName»", "«mt.documentation»", "«mt.uri»"
						);
						«FOR superMt : mt.subtypingRelations»
							«mt.name.toFirstLower».addSuperType("«superMt.superType.fullyQualifiedName»");
						«ENDFOR»
						«MelangeRegistry».INSTANCE.getModelTypeMap().put(
							"«mt.fullyQualifiedName»",
							«mt.name.toFirstLower»
						);
					«ENDFOR»
				'''
			]
		]
	}
}
