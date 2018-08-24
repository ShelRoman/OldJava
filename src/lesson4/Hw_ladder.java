/*Ќаписать класс с методом рисующий лесенку из звездочек, высота равна ширине, и передаетс€ в метод в качестве параметра. например:
¬ случае, если значение высоты имеет неправильное значение, выводить сообщение, например: Ќеверное значение высоты
ћетод: void drawStair(int height)
ѕример:
 drawStair(4)
 *
 **
 ***
 ****/
package lesson4;

public class Hw_ladder {

	public static void main(String[] args) {
		drawStair(3);

	}

	public static void drawStair(int height) {
		if (height < 1) {
			System.out.println("Ќеверное значение высоты");
		} else {
			for (int i = height; i >= 0; i--) {
				for (int j = i+1; j <= height; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

}
//done