package week5.homework;

public class BinarySearcher {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
				17 };
		BinarySearcher search = new BinarySearcher();
		System.out.println(search.binarySearch(array, 5));
	}

	public int binarySearch(int[] vector, int elements) {
		int min = vector[0];
		int max = vector.length - 1;
		while (min <= max) {
			int mid = min + (max - min) / 2;
			if (elements < vector[mid]) {
				max = mid - 1;
			} else if (elements > vector[mid]) {
				min = mid + 1;
			} else
				return mid;
		}
		return -1;
	}
}
