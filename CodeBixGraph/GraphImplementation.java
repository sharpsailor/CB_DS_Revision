package CodeBixGraph;

import java.util.*;

public class GraphImplementation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		int[][] adjMat = new int[v][v];
		for (int i = 0; i < e; i++) {
			int sv = sc.nextInt();
			int ev = sc.nextInt();
			adjMat[sv][ev] = 1;
			adjMat[ev][sv] = 1;
		}
//		printDFS(adjMat, 0);
		printBFS(adjMat, 0);
	}

	private static void printDFSHelper(int[][] adjMat, int sv, boolean[] visited) {
		System.out.println(sv);
		visited[sv] = true;
		int v = adjMat.length;
		for (int i = 0; i < v; i++) {
			if (adjMat[sv][i] == 1 && !visited[i]) {
				printDFSHelper(adjMat, i, visited);
			}
		}
	}

	public static void printDFS(int[][] adjMat, int sv) {
		int v = adjMat.length;
		boolean[] visited = new boolean[v];
		for (int i = 0; i < v; i++) {
			if (!visited[i]) {
				printDFSHelper(adjMat, i, visited);
			}
		}
	}

	public static void printBFS(int[][] adjMat, int sv) {
		int v = adjMat.length;
		boolean[] visited = new boolean[v];
		for (int i = 0; i < v; i++) {
			if (!visited[i]) {
				printBFSHelper(adjMat, i, visited);
			}
		}
	}

	private static void printBFSHelper(int[][] adjMat, int sv, boolean[] visited) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();
		q.add(sv);
		visited[sv] = true;
		int v = adjMat.length;
		while (!q.isEmpty()) {
//			remove
			int rv = q.poll();
//			 Add
			System.out.print(rv+" ");
			for (int i = 0; i < v; i++) {
				if (adjMat[rv][i] == 1 && !visited[i]) {
//				Add nbrs
					q.add(i);
//					 Mark visted
					visited[i] = true;
//					printBFSHelper(adjMat, sv,visited);
				}
			}
		}
	}
}
