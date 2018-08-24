package week7.lesson13;

public class CarCloneExmple {

	public static void main(String[] args) throws CloneNotSupportedException {
		Car car1 = new Car("AA2222AA", new Engine("AZX22-31"));
		Car car2 = car1.clone();
		System.out.println(car1.getEngine());
		System.out.println(car2.getEngine());
	}

}


//public class CarCloneableExmple {
//	 public static void main(String[] args) throws CloneNotSupportedException {
//	  Engine eng1 = new Engine("FF 345");
//	  Car car1 = new Car("AA 123", eng1);
//	  Car car2 = car1.clone();
//
//	  if (car1.getEngine() == car2.getEngine())
//	   System.out.println("Один на двоих");
//	  else
//	   System.out.println("Обычные два авто");
//
//	 }
//	}
//
//	class Car implements Cloneable {
//	 private String number;
//	 private Engine engine;
//
//	 @Override
//	 public Car clone() throws CloneNotSupportedException {
//	  Car car = (Car) super.clone();
//	  Engine eng = car.getEngine().clone();
//	  car.setEngine(eng);
//	  return car;
//
//	 }
//
//	 public String getNumber() {
//	  return number;
//	 }
//
//	 public void setNumber(String number) {
//	  this.number = number;
//	 }
//
//	 public Engine getEngine() {
//	  return engine;
//	 }
//
//	 public void setEngine(Engine engine) {
//	  this.engine = engine;
//	 }
//
//	 public Car(String number, Engine engine) {
//	  this.number = number;
//	  this.engine = engine;
//	 }
//
//	 public Car() {
//	 }
//	 public Car(Car car){
//	  number = car.getNumber();
//	  engine = car.getEngine();
//	 }
//	 public Car copy(){
//	  Car car = new Car(this);
//	  Engine eng = new Engine();
//	  eng.setNumber(this.getEngine().getNumber());
//	  car.setEngine(eng);
//	  return car;
//	 }
//
//	}
//
//	class Engine implements Cloneable {
//	 String number;
//
//	 @Override
//	 public Engine clone() throws CloneNotSupportedException {
//	  Engine engine = (Engine) super.clone();
//	  return engine;
//
//	 }
//
//	 public String getNumber() {
//	  return number;
//	 }
//
//	 public void setNumber(String number) {
//	  this.number = number;
//	 }
//
//	 public Engine() {
//	 }
//
//	 public Engine(String num) {
//	  number = num;
//	 }
//
//	}

/*public class CarCloneExmple {
public static void main(String[] args) throws CloneNotSupportedException {
Car car1 = new Car("AA 111");
Car car2 = car1.clone();
System.out.println("номер двигла авто1="+car1.getEngine());
System.out.println("номер двигла авто2="+car2.getEngine());
if(car1.getEngine() == car2.getEngine())System.out.println("двигатель один на двоих"); 
  else System.out.println("двигатели разные");
//
car1.getEngine().setNomer("Efe");;
System.out.println("номер двигла авто1="+car1.getEngine());
System.out.println("номер двигла авто2="+car2.getEngine());

}
}*/