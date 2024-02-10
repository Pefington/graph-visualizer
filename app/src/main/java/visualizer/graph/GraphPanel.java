package visualizer.graph;

import java.awt.Color;
import javax.swing.JPanel;

public class GraphPanel extends JPanel {

    public GraphPanel(int width, int height) {
        this.setName("Graph");
        this.setLayout(null);
        this.setBackground(Color.BLACK);
        this.setBounds(0, 0, width, height);
    }
}
