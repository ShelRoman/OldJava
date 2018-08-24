/*�������� ����������� ���������� ������������� ������� MyArrayList.
        ������� �������������� ������, �������� E.
        ����������� � ������ ���������� Iterable.
        ����������� ��������� ������
        - void add(E value)
        - E get(int index)
        - boolean set(int index, E value)
        - boolean add(int index, E value)
        - int indexOf(E value)
        - int size()
        - E remove(int index)
        - Iterator<E> iterator() */
package proff27.hw1;

import java.util.Iterator;

public class MyArrayList<E> implements Iterable {
    private E[] myList;

    public MyArrayList() {
    }

    public void print() {
        for (E e : (Iterable<E>) this) {
            System.out.println(e);
        }
    }

    public boolean isEmpty() {
        return myList == null;
    }

    public void add(E value) {
        if (this.isEmpty()) {
            this.addIfEmpty(value);
        } else {
            this.addIfNotEmpty(value);
        }
    }

    private void addIfEmpty(E value) {
        myList = (E[]) new Object[1];
        myList[0] = value;
    }

    private void addIfNotEmpty(E value) {
        E[] myTempList = (E[]) new Object[myList.length + 1];
        for (int i = 0; i < myList.length; i++) {
            myTempList[i] = myList[i];
        }
        myTempList[myTempList.length - 1] = value;
        myList = myTempList;
    }

    private boolean isIndexOutOfRange(int index) {
        return this.isEmpty() || index > myList.length - 1 || index < 0;
    }

    public E get(int index) throws WrongIndexException {
        if (isIndexOutOfRange(index)) {
            throw new WrongIndexException("Index out of range or empty list");
        } else {
            return myList[index];
        }
    }

    public boolean set(int index, E value) {
        if (isIndexOutOfRange(index)) {
            return false;
        } else {
            myList[index] = value;
            return true;
        }
    }

    public boolean add(int index, E value) {
        if (isIndexOutOfRange(index)) {
            return false;
        } else {
            if (index == 0) {
                this.addIfZeroIndex(value);
            } else {
                this.addIfNotZeroIndex(index, value);
            }
            return true;
        }
    }

    private void addIfZeroIndex(E value) {
        E[] myTempList = (E[]) new Object[myList.length + 1];
        myTempList[0] = value;
        for (int i = 1; i < myTempList.length; i++) {
            myTempList[i] = myList[i - 1];
        }
        myList = myTempList;
    }

    private void addIfNotZeroIndex(int index, E value) {
        E[] myTempList = (E[]) new Object[myList.length + 1];
        int i = 0;
        for (; i < index; i++) {
            myTempList[i] = myList[i];
        }
        myTempList[i] = value;
        for (int j = i + 1; j <= myList.length; j++) {
            myTempList[j] = myList[i];
        }
        myList = myTempList;
    }

    public int indexOf(E value) {
        if (this.isEmpty()) {
            return -1;
        } else {
            for (int i = 0; i < myList.length; i++) {
                if (myList[i].equals(value)) {
                    return i;
                }
            }
            return -1;
        }
    }

    public int size() {
        if (this.isEmpty()) {
            return 0;
        } else {
            return myList.length;
        }
    }

    public E remove(int index) throws WrongIndexException {
        if (isIndexOutOfRange(index)) {
            throw new WrongIndexException("Index out of range or empty list");
        } else if (myList.length == 1) {
            E valueToReturn = myList[index];
            myList = null;
            return valueToReturn;
        } else {
           if (index == 0) {
               this.removeIfZeroIndex(index);
           } else if (index == myList.length - 1) {
                this.removeIfLastIndex(index);
           } else {
               this.removeIfCommonIndex(index);
           }
        }
        return null;
    }

    private E removeIfCommonIndex(int index) {
        E[] myTempList = (E[]) new Object[myList.length - 1];

        for (int i = 0; i < index ; i++) {
            myTempList[i] = myList[i];
        }
        for (int j = index; j < myTempList.length; j++) {
            myTempList[j] = myList[j+1];
        }
        E valueToReturn = myList[index];
        myList = myTempList;
        return  valueToReturn;
    }

    private E removeIfLastIndex(int index) {
        E[] myTempList = (E[]) new Object[myList.length - 1];
        for (int i = 0; i < myList.length - 1; i++) {
            myTempList[i] = myList[i];
        }
        E valueToReturn = myList[index];
        myList = myTempList;
        return  valueToReturn;
    }

    private E removeIfZeroIndex(int index) {
        E[] myTempList = (E[]) new Object[myList.length - 1];
        for (int i = 1; i < myList.length; i++) {
            myTempList[i-1] = myList[i];
        }
        E valueToReturn = myList[index];
        myList = myTempList;
        return valueToReturn;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < myList.length && myList[currentIndex] != null;
            }

            @Override
            public E next() {
                return myList[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
