// �������� ����� DoublyLinkList, ������������ ������������ ������ � ������� �������� DDNode.
// ��� ������ DoublyLinkList �������� ������:
//
// 1. ������� �������� ������ � �������� �������, ����� void printRevert()
// 2. ���������� �������� � ������, ����� void addFirst(int element)
// 3. ���������� �������� � �����, ����� void addLast(int element)
// 4. ����������� �������� � ������ � �������� �������, ����� void revert()
// 5. �������� ����������� �������� ������, � ������ ���� ���������� ��������� Comparable, ����� void sortPartial(int index)

package week5.homework;

public class DoublyLinkList {
    int dNodeCount;
    DNode tail;
    DNode head;

    public void addFirst(int value) {
        if (this.tail == null & dNodeCount == 1) {
            addLast(value);
            this.tail.next = this.head;
            this.head.prev = this.tail;
        } else if (this.head == null) {
            this.head = new DNode(value, head, null);
            dNodeCount++;
        } else {
            this.head.next = new DNode(value, head, null);
            this.head = this.head.next;
            dNodeCount++;
        }


    }

    public void addLast(int value) {
        this.tail = new DNode(value, null, tail);
        if (dNodeCount >= 2) {
            this.tail.next.prev = this.tail;
        }
        dNodeCount++;
    }

    public void printRevert() {
        DNode cursor = tail;
        while (cursor.next != null) {
            System.out.println(cursor.element);
            cursor = cursor.next;
        }
        System.out.println(cursor.element);
    }

    public void revert() {
        DNode cursor = head;
        while (cursor.prev != null) {
            DNode temp = cursor.next;
            cursor.next = cursor.prev;
            cursor.prev = temp;
            cursor = cursor.next;
        }
    }


    public void sortPartial(int index) {
        this.printRevert();
        // FIX ME
    }


    @SuppressWarnings("rawtypes")
    public class DNode implements Comparable {
        int element;
        DNode next;
        DNode prev;


        public DNode(int element, DNode prev, DNode next) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }

        @Override
        public int compareTo(Object obj) {
            // TODO Auto-generated method stub
            return 0;
        }

    }
}
