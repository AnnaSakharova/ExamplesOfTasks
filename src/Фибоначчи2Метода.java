public class Фибоначчи2Метода {

    // Последовательность Фибоначчи
    public static void fibonachi(int beforePreviousValue, int previousValue, int maxValue) {
        if (previousValue <= maxValue) {
            System.out.println(previousValue);
            int currentValue = beforePreviousValue + previousValue;
            fibonachi(previousValue, currentValue, maxValue);
        }
    }

    // Найти нужное число в последовательности Фибоначчи
    public static long fibonacci(int index) {
        double fi = (1 + Math.sqrt(5)) / 2;
        return Math.round(Math.pow(fi, index) / Math.sqrt(5));
    }
}
