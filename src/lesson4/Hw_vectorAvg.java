/*�������� ����� � �������, ������������ ������� �������������� �������� ��� ���� ��������� �������
� ������, ���� ������ ������� ������������, �������� ��������� "�������� ������ �������"
�����: int calcVectorAvg(int[] vector)
������:
 calcVectorAvg(int[] vector); // [1234567]
 14*/
package lesson4;

public class Hw_vectorAvg {

	public static void main(String[] args) {
		int[] vector = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(calcVectorAvg(vector));
	}

	public static int calcVectorAvg(int[] vector) {
		int res = 0;
		if (vector.length <= 0) {
			System.out.println("�������� ������ �������");
		} else {
			for (int i = 0; i < vector.length; i++) {
				res = res + vector[i];
			}
			res = res / vector.length;

		}
		return res;
	}
}
//done
