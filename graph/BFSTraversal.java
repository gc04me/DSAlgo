package graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class BFSTraversal {

	static class Pair {
		int vertex;
		String psf;

		public Pair(int vertex, String psf) {
			super();
			this.vertex = vertex;
			this.psf = psf;
		}

	}

	private static void BfsTraversal(int vertex, int[][] edges, int source, int destination) {

		ArrayList<Integer> [] graph = new ArrayList[vertex];
		
		for (int i = 0; i < graph.length; i++) {
			graph[i]= new ArrayList<Integer>();
		}
		
		for(int[] edge:edges) {
			int src= edge[0];
			int dest= edge[1];
			
			graph[src].add(dest);
			graph[dest].add(src);
		}
		
		boolean[] visited = new boolean[vertex];
		
		bfs(source,destination,graph,visited);
		
		
	}

	private static void bfs(int source, int destination, ArrayList<Integer>[] graph, boolean[] visited) {
	
		Queue<Pair> q = new ArrayDeque<BFSTraversal.Pair>();
		
		Pair pair= new Pair(source, source+"");
		
		q.add(pair);
		
		while(!q.isEmpty()) {
			
			Pair rem= q.poll();
			
			if(visited[rem.vertex]==true) {
				continue;
			}
			
			visited[rem.vertex]=true;
			
			
			System.out.println(rem.psf);
			
			for(Integer neighbor: graph[rem.vertex]) {
				if(!visited[neighbor]) {
					q.add(new Pair(neighbor, rem.psf+neighbor));
				}
			}
			
		}
		
		
	
		
	}

	public static void main(String[] args) {
		BfsTraversal(7, new int[][] { { 0, 1 }, { 1, 2 }, { 2, 3 }, { 0, 3 }, { 3, 4 }, { 4, 5 }, { 5, 6 }, { 4, 6 } },
				0, 6);
	}

}
