package Lesson9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Задача по алгоритмам Ӏ Java Syntax: 9 уровень, 11 лекция
Задача: Пользователь вводит с клавиатуры список слов (и чисел).
Слова вывести в возрастающем порядке, числа - в убывающем.

Пример ввода:
Вишня
1
Боб
3
Яблоко
22
0
Арбуз

Пример вывода:
Арбуз
22
Боб
3
Вишня
1
0
Яблоко


Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить данные на экран.
3. Выведенные слова должны быть упорядочены по возрастанию (используй готовый метод isGreaterThan).
4. Выведенные числа должны быть упорядочены по убыванию.
5. Метод main должен использовать метод sort.
6. Метод sort должен использовать метод isGreaterThan.
7. Метод sort должен использовать метод isNumber.
*/

public class Task0930 {
    public static void main(String[] args) throws Exception {
       // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     //   ArrayList<String> list = new ArrayList<>();
     //   while (reader.ready()) {
      //      String s = reader.readLine();
      //      list.add(s);
      //  }

        String[] array = {"Вишня","1","Боб","3","Яблоко","22","0","Арбуз"};
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }
    public static void sort(String[] array) {
        for (int i = 0; i<array.length; i++) {
            for (int k=i+1; k<array.length; k++) {
                if (!isNumber(array[i])){
                    if(!isNumber(array[k])){
                        if (isGreaterThan(array[i], array[k])){
                            swap (array, i,k);
                        }
                    }}
                else {if (isNumber(array[k])) {
                    if (Integer.parseInt(array[i])<Integer.parseInt(array[k])) {
                        swap (array, i,k);
                    }
                }}
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String text) {
        if (text.length() == 0) {
            return false;
        }

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];

            // есть '-' внутри строки
            if (i != 0 && character == '-') {
                return false;
            }

            // не цифра и не начинается с '-'
            if (!Character.isDigit(character) && character != '-') {
                return false;
            }

            // одиночный '-'
            if (chars.length == 1 && character == '-') {
                return false;
            }
        }

        return true;
    }

    public static void swap (String [] array, int i, int k) {
        String temp = array[i];
        array[i] = array[k];
        array[k] = temp;
    }

}
