package practice_8;

import java.util.Scanner;

public class practice_8_Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] badWords = {"дурень", "поганий", "жах"};
        String replacement = "[цензура]";

        System.out.println("Введіть текст:");
        String text = scanner.nextLine();

        for (String badWord : badWords) {
            text = text.replaceAll("(?i)" + badWord, replacement);
        }

        System.out.println("Відредагований текст:");
        System.out.println(text);
    }
}