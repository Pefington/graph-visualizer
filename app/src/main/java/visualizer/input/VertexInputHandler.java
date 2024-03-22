package visualizer.input;

import java.util.Map;
import javax.swing.JOptionPane;
import visualizer.graph.GraphPanel;
import visualizer.vertex.*;

public class VertexInputHandler {

    public static String promptForId(GraphPanel graph) {

        String input;
        VertexManager vManager = graph.getVertexManager();
        Map<String, Vertex> vertices = vManager.getVertices();

        while (true) {
            input = JOptionPane.showInputDialog(vManager, "Vertex ID (single character):", "Vertex",
                    JOptionPane.QUESTION_MESSAGE);

            if (input == null) {
                return null;
            }

            input = input.toUpperCase();
            System.out.println(vertices);

            if (input.isBlank() || input.length() > 1 || vManager.vertexExists(input)) {
                continue;
            }

            char c = input.charAt(0);

            if (input.length() == 1 && (Character.isLetter(c) || Character.isDigit(c))) {
                return input;
            }
        }
    }
}
