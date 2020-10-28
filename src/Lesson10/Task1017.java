package Lesson10;

/*
Безопасное извлечение из списка
Создай список целых чисел и введи с клавиатуры 20 значений. Создай метод по безопасному извлечению чисел из списка:
int safeGetElement(ArrayList<Integer> list, int index, int defaultValue)
Метод должен возвращать элемент списка (list) по его индексу (index). Если в процессе получения элемента возникло исключение, его нужно перехватить, и метод должен вернуть defaultValue.


Требования:
1. Программа должна считывать 20 чисел с клавиатуры.
2. Программа должна выводить данные на экран.
3. Метод safeGetElement должен возвращать элемент списка по индексу, если исключений внутри метода не возникло.
4. Метод safeGetElement должен возвращать defaultValue, если возникло исключений внутри метода. Исключение нужно перехватить.
5. Метод safeGetElement не должен бросать исключения.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task1017 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            int number = Integer.parseInt(reader.readLine());
            list.add(number);
        }

        System.out.println(safeGetElement(list, 5, 1));
        System.out.println(safeGetElement(list, 20, 7));
        System.out.println(safeGetElement(list, -5, 9));
    }

    public static int safeGetElement(ArrayList<Integer> list, int index, int defaultValue) {

        try {


            if (list.get(index) == defaultValue){


            }
        } catch (IndexOutOfBoundsException e) {
            return defaultValue;
        }


        return list.get(index);

    }

}
