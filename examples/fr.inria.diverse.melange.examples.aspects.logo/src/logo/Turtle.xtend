package logo

import java.util.ArrayList

class Point
{
	public var double x
	public var double y
	
	new(double a, double b){
		x = a
		y = b
	}
	
	def Point getDelta(double dx, double dy) {
		var Point res = new Point(0,0)
		res.x = x + dx
		res.y = y + dy	
		return res		
	}
	
	override String toString() {
		return "[" + x as int + "," + y as int + "]"
	}
}
		
class Segment
{
	public var Point begin
	public var Point end
	
	new(Point orig , Point dest ) {
		begin = orig
		end = dest
	}
}

class Turtle {
	
	Point position
	double heading
	boolean penUp
	public ArrayList<Segment> drawings
	
	new(){
		reset()
	}
	
	def void reset() {
		position = new Point(0,0)
		heading = 0
		penUp = true
		drawings = new ArrayList<Segment>()
	
	}
			
	def void setPenUp(boolean b) {
		penUp = b
	}
	
	def rotate(int angle) {
		heading = (heading + angle) % 360
	}

	def void move(double dx, double  dy) {
		var Point newPos = position.getDelta(dx,dy)
		if(penUp) {
			println("Turtle move to "+ newPos.toString)	
		}
		else {
			println("Turtle trace to "+ newPos.toString)
			drawings.add(new Segment(position,newPos))
		}
		position = newPos
	}
		
	def void forward(int steps) {
	    var double radian = Math.toRadians(heading) 
		move(scale(steps,Math.sin(radian)), scale(steps,Math.cos(radian)))
	}
   
   /**
	* scale the "steps" by factor
	*/
	def double scale(int steps, double factor) {
		return steps * factor
	}
}
