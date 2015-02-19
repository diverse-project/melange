package finitestatemachines.timed.composite.simultaneous

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

import finitestatemachinestimedcomposite.State
import finitestatemachinestimedcomposite.StateMachine
import finitestatemachinestimedcomposite.Fork
import finitestatemachinestimedcomposite.Join

class Printer {
	
	/**
	 * Prints in the console the final state of the states machine 
	 * i.e., the schedule after the evaluation
	 */
	def public void printFinalStateInConsole(StateMachine stateMachine){
		for(State _state : stateMachine.states){
			
			if(!(_state instanceof Fork) && !(_state instanceof Join))
				println("   - State: " + _state.name + " [initialTime: " + _state.initialTime 
					+ " finalTime: " + _state.finalTime + "]")
		}
	}
	
	/**
	 * Prints as a Gantt diagram the final state of the states machine 
	 * i.e., the schedule after the evaluation
	 */
	def public void printFinalStateInFile(StateMachine stateMachine, String filePath){
		var IntervalCategoryDataset dataset = createDataset(stateMachine);
        var JFreeChart chart = createChart(dataset);
		saveChartToPDF(chart, filePath, 500, 300)
	}
	
	/**
	 * Returns the Gantt model according to the final state of the state machine. 
	 */
	def public static IntervalCategoryDataset createDataset(StateMachine stateMachine) {
		var TaskSeries s1 = new TaskSeries("State Machine");
		
		for(State _state : stateMachine.states){
			if(!(_state instanceof Fork) && !(_state instanceof Join)){
				s1.add(new Task(_state.name, new SimpleTimePeriod(new Date(_state.initialTime),
					new Date(_state.finalTime))))
			}
		}
		
		var TaskSeriesCollection collection = new TaskSeriesCollection();
        collection.add(s1);
		
		return collection as IntervalCategoryDataset;
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
	    if (chart != null) {
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
	            if (out != null) {
	                out.close();
	            }
	        }
	    }
	}
}