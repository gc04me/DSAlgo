package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

	public static int[] mergeSort(int[] arr) {

		if (arr.length <= 1) {
			return arr;
		}

		int mid = arr.length / 2;
		
		int[] leftArr = mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] rightArr= mergeSort(Arrays.copyOfRange(arr, mid,arr.length));
		
		int mergedArr[] = merge(leftArr, rightArr);

		return mergedArr;

	}

	public static int[] merge(int[] arr1, int[] arr2) {

		List<Integer> list = new ArrayList<Integer>();

		int i = 0;
		int j = 0;

		while (i < arr1.length && j < arr2.length) {

			if (arr2[j] < arr1[i]) {
				list.add(arr2[j]);
				j++;
			} else {
				list.add(arr1[i]);
				i++;
			}
		}

		while (i < arr1.length) {
			list.add(arr1[i]);
			i++;
		}

		while (j < arr2.length) {
			list.add(arr2[j]);
			j++;
		}

		int[] result = new int[list.size()];

		for (int k = 0; k < list.size(); k++) {
			result[k] = list.get(k);
		}

		return result;

	}

	public static void main(String[] args) {
		
		
		int [] result =mergeSort(new int[] { 5, 9, 8, 1, 6 });
		System.out.println(Arrays.toString(result));
	}

}
