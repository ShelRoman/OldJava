//Создать класс Рыба на основе класса "Продукт в супермаркете".
//Классы Fish и Product.
//Рыба должна уметь:
//- Вывести свою цену, метод void printPrice()
//- Вывести срок хранения, метод void printStoragePeriod()
//- Проплыть, метод void swim()
//- Проглотить другую рыбу, метод void cannibalism(Fish fish)
//- Вывести свой штрихкод и цену, метод void printBarAndPrice()
package week3.homework;

public class Product {
	public class Fish extends Product {
		private double price;
		private int storagePeriod;
		private int barCode;

		public void printPrice() {
			System.out.println(this.getPrice());
		}

		public void printStoragePeriod() {
			System.out.println(this.getStoragePeriod());
		}

		public void swim() {
			System.out.println("Fish swims");
		}

		public void cannibalism(Fish fish) {
			System.out.println("Fish eats fish");
		}

		public void printBarAndPrice() {
			System.out.println(this.getPrice());
			System.out.println(this.getBarCode());
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public int getStoragePeriod() {
			return storagePeriod;
		}

		public void setStoragePeriod(int storagePeriod) {
			this.storagePeriod = storagePeriod;
		}

		public int getBarCode() {
			return barCode;
		}

		public void setBarCode(int barCode) {
			this.barCode = barCode;
		}

	}
}
