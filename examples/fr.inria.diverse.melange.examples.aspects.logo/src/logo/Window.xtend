package logo

import javax.swing.JFrame
import java.awt.Color
import java.awt.Graphics
import javax.swing.RepaintManager.PaintManager
import javax.swing.JPanel
import java.awt.Paint

class Window {
	JFrame frame;
	
	new(Turtle t){
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Logo example");
		frame.setVisible(true)
		frame.add(new Board(t))
	}
	
//	def static void main(String[] args) {
//		var Window w = new Window();
//	}
	
}

class Board extends JPanel{
	
	Turtle turtle;
	
	new(Turtle t){
		turtle = t
	}
	
	override paint(Graphics g){
		for(Segment seg : turtle.drawings){
			g.drawLine(	seg.begin.x as int,seg.begin.y as int,
						seg.end.x as int,seg.end.y as int
			)
		}		
	}
	
}