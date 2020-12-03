package task1;

import java.io.*;

/**
 * Создайте в package текстовый файл и клас, внесите в файл некий текст.
 * Выведите на экран содержимое файла.
 */


public class SimpleFile {
    public static void main(String[] args) throws Exception{

        File file = new File("D:/IT/my_projects/Java_Professional/Lesson_4/simpleFile.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String temp;
        while ((temp = br.readLine()) != null) {
            System.out.println(temp);
        }
        br.close();

        PrintWriter pw = new PrintWriter(new FileWriter(file, true));
        pw.println("Hello World!!!");
        pw.println("Wish you good day!");
        pw.println("And take care!");
        pw.flush();
        pw.close();
    }
}
