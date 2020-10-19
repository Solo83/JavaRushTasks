package Lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Это конец
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введет строку "end". Саму строку "end" не учитывать.
Вывести строки на экран, каждую с новой строки.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считывай строки с клавиатуры и добавляй их в список, пока пользователь не введет строку "end".
3. Саму строку "end" не нужно добавлять в список.
4. Выведи список на экран, каждое значение с новой строки.
5. Используй цикл for.
*/

public class Task0722 {
    public static void main(String[] args) throws IOException {



        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; ; i++) {
            String s = reader.readLine();
            if (s.equals("end")) break;
            else list.add(s);
        }

        for (String s: list
        ) {

            System.out.println(s);

        }

    }
}