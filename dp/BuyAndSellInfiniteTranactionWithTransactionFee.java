package dp;

public class BuyAndSellInfiniteTranactionWithTransactionFee {

	private static int maxProfit(int[] arr, int fees) {                                             

		int boughtState = -arr[0];
		int soldState = 0;

		for (int i = 1; i < arr.length; i++) {
			boughtState = Math.max(boughtState, soldState - arr[i]);
			soldState = Math.max(soldState, arr[i] + boughtState - fees);
		}

		return soldState;

	}

	public static void main(String[] args) {

		System.out.println(maxProfit(new int[] { 11, 6, 7, 19, 4, 1, 6, 18, 10, 40 }, 3));
	}

}
