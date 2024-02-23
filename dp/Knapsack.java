package dp;

public class Knapsack {

	private static int knapsack(int[] vals, int[] wts, int target) {

		int[][] dp = new int[vals.length + 1][target + 1];

		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				dp[i][j] = dp[i - 1][j];

				int weight = wts[i - 1];
				int value = vals[i - 1];

				if (j - weight >= 0) {
					dp[i][j] = Math.max(dp[i - 1][j], value + dp[i-1][j - weight]);
				}

			}
			
			
		}
		print(dp);

		return dp[vals.length][target];
	}

	private static void print(int[][] dp) {
	
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {

		System.out.println(knapsack(new int[] { 15, 14, 10, 45, 30 }, new int[] { 2, 5, 1, 3, 4 }, 7));
	}

}
