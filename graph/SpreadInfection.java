package graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class SpreadInfection {

	static class Pair {
		int vertex;
		int count;

		public Pair(int vertex, int count) {
			super();
			this.vertex = vertex;
			this.count = count;
		}

	}

	private static void infectionCount(int vertex, int[][] edges, int source) {

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

		bfs(source, graph, visited);

	}

	private static void bfs(int source, ArrayList<Integer>[] graph, boolean[] visited) {

		Queue<Pair> q = new ArrayDeque<SpreadInfection.Pair>();

		Pair pair = new Pair(source, 1);

		q.add(pair);

		while (!q.isEmpty()) {
			
			Pair rem = q.poll();

			if (visited[rem.vertex] == true) {
				continue;
			}
			
			visited[rem.vertex]=true;
			
			System.out.println(rem.count);
			
			for(Integer neighbor:graph[rem.vertex]) {
				if(!visited[neighbor]) {
					q.add(new Pair(neighbor, rem.count+1));
				}
			}
			
			

		}

	}

	public static void main(String[] args) {

		infectionCount(7,
				new int[][] { { 0, 1 }, { 1, 2 }, { 2, 3 }, { 0, 3 }, { 3, 4 }, { 4, 5 }, { 5, 6 }, { 4, 6 } }, 0);
	}

}
