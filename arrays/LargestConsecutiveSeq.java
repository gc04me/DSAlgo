package arrays;

import java.util.HashMap;
import java.util.Map;

public class LargestConsecutiveSeq {

	private static int getLargetSeq(int[] arr) {
		int maxCount = 0;

		Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();

		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], true);
		}

		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(arr[i] - 1)) {
				map.put(arr[i], false);
			}
		}

		for (int i = 0; i < arr.length; i++) {

			if (map.get(arr[i]) == true) {

				int length = 1;

				while (map.containsKey(arr[i] + length)) {
					length++;

					if (length > maxCount) {
						maxCount = length;
					}
				}

			}
		}

		return maxCount;
	}

	public static void main(String[] args) {

		int largest = getLargetSeq(new int[] { 100, 4, 200, 1, 3, 2, 5 });
		System.out.println(largest);

	}

}
