package task2;

import java.io.*;

/**
 * Создайте файл, запишите в него произвольные данные и закройте файл.
 * Затем снова откройте этот файл,
 * прочитайте из него данные и выведете их на консоль.
 */

public class SimpleFileTest {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:/IT/my_projects/Java_Professional/Lesson_4/src/simpleTest.java"), "Cp866"));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:/IT/my_projects/Java_Professional/Lesson_4/src/simpleTest.java"), "Cp866"))) {
            
            int c;
            while ((c = br.read()) != -1) {
                bw.write((char)c);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
