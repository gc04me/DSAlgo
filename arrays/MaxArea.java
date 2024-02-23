package arrays;

public class MaxArea {

	public static int maxArea(int[] arr) {

		int start = 0;
		int end = arr.length - 1;
		int maxArea = Integer.MIN_VALUE;

		while (start < end) {

			int area = Math.min(arr[start], arr[end]) * (end - start);

			if (arr[start] <= arr[end]) {
				start++;
			} else {
				end--;
			}

			maxArea = Math.max(area, maxArea);

		}

		return maxArea;

	}

	public static void main(String[] args) {
		System.out.println(maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
	}

}
