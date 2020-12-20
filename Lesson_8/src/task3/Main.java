package task3;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/**
 * Создать свою аннотацию используя аннотацию @Repeatable с Java 8, вызвать дважды аннотацию подтягивая
 * разные параметры выполнить сложение 2-х чисел.
 * @MathAnno(num1 = 50)
 * @MathAnno(num2 = 100)
 * public void mathSum(int num1, int num2)
 */

//Make MyAnno annotation repeating
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface MyAnno {
     int num1() default 0;
     int num2() default 0;
}

//This is a container annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos {
    MyAnno[] value();
}

/**
 * Attempt1
 */
//class RepeatAnno {
//
//    @MyAnno(num1 = 30)
//    @MyAnno(num2 = 100)
//    public static void myMeth(int num1, int num2) {
//        RepeatAnno repeatAnno = new RepeatAnno();
//        try {
//            Class<?> cl = repeatAnno.getClass();
//
//            // get annotations for the myMeth () method
//            Method method = cl.getMethod("myMeth", int.class, int.class);
//
//            //output duplicate annotations MyAnno
//            Annotation annotation = method.getAnnotation(MyRepeatedAnnos.class);
//            System.out.println(annotation);
//            System.out.println(num1 + num2);
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        myMeth(20,100);
//    }
//}

/**
 * Attempt2
 */
class MathHandler {
    @MyAnno(num1 = 30)
    @MyAnno(num2 = 100)
    public static void mathSum(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}
public class Main {
    public static void main(String[] args) {
        MathHandler mathHandler = new MathHandler();

        try {
            Class<?> cl = MathHandler.class;
            Method method = cl.getMethod("mathSum", int.class, int.class);
            Annotation annotation = method.getAnnotation(MyRepeatedAnnos.class);
            //MathHandler.mathSum(MyAnno.num1(), MyAnno.num2()); //Error 'Non-static method 'num1()' cannot be referenced from a static context'
            MathHandler.mathSum(30, 10); //annotation data is not used
            System.out.println(annotation);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
