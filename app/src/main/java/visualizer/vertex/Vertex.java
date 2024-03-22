package visualizer.vertex;

import java.awt.*;
import javax.swing.JPanel;
import visualizer.Constants;

public class Vertex extends JPanel {
    private final int DIAMETRE = Constants.VERTEX_CIRCLE_DIAMETRE;
    private final int RADIUS = DIAMETRE / 2;

    public Vertex(String id, Point position) {
        final int xCentre = (int) position.getX();
        final int yCentre = (int) position.getY();
        final int left = xCentre - RADIUS;
        final int top = yCentre - RADIUS;

        this.setName("Vertex " + id);
        this.setOpaque(false);
        this.setPreferredSize(new Dimension(DIAMETRE, DIAMETRE));
        this.setBounds(left, top, DIAMETRE, DIAMETRE);
        this.setLayout(new GridBagLayout());

        this.add(new VertexLabel(id));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.WHITE);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval(0, 0, DIAMETRE, DIAMETRE);
    }
}
