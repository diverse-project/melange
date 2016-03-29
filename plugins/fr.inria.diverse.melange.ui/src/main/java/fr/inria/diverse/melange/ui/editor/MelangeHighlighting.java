package fr.inria.diverse.melange.ui.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import org.eclipse.xtext.xbase.lib.Pair;

import fr.inria.diverse.melange.experimental.Highlighter;
import fr.inria.diverse.melange.experimental.Region;
import fr.inria.diverse.melange.experimental.Slice2Highlighter;
import fr.inria.diverse.melange.experimental.Slice2Parser;
import fr.inria.diverse.melange.metamodel.melange.CustomLanguageOperator;
import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace;

public class MelangeHighlighting implements ISemanticHighlightingCalculator {
	
	List<Highlighter> registered = new ArrayList<Highlighter>();

	@Override
	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		if (resource == null || resource.getParseResult() == null)
			return;

		//TODO: mangage with extension point
		Slice2Highlighter painter = new Slice2Highlighter();
		registered.add(painter);
		
		
		ModelTypingSpace root = (ModelTypingSpace) resource.getContents().get(0);
		Object[] allCustomOp = 
				root.getElements().stream()
					.filter(elem -> elem instanceof Language)
					.flatMap(lang -> ((Language) lang).getOperators().stream())
					.filter(op -> op instanceof CustomLanguageOperator)
					.toArray();
		for(Object customOp : allCustomOp){
			CustomLanguageOperator op = (CustomLanguageOperator) customOp;
			Highlighter highlighter = getHighligther(op);
			INode node = getParamtersNode(op);
			
			if(highlighter != null && node != null){
				INode nameNode = getKeywordNode(op);
				acceptor.addPosition(nameNode.getOffset(),
						nameNode.getLength(),
						DefaultHighlightingConfiguration.KEYWORD_ID);
				
				List<Pair<Region, String>> colors = highlighter.getColors(node);
				for (Pair<Region, String> pair : colors) {
					String ID = pair.getValue();
					Region region = pair.getKey();
					acceptor.addPosition(region.getStart(),
							region.getEnd() - region.getStart() + 1,
							ID);
				}
			}
		}
		
//		INode root = resource.getParseResult().getRootNode();
//		for (INode node : root.getAsTreeIterable()) {
//			if (node.getSemanticElement() instanceof CustomLanguageOperator) {
//
//				CustomLanguageOperator op = (CustomLanguageOperator) node.getSemanticElement();
//				String opName = op.getName();
//
//				Iterable<ILeafNode> leafs = node.getLeafNodes();
//				for (ILeafNode iLeafNode : leafs) {
//					if (iLeafNode.getText().equals(opName)) {
//						//color keyword
//						acceptor.addPosition(iLeafNode.getOffset(),
//								iLeafNode.getLength(),
//								DefaultHighlightingConfiguration.KEYWORD_ID);
//					}
//				}
//			}
//		}
	}
	
	public INode getParamtersNode(CustomLanguageOperator operator){
		EStructuralFeature parameters = operator.eClass().getEStructuralFeature("parameters");
		List<INode> nodesOp = NodeModelUtils.findNodesForFeature(operator, parameters);
		
		if(!nodesOp.isEmpty()){
			return nodesOp.get(0);
		}
		
		return null;
	}
	
	public INode getKeywordNode(CustomLanguageOperator operator){
		EStructuralFeature name = operator.eClass().getEStructuralFeature("name");
		List<INode> nodesOp = NodeModelUtils.findNodesForFeature(operator, name);
		
		if(!nodesOp.isEmpty()){
			return nodesOp.get(0);
		}
		
		return null;
	}
	
	public Highlighter getHighligther(CustomLanguageOperator op){
		for(Highlighter elem : registered){
			if(elem.getKeyword().equals(op.getName())){
				return elem;
			}
		}
		return null;
	}
}

