package visualizer.vertex;

import java.awt.*;
import javax.swing.JPanel;
import visualizer.Constants;

public class Vertex extends JPanel {
    private final int DIAMETER = Constants.VERTEX_CIRCLE_DIAMETER;
    private String id;
    private int xPosition;
    private int yPosition;

    public Vertex(String id, Point position) {
        this.id = id;
        this.xPosition = (int) position.getX();
        this.yPosition = (int) position.getY();
        this.setName("Vertex " + this.id);
        this.setPreferredSize(new Dimension(DIAMETER, DIAMETER));
        this.setOpaque(false);
        int left = this.xPosition - DIAMETER / 2;
        int top = this.yPosition - DIAMETER / 2;
        this.setBounds(left, top, DIAMETER, DIAMETER);
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
