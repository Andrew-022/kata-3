package software.swing;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JpanelDisplay barChartDisplay;

    public MainFrame() throws HeadlessException{
        setTitle("Diagrama de barras");
        setSize(800,800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(createBarChartDisplay());
    }

    private Component createBarChartDisplay() {
        JpanelDisplay jpanelDisplay = new JpanelDisplay();
        this.barChartDisplay = jpanelDisplay;
        return jpanelDisplay;
    }

    public JpanelDisplay getBarChartDisplay(){return this.barChartDisplay;}
}
