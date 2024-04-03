# Graph visualiser

The project will be a simple graph visualiser that can be used to create, edit and visualise graphs.

It is a part of the Java Core course on JetBrains Academy (Hyperskill), using Swing, and is a desktop application.

It is a Work In Progress.

```mermaid
---
title: Class Diagramme
---
classDiagram
    class ApplicationRunner {
    }
    class Constants {
    }
    class GraphPanel {
    }
    class VertexInputHandler {
    }
    class MainFrame {
    }
    class Vertex {
    }
    class VertexManager {
    }
    class JFrame {
    }
    class JPanel {
    }
    ApplicationRunner ..> MainFrame : creates
    MainFrame --|> JFrame : extends
    MainFrame "1" *-- "1" GraphPanel : creates
    GraphPanel --|> JPanel : extends
    GraphPanel "1" *-- "1" VertexManager
    VertexManager "1" *-- "*" Vertex
    VertexInputHandler "1" o-- "1" GraphPanel
```
