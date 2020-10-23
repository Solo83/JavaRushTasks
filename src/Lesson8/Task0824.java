package Lesson8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).


Требования:
1. Программа должна выводить текст на экран.
2. Класс Human должен содержать четыре поля.
3. Класс Human должен содержать один метод.
4. Класс Solution должен содержать один метод.
5. Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей и выводить все объекты Human на экран.
*/

public class Task0824 {
    public static void main(String[] args)  {


        Human child1 = new Human();
        child1.name = "Максим";
        child1.age = 2;
        child1.sex = true;


        Human child2 = new Human();
        child2.name = "Юра";
        child2.age = 8;
        child2.sex = true;


        Human child3 = new Human();
        child3.name = "Катя";
        child3.age = 10;
        child3.sex = false;


        Human father = new Human();
        father.name = "Иван";
        father.age = 30;
        father.sex = true;
        father.children.add(child1);
        father.children.add(child2);
        father.children.add(child3);

        Human mother = new Human();
        mother.name = "Ольга";
        mother.age = 26;
        mother.sex = false;
        mother.children.add(child1);
        mother.children.add(child2);
        mother.children.add(child3);

        Human grandfather1 = new Human();
        grandfather1.name = "Макар";
        grandfather1.age = 60;
        grandfather1.sex = true;
        grandfather1.children.add(father);

        Human grandmother1 = new Human();
        grandmother1.name = "Марфа";
        grandmother1.age = 59;
        grandmother1.sex = false;
        grandmother1.children.add(father);

        Human grandfather2 = new Human();
        grandfather2.name = "Степан";
        grandfather2.age = 55;
        grandfather2.sex = true;
        grandfather2.children.add(mother);

        Human grandmother2 = new Human();
        grandmother2.name = "Вера";
        grandmother2.age = 50;
        grandmother2.sex = false;
        grandmother2.children.add(mother);



        System.out.println(grandfather1);
        System.out.println(grandmother1);

        System.out.println(grandfather2);
        System.out.println(grandmother2);

        System.out.println(father);
        System.out.println(mother);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}