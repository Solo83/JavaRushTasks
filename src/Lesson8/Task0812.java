package Lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Cамая длинная последовательность
1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3

Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.


Требования:
1. Программа должна выводить число на экран.
2. Программа должна считывать значения с клавиатуры.
3. В методе main объяви переменную типа List с типом элементов Integer и сразу проинициализируй ee.
4. Программа должна добавлять в коллекцию 10 чисел, согласно условию.
5. Программа должна выводить на экран длину самой длинной последовательности повторяющихся чисел в списке.
*/
public class Task0812 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        int max = 1;
        int count = 1;

        for (int i =0; i<10; i++) {
            int a = Integer.parseInt(reader.readLine());
            list.add(a);
        }

        for (int i =0; i<list.size()-1; i++) {

            if (list.get(i).equals(list.get(i+1))){count++;} // если объекты равны, инкрементируем счетчик
                                    // как только стали неравны
            else if (max<count) { // сравниваем значение счетчика c max
                max=count;   // если max меньше, копируем значение счетчика в max
                count = 1;}  // возвращаем счетчик в первоначальное состояние

            else count = 1;  //если max больше счетчика, сбраcываем счетчик. Здесь не пойму, куда этот else?
        }

        if (count>max) max=count; // сравниваем max со счетчиком, если счетчик больше, то присваеваем его значение max

        System.out.println(max);
    }
}
