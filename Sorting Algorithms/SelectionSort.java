package sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void selectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			// declare min value as i value in start
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			// at end of above loop we will min value index
			// swap ith value with min value index
			swap(arr, i, min);

			System.out.println(Arrays.toString(arr));
		}

	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		selectionSort(new int[] { 5, 9, 8, 1, 6 });
	}

}
