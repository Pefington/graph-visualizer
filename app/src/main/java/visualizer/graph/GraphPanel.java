package visualizer.graph;

import java.awt.*;
import java.awt.event.*;
import java.util.Map;
import javax.swing.JPanel;
import visualizer.input.VertexInputHandler;
import visualizer.vertex.*;

public class GraphPanel extends JPanel {
    private VertexManager vertexManager = new VertexManager();

    public GraphPanel(Dimension graphSize) {
        this.setName("Graph");
        this.setBackground(Color.BLACK);
        this.setLayout(null);
        this.setPreferredSize(graphSize);

        final GraphPanel graph = this;

        MouseAdapter adapter = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Point point = e.getPoint();
                String id = VertexInputHandler.promptForId(graph);
                if (id != null) {
                    graph.add(new Vertex(id, point));
                    graph.revalidate();
                    graph.repaint();
                }
            }
        };
        this.addMouseListener(adapter);
    }

    public Map<String, Vertex> getVertices() {
        return vertexManager.getVertices();
    }

    public VertexManager getVertexManager() {
        return vertexManager;
    }

}
