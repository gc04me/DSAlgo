package arrays;

import java.util.Arrays;

public class TwoSumSortedArray {

	public static int[] twoSum(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			if (arr[start] + arr[end] == target) {
				return new int[] { start, end };
			} else if (arr[start] + arr[end] > target) {
				end--;
			} else {
				start++;
			}
		}
		return arr;

	}

	public static void main(String[] args) {
		int[] result = twoSum(new int[] { 2, 7, 11, 15 }, 22);
		System.out.println(Arrays.toString(result));
	}

}
