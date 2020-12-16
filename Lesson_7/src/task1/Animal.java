package task1;

import java.lang.reflect.Field;

/**
 * Создайте 2 класса, Animal и Cat.
 * В классе Animal инициализируйте 3 поля различных модификаторов.
 * В классе Cat используя рефлексию получите доступ к полям класса Animal и измените содержимое каждого
 * из полей.
 */

public class Animal {
    private int price = 2000;
    int weight = 5;
    protected String breed = "Bobtail";
    public String name = "Doggi";

    public static class Cat {
        public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
            Class<?> classCat = Animal.class;
            Animal animal = new Animal();

            System.out.println("Public fields:");
            Field[] fields = classCat.getFields();
            for (Field field : fields) {
                Class<?> fieldType = field.getType();
                System.out.println("Type is: " + fieldType.getName() + ". ");
                System.out.print("\tName: " + field.getName() + ". ");
            }

            System.out.println("All modifiers fields:");
            fields = classCat.getDeclaredFields();
            for (Field field : fields) {
                Class<?> fieldType = field.getType();
                System.out.print("\tName: " + field.getName() + ". ");
                System.out.println("\tType is: " + fieldType.getName());
            }

            Field field1 = classCat.getDeclaredField("price");
            Field field2 = classCat.getDeclaredField("weight");
            //Field field3 = classCat.getDeclaredField("breed");
            //Field field4 = classCat.getDeclaredField("name");
            field1.setInt(animal, 2001);
            field2.setInt(animal, 6);
            //field3.setString(animal, "fsf"); --error
            //field4.setString(animal, 6); --error
            System.out.println("New field: \n\tprice: " + field1.getInt(animal) + "\n\tweight: " + field2.getInt(animal));
        }
    }
}
