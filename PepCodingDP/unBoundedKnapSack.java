package PepCodingDP;

import java.util.Scanner;

public class unBoundedKnapSack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		 int[] dp = new int[cap+1];
		 for(int i = 1;i<dp.length;i++) { //i == capacity
			 for(int j = 0;j<wts.length;j++) {
				 int wt = wts[j];
				 int val = values[j];
				 if(i>=wt) {
					 dp[i] = Math.max(dp[i],dp[i-wt]+val);
				 }
			 }
		 }
		 System.out.println(dp[cap]);
	}

}
