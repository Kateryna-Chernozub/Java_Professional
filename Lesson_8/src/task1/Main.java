package task1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

/**
 * Написать калькулятор с использованием аннотаций, аннотация передает 2 параметра.
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MathAnno {
    int num1() default 0;
    int num2() default 0;
}

class MathHandler {
    @MathAnno (num1 = 10, num2 = 2)
    public static void sum(int num1, int num2) {
        System.out.println("Sum of the numbers: " + num1 +" and " + num2 + ", is equal to - " + (num1 + num2));
    }
    @MathAnno (num1 = 10, num2 = 2)
    public static void dif(int num1, int num2) {
        System.out.println("Difference of the numbers: " + num1 +" and " + num2 + ", is equal to - " + (num1 - num2));
    }
    @MathAnno (num1 = 10, num2 = 2)
    public static void mul(int num1, int num2) {
        System.out.println("Multiplication of the numbers: " + num1 +" and " + num2 + ", is equal to - " + (num1 * num2));
    }
    @MathAnno (num1 = 10, num2 = 2)
    public static void div(int num1, int num2) {
        System.out.println("Division of the numbers: " + num1 +" and " + num2 + ", is equal to - " + (num1 / num2));
    }
}

public class Main {
    public static void main(String[] args) {
        MathHandler mathHandler1 = new MathHandler();
        Class<?> cl1 = MathHandler.class;
        try {
            Method methodSum = cl1.getDeclaredMethod("sum", int.class, int.class);
            Method methodDif = cl1.getDeclaredMethod("dif", int.class, int.class);
            Method methodMul = cl1.getDeclaredMethod("mul", int.class, int.class);
            Method methodDiv = cl1.getDeclaredMethod("div", int.class, int.class);

            MathAnno mathAnnoSum = methodSum.getAnnotation(MathAnno.class);
            MathAnno mathAnnoDif = methodDif.getAnnotation(MathAnno.class);
            MathAnno mathAnnoMul = methodMul.getAnnotation(MathAnno.class);
            MathAnno mathAnnoDiv = methodDiv.getAnnotation(MathAnno.class);

            MathHandler.sum(mathAnnoSum.num1(), mathAnnoSum.num2());
            MathHandler.dif(mathAnnoDif.num1(), mathAnnoDif.num2());
            MathHandler.mul(mathAnnoMul.num1(), mathAnnoMul.num2());
            MathHandler.div(mathAnnoDiv.num1(), mathAnnoDiv.num2());

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
