package arrays;

public class WaysToReachTarget {

	public static int targetSumCount(int[] arr, int target) {

		return getCount(arr, 0, 0, target);

	}

	private static int getCount(int[] arr, int idx, int sum, int target) {

		if (idx >= arr.length) {
			if (sum == target) {
				return 1;
			} else {
				return 0;
			}
		}

		int countPlus = getCount(arr, idx + 1, sum + arr[idx], target);

		int countMinus = getCount(arr, idx + 1, sum - arr[idx], target);
		
		return countPlus+countMinus;
	}

	public static void main(String[] args) {
		System.out.println(targetSumCount(new int[] { 1, 1, 1, 1, 1 }, 3));
	}

}
