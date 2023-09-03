package PepCodingDP;

import java.util.Arrays;
import java.util.Scanner;

public class CoinChangeCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int amt = sc.nextInt();
		int s = coinChangeCombinataion(arr, amt);
		int[] dp = new int[amt + 1];
		dp[0] = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i]; j < dp.length; j++) {
				dp[j] += dp[j - arr[i]];
			}
		}
		System.out.println(dp[amt]);
		// phele ek coin se sab ko traverse karenge toh isse hamesha unique hi aaaiega
	}
	public static int  coinChangeCombinataion(int[] coins , int amount) {
		int[] dp = new int[amount+1];
		Arrays.fill(dp, -1);
		dp[0]=1;
		for(int coin: coins) {
			for(int tar = 1;tar<=amount;tar++) {
				if(tar>=coin) {
					dp[tar]+= dp[tar-coin];
				}
			}
		}
		return dp[amount];
	}
}
