package dp;

public class BuySellOneTransaction {

	private static int maxProfit(int[] prices) {                                              

		int min = Integer.MAX_VALUE;

		int profitIfSoldToday = 0;
		int overAllProfit = 0;

		for (int i = 0; i < prices.length; i++) {

			min = Math.min(min, prices[i]);

			profitIfSoldToday = prices[i] - min;

			if (profitIfSoldToday > overAllProfit) {
				overAllProfit = profitIfSoldToday;
			}
		}

		return overAllProfit;
	}

	public static void main(String[] args) {

		System.out.println(maxProfit(new int[] { 11, 6, 7, 19, 4, 1, 6, 18, 4 }));
	}

}
