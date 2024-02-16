package visualizer.graph;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import visualizer.errorHandling.CustomException;
import visualizer.input.UserInputHandler;
import visualizer.vertex.Vertex;
import visualizer.vertex.VertexManager;

public class GraphPanel extends JPanel {
    private VertexManager vertexManager = new VertexManager();

    public GraphPanel(Dimension graphSize) {
        this.setName("Graph");
        this.setBackground(Color.BLACK);
        this.setLayout(null);
        this.setPreferredSize(graphSize);

        Instructions instructions = new Instructions(graphSize);
        // this.add(instructions);

        final Container graph = this;

        MouseAdapter adapter = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    String id =
                            UserInputHandler.promptForId(graph, vertexManager.getVerticesList());
                    if (id != null) {
                        graph.remove(instructions);
                        graph.add(new Vertex(id.toUpperCase(), e.getX(), e.getY()));
                        graph.revalidate();
                        graph.repaint();
                    }
                } catch (CustomException exception) {
                    System.err.println(exception.getMessage());
                    System.exit(1);
                }
            }
        };

        this.addMouseListener(adapter);
    }

}
