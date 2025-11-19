package shortestPath;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int V = 8; // Number of vertices
	        int E = 20; // Number of edges

	        // Bellman-Ford Algorithm
	        Graph bellmanFordGraph = new Graph(V, E);
	        bellmanFordGraph.edge[0].src = 0;
	        bellmanFordGraph.edge[0].dest = 1;
	        bellmanFordGraph.edge[0].weight = 5;
	        // Add other edges similarly

	        System.out.println("Bellman-Ford Algorithm:");
	        bellmanFordGraph.bellmanFord(0);

	        // Dijkstra's Algorithm
	        DijkstraAlgorithm dijkstraAlgorithm = new DijkstraAlgorithm(V);
	        dijkstraAlgorithm.addEdge(0, 1, 5);
	        // Add other edges similarly

	        System.out.println("\nDijkstra's Algorithm:");
	        dijkstraAlgorithm.dijkstra(0);
	    }
	}

