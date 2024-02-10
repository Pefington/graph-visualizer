package visualizer.vertex;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import visualizer.Constants;

public class VertexPanel extends JPanel {
    private final int DIAMETER = Constants.VERTEX_CIRCLE_DIAMETER;

    public VertexPanel(String id, int xPos, int yPos) {
        this.setName("Vertex " + id);
        this.setPreferredSize(new Dimension(DIAMETER, DIAMETER));
        this.setOpaque(false);
        this.setBounds(xPos, yPos, DIAMETER, DIAMETER);
        this.setLayout(new GridBagLayout());

        VertexLabel vertexLabel = new VertexLabel(id);
        this.add(vertexLabel);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillOval(0, 0, DIAMETER, DIAMETER);
    }
}
