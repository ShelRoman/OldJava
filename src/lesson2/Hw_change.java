package lesson2;

public class Hw_change {

	public static void main(String[] args) {
		byte typeByte = 5;
		float typeFloat = 3;
		System.out.println(typeByte + " " + (int) typeFloat);
		typeByte = (byte) (typeFloat + typeByte);
		typeFloat = (float) (typeByte - typeFloat);
		typeByte = (byte) (typeByte - typeFloat);
		System.out.print(typeByte + " " + (int) typeFloat);
	}

}
