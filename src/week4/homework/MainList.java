package week4.homework;

public class MainList {

	public static void main(String[] args) {
		LinkList list1 = new LinkList();
		LinkList list2 = new LinkList();
		list1.addNode(101);
		list1.addNode(102);
		list1.addNode(103);
		list1.addNode(104);
		list2.addNode(201);
		list2.addNode(202);
		list2.addNode(203);
		list2.addNode(204);
		list1.concat(list2);
		list1.printList();
	}

}
