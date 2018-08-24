
package proff27.session1;

import java.util.ArrayList;
import java.lang.Math;


public class BinarySearcher {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add((int) (Math.random() * 100));
        }
        sortInsertion(list);
        int searchInt = list.get((int) (Math.random() * (list.size() - 1)));
        System.out.println(binarySearch(list, searchInt));


    }

    public static int binarySearch(ArrayList<Integer> list, int searchInt) {
        int minIndex = 0;
        int maxIndex = list.size() - 1;
        while (maxIndex >= minIndex) {
            int midIndex = minIndex + (maxIndex - minIndex) / 2;
            if (searchInt == list.get(midIndex)) {
                return midIndex;
            } else if (list.get(midIndex) < searchInt) {
                minIndex = midIndex + 1;
            } else if (list.get(midIndex) > searchInt) {
                maxIndex = midIndex - 1;
            }
        }
        return -1;
    }

    public static void sortInsertion(ArrayList<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            int temp = list.get(i);
            int j = i;
            while (j > 0 && temp < list.get(j - 1)) {
                list.set(j, list.get(j - 1));
                j--;
            }
            list.set(j, temp);
        }
    }
}
