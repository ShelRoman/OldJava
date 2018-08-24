package week5.lesson10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;

import week5.lesson10.Product.wrongDateException;
import week5.lesson10.Product.wrongPriceException;


public class MainProduct {

	public static void main(String[] args) throws wrongPriceException, wrongDateException {
		
		ArrayList<Product> products = new ArrayList<>();
		products.add(new Product(15.33, "Carrot", new GregorianCalendar (2014, 00, 20)));
		products.add(new Product(15.33, "Carrot", new GregorianCalendar (2015, 00, 20)));
		products.add(new Product(13.00, "Tomato", new GregorianCalendar (2015, 01, 20)));
		products.add(new Product(11.27, "Apple", new GregorianCalendar (2015, 02, 25)));
		products.add(new Product(25.13, "Pineapple", new GregorianCalendar (2015, 02, 17)));
		products.add(new Product(5.00, "Potato", new GregorianCalendar (2015, 00, 11)));
		products.add(new Product(8.68, "Cucumber", new GregorianCalendar (2015, 01, 20)));
		products.add(new Product(12.22, "Pear", new GregorianCalendar (2015, 02, 30)));
		products.add(new Product(12.01, "Pumpkin", new GregorianCalendar (2015, 00, 31)));
		products.add(new Product(3.22, "Onion", new GregorianCalendar (2015, 03, 21)));
		products.add(new Product(99.99, "Salmon", new GregorianCalendar (2015, 04, 27)));
		printArray(products);
		Collections.sort(products);
		System.out.println("------------------------");
		printArray(products);
	
	}
	
	public static void printArray(ArrayList<Product> array) {
		for (int i = 0; i < array.size(); i++) {
			array.get(i).printProduct();
		}
	}

}
