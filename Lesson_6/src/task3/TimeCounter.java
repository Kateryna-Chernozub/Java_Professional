package task3;

import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

/**
 * Спроектируйте и разработайте метод, определяющий, сколько времени прошло с заданной даты.
 * С помощью этого метода выведите в консоль, сколько времени прошло с вашего дня рождения в удобном
 * для восприятия виде, например: «Вам исполнилось 20 лет, 3 месяца, 18 дней, 4 часа, 5 минут и 10 секунд».
 */

public class TimeCounter {
    private static String formatDate(Calendar calendar) {
        Formatter formatter = new Formatter();
        formatter.format("%1$tF %1$tr", calendar); //Writes a formatted string to this object's destination using the specified format string and arguments.
        return formatter.toString();
    }

    public static void main(String[] args) {
        Date date = new Date();

        Calendar currentCalendar = Calendar.getInstance(); //Gets a calendar using the default time zone and locale.
        Calendar calendar2 = Calendar.getInstance();

        currentCalendar.setTime(date);  //Sets this Calendar's time with the given Date.

        System.out.println("Current date is: " + formatDate(currentCalendar));

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        //Enter the needed date
        calendar.set(Calendar.YEAR, 1997);
        calendar.set(Calendar.MONTH, 9);
        calendar.set(Calendar.DATE, 9);
        calendar.set(Calendar.HOUR_OF_DAY, 21);
        calendar.set(Calendar.MINUTE, 15);

        calendar2.set(Calendar.YEAR, currentCalendar.get(Calendar.YEAR) - calendar.get(Calendar.YEAR));
        calendar2.set(Calendar.MONTH, currentCalendar.get(Calendar.MONTH) - calendar.get(Calendar.MONTH));
        calendar2.set(Calendar.DAY_OF_MONTH, currentCalendar.get(Calendar.DAY_OF_MONTH) - calendar.get(Calendar.DAY_OF_MONTH));
        calendar2.set(Calendar.HOUR_OF_DAY, currentCalendar.get(Calendar.HOUR_OF_DAY) - calendar.get(Calendar.HOUR_OF_DAY));
        calendar2.set(Calendar.MINUTE, currentCalendar.get(Calendar.MINUTE) - calendar.get(Calendar.MINUTE));

        System.out.println("You've turned: " + calendar2.get(Calendar.YEAR) + " years, " + calendar2.get(Calendar.MONTH) + " months, " +
                calendar2.get(Calendar.DAY_OF_MONTH) + " days, " + calendar2.get(Calendar.HOUR_OF_DAY) + " hours, " +
                calendar2.get(Calendar.MINUTE) + " minutes.");
        
    }
}
