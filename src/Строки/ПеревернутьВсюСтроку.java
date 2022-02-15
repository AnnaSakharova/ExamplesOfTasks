package Строки;

import java.util.Arrays;

public class ПеревернутьВсюСтроку {
    public static void main(String[] args) {
       reverseWords("улыбок тебе дед макар");

    }

    public static void reverseWords(String words) {
        String[] arrayOfWords = new String[words.length()];

        for (int i = 0; i < words.length(); i++) {
            for (int j = words.length(); j > i; j++) {
                arrayOfWords[j] = words.substring(i);
                System.out.println("Заполнение массива " + arrayOfWords[j]);
            }
        }
        System.out.println(Arrays.toString(arrayOfWords));
        System.out.println(words);
    }
}
