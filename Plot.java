import java.awt.*;
import java.util.LinkedList;

import javax.swing.*;
import org.jfree.*;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Plot {

	void draw(Graphics g, LinkedList<Student> studentList)
	{
		int size = studentList.size;
		XYSeries series1 = new XYSeries("series1");
		XYSeries series2 = new XYSeries("series2");
		
		for(double i = 0; i < size; i++) {
			series1.add(i, studentList.get()); // No accessor for minutes yet
			series2.add(i,studentList.getFirst());
		}
		
		XYSeriesCollection dataset1 = new XYSeriesCollection();
	    dataset1.addSeries(series1);
	    
	    XYPlot plot = new XYPlot();
	    plot.setDataset(0, dataset1);
	    
	    plot.setDomainAxis(new NumberAxis("series1"));
	    plot.mapDatasetToRangeAxis(0, 100);
	    
	    JFreeChart chart = new JFreeChart(plot);
	    chart.setBackgroundPaint(Color.WHITE);
	    JPanel chartPanel = new ChartPanel(chart);
	}
}
