package Lesson6;

public class Task0612 {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        return a+b;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        return a-b;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        return a*b;
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        return (double) a/b ;
    }

    public static double percent(int a, int b) {
        float v = (float) (a*b) /100;
        return v;
    }

    public static void main(String[] args) {

        System.out.println(Task0612.division(4,5));
        System.out.println(Task0612.percent(100,20));
    }
}