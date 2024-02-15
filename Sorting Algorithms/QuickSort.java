package sorting;

import java.util.Arrays;

public class QuickSort {

	private static int[] quickSort(int[] arr) {

		return quick(arr, 0, arr.length - 1);
	}

	private static int[] quick(int[] arr, int low, int high) {                                                                                  

		if (low >= high) {
			return arr;
		}

		int pivot = arr[high];
		int pivotIndex = partitionArray(arr, pivot, low, high);
		quick(arr, low, pivotIndex - 1);
		quick(arr, pivotIndex + 1, high);

		return arr;

	}

	public static int partitionArray(int[] arr, int pivot, int low, int high) {

		int i = low;
		int j = low;

		while (i <= high) {
			if (arr[i] <= pivot) {
				swap(arr, i, j);
				i++;
				j++;
			} else {
				i++;
			}
		}

		return j - 1; // index of pivot

	}

	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] result = quickSort(new int[] { 7, 9, 4, 8, 3, 6, 1, 12 });
		System.out.println(Arrays.toString(result)); // [1, 3, 4, 6, 7, 8, 9, 12]
	}

}
