/*�������� ����� ��������� �������� ������� �� ����� � �������� �������.
 � ������, ���� ������ ������� ������������, �������� ��������� "�������� ������ �������"
 �����: void revertVector(int[] vector)
 ������:
  revertVector(int[] vector); // [1, 2, 3, 4, 5, 6, 7]
  [7, 6, 5, 4, 3, 2, 1]*/
package lesson4;

public class Hw_revertVector {
	
	public static void main(String[] args) {
		int[] vect = {1,2,5,6,7,8,12};
		revertVector(vect);
	}
	
	public static void revertVector(int[] vector) {
		if (vector.length < 1) {
			System.out.println("�������� ������ �������");
		} else {
			System.out.print("[");
			for (int i = vector.length - 1; i > 0; i--) {
				System.out.print(vector[i] + ", ");
			}
			System.out.print(vector[0] + "]");
		}
	}

}
//done