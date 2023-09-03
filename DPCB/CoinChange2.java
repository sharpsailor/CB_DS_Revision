package DPCB;

import java.util.Arrays;

public class CoinChange2 {
	public static void main(String[] args) {
		int[] coin = {1,2,5};
		int amount =5;
		int[][]dp = new int[amount+1][coin.length+1];
		for(int[]a:dp) {
			Arrays.fill(a, -1);			
		}
		System.out.println(CoinChanges(coin, amount,0,dp));
	}
	public static int CoinChanges(int[] coin , int amount , int i,int[][]dp){
		if(amount==0) {
			return 1;
		}
		if(i==coin.length) {
			return 0;
		}
		if(dp[amount][i]!=-1) {
			return dp[amount][i];
		}
		int inc=0;
		int exc=0;
		if(amount>=coin[i]) {
			inc=CoinChanges(coin, amount-coin[i], inc,dp);
		}
		exc=CoinChanges(coin, amount, i+1,dp);
		return dp[amount][i]=inc+exc;
	} 
	private static int BootomUp(int[]coin, int amount) {
		int[][] dp = new int[ amount+1][coin.length+1];
		for(int i =0;i<dp[0].length;i++) {
			dp[1][i]=1;
		}
		for (int i = 1; i < dp.length; i++) {
			int inc=0;
			int exc = 0;
			for (int j = 1; j < dp[0].length; j++) {
				if(amount>=coin[i-1]) {
					inc=dp[amount-coin[i]][i];
				}
				exc=dp[amount][i-1];
				dp[amount][i]= inc+exc;
			}
		}
		return dp[amount][coin.length];
	}
}
