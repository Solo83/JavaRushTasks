package Lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/*
Омовение Рамы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
мама мыла раму.

Пример вывода:
Мама Мыла Раму.


Требования:
1. Программа должна выводить текст на экран.
2. Программа должна считывать строку с клавиатуры.
3. Программа должна заменять в тексте первые буквы всех слов на заглавные.
*/

public class Task0823 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sString = reader.readLine();

        String text = sString.trim().replaceAll("\\s+", " ");

        ArrayList<String> strArr = new ArrayList<String>(Arrays.asList(text.split(" ")));

        for (String str : strArr) {
            str = Character.toString(str.charAt(0)).toUpperCase() + str.substring(1);
            System.out.print(str + " ");

        }


    }
}