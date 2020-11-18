package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 Вводить с клавиатуры строки, пока пользователь не введёт строку 'end':
 1. Создать список строк.
 2. Ввести строки с клавиатуры и добавить их в список.
 3. Вводить с клавиатуры строки, пока пользователь не введёт строку "end". "end" не учитывать.
 4. Вывести строки на экран, каждую с новой строки.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the key:");

        ArrayList<String> arrayList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            String enterKey = reader.readLine();
            if (enterKey.equals("end")) {
                System.out.println("The key is selected correctly");
                arrayList.add(enterKey);
                break;
            } else {
                arrayList.add(enterKey);
            }
        }
        // Example 1:
        // for (int a = 0; a < arrayList.size(); a++) {
        //    System.out.println(arrayList.get(a));
        //}

        for (String temp : arrayList) {
            System.out.println(temp);
        }
    }
}
