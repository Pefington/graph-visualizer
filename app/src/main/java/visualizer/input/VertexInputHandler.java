package visualizer.input;

import java.awt.Component;
import java.util.Set;
import javax.swing.JOptionPane;
import visualizer.errorHandling.CustomException;

public class VertexInputHandler {

    public static String promptForId(Component parent, Set<String> verticesList)
            throws CustomException {

        String input;

        while (true) {
            input = JOptionPane.showInputDialog(parent, "Vertex ID (single character):", "Vertex",
                    JOptionPane.DEFAULT_OPTION);

            if (input == null) {
                return null;
            }

            input = input.toUpperCase();

            if (input.isBlank() || input.length() > 1 || verticesList.contains(input)) {
                continue;
            }

            char c = input.charAt(0);

            if (input.length() == 1 && !verticesList.contains(input)
                    && (Character.isLetter(c) || Character.isDigit(c))) {
                verticesList.add(input);
                return input;
            }
        }
    }
}
