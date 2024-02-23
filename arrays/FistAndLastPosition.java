package arrays;

import java.util.Arrays;

public class FistAndLastPosition {

	private static int[] getFisrtAndLastPosition(int[] arr, int target) {

		int[] result = new int[2];

		result[0] = getFisrtIndex(arr, target);
		result[1] = getLastIndex(arr, target);

		return result;
	}

	private static int getFisrtIndex(int[] arr, int target) {

		int start = 0;
		int end = arr.length;
		int index = -1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (arr[mid] >= target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

			if (arr[mid] == target) {
				index = mid;
			}
		}

		return index;
	}

	private static int getLastIndex(int[] arr, int target) {

		int start = 0;
		int end = arr.length;
		int index = -1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (arr[mid] <= target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

			if (arr[mid] == target) {
				index = mid;
			}

		}

		return index;
	}

	public static void main(String[] args) {

		int[] result = getFisrtAndLastPosition(new int[] { 5, 7, 8, 8, 8, 8, 8, 10 }, 8);
		System.out.println(Arrays.toString(result));
	}

}
