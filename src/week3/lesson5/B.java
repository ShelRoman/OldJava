package week3.lesson5;

public class B extends A {

	public B() {
		System.out.println("Конструктор сынок");
	}

	{
		System.out.println("Блок инициализации сынок");
	}
	static {
		System.out.println("static Блок инициализации сынок");
	}

}
