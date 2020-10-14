package Lesson6;

/*
Родственные связи кошек
Задача: У каждой кошки есть имя и кошка-мама.
Создать класс, который бы описывал данную ситуацию.
Создать два объекта: кошку-дочь и кошку-маму.
Вывести их на экран.

Новая задача: У каждой кошки есть имя, кот-папа и кошка-мама.
Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
The cat's name is дедушка Вася, no mother, no father
The cat's name is бабушка Мурка, no mother, no father
The cat's name is папа Котофей, no mother, father is дедушка Вася
The cat's name is мама Василиса, mother is бабушка Мурка, no father
The cat's name is сын Мурчик, mother is мама Василиса, father is папа Котофей
The cat's name is дочь Пушинка, mother is мама Василиса, father is папа Котофей


Требования:
1. Программа должна считывать имена 6 котов в указанном порядке.
2. Метод main должен создавать 6 объектов типа Cat.
3. Программа должна выводить 6 строк с информацией о котах.
4. Строка про дедушку (первая) должна соответствовать условию.
5. Строка про бабушку (вторая) должна соответствовать условию.
6. Строка про папу (третья) должна соответствовать условию.
7. Строка про маму (четвертая) должна соответствовать условию.
8. Строка про сына (пятая) должна соответствовать условию.
9. Строка про дочь (шестая) должна соответствовать условию.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task0621 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String gpaName = reader.readLine();
        Cat catGpa = new Cat(gpaName);

        String baName = reader.readLine();
        Cat catBa= new Cat(baName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName,null,catGpa,null);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName,catBa,null,null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather,catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName,catFather,catMother);

        System.out.println(catGpa);
        System.out.println(catBa);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);

    }

    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;
        private Cat grands;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        Cat(String name, Cat mother, Cat father, Cat grands) {
            this.name = name;
            this.father = father;
            this.mother = mother;
            this.grands = grands;
        }

        @Override
        public String toString() {

            if (mother == null && father !=null && grands == null) return "The cat's name is " + name + ", no mother " + "father is "  + father.name;
            if (father == null && mother!=null && grands == null) {return "The cat's name is " + name + ", mother is " + mother.name + ", no father ";}
            if (mother != null && father != null && grands == null ){return "The cat's name is " + name + ", mother is " + mother.name + ", father is " + father.name;}
            else return "The cat's name is " + name + ", no mother " + ", no father ";

        }
    }}