/* Task5. � main ������� � ������� ��� �����, (�������� k � n) � �������� ������ f.
 � ������ f ������� ����� �� k �� n, ��� ���� ������������������ ����� ���� ������������ ��� ���������. */
package lesson3;
import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	System.out.println("������� 2 �����");
	int k = scan.nextInt();
	int n = scan.nextInt();
	f(k, n);
	}
		
	public static void f(int k, int n) {
		if(k > n) {
			while(k >= n) {
				System.out.print(k + ", ");
				k--;
			}
		}
		else if(k < n) {
			while(k <= n) {
				System.out.print(k + ", ");
				k++;
			}
		}
		else {
			System.out.println("����� �����");
		}
	
	}
}

//done