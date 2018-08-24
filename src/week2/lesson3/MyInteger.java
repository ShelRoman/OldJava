package week2.lesson3;

public class MyInteger {
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public MyInteger(int number) {
		this.setValue(number);
	}
	
	public MyInteger plus(MyInteger myInt) {
		return new MyInteger(this.getValue() + myInt.getValue());
	}
}
//done