/* � MainCar: 
  - ������� 3 ����
  - ��� 3 ���� �������
  - 2 ���� �������
  - ��� 3 ���� ���������� */
package week1.lesson2;

public class MainCar {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		car1.number = "AA 1089 CB";
		car1.color = "red";
		car2.number = "AA 1011 CC";
		car2.color = "green";
		car3.number = "AA 2012 CB";
		car3.color = "blue";
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