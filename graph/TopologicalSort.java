package graph;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {

	private static void sortOrder(int vertex, int[][] edges) {

		ArrayList<Integer>[] graph = new ArrayList[vertex];

		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<Integer>();
		}

		for (int[] edge : edges) {
			int src = edge[0];
			int dest = edge[1];

			graph[src].add(dest);
		}
		
		boolean[] visited = new boolean[vertex];

		Stack<Integer> stack = new Stack<Integer>();

		// run for all vertices
		for (int v = 0; v < visited.length; v++) {
			if (visited[v] == false) {
				dfs(v, graph, visited, stack);
			}
		}

		stack.forEach(item -> System.out.println(item));

	}

	private static void dfs(int source, ArrayList<Integer>[] graph, boolean[] visited, Stack<Integer> stack) {

		visited[source] = true;

		for (Integer neighbor : graph[source]) {
			if (visited[neighbor] == false) {
				dfs(neighbor, graph, visited, stack);
			}
		}
		stack.push(source);
	}

	public static void main(String[] args) {
		sortOrder(7, new int[][] { { 0, 1 }, { 1, 2 }, { 2, 3 }, { 0, 3 }, { 4, 3 }, { 4, 5 }, { 4, 6 }, { 5, 6 } });
	}

}
