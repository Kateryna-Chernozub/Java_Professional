package task2;


import java.util.Arrays;

/**
 * В каждом предложении текста поменять местами первое слово с последним,
 * не изменяя длины предложения.
 */

public class StringTask2 {
    public static void main(String[] args) {
        //Version1
        String str1 = "The String class represents character strings.";
        String [] words = str1.split(" ");
        String lastWord = words[words.length -1 ];
        words[words.length - 1] = words[0];
        words[0] = lastWord;
        //str1 = Arrays.stream(words).collect(joining(" ")); --error in "joining(" ")"

        //Version2
        String tmp, string1 = "The String class represents character strings.";
        String[] words1 = string1.split(" ");
        tmp = words1[0];
        words1[0] = words1[words1.length - 1];
        words1[words1.length - 1] = tmp;

        System.out.println(string1);
        for (String word : words1) {
            System.out.print(word + " ");
        }

        System.out.println(" \n " );
        String tmp2, string2 = "All string literals in Java programs, such as 'abc', are implemented as instances of this class.";
        String[] words2 = string2.split(" ");
        tmp2 = words2[0];
        words2[0] = words2[words2.length - 1];
        words2[words2.length - 1] = tmp;

        System.out.println(string2);
        for (String word : words2) {
            System.out.print(word + " ");
        }
    }
}
