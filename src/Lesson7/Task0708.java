package Lesson7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.


Требования:
1. В методе main инициализируй существующее поле strings класса Solution новым ArrayList<>
2. Программа должна считывать 5 строк с клавиатуры и записывать их в поле strings класса Solution.
3. Программа должна выводить самую длинную строку на экран.
4. Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.
*/

public class Task0708 {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {

        Task0708.strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String max = null;
        int n = 0;

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        for (String string : strings) {

            if (string.length() >= n) {
                n = string.length();
                max = string;
            }

        }

        for (String string : strings) {

            if (string.length() == n)
                System.out.println(string);

        }

    }}

