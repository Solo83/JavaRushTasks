package Lesson8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
*/

public class Task0817 {
    public static Map<String, String> createMap() {

        Map <String, String> map = new HashMap<String, String>();

        map.put("Иванов", "Иван");
        map.put("Петров", "Жора");
        map.put("Сидоров", "Александр");
        map.put("Курочкин", "Михаил");
        map.put("семенов", "Андрей");
        map.put("third", "Ramu");
        map.put("Fourth", "Mama");
        map.put("Five", "Mila");
        map.put("Six", "Ramu");
        map.put("Seven", "Ramu");

        return map;


    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {

        ArrayList<String> list = new ArrayList<>(map.values());
        int count;
        for (int i = 0; i < list.size(); i++) {
            count = 0;
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(i).equals(list.get(j))) count++;
                if (count > 1) removeItemFromMapByValue(map, list.get(i));
            }}}

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {


        Map<String, String> map = createMap();

        removeTheFirstNameDuplicates(map);
    }}