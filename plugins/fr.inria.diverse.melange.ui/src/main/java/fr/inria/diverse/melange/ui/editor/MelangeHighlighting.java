package fr.inria.diverse.melange.ui.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import fr.inria.diverse.melange.experimental.Highlighter;
import fr.inria.diverse.melange.experimental.Slice2Highlighter;
import fr.inria.diverse.melange.experimental.Slice2Parser;
import fr.inria.diverse.melange.metamodel.melange.CustomLanguageOperator;

public class MelangeHighlighting implements ISemanticHighlightingCalculator {
	
	List<Highlighter> registered = new ArrayList<Highlighter>();

	@Override
	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		if (resource == null || resource.getParseResult() == null)
			return;

		//TODO: mangage with extension point
		Slice2Parser parser = new Slice2Parser();
		Slice2Highlighter painter = Slice2Highlighter();
		registered.add(painter)
		
		INode root = resource.getParseResult().getRootNode();
		for (INode node : root.getAsTreeIterable()) {
			if (node.getSemanticElement() instanceof CustomLanguageOperator) {

				CustomLanguageOperator op = (CustomLanguageOperator) node.getSemanticElement();
				String opName = op.getName();

				Iterable<ILeafNode> leafs = node.getLeafNodes();
				for (ILeafNode iLeafNode : leafs) {
					if (iLeafNode.getText().equals(opName)) {
						acceptor.addPosition(iLeafNode.getOffset(),
								iLeafNode.getLength(),
								DefaultHighlightingConfiguration.KEYWORD_ID);
					}
				}
			}
		}
	}
}
