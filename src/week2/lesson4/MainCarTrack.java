package week2.lesson4;

public class MainCarTrack {

	public static void main(String[] args) {
		Car car1 = new Car("AA 2122 AA", "red");
		Car car2 = new Car("AA 1111 AA", "black");
		Track track1 = new Track("x1");
		Track track2 = new Track("y1");
		car1.setTrack(track1);
		car1.setTrack(track2);
		car1.unSetTrack();
		car1.setTrack(track2);
		track2.printAboutMe();
		car1.printAboutMe();
		car2.setTrack(track2);
		car1.start();
		car1.move();
	}

}
