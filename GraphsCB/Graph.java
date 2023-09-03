package GraphsCB;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {
	int count=0;
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph(int v) {
		// TODO Auto-generated constructor stub
		this.map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public boolean ContainsEdge(int v1, int v2) {
		return map.get(v1).containsKey(v2) && map.get(v2).containsKey(v1);
	}

	public boolean ContainsVertex(int v1) {
		return map.containsKey(v1);
	}

	public int getEdges() {
		int sum = 0;
		for (int key : map.keySet()) {
			sum += map.get(key).size();
		}
		return sum / 2;
	}

	public void removeEdge(int v1, int v2) {
		if (ContainsEdge(v1, v2)) {
			map.get(v1).remove(v2);
			map.get(v2).remove(v1);
		}
	}

	public void removeVertex(int v1) {
		for (int key : map.get(v1).keySet()) {
			map.get(key).remove(v1);
		}
		map.remove(v1);
	}

	public void Display() {
		for (int key : map.keySet()) {
			System.out.println(key + "-->" + map.get(key));
		}
	}

	public boolean hasPath(int src, int des, HashSet<Integer> visited) {
		if (src == des) {
			return true;
		}
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				boolean ans = hasPath(nbrs, des, visited);
				if (ans) {
					return ans;
				}
			}
		}
		visited.remove(src);
		return false;
	}

	public void PrintAllPath(int src, int des, HashSet<Integer> visited, String ans) {
		if (src == des) {
			System.out.println(ans + src);
			return;
		}
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				PrintAllPath(nbrs, des, visited, ans + src + " ");
			}
		}
		visited.remove(src);
//		return;
	}

	public boolean BFS(int src, int des) {
		LinkedList<Integer> que = new LinkedList();
		HashSet<Integer> visited = new HashSet<>();
		que.add(src);
		while (!que.isEmpty()) {
			int rv = que.remove();
			if (visited.contains(rv)) {
				continue;
			}
			visited.add(rv);
			if (rv == des) {
				return true;
			}
			for (int nbrs : map.get(rv).keySet()) {
				if (!visited.contains(nbrs)) {
					que.add(nbrs);
				}
			}
		}
		return false;
	}

	public boolean DFS(int src, int des) {
		Stack<Integer> st = new Stack();
		HashSet<Integer> visited = new HashSet<>();
		st.add(src);
		while (!st.isEmpty()) {
			int rv = st.pop();
			if (visited.contains(rv)) {
				continue;
			}
			visited.add(rv);
			if (rv == des) {
				return true;
			}
			for (int nbrs : map.get(rv).keySet()) {
				if (!visited.contains(nbrs)) {
					st.add(nbrs);
				}
			}
		}
		return false;
	}

	public void BFT() {
		LinkedList<Integer> que = new LinkedList();
		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if (!visited.contains(src)) {
				continue;
			}
			que.add(src);
			while (!que.isEmpty()) {
				int rv = que.remove();
				if (visited.contains(rv)) {
					continue;
				}
				visited.add(rv);
//			Work
				System.out.println(rv + " ");
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						que.add(nbrs);
					}
				}
			}
		}
	}
	public void DFT() {
		Stack<Integer> st = new Stack();
		HashSet<Integer> visited = new HashSet<>();
		for(int src: map.keySet()) {
		st.push(src);
		while (!st.isEmpty()) {
			int rv = st.pop();
			if (visited.contains(rv)) {
				continue;
			}
			visited.add(rv);
			System.out.println(rv+" ");
			for (int nbrs : map.get(rv).keySet()) {
				if (!visited.contains(nbrs)) {
					st.push(nbrs);
				}
			}
		}
		}
	}
	public boolean IsCycle() {
		LinkedList<Integer> que = new LinkedList();
		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if (!visited.contains(src)) {
				continue;
			}
			que.add(src);
			while (!que.isEmpty()) {
				int rv = que.remove();
				if (visited.contains(rv)) {
					count++;
					continue;
				}
				visited.add(rv);
//			Work
				System.out.println(rv + " ");
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						que.add(nbrs);
					}
				}
			}
		}
	}
}
