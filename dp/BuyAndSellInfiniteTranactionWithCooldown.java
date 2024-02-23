package dp;

public class BuyAndSellInfiniteTranactionWithCooldown {

	private static int maxProfit(int[] arr) {

		int bsp = -arr[0]; // buy state profit
		int csp = 0; // cooldown state profit
		int ssp = 0; // sell state profit

		for (int i = 1; i < arr.length; i++) {
			bsp = Math.max(bsp, csp - arr[i]);
			csp = ssp;
			ssp = Math.max(ssp, arr[i] + bsp);
		}

		return ssp;
	}

	public static void main(String[] args) {

		System.out.println(maxProfit(new int[] { 10, 15, 17, 20, 16, 18, 22 }));
	}

}
