package week7.lesson13;

public class Car implements Cloneable {
	private String nomer;
	private Engine engine;

	@Override
	public Car clone() throws CloneNotSupportedException {
		Car car1 = (Car) super.clone();
		car1.engine = (Engine) engine.clone();
		return car1;

	}
	public Car (String nomer, Engine engine) {
		this.nomer = nomer;
		this.engine = engine;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public String getNomer() {
		return nomer;
	}
	public void setNomer(String nomer) {
		this.nomer = nomer;
	}
}
