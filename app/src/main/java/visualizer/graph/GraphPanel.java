package visualizer.graph;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;
import visualizer.errorHandling.CustomException;
import visualizer.input.UserInputHandler;
import visualizer.vertex.*;

public class GraphPanel extends JPanel {
    private VertexManager vertexManager = new VertexManager();

    public GraphPanel(Dimension graphSize) {
        this.setName("Graph");
        this.setBackground(Color.BLACK);
        this.setLayout(null);
        this.setPreferredSize(graphSize);

        final Container graph = this;

        MouseAdapter adapter = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Point point = e.getPoint();
                    String id =
                            UserInputHandler.promptForId(graph, vertexManager.getVerticesList());
                    if (id != null) {
                        graph.add(new Vertex(id, point));
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
