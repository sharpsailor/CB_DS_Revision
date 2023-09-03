package PepCodingDP;
import java.util.*;
import java.util.Scanner;

public class Knapsack0_1 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int [] values = new int[n];
		 int[] wts = new int[n];
		 for (int i = 0; i < values.length; i++) {
			values[i] = sc.nextInt();
		}
		 for (int i = 0; i < wts.length; i++) {
			wts[i]= sc.nextInt();
		}
		 int cap = sc.nextInt();
		 int[][] dp = new int[n+1][cap+1];
		 for(int i = 1;i<dp.length;i++) {
			 for(int j = 1;j<dp[0].length;j++) {
				 int idx = i-1;
				 int wt = wts[idx];
				 int val = values[idx];
				 dp[i][j]= dp[i-1][j];			// Item ko nahi dala 
				  if(j>=wt) {
					  dp[i][j]=Math.max(dp[i-1][j]+0,dp[i-1][j-wt]+val);
				  }else {
					  dp[i][j]= dp[i-1][j];
				  }
			 }
		 }
		 System.out.println(dp[n][cap]);
	}
}
