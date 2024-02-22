package graph;

import java.util.ArrayList;

public class HamiltonianPath {

	private static void printHamiltonianPath(int vertex, int[][] edges) {

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

		System.out.println(visited.length);
		for (int destination = 1; destination < vertex; destination++) {
			printPath(destination, graph, visited, "", 0, 0);
		}

	}

	private static void printPath(int source, ArrayList<Integer>[] graph, boolean[] visited, String psf,
			int originalSource, int count) {

		if (count == visited.length - 1) {

			for (Integer neighbor : graph[source]) {
				if (neighbor == originalSource) {
					System.out.println(psf + "*");
					return;
				}
			}

			System.out.println(psf + ".");
			return;
		}

		visited[source] = true;

		for (Integer neighbor : graph[source]) {
			if (visited[neighbor] == false) {
				printPath(neighbor, graph, visited, psf + neighbor + " ", originalSource, count + 1);
			}
		}

		visited[source] = false;

	}

	public static void main(String[] args) {

		printHamiltonianPath(7, new int[][] { { 0, 1 }, { 1, 2 }, { 0, 3 }, { 3, 2 }, { 3, 4 }, { 2, 5 }, { 4, 5 },
				{ 4, 6 }, { 5, 6 } });
	}

}
