//Task 3. �������� ����� ��������, ��� ��� ��������� Animal ���������� ����������. 
// ��� ������ ����������� ����� say(������� �� ����� ���������):
// ����� Cat ������� "���"
// ������ Dog ������� "���"
// ��� Leo ������� "����
package week5.lesson10;

public class Animal <T> {
	private T type;
	
	public Animal (String string) {
		this.setType(string);
	}
	
	@SuppressWarnings("hiding")
	public <T> void say() {
		if (this.getType().toString().equals("Cat")) {
			System.out.println("Meow");
		} else if (this.getType().toString().equals("Dog")) {
			System.out.println("Bark");
		} else if (this.getType().toString().equals("Leo")) {
			System.out.println("Wraaagghh");
		}
	}

	public T getType() {
		return type;
	}
	

	@SuppressWarnings("unchecked")
	public void setType(String string) {
		this.type = (T) string;
	}
	
}
	