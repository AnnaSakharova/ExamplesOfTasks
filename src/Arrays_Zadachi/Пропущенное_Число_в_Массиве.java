package Arrays_Zadachi;

import java.util.Arrays;
import java.util.BitSet;

public class Пропущенное_Число_в_Массиве {
    public static void main(String args[]) {

        // одно отсутствующее число
        printMissingNumber(new int[]{1, 2, 3, 4, 6}, 6);

        // два отсутствующих числа
        printMissingNumber(new int[]{1, 2, 3, 4, 6, 7, 9, 8, 10}, 10);

        // три отсутствующих числа
        printMissingNumber(new int[]{1, 2, 3, 4, 6, 9, 8}, 10);

        // четыре отсутствующих числа
        printMissingNumber(new int[]{1, 2, 3, 4, 9, 8}, 10);

        // Только одно отсутствующее число в массиве
        int[] iArray = new int[]{1, 2, 3, 5};
        int missing = getMissingNumber(iArray, 5);
        System.out.printf("Missing number in array %s is %d %n",
                Arrays.toString(iArray), missing);
    }

    /**
     * Общий метод поиска пропущенных значений из целочисленного массива в Java.
     * Этот метод будет работать, даже если в массиве отсутствует более одного элемента.
     */
    private static void printMissingNumber(int[] numbers, int count) {
        int missingCount = count - numbers.length;
        BitSet bitSet = new BitSet(count);

        for (int number : numbers) {
            bitSet.set(number - 1);
        }

        System.out.printf("Missing numbers in integer array %s, with total number %d is %n",
                Arrays.toString(numbers), count);
        int lastMissingIndex = 0;

        for (int i = 0; i < missingCount; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }

    }

    /**
     * Метод Java для поиска недостающего числа в массиве размера n, содержащем
     * только числа от 1 до n.
     * может использоваться для поиска недостающих элементов в целочисленном массиве
     * числа от 1 до 100 или от 1 до 1000
     */
    private static int getMissingNumber(int[] numbers, int totalCount) {
        int expectedSum = totalCount * ((totalCount + 1) / 2);
        int actualSum = 0;
        for (int i : numbers) {
            actualSum += i;
        }
        return expectedSum - actualSum;
    }
}
