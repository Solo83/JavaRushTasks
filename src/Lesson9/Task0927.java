package Lesson9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Десять котов
Есть класс кот - Cat, с полем "имя" (String).
Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот".
Получить из Map множество(Set) всех котов и вывести его на экран.


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Метод createMap должен создавать новый объект HashMap<String, Cat>.
3. Метод createMap должен добавлять в словарь 10 котов в виде «Имя»-«Кот».
4. Метод createMap должен возвращать созданный словарь.
5. Метод convertMapToSet должен создать и вернуть множество котов, полученных из переданного словаря.
6. Программа должна вывести всех котов из множества на экран.
*/

public class Task0927 {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map <String,Cat> result = new HashMap<>();

        result.put("васька", new Cat("васька"));
        result.put("мурка", new Cat("мурка"));
        result.put("дымка", new Cat("дымка"));
        result.put("рыжик", new Cat("рыжик"));
        result.put("серый", new Cat("серый"));
        result.put("снежок", new Cat("снежок"));
        result.put("босс", new Cat("босс"));
        result.put("борис", new Cat("борис"));
        result.put("барсик", new Cat("барсик"));
        result.put("гарфи", new Cat("гарфи"));

        return result;

    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        return new HashSet<>(map.values());
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
