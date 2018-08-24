package week4.lesson7;

public abstract class AbstractTable implements Tablable {
	private boolean dry;

	public boolean isDry() {
		return dry;
	}

	public void setDry(boolean dry) {
		this.dry = dry;
	}
	
}
