package visualizer.graph;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;

public class Instructions extends JLabel {

    public Instructions(Dimension graphSize) {
        this.setText("Click on the graph to add a vertex.");
        this.setForeground(Color.WHITE);

        Dimension instructionsSize = this.getPreferredSize();
        int x = (graphSize.width - instructionsSize.width) / 2;
        int y = (graphSize.height - instructionsSize.height) / 2;

        this.setBounds(x, y, instructionsSize.width, instructionsSize.height);
    }
}
