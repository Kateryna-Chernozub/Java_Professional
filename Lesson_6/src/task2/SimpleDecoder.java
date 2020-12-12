package task2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Напишите шуточную программу «Дешифратор», которая бы в текстовом файле могла бы заменить все
 * предлоги на слово «Java».
 */

public class SimpleDecoder {
    public static void main(String[] args) {
        System.out.println("Enter the sentence:");

        Scanner scanner = new Scanner(System.in);
        String stringIn = scanner.nextLine();

        System.out.println("Entered value: " + stringIn);

        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(stringIn);
        System.out.println("Return value: " + stringIn.replaceAll(stringIn, "Java"));
    }
}