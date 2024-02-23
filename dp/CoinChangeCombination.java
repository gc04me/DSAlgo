package dp;

import java.util.Arrays;

public class CoinChangeCombination {

	private static int coinChange(int[] arr, int target) {

		int dp[] = new int[target + 1];

		dp[0] = 1;

		for (int i = 0; i < arr.length; i++) {

			for (int j = arr[i]; j < dp.length; j++) {
				dp[j] = dp[j] + dp[j - arr[i]];
			}
			System.out.println(Arrays.toString(dp));
		}

		

		return dp[target];
	}

	public static void main(String[] args) {

		System.out.println(coinChange(new int[] { 2, 3, 5 }, 7));
	}

}
