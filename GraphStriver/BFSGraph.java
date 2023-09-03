package GraphStriver;
import java.util.*;
public class BFSGraph {
	HashMap<Integer,HashMap<Integer,Integer>> map = new HashMap<>();
	public BFSGraph(int v) {
		// TODO Auto-generated constructor stub
		this.map = new HashMap<>();
		for(int i =1;i<=v;i++) {
			map.put(i, new HashMap<>());
		}
	}
	public void AddEdge(int v1 , int v2, int cost ) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}
	public void Display() {
		for(int key : map.keySet()) {
			System.out.println(key+"-->"+map.get(key));
		}
	}
	public void BFS(int V ,HashMap<Integer,HashMap<Integer,Integer>> map) {
	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		BFSGraph g = new BFSGraph(v);
		g.AddEdge(1, 4, 6);
		g.AddEdge(1, 2, 10);
		g.AddEdge(2, 3, 7);
		g.AddEdge(3, 4, 5);
		g.AddEdge(4, 5, 1);
		g.AddEdge(5, 6, 4);
		g.AddEdge(7, 5, 2);
		g.AddEdge(6, 7, 3);
		g.Display();
	}
}
