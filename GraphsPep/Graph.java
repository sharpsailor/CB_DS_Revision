package GraphsPep;

import java.util.*;
import java.util.Iterator;

public class Graph {
	static class Edge {
		int v1;
		int v2;
		int wt;

		public Edge(int v1, int v2, int wt) {
			// TODO Auto-generated constructor stub
			this.v1 = v1;
			this.v2 = v2;
			this.wt = wt;
		}
	}

	/*
	 * graph- 7 8 0 1 10 1 2 10 2 3 10 0 3 10 3 4 10 4 5 10 5 6 10 4 6 10 0 6
	 */
	/*
	 * public static void main(String[] args) { ArrayList<Edge>[] graph = new
	 * ArrayList[7]; for (int i = 0; i < graph.length; i++) { graph[i] = new
	 * ArrayList<>(); } graph[0].add(new Edge(0, 1, 10)); graph[0].add(new Edge(0,
	 * 3, 10));
	 * 
	 * graph[1].add(new Edge(1, 0, 10)); graph[1].add(new Edge(1, 2, 10));
	 * 
	 * graph[2].add(new Edge(2, 1, 10)); graph[2].add(new Edge(2, 3, 10));
	 * 
	 * graph[3].add(new Edge(3, 2, 10)); graph[3].add(new Edge(3, 0, 40));
	 * graph[3].add(new Edge(3, 4, 2));
	 * 
	 * graph[4].add(new Edge(4, 3, 2)); graph[4].add(new Edge(4, 5, 3));
	 * graph[4].add(new Edge(4, 6, 8));
	 * 
	 * graph[5].add(new Edge(5, 4, 3)); graph[5].add(new Edge(5, 6, 3));
	 * 
	 * graph[6].add(new Edge(6, 4, 8)); graph[6].add(new Edge(6, 5, 3));
	 * 
	 * System.out.println(hasPath(graph, 1, 6)); }
	 */
	public static void main(String[] args) throws Exception {
	      Scanner sc= new Scanner(System.in);

	      int vtces = sc.nextInt();
	      ArrayList<Edge>[] graph = new ArrayList[vtces];
	      for(int i = 0; i < vtces; i++){
	         graph[i] = new ArrayList<>();
	      }

	      int edges = sc.nextInt();
	      for(int i = 0; i < edges; i++){
	         int v1 = sc.nextInt();
	         int v2 = sc.nextInt();
	         int wt = sc.nextInt();
	         graph[v1].add(new Edge(v1, v2, wt));
	         graph[v2].add(new Edge(v2, v1, wt));
	      }

	      int src = sc.nextInt();
	      int dest = sc.nextInt();

	      // write your code here
	      boolean[] visited= new boolean[vtces];
//	      boolean doesPathexist= hasPath(graph, src, dest, visited);
//	      System.out.println(doesPathexist);
	      PrintAllPath(graph,src , dest ,visited,"");
	    }
		/*
		 * public static boolean hasPath(ArrayList<Edge>[] graph, int src, int des,
		 * boolean[] visited) { if(src==des) { return true; } visited[src]= true;
		 * for(Edge edge: graph[src]) { if(visited[edge.v2]==false) { boolean nbrPath=
		 * hasPath(graph,edge.v2 , des, visited); if(nbrPath) { return true; } } }
		 * 
		 * return false;
		 * 
		 * }
		 */
		private static boolean hasPath(ArrayList<Edge>[] graph, int src ,int des ,boolean[] visited) {
			if(src== des) {
				return true;
			}
			visited[src]= true;
			for(int i =0;i<graph[src].size();i++) {
				Edge edge = graph[src].get(i);
				int nbr = edge.v2;
				if(visited[nbr]==false) {
					boolean pathExists= hasPath(graph, nbr, des, visited);
					if(pathExists) {
						return true;
					}
				}
			}
			return false;
		}
		private static void PrintAllPath(ArrayList<Edge>[] graph, int src ,int des ,boolean[] visited, String ans) {
			if(src== des) {
				System.out.println(ans+".");
				return;
			}
			visited[src]= true;
			for(int i =0;i<graph[src].size();i++) {
				Edge edge = graph[src].get(i);
				int nbr = edge.v2;
				if(visited[nbr]==false) {
					PrintAllPath(graph, nbr, des, visited,ans+nbr+"-->");					
				}
			}
			visited[src]= false;
		}
}
