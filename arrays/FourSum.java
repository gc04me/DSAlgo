package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum {

	public static List<List<Integer>> fourSum(int[] arr, int target) {
		
		Arrays.sort(arr);

		Set<List<Integer>> result = new HashSet<List<Integer>>();

		for (int start = 0; start < arr.length - 3; start++) {
			int current = arr[start];
			int remaining = target - current;

			List<List<Integer>> threeSumResult = getThreeSum(arr, remaining, start + 1);

			for (List<Integer> list : threeSumResult) {
				list.add(current);
				result.add(list);
			}

		}

		return new ArrayList<List<Integer>>(result);

	}

	private static List<List<Integer>> getThreeSum(int[] arr, int remaining, int startIndex) {

		Set<List<Integer>> result = new HashSet<List<Integer>>();

		for (int start = startIndex; start < arr.length - 2; start++) {

			int left = start + 1;
			int right = arr.length - 1;

			while (left < right) {
				int sum = arr[start] + arr[left] + arr[right];

				if (sum == remaining) {
					result.add(new ArrayList<Integer>(Arrays.asList(start, left, right)));
					left++;
				} else if (sum > remaining) {
					right--;
				} else {
					left++;
				}
			}
		}

		return new ArrayList<List<Integer>>(result);
	}

	public static void main(String[] args) {

		List<List<Integer>> result = fourSum(new int[] { 1, 0, -1, 0, -2, 2 }, 0);
		result.forEach(item -> System.out.println(item));
	}

}
