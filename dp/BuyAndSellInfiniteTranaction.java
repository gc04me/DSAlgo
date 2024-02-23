package dp;

public class BuyAndSellInfiniteTranaction {

	private static int maxProfit(int[] prices) {

		int buy = 0;                                                                        
		int sell = 0;
		int profit = 0;

		for (int i = 1; i < prices.length; i++) {

			if (prices[i] >= prices[i - 1]) {
				sell++;
			} else {
				profit += prices[sell] - prices[buy];
				buy = sell = i;
			}

		}
		profit += prices[sell] - prices[buy];
		return profit;
	}

	public static void main(String[] args) {
		System.out.println(maxProfit(new int[] { 11, 6, 7, 19, 4, 1, 6, 18, 10,40 }));
	}

}
