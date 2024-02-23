package dp;

public class MinMoveToClimbStairs {

	private static int minMoves(int n, int[] arr) {

		Integer[] dp = new Integer[n + 1];

		dp[n] = 0;

		for (int i = n - 1; i >= 0; i--) {

			int min = Integer.MAX_VALUE;

			for (int j = 1; j <= arr[i] && i + j < dp.length; j++) {

				if (dp[i + j] != null) {
					min = Math.min(min, dp[i + j]);
				}

			}

			if (min != Integer.MAX_VALUE) {
				dp[i] = min + 1;
			}

		}

		return dp[0];
	}

	public static void main(String[] args) {
		System.out.println(minMoves(6, new int[] { 2, 3, 0, 1, 2, 3 }));
	}

}
