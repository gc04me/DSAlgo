package dp;

import java.util.Arrays;

public class CoinChangePermutation {

	private static int coinChange(int[] arr, int target) {

		int[] dp = new int[target + 1];

		dp[0] = 1;

		for (int i = 1; i < dp.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i - arr[j] >= 0) {
					dp[i] = dp[i] + dp[i - arr[j]];
				}
			}
			System.out.println(Arrays.toString(dp));
		}
		return dp[target];
	}

	public static void main(String[] args) {

		System.out.println(coinChange(new int[] { 2, 3, 5, 6 }, 10));

	}

}
