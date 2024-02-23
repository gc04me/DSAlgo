package arrays;

public class SearchInRotatedSortedArray {

	public static int search(int[] arr, int target) {
		// 4, 5, 6, 7, 0, 1, 2

		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int mid = (start + end) / 2;

			if (arr[mid] == target) {
				return mid;
			}

			// 1st half is sorted

			if (arr[start] < arr[mid]) {

				if (target > arr[start] && target < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}

			} else {
					//2nd half
				if (target > arr[mid] && target < arr[end]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}

			}
		}

		return arr[start] == target ? start : -1;

	}

	public static void main(String[] args) {
		System.out.println(search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0));
	}

}
