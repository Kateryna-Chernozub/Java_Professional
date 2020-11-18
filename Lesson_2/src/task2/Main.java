package task2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 Используя коллекцию удвойте слово:
 1. Введите с клавиатуры 5 слов в список строк.
 2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
 3. Используя цикл for выведите результат на экран, каждое значение с новой строки.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        ArrayList<String> result = doubleValues((ArrayList<String>) list);

        for (int i=0; i<result.size(); i++){
            System.out.println(result.get(i));
        }
    }

    public static  ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> list2 = new ArrayList<>();

        for (int i=0; i<list.size(); i++) {
            list2.add(list.get(i));
            list2.add(list.get(i));
        }
        return list2;
    }
}
