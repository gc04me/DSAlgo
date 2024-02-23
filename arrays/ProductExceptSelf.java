package arrays;

import java.util.Arrays;

public class ProductExceptSelf {

	private static int[] productExceptSelf(int[] arr) {

		int prod = 1;

		int[] rightArray = new int[arr.length];
		int[] resultArray = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {
			prod = prod * arr[i];
			rightArray[i] = prod;
		}

		prod = 1;

		for (int i = 0; i < arr.length - 1; i++) {
			int leftProd = prod;
			int rightProd= rightArray[i+1];
			resultArray[i] = leftProd * rightProd;
			prod = prod * arr[i];
		}

		resultArray[arr.length - 1] = prod;

		return resultArray;

	}

	public static void main(String[] args) {

		int[] result = productExceptSelf(new int[] { 1, 2, 3, 2, 5, 4 });
		System.out.println(Arrays.toString(result));
	}

}
