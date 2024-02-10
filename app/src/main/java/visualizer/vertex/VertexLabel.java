package visualizer.vertex;

import java.awt.Color;
import javax.swing.JLabel;

public class VertexLabel extends JLabel {

    public VertexLabel(String id) {
        super(id);
        this.setName("VertexLabel " + id);
        this.setForeground(Color.BLACK);
    }
}
