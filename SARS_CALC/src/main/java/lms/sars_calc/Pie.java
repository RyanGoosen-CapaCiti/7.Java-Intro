/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lms.sars_calc;

/**
 *
 * @author frank
 */
import org.jfree.chart.*;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;
import java.awt.*;

public class Pie {
    public static void main(String[] args) {
        // Create a dataset
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Category 1", 40.0);
        dataset.setValue("Category 2", 60.0);
        dataset.setValue("Category 3", 10.0);
        dataset.setValue("Category 4", 10.0);

        // Create the chart
        JFreeChart chart = ChartFactory.createPieChart("Pie Chart Example", dataset);

        // Customize the chart
        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setCircular(true);
        plot.setLabelGenerator(null);

        // Create a chart panel and add it to a frame
        ChartPanel chartPanel = new ChartPanel(chart);
        JFrame frame = new JFrame("Pie Chart Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(chartPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
