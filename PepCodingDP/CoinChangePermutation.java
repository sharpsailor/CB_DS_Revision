package PepCodingDP;

import java.util.Iterator;
import java.util.Scanner;

public class CoinChangePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] coins = new int[n];
		for (int i = 0; i < coins.length; i++) {
			coins[i] = sc.nextInt();
		}
		int tar = sc.nextInt();
		int[] dp = new int[tar + 1];
		dp[0] = 1;
		for (int amt = 1; amt < dp.length; amt++) {
			for (int coin : coins) {
				if (coin <= amt) {
					int remAmt = amt - coin;
					dp[amt] += dp[remAmt];
				}
			}
		}
		System.out.println(dp[tar]);
// Isme sab ke liye ek ssaath check hoga coin toh sare ek baar main coin use ho rahe hai toh repeat hoga
	}

}
