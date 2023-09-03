package PepCodingDP;

import java.util.Scanner;

public class ClimbStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int paths = climb(n,new int[n+1]);
		int path = climbStairs(n);
		System.out.println(paths);
		System.out.println(path);
	}
	public static int climb(int n,int[] dp ) {
		if(n==0) {
			return 1;
		}
		else if (n<0) {
			return 0; 
		}
		if(dp[n]!=0) {
			return dp[n];
		}
		int p1 = climb(n-1, dp);
		int p2 = climb(n-2, dp);
		int p3 = climb(n-3, dp);
		dp[n]= p1+p2+p3;
		return dp[n];
	}
	public static int climbStairs(int n) {
		 int[] strg = new int[n+1];
		 strg[0]= 1;
		 for(int i =1;i<=n;i++) {
			 if(i-1>=0) {
				 strg[i]+=strg[i-1];
			 }
			 if(i-2>=0) {
				 strg[i]+=strg[i-2];
			 }
			 if(i-3>=0) {
				 strg[i]+=strg[i-3];
			 }
		 }
		 return strg[n];
	}
}
