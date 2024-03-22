package visualizer.vertex;

import java.awt.*;
import java.util.*;

public class VertexManager extends Component {
    private Map<String, Vertex> vertices = new HashMap<>();

    public void createVertex(String id, Point position) {
        vertices.put(id, new Vertex(id, position));
    }

    public boolean vertexExists(String id) {
        return vertices.containsKey(id);
    }

    public Map<String, Vertex> getVertices() {
        return vertices;
    }
}
