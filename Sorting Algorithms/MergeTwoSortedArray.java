package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedArray {

	public static void mergeSortedArray(int[] arr1, int[] arr2) {

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

		System.out.println(Arrays.toString(result));

	}

	public static void main(String[] args) {
		mergeSortedArray(new int[] { 2, 5, 12, 18, 20 }, new int[] { 7, 9, 11, 15, 25, 28, 30 });
	}

}
