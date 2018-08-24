/* Написать класс телефонов.
 Phone(String number, boolean camera, int sideSize)
 Nokia, Samsung
 IPhone(int appleId),IPhone4, IPhone5
 Что умеют делать:
  - call(Phone ph)
  - printModel()
  - printAppleId()// для айфонов
*/
package week3.lesson6;

public abstract class Phone {
	private String number;
	private boolean camera;
	private int sideSize;
	
	public Phone(String number, boolean camera, int sideSize) {
		this.setNumber(number);
		this.setCamera(camera);
		this.setSideSize(sideSize);
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public boolean isCamera() {
		return camera;
	}

	public void setCamera(boolean camera) {
		this.camera = camera;
	}

	public int getSideSize() {
		return sideSize;
	}

	public void setSideSize(int sideSize) {
		this.sideSize = sideSize;
	}
	
	public void call(Phone ph) {
		System.out.println("Phone number " + this.getNumber() + " calls to " + ph.getNumber());
	}
	
	public void printModel() {
		System.out.println(this.getClass().getSimpleName());
	}
}
