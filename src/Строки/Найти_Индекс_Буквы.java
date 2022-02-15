package Строки;

public class Найти_Индекс_Буквы {
    // индекс каждой буквы О
    static void indexsCharO(String str) {
        for (int i = 0; i < str.length(); i++) {
            Character value = new Character(str.charAt(i));

            if (value.equals(new Character('o')))
                System.out.print(i + " ");
        }
    }

    // индекс каждой буквы О
    static void indexCharO(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'o') {
                count = i;
            }
        }
    }

}
