package lesson4;

public class Task9 {
	public static void main(String[] args) {
		int[] vector = new int[15];
		System.out.println(vector);
		System.out.println(vector[0] + ", " + vector[1] + ", " + vector[2]);
		fillVector(vector);
		System.out.println(vector[0] + ", " + vector[1] + ", " + vector[2]);
	}

	public static void fillVector(int[] vect) {
		vect[0] = 10;
		vect[1] = 20;
		System.out.println(vect);
		System.out.println("l=" + vect.length);
	}
}
//done