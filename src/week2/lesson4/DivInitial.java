package week2.lesson4;

public class DivInitial {
	{
		System.out.println("Блок инициализации");
	}
	static {
		System.out.println("static Блок инициализации");
	}
	public DivInitial() {
		System.out.println("Конструктор");
	}
}
