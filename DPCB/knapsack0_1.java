package DPCB;

import java.util.*;

public class knapsack0_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cap = sc.nextInt();
		int[] wt = new int[n];
		for (int i = 0; i < wt.length; i++) {
			wt[i] = sc.nextInt();
		}
		int[] bagVal = new int[n];
		for (int i = 0; i < bagVal.length; i++) {
			bagVal[i] = sc.nextInt();
		}
		int[][] dp = new int[cap + 1][wt.length + 1];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(knapSack(wt, bagVal, cap, 0, dp));
	}
 
	public static int knapSack(int[] wt, int[] val, int cap, int i, int[][] dp) {
		if (cap == 0 || i == wt.length) {
			return 0;
		}
		int inc = 0;
		int exc = 0;
		if (dp[cap][i] != -1) {
			return dp[cap][i];
		}
		if (cap >= wt[i]) {
			inc = val[i] + knapSack(wt, val, cap - wt[i], i + 1, dp);
		}
		exc = knapSack(wt, val, cap, i + 1, dp);
		return dp[cap][i] = Math.max(inc, exc);
	}

	public static int BottomUp(int[] wt, int[] val,int cap) {
		int[][] dp = new int[cap+1][wt.length+1];
		for(int i =1;i<dp[0].length;i++) {
			
		}
	}
}
