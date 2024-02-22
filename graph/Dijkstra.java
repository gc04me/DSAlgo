package graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstra {

	static class Pair {
		int vertex;
		int weight;
		String psf;

		public Pair(int vertex, int weight, String psf) {
			super();
			this.vertex = vertex;
			this.weight = weight;
			this.psf = psf;
		}

	}

	static class Edge {
		int node;
		int wt;

		public Edge(int node, int wt) {
			super();
			this.node = node;
			this.wt = wt;
		}

	}

	private static void shortestPath(int vertex, int[][] edges, int source) {

		ArrayList<Edge>[] graph = new ArrayList[vertex];

		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<Edge>();
		}

		for (int[] edge : edges) {
			int src = edge[0];
			int dest = edge[1];
			int weight = edge[2];

			graph[src].add(new Edge(dest, weight));
			graph[dest].add(new Edge(src, weight));
		}

		boolean[] visited = new boolean[vertex];

		bfs(source, graph, visited);

	}

	private static void bfs(int source, ArrayList<Edge>[] graph, boolean[] visited) {

		PriorityQueue<Pair> pq = new PriorityQueue<Dijkstra.Pair>((a, b) -> a.weight - b.weight);

		Pair pair = new Pair(source, 0, source + "");

		pq.add(pair);

		while (!pq.isEmpty()) {
			Pair rem = pq.poll();

			if (visited[rem.vertex] == true) {
				continue;
			}

			visited[rem.vertex] = true;

			System.out.println("Path - " + rem.psf + " Weight -  " + rem.weight);

			for (Edge edge : graph[rem.vertex]) {
				if (visited[edge.node] == false) {
					pq.add(new Pair(edge.node, edge.wt + rem.weight, rem.psf + edge.node));
				}
			}

		}

	}

	public static void main(String[] args) {

		shortestPath(7, new int[][] { { 0, 1, 10 }, { 1, 2, 10 }, { 2, 3, 10 }, { 0, 3, 10 }, { 3, 4, 2 }, { 4, 5, 3 },
				{ 5, 6, 3 }, { 4, 6, 8 } }, 0);
	}

}
