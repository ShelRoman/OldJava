//Task 2. �������� �����, ������� ����� ������� � ���� ������ ����� ����� ������ (int, long etc.). 
//����������� �����, ������� ���������� ����� ������� ������� �� �������.
package week5.lesson10;

public class Task2 <T> {
	T[] vect;
	
	public Task2 (T[] list) {
		vect = list;
	}
	
	public T getValue (int index) {
		return this.vect[index];
	}
	
}
	

