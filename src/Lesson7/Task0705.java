package Lesson7;

/*
Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.


Требования:
1. Программа должна создавать большой массив на 20 целых чисел.
2. Программа должна считывать с клавиатуры 20 чисел для большого массива.
3. Программа должна создавать два маленьких массива на 10 чисел каждый.
4. Программа должна скопировать одну половину большого массива в первый маленький, а вторую - во второй и вывести второй маленький массив на экран.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task0705 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[20];
        int[] array1 = new int[10];
        int[] array2 = new int[10];

        for (int i = 0; i<array.length; i++) {
            array [i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i<array.length-10; i++) {
            array1 [i] = array [i] ;
        }

        for (int i = 10; i<array.length; i++) {
            array2 [i-10] = array [i];
        }

        for (int i = 0; i<array2.length; i++) {
            System.out.println(array2[i]);
        }

    }
}