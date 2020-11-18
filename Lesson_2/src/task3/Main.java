package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 Минимальное из N чисел(использовать LinkedList):
 1. Ввести с клавиатуры число N.
 2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
 3. Найти минимальное число среди элементов списка - метод getMinimum.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> integerList = getIntegerList();
        System.out.print("Minimum: ");
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) < max) {
                max = array.get(i);
            }
        }
        return max;
    }

    public static List<Integer> getIntegerList() throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        System.out.println("Possible to enter " + N + " values");
        for (int i = 0; i < N; i++) {
            list.add (Integer.parseInt(reader.readLine()));
        }
        return list;
    }
}
