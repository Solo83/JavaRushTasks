package Lesson8;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудьте учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false


Требования:
1. Программа должна выводить текст на экран.
2. Класс Solution должен содержать два метода.
3. Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
4. Метод main() должен вызывать метод isDateOdd().
*/

public class Task0827 {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }



    public static boolean isDateOdd(String date) {
        //  SimpleDateFormat formatter = new SimpleDateFormat("MMM dd YYYY");
        Date startDate = new Date(date);
        Date yearStart = new Date();
        yearStart.setMonth(0);
        yearStart.setDate(0);
        yearStart.setYear(startDate.getYear());
        long dif =  startDate.getTime() - yearStart.getTime();
        int days = (int) (dif/(24 * 60 * 60 * 1000));

        if (days%2 == 0) return true;
        else return false;


      /*  System.out.println(formatter.format(startDate));
        System.out.println(formatter.format(yearStart));
        System.out.println(days);*/




    }




}
