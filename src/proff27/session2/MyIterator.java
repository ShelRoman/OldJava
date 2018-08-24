//�������� �����, ������� ������� �� ������ ��� ������� �����.
package proff27.session2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MyIterator {
    public static void main(String[] args) {
        List<Integer> testList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));
        removePrime(testList);
        testList.forEach(System.out::println);

    }

    public static void removePrime(List<Integer> list) {
        Iterator<Integer> testIterator = list.iterator();
        while (testIterator.hasNext()) {
            if (isPrime((testIterator.next()))) {
                testIterator.remove();
            }
        }
    }


    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0)
                    return false;
            }
        }
        return true;
    }
}
