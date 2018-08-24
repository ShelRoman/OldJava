/*Hаписать класс LinkList, содержащий элементы типа int, реалзизующем связанный список с классом элемента Node.
Для класса LinkList написать методы:

1. Замена значения элемента по индексу, метод void set(int index, int element)
2. Удаление элемента по индексу, метод void remove(int index)
3. Поиск элемента по значению, метод int indexOf(int element)
4. Поменять местами первый и последний элементы, метод void swapFirstLast()
5. Перестроить элементы в списке в обратном порядке, метод void revert()
6. Поменять местами наибольший и наименьший элементы, в случае если реализован интерфейс Comparable, метод void swapMaxMin()
7. Частично упорядочить элементы списка, в случае если реализован интерфейс Comparable, метод void sortPartial(int index)
8. Сравнение двух списков, метод boolean equals(LinkList list)
9. Сложение двух списков, метод LinkList concat(LinkList list)
10*. Отсортировать список, в случае если реализован интерфейс Comparable, метод void sort()
11*. Удалить повторяющиеся элементы из списка, в случае если реализован интерфейс Comparable, метод void removeDuplicates()
 */
package week4.homework;

public class LinkList {
	int nodeCount;
	Node tail;

	public void addNode(int value) {
		this.tail = new Node(value, tail);
		nodeCount++;
	}

	public void printList() {
		Node cursor = tail;
		while (cursor.next != null) {
			System.out.println(cursor.element);
			cursor = cursor.next;
		}
		System.out.println(cursor.element);
	}

	public void set(int index, int element) {
		if (this.nodeCount - 1 < index) {
			System.out.println("Index is out of range");
		} else {
			Node cursor = tail;
			int i = 0;
			while (i != index) {
				cursor = cursor.next;
				i++;
			}
			cursor.element = element;
		}
	}

	public void remove(int index) {
		if (this.nodeCount - 1 < index || index < 0) {
			System.out.println("Index is out of range");
		} else if (index == 0) {
			if (tail.next != null) {
				tail = tail.next;
				nodeCount--;
			} else {
				tail = null;
				nodeCount--;
			}
		} else {
			int i = 1;
			Node cursor = tail;
			while (i != index) {
				cursor = cursor.next;
				i++;
			}
			if (index == nodeCount - 1) {
				cursor.next = null;
				nodeCount--;
			} else {
				cursor.next = cursor.next.next;
				nodeCount--;
			}

		}
	}

	public int indexOf(int element) {
		int i = 0;
		Node cursor = tail;
		while (i != nodeCount) {
			if (cursor.element == element) {
				return i;
			}
			cursor = cursor.next;
			i++;
		}
		return -1;
	}

	public void swapFirstLast() {
		int first = tail.element;
		int last;
		if (nodeCount < 2) {
			System.out.println("There is less than 2 elements in the list");
		} else if (nodeCount == 2) {
			last = tail.next.element;
			tail.element = last;
			tail.next.element = first;
		} else {
			Node cursor = tail;
			int i = 1;
			while (i != nodeCount) {
				cursor = cursor.next;
				i++;
			}
			last = cursor.element;
			tail.element = last;
			cursor.element = first;
		}
	}

	public void revert() {
		int[] values = new int[nodeCount];
		int i = 0;
		Node cursor = this.tail;
		while (i != nodeCount) {
			values[i] = cursor.element;
			cursor = cursor.next;
			i++;
		}
		LinkList tempList = new LinkList();
		for (int j = 0; j < values.length; j++) {
			tempList.addNode(values[j]);
		}
		this.tail = tempList.tail;
	}

	public boolean equals(LinkList list) {
		if (this.nodeCount != list.nodeCount) {
			return false;
		} else if (this.tail == null & list.tail == null) {
			return true;
		} else {
			Node cursor1 = this.tail;
			Node cursor2 = list.tail;
			while (cursor1.next != null) {
				if (cursor1.element != cursor2.element) {
					return false;
				}
				cursor1 = cursor1.next;
				cursor2 = cursor2.next;
			}
		}
		return true;
	}

	public LinkList concat(LinkList list) {
		Node cursor = this.tail;
		while (cursor.next != null) {
			cursor = cursor.next;
		}
		cursor.next = list.tail;
		return this;
	}

	public void swapMaxMin() {
		this.printList();
		// FIX ME
	}

	public void sortPartial(int index) {
		this.printList();
		// FIX ME
	}

	public void sort() {
		this.printList();
		// FIX ME
	}

	public void removeDuplicates() {
		this.printList();
		// FIX ME
	}
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
}
