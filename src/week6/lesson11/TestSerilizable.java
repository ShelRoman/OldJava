package week6.lesson11;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("unused")
public class TestSerilizable {
 @SuppressWarnings("resource")
public static void main(String[] args) throws ClassNotFoundException, IOException {

  Product pr1 = new Product("Колбаса");

  // запись
  FileOutputStream fos = new FileOutputStream("temp.out");
  ObjectOutputStream oos = new ObjectOutputStream(fos);
  oos.writeObject(pr1);

  oos.close();

  // чтение
  Product pr2;
  FileInputStream fis = new FileInputStream("temp.out");
  ObjectInputStream oin = new ObjectInputStream(fis);
  pr2 = (Product) oin.readObject();
  System.out.println(pr2);

 }

}

class Product implements Serializable {

 private static final long serialVersionUID = 1L;
 private String name;

 public Product(String n) {
  name = n;
 }

 public String toString() {
  return name;
 }
}