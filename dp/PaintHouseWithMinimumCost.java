package dp;

public class PaintHouseWithMinimumCost {

	private static int paintHouse(int[][] arr) {

		int[][] dp = new int[arr[0].length][arr.length];                                              

		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr[0].length; i++) {

				if (j == 0) {
					dp[i][j] = arr[j][i];
				} else if (i == 0 && j != 0) {
					dp[i][j] = arr[j][i] + Math.min(dp[i + 1][j - 1], dp[i + 2][j - 1]);
				} else if (i == 1 && j != 0) {
					dp[i][j] = arr[j][i] + Math.min(dp[i - 1][j - 1], dp[i + 1][j - 1]);
				} else {
					dp[i][j] = arr[j][i] + Math.min(dp[i - 1][j - 1], dp[i - 2][j - 1]);
				}
			}

		}

		return Math.min(dp[0][dp.length], Math.min(dp[1][dp.length], dp[2][dp.length]));
	}

	public static void main(String[] args) {

		System.out.println(paintHouse(new int[][] { { 1, 5, 7 }, { 5, 8, 4 }, { 3, 2, 9 }, { 1, 2, 4 } }));

	}

}
