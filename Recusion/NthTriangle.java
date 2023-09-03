package Recusion;

import java.util.Scanner;

public class NthTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(NTriangle(n));
	}
	public static int NTriangle(int n ) {
		if(n==1) {
			return 1; 
		}
		 
		return n+NTriangle(n-1);
	}
}
