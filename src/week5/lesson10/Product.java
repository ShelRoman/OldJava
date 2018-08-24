/*Task1. �������� ����� Product � �������� ���� ����:
name,price, ���� �������.
� ����������� ����������� �� ������������.
����� ������� ��������� �� �����: �������� ���� ����
����������� ����������� ������������� ������:
 - �� ���� 
 - �� ���� �������
� mainProduct:
������� 10 ���������.
� ������ ����� ������� � ������ �����.
������� ������ ��� ����������
������������� ������ � ������� �� �����
������������� ������ �� ���� � ������� �� �����
������������� ������ �� ���� ������� � ������� �� �����*/
package week5.lesson10;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Product implements Comparable<Product> {
	private double price;
	private String name;
	private GregorianCalendar date;
	Exception wrongPriceException;

	public Product(double price, String name, GregorianCalendar date)
			throws wrongPriceException, wrongDateException {
		this.setPrice(price);
		this.setName(name);
		this.setDate(date);
	}

	public void printProduct() {
		System.out.print(this.getName() + " " + this.getPrice() + " "
				+ this.getDate());
		System.out.println();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price)
			throws wrongPriceException {
		if (Double.toString(price).charAt(0) == '-') {
			throw new wrongPriceException("Price can't be with -");
		}
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		SimpleDateFormat date1 = new SimpleDateFormat("yyyy/MM/dd");
		return date1.format(this.date.getTime());
	}

	public void setDate(GregorianCalendar date) throws wrongDateException {
		if (date.before(new GregorianCalendar (2015, 00, 01))) {
			throw new wrongDateException("Product can't be older than 2015");
		}
		this.date = date;
	}

	@Override
	public int compareTo(Product prod) {
		return this.getName().compareTo(prod.getName());
	}

	@SuppressWarnings("serial")
	public class wrongPriceException extends Exception {
		public wrongPriceException(String message) {
			super(message);
		}

		@Override
		public String getMessage() {
			return super.getMessage();
		}
	}
	
	@SuppressWarnings("serial")
	public class wrongDateException extends Exception {
		public wrongDateException(String message) {
			super(message);
		}

		@Override
		public String getMessage() {
			return super.getMessage();
		}
	}
}
