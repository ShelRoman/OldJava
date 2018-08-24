package week7.lesson13;

public class Engine implements Cloneable {
	private String nomer;

	@Override
	public Engine clone() throws CloneNotSupportedException {
		Engine engine1 = (Engine) super.clone();
		return engine1;

	}

	public Engine(String nomer) {
		this.setNomer(nomer);
	}

	public String getNomer() {
		return nomer;
	}

	public void setNomer(String nomer) {
		this.nomer = nomer;
	}
}
