/* В MainCar: 
  - создать 3 авто
  - все 3 авто завести
  - 2 авто поехали
  - все 3 авто остановить */
package week2.lesson4;

public class MainCar {

	public static void main(String[] args) {
		Car car1 = new Car("AA 1089 CB", "red");
		Car car2 = new Car("AA 1011 CB", "green");
		Car car3 = new Car("AA 2222 CB", "green");
		car1.rePaint("brown");
		car1.start();
		car2.start();
		car3.start();
		car1.move();
		car2.move();
		car1.stop();
		car2.stop();
		car3.stop();
	}

}
// done