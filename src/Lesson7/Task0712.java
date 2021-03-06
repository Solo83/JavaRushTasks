package Lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самые-самые
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
3. Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
4. Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
5. Должна быть выведена только одна строка.
*/

public class Task0712 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }

        int maxLen = strings.get(0).length();
        int minLen = strings.get(0).length();

        for (String string : strings) {

            if (string.length() > maxLen) {
                maxLen = string.length(); }
            if (string.length() < minLen) {
                minLen = string.length();
            }

        }

        for (int i = 0; i < strings.size(); i++)  {

            if ((strings.get(i).length() == maxLen)) {System.out.println(strings.get(i)); break;}
            if ((strings.get(i).length() == minLen)) {System.out.println(strings.get(i)); break;}

        }

    }}