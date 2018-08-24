	/*Написать собственную реализацию динамического массива MyArrayList,
содержащего целые числа. Реализовать следующие методы
- void add(int value)
- int get(int index)
- boolean set(int index, int value)
- boolean add(int index, int value)
- int indexOf(int value)
- int size()
- int remove(int index)*/
package week4.homework;

public class MyArrayList {
	int[] list;
	int size;

	public void add(int value) {
		if (this.list == null) {
			this.list = new int[1];
			list[0] = value;
		} else {
			int[] tempList = new int[list.length + 1];
			for (int i = 0; i < list.length; i++) {
				tempList[i] = list[i];
			}
			tempList[tempList.length - 1] = value;
			this.list = tempList;
		}
	}

	public int get(int index) {
		if (index > list.length - 1) {
			System.out.println("Out of range");
			return -1;
		}
		return this.list[index];
	}

	public boolean set(int index, int value) {
		if (index > this.list.length - 1) {
			return false;
		}
		this.list[index] = value;
		return true;
	}

	public boolean add(int index, int value) {
		if (this.list == null) {
			return false;
		} else if (index > this.list.length - 1 | index < 0) {
			return false;
		} else if (index == 0) {
			int[] tempList = new int[this.list.length + 1];
			tempList[0] = value;
			for (int i = 1; i < tempList.length; i++) {
				tempList[i] = list[i - 1];
			}
			this.list = tempList;
		} else {
			int[] tempList = new int[this.list.length + 1];
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

	public int indexOf(int value) {
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

	public int remove(int index) {
		int[] tempList = new int[list.length - 1];
		int intToRet = list[index];
		if (index > list.length - 1) {
			return -1;
		} else if (index == 0) {
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
		return intToRet;
	}
}
