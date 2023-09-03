package DP;

public class fibonacci {
	public static void main(String[] args) {
		int n = 45;
		int[] dp = new int[n+1];
		System.out.println(fiboTD(n, dp));
		
	}
//	TopDown
	public static int fiboTD(int n , int dp[]) {
		if(n==0||n==1) {
			return n;
		}
		if(dp[n]!=0) {
			return dp[n];
		}
		int f1 = fiboTD(n-1, dp);
		int f2 = fiboTD(n-2, dp);
		dp[n] = f1+f2;
		return f1+f2; 
	}
//	Bottom Up Approach---> faster
	public static int fiboBU(int n) {
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		for(int i =2;i<dp.length;i++) {
			dp[i] = dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
}
