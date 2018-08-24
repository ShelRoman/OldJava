package week3.lesson6;

public abstract class IPhone extends Phone {
	private int appleId;
	
	public IPhone(String number, boolean camera, int sideSize, int appleId) {
		super(number, camera, sideSize);
		this.setAppleId(appleId);
	}
	
	public void printAppleId() {
		System.out.println(this.getAppleId());
	}

	public int getAppleId() {
		return appleId;
	}

	public void setAppleId(int appleId) {
		this.appleId = appleId;
	}
	
}
