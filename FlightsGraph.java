import java.util.*;

public class FlightsGraph {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(int flights[][], ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < flights.length; i++) {
            int src = flights[i][0];
            int dest = flights[i][1];
            int wt = flights[i][2];

            graph[src].add(new Edge(src, dest, wt));
        }
    }

    static class Info {
        int v;
        int cost;
        int stops;

        public Info(int v, int cost, int stops) {
            this.v = v;
            this.cost = cost;
            this.stops = stops;
        }
    }

    public static int cheapestFlight(int n, int flights[][], int src, int dest, int k) {
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(flights, graph);

        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));

        while (!q.isEmpty()) {
            Info curr = q.poll();

            if (curr.stops > k) {
                continue; // Don't process further if stops exceed k
            }

            for (Edge e : graph[curr.v]) {
                int newCost = curr.cost + e.wt;

                if (newCost < dist[e.dest]) {
                    dist[e.dest] = newCost;
                    q.add(new Info(e.dest, newCost, curr.stops + 1));
                }
            }
        }

        return dist[dest] == Integer.MAX_VALUE ? -1 : dist[dest];
    }

    public static void main(String args[]) {
        int n = 4;
        int flights[][] = {
            {0, 1, 100}, 
            {1, 2, 100}, 
            {2, 0, 100}, 
            {1, 3, 600}, 
            {2, 3, 200}
        };
        int src = 0, dst = 3, k = 1;

        int result = cheapestFlight(n, flights, src, dst, k);
        System.out.println("Cheapest flight cost: " + result);
    }
}
