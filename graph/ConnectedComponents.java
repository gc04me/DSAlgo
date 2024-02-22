package graph;

import java.util.ArrayList;
import java.util.List;

public class ConnectedComponents {

	private static void getConnectedComponent(int vertex, int[][] edges) {

		ArrayList<Integer>[] graph = new ArrayList[vertex];

		List<List<Integer>> components = new ArrayList<List<Integer>>();

		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<Integer>();
		}

		for (int[] edge : edges) {
			int src = edge[0];
			int dest = edge[1];

			graph[src].add(dest);
			graph[dest].add(src);
		}

		boolean[] visited = new boolean[vertex+1];

		for (int v = 0; v < vertex; v++) {

			if (visited[v] == false) {
				ArrayList<Integer> component = new ArrayList<Integer>();
				dfs(v, graph, component, visited);
				
				components.add(component);
			}
		}
		
		int pairs=0;
		
		for (int i = 0; i < components.size(); i++) {
			for (int j = i+1; j < components.size(); j++) {
				int count= components.get(i).size() * components.get(j).size();
				pairs+=count;
			}
		}
		
		System.out.println(pairs);
		
		

	}

	private static void dfs(int source, ArrayList<Integer>[] graph, ArrayList<Integer> component, boolean[] visited) {
		
		visited[source]=true;
		
		component.add(source);
		
		for(Integer neighbor:graph[source]) {
			if(visited[neighbor]==false) {
				dfs(neighbor, graph, component, visited);
			}
		}
		
		
	}

	public static void main(String[] args) {
		getConnectedComponent(7, new int[][] { { 0, 1 }, { 2, 3 }, { 4, 5 }, { 5, 6 }, { 4, 6 } });
	}

}
