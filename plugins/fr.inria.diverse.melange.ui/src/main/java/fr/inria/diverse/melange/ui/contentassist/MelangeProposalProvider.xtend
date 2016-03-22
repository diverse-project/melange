package fr.inria.diverse.melange.ui.contentassist

import fr.inria.diverse.melange.ast.AspectExtensions
import fr.inria.diverse.melange.metamodel.melange.Language
import java.util.List
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.FileLocator
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.Platform
import org.eclipse.emf.ecore.EObject
import org.eclipse.jdt.core.search.IJavaSearchConstants
import org.eclipse.jdt.core.search.IJavaSearchScope
import org.eclipse.jdt.core.search.SearchEngine
import org.eclipse.jdt.core.search.SearchMatch
import org.eclipse.jdt.core.search.SearchPattern
import org.eclipse.jdt.core.search.SearchRequestor
import org.eclipse.jdt.internal.core.SourceType
import org.eclipse.jface.resource.ImageDescriptor
import org.eclipse.jface.text.IDocument
import org.eclipse.jface.text.contentassist.ICompletionProposal
import org.eclipse.jface.viewers.StyledString
import org.eclipse.swt.graphics.Image
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor

class MelangeProposalProvider extends AbstractMelangeProposalProvider
{
	private static final String CONTENTASSIST_SYNTAX_ID = "fr.inria.diverse.melange.ui.contentassist_syntax"
	private static final String CONTENTASSIST_OPERATOR_ID = "fr.inria.diverse.melange.ui.contentassist_operator"
	private static final String CONTENTASSIST_ECL_ID = "fr.inria.diverse.melange.ui.contentassist_ecl"
	
	private List<String> lastFoundAspects = newArrayList
	private final Image ASPECT_IMAGE
	
	new(){
		val bundle = Platform.getBundle("fr.inria.diverse.melange.ui")
        val path = new Path("icons/melange.png")
        val url = FileLocator.find(bundle, path, null);
        val desc = ImageDescriptor.createFromURL(url);
        ASPECT_IMAGE = desc.createImage
	}
	
	override completeImport_EcoreUri(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeImport_EcoreUri(model, assignment, context, acceptor)
		val IConfigurationElement[] config = Platform.getExtensionRegistry(). getConfigurationElementsFor(CONTENTASSIST_SYNTAX_ID);
		try {
			for (IConfigurationElement e : config) {
				val realProp = e.createExecutableExtension("class");
				if (realProp instanceof IProposal) {
					val proposal = createCompletionProposal("\"platform/resource/project/file.ecore\"", realProp.displayText, null, context)
					if(proposal !== null){
						acceptor.accept(new DecoratorCompletionProposal(proposal,realProp,getProject(model)))
					}
				}
			}
		} catch (CoreException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	override completeAspectTypeRef_AspectTypeRef(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		lastFoundAspects.clear
		val SearchPattern pattern = SearchPattern.createPattern(AspectExtensions::ASPECT_ANNOTATION_FQN,IJavaSearchConstants.TYPE,IJavaSearchConstants.ANNOTATION_TYPE_REFERENCE,SearchPattern.R_PATTERN_MATCH)
		val IJavaSearchScope scope = SearchEngine.createWorkspaceScope()
		val SearchRequestor requestor = new SearchRequestor{
			override acceptSearchMatch(SearchMatch match) throws CoreException {
				if(match.element instanceof SourceType){
					val candidate = match.element as SourceType
					lastFoundAspects.add(candidate.fullyQualifiedName)
				}
			}
		}
		val SearchEngine searchEngine = new SearchEngine();
    	searchEngine.search(pattern, #[SearchEngine.getDefaultSearchParticipant()], scope, requestor, null);
		super.completeAspectTypeRef_AspectTypeRef(model, assignment, context, acceptor)
	}
	
	override completeLanguage_Operators(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeLanguage_Operators(model, assignment, context, acceptor)
		
		val IConfigurationElement[] config = Platform.getExtensionRegistry(). getConfigurationElementsFor(CONTENTASSIST_OPERATOR_ID);
		try {
			for (IConfigurationElement e : config) {
				val realProp = e.createExecutableExtension("class");
				if (realProp instanceof IProposal) {
					if(model instanceof Language){
						realProp.configureProposal(model)
					}
					val proposal = createCompletionProposal("", realProp.displayText, null, context)
					if(proposal !== null){
						acceptor.accept(new DecoratorCompletionProposal(proposal,realProp,getProject(model)))
					}
				}
			}
		} catch (CoreException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	override completeLanguage_Ecl(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeLanguage_Ecl(model, assignment, context, acceptor)
		
		val IConfigurationElement[] config = Platform.getExtensionRegistry(). getConfigurationElementsFor(CONTENTASSIST_ECL_ID);
		try {
			for (IConfigurationElement e : config) {
				val realProp = e.createExecutableExtension("class");
				if (realProp instanceof IProposal) {
					val proposal = createCompletionProposal("\"/project/file.ecl\"", realProp.displayText, null, context)
					if(proposal !== null){
						acceptor.accept(new DecoratorCompletionProposal(proposal,realProp,getProject(model)))
					}
				}
			}
		} catch (CoreException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	/**
	 * Return null if fail
	 */
	def private IProject getProject(EObject model){
		try{
			val melangeFile = model.eResource.URI.toString
			val prefix = "platform:/resource/"
			val projectName = melangeFile.substring(prefix.length, melangeFile.indexOf("/",prefix.length))
			val project = ResourcesPlugin.workspace.root.getProject(projectName)
			if(project.exists)
				return project
		}
		catch(Exception e){}
		
		return null
	}
	
	override createCompletionProposal(String proposal, StyledString displayString, Image image, ContentAssistContext contentAssistContext) {
		val res = super.createCompletionProposal(proposal, displayString, image, contentAssistContext)
		if(res instanceof ConfigurableCompletionProposal){
			if(lastFoundAspects.contains(proposal)){
				res.priority = 5000 // should be enough
				if(ASPECT_IMAGE !== null){
					res.image = ASPECT_IMAGE
				}
			}
		}
		res
	}
}

/**
 * This class is a hack to perform an action before calling apply()
 */
class DecoratorCompletionProposal implements ICompletionProposal{
	
	protected ICompletionProposal innerProposal
	protected IProposal innerRealProposal
	protected IProject melangeProject
	
	new(ICompletionProposal proposal, IProposal realProposal, IProject project){
		innerProposal = proposal
		innerRealProposal = realProposal
		melangeProject = project
	}
	
	override apply(IDocument document) {
		val newText = innerRealProposal.replacementText
		if(innerProposal instanceof ConfigurableCompletionProposal && innerRealProposal !== null){
			val prop = innerProposal as ConfigurableCompletionProposal
			prop.replacementString = newText
			prop.cursorPosition = newText.length
			innerRealProposal.configureProject(melangeProject)
		}
		
		innerProposal.apply(document)
	}
	
	override getAdditionalProposalInfo() {
		innerProposal.additionalProposalInfo
	}
	
	override getContextInformation() {
		innerProposal.contextInformation
	}
	
	override getDisplayString() {
		innerProposal.displayString
	}
	
	override getImage() {
		innerProposal.image
	}
	
	override getSelection(IDocument document) {
		innerProposal.getSelection(document)
	}
}