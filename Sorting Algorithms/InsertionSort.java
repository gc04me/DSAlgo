package sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			// look behind ith index and get sorted array till ith index
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				} else {
					// nothing to sort as arr[j+1]> arr[j]                                 
					break;
				}
			}
			System.out.println(Arrays.toString(arr));
		}

	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {

		insertionSort(new int[] { 5, 9, 8, 1, 6 });
	}

}
