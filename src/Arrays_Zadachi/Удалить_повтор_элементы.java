package Arrays_Zadachi;

import java.util.Arrays;

public class Удалить_повтор_элементы {

    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 2, 3, 3, 4, 5, 6};
        removeDuplicates(array);
    }

    public static int[] removeDuplicates(int[] array) {

        Arrays.sort(array);

        int[] result = new int[array.length];
        int previous = array[0];
        result[0] = previous;

        for (int i = 1; i < array.length; i++) {
            int ch = array[i];

            if (previous != ch) {
                result[i] = ch;
            }
            previous = ch;
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}
