package visualizer.input;

import java.awt.Component;
import java.util.Set;
import javax.swing.JOptionPane;
import visualizer.errorHandling.CustomException;

public class UserInputHandler {

    public static String promptForId(Component parent, Set<String> verticesList)
            throws CustomException {

        String input;
        int invalidCounter = 0;

        while (true) {
            input = JOptionPane.showInputDialog(parent, "Vertex ID (single character):",
                    "Vertex", JOptionPane.DEFAULT_OPTION);

            if (invalidCounter >= 3) {
                // throw new CustomException("Please pay attention.\nClosing program.");
            }

            if (input == null) {
                return null;
            }

            input = input.toUpperCase();

            String message = verticesList.contains(input) ? "ID must be unique."
                    : "ID must be a single character.";

            if (input.isBlank() || input.length() > 1 || verticesList.contains(input)) {
                // JOptionPane.showMessageDialog(parent, message);
                invalidCounter++;
                continue;
            }

            char c = input.charAt(0);

            if (input.length() == 1 && !verticesList.contains(input)
                    && (Character.isLetter(c) || Character.isDigit(c))) {
                verticesList.add(input);
                invalidCounter = 0;
                return input;
            }
        }
    }
}
