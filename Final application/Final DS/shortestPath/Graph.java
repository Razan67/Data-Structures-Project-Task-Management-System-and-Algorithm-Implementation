package shortestPath;


	import java.util.*;

	// Class to represent a graph
	class Graph {
	    class Edge {
	        int src, dest, weight;

	        Edge() {
	            src = dest = weight = 0;
	        }
	    };

	    int V, E;
	    Edge edge[];

	    // Creates a graph with V vertices and E edges
	    Graph(int v, int e) {
	        V = v;
	        E = e;
	        edge = new Edge[e];
	        for (int i = 0; i < e; ++i)
	            edge[i] = new Edge();
	    }

	    // Function to find the shortest paths from source using Bellman-Ford algorithm
	    void bellmanFord(int src) {
	        int dist[] = new int[V];

	        // Step 1: Initialize distances from src to all other vertices as INFINITE
	        Arrays.fill(dist, Integer.MAX_VALUE);
	        dist[src] = 0;

	        // Step 2: Relax all edges |V| - 1 times
	        for (int i = 1; i < V; ++i) {
	            for (int j = 0; j < E; ++j) {
	                int u = edge[j].src;
	                int v = edge[j].dest;
	                int weight = edge[j].weight;
	                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v])
	                    dist[v] = dist[u] + weight;
	            }
	        }

	        // Step 3: Check for negative-weight cycles
	        for (int j = 0; j < E; ++j) {
	            int u = edge[j].src;
	            int v = edge[j].dest;
	            int weight = edge[j].weight;
	            if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
	                System.out.println("Graph contains negative weight cycle");
	                return;
	            }
	        }

	        // Print distances
	        printSolution(dist);
	    }

	    // Print the distance array
	    void printSolution(int dist[]) {
	        System.out.println("Vertex Distance from Source");
	        for (int i = 0; i < V; ++i)
	            System.out.println((char)('A' + i) + "\t\t" + dist[i]);
	    }
	}

