package Lesson9;

/*
Перехват checked-исключений
В методе handleExceptions обработайте все checked исключения.
Нужно вывести на экран возникшее checked исключение.
Можно использовать только один блок try..catch


Требования:
1. Метод handleExceptions должен вызывать метод method1.
2. Метод handleExceptions должен вызывать метод method2.
3. Метод handleExceptions должен вызывать метод method3.
4. Метод handleExceptions должен использовать только один блок try..catch.
5. Метод handleExceptions должен отлавливать и выводить на экран все возникающие checked исключения.
6. Программа должна выводить на экран текст.
*/

import java.io.IOException;
import java.rmi.RemoteException;

public class Task0916 {
    public static void main(String[] args) {
        handleExceptions(new Task0916());

    }

    public static void handleExceptions(Task0916 obj) {

        try {

            obj.method1();
            obj.method2();
            obj.method3();

        } catch (IOException | NoSuchFieldException e) {
            System.out.println(e);
        }
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
