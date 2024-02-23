package dp;

import java.util.Arrays;

public class UnBoundedKnapsack {

	private static int unBoundedKanpsack(int[] vals, int[] wts, int target) {

		int[] dp = new int[target + 1];

		for (int i = 0; i < dp.length; i++) {
			int max = Integer.MIN_VALUE;
			for (int j = 0; j < wts.length; j++) {
				
				if (i - wts[j] >= 0) {
					int cmax = Math.max(vals[j], dp[i - wts[j]] + vals[j]);

					if (cmax > max) {
						max = cmax;
					}

				}
				dp[i] = max;
			}
			
		}

		System.out.println(Arrays.toString(dp));

		return 0;
	}

	public static void main(String[] args) {

		System.out.println(unBoundedKanpsack(new int[] { 15, 14, 10, 45, 30 }, new int[] { 2, 5, 1, 3, 4 }, 7));

	}

}
