/*�������� ����� � ������� �������� ������� �� ���������, ������ ����� ������, � ���������� � ����� � �������� ���������. ��������:
� ������, ���� �������� ������ ����� ������������ ��������, �������� ���������, ��������: �������� �������� ������
�����: void drawStair(int height)
������:
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
			System.out.println("�������� �������� ������");
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