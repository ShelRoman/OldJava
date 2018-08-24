/* Написать класс число (hw2.Number), выполняющий следующие операции:
 - получение примитива (метод int get())
 - сложение (метод Number add(Number num))
 - вычитание (метод Number sub(Number num))
 - умножение (метод Number mul(Number num))
 - деление (метод Number div(Number num))
 - возведение в степень (метод Number pow(Number exponent))
 - вычисление факториала (метод Number fact())
 - вычисление остатка от деления (метод Number mod(Number num)) */
package week2.homework;

public class Number {
	private int value;

	public Number(int value) {
		this.value = value;
	}

	public int get() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Number add(Number num) {
		return new Number(this.get() + num.get());
	}

	public Number sub(Number num) {
		return new Number(this.get() - num.get());
	}

	public Number mul(Number num) {
		return new Number(this.get() * num.get());
	}

	public Number div(Number num) {
		return new Number(this.get() / num.get());
	}

	public Number pow(Number exponent) {
		return new Number((int) Math.pow(this.get(), exponent.get()));
	}
	
	public Number fact() {
		int result = 1;
		for (int i = 1; i <= this.get(); i++ ) {
			result = result * i;
		}
		return new Number(result);
	}
	
	public Number mod(Number num) {
		return new Number(this.get() % num.get());
	}
}
