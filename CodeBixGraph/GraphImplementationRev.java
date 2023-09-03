package CodeBixGraph;

import java.util.*;

public class GraphImplementationRev {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int v = sc.nextInt();
	int e = sc.nextInt();
	int[][] adjMatrix = new int[v][v];
		for(int i =0;i<e;i++) {
			int sv = sc.nextInt();
			int ev = sc.nextInt();
			adjMatrix[sv][ev]= 1;
			adjMatrix[ev][sv]= 1;
		}
		printBFS(adjMatrix,0);
	}
	public static void printDFS(int[][] adjMatrix, int sv) {
		int v = adjMatrix.length;
		boolean[] visited = new boolean[v];
		for(int i =0;i<v;i++) {
			if(!visited[i]) {
				printDFSHelper(adjMatrix,i,visited);
			}
		}
	}
	private static void printDFSHelper(int[][] adjMatrix, int sv, boolean[] visited) {
		// TODO Auto-generated method stub
		System.out.println(sv);
		visited[sv]= true;
		for(int i =0;i<adjMatrix.length;i++) {
			if(!visited[i]) {
				printDFSHelper(adjMatrix, i, visited);
			}
		}
	}
	public static void printBFS(int[][] adjMatrix, int sv) {
		// TODO Auto-generated method stub
		int v = adjMatrix.length;
		boolean[] visited = new boolean[v];
		for(int i =0;i<v;i++) {
			if(!visited[i]) {
				printBFSHelper(adjMatrix,i,visited);
			}
		}
	}

	private static void printBFSHelper(int[][] adjMatrix, int sv, boolean[] visited) {
		// TODO Auto-generated method stub
		Queue<Integer> q= new LinkedList<>();
		q.add(sv);
		visited[sv]= true;
		int v = adjMatrix.length;
		while(!q.isEmpty()) {
			int rv = q.poll();
			System.out.print(rv+" ");
			for(int i =0;i<v;i++) {
				if(adjMatrix[rv][i]==1 && !visited[i]) {
					q.add(i);
					visited[i]= true;
				}
			}
		}
	}
}
