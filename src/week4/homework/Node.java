package week4.homework;

@SuppressWarnings("rawtypes")

public class Node implements Comparable {
	int element;
	Node next;
	
	
	public Node(int element, Node next) {
		this.element = element;
		this.next = next;
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
