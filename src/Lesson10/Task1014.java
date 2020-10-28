package Lesson10;

/*
Расставьте минимум static-ов
Расставь как можно меньше модификаторов static так, чтобы пример скомпилировался.


Требования:
1. В классе должна быть переменная A.
2. В классе должна быть переменная B.
3. В классе должна быть переменная C.
4. В классе должна быть переменная D.
5. Метод main не изменяй.
6. Метод getA не изменяй.
*/

public class Task1014 {
    public int A = 5;
    public static int B = 5;
    public static int C = 5;
    public static int D = 5;

    public static void main(String[] args) {
        Task1014 solution = new Task1014();
        solution.A = 5;
        solution.B = 5 * B;
        solution.C = 5 * C * D;
        solution.D = 5 * D * C;

        solution.D = 5;
    }

    public int getA() {
        return A;
    }

}
