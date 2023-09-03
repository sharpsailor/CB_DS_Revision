package DPCB;

import java.util.Arrays;

public class DistinctSubsequences {
	class Solution {
	    public int numDistinct(String s, String t) {
	    	int[][] dp = new int[s.length()+1][t.length()+1];
	    	for(int[]a:dp) {
	    		Arrays.fill(a, -1);	    		
	    	}
	        return CoinChange(s, t, 0, 0, dp);
	    }
	    public int CoinChange(String s, String t , int i , int j , int[][]dp) {
	    	if(i==t.length()) {
	    		return 1;
	    	}
	    	if(j==s.length()) {
	    		return 0;
	    	}
	    	if(dp[j][i]!=-1) {
	    		return dp[i][j];
	    	}
	    	int inc =0;
	    	int exc=0;
	    	if(s.charAt(i)==t.charAt(j)) {
	    		inc=CoinChange(s, t, i+1, j+1, dp);
	    	}
	    	exc=CoinChange(s, t, i+1, j+1, dp);
	    	return dp[i][j]=inc+exc;
	    }
	}
}
