package Строки;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class НайтиПодстрокуВСтроке {

    public static void main(String[] args) {
        String str = "Multiple findme classes and nested " +
                "static findme classes are supported, " +
                "Printing unwanted or ill-formatted data " +
                "to output will cause the test findmecases " +
                "to failfindme";

        String substr = "findme";

        long count = Stream.iterate(
                        str.indexOf(substr), // начинаем с первого вхождения
                        i -> i != -1, // пока не получим негативный ответ
                        i -> str.indexOf(substr, i + 1)) // ищем следующее вхождение
                .count(); // считаем вхождения

        System.out.println(count);


        // ИЛИ
        long coun =
                // добавляем к исходной строке какой-либо
                // символ и делим ее по подстроке.
                // Обходим массив частей исходной строки
                Arrays.stream((str + " ").split(substr))
                        // Считаем части
                        .count();

        System.out.println(coun - 1); // 4

    }
}
