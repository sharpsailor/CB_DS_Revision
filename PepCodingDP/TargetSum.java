package PepCodingDP;

import java.util.Scanner;

public class TargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		boolean[][] dp = new boolean[n+1][target+1];
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				if(i==0 && j==0) {
					dp[i][j] = true;
				}
				else if(i==0)  {
					dp[i][j]= false;
					
				}else if(j==0) {
					dp[i][j]= true;
				}else {
					if(dp[i-1][j]) {
						dp[i][j]= true;
					}else {
						int val = arr[i-1]; // i = 3 then array main banda 2th index wala hai 
						if(j>=val) {
							if(dp[i-1][j-val]) {
								dp[i][j]= true;
							}
						}
					}
				}
			}
		}
		System.out.println(dp[arr.length][target]);
	}

}
