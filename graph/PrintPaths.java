package graph;

import java.util.ArrayList;

public class PrintPaths {

	private static void printPaths(int vertex, int[][] edges, int source, int destination) {

		ArrayList<Integer>[] graph = new ArrayList[vertex];

		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<Integer>();

		}

		for (int[] edge : edges) {
			int src = edge[0];
			int dest = edge[1];

			graph[src].add(dest);
			graph[dest].add(src);
		}

		boolean[] visited = new boolean[vertex];

		print(source, destination, graph, visited, "");

	}

	private static void print(int source, int destination, ArrayList<Integer>[] graph, boolean[] visited, String psf) {

		if (source == destination) {
			System.out.println(psf);
			return;
		}

		visited[source] = true;

		for (Integer neighbour : graph[source]) {
			if (!visited[neighbour]) {
				print(neighbour, destination, graph, visited, psf  + neighbour+"-");
			}
		}
		visited[source] = false;

	}

	public static void main(String[] args) {
		printPaths(7, new int[][] { { 0, 1 }, { 1, 2 }, { 2, 3 }, { 0, 3 }, { 3, 4 }, { 4, 5 }, { 5, 6 }, { 4, 6 } }, 0,
				6);
	}

}
