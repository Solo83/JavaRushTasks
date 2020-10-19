package Lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Минимаксы в массивах
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.


Требования:
1. В классе Solution создай статический публичный метод int[] getInts().
2. Метод getInts() должен возвращать массив целых чисел размерностью 20 элементов, заполненный с клавиатуры.
3. В методе main создай и проинициализируй массив с помощью метода getInts(), найди и выведи через пробел максимальный и минимальный элемент массива.
4. Используй цикл for.
*/

public class Task0721 {
    public static void main(String[] args) throws IOException {


        int[] array =  getInts();

        int maximum = array[0];
        int minimum = array[0];



        for (int i = 0; i<array.length; i++) {
            if (maximum<array[i]) maximum = array[i];
            if (minimum>array[i]) minimum = array[i];
        }

        System.out.print(maximum + " " + minimum);
    }

    public static int[] getInts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];

        for (int i=0; i<array.length; i++) {
            int s = Integer.parseInt(reader.readLine());
            array[i] = s;
        }

        return array;

    }

}
