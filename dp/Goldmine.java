package dp;

public class Goldmine {

	private static int maxGold(int[][] arr) {

		int[][] dp = new int[arr.length][arr[0].length];

		for (int j = arr[0].length - 1; j >= 0; j--) {
			for (int i = arr.length - 1; i >= 0; i--) {
				if (j == arr[0].length - 1) {
					dp[i][j] = arr[i][j];
				} else if (i == 0) {
					dp[i][j] = arr[i][j] + Math.max(arr[i][j + 1], arr[i + 1][j + 1]);
				} else if (i == arr.length - 1) {
					dp[i][j] = arr[i][j] + Math.max(arr[i][j + 1], arr[i - 1][j + 1]);
				} else {
					dp[i][j] = arr[i][j] + Math.max(arr[i][j + 1], Math.max(arr[i + 1][j + 1], arr[i - 1][j + 1]));
				}
			}
		}

		print(dp);

		return 0;
	}

	private static void print(int[][] dp) {
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		System.out.println(maxGold(new int[][] { { 0, 1, 4, 2, 8, 2 }, { 4, 3, 6, 5, 0, 4 }, { 1, 2, 4, 1, 4, 6 },
				{ 2, 0, 7, 3, 2, 2 }, { 3, 1, 5, 9, 2, 4 }, { 2, 7, 0, 8, 5, 1 } }));
	}

}
