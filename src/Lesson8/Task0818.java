package Lesson8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Только для богачей
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
4. Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
*/

public class Task0818 {
    public static Map<String, Integer> createMap() {
        Map<String,Integer> map = new HashMap<>();

        map.put("Иванов",100);
        map.put("Петров",600);
        map.put("Сидоров",700);
        map.put("Алексеев",800);
        map.put("Сергеев",430);
        map.put("Николаев",271);
        map.put("Федоров",910);
        map.put("Дмитриев",518);
        map.put("Пирожков",552);
        map.put("Романов",435);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {

        map.entrySet().removeIf(entry -> entry.getValue() <  500);

    }

    public static void main(String[] args) {

        removeItemFromMap(createMap());



    }
}