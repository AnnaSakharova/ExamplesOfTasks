public class ПростоеЛиЧисло {

    public static boolean isPrime(int number) {
        int factors = 0;
        int counter = 1;

        while (counter <= number) {
            if (number % counter == 0) {
                factors++;
            }
            counter++;
        }
        return (factors == 2);
    }
}
