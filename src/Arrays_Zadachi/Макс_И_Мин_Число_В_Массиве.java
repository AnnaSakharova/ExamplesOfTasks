package Arrays_Zadachi;

import java.util.Arrays;

public class Макс_И_Мин_Число_В_Массиве {

    // Наибольшее и наименьшее число в неотсортированном массиве?
    public static void largestAndSmallest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            } else if (number < smallest) {
                smallest = number;
            }
        }
        System.out.println("Given integer array : " + Arrays.toString(numbers));
        System.out.println();
        System.out.println("Largest number in array is : " + largest);
        System.out.println();
        System.out.println("Smallest number in array is : " + smallest);
        System.out.println();
    }

    public static void main(String args[]) {
        largestAndSmallest(new int[]{-20, 34, 21, -87, 92});
        largestAndSmallest(new int[]{10, 6, -2});
        largestAndSmallest(new int[]{3, 40, -78});
        largestAndSmallest(new int[]{1, -1, 0});
    }
}

