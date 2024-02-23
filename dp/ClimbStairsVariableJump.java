package dp;

public class ClimbStairsVariableJump {

	private static int jumpCount(int n, int[] arr) {

		int[] dp = new int[n + 1];

		dp[n] = 1;

		for (int i = n - 1; i >= 0; i--) {

			int count = 0;

			for (int j = 0; j < arr[i]; j++) {
				if (i + j <= n) {
					count += dp[i + j];
				}
				dp[i] +=count;

			}

		}

		return dp[0];
	}

	public static void main(String[] args) {

		System.out.println(jumpCount(6, new int[] { 2, 3, 0, 1, 2, 3 }));

	}

}
