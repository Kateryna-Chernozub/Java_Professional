package task1;

import java.util.Comparator;

/**
 * Вывести все предложения заданного текста в порядке возрастания количества слов в каждом из них.
 */

public class StringTask {
    public static void main(String[] args) {
        String str1 = new String ("Каждая строка, создаваемая с помощью оператора new или с помощью литерала (заключённая в двойные апострофы), является объектом класса String.");
        String str2 = new String ("Особенностью объекта класса String является то, что его значение не может быть изменено после создания объекта при помощи какого-либо метода класса, так как любое изменение строки приводит к созданию нового объекта.");
        String str3 = new String ("Классы StringBuilder и StringBuffer являются “близнецами” и по своему предназначению близки к классу String, но, в отличие от последнего, содержимое и размеры объектов классов StringBuilder и StringBuffer можно изменять.");

        String [] string1 = str1.split(" ");
        String [] string2 = str2.split(" ");
        String [] string3 = str3.split(" ");

        System.out.println("The number of words in the first line - " + string1.length);
        System.out.println("The number of words in the second line - " + string2.length);
        System.out.println("The number of words in the third line - " + string3.length);
        System.out.println();
        System.out.println(StringLengthSort.compare(string1, string2));
    }
}

class StringLengthSort {
    public static int compare(String[] string1, String[] string2) {
        if(string1.length > string2.length) {
            return 1;
        } else{
            if (string1.length < string2.length) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}