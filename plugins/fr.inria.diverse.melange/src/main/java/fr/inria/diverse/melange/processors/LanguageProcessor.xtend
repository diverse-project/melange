package fr.inria.diverse.melange.processors

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.ASTHelper
import fr.inria.diverse.melange.ast.AspectExtensions
import fr.inria.diverse.melange.ast.LanguageExtensions
import fr.inria.diverse.melange.ast.ModelTypeExtensions
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.builder.LanguageBuilder
import fr.inria.diverse.melange.builder.ModelTypingSpaceBuilder
import fr.inria.diverse.melange.metamodel.melange.Import
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.MelangeFactory
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.metamodel.melange.Weave
import fr.inria.diverse.melange.utils.EPackageProvider
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import fr.inria.diverse.melange.lib.EcoreExtensions
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.transaction.TransactionalEditingDomain
import org.eclipse.emf.transaction.util.TransactionUtil
import org.eclipse.emf.transaction.RecordingCommand
import org.eclipse.emf.ecore.resource.ResourceSet
import java.util.Set
import fr.inria.diverse.melange.metamodel.melange.ExternalLanguage

/**
 * Builds {@link Language}s by merging the various parts declared in each
 * language definitions and generates new Ecores & Genmodels if needed
 * 
 * FIXME: I don't understand much of what's going on here
 */
class LanguageProcessor extends DispatchMelangeProcessor
{
	@Inject extension ASTHelper
	@Inject EPackageProvider packageProvider
	@Inject extension AspectExtensions
	@Inject extension LanguageExtensions
	@Inject extension ModelingElementExtensions
	@Inject extension ModelTypeExtensions
	@Inject extension EcoreExtensions
	@Inject ModelTypingSpaceBuilder builder
	@Inject JvmTypesBuilder typesBuilder
	@Inject JvmTypeReferenceBuilder.Factory typeRefBuilderFactory
	JvmTypeReferenceBuilder typeRefBuilder

	def dispatch void preProcess(ModelTypingSpace root, boolean isPreLinkingPhase) {
		typeRefBuilder = typeRefBuilderFactory.create(root.eResource.resourceSet)
		builder.reset

		// First, initialize the exactType and syntax of each language
		root.languages.forEach[language |
			language.initializeExactType
			language.initializeSyntax
		]

		// Then, collect the appropriate builder for this language and invoke it
		root.languages.forEach[language |
			val langBuilder = builder.getBuilder(language)
			build(langBuilder)
		]

		// Last, take care of its semantics
		root.languages.forEach[language |
			language.initializeSemantic
		]
	}

	private def void loadLanguageWithSyntax(ResourceSet rs, Language language, Set<EPackage> syntax) {
		var res = rs.getResource(URI::createURI(language.name + "RootPackage"), false)
		if (res !== null)
			rs.resources.remove(res)
		res = rs.createResource(URI::createURI(language.name + "RootPackage"))
		res?.contents?.addAll(syntax)
	}

	/**
	 * Uses the supplied {@link LanguageBuilder} {@code builder} to build
	 * the currently processed language, and registers it if no errors
	 * are encountered.
	 */
	private def build(LanguageBuilder builder) {
		val language = builder.source
		var syntax = builder.model

		// TODO: init with build errors if already built
		val errors = newArrayList
		// If not built yet
		if (syntax === null) {
			builder.build()
			// TODO: manage errors & model not built
			errors += builder.errors
			syntax = builder.model
		}

		if(language.isGeneratedByMelange){
				syntax.forEach[initializeNsUriWith(language.externalPackageUri)]
		}

		// FIXME: I don't understand what's going on here
		if (errors.empty) {
			val rs = language.eResource.resourceSet
			val TransactionalEditingDomain ed = TransactionUtil.getEditingDomain(rs);
			// If the resource set has an editing domain, we need a transactioon
			if (ed != null && ed.commandStack != null) {
				val syntax_val = syntax
				val RecordingCommand command = new RecordingCommand(ed) {
					override protected doExecute() {
						loadLanguageWithSyntax(rs, language, syntax_val)
					}
				}
				ed.commandStack.execute(command)
			} // Else, we do not need a transactioon
			else {
				loadLanguageWithSyntax(rs, language, syntax)
			}
			syntax.forEach[packageProvider.registerPackages(language.syntax, it)]
		}
	}

	/**
	 * Initialize the syntax of the {@link Language} {@code language} by
	 * creating a new {@link Metamodel} for it. The #ecoreUri and #genmodelUris
	 * of the new {@link Metamodel} are derived either from 'import' clauses
	 * or from the external URIs where its Ecore and Genmodel will be generated.
	 */
	private def void initializeSyntax(Language language) {
		language.syntax = MelangeFactory.eINSTANCE.createMetamodel

		if (language.isGeneratedByMelange) {
			language.syntax.ecoreUri = language.externalEcoreUri
			language.syntax.genmodelUris += language.externalGenmodelUri 
		} else {
			val importClause = language.operators.filter(Import).head

			if (importClause !== null) {
				language.syntax.ecoreUri = importClause.ecoreUri
				language.syntax.genmodelUris += importClause.genmodelUris
			}
		}
	}

	/**
	 * Initializes the #ecoreUri of the exact {@link ModelType} of the supplied
	 * {@code language}.
	 */
	private def void initializeExactType(Language language) {
		if(language instanceof ExternalLanguage)
			language.exactType.ecoreUri = language.operators.filter(Import).head?.ecoreUri
		else if (language.exactType !== null)
			language.exactType.ecoreUri = language.exactType.inferredEcoreUri
	}

	/**
	 * Resets the semantics of the supplied {@code language} and recreates
	 * a semantics inferred from the list of {@link Aspect}s woven using the
	 * 'with' keyword. #ecoreFragment are also inferred here, based on the
	 * result of the associated builders.
	 */
	private def void initializeSemantic(Language language) {
		language.semantics.clear
		language.semantics +=
		language.operators
		.filter(Weave)
		.filter[aspectTypeRef?.type instanceof JvmDeclaredType]
		.map[w |
			// FIXME: Some checks needed here
			MelangeFactory.eINSTANCE.createAspect => [
				aspectTypeRef = typesBuilder.cloneWithProxies(w.aspectTypeRef)
				val classFqName = aspectTypeRef.aspectAnnotationValue
				if (classFqName !== null){
					aspectedClass = language.syntax.findClass(classFqName)
					if(aspectedClass === null){ //try renaming
						val renamings = language.collectMappings
						val newName = classFqName.rename(renamings)
						aspectedClass = language.syntax.findClass(newName)
					}
				}
				ecoreFragment = builder.getBuilder(language).findBuilder(w)?.model?.head
			]
		]
	}
}
