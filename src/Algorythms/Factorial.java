package Algorythms;

public class Factorial {
    // рекурсия
    public static int factorial(int n) {
        return (n == 0) ? 1 : n * factorial(n - 1);
    }

    // без рекурсии
    static int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

}
