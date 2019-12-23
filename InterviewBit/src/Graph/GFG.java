package Graph;

// Java Program to demonstrate adjacency list
// representation of graphs
import java.util.LinkedList;

public class GFG {
    static class Graph {
        //no of vertices
        int V;
        //adjacency List
        LinkedList<Integer> adjListArray[];

        // constructor
        Graph(final int V) {
            this.V = V;
            adjListArray = new LinkedList[V];
            for (int i = 0; i < V; i++) {
                adjListArray[i] = new LinkedList<>();
            }
        }
    }

    // Adds an edge to an undirected graph
    static void addEdge(final Graph graph, final int src, final int dest) {
        // Add an edge from src to dest.
        graph.adjListArray[src].addFirst(dest);

        // Since graph is undirected, add an edge from dest
        // to src also
        graph.adjListArray[dest].addFirst(src);
    }

    // A utility function to print the adjacency list
    // representation of graph
    static void printGraph(final Graph graph) {
        for (int v = 0; v < graph.V; v++) {
            System.out.println("Adjacency list of vertex " + v);
            System.out.print("head");
            for (final Integer pCrawl : graph.adjListArray[v]) {
                System.out.print(" -> " + pCrawl);
            }
            System.out.println("\n");
        }
    }

    // Driver program to test above functions
    public static void main(final String args[]) {
        // create the graph given in above figure
        final int V = 5;
        final Graph graph = new Graph(V);
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);

        // print the adjacency list representation of
        // the above graph
        printGraph(graph);
    }
}
// This code is contributed by Sumit Ghosh