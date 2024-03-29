package Graph;

import java.util.Iterator;
import java.util.LinkedList;

// This class represents a directed graph using adjacency list
// representation
class Graph {
    private int V; // No. of vertices
    private LinkedList<Integer> adj[]; //Adjacency Lists

    // Constructor
    Graph(final int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList();
        }
    }

    // Function to add an edge into the graph
    void addEdge(final int v, final int w) {
        adj[v].add(w);
    }

    // prints BFS traversal from a given source s
    void BFS(int s) {
        // Mark all the vertices as not visited(By default
        // set as false)
        final boolean visited[] = new boolean[V];

        // Create a queue for BFS
        final LinkedList<Integer> queue = new LinkedList<Integer>();

        // Mark the current node as visited and enqueue it
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            // Dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.print(s + " ");

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            final Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                final int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    // Driver method to
    public static void main(final String args[]) {
        final Graph g = new Graph(7);

        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 5);
        g.addEdge(2, 4);
        g.addEdge(3, 1);
        g.addEdge(3, 5);
        g.addEdge(4, 5);
        g.addEdge(4, 6);
        g.addEdge(5, 4);
        g.addEdge(5, 3);
        g.addEdge(5, 3);
        g.addEdge(6, 4);
        g.addEdge(6, 5);

        System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

        g.BFS(1);
    }
}
// This code is contributed by Aakash Hasija