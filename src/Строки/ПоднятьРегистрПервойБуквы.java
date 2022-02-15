package Строки;

public class ПоднятьРегистрПервойБуквы {
    public static String old = "геннадий";
    public static String capitalized = old.substring(0, 1).toUpperCase() + old.substring(1).toLowerCase();

    public static String oldd = "gennady";
    public static String capitaliz = Character.toUpperCase(oldd.charAt(0)) + oldd.substring(1).toLowerCase();

    public static void main(String[] args) {
        System.out.println(ПоднятьРегистрПервойБуквы.capitalized);
        System.out.println(capitaliz);
    }
}
