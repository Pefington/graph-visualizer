// package visualizer;

// import static org.mockito.ArgumentMatchers.*;
// import static org.mockito.Mockito.*;
// import java.awt.event.MouseEvent;
// import org.junit.jupiter.api.Test;
// import visualizer.graph.GraphPanel;
// import visualizer.input.VertexInputHandler;
// import visualizer.vertex.Vertex;

// class AppTest {
//     @Test
//     void clickingOnGraphPromptsForVertexId() {
//         // Arrange
//         GraphPanel graphPanel = mock(GraphPanel.class);
//         VertexInputHandler userInputHandler = mock(VertexInputHandler.class);
//         when(userInputHandler.promptForId(any(), any())).thenReturn("A");

//         // Act
//         MouseEvent click = new MouseEvent(graphPanel, MouseEvent.MOUSE_CLICKED,
//                 System.currentTimeMillis(), 0, 100, 100, 1, false);
//         graphPanel.getMouseListeners()[0].mouseClicked(click);

//         // Assert
//         verify(userInputHandler).promptForId(any(), any());
//     }

//     @Test
//     void clickingOnGraphCreatesVertexWithCorrectId() {
//         // Arrange
//         GraphPanel graphPanel = mock(GraphPanel.class);
//         VertexInputHandler userInputHandler = mock(VertexInputHandler.class);
//         when(userInputHandler.promptForId(any(), any())).thenReturn("A");

//         // Act
//         MouseEvent click = new MouseEvent(graphPanel, MouseEvent.MOUSE_CLICKED,
//                 System.currentTimeMillis(), 0, 100, 100, 1, false);
//         graphPanel.getMouseListeners()[0].mouseClicked(click);

//         // Assert
//         verify(graphPanel).add(any(Vertex.class));
//     }

//     @Test
//     void clickingOnGraphCreatesVertexAtClickLocation() {
//         // Arrange
//         GraphPanel graphPanel = mock(GraphPanel.class);
//         VertexInputHandler userInputHandler = mock(VertexInputHandler.class);
//         when(userInputHandler.promptForId(any(), any())).thenReturn("A");

//         // Act
//         MouseEvent click = new MouseEvent(graphPanel, MouseEvent.MOUSE_CLICKED,
//                 System.currentTimeMillis(), 0, 100, 100, 1, false);
//         graphPanel.getMouseListeners()[0].mouseClicked(click);

//         // Assert
//         verify(graphPanel).add(
//                 argThat(vertex -> vertex.getX() == click.getX() && vertex.getY() == click.getY()));
//     }
// }
