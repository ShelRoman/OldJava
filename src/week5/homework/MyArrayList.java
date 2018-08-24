/*Написать собственную реализацию динамического массива MyArrayList,
содержащего целые числа. Реализовать следующие методы
- void add(int value)
- int get(int index)
- boolean set(int index, int value)
- boolean add(int index, int value)
- int indexOf(int value)
- int size()
- int remove(int index)*/
package week5.homework;

public class MyArrayList <E> {
	E[] list;
	int size;

	@SuppressWarnings("unchecked")
	public void add(E value) {
		if (this.list == null) {
			this.list = (E[]) new Object[1];
			list[0] = value;
		} else {
			E[] tempList = (E[]) new Object[list.length + 1];
			for (int i = 0; i < list.length; i++) {
				tempList[i] = list[i];
			}
			tempList[tempList.length - 1] = value;
			this.list = tempList;
		}
	}

	public E get(int index) {
		return this.list[index];
	}

	public boolean set(int index, E value) {
		if (index > this.list.length - 1) {
			return false;
		}
		this.list[index] = value;
		return true;
	}

	@SuppressWarnings("unchecked")
	public boolean add(int index, E value) {
		if (this.list == null) {
			return false;
		} else if (index > this.list.length - 1 | index < 0) {
			return false;
		} else if (index == 0) {
			E[] tempList = (E[]) new Object [this.list.length + 1];
			tempList[0] = value;
			for (int i = 1; i < tempList.length; i++) {
				tempList[i] = list[i - 1];
			}
			this.list = tempList;
		} else {
			E[] tempList = (E[]) new Object[this.list.length + 1];
			for (int i = 0; i < index; i++) {
				tempList[i] = list[i];
			}
			tempList[index] = value;
			for (int j = list.length; j > index; j--) {
				tempList[j] = list[j - 1];
			}
			this.list = tempList;
		}
		return true;
	}

	public int indexOf(E value) {
		for (int i = 0; i < list.length; i++) {
			if (list[i] == value) {
				return i;
			}
		}
		return -1;
	}

	public int size() {
		return list.length;
	}

	@SuppressWarnings("unchecked")
	public E remove(int index) {
		E[] tempList = (E[]) new Object[list.length - 1];
		E tToRet = list[index];
		if (index == 0) {
			for (int i = 0; i < tempList.length; i++) {
				tempList[i] = list[i + 1];
			}
			this.list = tempList;
		} else {
			for (int i = 0; i < index; i++) {
				tempList[i] = list[i];
			}
			for (int j = index; j < tempList.length; j++) {
				tempList[j] = list[j + 1];
			}
			this.list = tempList;
		}
		return tToRet;
	}
}
