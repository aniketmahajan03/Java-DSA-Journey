import java.util.*;

public class Graph {
    static class Edge {
        int src;
        int dest;

        // Constructor for the edge
        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // Create the graph
    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Define graph connections
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 6));

        graph[5].add(new Edge(5, 3));

        graph[6].add(new Edge(6, 4));
    }

    // BFS Traversal Method
    public static void bfs(ArrayList<Edge>[] graph, int start) {
        boolean[] visited = new boolean[graph.length];
        Queue<Integer> queue = new LinkedList<>();

        // Start BFS from the given node
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            System.out.print(curr + " "); // Print the current node

            // Visit all adjacent nodes
            for (Edge edge : graph[curr]) {
                if (!visited[edge.dest]) {
                    queue.add(edge.dest);
                    visited[edge.dest] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 7; // Number of vertices
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        System.out.println("BFS Traversal starting from node 0:");
        bfs(graph, 0);
    }
}
