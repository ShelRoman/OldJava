//Создать класс Кошка на основе класса Животное.
//Классы Cat и Animal.
//Кошка должна уметь:
//- Вывести на экран имя, метод void printName()
//- Подать голос, метод void say()
//- Поднимать шерсть дыбом, метод void riseHair()
//- Питаться, метод void eat()
//- Орать если ненаелась, метод void yellIfNotGorged()

package week3.homework;

public class Animal {

	public class Cat extends Animal {
		private String name;
		private boolean hairStatus;
		private boolean hungry;

		
		public void printName() {
			System.out.println("Cat's name is " + this.getName());
		}
		
		public void say() {
			System.out.println("Meow-meow");
		}
		
		public void riseHair() {
			if (!hairStatus) {
				System.out.println(this.getName() + " rises hair");
				this.setHairStatus(true);
			} else {
				System.out.println(this.getName() + " has already rised hair");
			}
		}
		
		public void yellIfNotGorged() {
			System.out.println(this.getName() + " is crying loudly, wants more food");
		}
		
		public void eat() {
			if (!hungry) {
				System.out.println(this.getName() + " isn't hungry");
			} else {
				int food = (int) (2 * Math.random());
				if (food == 1) {
					System.out.println(this.getName() + " has eaten enough");
					this.setHungry(false);
				} else {
					this.yellIfNotGorged();
				}
			}
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public boolean isHairStatus() {
			return hairStatus;
		}

		public void setHairStatus(boolean hairStatus) {
			this.hairStatus = hairStatus;
		}

		public boolean isHungry() {
			return hungry;
		}

		public void setHungry(boolean hungry) {
			this.hungry = hungry;
		}

	}

}
