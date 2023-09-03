package PepCodingDP;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[n+1];
		int fn = fib(n,dp);
		System.out.println(fn);
	}
	
	private static int fib(int n, int[]strg) {
		// TODO Auto-generated method stub
		if(n==0||n==1) {
			 return n ;
		}
		if(strg[n]!=0) {
			return strg[n];
		}
		int f1 = fib(n-1,strg);
		int f2 = fib(n-2,strg);
		int fn = f1+f2;
		strg[n] = fn;
		return fn;
	}

}
