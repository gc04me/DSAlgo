package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindOriginalArray {

	private static int[] findOriginalArray(int[] arr) {

		Arrays.sort(arr);

		int[] result = new int[arr.length / 2];
		int idx = 0;

		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (set.contains(arr[i] )) {
				result[idx] = arr[i];
				idx++;
			} else {
				set.add(arr[i] * 2);
			}

		}

		return result;
	}

	public static void main(String[] args) {
		int[] result = findOriginalArray(new int[] { 1, 3, 4, 2, 6, 8 });
		System.out.println(Arrays.toString(result));
	}

}
