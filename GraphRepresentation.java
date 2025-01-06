/*
 * Graph Representation for Graph representation objects that represent a graph using adjacency list and adjacency matrix
 * 
 * @methods:
    * main(String[] args): main method to test the graph representation objects
 */

public class GraphRepresentation {
    public static void main(String[] args) {
        char[] vertices = { 'A', 'B', 'C', 'D', 'E' };

        GraphAdjacencyList adjacencyListGraph = new GraphAdjacencyList(vertices);
        adjacencyListGraph.addEdge('A', 'B');
        adjacencyListGraph.addEdge('A', 'C');
        adjacencyListGraph.addEdge('B', 'C');
        adjacencyListGraph.addEdge('B', 'D');
        adjacencyListGraph.addEdge('C', 'E');
        adjacencyListGraph.display();

        System.out.println();

        GraphAdjacencyMatrix adjacencyMatrixGraph = new GraphAdjacencyMatrix(vertices);
        adjacencyMatrixGraph.addEdge('A', 'B');
        adjacencyMatrixGraph.addEdge('A', 'C');
        adjacencyMatrixGraph.addEdge('B', 'C');
        adjacencyMatrixGraph.addEdge('B', 'D');
        adjacencyMatrixGraph.addEdge('C', 'E');
        adjacencyMatrixGraph.display();
    }
}
