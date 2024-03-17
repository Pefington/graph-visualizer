package visualizer;

import javax.swing.SwingUtilities;

public class ApplicationRunner {
    public static void main(String[] args) {
        System.setProperty("awt.useSystemAAFontSettings", "on");
        System.setProperty("swing.aatext", "true");

        SwingUtilities.invokeLater(MainFrame::new);
    }
}
