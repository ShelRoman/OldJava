// ������� ����� ������� �� ������ ������ �����.
// ������ Plane � Wing.
// ������� ������ �����:
// - �������� (��� �������� ���� � ����� ������� ���������� ������� ��� ������, ������� �������� ��� ������, ����� void takeoff())
// - �������� ������� (������� ������� �� ������������������ ���������, ����� void selectRoute(int[][] coordinates))
// - ������� �� ����� �������, ����� void printRoute()

package week3.homework;

public class Wing {
	private boolean fuel;

	public boolean getFuel() {
		return fuel;
	}

	public void setFuel(boolean fuel) {
		this.fuel = fuel;
	}

	
	public class Plane extends Wing {
		private Wing leftWing;
		private Wing rightWing;
		private boolean fly;
		private int[][] currentRoute;

		public void setCurrentRoute(int[][] route) {
			this.currentRoute = route;
		}

		public boolean isFly() {
			return fly;
		}

		public void setFly(boolean fly) {
			this.fly = fly;
		}

		public void takeoff() {
			if (isFly()) {
				System.out.println("Can't take off, coz already flying");
			} else {
				if (leftWing.getFuel() & rightWing.getFuel()) {
					System.out.println("Taking off");
					this.setFly(true);
				} else {
					System.out.println("Not enough fuel, get some");
				}
			}
		}

		public void selectRoute(int[][] coordinates) {
			this.setCurrentRoute(coordinates);
		}

		public void printRoute() {
			System.out.println(this.currentRoute);
		}

	}
}
