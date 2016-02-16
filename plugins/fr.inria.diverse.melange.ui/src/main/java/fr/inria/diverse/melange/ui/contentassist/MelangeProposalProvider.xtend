package fr.inria.diverse.melange.ui.contentassist

import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.Platform
import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.text.IDocument
import org.eclipse.jface.text.contentassist.ICompletionProposal
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.ResourcesPlugin
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace

class MelangeProposalProvider extends AbstractMelangeProposalProvider
{
	private static final String CONTENTASSIST_SYNTAX_ID = "fr.inria.diverse.melange.ui.contentassist_syntax"
	private static final String CONTENTASSIST_OPERATOR_ID = "fr.inria.diverse.melange.ui.contentassist_operator"
	private static final String CONTENTASSIST_ECL_ID = "fr.inria.diverse.melange.ui.contentassist_ecl"
	
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