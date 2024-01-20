package software.swing;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import software.BarChart;
import software.BarChartDisplay;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class JpanelDisplay extends JPanel implements BarChartDisplay {

    @Override
    public void show(BarChart barChart) {
        ChartPanel chartPanel = new ChartPanel(chartOf(barChart));
        chartPanel.setPreferredSize(new Dimension(800,800));
        add(chartPanel);
    }

    private JFreeChart chartOf(BarChart barChart) {
        return ChartFactory.createBarChart(
                barChart.name(),
                barChart.xAxis(),
                barChart.yAxis(),
                toDataSet(barChart.data())
        );
    }

    private DefaultCategoryDataset toDataSet(Map<String, Integer> data) {
        DefaultCategoryDataset dataset= new DefaultCategoryDataset();
        for(String key : data.keySet()){
            dataset.addValue(data.get(key),"Horas", key);
        }
        return dataset;
    }
}
