package week5.lesson10;

public class MainAnimal {

	public static <T> void main(String[] args) {
		Animal<T> leo = new Animal<T>("Leo");
		Animal<T> cat = new Animal<T>("Cat");
		Animal<T> dog = new Animal<T>("Dog");
		leo.say();
		cat.say();
		dog.say();
	}

}
