package visualizer;

import java.awt.*;
import javax.swing.JFrame;
import visualizer.graph.GraphPanel;

public class MainFrame extends JFrame {
    public MainFrame() {

        super("Graph-Algorithms Visualizer");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(Constants.WINDOW_DIMENSION);
        this.setLayout(new GridBagLayout());

        this.pack(); // Set early to get correct graphSize

        Dimension graphSize = this.getContentPane().getSize();

        this.add(new GraphPanel(graphSize));

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
