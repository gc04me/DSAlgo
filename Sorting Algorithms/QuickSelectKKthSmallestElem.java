package sorting;

public class QuickSelectKKthSmallestElem {

	private static int kThSmallestElem(int[] arr, int K) {

		return kThElem(arr, 0, arr.length - 1, K);

	}

	private static int kThElem(int[] arr, int low, int high, int K) {                                             

		int pivot = arr[high];
		int partitionIndex = partitionArray(arr, pivot, low, high);

		if (K > partitionIndex) {
			return kThElem(arr, partitionIndex + 1, high, K);
		} else if (K < partitionIndex) {
			return kThElem(arr, low, partitionIndex - 1, K);
		} else {
			return pivot;
		}

	}

	// this partition the array and return the partition index
	public static int partitionArray(int[] arr, int pivot, int low, int high) {

		int i = low;
		int j = low;

		while (i <= high) {
			if (arr[i] <= pivot) {
				swap(arr, i, j);
				i++;
				j++;
			} else {
				i++;
			}
		}

		return j - 1; // index of pivot

	}

	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		System.out.println(kThSmallestElem(new int[] { 2, 5, 1, 3, 7, 6, 4, 8 }, 3));
	}

}
