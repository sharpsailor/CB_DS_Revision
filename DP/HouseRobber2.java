package DP;

public class HouseRobber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,1};
		System.out.println(rob(nums));
	}
	public static  int rob(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = nums[1];
        
    }
}
