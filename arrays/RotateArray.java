package arrays;

import java.util.Arrays;

public class RotateArray {

	private static void rotate(int[] arr, int k) {

		int start = 0;
		int end = arr.length - 1;

		swap(arr, start, end);
		swap(arr, start, k - 1);
		swap(arr, k, end);

		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		rotate(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 3);
	}

	private static void swap(int[] arr, int start, int end) {

		while (end >= start) {

			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			end--;
			start++;
		}

	}

}
