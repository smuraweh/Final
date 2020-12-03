import java.awt.*;
import java.util.LinkedList;

import javax.swing.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Plot extends JFrame {
	
	Student student = new Student();
	//Add attendance = new Add();
	
	public Plot(Student[] studentList)
	{	
		String chartTitle = "Attendance";
	    String xAxisLabel = "ID Number";
	    String yAxisLabel = "Minutes Attended";
	    
	    XYSeriesCollection data = new XYSeriesCollection();
	    XYSeries series1 = new XYSeries("Attendance 1");
	 
	    /*series1.add(1.0, 0.3);
	    series1.add(2.0, 0.3);
	    series1.add(3.0, 0.25);
	    series1.add(3.5, 0.35);
	    series1.add(4.2, 0.60);*/
	    
	    data.addSeries(series1);
	    
	    XYDataset dataset = data;
	    String date = null;
	    
	    for(int i = 0; i < studentList.length; i++)
	    {
	    	double idNum = Double.parseDouble(studentList[i].getID());
	    	date = studentList[i].attendance.attendanceDate;
	    	double minutes = studentList[i].attendance.attendanceAmount; // For attendance
	    	series1.add(idNum, minutes);
	    }
		 
	    JFreeChart chart = ChartFactory.createScatterPlot(chartTitle, xAxisLabel, yAxisLabel, dataset);
		
		XYPlot xyPlot = (XYPlot) chart.getPlot();
        xyPlot.setRangeCrosshairVisible(true);
        LegendItemCollection chartLegend = new LegendItemCollection();
        Shape shape = new Rectangle(10, 10);
        chartLegend.add(new LegendItem(date, null, null, null, shape, Color.blue));
        xyPlot.setFixedLegendItems(chartLegend);
        XYItemRenderer renderer = xyPlot.getRenderer();
        renderer.setSeriesPaint(0, Color.blue);
        NumberAxis domain = (NumberAxis) xyPlot.getDomainAxis();
        NumberAxis range = (NumberAxis) xyPlot.getRangeAxis();
        range.setRange(0.0, 1.0);
        range.setTickUnit(new NumberTickUnit(0.05));
        
        JPanel chartPanel = new ChartPanel(chart);
        
		//JFrame frame = new JFrame();
        this.add(chartPanel, BorderLayout.CENTER);
        this.setSize(1920, 1080);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void display(Student[] studentList)
	{
		new Plot(studentList).setVisible(true);
	}
}
