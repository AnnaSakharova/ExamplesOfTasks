package Algorythms;

public class Поменять_местами_два_поля_без_третьей {

    public static void main(String[] args) {
        int a = 7;
        int b = 10;

        System.out.printf("Before swap 'a' : %d, 'b': %d %n", a, b);

        a = (a + b) - (b = a);

        System.out.printf("After swapping, 'a': %d, 'b': %d %n", a, b);
    }
}
