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
                    graph.createVertex(id, point);
                    graph.revalidate();
                    graph.repaint();
                }
            }
        };
        this.addMouseListener(adapter);
    }

    public Vertex getVertex(String id) {
        return vertexManager.getVertex(id);
    }

    public Map<String, Vertex> getVertices() {
        return vertexManager.getVertices();
    }

    public boolean alreadyHasVertex(String id) {
        return vertexManager.alreadyHasVertex(id);
    }

    public void createVertex(String id, Point position) {
        vertexManager.createVertex(id, position);
        this.add(vertexManager.getVertex(id));
    }
}
