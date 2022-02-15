package Algorythms;

public class Пузырьком {
    // метод пузырьковой сортировки
    public static void bubbleSort(int[] num) {
        int j;
        boolean flag = true; // устанавливаем наш флаг в true для первого прохода по массиву
        int temp; // вспомогательная переменная

        while (flag) {
            flag = false; // устанавливаем флаг в false в ожидании возможного свопа (замены местами)
            for (j = 0; j < num.length - 1; j++) {
                if (num[j] < num[j + 1]) { // измените на > для сортировки по возрастанию
                    temp = num[j]; // меняем элементы местами
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    flag = true; // true означает, что замена местами была проведена
                }
            }
        }
    }
}
