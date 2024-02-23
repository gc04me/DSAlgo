package arrays;

public class MinSubArrayLength {

	public static int minSubArrayLen(int[] nums, int target) {

		int start = 0;
		int end = 0;

		int min = Integer.MAX_VALUE;

		int sum = 0;

		while (start < nums.length && end < nums.length) {

			sum = sum + nums[end];
			end++;

			// if sum ecceed then remove from beginning and check the length

			while (sum >= target) {
				min = Math.min(min, end - start);
				sum = sum - nums[start];
				start++;
			}

		}
		return min == Integer.MAX_VALUE ? 0 : min;

	}

	public static void main(String[] args) {
		System.out.println(minSubArrayLen(new int[] { 2, 3, 1, 2, 4, 3 }, 7));
	}

}
