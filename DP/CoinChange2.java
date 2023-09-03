package DP;

import java.util.Arrays;

public class CoinChange2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = {1,2,5};
		int amount =5;
		int [][] dp = new int[amount+1][coin.length+1];
			for(int[] x: dp) {
				Arrays.fill(x, -1);
			}
		 int ans = coinChange(coin, amount, 0, dp);
		 System.out.println(ans);
		 
	}
	public static int  coinChange(int[] coin, int amount, int i,int[][] dp ) {
		if(amount ==0) {
			return 1;
		}
		if(i==coin.length) {
			return 0;
		}
		if(dp[amount][i]!=-1) {
			return dp[amount][i];
		}
		int inc =0;
		int exc =0;
		if(amount>=coin[i]) {
			inc += coinChange(coin, amount-coin[i], i,dp);
		}
		exc += coinChange(coin, amount, i+1,dp);
		return dp[amount][i] = inc+exc;
	}
//	BottomUp Approach
	public static int BottomUp(int[]coin, int amount) {
		int[][] dp = new int[amount+1][coin.length+1];
		for(int i =0;i<dp[0].length;i++) {
			dp[0][i] = 1;
		}
		for(int am =1;am<dp.length;am++) { // Row ke amount pe chalega 
			for(int i =1;i<dp[0].length;i++) { // Ek row ke column pe chalega
				int inc = 0;
				int exc =0;
				if(am>coin[i-1]) {
					inc = dp[am-coin[i-1]][i];
				}
				exc = dp[am][i-1];
				dp[am][i]= inc+exc;
			}
		}
		return dp[amount][coin.length];
	}
}
