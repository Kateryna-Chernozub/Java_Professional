package task3;

/**
 * Необходимо создать строку с текстом. Разбить эту строку на 2 подстроки
 * равной длине и вывести на экран каждое предложения с новой строки.
 */

public class StringTask3 {
    public static void main(String[] args) {
        String string = "Initializes a newly created String object so that it represents an empty character sequence.";

        System.out.println(string);
        System.out.println("Total number of characters in a sentence is - " + string.length());
        System.out.println(string.substring(0, 46) + ". Characters is - " + string.substring(0, 46).length());
        System.out.println(string.substring(46, 92) + " . Characters is - " + string.substring(46, 92).length());
    }
}
