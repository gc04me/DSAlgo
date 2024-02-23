package dp;

public class ClimbingStairsTabulation {

	private static int climbStairsCount(int n) {

		int[] dp = new int[n + 1];

		for (int i = 0; i <= n; i++) {
			if (i == 0 || i == 1) {
				dp[i] = 1;
			} else if (i == 2) {
				dp[i] = dp[i - 1] + dp[i - 2];
			} else {
				dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
			}
		}

		return dp[n];
	}

	public static void main(String[] args) {
		System.out.println(climbStairsCount(10));
	}

}
