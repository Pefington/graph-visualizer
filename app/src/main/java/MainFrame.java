package visualizer;

import java.awt.Dimension;
import javax.swing.JFrame;
import visualizer.graph.GraphPanel;
import visualizer.vertex.VertexPanel;

public class MainFrame extends JFrame {
    private final int WIN_WIDTH = Constants.WINDOW_WIDTH;
    private final int WIN_HEIGHT = Constants.WINDOW_HEIGHT;
    private final int DIAMETER = Constants.VERTEX_CIRCLE_DIAMETER;

    public MainFrame() {
        super("Graph-Algorithms Visualizer");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(WIN_WIDTH, WIN_HEIGHT));
        this.setLayout(null);

        this.setVisible(true); // Set early or graphSize will be incorrect.
        this.pack(); // As above.

        Dimension graphSize = this.getContentPane().getSize();

        GraphPanel graph = new GraphPanel(graphSize.width, graphSize.height);
        this.add(graph);

        int left = 0;
        int top = 0;
        int right = graphSize.width - DIAMETER;
        int bottom = graphSize.height - DIAMETER;

        graph.add(new VertexPanel("0", left, top));
        graph.add(new VertexPanel("1", right, top));
        graph.add(new VertexPanel("2", left, bottom));
        graph.add(new VertexPanel("3", right, bottom));

        this.revalidate();
        this.repaint();
    }
}
