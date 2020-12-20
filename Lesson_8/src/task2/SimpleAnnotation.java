package task2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MathAnno {
    int num1() default 0;
    int num2() default 0;
}

class MathHandler {
    @MathAnno (num1=1, num2=2)
    public static void addTwoNumbers(int num1, int num2){
        System.out.println(num1 + num2);
    }
}

public class SimpleAnnotation {
    public static void main(String[] args) {         //Detailed description of code procedures:
        MathHandler mathHandler = new MathHandler(); //1) create an instance of the object MathHandler.
        Class<?> cl = MathHandler.class; //2) in the link 'c1' we extract all information about a class MathHandler.
        try{
            Method method = cl.getDeclaredMethod("addTwoNumbers", int.class, int.class); //3)Through the Method extract the method 'addTwoNumbers' with parameters.
            MathAnno mathAnno = method.getAnnotation(MathAnno.class); //4) in the link 'mathAnno' we extract all information about a annotation interface MathAnno.
            MathHandler.addTwoNumbers(mathAnno.num1(), mathAnno.num2()); //5) use the method 'addTwoNumbers' using annotations num1,2.
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}