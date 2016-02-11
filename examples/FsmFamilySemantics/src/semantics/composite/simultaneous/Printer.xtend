package semantics.composite.simultaneous

import org.jfree.data.category.IntervalCategoryDataset
import org.jfree.data.gantt.TaskSeries
import org.jfree.data.time.SimpleTimePeriod
import java.util.Date
import org.jfree.data.gantt.Task
import org.jfree.data.gantt.TaskSeriesCollection
import org.jfree.chart.JFreeChart
import org.jfree.chart.ChartFactory
import java.io.BufferedOutputStream
import java.io.FileOutputStream
import com.itextpdf.text.Rectangle
import com.itextpdf.text.Document
import com.itextpdf.text.pdf.PdfWriter
import com.itextpdf.text.pdf.PdfContentByte
import com.itextpdf.text.pdf.PdfTemplate
import com.itextpdf.awt.DefaultFontMapper
import java.awt.Graphics2D
import java.awt.geom.Rectangle2D

import compositefsm.fsm.State
import compositefsm.fsm.StateMachine
import compositefsm.fsm.Fork
import compositefsm.fsm.Join
import compositefsm.fsm.CompositeState
import java.util.List
import java.util.ArrayList

class Printer {
	
	/**
	 * Prints time final state of the states machine i.e., the schedule after the evaluation
	 */
	def public void printFinalStateInConsole(StateMachine stateMachine){
		for(State _state : stateMachine.states){
			printState(_state)
		}
	}
	
	def void printState(State _state){
		
		if (!(_state instanceof Fork) && !(_state instanceof Join)) {
			println(
				"   - State: " + _state.name + " [initialTime: " + _state.initialTime + " finalTime: " +
					_state.finalTime + "]")

			if (_state instanceof CompositeState) {
				val composite = _state
				printSubStates(composite)
			}
		}
	}
	
	def void printSubStates(CompositeState composite){
		composite.regions.map[r|r.states].flatten.forEach[s|printState(s)]
	}
	
	/**
	 * Prints as a Gantt diagram the final state of the states machine 
	 * i.e., the schedule after the evaluation
	 */
	def public void printFinalStateInFile(StateMachine stateMachine, String filePath){
		var IntervalCategoryDataset dataset = createDataset(stateMachine);
        var JFreeChart chart = createChart(dataset);
		try {
			saveChartToPDF(chart, filePath, 500, 300)
		} catch (Exception exc) {
			throw new RuntimeException("auto-generated try/catch", exc)
		}
	}
	
	/**
	 * Returns the Gantt model according to the final state of the state machine. 
	 */
	def public static IntervalCategoryDataset createDataset(StateMachine stateMachine) {
		val TaskSeries s1 = new TaskSeries("State Machine");
		
		for(State _state : stateMachine.states){
			createTasks(_state).forEach[t|s1.add(t)]
		}
		
		var TaskSeriesCollection collection = new TaskSeriesCollection();
        collection.add(s1);
		
		return collection as IntervalCategoryDataset;
	}
	
	def static List<Task> createTasks(State _state){
		val List<Task> res = new ArrayList<Task>()
		
		if (_state instanceof CompositeState) {
				val composite = _state
				val subTasks = createCompositeTasks(composite)
				res.addAll(subTasks)
				
				val Date min = subTasks.min[a,b| 
					if(a.duration.start < b.duration.start) -1
					else 1
				]
				.duration.start
				
				val Date max = subTasks.max[a,b| 
					if(a.duration.end < b.duration.end) -1
					else 1
				]
				.duration.end
				
				res.add(new Task(_state.name, new SimpleTimePeriod(min,
					max)))
		}
		else if(!(_state instanceof Fork) && !(_state instanceof Join)){
			res.add(new Task(_state.name, new SimpleTimePeriod(new Date(_state.initialTime),
				new Date(_state.finalTime))))
		}
		
		return res
	}
	
	def static List<Task> createCompositeTasks(CompositeState composite){
		val List<Task> res = new ArrayList<Task>()
		
		composite.regions.map[r|r.states].flatten.forEach[s|res.addAll(createTasks(s))]
		
		return res
	}
	
	/**
	 * Creates a Gantt diagram according to the Gantt model in the parameter. 
	 */
	def private JFreeChart createChart(IntervalCategoryDataset dataset) {
        var JFreeChart chart = ChartFactory.createGanttChart(
            "Execution results",  // chart title
            "State",              // domain axis label
            "Time",              // range axis label
            dataset,             // data
            true,                // include legend
            true,                // tooltips
            false                // urls
        );
        return chart;    
    }
	
	/**
	 * Exports the Gantt diagram to the PDF file specified in the parameter. 
	 */
	def public void saveChartToPDF(JFreeChart chart, String fileName, int width, int height) throws Exception {
	    if (chart !== null) {
	        var BufferedOutputStream out = null;
	        try {
	            out = new BufferedOutputStream(new FileOutputStream(fileName)); 
	                
	            //convert chart to PDF with iText:
	            var Rectangle pagesize = new Rectangle(width, height); 
	            var Document document = new Document(pagesize, 50, 50, 50, 50); 
	            try { 
	                var PdfWriter writer = PdfWriter.getInstance(document, out); 
	                document.addAuthor("JFreeChart"); 
	                document.open(); 
	        
	                var PdfContentByte cb = writer.getDirectContent(); 
	                var PdfTemplate tp = cb.createTemplate(width, height); 
	                var Graphics2D g2 = tp.createGraphics(width, height, new DefaultFontMapper()); 
	        
	                var Rectangle2D r2D = new Rectangle2D.Double(0, 0, width, height); 
	                chart.draw(g2, r2D, null); 
	                g2.dispose(); 
	                cb.addTemplate(tp, 0, 0); 
	            } finally {
	                document.close(); 
	            }
	        } finally {
	            if (out !== null) {
	                out.close();
	            }
	        }
	    }
	}
}