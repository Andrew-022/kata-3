package software;

import software.swing.MainFrame;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> data = new HashMap<>();
        data.put("Andres", 20);
        data.put("Sofia", 10);
        data.put("Ana", 15);
        BarChart barChart = new BarChart("Horas Trabajadas", "Empleados", "Horas", data);
        MainFrame frame = new MainFrame();
        frame.getBarChartDisplay().show(barChart);
        frame.setVisible(true);

    }
}