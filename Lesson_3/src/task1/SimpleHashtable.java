package task1;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 Задание 1
 Собственная Hashtable.
 Реализовать метод вставки в собственном классе SimpleHashtable

 Задание 2
 Программа определяет, какая семья (фамилия) живёт в городе:
 Пример ввода:
  Москва
  Ивановы
  Киев
  Лондон

  Лондон
 Пример вывода:
  Абрамовичи

 Задание 3
 Собственная Hashtable. Реализовать методы замещения, удаления в собственном классе SimpleHashtable
 дополняя предыдущее задание.
 */

public class SimpleHashtable {
    public static void main(String[] args) {
        Map<String, String> hashtable = new Hashtable<>();

        hashtable.put("Ocheretko", "Kyiv");
        hashtable.put("Paliy", "Smila");
        hashtable.put("Samoilenko", "Kyiv");
        hashtable.put("Chernozub", "Mykolaiv");

        System.out.println("Use method foreach: ");
        for (Map.Entry<String, String> entry : hashtable.entrySet()) {
            System.out.println(entry);
        }

/*        System.out.println("\n" + "Use iterator: ");

        Iterator<Map.Entry<String, String>> iterator = hashtable.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry);
        }

        System.out.println("\n" + "Use collection Set: ");

        Set set = hashtable.entrySet();
        for (Object o: set) {
            System.out.println(o);
        }
*/
        hashtable.remove("Ocheretko");
        System.out.println("\n" + "Before remove some key: ");

        Set set1 = hashtable.entrySet();
        for (Object o: set1) {
            System.out.println(o);
        }

        hashtable.replace("Chernozub" , "Stepove");
        System.out.println("\n" + "Before replace some value: ");

        Set set2 = hashtable.entrySet();
        for (Object o: set2) {
            System.out.println(o);
        }

    }
}
