package week3.lesson5;

public class MainFigure {

	public static void main(String[] args) {
		Square kvadratik = new Square(5);
		Triangle treugolnik = new Triangle(4, 5);
		Rectangle pryamougolnik = new Rectangle(5, 4);
		System.out.println(kvadratik.getPerimetr());
		System.out.println(kvadratik.getSquare());
		System.out.println(treugolnik.getPerimetr());
		System.out.println(treugolnik.getSquare());
		System.out.println(pryamougolnik.getPerimetr());
		System.out.println(pryamougolnik.getSquare());
	}

}
