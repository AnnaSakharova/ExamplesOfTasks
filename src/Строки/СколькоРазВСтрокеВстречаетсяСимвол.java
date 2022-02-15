package Строки;

public class СколькоРазВСтрокеВстречаетсяСимвол {

    public static void main(String args[]) {

        //count number of "a" on this String.
        String input = "Todaya is Maonday";

        // counting occurrence of character with loop
        int charCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a') {
                charCount++;
            }
        }
        System.out.println("count of character 'a' on String: " + charCount);

        //a more elegant way of counting the occurrence of a character in String using the foreach loop

        charCount = 0; //resetting character count
        for (char ch : input.toCharArray()) {
            if (ch == 'a') {
                charCount++;
            }
        }
        System.out.println("count of character 'a' on String: 'Today is Monday' using for each loop  " + charCount);
    }

}
