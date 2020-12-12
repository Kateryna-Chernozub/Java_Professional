package task1;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Напишите консольное приложение, позволяющие пользователю зарегистрироваться под «Логином»,
 * состоящем только из символов латинского алфавита, и пароля, состоящего из цифр и символов.
 */

public class SimpleRegister {
    public static void main(String[] args) {

        final int maxAttempt = 3;
        int attempt = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your login: ");

        //Check login using a loop 'while':
        while (attempt < maxAttempt) {
            attempt++;
            System.out.println("Attempt " + attempt + " : ");
            String login1 = scanner.nextLine();  //Enter login.

            Pattern pattern1 = Pattern.compile("[a-zA-Z]+");
            Matcher matcher1 = pattern1.matcher(login1);

            boolean b1 = matcher1.matches();
            if (b1 == true) {
                System.out.println("The login - " + login1 + ", entered is correct.");
                break;
            }
            if (b1 == false) {
                System.out.println((char)27 + "[31m" + "The login you entered is incorrect, please try again." + (char)27 + "[0m");
                if (attempt == maxAttempt) {
                    System.out.println("The number of attempts is exhausted, try again later.");
                } continue;
            }
        }

        //Check password using a loop 'while':
        System.out.println("\nYour password must be at least 8 characters long." +
                "\nEnter the password:");

        final int maxAttempt2 = 3;
        int attempt2 = 0;
        while (attempt2 < maxAttempt2) {
            attempt2++;
            System.out.println("Attempt " + attempt2 + " : ");
            String password = scanner.nextLine();  //Enter password.

            Pattern pattern2 = Pattern.compile("([a-zA-Z0-9]+){8,}");
            Matcher matcher2 = pattern2.matcher(password);

            boolean b2 = matcher2.matches();
            if (b2 == true) {
                System.out.println("The password - " + password + ", entered is correct.");
                break;
            }
            if (b2 == false) {
                System.out.println((char)27 + "[31m" + "The password you entered is incorrect, please try again." + (char)27 + "[0m");
                if (attempt2 == maxAttempt2) {
                    System.out.println("The number of attempts is exhausted, try again later.");
                } continue;
            }
        }
        System.out.println("Registration completed successfully.");
    }
}

