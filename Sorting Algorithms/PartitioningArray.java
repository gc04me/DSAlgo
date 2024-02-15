package sorting;

import java.util.Arrays;

public class PartitioningArray {

	public static void partitionArray(int[] arr, int pivot) {

		int i = 0;                                                                             
		int j = 0;

		while (i < arr.length) {
			if (arr[i] >= pivot) {
				i++;
			} else {
				swap(arr, i, j);
				i++;
				j++;
			}
		}

		System.out.println(Arrays.toString(arr));

	}

	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		partitionArray(new int[] { 7, 9, 4, 8, 3, 6 }, 5);
	}

}
