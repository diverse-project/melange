package fr.inria.diverse.melange.experimental

import org.eclipse.xtend.lib.annotations.Data
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import java.util.List
import org.eclipse.swt.graphics.RGB
import org.eclipse.xtext.nodemodel.INode

@Data
class Region{
	int start
	int end
}

//TODO: merge with Parser?
interface Highlighter{
	def List<Pair<Region,String>> getColors(INode source)
	def String getKeyword()
	def List<Pair<String,TextStyle>> getStyles()
}

abstract class AbstractHighlighter implements Highlighter{
	
	protected Parser parser
	
	def void init(Parser parser){
		this.parser = parser
	}
}

class Slice2Highlighter extends AbstractHighlighter{
	
	final public String SUBTYPES = "SUBTYPES"
	final public String CARD1 = "CARD1"
	
	override void init(Parser parser) {
		super.init(parser)
	}
	
	override getColors(INode source) {
		val res = newArrayList
		
//		val slice2Parser = parser as Slice2Parser
		
		val rawText = source.text
		val offset = source.offset
		
		val optPos = rawText.indexOf(SUBTYPES)
		if(optPos != -1){
			val region = new Region(offset+optPos,offset+optPos+SUBTYPES.length-1)
			res.add(new Pair(region,SUBTYPES))
		}
		
		val optPos2 = rawText.indexOf(CARD1)
		if(optPos2 != -1){
			val region = new Region(offset+optPos2,offset+optPos2+CARD1.length-1)
			res.add(new Pair(region,CARD1))
		}
		
		return res
	}
	
	override String getKeyword(){
		return "slice2"
	}
	
	/*
	 * List of <ID,Style>
	 */
	override getStyles() {
		val res = newArrayList
		
		val TextStyle textStyle = new TextStyle()
			textStyle.color = new RGB(42, 0, 255)
		res.add(new Pair(SUBTYPES,textStyle))
		
		val TextStyle textStyle2 = new TextStyle()
			textStyle2.color = new RGB(255, 0, 42)
		res.add(new Pair(CARD1,textStyle2))
		
		return res
	}
	
}