package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

	private static List<List<Integer>> printThreeSum(int[] arr) {

		Arrays.sort(arr);
		Set<List<Integer>> result = new HashSet<List<Integer>>();

		for (int start = 0; start < arr.length - 2; start++) {
			int left = start + 1;
			int right = arr.length - 1;

			while (left < right) {
				int sum = arr[start] + arr[left] + arr[right];
				if (sum == 0) {
					result.add(new ArrayList<Integer>(Arrays.asList(start, left, right)));
					left++;
				} else if (sum > 0) {
					right--;
				} else {
					left++;
				}
			}
		}

		return new ArrayList<List<Integer>>(result);
	}

	public static void main(String[] args) {

		List<List<Integer>> result = printThreeSum(new int[] { -1, 0, 1, 2, -1, -4 });

		result.forEach(item -> System.out.println(item));

	}

}
