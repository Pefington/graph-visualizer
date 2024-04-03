package visualizer.input;

import javax.swing.JOptionPane;
import visualizer.graph.GraphPanel;

public class VertexInputHandler {

    public static String promptForId(GraphPanel graph) {
        String input;

        while (true) {
            input = JOptionPane.showInputDialog(graph, "Vertex ID (single character):", "Vertex",
                    JOptionPane.QUESTION_MESSAGE);

            if (input == null) {
                return null;
            }

            input = input.trim().toUpperCase();

            if (input.isBlank() || input.length() != 1 || graph.alreadyHasVertex(input)) {
                continue;
            }
            
            char c = input.charAt(0);

            if (Character.isLetter(c) || Character.isDigit(c)) {
                return input;
            }
        }
    }
}
