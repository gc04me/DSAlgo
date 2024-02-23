package dp;

public class ClimbingStairs {

	private static int climbStairsCount(int n) {

		int[] qb = new int[n + 1];

		return getPathCount(n, qb);
	}

	private static int getPathCount(int n, int[] qb) {

		if (n == 0) {
			return 1;
		} 
		else if (n < 0) {
			return 0;
		}
		
		if (qb[n] > 0) {
			return qb[n];
		}

		int step1 = getPathCount(n - 1, qb);
		int step2 = getPathCount(n - 2, qb);
		int step3 = getPathCount(n - 3, qb);

		int totalCount = step1 + step2 + step3;
		qb[n] = totalCount;
		return totalCount;
	}

	public static void main(String[] args) {

		System.out.println(climbStairsCount(10));

	}

}
