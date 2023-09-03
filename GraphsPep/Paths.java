package GraphsPep;
import java.util.*;
public class Paths {
	static class Edge{
		int v1 ;
		int v2 ;
		int wt ;
		public Edge(int v1 , int v2 , int wt){
			this.v1 = v1;
			this.v2 = v2;
			this.wt = wt;
		}
	}
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
	}
	public void ShortestPath() {
		
	}
}
