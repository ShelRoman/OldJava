package week2.lesson4;

public class MainAutoSalon {

	public static void main(String[] args) {
		AutoSalon salonPetrovka = new AutoSalon();
		salonPetrovka.addCar(new Car("AA 1233 AA", "Brown"));
		salonPetrovka.start();
		
	}

}
