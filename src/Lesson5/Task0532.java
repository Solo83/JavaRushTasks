package Lesson5;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/*
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
Написать программу, которая:
1. считывает с консоли число N, которое должно быть больше 0
2. потом считывает N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.


Требования:
1. Программа должна считывать числа с клавиатуры.
2. Программа должна выводить число на экран.
3. В классе должен быть метод public static void main.
4. Нельзя добавлять новые методы в класс Solution.
5. Программа должна выводить на экран максимальное из введенных N чисел.
6. Программа не должна ничего выводить на экран, если N меньше либо равно 0.
*/

public class Task0532 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        ArrayList<Integer> list = new ArrayList();

        if (n > 0)

        {
            for (int i = 0; i < n; i++) {
                int a = Integer.parseInt(reader.readLine());
                list.add(a);
            }

            int max = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i)> max) max = list.get(i);
            }
            System.out.println(max);
        }

    }



}