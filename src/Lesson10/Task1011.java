package Lesson10;

/*
Требования:
1. Программа должна выводить текст на экран.
2. Программа должна выводить 40 строк.
3. В программе должен использоваться цикл for или while.
4. Выведенный текст должен соответствовать примеру из условия.
*/

public class Task1011 {
    public static void main(String[] args) {
        String text = "Я не хочу изучать Java, я хочу большую зарплату";

        for (int i=0; i<40; i++) {
            System.out.println(text.substring(i));
        }
    }

}
