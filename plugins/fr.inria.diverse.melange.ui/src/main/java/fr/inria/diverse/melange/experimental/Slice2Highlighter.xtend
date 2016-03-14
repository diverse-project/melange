package fr.inria.diverse.melange.experimental

import org.eclipse.xtend.lib.annotations.Data
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import java.util.List
import org.eclipse.swt.graphics.RGB

@Data
class Region{
	int start
	int end
}

//TODO: merge with Parser?
interface Highlighter{
	def List<Pair<Region,TextStyle>> getColors()
	def String getKeyword()
}

abstract class AbstractHighlighter implements Highlighter{
	
	protected String source
	protected Parser parser
	
	new(String source, Parser parser){
		this.source = source
		this.parser = parser
	}
}

class Slice2Highlighter extends AbstractHighlighter{
	
	new(String source, Parser parser) {
		super(source, parser)
	}
	
	override getColors() {
		val res = newArrayList
		
		val slice2Parser = parser as Slice2Parser
		
		val optPos = source.indexOf(slice2Parser.SUBTYPES)
		if(optPos != -1){
			val region = new Region(optPos,optPos+slice2Parser.SUBTYPES.length-1)
			val TextStyle textStyle = new TextStyle();
			textStyle.color = new RGB(42, 0, 255)
			res.add(new Pair(region,textStyle))
		}
		
		val optPos2 = source.indexOf(slice2Parser.CARD1)
		if(optPos2 != -1){
			val region = new Region(optPos2,optPos2+slice2Parser.CARD1.length-1)
			val TextStyle textStyle = new TextStyle();
			textStyle.color = new RGB(42, 255, 0)
			res.add(new Pair(region,textStyle))
		}
		
		return res
	}
	
	override String getKeyword(){
		return "slice2"
	}
}