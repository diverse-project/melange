package fr.inria.diverse.melange.ui.contentassist;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.ui.editor.contentassist.AbstractJavaBasedContentProposalProvider;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.hover.IEObjectHover;

import com.google.common.base.Function;
import com.google.inject.Inject;

public class MelangeProposalProvider extends AbstractMelangeProposalProvider {
	private final static Logger log = Logger.getLogger(MelangeProposalProvider.class);

	@Inject
	private IEObjectHover hover;

	@Inject IQualifiedNameProvider prov;

	protected class MelangeProposalCreator extends DefaultProposalCreator {

		private final ContentAssistContext contentAssistContext;
		private final String ruleName;

		protected final IValueConverter<Object> valueConverter;


		public MelangeProposalCreator(ContentAssistContext contentAssistContext, String ruleName,
				IQualifiedNameConverter qualifiedNameConverter) {
			super(contentAssistContext, ruleName, qualifiedNameConverter);
			this.contentAssistContext = contentAssistContext;
			this.ruleName = ruleName;
			if (this.ruleName != null && getValueConverter() instanceof IValueConverterService.Introspectable) {
				this.valueConverter = ((IValueConverterService.Introspectable)getValueConverter()).getConverter(ruleName);
			} else {
				this.valueConverter = null;
			}
		}

		/**
		 * We check if the candidate object description is a Classifier or a Structural Feature.
		 * If so, we use our custom "apply()" method to provide the correct qualified name proposal;
		 * otherwise we use the standard apply method from AbstractJavaBasedContentProposalProvider
		 * 
		 * This is basically a copy/paste from the AbstractJavaBasedContentProposalProvider class
		 * to change the qualified name proposal generation.
		 */
		@Override
		public ICompletionProposal apply(IEObjectDescription candidate) {
			if (candidate == null)
				return null;
			EObject ss = candidate.getEObjectOrProxy();
			if (! (ss instanceof EClassifier || ss instanceof EStructuralFeature)){
				return super.apply(candidate);
			}
			ICompletionProposal result = null;
			String proposal = prov.getFullyQualifiedName(candidate.getEObjectOrProxy()).toString();
			if (valueConverter != null) {
				try {
					proposal = valueConverter.toString(proposal);
				} catch (ValueConverterException e) {
					log.debug(e.getMessage(), e);
					return null;
				}
			} else if (ruleName != null) {
				try {
					proposal = getValueConverter().toString(proposal, ruleName);
				} catch (ValueConverterException e) {
					log.debug(e.getMessage(), e);
					return null;
				}
			}
			EObject objectOrProxy = candidate.getEObjectOrProxy();
			StyledString displayString = getStyledDisplayString(candidate);
			Image image = getImage(objectOrProxy);
			result = createCompletionProposal(proposal, displayString, image, contentAssistContext);
			if (result instanceof ConfigurableCompletionProposal) {
				((ConfigurableCompletionProposal) result).setProposalContextResource(contentAssistContext.getResource());
				((ConfigurableCompletionProposal) result).setAdditionalProposalInfo(objectOrProxy);
				((ConfigurableCompletionProposal) result).setHover(hover);
			}
			getPriorityHelper().adjustCrossReferencePriority(result, contentAssistContext.getPrefix());
			return result;
		}
	}

	@Override
	public Function<IEObjectDescription, ICompletionProposal> getProposalFactory(String ruleName,
			ContentAssistContext contentAssistContext){
				return new MelangeProposalCreator(contentAssistContext, ruleName, getQualifiedNameConverter());
			}
}
