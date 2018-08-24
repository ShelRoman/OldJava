package week1.homework;

public class BoxOnTheShelf {

	public static void main(String[] args) {
		System.out.println(isContains(1, 2, 3, 4));
	}

	public static boolean isContains(int boxWidth, int boxHeight, int shelfWidth, int shelfHeight) {
		return (boxWidth < shelfWidth && boxHeight < shelfHeight);

	}

}
// done