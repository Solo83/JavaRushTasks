package Lesson8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
Добрая Зинаида и летние каникулы
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
4. Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.
*/

public class Task0816 {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Сидоров", dateFormat.parse("MAY 1 2012"));
        map.put("Иванов", dateFormat.parse("MAY 1 2012"));
        map.put("Фролов", dateFormat.parse("AUGUST 1 2012"));
        map.put("Андреев", dateFormat.parse("MAY 1 2012"));
        map.put("Потапов", dateFormat.parse("MAY 1 2012"));
        map.put("Киркоров", dateFormat.parse("JULY 1 2012"));
        map.put("Басков", dateFormat.parse("JUNE 1 2012"));
        map.put("Попов", dateFormat.parse("MAY 1 2012"));
        map.put("Дронов", dateFormat.parse("MAY 1 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {

        for(Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator(); iterator.hasNext(); ) { // безопасное удаление из коллекции в цикле используем итератор.
            Map.Entry<String, Date> entry = iterator.next();
            if(entry.getValue().getMonth()<=7 && entry.getValue().getMonth()>=5) {
                iterator.remove();
            }
        }

    }

    public static void main(String[] args) throws ParseException {

        Map <String,Date> map = createMap();

        removeAllSummerPeople(map);

      /*  for (Map.Entry<String,Date> pair: map.entrySet()) {
            System.out.println(pair.getKey() + pair.getValue());

    }

       */
    }}
