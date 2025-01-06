/*
 * GraphAdjacencyList for Graph Representation (Graph representation using Adjacency List)
 * 
 * @variables:
    * vertices: array of vertices
    * adjacencyList: adjacency list representation of the graph
    * vertexCount: number of vertices in the graph
 *
 * @methods:
    * GraphAdjacencyList(char[] vertexLabels): constructor to initialize the graph with given vertices
    * addEdge(char u, char v): add an edge between vertices u and v
    * getIndex(char vertex): get the index of a vertex in the vertices array
    * display(): display the adjacency list
    * addToAdjacencyList(int index, char neighbor): add a neighbor to the adjacency list of a vertex
 */

class GraphAdjacencyList {
    private Vertex[] vertices;
    private char[][] adjacencyList;
    private int vertexCount;

    public GraphAdjacencyList(char[] vertexLabels) {
        vertexCount = vertexLabels.length;
        vertices = new Vertex[vertexCount];
        adjacencyList = new char[vertexCount][vertexCount];

        for (int i = 0; i < vertexCount; i++) {
            vertices[i] = new Vertex(vertexLabels[i]);
            for (int j = 0; j < vertexCount; j++) {
                adjacencyList[i][j] = '\0';
            }
        }
    }

    public void addEdge(char u, char v) {
        int uIndex = getIndex(u);
        int vIndex = getIndex(v);
        if (uIndex != -1 && vIndex != -1) {
            addToAdjacencyList(uIndex, v);
            addToAdjacencyList(vIndex, u);
        }
    }

    private int getIndex(char vertex) {
        for (int i = 0; i < vertexCount; i++) {
            if (vertices[i].label == vertex) {
                return i;
            }
        }
        return -1;
    }

    private void addToAdjacencyList(int index, char neighbor) {
        for (int i = 0; i < vertexCount; i++) {
            if (adjacencyList[index][i] == '\0') {
                adjacencyList[index][i] = neighbor;
                break;
            }
        }
    }

    public void display() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < vertexCount; i++) {
            System.out.print(vertices[i].label + ": ");
            for (int j = 0; j < vertexCount; j++) {
                if (adjacencyList[i][j] != '\0') {
                    System.out.print(adjacencyList[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
