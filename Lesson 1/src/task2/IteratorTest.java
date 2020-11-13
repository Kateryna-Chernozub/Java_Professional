package task2;

import java.util.*;

public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(56);
        testList.add(74);
        testList.add(4);
        testList.add(174);
        testList.add(24);
        testList.add(2);
        testList.add(77);
        testList.add(64);
        testList.add(1);
        testList.add(100);

        // before sort
        System.out.println(testList);

        // after sort
        Collections.sort(testList);
        for (Integer temp : testList) {
            System.out.print(temp + " ");
        }
        /*
        Iterator<Integer> iterator = testList.iterator();
        while (iterator.hasNext()) {
            Integer temp = iterator.next();
            System.out.print(temp + " ");
         }
        */

        // Iterator #2
        /* ListIterator<Integer> listIterator = testList.listIterator();
        while (listIterator.hasNext()) {
            Integer temp = listIterator.next();
            System.out.println(temp);
        */
    }
}
