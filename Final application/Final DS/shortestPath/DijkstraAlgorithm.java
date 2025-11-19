package shortestPath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {
	
	 private int V;
	    private List<List<Node>> adj;

	    DijkstraAlgorithm(int v) {
	        V = v;
	        adj = new ArrayList<>(V);
	        for (int i = 0; i < V; i++)
	            adj.add(new ArrayList<>());
	    }

	    void addEdge(int u, int v, int weight) {
	        adj.get(u).add(new Node(v, weight));
	    }

	    void dijkstra(int src) {
	        PriorityQueue<Node> pq = new PriorityQueue<>(V, new Node());
	        int dist[] = new int[V];
	        Arrays.fill(dist, Integer.MAX_VALUE);
	        dist[src] = 0;
	        pq.add(new Node(src, 0));

	        while (!pq.isEmpty()) {
	            int u = pq.poll().node;
	            for (Node neighbor : adj.get(u)) {
	                int v = neighbor.node;
	                int weight = neighbor.cost;
	                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
	                    dist[v] = dist[u] + weight;
	                    pq.add(new Node(v, dist[v]));
	                }
	            }
	        }

	        printSolution(dist);
	    }

	    void printSolution(int dist[]) {
	        System.out.println("Vertex Distance from Source");
	        for (int i = 0; i < V; ++i)
	            System.out.println((char)('A' + i) + "\t\t" + dist[i]);
	    }

	    class Node implements Comparator<Node> {
	        int node;
	        int cost;

	        Node() {
	        }

	        Node(int node, int cost) {
	            this.node = node;
	            this.cost = cost;
	        }

	        @Override
	        public int compare(Node node1, Node node2) {
	            return node1.cost - node2.cost;
	        }
	    }
	}

