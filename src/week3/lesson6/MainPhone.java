/* MainPhone(������ ���������)
�������� ���� ��������� � �������� ������� ���� � ������.(Nokia, Samsung, IPhone4, IPhone5)
� ������� ������� 2 (�������)������ �������� � ������� ������ call  � ������ ����� �� ������.
��� ���� ��������� �� ������ ������� ����� printModel.
����� ��� ���� ���������, ��� ������� �������� ������� ����� printAppleId. */

package week3.lesson6;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPhone {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Phone> phones = new ArrayList<>();
		phones.add(new IPhone4("555-55-55", true, 5, 1111));
		phones.add(new Samsung("666-66-66", true, 4));
		phones.add(new IPhone5("222-22-22", true, 5, 1112));
		phones.add(new Nokia("333-33-33", false, 4));
		phones.add(new IPhone5("444-44-44", true, 5, 1113));

		for (int i = 0; i < phones.size(); i++) {
			phones.get(i).printModel();
		}

		for (int i = 0; i < phones.size(); i++) {
			if (phones.get(i) instanceof IPhone) {
				((IPhone) (phones.get(i))).printAppleId();
			}

		}

		int k = scan.nextInt();
		int b = scan.nextInt();
		phones.get(k).call(phones.get(b));
	}

}
