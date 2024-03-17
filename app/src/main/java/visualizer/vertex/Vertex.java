package visualizer.vertex;

import java.awt.*;
import javax.swing.JPanel;
import visualizer.Constants;

public class Vertex extends JPanel {
    private final int DIAMETER = Constants.VERTEX_CIRCLE_DIAMETER;
    private String id;

    public Vertex(String id, int xPos, int yPos) {
        this.id = id;
        this.setName("Vertex " + this.id);
        this.setPreferredSize(new Dimension(DIAMETER, DIAMETER));
        this.setOpaque(false);
        this.setBounds(xPos - DIAMETER / 2, yPos - DIAMETER / 2, DIAMETER, DIAMETER);
        this.setLayout(new GridBagLayout());

        VertexLabel vertexLabel = new VertexLabel(this.id);
        this.add(vertexLabel);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.WHITE);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval(0, 0, DIAMETER, DIAMETER);
    }
}
