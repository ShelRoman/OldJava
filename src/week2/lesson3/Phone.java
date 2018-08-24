/*������ �������: 
 ������� ����� Phone � ������:
 static Phone[] numbers, String myNumber
 ��� �������� ������ �������-��������, �� �������� � ���� ������� numbers. 
 c ��������: 
 - isNumberExist(String number) - ��������� ������� �������� � ����
 - call(String number) - ������� �� ����� "������� �����-�� ������ ������-��"
 - sendSms(String number, String text) - ������� �� ����� ��������� � ���� �����������
 
����������� � 10 ���������.*/
package week2.lesson3;

public class Phone {
	static Phone[] numbers = new Phone[10];
	private String myNumber;

	public boolean isNumberExist(String number) {
		for (int i = 0; i < numbers.length; i++) {
			if (Phone.numbers[i] != null) {
				if (Phone.numbers[i].myNumber.equals(number)) {
					return true;
				}
			}
		}
		return false;
	}

	public void call(String number) {
		int index = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == this) {
				index = i;
			}
		}
		String a = numbers[index].getMyNumber();
		System.out.println("������� � ������� " + a + " ������ �� ����� "
				+ number);

	}

	public void sendSms(String number, String text) {
		int index = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == this) {
				index = i;
			}
		}
		String a = numbers[index].getMyNumber();
		System.out.println(text);
		System.out.println("���������� � ������ " + a + " �� ����� " + number);
	}

	public void setMyNumber(String myNumber) {
		this.myNumber = myNumber;
	}

	public String getMyNumber() {
		return myNumber;
	}

	public Phone(String myNumber) {
		if (numbers[numbers.length - 1] != null) {
			System.out.println("���� �����������");
		} else {
			if (!isNumberExist(myNumber)) {
				for (int i = 0; i < numbers.length; i++) {
					if (numbers[i] == null) {
						this.setMyNumber(myNumber);
						numbers[i] = this;
						break;
					}
				}
			} else {
				System.out.println("����� ��� ���� � ����");
			}
		}

	}

}
//done