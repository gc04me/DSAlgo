package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int[] arr) {

		// ith loop for each element
		for (int i = 0; i < arr.length - 1; i++) {
			// compare ith element with each element to right and swap
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
			System.out.println(Arrays.toString(arr));
		}

	}

	private static void swap(int[] arr, int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	public static void main(String[] args) {
		bubbleSort(new int[] { 5, 9, 8, 2, 1 });
	}

}
