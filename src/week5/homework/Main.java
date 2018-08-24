package week5.homework;

public class Main {
	
	public static void main(String[] args) {
		DoublyLinkList list1 = new DoublyLinkList();
		list1.addFirst(22);
		list1.addFirst(23);
		list1.addLast(12);		
		list1.addFirst(24);
		list1.addFirst(25);
		list1.addFirst(26);
		list1.addLast(11);
		list1.addFirst(27);
		list1.printRevert();
	}
}
