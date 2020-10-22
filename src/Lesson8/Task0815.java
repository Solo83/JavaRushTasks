package Lesson8;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

/*
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
4. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
5. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
*/

public class Task0815 {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();  // в Map заносим более 10ти объектов, т.к. при совпадении ключей, предыдущий перезаписывается новым. Ключи всегда уникальны, особенность Map!!!

        map.put("Иванов","Александр");
        map.put("Переседов","Сергей");
        map.put("Песковацкий","Дмитрий");
        map.put("Костюков","Александр");
        map.put("Иванов","Александр");
        map.put("Фомин","Петр");
        map.put("Дзансолов","Сослан");
        map.put("Волошановская","Екатерина");
        map.put("Курочкин","Михаил");
        map.put("Сидоров","Михаил");
        map.put("Александров","Михаил");


        return map;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {

        int count=0;

        for (Map.Entry<String, String> pair : map.entrySet())
        {
            if (pair.getValue().equals(name)) {
                count++;
            }

        }

        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) { // значения ключа всегда уникальны, совпадений не будет
        int count=0;

        for (Map.Entry<String, String> pair : map.entrySet())
        {
            if (pair.getKey().equals(lastName)) {
                count++;
            }

        }

        return count;
    }

    public static void main(String[] args) {

    /*    System.out.println(getCountTheSameFirstName(createMap(),"Александр"));
        System.out.println(getCountTheSameFirstName(createMap(),"Иванов")); // значения ключа всегда уникальны, совпадений не будет

        Map <String, String> map = createMap();

        for (Map.Entry<String, String> pair : map.entrySet())
        {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }*/

    }
}