package DP;
import java.util.Arrays;


public class HouseRobber {
	public static void main(String[] args) {
		int[] arr = {5,2,1,11};
		int[] dp = new int[arr.length];
		Arrays.fill(dp, -1);
		System.out.println(robber(arr,0,dp));
		System.out.println(BottomUp(arr));
	}
//Top Down
	public static int robber(int[]arr, int i,int[]dp) {
		if(i>=arr.length) {
			return 0; 
		}
		if(dp[i]!=-1) {
			return dp[i];
		}
		int rob = arr[i]+robber(arr, i+2,dp);
		int nrob = robber(arr, i+1,dp);
		dp[i]= Math.max(rob, nrob);
		return Math.max(rob, nrob);
	}
//	Bottom Up
	 public static int BottomUp(int[]arr) {
		 int[] dp = new int[arr.length];
		 dp[0] = arr[0];
		 dp[1] = Math.max(arr[0], arr[1]);
		 for(int i =2;i<dp.length;i++) {
			 int rob = arr[i]+dp[i-2];
			 dp[i] = Math.max(rob, dp[i-1]);
		 }
		 return dp[arr.length-1];
	 }
}
