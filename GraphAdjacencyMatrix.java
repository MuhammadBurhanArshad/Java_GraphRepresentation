/*
 * GraphAdjacencyMatrix for graph representation using adjacency matrix
 * 
 * @variables:
    * vertices: array of vertices
    * adjacencyMatrix: adjacency matrix representation of the graph
    * vertexCount: number of vertices in the graph

 * @methods:
    * GraphAdjacencyMatrix(char[] vertexLabels): constructor to initialize the graph with given vertices
    * addEdge(char u, char v): add an edge between vertices u and v
    * getIndex(char vertex): get the index of a vertex in the vertices array
    * display(): display the adjacency matrix
 */

class GraphAdjacencyMatrix {
    private Vertex[] vertices;
    private int[][] adjacencyMatrix;
    private int vertexCount;

    public GraphAdjacencyMatrix(char[] vertexLabels) {
        vertexCount = vertexLabels.length;
        vertices = new Vertex[vertexCount];
        adjacencyMatrix = new int[vertexCount][vertexCount];

        for (int i = 0; i < vertexCount; i++) {
            vertices[i] = new Vertex(vertexLabels[i]);
            for (int j = 0; j < vertexCount; j++) {
                adjacencyMatrix[i][j] = 0;
            }
        }
    }

    public void addEdge(char u, char v) {
        int uIndex = getIndex(u);
        int vIndex = getIndex(v);
        if (uIndex != -1 && vIndex != -1) {
            adjacencyMatrix[uIndex][vIndex] = 1;
            adjacencyMatrix[vIndex][uIndex] = 1;
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

    public void display() {
        System.out.println("Adjacency Matrix:");
        System.out.print("   ");
        for (int i = 0; i < vertexCount; i++) {
            System.out.print(vertices[i].label + " ");
        }
        System.out.println();
        for (int i = 0; i < vertexCount; i++) {
            System.out.print(vertices[i].label + "  ");
            for (int j = 0; j < vertexCount; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
