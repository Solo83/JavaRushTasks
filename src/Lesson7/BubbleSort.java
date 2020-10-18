package Lesson7;

import java.util.*;

public class BubbleSort {

    public static void main(String[] args) {

        Integer[] array = {1, 3, 3, 4, 5, 9, 7, 6};

        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) { // знак "<" сортируем по убыванию, знак ">" сортируем по возрастанию
                    int temp = array[i];      //
                    array[i] = array[i + 1];   // меняем местами 'элементы' массива
                    array[i + 1] = temp;     //
                    isSorted = false;     // если хоть раз поменяли запускается внешний цикл while
                }

            }

        }

        printArray(array);
    }


    public static void printArray(Integer[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}