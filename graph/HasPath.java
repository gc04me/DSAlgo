package graph;

import java.util.ArrayList;

public class HasPath {

	private static boolean hasPath(int vertex, int[][] edges, int source, int destination) {

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

		return isHavingPath(source, destination, graph, visited);

	}

	private static boolean isHavingPath(int source, int destination, ArrayList<Integer>[] graph, boolean[] visited) {

		if (source == destination) {
			return true;
		}

		visited[source] = true;

		for (Integer neighbour : graph[source]) {
			if (!visited[neighbour]) {
				boolean hasPath = isHavingPath(neighbour, destination, graph, visited);
				if (hasPath) {
					return true;
				}
			}
		}

		return false;
	}

	public static void main(String[] args) {

		System.out.println(hasPath(7,
				new int[][] { { 0, 1 }, { 1, 2 }, { 2, 3 }, { 0, 3 }, { 3, 4 }, { 4, 5 }, { 5, 6 }, { 4, 6 } }, 0, 6));
	}

}
