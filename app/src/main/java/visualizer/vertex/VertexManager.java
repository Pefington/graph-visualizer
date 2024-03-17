package visualizer.vertex;

import java.util.*;

public class VertexManager {

    private Set<String> verticesList = new HashSet<>();

    public void addVertex(String id) {
        verticesList.add(id);
    }

    public boolean vertexExists(String id) {
        return verticesList.contains(id);
    }

    public Set<String> getVerticesList() {
        return verticesList;
    }
}
