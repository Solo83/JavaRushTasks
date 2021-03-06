package Lesson9;


/*
И снова StackTrace
Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.


Требования:
1. В классе должно быть 5 методов (метод main не учитывать).
2. Каждый метод должен вызывать следующий: main вызывать method1, method1 вызывать method2 и т.д.
3. Каждый метод должен возвращать имя метода, вызвавшего его.
4. Для получения имени вызвавшего метода, используй метод getMethodName.
*/

/*
1) В каждом методе свой собственный массив StackTraceElement;
2) при создании массива стека вызовов [0]ячейку занимает сам стек,  [1] занимает текущий метод и  [2] занимает предыдущий метод вызывавший текущий
3) форма вызова методов el[0]getClassName(); обратите внимание что всегда надо указывать номер ячейки
*/


public class Task0902 {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();

        return Thread.currentThread().getStackTrace()[2].getMethodName();

    }

    public static String method2() {
        method3();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method3() {
        method4();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method4() {
        method5();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method5() {
        return Thread.currentThread().getStackTrace()[1].getMethodName();
    }
}
