//package week7.lesson13;
//
//public class Cheburashka {
//
//}
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.io.Serializable;
//
//import week7.lesson14.Product;
//
//public class Kindergarten {
// public static void main(String[] args) {
//  Friend gena = new Friend("Gena");
//  Friend shpokl = new Friend("Shapoklyak");
//  Cheburashka finderFriends = new Cheburashka();
//  finderFriends.setName("Cheburashka");
//  finderFriends.setMainFriend(gena);
//  finderFriends.setFriend(shpokl);
//  System.out.println(finderFriends.toString());
//  serToFile(finderFriends);
//  Cheburashka obj = serFromFile();
//  System.out.println(obj.toString());
// }
//
// public static void serToFile(Cheburashka obj) {
//  try (FileOutputStream fos = new FileOutputStream("cheburashka.out");
//    ObjectOutputStream oos = new ObjectOutputStream(fos);) {
//   oos.writeObject(obj);
//  } catch (IOException e) {
//   e.printStackTrace();
//  }
// }
// public static Cheburashka serFromFile() {
//  Cheburashka objRet = null;
//  try (FileInputStream fis = new FileInputStream("cheburashka.out");
//    ObjectInputStream oin = new ObjectInputStream(fis);) {
//    try {
//     objRet = (Cheburashka) oin.readObject();
//    } catch (ClassNotFoundException e) {
//     e.printStackTrace();
//    }
//   } catch (IOException e) {
//    e.printStackTrace();
//   }
//  return objRet;
//
// }
//
//}
//
//class Cheburashka implements Serializable {
// private String name = "Cheburashka";
// private transient Friend mainFriend;
// private Friend friend;
//
// @Override
// public String toString() {
//  return "Cheburashka [name=" + name + ", mainFriend=" + mainFriend
//    + ", friend=" + friend + "]";
// }
//
// public String getName() {
//  return name;
// }
//
// public void setName(String name) {
//  this.name = name;
// }
//
// public Friend getMainFriend() {
//  return mainFriend;
// }
//
// public void setMainFriend(Friend mainFriend) {
//  this.mainFriend = mainFriend;
// }
//
// public Friend getFriend() {
//  return friend;
// }
//
// public void setFriend(Friend friend) {
//  this.friend = friend;
// }
//
//}
//
//class Friend implements Serializable {
// private String name;
//
// @Override
// public String toString() {
//  return "Friend [name=" + name + "]";
// }
//
// public Friend(String name) {
//  super();
//  this.name = name;
// }
//
// public String getName() {
//  return name;
// }
//
// public void setName(String name) {
//  this.name = name;
// }
//}