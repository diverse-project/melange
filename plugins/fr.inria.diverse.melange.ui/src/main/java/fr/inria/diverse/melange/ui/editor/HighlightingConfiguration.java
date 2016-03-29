package fr.inria.diverse.melange.ui.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingConfiguration;

import fr.inria.diverse.melange.experimental.Highlighter;
import fr.inria.diverse.melange.experimental.Slice2Highlighter;

public class HighlightingConfiguration extends XbaseHighlightingConfiguration{

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		
		//TODO: mangage with extension point & refactor with MelangeHighlighter
		List<Highlighter> registered = new ArrayList<Highlighter>();
		Slice2Highlighter painter = new Slice2Highlighter();
		registered.add(painter);
		
		for (Pair<String, TextStyle> pair : painter.getStyles()) {
			acceptor.acceptDefaultHighlighting(pair.getKey(), "no description", pair.getValue());
		}
	}
}
