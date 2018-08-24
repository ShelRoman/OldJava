package week5.lesson10;

public class Swap {
	public static <T> void swap(T[] a, int x, int y) {
		T temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

	public static void main(String[] args) {
		String[] a1 = new String[10];
		Swap.<String> swap(a1, 1, 2);

		Integer[] a2 = new Integer[10];
		Swap.<Integer> swap(a2, 1, 2);

	}
}
