package Строки;

public class Подсчитать_Вхождение_Символа_ВСтроку {

    public static void main(String[] args) {
        String testString = "a,b,c,d";
        long occurrencesCount = testString.chars().filter(ch -> ch == ',').count();
        System.out.println(occurrencesCount);

        String tesString = "a,b,c,d";
        int occurrenceCount = tesString.length() - tesString.replace(",", "").length();
        System.out.println(occurrenceCount);

        // STREAM
        String tetString = "a,b,c,d";
        long occurencesCount = tetString.chars().filter(ch -> ch == ',').count();
        System.out.println(occurencesCount);

    }
}
