/*Задача Телефон: 
 создать класс Phone с полями:
 static Phone[] numbers, String myNumber
 при создании нового объекта-телефона, он вносится в базу номеров numbers. 
 c методами: 
 - isNumberExist(String number) - проверяет наличие телефона в базе
 - call(String number) - выводит на экран "телефон такой-то звонит такому-то"
 - sendSms(String number, String text) - выводит на экран сообщение и кому адрессовано
 
Ограничение в 10 телефонов.*/
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
		System.out.println("Телефон с номером " + a + " звонит на номер "
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
		System.out.println("Отправлено с номера " + a + " на номер " + number);
	}

	public void setMyNumber(String myNumber) {
		this.myNumber = myNumber;
	}

	public String getMyNumber() {
		return myNumber;
	}

	public Phone(String myNumber) {
		if (numbers[numbers.length - 1] != null) {
			System.out.println("База переполнена");
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
				System.out.println("Номер уже есть в базе");
			}
		}

	}

}
//done