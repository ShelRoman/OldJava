package week3.lesson5;

public class A {

	public A() {
		System.out.println("Конструктор папа");
	}

	{
		System.out.println("Блок инициализации папа");
	}
	static {
		System.out.println("static Блок инициализации папа");
	}

}
