package task2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Создайте класс, в нем определите 3 поля, к этим полям создайте конструкторы и методы.
 * Под средством рефлексии получите всю информацию о полях, методах, конструкторах, а также
 * модификаторах доступа
 */

public class Main {
    public static final class Users{
        public String name = "Chernozub Kateryna";
        protected long phone = 989329L;
        String login = "ChernozubKa1997";
        private int key = 451;

        public Users(String name) {
            this.name = name;
        }

        public Users (String name, long phone) {
            this.name = name;
            this.phone = phone;
        }

        public Users (String name, long phone, String login) {
            this.name = name;
            this.phone = phone;
            this.login = login;
        }

        public long getPhone() { return phone; }

        public void setPhone(long phone) { this.phone = phone; }

        public String getLogin() { return login; }

        public void setLogin(String login) { this.login = login; }

        public int getKey() { return key; }

        public void setKey(int key) { this.key = key; }
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Class<?> userClass = Users.class;

        //Get the name and type of fields:
        System.out.println("All modifiers reflection fields: ");
        Field[] fields = userClass.getDeclaredFields();
        for (Field field : fields) {
            Class<?> fieldType = field.getType();
            System.out.println("\tType: " + fieldType.getName() + ", name: " + field.getName());
        }

        //Get the constructors:
        System.out.println("All constructors: ");
        Constructor<?>[] constructors = userClass.getConstructors();
        int i = 0;
        for (Constructor<?> ctr : constructors) {
            System.out.print("\tConstructor " + (++i) + ": ");
            Class<?>[] paramTypes = ctr.getParameterTypes();
            for (Class<?> paramType : paramTypes) {
                System.out.print(paramType.getName() + ", ");
            }
            System.out.println();
        }

        //Get the methods:
        System.out.println("All methods: ");
        Method[] methods = userClass.getMethods();
        for (Method method : methods) {
            System.out.println("Method name: " + method.getName());
            System.out.println("\tReturn type: " + method.getReturnType().getName());
            Class<?>[] paramTypes = method.getParameterTypes();
            System.out.print("\tParameter type: ");
            for (Class<?> paramType : paramTypes) {
                System.out.println(paramType.getName());
            }
            System.out.println();
        }
    }
}
