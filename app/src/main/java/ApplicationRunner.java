import javax.swing.SwingUtilities;
import visualizer.MainFrame;

public class ApplicationRunner {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainFrame::new);
    }
}
