package dp;

public class CountBinaryString {

	private static int countBinaryString(int n) {                                                 

		int endsAtZero = 1;
		int endsAtOne = 1;

		for (int i = 1; i < n; i++) {
			int newEndsAtZero = endsAtOne;
			int newEndsAtOne = endsAtZero + endsAtOne;

			endsAtZero = newEndsAtZero;
			endsAtOne = newEndsAtOne;
		}

		return endsAtZero + endsAtOne;
	}

	public static void main(String[] args) {

		System.out.println(countBinaryString(4));
	}

}
